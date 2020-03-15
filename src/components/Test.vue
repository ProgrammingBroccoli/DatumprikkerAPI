<template>
  <div>
    <h1>TEST</h1>
    <ul>
      <li v-for="post in posts" v-bind:key="post" v-text="post.title" ></li>
      <li>Test</li>
    </ul>
  </div>

</template>

<script>

</script>

<style scoped>

</style>
