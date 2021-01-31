<template>
        <div class="nav-back">
            <span @click="$router.push('/')" class="back">Back</span>
            <img src="../assets/back.png" @click="$router.push('/')" class="back-icon"/>
        </div>
</template>
<script>
export default {
  name: "NavBack",
}
</script>

<style>

    .nav-back {
        position: relative;
        height: 50px;
    }

    .back {
        font-size: 20px;
        position: absolute;
        left: 30px;
        top: 8px;
    }
    .back-icon{
        height: 18px;
        position: absolute;
        left: 10px;
        top: 12px;
    }

</style>