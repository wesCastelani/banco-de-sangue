import React from 'react'
import './styles.css'

type Props = {
  onSelectOption: (option: string) => void
}

export default function Header({onSelectOption}: Props) {

  const handleRadioChange = (e: any) =>{
    let option: string = e.target.value;
    onSelectOption(option);
  }

  return (
    <div>
      <header className="doadores-container">
        <div className="stats-content">
          <h1 className="title">Estátisticas <br />de doadores </h1>
          <ul className="options">
            <li><input type="radio" name="stats" onChange={handleRadioChange} value="doadoresEstado" ></input>Doadores por estado</li>
            <li><input type="radio" name="stats" onChange={handleRadioChange} value="imcMedio"></input>IMC Médio de 10 em 10 anos</li>
            <li><input type="radio" name="stats" onChange={handleRadioChange} value="obesos"></input>Percentual de obesos entre homens e mulheres</li>
            <li><input type="radio" name="stats" onChange={handleRadioChange} value="idadeMedia"></input>Média de idade pra cada tipo sanguíneo</li>
            <li><input type="radio" name="stats" onChange={handleRadioChange} value="doadoresTipo"></input>Quantidade de doadores pra cada tipo sanguíneo</li>
          </ul>
        </div>
        </header>
    </div>
  )
}
