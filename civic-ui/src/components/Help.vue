
<template>
  <b-card
    :title=help.title
    :img-src=help.imageUrl
    img-alt="Image"

    class="mb-2 rounded"
  >
    <div class="description line-clamp">
      "{{help.description}}"
    </div>
    <div class="user">
      {{user.firstName + " " + user.lastName}}
    </div>
    <div class="time">
      {{getRemainingTime()}}
    </div>
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
    console.log('Calling civic API for user data');
    const response = await CIVIC_API.get('/user/' + this.help.userId);
    this.user = response.data;
  },
  methods: {
    getRemainingTime() {
      const daysRemaining = this.help.daysRemaining;
      if (this.help.completeDate) {
        return "Complete"
      }
      if (daysRemaining < 0) {
        return "Expired";
      }
      return daysRemaining + " days left";
    }
  }
}

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.card {
  height: 12.5rem;
  width: 12.5rem;
  position:relative;
}

.rounded {
  border-radius: 2rem!important;
}

.card-img {
  object-fit: cover;
  height: 75px;
  border-top-left-radius: 2rem!important;
  border-top-right-radius: 2rem!important;
}

.card-body {
  padding: 5px;
}

.card-title {
  font-size: 14px;
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

.user {
  text-align: right;
  font-size:.8rem;
  font-weight: bold;
  padding-top: 1;
}

.time {
  width:100%;
  text-align: center;
  font-size: 14px;
  position:absolute;
  bottom:5px;
  left:50%;
  margin-left:-50%;
  
}

</style>
