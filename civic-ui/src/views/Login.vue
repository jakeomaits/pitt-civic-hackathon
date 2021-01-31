<template>
  <div>
    <div class="site-name" style="padding-top:30px;margin-bottom:30px;">
      Olwaz
    </div>

  <b-container fluid style="padding-top: 180px;" >
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
