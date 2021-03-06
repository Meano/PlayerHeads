/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package net.meano.playerheads.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

/**
 * @author meiskam
 */

public class MobDropHeadEvent extends LivingEntityDropHeadEvent {
	public MobDropHeadEvent(LivingEntity mob, ItemStack drop) {
		super(mob, drop);
	}
}
