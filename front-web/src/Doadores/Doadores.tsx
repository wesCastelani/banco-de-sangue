import React, { useEffect, useState } from 'react'
import { fetchDoadores } from '../api';
import DoadoresEstado from './DoadoresEstado';
import DoadoresImcMedio from './DoadoresImcMedio';
import DoadoresObesos from './DoadoresObesos';
import Header from './Header';
import IdadeMedia from './IdadeMedia';
import './styles.css';
import TipoSanguineo from './TipoSanguineo';
import { Doador } from './types';

export default function Doadores() {
  const [selectedOption, setSelectedOption] = useState('');
  const [doadores, setDoadores] = useState<Doador[]>([]);

  useEffect(() => {
    fetchDoadores().then((res)=>setDoadores(res.data)).catch((err)=>console.log(err))
  }, [])


  const handleSelect = (option: string) => {
    setSelectedOption(option);
   }

  const option = () => {
    switch (selectedOption) {
      case 'doadoresEstado':
        return <DoadoresEstado doadores={doadores}/>
        break;
      case 'imcMedio':
        return <DoadoresImcMedio />
        break;
      case 'obesos':
        return <DoadoresObesos/>
        break;
      case 'idadeMedia':
        return <IdadeMedia />
        break;
        case 'doadoresTipo':
          return <TipoSanguineo/>
          break;
      default:
        break;
    }
  }

  return (
    <>
    <div className="container">
      <Header onSelectOption={handleSelect}/>
      <div className="stats-container">
        <div className="stats-items">
          {option()}
        </div>
      </div>
    </div>
    </>
  )
}
