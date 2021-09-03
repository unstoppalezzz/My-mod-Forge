package net.unstoppalezzz.mobs.object.Items;


import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class VanishItem extends Item {

    public VanishItem(Properties properties) {
        super(properties);
    }

    @Override
    public Item asItem() {
        return super.asItem();
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        if (!player.abilities.allowFlying) {
            player.abilities.allowFlying = true;
            player.setInvisible(true);

        } else {

            player.setInvisible(false);
            player.abilities.allowFlying = false;

        }

        return super.onItemRightClick(world, player, hand);
    }
}