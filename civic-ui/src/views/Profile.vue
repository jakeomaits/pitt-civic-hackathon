<template>
  <b-container fluid>
    <img alt="Vue logo" src="../assets/logo.png" />
    <h4>Pittsburgh Civic Hackathon UI</h4>
    <b-card bg-variant="light" class="mb-2">
      <b-form @submit="onSubmit">
        <b-form-group
          label-cols-lg="3"
          label="Person"
          label-size="lg"
          label-class="font-weight-bold pt-0"
          class="mb-0"
        >

          <b-form-group
            label="First Name:"
            label-for="person-firstname"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-firstname" v-model="personForm.firstName"></b-form-input>
          </b-form-group>

          <b-form-group
            label="Last Name:"
            label-for="person-lastname"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-lastname" v-model="personForm.lastName"></b-form-input>
          </b-form-group>

          <b-form-group
            label="Email Address:"
            label-for="person-emaii"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-email" v-model="personForm.email"></b-form-input>
          </b-form-group>

          <b-form-group
            label="Password:"
            label-for="person-password"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-password" v-model="personForm.password" type="password"></b-form-input>
          </b-form-group>

          <b-form-group
            label="Phone Number:"
            label-for="person-phone"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-phone" v-model="personForm.phone"></b-form-input>
          </b-form-group>

          
          <b-form-group
            label="ZIP:"
            label-for="person-zip"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-zip" v-model="personForm.zip"></b-form-input>
          </b-form-group>


          <b-form-group
            label="Organization:"
            label-for="person-org"
            label-cols-sm="3"
            label-align-sm="right"
          >
            <b-form-input id="person-org" v-model="personForm.organzation"></b-form-input>
          </b-form-group>



        </b-form-group>
        <b-button type="submit" variant="primary">Submit</b-button>
      </b-form>
    </b-card>
    <b-card
      v-for="person of people"
      v-bind:key="person.personId"
      :title="person.firstName + ' ' + person.lastName"
      :sub-title="'ID = ' + person.personId"
    >
    </b-card>
  </b-container>
</template>

<script>
import { CIVIC_API } from "../http-common";

export default {
  name: "Person",
  data() {
    return {
      personForm: {
        personId: "",
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        zip: "",
        phone: "",
        organizationId: "",
      },
      people: [],
    };
  },
  async created() {
    console.log('Calling civic API');
    const personOne = await CIVIC_API.get('1');
    this.people.push(personOne.data);
    console.log(`Person ID = ${personOne.data.personId}`);
  },
  methods: {
    async onSubmit(event) {
      event.preventDefault();
      const personPost = await CIVIC_API.post('', this.personForm);
      console.log('Person created');
      console.log(personPost);
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
