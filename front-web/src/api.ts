import axios from 'axios';

const API_URL = 'http://localhost:8080';

export function fetchDoadores(){
  return axios(`${API_URL}/doadores`)
}