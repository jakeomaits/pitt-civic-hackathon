<template>
  <div class="home">
    <Header />
    <CompletedFeed />
    <Feed />
    <StickyButtonHome />
  </div>
</template>

<script>
// @ is an alias to /src
import Header from '@/components/Header.vue';
import Feed from '@/components/Feed.vue';
import CompletedFeed from '@/components/CompletedFeed.vue';
import StickyButtonHome from '@/components/StickyButtonHome.vue';

export default {
  name: 'Home',
  components: {
    Header,
    Feed, 
    CompletedFeed,
    StickyButtonHome
  }
}
</script>
