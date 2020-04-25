package com.instabug.library.internal.storage.cache.p389db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.concurrent.atomic.AtomicInteger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper */
public class SQLiteDatabaseWrapper {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private SQLiteDatabase database;
    private SQLiteOpenHelper databaseHelper;
    private AtomicInteger mOpenCounter = new AtomicInteger();

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7357816955906637590L, "com/instabug/library/internal/storage/cache/db/SQLiteDatabaseWrapper", 23);
        $jacocoData = a;
        return a;
    }

    SQLiteDatabaseWrapper(SQLiteOpenHelper sQLiteOpenHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        this.databaseHelper = sQLiteOpenHelper;
        $jacocoInit[1] = true;
    }

    private void logOpenDatabaseError() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46623e(DatabaseManager.class, "Please call open at first");
        $jacocoInit[13] = true;
    }

    public void beginTransaction() {
        boolean[] $jacocoInit = $jacocoInit();
        this.database.beginTransaction();
        $jacocoInit[10] = true;
    }

    public synchronized void close() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.mOpenCounter.decrementAndGet() != 0) {
            $jacocoInit[6] = true;
        } else {
            $jacocoInit[7] = true;
            this.database.close();
            $jacocoInit[8] = true;
        }
        $jacocoInit[9] = true;
    }

    public void delete(String str, String str2, String[] strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        this.database.delete(str, str2, strArr);
        $jacocoInit[18] = true;
    }

    public void endTransaction() {
        boolean[] $jacocoInit = $jacocoInit();
        this.database.endTransaction();
        $jacocoInit[16] = true;
    }

    public void execSQL(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.database.execSQL(str);
        $jacocoInit[14] = true;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        boolean[] $jacocoInit = $jacocoInit();
        long insert = this.database.insert(str, str2, contentValues);
        $jacocoInit[11] = true;
        return insert;
    }

    public long insertWithOnConflictReplace(String str, String str2, ContentValues contentValues) {
        boolean[] $jacocoInit = $jacocoInit();
        long insertWithOnConflict = this.database.insertWithOnConflict(str, str2, contentValues, 5);
        $jacocoInit[12] = true;
        return insertWithOnConflict;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void open() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.mOpenCounter.incrementAndGet() != 1) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            this.database = this.databaseHelper.getWritableDatabase();
            $jacocoInit[4] = true;
        }
        $jacocoInit[5] = true;
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        boolean[] $jacocoInit = $jacocoInit();
        Cursor query = this.database.query(str, strArr, str2, strArr2, str3, str4, str5);
        $jacocoInit[20] = true;
        return query;
    }

    public long queryNumEntries(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.database, str);
        $jacocoInit[22] = true;
        return queryNumEntries;
    }

    public Cursor rawQuery(String str, String[] strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        Cursor rawQuery = this.database.rawQuery(str, strArr);
        $jacocoInit[17] = true;
        return rawQuery;
    }

    public void setTransactionSuccessful() {
        boolean[] $jacocoInit = $jacocoInit();
        this.database.setTransactionSuccessful();
        $jacocoInit[15] = true;
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        int update = this.database.update(str, contentValues, str2, strArr);
        $jacocoInit[19] = true;
        return update;
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        boolean[] $jacocoInit = $jacocoInit();
        Cursor query = this.database.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        $jacocoInit[21] = true;
        return query;
    }
}
