import { useState } from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css'
import User from './components/User'
import Nav from './components/Nav';
import Posts from './components/Posts';
import Comments from './components/Comments';
import Todos from './components/Todos';
import './assets/Css/all.css'

function App() {
  return (
    <>
      <Router>
        <Nav />
        <Routes>
          <Route path='' element={<Index />}></Route>
          <Route path='/User' element={<User />}></Route>
          <Route path='/Posts' element={<Posts />}></Route>
          <Route path='/Comments' element={<Comments />}></Route>
          <Route path='/Todos' element={<Todos />}></Route>
        </Routes>
      </Router>
    </>
  )
}

export default App;

export function Index(){

  let indexsection = {
    width:'100%',
    height:'100vh',
    alignContent:'center',
    justifyContent:'center',
    display:'grid'
  }

  return <>
  <section id='Index' style={indexsection}>
    <div className="container">
      <div className="row">
        <div className="col-lg-12 col-12">
          <div>
            <h1 className='py-2' style={{fontWeight:'bold'}}>Hello User,</h1>
            <h2 className='py-2'>Welcome to my Database Table Dashbboard...</h2>
            <p style={{width:'44rem',display:'grid',gridTemplateColumns:'max-content 1fr'}}><span><span className='text-danger'>Note</span> :-</span> The requirements include fetching data using a Spring Boot API connected to a MySQL database, and displaying the fetched MySQL data on a React web page using the Spring API.</p>
          </div>
        </div>
      </div>
    </div>
  </section>
  </>
}
