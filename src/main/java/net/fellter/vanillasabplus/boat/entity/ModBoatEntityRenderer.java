package net.fellter.vanillasabplus.boat.entity;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fellter.vanillasabplus.boat.client.ModBoatClient;
import net.fellter.vanillasabplus.boat.registry.ModBoatTypeRegistry;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;

import java.util.Map;

@Environment(EnvType.CLIENT)
public class ModBoatEntityRenderer extends BoatEntityRenderer {
    private final Map<ModBoatType, Pair<Identifier, CompositeEntityModel<BoatEntity>>> texturesAndModels;

    public ModBoatEntityRenderer(EntityRendererFactory.Context context, boolean chest) {
        super(context, chest);

        this.texturesAndModels = ModBoatTypeRegistry.INSTANCE.getEntrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getValue, entry -> {
            boolean raft = entry.getValue().isRaft();
            String prefix = raft ? (chest ? "chest_raft/" : "raft/") : (chest ? "chest_boat/" : "boat/");

            Identifier id = entry.getKey().getValue();
            Identifier textureId = id.withPath(path -> "textures/entity/" + prefix + path + ".png");

            EntityModelLayer layer = ModBoatClient.getLayer(id, raft, chest);
            CompositeEntityModel<BoatEntity> model = createModel(context.getPart(layer), raft, chest);

            return new Pair<>(textureId, model);
        }));
    }

    @Override
    public Identifier getTexture(BoatEntity entity) {
        if (entity instanceof ModBoatHolder) {
            ModBoatType boat = ((ModBoatHolder) entity).getModBoat();
            return this.texturesAndModels.get(boat).getFirst();
        }
        return super.getTexture(entity);
    }

    public Pair<Identifier, CompositeEntityModel<BoatEntity>> getTextureAndModel(ModBoatHolder holder) {
        return this.texturesAndModels.get(holder.getModBoat());
    }

    private CompositeEntityModel<BoatEntity> createModel(ModelPart part, boolean raft, boolean chest) {
        if (raft) {
            return chest ? new ChestRaftEntityModel(part) : new RaftEntityModel(part);
        } else {
            return chest ? new ChestBoatEntityModel(part) : new BoatEntityModel(part);
        }
    }
}
