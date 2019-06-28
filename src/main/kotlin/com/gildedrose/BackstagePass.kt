package com.gildedrose

class BackstagePass(override val item: Item) : GildedRoseItem {
    override fun update() {
        item.increaseQuality()
        item.increaseQualityIfApproachingSellBy()
        item.increaseQualityIfAlmostOutOfDate()
        item.decreaseSellIn()
        item.zeroQualityIfOutOfDate()
    }
}