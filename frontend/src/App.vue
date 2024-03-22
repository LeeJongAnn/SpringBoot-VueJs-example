<template>
<Header/>
  <Home/>
<Footer/>

</template>

<script>

import Footer from "@/components/Footer.vue";
import Header from "@/components/Header.vue";
import Home from "@/pages/Home.vue";

export default {
  name: 'App',
  components: {
    Home,
    Header,
    Footer
  }
}
</script>

<style>


</style>
