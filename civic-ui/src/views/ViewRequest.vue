<template>
  <div>
    <NavBack />
    <div class="site-name">
      Olwaz
    </div>
  <div style="padding-bottom: 30px">
    <img width="100%" src="../assets/ViewRequest.jpg" />
  </div>
    <b-container id="button-container" fluid class="fixed-bottom p-2">
      <b-row>
        <b-col><b-button squared  class="secondary-button">Cancel Request</b-button></b-col>
        <b-col><b-button squared class="main-button" v-on:click="fulfill">Request Fulfilled</b-button></b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavBack from "../components/NavBack.vue"
export default {
  name: "FulfillRequest",
  components: {
    NavBack,
  },
  methods: {
    async fulfill(event) {
      event.preventDefault();

      console.log('Mock Login');

      //assign UUID for state management

      //redirect
      await this.$router.push('/FulfillRequest')
    },

    async back(event) {
      event.preventDefault();

      console.log('Mock Login');

      //assign UUID for state management

      //redirect
      await this.$router.push('/')
    }
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#button-container {
  background: #FFFFFF;
}

.main-button {
  height: 42px;
  width: 189px;
  background: #007DA3;
  margin-left: 12px;
}

.secondary-button {
  height: 42px;
  width: 189px;
  background: #FFFFFF;
  color: #007DA3;
  border-color: #007DA3;
  margin-right: 12px;
}

.col {
  padding-left: 0px;
  padding-right: 0px;
}

.site-name {

        position: absolute;
        width: 112px;
        height: 46px;
        left: 152px;
        top: 45px;

        font-family: Helvetica Neue;
        font-style: normal;
        font-weight: 300;
        font-size: 42px;
        line-height: 46px;
        color: #373A3C;
    }
</style>
