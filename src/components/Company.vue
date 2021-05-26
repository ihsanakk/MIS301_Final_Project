<template>
  <div class="row">
    <hr>
    <div class="col-4 mb-5">
      <div class="d-flex text-secondary">
        <h3>COMPANY</h3>
      </div>
     <div class="list-group">
       <router-link class="list-group-item list-group-item-action" id="list-about-list" data-toggle="list" to="/company/about">About Us</router-link>
       <router-link class="list-group-item list-group-item-action" id="list-partnerships-list" data-toggle="list" to="/company/partnerships">Partnerships</router-link>
       <router-link class="list-group-item list-group-item-action" id="list-careers-list" data-toggle="list" to="/company/careers">Careers</router-link>
       <router-link class="list-group-item list-group-item-action" id="list-awards-list" data-toggle="list" to="/company/awards">Awards</router-link>
     </div>
    </div>
    <div class="col">

        <router-view/>

    </div>
  </div>
</template>

<script>

export default {
  name: "Company",
  computed:{

  },
  methods:{
    currentDirectory(){
      return this.$route.path =="/about";
    }

  },
  mounted() {


  }
}
</script>

<style scoped>

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