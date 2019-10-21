package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
@Value.Immutable
public interface KeyboardButton {

    @Value.Parameter
    @Gson.Named("text")
    String text();

    @Nullable
    @Value.Parameter
    @Gson.Named("request_contact")
    Boolean requestContact();

    @Nullable
    @Value.Parameter
    @Gson.Named("request_location")
    Boolean requestLocation();
}
