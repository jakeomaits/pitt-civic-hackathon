<template>
  <b-container fluid class="mt-4 mb-4">
    <b-row >
      <h5>Completed Requests</h5>
    </b-row>
    <b-row class="mt-2">
      <CompletedHelp
        v-for="help of helps"
        v-bind:key="help.id"
        :help="help"
      />
    </b-row>
  </b-container>
</template>

<script>
import CompletedHelp from './CompletedHelp.vue';
import { CIVIC_API } from "../http-common";

export default {
  name: "CompletedFeed",
  components: {
    CompletedHelp
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
    console.log('Calling civic API for completed helps');
    const completedHelps = await CIVIC_API.get('/helps?completed=true');
    this.helps = completedHelps.data.helps;
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .col {
    padding: 0px;
    margin: 3px;
  }
</style>
