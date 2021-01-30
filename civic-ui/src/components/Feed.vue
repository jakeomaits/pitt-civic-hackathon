<template>
  <b-container fluid class="mt-4 mb-4">
    <b-row >
      <b-col><h5>Who Needs Help</h5></b-col>
      <b-col
        ><b-form-select
          v-model="filter.selected"
          :options="filter.options"
        ></b-form-select
      ></b-col>
    </b-row>
    <b-row class="mt-2" v-for="chunk in helpsChunks" v-bind:key="chunk.id">
      <b-col v-for="help of chunk" v-bind:key="help.helpId">
        <Help :help="help" />
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import Help from './Help.vue';
import { CIVIC_API } from "../http-common";
import _ from 'lodash';

export default {
  name: "Feed",
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
      helpsChunks: []
    };
  },
  async created() {
    console.log('Calling civic API for all helps');
    const allHelps = await CIVIC_API.get('/helps');
    this.helps = allHelps.data.helps;
    this.helpsChunks = _.chunk(allHelps.data.helps, 2);
    console.log(this.helpsChunks);
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
