package com.crashlytics.android.core;

import android.content.Context;
import java.io.File;
import java.util.Set;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

class LogFileManager {
    private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    private static final String LOGFILE_EXT = ".temp";
    private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 65536;
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    private static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        public void closeLogFile() {
        }

        public void deleteLogFile() {
        }

        public ByteString getLogAsByteString() {
            return null;
        }

        public byte[] getLogAsBytes() {
            return null;
        }

        public void writeToLog(long j, String str) {
        }
    }

    LogFileManager(Context context2, DirectoryProvider directoryProvider2) {
        this(context2, directoryProvider2, null);
    }

    private String getSessionIdForFile(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(LOGFILE_EXT);
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    private File getWorkingFileForSession(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(LOGFILE_PREFIX);
        sb.append(str);
        sb.append(LOGFILE_EXT);
        return new File(this.directoryProvider.getLogFileDir(), sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    /* access modifiers changed from: 0000 */
    public void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public ByteString getByteStringForLog() {
        return this.currentLog.getLogAsByteString();
    }

    /* access modifiers changed from: 0000 */
    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    /* access modifiers changed from: 0000 */
    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null) {
            if (!C14248i.m61819a(this.context, COLLECT_CUSTOM_LOGS, true)) {
                C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                setLogFile(getWorkingFileForSession(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    /* access modifiers changed from: 0000 */
    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    LogFileManager(Context context2, DirectoryProvider directoryProvider2, String str) {
        this.context = context2;
        this.directoryProvider = directoryProvider2;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }
}
