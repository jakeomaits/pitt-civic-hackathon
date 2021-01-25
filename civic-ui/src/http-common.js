import axios from 'axios';

export const CIVIC_API = axios.create({
  //baseURL: 'http://localhost:8080/v1/person/'
  baseURL: '/v1/person/'
});