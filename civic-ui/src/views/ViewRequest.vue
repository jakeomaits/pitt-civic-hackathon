<template>
  <div>
  <div>
    <button v-on:click=back>Back</button>
  </div>
    <h1>Olwaz Placeholder</h1>
  <div style="padding-bottom: 80px">
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

export default {
  name: "FulfillRequest",
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
</style>
