package com.instabug.library.logging;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.C0193h0;
import androidx.annotation.C0224v0;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.UserEventEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.user.UserEvent;
import com.instabug.library.user.UserEventParam;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugUserEventLogger {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final long DELAY = 1;
    private static final int USER_EVENT_COUNT_LIMIT = 10000;
    private static volatile InstabugUserEventLogger instabugUserEventLogger;
    private ScheduledExecutorService insertionExecutor;
    private List<UserEvent> userEvents = new ArrayList();
    private ConcurrentHashMap<String, Integer> userEventsCount;

    /* renamed from: com.instabug.library.logging.InstabugUserEventLogger$a */
    class C9929a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26397b;

        /* renamed from: a */
        final /* synthetic */ InstabugUserEventLogger f26398a;

        C9929a(InstabugUserEventLogger instabugUserEventLogger) {
            boolean[] a = m46198a();
            this.f26398a = instabugUserEventLogger;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46198a() {
            boolean[] zArr = f26397b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4285620002308883839L, "com/instabug/library/logging/InstabugUserEventLogger$1", 6);
            f26397b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46198a();
            a[1] = true;
            for (Entry entry : InstabugUserEventLogger.access$000(this.f26398a).entrySet()) {
                a[2] = true;
                InstabugUserEventLogger.access$100(this.f26398a, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                a[3] = true;
            }
            InstabugUserEventLogger.access$000(this.f26398a).clear();
            a[4] = true;
            InstabugUserEventLogger.access$202(this.f26398a, null);
            a[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-942759572266314005L, "com/instabug/library/logging/InstabugUserEventLogger", 63);
        $jacocoData = a;
        return a;
    }

    private InstabugUserEventLogger() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
        this.userEventsCount = new ConcurrentHashMap<>();
        $jacocoInit[2] = true;
    }

    static /* synthetic */ ConcurrentHashMap access$000(InstabugUserEventLogger instabugUserEventLogger2) {
        boolean[] $jacocoInit = $jacocoInit();
        ConcurrentHashMap<String, Integer> concurrentHashMap = instabugUserEventLogger2.userEventsCount;
        $jacocoInit[60] = true;
        return concurrentHashMap;
    }

    static /* synthetic */ void access$100(InstabugUserEventLogger instabugUserEventLogger2, String str, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugUserEventLogger2.incrementEventLoggingCount(str, i);
        $jacocoInit[61] = true;
    }

    static /* synthetic */ ScheduledExecutorService access$202(InstabugUserEventLogger instabugUserEventLogger2, ScheduledExecutorService scheduledExecutorService) {
        boolean[] $jacocoInit = $jacocoInit();
        instabugUserEventLogger2.insertionExecutor = scheduledExecutorService;
        $jacocoInit[62] = true;
        return scheduledExecutorService;
    }

    private int getEventLoggingCount(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        $jacocoInit[51] = true;
        String str2 = UserEventEntry.COLUMN_EVENT_LOGGING_COUNT;
        int i = 0;
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper = openDatabase;
        Cursor query = sQLiteDatabaseWrapper.query(UserEventEntry.TABLE_NAME, new String[]{str2}, "event_identifier =?", new String[]{str}, null, null, null);
        $jacocoInit[52] = true;
        if (query.getCount() <= 0) {
            $jacocoInit[53] = true;
        } else {
            $jacocoInit[54] = true;
            query.moveToFirst();
            $jacocoInit[55] = true;
            int columnIndex = query.getColumnIndex(str2);
            $jacocoInit[56] = true;
            i = query.getInt(columnIndex);
            $jacocoInit[57] = true;
        }
        query.close();
        $jacocoInit[58] = true;
        openDatabase.close();
        $jacocoInit[59] = true;
        return i;
    }

    public static InstabugUserEventLogger getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instabugUserEventLogger != null) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            instabugUserEventLogger = new InstabugUserEventLogger();
            $jacocoInit[5] = true;
        }
        InstabugUserEventLogger instabugUserEventLogger2 = instabugUserEventLogger;
        $jacocoInit[6] = true;
        return instabugUserEventLogger2;
    }

    private void incrementEventLoggingCount(@C0193h0 String str, int i) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        int eventLoggingCount = getEventLoggingCount(str);
        if (eventLoggingCount > 0) {
            $jacocoInit[41] = true;
            z = true;
        } else {
            $jacocoInit[42] = true;
            z = false;
        }
        $jacocoInit[43] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        $jacocoInit[44] = true;
        ContentValues contentValues = new ContentValues();
        $jacocoInit[45] = true;
        contentValues.put("event_identifier", str);
        int i2 = eventLoggingCount + i;
        $jacocoInit[46] = true;
        contentValues.put(UserEventEntry.COLUMN_EVENT_LOGGING_COUNT, Integer.valueOf(i2));
        String str2 = UserEventEntry.TABLE_NAME;
        if (z) {
            $jacocoInit[47] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("update: ");
            sb.append(openDatabase.update(str2, contentValues, "event_identifier=?", new String[]{str}));
            InstabugSDKLogger.m46622d(this, sb.toString());
            $jacocoInit[48] = true;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insert: ");
            sb2.append(openDatabase.insert(str2, null, contentValues));
            InstabugSDKLogger.m46622d(this, sb2.toString());
            $jacocoInit[49] = true;
        }
        openDatabase.close();
        $jacocoInit[50] = true;
    }

    private void runInsertionHandler() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.insertionExecutor != null) {
            $jacocoInit[26] = true;
        } else {
            $jacocoInit[27] = true;
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
            $jacocoInit[28] = true;
            newScheduledThreadPool.schedule(new C9929a(this), 1, TimeUnit.SECONDS);
            $jacocoInit[29] = true;
        }
        $jacocoInit[30] = true;
    }

    public void clearAll() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[36] = true;
        this.userEvents.clear();
        $jacocoInit[37] = true;
    }

    public void clearLoggingData() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[38] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        $jacocoInit[39] = true;
        openDatabase.delete(UserEventEntry.TABLE_NAME, null, null);
        $jacocoInit[40] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public int getLoggingEventCount(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[31] = true;
        Parameter[] parameterArr = {parameter.setName("userEventIdentifier").setType(String.class)};
        $jacocoInit[32] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[33] = true;
        int eventLoggingCount = getEventLoggingCount(str);
        $jacocoInit[34] = true;
        return eventLoggingCount;
    }

    public List<UserEvent> getUserEvents() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        List<UserEvent> list = this.userEvents;
        $jacocoInit[35] = true;
        return list;
    }

    public synchronized void logUserEvent(@C0193h0 String str, UserEventParam... userEventParamArr) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        $jacocoInit[7] = true;
        $jacocoInit[8] = true;
        Parameter[] parameterArr = {new Parameter().setName("eventIdentifier").setType(String.class), new Parameter().setName("userEventParams").setType(UserEventParam.class)};
        $jacocoInit[9] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[10] = true;
        if (C9780c.m45631b().mo34869b(Feature.USER_EVENTS) != State.ENABLED) {
            $jacocoInit[11] = true;
        } else {
            $jacocoInit[12] = true;
            UserEvent userEvent = new UserEvent();
            $jacocoInit[13] = true;
            UserEvent eventIdentifier = userEvent.setEventIdentifier(str);
            $jacocoInit[14] = true;
            UserEvent date = eventIdentifier.setDate(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
            int length = userEventParamArr.length;
            $jacocoInit[15] = true;
            int i = 0;
            while (i < length) {
                UserEventParam userEventParam = userEventParamArr[i];
                $jacocoInit[16] = true;
                date.addParam(userEventParam);
                i++;
                $jacocoInit[17] = true;
            }
            if (this.userEvents.size() < 10000) {
                $jacocoInit[18] = true;
            } else {
                $jacocoInit[19] = true;
                this.userEvents.remove(0);
                $jacocoInit[20] = true;
            }
            this.userEvents.add(date);
            $jacocoInit[21] = true;
            Integer num = (Integer) this.userEventsCount.get(str);
            if (num != null) {
                $jacocoInit[22] = true;
                this.userEventsCount.put(str, Integer.valueOf(num.intValue() + 1));
                $jacocoInit[23] = true;
            } else {
                this.userEventsCount.put(str, Integer.valueOf(1));
                $jacocoInit[24] = true;
            }
        }
        runInsertionHandler();
        $jacocoInit[25] = true;
    }
}
