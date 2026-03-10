import {BrowserRouter, Route, Routes} from 'react-router-dom'
import Navbar from './component/nav/Navbar.js';
import Main from './component/body/Main.js';
import Signup from './component/body/Signup.js';
import Login from './component/body/Login.js';
import MyPage from './component/body/Mypage.js';



function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" exact element={<Main/>}></Route>
        <Route path="/signup"  element={<Signup/>}></Route>
        <Route path="/login"  element={<Login/>}></Route>
        <Route path="/mypage"  element={<MyPage/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
