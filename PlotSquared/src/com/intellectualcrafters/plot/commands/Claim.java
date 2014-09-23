/*
 * Copyright (c) IntellectualCrafters - 2014.
 * You are not allowed to distribute and/or monetize any of our intellectual property.
 * IntellectualCrafters is not affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 *
 * >> File = Claim.java
 * >> Generated by: Citymonstret at 2014-08-09 01:41
 */

package com.intellectualcrafters.plot.commands;

import com.intellectualcrafters.plot.*;
import com.intellectualcrafters.plot.events.PlayerClaimPlotEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * 
 * @author Citymonstret
 *
 */
public class Claim extends SubCommand{

	public Claim() {
		super(Command.CLAIM, "Claim the current plot you're standing on.", "claim", CommandCategory.CLAIMING);
	}
	
	@Override
	public boolean execute(Player plr, String ... args) {
		if(!PlayerFunctions.isInPlot(plr)) {
			PlayerFunctions.sendMessage(plr, C.NOT_IN_PLOT);
			return true;
		}
        if(PlayerFunctions.getPlayerPlotCount(plr.getWorld() , plr) >= PlayerFunctions.getAllowedPlots(plr)) {
            PlayerFunctions.sendMessage(plr, C.CANT_CLAIM_MORE_PLOTS);
            return true;
        }
		Plot plot = PlayerFunctions.getCurrentPlot(plr);
		if(plot.hasOwner()) {
            PlayerFunctions.sendMessage(plr, C.PLOT_IS_CLAIMED);
            return false;
        }
        claimPlot(plr, plot, false);
		return true;
	}


    public static boolean claimPlot(Player player, Plot plot, boolean teleport) {
        PlayerClaimPlotEvent event = new PlayerClaimPlotEvent(player, plot);
        Bukkit.getPluginManager().callEvent(event);
        if(!event.isCancelled()) {
            PlotHelper.createPlot(player, plot);
            PlotHelper.setSign(player, plot);
            PlayerFunctions.sendMessage(player, C.CLAIMED);
            if(teleport) {
                PlotMain.teleportPlayer(player, player.getLocation(), plot);
            }
            PlotWorld world = PlotMain.getWorldSettings(plot.getWorld());
            if(world.SCHEMATIC_ON_CLAIM) {
                SchematicHandler handler = new SchematicHandler();
                SchematicHandler.Schematic schematic = handler.getSchematic(world.SCHEMATIC_FILE);
                handler.paste(player.getLocation(), schematic, plot);
            }
        }
        return event.isCancelled();
    }
}
