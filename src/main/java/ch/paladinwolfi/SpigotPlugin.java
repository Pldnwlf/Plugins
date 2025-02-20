package ch.paladinwolfi;

import ch.paladinwolfi.commands.JumpCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MyMinecraftPlugin wurde aktiviert!");
        System.out.println("Mein Plugin wurde aktiviert!");

        getCommand("jump").setExecutor((CommandExecutor) new JumpCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Mein Plugin wurde gestoppt!");
        getLogger().info("MyMinecraftPlugin wurde deaktiviert!");
    }
}
