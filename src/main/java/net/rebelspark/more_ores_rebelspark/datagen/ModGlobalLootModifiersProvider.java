package net.rebelspark.more_ores_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.item.ModItems;
import net.rebelspark.more_ores_rebelspark.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, MoreOres.MOD_ID);
    }

    @Override
    protected void start() {
      //  add("learn_one", new AddItemModifier(new LootItemCondition[] {
         //       LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
          //      LootItemRandomChanceCondition.randomChance(0.279f).build()}, ModItems.TOPAZ_GEMSTONE.get()));

     //   add("learn_two", new AddItemModifier(new LootItemCondition[]{
          //      new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, ModItems.TOPAZ_GEMSTONE.get()));

        add("titanium_sword_from_blacksmiths", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_weaponsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.11f).build()}, ModItems.TITANIUM_SWORD.get()));
        add("titanium_pick_from_toolsmiths", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.11f).build()}, ModItems.TITANIUM_PICKAXE.get()));

        add("castlemania_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.09f).build()}, ModItems.CASTLEMANIA_MUSIC_DISC.get()));
        add("castlemania_from_dungeon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.085f).build()}, ModItems.CASTLEMANIA_MUSIC_DISC.get()));
        add("castlemania_from_desert_temple", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.095f).build()}, ModItems.CASTLEMANIA_MUSIC_DISC.get()));

        add("aria_math_from_dungeon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));
        add("aria_math_from_stronghold_crossing", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
                LootItemRandomChanceCondition.randomChance(0.09f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));
        add("aria_math_from_stronghold_corridor", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.07f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));
        add("aria_math_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.11f).build()}, ModItems.ARIA_MATH_MUSIC_DISC.get()));

        add("steel_ingot_from_iron_golem", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/iron_golem")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()}, ModItems.STEEL_INGOT.get()));
        add("steel_ingot_from_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.075f).build()}, ModItems.STEEL_INGOT.get()));

        add("refined_ruby_from_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()}, ModItems.ROUGH_RUBY_SHARD.get()));
        add("refined_ruby_from_mineshaft", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.016f).build()}, ModItems.REFINED_RUBY.get()));
    }
}
