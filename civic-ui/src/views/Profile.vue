<template>
  <b-container fluid>
    <img alt="Vue logo" src="../assets/logo.png" />
    <h4>Profile</h4>
    <b-card bg-variant="light" class="mb-2">
      <b-form >
        <b-form-group
          label-cols-lg="3"
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
            {{ personForm.firstName }}
          </b-form-group>

          <b-form-group
            label="Last Name:"
            label-for="person-lastname"
            label-cols-sm="3"
            label-align-sm="right"
          >
            {{ personForm.lastName }}

          </b-form-group>

          <b-form-group
            label="Email Address:"
            label-for="person-emaii"
            label-cols-sm="3"
            label-align-sm="right"
          >
            {{ personForm.email }}
          </b-form-group>

          <b-form-group
            label="Phone Number:"
            label-for="person-phone"
            label-cols-sm="3"
            label-align-sm="right"
          >
            {{ personForm.phone }}
          </b-form-group>

          
          <b-form-group
            label="ZIP:"
            label-for="person-zip"
            label-cols-sm="3"
            label-align-sm="right"
          >
            {{ personForm.zip }}
          </b-form-group>


          <b-form-group
            label="Organization:"
            label-for="person-org"
            label-cols-sm="3"
            label-align-sm="right"
          >
            {{ personForm.organization }}
          </b-form-group>



        </b-form-group>
      </b-form>
    </b-card>
  </b-container>
</template>

<script>
//import { CIVIC_API } from "../http-common";

export default {
  name: "Person",
  data() {
    return {
      personForm: {
        personId: "b6ab3c46-62a3-11eb-ae93-0242ac130002",
        firstName: "Dennis",
        lastName: "Kertis",
        email: "souplover@gmail.com",
        password: "",
        zip: "15108",
        phone: "7242731234",
        organization: "Dick's Sporting Goods",
      },
      people: [],
    };
  }
  /*,
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
  },*/
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
