<template>
<div class="container my-5">
  <h2 class="card-title">Awards</h2>
  <!--    TODO-->
  <div class="d-flex justify-content-between align-items-stretch">
    <div v-for="award in awards" :key="award.awardId">
      <div class="card" style="width: 18rem;">
        <img class="card-img-top" :src="award.awardImageUrl" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">{{award.awardTitle}}</h5>
          <p class="card-text">{{award.awardDate}}</p>
        </div>
      </div>
    </div>
  </div>
</div>
</template>

<script>
import AwardService from '@/awards.service'
export default {
  name: "Awards",
  data(){
    return {
      awards:[]
    }
  },
  mounted() {
    AwardService.getCompanyAwards()
    .then(res=> this.awards = res.data)
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