<template>
  <div>
    <b-form-select   v-model="selected" :options="options"></b-form-select>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        selected: null,
        options: [
          { value: 1, text: 'Please select an option' },
          { value: 2, text: 'This is First option' },
          { value: 3, text: 'Selected Option' }
        ]
      }
    },
    methods: {
          onSelect() {
            this.$emit('selectData', this.selected);
          }
        }
  }
</script>









