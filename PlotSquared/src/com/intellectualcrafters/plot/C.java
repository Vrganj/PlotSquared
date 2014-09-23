/*
 * Copyright (c) IntellectualCrafters - 2014.
 * You are not allowed to distribute and/or monetize any of our intellectual property.
 * IntellectualCrafters is not affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 *
 * >> File = C.java
 * >> Generated by: Citymonstret at 2014-08-09 01:43
 */

package com.intellectualcrafters.plot;

import org.bukkit.ChatColor;

/**
 * Captions class.
 * @author Citymonstret
 *
 */
public enum C {
    /*
        Schematic Stuff
     */
    SCHEMATIC_MISSING_ARG("&cYou need to specify an argument. Possible values: &6test {name}"),
    SCHEMATIC_INVALID("&cThat is not a valid schematic. Reason: &c%s"),
    SCHEMATIC_VALID("&cThat's a valid schematic"),
    SCHEMATIC_PASTE_FAILED("&cFailed to paste schematic"),
    SCHEMATIC_PASTE_SUCCESS("&cSchematic pasted successfully"),
    /*
        Title Stuff
     */
    TITLE_ENTERED_PLOT("You entered plot %s"),
    TITLE_ENTERED_PLOT_COLOR("GOLD"),
    TITLE_ENTERED_PLOT_SUB("Owned by %s"),
    TITLE_ENTERED_PLOT_SUB_COLOR("RED"),
    TITLE_LEFT_PLOT("You entered plot %s"),
    TITLE_LEFT_PLOT_COLOR("GOLD"),
    TITLE_LEFT_PLOT_SUB("Owned by %s"),
    TITLE_LEFT_PLOT_SUB_COLOR("RED"),
    /*
        Core Stuff
     */
	PREFIX("&c[&6&lPlot&c] "),
    ENABLED("&6Plots are now enabled"),
    EXAMPLE_MESSAGE("&cThis is an example message &k!!!"),
    /*
        Reload
     */
    RELOADED_CONFIGS("&6The translation files has been reloaded"),
    RELOAD_FAILED("&cFailed to reload the translations file"),
     /*
        BarAPI
     */
    BOSSBAR_CLEARING("&cClearing plot: &6%id%"),
    /*
        Alias
     */
    ALIAS_SET_TO("&cPlot alias set to &6%alias%"),
    MISSING_ALIAS("&cYou need to specify the alias"),
    ALIAS_IS_TAKEN("&cThat alias is already taken"),
    /*
        Position
     */
    MISSING_POSITION("&cYou need to specify a position. Possible values: &6default&c, &6center"),
    POSITION_SET("&cPlot home position set"),
    INVALID_POSITION("&cThat is not a valid position value"),
    /*
        Time
     */
	TIME_FORMAT("&6%hours%, %min%, %sec%"),
    /*
        Permission
     */
	NO_PERMISSION("&cYou don't have the permissions required to use this command."),
    NO_PLOT_PERMS("&cYou don't have the permissions to do that in this plot"),
    CANT_CLAIM_MORE_PLOTS("&cYou can't claim more plots."),
    YOU_BE_DENIED("&cYou are not allowed to enter this plot"),
    /*
        Commands
     */
    NOT_VALID_SUBCOMMAND("&cThat is not a valid subcommand."),
    NO_COMMANDS("&cI'm sorry, but you're not permitted to use any subcommands."),
    SUBCOMMAND_SET_OPTIONS_HEADER("&cPossible Values: "),
    /*
        No {plot}
     */
    NOT_IN_PLOT("&cYou're not in a plot"),
    NOT_IN_PLOT_WORLD("&cYou're not in a plot world"),
    NOT_VALID_WORLD("&cThat is not a valid world (case sensitive)"),
    NOT_VALID_PLOT_WORLD("&cThat is not a valid plot world (case sensitive)"),
    NO_PLOTS("&cYou don't have any plots"),
    /*
        Block List
     */
    NOT_VALID_BLOCK_LIST_HEADER("&cThat's not a valid block. Valid blocks are:\\n"),
    BLOCK_LIST_ITEM(" &6%mat%&c,"),
    /*
        Biome
     */
    NEED_BIOME("&cYou've got to specify a biome"),
    BIOME_SET_TO("&cPlot biome set to &c"),
    /*
        Teleport / Entry
     */
    TELEPORTED_TO_PLOT("&6You have been teleported"),
    /*
        Set Block
     */
	SET_BLOCK_ACTION_FINISHED("&6The last setblock action is now finished."),
    /*
        Debug
     */
    DEUBG_HEADER("&6Debug Information\\n"),
    DEBUG_SECTION("&c>> &6&l%val%"),
    DEBUG_LINE("&c>> &6%var%&c:&6 %val%\\n"),
    /*
        Invalid
     */
    NOT_VALID_DATA("&cThat's not a valid data id."),
    NOT_VALID_BLOCK("&cThat's not a valid block."),
    NOT_VALID_NUMBER("&cThat's not a valid number"),
    NOT_VALID_PLOT_ID("&cThat's not a valid plot id."),
    NOT_YOUR_PLOT("&cThat is not your plot."),
    NO_SUCH_PLOT("&cThere is no such plot"),
    PLAYER_HAS_NOT_BEEN_ON("&cThat player hasn't been in the plotworld"),
    FOUND_NO_PLOTS("&cFound no plots with your search query"),
    /*
        Camera
     */
    CAMERA_STARTED("&cYou have entered camera mode for plot &6%s"),
    CAMERA_STOPPED("&cYou are no longer in camera mode"),
    /*
        Need
     */
    NEED_PLOT_NUMBER("&cYou've got to specify a plot number or alias"),
	NEED_BLOCK("&cYou've got to specify a block"),
    NEED_PLOT_ID("&cYou've got to specify a plot id."),
    NEED_USER("&cYou need to specify a username"),
    /*
        Info
     */
    PLOT_INFO_UNCLAIMED("&cPlot &6%s&c is not yet claimed"),
	PLOT_INFO("plot ID: &6%id%&c, plot Alias: &6%alias%&c, plot Owner: &6%owner%&c, plot Biome: &6%biome%&c, plot Time: &6%time%&c, plot Weather: &6%weather%&c, plot Helpers:&6%helpers%&c, plot Denied:&6%denied%&c, plot flags: &6%flags%"),
    PLOT_USER_LIST(" &6%user%&c,"),
    /*
        Generating
     */
	GENERATING_FLOOR("&6Started generating floor from your settings. It will take %time%"),
	GENERATING_WALL("&6Started generating wall from your settings"),
    GENERATING_WALL_FILLING("&cStarted generating wall filling from your settings."),
    /*
        Clearing
     */
	CLEARING_PLOT("&cClearing plot."),
	CLEARING_DONE("&6Done, took &a%time%&6 ms!"),
	CLEARING_DONE_PACKETS("&6(&a%time% &6ms for packets)"),
    /*
        Claiming
     */
    PLOT_IS_CLAIMED("&cThis plot is already claimed"),
    CLAIMED("&6You successfully claimed the plot"),
    /*
        List
     */
    PLOT_LIST_HEADER("&6List of %word% plots"),
    PLOT_LIST_ITEM("&c>> &6%id% &c- &6%owner%"),
    PLOT_LIST_FOOTER("&c>> &6%word% a total of &c%num% &6claimed %plot%."),
    /*
        Left
     */
	LEFT_PLOT("&cYou left a plot"),
    /*
        Wait
     */
	WAIT_FOR_TIMER("&cA setblock timer is bound to either the current plot or you. Please wait for it to finish"),
    /*
        Chat
     */
    PLOT_CHAT_FORMAT("&c[&6Plot Chat&c][&6%plot_id%&c] &6%sender%&c: &6%msg%"),
    /*
        Denied
     */
    DENIED_REMOVED("&cYou successfully undenied the player from this plot"),
    DENIED_ADDED("&cYou successfully denied the player from this plot"),
    DENIED_NEED_ARGUMENT("&cArguments are missing. &6/plot denied add {name} &cor &6/plot helpers remove {name}"),
    WAS_NOT_DENIED("&cThat player was not denied on this plot"),
    /*
        Rain
     */
    NEED_ON_OFF("&cYou need to specify a value. Possible values: &6on&c, &6off"),
    SETTING_UPDATED("&cYou successfully updated the setting"),
    /*
     * Flag
     */
    NEED_KEY("&cYou need to specify a flag"),
    NOT_VALID_FLAG("&cThat is not a valid flag"),
    NOT_VALID_VALUE("&cFlag values must be alphanumerical"),
    FLAG_NOT_IN_PLOT("&cThe plot does not have that flag"),
    FLAG_NOT_REMOVED("&cThe flag could not be removed"),
    FLAG_NOT_ADDED("&cThe flag could not be added"),
    FLAG_REMOVED("&6Successfully removed flag"),
    FLAG_ADDED("&6Successfully added flag"),
    /*
        Helper
     */
    HELPER_ADDED("&6You successfully added a helper to the plot"),
    HELPER_REMOVED("&6You successfully removed a helper from the plot"),
    HELPER_NEED_ARGUMENT("&cArguments are missing. &6/plot helpers add {name} &cor &6/plot helpers remove {name}"),
    WAS_NOT_ADDED("&cThat player was not added as a helper on this plot"),
    /*
        Set Owner
     */
    SET_OWNER("&6You successfully set the plot owner"),
    /*
       Signs
    */
    OWNER_SIGN_LINE_1("&cID: &6%id%"),
    OWNER_SIGN_LINE_2("&cOwner:"),
    OWNER_SIGN_LINE_3("&6%plr%"),
    OWNER_SIGN_LINE_4("&2Claimed"),
    /*
        Help
     */
    HELP_CATEGORY("&6Current Category&c: &l%category%"),
    HELP_INFO("&6You need to specify a help category"),
    HELP_INFO_ITEM("&6/plots help %category% &c- &6%category_desc%"),
    HELP_PAGE("&c>> &6%usage% &c[&6%alias%&c] &c- &6%desc%"),
    HELP_HEADER("&6Help for Plots"),
    /*
        Custom
     */
    CUSTOM_STRING("-")
	;
	/**
	 * Default
	 */
	private String d;
	/**
	 * Translated
	 */
	private String s;

    /**
     * Constructor for custom strings.
     */
    @SuppressWarnings("unused")
    C() {
        /*
        use setCustomString();
         */
    }

	/**
	 * Constructor
	 * @param d default
	 */
	C(String d) {
		this.d = d;
		this.s = PlotMain.translations.getString(this.toString());
		if (this.s==null) {
		    this.s = "";
		}
	}
	
	/**
	 * Get the default string
	 * @return default
	 */
    @SuppressWarnings("unused")
	public String d() {
		return this.d;
	}
	
	/**
	 * Get translated if exists
	 * @return translated if exists else default
	 */
	public String s() {
		if(this.s.length() < 1)
			return this.d.replace("\\n", "\n");
		return this.s.replace("\\n", "\n");
	}

    /**
     *
     * @return translated and color decoded
     */
    public String translated() {
       return ChatColor.translateAlternateColorCodes('&', this.s());
    }


}