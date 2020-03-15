import Vue from 'vue'
import App from './App.vue'
import router from './router'
import Test from './components/Test.vue'
import axios from 'axios'

Vue.config.productionTip = false
Vue.prototype.$axios = axios

Vue.component('app-test', Test)

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
