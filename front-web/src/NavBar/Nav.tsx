import React from 'react';

import './styles.css';
import { ReactComponent as Logo } from './logo.svg';
import { Link } from 'react-router-dom';

export default function Navbar() {
  return (
    <nav className="main-navbar">
      <Logo className="logo-img"/>
      <Link to="/" className="logo-text">
        Banco de Sangue
      </Link>
    </nav>
  );
}