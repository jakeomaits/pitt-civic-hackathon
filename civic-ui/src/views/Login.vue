<template>
  <b-container fluid>
    <b-card bg-variant="light" class="mb-2">
      <b-form @submit="onSubmit">
        <b-form-group
          label-cols-lg="3"
          label="Login"
          label-size="lg"
          label-class="font-weight-bold pt-0"
          class="mb-0"
        >

          <b-form-group
            label="Email:"
            label-for="login-email"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="login-email" type="email" ></b-form-input>
          </b-form-group>

          <b-form-group
              label="Password:"
              label-for="login-password"
              label-cols-sm="3"
              label-align-sm="right"
              type="password"
          >
            <b-form-input id="login-password" type="password" ></b-form-input>
          </b-form-group>

        </b-form-group>
        <b-button type="submit" variant="primary">Submit</b-button>
      </b-form>
    </b-card>
  </b-container>
</template>

<script>

export default {
  name: "Login",
  methods: {
    async onSubmit(event) {
      event.preventDefault();

      console.log('Mock Login');

      //assign UUID for state management

      //redirect
      await this.$router.push('/')
    },
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
