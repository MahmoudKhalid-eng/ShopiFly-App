package com.example.shopifly

class DataResource {

    fun allLaptops():List<ItemModel>{
        return listOf(
            ItemModel(R.drawable.lap1,R.string.lap1,R.string.lap1price),
            ItemModel(R.drawable.lap2,R.string.lap2,R.string.lap2price),
            ItemModel(R.drawable.lap3,R.string.lap3,R.string.lap3price),
            ItemModel(R.drawable.lap4,R.string.lap4,R.string.lap4price),
            ItemModel(R.drawable.lap5,R.string.lap5,R.string.lap5price)
        )
    }
    fun allMobiles():List<ItemModel>{
        return listOf(
            ItemModel(R.drawable.mob1,R.string.mob1,R.string.mob1price),
            ItemModel(R.drawable.mob2,R.string.mob2,R.string.mob2price),
            ItemModel(R.drawable.mob3,R.string.mob3,R.string.mob3price),
            ItemModel(R.drawable.mob4,R.string.mob4,R.string.mob4price),
            ItemModel(R.drawable.mob5,R.string.mob5,R.string.mob5price)
        )
    }

    fun allCams():List<ItemModel>{
        return listOf(
            ItemModel(R.drawable.cam1,R.string.cam1,R.string.cam1price),
            ItemModel(R.drawable.cam2,R.string.cam2,R.string.cam2price),
            ItemModel(R.drawable.cam3,R.string.cam3,R.string.cam3price),
            ItemModel(R.drawable.cam4,R.string.cam4,R.string.cam4price),
            ItemModel(R.drawable.cam5,R.string.cam5,R.string.cam5price)
        )
    }
}