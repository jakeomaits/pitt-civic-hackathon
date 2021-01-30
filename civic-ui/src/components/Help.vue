
<template>
  <b-card
    :title=help.description
    img-src="https://mymodernmet.com/wp/wp-content/uploads/2018/01/bailey-dog-meme-2.jpg"
    img-alt="Image"
    tag="helpRequest"
    style="max-width: 12rem;"
    class="mb-2 rounded"
  >
    <div class="description">
      "{{help.title}}"
    </div>
    <requestor>
      <div>
      {{user.firstName + " " + user.lastName}}
      </div>
    </requestor>
  </b-card>
</template>

<script>
import { CIVIC_API } from "../http-common";
export default {
  name: "Help",
  props: ['help'],
  data() {
    return {
      user: {}
    };
  },
  async created() {
    console.log('Calling civic API for person data');
    const response = await CIVIC_API.get('/user/' + this.help.userId);
    this.user = response.data;
  },

}

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
/* .card {
  
} */

.rounded {
  border-radius: 2rem!important;
}

.card-img {
  border-top-left-radius: 2rem!important;
  border-top-right-radius: 2rem!important;
}

.card-title {
  font-size: 15px;
  font-weight: bold;
  text-align: left;
}

.description {
  font-size:.8rem;
  overflow:hidden;
  line-height: 1rem;
  max-height: 2rem;
  display: block;
  display: -webkit-box;
  overflow: hidden !important;
  text-overflow: ellipsis;
  -webkit-line-clamp: 4;
  text-align: left;
}

requestor {
  text-align: right;
  font-size:.8rem;
  font-weight: bold;
  padding-top: 1;
}
</style>
