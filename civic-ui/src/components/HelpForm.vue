<script>
import { CIVIC_API } from "../http-common";
import BaseImageInput from "./BaseImageInput.vue"

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
        imageUrl: "https://images.app.goo.gl/9CT512Aebrw5yeXY8",
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
    },
  },
  components: {
    BaseImageInput
  },
  
};
</script>

<template>
  <b-container fluid>
    <h2>What's your reqest?</h2>
    <b-form @submit="onSubmit">

<div class="app">
    <base-image-input v-model="imageFile"/>
  </div>

      <b-form-group
        label-cols-sm="3"
        label-align-sm="right"
        label="What type of assistanc do you need? "
        label-for="help-title"
      >
        <div>
          <b-form-select v-model="helpForm.helpType" :options="options"></b-form-select>
        </div>
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
        <b-form-group
          label="Zip Code"
          label-for="help-zip"
          label-cols-sm="3"
          label-align-sm="right"
        >
          <b-form-input id="zip" v-model="helpForm.zip"></b-form-input>
        </b-form-group>

        <b-form-group
          label="When do I need help ?"
          label-for="help-date"
          label-cols-sm="3"
          label-align-sm="right"
        >
          <b-form-datepicker id="example-datepicker" v-model="helpForm.requestedDate" class="mb-2"></b-form-datepicker>
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

.image-preview {
  width: 50%;
  height: 100px;
  float: left;
  border-style: solid;
}
.file-upload-form {
  margin-left: 50%;
  height: 100px;
}

.preview {
  max-width: 100%;
  max-height: 100%;
}

.image-input {
  display: block;
  width: 200px;
  height: 200px;
  cursor: pointer;
  background-size: cover;
  background-position: center center;
}

.placeholder {
  background: #f0f0f0;
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  color: #333;
  font-size: 18px;
  font-family: Helvetica;
}

.placeholder:hover {
  background: #e0e0e0;
}

.file-input {
  display: none;
}
</style>
