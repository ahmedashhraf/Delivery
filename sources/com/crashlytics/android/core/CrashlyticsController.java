package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amplitude.api.C2876e;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.LogFileManager.DirectoryProvider;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import com.instabug.library.model.State;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.json.JSONObject;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14251j.C14252a;
import p212io.fabric.sdk.android.p493p.p495b.C14251j.C14253b;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14256m;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p497d.C14299a;
import p212io.fabric.sdk.android.p493p.p498e.C14310e;
import p212io.fabric.sdk.android.p493p.p498e.C14319n;
import p212io.fabric.sdk.android.p493p.p498e.C14321p;
import p212io.fabric.sdk.android.p493p.p498e.C14322q;
import p212io.fabric.sdk.android.p493p.p498e.C14323r;
import p212io.fabric.sdk.android.p493p.p498e.C14329u;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;
import p212io.fabric.sdk.android.services.network.C14388d;

class CrashlyticsController {
    private static final int ANALYZER_VERSION = 1;
    private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    static final String FATAL_SESSION_DIR = "fatal-sessions";
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_REALTIME = "_r";
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String[] INITIAL_SESSION_PART_TAGS = {SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    static final int MAX_INVALID_SESSIONS = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    static final int MAX_STACK_SIZE = 1024;
    static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(SESSION_BEGIN_TAG) {
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    /* access modifiers changed from: private */
    public static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_JSON_SUFFIX = ".json";
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    /* access modifiers changed from: private */
    public final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    /* access modifiers changed from: private */
    public final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final C14299a fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final C14388d httpRequestFactory;
    private final C14265s idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    /* access modifiers changed from: private */
    public final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    /* access modifiers changed from: private */
    public final String unityVersion;

    private static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    private interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream) throws Exception;
    }

    private static final class DefaultSettingsDataProvider implements SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        public C14329u getSettingsData() {
            return C14323r.m62045e().mo45273a();
        }
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    private interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream) throws Exception;
    }

    static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG);
        }
    }

    private static final class LogFileDirectoryProvider implements DirectoryProvider {
        private static final String LOG_FILES_DIR = "log-files";
        private final C14299a rootFileStore;

        public LogFileDirectoryProvider(C14299a aVar) {
            this.rootFileStore = aVar;
        }

        public File getLogFileDir() {
            File file = new File(this.rootFileStore.mo45244c(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    private static final class PrivacyDialogCheck implements SendCheck {
        private final C14225i kit;
        /* access modifiers changed from: private */
        public final PreferenceManager preferenceManager;
        private final C14321p promptData;

        public PrivacyDialogCheck(C14225i iVar, PreferenceManager preferenceManager2, C14321p pVar) {
            this.kit = iVar;
            this.preferenceManager = preferenceManager2;
            this.promptData = pVar;
        }

        public boolean canSendReports() {
            Activity d = this.kit.getFabric().mo45061d();
            if (d == null || d.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(d, this.promptData, new AlwaysSendCallback() {
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            d.runOnUiThread(new Runnable() {
                public void run() {
                    create.show();
                }
            });
            C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Waiting for user opt-in.");
            create.await();
            return create.getOptIn();
        }
    }

    private final class ReportUploaderFilesProvider implements ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    private final class ReportUploaderHandlingExceptionCheck implements HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    private static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context2, Report report2, ReportUploader reportUploader2) {
            this.context = context2;
            this.report = report2;
            this.reportUploader = reportUploader2;
        }

        public void run() {
            if (C14248i.m61826b(this.context)) {
                C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.sessionId);
            sb.append(ClsFileOutputStream.SESSION_FILE_EXTENSION);
            boolean z = false;
            if (str.equals(sb.toString())) {
                return false;
            }
            if (str.contains(this.sessionId) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION)) {
                z = true;
            }
            return z;
        }
    }

    CrashlyticsController(CrashlyticsCore crashlyticsCore2, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, C14388d dVar, C14265s sVar, PreferenceManager preferenceManager2, C14299a aVar, AppData appData2, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar2, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore2;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = dVar;
        this.idManager = sVar;
        this.preferenceManager = preferenceManager2;
        this.fileStore = aVar;
        this.appData = appData2;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar2;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore2.getContext();
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(aVar);
        this.logFileManager = new LogFileManager(context, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        C14228l j = C14215d.m61672j();
        String str = CrashlyticsCore.TAG;
        j.mo45042d(str, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Closing session: ");
            sb.append(sessionIdFromSessionFile);
            j2.mo45042d(str, sb.toString());
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (IOException e) {
                C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    /* access modifiers changed from: private */
    public void doOpenSession() throws Exception {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(clsuuid);
        j.mo45042d(CrashlyticsCore.TAG, sb.toString());
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    /* access modifiers changed from: private */
    public void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String currentSessionId = getCurrentSessionId();
        CodedOutputStream codedOutputStream = null;
        String str3 = CrashlyticsCore.TAG;
        if (currentSessionId == null) {
            C14215d.m61672j().mo45045e(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            j.mo45042d(str3, sb.toString());
            String b = C14248i.m61821b(this.eventCounter.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentSessionId);
            sb2.append(SESSION_NON_FATAL_TAG);
            sb2.append(b);
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), sb2.toString());
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                try {
                    writeSessionEvent(newInstance, date, thread, th, "error", false);
                    C14248i.m61816a((Flushable) newInstance, str2);
                } catch (Exception e) {
                    e = e;
                    codedOutputStream = newInstance;
                    try {
                        C14215d.m61672j().mo45045e(str3, "An error occurred in the non-fatal exception logger", e);
                        C14248i.m61816a((Flushable) codedOutputStream, str2);
                        C14248i.m61815a((Closeable) clsFileOutputStream, str);
                        trimSessionEventFiles(currentSessionId, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        C14248i.m61816a((Flushable) codedOutputStream, str2);
                        C14248i.m61815a((Closeable) clsFileOutputStream, str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    codedOutputStream = newInstance;
                    C14248i.m61816a((Flushable) codedOutputStream, str2);
                    C14248i.m61815a((Closeable) clsFileOutputStream, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C14215d.m61672j().mo45045e(str3, "An error occurred in the non-fatal exception logger", e);
                C14248i.m61816a((Flushable) codedOutputStream, str2);
                C14248i.m61815a((Closeable) clsFileOutputStream, str);
                trimSessionEventFiles(currentSessionId, 64);
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            C14215d.m61672j().mo45045e(str3, "An error occurred in the non-fatal exception logger", e);
            C14248i.m61816a((Flushable) codedOutputStream, str2);
            C14248i.m61815a((Closeable) clsFileOutputStream, str);
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
            C14248i.m61816a((Flushable) codedOutputStream, str2);
            C14248i.m61815a((Closeable) clsFileOutputStream, str);
            throw th;
        }
        C14248i.m61815a((Closeable) clsFileOutputStream, str);
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Exception e4) {
            C14215d.m61672j().mo45045e(str3, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(Context context, File file, String str) throws IOException {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        String str2 = CrashlyticsCore.TAG;
        if (minidumpFromDirectory == null || minidumpFromDirectory.length == 0) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("No minidump data found in directory ");
            sb.append(file);
            j.mo45051w(str2, sb.toString());
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] readFile = readFile(str, "BeginSession.json");
        byte[] readFile2 = readFile(str, "SessionApp.json");
        byte[] readFile3 = readFile(str, "SessionDevice.json");
        byte[] readFile4 = readFile(str, "SessionOS.json");
        byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        LogFileManager logFileManager2 = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager2.getBytesForLog();
        logFileManager2.clearLog();
        byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        File file2 = new File(this.fileStore.mo45244c(), str);
        if (!file2.mkdir()) {
            C14215d.m61672j().mo45042d(str2, "Couldn't create native sessions directory");
            return;
        }
        gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
        gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, MetaData.ELEMENT_NAME));
        gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, "binaryImages"));
        gzipIfNotEmpty(readFile, new File(file2, "session"));
        gzipIfNotEmpty(readFile2, new File(file2, C14330v.f42313b));
        gzipIfNotEmpty(readFile3, new File(file2, State.KEY_DEVICE));
        gzipIfNotEmpty(readFile4, new File(file2, State.KEY_OS));
        gzipIfNotEmpty(readFile5, new File(file2, "user"));
        gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
        gzipIfNotEmpty(readFile6, new File(file2, "keys"));
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String b = C14248i.m61822b(this.crashlyticsCore.getContext(), CRASHLYTICS_API_ENDPOINT);
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, b, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, b, str2, this.httpRequestFactory));
    }

    /* access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        trimSessionEventFiles(str, i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SESSION_NON_FATAL_TAG);
        return listFilesMatching((FilenameFilter) new FileNameContainsFilter(sb.toString()));
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    private void gzip(byte[] bArr, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C14248i.m61814a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C14248i.m61814a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C14248i.m61814a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) throws IOException {
        if (bArr != null && bArr.length > 0) {
            gzip(bArr, file);
        }
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching((FilenameFilter) new SessionPartFileFilter(str));
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return NativeFileUtils.readFile(new File(filesDir, sb.toString()));
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C14215d.m61662a(Answers.class);
        if (answers == null) {
            C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C14252a(str, str2));
        }
    }

    /* access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j) {
        boolean firebaseCrashExists = firebaseCrashExists();
        String str = CrashlyticsCore.TAG;
        if (firebaseCrashExists) {
            C14215d.m61672j().mo45042d(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.firebaseAnalyticsLogger != null) {
            C14215d.m61672j().mo45042d(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, "_ae", bundle);
        } else {
            C14215d.m61672j().mo45042d(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) C14215d.m61662a(Answers.class);
        if (answers == null) {
            C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new C14253b(str, str2));
        }
    }

    /* access modifiers changed from: private */
    public void recursiveDelete(Set<File> set) {
        for (File recursiveDelete : set) {
            recursiveDelete(recursiveDelete);
        }
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            boolean matches = matcher.matches();
            String str = CrashlyticsCore.TAG;
            if (!matches) {
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting unknown file: ");
                sb.append(name);
                j.mo45042d(str, sb.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                C14228l j2 = C14215d.m61672j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trimming session file: ");
                sb2.append(name);
                j2.mo45042d(str, sb2.toString());
                file.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendSessionReports(C14329u uVar) {
        if (uVar == null) {
            C14215d.m61672j().mo45051w(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.crashlyticsCore.getContext();
        C14310e eVar = uVar.f42267a;
        ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(eVar.f42211d, eVar.f42212e), this.reportFilesProvider, this.handlingExceptionCheck);
        for (File sessionReport : listCompleteSessionFiles()) {
            this.backgroundWorker.submit((Runnable) new SendReportRunnable(context, new SessionReport(sessionReport, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    /* access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(C14329u uVar) {
        boolean z = false;
        if (uVar == null) {
            return false;
        }
        if (uVar.f42270d.f42237a && !this.preferenceManager.shouldAlwaysSendReports()) {
            z = true;
        }
        return z;
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        ClsFileOutputStream clsFileOutputStream;
        String str2 = str;
        File file3 = file2;
        String str3 = "Failed to close CLS file";
        String str4 = CrashlyticsCore.TAG;
        String str5 = "Error flushing session file stream";
        boolean z = file3 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str2);
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Collecting SessionStart data for session ID ");
                sb.append(str2);
                j.mo45042d(str4, sb.toString());
                writeToCosFromFile(newInstance, file);
                newInstance.writeUInt64(4, new Date().getTime() / 1000);
                newInstance.writeBool(5, z);
                newInstance.writeUInt32(11, 1);
                newInstance.writeEnum(12, 3);
                writeInitialPartsTo(newInstance, str2);
                writeNonFatalEventsTo(newInstance, fileArr, str2);
                if (z) {
                    writeToCosFromFile(newInstance, file3);
                }
                C14248i.m61816a((Flushable) newInstance, str5);
                C14248i.m61815a((Closeable) clsFileOutputStream, str3);
            } catch (Exception e) {
                e = e;
                try {
                    C14228l j2 = C14215d.m61672j();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to write session file for session ID: ");
                    sb2.append(str2);
                    j2.mo45045e(str4, sb2.toString(), e);
                    C14248i.m61816a((Flushable) null, str5);
                    closeWithoutRenamingOrLog(clsFileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61816a((Flushable) null, str5);
                    C14248i.m61815a((Closeable) clsFileOutputStream, str3);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            clsFileOutputStream = null;
            C14228l j22 = C14215d.m61672j();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Failed to write session file for session ID: ");
            sb22.append(str2);
            j22.mo45045e(str4, sb22.toString(), e);
            C14248i.m61816a((Flushable) null, str5);
            closeWithoutRenamingOrLog(clsFileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
            C14248i.m61816a((Flushable) null, str5);
            C14248i.m61815a((Closeable) clsFileOutputStream, str3);
            throw th;
        }
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching((FilenameFilter) new AnySessionPartFileFilter()), hashSet);
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SESSION_NON_FATAL_TAG);
        Utils.capFileCount(filesDir, new FileNameContainsFilter(sb.toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(String str, Date date) throws Exception {
        final String str2 = str;
        final String format = String.format(Locale.US, GENERATOR_FORMAT, new Object[]{this.crashlyticsCore.getVersion()});
        final long time = date.getTime() / 1000;
        C328917 r3 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, format, time);
            }
        };
        writeSessionPartFile(str, SESSION_BEGIN_TAG, r3);
        C329018 r32 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put(SessionEntry.COLUMN_ID, str2);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str, "BeginSession.json", r32);
    }

    /* access modifiers changed from: private */
    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String str = CrashlyticsCore.TAG;
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        CodedOutputStream codedOutputStream = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                C14215d.m61672j().mo45045e(str, "Tried to write a fatal exception while no session was open.", null);
                C14248i.m61816a((Flushable) null, str3);
                C14248i.m61815a((Closeable) null, str2);
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(currentSessionId);
            sb.append(SESSION_FATAL_TAG);
            clsFileOutputStream = new ClsFileOutputStream(filesDir, sb.toString());
            try {
                codedOutputStream = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                writeSessionEvent(codedOutputStream, date, thread, th, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            C14248i.m61816a((Flushable) codedOutputStream, str3);
            C14248i.m61815a((Closeable) clsFileOutputStream, str2);
        } catch (Exception e2) {
            e = e2;
            clsFileOutputStream = null;
            try {
                C14215d.m61672j().mo45045e(str, "An error occurred in the fatal exception logger", e);
                C14248i.m61816a((Flushable) codedOutputStream, str3);
                C14248i.m61815a((Closeable) clsFileOutputStream, str2);
            } catch (Throwable th2) {
                th = th2;
                C14248i.m61816a((Flushable) codedOutputStream, str3);
                C14248i.m61815a((Closeable) clsFileOutputStream, str2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            C14248i.m61816a((Flushable) codedOutputStream, str3);
            C14248i.m61815a((Closeable) clsFileOutputStream, str2);
            throw th;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) throws Exception {
        String str3 = " file.";
        String str4 = "Failed to close ";
        FileOutputStream fileOutputStream = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, sb.toString()));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str3);
                C14248i.m61815a((Closeable) fileOutputStream2, sb2.toString());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(str2);
                sb3.append(str3);
                C14248i.m61815a((Closeable) fileOutputStream, sb3.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str4);
            sb32.append(str2);
            sb32.append(str3);
            C14248i.m61815a((Closeable) fileOutputStream, sb32.toString());
            throw th;
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        String[] strArr;
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(ClsFileOutputStream.SESSION_FILE_EXTENSION);
            File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(sb.toString()));
            int length = listFilesMatching.length;
            String str3 = " data for session ID ";
            String str4 = CrashlyticsCore.TAG;
            if (length == 0) {
                C14228l j = C14215d.m61672j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                j.mo45045e(str4, sb2.toString(), null);
            } else {
                C14228l j2 = C14215d.m61672j();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Collecting ");
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(str);
                j2.mo45042d(str4, sb3.toString());
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        String str2 = CrashlyticsCore.TAG;
        Arrays.sort(fileArr, C14248i.f42017E);
        for (File file : fileArr) {
            try {
                C14215d.m61672j().mo45042d(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                C14215d.m61672j().mo45045e(str2, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeSessionApp(String str) throws Exception {
        String e = this.idManager.mo45164e();
        AppData appData2 = this.appData;
        String str2 = appData2.versionCode;
        String str3 = appData2.versionName;
        final String str4 = e;
        final String str5 = str2;
        final String str6 = str3;
        final String f = this.idManager.mo45165f();
        final int d = C14256m.m61859b(this.appData.installerPackageName).mo45149d();
        C329219 r1 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str4, CrashlyticsController.this.appData.apiKey, str5, str6, f, d, CrashlyticsController.this.unityVersion);
            }
        };
        writeSessionPartFile(str, SESSION_APP_TAG, r1);
        C329420 r12 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("app_identifier", str4);
                        put("api_key", CrashlyticsController.this.appData.apiKey);
                        put("version_code", str5);
                        put(C2876e.f10129f0, str6);
                        put("install_uuid", f);
                        put("delivery_mechanism", Integer.valueOf(d));
                        put("unity_version", TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? "" : CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str, "SessionApp.json", r12);
    }

    private void writeSessionDevice(String str) throws Exception {
        String str2 = str;
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = C14248i.m61793a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = C14248i.m61820b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean l = C14248i.m61844l(context);
        final int i = a;
        final int i2 = availableProcessors;
        final long j = b;
        final long j2 = blockCount;
        final boolean z = l;
        final Map h = this.idManager.mo45167h();
        long j3 = b;
        C329923 r15 = r0;
        final int f = C14248i.m61838f(context);
        C329923 r0 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i, Build.MODEL, i2, j, j2, z, h, f, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        writeSessionPartFile(str2, SESSION_DEVICE_TAG, r15);
        final long j4 = j3;
        C330024 r02 = new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("arch", Integer.valueOf(i));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(i2));
                        put("total_ram", Long.valueOf(j4));
                        put("disk_space", Long.valueOf(j2));
                        put("is_emulator", Boolean.valueOf(z));
                        put("ids", h);
                        put("state", Integer.valueOf(f));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        };
        writeFile(str2, "SessionDevice.json", r02);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2, types: [boolean]
      assigns: []
      uses: [boolean, ?[int, byte, short, char]]
      mth insns count: 75
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) throws java.lang.Exception {
        /*
            r24 = this;
            r0 = r24
            com.crashlytics.android.core.TrimmedThrowableData r5 = new com.crashlytics.android.core.TrimmedThrowableData
            com.crashlytics.android.core.StackTraceTrimmingStrategy r1 = r0.stackTraceTrimmingStrategy
            r2 = r28
            r5.<init>(r2, r1)
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            android.content.Context r1 = r1.getContext()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61836e(r1)
            com.crashlytics.android.core.DevicePowerStateListener r4 = r0.devicePowerStateListener
            boolean r4 = r4.isPowerConnected()
            int r17 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61795a(r1, r4)
            boolean r18 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61839g(r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61820b()
            long r8 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61796a(r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61797a(r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61799a(r4, r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.stacktrace
            com.crashlytics.android.core.AppData r4 = r0.appData
            java.lang.String r15 = r4.buildId
            io.fabric.sdk.android.p.b.s r4 = r0.idManager
            java.lang.String r14 = r4.mo45164e()
            r4 = 0
            if (r30 == 0) goto L_0x00a1
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0078:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            com.crashlytics.android.core.StackTraceTrimmingStrategy r6 = r0.stackTraceTrimmingStrategy
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.getTrimmedStackTrace(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0078
        L_0x009e:
            r6 = 1
            r8 = r10
            goto L_0x00a5
        L_0x00a1:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a5:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = p212io.fabric.sdk.android.p493p.p495b.C14248i.m61819a(r1, r4, r6)
            if (r1 != 0) goto L_0x00b3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c8
        L_0x00b3:
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            java.util.Map r1 = r1.getAttributes()
            if (r1 == 0) goto L_0x00c8
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c8
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c9
        L_0x00c8:
            r10 = r1
        L_0x00c9:
            com.crashlytics.android.core.LogFileManager r11 = r0.logFileManager
            r1 = r25
            r4 = r29
            r6 = r27
            com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.writeSessionEvent(com.crashlytics.android.core.CodedOutputStream, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    private void writeSessionOS(String str) throws Exception {
        final boolean n = C14248i.m61846n(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, VERSION.RELEASE, VERSION.CODENAME, n);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) throws Exception {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("version", VERSION.RELEASE);
                        put("build_version", VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(n));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) throws Exception {
        ClsFileOutputStream clsFileOutputStream;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        CodedOutputStream codedOutputStream = null;
        try {
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            clsFileOutputStream = new ClsFileOutputStream(filesDir, sb.toString());
            try {
                codedOutputStream = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                codedOutputStreamWriteAction.writeTo(codedOutputStream);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str5);
                C14248i.m61816a((Flushable) codedOutputStream, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str2);
                sb3.append(str5);
                C14248i.m61815a((Closeable) clsFileOutputStream, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str2);
                sb4.append(str5);
                C14248i.m61816a((Flushable) codedOutputStream, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str2);
                sb5.append(str5);
                C14248i.m61815a((Closeable) clsFileOutputStream, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
            StringBuilder sb42 = new StringBuilder();
            sb42.append(str4);
            sb42.append(str2);
            sb42.append(str5);
            C14248i.m61816a((Flushable) codedOutputStream, sb42.toString());
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str3);
            sb52.append(str2);
            sb52.append(str5);
            C14248i.m61815a((Closeable) clsFileOutputStream, sb52.toString());
            throw th;
        }
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Collecting session parts for ID ");
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = CrashlyticsCore.TAG;
        j.mo45042d(str2, sb2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(SESSION_FATAL_TAG);
        File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(sb3.toString()));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        C14215d.m61672j().mo45042d(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(SESSION_NON_FATAL_TAG);
        File[] listFilesMatching2 = listFilesMatching((FilenameFilter) new FileNameContainsFilter(sb4.toString()));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        C14215d.m61672j().mo45042d(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        } else {
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("No events present for session ID ");
            sb5.append(str);
            j2.mo45042d(str2, sb5.toString());
        }
        C14228l j3 = C14215d.m61672j();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Removing session part files for ID ");
        sb6.append(str);
        j3.mo45042d(str2, sb6.toString());
        deleteSessionPartFilesFor(str);
    }

    private void writeSessionUser(String str) throws Exception {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) throws Exception {
                UserMetaData userMetaData = userMetaData;
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.f11755id, userMetaData.name, userMetaData.email);
            }
        });
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close file input stream.";
        if (!file.exists()) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            j.mo45045e(CrashlyticsCore.TAG, sb.toString(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                C14248i.m61815a((Closeable) fileInputStream, str);
            } catch (Throwable th) {
                th = th;
                C14248i.m61815a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C14248i.m61815a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                crashlyticsController.doCleanInvalidTempFiles(crashlyticsController.listFilesMatching((FilenameFilter) new InvalidPartFileFilter()));
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void doCleanInvalidTempFiles(File[] fileArr) {
        String str;
        File[] listFilesMatching;
        final HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            str = CrashlyticsCore.TAG;
            if (i >= length) {
                break;
            }
            File file = fileArr[i];
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Found invalid session part file: ");
            sb.append(file);
            j.mo45042d(str, sb.toString());
            hashSet.add(getSessionIdFromSessionFile(file));
            i++;
        }
        if (!hashSet.isEmpty()) {
            File invalidFilesDir = getInvalidFilesDir();
            if (!invalidFilesDir.exists()) {
                invalidFilesDir.mkdir();
            }
            for (File file2 : listFilesMatching((FilenameFilter) new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                C14228l j2 = C14215d.m61672j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Moving session file: ");
                sb2.append(file2);
                j2.mo45042d(str, sb2.toString());
                if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                    C14228l j3 = C14215d.m61672j();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not move session file. Deleting ");
                    sb3.append(file2);
                    j3.mo45042d(str, sb3.toString());
                    file2.delete();
                }
            }
            trimInvalidSessionFiles();
        }
    }

    /* access modifiers changed from: 0000 */
    public void doCloseSessions(C14322q qVar) throws Exception {
        doCloseSessions(qVar, false);
    }

    /* access modifiers changed from: 0000 */
    public void enableExceptionHandling(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        this.crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashListener() {
            public void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
    }

    /* access modifiers changed from: 0000 */
    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String access$1600 = CrashlyticsController.this.getPreviousSessionId();
                if (access$1600 != null && !treeSet.isEmpty()) {
                    File file = (File) treeSet.first();
                    if (file != null) {
                        CrashlyticsController crashlyticsController = CrashlyticsController.this;
                        crashlyticsController.finalizeMostRecentNativeCrash(crashlyticsController.crashlyticsCore.getContext(), file, access$1600);
                    }
                }
                CrashlyticsController.this.recursiveDelete((Set<File>) treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public boolean finalizeSessions(final C14322q qVar) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                boolean isHandlingException = CrashlyticsController.this.isHandlingException();
                String str = CrashlyticsCore.TAG;
                if (isHandlingException) {
                    C14215d.m61672j().mo45042d(str, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                C14215d.m61672j().mo45042d(str, "Finalizing previously open sessions.");
                CrashlyticsController.this.doCloseSessions(qVar, true);
                C14215d.m61672j().mo45042d(str, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), FATAL_SESSION_DIR);
    }

    /* access modifiers changed from: 0000 */
    public File getFilesDir() {
        return this.fileStore.mo45244c();
    }

    /* access modifiers changed from: 0000 */
    public File getInvalidFilesDir() {
        return new File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    /* access modifiers changed from: 0000 */
    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void handleUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
        C14228l j = C14215d.m61672j();
        String str = CrashlyticsCore.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        j.mo45042d(str, sb.toString());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = this.backgroundWorker;
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
        final boolean z2 = z;
        C33077 r1 = new Callable<Void>() {
            public Void call() throws Exception {
                C14319n nVar;
                C14322q qVar;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread2, th2);
                C14329u settingsData = settingsDataProvider2.getSettingsData();
                if (settingsData != null) {
                    qVar = settingsData.f42268b;
                    nVar = settingsData.f42270d;
                } else {
                    qVar = null;
                    nVar = null;
                }
                boolean z = false;
                if ((nVar == null || nVar.f42241e) || z2) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(qVar);
                CrashlyticsController.this.doOpenSession();
                if (qVar != null) {
                    CrashlyticsController.this.trimSessionFiles(qVar.f42259g);
                }
                if (C14255l.m61854a(CrashlyticsController.this.crashlyticsCore.getContext()).mo45147a() && !CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    z = true;
                }
                if (z) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        };
        crashlyticsBackgroundWorker.submitAndWait(r1);
    }

    /* access modifiers changed from: 0000 */
    public boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    /* access modifiers changed from: 0000 */
    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: 0000 */
    public File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    /* access modifiers changed from: 0000 */
    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    /* access modifiers changed from: 0000 */
    public void openSession() {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void registerAnalyticsEventListener(C14329u uVar) {
        if (uVar.f42270d.f42241e) {
            boolean register = this.appMeasurementEventListenerRegistrar.register();
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Registered Firebase Analytics event listener for breadcrumbs: ");
            sb.append(register);
            j.mo45042d(CrashlyticsCore.TAG, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    /* access modifiers changed from: 0000 */
    public void submitAllReports(float f, C14329u uVar) {
        if (uVar == null) {
            C14215d.m61672j().mo45051w(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
            return;
        }
        C14310e eVar = uVar.f42267a;
        new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(eVar.f42211d, eVar.f42212e), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(uVar) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, uVar.f42269c) : new AlwaysSendCheck());
    }

    /* access modifiers changed from: 0000 */
    public void trimSessionFiles(int i) {
        int capFileCount = i - Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    /* access modifiers changed from: 0000 */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit((Callable<T>) new Callable<Void>() {
            public Void call() throws Exception {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.logFileManager.writeToLog(j, str);
                }
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r5v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doCloseSessions(p212io.fabric.sdk.android.p493p.p498e.C14322q r4, int r5) throws java.lang.Exception {
        /*
            r3 = this;
            int r0 = r5 + 8
            r3.trimOpenSessions(r0)
            java.io.File[] r0 = r3.listSortedSessionBeginFiles()
            int r1 = r0.length
            java.lang.String r2 = "CrashlyticsCore"
            if (r1 > r5) goto L_0x0018
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo45042d(r2, r5)
            return
        L_0x0018:
            r1 = r0[r5]
            java.lang.String r1 = getSessionIdFromSessionFile(r1)
            r3.writeSessionUser(r1)
            if (r4 != 0) goto L_0x002d
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.String r5 = "Unable to close session. Settings are not loaded."
            r4.mo45042d(r2, r5)
            return
        L_0x002d:
            int r4 = r4.f42255c
            r3.closeOpenSessions(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.doCloseSessions(io.fabric.sdk.android.p.e.q, boolean):void");
    }

    /* access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }
}
