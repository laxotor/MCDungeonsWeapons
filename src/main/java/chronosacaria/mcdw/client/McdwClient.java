package chronosacaria.mcdw.client;

//import chronosacaria.mcdw.client.renderer.entity.SpearEntityRenderer;
import chronosacaria.mcdw.bases.McdwBow;
//import chronosacaria.mcdw.entity.McdwEntities;
import chronosacaria.mcdw.network.S2CEntitySpawnPacket;
import chronosacaria.mcdw.weapons.Bows;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class McdwClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //registerEntityRenderers();
        registerClientboundPackets();


        /*private static void registerEntityRenderers(){
        EntityRendererRegistry.INSTANCE.register(McdwEntities.SPEAR_SPEAR,
        (dispatcher, context) -> new SpearEntityRenderer(dispatcher));
        }*/

        registerBowPredicates(Bows.BOW_BONEBOW);
        //registerBowPredicates(Bows.BOW_TWIN_BOW);
        registerBowPredicates(Bows.BOW_HAUNTED_BOW);

        registerBowPredicates(Bows.BOW_LONGBOW);
        registerBowPredicates(Bows.BOW_RED_SNAKE);
        registerBowPredicates(Bows.BOW_GUARDIAN_BOW);

        registerBowPredicates(Bows.BOW_SHORTBOW);
        registerBowPredicates(Bows.BOW_MECHANICAL_SHORTBOW);
        registerBowPredicates(Bows.BOW_PURPLE_STORM);
        registerBowPredicates(Bows.BOW_LOVE_SPELL_BOW);

        registerBowPredicates(Bows.BOW_TRICKBOW);
        registerBowPredicates(Bows.BOW_GREEN_MENACE);
        registerBowPredicates(Bows.BOW_PINK_SCOUNDREL);

        registerBowPredicates(Bows.BOW_POWER_BOW);
        registerBowPredicates(Bows.BOW_ELITE_POWER_BOW);
        registerBowPredicates(Bows.BOW_SABREWING);

        registerBowPredicates(Bows.BOW_HUNTING_BOW);
        registerBowPredicates(Bows.BOW_MASTERS_BOW);
        registerBowPredicates(Bows.BOW_HUNTERS_PROMISE);
        registerBowPredicates(Bows.BOW_ANCIENT_BOW);

        registerBowPredicates(Bows.BOW_SOUL_BOW);
        registerBowPredicates(Bows.BOW_NOCTURNAL_BOW);
        registerBowPredicates(Bows.BOW_LOST_SOULS);

        //registerBowPredicates(Bows.BOW_WIND_BOW);
        //registerBowPredicates(Bows.BOW_ECHO_OF_THE_VALLEY);

        //registerBowPredicates(Bows.BOW_SNOW_BOW);
        //registerBowPredicates(Bows.BOW_WINTERS_TOUCH);
    }
    public static void registerBowPredicates(McdwBow bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"),(itemStack, clientWorld,
                                                                                   livingEntity) -> {
            if (livingEntity == null) {
                return 0.0F;
            } else {
                return livingEntity.getActiveItem() != itemStack ? 0.0F :
                        (float)(itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / bow.getMaxDrawTime(itemStack);
            }
        });

        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (itemStack, clientWorld,
                                                                                       livingEntity) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ?
                    1.0F : 0.0F;
        });
    }

    private static void registerClientboundPackets() {
        ClientSidePacketRegistry.INSTANCE.register(S2CEntitySpawnPacket.ID, S2CEntitySpawnPacket::onPacket);
    }


}
