package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.util.C4476d0;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5292j3 extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C5259g3 f15139a;

    C5292j3(C5259g3 g3Var, Context context, String str) {
        this.f15139a = g3Var;
        super(context, str, null, 1);
    }

    @C0226w0
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f15139a.mo21205d().mo21533t().mo21549a("Opening the local database failed, dropping and recreating it");
            String str = "google_app_measurement_local.db";
            if (!this.f15139a.mo21206e().getDatabasePath(str).delete()) {
                this.f15139a.mo21205d().mo21533t().mo21550a("Failed to delete corrupted local db file", str);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f15139a.mo21205d().mo21533t().mo21550a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @C0226w0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C5441w9.m23722a(this.f15139a.mo21205d(), sQLiteDatabase);
    }

    @C0226w0
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0226w0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 >= r1) goto L_0x001d
            r0 = 0
            java.lang.String r1 = "PRAGMA journal_mode=memory"
            android.database.Cursor r0 = r8.rawQuery(r1, r0)     // Catch:{ all -> 0x0016 }
            r0.moveToFirst()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x001d
            r0.close()
            goto L_0x001d
        L_0x0016:
            r8 = move-exception
            if (r0 == 0) goto L_0x001c
            r0.close()
        L_0x001c:
            throw r8
        L_0x001d:
            com.google.android.gms.measurement.internal.g3 r0 = r7.f15139a
            com.google.android.gms.measurement.internal.k3 r1 = r0.mo21205d()
            r6 = 0
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r2 = r8
            com.google.android.gms.measurement.internal.C5441w9.m23723a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5292j3.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @C0226w0
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
