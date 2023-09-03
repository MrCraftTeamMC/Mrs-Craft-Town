package cn.mrcraftteammc.mrscrafttown.item.items.misc;

import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

@Deprecated
public class NeverGonnaGiveYouUpMusicDisc extends ArchitecturyRecordItem {
    public NeverGonnaGiveYouUpMusicDisc(int analogOutput, RegistrySupplier<SoundEvent> sound, Properties properties, int lengthInSeconds) {
        super(analogOutput, sound, properties, lengthInSeconds);
    }
    /*
    public NeverGonnaGiveYouUpMusicDisc(int i, SoundEvent soundEvent, Properties properties, int j) {
        super(i, soundEvent, properties, j);
    }
     */
}
