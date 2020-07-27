package com.electron.endreborn.items;

import java.util.Random;

import com.electron.endreborn.EndReborn;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;

import javax.annotation.Nonnull;

public class IronHammer extends Item {
	public IronHammer(Properties builder) {
		super(builder);
	}
	@Override
    public boolean hasContainerItem(ItemStack stack) {
    	return true;
    }

	@Nonnull
	@Override
	public ItemStack getContainerItem(@Nonnull ItemStack stack)
	{
		ItemStack container = stack.copy();
		if(container.attemptDamageItem(1, new Random(), null))
			return ItemStack.EMPTY;
		else
			return container;
	}
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		  stack.damageItem(1, attacker, null);
	      return true;
	}
}