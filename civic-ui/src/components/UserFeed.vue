<template>
  <b-container fluid class="mt-4 mb-4">
    <b-row >
      <b-col><h5>Completed Requests</h5></b-col>
      <b-col>
        <!-- <b-form-select
          v-model="filter.selected"
          :options="filter.options"
        >
        </b-form-select> -->
      </b-col>
    </b-row>
    <b-row class="mt-2">
      <Help
        v-for="help of helps"
        v-bind:key="help.id"
        :help="help"
      />
    </b-row>
  </b-container>
</template>

<script>
import Help from './Help.vue';
import { CIVIC_API } from "../http-common";

export default {
  name: "UserFeed",
  components: {
    Help
  },
  data() {
    return {
      filter: {
        selected: "Most Recent",
        options: [
          {
            value: "Most Recent",
            text: "Most Recent",
          },
        ],
      },
      helps: [],
    };
  },
  async created() {
    console.log('Calling civic API for user helps');
    const userHelps = await CIVIC_API.get('/helps?userId=b6ab3c46-62a3-11eb-ae93-0242ac130002');
    this.helps = userHelps.data.helps;
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
