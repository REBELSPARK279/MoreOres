package net.rebelspark.more_ores_rebelspark.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2,700,7f,2.5f,13,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.TITANIUM_PIECE.get())),
            new ResourceLocation(MoreOres.MOD_ID, "titanium"), List.of(Tiers.IRON), List.of());
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,175,3.0f,0.5f,4,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(MoreOres.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(3,1650,9f,5f,19,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.REFINED_RUBY.get())),
            new ResourceLocation(MoreOres.MOD_ID, "ruby"), List.of(Tiers.DIAMOND), List.of());
}
//List.of is the lesser tier. in titanium List.of(Tiers.IRON)  means iron is lesser then titanium
//level 0 -> wood gold 1 -> stone 2 -> iron 3 -> diamond 4 -> netherite