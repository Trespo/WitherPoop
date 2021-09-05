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

    private WitherPoop plugin;

    public WitherPoopCommand(WitherPoop plugin) {
        this.plugin = plugin;
        plugin.getCommand("poop").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;



        if (!(sender instanceof Player)){
            sender.sendMessage("Only Players may execute this command");
            return true;
        }


        if (p.hasPermission("poop.use")) {
            Location l = p.getLocation();
            World w = l.getWorld();
            Entity wither = w.spawnEntity(l, EntityType.WITHER);
            wither.setCustomName("Turd");

            return true;
        }
        else {
            p.sendMessage("You do not have permission to enter this command");
        }
        return false;



    }

}
