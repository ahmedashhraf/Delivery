package com.instabug.library.internal.storage.cache.p389db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.InstabugLogEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.NetworkLogEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKApiEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKEventEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.UserEventEntry;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.db.a */
/* compiled from: InstabugDbHelper */
public class C9842a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26075a;

    public C9842a(Context context) {
        boolean[] a = m45858a();
        super(context, "instabug.db", null, 8);
        a[0] = true;
    }

    /* renamed from: a */
    private void m45857a(SQLiteDatabase sQLiteDatabase) {
        boolean[] a = m45858a();
        sQLiteDatabase.execSQL(NetworkLogEntry.SQL_DELETE_ENTRIES);
        a[13] = true;
        sQLiteDatabase.execSQL(InstabugLogEntry.DROP_QUERY_INSTABUG_LOG);
        a[14] = true;
        sQLiteDatabase.execSQL(UserEventEntry.DROP_TABLE);
        a[15] = true;
        sQLiteDatabase.execSQL(SDKEventEntry.DROP_TABLE);
        a[16] = true;
        sQLiteDatabase.execSQL(SDKApiEntry.DROP_TABLE);
        a[17] = true;
        sQLiteDatabase.execSQL(AttachmentEntry.DROP_TABLE);
        a[18] = true;
        sQLiteDatabase.execSQL(CrashEntry.DROP_TABLE);
        a[19] = true;
        sQLiteDatabase.execSQL(BugEntry.DROP_TABLE);
        a[20] = true;
        sQLiteDatabase.execSQL(SessionEntry.DROP_TABLE);
        a[21] = true;
        sQLiteDatabase.execSQL(FeatureRequestEntry.DROP_TABLE);
        a[22] = true;
        onCreate(sQLiteDatabase);
        a[23] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45858a() {
        boolean[] zArr = f26075a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-767547339825989219L, "com/instabug/library/internal/storage/cache/db/InstabugDbHelper", 24);
        f26075a = a;
        return a;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean[] a = m45858a();
        sQLiteDatabase.execSQL(NetworkLogEntry.SQL_CREATE_NETWORK_LOGS);
        a[1] = true;
        sQLiteDatabase.execSQL(InstabugLogEntry.SQL_CREATE_INSTABUG_LOGS);
        a[2] = true;
        sQLiteDatabase.execSQL(UserEventEntry.CREATE_TABLE);
        a[3] = true;
        sQLiteDatabase.execSQL(SDKEventEntry.CREATE_TABLE);
        a[4] = true;
        sQLiteDatabase.execSQL(SDKApiEntry.CREATE_TABLE);
        a[5] = true;
        sQLiteDatabase.execSQL(AttachmentEntry.CREATE_TABLE);
        a[6] = true;
        sQLiteDatabase.execSQL(CrashEntry.CREATE_TABLE);
        a[7] = true;
        sQLiteDatabase.execSQL(BugEntry.CREATE_TABLE);
        a[8] = true;
        sQLiteDatabase.execSQL(SessionEntry.CREATE_TABLE);
        a[9] = true;
        sQLiteDatabase.execSQL(FeatureRequestEntry.CREATE_TABLE);
        a[10] = true;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean[] a = m45858a();
        m45857a(sQLiteDatabase);
        a[12] = true;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean[] a = m45858a();
        m45857a(sQLiteDatabase);
        a[11] = true;
    }
}
