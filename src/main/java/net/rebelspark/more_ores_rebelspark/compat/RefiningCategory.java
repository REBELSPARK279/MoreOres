package net.rebelspark.more_ores_rebelspark.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;
import net.rebelspark.more_ores_rebelspark.recipe.RefineryRecipe;

public class RefiningCategory implements IRecipeCategory<RefineryRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(MoreOres.MOD_ID, "refining");
    public static final ResourceLocation TEXTURE = new ResourceLocation(MoreOres.MOD_ID, "textures/gui/refinery_gui.png");

    public static final RecipeType<RefineryRecipe> REFINERY_TYPE =
            new RecipeType<>(UID, RefineryRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public RefiningCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0,176,85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.REFINERY.get()));
    }

    @Override
    public RecipeType<RefineryRecipe> getRecipeType() {
        return REFINERY_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.more_ores_rebelspark.refinery");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RefineryRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));


    }
}
