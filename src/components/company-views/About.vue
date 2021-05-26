<template>
  <div class="container my-5">
    <h2 class="card-title">About Us</h2>

    <p class="description">
      MySoftware entered the growing scene of Turkish Internet sector in 2007 with the sole purpose of building and managing portals.
      With time, MySoftware evolved by widening its scope into a whole portfolio of services including <strong> Digital Marketing Consultancy,
      SEO/SEM Services, Technology Agency, Lead Management, Marketing Automation Systems and Multichannel Marketing.</strong>
    </p>

    <p class="mission-description">

      Our approach to the web is not that of a software house but rather a consultancy firm which sees software as a tool in helping a
      company rise up to the challenges of the new digital era. We take pride in our ability to develop unique methodologies,
      technologies and business models that support our customers in gaining competitive advantages through our holistic approach.

    </p>

  </div>
</template>

<script>
export default {
  name: "About",
  computed:{
    pageTitle(){
      return this.$route.meta.title;
    }
  }
}
</script>

<style scoped>
.card-title{

  color: #55ACEE;
  font-size: 40px;
  margin-bottom: 4rem;

}

.description{
  font-size: 24px;
  margin-top: 6px;
}
.mission-description{

  margin-top: 6rem;
  font-size: 24px;
}

</style>