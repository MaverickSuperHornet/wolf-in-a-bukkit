package org.gplbukkit.command.defaults;

import java.util.Arrays;

import org.gplbukkit.Bukkit;
import org.gplbukkit.ChatColor;
import org.gplbukkit.command.CommandSender;
import org.gplbukkit.plugin.Plugin;

public class PluginsCommand extends BukkitCommand {
    public PluginsCommand(String name) {
        super(name);
        this.description = "Gets a list of plugins running on the server";
        this.usageMessage = "/plugins";
        this.setPermission("bukkit.command.plugins");
        this.setAliases(Arrays.asList("pl"));
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        if (!testPermission(sender)) return true;

        sender.sendMessage("Plugins " + getPluginList());
        return true;
    }

    private String getPluginList() {
        StringBuilder pluginList = new StringBuilder();
        Plugin[] plugins = Bukkit.getPluginManager().getPlugins();

        for (Plugin plugin : plugins) {
            if (pluginList.length() > 0) {
                pluginList.append(ChatColor.WHITE);
                pluginList.append(", ");
            }

            pluginList.append(plugin.isEnabled() ? ChatColor.GREEN : ChatColor.RED);
            pluginList.append(plugin.getDescription().getName());
        }

        return "(" + plugins.length + "): " + pluginList.toString();
    }
}
