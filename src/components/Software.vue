<template>
<div class="row">
  <hr>
  <div class="col-4 mb-5">
    <div class="d-flex text-secondary">
      <h3 style="cursor:pointer;" @click="$router.push('/software')">SOFTWARE</h3>
    </div>
    <div class="list-group">
      <router-link class="list-group-item list-group-item-action" id="list-about-list" data-toggle="list" to="/software/customSoftwareDevelopment">Custom Software Development</router-link>
      <router-link class="list-group-item list-group-item-action" id="list-partnerships-list" data-toggle="list" to="/software/websiteDesignAndDevelopment">Website Design and Development</router-link>
      <router-link class="list-group-item list-group-item-action" id="list-careers-list" data-toggle="list" to="/software/mobileApplicationDevelopment">Mobile Application Development</router-link>
    </div>
  </div>
  <div class="col container">


    <div v-if="currentDirectory">

      <div class="card my-5 software-item" >
        <div class="row g-0">
          <div class="col-md-4">
            <img @click="$router.push('/software/customSoftwareDevelopment')" src="@/assets/software-com-images/Custom-Software-Development-408x245.jpg" class="w-100" alt="...">
          </div>
          <div class="col-md-8">
            <div class="card-body">
              <h4 class="card-title">Custom Software Development</h4>
              <p class="card-text">At mySoftware, rather than initiating developing processes right away, we analyse the problems that our partners faced and required software solutions </p>
            </div>
          </div>
        </div>
      </div>


      <div class="card my-5 software-item" >
        <div class="row g-0">
          <div class="col-md-4">
            <img @click="$router.push('/software/websiteDesignAndDevelopment')" src="@/assets/software-com-images/Website-Design-And-Development-408x245.jpg" class="w-100" alt="...">
          </div>
          <div class="col-md-8">
            <div class="card-body">
              <h4 class="card-title">Website Design And Development </h4>
              <p class="card-text">We prefer to use the word "portal" instead of "website" not just because it is more of a buzz word but because it does a better job of conveying our approach to a company's presence on the web. </p>
            </div>
          </div>
        </div>
      </div>


      <div class="card my-5 software-item" >
        <div class="row g-0">
          <div class="col-md-4">
            <img @click="$router.push('/software/websiteDesignAndDevelopment')" src="@/assets/software-com-images/Mobile-Application-Development-1-408x245.jpg" class="w-100" alt="...">
          </div>
          <div class="col-md-8">
            <div class="card-body">
              <h4 class="card-title">Mobile Application Development </h4>
              <p class="card-text">Nowadays, apps have the power to make or break a business’ entity. Since mobile usage is growing exponentially in every platform with each passing day, applications are more than extensions of websites </p>
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
  name: "Software",
  computed:{
    currentDirectory() {
      return this.$route.path == '/software'
    }
  },
  mounted() {

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