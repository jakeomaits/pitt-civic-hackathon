<template>
    <div class="header">

        <a class="join">Join a Group</a>
        <a class="sign-out">Sign Out</a>
        <br/>
        <span class="site-name">Sammy</span>
        <b-avatar fvariant="light" class="mr-2 avatar"/>
        <span class="username"> Johnny Appleseed</span>
        <span class="bio">I plant apple trees across the land.</span>
        <a class="edit-profile">Edit Profile</a>
        <b-col><img src="../assets/pencil.png" class="pencil"/></b-col>
        
    </div>
</template>
<script>
export default {
  name: "Header",
}
</script>

<style>
    .header {
        height: 150px;
        position: relative;
        border-color: black;
        border-top-width: 0px;
        border-left-width: 0px;
        border-right-width: 0px;
        border-bottom-width: 1px;
        border-style: solid;
        margin-bottom: 0px;
    }

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
    }

    .avatar {
        position:absolute;
        height: 60px;
        width: 60px;
        left: 5%;
        top: 55px;
    
    }

    .username {
        font-weight: bold;
        font-size: 20px;
        position: absolute;
        top: 70px;
        left: 120px;
    }

    .bio {
        position: absolute;
        font-size: 14px;
        position: absolute;
        top: 115px;
        left: 110px;
    }


    .edit-profile {
        position: absolute;
        font-size: 12px;
        position: absolute;
        top: 125px;
        left: 23px;
    }

    .pencil {
        position: absolute;
        height: 14px;
        width: 14px;
        top: 101px;
        left: 85px;
    }

</style>