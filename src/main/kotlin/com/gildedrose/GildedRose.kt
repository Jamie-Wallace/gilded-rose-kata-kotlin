package com.gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items) {
            updateItem(item)
        }
    }

    private fun updateItem(item: Item) {
        if (item.name != "Aged Brie") {
            if (item.name != "Aged Brie" && item.name != "Backstage passes to a TAFKAL80ETC concert") {
                if (item.quality > 0) {
                    if (item.name != "Sulfuras, Hand of Ragnaros") {
                        item.quality = item.quality - 1
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1

                    if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1
                            }
                        }
                    }
                }
            }
            if (item.name != "Sulfuras, Hand of Ragnaros") {
                item.sellIn = item.sellIn - 1
            }
            if (item.sellIn < 0) {
                if (item.name != "Aged Brie") {
                    if (item.name != "Backstage passes to a TAFKAL80ETC concert") {
                        if (item.quality > 0) {
                            if (item.name != "Sulfuras, Hand of Ragnaros") {
                                item.quality = item.quality - 1
                            }
                        }
                    } else {
                        item.quality = 0
                    }
                } else {

                }
            }
        } else {
            if (item.name != "Aged Brie" && item.name != "Backstage passes to a TAFKAL80ETC concert") {

            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1

                    if (item.name == "Backstage passes to a TAFKAL80ETC concert") {

                    }
                }
            }
            if (item.name != "Sulfuras, Hand of Ragnaros") {
                item.sellIn = item.sellIn - 1
            }
            if (item.sellIn < 0) {
                if (item.name != "Aged Brie") {

                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1
                    }
                }
            }
        }
    }

}
