<script>
export default {
    name: "HelpForm",
    data() {
        return{};
    },
};
</script>

<template>
  <b-container fluid>
    <h2>What's your reqest?</h2>

    <div>
          <b-form-group
            label="Description:"
            label-for="Description"
            label-cols-sm="3"
            label-align-sm="right"
          >
      
    <b-form-textarea
      id="description"
      v-model="text"
      placeholder="How can we help..."
      rows="3"
      max-rows="6"
    ></b-form-textarea>

    <pre class="mt-3 mb-0">{{ description }}</pre>
          </b-form-group>

</div>
</b-container>
</template>