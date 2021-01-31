<template>
  <div>
    <div>
      <button v-on:click=back>Back</button>
    </div>
    <h1>Olwaz Placeholder</h1>
    <img width="100%" src="../assets/FulfillRequest.png" />
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
