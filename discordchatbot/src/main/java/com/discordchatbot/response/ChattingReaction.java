package com.discordchatbot.response;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChattingReaction extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }

        String str = event.getMessage().getContentDisplay();

        if (str != null && !str.isEmpty())
        {
            event.getMessage().reply("명언").queue();
        }
    }

}
