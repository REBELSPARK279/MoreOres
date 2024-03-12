package net.rebelspark.more_ores_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;
import net.rebelspark.more_ores_rebelspark.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(ModBlocks.TITANIUM_ORE.get(),
            ModBlocks.DEEPSLATE_TITANIUM_ORE.get());

    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get(),
            ModBlocks.DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> STEEL_SMELTABLES = List.of(Items.IRON_INGOT);
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

                                                                    //TITANIUM

        oreBlasting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_PIECE.get(), 0.25f, 80, "titanium");
        oreSmelting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_PIECE.get(), 0.35f, 180, "titanium");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_PIECE.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" I ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_PICKAXE.get())
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_AXE.get())
                .pattern("## ")
                .pattern("#I ")
                .pattern(" I ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_SHOVEL.get())
                .pattern(" # ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HOE.get())
                .pattern("## ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', ModItems.TITANIUM_PIECE.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_PIECE.get()), has(ModItems.TITANIUM_PIECE.get()))
                .save(pWriter);

                                            //COPPER

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" I ")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_PICKAXE.get())
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_AXE.get())
                .pattern("## ")
                .pattern("#I ")
                .pattern(" I ")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_SHOVEL.get())
                .pattern(" # ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HOE.get())
                .pattern("## ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_BOOTS.get())
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .define('#', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);

                                        //RUBY
       // oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.ROUGH_RUBY_SHARD.get(), 0.25f, 80, "ruby");
       // oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.ROUGH_RUBY_SHARD.get(), 0.35f, 180, "ruby");

                                //STEEL

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_ROD.get())
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('I', Items.IRON_BARS)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);


        oreSmelting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 3.5f, 900, "steel");
        oreBlasting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 7.0f, 600, "steel");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MoreOres.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
