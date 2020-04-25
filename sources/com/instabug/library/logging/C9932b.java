package com.instabug.library.logging;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.NetworkLogEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.model.NetworkLog;
import org.json.JSONArray;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.logging.b */
/* compiled from: InstabugNetworkLogDbHelper */
public class C9932b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26404a;

    /* renamed from: a */
    public static synchronized long m46213a(NetworkLog networkLog) {
        long insert;
        synchronized (C9932b.class) {
            boolean[] c = m46216c();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                c[1] = true;
                ContentValues contentValues = new ContentValues();
                c[2] = true;
                contentValues.put("url", networkLog.getUrl());
                c[3] = true;
                contentValues.put("request", networkLog.getRequest());
                c[4] = true;
                contentValues.put("method", networkLog.getMethod());
                c[5] = true;
                contentValues.put("response", networkLog.getResponse());
                c[6] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(networkLog.getResponseCode());
                contentValues.put("status", sb.toString());
                c[7] = true;
                contentValues.put("date", networkLog.getDate());
                c[8] = true;
                contentValues.put("headers", networkLog.getRequestHeaders());
                c[9] = true;
                contentValues.put(NetworkLogEntry.COLUMN_RESPONSE_HEADERS, networkLog.getResponseHeaders());
                c[10] = true;
                contentValues.put(NetworkLogEntry.COLUMN_NETWORK_TIME, Long.valueOf(networkLog.getTotalDuration()));
                c[11] = true;
                insert = openDatabase.insert(NetworkLogEntry.TABLE_NAME, null, contentValues);
                c[12] = true;
            } finally {
                openDatabase.close();
                c[14] = true;
            }
        }
        return insert;
    }

    /* renamed from: b */
    public static synchronized String m46215b() {
        String jSONArray;
        synchronized (C9932b.class) {
            boolean[] c = m46216c();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            c[21] = true;
            JSONArray jSONArray2 = new JSONArray();
            c[22] = true;
            Cursor query = openDatabase.query(NetworkLogEntry.TABLE_NAME, null, null, null, null, null, "_id DESC", "100");
            c[23] = true;
            if (query.moveToFirst()) {
                c[25] = true;
                while (true) {
                    NetworkLog networkLog = new NetworkLog();
                    c[26] = true;
                    int columnIndex = query.getColumnIndex("request");
                    c[27] = true;
                    networkLog.setRequest(query.getString(columnIndex));
                    c[28] = true;
                    int columnIndex2 = query.getColumnIndex("response");
                    c[29] = true;
                    networkLog.setResponse(query.getString(columnIndex2));
                    c[30] = true;
                    int columnIndex3 = query.getColumnIndex("method");
                    c[31] = true;
                    networkLog.setMethod(query.getString(columnIndex3));
                    c[32] = true;
                    int columnIndex4 = query.getColumnIndex("url");
                    c[33] = true;
                    networkLog.setUrl(query.getString(columnIndex4));
                    c[34] = true;
                    int columnIndex5 = query.getColumnIndex("status");
                    c[35] = true;
                    networkLog.setResponseCode(query.getInt(columnIndex5));
                    c[36] = true;
                    int columnIndex6 = query.getColumnIndex("date");
                    c[37] = true;
                    networkLog.setDate(query.getString(columnIndex6));
                    c[38] = true;
                    int columnIndex7 = query.getColumnIndex("headers");
                    c[39] = true;
                    networkLog.setRequestHeaders(query.getString(columnIndex7));
                    c[40] = true;
                    int columnIndex8 = query.getColumnIndex(NetworkLogEntry.COLUMN_RESPONSE_HEADERS);
                    c[41] = true;
                    networkLog.setResponseHeaders(query.getString(columnIndex8));
                    c[42] = true;
                    int columnIndex9 = query.getColumnIndex(NetworkLogEntry.COLUMN_NETWORK_TIME);
                    c[43] = true;
                    networkLog.setTotalDuration((long) query.getInt(columnIndex9));
                    try {
                        c[44] = true;
                        jSONArray2.put(networkLog.toJsonObject());
                        c[45] = true;
                    } catch (JSONException e) {
                        c[46] = true;
                        e.printStackTrace();
                        c[47] = true;
                    }
                    if (!query.moveToNext()) {
                        c[49] = true;
                        break;
                    }
                    c[48] = true;
                }
            } else {
                c[24] = true;
            }
            query.close();
            c[50] = true;
            openDatabase.close();
            c[51] = true;
            jSONArray = jSONArray2.toString();
            c[52] = true;
        }
        return jSONArray;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m46216c() {
        boolean[] zArr = f26404a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-649098667823884429L, "com/instabug/library/logging/InstabugNetworkLogDbHelper", 53);
        f26404a = a;
        return a;
    }

    /* renamed from: a */
    public static synchronized void m46214a() {
        synchronized (C9932b.class) {
            boolean[] c = m46216c();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                c[15] = true;
                if (openDatabase.queryNumEntries(NetworkLogEntry.TABLE_NAME) <= 100) {
                    c[16] = true;
                } else {
                    c[17] = true;
                    openDatabase.execSQL(NetworkLogEntry.DELETE_ALL_EXCEPT_THE_LATEST_100_ENTRY);
                    c[18] = true;
                }
            } finally {
                openDatabase.close();
                c[19] = true;
            }
        }
    }
}
