package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
public interface ReplyKeyboardMarkup extends ReplyMarkup {

    List<List<KeyboardButton>> keyboard();

    @Nullable
    Boolean resizeKeyboard();

    @Nullable
    Boolean oneTimeKeyboard();

    @Nullable
    Boolean selective();
}
