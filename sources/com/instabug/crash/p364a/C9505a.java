package com.instabug.crash.p364a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.instabug.crash.models.Crash;
import com.instabug.crash.models.Crash.CrashState;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.executor.ReadOperationExecutor;
import com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.a.a */
/* compiled from: CrashReportsDbHelper */
public class C9505a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25161a;

    public C9505a() {
        m44504a()[0] = true;
    }

    /* renamed from: a */
    public static synchronized long m44500a(Crash crash) {
        long insert;
        synchronized (C9505a.class) {
            boolean[] a = m44504a();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            a[1] = true;
            openDatabase.beginTransaction();
            try {
                a[2] = true;
                ContentValues contentValues = new ContentValues();
                a[3] = true;
                contentValues.put(CrashEntry.COLUMN_CRASH_MESSAGE, crash.mo34185c());
                a[4] = true;
                contentValues.put(CrashEntry.COLUMN_CRASH_STATE, crash.mo34189f().name());
                a[5] = true;
                contentValues.put(CrashEntry.COLUMN_HANDLED, Boolean.valueOf(crash.mo34190g()));
                a[6] = true;
                contentValues.put("state", crash.mo34187e().getUri().toString());
                a[7] = true;
                contentValues.put("temporary_server_token", crash.mo34183b());
                a[8] = true;
                contentValues.put(CrashEntry.COLUMN_ID, crash.mo34181a());
                a[9] = true;
                a[10] = true;
                for (Attachment attachment : crash.mo34186d()) {
                    a[11] = true;
                    long insert2 = AttachmentsDbHelper.insert(attachment, crash.mo34181a());
                    if (insert2 == -1) {
                        a[12] = true;
                    } else {
                        a[13] = true;
                        attachment.setId(insert2);
                        a[14] = true;
                    }
                    a[15] = true;
                }
                insert = openDatabase.insert(CrashEntry.TABLE_NAME, null, contentValues);
                a[16] = true;
                openDatabase.setTransactionSuccessful();
                a[17] = true;
            } finally {
                openDatabase.endTransaction();
                a[20] = true;
                openDatabase.close();
                a[21] = true;
            }
        }
        return insert;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44504a() {
        boolean[] zArr = f25161a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3898310947762262614L, "com/instabug/crash/cache/CrashReportsDbHelper", 96);
        f25161a = a;
        return a;
    }

    /* renamed from: a */
    public static List<Crash> m44501a(Context context) {
        boolean z;
        Class<C9505a> cls = C9505a.class;
        boolean[] a = m44504a();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        a[22] = true;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            a[23] = true;
            Cursor query = openDatabase.query(CrashEntry.TABLE_NAME, null, null, null, null, null, null, null);
            a[24] = true;
            if (!query.moveToFirst()) {
                a[25] = true;
            } else {
                a[26] = true;
                while (true) {
                    Crash crash = new Crash();
                    a[27] = true;
                    int columnIndex = query.getColumnIndex(CrashEntry.COLUMN_ID);
                    a[28] = true;
                    crash.mo34178a(query.getString(columnIndex));
                    a[29] = true;
                    int columnIndex2 = query.getColumnIndex(CrashEntry.COLUMN_CRASH_MESSAGE);
                    a[30] = true;
                    crash.mo34184c(query.getString(columnIndex2));
                    a[31] = true;
                    int columnIndex3 = query.getColumnIndex(CrashEntry.COLUMN_HANDLED);
                    a[32] = true;
                    if (query.getInt(columnIndex3) != 0) {
                        a[33] = true;
                        z = true;
                    } else {
                        z = false;
                        a[34] = true;
                    }
                    crash.mo34180a(z);
                    a[35] = true;
                    int columnIndex4 = query.getColumnIndex("state");
                    a[36] = true;
                    State state = new State();
                    a[37] = true;
                    Uri parse = Uri.parse(query.getString(columnIndex4));
                    a[38] = true;
                    state.setUri(parse);
                    a[39] = true;
                    DiskUtils with = DiskUtils.with(context);
                    ReadStateFromFileDiskOperation readStateFromFileDiskOperation = new ReadStateFromFileDiskOperation(parse);
                    a[40] = true;
                    ReadOperationExecutor readOperation = with.readOperation(readStateFromFileDiskOperation);
                    a[41] = true;
                    String execute = readOperation.execute();
                    a[42] = true;
                    state.fromJson(execute);
                    a[43] = true;
                    crash.mo34177a(state);
                    a[44] = true;
                    int columnIndex5 = query.getColumnIndex(CrashEntry.COLUMN_CRASH_STATE);
                    a[45] = true;
                    crash.mo34176a((CrashState) Enum.valueOf(CrashState.class, query.getString(columnIndex5)));
                    a[46] = true;
                    int columnIndex6 = query.getColumnIndex("temporary_server_token");
                    a[47] = true;
                    crash.mo34182b(query.getString(columnIndex6));
                    a[48] = true;
                    crash.mo34179a((List<Attachment>) AttachmentsDbHelper.retrieve(crash.mo34181a(), openDatabase));
                    a[49] = true;
                    arrayList.add(crash);
                    a[50] = true;
                    if (!query.moveToNext()) {
                        break;
                    }
                    a[51] = true;
                }
                a[52] = true;
            }
            if (query == null) {
                a[53] = true;
            } else {
                a[54] = true;
                query.close();
                a[55] = true;
            }
            openDatabase.close();
            a[56] = true;
        } catch (IOException e) {
            a[57] = true;
            InstabugSDKLogger.m46624e(cls, e.getClass().getSimpleName(), e);
            if (cursor == null) {
                a[58] = true;
            } else {
                a[59] = true;
                cursor.close();
                a[60] = true;
            }
            openDatabase.close();
            a[61] = true;
        } catch (JSONException e2) {
            a[62] = true;
            InstabugSDKLogger.m46624e(cls, e2.getClass().getSimpleName(), e2);
            if (cursor == null) {
                a[63] = true;
            } else {
                a[64] = true;
                cursor.close();
                a[65] = true;
            }
            openDatabase.close();
            a[66] = true;
        } catch (Throwable th) {
            if (cursor == null) {
                a[67] = true;
            } else {
                a[68] = true;
                cursor.close();
                a[69] = true;
            }
            openDatabase.close();
            a[70] = true;
            throw th;
        }
        a[71] = true;
        return arrayList;
    }

    /* renamed from: a */
    public static synchronized void m44503a(String str, ContentValues contentValues) {
        synchronized (C9505a.class) {
            boolean[] a = m44504a();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            a[72] = true;
            openDatabase.beginTransaction();
            try {
                a[73] = true;
                String str2 = CrashEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("crash_id=");
                sb.append(str);
                openDatabase.update(str2, contentValues, sb.toString(), null);
                a[74] = true;
                openDatabase.setTransactionSuccessful();
                a[75] = true;
            } finally {
                openDatabase.endTransaction();
                a['M'] = true;
                openDatabase.close();
                a['N'] = true;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m44502a(String str) {
        synchronized (C9505a.class) {
            boolean[] a = m44504a();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            a[80] = true;
            openDatabase.beginTransaction();
            try {
                a[81] = true;
                String str2 = CrashEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("crash_id=");
                sb.append(str);
                openDatabase.delete(str2, sb.toString(), null);
                a[82] = true;
                openDatabase.setTransactionSuccessful();
                a[83] = true;
            } finally {
                openDatabase.endTransaction();
                a['U'] = true;
                openDatabase.close();
                a['V'] = true;
            }
        }
    }
}
