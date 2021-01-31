<template>
  <div>
    <h1 style="margin-top:100px;margin-bottom:30px;">Olwaz Placeholder</h1>
  <b-container fluid >
      <b-form @submit="onSubmit">
        <b-form-group
          label-cols-lg="3"
          label="Welcome Back!"
          label-size="lg"
          label-class="font-weight-bold pt-0"
          class="mb-0"
        >
          <b-form-group
            label="Email:"
            label-for="login-email"
            label-cols-sm="3"
            label-align="left"
          >
            <b-form-input id="login-email" type="email" placeholder="ex. example@email.com" ></b-form-input>
          </b-form-group>

          <b-form-group
              label="Password:"
              label-for="login-password"
              label-cols-sm="3"
              label-align="left"
              type="password"
          >
            <b-form-input id="login-password" type="password" ></b-form-input>
          </b-form-group>

        </b-form-group>
        <b-button squared type="submit" variant="primary" class="main-button">Sign In</b-button>
      </b-form>
  </b-container>
  </div>
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
.main-button {
  height: 42px;
  width: 189px;
  background: #007DA3;
  margin-top: 30px;
  font-weight: bold;
  width: 100%;
}
</style>
