package net.unstoppalezzz.mobs.object.Items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SpeedResetItem extends Item {
    public SpeedResetItem(Properties properties) {
        super(properties);
    }


    @Override
    public Item asItem() {
        return super.asItem();
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!playerIn.abilities.allowFlying) {
            playerIn.abilities.allowFlying = true;
            playerIn.abilities.setWalkSpeed(1);

        }


        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}






