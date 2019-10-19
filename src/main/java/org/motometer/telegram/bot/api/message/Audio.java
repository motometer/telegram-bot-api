package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#audio">Audio</a>
 */
public interface Audio extends Attachment {

    long duration();

    @Nullable
    String performer();

    @Nullable
    String title();
}
