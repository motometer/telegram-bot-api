package org.motometer.telegram.bot.api;

import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.message.Message;

/**
 * @see <a href="https://core.telegram.org/bots/api#update">Update</a>
 */
public interface Update {

    long id();

    @Nullable
    Message message();

    @Nullable
    Message editedMessage();

    @Nullable
    Message channelPost();

    @Nullable
    Message editedChannelPost();
}
