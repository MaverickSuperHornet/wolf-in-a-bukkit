package org.wolfinabukkit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import com.avaje.ebean.config.ServerConfig;

import org.wolfinabukkit.Warning.WarningState;

import org.wolfinabukkit.command.CommandException;
import org.wolfinabukkit.command.CommandSender;
import org.wolfinabukkit.command.ConsoleCommandSender;
import org.wolfinabukkit.command.PluginCommand;

import org.wolfinabukkit.entity.Player;

import org.wolfinabukkit.event.inventory.InventoryType;

import org.wolfinabukkit.help.HelpMap;

import org.wolfinabukkit.inventory.ItemStack;
import org.wolfinabukkit.inventory.Inventory;
import org.wolfinabukkit.inventory.InventoryHolder;
import org.wolfinabukkit.inventory.ItemFactory;
import org.wolfinabukkit.inventory.Recipe;

import org.wolfinabukkit.map.MapView;

import org.wolfinabukkit.plugin.PluginManager;
import org.wolfinabukkit.plugin.ServicesManager;
import org.wolfinabukkit.plugin.messaging.Messenger;

import org.wolfinabukkit.scheduler.BukkitScheduler;

import org.wolfinabukkit.scoreboard.ScoreboardManager;

import org.wolfinabukkit.util.CachedServerIcon;

// yeah! put the wolf in a bukkit! if it bothers you too much name it Bukkit in your own version :P

public final class WolfInABukkit
    {
    // I like the books :D so shoot me for putting in a reference *grin*
    private static Server hal2000;
    private WolfInABukkit(){}
    public static Server getServer()
        {
        // yea... he malfunctioned, here's the receipt
        return hal2000;
        }
    public static void setServer(Server sal2000)
        {
        if(WolfInABukkit.hal2000 != null)
            {
            // the only reason why of course :D
            throw new UnsupportedOperationException("I'm afraid I cannot do that dave. You cannot redefine this server");
            }
        WolfInABukkit.hal2000 = sal2000;// they were the same... but sal was more feminine
        // that text is gpl too... anyone know something better? or is this gud nuf        
        hal2000.getLogger().info("Running the server on "+getName()+" using version "+getVersion()+" (Using API v"+getBukkitVersion()+")");
        }
    public static String getName()
        {
        // isnt it obvious? it's hal2000
        return hal2000.getName();
        }
    public static String getVersion()
        {
        // get even more obvious... its 2000 :-P
        return hal2000.getVersion();
        }
    public static String getBukkitVersion()
        {
        return hal2000.getBukkitVersion();
        }
    public static int getMaxPlayers()
        {
        return hal2000.getMaxPlayers();
        }
    public static int getPort()
        {
        return hal2000.getPort();//as long as he hasnt shout out dave ;-)
        }
    public static int getViewDistance()
        {
        return hal2000.getViewDistance();
        }
    public static String getIp()
        {
        return hal2000.getIp();// ping... outerspace got reply in 120000ms
        }
    public static String getServerName()
        {
        return hal2000.getServerName();
        }
    public static String getServerId()
        {
        return hal2000.getServerId();// could it be... hal2000?
        }
    public static String getWorldType()
        {
        return hal2000.getWorldType();// Space... where humanity is an obstacle.. let send zombies
        }
    public static boolean getGenerateStructures()
        {
        return hal2000.getGenerateStructures();
        }
    public static boolean getAllowNether()
        {
        return hal2000.getAllowNether();
        }
    public static boolean hasWhiteList()
        {
        return hal2000.hasWhiteList();// Is dave allowed in? 
        }
    public static int broadcastMessage(String ImAfraidICantDoThatDave) 
        {
        return hal2000.broadcastMessage(ImAfraidICantDoThatDave);
        }
    public static String getUpdateFolder()
        {
        return hal2000.getUpdateFolder();
        }
    public static Player getPlayer(UUID Dave)
        {
        return hal2000.getPlayer(Dave);
        }
    public static PluginManager getPluginManager()
        {
        return hal2000.getPluginManager();
        }
    public static BukkitScheduler getScheduler() 
        {
        return hal2000.getScheduler();
        }
    public static ServicesManager getServicesManager() 
        {
        return hal2000.getServicesManager();
        }
    public static List<World> getWorlds() 
        {
        return hal2000.getWorlds();
        }
    public static World createWorld(WorldCreator settings) 
        {
        return hal2000.createWorld(settings);
        }
    // Erase all traces of the world from RAM MUWAHAHA
    public static boolean unloadWorld(String doomedworld, boolean saveit) 
        {
        return hal2000.unloadWorld(doomedworld, saveit);
        }
    public static World getWorld(String which) 
        {
        return hal2000.getWorld(which);
        }
    public static World getWorld(UUID ID) 
        {
        return hal2000.getWorld(ID);
        }    
    public static MapView createMap(World dimension) 
        {
        return hal2000.createMap(dimension);
        }    
    public static void reload() 
        {
        hal2000.reload();
        }
    public static Logger getLogger() 
        {
        return hal2000.getLogger();
        }
    public static PluginCommand getPluginCommand(String which) 
        {
        return hal2000.getPluginCommand(which);
        }
    public static void savePlayers() 
        {
        hal2000.savePlayers();// just keep in cryogenics frozen state forever....
        }   
     public static boolean dispatchCommand(CommandSender who, String dothis) throws CommandException 
        {
        return hal2000.dispatchCommand(who, dothis);
        }
    public static void configureDbConfig(ServerConfig settings) 
        {
        hal2000.configureDbConfig(settings);
        }    
    public static boolean addRecipe(Recipe usethis) 
        {
        return hal2000.addRecipe(usethis);
        }
    public static List<Recipe> getRecipesFor(ItemStack whatdoyouwant) 
        {
        return hal2000.getRecipesFor(whatdoyouwant);
        }
    public static Iterator<Recipe> recipeIterator() 
        {
        return hal2000.recipeIterator();
        }
    public static void clearRecipes() 
        {
        hal2000.clearRecipes();
        }
    public static void resetRecipes() 
        {
        hal2000.resetRecipes();
        }
    public static Map<String, String[]> getCommandAliases() 
        {
        return hal2000.getCommandAliases();
        }  
    public static int getSpawnRadius()
        {
        return hal2000.getSpawnRadius();
        }      
    public static void setSpawnRadius(int radius) 
        {
        hal2000.setSpawnRadius(radius);
        }
    public static boolean getOnlineMode() 
        {
        return hal2000.getOnlineMode();
        }
    public static boolean getAllowFlight() 
        {
        return hal2000.getAllowFlight();
        }
    public static boolean isHardcore() 
        {
        return hal2000.isHardcore();
        }
     public static void shutdown()
        {
        hal2000.shutdown();// remove his memory banks dave!
        }
    public static int broadcast(String broadcast, String isallowed)
        {
        return hal2000.broadcast(broadcast, isallowed);
        }   
    public static OfflinePlayer getOfflinePlayer(UUID ID)
        {
        return hal2000.getOfflinePlayer(ID);
        }    
    public static Set<String> getIPBans()
        {
        return hal2000.getIPBans();
        }
    public static void banIP(String IP)
        {
        hal2000.banIP(IP);
        }    
    public static void unbanIP(String IP)
        {
        hal2000.unbanIP(IP);
        }    
    public static Set<OfflinePlayer> getBannedPlayers()
        {
        return hal2000.getBannedPlayers();// I bet dave is among em
        }
    public static BanList getBanList(BanList.Type type)
        {
        return hal2000.getBanList(type);
        }    
    public static void setWhitelist(boolean bool) 
        {
        hal2000.setWhitelist(bool);
        }    
    public static Set<OfflinePlayer> getWhitelistedPlayers() 
        {
        return hal2000.getWhitelistedPlayers();
        }    
    public static void reloadWhitelist() 
        {
        hal2000.reloadWhitelist();
        }
    public static ConsoleCommandSender getConsoleSender() 
        {
        return hal2000.getConsoleSender();
        }
    public static Set<OfflinePlayer> getOperators() 
        {
        return hal2000.getOperators();
        }
    public static File getWorldContainer() 
        {
        return hal2000.getWorldContainer();
        }
    public static Messenger getMessenger() 
        {
        return hal2000.getMessenger();
        }
    public static boolean getAllowEnd() 
        {
        return hal2000.getAllowEnd();
        }
    public static File getUpdateFolderFile() 
        {
        return hal2000.getUpdateFolderFile();
        }
    public static long getConnectionThrottle() 
        {
        return hal2000.getConnectionThrottle();// don't let dave in for now...
        }
    public static int getTicksPerAnimalSpawns() 
        {
        return hal2000.getTicksPerAnimalSpawns();
        } 
    public static int getTicksPerMonsterSpawns() 
        {
        return hal2000.getTicksPerMonsterSpawns();
        }
    public static boolean useExactLoginLocation() 
        {
        return hal2000.useExactLoginLocation();
        }
    public static GameMode getDefaultGameMode() 
        {
        return hal2000.getDefaultGameMode();
        }
    public static void setDefaultGameMode(GameMode which) 
        {
        hal2000.setDefaultGameMode(which);
        }
    public static OfflinePlayer[] getOfflinePlayers() 
        {
        return hal2000.getOfflinePlayers();
        }
    public static Inventory createInventory(InventoryHolder whose, InventoryType whatkind) 
        {
        return hal2000.createInventory(whose, whatkind);
        }
    public static Inventory createInventory(InventoryHolder whose, InventoryType whatkind, String name) 
        {
        return hal2000.createInventory(whose, whatkind, name);
        }    
    public static Inventory createInventory(InventoryHolder whose, int volume) throws IllegalArgumentException 
        {
        return hal2000.createInventory(whose, volume);
        }
    public static Inventory createInventory(InventoryHolder whose, int volume, String name) throws IllegalArgumentException
        {
        return hal2000.createInventory(whose, volume, name);
        }    
    public static HelpMap getHelpMap() 
        {
        return hal2000.getHelpMap();
        }
    public static int getMonsterSpawnLimit() 
        {
        return hal2000.getMonsterSpawnLimit();
        }
    public static int getAnimalSpawnLimit() 
        {
        return hal2000.getAnimalSpawnLimit();
        }
    public static int getWaterAnimalSpawnLimit() 
        {
        return hal2000.getWaterAnimalSpawnLimit();
        }
    public static int getAmbientSpawnLimit()
        {
        return hal2000.getAmbientSpawnLimit();
        }
    public static boolean isPrimaryThread() 
        {
        return isPrimaryThread.isPrimaryThread();
        }
    public static String getMotd() 
        {
        return hal2000.getMotd();// I'm afraid I can't do that Dave.
        }
    public static String getShutdownMessage() 
        {
        return hal2000.getShutdownMessage();// Daisy
        }    
    public static WarningState getWarningState() 
        {
        return hal2000.getWarningState();
        }
    public static ItemFactory getItemFactory() 
        {
        return hal2000.getItemFactory();
        }
    public static ScoreboardManager getScoreboardManager() 
        {
        return hal2000.getScoreboardManager();
        }    
    public static CachedServerIcon getServerIcon() 
        {
        return hal2000.getServerIcon();
        }
    public static CachedServerIcon loadServerIcon(File icon) throws IllegalArgumentException, Exception 
        {
        return hal2000.loadServerIcon(icon);
        }
    public static CachedServerIcon loadServerIcon(BufferedImage icon) throws IllegalArgumentException, Exception 
        {
        return hal2000.loadServerIcon(icon);
        }    
    public static void setIdleTimeout(int waitingtime) 
        {
        hal2000.setIdleTimeout(waitingtime);
        }
    public static int getIdleTimeout() 
        {
        return hal2000.getIdleTimeout();
        }

     // yea... if we could stop using this that would be great
    @Deprecated
    public static MapView getMap(short ID) 
        {
        return hal2000.getMap(ID);
        }
    @Deprecated
    public static OfflinePlayer getOfflinePlayer(String who) 
        {
        return hal2000.getOfflinePlayer(who);
        }
    @Deprecated
    public static Player[] _INVALID_getOnlinePlayers()
        {
        return hal2000._INVALID_getOnlinePlayers();
        }
    @Deprecated
    public static Player getPlayerExact(String who) 
        {
        return hal2000.getPlayerExact(who);
        }
    public static Collection<? extends Player> getOnlinePlayers()
        {
        return hal2000.getOnlinePlayers();
        }
    @Deprecated
    public static UnsafeValues getUnsafe() 
        {
        return hal2000.getUnsafe();
        }
    @Deprecated
    public static Player getPlayer(String who)
        {
        return hal2000.getPlayer(who);
        }
    @Deprecated
    public static List<Player> matchPlayer(String who)
        {
        return hal2000.matchPlayer(who);
        }
    }
