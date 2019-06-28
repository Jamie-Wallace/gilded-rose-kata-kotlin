package com.gildedrose


class GildedRose(var items: Array<Item>) {
    fun updateQuality() {
        for (item in items) {
            updateItem(item)
        }
    }

    private fun updateItem(item: Item) {
        when {
            item.name == "Aged Brie" -> {
                item.increaseQuality()
                item.decreaseSellIn()
                item.increaseQualityIfOutOfDate()
            }
            item.name == "Backstage passes to a TAFKAL80ETC concert" -> {
                item.increaseQuality()
                item.increaseQualityIfApproachingSellBy()
                item.increaseQualityIfAlmostOutOfDate()
                item.decreaseSellIn()
                item.zeroQualityIfOutOfDate()
            }
            item.name == "Sulfuras, Hand of Ragnaros" -> {

            }
            else -> {
                item.decreaseQuality()
                item.decreaseSellIn()
                item.decreaseQualityIfOutOfDate()
            }
        }
    }
}


