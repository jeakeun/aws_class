import { useState } from "react";

const EX_ITEMS = [
  { label : "에제1", isOpen : false, el : <Ex1/>},
  { label : "에제2", isOpen : false, el : <Ex2/>},
  { label : "에제3", isOpen : false, el : <Ex3/>},
]

function App2() {
  return (
    <div className="App">
      <Main />
    </div>
  );
}

function Main(){
  let [ items,setItems] = useState(EX_ITEMS);
  const changeEx = (label) =>{
    const updateEx = items.map(item=>{
      if(item.label == label){
        return {...item, isOpen : !item.isOpen}
      }
      return{...item, isOpen : false}
    });
    setItems(updateEx)
  }
 
  return(
    <div>
      <h1>메인</h1>
      <div>
        {items.map(item=>{
         return  <button onClick={()=>changeEx(item.label)}>{item.label} : {item.isOpen ? "접기" : "보기"}</button>
        })}
      </div>
      <div>
        {items.map(item=>{return item.isOpen ? item.el : null})}
      </div>
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

function Ex3(){
  return(
    <div>
      <h1>예제3</h1>
    </div>
  )
}
export default App2;