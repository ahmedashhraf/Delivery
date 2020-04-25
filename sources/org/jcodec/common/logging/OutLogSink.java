package org.jcodec.common.logging;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.jcodec.common.logging.Logger.Level;
import org.jcodec.common.logging.Logger.LogSink;
import org.jcodec.common.logging.Logger.Message;
import org.jcodec.common.tools.MainUtils;
import org.jcodec.common.tools.MainUtils.ANSIColor;

public class OutLogSink implements LogSink {
    public static SimpleFormat DEFAULT_FORMAT;
    private MessageFormat fmt;
    private PrintStream out;

    public interface MessageFormat {
        String formatMessage(Message message);
    }

    public static class SimpleFormat implements MessageFormat {
        private static Map<Level, ANSIColor> colorMap = new C15543a();
        private String fmt;

        /* renamed from: org.jcodec.common.logging.OutLogSink$SimpleFormat$a */
        static class C15543a extends HashMap<Level, ANSIColor> {
            C15543a() {
                put(Level.DEBUG, ANSIColor.BROWN);
                put(Level.INFO, ANSIColor.GREEN);
                put(Level.WARN, ANSIColor.MAGENTA);
                put(Level.ERROR, ANSIColor.RED);
            }
        }

        public SimpleFormat(String str) {
            this.fmt = str;
        }

        public String formatMessage(Message message) {
            return this.fmt.replace("#level", String.valueOf(message.getLevel())).replace("#color_code", String.valueOf(((ANSIColor) colorMap.get(message.getLevel())).ordinal() + 30)).replace("#class", message.getClassName()).replace("#method", message.getMethodName()).replace("#file", message.getFileName()).replace("#line", String.valueOf(message.getLineNumber())).replace("#message", message.getMessage());
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(MainUtils.colorString("[#level]", "#color_code"));
        sb.append(MainUtils.bold("\t#class.#method (#file:#line):"));
        sb.append("\t#message");
        DEFAULT_FORMAT = new SimpleFormat(sb.toString());
    }

    public OutLogSink() {
        this(System.out, DEFAULT_FORMAT);
    }

    public void postMessage(Message message) {
        this.out.println(this.fmt.formatMessage(message));
    }

    public OutLogSink(MessageFormat messageFormat) {
        this(System.out, messageFormat);
    }

    public OutLogSink(PrintStream printStream, MessageFormat messageFormat) {
        this.out = printStream;
        this.fmt = messageFormat;
    }
}
