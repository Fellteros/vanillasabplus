package net.fellter.vanillasabplus.boat.util;

import net.minecraft.item.Item;

public class ModBoatTypeImpl implements ModBoatType {
    private final boolean raft;
    private final Item item;
    private final Item chestItem;
    private final Item planks;

    public ModBoatTypeImpl(boolean raft, Item item, Item chestItem, Item planks) {
        this.raft = raft;
        this.item = item;
        this.chestItem = chestItem;
        this.planks = planks;
    }

    @Override
    public boolean isRaft() {
        return raft;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public Item getChestItem() {
        return chestItem;
    }

    @Override
    public Item getPlanks() {
        return planks;
    }


}
