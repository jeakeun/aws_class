import { useState } from "react";

function App() {
  return (
    <div className="App">
      <Main />
    </div>
  );
}

function Main(){
  let [isOpen1, setIsOpen1] = useState(false);
  let [isOpen2, setIsOpen2] = useState(false);

  const showEx = (label) => {
   // 라벨이 예제1이면 isOpen1을 토글하고(true=>falsem false=>true), isOpen2를 false로
    if(label == "예제1"){
      setIsOpen1(!isOpen1);
      setIsOpen2(false);
    }
    // 아니면(예제2이면) isOpen2를 토글하고, isOpen1를 false로
    else{
      setIsOpen2(!isOpen2);
      setIsOpen1(false);
    }
  }
 
  return(
    <div>
      <h1>메인</h1>
      <div>
        <button onClick={()=>showEx("예제1")}>예제1 : {isOpen1 ? "접기" : "보기"}</button>
        <button onClick={()=>showEx("예제2")}>예제2 : {isOpen2 ? "접기" : "보기"}</button>
      </div>
      {isOpen1 ? <Ex1 /> : null }
      {isOpen2 ? <Ex2 /> : null }
    </div>
  )
}

function Ex1(){
  let [num, setNum] = useState(0);
  return(
    <div>
      <div>
        <h1>예제1</h1>
        <input type="text" readOnly={true} value={num}></input>  
        <button onClick={()=>setNum(num-1)}>-</button>
        <button onClick={()=>setNum(num+1)}>+</button> 
       </div> 
    </div>
  )
}

function Ex2(){
  let [text,setText] = useState("");
  const textChange = (e) => {setText(e.target.value)}
  return(
    <div>
      <h1>예제2</h1>
      <input type="text" onChange={textChange} />
      <h1>{text}</h1>
    </div>
  )
}

export default App;