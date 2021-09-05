package me.trespo.witherpoop.commands;

import me.trespo.witherpoop.WitherPoop;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class WitherPoopCommand implements CommandExecutor {



    public WitherPoopCommand(WitherPoop plugin) {
        plugin.getCommand("poop").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)){
            sender.sendMessage("Only Players may execute this command");
            return true;
        }

        Player player = (Player) sender;

        if (player.hasPermission("poop.use")) {
            Location location = player.getLocation();
            World world = location.getWorld();
            Entity wither = world.spawnEntity(location, EntityType.WITHER);
            wither.setCustomName("Turd");

            return true;
        }
        return false;



    }

}
