package net.rebelspark.more_ores_rebelspark.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.more_ores_rebelspark.MoreOres;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreOres.MOD_ID);

    public static final RegistryObject<SoundEvent> CASTLEMANIA = registerSoundEvents("castlemania");
    public static final RegistryObject<SoundEvent> ARIA_MATH = registerSoundEvents("aria_math");
    public static final RegistryObject<SoundEvent> HEADBUG = registerSoundEvents("headbug");
    public static final RegistryObject<SoundEvent> CASTLEMANIA_II = registerSoundEvents("castlemania_ii");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MoreOres.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
