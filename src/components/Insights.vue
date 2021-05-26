<template>
  <div class="row">
    <hr>
    <div class="col-4 mb-5">
      <div class="d-flex text-secondary">
        <h3 style="cursor:pointer;" @click="$router.push('/insights')">INSIGHTS</h3>
      </div>
      <div class="list-group">
        <router-link class="list-group-item list-group-item-action" id="list-landscapeAnalysis-list" data-toggle="list" to="/insights/onlineLandscapeAnalysis">Online Landscape Analysis</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-activeListening-list" data-toggle="list" to="/insights/activeListening">Active Listening</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-socialData-list" data-toggle="list" to="/insights/SocialDataInsights">Social Data Insights</router-link>
      </div>
    </div>
    <div class="col container">


      <div v-if="currentDirectory">

        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/insights/onlineLandscapeAnalysis')" src="@/assets/insights-com-images/Online-Landscape-Analysis.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Online Landscape Analysis</h4>
                <p class="card-text">Through our experience conducting various research methods involving a variety of sectors, we have concluded that an online landscape analysis not only provides detailed information about the visibility of our clients’ company but also competitors’ or other online initiative’s direct/indirect impact on them. </p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/insights/activeListening')" src="@/assets/insights-com-images/Active-Listening.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Active Listening</h4>
                <p class="card-text">We do not know what the future holds, but we can predict it. Active listening has become a key part of social media management; giving birth to the ability of tracking, measuring performance and predicting the environment  </p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/insights/SocialDataInsights')" src="@/assets/insights-com-images/Social-Data-Insights.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Social Data Insights </h4>
                <p class="card-text">To get a well-structured and to-the-point information regarding brand’s social media activity, PortalGrup collaborates with the best global social media platforms.  </p>
              </div>
            </div>
          </div>
        </div>



      </div>
        <router-view/>

    </div>
  </div>
</template>

<script>
export default {
  name: "Insights",
  computed:{
    currentDirectory() {
      return this.$route.path == '/insights'
    }
  }
}
</script>

<style scoped>

.card-title{
  color: #55ACEE;
}

img{
  transition: .2s;
  cursor: pointer;
}
.software-item:hover img{
  transform: scale(1.1);
}

.software-item:hover{
  background: #dff4df;
}

hr {
  margin-top: 1rem;
  margin-bottom: 1rem;
  border: 0;
  border-top: 1px solid rgba(0, 0, 0, 0.1);
}
.list-group-item{
  padding: 20px;

}

</style>