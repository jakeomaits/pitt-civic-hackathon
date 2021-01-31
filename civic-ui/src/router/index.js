import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Profile from '../views/Profile.vue'
import HelpForm from '../components/HelpForm.vue'
import ViewRequest from '../views/ViewRequest.vue'
import FulfillRequest from '../views/FulfillRequest.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/profile',
    name: 'Profile',
    component: Profile
  },
  {
    path: '/Login',
    name: 'Login',
    component: Login
  },

  {
    path: '/HelpForm',
    name: 'HelpForm',
    component: HelpForm
  },

  {
    path: '/ViewRequest',
    name: 'ViewRequest',
    component: ViewRequest
  },

  {
    path: '/FulfillRequest',
    name: 'FulfillRequest',
    component: FulfillRequest
  }
]

const router = new VueRouter({
  routes
})

export default router
