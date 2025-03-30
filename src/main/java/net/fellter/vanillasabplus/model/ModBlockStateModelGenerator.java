package net.fellter.vanillasabplus.model;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;

public class ModBlockStateModelGenerator extends BlockStateModelGenerator {
    public ModBlockStateModelGenerator(Consumer<BlockModelDefinitionCreator> blockStateCollector, ItemModelOutput itemModelOutput, BiConsumer<Identifier, ModelSupplier> modelCollector) {
        super(blockStateCollector, itemModelOutput, modelCollector);
    }

    private static WeightedVariant varOf(Identifier id) {
       return createWeightedVariant(id);
    }

    public static void registerSign(BlockStateModelGenerator bsmg, Block particleBlock, Block signBlock, Block wallSignBlock) {
        Identifier identifier = Models.PARTICLE.upload(signBlock, TextureMap.particle(particleBlock), bsmg.modelCollector);
        bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(signBlock, varOf(identifier)));
        bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(wallSignBlock, varOf(identifier)));
        bsmg.registerItemModel(signBlock.asItem());
    }
}
