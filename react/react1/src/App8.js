
function App8(){
	// 객체 배열
	const list = [
		{	name : "홍길동",	age : 21},
		{ name : "둘리", age : 31},
		{	name : "고길동",	age : 41}
	];
	// 객체에서 이름만 추출. 객체 배열 => 문자열 배열
	let list2 = list.map((item) => {
		return item.name;
	});
	// map은 기존 []을 다른형태의 []로 변환
	// map은 return 값들을 모아서 새로운 형태의 []로 만듬
	console.log((list2));
	return(
		<div>
			<ul>
				<li>
					<span>홍길동 :</span>
					<span>21</span>
				</li>
			</ul>
		</div>
	)
}

export default App8;