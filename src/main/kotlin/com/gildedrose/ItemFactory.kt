package com.gildedrose

class ItemFactory {
    companion object {
        fun createItem(item: Item): GildedRoseItem = when (item.name) {
            "Aged Brie" -> AgedBrie(item)
            "Backstage passes to a TAFKAL80ETC concert" -> BackstagePass(item)
            "Sulfuras, Hand of Ragnaros" -> Sulfuras(item)
            else -> GeneralItem(item)
        }
    }
}