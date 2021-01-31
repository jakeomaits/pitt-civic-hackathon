<template>
  <div>
    <NavBack />
    <div class="site-name">
      Olwaz
    </div>
    <div>
    <img width="100%" src="../assets/FulfillRequest.png" />
    </div>
    <b-container id="button-container" fluid class="fixed-bottom p-2">
      <b-row>
        <b-col><b-button squared  class="secondary-button">Don't Fulfill Yet</b-button></b-col>
        <b-col><b-button squared class="main-button" >Send Thanks</b-button></b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavBack from "../components/NavBack.vue"
export default {
  components: {
    NavBack,
  },
  methods: {
    async back(event) {
      event.preventDefault();

      console.log('Mock Login');

      //assign UUID for state management

      //redirect
      await this.$router.push('/ViewRequest')
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
