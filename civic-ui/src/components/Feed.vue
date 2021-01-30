<template>
  <b-container fluid>
    <b-card
      v-for="help of helps"
      v-bind:key="help.id"
      :title="help.title"
      :sub-title="help.description"
    >
    </b-card>
  </b-container>
</template>

<script>

export default {
  name: "Feed",
  data() {
    return {
      helps: [
        {
          id: 1,
          title: "Grillmarks",
          description: "Accidentially burned my foot on a George Foreman grill. Need someone to drive me to the hospital!"
        },
        {
          id: 2,
          title: "Jello",
          description: "Someone put my stapler inside Jello. Please help!"
        },
        {
          id: 3,
          title: "Marathon",
          description: "Can someone pick up some fettucine alfredo for me? I have a marathon later and need to carb load."
        },
      ]
    };
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
