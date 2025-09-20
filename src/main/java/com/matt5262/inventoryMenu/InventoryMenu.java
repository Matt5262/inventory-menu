package com.matt5262.inventoryMenu;

import com.matt5262.inventoryMenu.commands.MenuCommand;
import com.matt5262.inventoryMenu.holders.MainMenuHolder;
import com.matt5262.inventoryMenu.listeners.MainMenuListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class InventoryMenu extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new MenuCommand(this));
        getServer().getPluginManager().registerEvents(new MainMenuListener(), this);
    }   // Registers everything

    public void openMainMenu(Player player) {
        Inventory mainMenu = Bukkit.createInventory(new MainMenuHolder(), 27, "Main Menu");
        mainMenu.setItem(9, new ItemStack(Material.SKELETON_SKULL));
        player.openInventory(mainMenu);
    }   // When openMainMenu is called then make a menu and then open it
}
