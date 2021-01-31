<template>
        <div class="nav-back">
            <span @click="$router.push('/')" class="back">Back</span>
            <img src="../assets/back.png" @click="$router.push('/')" class="back-icon"/>
            <line/>
        </div>
</template>
<script>
export default {
  name: "NavBack",
}
</script>

<style scoped>

    .nav-back {
        position: relative;
        height: 110px;
    }

    .back {
        font-size: 22px;
        position: absolute;
        left: 48px;
        top: 18px;
    }
    .back-icon{
        height: 20px;
        position: absolute;
        left: 24px;
        top: 23px;
    }
    .site-name2 {

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