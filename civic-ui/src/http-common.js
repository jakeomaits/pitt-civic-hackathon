import axios from 'axios';

export const CIVIC_API = axios.create({
  baseURL: '/v1'
});