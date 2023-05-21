package lol.pyr.znpcsplus.interaction.message;

import lol.pyr.znpcsplus.interaction.InteractionAction;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public class MessageAction extends InteractionAction {
    private final BukkitAudiences adventure;
    private final Component message;

    public MessageAction(BukkitAudiences adventure, Component message, long delay) {
        super(delay);
        this.adventure = adventure;
        this.message = message;
    }

    @Override
    public void run(Player player) {
        adventure.player(player).sendMessage(message);
    }

    public Component getMessage() {
        return message;
    }
}