<template>
  <div class="home">
    <CompletedFeed />
    <Feed />
  </div>
</template>

<script>
// @ is an alias to /src
import Feed from '@/components/Feed.vue'
import CompletedFeed from '@/components/CompletedFeed.vue'

export default {
  name: 'Home',
  components: {
    Feed, 
    CompletedFeed
  }
}
</script>
