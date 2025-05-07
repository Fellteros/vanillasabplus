package net.fellter.vanillasabplus.boat;

import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

import net.fellter.vanillasabplus.VanillaSABPlusClient;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModHandledScreen extends HandledScreen<ScreenHandler> implements NamedScreenHandlerFactory {
	private final Text title;
	protected static final Identifier TEXTURE = Identifier.ofVanilla("textures/gui/container/generic_54.png");

	public ModHandledScreen(ScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
		this.title = title;
		this.backgroundHeight = 168;
		this.playerInventoryTitleY = this.backgroundHeight - 94;
	}

	@Override
	protected void drawForeground(DrawContext context, int mouseX, int mouseY) {
		MatrixStack matrices = context.getMatrices();
		float max = this.backgroundWidth - 18;
		float length = textRenderer.getWidth(title);

		if (length > max) {
			matrices.push();
			matrices.translate(this.titleX, this.titleY + ((getTextRenderer().fontHeight - (getTextRenderer().fontHeight * (max / length))) / 2), 0.0f);
			matrices.scale(max / length, max / length, 1);
			context.drawText(this.textRenderer, this.title, 0, 0, 4210752, false);
			matrices.pop();
			context.drawText(textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, 4210752, false);
		} else {
			context.drawText(this.textRenderer, this.title, this.titleX, this.titleY, 4210752, false);
			context.drawText(this.textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, 4210752, false);
		}
	}

	@Override
	protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
		int i = (this.width - this.backgroundWidth) / 2;
		int j = (this.height - this.backgroundHeight) / 2;
		context.drawTexture(RenderLayer::getGuiTextured, TEXTURE, i, j, 0.0F, 0.0F, this.backgroundWidth, 3 * 18 + 17, 256, 256);
		context.drawTexture(RenderLayer::getGuiTextured, TEXTURE, i, j + 3 * 18 + 17, 0.0F, 126.0F, this.backgroundWidth, 96, 256, 256);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float delta) {
		super.render(context, mouseX, mouseY, delta);
		this.drawMouseoverTooltip(context, mouseX, mouseY);
	}

	@Override
	public Text getDisplayName() {
		return this.title;
	}

	@Override
	public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
		return VanillaSABPlusClient.createModGeneric9x3(syncId, playerInventory);
	}
}
