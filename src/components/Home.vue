<template>
  <div>





    <div class="home-element row my-5">
      <div class="col-md-6 col-lg-6 col-sm-6">
        <div class="text-part mt-4">
          <h3 class="mb-5">Disruptive Thinking. Scalable Approach</h3>
          <p>We are your veteran guide to the digital jungle and we are asking for the right of access to your world.
            Let us kill your pain.</p>
          <button @click="$router.push('/software')" class="btn btn-lg btn-outline-primary my-4">Discover</button>
        </div>
      </div>
      <div class="col">
      </div>
      <div class="col-md-4 col-lg-4 col-sm-6">
        <img src="@/assets/home-page-images/discover-think_1.jpg" alt="">
      </div>
    </div>


    <div class="home-element row my-5">
      <div class="col-md-6 col-lg-6 col-sm-6">
        <div class="text-part mt-4">
          <h3 class="mb-5">Put User Engagement to Work</h3>
          <p>We produce actionable outcomes
            by allocating data transparency across channels
            and measuring real time responsiveness
            along with tailored solutions for B2B and B2C</p>

          <button @click="$router.push('/insights')" class="btn btn-lg btn-outline-primary my-4">Discover</button>
        </div>
      </div>
      <div class="col">
      </div>
      <div class="col-md-4 col-lg-4 col-sm-6">
        <img src="@/assets/home-page-images/engagment-work_1.jpg" style="width: 80%" alt="">
      </div>
    </div>



    <div class="home-element row my-5">
      <div class="col-md-6 col-lg-6 col-sm-6">
        <div class="text-part mt-4">
          <h3 class="mb-5">From Selfie to Data</h3>
          <p>We create calculable results through action oriented management
            and pinpointed monitoring powered by the best active listening
            tools the industry has to offer</p>
          <button @click="$router.push('/software/mobileApplicationDevelopment')" class="btn btn-lg btn-outline-primary my-4">Discover</button>
        </div>
      </div>
      <div class="col">
      </div>
      <div class="col-md-4 col-lg-4 col-sm-6 img-hover">
        <img src="@/assets/home-page-images/selfie-to-data_1.png" alt="">
      </div>
    </div>



  </div>
</template>

<script>

export default {
  name: "Home",

  mounted() {



  },
  methods:{

  }

}
</script>

<style scoped>

.home-about-image{
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 80%;
}

.home-element{
  font-size: 30px;
  color: #4C4C4C;
}
.home-element h3{
  font-size: 40px;
  font-weight: bold;
}

.home-element img{
  width: 100%;
  transition: transform .2s;
}

.home-element img:hover{
  transform: scale(1.1);
}

</style>