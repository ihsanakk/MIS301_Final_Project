<template>
  <div class="container my-5">
    <h2 class="card-title">Careers</h2>
<!--    TODO-->
    <div class="d-flex justify-content-between align-items-stretch">
        <div v-for="position in openPositions" :key="position.positionId">
          <div class="card" style="width: 18rem;">
            <img class="card-img-top" :src="position.positionImageUrl" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">{{position.positionTitle}}</h5>
              <p class="card-text">{{position.positionDescription}}</p>
            </div>
          </div>
        </div>
    </div>

  </div>
</template>

<script>
import PositionService from '@/position.service'
export default {
  name: "Careers",
  data(){
    return{
      openPositions:[]
    }
  },

  mounted() {
    PositionService.getOpenPositions()
    .then(res=> this.openPositions=res.data)
  }

}
</script>

<style scoped>
.card-title{

  color: #55ACEE;
  font-size: 40px;
  margin-bottom: 4rem;

}
</style>