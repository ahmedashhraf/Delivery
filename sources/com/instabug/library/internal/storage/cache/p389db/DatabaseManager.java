package com.instabug.library.internal.storage.cache.p389db;

import android.database.sqlite.SQLiteOpenHelper;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.db.DatabaseManager */
public class DatabaseManager {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static SQLiteDatabaseWrapper databaseWrapper;
    private static DatabaseManager instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5136395809033377323L, "com/instabug/library/internal/storage/cache/db/DatabaseManager", 14);
        $jacocoData = a;
        return a;
    }

    public DatabaseManager() {
        $jacocoInit()[0] = true;
    }

    public static synchronized DatabaseManager getInstance() {
        DatabaseManager databaseManager;
        Class<DatabaseManager> cls = DatabaseManager.class;
        synchronized (cls) {
            boolean[] $jacocoInit = $jacocoInit();
            if (instance != null) {
                databaseManager = instance;
                $jacocoInit[8] = true;
            } else {
                $jacocoInit[6] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getSimpleName());
                sb.append(" is not initialized, call init(..) method first.");
                IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                $jacocoInit[7] = true;
                throw illegalStateException;
            }
        }
        return databaseManager;
    }

    public static synchronized void init(SQLiteOpenHelper sQLiteOpenHelper) {
        synchronized (DatabaseManager.class) {
            boolean[] $jacocoInit = $jacocoInit();
            if (instance != null) {
                $jacocoInit[1] = true;
            } else {
                $jacocoInit[2] = true;
                instance = new DatabaseManager();
                $jacocoInit[3] = true;
                databaseWrapper = new SQLiteDatabaseWrapper(sQLiteOpenHelper);
                $jacocoInit[4] = true;
            }
            $jacocoInit[5] = true;
        }
    }

    public static synchronized void tearDown() {
        synchronized (DatabaseManager.class) {
            boolean[] $jacocoInit = $jacocoInit();
            if (databaseWrapper == null) {
                $jacocoInit[10] = true;
            } else {
                $jacocoInit[11] = true;
                databaseWrapper.close();
                databaseWrapper = null;
                $jacocoInit[12] = true;
            }
            instance = null;
            $jacocoInit[13] = true;
        }
    }

    public SQLiteDatabaseWrapper openDatabase() {
        boolean[] $jacocoInit = $jacocoInit();
        databaseWrapper.open();
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper = databaseWrapper;
        $jacocoInit[9] = true;
        return sQLiteDatabaseWrapper;
    }
}
