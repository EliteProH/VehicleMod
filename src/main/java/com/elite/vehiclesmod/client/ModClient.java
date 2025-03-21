package com.elite.vehiclesmod.client;

import com.elite.vehiclesmod.ModEntities;
import com.elite.vehiclesmod.ModItems;
import com.elite.vehiclesmod.VehiclesMod;
import com.elite.vehiclesmod.entities.VehicleEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import com.mojang.blaze3d.vertex.PoseStack;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod(VehiclesMod.MODID)
public class ModClient {
    // Register Creative Tab using DeferredRegister
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VehiclesMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> VEHICLE_TAB = CREATIVE_TABS.register("vehicles_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.vehiclesmod"))
                    .icon(() -> new ItemStack(ModItems.VEHICLE_SPAWN_ITEM.get())) // Fixed type error
                    .displayItems((parameters, output) -> {
                        ItemStack spawnItem = new ItemStack(ModItems.VEHICLE_SPAWN_ITEM.get());
                        if (!spawnItem.isEmpty()) { // Prevent potential null issues
                            output.accept(spawnItem);
                        }
                    })
                    .build()
    );

    public ModClient(IEventBus modEventBus) {
        modEventBus.addListener(this::onClientSetup);
        CREATIVE_TABS.register(modEventBus); // Register creative tab
    }
    

    private void onClientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.PORSCHE_911_GT3_RS.get(), VehicleRenderer::new);
    }

    public static class VehicleRenderer extends EntityRenderer<VehicleEntity> {
        public VehicleRenderer(Context context) {
            super(context);
        }

        @Override
        public ResourceLocation getTextureLocation(VehicleEntity entity) {
            return ResourceLocation.tryParse(VehiclesMod.MODID + ":textures/entity/porsche_911_gt3_rs.png");
        }

        @Override
        public void render(VehicleEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
            super.render(entity, entityYaw, partialTicks, poseStack, bufferSource, packedLight);
        }
    }
}
