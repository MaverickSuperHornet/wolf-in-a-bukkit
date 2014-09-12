package org.gplbukkit.command.defaults;

import java.util.List;

import org.apache.commons.lang.Validate;
import org.gplbukkit.Bukkit;
import org.gplbukkit.World;
import org.gplbukkit.command.Command;
import org.gplbukkit.command.CommandSender;

import com.google.common.collect.ImmutableList;

public class SaveCommand extends VanillaCommand {
    public SaveCommand() {
        super("save-all");
        this.description = "Saves the server to disk";
        this.usageMessage = "/save-all";
        this.setPermission("bukkit.command.save.perform");
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        if (!testPermission(sender)) return true;

        Command.broadcastCommandMessage(sender, "Forcing save..");

        Bukkit.savePlayers();

        for (World world : Bukkit.getWorlds()) {
            world.save();
        }

        Command.broadcastCommandMessage(sender, "Save complete.");

        return true;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
        Validate.notNull(sender, "Sender cannot be null");
        Validate.notNull(args, "Arguments cannot be null");
        Validate.notNull(alias, "Alias cannot be null");

        return ImmutableList.of();
    }
}
