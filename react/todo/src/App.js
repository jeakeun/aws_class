import {BrowserRouter, Route, Routes} from 'react-router-dom'
import Navbar from './component/nav/Navbar.js';
import List from './component/body/List.js';
import Insert from './component/body/Insert.js';
import Main from './component/body/Main.js';



function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" exact element={<Main/>}></Route>
        <Route path="/todo/list"  element={<List/>}></Route>
        <Route path="/todo/insert"  element={<Insert/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
