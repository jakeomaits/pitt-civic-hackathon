<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <Feed />
  </div>
</template>

<script>
// @ is an alias to /src
import Feed from '@/components/Feed.vue'

export default {
  name: 'Home',
  components: {
    Feed
  }
}
</script>
