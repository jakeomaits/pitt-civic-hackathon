<script>
//import imageUploader from "./ImageUploader";
import { CIVIC_API } from "../http-common";
import HelpCategory from "./HelpCategory";
import Datepicker from 'vuejs-datepicker';

export default {
  name: "HelpForm",
  data() {
    return {
      helpForm: {
        userId: "",
        title: "",
        description: "",
        zip: "",
        requestedDate: "",
        helpType: "",
        imageUrl: ""
      },
      hasImage: false,
      image: null
    };
  },
  methods: {
    setImage: function(output) {
      this.hasImage = true;
      this.image = output;
      console.log("Info", output.info);
      console.log("Exif", output.exif);
    },
    async onSubmit(event) {
      event.preventDefault();
      const helpPost = await CIVIC_API.post("", this.helpForm);
      console.log("Person created");
      console.log(helpPost);
    }
  },
  components: {
    //imageUploader: imageUploader,
    HelpCategory: HelpCategory,
    Datepicker
  }
};
</script>

<template>
  <b-container fluid>
    <h2>What's your reqest?</h2>
    <b-form @submit="onSubmit">
      <img src="../assets/logo.png" />

      <b-form-group label="What type of assistanc do you need? " label-for="help-title" label-cols-sm="3" label-align-sm="right">
        <HelpCategory />
      </b-form-group>

      <b-form-group label="Title" label-for="help-title" label-cols-sm="3" label-align-sm="right">
        <b-form-input id="title" v-model="helpForm.title"></b-form-input>
      </b-form-group>

      <b-form-group
        label="Description:"
        label-for="Description"
        label-cols-sm="3"
        label-align-sm="right"
      >
        <b-form-textarea
          id="description"
          v-model="helpForm.description"
          placeholder="How can we help..."
          rows="3"
          max-rows="6"
        ></b-form-textarea>

      </b-form-group>
      <span>
        <b-form-group label="Zip Code" label-for="help-zip" label-cols-sm="3" label-align-sm="right">
        <b-form-input id="zip" v-model="helpForm.zip"></b-form-input>
      </b-form-group>

      <b-form-group label="When do I need help ?" label-for="help-date" label-cols-sm="3" label-align-sm="right">
        <Datepicker id="requestDate" v-model="helpForm.requestDate"></Datepicker>
    
      </b-form-group>
      </span>
      <b-button type="submit" variant="primary">Submit</b-button>
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
</style>