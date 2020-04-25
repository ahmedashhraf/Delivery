package org.jcodec.common.logging;

import java.util.LinkedList;
import java.util.List;

public class Logger {
    private static List<LogSink> sinks;
    private static List<LogSink> stageSinks = new LinkedList();

    public enum Level {
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    public interface LogSink {
        void postMessage(Message message);
    }

    public static class Message {
        private String className;
        private String fileName;
        private Level level;
        private int lineNumber;
        private String message;
        private String methodName;

        public Message(Level level2, String str, String str2, String str3, int i, String str4) {
            this.level = level2;
            this.fileName = str;
            this.className = str2;
            this.methodName = str3;
            this.message = str3;
            this.lineNumber = i;
            this.message = str4;
        }

        public String getClassName() {
            return this.className;
        }

        public String getFileName() {
            return this.fileName;
        }

        public Level getLevel() {
            return this.level;
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public String getMessage() {
            return this.message;
        }

        public String getMethodName() {
            return this.methodName;
        }
    }

    public static void addSink(LogSink logSink) {
        List<LogSink> list = stageSinks;
        if (list != null) {
            list.add(logSink);
            return;
        }
        throw new IllegalStateException("Logger already started");
    }

    public static void debug(String str) {
        message(Level.DEBUG, str);
    }

    public static void error(String str) {
        message(Level.ERROR, str);
    }

    public static void info(String str) {
        message(Level.INFO, str);
    }

    private static void message(Level level, String str) {
        if (sinks == null) {
            synchronized (Logger.class) {
                if (sinks == null) {
                    sinks = stageSinks;
                    stageSinks = null;
                    if (sinks.isEmpty()) {
                        sinks.add(new OutLogSink());
                    }
                }
            }
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        Message message = new Message(level, stackTraceElement.getFileName(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), str);
        for (LogSink postMessage : sinks) {
            postMessage.postMessage(message);
        }
    }

    public static void warn(String str) {
        message(Level.WARN, str);
    }
}
