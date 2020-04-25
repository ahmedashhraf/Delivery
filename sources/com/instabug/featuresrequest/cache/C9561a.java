package com.instabug.featuresrequest.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9568a;
import com.instabug.featuresrequest.models.C9567a.C9569b;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.instabug.library.internal.storage.cache.p389db.SQLiteDatabaseWrapper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.cache.a */
/* compiled from: FeatureRequestsDBHelper */
public class C9561a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25272a;

    /* renamed from: a */
    public static synchronized long m44674a(C9567a aVar) throws JSONException {
        long insertWithOnConflictReplace;
        synchronized (C9561a.class) {
            boolean[] b = m44677b();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            b[1] = true;
            openDatabase.beginTransaction();
            try {
                b[2] = true;
                ContentValues contentValues = new ContentValues();
                b[3] = true;
                contentValues.put(FeatureRequestEntry.COLUMN_ID, Long.valueOf(aVar.mo34271h()));
                b[4] = true;
                contentValues.put("title", aVar.mo34275l());
                b[5] = true;
                contentValues.put("description", aVar.mo34270g());
                b[6] = true;
                contentValues.put("status", aVar.mo34274k().name());
                b[7] = true;
                contentValues.put("likes_count", Integer.valueOf(aVar.mo34273j()));
                b[8] = true;
                contentValues.put("comments_count", Integer.valueOf(aVar.mo34265d()));
                b[9] = true;
                contentValues.put("liked", Boolean.valueOf(aVar.mo34278o()));
                b[10] = true;
                contentValues.put("date", Long.valueOf(aVar.mo34269f()));
                b[11] = true;
                contentValues.put("color_code", aVar.mo34255a());
                b[12] = true;
                contentValues.put("creator_name", aVar.mo34267e());
                b[13] = true;
                contentValues.put(FeatureRequestEntry.COLUMN_VOTE_UPDATED, aVar.mo34276m().name());
                b[14] = true;
                insertWithOnConflictReplace = openDatabase.insertWithOnConflictReplace(FeatureRequestEntry.TABLE_NAME, null, contentValues);
                b[15] = true;
                openDatabase.setTransactionSuccessful();
                b[16] = true;
            } finally {
                openDatabase.endTransaction();
                b[19] = true;
                openDatabase.close();
                b[20] = true;
            }
        }
        return insertWithOnConflictReplace;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44677b() {
        boolean[] zArr = f25272a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7155268946950947663L, "com/instabug/featuresrequest/cache/FeatureRequestsDBHelper", 87);
        f25272a = a;
        return a;
    }

    /* renamed from: a */
    public static List<C9567a> m44675a() throws JSONException {
        boolean z;
        boolean[] b = m44677b();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        b[21] = true;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            b[22] = true;
            Cursor query = openDatabase.query(FeatureRequestEntry.TABLE_NAME, null, null, null, null, null, null, null);
            b[23] = true;
            if (!query.moveToFirst()) {
                b[24] = true;
            } else {
                b[25] = true;
                while (true) {
                    C9567a aVar = new C9567a();
                    b[26] = true;
                    int columnIndex = query.getColumnIndex(FeatureRequestEntry.COLUMN_ID);
                    b[27] = true;
                    aVar.mo34262b((long) query.getInt(columnIndex));
                    b[28] = true;
                    int columnIndex2 = query.getColumnIndex("title");
                    b[29] = true;
                    aVar.mo34268e(query.getString(columnIndex2));
                    b[30] = true;
                    int columnIndex3 = query.getColumnIndex("description");
                    b[31] = true;
                    aVar.mo34266d(query.getString(columnIndex3));
                    b[32] = true;
                    int columnIndex4 = query.getColumnIndex("status");
                    b[33] = true;
                    aVar.mo34258a(C9568a.valueOf(query.getString(columnIndex4)));
                    b[34] = true;
                    int columnIndex5 = query.getColumnIndex("likes_count");
                    b[35] = true;
                    aVar.mo34261b(query.getInt(columnIndex5));
                    b[36] = true;
                    int columnIndex6 = query.getColumnIndex("comments_count");
                    b[37] = true;
                    aVar.mo34256a(query.getInt(columnIndex6));
                    b[38] = true;
                    int columnIndex7 = query.getColumnIndex("liked");
                    b[39] = true;
                    if (query.getInt(columnIndex7) == 1) {
                        b[40] = true;
                        z = true;
                    } else {
                        z = false;
                        b[41] = true;
                    }
                    aVar.mo34260a(z);
                    b[42] = true;
                    int columnIndex8 = query.getColumnIndex("date");
                    b[43] = true;
                    aVar.mo34257a(query.getLong(columnIndex8));
                    b[44] = true;
                    int columnIndex9 = query.getColumnIndex("color_code");
                    b[45] = true;
                    aVar.mo34263b(query.getString(columnIndex9));
                    b[46] = true;
                    int columnIndex10 = query.getColumnIndex("creator_name");
                    b[47] = true;
                    aVar.mo34264c(query.getString(columnIndex10));
                    b[48] = true;
                    int columnIndex11 = query.getColumnIndex(FeatureRequestEntry.COLUMN_VOTE_UPDATED);
                    b[49] = true;
                    C9569b valueOf = C9569b.valueOf(query.getString(columnIndex11));
                    b[50] = true;
                    aVar.mo34259a(valueOf);
                    b[51] = true;
                    arrayList.add(aVar);
                    b[52] = true;
                    if (!query.moveToNext()) {
                        break;
                    }
                    b[53] = true;
                }
                b[54] = true;
            }
            if (query == null) {
                b[55] = true;
            } else {
                b[56] = true;
                query.close();
                b[57] = true;
            }
            openDatabase.close();
            b[62] = true;
            return arrayList;
        } catch (Throwable th) {
            if (cursor == null) {
                b[58] = true;
            } else {
                b[59] = true;
                cursor.close();
                b[60] = true;
            }
            openDatabase.close();
            b[61] = true;
            throw th;
        }
    }

    /* renamed from: a */
    public static synchronized void m44676a(String str) {
        synchronized (C9561a.class) {
            boolean[] b = m44677b();
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            b[71] = true;
            openDatabase.beginTransaction();
            try {
                b[72] = true;
                String str2 = FeatureRequestEntry.TABLE_NAME;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(str);
                openDatabase.delete(str2, sb.toString(), null);
                b[73] = true;
                openDatabase.setTransactionSuccessful();
                b[74] = true;
            } finally {
                openDatabase.endTransaction();
                b['L'] = true;
                openDatabase.close();
                b['M'] = true;
            }
        }
    }
}
