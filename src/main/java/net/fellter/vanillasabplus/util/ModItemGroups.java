package net.fellter.vanillasabplus.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fellter.vanillasabplus.VanillaSABPlus;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VSABP_BOAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaSABPlus.MOD_ID, "vsabp_boat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vsabp_boat"))
                    .icon(() -> new ItemStack(ModItems.CRIMSON_BOAT)).entries(((displayContext, entries) -> {

                        entries.add(ModItems.CRIMSON_BOAT);
                        entries.add(ModItems.CRIMSON_CHEST_BOAT);
                        
                        entries.add(ModItems.WARPED_BOAT);
                        entries.add(ModItems.WARPED_CHEST_BOAT);
                        
                        entries.add(ModItems.STONE_BOAT);
                        entries.add(ModItems.STONE_CHEST_BOAT);

                        entries.add(ModItems.COBBLESTONE_BOAT);
                        entries.add(ModItems.COBBLESTONE_CHEST_BOAT);

                        entries.add(ModItems.MOSSY_COBBLESTONE_BOAT);
                        entries.add(ModItems.MOSSY_COBBLESTONE_CHEST_BOAT);

                        entries.add(ModItems.SMOOTH_STONE_BOAT);
                        entries.add(ModItems.SMOOTH_STONE_CHEST_BOAT);

                        entries.add(ModItems.STONE_BRICKS_BOAT);
                        entries.add(ModItems.STONE_BRICKS_CHEST_BOAT);

                        entries.add(ModItems.CRACKED_STONE_BRICKS_BOAT);
                        entries.add(ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT);

                        entries.add(ModItems.MOSSY_STONE_BRICKS_BOAT);
                        entries.add(ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT);

                        entries.add(ModItems.GRANITE_BOAT);
                        entries.add(ModItems.GRANITE_CHEST_BOAT);

            })).build());

    public static final ItemGroup VSABP_SIGN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaSABPlus.MOD_ID, "vsabp_sign"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vsabp_sign"))
                    .icon(() -> new ItemStack(ModItems.STONE_SIGN)).entries(((displayContext, entries) -> {

                        entries.add(ModItems.STONE_SIGN);
                        entries.add(ModItems.HANGING_STONE_SIGN);

                        entries.add(ModItems.COBBLESTONE_SIGN);
                        entries.add(ModItems.COBBLESTONE_HANGING_SIGN);

                        entries.add(ModItems.MOSSY_COBBLESTONE_SIGN);
                        entries.add(ModItems.MOSSY_COBBLESTONE_HANGING_SIGN);

                        entries.add(ModItems.SMOOTH_STONE_SIGN);
                        entries.add(ModItems.SMOOTH_STONE_HANGING_SIGN);

                        entries.add(ModItems.STONE_BRICKS_SIGN);
                        entries.add(ModItems.STONE_BRICKS_HANGING_SIGN);

                        entries.add(ModItems.CRACKED_STONE_BRICKS_SIGN);
                        entries.add(ModItems.CRACKED_STONE_BRICKS_HANGING_SIGN);

                        entries.add(ModItems.MOSSY_STONE_BRICKS_SIGN);
                        entries.add(ModItems.MOSSY_STONE_BRICKS_HANGING_SIGN);

                        entries.add(ModItems.GRANITE_SIGN);
                        entries.add(ModItems.GRANITE_HANGING_SIGN);

            })).build());

    public static void registerItemGroups() {
        VanillaSABPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaSABPlus.MOD_ID);
    }
}
