package com.gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items) {
            updateItem(item)
        }
    }

    private fun updateItem(item: Item) {
        if (item.name == "Aged Brie") {
            increaseItemQuality(item)
            decreaseItemSellIn(item)

            if (item.sellIn < 0) {
                increaseItemQuality(item)
            }
        } else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
            if (item.quality < 50) {
                item.quality++
                if (item.sellIn < 11) {
                    increaseItemQuality(item)
                }

                if (item.sellIn < 6) {
                    increaseItemQuality(item)
                }
            }
            decreaseItemSellIn(item)

            if (item.sellIn < 0) {
                item.quality = 0
            }

        } else if (item.name != "Sulfuras, Hand of Ragnaros") {
            decreaseItemQuality(item)
            decreaseItemSellIn(item)

            if (item.sellIn < 0) {
                decreaseItemQuality(item)
            }
        }
    }

    private fun decreaseItemSellIn(item: Item) {
        item.sellIn--
    }

    private fun decreaseItemQuality(item: Item) {
        if (item.quality > 0) item.quality--
    }

    private fun increaseItemQuality(item: Item) {
        if (item.quality < 50) item.quality++
    }
}
