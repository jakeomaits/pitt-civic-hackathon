<template>
  <div>
  <div>
    <button v-on:click=back>Back</button>
  </div>
    <h1>Olwaz Placeholder</h1>
  <div>
    <img width="100%" src="../assets/ViewRequest.png" />

  <button >Cancel Request</button>
  <button v-on:click="fulfill">Request Fulfilled</button>
  </div>
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
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
