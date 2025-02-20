package ch.paladinwolfi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JumpCommand {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.teleport(player.getLocation().add(0, 10, 0));
            return true;
            } else {
            sender.sendMessage("You must be a player to use this command!");
            return false;

        }
    }
}
