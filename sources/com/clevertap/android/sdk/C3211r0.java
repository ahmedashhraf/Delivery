package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.r0 */
/* compiled from: DBAdapter */
class C3211r0 {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final String f11623A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final String f11624B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final String f11625C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final String f11626D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final String f11627E;

    /* renamed from: d */
    private static final String f11628d = "data";

    /* renamed from: e */
    private static final String f11629e = "created_at";

    /* renamed from: f */
    private static final long f11630f = 432000000;

    /* renamed from: g */
    private static final String f11631g = "_id";

    /* renamed from: h */
    private static final String f11632h = "isRead";

    /* renamed from: i */
    private static final String f11633i = "expires";

    /* renamed from: j */
    private static final String f11634j = "tags";

    /* renamed from: k */
    private static final String f11635k = "messageUser";

    /* renamed from: l */
    private static final String f11636l = "campaignId";

    /* renamed from: m */
    private static final String f11637m = "wzrkParams";

    /* renamed from: n */
    private static final int f11638n = -1;

    /* renamed from: o */
    private static final int f11639o = -2;

    /* renamed from: p */
    public static final int f11640p = -3;

    /* renamed from: q */
    private static final String f11641q = "clevertap";

    /* renamed from: r */
    private static final int f11642r = 3;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final String f11643s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final String f11644t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final String f11645u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f11646v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f11647w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final String f11648x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f11649y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final String f11650z;

    /* renamed from: a */
    private final C3212a f11651a;

    /* renamed from: b */
    private CleverTapInstanceConfig f11652b;

    /* renamed from: c */
    private boolean f11653c;

    /* renamed from: com.clevertap.android.sdk.r0$a */
    /* compiled from: DBAdapter */
    private static class C3212a extends SQLiteOpenHelper {

        /* renamed from: a */
        private final File f11654a;

        /* renamed from: b */
        private final int f11655b = 20971520;

        C3212a(Context context, String str) {
            super(context, str, null, 3);
            this.f11654a = context.getDatabasePath(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo12576a() {
            if (!this.f11654a.exists() || Math.max(this.f11654a.getUsableSpace(), 20971520) >= this.f11654a.length()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo12577b() {
            close();
            this.f11654a.delete();
        }

        @SuppressLint({"SQLiteString"})
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C3111h1.m14938f("Creating CleverTap DB");
            sQLiteDatabase.execSQL(C3211r0.f11643s);
            sQLiteDatabase.execSQL(C3211r0.f11644t);
            sQLiteDatabase.execSQL(C3211r0.f11645u);
            sQLiteDatabase.execSQL(C3211r0.f11646v);
            sQLiteDatabase.execSQL(C3211r0.f11650z);
            sQLiteDatabase.execSQL(C3211r0.f11624B);
            sQLiteDatabase.execSQL(C3211r0.f11626D);
            sQLiteDatabase.execSQL(C3211r0.f11648x);
            sQLiteDatabase.execSQL(C3211r0.f11649y);
            sQLiteDatabase.execSQL(C3211r0.f11625C);
            sQLiteDatabase.execSQL(C3211r0.f11623A);
            sQLiteDatabase.execSQL(C3211r0.f11647w);
            sQLiteDatabase.execSQL(C3211r0.f11627E);
        }

        @SuppressLint({"SQLiteString"})
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Upgrading CleverTap DB to version ");
            sb.append(i2);
            C3111h1.m14938f(sb.toString());
            String str = "DROP TABLE IF EXISTS ";
            if (i == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(C3213b.UNINSTALL_TS.getName());
                sQLiteDatabase.execSQL(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C3213b.INBOX_MESSAGES.getName());
                sQLiteDatabase.execSQL(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(C3213b.PUSH_NOTIFICATION_VIEWED.getName());
                sQLiteDatabase.execSQL(sb4.toString());
                sQLiteDatabase.execSQL(C3211r0.f11650z);
                sQLiteDatabase.execSQL(C3211r0.f11624B);
                sQLiteDatabase.execSQL(C3211r0.f11646v);
                sQLiteDatabase.execSQL(C3211r0.f11626D);
                sQLiteDatabase.execSQL(C3211r0.f11625C);
                sQLiteDatabase.execSQL(C3211r0.f11623A);
                sQLiteDatabase.execSQL(C3211r0.f11647w);
                sQLiteDatabase.execSQL(C3211r0.f11627E);
            } else if (i == 2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(C3213b.PUSH_NOTIFICATION_VIEWED.getName());
                sQLiteDatabase.execSQL(sb5.toString());
                sQLiteDatabase.execSQL(C3211r0.f11626D);
                sQLiteDatabase.execSQL(C3211r0.f11627E);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.r0$b */
    /* compiled from: DBAdapter */
    public enum C3213b {
        EVENTS("events"),
        PROFILE_EVENTS("profileEvents"),
        USER_PROFILES("userProfiles"),
        INBOX_MESSAGES("inboxMessages"),
        PUSH_NOTIFICATIONS("pushNotifications"),
        UNINSTALL_TS("uninstallTimestamp"),
        PUSH_NOTIFICATION_VIEWED("notificationViewed");
        
        private final String tableName;

        private C3213b(String str) {
            this.tableName = str;
        }

        public String getName() {
            return this.tableName;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = "CREATE TABLE ";
        sb.append(str);
        sb.append(C3213b.EVENTS.getName());
        String str2 = " (_id INTEGER PRIMARY KEY AUTOINCREMENT, ";
        sb.append(str2);
        String str3 = "data";
        sb.append(str3);
        String str4 = " STRING NOT NULL, ";
        sb.append(str4);
        String str5 = f11629e;
        sb.append(str5);
        String str6 = " INTEGER NOT NULL);";
        sb.append(str6);
        f11643s = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C3213b.PROFILE_EVENTS.getName());
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        sb2.append(str6);
        f11644t = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(C3213b.USER_PROFILES.getName());
        sb3.append(" (_id STRING UNIQUE PRIMARY KEY, ");
        sb3.append(str3);
        String str7 = " STRING NOT NULL);";
        sb3.append(str7);
        f11645u = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(C3213b.INBOX_MESSAGES.getName());
        sb4.append(" (_id STRING NOT NULL, ");
        sb4.append(str3);
        String str8 = " TEXT NOT NULL, ";
        sb4.append(str8);
        sb4.append(f11637m);
        sb4.append(str8);
        sb4.append(f11636l);
        sb4.append(str4);
        sb4.append("tags");
        sb4.append(str8);
        String str9 = f11632h;
        sb4.append(str9);
        sb4.append(" INTEGER NOT NULL DEFAULT 0, ");
        sb4.append("expires");
        String str10 = " INTEGER NOT NULL, ";
        sb4.append(str10);
        sb4.append(str5);
        sb4.append(str10);
        String str11 = f11635k;
        sb4.append(str11);
        sb4.append(str7);
        f11646v = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CREATE UNIQUE INDEX IF NOT EXISTS userid_id_idx ON ");
        sb5.append(C3213b.INBOX_MESSAGES.getName());
        String str12 = " (";
        sb5.append(str12);
        sb5.append(str11);
        sb5.append(",");
        sb5.append("_id");
        String str13 = ");";
        sb5.append(str13);
        f11647w = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        String str14 = "CREATE INDEX IF NOT EXISTS time_idx ON ";
        sb6.append(str14);
        sb6.append(C3213b.EVENTS.getName());
        sb6.append(str12);
        sb6.append(str5);
        sb6.append(str13);
        f11648x = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str14);
        sb7.append(C3213b.PROFILE_EVENTS.getName());
        sb7.append(str12);
        sb7.append(str5);
        sb7.append(str13);
        f11649y = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(str);
        sb8.append(C3213b.PUSH_NOTIFICATIONS.getName());
        sb8.append(str2);
        sb8.append(str3);
        sb8.append(str4);
        sb8.append(str5);
        sb8.append(" INTEGER NOT NULL,");
        sb8.append(str9);
        sb8.append(str6);
        f11650z = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str14);
        sb9.append(C3213b.PUSH_NOTIFICATIONS.getName());
        sb9.append(str12);
        sb9.append(str5);
        sb9.append(str13);
        f11623A = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(str);
        sb10.append(C3213b.UNINSTALL_TS.getName());
        sb10.append(str2);
        sb10.append(str5);
        sb10.append(str6);
        f11624B = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str14);
        sb11.append(C3213b.UNINSTALL_TS.getName());
        sb11.append(str12);
        sb11.append(str5);
        sb11.append(str13);
        f11625C = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(str);
        sb12.append(C3213b.PUSH_NOTIFICATION_VIEWED.getName());
        sb12.append(str2);
        sb12.append(str3);
        sb12.append(str4);
        sb12.append(str5);
        sb12.append(str6);
        f11626D = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(str14);
        sb13.append(C3213b.PUSH_NOTIFICATION_VIEWED.getName());
        sb13.append(str12);
        sb13.append(str5);
        sb13.append(str13);
        f11627E = sb13.toString();
    }

    C3211r0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this(context, m15474a(cleverTapInstanceConfig));
        this.f11652b = cleverTapInstanceConfig;
    }

    /* renamed from: a */
    private static String m15474a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig.mo12112p()) {
            return f11641q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("clevertap_");
        sb.append(cleverTapInstanceConfig.mo12093a());
        return sb.toString();
    }

    /* renamed from: r */
    private boolean m15490r() {
        return this.f11651a.mo12576a();
    }

    /* renamed from: s */
    private void m15491s() {
        this.f11651a.mo12577b();
    }

    /* renamed from: t */
    private C3111h1 m15492t() {
        return this.f11652b.mo12108l();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(3:10|11|(3:13|14|15))|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r8 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r8 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0087=Splitter:B:33:0x0087, B:17:0x004d=Splitter:B:17:0x004d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject mo12568b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 != 0) goto L_0x0006
            monitor-exit(r7)
            return r0
        L_0x0006:
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.USER_PROFILES     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0092 }
            com.clevertap.android.sdk.r0$a r2 = r7.f11651a     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            java.lang.String r4 = "SELECT * FROM "
            r3.append(r4)     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            r3.append(r1)     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            java.lang.String r4 = " WHERE _id = ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            android.database.Cursor r8 = r2.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x005d, all -> 0x0058 }
            if (r8 == 0) goto L_0x004d
            boolean r2 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x004b }
            if (r2 == 0) goto L_0x004d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            java.lang.String r3 = "data"
            int r3 = r8.getColumnIndex(r3)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r3 = r8.getString(r3)     // Catch:{ JSONException -> 0x004d }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x004d }
            r0 = r2
            goto L_0x004d
        L_0x004b:
            r2 = move-exception
            goto L_0x005f
        L_0x004d:
            com.clevertap.android.sdk.r0$a r1 = r7.f11651a     // Catch:{ all -> 0x0092 }
            r1.close()     // Catch:{ all -> 0x0092 }
            if (r8 == 0) goto L_0x0084
        L_0x0054:
            r8.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0084
        L_0x0058:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0087
        L_0x005d:
            r2 = move-exception
            r8 = r0
        L_0x005f:
            com.clevertap.android.sdk.h1 r3 = r7.m15492t()     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r4.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "Could not fetch records out of database "
            r4.append(r5)     // Catch:{ all -> 0x0086 }
            r4.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0086 }
            r3.mo12317c(r1, r2)     // Catch:{ all -> 0x0086 }
            com.clevertap.android.sdk.r0$a r1 = r7.f11651a     // Catch:{ all -> 0x0092 }
            r1.close()     // Catch:{ all -> 0x0092 }
            if (r8 == 0) goto L_0x0084
            goto L_0x0054
        L_0x0084:
            monitor-exit(r7)
            return r0
        L_0x0086:
            r0 = move-exception
        L_0x0087:
            com.clevertap.android.sdk.r0$a r1 = r7.f11651a     // Catch:{ all -> 0x0092 }
            r1.close()     // Catch:{ all -> 0x0092 }
            if (r8 == 0) goto L_0x0091
            r8.close()     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0096
        L_0x0095:
            throw r8
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12568b(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.database.Cursor] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r3 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r3 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0, types: [java.lang.String[], android.database.Cursor]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.database.Cursor]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, java.lang.String[]]
      mth insns count: 55
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo12572c() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.UNINSTALL_TS     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0087 }
            r1 = 0
            r3 = 0
            com.clevertap.android.sdk.r0$a r4 = r8.f11651a     // Catch:{ SQLiteException -> 0x0054 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0054 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.String r6 = "SELECT * FROM "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0054 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.String r6 = " ORDER BY "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.String r6 = "created_at"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.String r6 = " DESC LIMIT 1"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0054 }
            android.database.Cursor r3 = r4.rawQuery(r5, r3)     // Catch:{ SQLiteException -> 0x0054 }
            if (r3 == 0) goto L_0x0047
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0054 }
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = "created_at"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0054 }
            long r0 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0054 }
            r1 = r0
        L_0x0047:
            com.clevertap.android.sdk.r0$a r0 = r8.f11651a     // Catch:{ all -> 0x0087 }
            r0.close()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x007a
        L_0x004e:
            r3.close()     // Catch:{ all -> 0x0087 }
            goto L_0x007a
        L_0x0052:
            r0 = move-exception
            goto L_0x007c
        L_0x0054:
            r4 = move-exception
            com.clevertap.android.sdk.h1 r5 = r8.m15492t()     // Catch:{ all -> 0x0052 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r6.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r7 = "Could not fetch records out of database "
            r6.append(r7)     // Catch:{ all -> 0x0052 }
            r6.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "."
            r6.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0052 }
            r5.mo12317c(r0, r4)     // Catch:{ all -> 0x0052 }
            com.clevertap.android.sdk.r0$a r0 = r8.f11651a     // Catch:{ all -> 0x0087 }
            r0.close()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x007a
            goto L_0x004e
        L_0x007a:
            monitor-exit(r8)
            return r1
        L_0x007c:
            com.clevertap.android.sdk.r0$a r1 = r8.f11651a     // Catch:{ all -> 0x0087 }
            r1.close()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x008b
        L_0x008a:
            throw r0
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12572c():long");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r6 = m15492t();
        r1 = new java.lang.StringBuilder();
        r1.append("Error removing user profile from ");
        r1.append(r0);
        r1.append(" Recreating DB");
        r6.mo12314c(r1.toString());
        r5.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6 = r5.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12575d(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.USER_PROFILES     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0051 }
            com.clevertap.android.sdk.r0$a r1 = r5.f11651a     // Catch:{ SQLiteException -> 0x0024 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0024 }
            java.lang.String r2 = "_id = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0024 }
            r4 = 0
            r3[r4] = r6     // Catch:{ SQLiteException -> 0x0024 }
            r1.delete(r0, r2, r3)     // Catch:{ SQLiteException -> 0x0024 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x0051 }
        L_0x001e:
            r6.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0049
        L_0x0022:
            r6 = move-exception
            goto L_0x004b
        L_0x0024:
            com.clevertap.android.sdk.h1 r6 = r5.m15492t()     // Catch:{ all -> 0x0022 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "Error removing user profile from "
            r1.append(r2)     // Catch:{ all -> 0x0022 }
            r1.append(r0)     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = " Recreating DB"
            r1.append(r0)     // Catch:{ all -> 0x0022 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0022 }
            r6.mo12314c(r0)     // Catch:{ all -> 0x0022 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x0022 }
            r6.mo12577b()     // Catch:{ all -> 0x0022 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x0051 }
            goto L_0x001e
        L_0x0049:
            monitor-exit(r5)
            return
        L_0x004b:
            com.clevertap.android.sdk.r0$a r0 = r5.f11651a     // Catch:{ all -> 0x0051 }
            r0.close()     // Catch:{ all -> 0x0051 }
            throw r6     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0055
        L_0x0054:
            throw r6
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12575d(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r1 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        if (r1 == null) goto L_0x0093;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String m15477e(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00a0 }
            r1 = 0
            java.lang.String r2 = ""
            com.clevertap.android.sdk.r0$a r3 = r7.f11651a     // Catch:{ SQLiteException -> 0x006d }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006d }
            r4.<init>()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r5 = "SELECT * FROM "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x006d }
            r4.append(r0)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r5 = " WHERE "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r5 = "data"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r5 = " = ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x006d }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x006d }
            r6 = 0
            r5[r6] = r8     // Catch:{ SQLiteException -> 0x006d }
            android.database.Cursor r1 = r3.rawQuery(r4, r5)     // Catch:{ SQLiteException -> 0x006d }
            if (r1 == 0) goto L_0x004c
            boolean r8 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006d }
            if (r8 == 0) goto L_0x004c
            java.lang.String r8 = "data"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = r1.getString(r8)     // Catch:{ SQLiteException -> 0x006d }
        L_0x004c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006d }
            r8.<init>()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r3 = "Fetching PID for check - "
            r8.append(r3)     // Catch:{ SQLiteException -> 0x006d }
            r8.append(r2)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x006d }
            com.clevertap.android.sdk.C3111h1.m14938f(r8)     // Catch:{ SQLiteException -> 0x006d }
            com.clevertap.android.sdk.r0$a r8 = r7.f11651a     // Catch:{ all -> 0x00a0 }
            r8.close()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0093
        L_0x0067:
            r1.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x0093
        L_0x006b:
            r8 = move-exception
            goto L_0x0095
        L_0x006d:
            r8 = move-exception
            com.clevertap.android.sdk.h1 r3 = r7.m15492t()     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r4.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "Could not fetch records out of database "
            r4.append(r5)     // Catch:{ all -> 0x006b }
            r4.append(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "."
            r4.append(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x006b }
            r3.mo12317c(r0, r8)     // Catch:{ all -> 0x006b }
            com.clevertap.android.sdk.r0$a r8 = r7.f11651a     // Catch:{ all -> 0x00a0 }
            r8.close()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0093
            goto L_0x0067
        L_0x0093:
            monitor-exit(r7)
            return r2
        L_0x0095:
            com.clevertap.android.sdk.r0$a r0 = r7.f11651a     // Catch:{ all -> 0x00a0 }
            r0.close()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x009f
            r1.close()     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r8     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00a4
        L_0x00a3:
            throw r8
        L_0x00a4:
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.m15477e(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|24|(1:26)(1:27)|(4:28|29|(2:31|32)|33)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2 = m15492t();
        r3 = new java.lang.StringBuilder();
        r3.append("Error adding data to table ");
        r3.append(r8);
        r3.append(" Recreating DB");
        r2.mo12314c(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r7 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r6.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r1 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r7 = r6.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r1 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        r6.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b A[SYNTHETIC, Splitter:B:39:0x009b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo12557a(org.json.JSONObject r7, com.clevertap.android.sdk.C3211r0.C3213b r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.m15490r()     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x000f
            java.lang.String r7 = "There is not enough space left on the device to store data, data discarded"
            com.clevertap.android.sdk.C3111h1.m14938f(r7)     // Catch:{ all -> 0x00a4 }
            r7 = -2
            monitor-exit(r6)
            return r7
        L_0x000f:
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x00a4 }
            r0 = -1
            r1 = 0
            com.clevertap.android.sdk.r0$a r2 = r6.f11651a     // Catch:{ SQLiteException -> 0x0063 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0063 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0063 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r4 = "data"
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0063 }
            r3.put(r4, r7)     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r7 = "created_at"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0063 }
            r3.put(r7, r4)     // Catch:{ SQLiteException -> 0x0063 }
            r2.insert(r8, r1, r3)     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0063 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r3 = "SELECT COUNT(*) FROM "
            r7.append(r3)     // Catch:{ SQLiteException -> 0x0063 }
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0063 }
            android.database.Cursor r7 = r2.rawQuery(r7, r1)     // Catch:{ SQLiteException -> 0x0063 }
            r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0064 }
            r2 = 0
            int r0 = r7.getInt(r2)     // Catch:{ SQLiteException -> 0x0064 }
            if (r7 == 0) goto L_0x005b
            r7.close()     // Catch:{ all -> 0x00a4 }
        L_0x005b:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00a4 }
        L_0x005d:
            r7.close()     // Catch:{ all -> 0x00a4 }
            goto L_0x0095
        L_0x0061:
            r8 = move-exception
            goto L_0x0099
        L_0x0063:
            r7 = r1
        L_0x0064:
            com.clevertap.android.sdk.h1 r2 = r6.m15492t()     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r3.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "Error adding data to table "
            r3.append(r4)     // Catch:{ all -> 0x0097 }
            r3.append(r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = " Recreating DB"
            r3.append(r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0097 }
            r2.mo12314c(r8)     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x0087
            r7.close()     // Catch:{ all -> 0x0097 }
            goto L_0x0088
        L_0x0087:
            r1 = r7
        L_0x0088:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x0061 }
            r7.mo12577b()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch:{ all -> 0x00a4 }
        L_0x0092:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00a4 }
            goto L_0x005d
        L_0x0095:
            monitor-exit(r6)
            return r0
        L_0x0097:
            r8 = move-exception
            r1 = r7
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ all -> 0x00a4 }
        L_0x009e:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00a4 }
            r7.close()     // Catch:{ all -> 0x00a4 }
            throw r8     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00a8
        L_0x00a7:
            throw r7
        L_0x00a8:
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12557a(org.json.JSONObject, com.clevertap.android.sdk.r0$b):int");
    }

    private C3211r0(Context context, String str) {
        this.f11653c = true;
        this.f11651a = new C3212a(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = m15492t();
        r2 = new java.lang.StringBuilder();
        r2.append("Error adding data to table ");
        r2.append(r0);
        r2.append(" Recreating DB");
        r1.mo12314c(r2.toString());
        r6.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = r6.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12574d() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.m15490r()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0012
            com.clevertap.android.sdk.h1 r0 = r6.m15492t()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "There is not enough space left on the device to store data, data discarded"
            r0.mo12314c(r1)     // Catch:{ all -> 0x0069 }
            monitor-exit(r6)
            return
        L_0x0012:
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.UNINSTALL_TS     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0069 }
            com.clevertap.android.sdk.r0$a r1 = r6.f11651a     // Catch:{ SQLiteException -> 0x003c }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003c }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x003c }
            r2.<init>()     // Catch:{ SQLiteException -> 0x003c }
            java.lang.String r3 = "created_at"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x003c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x003c }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x003c }
            r3 = 0
            r1.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x003c }
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ all -> 0x0069 }
        L_0x0036:
            r0.close()     // Catch:{ all -> 0x0069 }
            goto L_0x0061
        L_0x003a:
            r0 = move-exception
            goto L_0x0063
        L_0x003c:
            com.clevertap.android.sdk.h1 r1 = r6.m15492t()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r2.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "Error adding data to table "
            r2.append(r3)     // Catch:{ all -> 0x003a }
            r2.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = " Recreating DB"
            r2.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x003a }
            r1.mo12314c(r0)     // Catch:{ all -> 0x003a }
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ all -> 0x003a }
            r0.mo12577b()     // Catch:{ all -> 0x003a }
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ all -> 0x0069 }
            goto L_0x0036
        L_0x0061:
            monitor-exit(r6)
            return
        L_0x0063:
            com.clevertap.android.sdk.r0$a r1 = r6.f11651a     // Catch:{ all -> 0x0069 }
            r1.close()     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x006d
        L_0x006c:
            throw r0
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12574d():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized ArrayList<C3129l0> mo12573c(String str) {
        ArrayList<C3129l0> arrayList;
        String name = C3213b.INBOX_MESSAGES.getName();
        arrayList = new ArrayList<>();
        try {
            SQLiteDatabase writableDatabase = this.f11651a.getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM ");
            sb.append(name);
            sb.append(" WHERE ");
            sb.append(f11635k);
            sb.append(" = ? ORDER BY ");
            sb.append(f11629e);
            sb.append(" DESC");
            Cursor rawQuery = writableDatabase.rawQuery(sb.toString(), new String[]{str});
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    C3129l0 l0Var = new C3129l0();
                    l0Var.mo12365b(rawQuery.getString(rawQuery.getColumnIndex("_id")));
                    l0Var.mo12361a(new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data"))));
                    l0Var.mo12366b(new JSONObject(rawQuery.getString(rawQuery.getColumnIndex(f11637m))));
                    l0Var.mo12359a(rawQuery.getLong(rawQuery.getColumnIndex(f11629e)));
                    l0Var.mo12364b(rawQuery.getLong(rawQuery.getColumnIndex("expires")));
                    l0Var.mo12358a(rawQuery.getInt(rawQuery.getColumnIndex(f11632h)));
                    l0Var.mo12370d(rawQuery.getString(rawQuery.getColumnIndex(f11635k)));
                    l0Var.mo12368c(rawQuery.getString(rawQuery.getColumnIndex("tags")));
                    l0Var.mo12360a(rawQuery.getString(rawQuery.getColumnIndex(f11636l)));
                    arrayList.add(l0Var);
                }
                rawQuery.close();
            }
            this.f11651a.close();
        } catch (SQLiteException e) {
            C3111h1 t = m15492t();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error retrieving records from ");
            sb2.append(name);
            t.mo12317c(sb2.toString(), (Throwable) e);
            this.f11651a.close();
            return null;
        } catch (JSONException e2) {
            try {
                C3111h1 t2 = m15492t();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error retrieving records from ");
                sb3.append(name);
                t2.mo12315c(sb3.toString(), e2.getMessage());
                return null;
            } finally {
                this.f11651a.close();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = m15492t();
        r1 = new java.lang.StringBuilder();
        r1.append("Error removing all events from table ");
        r1.append(r4);
        r1.append(" Recreating DB");
        r0.mo12314c(r1.toString());
        m15491s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r3.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12569b(com.clevertap.android.sdk.C3211r0.C3213b r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0042 }
            com.clevertap.android.sdk.r0$a r0 = r3.f11651a     // Catch:{ SQLiteException -> 0x0017 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0017 }
            r1 = 0
            r0.delete(r4, r1, r1)     // Catch:{ SQLiteException -> 0x0017 }
            com.clevertap.android.sdk.r0$a r4 = r3.f11651a     // Catch:{ all -> 0x0042 }
        L_0x0011:
            r4.close()     // Catch:{ all -> 0x0042 }
            goto L_0x003a
        L_0x0015:
            r4 = move-exception
            goto L_0x003c
        L_0x0017:
            com.clevertap.android.sdk.h1 r0 = r3.m15492t()     // Catch:{ all -> 0x0015 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "Error removing all events from table "
            r1.append(r2)     // Catch:{ all -> 0x0015 }
            r1.append(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = " Recreating DB"
            r1.append(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0015 }
            r0.mo12314c(r4)     // Catch:{ all -> 0x0015 }
            r3.m15491s()     // Catch:{ all -> 0x0015 }
            com.clevertap.android.sdk.r0$a r4 = r3.f11651a     // Catch:{ all -> 0x0042 }
            goto L_0x0011
        L_0x003a:
            monitor-exit(r3)
            return
        L_0x003c:
            com.clevertap.android.sdk.r0$a r0 = r3.f11651a     // Catch:{ all -> 0x0042 }
            r0.close()     // Catch:{ all -> 0x0042 }
            throw r4     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0046
        L_0x0045:
            throw r4
        L_0x0046:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12569b(com.clevertap.android.sdk.r0$b):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r2 != 0) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [java.lang.String[], android.database.Cursor]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, java.lang.String[]]
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String[] mo12571b() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f11653c     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x000a
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00c3 }
            monitor-exit(r7)
            return r0
        L_0x000a:
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00c3 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00c3 }
            r1.<init>()     // Catch:{ all -> 0x00c3 }
            r2 = 0
            com.clevertap.android.sdk.r0$a r3 = r7.f11651a     // Catch:{ SQLiteException -> 0x0084 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0084 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r5 = "SELECT * FROM "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0084 }
            r4.append(r0)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r5 = " WHERE "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r5 = "isRead"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r5 = " = 0"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0084 }
            android.database.Cursor r2 = r3.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x0084 }
            if (r2 == 0) goto L_0x0077
        L_0x0042:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0084 }
            if (r3 == 0) goto L_0x0074
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0084 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r4 = "Fetching PID - "
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r4 = "data"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x0084 }
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0084 }
            com.clevertap.android.sdk.C3111h1.m14938f(r3)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r3 = "data"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0084 }
            r1.add(r3)     // Catch:{ SQLiteException -> 0x0084 }
            goto L_0x0042
        L_0x0074:
            r2.close()     // Catch:{ SQLiteException -> 0x0084 }
        L_0x0077:
            com.clevertap.android.sdk.r0$a r0 = r7.f11651a     // Catch:{ all -> 0x00c3 }
            r0.close()     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00aa
        L_0x007e:
            r2.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00aa
        L_0x0082:
            r0 = move-exception
            goto L_0x00b8
        L_0x0084:
            r3 = move-exception
            com.clevertap.android.sdk.h1 r4 = r7.m15492t()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r5.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = "Could not fetch records out of database "
            r5.append(r6)     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "."
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0082 }
            r4.mo12317c(r0, r3)     // Catch:{ all -> 0x0082 }
            com.clevertap.android.sdk.r0$a r0 = r7.f11651a     // Catch:{ all -> 0x00c3 }
            r0.close()     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00aa
            goto L_0x007e
        L_0x00aa:
            int r0 = r1.size()     // Catch:{ all -> 0x00c3 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00c3 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00c3 }
            monitor-exit(r7)
            return r0
        L_0x00b8:
            com.clevertap.android.sdk.r0$a r1 = r7.f11651a     // Catch:{ all -> 0x00c3 }
            r1.close()     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00c2
            r2.close()     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x00c7
        L_0x00c6:
            throw r0
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12571b():java.lang.String[]");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7 = m15492t();
        r8 = new java.lang.StringBuilder();
        r8.append("Error adding data to table ");
        r8.append(r2);
        r8.append(" Recreating DB");
        r7.mo12314c(r8.toString());
        r6.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7 = r6.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0047 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo12558a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = -1
            if (r7 != 0) goto L_0x0007
            monitor-exit(r6)
            return r0
        L_0x0007:
            boolean r2 = r6.m15490r()     // Catch:{ all -> 0x0074 }
            if (r2 != 0) goto L_0x001a
            com.clevertap.android.sdk.h1 r7 = r6.m15492t()     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "There is not enough space left on the device to store data, data discarded"
            r7.mo12314c(r8)     // Catch:{ all -> 0x0074 }
            r7 = -2
            monitor-exit(r6)
            return r7
        L_0x001a:
            com.clevertap.android.sdk.r0$b r2 = com.clevertap.android.sdk.C3211r0.C3213b.USER_PROFILES     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0074 }
            com.clevertap.android.sdk.r0$a r3 = r6.f11651a     // Catch:{ SQLiteException -> 0x0047 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0047 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0047 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0047 }
            java.lang.String r5 = "data"
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x0047 }
            r4.put(r5, r8)     // Catch:{ SQLiteException -> 0x0047 }
            java.lang.String r8 = "_id"
            r4.put(r8, r7)     // Catch:{ SQLiteException -> 0x0047 }
            r7 = 0
            r8 = 5
            long r0 = r3.insertWithOnConflict(r2, r7, r4, r8)     // Catch:{ SQLiteException -> 0x0047 }
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x0074 }
        L_0x0041:
            r7.close()     // Catch:{ all -> 0x0074 }
            goto L_0x006c
        L_0x0045:
            r7 = move-exception
            goto L_0x006e
        L_0x0047:
            com.clevertap.android.sdk.h1 r7 = r6.m15492t()     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r8.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "Error adding data to table "
            r8.append(r3)     // Catch:{ all -> 0x0045 }
            r8.append(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = " Recreating DB"
            r8.append(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0045 }
            r7.mo12314c(r8)     // Catch:{ all -> 0x0045 }
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x0045 }
            r7.mo12577b()     // Catch:{ all -> 0x0045 }
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x0074 }
            goto L_0x0041
        L_0x006c:
            monitor-exit(r6)
            return r0
        L_0x006e:
            com.clevertap.android.sdk.r0$a r8 = r6.f11651a     // Catch:{ all -> 0x0074 }
            r8.close()     // Catch:{ all -> 0x0074 }
            throw r7     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0078
        L_0x0077:
            throw r7
        L_0x0078:
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12558a(java.lang.String, org.json.JSONObject):long");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo12570b(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            if (r9 == 0) goto L_0x0066
            if (r10 != 0) goto L_0x0007
            goto L_0x0066
        L_0x0007:
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0063 }
            com.clevertap.android.sdk.r0$a r2 = r8.f11651a     // Catch:{ SQLiteException -> 0x003d }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003d }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x003d }
            r3.<init>()     // Catch:{ SQLiteException -> 0x003d }
            java.lang.String r4 = "isRead"
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x003d }
            r3.put(r4, r6)     // Catch:{ SQLiteException -> 0x003d }
            com.clevertap.android.sdk.r0$b r4 = com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES     // Catch:{ SQLiteException -> 0x003d }
            java.lang.String r4 = r4.getName()     // Catch:{ SQLiteException -> 0x003d }
            java.lang.String r6 = "_id = ? AND messageUser = ?"
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x003d }
            r7[r0] = r9     // Catch:{ SQLiteException -> 0x003d }
            r7[r5] = r10     // Catch:{ SQLiteException -> 0x003d }
            r2.update(r4, r3, r6, r7)     // Catch:{ SQLiteException -> 0x003d }
            com.clevertap.android.sdk.r0$a r9 = r8.f11651a     // Catch:{ all -> 0x0063 }
            r9.close()     // Catch:{ all -> 0x0063 }
            monitor-exit(r8)
            return r5
        L_0x003b:
            r9 = move-exception
            goto L_0x005d
        L_0x003d:
            r9 = move-exception
            com.clevertap.android.sdk.h1 r10 = r8.m15492t()     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "Error removing stale records from "
            r2.append(r3)     // Catch:{ all -> 0x003b }
            r2.append(r1)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x003b }
            r10.mo12317c(r1, r9)     // Catch:{ all -> 0x003b }
            com.clevertap.android.sdk.r0$a r9 = r8.f11651a     // Catch:{ all -> 0x0063 }
            r9.close()     // Catch:{ all -> 0x0063 }
            monitor-exit(r8)
            return r0
        L_0x005d:
            com.clevertap.android.sdk.r0$a r10 = r8.f11651a     // Catch:{ all -> 0x0063 }
            r10.close()     // Catch:{ all -> 0x0063 }
            throw r9     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x0066:
            monitor-exit(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12570b(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = m15492t();
        r0 = new java.lang.StringBuilder();
        r0.append("Error removing sent data from table ");
        r0.append(r5);
        r0.append(" Recreating DB");
        r4.mo12314c(r0.toString());
        m15491s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r3.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12563a(java.lang.String r4, com.clevertap.android.sdk.C3211r0.C3213b r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0053 }
            com.clevertap.android.sdk.r0$a r0 = r3.f11651a     // Catch:{ SQLiteException -> 0x0028 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0028 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.String r2 = "_id <= "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x0028 }
            r1.append(r4)     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.String r4 = r1.toString()     // Catch:{ SQLiteException -> 0x0028 }
            r1 = 0
            r0.delete(r5, r4, r1)     // Catch:{ SQLiteException -> 0x0028 }
            com.clevertap.android.sdk.r0$a r4 = r3.f11651a     // Catch:{ all -> 0x0053 }
        L_0x0022:
            r4.close()     // Catch:{ all -> 0x0053 }
            goto L_0x004b
        L_0x0026:
            r4 = move-exception
            goto L_0x004d
        L_0x0028:
            com.clevertap.android.sdk.h1 r4 = r3.m15492t()     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r0.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "Error removing sent data from table "
            r0.append(r1)     // Catch:{ all -> 0x0026 }
            r0.append(r5)     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = " Recreating DB"
            r0.append(r5)     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0026 }
            r4.mo12314c(r5)     // Catch:{ all -> 0x0026 }
            r3.m15491s()     // Catch:{ all -> 0x0026 }
            com.clevertap.android.sdk.r0$a r4 = r3.f11651a     // Catch:{ all -> 0x0053 }
            goto L_0x0022
        L_0x004b:
            monitor-exit(r3)
            return
        L_0x004d:
            com.clevertap.android.sdk.r0$a r5 = r3.f11651a     // Catch:{ all -> 0x0053 }
            r5.close()     // Catch:{ all -> 0x0053 }
            throw r4     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0057
        L_0x0056:
            throw r4
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12563a(java.lang.String, com.clevertap.android.sdk.r0$b):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12561a(C3213b bVar) {
        m15475a(bVar, (long) f11630f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12560a() {
        m15475a(C3213b.PUSH_NOTIFICATIONS, 0);
    }

    /* renamed from: a */
    private void m15475a(C3213b bVar, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        String name = bVar.getName();
        try {
            SQLiteDatabase writableDatabase = this.f11651a.getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("created_at <= ");
            sb.append(currentTimeMillis);
            writableDatabase.delete(name, sb.toString(), null);
        } catch (SQLiteException e) {
            C3111h1 t = m15492t();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error removing stale event records from ");
            sb2.append(name);
            sb2.append(". Recreating DB.");
            t.mo12317c(sb2.toString(), (Throwable) e);
            m15491s();
        } catch (Throwable th) {
            this.f11651a.close();
            throw th;
        }
        this.f11651a.close();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[Catch:{ SQLiteException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[SYNTHETIC, Splitter:B:32:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONObject mo12559a(com.clevertap.android.sdk.C3211r0.C3213b r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00b6 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x00b6 }
            r0.<init>()     // Catch:{ all -> 0x00b6 }
            r1 = 0
            com.clevertap.android.sdk.r0$a r2 = r6.f11651a     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r4 = "SELECT * FROM "
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r4 = " ORDER BY "
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r4 = "created_at"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r4 = " ASC LIMIT "
            r3.append(r4)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r3.append(r8)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            java.lang.String r8 = r3.toString()     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            android.database.Cursor r8 = r2.rawQuery(r8, r1)     // Catch:{ SQLiteException -> 0x0072, all -> 0x006f }
            r2 = r1
        L_0x0039:
            boolean r3 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x006d }
            if (r3 == 0) goto L_0x0062
            boolean r3 = r8.isLast()     // Catch:{ SQLiteException -> 0x006d }
            if (r3 == 0) goto L_0x004f
            java.lang.String r2 = "_id"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ SQLiteException -> 0x006d }
        L_0x004f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r4 = "data"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r4 = r8.getString(r4)     // Catch:{ JSONException -> 0x0039 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0039 }
            r0.put(r3)     // Catch:{ JSONException -> 0x0039 }
            goto L_0x0039
        L_0x0062:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00b6 }
            r7.close()     // Catch:{ all -> 0x00b6 }
            if (r8 == 0) goto L_0x009c
            r8.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x009c
        L_0x006d:
            r2 = move-exception
            goto L_0x0074
        L_0x006f:
            r7 = move-exception
            r8 = r1
            goto L_0x00ab
        L_0x0072:
            r2 = move-exception
            r8 = r1
        L_0x0074:
            com.clevertap.android.sdk.h1 r3 = r6.m15492t()     // Catch:{ all -> 0x00aa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            r4.<init>()     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = "Could not fetch records out of database "
            r4.append(r5)     // Catch:{ all -> 0x00aa }
            r4.append(r7)     // Catch:{ all -> 0x00aa }
            java.lang.String r7 = "."
            r4.append(r7)     // Catch:{ all -> 0x00aa }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00aa }
            r3.mo12317c(r7, r2)     // Catch:{ all -> 0x00aa }
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00b6 }
            r7.close()     // Catch:{ all -> 0x00b6 }
            if (r8 == 0) goto L_0x009b
            r8.close()     // Catch:{ all -> 0x00b6 }
        L_0x009b:
            r2 = r1
        L_0x009c:
            if (r2 == 0) goto L_0x00a8
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a8 }
            r7.<init>()     // Catch:{ JSONException -> 0x00a8 }
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x00a8 }
            monitor-exit(r6)
            return r7
        L_0x00a8:
            monitor-exit(r6)
            return r1
        L_0x00aa:
            r7 = move-exception
        L_0x00ab:
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ all -> 0x00b6 }
            r0.close()     // Catch:{ all -> 0x00b6 }
            if (r8 == 0) goto L_0x00b5
            r8.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r7     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00ba
        L_0x00b9:
            throw r7
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12559a(com.clevertap.android.sdk.r0$b, int):org.json.JSONObject");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6 = m15492t();
        r7 = new java.lang.StringBuilder();
        r7.append("Error adding data to table ");
        r7.append(r0);
        r7.append(" Recreating DB");
        r6.mo12314c(r7.toString());
        r5.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6 = r5.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12562a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r5.m15490r()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0016
            com.clevertap.android.sdk.h1 r6 = r5.m15492t()     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = "There is not enough space left on the device to store data, data discarded"
            r6.mo12314c(r7)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r5)
            return
        L_0x0016:
            com.clevertap.android.sdk.r0$b r0 = com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00a5 }
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x002a
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a5 }
            r1 = 345600000(0x14997000, double:1.70749087E-315)
            long r7 = r7 + r1
        L_0x002a:
            com.clevertap.android.sdk.r0$a r1 = r5.f11651a     // Catch:{ SQLiteException -> 0x0078 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0078 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0078 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r3 = "data"
            r2.put(r3, r6)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r3 = "created_at"
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0078 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r3 = "isRead"
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0078 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x0078 }
            r3 = 0
            r1.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x0078 }
            r1 = 1
            r5.f11653c = r1     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0078 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r2 = "Stored PN - "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r1.append(r6)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r6 = " with TTL - "
            r1.append(r6)     // Catch:{ SQLiteException -> 0x0078 }
            r1.append(r7)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r6 = r1.toString()     // Catch:{ SQLiteException -> 0x0078 }
            com.clevertap.android.sdk.C3111h1.m14938f(r6)     // Catch:{ SQLiteException -> 0x0078 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x00a5 }
        L_0x0072:
            r6.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x009d
        L_0x0076:
            r6 = move-exception
            goto L_0x009f
        L_0x0078:
            com.clevertap.android.sdk.h1 r6 = r5.m15492t()     // Catch:{ all -> 0x0076 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r7.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r8 = "Error adding data to table "
            r7.append(r8)     // Catch:{ all -> 0x0076 }
            r7.append(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r8 = " Recreating DB"
            r7.append(r8)     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0076 }
            r6.mo12314c(r7)     // Catch:{ all -> 0x0076 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x0076 }
            r6.mo12577b()     // Catch:{ all -> 0x0076 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x00a5 }
            goto L_0x0072
        L_0x009d:
            monitor-exit(r5)
            return
        L_0x009f:
            com.clevertap.android.sdk.r0$a r7 = r5.f11651a     // Catch:{ all -> 0x00a5 }
            r7.close()     // Catch:{ all -> 0x00a5 }
            throw r6     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00a9
        L_0x00a8:
            throw r6
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12562a(java.lang.String, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r8 = m15492t();
        r0 = new java.lang.StringBuilder();
        r0.append("Error adding data to table ");
        r0.append(com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS.getName());
        r0.append(" Recreating DB");
        r8.mo12314c(r0.toString());
        r7.f11651a.mo12577b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r8 = r7.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12565a(java.lang.String[] r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r8.length     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0006
            monitor-exit(r7)
            return
        L_0x0006:
            boolean r0 = r7.m15490r()     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0013
            java.lang.String r8 = "There is not enough space left on the device to store data, data discarded"
            com.clevertap.android.sdk.C3111h1.m14938f(r8)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r7)
            return
        L_0x0013:
            com.clevertap.android.sdk.r0$a r0 = r7.f11651a     // Catch:{ SQLiteException -> 0x006d }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x006d }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x006d }
            r1.<init>()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = "isRead"
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x006d }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006d }
            r2.<init>()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r4 = "?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x006d }
            r4 = 0
            r5 = 0
        L_0x0034:
            int r6 = r8.length     // Catch:{ SQLiteException -> 0x006d }
            int r6 = r6 - r3
            if (r5 >= r6) goto L_0x0040
            java.lang.String r6 = ", ?"
            r2.append(r6)     // Catch:{ SQLiteException -> 0x006d }
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0040:
            com.clevertap.android.sdk.r0$b r3 = com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r3 = r3.getName()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006d }
            r5.<init>()     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r6 = "data IN ( "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x006d }
            r5.append(r2)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = " )"
            r5.append(r2)     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r2 = r5.toString()     // Catch:{ SQLiteException -> 0x006d }
            r0.update(r3, r1, r2, r8)     // Catch:{ SQLiteException -> 0x006d }
            r7.f11653c = r4     // Catch:{ SQLiteException -> 0x006d }
            com.clevertap.android.sdk.r0$a r8 = r7.f11651a     // Catch:{ all -> 0x00a0 }
        L_0x0067:
            r8.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x0098
        L_0x006b:
            r8 = move-exception
            goto L_0x009a
        L_0x006d:
            com.clevertap.android.sdk.h1 r8 = r7.m15492t()     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "Error adding data to table "
            r0.append(r1)     // Catch:{ all -> 0x006b }
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.PUSH_NOTIFICATIONS     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006b }
            r0.append(r1)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = " Recreating DB"
            r0.append(r1)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006b }
            r8.mo12314c(r0)     // Catch:{ all -> 0x006b }
            com.clevertap.android.sdk.r0$a r8 = r7.f11651a     // Catch:{ all -> 0x006b }
            r8.mo12577b()     // Catch:{ all -> 0x006b }
            com.clevertap.android.sdk.r0$a r8 = r7.f11651a     // Catch:{ all -> 0x00a0 }
            goto L_0x0067
        L_0x0098:
            monitor-exit(r7)
            return
        L_0x009a:
            com.clevertap.android.sdk.r0$a r0 = r7.f11651a     // Catch:{ all -> 0x00a0 }
            r0.close()     // Catch:{ all -> 0x00a0 }
            throw r8     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00a4
        L_0x00a3:
            throw r8
        L_0x00a4:
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12565a(java.lang.String[]):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized boolean mo12566a(String str) {
        return str.equals(m15477e(str));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a1, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r7 = m15492t();
        r0 = new java.lang.StringBuilder();
        r0.append("Error adding data to table ");
        r0.append(com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES.getName());
        r7.mo12314c(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = r6.f11651a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f11651a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        throw r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00a3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo12564a(java.util.ArrayList<com.clevertap.android.sdk.C3129l0> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.m15490r()     // Catch:{ all -> 0x00cc }
            if (r0 != 0) goto L_0x000e
            java.lang.String r7 = "There is not enough space left on the device to store data, data discarded"
            com.clevertap.android.sdk.C3111h1.m14938f(r7)     // Catch:{ all -> 0x00cc }
            monitor-exit(r6)
            return
        L_0x000e:
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ SQLiteException -> 0x00a3 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00a3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SQLiteException -> 0x00a3 }
        L_0x0018:
            boolean r1 = r7.hasNext()     // Catch:{ SQLiteException -> 0x00a3 }
            if (r1 == 0) goto L_0x009b
            java.lang.Object r1 = r7.next()     // Catch:{ SQLiteException -> 0x00a3 }
            com.clevertap.android.sdk.l0 r1 = (com.clevertap.android.sdk.C3129l0) r1     // Catch:{ SQLiteException -> 0x00a3 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x00a3 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "_id"
            java.lang.String r4 = r1.mo12371e()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "data"
            org.json.JSONObject r4 = r1.mo12372f()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "wzrkParams"
            org.json.JSONObject r4 = r1.mo12375i()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "campaignId"
            java.lang.String r4 = r1.mo12363b()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "tags"
            java.lang.String r4 = r1.mo12373g()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "isRead"
            int r4 = r1.mo12376j()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "expires"
            long r4 = r1.mo12369d()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "created_at"
            long r4 = r1.mo12367c()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r3 = "messageUser"
            java.lang.String r1 = r1.mo12374h()     // Catch:{ SQLiteException -> 0x00a3 }
            r2.put(r3, r1)     // Catch:{ SQLiteException -> 0x00a3 }
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r1 = r1.getName()     // Catch:{ SQLiteException -> 0x00a3 }
            r3 = 0
            r4 = 5
            r0.insertWithOnConflict(r1, r3, r2, r4)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x0018
        L_0x009b:
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00cc }
        L_0x009d:
            r7.close()     // Catch:{ all -> 0x00cc }
            goto L_0x00c4
        L_0x00a1:
            r7 = move-exception
            goto L_0x00c6
        L_0x00a3:
            com.clevertap.android.sdk.h1 r7 = r6.m15492t()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r0.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "Error adding data to table "
            r0.append(r1)     // Catch:{ all -> 0x00a1 }
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00a1 }
            r0.append(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a1 }
            r7.mo12314c(r0)     // Catch:{ all -> 0x00a1 }
            com.clevertap.android.sdk.r0$a r7 = r6.f11651a     // Catch:{ all -> 0x00cc }
            goto L_0x009d
        L_0x00c4:
            monitor-exit(r6)
            return
        L_0x00c6:
            com.clevertap.android.sdk.r0$a r0 = r6.f11651a     // Catch:{ all -> 0x00cc }
            r0.close()     // Catch:{ all -> 0x00cc }
            throw r7     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00d0
        L_0x00cf:
            throw r7
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12564a(java.util.ArrayList):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo12567a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0052
            if (r7 != 0) goto L_0x0007
            goto L_0x0052
        L_0x0007:
            com.clevertap.android.sdk.r0$b r1 = com.clevertap.android.sdk.C3211r0.C3213b.INBOX_MESSAGES     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x004f }
            com.clevertap.android.sdk.r0$a r2 = r5.f11651a     // Catch:{ SQLiteException -> 0x0029 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0029 }
            java.lang.String r3 = "_id = ? AND messageUser = ?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0029 }
            r4[r0] = r6     // Catch:{ SQLiteException -> 0x0029 }
            r6 = 1
            r4[r6] = r7     // Catch:{ SQLiteException -> 0x0029 }
            r2.delete(r1, r3, r4)     // Catch:{ SQLiteException -> 0x0029 }
            com.clevertap.android.sdk.r0$a r7 = r5.f11651a     // Catch:{ all -> 0x004f }
            r7.close()     // Catch:{ all -> 0x004f }
            monitor-exit(r5)
            return r6
        L_0x0027:
            r6 = move-exception
            goto L_0x0049
        L_0x0029:
            r6 = move-exception
            com.clevertap.android.sdk.h1 r7 = r5.m15492t()     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r2.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "Error removing stale records from "
            r2.append(r3)     // Catch:{ all -> 0x0027 }
            r2.append(r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0027 }
            r7.mo12317c(r1, r6)     // Catch:{ all -> 0x0027 }
            com.clevertap.android.sdk.r0$a r6 = r5.f11651a     // Catch:{ all -> 0x004f }
            r6.close()     // Catch:{ all -> 0x004f }
            monitor-exit(r5)
            return r0
        L_0x0049:
            com.clevertap.android.sdk.r0$a r7 = r5.f11651a     // Catch:{ all -> 0x004f }
            r7.close()     // Catch:{ all -> 0x004f }
            throw r6     // Catch:{ all -> 0x004f }
        L_0x004f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0052:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3211r0.mo12567a(java.lang.String, java.lang.String):boolean");
    }
}
