
<template>
<div>
  <b-card
    :title=help.title
    tag="helpRequest"
    style="max-width: 50rem;"
    class="mb-2"
  >
    <b-card-text>
      {{help.description}}
    </b-card-text>
    <div>
      {{help.location}}
    </div>

    <b-button href="#" variant="primary">Accept Request</b-button>
  </b-card>
</div>
</template>

<script>
    export default {
      props: ['help']
    }
</script>
