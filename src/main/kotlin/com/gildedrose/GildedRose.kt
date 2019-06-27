package com.gildedrose

class GildedRose(var items: Array<Item>) {
    private val minQualityValue = 0
    private val maximumQualityValue = 50

    fun updateQuality() {
        for (item in items) {
            updateItem(item)
        }
    }

    private fun updateItem(item: Item) {
        when {
            item.name == "Aged Brie" -> {
                item.increaseQuality()
                decreaseSellIn(item)
                increaseQualityIfOutOfDate(item)
            }
            item.name == "Backstage passes to a TAFKAL80ETC concert" -> {
                item.increaseQuality()
                increaseQualityIfApproachingSellBy(item)
                increaseQualityIfAlmostOutOfDate(item)
                decreaseSellIn(item)
                zeroQualityIfOutOfDate(item)
            }
            item.name == "Sulfuras, Hand of Ragnaros" -> {

            }
            else -> {
                decreaseQuality(item)
                decreaseSellIn(item)
                decreaseQualityIfOutOfDate(item)
            }
        }
    }

    private fun zeroQualityIfOutOfDate(item: Item) {
        if (item.sellIn < 0) {
            item.quality = 0
        }
    }

    private fun increaseQualityIfAlmostOutOfDate(item: Item) {
        if (item.sellIn < 6) {
            item.increaseQuality()
        }
    }

    private fun increaseQualityIfApproachingSellBy(item: Item) {
        if (item.sellIn < 11) {
            item.increaseQuality()
        }
    }

    private fun increaseQualityIfOutOfDate(item: Item) {
        if (item.sellIn < 0) {
            item.increaseQuality()
        }
    }

    private fun decreaseQualityIfOutOfDate(item: Item) {
        if (item.sellIn < 0) {
            decreaseQuality(item)
        }
    }

    private fun decreaseSellIn(item: Item) {
        item.sellIn = item.sellIn - 1
    }

    private fun decreaseQuality(item: Item) {
        if (itemNotAtMinQuality(item)) item.quality--
    }


    private fun Item.increaseQuality() {
        if (itemNotAtMaxQuality(this)) quality++
    }

    private fun itemNotAtMinQuality(item: Item): Boolean = item.quality > minQualityValue

    private fun itemNotAtMaxQuality(item: Item): Boolean = item.quality < maximumQualityValue
}


