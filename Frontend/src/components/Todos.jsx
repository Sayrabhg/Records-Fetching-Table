import axios from "axios";
import { useEffect, useState } from "react";

export default function Todos(){

    const [todos, setTodos] = useState([])

    useEffect(() => {
        axios.get('http://localhost:1212/todos/multiple')
        .then(res => setTodos(res.data))
        .catch(err => console.error(err))
    })
    
    const cellStyle = {
        border: '3px double #c1c1c1',
        padding: '1em',
        textAlign: 'justify',
    }

    const change = {
        textAlign: 'center',
    }

    const headerStyle = {
        backgroundColor: '#000',
        color: '#fff',
    }

    return <>
    <section id="Users">
        <div className="container">
            <div className="row">
                <div className="col-lg-12 col-md-12 col-sm-12 col-12" style={{justifyItems:"center"}}>
                    <table className="table table-bordered">
                        <thead>
                            <tr>
                                <th style={headerStyle}>ID</th>
                                <th style={headerStyle}>User ID</th> {/* foreign key as User */}
                                <th style={headerStyle}>Title</th>
                                <th style={headerStyle}>Due On</th>
                                <th style={headerStyle}>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            {todos.map(data => (
                                <tr key={data.id}>
                                    <td style={{...cellStyle,...change}}>{data.id}</td>
                                    <td style={{...cellStyle,...change}}>{data.user?.id}</td>
                                    <td style={cellStyle}>{data.title}</td>
                                    <td style={{...cellStyle,...change}}>{data.date}</td>
                                    <td style={{...cellStyle,...change}}>{data.status}</td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>
    </>;
}