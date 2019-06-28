package com.gildedrose


class GildedRose(var items: Array<Item>) {
    fun updateQuality() {
        for (item in items) {
            updateItem(item)
        }
    }

    private fun updateItem(item: Item) {
        val gildedRoseItem = ItemFactory.createItem(item)
        gildedRoseItem.update()
    }
}


