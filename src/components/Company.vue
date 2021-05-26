<template>
  <div class="row">

    <hr>
    <div class="col-4">
     <router-link class="side-bar" to="/about"> <p>About us</p></router-link>
      <p>partnerships</p>
      <p>careers</p>
      <p>awards</p>
    </div>
    <div class="col">

        <router-view/>

    </div>
  </div>
</template>

<script>

export default {
  name: "Company",
  components: {}
}
</script>

<style scoped>
.side-bar{
  text-decoration: none;
  color: grey;
  font-size: 20px;
}

hr {
  margin-top: 1rem;
  margin-bottom: 1rem;
  border: 0;
  border-top: 1px solid rgba(0, 0, 0, 0.1);
}
</style>