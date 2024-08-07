package net.fellter.vanillasabplus.boat;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.text.Text;

import java.util.Objects;

public class ModScreen extends HandledScreen<ModScreenHandler> implements ScreenHandlerProvider<ModScreenHandler> {


    public ModScreen(ModScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        super.render(context, mouseX, mouseY, delta);
    }

    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {
        MatrixStack matrices = context.getMatrices();
        int length = Objects.requireNonNull(title.getLiteralString()).length();
        VanillaSABPlus.LOGGER.info(String.valueOf(length));
        if (length > 5) {
            matrices.push();
            matrices.translate(this.titleX, this.titleY, 0.0f);
            matrices.scale(0.5f, 0.5f, 1);
            context.drawText(this.textRenderer, this.title, 0, 0, 4210752, false);
            matrices.pop();
            context.drawText(textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, 4210752, false);
        } else {
            super.drawForeground(context, mouseX, mouseY);
        }
    }


}
