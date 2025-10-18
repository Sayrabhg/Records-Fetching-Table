import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import { useState } from 'react';

function Nav() {
  const [hoverIndex, setHoverIndex] = useState(null);

  const navlinks = (index) => ({
    border: '1px solid black',
    padding: '0.5em 1.5em',
    borderRadius: '.5em',
    textDecoration: 'none',
    backgroundColor: hoverIndex === index ? 'red' : 'blue',
    color: 'white',
    marginRight: '1em',
  });

  return (
    <section className="bg-dark relative" style={{ height: '4em', alignContent: 'center' }}>
      <nav>
        {['User', 'Posts', 'Comments', 'Todos'].map((label, i) => (
          <Link
            key={label}
            to={`/${label.toLowerCase()}`}
            style={navlinks(i)}
            onMouseEnter={() => setHoverIndex(i)}
            onMouseLeave={() => setHoverIndex(null)}
          >
            {label}
          </Link>
        ))}
      </nav>
    </section>
  );
}


export default Nav;