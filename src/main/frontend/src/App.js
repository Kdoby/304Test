import './App.css';
import React, {useEffect, useState} from "react";
import axios from "axios";

function App(){
  const [data, setData] = useState('');

  useEffect(()=>{
    axios.get("/test")
        .then(res => setData(res.data))
        .catch(err => console.log("error : " + err))
  })

  return data;
}

export default App;
