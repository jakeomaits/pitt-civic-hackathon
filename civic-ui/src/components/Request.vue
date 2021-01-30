
<template>
<div>
  <b-card
    title="Card Title"
    tag="article"
    style="max-width: 20rem;"
    class="mb-2"
  >
    <b-card-text>
      Some quick example text to build on the card title and make up the bulk of the card's content.
    </b-card-text>

    <b-button href="#" variant="primary">Go somewhere</b-button>
  </b-card>
</div>
</template>



<script>
import { CIVIC_API } from "../http-common";

export default {
  name: "Request",
  data() {
    return {
      personForm: {
        requestId: "",
        title: "",
        description: "",
        points: "",
        user: "",
        location: ""
      }
    };
  },
  async created() {
    console.log('Calling civic API');
    const personOne = await CIVIC_API.get('1');
    this.people.push(personOne.data);
    console.log(`Request ID = ${personOne.data.personId}`);
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
