<template>
        <div class="nav-sign-out">
            <a class="sign-out">Sign Out</a>
        </div>
</template>
<script>
export default {
  name: "NavSignOut",
}
</script>

<style scoped>

    .nav-sign-out {
        position: relative;
        height: 110px;

    }

    .sign-out {
        font-size: 16px;
        position: absolute;
        text-decoration: underline;
        right: 25px;
        top: 23px;
    }

    .site-name {

        position: absolute;
        width: 112px;
        height: 46px;
        left: 152px;
        top: 30px;

        font-family: Helvetica Neue;
        font-style: normal;
        font-weight: 300;
        font-size: 42px;
        line-height: 46px;
        color: #373A3C;
    }

</style>