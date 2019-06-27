package com.gildedrose

class ItemFactory {
    companion object {
        fun createItem(itemType: ItemType, item: Item): GildedRoseItem = when (itemType) {
            ItemType.BRIE -> object: GildedRoseItem {
                override val item: Item = item
                override fun update() {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

            }
            ItemType.PASS -> TODO()
            ItemType.SULFURAS -> TODO()
        }
    }
}