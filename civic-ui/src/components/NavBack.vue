<template>
        <div class="nav-back">
            <a @click="$router.push('/')" class="back">Back</a>
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
        font-size: 18px;
        position: absolute;
        left: 10px;
        top: 10px;
    }

</style>