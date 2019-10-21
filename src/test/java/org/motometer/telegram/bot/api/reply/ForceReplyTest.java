package org.motometer.telegram.bot.api.reply;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.api.AbstractJsonTest;

import static org.assertj.core.api.Assertions.assertThat;

class ForceReplyTest extends AbstractJsonTest {

    @Test
    void forceReply() {
        var forceReply = ImmutableForceReply.of(true, null);

        var result = gson.toJson(forceReply);

        assertThat(result).isEqualTo("{\"force_reply\":true}");
    }
}