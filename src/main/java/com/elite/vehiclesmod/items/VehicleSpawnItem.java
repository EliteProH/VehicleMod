package com.elite.vehiclesmod.items;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class VehicleSpawnItem extends Item {

    public VehicleSpawnItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();  // Replaces getLevel()
        Player player = context.getPlayer(); // Replaces getPlayer()

        if (!level.isClientSide && player != null) {
            BlockPos pos = context.getClickedPos();
            ItemStack itemStack = context.getItemInHand(); // Replaces getItemInHand()

            // TODO: Implement your vehicle spawning logic here

            itemStack.shrink(1); // Reduce item count after use
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
