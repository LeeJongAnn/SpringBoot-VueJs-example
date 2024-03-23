<script>
export default {
  name: "Card",
  props: {
    item: Object
  }
}
</script>

<template>
  <div class="card mb-4 shadow-sm">
    <img :src="item.imgPath"/>
    <div class="card-body">
      <p class="card-text">{{ item.name }}</p>
      <div class="d-flex justify-content-between align-items-center">
        <div class="btn-group">
          <button type="button" class="btn btn-sm btn-primary">구매하기</button>
        </div>
        <small class="text-body-secondary">{{ item.price }}</small>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>