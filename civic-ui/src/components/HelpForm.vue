<script>
import { CIVIC_API } from "../http-common";
import BaseImageInput from "./BaseImageInput.vue"
import NavBack from "./NavBack.vue"
import StickyButtonRequest from "./StickyButtonRequest";
import router from '../router/index.js'


export default {
  name: "HelpForm",
  data() {
    return {
      helpForm: {
        userId: "b6ab3c46-62a3-11eb-ae93-0242ac130002",
        title: "",
        description: "",
        zip: "",
        requestedDate: "",
        helpType: "",
        imageUrl: "https://www.woodpostpuller.com/wp-content/uploads/2014/09/Wood-Post-Puller-12-1024x768.jpg",
        imageData: ""
      },
      imageData: null,
      imageFile: null,
      hasImage: false,
      image: "../assets/logo.png",
      selected: null,
      options: [
        "Home/ Repair",
        "Child/Dependent Care",
        "Food/ Grocery",
        "Transportation",
        "Skill",
        "Medical",
        "Physical Good/ Donation"
      ]
    };
  },
  methods: {
    async onSubmit(event) {
      event.preventDefault();
      const helpPost = await CIVIC_API.post("/help", this.helpForm);
      console.log("Person created");
      console.log(helpPost);
      router.push("/");
    },
  },
  components: {
    BaseImageInput,
    NavBack,
    StickyButtonRequest

  },
  
};
</script>

<template>
  <b-container  class="mainContainer" fluid>

    <NavBack />

    <div class="site-name">
      Olwaz
    </div>
    <h2>What's your reqest?</h2>
    <b-form @submit="onSubmit">

<div style="height: 100px; margin-bottom: 30px;">
    <b-row>
      <b-col><p style="text-align: left;">Upload a photo to help explain your request (Optional)</p></b-col>
      <b-col><base-image-input v-model="imageFile" style="height: 100px; width: 260px;"/></b-col>
    </b-row>
    
  </div>

      <b-form-group
        label-cols-sm="3"
        label-align="left"
        label="What type of assistance do you need? "
        label-for="help-title"
      >
        <div>
          <b-form-select v-model="helpForm.helpType" :options="options"  >
          </b-form-select>
        </div>
      </b-form-group>

      <b-form-group label="Title" label-for="help-title" label-cols-sm="3"
                    label-align="left">
        <b-form-input id="title" v-model="helpForm.title" placeholder="ex. 'The wind blew down my fence.'" ></b-form-input>
      </b-form-group>

      <b-form-group
        label="Description:"
        label-for="Description"
        label-cols-sm="3"
        label-align="left"
      >
        <b-form-textarea
          id="description"
          v-model="helpForm.description"
          placeholder="Describe in more detail what you are requesting so group members can determine if they are able to help."
          rows="3"
          max-rows="6"
        ></b-form-textarea>
      </b-form-group>
      <span>
        <b-form-group
          label="Zip Code"
          label-for="help-zip"
          label-cols-sm="3"
          label-align="left"

        >
          <b-form-input id="zip" v-model="helpForm.zip" placeholder="ex. 12345"></b-form-input>
        </b-form-group>

         <b-row>
      <b-col>
        <b-form-group
          label="What date do you need help"
          label-for="help-date"
          label-cols-sm="3"
          label-align="left"
          style="font-size: 13px;"
        >
          <b-form-datepicker id="example-datepicker" v-model="helpForm.requestedDate" class="mb-2"></b-form-datepicker>
        </b-form-group></b-col>
           <b-col><b-form-group
               label="Note on date (Optional)"
               label-for="help-date"
               label-cols-sm="3"
               label-align="left"
               style="font-size: 13px;"
           >

           <b-form-input id="time-of-day" placeholder="ex. Evening"></b-form-input>
              </b-form-group>
           </b-col>
         </b-row>
      </span>
      <StickyButtonRequest />
    </b-form>
  </b-container>
</template>

<style>
#fileInput {
  display: none;
}
h1,
h2 {
  font-weight: normal;
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
.my-8 {
  margin-top: 4rem;
  margin-bottom: 4rem;
}
.mainContainer{
    border-radius:100px;
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
