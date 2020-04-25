package com.instabug.library.internal.storage.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.model.Session;
import com.instabug.library.user.C10009a;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.c */
/* compiled from: SessionDbHelper */
public class C9841c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26074a;

    /* renamed from: a */
    public static synchronized long m45853a(Session session) {
        long insert;
        synchronized (C9841c.class) {
            boolean[] b = m45856b();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            b[1] = true;
            openDatabase.beginTransaction();
            try {
                b[2] = true;
                ContentValues contentValues = new ContentValues();
                b[3] = true;
                contentValues.put(SessionEntry.COLUMN_ID, Integer.valueOf(session.mo35366a()));
                b[4] = true;
                contentValues.put(SessionEntry.COLUMN_STARTED_AT, Long.valueOf(session.mo35367b()));
                b[5] = true;
                contentValues.put("duration", Long.valueOf(session.mo35368c()));
                b[6] = true;
                contentValues.put("user_attributes", session.mo35370e());
                b[7] = true;
                contentValues.put("user_events", session.mo35369d());
                b[8] = true;
                contentValues.put("user_email", C10009a.m46593b());
                b[9] = true;
                contentValues.put("user_name", C10009a.m46596c());
                b[10] = true;
                insert = openDatabase.insert(SessionEntry.TABLE_NAME, null, contentValues);
                b[11] = true;
                openDatabase.setTransactionSuccessful();
                b[12] = true;
            } finally {
                openDatabase.endTransaction();
                b[15] = true;
                openDatabase.close();
                b[16] = true;
            }
        }
        return insert;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45856b() {
        boolean[] zArr = f26074a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4463649516041664197L, "com/instabug/library/internal/storage/cache/SessionDbHelper", 65);
        f26074a = a;
        return a;
    }

    /* renamed from: a */
    public static List<Session> m45854a() {
        boolean[] b = m45856b();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        b[17] = true;
        Cursor query = openDatabase.query(SessionEntry.TABLE_NAME, null, null, null, null, null, null, null);
        b[18] = true;
        ArrayList arrayList = new ArrayList();
        b[19] = true;
        if (!query.moveToFirst()) {
            b[20] = true;
        } else {
            b[21] = true;
            while (true) {
                int columnIndex = query.getColumnIndex(SessionEntry.COLUMN_ID);
                b[22] = true;
                int i = query.getInt(columnIndex);
                b[23] = true;
                int columnIndex2 = query.getColumnIndex(SessionEntry.COLUMN_STARTED_AT);
                b[24] = true;
                long j = query.getLong(columnIndex2);
                b[25] = true;
                int columnIndex3 = query.getColumnIndex("duration");
                b[26] = true;
                long j2 = query.getLong(columnIndex3);
                b[27] = true;
                int columnIndex4 = query.getColumnIndex("user_events");
                b[28] = true;
                String string = query.getString(columnIndex4);
                b[29] = true;
                int columnIndex5 = query.getColumnIndex("user_attributes");
                b[30] = true;
                String string2 = query.getString(columnIndex5);
                b[31] = true;
                int columnIndex6 = query.getColumnIndex("user_email");
                b[32] = true;
                String string3 = query.getString(columnIndex6);
                b[33] = true;
                int columnIndex7 = query.getColumnIndex("user_name");
                b[34] = true;
                String string4 = query.getString(columnIndex7);
                b[35] = true;
                Session session = new Session(i, j, j2, string, string2, string3, string4);
                b[36] = true;
                arrayList.add(session);
                b[37] = true;
                if (!query.moveToNext()) {
                    break;
                }
                b[38] = true;
            }
            b[39] = true;
        }
        query.close();
        b[40] = true;
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized void m45855a(long j) {
        synchronized (C9841c.class) {
            boolean[] b = m45856b();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            b[49] = true;
            openDatabase.beginTransaction();
            try {
                b[50] = true;
                String str = SessionEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("session_id=");
                sb.append(j);
                openDatabase.delete(str, sb.toString(), null);
                b[51] = true;
                openDatabase.setTransactionSuccessful();
                b[52] = true;
            } finally {
                openDatabase.endTransaction();
                b['6'] = true;
                openDatabase.close();
                b['7'] = true;
            }
        }
    }
}
