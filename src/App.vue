<template>
  <div id="app">
    <!--    TOP-BAR NAV-->
    <nav class="navbar navbar-expand-md navbar-expand-lg navbar-expand-sm bg-primary d-flex justify-content-end " id="top-bar">
        <div class="container justify-content-end ">
        <ul class="navbar-nav" id="top-nav">
          <li class="nav-item"><router-link class="nav-link" to="/company/about">ABOUT</router-link></li>
          <li class="nav-item"><router-link class="nav-link" to="/company/contact">CONTACT</router-link></li>
        </ul>
        <ul class="navbar-nav" id="social">
          <li class="nav-item"><a href="https://www.facebook.com/" class="nav-link" style="background: #3B5998 "><font-awesome-icon :icon="['fab','facebook']"/></a></li>
          <li class="nav-item"><a href="https://www.instagram.com/" class="nav-link" style="background: radial-gradient(circle at 30% 107%, #fdf497 0%, #fdf497 5%, #fd5949 45%,#d6249f 60%,#285AEB 90%);"><font-awesome-icon :icon="['fab','instagram']"/></a></li>
          <li class="nav-item"><a href="https://twitter.com/" class="nav-link" style="background: #55ACEE"><font-awesome-icon :icon="['fab','twitter']"/></a></li>
          <li class="nav-item"><a href="https://www.linkedin.com/" class="nav-link" style="background: #0976B4"><font-awesome-icon :icon="['fab','linkedin']"/></a></li>
        </ul>
        </div>
    </nav>

    <!--    BASEBAR-->
    <nav class="navbar navbar-expand-lg navbar-expand-sm" id="base-bar">
      <div class="container">
        <router-link to="/" class="navbar-brand">
          <img src="@/assets/mysoftwarelogo.png" class="d-inline-block align-top" alt="">
        </router-link>

        <ul class="navbar-nav">
          <li class="nav-item"><router-link class="nav-link" to="/software">SOFTWARE</router-link></li>
          <li class="nav-item"><router-link class="nav-link" to="/martech">MARTECH</router-link></li>
          <li class="nav-item"><router-link class="nav-link" to="/social">SOCIAL</router-link></li>
          <li class="nav-item"><router-link class="nav-link" to="/insights">INSIGHTS</router-link></li>
        </ul>
      </div>
    </nav>

    <!--    CONTAINER-->
    <div class="container">
      <router-view/>
    </div>


    <!--    FOOTER-->
    <footer class="bg-dark text-white">
      <section class="mini">
        <div class="container d-flex justify-content-start">
          <router-link to="/" class="footer-brand mt-3">my software</router-link>
        </div>
      </section>
      <section class="maxi">
        <div class="container">
          <hr>
          <section class="">
            <div class="row">
              <!--    Company-->
              <div class="col-lg-2 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Company</h5>

                <ul class="list-unstyled mb-0">
                  <li>
                    <router-link to="/about" class="link-unstyled">About Us</router-link>
                  </li>
                  <li>
                    <router-link to="/partnerships" class="link-unstyled">Partnerships</router-link>
                  </li>
                  <li>
                    <router-link to="/careers" class="link-unstyled">Careers</router-link>
                  </li>
                  <li>
                    <router-link to="/awards" class="link-unstyled">Awards</router-link>
                  </li>
                </ul>
              </div>
              <!--Software-->
              <div class="col-lg-2 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Software</h5>

                <ul class="list-unstyled mb-0">
                  <li>
                    <router-link to="/software/customSoftwareDevelopment" class="link-unstyled">Custom Software Development</router-link>
                  </li>
                  <li>
                    <router-link to="/software/websiteDesignAndDevelopment" class="link-unstyled">Website Design And Development</router-link>
                  </li>
                  <li>
                    <router-link to="/software/mobileApplicationDevelopment" class="link-unstyled">Mobile Application Development</router-link>
                  </li>
                </ul>
              </div>
              <!--Martech-->
              <div class="col-lg-2 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Martech</h5>

                <ul class="list-unstyled mb-0">
                  <li>
                    <router-link to="/martech/seo-semManagement" class="link-unstyled">SEO-SEM Management</router-link>
                  </li>
                  <li>
                    <router-link to="/martech/omni-channelMarketing" class="link-unstyled">Omni-Channel Marketing</router-link>
                  </li>
                  <li>
                    <router-link to="/martech/marketingAutomationSystems" class="link-unstyled">Marketing Automation Systems</router-link>
                  </li>
                  <li>
                    <router-link to="/martech/contentManagementSystem" class="link-unstyled">Content Management Systems</router-link>
                  </li>
                </ul>
              </div>
              <!--            Social-->
              <div class="col-lg-2 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Social</h5>

                <ul class="list-unstyled mb-0">
                  <li>
                    <router-link to="/social/socialMediaManagement" class="link-unstyled">Social Media Management</router-link>
                  </li>
                  <li>
                    <router-link to="/social/socialMediaMarketing" class="link-unstyled">Social Media Marketing</router-link>
                  </li>
                  <li>
                    <router-link to="/social/socialMediaGovernanceAndSecurity" class="link-unstyled">Social Media Governance & Security</router-link>
                  </li>
                </ul>
              </div>
              <!--            Insights-->
              <div class="col-lg-2 col-md-4 mb-4 mb-md-0">
                <h5 class="text-uppercase">Insights</h5>

                <ul class="list-unstyled mb-0">
                  <li>
                    <router-link to="/insights/onlineLandscapeAnalysis" class="link-unstyled">Online Landscape Analysis</router-link>
                  </li>
                  <li>
                    <router-link to="/insights/activeListening" class="link-unstyled">Active Listening</router-link>
                  </li>
                  <li>
                    <router-link to="/insights/SocialDataInsights" class="link-unstyled">Social Data Insights</router-link>
                  </li>
                </ul>
              </div>
              <div class="col-lg-2 col-md-4 d-flex">
                <button @click="$router.push('/company/contact')" class="btn btn-outline-light align-self-center">GET IN TOUCH</button>
              </div>

              <hr>
              <div class="text-center p-3">
                © 2021 Copyright:
                <a class="text-white" style="text-decoration: none" href="#">mysoftware.com</a>
              </div>
            </div>
          </section>
        </div>
      </section>
    </footer>

  </div>
</template>

<script>
export default {
  name: 'App',
  components: {},
  mounted() {


  },
  watch:{
    '$route' : {
      // eslint-disable-next-line no-unused-vars
      handler : (to,from) => {
        document.title = to.meta.title || 'MySoftware'
      },
      immediate: true
    }


  }

}
</script>

<style scoped>
*{
  font-size: 18px;
  font-family: roboto condensed,sans-serif;
}
#top-bar{
  position: sticky;
  top: 0;
  z-index: 999;
}
.navbar-brand{
  opacity: 0.7;
}
.navbar-brand:hover{
  opacity: 1;
}
#top-nav .nav-link{
  color: #FFF;
  margin-right: 5px;

}
#top-nav .nav-link:hover{
  color: #000;
}
#social .nav-link *{
  color: #FFF;
}
#base-bar .nav-link{
  color: #000;
  font-size: 25px;
  margin-left: 6px;
}
#base-bar .nav-link:hover{
  color: #3B5998;
}
hr {
  margin-top: 1rem;
  margin-bottom: 1rem;
  border: 0;
  border-top: 1px solid rgba(0, 0, 0, 0.1);
}
.footer-brand{
  text-decoration: none;
  font-size: 30px;
  color: whitesmoke;
}
.footer-brand:hover{
  color: #fd5949;
}
.text-uppercase{
  font-weight: bold;
  font-size: 25px;
  color: wheat;
  margin-bottom: 20px;
}
.link-unstyled{
  text-decoration: none;
  color: whitesmoke;
}
.link-unstyled:hover{
  color: #fd5949;
}

</style>
