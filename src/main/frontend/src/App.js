import './App.css';
import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
   const [hello, setHello] = useState('')
   const [goodbye, setGoodbye] = useState('');

   useEffect(() => {
     axios.get('/api/hello')
       .then(response => setHello(response.data))
       .catch(error => console.log(error));

    axios.get('/api/goodbye')
      .then(response => setGoodbye(response.data))
      .catch(error => console.log("goodbye error:", error));
   }, []);

    return (
        <div>
            백엔드에서 가져온 데이터입니다 : {hello} , {goodbye}
        </div>
    );
}

export default App;
