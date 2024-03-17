
package net.rebelspark.more_ores_rebelspark.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_ores_rebelspark.MoreOres;
import net.rebelspark.more_ores_rebelspark.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreOres.MOD_ID);

    public static final RegistryObject<BlockEntityType<RefineryBlockEntity>> REFINING_BE =
            BLOCK_ENTITIES.register("refining_be", () ->
                    BlockEntityType.Builder.of(RefineryBlockEntity::new,
                            ModBlocks.REFINERY.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

