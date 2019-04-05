package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        //работа с одним словом
//        String messageSent = event.getMessage().getContentRaw();

        //проверяем несколько слов, первое должно быть "Hello"
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();

        if (messageSent[0].equalsIgnoreCase("hello")) {

            //проверка, кто автор ивента (чтобы не возникал цикл)
            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("Hi, " + name + ".").queue();
            }
        }
    }
}
