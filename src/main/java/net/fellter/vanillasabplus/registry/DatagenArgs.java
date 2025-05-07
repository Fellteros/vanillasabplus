package net.fellter.vanillasabplus.registry;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

public class DatagenArgs {
	public Block parentBlock;
	public Boolean needsSilkTouch;
	public List<TagKey<Block>> blockTags;
	public List<TagKey<Item>> itemTags;

	public DatagenArgs() {
	}

	public DatagenArgs needsSilkTouch() {
		this.needsSilkTouch = true;
		return this;
	}

	public DatagenArgs parentBlock(Block parentBlock) {
		this.parentBlock = parentBlock;
		return this;
	}

	@SafeVarargs
	public final DatagenArgs blockTags(TagKey<Block>... blockTags) {
		this.blockTags = List.of(blockTags);
		return this;
	}

	@SafeVarargs
	public final DatagenArgs itemTags(TagKey<Item>... itemTags) {
		this.itemTags = List.of(itemTags);
		return this;
	}
}
