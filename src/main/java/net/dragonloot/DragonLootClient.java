package net.dragonloot;

import net.dragonloot.network.SyncPacket;
import net.fabricmc.api.ClientModInitializer;

public class DragonLootClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SyncPacket.init();
    }

}
