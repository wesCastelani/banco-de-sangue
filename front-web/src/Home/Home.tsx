import React from 'react';
import { Link } from 'react-router-dom';
import Footer from '../Footer/Footer';

import { ReactComponent as MainImage } from './main.svg';
import './styles.css';

export default function Home() {
  return (
    <>
    <div className="home-container">
      <div className="home-content">
        <div className="home-actions">
          <h1 className="home-title">
            Doe sangue! <br /> Salve vidas <br />
          </h1>
          <h3 className="home-subtitle">
            Escolha seu pedido e em poucos minutos <br /> levaremos na sua
            porta
          </h3>
          <Link className="home-btn-order" to="/doadores">
            Saiba mais
          </Link>
        </div>
        <div className="home-image">
          <MainImage />
        </div>
      </div>
    </div>
    <Footer />
  </>
  );
}
