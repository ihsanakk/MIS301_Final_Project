<template>
  <div class="row">
    <hr>
    <div class="col-4 mb-5">
      <div class="d-flex text-secondary">
        <h3 style="cursor:pointer;" @click="$router.push('/martech')">MARTECH</h3>
      </div>

      <div class="list-group">
        <router-link class="list-group-item list-group-item-action" id="list-seo-list" data-toggle="list" to="/martech/seo-semManagement">SEO-SEM Management</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-omni-list" data-toggle="list" to="/martech/omni-channelMarketing">Omni-Channel Marketing</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-automation-list" data-toggle="list" to="/martech/marketingAutomationSystems">Marketing Automation Systems</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-content-list" data-toggle="list" to="/martech/contentManagementSystem">Content Management Systems</router-link>
      </div>
    </div>
    <div class="col container">

      <div v-if="currentDirectory">

        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/martech/marketingAutomationSystems')" src="@/assets/martech-com-images/Marketing-Automation.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Marketing Automation Systems </h4>
                <p class="card-text">Successful marketing automation differs in many ways from traditional marketing automation systems that we consider to be completely limited approaches. </p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/martech/contentManagementSystem')" src="@/assets/martech-com-images/content management.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Content Management Systems </h4>
                <p class="card-text">Within the last decade of digital transformation, particular digital marketing technologies increased their efficiency to a level which they have become mandatory for potent marketing. </p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/martech/omni-channelMarketing')" src="@/assets/martech-com-images/Omni-Channel Marketing.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Multi-Channel Marketing </h4>
                <p class="card-text">Consumers are engaging with companies through various channels; virtually or physically, directly or indirectly. All should be examined to perfect each customer journey.</p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/martech/seo-semManagement')" src="@/assets/martech-com-images/seo-sam management.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">SEO - SEM Management</h4>
                <p class="card-text">All search engines, especially Google, expect their websites to be SEO compliant. All the web sites we design as PortalGroup are our SEO priorities. </p>
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
  name: "Martech",
  computed:{
    currentDirectory() {
      return this.$route.path == '/martech'
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