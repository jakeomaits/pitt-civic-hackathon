<template>
  <div class="home">
    <!-- <Header /> -->
    <NavSignOut />
    <SiteName />
    <Bio />
    <CompletedFeed />
    <Feed />
    <StickyButtonHome />
  </div>
</template>

<script>
// @ is an alias to /src
// import Header from '@/components/Header.vue';
import NavSignOut from '@/components/NavSignOut.vue';
import SiteName from '@/components/SiteName.vue';
import Bio from '@/components/Bio.vue';
import Feed from '@/components/Feed.vue';
import CompletedFeed from '@/components/CompletedFeed.vue';
import StickyButtonHome from '@/components/StickyButtonHome.vue';

export default {
  name: 'Home',
  components: {
    // Header,
    NavSignOut,
    SiteName,
    Bio,
    Feed, 
    CompletedFeed,
    StickyButtonHome
  }
}
</script>
