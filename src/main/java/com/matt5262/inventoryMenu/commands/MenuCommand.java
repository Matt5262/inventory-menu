package com.matt5262.inventoryMenu.commands;

import com.matt5262.inventoryMenu.InventoryMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MenuCommand implements CommandExecutor {

    private final InventoryMenu plugin;

    public MenuCommand(InventoryMenu plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player player)) {
        // if the command sender is not a player do the script beneath this
            commandSender.sendMessage("Only players can use this command!");
            return true;
            // stop script and also true because then it wont send some weird ahh text
        }

        plugin.openMainMenu(player);
        // executes the openMainMenu method inside InventoryMenu and also throws in who opened it

        return true;
    }
}
