package events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;
import java.text.DateFormat;
import java.util.Date;

public class UserLevelUp extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String messageSent = event.getMessage().getContentRaw();

        if (messageSent.equals("!time") && !event.getMember().getUser().isBot()) {
            EmbedBuilder timeMessage = new EmbedBuilder();
            timeMessage.setColor(Color.ORANGE);
            timeMessage.setTitle("Текущее время " + DateFormat.getTimeInstance(DateFormat.DEFAULT).format(new Date()));
            timeMessage.addField("Тестовое сообщение", "Оно может быть о чем угодно и без ограничений по " +
                    "длинне", true);
            timeMessage.setThumbnail("https://aifil.gifts/web/image/product.template/8937/image/300x300?unique=c2b5e34");
            event.getChannel().sendMessage(timeMessage.build()).queue();
        }
    }
}