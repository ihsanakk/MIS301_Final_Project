<template>
  <div class="container my-5">
    <h2 class="card-title">Partnerships</h2>
<!--    TODO => service-->
    <div class="d-flex justify-content-between align-items-stretch">
      <div v-for="partner in partners" :key="partner.partnerId">
        <div class="card" style="width: 18rem;">
          <img class="card-img-top" :src="partner.partnerImageUrl" alt="Card image cap">
          <div class="card-body">
            <h5 class="card-title">{{partner.partnerBrand}}</h5>
            <p class="card-text">{{partner.partnerDescription}}</p>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>

<script>
import PartnerService from '@/partnership.service'
export default {
  name: "Partnerships",
  data(){
    return{
      partners:[]
    }
  },
  mounted() {
      PartnerService.getPartnerShips()
    .then(res=>this.partners=res.data)
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