import { authFetch } from "./api/authFetch";

function MyPage(){

	const clickhandler = () =>{
	
		logout();
	}

	const logout = async () =>{

		// accessToken 삭제
		localStorage.removeItem("accessToken");

		try{
			// 서버에 로그아웃 요청
			const response = await authFetch("/api/v1/auth/logout",{method : "POST"});

			if(!response.ok) return;

			alert("로그아웃했습니다.")
			// user를 null로 변경
			setUser(null);
		}catch(e){
			console.error(e);
		}
	}
	return(
		<div>
			<h1>마이페이지</h1>
			<button onClick={clickhandler}>로그아웃</button>
		</div>
	)
}

export default MyPage;