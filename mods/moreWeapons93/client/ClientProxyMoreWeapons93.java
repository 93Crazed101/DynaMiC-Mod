package mods.moreWeapons93.client;

import mods.moreWeapons93.common.CommonProxyMoreWeapons93;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyMoreWeapons93 extends CommonProxyMoreWeapons93 {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}