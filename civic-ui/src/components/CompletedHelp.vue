
<template>
  <b-card
  class="rounded">
    <b-card-header
      header-bg-variant="dark"
      header-text-variant="white"
    >
      <b-avatar variant="light" class="mr-2"></b-avatar>
      <span class="user">{{ help.completedUser.firstName + " " + help.completedUser.lastName }} </span>
      <!-- <span class="org">({{ help.completedUser.organizationId }})</span> -->
    </b-card-header>
    <b-card-title class="pt-2 pl-2">
      Helped with {{ help.helpType }}
    </b-card-title>
    <b-card-text class="pt-2 pl-2">
        "{{ help.comments }}"
    </b-card-text>
    <b-card-footer
      footer-bg-variant="light"
    >
      <b-row>
        <b-col><img src="../assets/clap.png"/><span class="cheers">7 Cheers!</span></b-col>
        <b-col class="read-more">Read More</b-col>
      </b-row>
    </b-card-footer>
  </b-card>
</template>

<script>

export default {
  name: "CompletedHelp",
  props: ['help']
}

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.card-body {
  padding: 0;
}

.rounded {
  border-radius: 2rem!important;
}

.card-title {
  font-size: 14px;
  font-weight: bold;
  text-align: left;
}

.card-header {
  border-top-left-radius: 2rem!important;
  border-top-right-radius: 2rem!important;
  text-align: left;
  line-height: 1rem;
}

.card-footer {
  border-bottom-left-radius: 2rem!important;
  border-bottom-right-radius: 2rem!important;
  font-size:.8rem;
  text-align: left;
}

.card {
  height: 12.5rem;
  width: 12.5rem;
  margin-right: 10px;
}

.card-text {
  font-size:.8rem;
  overflow:hidden;
  text-overflow: clip;
  line-height: 1rem;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
}

.user {
  text-align: right;
  font-size:.8rem;
  font-weight: bold;
}

.org {
  text-align: right;
  font-size:.5rem;
  font-weight: bold;
}

.cheers {
  font-size:.5rem;
  margin-left: 3px;
}

.read-more {
  text-decoration: underline;
}
</style>
