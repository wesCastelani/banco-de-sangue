import React from 'react';
import { Doador } from './types';

import './styles.css';

type Props = {
  estado: string;
  doadores: Doador[];
};

export default function DoadoresCard({ estado, doadores }: Props) {
  return (
    <div className={`doadores-card-container`}>
      <h3 className="doadores-card-title">{estado}</h3>
      <div className="doadores-card-counter ">
        <p>Existem atualmente {doadores.length} doadores ativos.</p>
      </div>
    </div>
  );
}
