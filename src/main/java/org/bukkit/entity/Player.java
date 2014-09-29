package org.bukkit.entity;

import java.net.InetSocketAddress;

import org.bukkit.Achievement;

/* 27/09/2014 TheKiwi5000
 * Recreating Player.java from documentation at http://jd.bukkit.org/dev/apidocs/org/bukkit/entity/Player.html
 * The following classes need to be done:
 *   - Achievement
 *   - Statistic
 *   - Location
 *   - Scoreboard
 *   - WeatherType
 *   - EntityType
 *   - Material
 *   - Effect
 *   - Instrument
 *   - Note
 *   - MapView
 */



//TODO Imports to be done when classes below are done!!
public interface Player extends HumanEntity, Conversable, CommandSender, OfflinePlayer, PluginMessageRecipient{
    
    public void awardAchievement(Achievement ach);
    
    public void canSee(Player who);
    
    public void chat(String message);
    
    public void decrementStatistic(Statistic stat);
    
    public void decrementStatistic(Statistic stat, EntityType et);
    
    public void decrementStatistic(Statistic stat, EntityType et, int amount);
    
    public void decrementStatistic(Statistic stat, int amount);
    
    public void decrementStatistic(Statistic stat, Material mat);
    
    public void decrementStatistic(Statistic stat, Material mat, int amount);
    
    public InetSocketAddress getAddress();
    
    public boolean getAllowFlight();
    
    public Location getBedSpawnLocation();
    
    public Location getCommpassTarget();
    
    public String getDisplayName();
    
    public float getExhaustion();
    
    public float getFlySpeed();
    
    public int getFoodLevel();
    
    public double getHealthScale();
    
    public int getLevel();
    
    public String getPlayerListName();
    
    public long getPlayerTime();
    
    public long getPlayerTimeOffset();
    
    public WeatherType getPlayerWeather();
    
    public float getStaturation();
    
    public Scoreboard getScoreboard();
    
    public int getStatistic(Statistic stat);
    
    public int getStatistic(Statistic stat, EntityType et);
    
    public int getStatistic(Statistic stat, Material mat);
    
    public int getTotalExperience();
    
    public float getWalkSpeed();
    
    public void giveExp(int amt);
    
    public void giveExpLevels(int amt);
    
    public boolean hasAchievement(Achievement ach);
    
    public void hidePlayer(Player player);
    
    public void incrementStatistic(Statistic stat);
    
    public void incrementStatistic(Statistic stat, EntityType et);
    
    public void incrementStatistic(Statistic stat, EntityType et, int amt);
    
    public void incrementStatistic(Statistic stat, int amt);
    
    public void incrementStatistic(Statistic stat, Material mat);
    
    public void incrementStatistic(Statistic stat, Material mat, int amt);
    
    public boolean isFlying();
    
    public boolean isHealthScaled();
    
    @Deprecated
    public boolean isOnGround();
    
    public boolean isPlayerTimeRelative();
    
    public boolean isSleepingIgnored();
    
    public boolean isSneaking();
    
    public boolean isSprinting();
    
    public void kickPlayer(String msg);
    
    public void loadData();
    
    public boolean preformCommand(String cmd);
    
    @Deprecated
    public void playEffect(Location location, Effect effect, int metadata);
    
    public <T> void playEffect(Location location, Effect effect, T metadata);
    @Deprecated
    public void playNote(Location location, byte instrument, byte note);
    
    public void playNote(Location location, Instrument instrument, Note note);
    
    public void playSound(Location location, Sound sound, float loudness, float pitch);
    
    @Deprecated
    public void playSound(Location location, String sound, float loudness, float pitch);
    
    public void removeAchievement(Achievement ach);
    
    public void resetPlayerTime();
    
    public void resetPlayerWeather();
    
    public void saveData();
    
    @Deprecated
    public void sendBlockChange(Location loc, int mat, byte meta);
    
    @Deprecated
    public void sendBlockChange(Location loc, Material mat, byte meta);
    
    @Deprecated
    public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data);
    
    public void sendMap(MapView map);
    
    public void sendRawMessage(String rawmessage);
    
    public void sendSignChange(Location loc, String[] text);
    
    public void setAllowFlight(boolean flight);
    
    public void setBedSpawnLocation(Location where);
    
    public void setBedSpawnLocation(Location where, boolean force);
    
    public void setCompassTarget(Location where);
    
    public void setDisplayName(String newname);
    
    public void setExhaustion(float exhaustion);
    
    public void setExp(float exp);
    
    public void setFlying(boolean flying);
    
    public void setFlySpeed(float flyspeed);
    
    public void setFoodLevel(int foodlevel);
    
    public void setHealthScale(double scale);
    
    public void setHealthScaled(boolean scale);
    
    public void setLevel(int level);
    
    public void setPlayerListName(String newname);
    
    public void setPlayerTime(long time, boolean relative);
    
    public void setPlayerWeather(WeatherType type);
    
    public void serResourcePack(String packurl);
    
    public void setSaturation(float value);
    
    public void setScoreboard(Scoreboard scb);
    
    public void setSleepingIgnored(boolean ignore);
    
    public void setSneaking(boolean sneaking);
    
    public void setSprinting(boolean sprint);
    
    public void setStatistic(Statistic stat, EntityType et, int val);
    
    public void setStatistic(Statistic stat, int val);
    
    public void setStatistic(Statistic stat, Material mat, int val) ;
    
    @Deprecated
    public void setTexturepack(String url);
    
    public void setTotalExperience(int explevel);
    
    public void setWalkSpeed(float walkspeed);
    
    public void showPlayer(Player player);
    
    @Deprecated
    public void updateInventory();
}