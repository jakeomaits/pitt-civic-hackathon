<template>
  <b-container id="button-container" fluid class="fixed-bottom p-2">
    <b-row>
      <b-col><b-button squared class="main-button" @click="$router.push('HelpForm')">Create Request</b-button></b-col>
      <b-col><b-button squared class="secondary-button">Explore Groups</b-button></b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  name: "StickyButtonHome"
};
</script>

<style scoped>

  #button-container {
    background: #FFFFFF;
  }

  .main-button {
    height: 42px;
    width: 189px;
    background: #007DA3;
    margin-left: 12px;
  }

  .secondary-button {
    height: 42px;
    width: 189px;
    background: #FFFFFF;
    color: #007DA3;
    border-color: #007DA3;
    margin-right: 12px;
  }

  .col {
    padding-left: 0px;
    padding-right: 0px;
  }

</style>