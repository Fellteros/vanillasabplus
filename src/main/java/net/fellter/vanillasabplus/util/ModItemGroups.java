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
                    .icon(() -> new ItemStack(ModItems.VSABP_BOAT)).entries(((displayContext, entries) -> {

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

                        entries.add(ModItems.POLISHED_GRANITE_BOAT);
                        entries.add(ModItems.POLISHED_GRANITE_CHEST_BOAT);

                        entries.add(ModItems.DIORITE_BOAT);
                        entries.add(ModItems.DIORITE_CHEST_BOAT);

                        entries.add(ModItems.POLISHED_DIORITE_BOAT);
                        entries.add(ModItems.POLISHED_DIORITE_CHEST_BOAT);

                        entries.add(ModItems.ANDESITE_BOAT);
                        entries.add(ModItems.ANDESITE_CHEST_BOAT);

                        entries.add(ModItems.POLISHED_ANDESITE_BOAT);
                        entries.add(ModItems.POLISHED_ANDESITE_CHEST_BOAT);

                        entries.add(ModItems.DEEPSLATE_BOAT);
                        entries.add(ModItems.DEEPSLATE_CHEST_BOAT);

                        entries.add(ModItems.COBBLED_DEEPSLATE_BOAT);
                        entries.add(ModItems.COBBLED_DEEPSLATE_CHEST_BOAT);

                        entries.add(ModItems.CHISELED_DEEPSLATE_BOAT);
                        entries.add(ModItems.CHISELED_DEEPSLATE_CHEST_BOAT);

                        entries.add(ModItems.POLISHED_DEEPSLATE_BOAT);
                        entries.add(ModItems.POLISHED_DEEPSLATE_CHEST_BOAT);

                        entries.add(ModItems.DEEPSLATE_BRICKS_BOAT);
                        entries.add(ModItems.DEEPSLATE_BRICKS_CHEST_BOAT);

                        entries.add(ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT);
                        entries.add(ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT);

            })).build());

    public static final ItemGroup VSABP_SIGN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaSABPlus.MOD_ID, "vsabp_sign"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vsabp_sign"))
                    .icon(() -> new ItemStack(ModItems.VSABP_SIGN)).entries(((displayContext, entries) -> {

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

                        entries.add(ModItems.POLISHED_GRANITE_SIGN);
                        entries.add(ModItems.POLISHED_GRANITE_HANGING_SIGN);

                        entries.add(ModItems.DIORITE_SIGN);
                        entries.add(ModItems.DIORITE_HANGING_SIGN);

                        entries.add(ModItems.POLISHED_DIORITE_SIGN);
                        entries.add(ModItems.POLISHED_DIORITE_HANGING_SIGN);

                        entries.add(ModItems.ANDESITE_SIGN);
                        entries.add(ModItems.ANDESITE_HANGING_SIGN);

                        entries.add(ModItems.POLISHED_ANDESITE_SIGN);
                        entries.add(ModItems.POLISHED_ANDESITE_HANGING_SIGN);

                        entries.add(ModItems.DEEPSLATE_SIGN);
                        entries.add(ModItems.DEEPSLATE_HANGING_SIGN);

                        entries.add(ModItems.COBBLED_DEEPSLATE_SIGN);
                        entries.add(ModItems.COBBLED_DEEPSLATE_HANGING_SIGN);

                        entries.add(ModItems.CHISELED_DEEPSLATE_SIGN);
                        entries.add(ModItems.CHISELED_DEEPSLATE_HANGING_SIGN);

                        entries.add(ModItems.POLISHED_DEEPSLATE_SIGN);
                        entries.add(ModItems.POLISHED_DEEPSLATE_HANGING_SIGN);

                        entries.add(ModItems.DEEPSLATE_BRICKS_SIGN);
                        entries.add(ModItems.DEEPSLATE_BRICKS_HANGING_SIGN);

                        entries.add(ModItems.CRACKED_DEEPSLATE_BRICKS_SIGN);
                        entries.add(ModItems.CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN);

            })).build());

    public static void registerItemGroups() {
        VanillaSABPlus.LOGGER.info("Registering Mod Item Groups for " + VanillaSABPlus.MOD_ID);
    }
}
