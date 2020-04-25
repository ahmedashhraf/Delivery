package com.instabug.library.logging;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.InstabugLogEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.logging.a */
/* compiled from: InstabugLogDbHelper */
class C9930a {

    /* renamed from: a */
    private static C12252e<List<C9928b>> f26399a;

    /* renamed from: b */
    private static C12314c f26400b;

    /* renamed from: c */
    private static List<C9928b> f26401c = new ArrayList();

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26402d;

    /* renamed from: com.instabug.library.logging.a$a */
    /* compiled from: InstabugLogDbHelper */
    static class C9931a extends C13787e<List<C9928b>> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26403b;

        C9931a() {
            m46210c()[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46210c() {
            boolean[] zArr = f26403b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6015928048765916810L, "com/instabug/library/logging/InstabugLogDbHelper$1", 6);
            f26403b = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46210c();
            mo35278a((List) obj);
            c[5] = true;
        }

        public void onComplete() {
            m46210c()[1] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46210c();
            InstabugSDKLogger.m46623e(C9930a.class, "couldn't insert the latest logs");
            c[2] = true;
        }

        /* renamed from: a */
        public void mo35278a(List<C9928b> list) {
            boolean[] c = m46210c();
            C9930a.m46205d().clear();
            c[3] = true;
            C9930a.m46201a((List) list);
            c[4] = true;
        }
    }

    static {
        boolean[] h = m46209h();
        h[111] = true;
    }

    C9930a() {
        m46209h()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m46201a(List list) {
        boolean[] h = m46209h();
        m46203b(list);
        h[110] = true;
    }

    /* renamed from: b */
    private static synchronized void m46203b(List<C9928b> list) {
        synchronized (C9930a.class) {
            boolean[] h = m46209h();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            h[18] = true;
            openDatabase.beginTransaction();
            try {
                h[19] = true;
                h[20] = true;
                for (C9928b bVar : list) {
                    if (bVar == null) {
                        h[21] = true;
                    } else {
                        h[22] = true;
                        ContentValues contentValues = new ContentValues();
                        String str = InstabugLogEntry.COLUMN_LOG_MESSAGE;
                        h[23] = true;
                        String a = bVar.mo35265a();
                        h[24] = true;
                        contentValues.put(str, a);
                        String str2 = InstabugLogEntry.COLUMN_LOG_LEVEL;
                        h[25] = true;
                        String aVar = bVar.mo35266b().toString();
                        h[26] = true;
                        contentValues.put(str2, aVar);
                        String str3 = InstabugLogEntry.COLUMN_LOG_DATE;
                        h[27] = true;
                        String valueOf = String.valueOf(bVar.mo35267c());
                        h[28] = true;
                        contentValues.put(str3, valueOf);
                        h[29] = true;
                        openDatabase.insert(InstabugLogEntry.TABLE_NAME, null, contentValues);
                        h[30] = true;
                    }
                    h[31] = true;
                }
                openDatabase.execSQL(InstabugLogEntry.DELETE_ALL_EXCEPT_THE_LATEST_1000_ENTRY);
                h[32] = true;
                openDatabase.setTransactionSuccessful();
                h[33] = true;
                openDatabase.endTransaction();
                h[34] = true;
                openDatabase.close();
                m46207f();
                h[37] = true;
            } catch (Throwable th) {
                openDatabase.endTransaction();
                h[35] = true;
                openDatabase.close();
                h[36] = true;
                throw th;
            }
        }
    }

    /* renamed from: c */
    static void m46204c() {
        boolean[] h = m46209h();
        m46208g();
        h[100] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        h[101] = true;
        openDatabase.beginTransaction();
        try {
            h[102] = true;
            openDatabase.execSQL(InstabugLogEntry.TRIM_INSTABUG_LOG_SQL_QUERY);
            h[103] = true;
            openDatabase.setTransactionSuccessful();
            h[104] = true;
        } finally {
            openDatabase.endTransaction();
            h['j'] = true;
            openDatabase.close();
            h['k'] = true;
        }
    }

    /* renamed from: d */
    static /* synthetic */ List m46205d() {
        boolean[] h = m46209h();
        List<C9928b> list = f26401c;
        h[109] = true;
        return list;
    }

    /* renamed from: e */
    private static void m46206e() {
        boolean[] h = m46209h();
        C12252e<List<C9928b>> eVar = f26399a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h[1] = true;
        C5923b0 b = eVar.mo23900b(1, timeUnit);
        h[2] = true;
        C5923b0 a = b.mo23825a(C12228b.m55094b());
        C9931a aVar = new C9931a();
        h[3] = true;
        f26400b = (C12314c) a.mo24007f(aVar);
        h[4] = true;
    }

    /* renamed from: f */
    private static void m46207f() {
        boolean[] h = m46209h();
        C12314c cVar = f26400b;
        if (cVar == null) {
            h[5] = true;
        } else if (cVar.mo41878d()) {
            h[6] = true;
        } else {
            h[7] = true;
            f26400b.dispose();
            h[8] = true;
        }
        h[9] = true;
    }

    /* renamed from: g */
    private static void m46208g() {
        boolean[] h = m46209h();
        m46207f();
        h[38] = true;
        ArrayList arrayList = new ArrayList(f26401c);
        h[39] = true;
        f26401c.clear();
        h[40] = true;
        m46203b(arrayList);
        h[41] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46209h() {
        boolean[] zArr = f26402d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8982007839386667606L, "com/instabug/library/logging/InstabugLogDbHelper", 112);
        f26402d = a;
        return a;
    }

    /* renamed from: a */
    static synchronized void m46200a(C9928b bVar) {
        synchronized (C9930a.class) {
            boolean[] h = m46209h();
            if (f26399a == null) {
                h[10] = true;
                f26399a = C12252e.m55181U();
                h[11] = true;
                m46206e();
                h[12] = true;
            } else if (!f26400b.mo41878d()) {
                h[13] = true;
            } else {
                h[14] = true;
                m46206e();
                h[15] = true;
            }
            f26401c.add(bVar);
            h[16] = true;
            f26399a.mo33453a(new ArrayList(f26401c));
            h[17] = true;
        }
    }

    /* renamed from: a */
    static JSONArray m46199a() {
        boolean[] h = m46209h();
        m46208g();
        h[42] = true;
        JSONArray jSONArray = new JSONArray();
        h[43] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        h[44] = true;
        openDatabase.beginTransaction();
        h[45] = true;
        Cursor rawQuery = openDatabase.rawQuery(InstabugLogEntry.SELECT_LIMITED_INSTABUG_LOG, null);
        try {
            h[46] = true;
            if (!rawQuery.moveToFirst()) {
                h[47] = true;
            } else {
                h[48] = true;
                while (true) {
                    String string = rawQuery.getString(rawQuery.getColumnIndex(InstabugLogEntry.COLUMN_LOG_MESSAGE));
                    h[49] = true;
                    String string2 = rawQuery.getString(rawQuery.getColumnIndex(InstabugLogEntry.COLUMN_LOG_LEVEL));
                    h[50] = true;
                    String string3 = rawQuery.getString(rawQuery.getColumnIndex(InstabugLogEntry.COLUMN_LOG_DATE));
                    h[51] = true;
                    C9928b bVar = new C9928b();
                    h[52] = true;
                    C9928b a = bVar.mo35264a(string);
                    Locale locale = Locale.ENGLISH;
                    h[53] = true;
                    String upperCase = string2.toUpperCase(locale);
                    h[54] = true;
                    a.mo35263a(C9927a.valueOf(upperCase));
                    h[55] = true;
                    if (!StringUtility.isNumeric(string3)) {
                        h[56] = true;
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(InstabugLog.LOG_MESSAGE_DATE_FORMAT, Locale.US);
                            h[59] = true;
                            Date parse = simpleDateFormat.parse(string3);
                            h[60] = true;
                            long time = parse.getTime();
                            h[61] = true;
                            bVar.mo35262a(time);
                            h[62] = true;
                        } catch (ParseException e) {
                            h[63] = true;
                            InstabugSDKLogger.m46623e(C9930a.class, e.getMessage());
                            h[64] = true;
                        }
                    } else {
                        h[57] = true;
                        bVar.mo35262a(Long.parseLong(string3));
                        h[58] = true;
                    }
                    jSONArray.put(bVar.mo35268d());
                    h[65] = true;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    h[66] = true;
                }
                h[67] = true;
            }
            openDatabase.setTransactionSuccessful();
            h[68] = true;
            openDatabase.endTransaction();
            h[69] = true;
            if (rawQuery == null) {
                h[70] = true;
            } else if (rawQuery.isClosed()) {
                h[71] = true;
            } else {
                h[72] = true;
                rawQuery.close();
                h[73] = true;
                openDatabase.close();
                h[74] = true;
            }
        } catch (Exception e2) {
            h[75] = true;
            e2.printStackTrace();
            h[76] = true;
            openDatabase.endTransaction();
            h[77] = true;
            if (rawQuery == null) {
                h[78] = true;
            } else if (rawQuery.isClosed()) {
                h[79] = true;
            } else {
                h[80] = true;
                rawQuery.close();
                h[81] = true;
                openDatabase.close();
                h[82] = true;
            }
        } catch (Throwable th) {
            openDatabase.endTransaction();
            h[83] = true;
            if (rawQuery == null) {
                h[84] = true;
            } else if (rawQuery.isClosed()) {
                h[85] = true;
            } else {
                h[86] = true;
                rawQuery.close();
                h[87] = true;
                openDatabase.close();
                h[88] = true;
            }
            h[89] = true;
            throw th;
        }
        h[90] = true;
        return jSONArray;
    }

    /* renamed from: b */
    static void m46202b() {
        boolean[] h = m46209h();
        m46208g();
        h[91] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        h[92] = true;
        openDatabase.beginTransaction();
        try {
            h[93] = true;
            openDatabase.delete(InstabugLogEntry.TABLE_NAME, null, null);
            h[94] = true;
            openDatabase.setTransactionSuccessful();
            h[95] = true;
        } finally {
            openDatabase.endTransaction();
            h['a'] = true;
            openDatabase.close();
            h['b'] = true;
        }
    }
}
