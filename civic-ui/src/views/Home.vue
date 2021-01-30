<template>
  <div class="home">
    <UserFeed />
    <Feed />
  </div>
</template>

<script>
// @ is an alias to /src
import Feed from '@/components/Feed.vue'
import UserFeed from '@/components/UserFeed.vue'

export default {
  name: 'Home',
  components: {
    Feed, 
    UserFeed
  }
}
</script>
