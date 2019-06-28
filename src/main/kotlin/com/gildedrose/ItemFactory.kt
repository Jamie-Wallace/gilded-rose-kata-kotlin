package com.gildedrose

class ItemFactory {
    companion object {
        fun createItem(itemType: ItemType, item: Item): GildedRoseItem = when (itemType) {
            ItemType.BRIE -> object: GildedRoseItem {
                override val item: Item = item
                override fun update() {
                    item.increaseQuality()
                    item.decreaseSellIn()
                    item.increaseQualityIfOutOfDate()
                }

            }
            ItemType.PASS -> TODO()
            ItemType.SULFURAS -> TODO()
        }
    }
}