<template>
  <div>
    <div>
      <button v-on:click=back>Back</button>
    </div>
    <h1>Olwaz Placeholder</h1>
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

export default {
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
</style>
