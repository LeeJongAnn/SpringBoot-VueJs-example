<script>
export default {
  name: "Card",
  props: {
    item: Object
  }
}
</script>

<template>
  <div class="col">
  <div class="col-md-4">
    <div class="card mb-4 shadow-sm">
      <img :src="item.imgPath"/>
      <div class="card-body">
        <p class="card-text">{{item.name}}</p>
        <div class="d-flex justify-content-between align-items-center">
          <button class="btn btn-primary">구입하기</button>
          </div>
          <small class="text-muted">{{item.price}}</small>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>