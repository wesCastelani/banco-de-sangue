import React, { useEffect, useState } from 'react';
import { isTemplateSpan } from 'typescript';
import groupBy from '../helpers';
import DoadoresCard from './DoadoresCard';
import { Doador } from './types';

import './styles.css';

type Props = {
  doadores: Doador[];
};

type doadoresPorEstado = {
  estado: string;
  doadores: Doador[];
};

export default function DoadoresEstado({ doadores }: Props) {
  const [doadoresPorEstado, setDoadoresPorEstado] = useState<
    doadoresPorEstado[]
  >([]);

  useEffect(() => {
    const grouped = groupBy(doadores, (doadores) => doadores.estado);
    let doadoresEstado: doadoresPorEstado[] = [];
    let keys = Object.keys(grouped);
    keys.forEach((key) => {
      doadoresEstado.push({ estado: key, doadores: grouped[key] });
    });
    setDoadoresPorEstado(doadoresEstado);
  }, []);

  return (
    <div className={`estados-container`}>
      <div className={`estados-items`}>
        {doadoresPorEstado.map((estado) => {
          return (
            <DoadoresCard
              estado={estado.estado}
              doadores={estado.doadores}
            ></DoadoresCard>
          );
        })}
      </div>
    </div>
  );
}
