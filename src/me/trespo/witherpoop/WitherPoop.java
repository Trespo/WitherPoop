package me.trespo.witherpoop;

import me.trespo.witherpoop.commands.WitherPoopCommand;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class WitherPoop extends JavaPlugin {

    @Override
    public void onEnable() {
        new WitherPoopCommand(this);
    }
}
