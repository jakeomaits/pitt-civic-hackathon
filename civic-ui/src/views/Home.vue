<template>
  <div class="home">
    <Header />
    <CompletedFeed />
    <Feed />
  </div>
</template>

<script>
// @ is an alias to /src
import Header from '@/components/Header.vue';
import Feed from '@/components/Feed.vue';
import CompletedFeed from '@/components/CompletedFeed.vue';

export default {
  name: 'Home',
  components: {
    Header,
    Feed, 
    CompletedFeed,
  }
}
</script>
