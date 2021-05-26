import Vue from 'vue'
import App from './App.vue'

// vue-router
import {router} from "@/router";


//bootstrap
import 'bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

//jQuery
import jQuery from 'jquery'
global.jQuery = jQuery
global.$ = jQuery

// fontawesome
import { library } from '@fortawesome/fontawesome-svg-core'
import { faFacebook,faInstagram,faTwitter,faLinkedin } from '@fortawesome/free-brands-svg-icons'
import {faPhone,faEnvelope,faDirections} from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
library.add(faFacebook,faInstagram,faTwitter,faLinkedin,faPhone,faEnvelope,faDirections)
Vue.component('font-awesome-icon', FontAwesomeIcon)

// VeeValidate
import VeeValidate from 'vee-validate';
Vue.use(VeeValidate)


Vue.config.productionTip = false




new Vue({
  render: h => h(App),
  router
}).$mount('#app');
