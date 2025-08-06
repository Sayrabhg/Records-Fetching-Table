import axios from 'axios'
import { useEffect, useState } from 'react'

export default function User() {
    const [myuser, setMyuser] = useState([])    // ([]) indicates array form data, ("") indicates string data

    useEffect(() => {
        axios.get('http://localhost:1212/user/multiple')
            .then(response => setMyuser(response.data))
            .catch(error => console.error(error))
    }, []) // ✅ fixed: added dependency array

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

    return (
        <section id="Users">
            <div className="container">
                <div className="row">
                    <div className="col-12">
                        <table className="table table-bordered">
                            <thead>
                                <tr>
                                    <th style={headerStyle}>ID</th>
                                    <th style={headerStyle}>Name</th>
                                    <th style={headerStyle}>Email</th>
                                    <th style={headerStyle}>Gender</th>
                                    <th style={headerStyle}>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                {myuser.map(data => (
                                    <tr key={data.id}>
                                        <td style={{...cellStyle,...change}}>{data.id}</td>
                                        <td style={cellStyle}>{data.name}</td>
                                        <td style={cellStyle}>{data.email}</td>
                                        <td style={{...cellStyle,...change}}>{data.gender}</td>
                                        <td style={{...cellStyle,...change}}>{data.status}</td>
                                    </tr>
                                ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
    )
}
