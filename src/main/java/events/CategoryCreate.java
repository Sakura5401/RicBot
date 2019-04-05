package events;

import net.dv8tion.jda.core.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CategoryCreate extends ListenerAdapter {

    public void onCategoryCreate(CategoryCreateEvent event) {
        event.getGuild().getDefaultChannel().sendMessage("Somebody created an category!").queue();
    }
}
