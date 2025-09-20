package com.matt5262.inventoryMenu.listeners;

import com.matt5262.inventoryMenu.holders.MainMenuHolder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MainMenuListener implements Listener {

    @EventHandler
    public void onInventoryPress(InventoryClickEvent event) {
    // Runs on inventory clicks

        if (event.getWhoClicked() instanceof Player player) {
        // If the person who clicked is a player then continue script and also assign the person to a variable called player

            if (event.isRightClick()) return;
            // If right click then stop script (it will run again on new click)

            event.setCancelled(true);
            // Cancels the item move

            if (event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR) {
                return;
            }// makes sure you click on something and not an empty slot in the menu or else it would send errors

            if (event.getInventory().getHolder() instanceof MainMenuHolder) {
                // if the owner of the menu is MainMenuHolder then...

                switch (event.getCurrentItem().getType()) {

                    case SKELETON_SKULL -> {
                        player.setHealth(0);
                    }   // If the skeleton skull is clicked in the menu the player dies

                }

            }
        }

    }

}
