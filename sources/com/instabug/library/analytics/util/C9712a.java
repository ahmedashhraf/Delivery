package com.instabug.library.analytics.util;

import android.database.Cursor;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKApiEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKEventEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.analytics.util.a */
/* compiled from: AnalyticsDatabaseHelper */
public class C9712a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25722a;

    public C9712a() {
        m45313d()[0] = true;
    }

    /* renamed from: a */
    public static void m45309a() throws JSONException {
        boolean[] d = m45313d();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        d[21] = true;
        openDatabase.delete(SDKEventEntry.TABLE_NAME, null, null);
        d[22] = true;
        openDatabase.close();
        d[23] = true;
    }

    /* renamed from: b */
    public static ArrayList<Api> m45311b() throws JSONException {
        boolean[] d = m45313d();
        ArrayList<Api> arrayList = new ArrayList<>();
        d[31] = true;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        d[32] = true;
        String str = "time_stamp";
        String str2 = SDKApiEntry.COLUMN_API_NAME;
        String str3 = SDKApiEntry.COLUMN_IS_DEPRECATED;
        String str4 = "count";
        String str5 = SDKApiEntry.COLUMN_PARAMETERS;
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper = openDatabase;
        String str6 = str5;
        Cursor query = sQLiteDatabaseWrapper.query(SDKApiEntry.TABLE_NAME, new String[]{str, str2, str3, str4, str5}, null, null, null, null, null);
        d[33] = true;
        if (query.getCount() <= 0) {
            d[34] = true;
        } else {
            d[35] = true;
            query.moveToFirst();
            d[36] = true;
            while (true) {
                Api api = new Api();
                d[37] = true;
                int columnIndex = query.getColumnIndex(str2);
                d[38] = true;
                int columnIndex2 = query.getColumnIndex(str);
                d[39] = true;
                int columnIndex3 = query.getColumnIndex(str3);
                d[40] = true;
                int columnIndex4 = query.getColumnIndex(str4);
                d[41] = true;
                String str7 = str6;
                int columnIndex5 = query.getColumnIndex(str7);
                d[42] = true;
                api.setApiName(query.getString(columnIndex));
                d[43] = true;
                api.setTimeStamp(Long.parseLong(query.getString(columnIndex2)));
                d[44] = true;
                api.setDeprecated(Boolean.parseBoolean(query.getString(columnIndex3)));
                d[45] = true;
                api.setCount(query.getInt(columnIndex4));
                d[46] = true;
                api.setParameters(Parameter.fromJson(new JSONArray(query.getString(columnIndex5))));
                d[47] = true;
                arrayList.add(api);
                d[48] = true;
                if (!query.moveToNext()) {
                    break;
                }
                d[49] = true;
                str6 = str7;
            }
            d[50] = true;
        }
        query.close();
        d[51] = true;
        openDatabase.close();
        d[52] = true;
        return arrayList;
    }

    /* renamed from: c */
    public static void m45312c() throws JSONException {
        boolean[] d = m45313d();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        d[53] = true;
        openDatabase.delete(SDKApiEntry.TABLE_NAME, null, null);
        d[54] = true;
        openDatabase.close();
        d[55] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m45313d() {
        boolean[] zArr = f25722a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8906591148380835647L, "com/instabug/library/analytics/util/AnalyticsDatabaseHelper", 107);
        f25722a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45310a(java.util.Collection<com.instabug.library.analytics.model.Api> r9, long r10) {
        /*
            boolean[] r0 = m45313d()
            r1 = 74
            r2 = 0
            r3 = 1
            r0[r1] = r3     // Catch:{ Exception -> 0x00f0 }
            com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = com.instabug.library.internal.storage.cache.p389db.DatabaseManager.getInstance()     // Catch:{ Exception -> 0x00f0 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()     // Catch:{ Exception -> 0x00f0 }
            r4 = 75
            r0[r4] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.<init>()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 76
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 77
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
        L_0x0027:
            boolean r5 = r9.hasNext()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            if (r5 == 0) goto L_0x00d5
            java.lang.Object r5 = r9.next()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            com.instabug.library.analytics.model.Api r5 = (com.instabug.library.analytics.model.Api) r5     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r6 = "time_stamp"
            r7 = 78
            r0[r7] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r8 = 79
            r0[r8] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r6 = "api_name"
            r7 = 80
            r0[r7] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r7 = r5.getApiName()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r8 = 81
            r0[r8] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r6 = "is_deprecated"
            r7 = 82
            r0[r7] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            boolean r7 = r5.isDeprecated()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r7 = java.lang.Boolean.toString(r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r8 = 83
            r0[r8] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r6 = "count"
            r7 = 84
            r0[r7] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            int r7 = r5.getCount()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r8 = 85
            r0[r8] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6 = 86
            r0[r6] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.util.ArrayList r6 = r5.getParameters()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r7 = "parameters"
            if (r6 == 0) goto L_0x00a7
            r6 = 87
            r0[r6] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.util.ArrayList r5 = r5.getParameters()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            org.json.JSONArray r5 = com.instabug.library.analytics.model.Api.Parameter.toJson(r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6 = 88
            r0[r6] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r7, r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 89
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            goto L_0x00c3
        L_0x00a7:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5.<init>()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6 = 90
            r0[r6] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            org.json.JSONArray r5 = com.instabug.library.analytics.model.Api.Parameter.toJson(r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r6 = 91
            r0[r6] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.put(r7, r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 92
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
        L_0x00c3:
            java.lang.String r5 = "sdk_api"
            r1.insert(r5, r2, r4)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 93
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r4.clear()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = 94
            r0[r5] = r3     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            goto L_0x0027
        L_0x00d5:
            if (r1 != 0) goto L_0x00dc
            r9 = 95
            r0[r9] = r3
            goto L_0x0110
        L_0x00dc:
            r9 = 96
            r0[r9] = r3
            r1.close()
            r9 = 97
            r0[r9] = r3
            goto L_0x0110
        L_0x00e8:
            r9 = move-exception
            goto L_0x0115
        L_0x00ea:
            r9 = move-exception
            r2 = r1
            goto L_0x00f1
        L_0x00ed:
            r9 = move-exception
            r1 = r2
            goto L_0x0115
        L_0x00f0:
            r9 = move-exception
        L_0x00f1:
            r10 = 98
            r0[r10] = r3     // Catch:{ all -> 0x00ed }
            java.lang.Class<com.instabug.library.analytics.util.a> r10 = com.instabug.library.analytics.util.C9712a.class
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ed }
            com.instabug.library.util.InstabugSDKLogger.m46623e(r10, r9)     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x0105
            r9 = 99
            r0[r9] = r3
            goto L_0x0110
        L_0x0105:
            r9 = 100
            r0[r9] = r3
            r2.close()
            r9 = 101(0x65, float:1.42E-43)
            r0[r9] = r3
        L_0x0110:
            r9 = 106(0x6a, float:1.49E-43)
            r0[r9] = r3
            return
        L_0x0115:
            if (r1 != 0) goto L_0x011c
            r10 = 102(0x66, float:1.43E-43)
            r0[r10] = r3
            goto L_0x0127
        L_0x011c:
            r10 = 103(0x67, float:1.44E-43)
            r0[r10] = r3
            r1.close()
            r10 = 104(0x68, float:1.46E-43)
            r0[r10] = r3
        L_0x0127:
            r10 = 105(0x69, float:1.47E-43)
            r0[r10] = r3
            goto L_0x012d
        L_0x012c:
            throw r9
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.analytics.util.C9712a.m45310a(java.util.Collection, long):void");
    }
}
