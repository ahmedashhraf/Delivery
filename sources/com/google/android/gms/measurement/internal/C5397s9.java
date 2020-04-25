package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0226w0;
import bolts.C2176m;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.measurement.C4801i4;
import com.google.android.gms.internal.measurement.C4842l0.C4843a;
import com.google.android.gms.internal.measurement.C4842l0.C4845b;
import com.google.android.gms.internal.measurement.C4842l0.C4852e;
import com.google.android.gms.internal.measurement.C4966t0.C4971c;
import com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a;
import com.google.android.gms.internal.measurement.C4966t0.C4975e;
import com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a;
import com.google.android.gms.internal.measurement.C4966t0.C4979g;
import com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a;
import com.google.android.gms.measurement.p174b.C5179a.C5180a;
import com.instabug.library.model.State;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smackx.workgroup.MetaData;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p489f.C14069f;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5397s9 extends C5429v8 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f15465f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f15466g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f15467h = {State.KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f15468i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f15469j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f15470k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f15471l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f15472m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C5200b f15473d = new C5200b(this, mo21206e(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5385r8 f15474e = new C5385r8(mo21208g());

    static {
        String str = "session_scoped";
        f15470k = new String[]{str, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        f15471l = new String[]{str, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    }

    C5397s9(C5461y8 y8Var) {
        super(y8Var);
    }

    /* renamed from: Q */
    private final boolean m23470Q() {
        return mo21206e().getDatabasePath("google_app_measurement.db").exists();
    }

    @C0226w0
    /* renamed from: a */
    private final long m23471a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo21709w().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @C0226w0
    /* renamed from: b */
    private final long m23477b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo21709w().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @C0226w0
    /* renamed from: A */
    public final void mo21668A() {
        mo21739s();
        mo21709w().endTransaction();
    }

    /* renamed from: C */
    public final boolean mo21669C() {
        return m23477b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: D */
    public final void mo21670D() {
        mo21209h();
        mo21739s();
        if (m23470Q()) {
            long a = mo21213l().f15573h.mo21825a();
            long d = mo21208g().mo18572d();
            if (Math.abs(d - a) > ((Long) C5310l.f15194F.mo21225a(null)).longValue()) {
                mo21213l().f15573h.mo21826a(d);
                mo21209h();
                mo21739s();
                if (m23470Q()) {
                    int delete = mo21709w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo21208g().mo18569a()), String.valueOf(C5386r9.m23408x())});
                    if (delete > 0) {
                        mo21205d().mo21528C().mo21550a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @C0226w0
    /* renamed from: E */
    public final long mo21671E() {
        return m23471a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @C0226w0
    /* renamed from: F */
    public final long mo21672F() {
        return m23471a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: G */
    public final boolean mo21673G() {
        return m23477b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: H */
    public final boolean mo21674H() {
        return m23477b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    @androidx.annotation.C0226w0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C5265g9 mo21698c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C4300a0.m18630b(r19)
            com.google.android.gms.common.internal.C4300a0.m18630b(r20)
            r18.mo21209h()
            r18.mo21739s()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo21709w()     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0088, all -> 0x0083 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            if (r0 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0043
            r10.close()
        L_0x0043:
            return r9
        L_0x0044:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007b }
            r11 = r18
            java.lang.Object r7 = r11.m23473a(r10, r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.g9 r0 = new com.google.android.gms.measurement.internal.g9     // Catch:{ SQLiteException -> 0x0079 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.k3 r1 = r18.mo21205d()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r19)     // Catch:{ SQLiteException -> 0x0079 }
            r1.mo21550a(r2, r3)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0073:
            if (r10 == 0) goto L_0x0078
            r10.close()
        L_0x0078:
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x008c
        L_0x007b:
            r0 = move-exception
            r11 = r18
            goto L_0x00ac
        L_0x007f:
            r0 = move-exception
            r11 = r18
            goto L_0x008c
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00ac
        L_0x0088:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x008c:
            com.google.android.gms.measurement.internal.k3 r1 = r18.mo21205d()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r19)     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.i3 r4 = r18.mo21211j()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r4.mo21431c(r8)     // Catch:{ all -> 0x00ab }
            r1.mo21552a(r2, r3, r4, r0)     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x00aa
            r10.close()
        L_0x00aa:
            return r9
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            if (r10 == 0) goto L_0x00b1
            r10.close()
        L_0x00b1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21698c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g9");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155  */
    @androidx.annotation.C0226w0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzs mo21699d(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r7 = r34
            com.google.android.gms.common.internal.C4300a0.m18630b(r33)
            com.google.android.gms.common.internal.C4300a0.m18630b(r34)
            r32.mo21209h()
            r32.mo21739s()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r32.mo21709w()     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r10 = "conditional_properties"
            r0 = 11
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "origin"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "value"
            r2 = 1
            r11[r2] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "active"
            r3 = 2
            r11[r3] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "trigger_event_name"
            r4 = 3
            r11[r4] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "trigger_timeout"
            r5 = 4
            r11[r5] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "timed_out_event"
            r6 = 5
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r11[r14] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r11[r13] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "time_to_live"
            r12 = 9
            r11[r12] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "expired_event"
            r6 = 10
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            java.lang.String r0 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            r13[r1] = r33     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            r17 = 0
            r18 = 0
            r19 = 0
            r6 = 9
            r12 = r0
            r0 = 8
            r6 = 7
            r14 = r17
            r0 = 6
            r15 = r18
            r16 = r19
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x012f, all -> 0x012a }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0126, all -> 0x0122 }
            if (r10 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9.close()
        L_0x007d:
            return r8
        L_0x007e:
            java.lang.String r19 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x0126, all -> 0x0122 }
            r10 = r32
            java.lang.Object r11 = r10.m23473a(r9, r2)     // Catch:{ SQLiteException -> 0x0120 }
            int r3 = r9.getInt(r3)     // Catch:{ SQLiteException -> 0x0120 }
            if (r3 == 0) goto L_0x0091
            r23 = 1
            goto L_0x0093
        L_0x0091:
            r23 = 0
        L_0x0093:
            java.lang.String r24 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x0120 }
            long r26 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.c9 r1 = r32.mo21216o()     // Catch:{ SQLiteException -> 0x0120 }
            r2 = 5
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r3 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable r1 = r1.mo21191a(r2, r3)     // Catch:{ SQLiteException -> 0x0120 }
            r25 = r1
            com.google.android.gms.measurement.internal.zzak r25 = (com.google.android.gms.measurement.internal.zzak) r25     // Catch:{ SQLiteException -> 0x0120 }
            long r12 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.c9 r0 = r32.mo21216o()     // Catch:{ SQLiteException -> 0x0120 }
            byte[] r1 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r2 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable r0 = r0.mo21191a(r1, r2)     // Catch:{ SQLiteException -> 0x0120 }
            r28 = r0
            com.google.android.gms.measurement.internal.zzak r28 = (com.google.android.gms.measurement.internal.zzak) r28     // Catch:{ SQLiteException -> 0x0120 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0120 }
            r0 = 9
            long r29 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.c9 r0 = r32.mo21216o()     // Catch:{ SQLiteException -> 0x0120 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r2 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0120 }
            android.os.Parcelable r0 = r0.mo21191a(r1, r2)     // Catch:{ SQLiteException -> 0x0120 }
            r31 = r0
            com.google.android.gms.measurement.internal.zzak r31 = (com.google.android.gms.measurement.internal.zzak) r31     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.zzjx r20 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ SQLiteException -> 0x0120 }
            r1 = r20
            r2 = r34
            r5 = r11
            r6 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.zzs r0 = new com.google.android.gms.measurement.internal.zzs     // Catch:{ SQLiteException -> 0x0120 }
            r17 = r0
            r18 = r33
            r21 = r12
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r31)     // Catch:{ SQLiteException -> 0x0120 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0120 }
            if (r1 == 0) goto L_0x011a
            com.google.android.gms.measurement.internal.k3 r1 = r32.mo21205d()     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ SQLiteException -> 0x0120 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r33)     // Catch:{ SQLiteException -> 0x0120 }
            com.google.android.gms.measurement.internal.i3 r4 = r32.mo21211j()     // Catch:{ SQLiteException -> 0x0120 }
            java.lang.String r4 = r4.mo21431c(r7)     // Catch:{ SQLiteException -> 0x0120 }
            r1.mo21551a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0120 }
        L_0x011a:
            if (r9 == 0) goto L_0x011f
            r9.close()
        L_0x011f:
            return r0
        L_0x0120:
            r0 = move-exception
            goto L_0x0133
        L_0x0122:
            r0 = move-exception
            r10 = r32
            goto L_0x0153
        L_0x0126:
            r0 = move-exception
            r10 = r32
            goto L_0x0133
        L_0x012a:
            r0 = move-exception
            r10 = r32
            r9 = r8
            goto L_0x0153
        L_0x012f:
            r0 = move-exception
            r10 = r32
            r9 = r8
        L_0x0133:
            com.google.android.gms.measurement.internal.k3 r1 = r32.mo21205d()     // Catch:{ all -> 0x0152 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x0152 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r33)     // Catch:{ all -> 0x0152 }
            com.google.android.gms.measurement.internal.i3 r4 = r32.mo21211j()     // Catch:{ all -> 0x0152 }
            java.lang.String r4 = r4.mo21431c(r7)     // Catch:{ all -> 0x0152 }
            r1.mo21552a(r2, r3, r4, r0)     // Catch:{ all -> 0x0152 }
            if (r9 == 0) goto L_0x0151
            r9.close()
        L_0x0151:
            return r8
        L_0x0152:
            r0 = move-exception
        L_0x0153:
            if (r9 == 0) goto L_0x0158
            r9.close()
        L_0x0158:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21699d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzs");
    }

    @C0226w0
    /* renamed from: e */
    public final int mo21701e(String str, String str2) {
        C4300a0.m18630b(str);
        C4300a0.m18630b(str2);
        mo21209h();
        mo21739s();
        try {
            return mo21709w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21552a("Error deleting conditional property", C5303k3.m23051a(str), mo21211j().mo21431c(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C4842l0.C4845b>> mo21704f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo21739s()
            r12.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r13)
            com.google.android.gms.common.internal.C4300a0.m18630b(r14)
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo21709w()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x009c }
            if (r1 != 0) goto L_0x0048
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x009c }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r13
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x009c }
            com.google.android.gms.internal.measurement.l0$b$a r2 = com.google.android.gms.internal.measurement.C4842l0.C4845b.m20548y()     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.q5 r1 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r2, r1)     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.l0$b$a r1 = (com.google.android.gms.internal.measurement.C4842l0.C4845b.C4846a) r1     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.r5 r1 = r1.mo19056B()     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.i4 r1 = (com.google.android.gms.internal.measurement.C4801i4) r1     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.l0$b r1 = (com.google.android.gms.internal.measurement.C4842l0.C4845b) r1     // Catch:{ IOException -> 0x007e }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x009c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x009c }
            if (r3 != 0) goto L_0x007a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x009c }
            r3.<init>()     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x009c }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x009c }
        L_0x007a:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x009c }
            goto L_0x0090
        L_0x007e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.k3 r2 = r12.mo21205d()     // Catch:{ SQLiteException -> 0x009c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ SQLiteException -> 0x009c }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ SQLiteException -> 0x009c }
            r2.mo21551a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x009c }
        L_0x0090:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x009c }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x009b
            r14.close()
        L_0x009b:
            return r0
        L_0x009c:
            r0 = move-exception
            goto L_0x00a3
        L_0x009e:
            r13 = move-exception
            r14 = r9
            goto L_0x00bb
        L_0x00a1:
            r0 = move-exception
            r14 = r9
        L_0x00a3:
            com.google.android.gms.measurement.internal.k3 r1 = r12.mo21205d()     // Catch:{ all -> 0x00ba }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ all -> 0x00ba }
            r1.mo21551a(r2, r13, r0)     // Catch:{ all -> 0x00ba }
            if (r14 == 0) goto L_0x00b9
            r14.close()
        L_0x00b9:
            return r9
        L_0x00ba:
            r13 = move-exception
        L_0x00bb:
            if (r14 == 0) goto L_0x00c0
            r14.close()
        L_0x00c0:
            goto L_0x00c2
        L_0x00c1:
            throw r13
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21704f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C4842l0.C4852e>> mo21706g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo21739s()
            r12.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r13)
            com.google.android.gms.common.internal.C4300a0.m18630b(r14)
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo21709w()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009e }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x009c }
            if (r1 != 0) goto L_0x0048
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x009c }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r13
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x009c }
            com.google.android.gms.internal.measurement.l0$e$a r2 = com.google.android.gms.internal.measurement.C4842l0.C4852e.m20599v()     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.q5 r1 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r2, r1)     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.l0$e$a r1 = (com.google.android.gms.internal.measurement.C4842l0.C4852e.C4853a) r1     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.r5 r1 = r1.mo19056B()     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.i4 r1 = (com.google.android.gms.internal.measurement.C4801i4) r1     // Catch:{ IOException -> 0x007e }
            com.google.android.gms.internal.measurement.l0$e r1 = (com.google.android.gms.internal.measurement.C4842l0.C4852e) r1     // Catch:{ IOException -> 0x007e }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x009c }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x009c }
            if (r3 != 0) goto L_0x007a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x009c }
            r3.<init>()     // Catch:{ SQLiteException -> 0x009c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x009c }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x009c }
        L_0x007a:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x009c }
            goto L_0x0090
        L_0x007e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.k3 r2 = r12.mo21205d()     // Catch:{ SQLiteException -> 0x009c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ SQLiteException -> 0x009c }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ SQLiteException -> 0x009c }
            r2.mo21551a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x009c }
        L_0x0090:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x009c }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x009b
            r14.close()
        L_0x009b:
            return r0
        L_0x009c:
            r0 = move-exception
            goto L_0x00a3
        L_0x009e:
            r13 = move-exception
            r14 = r9
            goto L_0x00bb
        L_0x00a1:
            r0 = move-exception
            r14 = r9
        L_0x00a3:
            com.google.android.gms.measurement.internal.k3 r1 = r12.mo21205d()     // Catch:{ all -> 0x00ba }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ all -> 0x00ba }
            r1.mo21551a(r2, r13, r0)     // Catch:{ all -> 0x00ba }
            if (r14 == 0) goto L_0x00b9
            r14.close()
        L_0x00b9:
            return r9
        L_0x00ba:
            r13 = move-exception
        L_0x00bb:
            if (r14 == 0) goto L_0x00c0
            r14.close()
        L_0x00c0:
            goto L_0x00c2
        L_0x00c1:
            throw r13
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21706g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    @C0226w0
    @C4476d0
    /* renamed from: h */
    public final long mo21707h(String str, String str2) {
        long j;
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        C4300a0.m18630b(str);
        C4300a0.m18630b(str2);
        mo21209h();
        mo21739s();
        SQLiteDatabase w = mo21709w();
        w.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str6);
            sb.append(" from app2 where app_id=?");
            try {
                j = m23471a(sb.toString(), new String[]{str5}, -1);
                str3 = "app2";
                str4 = "app_id";
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str4, str5);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (w.insertWithOnConflict(str3, null, contentValues, 5) == -1) {
                        mo21205d().mo21533t().mo21551a("Failed to insert column (got -1). appId", C5303k3.m23051a(str), str6);
                        w.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                j = 0;
                try {
                    mo21205d().mo21533t().mo21552a("Error inserting column. appId", C5303k3.m23051a(str), str6, e);
                    w.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    w.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str4, str5);
                contentValues2.put(str6, Long.valueOf(1 + j));
                if (((long) w.update(str3, contentValues2, "app_id = ?", new String[]{str5})) == 0) {
                    mo21205d().mo21533t().mo21551a("Failed to update column (got 0). appId", C5303k3.m23051a(str), str6);
                    w.endTransaction();
                    return -1;
                }
                w.setTransactionSuccessful();
                w.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                mo21205d().mo21533t().mo21552a("Error inserting column. appId", C5303k3.m23051a(str), str6, e);
                w.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            j = 0;
            mo21205d().mo21533t().mo21552a("Error inserting column. appId", C5303k3.m23051a(str), str6, e);
            w.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            w.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        return false;
    }

    @C0226w0
    /* renamed from: v */
    public final void mo21708v() {
        mo21739s();
        mo21709w().setTransactionSuccessful();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    @C4476d0
    /* renamed from: w */
    public final SQLiteDatabase mo21709w() {
        mo21209h();
        try {
            return this.f15473d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo21205d().mo21536w().mo21550a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    @androidx.annotation.C0226w0
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo21710x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo21709w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo21205d()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo21550a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21710x():java.lang.String");
    }

    /* renamed from: y */
    public final long mo21711y() {
        Cursor cursor = null;
        try {
            cursor = mo21709w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21550a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @C0226w0
    /* renamed from: z */
    public final void mo21712z() {
        mo21739s();
        mo21709w().beginTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C5255g mo21677a(java.lang.String r32, java.lang.String r33) {
        /*
            r31 = this;
            r15 = r32
            r14 = r33
            com.google.android.gms.common.internal.C4300a0.m18630b(r32)
            com.google.android.gms.common.internal.C4300a0.m18630b(r33)
            r31.mo21209h()
            r31.mo21739s()
            com.google.android.gms.measurement.internal.r9 r0 = r31.mo21214m()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C5310l.f15270v0
            boolean r0 = r0.mo21643e(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 8
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            java.lang.String r5 = "lifetime_count"
            r3[r4] = r5
            r5 = 1
            java.lang.String r6 = "current_bundle_count"
            r3[r5] = r6
            r6 = 2
            java.lang.String r7 = "last_fire_timestamp"
            r3[r6] = r7
            r7 = 3
            java.lang.String r8 = "last_bundled_timestamp"
            r3[r7] = r8
            r8 = 4
            java.lang.String r9 = "last_bundled_day"
            r3[r8] = r9
            r9 = 5
            java.lang.String r10 = "last_sampled_complex_event_id"
            r3[r9] = r10
            r10 = 6
            java.lang.String r11 = "last_sampling_rate"
            r3[r10] = r11
            r11 = 7
            java.lang.String r12 = "last_exempt_from_sampling"
            r3[r11] = r12
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.<init>(r3)
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = "current_session_count"
            r1.add(r3)
        L_0x0056:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r19 = r31.mo21709w()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            java.lang.String r20 = "events"
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            r21 = r1
            java.lang.String[] r21 = (java.lang.String[]) r21     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            java.lang.String r22 = "app_id=? and name=?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            r1[r4] = r15     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            r1[r5] = r14     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            r24 = 0
            r25 = 0
            r26 = 0
            r23 = r1
            android.database.Cursor r12 = r19.query(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014b }
            boolean r1 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r1 != 0) goto L_0x0088
            if (r12 == 0) goto L_0x0087
            r12.close()
        L_0x0087:
            return r18
        L_0x0088:
            long r16 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            long r19 = r12.getLong(r5)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            long r21 = r12.getLong(r6)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            boolean r1 = r12.isNull(r7)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r23 = 0
            if (r1 == 0) goto L_0x009f
            r25 = r23
            goto L_0x00a5
        L_0x009f:
            long r6 = r12.getLong(r7)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r25 = r6
        L_0x00a5:
            boolean r1 = r12.isNull(r8)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r1 == 0) goto L_0x00ae
            r27 = r18
            goto L_0x00b8
        L_0x00ae:
            long r6 = r12.getLong(r8)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r27 = r1
        L_0x00b8:
            boolean r1 = r12.isNull(r9)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r1 == 0) goto L_0x00c1
            r28 = r18
            goto L_0x00cb
        L_0x00c1:
            long r6 = r12.getLong(r9)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r28 = r1
        L_0x00cb:
            boolean r1 = r12.isNull(r10)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r1 == 0) goto L_0x00d4
            r29 = r18
            goto L_0x00de
        L_0x00d4:
            long r6 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r29 = r1
        L_0x00de:
            boolean r1 = r12.isNull(r11)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r1 != 0) goto L_0x00f6
            long r6 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r8 = 1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00ef
            r4 = 1
        L_0x00ef:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r30 = r1
            goto L_0x00f8
        L_0x00f6:
            r30 = r18
        L_0x00f8:
            if (r0 == 0) goto L_0x0106
            boolean r0 = r12.isNull(r2)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            if (r0 != 0) goto L_0x0106
            long r0 = r12.getLong(r2)     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r8 = r0
            goto L_0x0108
        L_0x0106:
            r8 = r23
        L_0x0108:
            com.google.android.gms.measurement.internal.g r0 = new com.google.android.gms.measurement.internal.g     // Catch:{ SQLiteException -> 0x0147, all -> 0x0143 }
            r1 = r0
            r2 = r32
            r3 = r33
            r4 = r16
            r6 = r19
            r10 = r21
            r19 = r12
            r12 = r25
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0141 }
            boolean r1 = r19.moveToNext()     // Catch:{ SQLiteException -> 0x0141 }
            if (r1 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.k3 r1 = r31.mo21205d()     // Catch:{ SQLiteException -> 0x0141 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r32)     // Catch:{ SQLiteException -> 0x0141 }
            r1.mo21550a(r2, r3)     // Catch:{ SQLiteException -> 0x0141 }
        L_0x013b:
            if (r19 == 0) goto L_0x0140
            r19.close()
        L_0x0140:
            return r0
        L_0x0141:
            r0 = move-exception
            goto L_0x0152
        L_0x0143:
            r0 = move-exception
            r19 = r12
            goto L_0x0174
        L_0x0147:
            r0 = move-exception
            r19 = r12
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            r19 = r18
            goto L_0x0174
        L_0x014f:
            r0 = move-exception
            r19 = r18
        L_0x0152:
            com.google.android.gms.measurement.internal.k3 r1 = r31.mo21205d()     // Catch:{ all -> 0x0173 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x0173 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r32)     // Catch:{ all -> 0x0173 }
            com.google.android.gms.measurement.internal.i3 r4 = r31.mo21211j()     // Catch:{ all -> 0x0173 }
            r5 = r33
            java.lang.String r4 = r4.mo21429a(r5)     // Catch:{ all -> 0x0173 }
            r1.mo21552a(r2, r3, r4, r0)     // Catch:{ all -> 0x0173 }
            if (r19 == 0) goto L_0x0172
            r19.close()
        L_0x0172:
            return r18
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            if (r19 == 0) goto L_0x0179
            r19.close()
        L_0x0179:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21677a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g");
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21696b(String str, String str2) {
        C4300a0.m18630b(str);
        C4300a0.m18630b(str2);
        mo21209h();
        mo21739s();
        try {
            mo21205d().mo21528C().mo21550a("Deleted user attribute rows", Integer.valueOf(mo21709w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21552a("Error deleting user attribute. appId", C5303k3.m23051a(str), mo21211j().mo21431c(str2), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo21702e(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo21739s()
            r7.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r8)
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.mo21709w()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006c
        L_0x0067:
            r8 = move-exception
            r1 = r2
            goto L_0x0084
        L_0x006a:
            r0 = move-exception
            r1 = r2
        L_0x006c:
            com.google.android.gms.measurement.internal.k3 r3 = r7.mo21205d()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r8)     // Catch:{ all -> 0x0083 }
            r3.mo21551a(r4, r8, r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r2
        L_0x0083:
            r8 = move-exception
        L_0x0084:
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r8
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21702e(java.lang.String):java.util.Map");
    }

    @C0226w0
    /* renamed from: b */
    public final List<zzs> mo21695b(String str, String str2, String str3) {
        C4300a0.m18630b(str);
        mo21209h();
        mo21739s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(C14069f.f41343G));
            sb.append(" and name glob ?");
        }
        return mo21683a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: c */
    public final long mo21697c(String str) {
        C4300a0.m18630b(str);
        mo21209h();
        mo21739s();
        try {
            return (long) mo21709w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo21214m().mo21636b(str, C5310l.f15271w))))});
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error deleting over the limit events. appId", C5303k3.m23051a(str), e);
            return 0;
        }
    }

    /* renamed from: g */
    public final long mo21705g(String str) {
        C4300a0.m18630b(str);
        return m23471a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C4966t0.C4984i> mo21703f(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo21739s()
            r11.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo21709w()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            r4[r9] = r12     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0081 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007f }
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return r8
        L_0x0036:
            androidx.collection.a r1 = new androidx.collection.a     // Catch:{ SQLiteException -> 0x007f }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007f }
        L_0x003b:
            int r2 = r0.getInt(r9)     // Catch:{ SQLiteException -> 0x007f }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ SQLiteException -> 0x007f }
            com.google.android.gms.internal.measurement.t0$i$a r4 = com.google.android.gms.internal.measurement.C4966t0.C4984i.m21498v()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.q5 r3 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r4, r3)     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.t0$i$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4984i.C4985a) r3     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.r5 r3 = r3.mo19056B()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.t0$i r3 = (com.google.android.gms.internal.measurement.C4966t0.C4984i) r3     // Catch:{ IOException -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007f }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x007f }
            goto L_0x0073
        L_0x005d:
            r3 = move-exception
            com.google.android.gms.measurement.internal.k3 r4 = r11.mo21205d()     // Catch:{ SQLiteException -> 0x007f }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ SQLiteException -> 0x007f }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ SQLiteException -> 0x007f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007f }
            r4.mo21552a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007f }
        L_0x0073:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007f }
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x007e
            r0.close()
        L_0x007e:
            return r1
        L_0x007f:
            r1 = move-exception
            goto L_0x0086
        L_0x0081:
            r12 = move-exception
            r0 = r8
            goto L_0x009e
        L_0x0084:
            r1 = move-exception
            r0 = r8
        L_0x0086:
            com.google.android.gms.measurement.internal.k3 r2 = r11.mo21205d()     // Catch:{ all -> 0x009d }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ all -> 0x009d }
            r2.mo21551a(r3, r12, r1)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x009c
            r0.close()
        L_0x009c:
            return r8
        L_0x009d:
            r12 = move-exception
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            r0.close()
        L_0x00a3:
            goto L_0x00a5
        L_0x00a4:
            throw r12
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21703f(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x018d A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0191 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01c5 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01c8 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01d7 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0207 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x020a A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0219 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0234 A[Catch:{ SQLiteException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0278  */
    @androidx.annotation.C0226w0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C5239e5 mo21694b(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            com.google.android.gms.common.internal.C4300a0.m18630b(r21)
            r20.mo21209h()
            r20.mo21739s()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r20.mo21709w()     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r4 = "apps"
            r0 = 28
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "app_instance_id"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "gmp_app_id"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "last_bundle_index"
            r14 = 3
            r5[r14] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r5[r9] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 7
            java.lang.String r6 = "app_store"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 8
            java.lang.String r6 = "gmp_version"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 9
            java.lang.String r6 = "dev_cert_hash"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "measurement_enabled"
            r8 = 10
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 11
            java.lang.String r6 = "day"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 12
            java.lang.String r6 = "daily_public_events_count"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 13
            java.lang.String r6 = "daily_events_count"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 14
            java.lang.String r6 = "daily_conversions_count"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 15
            java.lang.String r6 = "config_fetched_time"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 16
            java.lang.String r6 = "failed_config_fetch_time"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "app_version_int"
            r7 = 17
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 18
            java.lang.String r6 = "firebase_instance_id"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 19
            java.lang.String r6 = "daily_error_events_count"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 20
            java.lang.String r6 = "daily_realtime_events_count"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 21
            java.lang.String r6 = "health_monitor_sample"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "android_id"
            r6 = 22
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "ssaid_reporting_enabled"
            r15 = 24
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r0 = 25
            java.lang.String r16 = "admob_app_id"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "dynamite_version"
            r15 = 26
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "safelisted_events"
            r15 = 27
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            java.lang.String r0 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            r17 = 0
            r18 = 0
            r19 = 0
            r15 = 22
            r6 = r0
            r0 = 17
            r15 = 10
            r8 = r17
            r0 = 6
            r9 = r18
            r15 = 5
            r10 = r19
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x025a, all -> 0x0255 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0251, all -> 0x024d }
            if (r4 != 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00e0
            r3.close()
        L_0x00e0:
            return r2
        L_0x00e1:
            com.google.android.gms.measurement.internal.e5 r4 = new com.google.android.gms.measurement.internal.e5     // Catch:{ SQLiteException -> 0x0251, all -> 0x024d }
            r5 = r20
            com.google.android.gms.measurement.internal.y8 r6 = r5.f15561b     // Catch:{ SQLiteException -> 0x024b }
            com.google.android.gms.measurement.internal.p4 r6 = r6.mo21865s()     // Catch:{ SQLiteException -> 0x024b }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21252a(r6)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21257b(r6)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21265d(r6)     // Catch:{ SQLiteException -> 0x024b }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21273g(r6)     // Catch:{ SQLiteException -> 0x024b }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21250a(r6)     // Catch:{ SQLiteException -> 0x024b }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21256b(r6)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21270f(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21274g(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 8
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21264d(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 9
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21266e(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 10
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 != 0) goto L_0x014b
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r0 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r0 = 0
            goto L_0x014c
        L_0x014b:
            r0 = 1
        L_0x014c:
            r4.mo21254a(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 11
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21281j(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 12
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21283k(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 13
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21285l(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 14
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21287m(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 15
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21276h(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 16
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21279i(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 17
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 == 0) goto L_0x0191
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0196
        L_0x0191:
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x024b }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x024b }
        L_0x0196:
            r4.mo21260c(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 18
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21267e(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 19
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21291o(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 20
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21289n(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 21
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21277h(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 22
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 == 0) goto L_0x01c8
            r6 = 0
            goto L_0x01cc
        L_0x01c8:
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
        L_0x01cc:
            r4.mo21293p(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 23
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 != 0) goto L_0x01e0
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r0 == 0) goto L_0x01de
            goto L_0x01e0
        L_0x01de:
            r0 = 0
            goto L_0x01e1
        L_0x01e0:
            r0 = 1
        L_0x01e1:
            r4.mo21258b(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 24
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 != 0) goto L_0x01f2
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r0 == 0) goto L_0x01f3
        L_0x01f2:
            r11 = 1
        L_0x01f3:
            r4.mo21262c(r11)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21261c(r0)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 == 0) goto L_0x020a
            r6 = 0
            goto L_0x020e
        L_0x020a:
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x024b }
        L_0x020e:
            r4.mo21269f(r6)     // Catch:{ SQLiteException -> 0x024b }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x024b }
            if (r6 != 0) goto L_0x022b
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x024b }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x024b }
            r4.mo21253a(r0)     // Catch:{ SQLiteException -> 0x024b }
        L_0x022b:
            r4.mo21249a()     // Catch:{ SQLiteException -> 0x024b }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x024b }
            if (r0 == 0) goto L_0x0245
            com.google.android.gms.measurement.internal.k3 r0 = r20.mo21205d()     // Catch:{ SQLiteException -> 0x024b }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ SQLiteException -> 0x024b }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r21)     // Catch:{ SQLiteException -> 0x024b }
            r0.mo21550a(r6, r7)     // Catch:{ SQLiteException -> 0x024b }
        L_0x0245:
            if (r3 == 0) goto L_0x024a
            r3.close()
        L_0x024a:
            return r4
        L_0x024b:
            r0 = move-exception
            goto L_0x025e
        L_0x024d:
            r0 = move-exception
            r5 = r20
            goto L_0x0276
        L_0x0251:
            r0 = move-exception
            r5 = r20
            goto L_0x025e
        L_0x0255:
            r0 = move-exception
            r5 = r20
            r3 = r2
            goto L_0x0276
        L_0x025a:
            r0 = move-exception
            r5 = r20
            r3 = r2
        L_0x025e:
            com.google.android.gms.measurement.internal.k3 r4 = r20.mo21205d()     // Catch:{ all -> 0x0275 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x0275 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r21)     // Catch:{ all -> 0x0275 }
            r4.mo21551a(r6, r1, r0)     // Catch:{ all -> 0x0275 }
            if (r3 == 0) goto L_0x0274
            r3.close()
        L_0x0274:
            return r2
        L_0x0275:
            r0 = move-exception
        L_0x0276:
            if (r3 == 0) goto L_0x027b
            r3.close()
        L_0x027b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21694b(java.lang.String):com.google.android.gms.measurement.internal.e5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    @androidx.annotation.C0226w0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo21700d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C4300a0.m18630b(r12)
            r11.mo21209h()
            r11.mo21739s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.mo21709w()     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r6[r9] = r12     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0058 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0058 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0058 }
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.measurement.internal.k3 r3 = r11.mo21205d()     // Catch:{ SQLiteException -> 0x0058 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ SQLiteException -> 0x0058 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ SQLiteException -> 0x0058 }
            r3.mo21550a(r4, r5)     // Catch:{ SQLiteException -> 0x0058 }
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r2
        L_0x0058:
            r2 = move-exception
            goto L_0x005f
        L_0x005a:
            r12 = move-exception
            r1 = r0
            goto L_0x0077
        L_0x005d:
            r2 = move-exception
            r1 = r0
        L_0x005f:
            com.google.android.gms.measurement.internal.k3 r3 = r11.mo21205d()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ all -> 0x0076 }
            r3.mo21551a(r4, r12, r2)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r12 = move-exception
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()
        L_0x007c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21700d(java.lang.String):byte[]");
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21686a(C5255g gVar) {
        C4300a0.m18620a(gVar);
        mo21209h();
        mo21739s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.f15041a);
        contentValues.put("name", gVar.f15042b);
        contentValues.put("lifetime_count", Long.valueOf(gVar.f15043c));
        contentValues.put("current_bundle_count", Long.valueOf(gVar.f15044d));
        contentValues.put("last_fire_timestamp", Long.valueOf(gVar.f15046f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(gVar.f15047g));
        contentValues.put("last_bundled_day", gVar.f15048h);
        contentValues.put("last_sampled_complex_event_id", gVar.f15049i);
        contentValues.put("last_sampling_rate", gVar.f15050j);
        if (mo21214m().mo21643e(gVar.f15041a, C5310l.f15270v0)) {
            contentValues.put("current_session_count", Long.valueOf(gVar.f15045e));
        }
        Boolean bool = gVar.f15051k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo21709w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo21205d().mo21533t().mo21550a("Failed to insert/update event aggregates (got -1). appId", C5303k3.m23051a(gVar.f15041a));
            }
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing event aggregates. appId", C5303k3.m23051a(gVar.f15041a), e);
        }
    }

    @C0226w0
    /* renamed from: a */
    public final boolean mo21691a(C5265g9 g9Var) {
        C4300a0.m18620a(g9Var);
        mo21209h();
        mo21739s();
        if (mo21698c(g9Var.f15070a, g9Var.f15072c) == null) {
            if (C5254f9.m22843f(g9Var.f15072c)) {
                if (m23477b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{g9Var.f15070a}) >= 25) {
                    return false;
                }
            } else {
                String str = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
                if (mo21214m().mo21643e(g9Var.f15070a, C5310l.f15244i0)) {
                    if (!"_npa".equals(g9Var.f15072c)) {
                        if (m23477b(str, new String[]{g9Var.f15070a, g9Var.f15071b}) >= 25) {
                            return false;
                        }
                    }
                } else {
                    if (m23477b(str, new String[]{g9Var.f15070a, g9Var.f15071b}) >= 25) {
                        return false;
                    }
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g9Var.f15070a);
        contentValues.put("origin", g9Var.f15071b);
        contentValues.put("name", g9Var.f15072c);
        contentValues.put("set_timestamp", Long.valueOf(g9Var.f15073d));
        m23474a(contentValues, "value", g9Var.f15074e);
        try {
            if (mo21709w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo21205d().mo21533t().mo21550a("Failed to insert/update user property (got -1). appId", C5303k3.m23051a(g9Var.f15070a));
            }
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing user property. appId", C5303k3.m23051a(g9Var.f15070a), e);
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m23478b(String str, List<Integer> list) {
        C4300a0.m18630b(str);
        mo21739s();
        mo21209h();
        SQLiteDatabase w = mo21709w();
        try {
            long b = m23477b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo21214m().mo21636b(str, C5310l.f15208M)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + C13959t.f40882c2);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return w.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Database error querying filters. appId", C5303k3.m23051a(str), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C5265g9> mo21680a(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.C4300a0.m18630b(r23)
            r22.mo21209h()
            r22.mo21739s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.mo21709w()     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            r6[r11] = r23     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0095 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r3 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r18 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            r3 = r22
            java.lang.Object r21 = r3.m23473a(r2, r14)     // Catch:{ SQLiteException -> 0x008b }
            if (r21 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.k3 r4 = r22.mo21205d()     // Catch:{ SQLiteException -> 0x008b }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r23)     // Catch:{ SQLiteException -> 0x008b }
            r4.mo21550a(r5, r6)     // Catch:{ SQLiteException -> 0x008b }
            goto L_0x007f
        L_0x0074:
            com.google.android.gms.measurement.internal.g9 r4 = new com.google.android.gms.measurement.internal.g9     // Catch:{ SQLiteException -> 0x008b }
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SQLiteException -> 0x008b }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x008b }
        L_0x007f:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x008b }
            if (r4 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x008a
            r2.close()
        L_0x008a:
            return r0
        L_0x008b:
            r0 = move-exception
            goto L_0x009e
        L_0x008d:
            r0 = move-exception
            r3 = r22
            goto L_0x00b6
        L_0x0091:
            r0 = move-exception
            r3 = r22
            goto L_0x009e
        L_0x0095:
            r0 = move-exception
            r3 = r22
            r2 = r1
            goto L_0x00b6
        L_0x009a:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L_0x009e:
            com.google.android.gms.measurement.internal.k3 r4 = r22.mo21205d()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x00b5 }
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r23)     // Catch:{ all -> 0x00b5 }
            r4.mo21551a(r5, r6, r0)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00b4
            r2.close()
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            if (r2 == 0) goto L_0x00bb
            r2.close()
        L_0x00bb:
            goto L_0x00bd
        L_0x00bc:
            throw r0
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21680a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0122, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0123, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0126, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        r14 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0122 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C5265g9> mo21682a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C4300a0.m18630b(r22)
            r21.mo21209h()
            r21.mo21739s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0126, all -> 0x0122 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0126, all -> 0x0122 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x011e, all -> 0x0122 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x011e, all -> 0x0122 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x011e, all -> 0x0122 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x011e, all -> 0x0122 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo21709w()     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r13 = "user_attributes"
            r2 = 4
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r2 = "name"
            r10 = 0
            r14[r10] = r2     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r2 = "set_timestamp"
            r8 = 1
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r2 = "value"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r2 = "origin"
            r14[r3] = r2     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0122 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            if (r4 != 0) goto L_0x0092
            if (r2 == 0) goto L_0x0091
            r2.close()
        L_0x0091:
            return r0
        L_0x0092:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00ae
            com.google.android.gms.measurement.internal.k3 r3 = r21.mo21205d()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            r3.mo21550a(r4, r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            r14 = r21
            goto L_0x00fb
        L_0x00ae:
            java.lang.String r7 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            long r12 = r2.getLong(r8)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0112 }
            r14 = r21
            java.lang.Object r15 = r14.m23473a(r2, r9)     // Catch:{ SQLiteException -> 0x0110 }
            java.lang.String r6 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0110 }
            if (r15 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.k3 r4 = r21.mo21205d()     // Catch:{ SQLiteException -> 0x00dd }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r22)     // Catch:{ SQLiteException -> 0x00dd }
            r12 = r24
            r4.mo21552a(r5, r7, r6, r12)     // Catch:{ SQLiteException -> 0x00dd }
            r17 = r6
            r12 = 0
            r18 = 2
            r19 = 1
            goto L_0x00f5
        L_0x00dd:
            r0 = move-exception
            r5 = r6
            goto L_0x012e
        L_0x00e0:
            com.google.android.gms.measurement.internal.g9 r5 = new com.google.android.gms.measurement.internal.g9     // Catch:{ SQLiteException -> 0x010a }
            r4 = r5
            r3 = r5
            r5 = r22
            r17 = r6
            r18 = 2
            r19 = 1
            r8 = r12
            r12 = 0
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0108 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0108 }
        L_0x00f5:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0108 }
            if (r3 != 0) goto L_0x0101
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            r2.close()
        L_0x0100:
            return r0
        L_0x0101:
            r5 = r17
            r3 = 3
            r8 = 1
            r9 = 2
            r10 = 0
            goto L_0x0092
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r17 = r6
        L_0x010d:
            r5 = r17
            goto L_0x012e
        L_0x0110:
            r0 = move-exception
            goto L_0x012e
        L_0x0112:
            r0 = move-exception
            r14 = r21
            goto L_0x0146
        L_0x0116:
            r0 = move-exception
            r14 = r21
            goto L_0x012e
        L_0x011a:
            r0 = move-exception
            r14 = r21
            goto L_0x012d
        L_0x011e:
            r0 = move-exception
            r14 = r21
            goto L_0x012b
        L_0x0122:
            r0 = move-exception
            r14 = r21
            goto L_0x0147
        L_0x0126:
            r0 = move-exception
            r14 = r21
            r11 = r22
        L_0x012b:
            r5 = r23
        L_0x012d:
            r2 = r1
        L_0x012e:
            com.google.android.gms.measurement.internal.k3 r3 = r21.mo21205d()     // Catch:{ all -> 0x0145 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r22)     // Catch:{ all -> 0x0145 }
            r3.mo21552a(r4, r6, r5, r0)     // Catch:{ all -> 0x0145 }
            if (r2 == 0) goto L_0x0144
            r2.close()
        L_0x0144:
            return r1
        L_0x0145:
            r0 = move-exception
        L_0x0146:
            r1 = r2
        L_0x0147:
            if (r1 == 0) goto L_0x014c
            r1.close()
        L_0x014c:
            goto L_0x014e
        L_0x014d:
            throw r0
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21682a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @C0226w0
    /* renamed from: a */
    public final boolean mo21692a(zzs zzs) {
        C4300a0.m18620a(zzs);
        mo21209h();
        mo21739s();
        if (mo21698c(zzs.f15726a, zzs.f15717N.f15695b) == null) {
            if (m23477b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzs.f15726a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzs.f15726a);
        contentValues.put("origin", zzs.f15727b);
        contentValues.put("name", zzs.f15717N.f15695b);
        m23474a(contentValues, "value", zzs.f15717N.mo21886a());
        contentValues.put("active", Boolean.valueOf(zzs.f15719P));
        contentValues.put(C5180a.f14838d, zzs.f15720Q);
        contentValues.put(C5180a.f14839e, Long.valueOf(zzs.f15722S));
        mo21212k();
        contentValues.put("timed_out_event", C5254f9.m22836a((Parcelable) zzs.f15721R));
        contentValues.put(C5180a.f14847m, Long.valueOf(zzs.f15718O));
        mo21212k();
        contentValues.put("triggered_event", C5254f9.m22836a((Parcelable) zzs.f15723T));
        contentValues.put(C5180a.f14849o, Long.valueOf(zzs.f15717N.f15688N));
        contentValues.put(C5180a.f14844j, Long.valueOf(zzs.f15724U));
        mo21212k();
        contentValues.put("expired_event", C5254f9.m22836a((Parcelable) zzs.f15725V));
        try {
            if (mo21709w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo21205d().mo21533t().mo21550a("Failed to insert/update conditional user property (got -1)", C5303k3.m23051a(zzs.f15726a));
            }
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing conditional user property", C5303k3.m23051a(zzs.f15726a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0175  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.zzs> mo21683a(java.lang.String r40, java.lang.String[] r41) {
        /*
            r39 = this;
            r39.mo21209h()
            r39.mo21739s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r39.mo21709w()     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "app_id"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "name"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "active"
            r15 = 4
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "trigger_event_name"
            r10 = 5
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "trigger_timeout"
            r9 = 6
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "timed_out_event"
            r8 = 7
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "creation_timestamp"
            r7 = 8
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "triggered_event"
            r6 = 9
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "triggered_timestamp"
            r1 = 10
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "time_to_live"
            r1 = 11
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            java.lang.String r5 = "expired_event"
            r1 = 12
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "1001"
            r5 = r40
            r1 = 9
            r6 = r41
            r1 = 8
            r7 = r19
            r1 = 7
            r8 = r20
            r1 = 6
            r9 = r21
            r1 = 5
            r10 = r22
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0158, all -> 0x0155 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            if (r3 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x0085
            r2.close()
        L_0x0085:
            return r0
        L_0x0086:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00a1
            com.google.android.gms.measurement.internal.k3 r1 = r39.mo21205d()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            java.lang.String r3 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r1.mo21550a(r3, r4)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            goto L_0x0146
        L_0x00a1:
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            java.lang.String r10 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r9 = r39
            java.lang.Object r8 = r9.m23473a(r2, r14)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            int r4 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            if (r4 == 0) goto L_0x00bc
            r22 = 1
            goto L_0x00be
        L_0x00bc:
            r22 = 0
        L_0x00be:
            java.lang.String r24 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r6 = 6
            long r25 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.c9 r4 = r39.mo21216o()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r7 = 7
            byte[] r1 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r6 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable r1 = r4.mo21191a(r1, r6)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.zzak r1 = (com.google.android.gms.measurement.internal.zzak) r1     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r6 = 8
            long r27 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.c9 r4 = r39.mo21216o()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r7 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable r4 = r4.mo21191a(r6, r7)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r29 = r4
            com.google.android.gms.measurement.internal.zzak r29 = (com.google.android.gms.measurement.internal.zzak) r29     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r6 = 10
            long r16 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r7 = 11
            long r31 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.c9 r4 = r39.mo21216o()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzak> r7 = com.google.android.gms.measurement.internal.zzak.CREATOR     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            android.os.Parcelable r4 = r4.mo21191a(r6, r7)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r30 = r4
            com.google.android.gms.measurement.internal.zzak r30 = (com.google.android.gms.measurement.internal.zzak) r30     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.zzjx r33 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r4 = r33
            r34 = 11
            r35 = 10
            r36 = 8
            r37 = 7
            r38 = 6
            r6 = r16
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            com.google.android.gms.measurement.internal.zzs r4 = new com.google.android.gms.measurement.internal.zzs     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r16 = r4
            r17 = r3
            r18 = r10
            r19 = r33
            r20 = r27
            r23 = r24
            r24 = r1
            r27 = r29
            r28 = r31
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            boolean r1 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0152, all -> 0x0150 }
            if (r1 != 0) goto L_0x014c
        L_0x0146:
            if (r2 == 0) goto L_0x014b
            r2.close()
        L_0x014b:
            return r0
        L_0x014c:
            r1 = 5
            r11 = 0
            goto L_0x0086
        L_0x0150:
            r0 = move-exception
            goto L_0x0173
        L_0x0152:
            r0 = move-exception
            r1 = r2
            goto L_0x015a
        L_0x0155:
            r0 = move-exception
            r2 = 0
            goto L_0x0173
        L_0x0158:
            r0 = move-exception
            r1 = 0
        L_0x015a:
            com.google.android.gms.measurement.internal.k3 r2 = r39.mo21205d()     // Catch:{ all -> 0x0171 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x0171 }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.mo21550a(r3, r0)     // Catch:{ all -> 0x0171 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x0170
            r1.close()
        L_0x0170:
            return r0
        L_0x0171:
            r0 = move-exception
            r2 = r1
        L_0x0173:
            if (r2 == 0) goto L_0x0178
            r2.close()
        L_0x0178:
            goto L_0x017a
        L_0x0179:
            throw r0
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21683a(java.lang.String, java.lang.String[]):java.util.List");
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21685a(C5239e5 e5Var) {
        String str = "apps";
        C4300a0.m18620a(e5Var);
        mo21209h();
        mo21739s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e5Var.mo21278i());
        contentValues.put("app_instance_id", e5Var.mo21280j());
        contentValues.put("gmp_app_id", e5Var.mo21282k());
        contentValues.put("resettable_device_id_hash", e5Var.mo21286m());
        contentValues.put("last_bundle_index", Long.valueOf(e5Var.mo21301x()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(e5Var.mo21290o()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(e5Var.mo21292p()));
        contentValues.put(State.KEY_APP_VERSION, e5Var.mo21294q());
        contentValues.put("app_store", e5Var.mo21296s());
        contentValues.put("gmp_version", Long.valueOf(e5Var.mo21297t()));
        contentValues.put("dev_cert_hash", Long.valueOf(e5Var.mo21298u()));
        contentValues.put("measurement_enabled", Boolean.valueOf(e5Var.mo21300w()));
        contentValues.put("day", Long.valueOf(e5Var.mo21243B()));
        contentValues.put("daily_public_events_count", Long.valueOf(e5Var.mo21244C()));
        contentValues.put("daily_events_count", Long.valueOf(e5Var.mo21245D()));
        contentValues.put("daily_conversions_count", Long.valueOf(e5Var.mo21246E()));
        contentValues.put("config_fetched_time", Long.valueOf(e5Var.mo21302y()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(e5Var.mo21303z()));
        contentValues.put("app_version_int", Long.valueOf(e5Var.mo21295r()));
        contentValues.put("firebase_instance_id", e5Var.mo21288n());
        contentValues.put("daily_error_events_count", Long.valueOf(e5Var.mo21248G()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(e5Var.mo21247F()));
        contentValues.put("health_monitor_sample", e5Var.mo21255b());
        contentValues.put("android_id", Long.valueOf(e5Var.mo21263d()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(e5Var.mo21268e()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(e5Var.mo21271f()));
        contentValues.put("admob_app_id", e5Var.mo21284l());
        contentValues.put("dynamite_version", Long.valueOf(e5Var.mo21299v()));
        if (e5Var.mo21275h() != null) {
            if (e5Var.mo21275h().size() == 0) {
                mo21205d().mo21536w().mo21550a("Safelisted events should not be an empty list. appId", e5Var.mo21278i());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", e5Var.mo21275h()));
            }
        }
        try {
            SQLiteDatabase w = mo21709w();
            if (((long) w.update(str, contentValues, "app_id = ?", new String[]{e5Var.mo21278i()})) == 0 && w.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                mo21205d().mo21533t().mo21550a("Failed to insert/update app (got -1). appId", C5303k3.m23051a(e5Var.mo21278i()));
            }
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing app. appId", C5303k3.m23051a(e5Var.mo21278i()), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a  */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C5430v9 mo21678a(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r21 = this;
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r1 = "daily_error_events_count"
            java.lang.String r2 = "daily_conversions_count"
            java.lang.String r3 = "daily_public_events_count"
            java.lang.String r4 = "daily_events_count"
            java.lang.String r5 = "day"
            com.google.android.gms.common.internal.C4300a0.m18630b(r24)
            r21.mo21209h()
            r21.mo21739s()
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]
            r8 = 0
            r7[r8] = r24
            com.google.android.gms.measurement.internal.v9 r9 = new com.google.android.gms.measurement.internal.v9
            r9.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r21.mo21709w()     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.String r12 = "apps"
            r11 = 6
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r13[r8] = r5     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r13[r6] = r4     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r14 = 2
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r11 = 3
            r13[r11] = r2     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r10 = 4
            r13[r10] = r1     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r10 = 5
            r13[r10] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.String r16 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r10[r8] = r24     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r17 = 0
            r18 = 0
            r19 = 0
            r11 = r15
            r14 = r16
            r20 = r15
            r15 = r10
            r16 = r17
            r17 = r18
            r18 = r19
            android.database.Cursor r10 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0109 }
            if (r11 != 0) goto L_0x0072
            com.google.android.gms.measurement.internal.k3 r0 = r21.mo21205d()     // Catch:{ SQLiteException -> 0x0109 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.String r1 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r24)     // Catch:{ SQLiteException -> 0x0109 }
            r0.mo21550a(r1, r2)     // Catch:{ SQLiteException -> 0x0109 }
            if (r10 == 0) goto L_0x0071
            r10.close()
        L_0x0071:
            return r9
        L_0x0072:
            long r11 = r10.getLong(r8)     // Catch:{ SQLiteException -> 0x0109 }
            int r8 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r8 != 0) goto L_0x009c
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0109 }
            r9.f15537b = r11     // Catch:{ SQLiteException -> 0x0109 }
            r6 = 2
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0109 }
            r9.f15536a = r11     // Catch:{ SQLiteException -> 0x0109 }
            r6 = 3
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0109 }
            r9.f15538c = r11     // Catch:{ SQLiteException -> 0x0109 }
            r6 = 4
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0109 }
            r9.f15539d = r11     // Catch:{ SQLiteException -> 0x0109 }
            r6 = 5
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0109 }
            r9.f15540e = r11     // Catch:{ SQLiteException -> 0x0109 }
        L_0x009c:
            r11 = 1
            if (r25 == 0) goto L_0x00a5
            long r13 = r9.f15537b     // Catch:{ SQLiteException -> 0x0109 }
            long r13 = r13 + r11
            r9.f15537b = r13     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00a5:
            if (r26 == 0) goto L_0x00ac
            long r13 = r9.f15536a     // Catch:{ SQLiteException -> 0x0109 }
            long r13 = r13 + r11
            r9.f15536a = r13     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00ac:
            if (r27 == 0) goto L_0x00b3
            long r13 = r9.f15538c     // Catch:{ SQLiteException -> 0x0109 }
            long r13 = r13 + r11
            r9.f15538c = r13     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00b3:
            if (r28 == 0) goto L_0x00ba
            long r13 = r9.f15539d     // Catch:{ SQLiteException -> 0x0109 }
            long r13 = r13 + r11
            r9.f15539d = r13     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00ba:
            if (r29 == 0) goto L_0x00c1
            long r13 = r9.f15540e     // Catch:{ SQLiteException -> 0x0109 }
            long r13 = r13 + r11
            r9.f15540e = r13     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00c1:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0109 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r8 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r5, r8)     // Catch:{ SQLiteException -> 0x0109 }
            long r11 = r9.f15536a     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r3, r5)     // Catch:{ SQLiteException -> 0x0109 }
            long r11 = r9.f15537b     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r4, r3)     // Catch:{ SQLiteException -> 0x0109 }
            long r3 = r9.f15538c     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r2, r3)     // Catch:{ SQLiteException -> 0x0109 }
            long r2 = r9.f15539d     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r1, r2)     // Catch:{ SQLiteException -> 0x0109 }
            long r1 = r9.f15540e     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0109 }
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.String r0 = "apps"
            java.lang.String r1 = "app_id=?"
            r2 = r20
            r2.update(r0, r6, r1, r7)     // Catch:{ SQLiteException -> 0x0109 }
            if (r10 == 0) goto L_0x0108
            r10.close()
        L_0x0108:
            return r9
        L_0x0109:
            r0 = move-exception
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            r10 = 0
            goto L_0x0128
        L_0x010e:
            r0 = move-exception
            r10 = 0
        L_0x0110:
            com.google.android.gms.measurement.internal.k3 r1 = r21.mo21205d()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = "Error updating daily counts. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r24)     // Catch:{ all -> 0x0127 }
            r1.mo21551a(r2, r3, r0)     // Catch:{ all -> 0x0127 }
            if (r10 == 0) goto L_0x0126
            r10.close()
        L_0x0126:
            return r9
        L_0x0127:
            r0 = move-exception
        L_0x0128:
            if (r10 == 0) goto L_0x012d
            r10.close()
        L_0x012d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21678a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.v9");
    }

    @C0226w0
    /* renamed from: a */
    public final boolean mo21689a(C4979g gVar, boolean z) {
        mo21209h();
        mo21739s();
        C4300a0.m18620a(gVar);
        C4300a0.m18630b(gVar.mo19561o0());
        C4300a0.m18631b(gVar.mo19550e0());
        mo21670D();
        long a = mo21208g().mo18569a();
        if (gVar.mo19551f0() < a - C5386r9.m23408x() || gVar.mo19551f0() > C5386r9.m23408x() + a) {
            mo21205d().mo21536w().mo21552a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C5303k3.m23051a(gVar.mo19561o0()), Long.valueOf(a), Long.valueOf(gVar.mo19551f0()));
        }
        try {
            byte[] c = mo21216o().mo21204c(gVar.mo19359f());
            mo21205d().mo21528C().mo21550a("Saving bundle, size", Integer.valueOf(c.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", gVar.mo19561o0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(gVar.mo19551f0()));
            contentValues.put("data", c);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gVar.mo19533Q()) {
                contentValues.put("retry_count", Integer.valueOf(gVar.mo19535S()));
            }
            try {
                if (mo21709w().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo21205d().mo21533t().mo21550a("Failed to insert bundle (got -1). appId", C5303k3.m23051a(gVar.mo19561o0()));
                return false;
            } catch (SQLiteException e) {
                mo21205d().mo21533t().mo21551a("Error storing bundle. appId", C5303k3.m23051a(gVar.mo19561o0()), e);
                return false;
            }
        } catch (IOException e2) {
            mo21205d().mo21533t().mo21551a("Data loss. Failed to serialize bundle. appId", C5303k3.m23051a(gVar.mo19561o0()), e2);
            return false;
        }
    }

    @C0226w0
    /* renamed from: a */
    public final List<Pair<C4979g, Long>> mo21681a(String str, int i, int i2) {
        int i3 = i2;
        mo21209h();
        mo21739s();
        C4300a0.m18627a(i > 0);
        C4300a0.m18627a(i3 > 0);
        C4300a0.m18630b(str);
        Cursor cursor = null;
        try {
            cursor = mo21709w().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            if (!cursor.moveToFirst()) {
                List<Pair<C4979g, Long>> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j = cursor.getLong(0);
                try {
                    byte[] b = mo21216o().mo21202b(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && b.length + i4 > i3) {
                        break;
                    }
                    try {
                        C4980a aVar = (C4980a) C5221c9.m22539a(C4979g.m21344r0(), b);
                        if (!cursor.isNull(2)) {
                            aVar.mo19608h(cursor.getInt(2));
                        }
                        i4 += b.length;
                        arrayList.add(Pair.create((C4979g) ((C4801i4) aVar.mo19056B()), Long.valueOf(j)));
                    } catch (IOException e) {
                        mo21205d().mo21533t().mo21551a("Failed to merge queued bundle. appId", C5303k3.m23051a(str), e);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e2) {
                    mo21205d().mo21533t().mo21551a("Failed to unzip queued bundle. appId", C5303k3.m23051a(str), e2);
                }
            } while (i4 <= i3);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e3) {
            mo21205d().mo21533t().mo21551a("Error querying bundles. appId", C5303k3.m23051a(str), e3);
            List<Pair<C4979g, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    @C4476d0
    /* renamed from: a */
    public final void mo21688a(List<Long> list) {
        mo21209h();
        mo21739s();
        C4300a0.m18620a(list);
        C4300a0.m18616a(list.size());
        if (m23470Q()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m23477b(sb3.toString(), (String[]) null) > 0) {
                mo21205d().mo21536w().mo21549a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase w = mo21709w();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + C13959t.f40827P1);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                w.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo21205d().mo21533t().mo21550a("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21687a(String str, C4843a[] aVarArr) {
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        String str3 = "event_filters";
        String str4 = "app_id=?";
        String str5 = "property_filters";
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        C4300a0.m18620a(aVarArr);
        SQLiteDatabase w = mo21709w();
        w.beginTransaction();
        try {
            mo21739s();
            mo21209h();
            C4300a0.m18630b(str);
            SQLiteDatabase w2 = mo21709w();
            w2.delete(str5, str4, new String[]{str});
            w2.delete(str3, str4, new String[]{str});
            for (C4843a aVar : aVarArr) {
                mo21739s();
                mo21209h();
                C4300a0.m18630b(str);
                C4300a0.m18620a(aVar);
                if (!aVar.mo19187a()) {
                    mo21205d().mo21536w().mo21550a("Audience with no ID. appId", C5303k3.m23051a(str));
                } else {
                    int o = aVar.mo19190o();
                    Iterator it = aVar.mo19193r().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C4845b) it.next()).mo19201a()) {
                                mo21205d().mo21536w().mo21551a("Event filter with no ID. Audience definition ignored. appId, audienceId", C5303k3.m23051a(str), Integer.valueOf(o));
                                break;
                            }
                        } else {
                            Iterator it2 = aVar.mo19191p().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((C4852e) it2.next()).mo19237a()) {
                                        mo21205d().mo21536w().mo21551a("Property filter with no ID. Audience definition ignored. appId, audienceId", C5303k3.m23051a(str), Integer.valueOf(o));
                                        break;
                                    }
                                } else {
                                    Iterator it3 = aVar.mo19193r().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m23475a(str, o, (C4845b) it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator it4 = aVar.mo19191p().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!m23476a(str, o, (C4852e) it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        mo21739s();
                                        mo21209h();
                                        C4300a0.m18630b(str);
                                        SQLiteDatabase w3 = mo21709w();
                                        w3.delete(str5, str2, new String[]{str, String.valueOf(o)});
                                        w3.delete(str3, str2, new String[]{str, String.valueOf(o)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C4843a aVar2 : aVarArr) {
                arrayList.add(aVar2.mo19187a() ? Integer.valueOf(aVar2.mo19190o()) : null);
            }
            m23478b(str, (List<Integer>) arrayList);
            w.setTransactionSuccessful();
        } finally {
            w.endTransaction();
        }
    }

    @C0226w0
    /* renamed from: a */
    private final boolean m23475a(String str, int i, C4845b bVar) {
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        C4300a0.m18620a(bVar);
        Integer num = null;
        if (TextUtils.isEmpty(bVar.mo19204p())) {
            C5325m3 w = mo21205d().mo21536w();
            Object a = C5303k3.m23051a(str);
            Integer valueOf = Integer.valueOf(i);
            if (bVar.mo19201a()) {
                num = Integer.valueOf(bVar.mo19203o());
            }
            w.mo21552a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = bVar.mo19359f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", bVar.mo19201a() ? Integer.valueOf(bVar.mo19203o()) : null);
        contentValues.put(C2176m.f8635e, bVar.mo19204p());
        if (mo21214m().mo21643e(str, C5310l.f15268u0)) {
            contentValues.put("session_scoped", bVar.mo19211w() ? Boolean.valueOf(bVar.mo19212x()) : null);
        }
        contentValues.put("data", f);
        try {
            if (mo21709w().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                mo21205d().mo21533t().mo21550a("Failed to insert event filter (got -1). appId", C5303k3.m23051a(str));
            }
            return true;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing event filter. appId", C5303k3.m23051a(str), e);
            return false;
        }
    }

    @C0226w0
    /* renamed from: a */
    private final boolean m23476a(String str, int i, C4852e eVar) {
        mo21739s();
        mo21209h();
        C4300a0.m18630b(str);
        C4300a0.m18620a(eVar);
        Integer num = null;
        if (TextUtils.isEmpty(eVar.mo19239p())) {
            C5325m3 w = mo21205d().mo21536w();
            Object a = C5303k3.m23051a(str);
            Integer valueOf = Integer.valueOf(i);
            if (eVar.mo19237a()) {
                num = Integer.valueOf(eVar.mo19238o());
            }
            w.mo21552a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = eVar.mo19359f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", eVar.mo19237a() ? Integer.valueOf(eVar.mo19238o()) : null);
        contentValues.put("property_name", eVar.mo19239p());
        if (mo21214m().mo21643e(str, C5310l.f15268u0)) {
            contentValues.put("session_scoped", eVar.mo19243t() ? Boolean.valueOf(eVar.mo19244u()) : null);
        }
        contentValues.put("data", f);
        try {
            if (mo21709w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo21205d().mo21533t().mo21550a("Failed to insert property filter (got -1). appId", C5303k3.m23051a(str));
            return false;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing property filter. appId", C5303k3.m23051a(str), e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo21684a(java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            r13 = this;
            r13.mo21739s()
            r13.mo21209h()
            com.google.android.gms.common.internal.C4300a0.m18630b(r14)
            com.google.android.gms.common.internal.C4300a0.m18620a(r15)
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L_0x0024:
            int r4 = r15.size()
            if (r3 >= r4) goto L_0x0039
            if (r3 <= 0) goto L_0x0031
            java.lang.String r4 = ","
            r1.append(r4)
        L_0x0031:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0039:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r15)
            r3.add(r2, r14)
            android.database.sqlite.SQLiteDatabase r4 = r13.mo21709w()
            r15 = 0
            java.lang.String r5 = "property_filters"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            java.lang.String r7 = "audience_id"
            r6[r2] = r7     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            java.lang.String r7 = "filter_id"
            r12 = 1
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            java.lang.String r7 = r1.toString()     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00b1, all -> 0x00ae }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ac }
            if (r3 != 0) goto L_0x0079
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            return r0
        L_0x0079:
            int r3 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x00ac }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00ac }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x00ac }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x00ac }
            if (r4 != 0) goto L_0x0095
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ac }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00ac }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00ac }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x00ac }
        L_0x0095:
            int r3 = r1.getInt(r12)     // Catch:{ SQLiteException -> 0x00ac }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00ac }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x00ac }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00ac }
            if (r3 != 0) goto L_0x0079
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            return r0
        L_0x00ac:
            r0 = move-exception
            goto L_0x00b3
        L_0x00ae:
            r14 = move-exception
            r1 = r15
            goto L_0x00cb
        L_0x00b1:
            r0 = move-exception
            r1 = r15
        L_0x00b3:
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo21205d()     // Catch:{ all -> 0x00ca }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r14)     // Catch:{ all -> 0x00ca }
            r2.mo21551a(r3, r14, r0)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00c9
            r1.close()
        L_0x00c9:
            return r15
        L_0x00ca:
            r14 = move-exception
        L_0x00cb:
            if (r1 == 0) goto L_0x00d0
            r1.close()
        L_0x00d0:
            goto L_0x00d2
        L_0x00d1:
            throw r14
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21684a(java.lang.String, java.util.List):java.util.Map");
    }

    @C0226w0
    /* renamed from: a */
    private static void m23474a(ContentValues contentValues, String str, Object obj) {
        C4300a0.m18630b(str);
        C4300a0.m18620a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @C0226w0
    @C4476d0
    /* renamed from: a */
    private final Object m23473a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo21205d().mo21533t().mo21549a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo21205d().mo21533t().mo21550a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo21205d().mo21533t().mo21549a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: a */
    public final long mo21675a(C4979g gVar) throws IOException {
        mo21209h();
        mo21739s();
        C4300a0.m18620a(gVar);
        C4300a0.m18630b(gVar.mo19561o0());
        byte[] f = gVar.mo19359f();
        long a = mo21216o().mo21190a(f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.mo19561o0());
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put(MetaData.ELEMENT_NAME, f);
        try {
            mo21709w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing raw event metadata. appId", C5303k3.m23051a(gVar.mo19561o0()), e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo21679a(long r5) {
        /*
            r4 = this;
            r4.mo21209h()
            r4.mo21739s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo21709w()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21528C()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo21549a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.measurement.internal.k3 r1 = r4.mo21205d()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21533t()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo21550a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21679a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C4966t0.C4971c, java.lang.Long> mo21676a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo21209h()
            r7.mo21739s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo21709w()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0077 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.k3 r8 = r7.mo21205d()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21528C()     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r9 = "Main event not found"
            r8.mo21549a(r9)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0077 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.internal.measurement.t0$c$a r4 = com.google.android.gms.internal.measurement.C4966t0.C4971c.m21169w()     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.q5 r2 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r4, r2)     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.t0$c$a r2 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r2     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.r5 r2 = r2.mo19056B()     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C4801i4) r2     // Catch:{ IOException -> 0x005f }
            com.google.android.gms.internal.measurement.t0$c r2 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r2     // Catch:{ IOException -> 0x005f }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x005e
            r1.close()
        L_0x005e:
            return r8
        L_0x005f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k3 r3 = r7.mo21205d()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r8)     // Catch:{ SQLiteException -> 0x0077 }
            r3.mo21552a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            return r0
        L_0x0077:
            r8 = move-exception
            goto L_0x007e
        L_0x0079:
            r8 = move-exception
            r1 = r0
            goto L_0x0092
        L_0x007c:
            r8 = move-exception
            r1 = r0
        L_0x007e:
            com.google.android.gms.measurement.internal.k3 r9 = r7.mo21205d()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21533t()     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "Error selecting main event"
            r9.mo21550a(r2, r8)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0090
            r1.close()
        L_0x0090:
            return r0
        L_0x0091:
            r8 = move-exception
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5397s9.mo21676a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo21693a(String str, Long l, long j, C4971c cVar) {
        mo21209h();
        mo21739s();
        C4300a0.m18620a(cVar);
        C4300a0.m18630b(str);
        C4300a0.m18620a(l);
        byte[] f = cVar.mo19359f();
        mo21205d().mo21528C().mo21551a("Saving complex main event, appId, data size", mo21211j().mo21429a(str), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", f);
        try {
            if (mo21709w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo21205d().mo21533t().mo21550a("Failed to insert complex main event (got -1). appId", C5303k3.m23051a(str));
            return false;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing complex main event. appId", C5303k3.m23051a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo21690a(C5233e eVar, long j, boolean z) {
        mo21209h();
        mo21739s();
        C4300a0.m18620a(eVar);
        C4300a0.m18630b(eVar.f14961a);
        C4972a b = C4971c.m21169w().mo19493b(eVar.f14965e);
        Iterator it = eVar.f14966f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4976a a = C4975e.m21218u().mo19214a(str);
            mo21216o().mo21197a(a, eVar.f14966f.mo21876c(str));
            b.mo19488a(a);
        }
        byte[] f = ((C4971c) b.mo19056B()).mo19359f();
        mo21205d().mo21528C().mo21551a("Saving event, name, data size", mo21211j().mo21429a(eVar.f14962b), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eVar.f14961a);
        contentValues.put("name", eVar.f14962b);
        contentValues.put("timestamp", Long.valueOf(eVar.f14964d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", f);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo21709w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo21205d().mo21533t().mo21550a("Failed to insert raw event (got -1). appId", C5303k3.m23051a(eVar.f14961a));
            return false;
        } catch (SQLiteException e) {
            mo21205d().mo21533t().mo21551a("Error storing raw event. appId", C5303k3.m23051a(eVar.f14961a), e);
            return false;
        }
    }
}
