package com.amplitude.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.f */
/* compiled from: DatabaseHelper */
class C2877f extends SQLiteOpenHelper {

    /* renamed from: e */
    static final Map<String, C2877f> f10150e = new HashMap();

    /* renamed from: f */
    private static final String f10151f = "com.amplitude.api.DatabaseHelper";

    /* renamed from: g */
    protected static final String f10152g = "store";

    /* renamed from: h */
    protected static final String f10153h = "long_store";

    /* renamed from: i */
    private static final String f10154i = "key";

    /* renamed from: j */
    private static final String f10155j = "value";

    /* renamed from: k */
    protected static final String f10156k = "events";

    /* renamed from: l */
    protected static final String f10157l = "identifys";

    /* renamed from: m */
    private static final String f10158m = "id";

    /* renamed from: n */
    private static final String f10159n = "event";

    /* renamed from: o */
    private static final String f10160o = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);";

    /* renamed from: p */
    private static final String f10161p = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);";

    /* renamed from: q */
    private static final String f10162q = "CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";

    /* renamed from: r */
    private static final String f10163r = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";

    /* renamed from: s */
    private static final C2875d f10164s = C2875d.m13566a();

    /* renamed from: a */
    File f10165a;

    /* renamed from: b */
    private String f10166b;

    /* renamed from: c */
    private boolean f10167c;

    /* renamed from: d */
    private C2878g f10168d;

    protected C2877f(Context context) {
        this(context, null);
    }

    @Deprecated
    /* renamed from: a */
    static C2877f m13587a(Context context) {
        return m13588a(context, (String) null);
    }

    /* renamed from: d */
    private synchronized long m13594d(String str, String str2) {
        long j;
        SQLiteException e;
        StackOverflowError e2;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = mo11304a(writableDatabase, str, contentValues);
            if (j == -1) {
                try {
                    f10164s.mo11299e(f10151f, String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e3) {
                    e = e3;
                } catch (StackOverflowError e4) {
                    e2 = e4;
                    try {
                        f10164s.mo11293b(f10151f, String.format("addEvent to %s failed", new Object[]{str}), e2);
                        C2882i.m13675c().mo11353a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
                        m13596e();
                        close();
                        return j;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e5) {
            e = e5;
            j = -1;
            f10164s.mo11293b(f10151f, String.format("addEvent to %s failed", new Object[]{str}), e);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e);
            m13596e();
            close();
            return j;
        } catch (StackOverflowError e6) {
            e2 = e6;
            j = -1;
            f10164s.mo11293b(f10151f, String.format("addEvent to %s failed", new Object[]{str}), e2);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
            m13596e();
            close();
            return j;
        }
        close();
        return j;
    }

    /* renamed from: e */
    private static String m13595e(String str) {
        if (C2892n.m13815a(str) || str.equals(C2876e.f10132i)) {
            return "com.amplitude.api";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.amplitude.api_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    private synchronized long m13597f(String str) {
        long j;
        j = 0;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT COUNT(*) FROM ");
            sb.append(str);
            SQLiteStatement compileStatement = readableDatabase.compileStatement(sb.toString());
            j = compileStatement.simpleQueryForLong();
            if (compileStatement != null) {
                compileStatement.close();
            }
        } catch (SQLiteException e) {
            f10164s.mo11293b(f10151f, String.format("getNumberRows for %s failed", new Object[]{str}), e);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e);
            m13596e();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e2) {
            try {
                f10164s.mo11293b(f10151f, String.format("getNumberRows for %s failed", new Object[]{str}), e2);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e2);
                m13596e();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo11317b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo11322c(String str, String str2) {
        long j;
        if (str2 == null) {
            j = mo11308a(f10152g, str);
        } else {
            j = mo11309a(f10152g, str, (Object) str2);
        }
        return j;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f10160o);
        sQLiteDatabase.execSQL(f10161p);
        sQLiteDatabase.execSQL(f10162q);
        sQLiteDatabase.execSQL(f10163r);
        C2878g gVar = this.f10168d;
        if (gVar != null && this.f10167c) {
            try {
                this.f10167c = false;
                gVar.mo11268a(sQLiteDatabase);
            } catch (SQLiteException e) {
                f10164s.mo11293b(f10151f, String.format("databaseReset callback failed during onCreate", new Object[0]), e);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.f10167c = true;
                throw th;
            }
            this.f10167c = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r7 <= 2) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.amplitude.api.DatabaseHelper"
            if (r6 <= r7) goto L_0x000f
            com.amplitude.api.d r6 = f10164s
            java.lang.String r7 = "onUpgrade() with invalid oldVersion and newVersion"
            r6.mo11292b(r0, r7)
            r4.m13589a(r5)
            return
        L_0x000f:
            r1 = 1
            if (r7 > r1) goto L_0x0013
            return
        L_0x0013:
            r2 = 3
            r3 = 2
            if (r6 == r1) goto L_0x0035
            if (r6 == r3) goto L_0x003d
            if (r6 == r2) goto L_0x0047
            com.amplitude.api.d r7 = f10164s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpgrade() with unknown oldVersion "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.mo11292b(r0, r6)
            r4.m13589a(r5)
            goto L_0x0047
        L_0x0035:
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);"
            r5.execSQL(r6)
            if (r7 > r3) goto L_0x003d
            goto L_0x0047
        L_0x003d:
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);"
            r5.execSQL(r6)
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);"
            r5.execSQL(r6)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2877f.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    protected C2877f(Context context, String str) {
        super(context, m13595e(str), null, 3);
        this.f10167c = true;
        this.f10165a = context.getDatabasePath(m13595e(str));
        this.f10166b = C2892n.m13817b(str);
    }

    /* renamed from: a */
    static synchronized C2877f m13588a(Context context, String str) {
        C2877f fVar;
        synchronized (C2877f.class) {
            String b = C2892n.m13817b(str);
            fVar = (C2877f) f10150e.get(b);
            if (fVar == null) {
                fVar = new C2877f(context.getApplicationContext(), b);
                f10150e.put(b, fVar);
            }
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo11318b(String str) {
        return m13594d(f10157l, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized void mo11328e(long j) {
        m13592b(f10157l, j);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e A[SYNTHETIC, Splitter:B:27:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a A[SYNTHETIC, Splitter:B:34:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7 A[SYNTHETIC, Splitter:B:41:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4 A[SYNTHETIC, Splitter:B:48:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee A[SYNTHETIC, Splitter:B:54:0x00ee] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0090=Splitter:B:38:0x0090, B:31:0x0074=Splitter:B:31:0x0074, B:24:0x0058=Splitter:B:24:0x0058, B:45:0x00bd=Splitter:B:45:0x00bd} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo11319b(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            java.lang.String r3 = "key"
            r6[r1] = r3     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            java.lang.String r3 = "value"
            r6[r2] = r3     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            r8[r1] = r15     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r3 = r3.mo11310a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x00bb, StackOverflowError -> 0x008e, IllegalStateException -> 0x0072, RuntimeException -> 0x0056, all -> 0x0052 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x004d, IllegalStateException -> 0x004b, RuntimeException -> 0x0049 }
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "store"
            boolean r4 = r14.equals(r4)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x004d, IllegalStateException -> 0x004b, RuntimeException -> 0x0049 }
            if (r4 == 0) goto L_0x0036
            java.lang.String r14 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x004d, IllegalStateException -> 0x004b, RuntimeException -> 0x0049 }
            goto L_0x003e
        L_0x0036:
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x004d, IllegalStateException -> 0x004b, RuntimeException -> 0x0049 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x004d, IllegalStateException -> 0x004b, RuntimeException -> 0x0049 }
        L_0x003e:
            r0 = r14
        L_0x003f:
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00f5 }
        L_0x0044:
            r13.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00e9
        L_0x0049:
            r14 = move-exception
            goto L_0x0058
        L_0x004b:
            r14 = move-exception
            goto L_0x0074
        L_0x004d:
            r4 = move-exception
            goto L_0x0090
        L_0x004f:
            r4 = move-exception
            goto L_0x00bd
        L_0x0052:
            r14 = move-exception
            r3 = r0
            goto L_0x00ec
        L_0x0056:
            r14 = move-exception
            r3 = r0
        L_0x0058:
            com.amplitude.api.i r4 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r2[r1] = r15     // Catch:{ all -> 0x00eb }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00eb }
            r4.mo11353a(r15, r14)     // Catch:{ all -> 0x00eb }
            m13591a(r14)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x0044
        L_0x0072:
            r14 = move-exception
            r3 = r0
        L_0x0074:
            com.amplitude.api.i r4 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r2[r1] = r15     // Catch:{ all -> 0x00eb }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00eb }
            r4.mo11353a(r15, r14)     // Catch:{ all -> 0x00eb }
            r13.m13590a(r14)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x0044
        L_0x008e:
            r4 = move-exception
            r3 = r0
        L_0x0090:
            com.amplitude.api.d r5 = f10164s     // Catch:{ all -> 0x00eb }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r8[r1] = r14     // Catch:{ all -> 0x00eb }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00eb }
            r5.mo11293b(r6, r14, r4)     // Catch:{ all -> 0x00eb }
            com.amplitude.api.i r14 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r2[r1] = r15     // Catch:{ all -> 0x00eb }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00eb }
            r14.mo11353a(r15, r4)     // Catch:{ all -> 0x00eb }
            r13.m13596e()     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x0044
        L_0x00bb:
            r4 = move-exception
            r3 = r0
        L_0x00bd:
            com.amplitude.api.d r5 = f10164s     // Catch:{ all -> 0x00eb }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r8[r1] = r14     // Catch:{ all -> 0x00eb }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00eb }
            r5.mo11293b(r6, r14, r4)     // Catch:{ all -> 0x00eb }
            com.amplitude.api.i r14 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            r2[r1] = r15     // Catch:{ all -> 0x00eb }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00eb }
            r14.mo11353a(r15, r4)     // Catch:{ all -> 0x00eb }
            r13.m13596e()     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x0044
        L_0x00e9:
            monitor-exit(r13)
            return r0
        L_0x00eb:
            r14 = move-exception
        L_0x00ec:
            if (r3 == 0) goto L_0x00f1
            r3.close()     // Catch:{ all -> 0x00f5 }
        L_0x00f1:
            r13.close()     // Catch:{ all -> 0x00f5 }
            throw r14     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x00f9
        L_0x00f8:
            throw r14
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2877f.mo11319b(java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00eb, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13596e() {
        /*
            r10 = this;
            java.lang.String r0 = "DB: Failed to run databaseReset callback in delete"
            java.lang.String r1 = "databaseReset callback failed during delete"
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            r3 = 0
            r4 = 1
            r5 = 0
            r10.close()     // Catch:{ SecurityException -> 0x0069 }
            java.io.File r6 = r10.f10165a     // Catch:{ SecurityException -> 0x0069 }
            r6.delete()     // Catch:{ SecurityException -> 0x0069 }
            com.amplitude.api.g r6 = r10.f10168d
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f10167c
            if (r6 == 0) goto L_0x00cd
            r10.f10167c = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0035 }
            com.amplitude.api.g r6 = r10.f10168d     // Catch:{ SQLiteException -> 0x0035 }
            r6.mo11268a(r3)     // Catch:{ SQLiteException -> 0x0035 }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
        L_0x002e:
            r10.close()
            goto L_0x00cd
        L_0x0033:
            r0 = move-exception
            goto L_0x0059
        L_0x0035:
            r6 = move-exception
            com.amplitude.api.d r7 = f10164s     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0033 }
            r7.mo11293b(r2, r1, r6)     // Catch:{ all -> 0x0033 }
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0033 }
            r1.mo11353a(r0, r6)     // Catch:{ all -> 0x0033 }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0059:
            r10.f10167c = r4
            if (r3 == 0) goto L_0x0066
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0066
            r10.close()
        L_0x0066:
            throw r0
        L_0x0067:
            r6 = move-exception
            goto L_0x00ce
        L_0x0069:
            r6 = move-exception
            com.amplitude.api.d r7 = f10164s     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "delete failed"
            r7.mo11293b(r2, r8, r6)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.i r6 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "DB: Failed to delete database"
            r6.mo11352a(r7)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.g r6 = r10.f10168d
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f10167c
            if (r6 == 0) goto L_0x00cd
            r10.f10167c = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x009a }
            com.amplitude.api.g r6 = r10.f10168d     // Catch:{ SQLiteException -> 0x009a }
            r6.mo11268a(r3)     // Catch:{ SQLiteException -> 0x009a }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0098:
            r0 = move-exception
            goto L_0x00bf
        L_0x009a:
            r6 = move-exception
            com.amplitude.api.d r7 = f10164s     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0098 }
            r7.mo11293b(r2, r1, r6)     // Catch:{ all -> 0x0098 }
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0098 }
            r1.mo11353a(r0, r6)     // Catch:{ all -> 0x0098 }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x00bf:
            r10.f10167c = r4
            if (r3 == 0) goto L_0x00cc
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x00cc
            r10.close()
        L_0x00cc:
            throw r0
        L_0x00cd:
            return
        L_0x00ce:
            com.amplitude.api.g r7 = r10.f10168d
            if (r7 == 0) goto L_0x0123
            boolean r7 = r10.f10167c
            if (r7 == 0) goto L_0x0123
            r10.f10167c = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f1 }
            com.amplitude.api.g r7 = r10.f10168d     // Catch:{ SQLiteException -> 0x00f1 }
            r7.mo11268a(r3)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
        L_0x00eb:
            r10.close()
            goto L_0x0123
        L_0x00ef:
            r0 = move-exception
            goto L_0x0115
        L_0x00f1:
            r7 = move-exception
            com.amplitude.api.d r8 = f10164s     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ all -> 0x00ef }
            r8.mo11293b(r2, r1, r7)     // Catch:{ all -> 0x00ef }
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00ef }
            r1.mo11353a(r0, r7)     // Catch:{ all -> 0x00ef }
            r10.f10167c = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
            goto L_0x00eb
        L_0x0115:
            r10.f10167c = r4
            if (r3 == 0) goto L_0x0122
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0122
            r10.close()
        L_0x0122:
            throw r0
        L_0x0123:
            goto L_0x0125
        L_0x0124:
            throw r6
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2877f.m13596e():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized Long mo11323c(String str) {
        return (Long) mo11319b(f10153h, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo11321c() {
        return m13597f(f10157l);
    }

    /* renamed from: c */
    private synchronized void m13593c(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id <= ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f10164s.mo11293b(f10151f, String.format("removeEvents from %s failed", new Object[]{str}), e);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e);
            m13596e();
        } catch (StackOverflowError e2) {
            try {
                f10164s.mo11293b(f10151f, String.format("removeEvents from %s failed", new Object[]{str}), e2);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e2);
                m13596e();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11313a(C2878g gVar) {
        this.f10168d = gVar;
    }

    /* renamed from: a */
    private void m13589a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11307a(String str, Long l) {
        long j;
        if (l == null) {
            j = mo11308a(f10153h, str);
        } else {
            j = mo11309a(f10153h, str, (Object) l);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo11309a(java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = -1
            r2 = 0
            r3 = 0
            r4 = 1
            android.database.sqlite.SQLiteDatabase r2 = r9.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004b, StackOverflowError -> 0x001c }
            long r0 = r9.mo11305a(r2, r10, r11, r12)     // Catch:{ SQLiteException -> 0x004b, StackOverflowError -> 0x001c }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
        L_0x0016:
            r9.close()     // Catch:{ all -> 0x0088 }
            goto L_0x007a
        L_0x001a:
            r10 = move-exception
            goto L_0x007c
        L_0x001c:
            r12 = move-exception
            com.amplitude.api.d r5 = f10164s     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r8[r3] = r10     // Catch:{ all -> 0x001a }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x001a }
            r5.mo11293b(r6, r10, r12)     // Catch:{ all -> 0x001a }
            com.amplitude.api.i r10 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r4[r3] = r11     // Catch:{ all -> 0x001a }
            java.lang.String r11 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x001a }
            r10.mo11353a(r11, r12)     // Catch:{ all -> 0x001a }
            r9.m13596e()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
            goto L_0x0016
        L_0x004b:
            r12 = move-exception
            com.amplitude.api.d r5 = f10164s     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r8[r3] = r10     // Catch:{ all -> 0x001a }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x001a }
            r5.mo11293b(r6, r10, r12)     // Catch:{ all -> 0x001a }
            com.amplitude.api.i r10 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r4[r3] = r11     // Catch:{ all -> 0x001a }
            java.lang.String r11 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x001a }
            r10.mo11353a(r11, r12)     // Catch:{ all -> 0x001a }
            r9.m13596e()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
            goto L_0x0016
        L_0x007a:
            monitor-exit(r9)
            return r0
        L_0x007c:
            if (r2 == 0) goto L_0x0087
            boolean r11 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r11 == 0) goto L_0x0087
            r9.close()     // Catch:{ all -> 0x0088 }
        L_0x0087:
            throw r10     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x008c
        L_0x008b:
            throw r10
        L_0x008c:
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2877f.mo11309a(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized String mo11326d(String str) {
        return (String) mo11319b(f10152g, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized long mo11325d() {
        return mo11315b() + mo11321c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo11324c(long j) {
        m13592b(f10156k, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized void mo11327d(long j) {
        m13593c(f10156k, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized void mo11329f(long j) {
        m13593c(f10157l, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<JSONObject> mo11320b(long j, long j2) throws JSONException {
        return mo11312a(f10157l, j, j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11305a(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long b;
        ContentValues contentValues = new ContentValues();
        contentValues.put(f10154i, str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        b = mo11317b(sQLiteDatabase, str, contentValues);
        if (b == -1) {
            f10164s.mo11299e(f10151f, "Insert failed");
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo11315b() {
        return m13597f(f10156k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo11316b(long j) {
        return m13586a(f10157l, j);
    }

    /* renamed from: b */
    private synchronized void m13592b(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id = ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f10164s.mo11293b(f10151f, String.format("removeEvent from %s failed", new Object[]{str}), e);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e);
            m13596e();
        } catch (StackOverflowError e2) {
            try {
                f10164s.mo11293b(f10151f, String.format("removeEvent from %s failed", new Object[]{str}), e2);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e2);
                m13596e();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11308a(String str, String str2) {
        long j;
        j = -1;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            f10164s.mo11293b(f10151f, String.format("deleteKey from %s failed", new Object[]{str}), e);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e);
            m13596e();
            close();
            return j;
        } catch (StackOverflowError e2) {
            try {
                f10164s.mo11293b(f10151f, String.format("deleteKey from %s failed", new Object[]{str}), e2);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e2);
                m13596e();
                close();
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11306a(String str) {
        return m13594d(f10156k, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11304a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized List<JSONObject> mo11311a(long j, long j2) throws JSONException {
        return mo11312a(f10156k, j, j2);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> mo11312a(java.lang.String r19, long r20, long r22) throws org.json.JSONException {
        /*
            r18 = this;
            r11 = r18
            r0 = r20
            r2 = r22
            monitor-enter(r18)
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x0132 }
            r12.<init>()     // Catch:{ all -> 0x0132 }
            r13 = 0
            r14 = 1
            r15 = 0
            android.database.sqlite.SQLiteDatabase r4 = r18.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r6 = "id"
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r6 = "event"
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0036
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r9 = "id <= "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r0 = r8.toString()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            goto L_0x0037
        L_0x0036:
            r0 = r13
        L_0x0037:
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r16 = "id ASC"
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r6 = ""
            r1.append(r6)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r17 = r1
            goto L_0x0056
        L_0x0054:
            r17 = r13
        L_0x0056:
            r1 = r18
            r2 = r4
            r3 = r19
            r4 = r5
            r5 = r0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r16
            r10 = r17
            android.database.Cursor r13 = r1.mo11310a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
        L_0x0068:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            if (r0 == 0) goto L_0x008b
            long r0 = r13.getLong(r15)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r2 = r13.getString(r14)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            boolean r3 = com.amplitude.api.C2892n.m13815a(r2)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            if (r3 == 0) goto L_0x007d
            goto L_0x0068
        L_0x007d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            java.lang.String r2 = "event_id"
            r3.put(r2, r0)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            r12.add(r3)     // Catch:{ SQLiteException -> 0x00fa, StackOverflowError -> 0x00ce, IllegalStateException -> 0x00b3, RuntimeException -> 0x0098 }
            goto L_0x0068
        L_0x008b:
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ all -> 0x0132 }
        L_0x0090:
            r18.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0127
        L_0x0095:
            r0 = move-exception
            goto L_0x0129
        L_0x0098:
            r0 = move-exception
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r3[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0095 }
            r1.mo11353a(r2, r0)     // Catch:{ all -> 0x0095 }
            m13591a(r0)     // Catch:{ all -> 0x0095 }
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x00b3:
            r0 = move-exception
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r3[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0095 }
            r1.mo11353a(r2, r0)     // Catch:{ all -> 0x0095 }
            r11.m13590a(r0)     // Catch:{ all -> 0x0095 }
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x00ce:
            r0 = move-exception
            com.amplitude.api.d r1 = f10164s     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r4[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0095 }
            r1.mo11293b(r2, r3, r0)     // Catch:{ all -> 0x0095 }
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r3[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0095 }
            r1.mo11353a(r2, r0)     // Catch:{ all -> 0x0095 }
            r18.m13596e()     // Catch:{ all -> 0x0095 }
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x00fa:
            r0 = move-exception
            com.amplitude.api.d r1 = f10164s     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r4[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0095 }
            r1.mo11293b(r2, r3, r0)     // Catch:{ all -> 0x0095 }
            com.amplitude.api.i r1 = com.amplitude.api.C2882i.m13675c()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0095 }
            r3[r15] = r19     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0095 }
            r1.mo11353a(r2, r0)     // Catch:{ all -> 0x0095 }
            r18.m13596e()     // Catch:{ all -> 0x0095 }
            if (r13 == 0) goto L_0x0090
            r13.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x0127:
            monitor-exit(r18)
            return r12
        L_0x0129:
            if (r13 == 0) goto L_0x012e
            r13.close()     // Catch:{ all -> 0x0132 }
        L_0x012e:
            r18.close()     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x0136
        L_0x0135:
            throw r0
        L_0x0136:
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C2877f.mo11312a(java.lang.String, long, long):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11303a(long j) {
        return m13586a(f10156k, j);
    }

    /* renamed from: a */
    private synchronized long m13586a(String str, long j) {
        long j2;
        SQLiteStatement sQLiteStatement = null;
        j2 = -1;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id FROM ");
            sb.append(str);
            sb.append(" LIMIT 1 OFFSET ");
            sb.append(j - 1);
            sQLiteStatement = readableDatabase.compileStatement(sb.toString());
            try {
                j2 = sQLiteStatement.simpleQueryForLong();
            } catch (SQLiteDoneException e) {
                f10164s.mo11287a(f10151f, (Throwable) e);
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (SQLiteException e2) {
            f10164s.mo11293b(f10151f, String.format("getNthEventId from %s failed", new Object[]{str}), e2);
            C2882i.m13675c().mo11353a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e2);
            m13596e();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e3) {
            try {
                f10164s.mo11293b(f10151f, String.format("getNthEventId from %s failed", new Object[]{str}), e3);
                C2882i.m13675c().mo11353a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e3);
                m13596e();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11314a() {
        return this.f10165a.exists();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo11310a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    private void m13590a(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (C2892n.m13815a(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        m13596e();
    }

    /* renamed from: a */
    private static void m13591a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C2892n.m13815a(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }
}
