<template>
  <div class="row">
    <hr>
    <div class="col-4 mb-5">
      <div class="d-flex text-secondary">
        <h3 style="cursor:pointer;" @click="$router.push('/social')">SOCIAL</h3>
      </div>
      <div class="list-group">
        <router-link class="list-group-item list-group-item-action" id="list-about-list" data-toggle="list" to="/social/socialMediaManagement">Social Media Management</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-partnerships-list" data-toggle="list" to="/social/socialMediaMarketing">Social Media Marketing</router-link>
        <router-link class="list-group-item list-group-item-action" id="list-careers-list" data-toggle="list" to="/social/socialMediaGovernanceAndSecurity">Social Media Governance & Security</router-link>
      </div>
    </div>
    <div class="col container">

      <div v-if="currentDirectory">

        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/social/socialMediaManagement')" src="@/assets/social-com-images/Social-Media-Management.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Social Media Management</h4>
                <p class="card-text">We think of social media as a portal that allows us to make our partner’s brand equity stronger than ever. By combining creative thinking with profiling target audience, we engender social media content that increases brand engagement while targeting project goals.</p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/social/socialMediaMarketing')" src="@/assets/social-com-images/Social-Media-Marketing.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Social Media Marketing</h4>
                <p class="card-text">PortalGrup has variety of social media specialists who want to help build our partners’ social media strategies.</p>
              </div>
            </div>
          </div>
        </div>


        <div class="card my-5 software-item" >
          <div class="row g-0">
            <div class="col-md-4">
              <img @click="$router.push('/social/socialMediaGovernanceAndSecurity')" src="@/assets/social-com-images/Social-Media-Governance.jpg" class="w-100" alt="...">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h4 class="card-title">Social Media Governance & Security</h4>
                <p class="card-text">With its rising influence, social media has also become a target for cyber-attacks. According to Cisco’s annual report 2016, most web-based attacks happen on social media. </p>
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
  name: "Social",
  computed:{
    currentDirectory() {
      return this.$route.path == '/social'
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