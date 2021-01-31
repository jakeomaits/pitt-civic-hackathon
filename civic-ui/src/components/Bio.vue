<template>
    <div class="bio-parent">
      <div style="float: left;"><img src="../assets/lg_profile_orange.png" /></div>
        <span class="username">Betty Aberlin</span>
        <span class="bio" >"Has a soft spot for children and animals."</span>

        <div style="float: right; padding-top:80px; margin-right: 10px; font-size: 14px;text-decoration: underline;"><img src="../assets/pencil.png" class="pencil" />Edit</div>
        
    </div>
</template>
<script>
export default {
  name: "Bio",
}
</script>

<style>
    .bio-parent {
        height: 110px;
        margin-bottom: 0px;
      background: #E6F2F6;
    }
    .username {
    font-size: 20px;
    position: absolute;
    top: 135px;
    left: 120px;
    }
    .bio {
  font-size: 14px;
  position: absolute;
  top: 175px;
  left: 120px;
    }

    .pencil {
      height: 14px;
      width: 15px;
    }
/*
    .join {
        position:absolute;
        left: 2%;
        font-size: 18px;
    }

    .sign-out {
        position:absolute;
        right: 2%;
        font-size: 18px;
    }
    .site-name {
        position: absolute;
        top: 15px;
        left: 165px;
        font-size: 26px;
    }*/

</style>