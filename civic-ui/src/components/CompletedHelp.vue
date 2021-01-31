
<template>
  <b-card
  class="rounded">
    <b-card-header
      header-bg-variant="dark"
      header-text-variant="white"
    >
      <b-avatar variant="light" class="mr-2"></b-avatar>
      <span class="user">{{user.firstName}}</span>
    </b-card-header>
    <b-card-title>
      Helped with {{help.helpType}}
    </b-card-title>
    <b-card-text>
      "Thank you!"
    </b-card-text>
  </b-card>
</template>

<script>
import { CIVIC_API } from "../http-common";
export default {
  name: "CompletedHelp",
  props: ['help'],
  data() {
    return {
      user: {}
    };
  },
  async created() {
    console.log('Calling civic API for user data');
    const response = await CIVIC_API.get('/user/' + this.help.userId);
    this.user = response.data;
  },

}

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.card-body {
  padding: 0;
}

.rounded {
  border-radius: 2rem!important;
}

.card-title {
  font-size: 15px;
  font-weight: bold;
  text-align: left;
  padding: 5px;
}

.card-header {
  border-top-left-radius: 2rem!important;
  border-top-right-radius: 2rem!important;
  text-align: left;
}

.card {
  height: 12.5rem;
  width: 12.5rem;
  margin-right: 10px;
}

/* 





.description {
  font-size:.8rem;
  overflow:hidden;
  line-height: 1rem;
  max-height: 2rem;
  display: block;
  display: -webkit-box;
  overflow: hidden !important;
  text-overflow: ellipsis;
  -webkit-line-clamp: 4;
  text-align: left;
} */

.user {
  text-align: right;
  font-size:.8rem;
  font-weight: bold;
  padding-top: 1;
}
</style>
