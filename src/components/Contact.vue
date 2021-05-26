<template>
  <div class="container my-5">
    <h3 class="contact-title text-uppercase">Contact Us</h3>
    <hr>
    <div class="contact-card d-flex align-items-center justify-content-evenly">

      <div class="tel-icon my-3"><font-awesome-icon icon="phone"/><span class="info">(212) 000 00 00</span></div>
      <div class="mail-icon"><font-awesome-icon icon="envelope"/><span class="info">info@mysoftware.com</span></div>
      <div class="address-icon"><font-awesome-icon icon="directions"/><span class="info">Threshold Avenue-10101 Central Park CD</span></div>
    </div>

    <div class="contact-message-form">
      <h3 class="contact-title text-uppercase">Inform Us</h3>
      <hr>
      <div class="row">
        <div class="mb-3 col-6">
          <label for="contact_name" class="form-label">Name Surname</label>
          <input v-model="username" type="text" class="form-control" id="contact_name">
        </div>
        <div class="mb-3 col-6">
          <label for="contact_email" class="form-label">Email</label>
          <input v-model="userEmail" type="text" class="form-control" id="contact_email">
        </div>
        <div class="mb-3 col-6">
          <label for="contact_phone" class="form-label">Phone</label>
          <input v-model="userPhone" type="tel" class="form-control" id="contact_phone">
        </div>
        <div class="mb-3 col-6">
          <label for="contact_company_name" class="form-label">Company Name</label>
          <input v-model="companyName" type="text" class="form-control" id="contact_company_name">
        </div>

        <div class="mb-3 col-12">
          <label for="contact_message" class="form-label">Message</label>
          <textarea v-model="message" type="text" class="form-control" id="contact_message"></textarea>
        </div>

        <div class="col-3">
          <button @click="submitInform" type="submit" class="btn btn-lg btn-outline-primary">Submit</button>
        </div>

      </div>
    </div>

  </div>
</template>

<script>

import SendInformationService from '@/sendinformatin.service'
export default {

  name: "Contact",
  data(){
    return{
      username:'',
      userEmail:'',
      userPhone:'',
      companyName:'',
      message:''
    }
  },

  methods:{

    submitInform(){
        SendInformationService.postInfo(this.username,this.userEmail,this.userPhone,this.companyName,this.message)
        .then()
      .catch(err => console.log(err))
    }

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
.info{

  margin-left: 12px;

}

.contact-card{
  background: #55ACEE;
  max-height: 400px;
  height: 400px;
  font-size: 26px;
}

.contact-title{

  font-size: 44px;
color: #55ACEE;
}

.contact-message-form{

  font-size: 22px;
  margin-top: 30px;

}

.form-control{

  background: #dff4df;
}

</style>