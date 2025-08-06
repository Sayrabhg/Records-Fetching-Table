import axios from "axios";
import { useEffect, useState } from "react";

export default function Comments(){

    const [Comments, setComments] = useState([])

    useEffect(() => {
        axios.get('http://localhost:1212/comments/multiple')
        .then(res => setComments(res.data))
        .catch(err => console.error(err))
    },[])

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
                <div className="col-lg-12 col-md-12 col-sm-12 col-12">
                    <table className="table table-bordered">
                        <thead>
                            <tr>
                                <th style={headerStyle}>ID</th>
                                <th style={headerStyle}>Post ID</th> {/* foreign key as Posts */}
                                <th style={headerStyle}>Name</th>
                                <th style={headerStyle}>Email</th>
                                <th style={headerStyle}>Body</th>
                            </tr>
                        </thead>
                        <tbody>
                            {Comments.map(data => (
                                <tr key={data.id}>
                                    <td style={{...cellStyle,...change}}>{data.id}</td>
                                    <td style={{...cellStyle,...change}}>{data.posts?.id}</td>
                                    <td style={cellStyle}>{data.name}</td>
                                    <td style={cellStyle}>{data.email}</td>
                                    <td style={cellStyle}>{data.body}</td>
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