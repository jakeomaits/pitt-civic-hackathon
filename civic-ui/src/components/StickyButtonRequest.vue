<template>
  <b-container id="button-container" fluid class="p-2">
    <b-row>
      <b-col><b-button squared class="main-button" type="submit">Post Request</b-button></b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  name: "StickyButtonRequest"
};
</script>

<style scoped>

  #button-container {
    background: #FFFFFF;
  }

  .main-button {
    height: 42px;
    width: 390px;
    left: 0px;
    top: 0px;
    border-radius: 0px;
    font-weight: bold;
    background: #007DA3;
  }

  .col {
    padding-left: 0px;
    padding-right: 0px;
  }

</style>