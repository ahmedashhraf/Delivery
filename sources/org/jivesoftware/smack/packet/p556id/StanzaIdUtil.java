package org.jivesoftware.smack.packet.p556id;

import java.util.concurrent.atomic.AtomicLong;
import org.jivesoftware.smack.util.StringUtils;

/* renamed from: org.jivesoftware.smack.packet.id.StanzaIdUtil */
public class StanzaIdUtil {

    /* renamed from: ID */
    private static final AtomicLong f44983ID = new AtomicLong();
    private static final String PREFIX;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.randomString(5));
        sb.append("-");
        PREFIX = sb.toString();
    }

    public static String newStanzaId() {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX);
        sb.append(Long.toString(f44983ID.incrementAndGet()));
        return sb.toString();
    }
}
