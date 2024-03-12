package net.rebelspark.more_ores_rebelspark.datagen;

import net.minecraft.tags.ItemTags;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rebelspark.more_ores_rebelspark.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TITANIUM_HELMET.get(),
        ModItems.TITANIUM_CHESTPLATE.get(),
        ModItems.TITANIUM_LEGGINGS.get(),
        ModItems.TITANIUM_BOOTS.get(),
        ModItems.COPPER_HELMET.get(),
        ModItems.COPPER_CHESTPLATE.get(),
        ModItems.COPPER_LEGGINGS.get(),
        ModItems.COPPER_BOOTS.get()
        );

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.CASTLEMANIA_MUSIC_DISC.get(),
                ModItems.ARIA_MATH_MUSIC_DISC.get()


                );

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.CASTLEMANIA_MUSIC_DISC.get(),
                ModItems.ARIA_MATH_MUSIC_DISC.get()

                );
    }
}