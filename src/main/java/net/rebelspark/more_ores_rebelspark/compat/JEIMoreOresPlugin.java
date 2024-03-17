package net.rebelspark.more_ores_rebelspark.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.recipe.RefineryRecipe;
import net.rebelspark.more_ores_rebelspark.screen.RefineryScreen;

import java.util.List;

@JeiPlugin
public class JEIMoreOresPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MoreOres.MOD_ID, "jei_plugin");
    }

   @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new RefiningCategory(registration.getJeiHelpers().getGuiHelper()));
        IModPlugin.super.registerCategories(registration);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<RefineryRecipe> refineryRecipes = recipeManager.getAllRecipesFor(RefineryRecipe.Type.INSTANCE);
        registration.addRecipes(RefiningCategory.REFINERY_TYPE, refineryRecipes);

        IModPlugin.super.registerRecipes(registration);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RefineryScreen.class, 90,30,20,30,
                RefiningCategory.REFINERY_TYPE);

        IModPlugin.super.registerGuiHandlers(registration);
    }
}
