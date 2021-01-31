<script>
//import imageUploader from "./ImageUploader";
import { CIVIC_API } from "../http-common";
//import HelpCategory from "./HelpCategory"

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
      hasImage: false,
      image: null,
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
    setImage: function(output) {
      this.hasImage = true;
      this.image = output;
      console.log("Info", output.info);
      console.log("Exif", output.exif);
    },
    async onSubmit(event) {
      event.preventDefault();
      const helpPost = await CIVIC_API.post("/help", this.helpForm);
      console.log("Person created");
      console.log(helpPost);
    },
     previewImage: function(event) {
            // Reference to the DOM input element
            var input = event.target;
            // Ensure that you have a file before attempting to read it
            if (input.files && input.files[0]) {
                // create a new FileReader to read this image and convert to base64 format
                var reader = new FileReader();
                // Define a callback function to run, when FileReader finishes its job
                reader.onload = (e) => {
                    // Note: arrow function used here, so that "this.imageData" refers to the imageData of Vue component
                    // Read image as base64 and set to imageData
                    this.helpForm.imageData = e.target.result;
                }
                // Start the reader job - read file as a data url (base64 format)
                reader.readAsDataURL(input.files[0]);
            }
        }
  },
  components: {
    //imageUploader: imageUploader,
    //HelpCategory
  }
};
</script>

<template>
  <b-container fluid>
    <h2>What's your reqest?</h2>
    <b-form @submit="onSubmit">
      <!-- <b-form-group
        label="Upload Image"
        label-for="help-title"
        label-cols-sm="3"
        label-align-sm="right"
      >
        <img width="200" height="200" src="https://images.app.goo.gl/9CT512Aebrw5yeXY8" />
      </b-form-group> -->

      <div>
            <div class="file-upload-form">
                Upload an image file:
                <input type="file" @change="previewImage" accept="image/*">
            </div>
            <div class="image-preview" v-if="helpForm.imageData.length > 0">
                <img class="preview" :src="helpForm.imageData">
            </div>
        </div>

      <b-form-group
        label-cols="4"
        label-cols-lg="2"
        label-align="right"
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
</style>
