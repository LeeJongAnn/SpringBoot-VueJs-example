<template>
  <main role="main">

    <section class="jumbotron text-center">
      <div class="container">
        <h1>Album example</h1>
        <p class="lead text-muted">Something short and leading about the collection below—its contents, the creator,
          etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.</p>
        <p>
          <a href="#" class="btn btn-primary my-2">Main call to action</a>
          <a href="#" class="btn btn-secondary my-2">Secondary action</a>
        </p>
      </div>
    </section>

    <div class="album py-5 bg-light">
      <div class="container">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <div class="col" v-for="(item, idx) in state.items" :key="idx">
            <Card :item="item"/>
          </div>
        </div>
      </div>
    </div>

  </main>

</template>
<script>
import axios from "axios";
import Card from "@/components/Card.vue";
import {reactive} from "vue";

export default {
  name: 'Home',
  components: {
    Card

  },


  setup() {
    const state = reactive({
      items: []
    })


    axios.get("/api/items").then(({data}) => {
      state.items = data;
    })

    return {state}

  },
}

</script>