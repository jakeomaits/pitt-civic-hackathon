<template>
  <div class="home">
    <!-- <Header /> -->
    <NavSignOut />
    <div class="site-name">
      Olwaz
    </div>
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
import Bio from '@/components/Bio.vue';
import Feed from '@/components/Feed.vue';
import CompletedFeed from '@/components/CompletedFeed.vue';
import StickyButtonHome from '@/components/StickyButtonHome.vue';

export default {
  name: 'Home',
  components: {
    // Header,
    NavSignOut,
    Bio,
    Feed, 
    CompletedFeed,
    StickyButtonHome
  }
}
</script>

<style scoped>
.site-name {

        position: absolute;
        width: 112px;
        height: 46px;
        left: 152px;
        top: 45px;

        font-family: Helvetica Neue;
        font-style: normal;
        font-weight: 300;
        font-size: 42px;
        line-height: 46px;
        color: #373A3C;
    }
</style>
