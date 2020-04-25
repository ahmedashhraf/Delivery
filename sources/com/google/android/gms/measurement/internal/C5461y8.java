package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.amplitude.api.C2876e;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C4793h9;
import com.google.android.gms.internal.measurement.C4921q0.C4924b;
import com.google.android.gms.internal.measurement.C4966t0.C4971c;
import com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a;
import com.google.android.gms.internal.measurement.C4966t0.C4975e;
import com.google.android.gms.internal.measurement.C4966t0.C4979g;
import com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a;
import com.google.android.gms.internal.measurement.C4966t0.C4988k;
import com.google.android.gms.internal.measurement.zzv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p279f.C6610c;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public class C5461y8 implements C5349o5 {

    /* renamed from: y */
    private static volatile C5461y8 f15631y;

    /* renamed from: a */
    private C5293j4 f15632a;

    /* renamed from: b */
    private C5347o3 f15633b;

    /* renamed from: c */
    private C5397s9 f15634c;

    /* renamed from: d */
    private C5424v3 f15635d;

    /* renamed from: e */
    private C5418u8 f15636e;

    /* renamed from: f */
    private C5320l9 f15637f;

    /* renamed from: g */
    private final C5221c9 f15638g;

    /* renamed from: h */
    private C5470z6 f15639h;

    /* renamed from: i */
    private final C5359p4 f15640i;

    /* renamed from: j */
    private boolean f15641j;

    /* renamed from: k */
    private boolean f15642k;

    /* renamed from: l */
    private boolean f15643l;
    @C4476d0

    /* renamed from: m */
    private long f15644m;

    /* renamed from: n */
    private List<Runnable> f15645n;

    /* renamed from: o */
    private int f15646o;

    /* renamed from: p */
    private int f15647p;

    /* renamed from: q */
    private boolean f15648q;

    /* renamed from: r */
    private boolean f15649r;

    /* renamed from: s */
    private boolean f15650s;

    /* renamed from: t */
    private FileLock f15651t;

    /* renamed from: u */
    private FileChannel f15652u;

    /* renamed from: v */
    private List<Long> f15653v;

    /* renamed from: w */
    private List<Long> f15654w;

    /* renamed from: x */
    private long f15655x;

    /* renamed from: com.google.android.gms.measurement.internal.y8$a */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    class C5462a implements C5419u9 {

        /* renamed from: a */
        C4979g f15656a;

        /* renamed from: b */
        List<Long> f15657b;

        /* renamed from: c */
        List<C4971c> f15658c;

        /* renamed from: d */
        private long f15659d;

        private C5462a() {
        }

        /* renamed from: a */
        public final void mo21729a(C4979g gVar) {
            C4300a0.m18620a(gVar);
            this.f15656a = gVar;
        }

        /* synthetic */ C5462a(C5461y8 y8Var, C5451x8 x8Var) {
            this();
        }

        /* renamed from: a */
        public final boolean mo21730a(long j, C4971c cVar) {
            C4300a0.m18620a(cVar);
            if (this.f15658c == null) {
                this.f15658c = new ArrayList();
            }
            if (this.f15657b == null) {
                this.f15657b = new ArrayList();
            }
            if (this.f15658c.size() > 0 && m23832a((C4971c) this.f15658c.get(0)) != m23832a(cVar)) {
                return false;
            }
            long b = this.f15659d + ((long) cVar.mo19045b());
            if (b >= ((long) Math.max(0, ((Integer) C5310l.f15257p.mo21225a(null)).intValue()))) {
                return false;
            }
            this.f15659d = b;
            this.f15658c.add(cVar);
            this.f15657b.add(Long.valueOf(j));
            if (this.f15658c.size() >= Math.max(1, ((Integer) C5310l.f15259q.mo21225a(null)).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m23832a(C4971c cVar) {
            return ((cVar.mo19480r() / 1000) / 60) / 60;
        }
    }

    private C5461y8(C5232d9 d9Var) {
        this(d9Var, null);
    }

    /* renamed from: A */
    private final boolean m23766A() {
        m23793y();
        mo21861o();
        return mo21855i().mo21673G() || !TextUtils.isEmpty(mo21855i().mo21710x());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c0  */
    @androidx.annotation.C0226w0
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23767C() {
        /*
            r21 = this;
            r0 = r21
            r21.m23793y()
            r21.mo21861o()
            boolean r1 = r21.m23790v()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.r9 r1 = r1.mo21600n()
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C5310l.f15250l0
            boolean r1 = r1.mo21635a(r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.f15644m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.common.util.g r1 = r1.mo21208g()
            long r1 = r1.mo18572d()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f15644m
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo21550a(r3, r2)
            com.google.android.gms.measurement.internal.v3 r1 = r21.m23791w()
            r1.mo21732b()
            com.google.android.gms.measurement.internal.u8 r1 = r21.m23792x()
            r1.mo21728v()
            return
        L_0x0060:
            r0.f15644m = r3
        L_0x0062:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            boolean r1 = r1.mo21598l()
            if (r1 == 0) goto L_0x026b
            boolean r1 = r21.m23766A()
            if (r1 != 0) goto L_0x0072
            goto L_0x026b
        L_0x0072:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.common.util.g r1 = r1.mo21208g()
            long r1 = r1.mo18569a()
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C5310l.f15198H
            r6 = 0
            java.lang.Object r5 = r5.mo21225a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.s9 r5 = r21.mo21855i()
            boolean r5 = r5.mo21674H()
            if (r5 != 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.s9 r5 = r21.mo21855i()
            boolean r5 = r5.mo21669C()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r5 = 0
            goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            if (r5 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.p4 r10 = r0.f15640i
            com.google.android.gms.measurement.internal.r9 r10 = r10.mo21600n()
            java.lang.String r10 = r10.mo21660s()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00d0
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C5310l.f15188C
            java.lang.Object r10 = r10.mo21225a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00f1
        L_0x00d0:
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C5310l.f15186B
            java.lang.Object r10 = r10.mo21225a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00f1
        L_0x00e1:
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C5310l.f15184A
            java.lang.Object r10 = r10.mo21225a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00f1:
            com.google.android.gms.measurement.internal.p4 r12 = r0.f15640i
            com.google.android.gms.measurement.internal.x3 r12 = r12.mo21601o()
            com.google.android.gms.measurement.internal.y3 r12 = r12.f15570e
            long r12 = r12.mo21825a()
            com.google.android.gms.measurement.internal.p4 r14 = r0.f15640i
            com.google.android.gms.measurement.internal.x3 r14 = r14.mo21601o()
            com.google.android.gms.measurement.internal.y3 r14 = r14.f15571f
            long r14 = r14.mo21825a()
            com.google.android.gms.measurement.internal.s9 r16 = r21.mo21855i()
            r17 = r10
            long r9 = r16.mo21671E()
            com.google.android.gms.measurement.internal.s9 r11 = r21.mo21855i()
            r19 = r7
            long r6 = r11.mo21672F()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0128
        L_0x0125:
            r8 = r3
            goto L_0x019e
        L_0x0128:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x014e
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x014e
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x014e:
            com.google.android.gms.measurement.internal.c9 r5 = r21.mo21858l()
            r12 = r17
            boolean r5 = r5.mo21199a(r8, r12)
            if (r5 != 0) goto L_0x015c
            long r8 = r8 + r12
            goto L_0x015d
        L_0x015c:
            r8 = r10
        L_0x015d:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x019e
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x019e
            r5 = 0
        L_0x0166:
            r6 = 20
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C5310l.f15202J
            r10 = 0
            java.lang.Object r7 = r7.mo21225a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0125
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C5310l.f15200I
            java.lang.Object r12 = r12.mo21225a(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r8 = r8 + r12
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x019b
            goto L_0x019e
        L_0x019b:
            int r5 = r5 + 1
            goto L_0x0166
        L_0x019e:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01c0
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo21549a(r2)
            com.google.android.gms.measurement.internal.v3 r1 = r21.m23791w()
            r1.mo21732b()
            com.google.android.gms.measurement.internal.u8 r1 = r21.m23792x()
            r1.mo21728v()
            return
        L_0x01c0:
            com.google.android.gms.measurement.internal.o3 r1 = r21.mo21854h()
            boolean r1 = r1.mo21576v()
            if (r1 != 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r2 = "No network"
            r1.mo21549a(r2)
            com.google.android.gms.measurement.internal.v3 r1 = r21.m23791w()
            r1.mo21731a()
            com.google.android.gms.measurement.internal.u8 r1 = r21.m23792x()
            r1.mo21728v()
            return
        L_0x01e8:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo21601o()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f15572g
            long r1 = r1.mo21825a()
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C5310l.f15275y
            r6 = 0
            java.lang.Object r5 = r5.mo21225a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.c9 r7 = r21.mo21858l()
            boolean r7 = r7.mo21199a(r1, r5)
            if (r7 != 0) goto L_0x0214
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0214:
            com.google.android.gms.measurement.internal.v3 r1 = r21.m23791w()
            r1.mo21732b()
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.common.util.g r1 = r1.mo21208g()
            long r1 = r1.mo18569a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0250
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C5310l.f15190D
            r2 = 0
            java.lang.Object r1 = r1.mo21225a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo21601o()
            com.google.android.gms.measurement.internal.y3 r1 = r1.f15570e
            com.google.android.gms.measurement.internal.p4 r2 = r0.f15640i
            com.google.android.gms.common.util.g r2 = r2.mo21208g()
            long r2 = r2.mo18569a()
            r1.mo21826a(r2)
        L_0x0250:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo21550a(r3, r2)
            com.google.android.gms.measurement.internal.u8 r1 = r21.m23792x()
            r1.mo21727a(r8)
            return
        L_0x026b:
            com.google.android.gms.measurement.internal.p4 r1 = r0.f15640i
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo21549a(r2)
            com.google.android.gms.measurement.internal.v3 r1 = r21.m23791w()
            r1.mo21732b()
            com.google.android.gms.measurement.internal.u8 r1 = r21.m23792x()
            r1.mo21728v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.m23767C():void");
    }

    /* renamed from: a */
    public static C5461y8 m23770a(Context context) {
        C4300a0.m18620a(context);
        C4300a0.m18620a(context.getApplicationContext());
        if (f15631y == null) {
            synchronized (C5461y8.class) {
                if (f15631y == null) {
                    f15631y = new C5461y8(new C5232d9(context));
                }
            }
        }
        return f15631y;
    }

    @C0226w0
    /* renamed from: t */
    private final void m23788t() {
        m23793y();
        if (this.f15648q || this.f15649r || this.f15650s) {
            this.f15640i.mo21205d().mo21528C().mo21552a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f15648q), Boolean.valueOf(this.f15649r), Boolean.valueOf(this.f15650s));
            return;
        }
        this.f15640i.mo21205d().mo21528C().mo21549a("Stopping uploading service(s)");
        List<Runnable> list = this.f15645n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f15645n.clear();
        }
    }

    @C0226w0
    @C4476d0
    /* renamed from: u */
    private final boolean m23789u() {
        m23793y();
        String str = "Storage concurrent access okay";
        if (this.f15640i.mo21600n().mo21635a(C5310l.f15199H0)) {
            FileLock fileLock = this.f15651t;
            if (fileLock != null && fileLock.isValid()) {
                this.f15640i.mo21205d().mo21528C().mo21549a(str);
                return true;
            }
        }
        try {
            this.f15652u = new RandomAccessFile(new File(this.f15640i.mo21206e().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f15651t = this.f15652u.tryLock();
            if (this.f15651t != null) {
                this.f15640i.mo21205d().mo21528C().mo21549a(str);
                return true;
            }
            this.f15640i.mo21205d().mo21533t().mo21549a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f15640i.mo21205d().mo21533t().mo21550a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f15640i.mo21205d().mo21533t().mo21550a("Failed to access storage lock file", e2);
        } catch (OverlappingFileLockException e3) {
            this.f15640i.mo21205d().mo21536w().mo21550a("Storage lock already acquired", e3);
        }
    }

    @C0226w0
    /* renamed from: v */
    private final boolean m23790v() {
        m23793y();
        mo21861o();
        return this.f15642k;
    }

    /* renamed from: w */
    private final C5424v3 m23791w() {
        C5424v3 v3Var = this.f15635d;
        if (v3Var != null) {
            return v3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: x */
    private final C5418u8 m23792x() {
        m23785b((C5429v8) this.f15636e);
        return this.f15636e;
    }

    @C0226w0
    /* renamed from: y */
    private final void m23793y() {
        this.f15640i.mo21203c().mo21209h();
    }

    /* renamed from: z */
    private final long m23794z() {
        long a = this.f15640i.mo21208g().mo18569a();
        C5446x3 o = this.f15640i.mo21601o();
        o.mo21613o();
        o.mo21209h();
        long a2 = o.f15574i.mo21825a();
        if (a2 == 0) {
            a2 = 1 + ((long) o.mo21212k().mo21390u().nextInt(86400000));
            o.f15574i.mo21826a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: B */
    public final C5342n9 mo21189B() {
        return this.f15640i.mo21189B();
    }

    /* renamed from: b */
    public final C5386r9 mo21846b() {
        return this.f15640i.mo21600n();
    }

    /* renamed from: c */
    public final C5326m4 mo21203c() {
        return this.f15640i.mo21203c();
    }

    /* renamed from: d */
    public final C5303k3 mo21205d() {
        return this.f15640i.mo21205d();
    }

    /* renamed from: e */
    public final Context mo21206e() {
        return this.f15640i.mo21206e();
    }

    /* renamed from: f */
    public final C5293j4 mo21853f() {
        m23785b((C5429v8) this.f15632a);
        return this.f15632a;
    }

    /* renamed from: g */
    public final C4484g mo21208g() {
        return this.f15640i.mo21208g();
    }

    /* renamed from: h */
    public final C5347o3 mo21854h() {
        m23785b((C5429v8) this.f15633b);
        return this.f15633b;
    }

    /* renamed from: i */
    public final C5397s9 mo21855i() {
        m23785b((C5429v8) this.f15634c);
        return this.f15634c;
    }

    /* renamed from: j */
    public final C5320l9 mo21856j() {
        m23785b((C5429v8) this.f15637f);
        return this.f15637f;
    }

    /* renamed from: k */
    public final C5470z6 mo21857k() {
        m23785b((C5429v8) this.f15639h);
        return this.f15639h;
    }

    /* renamed from: l */
    public final C5221c9 mo21858l() {
        m23785b((C5429v8) this.f15638g);
        return this.f15638g;
    }

    /* renamed from: m */
    public final C5281i3 mo21859m() {
        return this.f15640i.mo21608v();
    }

    /* renamed from: n */
    public final C5254f9 mo21860n() {
        return this.f15640i.mo21607u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo21861o() {
        if (!this.f15641j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:95|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1.f15640i.mo21205d().mo21533t().mo21551a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C5303k3.m23051a(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x02c4 */
    @androidx.annotation.C0226w0
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21862p() {
        /*
            r17 = this;
            r1 = r17
            r17.m23793y()
            r17.mo21861o()
            r0 = 1
            r1.f15650s = r0
            r2 = 0
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0300 }
            r3.mo21189B()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.f7 r3 = r3.mo21583E()     // Catch:{ all -> 0x0300 }
            java.lang.Boolean r3 = r3.mo21340G()     // Catch:{ all -> 0x0300 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21536w()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.mo21549a(r3)     // Catch:{ all -> 0x0300 }
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0300 }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.mo21549a(r3)     // Catch:{ all -> 0x0300 }
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x004d:
            long r3 = r1.f15644m     // Catch:{ all -> 0x0300 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005e
            r17.m23767C()     // Catch:{ all -> 0x0300 }
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x005e:
            r17.m23793y()     // Catch:{ all -> 0x0300 }
            java.util.List<java.lang.Long> r3 = r1.f15653v     // Catch:{ all -> 0x0300 }
            if (r3 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.mo21549a(r3)     // Catch:{ all -> 0x0300 }
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.o3 r3 = r17.mo21854h()     // Catch:{ all -> 0x0300 }
            boolean r3 = r3.mo21576v()     // Catch:{ all -> 0x0300 }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo21549a(r3)     // Catch:{ all -> 0x0300 }
            r17.m23767C()     // Catch:{ all -> 0x0300 }
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x00a1:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.common.util.g r3 = r3.mo21208g()     // Catch:{ all -> 0x0300 }
            long r3 = r3.mo18569a()     // Catch:{ all -> 0x0300 }
            long r7 = com.google.android.gms.measurement.internal.C5386r9.m23409y()     // Catch:{ all -> 0x0300 }
            long r7 = r3 - r7
            r9 = 0
            r1.m23782a(r9, r7)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo21601o()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f15570e     // Catch:{ all -> 0x0300 }
            long r7 = r7.mo21825a()     // Catch:{ all -> 0x0300 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21527A()     // Catch:{ all -> 0x0300 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0300 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0300 }
            r5.mo21550a(r6, r7)     // Catch:{ all -> 0x0300 }
        L_0x00de:
            com.google.android.gms.measurement.internal.s9 r5 = r17.mo21855i()     // Catch:{ all -> 0x0300 }
            java.lang.String r5 = r5.mo21710x()     // Catch:{ all -> 0x0300 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0300 }
            r7 = -1
            if (r6 != 0) goto L_0x02d8
            long r10 = r1.f15655x     // Catch:{ all -> 0x0300 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.s9 r6 = r17.mo21855i()     // Catch:{ all -> 0x0300 }
            long r6 = r6.mo21711y()     // Catch:{ all -> 0x0300 }
            r1.f15655x = r6     // Catch:{ all -> 0x0300 }
        L_0x00fe:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C5310l.f15253n     // Catch:{ all -> 0x0300 }
            int r6 = r6.mo21636b(r5, r7)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.r9 r7 = r7.mo21600n()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C5310l.f15255o     // Catch:{ all -> 0x0300 }
            int r7 = r7.mo21636b(r5, r8)     // Catch:{ all -> 0x0300 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.s9 r8 = r17.mo21855i()     // Catch:{ all -> 0x0300 }
            java.util.List r6 = r8.mo21681a(r5, r6, r7)     // Catch:{ all -> 0x0300 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0300 }
            if (r7 != 0) goto L_0x02fa
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0300 }
        L_0x012c:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0300 }
            if (r8 == 0) goto L_0x014b
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0300 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x0300 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g r8 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r8     // Catch:{ all -> 0x0300 }
            java.lang.String r10 = r8.mo19567s()     // Catch:{ all -> 0x0300 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0300 }
            if (r10 != 0) goto L_0x012c
            java.lang.String r7 = r8.mo19567s()     // Catch:{ all -> 0x0300 }
            goto L_0x014c
        L_0x014b:
            r7 = r9
        L_0x014c:
            if (r7 == 0) goto L_0x017b
            r8 = 0
        L_0x014f:
            int r10 = r6.size()     // Catch:{ all -> 0x0300 }
            if (r8 >= r10) goto L_0x017b
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x0300 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0300 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g r10 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r10     // Catch:{ all -> 0x0300 }
            java.lang.String r11 = r10.mo19567s()     // Catch:{ all -> 0x0300 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0300 }
            if (r11 != 0) goto L_0x0178
            java.lang.String r10 = r10.mo19567s()     // Catch:{ all -> 0x0300 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x0300 }
            if (r10 != 0) goto L_0x0178
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x0300 }
            goto L_0x017b
        L_0x0178:
            int r8 = r8 + 1
            goto L_0x014f
        L_0x017b:
            com.google.android.gms.internal.measurement.t0$f$a r7 = com.google.android.gms.internal.measurement.C4966t0.C4977f.m21240o()     // Catch:{ all -> 0x0300 }
            int r8 = r6.size()     // Catch:{ all -> 0x0300 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0300 }
            int r11 = r6.size()     // Catch:{ all -> 0x0300 }
            r10.<init>(r11)     // Catch:{ all -> 0x0300 }
            boolean r11 = com.google.android.gms.measurement.internal.C5386r9.m23410z()     // Catch:{ all -> 0x0300 }
            if (r11 == 0) goto L_0x01a0
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.r9 r11 = r11.mo21600n()     // Catch:{ all -> 0x0300 }
            boolean r11 = r11.mo21640d(r5)     // Catch:{ all -> 0x0300 }
            if (r11 == 0) goto L_0x01a0
            r11 = 1
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            r12 = 0
        L_0x01a2:
            if (r12 >= r8) goto L_0x020b
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x0300 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0300 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g r13 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r13     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.i4$a r13 = r13.mo19052i()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g$a r13 = (com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a) r13     // Catch:{ all -> 0x0300 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x0300 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0300 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0300 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0300 }
            r10.add(r14)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.p4 r14 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.r9 r14 = r14.mo21600n()     // Catch:{ all -> 0x0300 }
            long r14 = r14.mo21652n()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g$a r14 = r13.mo19606g(r14)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g$a r14 = r14.mo19578a(r3)     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.p4 r15 = r1.f15640i     // Catch:{ all -> 0x0300 }
            r15.mo21189B()     // Catch:{ all -> 0x0300 }
            r14.mo19590b(r2)     // Catch:{ all -> 0x0300 }
            if (r11 != 0) goto L_0x01e0
            r13.mo19634x()     // Catch:{ all -> 0x0300 }
        L_0x01e0:
            com.google.android.gms.measurement.internal.p4 r14 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.r9 r14 = r14.mo21600n()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C5310l.f15256o0     // Catch:{ all -> 0x0300 }
            boolean r14 = r14.mo21643e(r5, r15)     // Catch:{ all -> 0x0300 }
            if (r14 == 0) goto L_0x0205
            com.google.android.gms.internal.measurement.r5 r14 = r13.mo19056B()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.i4 r14 = (com.google.android.gms.internal.measurement.C4801i4) r14     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$g r14 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r14     // Catch:{ all -> 0x0300 }
            byte[] r14 = r14.mo19359f()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.c9 r15 = r17.mo21858l()     // Catch:{ all -> 0x0300 }
            long r14 = r15.mo21190a(r14)     // Catch:{ all -> 0x0300 }
            r13.mo19618l(r14)     // Catch:{ all -> 0x0300 }
        L_0x0205:
            r7.mo19515a(r13)     // Catch:{ all -> 0x0300 }
            int r12 = r12 + 1
            goto L_0x01a2
        L_0x020b:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r6 = r6.mo21205d()     // Catch:{ all -> 0x0300 }
            r11 = 2
            boolean r6 = r6.mo21532a(r11)     // Catch:{ all -> 0x0300 }
            if (r6 == 0) goto L_0x0229
            com.google.android.gms.measurement.internal.c9 r6 = r17.mo21858l()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.r5 r11 = r7.mo19056B()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.i4 r11 = (com.google.android.gms.internal.measurement.C4801i4) r11     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$f r11 = (com.google.android.gms.internal.measurement.C4966t0.C4977f) r11     // Catch:{ all -> 0x0300 }
            java.lang.String r6 = r6.mo21194a(r11)     // Catch:{ all -> 0x0300 }
            goto L_0x022a
        L_0x0229:
            r6 = r9
        L_0x022a:
            r17.mo21858l()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.r5 r11 = r7.mo19056B()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.i4 r11 = (com.google.android.gms.internal.measurement.C4801i4) r11     // Catch:{ all -> 0x0300 }
            com.google.android.gms.internal.measurement.t0$f r11 = (com.google.android.gms.internal.measurement.C4966t0.C4977f) r11     // Catch:{ all -> 0x0300 }
            byte[] r14 = r11.mo19359f()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.d3<java.lang.String> r11 = com.google.android.gms.measurement.internal.C5310l.f15273x     // Catch:{ all -> 0x0300 }
            java.lang.Object r9 = r11.mo21225a(r9)     // Catch:{ all -> 0x0300 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0300 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02c4 }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02c4 }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02c4 }
            if (r11 != 0) goto L_0x024e
            r11 = 1
            goto L_0x024f
        L_0x024e:
            r11 = 0
        L_0x024f:
            com.google.android.gms.common.internal.C4300a0.m18627a(r11)     // Catch:{ MalformedURLException -> 0x02c4 }
            java.util.List<java.lang.Long> r11 = r1.f15653v     // Catch:{ MalformedURLException -> 0x02c4 }
            if (r11 == 0) goto L_0x0266
            com.google.android.gms.measurement.internal.p4 r10 = r1.f15640i     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.k3 r10 = r10.mo21205d()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo21533t()     // Catch:{ MalformedURLException -> 0x02c4 }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.mo21549a(r11)     // Catch:{ MalformedURLException -> 0x02c4 }
            goto L_0x026d
        L_0x0266:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02c4 }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02c4 }
            r1.f15653v = r11     // Catch:{ MalformedURLException -> 0x02c4 }
        L_0x026d:
            com.google.android.gms.measurement.internal.p4 r10 = r1.f15640i     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.x3 r10 = r10.mo21601o()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.f15571f     // Catch:{ MalformedURLException -> 0x02c4 }
            r10.mo21826a(r3)     // Catch:{ MalformedURLException -> 0x02c4 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x0284
            com.google.android.gms.internal.measurement.t0$g r3 = r7.mo19516a(r2)     // Catch:{ MalformedURLException -> 0x02c4 }
            java.lang.String r3 = r3.mo19561o0()     // Catch:{ MalformedURLException -> 0x02c4 }
        L_0x0284:
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()     // Catch:{ MalformedURLException -> 0x02c4 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02c4 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02c4 }
            r4.mo21552a(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02c4 }
            r1.f15649r = r0     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.o3 r11 = r17.mo21854h()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.a9 r0 = new com.google.android.gms.measurement.internal.a9     // Catch:{ MalformedURLException -> 0x02c4 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02c4 }
            r11.mo21209h()     // Catch:{ MalformedURLException -> 0x02c4 }
            r11.mo21739s()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r13)     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r14)     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r0)     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.m4 r3 = r11.mo21203c()     // Catch:{ MalformedURLException -> 0x02c4 }
            com.google.android.gms.measurement.internal.s3 r4 = new com.google.android.gms.measurement.internal.s3     // Catch:{ MalformedURLException -> 0x02c4 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02c4 }
            r3.mo21557b(r4)     // Catch:{ MalformedURLException -> 0x02c4 }
            goto L_0x02fa
        L_0x02c4:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r5)     // Catch:{ all -> 0x0300 }
            r0.mo21551a(r3, r4, r9)     // Catch:{ all -> 0x0300 }
            goto L_0x02fa
        L_0x02d8:
            r1.f15655x = r7     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.s9 r0 = r17.mo21855i()     // Catch:{ all -> 0x0300 }
            long r5 = com.google.android.gms.measurement.internal.C5386r9.m23409y()     // Catch:{ all -> 0x0300 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo21679a(r3)     // Catch:{ all -> 0x0300 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0300 }
            if (r3 != 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.s9 r3 = r17.mo21855i()     // Catch:{ all -> 0x0300 }
            com.google.android.gms.measurement.internal.e5 r0 = r3.mo21694b(r0)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x02fa
            r1.m23778a(r0)     // Catch:{ all -> 0x0300 }
        L_0x02fa:
            r1.f15650s = r2
            r17.m23788t()
            return
        L_0x0300:
            r0 = move-exception
            r1.f15650s = r2
            r17.m23788t()
            goto L_0x0308
        L_0x0307:
            throw r0
        L_0x0308:
            goto L_0x0307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.mo21862p():void");
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: q */
    public final void mo21863q() {
        m23793y();
        mo21861o();
        if (!this.f15643l) {
            this.f15643l = true;
            m23793y();
            mo21861o();
            if ((this.f15640i.mo21600n().mo21635a(C5310l.f15250l0) || m23790v()) && m23789u()) {
                int a = m23768a(this.f15652u);
                int E = this.f15640i.mo21585G().mo21413E();
                m23793y();
                if (a > E) {
                    this.f15640i.mo21205d().mo21533t().mo21551a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(E));
                } else if (a < E) {
                    if (m23780a(E, this.f15652u)) {
                        this.f15640i.mo21205d().mo21528C().mo21551a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(E));
                    } else {
                        this.f15640i.mo21205d().mo21533t().mo21551a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(E));
                    }
                }
            }
        }
        if (!this.f15642k && !this.f15640i.mo21600n().mo21635a(C5310l.f15250l0)) {
            this.f15640i.mo21205d().mo21539z().mo21549a("This instance being marked as an uploader");
            this.f15642k = true;
            m23767C();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo21864r() {
        this.f15647p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final C5359p4 mo21865s() {
        return this.f15640i;
    }

    private C5461y8(C5232d9 d9Var, C5359p4 p4Var) {
        this.f15641j = false;
        C4300a0.m18620a(d9Var);
        this.f15640i = C5359p4.m23334a(d9Var.f14960a, (zzv) null);
        this.f15655x = -1;
        C5221c9 c9Var = new C5221c9(this);
        c9Var.mo21740t();
        this.f15638g = c9Var;
        C5347o3 o3Var = new C5347o3(this);
        o3Var.mo21740t();
        this.f15633b = o3Var;
        C5293j4 j4Var = new C5293j4(this);
        j4Var.mo21740t();
        this.f15632a = j4Var;
        this.f15640i.mo21203c().mo21555a((Runnable) new C5451x8(this, d9Var));
    }

    /* renamed from: b */
    private static void m23785b(C5429v8 v8Var) {
        if (v8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!v8Var.mo21738r()) {
            String valueOf = String.valueOf(v8Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0188  */
    @androidx.annotation.C0226w0
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C5239e5 m23787e(com.google.android.gms.measurement.internal.zzm r11) {
        /*
            r10 = this;
            r10.m23793y()
            r10.mo21861o()
            com.google.android.gms.common.internal.C4300a0.m18620a(r11)
            java.lang.String r0 = r11.f15709a
            com.google.android.gms.common.internal.C4300a0.m18630b(r0)
            com.google.android.gms.measurement.internal.s9 r0 = r10.mo21855i()
            java.lang.String r1 = r11.f15709a
            com.google.android.gms.measurement.internal.e5 r0 = r0.mo21694b(r1)
            com.google.android.gms.measurement.internal.p4 r1 = r10.f15640i
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo21601o()
            java.lang.String r2 = r11.f15709a
            java.lang.String r1 = r1.mo21807b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.e5 r0 = new com.google.android.gms.measurement.internal.e5
            com.google.android.gms.measurement.internal.p4 r3 = r10.f15640i
            java.lang.String r4 = r11.f15709a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.p4 r3 = r10.f15640i
            com.google.android.gms.measurement.internal.f9 r3 = r3.mo21607u()
            java.lang.String r3 = r3.mo21392w()
            r0.mo21252a(r3)
            r0.mo21265d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo21286m()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo21265d(r1)
            com.google.android.gms.measurement.internal.p4 r1 = r10.f15640i
            com.google.android.gms.measurement.internal.f9 r1 = r1.mo21607u()
            java.lang.String r1 = r1.mo21392w()
            r0.mo21252a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r11.f15711b
            java.lang.String r4 = r0.mo21282k()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r11.f15711b
            r0.mo21257b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r11.f15713c0
            java.lang.String r4 = r0.mo21284l()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r11.f15713c0
            r0.mo21261c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r11.f15704V
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r11.f15704V
            java.lang.String r4 = r0.mo21288n()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r11.f15704V
            r0.mo21267e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r11.f15698P
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b2
            long r7 = r0.mo21297t()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x00b2
            long r3 = r11.f15698P
            r0.mo21264d(r3)
            r1 = 1
        L_0x00b2:
            java.lang.String r3 = r11.f15696N
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = r11.f15696N
            java.lang.String r4 = r0.mo21294q()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r1 = r11.f15696N
            r0.mo21270f(r1)
            r1 = 1
        L_0x00cc:
            long r3 = r11.f15703U
            long r7 = r0.mo21295r()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x00dc
            long r3 = r11.f15703U
            r0.mo21260c(r3)
            r1 = 1
        L_0x00dc:
            java.lang.String r3 = r11.f15697O
            if (r3 == 0) goto L_0x00f0
            java.lang.String r4 = r0.mo21296s()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f0
            java.lang.String r1 = r11.f15697O
            r0.mo21274g(r1)
            r1 = 1
        L_0x00f0:
            long r3 = r11.f15699Q
            long r7 = r0.mo21298u()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0100
            long r3 = r11.f15699Q
            r0.mo21266e(r3)
            r1 = 1
        L_0x0100:
            boolean r3 = r11.f15701S
            boolean r4 = r0.mo21300w()
            if (r3 == r4) goto L_0x010e
            boolean r1 = r11.f15701S
            r0.mo21254a(r1)
            r1 = 1
        L_0x010e:
            java.lang.String r3 = r11.f15700R
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0128
            java.lang.String r3 = r11.f15700R
            java.lang.String r4 = r0.mo21255b()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0128
            java.lang.String r1 = r11.f15700R
            r0.mo21277h(r1)
            r1 = 1
        L_0x0128:
            long r3 = r11.f15705W
            long r7 = r0.mo21263d()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0138
            long r3 = r11.f15705W
            r0.mo21293p(r3)
            r1 = 1
        L_0x0138:
            boolean r3 = r11.f15708Z
            boolean r4 = r0.mo21268e()
            if (r3 == r4) goto L_0x0146
            boolean r1 = r11.f15708Z
            r0.mo21258b(r1)
            r1 = 1
        L_0x0146:
            boolean r3 = r11.f15710a0
            boolean r4 = r0.mo21271f()
            if (r3 == r4) goto L_0x0154
            boolean r1 = r11.f15710a0
            r0.mo21262c(r1)
            r1 = 1
        L_0x0154:
            com.google.android.gms.measurement.internal.p4 r3 = r10.f15640i
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()
            java.lang.String r4 = r11.f15709a
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C5310l.f15244i0
            boolean r3 = r3.mo21643e(r4, r7)
            if (r3 == 0) goto L_0x0172
            java.lang.Boolean r3 = r11.f15714d0
            java.lang.Boolean r4 = r0.mo21272g()
            if (r3 == r4) goto L_0x0172
            java.lang.Boolean r1 = r11.f15714d0
            r0.mo21251a(r1)
            r1 = 1
        L_0x0172:
            long r3 = r11.f15715e0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0186
            long r5 = r0.mo21299v()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0186
            long r3 = r11.f15715e0
            r0.mo21269f(r3)
            r1 = 1
        L_0x0186:
            if (r1 == 0) goto L_0x018f
            com.google.android.gms.measurement.internal.s9 r11 = r10.mo21855i()
            r11.mo21685a(r0)
        L_0x018f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.m23787e(com.google.android.gms.measurement.internal.zzm):com.google.android.gms.measurement.internal.e5");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x049d A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04d0 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0140 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0266 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0273 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0285 A[Catch:{ NameNotFoundException -> 0x0360, all -> 0x04fb }] */
    @androidx.annotation.C0226w0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21851c(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sys"
            java.lang.String r4 = "_pfo"
            java.lang.String r5 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m23793y()
            r21.mo21861o()
            com.google.android.gms.common.internal.C4300a0.m18620a(r22)
            java.lang.String r6 = r2.f15709a
            com.google.android.gms.common.internal.C4300a0.m18630b(r6)
            java.lang.String r6 = r2.f15711b
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x002b
            java.lang.String r6 = r2.f15713c0
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.s9 r6 = r21.mo21855i()
            java.lang.String r7 = r2.f15709a
            com.google.android.gms.measurement.internal.e5 r6 = r6.mo21694b(r7)
            r7 = 0
            if (r6 == 0) goto L_0x005e
            java.lang.String r9 = r6.mo21282k()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x005e
            java.lang.String r9 = r2.f15711b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x005e
            r6.mo21276h(r7)
            com.google.android.gms.measurement.internal.s9 r9 = r21.mo21855i()
            r9.mo21685a(r6)
            com.google.android.gms.measurement.internal.j4 r6 = r21.mo21853f()
            java.lang.String r9 = r2.f15709a
            r6.mo21512d(r9)
        L_0x005e:
            boolean r6 = r2.f15701S
            if (r6 != 0) goto L_0x0066
            r21.m23787e(r22)
            return
        L_0x0066:
            long r9 = r2.f15706X
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i
            com.google.android.gms.common.util.g r6 = r6.mo21208g()
            long r9 = r6.mo18569a()
        L_0x0076:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()
            java.lang.String r11 = r2.f15709a
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C5310l.f15244i0
            boolean r6 = r6.mo21643e(r11, r12)
            if (r6 == 0) goto L_0x008f
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i
            com.google.android.gms.measurement.internal.f r6 = r6.mo21584F()
            r6.mo21330w()
        L_0x008f:
            int r6 = r2.f15707Y
            r15 = 0
            r13 = 1
            if (r6 == 0) goto L_0x00b1
            if (r6 == r13) goto L_0x00b1
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo21205d()
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo21536w()
            java.lang.String r12 = r2.f15709a
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r11.mo21551a(r14, r12, r6)
            r6 = 0
        L_0x00b1:
            com.google.android.gms.measurement.internal.s9 r11 = r21.mo21855i()
            r11.mo21712z()
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r11 = r11.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = r2.f15709a     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C5310l.f15244i0     // Catch:{ all -> 0x04fb }
            boolean r11 = r11.mo21643e(r12, r14)     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x0131
            com.google.android.gms.measurement.internal.s9 r11 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.g9 r14 = r11.mo21698c(r12, r14)     // Catch:{ all -> 0x04fb }
            if (r14 == 0) goto L_0x00e0
            java.lang.String r11 = "auto"
            java.lang.String r12 = r14.f15071b     // Catch:{ all -> 0x04fb }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x0131
        L_0x00e0:
            java.lang.Boolean r11 = r2.f15714d0     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x011b
            com.google.android.gms.measurement.internal.zzjx r12 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x04fb }
            java.lang.String r16 = "_npa"
            java.lang.Boolean r11 = r2.f15714d0     // Catch:{ all -> 0x04fb }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x00f3
            r17 = 1
            goto L_0x00f5
        L_0x00f3:
            r17 = 0
        L_0x00f5:
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x04fb }
            java.lang.String r18 = "auto"
            r11 = r12
            r7 = r12
            r12 = r16
            r19 = r3
            r8 = r14
            r3 = 1
            r13 = r9
            r15 = r17
            r16 = r18
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04fb }
            if (r8 == 0) goto L_0x0117
            java.lang.Object r8 = r8.f15074e     // Catch:{ all -> 0x04fb }
            java.lang.Long r11 = r7.f15689O     // Catch:{ all -> 0x04fb }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x04fb }
            if (r8 != 0) goto L_0x0134
        L_0x0117:
            r1.mo21839a(r7, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x0134
        L_0x011b:
            r19 = r3
            r8 = r14
            r3 = 1
            if (r8 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.zzjx r7 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04fb }
            r1.mo21847b(r7, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x0134
        L_0x0131:
            r19 = r3
            r3 = 1
        L_0x0134:
            com.google.android.gms.measurement.internal.s9 r7 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r8 = r2.f15709a     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.e5 r7 = r7.mo21694b(r8)     // Catch:{ all -> 0x04fb }
            if (r7 == 0) goto L_0x01f2
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x04fb }
            r11.mo21607u()     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = r2.f15711b     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = r7.mo21282k()     // Catch:{ all -> 0x04fb }
            java.lang.String r13 = r2.f15713c0     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = r7.mo21284l()     // Catch:{ all -> 0x04fb }
            boolean r11 = com.google.android.gms.measurement.internal.C5254f9.m22834a(r11, r12, r13, r14)     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x01f2
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo21205d()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo21536w()     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r7.mo21278i()     // Catch:{ all -> 0x04fb }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ all -> 0x04fb }
            r11.mo21550a(r12, r13)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.s9 r11 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r7.mo21278i()     // Catch:{ all -> 0x04fb }
            r11.mo21739s()     // Catch:{ all -> 0x04fb }
            r11.mo21209h()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.common.internal.C4300a0.m18630b(r7)     // Catch:{ all -> 0x04fb }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo21709w()     // Catch:{ SQLiteException -> 0x01dd }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01dd }
            r15 = 0
            r13[r15] = r7     // Catch:{ SQLiteException -> 0x01db }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r15
            java.lang.String r8 = "user_attributes"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "conditional_properties"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "apps"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events_metadata"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "event_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "property_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r8
            java.lang.String r8 = "audience_filter_values"
            int r0 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01db }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01f0
            com.google.android.gms.measurement.internal.k3 r0 = r11.mo21205d()     // Catch:{ SQLiteException -> 0x01db }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21528C()     // Catch:{ SQLiteException -> 0x01db }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01db }
            r0.mo21551a(r8, r7, r12)     // Catch:{ SQLiteException -> 0x01db }
            goto L_0x01f0
        L_0x01db:
            r0 = move-exception
            goto L_0x01df
        L_0x01dd:
            r0 = move-exception
            r15 = 0
        L_0x01df:
            com.google.android.gms.measurement.internal.k3 r8 = r11.mo21205d()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21533t()     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = "Error deleting application data. appId, error"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r7)     // Catch:{ all -> 0x04fb }
            r8.mo21551a(r11, r7, r0)     // Catch:{ all -> 0x04fb }
        L_0x01f0:
            r7 = 0
            goto L_0x01f3
        L_0x01f2:
            r15 = 0
        L_0x01f3:
            if (r7 == 0) goto L_0x0260
            long r11 = r7.mo21295r()     // Catch:{ all -> 0x04fb }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r0 = "_pv"
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x022d
            long r11 = r7.mo21295r()     // Catch:{ all -> 0x04fb }
            long r13 = r2.f15703U     // Catch:{ all -> 0x04fb }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0260
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r8.<init>()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r7.mo21294q()     // Catch:{ all -> 0x04fb }
            r8.putString(r0, r7)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.zzak r0 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r8)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r0
            r8 = 0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r0, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x0261
        L_0x022d:
            r8 = 0
            java.lang.String r11 = r7.mo21294q()     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x0261
            java.lang.String r11 = r7.mo21294q()     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = r2.f15696N     // Catch:{ all -> 0x04fb }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04fb }
            if (r11 != 0) goto L_0x0261
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r11.<init>()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r7.mo21294q()     // Catch:{ all -> 0x04fb }
            r11.putString(r0, r7)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.zzak r0 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r11)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r0, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x0261
        L_0x0260:
            r8 = 0
        L_0x0261:
            r21.m23787e(r22)     // Catch:{ all -> 0x04fb }
            if (r6 != 0) goto L_0x0273
            com.google.android.gms.measurement.internal.s9 r0 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = "_f"
            com.google.android.gms.measurement.internal.g r0 = r0.mo21677a(r7, r11)     // Catch:{ all -> 0x04fb }
            goto L_0x0283
        L_0x0273:
            if (r6 != r3) goto L_0x0282
            com.google.android.gms.measurement.internal.s9 r0 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = "_v"
            com.google.android.gms.measurement.internal.g r0 = r0.mo21677a(r7, r11)     // Catch:{ all -> 0x04fb }
            goto L_0x0283
        L_0x0282:
            r0 = 0
        L_0x0283:
            if (r0 != 0) goto L_0x04d0
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r9 / r11
            r15 = 1
            long r13 = r13 + r15
            long r13 = r13 * r11
            java.lang.String r0 = "_dac"
            java.lang.String r7 = "_r"
            java.lang.String r15 = "_c"
            java.lang.String r12 = "_et"
            if (r6 != 0) goto L_0x042c
            com.google.android.gms.measurement.internal.zzjx r6 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x04fb }
            java.lang.String r16 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04fb }
            java.lang.String r20 = "auto"
            r11 = r6
            r13 = r12
            r12 = r16
            r3 = r13
            r13 = r9
            r8 = r15
            r15 = r18
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04fb }
            r1.mo21839a(r6, r2)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = r2.f15711b     // Catch:{ all -> 0x04fb }
            boolean r6 = r6.mo21648j(r11)     // Catch:{ all -> 0x04fb }
            if (r6 == 0) goto L_0x02d0
            r21.m23793y()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo21604r()     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = r2.f15709a     // Catch:{ all -> 0x04fb }
            r6.mo21241a(r11)     // Catch:{ all -> 0x04fb }
        L_0x02d0:
            r21.m23793y()     // Catch:{ all -> 0x04fb }
            r21.mo21861o()     // Catch:{ all -> 0x04fb }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r6.<init>()     // Catch:{ all -> 0x04fb }
            r11 = 1
            r6.putLong(r8, r11)     // Catch:{ all -> 0x04fb }
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04fb }
            r7 = 0
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04fb }
            r6.putLong(r4, r7)     // Catch:{ all -> 0x04fb }
            r15 = r19
            r6.putLong(r15, r7)     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = "_sysu"
            r6.putLong(r11, r7)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r7 = r7.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r8 = r2.f15709a     // Catch:{ all -> 0x04fb }
            boolean r7 = r7.mo21657p(r8)     // Catch:{ all -> 0x04fb }
            if (r7 == 0) goto L_0x0309
            r7 = 1
            r6.putLong(r3, r7)     // Catch:{ all -> 0x04fb }
            goto L_0x030b
        L_0x0309:
            r7 = 1
        L_0x030b:
            boolean r11 = r2.f15712b0     // Catch:{ all -> 0x04fb }
            if (r11 == 0) goto L_0x0312
            r6.putLong(r0, r7)     // Catch:{ all -> 0x04fb }
        L_0x0312:
            com.google.android.gms.measurement.internal.s9 r0 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            java.lang.String r7 = r2.f15709a     // Catch:{ all -> 0x04fb }
            com.google.android.gms.common.internal.C4300a0.m18630b(r7)     // Catch:{ all -> 0x04fb }
            r0.mo21209h()     // Catch:{ all -> 0x04fb }
            r0.mo21739s()     // Catch:{ all -> 0x04fb }
            java.lang.String r8 = "first_open_count"
            long r7 = r0.mo21707h(r7, r8)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x04fb }
            android.content.Context r0 = r0.mo21206e()     // Catch:{ all -> 0x04fb }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04fb }
            if (r0 != 0) goto L_0x034e
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.k3 r0 = r0.mo21205d()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo21533t()     // Catch:{ all -> 0x04fb }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r11)     // Catch:{ all -> 0x04fb }
            r0.mo21550a(r5, r11)     // Catch:{ all -> 0x04fb }
            r18 = r3
        L_0x034a:
            r11 = 0
            goto L_0x0411
        L_0x034e:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ NameNotFoundException -> 0x0360 }
            android.content.Context r0 = r0.mo21206e()     // Catch:{ NameNotFoundException -> 0x0360 }
            com.google.android.gms.common.q.b r0 = com.google.android.gms.common.p172q.C4439c.m19110a(r0)     // Catch:{ NameNotFoundException -> 0x0360 }
            java.lang.String r11 = r2.f15709a     // Catch:{ NameNotFoundException -> 0x0360 }
            r12 = 0
            android.content.pm.PackageInfo r0 = r0.mo18451b(r11, r12)     // Catch:{ NameNotFoundException -> 0x0360 }
            goto L_0x0377
        L_0x0360:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.k3 r11 = r11.mo21205d()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.m3 r11 = r11.mo21533t()     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ all -> 0x04fb }
            r11.mo21551a(r12, r13, r0)     // Catch:{ all -> 0x04fb }
            r0 = 0
        L_0x0377:
            if (r0 == 0) goto L_0x03c9
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04fb }
            r13 = 0
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x03c9
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04fb }
            long r13 = r0.lastUpdateTime     // Catch:{ all -> 0x04fb }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x03aa
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r0 = r0.mo21600n()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C5310l.f15215P0     // Catch:{ all -> 0x04fb }
            boolean r0 = r0.mo21635a(r11)     // Catch:{ all -> 0x04fb }
            if (r0 == 0) goto L_0x03a3
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x03a8
            r11 = 1
            r6.putLong(r5, r11)     // Catch:{ all -> 0x04fb }
            goto L_0x03a8
        L_0x03a3:
            r11 = 1
            r6.putLong(r5, r11)     // Catch:{ all -> 0x04fb }
        L_0x03a8:
            r0 = 0
            goto L_0x03ab
        L_0x03aa:
            r0 = 1
        L_0x03ab:
            com.google.android.gms.measurement.internal.zzjx r5 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_fi"
            if (r0 == 0) goto L_0x03b4
            r13 = 1
            goto L_0x03b6
        L_0x03b4:
            r13 = 0
        L_0x03b6:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04fb }
            java.lang.String r16 = "auto"
            r11 = r5
            r13 = r9
            r18 = r3
            r3 = r15
            r15 = r0
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04fb }
            r1.mo21839a(r5, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x03cc
        L_0x03c9:
            r18 = r3
            r3 = r15
        L_0x03cc:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ NameNotFoundException -> 0x03de }
            android.content.Context r0 = r0.mo21206e()     // Catch:{ NameNotFoundException -> 0x03de }
            com.google.android.gms.common.q.b r0 = com.google.android.gms.common.p172q.C4439c.m19110a(r0)     // Catch:{ NameNotFoundException -> 0x03de }
            java.lang.String r5 = r2.f15709a     // Catch:{ NameNotFoundException -> 0x03de }
            r11 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo18446a(r5, r11)     // Catch:{ NameNotFoundException -> 0x03de }
            goto L_0x03f5
        L_0x03de:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ all -> 0x04fb }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.f15709a     // Catch:{ all -> 0x04fb }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ all -> 0x04fb }
            r5.mo21551a(r11, r12, r0)     // Catch:{ all -> 0x04fb }
            r0 = 0
        L_0x03f5:
            if (r0 == 0) goto L_0x034a
            int r5 = r0.flags     // Catch:{ all -> 0x04fb }
            r11 = 1
            r5 = r5 & r11
            if (r5 == 0) goto L_0x0402
            r11 = 1
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04fb }
        L_0x0402:
            int r0 = r0.flags     // Catch:{ all -> 0x04fb }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x034a
            java.lang.String r0 = "_sysu"
            r11 = 1
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04fb }
            goto L_0x034a
        L_0x0411:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0418
            r6.putLong(r4, r7)     // Catch:{ all -> 0x04fb }
        L_0x0418:
            com.google.android.gms.measurement.internal.zzak r0 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_f"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r6)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r0, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x048b
        L_0x042c:
            r18 = r12
            r8 = r15
            if (r6 != r3) goto L_0x048b
            com.google.android.gms.measurement.internal.zzjx r3 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_fvt"
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04fb }
            java.lang.String r16 = "auto"
            r11 = r3
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04fb }
            r1.mo21839a(r3, r2)     // Catch:{ all -> 0x04fb }
            r21.m23793y()     // Catch:{ all -> 0x04fb }
            r21.mo21861o()     // Catch:{ all -> 0x04fb }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r3.<init>()     // Catch:{ all -> 0x04fb }
            r4 = 1
            r3.putLong(r8, r4)     // Catch:{ all -> 0x04fb }
            r3.putLong(r7, r4)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r5 = r2.f15709a     // Catch:{ all -> 0x04fb }
            boolean r4 = r4.mo21657p(r5)     // Catch:{ all -> 0x04fb }
            if (r4 == 0) goto L_0x046c
            r4 = r18
            r5 = 1
            r3.putLong(r4, r5)     // Catch:{ all -> 0x04fb }
            goto L_0x0470
        L_0x046c:
            r4 = r18
            r5 = 1
        L_0x0470:
            boolean r7 = r2.f15712b0     // Catch:{ all -> 0x04fb }
            if (r7 == 0) goto L_0x0477
            r3.putLong(r0, r5)     // Catch:{ all -> 0x04fb }
        L_0x0477:
            com.google.android.gms.measurement.internal.zzak r0 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_v"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r3)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r0, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x048d
        L_0x048b:
            r4 = r18
        L_0x048d:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r0 = r0.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r3 = r2.f15709a     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15242h0     // Catch:{ all -> 0x04fb }
            boolean r0 = r0.mo21643e(r3, r5)     // Catch:{ all -> 0x04fb }
            if (r0 != 0) goto L_0x04ec
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r0.<init>()     // Catch:{ all -> 0x04fb }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x04fb }
            java.lang.String r4 = r2.f15709a     // Catch:{ all -> 0x04fb }
            boolean r3 = r3.mo21657p(r4)     // Catch:{ all -> 0x04fb }
            if (r3 == 0) goto L_0x04bc
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04fb }
        L_0x04bc:
            com.google.android.gms.measurement.internal.zzak r3 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_e"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r0)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r3, r2)     // Catch:{ all -> 0x04fb }
            goto L_0x04ec
        L_0x04d0:
            boolean r0 = r2.f15702T     // Catch:{ all -> 0x04fb }
            if (r0 == 0) goto L_0x04ec
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04fb }
            r0.<init>()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.zzak r3 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x04fb }
            java.lang.String r12 = "_cd"
            com.google.android.gms.measurement.internal.zzaf r13 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ all -> 0x04fb }
            r13.<init>(r0)     // Catch:{ all -> 0x04fb }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04fb }
            r1.mo21837a(r3, r2)     // Catch:{ all -> 0x04fb }
        L_0x04ec:
            com.google.android.gms.measurement.internal.s9 r0 = r21.mo21855i()     // Catch:{ all -> 0x04fb }
            r0.mo21708v()     // Catch:{ all -> 0x04fb }
            com.google.android.gms.measurement.internal.s9 r0 = r21.mo21855i()
            r0.mo21668A()
            return
        L_0x04fb:
            r0 = move-exception
            com.google.android.gms.measurement.internal.s9 r2 = r21.mo21855i()
            r2.mo21668A()
            goto L_0x0505
        L_0x0504:
            throw r0
        L_0x0505:
            goto L_0x0504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.mo21851c(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo21852d(zzm zzm) {
        try {
            return (String) this.f15640i.mo21203c().mo21554a((Callable<V>) new C5210b9<V>(this, zzm)).get(C2876e.f10137n, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f15640i.mo21205d().mo21533t().mo21551a("Failed to get app instance id. appId", C5303k3.m23051a(zzm.f15709a), e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:249:0x0853 A[Catch:{ SQLiteException -> 0x023a, all -> 0x08c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0883 A[Catch:{ SQLiteException -> 0x023a, all -> 0x08c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0272 A[Catch:{ SQLiteException -> 0x023a, all -> 0x08c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a9 A[Catch:{ SQLiteException -> 0x023a, all -> 0x08c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f7 A[Catch:{ SQLiteException -> 0x023a, all -> 0x08c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0324  */
    @androidx.annotation.C0226w0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23786b(com.google.android.gms.measurement.internal.zzak r28, com.google.android.gms.measurement.internal.zzm r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "_s"
            com.google.android.gms.common.internal.C4300a0.m18620a(r29)
            java.lang.String r5 = r3.f15709a
            com.google.android.gms.common.internal.C4300a0.m18630b(r5)
            long r5 = java.lang.System.nanoTime()
            r27.m23793y()
            r27.mo21861o()
            java.lang.String r15 = r3.f15709a
            com.google.android.gms.measurement.internal.c9 r7 = r27.mo21858l()
            boolean r7 = r7.mo21200a(r2, r3)
            if (r7 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r7 = r3.f15701S
            if (r7 != 0) goto L_0x002f
            r1.m23787e(r3)
            return
        L_0x002f:
            com.google.android.gms.measurement.internal.j4 r7 = r27.mo21853f()
            java.lang.String r8 = r2.f15686a
            boolean r7 = r7.mo21508b(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            r12 = 1
            if (r7 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r15)
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i
            com.google.android.gms.measurement.internal.i3 r5 = r5.mo21608v()
            java.lang.String r6 = r2.f15686a
            java.lang.String r5 = r5.mo21429a(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo21551a(r6, r4, r5)
            com.google.android.gms.measurement.internal.j4 r3 = r27.mo21853f()
            boolean r3 = r3.mo21515g(r15)
            if (r3 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.j4 r3 = r27.mo21853f()
            boolean r3 = r3.mo21516h(r15)
            if (r3 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            if (r3 != 0) goto L_0x0091
            java.lang.String r4 = r2.f15686a
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i
            com.google.android.gms.measurement.internal.f9 r7 = r4.mo21607u()
            r9 = 11
            java.lang.String r11 = r2.f15686a
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.mo21376a(r8, r9, r10, r11, r12)
        L_0x0091:
            if (r3 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            com.google.android.gms.measurement.internal.e5 r2 = r2.mo21694b(r15)
            if (r2 == 0) goto L_0x00da
            long r3 = r2.mo21303z()
            long r5 = r2.mo21302y()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i
            com.google.android.gms.common.util.g r5 = r5.mo21208g()
            long r5 = r5.mo18569a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.d3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C5310l.f15196G
            java.lang.Object r5 = r5.mo21225a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00da
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21527A()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo21549a(r4)
            r1.m23778a(r2)
        L_0x00da:
            return
        L_0x00db:
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()
            r10 = 2
            boolean r7 = r7.mo21532a(r10)
            if (r7 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21528C()
            com.google.android.gms.measurement.internal.p4 r8 = r1.f15640i
            com.google.android.gms.measurement.internal.i3 r8 = r8.mo21608v()
            java.lang.String r8 = r8.mo21428a(r2)
            java.lang.String r9 = "Logging event"
            r7.mo21550a(r9, r8)
        L_0x0101:
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()
            r7.mo21712z()
            r1.m23787e(r3)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = "_iap"
            java.lang.String r8 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "ecommerce_purchase"
            if (r7 != 0) goto L_0x0125
            java.lang.String r7 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r23 = r5
            r6 = 0
            goto L_0x02b8
        L_0x0125:
            com.google.android.gms.measurement.internal.zzaf r7 = r2.f15687b     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = "currency"
            java.lang.String r7 = r7.mo21879f(r9)     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = "value"
            if (r8 == 0) goto L_0x018c
            com.google.android.gms.measurement.internal.zzaf r8 = r2.f15687b     // Catch:{ all -> 0x08c8 }
            java.lang.Double r8 = r8.mo21878e(r9)     // Catch:{ all -> 0x08c8 }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x08c8 }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r8 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r8 != 0) goto L_0x015e
            com.google.android.gms.measurement.internal.zzaf r8 = r2.f15687b     // Catch:{ all -> 0x08c8 }
            java.lang.Long r8 = r8.mo21877d(r9)     // Catch:{ all -> 0x08c8 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08c8 }
            double r8 = (double) r8
            java.lang.Double.isNaN(r8)
            double r16 = r8 * r18
        L_0x015e:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 > 0) goto L_0x016f
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 < 0) goto L_0x016f
            long r8 = java.lang.Math.round(r16)     // Catch:{ all -> 0x08c8 }
            goto L_0x0196
        L_0x016f:
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21536w()     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r15)     // Catch:{ all -> 0x08c8 }
            java.lang.Double r10 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x08c8 }
            r7.mo21551a(r8, r9, r10)     // Catch:{ all -> 0x08c8 }
            r23 = r5
            r6 = 0
            r11 = 0
            goto L_0x02a7
        L_0x018c:
            com.google.android.gms.measurement.internal.zzaf r8 = r2.f15687b     // Catch:{ all -> 0x08c8 }
            java.lang.Long r8 = r8.mo21877d(r9)     // Catch:{ all -> 0x08c8 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08c8 }
        L_0x0196:
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08c8 }
            if (r10 != 0) goto L_0x02a3
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r7.toUpperCase(r10)     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r7.matches(r10)     // Catch:{ all -> 0x08c8 }
            if (r10 == 0) goto L_0x02a3
            java.lang.String r10 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x08c8 }
            int r16 = r7.length()     // Catch:{ all -> 0x08c8 }
            if (r16 == 0) goto L_0x01bb
            java.lang.String r7 = r10.concat(r7)     // Catch:{ all -> 0x08c8 }
            goto L_0x01c0
        L_0x01bb:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x08c8 }
            r7.<init>(r10)     // Catch:{ all -> 0x08c8 }
        L_0x01c0:
            r10 = r7
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r7 = r7.mo21698c(r15, r10)     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x0201
            java.lang.Object r11 = r7.f15074e     // Catch:{ all -> 0x08c8 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x08c8 }
            if (r11 != 0) goto L_0x01d2
            goto L_0x0201
        L_0x01d2:
            java.lang.Object r7 = r7.f15074e     // Catch:{ all -> 0x08c8 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x08c8 }
            long r19 = r7.longValue()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r17 = new com.google.android.gms.measurement.internal.g9     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = r2.f15684N     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.util.g r7 = r7.mo21208g()     // Catch:{ all -> 0x08c8 }
            long r21 = r7.mo18569a()     // Catch:{ all -> 0x08c8 }
            long r19 = r19 + r8
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x08c8 }
            r7 = r17
            r8 = r15
            r9 = r11
            r11 = 2
            r23 = r5
            r5 = 1
            r6 = 0
            r11 = r21
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x08c8 }
            r5 = r17
            goto L_0x0268
        L_0x0201:
            r23 = r5
            r5 = 1
            r6 = 0
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r11 = r11.mo21600n()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C5310l.f15206L     // Catch:{ all -> 0x08c8 }
            int r11 = r11.mo21636b(r15, r12)     // Catch:{ all -> 0x08c8 }
            int r11 = r11 - r5
            com.google.android.gms.common.internal.C4300a0.m18630b(r15)     // Catch:{ all -> 0x08c8 }
            r7.mo21209h()     // Catch:{ all -> 0x08c8 }
            r7.mo21739s()     // Catch:{ all -> 0x08c8 }
            android.database.sqlite.SQLiteDatabase r12 = r7.mo21709w()     // Catch:{ SQLiteException -> 0x023a }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x023a }
            r5[r6] = r15     // Catch:{ SQLiteException -> 0x023a }
            r16 = 1
            r5[r16] = r15     // Catch:{ SQLiteException -> 0x023a }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x023a }
            r16 = 2
            r5[r16] = r11     // Catch:{ SQLiteException -> 0x023a }
            r12.execSQL(r13, r5)     // Catch:{ SQLiteException -> 0x023a }
            goto L_0x024d
        L_0x023a:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r15)     // Catch:{ all -> 0x08c8 }
            r7.mo21551a(r11, r12, r5)     // Catch:{ all -> 0x08c8 }
        L_0x024d:
            com.google.android.gms.measurement.internal.g9 r5 = new com.google.android.gms.measurement.internal.g9     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = r2.f15684N     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.util.g r7 = r7.mo21208g()     // Catch:{ all -> 0x08c8 }
            long r12 = r7.mo18569a()     // Catch:{ all -> 0x08c8 }
            java.lang.Long r16 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x08c8 }
            r7 = r5
            r8 = r15
            r9 = r11
            r11 = r12
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x08c8 }
        L_0x0268:
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            boolean r7 = r7.mo21691a(r5)     // Catch:{ all -> 0x08c8 }
            if (r7 != 0) goto L_0x02a6
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r15)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r10 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.i3 r10 = r10.mo21608v()     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = r5.f15072c     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r10.mo21431c(r11)     // Catch:{ all -> 0x08c8 }
            java.lang.Object r5 = r5.f15074e     // Catch:{ all -> 0x08c8 }
            r7.mo21552a(r8, r9, r10, r5)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r5.mo21607u()     // Catch:{ all -> 0x08c8 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.mo21376a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08c8 }
            goto L_0x02a6
        L_0x02a3:
            r23 = r5
            r6 = 0
        L_0x02a6:
            r11 = 1
        L_0x02a7:
            if (r11 != 0) goto L_0x02b8
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21708v()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            return
        L_0x02b8:
            java.lang.String r5 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r5 = com.google.android.gms.measurement.internal.C5254f9.m22843f(r5)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r16 = r14.equals(r7)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            long r8 = r27.m23794z()     // Catch:{ all -> 0x08c8 }
            r11 = 1
            r13 = 0
            r17 = 0
            r10 = r15
            r12 = r5
            r14 = r16
            r18 = r15
            r15 = r17
            com.google.android.gms.measurement.internal.v9 r7 = r7.mo21678a(r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x08c8 }
            long r8 = r7.f15537b     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C5310l.f15261r     // Catch:{ all -> 0x08c8 }
            r14 = 0
            java.lang.Object r10 = r10.mo21225a(r14)     // Catch:{ all -> 0x08c8 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x08c8 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x08c8 }
            long r10 = (long) r10     // Catch:{ all -> 0x08c8 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 1
            r14 = 0
            int r17 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0324
            long r8 = r8 % r10
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0315
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r18)     // Catch:{ all -> 0x08c8 }
            long r5 = r7.f15537b     // Catch:{ all -> 0x08c8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x08c8 }
            r2.mo21551a(r3, r4, r5)     // Catch:{ all -> 0x08c8 }
        L_0x0315:
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21708v()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            return
        L_0x0324:
            if (r5 == 0) goto L_0x037c
            long r8 = r7.f15536a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.C5310l.f15265t     // Catch:{ all -> 0x08c8 }
            r12 = 0
            java.lang.Object r6 = r6.mo21225a(r12)     // Catch:{ all -> 0x08c8 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x08c8 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x08c8 }
            long r12 = (long) r6     // Catch:{ all -> 0x08c8 }
            long r8 = r8 - r12
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x037c
            long r8 = r8 % r10
            r3 = 1
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x035b
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r18)     // Catch:{ all -> 0x08c8 }
            long r6 = r7.f15536a     // Catch:{ all -> 0x08c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x08c8 }
            r3.mo21551a(r4, r5, r6)     // Catch:{ all -> 0x08c8 }
        L_0x035b:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r3.mo21607u()     // Catch:{ all -> 0x08c8 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            r12 = 0
            r8 = r18
            r7.mo21376a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21708v()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            return
        L_0x037c:
            if (r16 == 0) goto L_0x03ce
            long r8 = r7.f15539d     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.C5310l.f15263s     // Catch:{ all -> 0x08c8 }
            int r6 = r6.mo21636b(r10, r11)     // Catch:{ all -> 0x08c8 }
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = java.lang.Math.min(r10, r6)     // Catch:{ all -> 0x08c8 }
            r12 = 0
            int r6 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x08c8 }
            long r10 = (long) r6     // Catch:{ all -> 0x08c8 }
            long r8 = r8 - r10
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x03cf
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r18)     // Catch:{ all -> 0x08c8 }
            long r5 = r7.f15539d     // Catch:{ all -> 0x08c8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x08c8 }
            r2.mo21551a(r3, r4, r5)     // Catch:{ all -> 0x08c8 }
        L_0x03bf:
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21708v()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            return
        L_0x03ce:
            r12 = 0
        L_0x03cf:
            com.google.android.gms.measurement.internal.zzaf r6 = r2.f15687b     // Catch:{ all -> 0x08c8 }
            android.os.Bundle r6 = r6.mo21880i()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r7.mo21607u()     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f15684N     // Catch:{ all -> 0x08c8 }
            r7.mo21368a(r6, r8, r9)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r7.mo21607u()     // Catch:{ all -> 0x08c8 }
            r13 = r18
            boolean r7 = r7.mo21386d(r13)     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0410
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r7.mo21607u()     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "_dbg"
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08c8 }
            r7.mo21368a(r6, r8, r12)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r7.mo21607u()     // Catch:{ all -> 0x08c8 }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08c8 }
            r7.mo21368a(r6, r11, r8)     // Catch:{ all -> 0x08c8 }
        L_0x0410:
            java.lang.String r7 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x08c8 }
            java.lang.String r8 = "_sno"
            if (r7 == 0) goto L_0x0445
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r7 = r7.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            boolean r7 = r7.mo21651m(r9)     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x0445
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r7 = r7.mo21698c(r9, r8)     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x0445
            java.lang.Object r9 = r7.f15074e     // Catch:{ all -> 0x08c8 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x08c8 }
            if (r9 == 0) goto L_0x0445
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r9 = r9.mo21607u()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r7 = r7.f15074e     // Catch:{ all -> 0x08c8 }
            r9.mo21368a(r6, r8, r7)     // Catch:{ all -> 0x08c8 }
        L_0x0445:
            java.lang.String r7 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x08c8 }
            if (r4 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C5310l.f15236e0     // Catch:{ all -> 0x08c8 }
            boolean r4 = r4.mo21643e(r7, r9)     // Catch:{ all -> 0x08c8 }
            if (r4 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            boolean r4 = r4.mo21651m(r7)     // Catch:{ all -> 0x08c8 }
            if (r4 != 0) goto L_0x0475
            com.google.android.gms.measurement.internal.zzjx r4 = new com.google.android.gms.measurement.internal.zzjx     // Catch:{ all -> 0x08c8 }
            r12 = 0
            r4.<init>(r8, r14, r12)     // Catch:{ all -> 0x08c8 }
            r1.mo21847b(r4, r3)     // Catch:{ all -> 0x08c8 }
            goto L_0x0476
        L_0x0475:
            r12 = 0
        L_0x0476:
            com.google.android.gms.measurement.internal.s9 r4 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            long r7 = r4.mo21697c(r13)     // Catch:{ all -> 0x08c8 }
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0499
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r13)     // Catch:{ all -> 0x08c8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x08c8 }
            r4.mo21551a(r9, r10, r7)     // Catch:{ all -> 0x08c8 }
        L_0x0499:
            com.google.android.gms.measurement.internal.e r4 = new com.google.android.gms.measurement.internal.e     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r8 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = r2.f15684N     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r2.f15686a     // Catch:{ all -> 0x08c8 }
            long r14 = r2.f15685O     // Catch:{ all -> 0x08c8 }
            r19 = 0
            r7 = r4
            r2 = r10
            r10 = r13
            r26 = r11
            r11 = r2
            r16 = r12
            r2 = r13
            r25 = 0
            r12 = r14
            r28 = r16
            r14 = r19
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r6 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r4.f14962b     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g r6 = r6.mo21677a(r2, r7)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x052c
            com.google.android.gms.measurement.internal.s9 r6 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            long r6 = r6.mo21705g(r2)     // Catch:{ all -> 0x08c8 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0512
            if (r5 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r2)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.i3 r7 = r7.mo21608v()     // Catch:{ all -> 0x08c8 }
            java.lang.String r4 = r4.f14962b     // Catch:{ all -> 0x08c8 }
            java.lang.String r4 = r7.mo21429a(r4)     // Catch:{ all -> 0x08c8 }
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x08c8 }
            r3.mo21552a(r5, r6, r4, r7)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r3.mo21607u()     // Catch:{ all -> 0x08c8 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.mo21376a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            return
        L_0x0512:
            com.google.android.gms.measurement.internal.g r5 = new com.google.android.gms.measurement.internal.g     // Catch:{ all -> 0x08c8 }
            java.lang.String r9 = r4.f14962b     // Catch:{ all -> 0x08c8 }
            r10 = 0
            r12 = 0
            long r14 = r4.f14964d     // Catch:{ all -> 0x08c8 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r5
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x08c8 }
            goto L_0x053a
        L_0x052c:
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            long r7 = r6.f15046f     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.e r4 = r4.mo21238a(r2, r7)     // Catch:{ all -> 0x08c8 }
            long r7 = r4.f14964d     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g r5 = r6.mo21393a(r7)     // Catch:{ all -> 0x08c8 }
        L_0x053a:
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21686a(r5)     // Catch:{ all -> 0x08c8 }
            r27.m23793y()     // Catch:{ all -> 0x08c8 }
            r27.mo21861o()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r4)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r29)     // Catch:{ all -> 0x08c8 }
            java.lang.String r2 = r4.f14961a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.internal.C4300a0.m18630b(r2)     // Catch:{ all -> 0x08c8 }
            java.lang.String r2 = r4.f14961a     // Catch:{ all -> 0x08c8 }
            java.lang.String r5 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.common.internal.C4300a0.m18627a(r2)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$g$a r2 = com.google.android.gms.internal.measurement.C4966t0.C4979g.m21344r0()     // Catch:{ all -> 0x08c8 }
            r5 = 1
            com.google.android.gms.internal.measurement.t0$g$a r2 = r2.mo19575a(r5)     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = "android"
            com.google.android.gms.internal.measurement.t0$g$a r2 = r2.mo19214a(r6)     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x0579
            java.lang.String r6 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            r2.mo19604f(r6)     // Catch:{ all -> 0x08c8 }
        L_0x0579:
            java.lang.String r6 = r3.f15697O     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x0586
            java.lang.String r6 = r3.f15697O     // Catch:{ all -> 0x08c8 }
            r2.mo19601e(r6)     // Catch:{ all -> 0x08c8 }
        L_0x0586:
            java.lang.String r6 = r3.f15696N     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x0593
            java.lang.String r6 = r3.f15696N     // Catch:{ all -> 0x08c8 }
            r2.mo19607g(r6)     // Catch:{ all -> 0x08c8 }
        L_0x0593:
            long r6 = r3.f15703U     // Catch:{ all -> 0x08c8 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x05a2
            long r6 = r3.f15703U     // Catch:{ all -> 0x08c8 }
            int r7 = (int) r6     // Catch:{ all -> 0x08c8 }
            r2.mo19605g(r7)     // Catch:{ all -> 0x08c8 }
        L_0x05a2:
            long r6 = r3.f15698P     // Catch:{ all -> 0x08c8 }
            r2.mo19603f(r6)     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = r3.f15711b     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x05b4
            java.lang.String r6 = r3.f15711b     // Catch:{ all -> 0x08c8 }
            r2.mo19616k(r6)     // Catch:{ all -> 0x08c8 }
        L_0x05b4:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C5310l.f15258p0     // Catch:{ all -> 0x08c8 }
            boolean r6 = r6.mo21635a(r7)     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x05da
            java.lang.String r6 = r2.mo19632v()     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x05e7
            java.lang.String r6 = r3.f15713c0     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x05e7
            java.lang.String r6 = r3.f15713c0     // Catch:{ all -> 0x08c8 }
            r2.mo19625o(r6)     // Catch:{ all -> 0x08c8 }
            goto L_0x05e7
        L_0x05da:
            java.lang.String r6 = r3.f15713c0     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x05e7
            java.lang.String r6 = r3.f15713c0     // Catch:{ all -> 0x08c8 }
            r2.mo19625o(r6)     // Catch:{ all -> 0x08c8 }
        L_0x05e7:
            long r6 = r3.f15699Q     // Catch:{ all -> 0x08c8 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x05f4
            long r6 = r3.f15699Q     // Catch:{ all -> 0x08c8 }
            r2.mo19609h(r6)     // Catch:{ all -> 0x08c8 }
        L_0x05f4:
            long r6 = r3.f15715e0     // Catch:{ all -> 0x08c8 }
            r2.mo19615k(r6)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C5310l.f15252m0     // Catch:{ all -> 0x08c8 }
            boolean r6 = r6.mo21643e(r7, r10)     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x0616
            com.google.android.gms.measurement.internal.c9 r6 = r27.mo21858l()     // Catch:{ all -> 0x08c8 }
            java.util.List r6 = r6.mo21220v()     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x0616
            r2.mo19596d(r6)     // Catch:{ all -> 0x08c8 }
        L_0x0616:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo21601o()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            android.util.Pair r6 = r6.mo21804a(r7)     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x0649
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x08c8 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x08c8 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08c8 }
            if (r7 != 0) goto L_0x0649
            boolean r7 = r3.f15708Z     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x06ab
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x08c8 }
            r2.mo19610h(r7)     // Catch:{ all -> 0x08c8 }
            java.lang.Object r7 = r6.second     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x06ab
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x08c8 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x08c8 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x08c8 }
            r2.mo19584a(r6)     // Catch:{ all -> 0x08c8 }
            goto L_0x06ab
        L_0x0649:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f r6 = r6.mo21584F()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            android.content.Context r7 = r7.mo21206e()     // Catch:{ all -> 0x08c8 }
            boolean r6 = r6.mo21325a(r7)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x06ab
            boolean r6 = r3.f15710a0     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x06ab
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            android.content.Context r6 = r6.mo21206e()     // Catch:{ all -> 0x08c8 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r7)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x068b
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r6 = r6.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r10 = r2.mo19630t()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r10)     // Catch:{ all -> 0x08c8 }
            r6.mo21550a(r7, r10)     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = "null"
            goto L_0x06a8
        L_0x068b:
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x06a8
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21536w()     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = "empty secure ID. appId"
            java.lang.String r11 = r2.mo19630t()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r11)     // Catch:{ all -> 0x08c8 }
            r7.mo21550a(r10, r11)     // Catch:{ all -> 0x08c8 }
        L_0x06a8:
            r2.mo19621m(r6)     // Catch:{ all -> 0x08c8 }
        L_0x06ab:
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f r6 = r6.mo21584F()     // Catch:{ all -> 0x08c8 }
            r6.mo21613o()     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$g$a r6 = r2.mo19594c(r6)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f r7 = r7.mo21584F()     // Catch:{ all -> 0x08c8 }
            r7.mo21613o()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$g$a r6 = r6.mo19589b(r7)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f r7 = r7.mo21584F()     // Catch:{ all -> 0x08c8 }
            long r10 = r7.mo21327t()     // Catch:{ all -> 0x08c8 }
            int r7 = (int) r10     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$g$a r6 = r6.mo19599e(r7)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f r7 = r7.mo21584F()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r7.mo21328u()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$g$a r6 = r6.mo19597d(r7)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15705W     // Catch:{ all -> 0x08c8 }
            r6.mo19613j(r10)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            boolean r6 = r6.mo21593f()     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x0707
            boolean r6 = com.google.android.gms.measurement.internal.C5386r9.m23410z()     // Catch:{ all -> 0x08c8 }
            if (r6 == 0) goto L_0x0707
            r2.mo19630t()     // Catch:{ all -> 0x08c8 }
            boolean r6 = android.text.TextUtils.isEmpty(r28)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x0707
            r6 = r28
            r2.mo19622n(r6)     // Catch:{ all -> 0x08c8 }
        L_0x0707:
            com.google.android.gms.measurement.internal.s9 r6 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.e5 r6 = r6.mo21694b(r7)     // Catch:{ all -> 0x08c8 }
            if (r6 != 0) goto L_0x077a
            com.google.android.gms.measurement.internal.e5 r6 = new com.google.android.gms.measurement.internal.e5     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.f9 r7 = r7.mo21607u()     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r7.mo21392w()     // Catch:{ all -> 0x08c8 }
            r6.mo21252a(r7)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15704V     // Catch:{ all -> 0x08c8 }
            r6.mo21267e(r7)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15711b     // Catch:{ all -> 0x08c8 }
            r6.mo21257b(r7)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo21601o()     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r7.mo21807b(r10)     // Catch:{ all -> 0x08c8 }
            r6.mo21265d(r7)     // Catch:{ all -> 0x08c8 }
            r6.mo21273g(r8)     // Catch:{ all -> 0x08c8 }
            r6.mo21250a(r8)     // Catch:{ all -> 0x08c8 }
            r6.mo21256b(r8)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15696N     // Catch:{ all -> 0x08c8 }
            r6.mo21270f(r7)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15703U     // Catch:{ all -> 0x08c8 }
            r6.mo21260c(r10)     // Catch:{ all -> 0x08c8 }
            java.lang.String r7 = r3.f15697O     // Catch:{ all -> 0x08c8 }
            r6.mo21274g(r7)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15698P     // Catch:{ all -> 0x08c8 }
            r6.mo21264d(r10)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15699Q     // Catch:{ all -> 0x08c8 }
            r6.mo21266e(r10)     // Catch:{ all -> 0x08c8 }
            boolean r7 = r3.f15701S     // Catch:{ all -> 0x08c8 }
            r6.mo21254a(r7)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15705W     // Catch:{ all -> 0x08c8 }
            r6.mo21293p(r10)     // Catch:{ all -> 0x08c8 }
            long r10 = r3.f15715e0     // Catch:{ all -> 0x08c8 }
            r6.mo21269f(r10)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r7 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r7.mo21685a(r6)     // Catch:{ all -> 0x08c8 }
        L_0x077a:
            java.lang.String r7 = r6.mo21280j()     // Catch:{ all -> 0x08c8 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08c8 }
            if (r7 != 0) goto L_0x078b
            java.lang.String r7 = r6.mo21280j()     // Catch:{ all -> 0x08c8 }
            r2.mo19612i(r7)     // Catch:{ all -> 0x08c8 }
        L_0x078b:
            java.lang.String r7 = r6.mo21288n()     // Catch:{ all -> 0x08c8 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x08c8 }
            if (r7 != 0) goto L_0x079c
            java.lang.String r6 = r6.mo21288n()     // Catch:{ all -> 0x08c8 }
            r2.mo19619l(r6)     // Catch:{ all -> 0x08c8 }
        L_0x079c:
            com.google.android.gms.measurement.internal.s9 r6 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            java.lang.String r3 = r3.f15709a     // Catch:{ all -> 0x08c8 }
            java.util.List r3 = r6.mo21680a(r3)     // Catch:{ all -> 0x08c8 }
            r6 = 0
        L_0x07a7:
            int r7 = r3.size()     // Catch:{ all -> 0x08c8 }
            if (r6 >= r7) goto L_0x07de
            com.google.android.gms.internal.measurement.t0$k$a r7 = com.google.android.gms.internal.measurement.C4966t0.C4988k.m21557w()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r10 = (com.google.android.gms.measurement.internal.C5265g9) r10     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r10.f15072c     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$k$a r7 = r7.mo19214a(r10)     // Catch:{ all -> 0x08c8 }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r10 = (com.google.android.gms.measurement.internal.C5265g9) r10     // Catch:{ all -> 0x08c8 }
            long r10 = r10.f15073d     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.internal.measurement.t0$k$a r7 = r7.mo19675a(r10)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.c9 r10 = r27.mo21858l()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r11 = r3.get(r6)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.g9 r11 = (com.google.android.gms.measurement.internal.C5265g9) r11     // Catch:{ all -> 0x08c8 }
            java.lang.Object r11 = r11.f15074e     // Catch:{ all -> 0x08c8 }
            r10.mo21198a(r7, r11)     // Catch:{ all -> 0x08c8 }
            r2.mo19581a(r7)     // Catch:{ all -> 0x08c8 }
            int r6 = r6 + 1
            goto L_0x07a7
        L_0x07de:
            com.google.android.gms.measurement.internal.s9 r3 = r27.mo21855i()     // Catch:{ IOException -> 0x0856 }
            com.google.android.gms.internal.measurement.r5 r6 = r2.mo19056B()     // Catch:{ IOException -> 0x0856 }
            com.google.android.gms.internal.measurement.i4 r6 = (com.google.android.gms.internal.measurement.C4801i4) r6     // Catch:{ IOException -> 0x0856 }
            com.google.android.gms.internal.measurement.t0$g r6 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r6     // Catch:{ IOException -> 0x0856 }
            long r2 = r3.mo21675a(r6)     // Catch:{ IOException -> 0x0856 }
            com.google.android.gms.measurement.internal.s9 r6 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.zzaf r7 = r4.f14966f     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x084c
            com.google.android.gms.measurement.internal.zzaf r7 = r4.f14966f     // Catch:{ all -> 0x08c8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x08c8 }
        L_0x07fc:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x08c8 }
            if (r10 == 0) goto L_0x0814
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x08c8 }
            r11 = r26
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x08c8 }
            if (r10 == 0) goto L_0x0811
            goto L_0x084d
        L_0x0811:
            r26 = r11
            goto L_0x07fc
        L_0x0814:
            com.google.android.gms.measurement.internal.j4 r7 = r27.mo21853f()     // Catch:{ all -> 0x08c8 }
            java.lang.String r10 = r4.f14961a     // Catch:{ all -> 0x08c8 }
            java.lang.String r11 = r4.f14962b     // Catch:{ all -> 0x08c8 }
            boolean r7 = r7.mo21510c(r10, r11)     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.s9 r10 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            long r11 = r27.m23794z()     // Catch:{ all -> 0x08c8 }
            java.lang.String r13 = r4.f14961a     // Catch:{ all -> 0x08c8 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.v9 r10 = r10.mo21678a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x08c8 }
            if (r7 == 0) goto L_0x084c
            long r10 = r10.f15540e     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r7 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.r9 r7 = r7.mo21600n()     // Catch:{ all -> 0x08c8 }
            java.lang.String r12 = r4.f14961a     // Catch:{ all -> 0x08c8 }
            int r7 = r7.mo21632a(r12)     // Catch:{ all -> 0x08c8 }
            long r12 = (long) r7     // Catch:{ all -> 0x08c8 }
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x084c
            goto L_0x084d
        L_0x084c:
            r5 = 0
        L_0x084d:
            boolean r2 = r6.mo21690a(r4, r2, r5)     // Catch:{ all -> 0x08c8 }
            if (r2 == 0) goto L_0x086f
            r1.f15644m = r8     // Catch:{ all -> 0x08c8 }
            goto L_0x086f
        L_0x0856:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ all -> 0x08c8 }
            java.lang.String r6 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo19630t()     // Catch:{ all -> 0x08c8 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r2)     // Catch:{ all -> 0x08c8 }
            r5.mo21551a(r6, r2, r3)     // Catch:{ all -> 0x08c8 }
        L_0x086f:
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()     // Catch:{ all -> 0x08c8 }
            r2.mo21708v()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()     // Catch:{ all -> 0x08c8 }
            r3 = 2
            boolean r2 = r2.mo21532a(r3)     // Catch:{ all -> 0x08c8 }
            if (r2 == 0) goto L_0x089c
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21528C()     // Catch:{ all -> 0x08c8 }
            java.lang.String r3 = "Event recorded"
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x08c8 }
            com.google.android.gms.measurement.internal.i3 r5 = r5.mo21608v()     // Catch:{ all -> 0x08c8 }
            java.lang.String r4 = r5.mo21427a(r4)     // Catch:{ all -> 0x08c8 }
            r2.mo21550a(r3, r4)     // Catch:{ all -> 0x08c8 }
        L_0x089c:
            com.google.android.gms.measurement.internal.s9 r2 = r27.mo21855i()
            r2.mo21668A()
            r27.m23767C()
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21528C()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo21550a(r4, r3)
            return
        L_0x08c8:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.s9 r3 = r27.mo21855i()
            r3.mo21668A()
            goto L_0x08d3
        L_0x08d2:
            throw r2
        L_0x08d3:
            goto L_0x08d2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.m23786b(com.google.android.gms.measurement.internal.zzak, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: a */
    public final void m23777a(C5232d9 d9Var) {
        this.f15640i.mo21203c().mo21209h();
        C5397s9 s9Var = new C5397s9(this);
        s9Var.mo21740t();
        this.f15634c = s9Var;
        this.f15640i.mo21600n().mo21634a((C5408t9) this.f15632a);
        C5320l9 l9Var = new C5320l9(this);
        l9Var.mo21740t();
        this.f15637f = l9Var;
        C5470z6 z6Var = new C5470z6(this);
        z6Var.mo21740t();
        this.f15639h = z6Var;
        C5418u8 u8Var = new C5418u8(this);
        u8Var.mo21740t();
        this.f15636e = u8Var;
        this.f15635d = new C5424v3(this);
        if (this.f15646o != this.f15647p) {
            this.f15640i.mo21205d().mo21533t().mo21551a("Not all upload components initialized", Integer.valueOf(this.f15646o), Integer.valueOf(this.f15647p));
        }
        this.f15641j = true;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21834a() {
        this.f15640i.mo21203c().mo21209h();
        mo21855i().mo21670D();
        if (this.f15640i.mo21601o().f15570e.mo21825a() == 0) {
            this.f15640i.mo21601o().f15570e.mo21826a(this.f15640i.mo21208g().mo18569a());
        }
        m23767C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21840a(zzm zzm) {
        m23793y();
        mo21861o();
        C4300a0.m18630b(zzm.f15709a);
        m23787e(zzm);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21838a(zzak zzak, String str) {
        zzak zzak2 = zzak;
        String str2 = str;
        C5239e5 b = mo21855i().mo21694b(str2);
        if (b == null || TextUtils.isEmpty(b.mo21294q())) {
            this.f15640i.mo21205d().mo21527A().mo21550a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m23783b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzak2.f15686a)) {
                this.f15640i.mo21205d().mo21536w().mo21550a("Could not find package. appId", C5303k3.m23051a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f15640i.mo21205d().mo21533t().mo21550a("App version does not match; dropping event. appId", C5303k3.m23051a(str));
            return;
        }
        zzm zzm = r2;
        C5239e5 e5Var = b;
        zzm zzm2 = new zzm(str, b.mo21282k(), b.mo21294q(), b.mo21295r(), b.mo21296s(), b.mo21297t(), b.mo21298u(), (String) null, b.mo21300w(), false, e5Var.mo21288n(), e5Var.mo21263d(), 0, 0, e5Var.mo21268e(), e5Var.mo21271f(), false, e5Var.mo21284l(), e5Var.mo21272g(), e5Var.mo21299v(), e5Var.mo21275h());
        mo21837a(zzak2, zzm);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21837a(zzak zzak, zzm zzm) {
        List<zzs> list;
        List<zzs> list2;
        List<zzs> list3;
        zzak zzak2 = zzak;
        zzm zzm2 = zzm;
        C4300a0.m18620a(zzm);
        C4300a0.m18630b(zzm2.f15709a);
        m23793y();
        mo21861o();
        String str = zzm2.f15709a;
        long j = zzak2.f15685O;
        if (mo21858l().mo21200a(zzak2, zzm2)) {
            if (!zzm2.f15701S) {
                m23787e(zzm2);
                return;
            }
            if (this.f15640i.mo21600n().mo21643e(str, C5310l.f15266t0)) {
                List<String> list4 = zzm2.f15716f0;
                if (list4 != null) {
                    if (list4.contains(zzak2.f15686a)) {
                        Bundle i = zzak2.f15687b.mo21880i();
                        i.putLong("ga_safelisted", 1);
                        zzak zzak3 = new zzak(zzak2.f15686a, new zzaf(i), zzak2.f15684N, zzak2.f15685O);
                        zzak2 = zzak3;
                    } else {
                        this.f15640i.mo21205d().mo21527A().mo21552a("Dropping non-safelisted event. appId, event name, origin", str, zzak2.f15686a, zzak2.f15684N);
                        return;
                    }
                }
            }
            mo21855i().mo21712z();
            try {
                C5397s9 i2 = mo21855i();
                C4300a0.m18630b(str);
                i2.mo21209h();
                i2.mo21739s();
                if (j < 0) {
                    i2.mo21205d().mo21536w().mo21551a("Invalid time querying timed out conditional properties", C5303k3.m23051a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = i2.mo21683a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzs zzs : list) {
                    if (zzs != null) {
                        this.f15640i.mo21205d().mo21527A().mo21552a("User property timed out", zzs.f15726a, this.f15640i.mo21608v().mo21431c(zzs.f15717N.f15695b), zzs.f15717N.mo21886a());
                        if (zzs.f15721R != null) {
                            m23786b(new zzak(zzs.f15721R, j), zzm2);
                        }
                        mo21855i().mo21701e(str, zzs.f15717N.f15695b);
                    }
                }
                C5397s9 i3 = mo21855i();
                C4300a0.m18630b(str);
                i3.mo21209h();
                i3.mo21739s();
                if (j < 0) {
                    i3.mo21205d().mo21536w().mo21551a("Invalid time querying expired conditional properties", C5303k3.m23051a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = i3.mo21683a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzs zzs2 : list2) {
                    if (zzs2 != null) {
                        this.f15640i.mo21205d().mo21527A().mo21552a("User property expired", zzs2.f15726a, this.f15640i.mo21608v().mo21431c(zzs2.f15717N.f15695b), zzs2.f15717N.mo21886a());
                        mo21855i().mo21696b(str, zzs2.f15717N.f15695b);
                        if (zzs2.f15725V != null) {
                            arrayList.add(zzs2.f15725V);
                        }
                        mo21855i().mo21701e(str, zzs2.f15717N.f15695b);
                    }
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    m23786b(new zzak((zzak) obj, j), zzm2);
                }
                C5397s9 i5 = mo21855i();
                String str2 = zzak2.f15686a;
                C4300a0.m18630b(str);
                C4300a0.m18630b(str2);
                i5.mo21209h();
                i5.mo21739s();
                if (j < 0) {
                    i5.mo21205d().mo21536w().mo21552a("Invalid time querying triggered conditional properties", C5303k3.m23051a(str), i5.mo21211j().mo21429a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = i5.mo21683a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzs zzs3 : list3) {
                    if (zzs3 != null) {
                        zzjx zzjx = zzs3.f15717N;
                        C5265g9 g9Var = r4;
                        C5265g9 g9Var2 = new C5265g9(zzs3.f15726a, zzs3.f15727b, zzjx.f15695b, j, zzjx.mo21886a());
                        if (mo21855i().mo21691a(g9Var)) {
                            this.f15640i.mo21205d().mo21527A().mo21552a("User property triggered", zzs3.f15726a, this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                        } else {
                            this.f15640i.mo21205d().mo21533t().mo21552a("Too many active user properties, ignoring", C5303k3.m23051a(zzs3.f15726a), this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                        }
                        if (zzs3.f15723T != null) {
                            arrayList2.add(zzs3.f15723T);
                        }
                        zzs3.f15717N = new zzjx(g9Var);
                        zzs3.f15719P = true;
                        mo21855i().mo21692a(zzs3);
                    }
                }
                m23786b(zzak2, zzm2);
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    m23786b(new zzak((zzak) obj2, j), zzm2);
                }
                mo21855i().mo21708v();
            } finally {
                mo21855i().mo21668A();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r2 = r0;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0cb6, code lost:
        if (r5 != r14) goto L_0x0cb8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (r0v16 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v161 android.database.Cursor) = (r3v156 android.database.Cursor), (r3v156 android.database.Cursor), (r3v156 android.database.Cursor), (r3v164 android.database.Cursor), (r3v164 android.database.Cursor), (r3v164 android.database.Cursor), (r3v164 android.database.Cursor), (r3v1 android.database.Cursor), (r3v1 android.database.Cursor) binds: [B:47:0x00da, B:53:0x00e7, B:54:?, B:24:0x007c, B:30:0x0089, B:32:0x008d, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0278 A[SYNTHETIC, Splitter:B:131:0x0278] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027f A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028d A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03c5 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03d0 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03d1 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x05b6 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0691 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x07a8 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x07c2 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0b14 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0b27 A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0b2a A[Catch:{ IOException -> 0x022e, all -> 0x0f38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0b51 A[SYNTHETIC, Splitter:B:440:0x0b51] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0c01 A[Catch:{ all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0c03 A[Catch:{ all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0c0b A[SYNTHETIC, Splitter:B:459:0x0c0b] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0c39 A[SYNTHETIC, Splitter:B:470:0x0c39] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0cd3 A[Catch:{ all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0d1b A[Catch:{ all -> 0x0d74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x0f20 A[SYNTHETIC, Splitter:B:578:0x0f20] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0f34 A[SYNTHETIC, Splitter:B:585:0x0f34] */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m23782a(java.lang.String r60, long r61) {
        /*
            r59 = this;
            r1 = r59
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()
            r2.mo21712z()
            com.google.android.gms.measurement.internal.y8$a r2 = new com.google.android.gms.measurement.internal.y8$a     // Catch:{ all -> 0x0f38 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.s9 r4 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            long r5 = r1.f15655x     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r2)     // Catch:{ all -> 0x0f38 }
            r4.mo21209h()     // Catch:{ all -> 0x0f38 }
            r4.mo21739s()     // Catch:{ all -> 0x0f38 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo21709w()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            if (r13 == 0) goto L_0x009c
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r61)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r2 = r0
            r8 = r3
            goto L_0x0f32
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0265
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r14 = java.lang.String.valueOf(r61)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            int r7 = r14.length()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            if (r7 != 0) goto L_0x0089
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x0089:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0099, all -> 0x0040 }
            r22 = r3
            r3 = r7
            r7 = r13
            goto L_0x00f2
        L_0x0099:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x009c:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00ac
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            goto L_0x00b1
        L_0x00ac:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
        L_0x00b1:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r7 = ""
        L_0x00ba:
            int r13 = r7.length()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            if (r7 != 0) goto L_0x00e7
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x00e7:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            r22 = r3
            r7 = r13
            r3 = 0
        L_0x00f2:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r23 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0247 }
            if (r9 != 0) goto L_0x0133
            com.google.android.gms.measurement.internal.k3 r5 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r5.mo21550a(r6, r7)     // Catch:{ SQLiteException -> 0x0247 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x0133:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.internal.measurement.t0$g$a r13 = com.google.android.gms.internal.measurement.C4966t0.C4979g.m21344r0()     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.measurement.q5 r9 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r13, r9)     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.measurement.t0$g$a r9 = (com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a) r9     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.measurement.r5 r9 = r9.mo19056B()     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4801i4) r9     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.measurement.t0$g r9 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r9     // Catch:{ IOException -> 0x022e }
            boolean r13 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0247 }
            if (r13 == 0) goto L_0x0160
            com.google.android.gms.measurement.internal.k3 r13 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.m3 r13 = r13.mo21536w()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r13.mo21550a(r14, r15)     // Catch:{ SQLiteException -> 0x0247 }
        L_0x0160:
            r8.close()     // Catch:{ SQLiteException -> 0x0247 }
            r2.mo21729a(r9)     // Catch:{ SQLiteException -> 0x0247 }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0180
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0247 }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x0247 }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0247 }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x0247 }
            r16 = r9
            r17 = r14
            goto L_0x018c
        L_0x0180:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0247 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0247 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0247 }
            r16 = r5
            r17 = r6
        L_0x018c:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x0247 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r23
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0247 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            if (r6 != 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21536w()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            r6.mo21550a(r7, r8)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x01ce:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.internal.measurement.t0$c$a r8 = com.google.android.gms.internal.measurement.C4966t0.C4971c.m21169w()     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.q5 r8 = com.google.android.gms.measurement.internal.C5221c9.m22539a(r8, r9)     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.t0$c$a r8 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r8     // Catch:{ IOException -> 0x0205 }
            java.lang.String r9 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.internal.measurement.t0$c$a r9 = r8.mo19214a(r9)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            r9.mo19487a(r13)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.internal.measurement.r5 r8 = r8.mo19056B()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.internal.measurement.i4 r8 = (com.google.android.gms.internal.measurement.C4801i4) r8     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.internal.measurement.t0$c r8 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r8     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            boolean r6 = r2.mo21730a(r6, r8)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            if (r6 != 0) goto L_0x0218
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x0205:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.k3 r7 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21533t()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            r7.mo21551a(r8, r9, r6)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
        L_0x0218:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0229, all -> 0x0224 }
            if (r6 != 0) goto L_0x01ce
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x0224:
            r0 = move-exception
            r2 = r0
            r8 = r5
            goto L_0x0f32
        L_0x0229:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x022e:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.k3 r6 = r4.mo21205d()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.m3 r6 = r6.mo21533t()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r7 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r6.mo21551a(r7, r9, r5)     // Catch:{ SQLiteException -> 0x0247 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0f38 }
            goto L_0x027b
        L_0x0247:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x024b:
            r0 = move-exception
            r2 = r0
            r8 = r22
            goto L_0x0f32
        L_0x0251:
            r0 = move-exception
            r7 = r3
            r8 = r22
            goto L_0x0048
        L_0x0257:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x025c:
            r0 = move-exception
            r2 = r0
            r8 = 0
            goto L_0x0f32
        L_0x0261:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0265:
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f30 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x0f30 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r7)     // Catch:{ all -> 0x0f30 }
            r4.mo21551a(r5, r6, r3)     // Catch:{ all -> 0x0f30 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0f38 }
        L_0x027b:
            java.util.List<com.google.android.gms.internal.measurement.t0$c> r3 = r2.f15658c     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x028a
            java.util.List<com.google.android.gms.internal.measurement.t0$c> r3 = r2.f15658c     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r3 = 0
            goto L_0x028b
        L_0x028a:
            r3 = 1
        L_0x028b:
            if (r3 != 0) goto L_0x0f20
            com.google.android.gms.internal.measurement.t0$g r3 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r3 = r3.mo19052i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4979g.C4980a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g$a r3 = r3.mo19620m()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r5 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = r5.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C5310l.f15242h0     // Catch:{ all -> 0x0f38 }
            boolean r4 = r4.mo21643e(r5, r6)     // Catch:{ all -> 0x0f38 }
            r5 = -1
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = -1
            r13 = 0
            r15 = 0
            r17 = 0
        L_0x02b5:
            java.util.List<com.google.android.gms.internal.measurement.t0$c> r7 = r2.f15658c     // Catch:{ all -> 0x0f38 }
            int r7 = r7.size()     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = "_e"
            java.lang.String r12 = "_et"
            r23 = r13
            if (r8 >= r7) goto L_0x081d
            java.util.List<com.google.android.gms.internal.measurement.t0$c> r7 = r2.f15658c     // Catch:{ all -> 0x0f38 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r7 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r7     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r7 = r7.mo19052i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c$a r7 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r7     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.j4 r13 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r14 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r14 = r14.mo19561o0()     // Catch:{ all -> 0x0f38 }
            r21 = r9
            java.lang.String r9 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r13.mo21508b(r14, r9)     // Catch:{ all -> 0x0f38 }
            java.lang.String r13 = "_err"
            if (r9 == 0) goto L_0x036a
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r9 = r9.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.t0$g r12 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r12.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r12)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r14 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.i3 r14 = r14.mo21608v()     // Catch:{ all -> 0x0f38 }
            r22 = r15
            java.lang.String r15 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            java.lang.String r14 = r14.mo21429a(r15)     // Catch:{ all -> 0x0f38 }
            r9.mo21551a(r10, r12, r14)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.j4 r9 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r10 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = r10.mo19561o0()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r9.mo21515g(r10)     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x0335
            com.google.android.gms.measurement.internal.j4 r9 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r10 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = r10.mo19561o0()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r9.mo21516h(r10)     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r9 = 0
            goto L_0x0336
        L_0x0335:
            r9 = 1
        L_0x0336:
            if (r9 != 0) goto L_0x035b
            java.lang.String r9 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x035b
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.f9 r25 = r9.mo21607u()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r9 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r26 = r9.mo19561o0()     // Catch:{ all -> 0x0f38 }
            r27 = 11
            java.lang.String r28 = "_ev"
            java.lang.String r29 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            r30 = 0
            r25.mo21376a(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0f38 }
        L_0x035b:
            r28 = r4
            r10 = r8
            r9 = r21
            r15 = r22
            r13 = r23
            r4 = -1
            r8 = r3
            r3 = r11
            r11 = 3
            goto L_0x0812
        L_0x036a:
            r22 = r15
            com.google.android.gms.measurement.internal.j4 r9 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r14 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r14 = r14.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.String r15 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r9.mo21510c(r14, r15)     // Catch:{ all -> 0x0f38 }
            java.lang.String r14 = "_c"
            if (r9 != 0) goto L_0x03da
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            java.lang.String r15 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.common.internal.C4300a0.m18630b(r15)     // Catch:{ all -> 0x0f38 }
            r27 = r8
            int r8 = r15.hashCode()     // Catch:{ all -> 0x0f38 }
            r28 = r4
            r4 = 94660(0x171c4, float:1.32647E-40)
            if (r8 == r4) goto L_0x03b8
            r4 = 95025(0x17331, float:1.33158E-40)
            if (r8 == r4) goto L_0x03ae
            r4 = 95027(0x17333, float:1.33161E-40)
            if (r8 == r4) goto L_0x03a4
            goto L_0x03c2
        L_0x03a4:
            java.lang.String r4 = "_ui"
            boolean r4 = r15.equals(r4)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x03c2
            r4 = 1
            goto L_0x03c3
        L_0x03ae:
            java.lang.String r4 = "_ug"
            boolean r4 = r15.equals(r4)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x03c2
            r4 = 2
            goto L_0x03c3
        L_0x03b8:
            java.lang.String r4 = "_in"
            boolean r4 = r15.equals(r4)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x03c2
            r4 = 0
            goto L_0x03c3
        L_0x03c2:
            r4 = -1
        L_0x03c3:
            if (r4 == 0) goto L_0x03cd
            r8 = 1
            if (r4 == r8) goto L_0x03cd
            r8 = 2
            if (r4 == r8) goto L_0x03cd
            r4 = 0
            goto L_0x03ce
        L_0x03cd:
            r4 = 1
        L_0x03ce:
            if (r4 == 0) goto L_0x03d1
            goto L_0x03de
        L_0x03d1:
            r8 = r3
            r30 = r6
            r29 = r11
            r31 = r12
            goto L_0x05b4
        L_0x03da:
            r28 = r4
            r27 = r8
        L_0x03de:
            r29 = r11
            r4 = 0
            r8 = 0
            r15 = 0
        L_0x03e3:
            int r11 = r7.mo19494l()     // Catch:{ all -> 0x0f38 }
            r30 = r6
            java.lang.String r6 = "_r"
            if (r4 >= r11) goto L_0x044d
            com.google.android.gms.internal.measurement.t0$e r11 = r7.mo19490a(r4)     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0f38 }
            if (r11 == 0) goto L_0x041a
            com.google.android.gms.internal.measurement.t0$e r6 = r7.mo19490a(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r6 = r6.mo19052i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r6 = (com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a) r6     // Catch:{ all -> 0x0f38 }
            r31 = r12
            r11 = 1
            com.google.android.gms.internal.measurement.t0$e$a r6 = r6.mo19509a(r11)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r6 = r6.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r6 = (com.google.android.gms.internal.measurement.C4801i4) r6     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r6 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r6     // Catch:{ all -> 0x0f38 }
            r7.mo19486a(r4, r6)     // Catch:{ all -> 0x0f38 }
            r8 = 1
            goto L_0x0446
        L_0x041a:
            r31 = r12
            com.google.android.gms.internal.measurement.t0$e r11 = r7.mo19490a(r4)     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0f38 }
            if (r6 == 0) goto L_0x0446
            com.google.android.gms.internal.measurement.t0$e r6 = r7.mo19490a(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r6 = r6.mo19052i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r6 = (com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a) r6     // Catch:{ all -> 0x0f38 }
            r11 = 1
            com.google.android.gms.internal.measurement.t0$e$a r6 = r6.mo19509a(r11)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r6 = r6.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r6 = (com.google.android.gms.internal.measurement.C4801i4) r6     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r6 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r6     // Catch:{ all -> 0x0f38 }
            r7.mo19486a(r4, r6)     // Catch:{ all -> 0x0f38 }
            r15 = 1
        L_0x0446:
            int r4 = r4 + 1
            r6 = r30
            r12 = r31
            goto L_0x03e3
        L_0x044d:
            r31 = r12
            if (r8 != 0) goto L_0x0481
            if (r9 == 0) goto L_0x0481
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()     // Catch:{ all -> 0x0f38 }
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.i3 r11 = r11.mo21608v()     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo21429a(r12)     // Catch:{ all -> 0x0f38 }
            r4.mo21550a(r8, r11)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r4 = com.google.android.gms.internal.measurement.C4966t0.C4975e.m21218u()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r4 = r4.mo19214a(r14)     // Catch:{ all -> 0x0f38 }
            r11 = 1
            com.google.android.gms.internal.measurement.t0$e$a r4 = r4.mo19509a(r11)     // Catch:{ all -> 0x0f38 }
            r7.mo19488a(r4)     // Catch:{ all -> 0x0f38 }
        L_0x0481:
            if (r15 != 0) goto L_0x04b1
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()     // Catch:{ all -> 0x0f38 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.p4 r11 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.i3 r11 = r11.mo21608v()     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo21429a(r12)     // Catch:{ all -> 0x0f38 }
            r4.mo21550a(r8, r11)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r4 = com.google.android.gms.internal.measurement.C4966t0.C4975e.m21218u()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r4 = r4.mo19214a(r6)     // Catch:{ all -> 0x0f38 }
            r11 = 1
            com.google.android.gms.internal.measurement.t0$e$a r4 = r4.mo19509a(r11)     // Catch:{ all -> 0x0f38 }
            r7.mo19488a(r4)     // Catch:{ all -> 0x0f38 }
        L_0x04b1:
            com.google.android.gms.measurement.internal.s9 r32 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            long r33 = r59.m23794z()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r4 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r35 = r4.mo19561o0()     // Catch:{ all -> 0x0f38 }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            com.google.android.gms.measurement.internal.v9 r4 = r32.mo21678a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f38 }
            long r11 = r4.f15540e     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r4 = r4.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r8 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r8 = r8.mo19561o0()     // Catch:{ all -> 0x0f38 }
            int r4 = r4.mo21632a(r8)     // Catch:{ all -> 0x0f38 }
            r8 = r3
            long r3 = (long) r4     // Catch:{ all -> 0x0f38 }
            int r15 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x04e9
            m23774a(r7, r6)     // Catch:{ all -> 0x0f38 }
            goto L_0x04eb
        L_0x04e9:
            r21 = 1
        L_0x04eb:
            java.lang.String r3 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r3 = com.google.android.gms.measurement.internal.C5254f9.m22843f(r3)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x05b4
            if (r9 == 0) goto L_0x05b4
            com.google.android.gms.measurement.internal.s9 r32 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            long r33 = r59.m23794z()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r3 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r35 = r3.mo19561o0()     // Catch:{ all -> 0x0f38 }
            r36 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            com.google.android.gms.measurement.internal.v9 r3 = r32.mo21678a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f38 }
            long r3 = r3.f15538c     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r6 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r6 = r6.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C5310l.f15267u     // Catch:{ all -> 0x0f38 }
            int r6 = r6.mo21636b(r11, r12)     // Catch:{ all -> 0x0f38 }
            long r11 = (long) r6     // Catch:{ all -> 0x0f38 }
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x05b4
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r6)     // Catch:{ all -> 0x0f38 }
            r3.mo21550a(r4, r6)     // Catch:{ all -> 0x0f38 }
            r3 = 0
            r4 = 0
            r6 = 0
            r11 = -1
        L_0x0549:
            int r12 = r7.mo19494l()     // Catch:{ all -> 0x0f38 }
            if (r3 >= r12) goto L_0x0573
            com.google.android.gms.internal.measurement.t0$e r12 = r7.mo19490a(r3)     // Catch:{ all -> 0x0f38 }
            java.lang.String r15 = r12.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r15 = r14.equals(r15)     // Catch:{ all -> 0x0f38 }
            if (r15 == 0) goto L_0x0565
            com.google.android.gms.internal.measurement.i4$a r6 = r12.mo19052i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r6 = (com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a) r6     // Catch:{ all -> 0x0f38 }
            r11 = r3
            goto L_0x0570
        L_0x0565:
            java.lang.String r12 = r12.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x0f38 }
            if (r12 == 0) goto L_0x0570
            r4 = 1
        L_0x0570:
            int r3 = r3 + 1
            goto L_0x0549
        L_0x0573:
            if (r4 == 0) goto L_0x057b
            if (r6 == 0) goto L_0x057b
            r7.mo19492b(r11)     // Catch:{ all -> 0x0f38 }
            goto L_0x05b4
        L_0x057b:
            if (r6 == 0) goto L_0x059b
            java.lang.Object r3 = r6.clone()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r3 = (com.google.android.gms.internal.measurement.C4801i4.C4802a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4975e.C4976a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e$a r3 = r3.mo19214a(r13)     // Catch:{ all -> 0x0f38 }
            r12 = 10
            com.google.android.gms.internal.measurement.t0$e$a r3 = r3.mo19509a(r12)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r3.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r3 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r3     // Catch:{ all -> 0x0f38 }
            r7.mo19486a(r11, r3)     // Catch:{ all -> 0x0f38 }
            goto L_0x05b4
        L_0x059b:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21533t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r6)     // Catch:{ all -> 0x0f38 }
            r3.mo21550a(r4, r6)     // Catch:{ all -> 0x0f38 }
        L_0x05b4:
            if (r9 == 0) goto L_0x067b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0f38 }
            java.util.List r4 = r7.mo19491a()     // Catch:{ all -> 0x0f38 }
            r3.<init>(r4)     // Catch:{ all -> 0x0f38 }
            r4 = 0
            r6 = -1
            r9 = -1
        L_0x05c2:
            int r11 = r3.size()     // Catch:{ all -> 0x0f38 }
            if (r4 >= r11) goto L_0x05f2
            java.lang.String r11 = "value"
            java.lang.Object r12 = r3.get(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r12 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r12     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r12.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0f38 }
            if (r11 == 0) goto L_0x05dc
            r6 = r4
            goto L_0x05ef
        L_0x05dc:
            java.lang.String r11 = "currency"
            java.lang.Object r12 = r3.get(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r12 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r12     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r12.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0f38 }
            if (r11 == 0) goto L_0x05ef
            r9 = r4
        L_0x05ef:
            int r4 = r4 + 1
            goto L_0x05c2
        L_0x05f2:
            r4 = -1
            if (r6 == r4) goto L_0x067c
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r4 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r4     // Catch:{ all -> 0x0f38 }
            boolean r4 = r4.mo19503q()     // Catch:{ all -> 0x0f38 }
            if (r4 != 0) goto L_0x062a
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r4 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r4     // Catch:{ all -> 0x0f38 }
            boolean r4 = r4.mo19505s()     // Catch:{ all -> 0x0f38 }
            if (r4 != 0) goto L_0x062a
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21538y()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r3.mo21549a(r4)     // Catch:{ all -> 0x0f38 }
            r7.mo19492b(r6)     // Catch:{ all -> 0x0f38 }
            m23774a(r7, r14)     // Catch:{ all -> 0x0f38 }
            r3 = 18
            java.lang.String r4 = "value"
            m23773a(r7, r3, r4)     // Catch:{ all -> 0x0f38 }
            goto L_0x067b
        L_0x062a:
            r4 = -1
            if (r9 != r4) goto L_0x0630
            r3 = 1
            r11 = 3
            goto L_0x065c
        L_0x0630:
            java.lang.Object r3 = r3.get(r9)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r3 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r3     // Catch:{ all -> 0x0f38 }
            java.lang.String r3 = r3.mo19502p()     // Catch:{ all -> 0x0f38 }
            int r9 = r3.length()     // Catch:{ all -> 0x0f38 }
            r11 = 3
            if (r9 == r11) goto L_0x0643
        L_0x0641:
            r3 = 1
            goto L_0x065c
        L_0x0643:
            r9 = 0
        L_0x0644:
            int r12 = r3.length()     // Catch:{ all -> 0x0f38 }
            if (r9 >= r12) goto L_0x065b
            int r12 = r3.codePointAt(r9)     // Catch:{ all -> 0x0f38 }
            boolean r13 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0f38 }
            if (r13 != 0) goto L_0x0655
            goto L_0x0641
        L_0x0655:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0f38 }
            int r9 = r9 + r12
            goto L_0x0644
        L_0x065b:
            r3 = 0
        L_0x065c:
            if (r3 == 0) goto L_0x067d
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21538y()     // Catch:{ all -> 0x0f38 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r3.mo21549a(r9)     // Catch:{ all -> 0x0f38 }
            r7.mo19492b(r6)     // Catch:{ all -> 0x0f38 }
            m23774a(r7, r14)     // Catch:{ all -> 0x0f38 }
            r3 = 19
            java.lang.String r6 = "currency"
            m23773a(r7, r3, r6)     // Catch:{ all -> 0x0f38 }
            goto L_0x067d
        L_0x067b:
            r4 = -1
        L_0x067c:
            r11 = 3
        L_0x067d:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C5310l.f15240g0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r6, r9)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0792
            java.lang.String r3 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x06e6
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r3     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = "_fr"
            com.google.android.gms.internal.measurement.t0$e r3 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r3, r6)     // Catch:{ all -> 0x0f38 }
            if (r3 != 0) goto L_0x0792
            if (r17 == 0) goto L_0x06de
            long r12 = r17.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r14 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f38 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x06de
            java.lang.Object r3 = r17.clone()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r3 = (com.google.android.gms.internal.measurement.C4801i4.C4802a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r3     // Catch:{ all -> 0x0f38 }
            boolean r6 = r1.m23781a(r7, r3)     // Catch:{ all -> 0x0f38 }
            if (r6 == 0) goto L_0x06de
            r8.mo19576a(r5, r3)     // Catch:{ all -> 0x0f38 }
            r9 = r29
            r6 = r31
        L_0x06d8:
            r17 = 0
        L_0x06da:
            r30 = 0
            goto L_0x0796
        L_0x06de:
            r30 = r7
            r9 = r22
        L_0x06e2:
            r6 = r31
            goto L_0x0796
        L_0x06e6:
            java.lang.String r3 = "_vs"
            java.lang.String r6 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0738
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r3     // Catch:{ all -> 0x0f38 }
            r6 = r31
            com.google.android.gms.internal.measurement.t0$e r3 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r3, r6)     // Catch:{ all -> 0x0f38 }
            if (r3 != 0) goto L_0x0735
            if (r30 == 0) goto L_0x072e
            long r12 = r30.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r14 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f38 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x072e
            java.lang.Object r3 = r30.clone()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r3 = (com.google.android.gms.internal.measurement.C4801i4.C4802a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r3     // Catch:{ all -> 0x0f38 }
            boolean r9 = r1.m23781a(r3, r7)     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x072e
            r9 = r29
            r8.mo19576a(r9, r3)     // Catch:{ all -> 0x0f38 }
            goto L_0x06d8
        L_0x072e:
            r9 = r29
            r17 = r7
            r5 = r22
            goto L_0x0796
        L_0x0735:
            r9 = r29
            goto L_0x0796
        L_0x0738:
            r9 = r29
            r6 = r31
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r12 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r12.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C5310l.f15211N0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r12, r13)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0796
            java.lang.String r3 = "_ab"
            java.lang.String r12 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.equals(r12)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0796
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r3 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r3, r6)     // Catch:{ all -> 0x0f38 }
            if (r3 != 0) goto L_0x0796
            if (r30 == 0) goto L_0x0796
            long r12 = r30.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r14 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f38 }
            r14 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x0796
            java.lang.Object r3 = r30.clone()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4$a r3 = (com.google.android.gms.internal.measurement.C4801i4.C4802a) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c$a r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r3     // Catch:{ all -> 0x0f38 }
            r1.m23784b(r3, r7)     // Catch:{ all -> 0x0f38 }
            r8.mo19576a(r9, r3)     // Catch:{ all -> 0x0f38 }
            goto L_0x06da
        L_0x0792:
            r9 = r29
            goto L_0x06e2
        L_0x0796:
            if (r28 != 0) goto L_0x07f6
            java.lang.String r3 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x07f6
            int r3 = r7.mo19494l()     // Catch:{ all -> 0x0f38 }
            if (r3 != 0) goto L_0x07c2
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.t0$g r10 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = r10.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r10)     // Catch:{ all -> 0x0f38 }
            r3.mo21550a(r6, r10)     // Catch:{ all -> 0x0f38 }
            goto L_0x07f6
        L_0x07c2:
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r3 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r3     // Catch:{ all -> 0x0f38 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r3, r6)     // Catch:{ all -> 0x0f38 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0f38 }
            if (r3 != 0) goto L_0x07ef
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r3 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.t0$g r10 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = r10.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r10)     // Catch:{ all -> 0x0f38 }
            r3.mo21550a(r6, r10)     // Catch:{ all -> 0x0f38 }
            goto L_0x07f6
        L_0x07ef:
            long r12 = r3.longValue()     // Catch:{ all -> 0x0f38 }
            long r12 = r23 + r12
            goto L_0x07f8
        L_0x07f6:
            r12 = r23
        L_0x07f8:
            java.util.List<com.google.android.gms.internal.measurement.t0$c> r3 = r2.f15658c     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r6 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r6 = (com.google.android.gms.internal.measurement.C4801i4) r6     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r6 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r6     // Catch:{ all -> 0x0f38 }
            r10 = r27
            r3.set(r10, r6)     // Catch:{ all -> 0x0f38 }
            int r15 = r22 + 1
            r8.mo19579a(r7)     // Catch:{ all -> 0x0f38 }
            r3 = r9
            r13 = r12
            r9 = r21
            r6 = r30
        L_0x0812:
            int r7 = r10 + 1
            r11 = r3
            r3 = r8
            r4 = r28
            r10 = 2
            r12 = 1
            r8 = r7
            goto L_0x02b5
        L_0x081d:
            r8 = r3
            r28 = r4
            r21 = r9
            r6 = r12
            r22 = r15
            if (r28 == 0) goto L_0x087c
            r4 = r22
            r13 = r23
            r3 = 0
        L_0x082c:
            if (r3 >= r4) goto L_0x087e
            com.google.android.gms.internal.measurement.t0$c r5 = r8.mo19586b(r3)     // Catch:{ all -> 0x0f38 }
            java.lang.String r7 = r5.mo19478p()     // Catch:{ all -> 0x0f38 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0f38 }
            if (r7 == 0) goto L_0x084f
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            java.lang.String r7 = "_fr"
            com.google.android.gms.internal.measurement.t0$e r7 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r5, r7)     // Catch:{ all -> 0x0f38 }
            if (r7 == 0) goto L_0x084f
            r8.mo19591c(r3)     // Catch:{ all -> 0x0f38 }
            int r4 = r4 + -1
            int r3 = r3 + -1
            goto L_0x0879
        L_0x084f:
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r5 = com.google.android.gms.measurement.internal.C5221c9.m22540a(r5, r6)     // Catch:{ all -> 0x0f38 }
            if (r5 == 0) goto L_0x0879
            boolean r7 = r5.mo19503q()     // Catch:{ all -> 0x0f38 }
            if (r7 == 0) goto L_0x0867
            long r11 = r5.mo19504r()     // Catch:{ all -> 0x0f38 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f38 }
            goto L_0x0868
        L_0x0867:
            r5 = 0
        L_0x0868:
            if (r5 == 0) goto L_0x0879
            long r11 = r5.longValue()     // Catch:{ all -> 0x0f38 }
            r17 = 0
            int r7 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x0879
            long r11 = r5.longValue()     // Catch:{ all -> 0x0f38 }
            long r13 = r13 + r11
        L_0x0879:
            r5 = 1
            int r3 = r3 + r5
            goto L_0x082c
        L_0x087c:
            r13 = r23
        L_0x087e:
            r3 = 0
            r1.m23776a(r8, r13, r3)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15272w0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r4, r5)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x08cb
            java.util.List r3 = r8.mo19585a()     // Catch:{ all -> 0x0f38 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0f38 }
        L_0x089c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x08b6
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r4 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r4     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "_s"
            java.lang.String r4 = r4.mo19478p()     // Catch:{ all -> 0x0f38 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x089c
            r3 = 1
            goto L_0x08b7
        L_0x08b6:
            r3 = 0
        L_0x08b7:
            if (r3 == 0) goto L_0x08c6
            com.google.android.gms.measurement.internal.s9 r3 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "_se"
            r3.mo21696b(r4, r5)     // Catch:{ all -> 0x0f38 }
        L_0x08c6:
            r3 = 1
            r1.m23776a(r8, r13, r3)     // Catch:{ all -> 0x0f38 }
            goto L_0x08ea
        L_0x08cb:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15274x0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r4, r5)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x08ea
            com.google.android.gms.measurement.internal.s9 r3 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "_se"
            r3.mo21696b(r4, r5)     // Catch:{ all -> 0x0f38 }
        L_0x08ea:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15244i0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r4, r5)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x098f
            com.google.android.gms.measurement.internal.c9 r3 = r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r4 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21528C()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "Checking account type status for ad personalization signals"
            r4.mo21549a(r5)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.j4 r4 = r3.mo21218q()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            boolean r4 = r4.mo21513e(r5)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x098f
            com.google.android.gms.measurement.internal.s9 r4 = r3.mo21217p()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.e5 r4 = r4.mo21694b(r5)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x098f
            boolean r4 = r4.mo21268e()     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x098f
            com.google.android.gms.measurement.internal.f r4 = r3.mo21210i()     // Catch:{ all -> 0x0f38 }
            boolean r4 = r4.mo21331x()     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x098f
            com.google.android.gms.measurement.internal.k3 r4 = r3.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21527A()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r4.mo21549a(r5)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$k$a r4 = com.google.android.gms.internal.measurement.C4966t0.C4988k.m21557w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "_npa"
            com.google.android.gms.internal.measurement.t0$k$a r4 = r4.mo19214a(r5)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.f r3 = r3.mo21210i()     // Catch:{ all -> 0x0f38 }
            long r5 = r3.mo21329v()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$k$a r3 = r4.mo19675a(r5)     // Catch:{ all -> 0x0f38 }
            r4 = 1
            com.google.android.gms.internal.measurement.t0$k$a r3 = r3.mo19676b(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r3 = r3.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r3 = (com.google.android.gms.internal.measurement.C4801i4) r3     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$k r3 = (com.google.android.gms.internal.measurement.C4966t0.C4988k) r3     // Catch:{ all -> 0x0f38 }
            r4 = 0
        L_0x096b:
            int r5 = r8.mo19624o()     // Catch:{ all -> 0x0f38 }
            if (r4 >= r5) goto L_0x0989
            java.lang.String r5 = "_npa"
            com.google.android.gms.internal.measurement.t0$k r6 = r8.mo19598d(r4)     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19666p()     // Catch:{ all -> 0x0f38 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0f38 }
            if (r5 == 0) goto L_0x0986
            r8.mo19577a(r4, r3)     // Catch:{ all -> 0x0f38 }
            r4 = 1
            goto L_0x098a
        L_0x0986:
            int r4 = r4 + 1
            goto L_0x096b
        L_0x0989:
            r4 = 0
        L_0x098a:
            if (r4 != 0) goto L_0x098f
            r8.mo19582a(r3)     // Catch:{ all -> 0x0f38 }
        L_0x098f:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C5310l.f15201I0     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21643e(r4, r5)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x09a4
            m23775a(r8)     // Catch:{ all -> 0x0f38 }
        L_0x09a4:
            com.google.android.gms.internal.measurement.t0$g$a r3 = r8.mo19633w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            java.util.List r5 = r8.mo19623n()     // Catch:{ all -> 0x0f38 }
            java.util.List r6 = r8.mo19585a()     // Catch:{ all -> 0x0f38 }
            long r9 = r8.mo19626p()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.common.internal.C4300a0.m18630b(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.l9 r7 = r59.mo21856j()     // Catch:{ all -> 0x0f38 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0f38 }
            java.util.List r4 = r7.mo21548a(r4, r6, r5, r9)     // Catch:{ all -> 0x0f38 }
            r3.mo19593c(r4)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r3 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r3 = r3.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r4 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r4.mo19561o0()     // Catch:{ all -> 0x0f38 }
            boolean r3 = r3.mo21642e(r4)     // Catch:{ all -> 0x0f38 }
            if (r3 == 0) goto L_0x0d79
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0d74 }
            r3.<init>()     // Catch:{ all -> 0x0d74 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0d74 }
            r4.<init>()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.f9 r5 = r5.mo21607u()     // Catch:{ all -> 0x0d74 }
            java.security.SecureRandom r5 = r5.mo21390u()     // Catch:{ all -> 0x0d74 }
            r6 = 0
        L_0x09f1:
            int r7 = r8.mo19617l()     // Catch:{ all -> 0x0d74 }
            if (r6 >= r7) goto L_0x0d3f
            com.google.android.gms.internal.measurement.t0$c r7 = r8.mo19586b(r6)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.i4$a r7 = r7.mo19052i()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.t0$c$a r7 = (com.google.android.gms.internal.measurement.C4966t0.C4971c.C4972a) r7     // Catch:{ all -> 0x0d74 }
            java.lang.String r9 = r7.mo19495m()     // Catch:{ all -> 0x0d74 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d74 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0a84
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r9 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4801i4) r9     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r9 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r9     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r9, r11)     // Catch:{ all -> 0x0f38 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f38 }
            java.lang.Object r11 = r3.get(r9)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.g r11 = (com.google.android.gms.measurement.internal.C5255g) r11     // Catch:{ all -> 0x0f38 }
            if (r11 != 0) goto L_0x0a3b
            com.google.android.gms.measurement.internal.s9 r11 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r12 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r12.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.g r11 = r11.mo21677a(r12, r9)     // Catch:{ all -> 0x0f38 }
            r3.put(r9, r11)     // Catch:{ all -> 0x0f38 }
        L_0x0a3b:
            java.lang.Long r9 = r11.f15049i     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x0a78
            java.lang.Long r9 = r11.f15050j     // Catch:{ all -> 0x0f38 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0f38 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0a53
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            java.lang.Long r9 = r11.f15050j     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.C5221c9.m22543a(r7, r10, r9)     // Catch:{ all -> 0x0f38 }
        L_0x0a53:
            java.lang.Boolean r9 = r11.f15051k     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0a6d
            java.lang.Boolean r9 = r11.f15051k     // Catch:{ all -> 0x0f38 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0a6d
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.C5221c9.m22543a(r7, r9, r12)     // Catch:{ all -> 0x0f38 }
        L_0x0a6d:
            com.google.android.gms.internal.measurement.r5 r9 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4801i4) r9     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r9 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r9     // Catch:{ all -> 0x0f38 }
            r4.add(r9)     // Catch:{ all -> 0x0f38 }
        L_0x0a78:
            r8.mo19576a(r6, r7)     // Catch:{ all -> 0x0f38 }
        L_0x0a7b:
            r18 = r2
            r60 = r5
            r1 = r6
            r5 = 1
            goto L_0x0d34
        L_0x0a84:
            com.google.android.gms.measurement.internal.j4 r9 = r59.mo21853f()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0d74 }
            java.lang.String r11 = r11.mo19561o0()     // Catch:{ all -> 0x0d74 }
            long r11 = r9.mo21514f(r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0d74 }
            r9.mo21607u()     // Catch:{ all -> 0x0d74 }
            long r13 = r7.mo19497o()     // Catch:{ all -> 0x0d74 }
            long r13 = com.google.android.gms.measurement.internal.C5254f9.m22823a(r13, r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.r5 r9 = r7.mo19056B()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4801i4) r9     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.t0$c r9 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r9     // Catch:{ all -> 0x0d74 }
            java.lang.String r15 = "_dbg"
            r23 = r11
            r17 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d74 }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0d74 }
            if (r12 != 0) goto L_0x0b11
            if (r11 != 0) goto L_0x0aba
            goto L_0x0b11
        L_0x0aba:
            java.util.List r9 = r9.mo19475a()     // Catch:{ all -> 0x0f38 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f38 }
        L_0x0ac2:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0f38 }
            if (r12 == 0) goto L_0x0b11
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$e r12 = (com.google.android.gms.internal.measurement.C4966t0.C4975e) r12     // Catch:{ all -> 0x0f38 }
            r60 = r9
            java.lang.String r9 = r12.mo19500a()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0b0e
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0aec
            long r17 = r12.mo19504r()     // Catch:{ all -> 0x0f38 }
            java.lang.Long r9 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0f38 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x0b0c
        L_0x0aec:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0afa
            java.lang.String r9 = r12.mo19502p()     // Catch:{ all -> 0x0f38 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x0b0c
        L_0x0afa:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0b11
            double r17 = r12.mo19506t()     // Catch:{ all -> 0x0f38 }
            java.lang.Double r9 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0f38 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0b11
        L_0x0b0c:
            r9 = 1
            goto L_0x0b12
        L_0x0b0e:
            r9 = r60
            goto L_0x0ac2
        L_0x0b11:
            r9 = 0
        L_0x0b12:
            if (r9 != 0) goto L_0x0b27
            com.google.android.gms.measurement.internal.j4 r9 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.String r12 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            int r12 = r9.mo21511d(r11, r12)     // Catch:{ all -> 0x0f38 }
            goto L_0x0b28
        L_0x0b27:
            r12 = 1
        L_0x0b28:
            if (r12 > 0) goto L_0x0b51
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r9 = r9.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0f38 }
            r9.mo21551a(r10, r11, r12)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r9 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r9 = (com.google.android.gms.internal.measurement.C4801i4) r9     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r9 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r9     // Catch:{ all -> 0x0f38 }
            r4.add(r9)     // Catch:{ all -> 0x0f38 }
            r8.mo19576a(r6, r7)     // Catch:{ all -> 0x0f38 }
            goto L_0x0a7b
        L_0x0b51:
            java.lang.String r9 = r7.mo19495m()     // Catch:{ all -> 0x0d74 }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.g r9 = (com.google.android.gms.measurement.internal.C5255g) r9     // Catch:{ all -> 0x0d74 }
            if (r9 != 0) goto L_0x0bea
            com.google.android.gms.measurement.internal.s9 r9 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.String r15 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.g r9 = r9.mo21677a(r11, r15)     // Catch:{ all -> 0x0f38 }
            if (r9 != 0) goto L_0x0bea
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r9 = r9.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.t0$g r15 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r15 = r15.mo19561o0()     // Catch:{ all -> 0x0f38 }
            r17 = r13
            java.lang.String r13 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            r9.mo21551a(r11, r15, r13)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.p4 r9 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r9 = r9.mo21600n()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r11 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C5310l.f15270v0     // Catch:{ all -> 0x0f38 }
            boolean r9 = r9.mo21643e(r11, r13)     // Catch:{ all -> 0x0f38 }
            if (r9 == 0) goto L_0x0bc6
            com.google.android.gms.measurement.internal.g r9 = new com.google.android.gms.measurement.internal.g     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r28 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.String r29 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            r30 = 1
            r32 = 1
            r34 = 1
            long r36 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r27 = r9
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r40, r41, r42, r43)     // Catch:{ all -> 0x0f38 }
            goto L_0x0bec
        L_0x0bc6:
            com.google.android.gms.measurement.internal.g r9 = new com.google.android.gms.measurement.internal.g     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r11 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r45 = r11.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.String r46 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            r47 = 1
            r49 = 1
            long r51 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r44 = r9
            r44.<init>(r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x0f38 }
            goto L_0x0bec
        L_0x0bea:
            r17 = r13
        L_0x0bec:
            r59.mo21858l()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.r5 r11 = r7.mo19056B()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.i4 r11 = (com.google.android.gms.internal.measurement.C4801i4) r11     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.t0$c r11 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r11     // Catch:{ all -> 0x0d74 }
            java.lang.String r13 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C5221c9.m22551b(r11, r13)     // Catch:{ all -> 0x0d74 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d74 }
            if (r11 == 0) goto L_0x0c03
            r13 = 1
            goto L_0x0c04
        L_0x0c03:
            r13 = 0
        L_0x0c04:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0d74 }
            r14 = 1
            if (r12 != r14) goto L_0x0c39
            com.google.android.gms.internal.measurement.r5 r10 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r10 = (com.google.android.gms.internal.measurement.C4801i4) r10     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r10 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r10     // Catch:{ all -> 0x0f38 }
            r4.add(r10)     // Catch:{ all -> 0x0f38 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0f38 }
            if (r10 == 0) goto L_0x0c34
            java.lang.Long r10 = r9.f15049i     // Catch:{ all -> 0x0f38 }
            if (r10 != 0) goto L_0x0c28
            java.lang.Long r10 = r9.f15050j     // Catch:{ all -> 0x0f38 }
            if (r10 != 0) goto L_0x0c28
            java.lang.Boolean r10 = r9.f15051k     // Catch:{ all -> 0x0f38 }
            if (r10 == 0) goto L_0x0c34
        L_0x0c28:
            r10 = 0
            com.google.android.gms.measurement.internal.g r9 = r9.mo21395a(r10, r10, r10)     // Catch:{ all -> 0x0f38 }
            java.lang.String r10 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            r3.put(r10, r9)     // Catch:{ all -> 0x0f38 }
        L_0x0c34:
            r8.mo19576a(r6, r7)     // Catch:{ all -> 0x0f38 }
            goto L_0x0a7b
        L_0x0c39:
            int r14 = r5.nextInt(r12)     // Catch:{ all -> 0x0d74 }
            if (r14 != 0) goto L_0x0c7e
            r59.mo21858l()     // Catch:{ all -> 0x0f38 }
            long r11 = (long) r12     // Catch:{ all -> 0x0f38 }
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.C5221c9.m22543a(r7, r10, r14)     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r10 = r7.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r10 = (com.google.android.gms.internal.measurement.C4801i4) r10     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$c r10 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r10     // Catch:{ all -> 0x0f38 }
            r4.add(r10)     // Catch:{ all -> 0x0f38 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0f38 }
            if (r10 == 0) goto L_0x0c64
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f38 }
            r11 = 0
            com.google.android.gms.measurement.internal.g r9 = r9.mo21395a(r11, r10, r11)     // Catch:{ all -> 0x0f38 }
        L_0x0c64:
            java.lang.String r10 = r7.mo19495m()     // Catch:{ all -> 0x0f38 }
            long r11 = r7.mo19497o()     // Catch:{ all -> 0x0f38 }
            r14 = r17
            com.google.android.gms.measurement.internal.g r9 = r9.mo21394a(r11, r14)     // Catch:{ all -> 0x0f38 }
            r3.put(r10, r9)     // Catch:{ all -> 0x0f38 }
            r18 = r2
            r60 = r5
            r1 = r6
            r5 = 1
            goto L_0x0d31
        L_0x0c7e:
            r60 = r5
            r14 = r17
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.r9 r5 = r5.mo21600n()     // Catch:{ all -> 0x0d74 }
            r17 = r6
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0d74 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0d74 }
            boolean r5 = r5.mo21649k(r6)     // Catch:{ all -> 0x0d74 }
            if (r5 == 0) goto L_0x0cbc
            java.lang.Long r5 = r9.f15048h     // Catch:{ all -> 0x0d74 }
            if (r5 == 0) goto L_0x0ca3
            java.lang.Long r5 = r9.f15048h     // Catch:{ all -> 0x0f38 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0f38 }
            r18 = r2
            goto L_0x0cb4
        L_0x0ca3:
            com.google.android.gms.measurement.internal.p4 r5 = r1.f15640i     // Catch:{ all -> 0x0d74 }
            r5.mo21607u()     // Catch:{ all -> 0x0d74 }
            long r5 = r7.mo19498p()     // Catch:{ all -> 0x0d74 }
            r18 = r2
            r1 = r23
            long r5 = com.google.android.gms.measurement.internal.C5254f9.m22823a(r5, r1)     // Catch:{ all -> 0x0d74 }
        L_0x0cb4:
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0cba
        L_0x0cb8:
            r1 = 1
            goto L_0x0cd1
        L_0x0cba:
            r1 = 0
            goto L_0x0cd1
        L_0x0cbc:
            r18 = r2
            long r1 = r9.f15047g     // Catch:{ all -> 0x0d74 }
            long r5 = r7.mo19497o()     // Catch:{ all -> 0x0d74 }
            long r5 = r5 - r1
            long r1 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0d74 }
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r22 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r22 < 0) goto L_0x0cba
            goto L_0x0cb8
        L_0x0cd1:
            if (r1 == 0) goto L_0x0d1b
            r59.mo21858l()     // Catch:{ all -> 0x0d74 }
            java.lang.String r1 = "_efs"
            r5 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.C5221c9.m22543a(r7, r1, r2)     // Catch:{ all -> 0x0d74 }
            r59.mo21858l()     // Catch:{ all -> 0x0d74 }
            long r1 = (long) r12     // Catch:{ all -> 0x0d74 }
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.C5221c9.m22543a(r7, r10, r11)     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.r5 r10 = r7.mo19056B()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.i4 r10 = (com.google.android.gms.internal.measurement.C4801i4) r10     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.internal.measurement.t0$c r10 = (com.google.android.gms.internal.measurement.C4966t0.C4971c) r10     // Catch:{ all -> 0x0d74 }
            r4.add(r10)     // Catch:{ all -> 0x0d74 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r10 == 0) goto L_0x0d0b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d74 }
            r2 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0d74 }
            r2 = 0
            com.google.android.gms.measurement.internal.g r9 = r9.mo21395a(r2, r1, r10)     // Catch:{ all -> 0x0d74 }
        L_0x0d0b:
            java.lang.String r1 = r7.mo19495m()     // Catch:{ all -> 0x0d74 }
            long r10 = r7.mo19497o()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.g r2 = r9.mo21394a(r10, r14)     // Catch:{ all -> 0x0d74 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0d74 }
            goto L_0x0d2f
        L_0x0d1b:
            r5 = 1
            boolean r1 = r13.booleanValue()     // Catch:{ all -> 0x0d74 }
            if (r1 == 0) goto L_0x0d2f
            java.lang.String r1 = r7.mo19495m()     // Catch:{ all -> 0x0d74 }
            r2 = 0
            com.google.android.gms.measurement.internal.g r9 = r9.mo21395a(r11, r2, r2)     // Catch:{ all -> 0x0d74 }
            r3.put(r1, r9)     // Catch:{ all -> 0x0d74 }
        L_0x0d2f:
            r1 = r17
        L_0x0d31:
            r8.mo19576a(r1, r7)     // Catch:{ all -> 0x0d74 }
        L_0x0d34:
            int r1 = r1 + 1
            r5 = r60
            r6 = r1
            r2 = r18
            r1 = r59
            goto L_0x09f1
        L_0x0d3f:
            r18 = r2
            int r1 = r4.size()     // Catch:{ all -> 0x0d74 }
            int r2 = r8.mo19617l()     // Catch:{ all -> 0x0d74 }
            if (r1 >= r2) goto L_0x0d52
            com.google.android.gms.internal.measurement.t0$g$a r1 = r8.mo19620m()     // Catch:{ all -> 0x0d74 }
            r1.mo19583a(r4)     // Catch:{ all -> 0x0d74 }
        L_0x0d52:
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0d74 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0d74 }
        L_0x0d5a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0d74 }
            if (r2 == 0) goto L_0x0d7b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0d74 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.s9 r3 = r59.mo21855i()     // Catch:{ all -> 0x0d74 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0d74 }
            com.google.android.gms.measurement.internal.g r2 = (com.google.android.gms.measurement.internal.C5255g) r2     // Catch:{ all -> 0x0d74 }
            r3.mo21686a(r2)     // Catch:{ all -> 0x0d74 }
            goto L_0x0d5a
        L_0x0d74:
            r0 = move-exception
            r1 = r59
            goto L_0x0f39
        L_0x0d79:
            r18 = r2
        L_0x0d7b:
            r1 = r59
            com.google.android.gms.measurement.internal.p4 r2 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.r9 r2 = r2.mo21600n()     // Catch:{ all -> 0x0f38 }
            java.lang.String r3 = r8.mo19630t()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.d3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C5310l.f15201I0     // Catch:{ all -> 0x0f38 }
            boolean r2 = r2.mo21643e(r3, r4)     // Catch:{ all -> 0x0f38 }
            if (r2 != 0) goto L_0x0d92
            m23775a(r8)     // Catch:{ all -> 0x0f38 }
        L_0x0d92:
            r2 = r18
            com.google.android.gms.internal.measurement.t0$g r3 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r3 = r3.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.s9 r4 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.e5 r4 = r4.mo21694b(r3)     // Catch:{ all -> 0x0f38 }
            if (r4 != 0) goto L_0x0dbe
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r6)     // Catch:{ all -> 0x0f38 }
            r4.mo21550a(r5, r6)     // Catch:{ all -> 0x0f38 }
            goto L_0x0e19
        L_0x0dbe:
            int r5 = r8.mo19617l()     // Catch:{ all -> 0x0f38 }
            if (r5 <= 0) goto L_0x0e19
            long r5 = r4.mo21292p()     // Catch:{ all -> 0x0f38 }
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0dd2
            r8.mo19600e(r5)     // Catch:{ all -> 0x0f38 }
            goto L_0x0dd5
        L_0x0dd2:
            r8.mo19629s()     // Catch:{ all -> 0x0f38 }
        L_0x0dd5:
            long r9 = r4.mo21290o()     // Catch:{ all -> 0x0f38 }
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0de0
            goto L_0x0de1
        L_0x0de0:
            r5 = r9
        L_0x0de1:
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0de9
            r8.mo19595d(r5)     // Catch:{ all -> 0x0f38 }
            goto L_0x0dec
        L_0x0de9:
            r8.mo19628r()     // Catch:{ all -> 0x0f38 }
        L_0x0dec:
            r4.mo21242A()     // Catch:{ all -> 0x0f38 }
            long r5 = r4.mo21301x()     // Catch:{ all -> 0x0f38 }
            int r6 = (int) r5     // Catch:{ all -> 0x0f38 }
            r8.mo19602f(r6)     // Catch:{ all -> 0x0f38 }
            long r5 = r8.mo19626p()     // Catch:{ all -> 0x0f38 }
            r4.mo21250a(r5)     // Catch:{ all -> 0x0f38 }
            long r5 = r8.mo19627q()     // Catch:{ all -> 0x0f38 }
            r4.mo21256b(r5)     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = r4.mo21259c()     // Catch:{ all -> 0x0f38 }
            if (r5 == 0) goto L_0x0e0f
            r8.mo19614j(r5)     // Catch:{ all -> 0x0f38 }
            goto L_0x0e12
        L_0x0e0f:
            r8.mo19631u()     // Catch:{ all -> 0x0f38 }
        L_0x0e12:
            com.google.android.gms.measurement.internal.s9 r5 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            r5.mo21685a(r4)     // Catch:{ all -> 0x0f38 }
        L_0x0e19:
            int r4 = r8.mo19617l()     // Catch:{ all -> 0x0f38 }
            if (r4 <= 0) goto L_0x0e7f
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            r4.mo21189B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.j4 r4 = r59.mo21853f()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r5 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = r5.mo19561o0()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.q0$b r4 = r4.mo21504a(r5)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x0e43
            boolean r5 = r4.mo19377a()     // Catch:{ all -> 0x0f38 }
            if (r5 != 0) goto L_0x0e3b
            goto L_0x0e43
        L_0x0e3b:
            long r4 = r4.mo19379o()     // Catch:{ all -> 0x0f38 }
            r8.mo19611i(r4)     // Catch:{ all -> 0x0f38 }
            goto L_0x0e6e
        L_0x0e43:
            com.google.android.gms.internal.measurement.t0$g r4 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r4 = r4.mo19519C()     // Catch:{ all -> 0x0f38 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f38 }
            if (r4 == 0) goto L_0x0e55
            r4 = -1
            r8.mo19611i(r4)     // Catch:{ all -> 0x0f38 }
            goto L_0x0e6e
        L_0x0e55:
            com.google.android.gms.measurement.internal.p4 r4 = r1.f15640i     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21536w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.t0$g r6 = r2.f15656a     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = r6.mo19561o0()     // Catch:{ all -> 0x0f38 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r6)     // Catch:{ all -> 0x0f38 }
            r4.mo21550a(r5, r6)     // Catch:{ all -> 0x0f38 }
        L_0x0e6e:
            com.google.android.gms.measurement.internal.s9 r4 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.r5 r5 = r8.mo19056B()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.i4 r5 = (com.google.android.gms.internal.measurement.C4801i4) r5     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.internal.measurement.t0$g r5 = (com.google.android.gms.internal.measurement.C4966t0.C4979g) r5     // Catch:{ all -> 0x0f38 }
            r9 = r21
            r4.mo21689a(r5, r9)     // Catch:{ all -> 0x0f38 }
        L_0x0e7f:
            com.google.android.gms.measurement.internal.s9 r4 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            java.util.List<java.lang.Long> r2 = r2.f15657b     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.common.internal.C4300a0.m18620a(r2)     // Catch:{ all -> 0x0f38 }
            r4.mo21209h()     // Catch:{ all -> 0x0f38 }
            r4.mo21739s()     // Catch:{ all -> 0x0f38 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f38 }
            r6 = 0
        L_0x0e96:
            int r7 = r2.size()     // Catch:{ all -> 0x0f38 }
            if (r6 >= r7) goto L_0x0eb3
            if (r6 == 0) goto L_0x0ea3
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f38 }
        L_0x0ea3:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f38 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f38 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f38 }
            r5.append(r7)     // Catch:{ all -> 0x0f38 }
            int r6 = r6 + 1
            goto L_0x0e96
        L_0x0eb3:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f38 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo21709w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f38 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f38 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f38 }
            if (r5 == r6) goto L_0x0ee6
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f38 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f38 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f38 }
            r4.mo21551a(r6, r5, r2)     // Catch:{ all -> 0x0f38 }
        L_0x0ee6:
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo21709w()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0efd }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0efd }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0efd }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0efd }
            goto L_0x0f10
        L_0x0efd:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()     // Catch:{ all -> 0x0f38 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r3)     // Catch:{ all -> 0x0f38 }
            r2.mo21551a(r5, r3, r4)     // Catch:{ all -> 0x0f38 }
        L_0x0f10:
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            r2.mo21708v()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()
            r2.mo21668A()
            r2 = 1
            return r2
        L_0x0f20:
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()     // Catch:{ all -> 0x0f38 }
            r2.mo21708v()     // Catch:{ all -> 0x0f38 }
            com.google.android.gms.measurement.internal.s9 r2 = r59.mo21855i()
            r2.mo21668A()
            r2 = 0
            return r2
        L_0x0f30:
            r0 = move-exception
            r2 = r0
        L_0x0f32:
            if (r8 == 0) goto L_0x0f37
            r8.close()     // Catch:{ all -> 0x0f38 }
        L_0x0f37:
            throw r2     // Catch:{ all -> 0x0f38 }
        L_0x0f38:
            r0 = move-exception
        L_0x0f39:
            r2 = r0
            com.google.android.gms.measurement.internal.s9 r3 = r59.mo21855i()
            r3.mo21668A()
            goto L_0x0f43
        L_0x0f42:
            throw r2
        L_0x0f43:
            goto L_0x0f42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.m23782a(java.lang.String, long):boolean");
    }

    /* renamed from: b */
    private final void m23784b(C4972a aVar, C4972a aVar2) {
        C4300a0.m18627a("_e".equals(aVar.mo19495m()));
        mo21858l();
        String str = "_et";
        C4975e a = C5221c9.m22540a((C4971c) aVar.mo19056B(), str);
        if (a.mo19503q() && a.mo19504r() > 0) {
            long r = a.mo19504r();
            mo21858l();
            C4975e a2 = C5221c9.m22540a((C4971c) aVar2.mo19056B(), str);
            if (a2 != null && a2.mo19504r() > 0) {
                r += a2.mo19504r();
            }
            mo21858l();
            C5221c9.m22543a(aVar2, str, (Object) Long.valueOf(r));
            mo21858l();
            C5221c9.m22543a(aVar, "_fr", (Object) Long.valueOf(1));
        }
    }

    @C0226w0
    /* renamed from: b */
    private final Boolean m23783b(C5239e5 e5Var) {
        try {
            if (e5Var.mo21295r() != -2147483648L) {
                if (e5Var.mo21295r() == ((long) C4439c.m19110a(this.f15640i.mo21206e()).mo18451b(e5Var.mo21278i(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C4439c.m19110a(this.f15640i.mo21206e()).mo18451b(e5Var.mo21278i(), 0).versionName;
                if (e5Var.mo21294q() != null && e5Var.mo21294q().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    @C4476d0
    /* renamed from: b */
    public final void mo21848b(zzm zzm) {
        String str = "app_id=?";
        if (this.f15653v != null) {
            this.f15654w = new ArrayList();
            this.f15654w.addAll(this.f15653v);
        }
        C5397s9 i = mo21855i();
        String str2 = zzm.f15709a;
        C4300a0.m18630b(str2);
        i.mo21209h();
        i.mo21739s();
        try {
            SQLiteDatabase w = i.mo21709w();
            String[] strArr = {str2};
            int delete = w.delete("apps", str, strArr) + 0 + w.delete("events", str, strArr) + w.delete("user_attributes", str, strArr) + w.delete("conditional_properties", str, strArr) + w.delete("raw_events", str, strArr) + w.delete("raw_events_metadata", str, strArr) + w.delete("queue", str, strArr) + w.delete("audience_filter_values", str, strArr) + w.delete("main_event_params", str, strArr);
            if (delete > 0) {
                i.mo21205d().mo21528C().mo21551a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            i.mo21205d().mo21533t().mo21551a("Error resetting analytics data. appId, error", C5303k3.m23051a(str2), e);
        }
        C4793h9.m20273b();
        if (!this.f15640i.mo21600n().mo21635a(C5310l.f15213O0)) {
            zzm a = m23771a(this.f15640i.mo21206e(), zzm.f15709a, zzm.f15711b, zzm.f15701S, zzm.f15708Z, zzm.f15710a0, zzm.f15706X, zzm.f15713c0);
            if (zzm.f15701S) {
                mo21851c(a);
            }
        } else if (zzm.f15701S) {
            mo21851c(zzm);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final void mo21847b(zzjx zzjx, zzm zzm) {
        m23793y();
        mo21861o();
        if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
            return;
        }
        if (!zzm.f15701S) {
            m23787e(zzm);
            return;
        }
        String str = "User property removed";
        String str2 = "Removing user property";
        if (this.f15640i.mo21600n().mo21643e(zzm.f15709a, C5310l.f15244i0)) {
            if (!"_npa".equals(zzjx.f15695b) || zzm.f15714d0 == null) {
                this.f15640i.mo21205d().mo21527A().mo21550a(str2, this.f15640i.mo21608v().mo21431c(zzjx.f15695b));
                mo21855i().mo21712z();
                try {
                    m23787e(zzm);
                    mo21855i().mo21696b(zzm.f15709a, zzjx.f15695b);
                    mo21855i().mo21708v();
                    this.f15640i.mo21205d().mo21527A().mo21550a(str, this.f15640i.mo21608v().mo21431c(zzjx.f15695b));
                } finally {
                    mo21855i().mo21668A();
                }
            } else {
                this.f15640i.mo21205d().mo21527A().mo21549a("Falling back to manifest metadata value for ad personalization");
                zzjx zzjx2 = new zzjx("_npa", this.f15640i.mo21208g().mo18569a(), Long.valueOf(zzm.f15714d0.booleanValue() ? 1 : 0), "auto");
                mo21839a(zzjx2, zzm);
            }
        } else {
            this.f15640i.mo21205d().mo21527A().mo21550a(str2, this.f15640i.mo21608v().mo21431c(zzjx.f15695b));
            mo21855i().mo21712z();
            try {
                m23787e(zzm);
                mo21855i().mo21696b(zzm.f15709a, zzjx.f15695b);
                mo21855i().mo21708v();
                this.f15640i.mo21205d().mo21527A().mo21550a(str, this.f15640i.mo21608v().mo21431c(zzjx.f15695b));
            } finally {
                mo21855i().mo21668A();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final void mo21849b(zzs zzs) {
        zzm a = m23772a(zzs.f15726a);
        if (a != null) {
            mo21850b(zzs, a);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final void mo21850b(zzs zzs, zzm zzm) {
        C4300a0.m18620a(zzs);
        C4300a0.m18630b(zzs.f15726a);
        C4300a0.m18620a(zzs.f15717N);
        C4300a0.m18630b(zzs.f15717N.f15695b);
        m23793y();
        mo21861o();
        if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
            return;
        }
        if (!zzm.f15701S) {
            m23787e(zzm);
            return;
        }
        mo21855i().mo21712z();
        try {
            m23787e(zzm);
            zzs d = mo21855i().mo21699d(zzs.f15726a, zzs.f15717N.f15695b);
            if (d != null) {
                this.f15640i.mo21205d().mo21527A().mo21551a("Removing conditional user property", zzs.f15726a, this.f15640i.mo21608v().mo21431c(zzs.f15717N.f15695b));
                mo21855i().mo21701e(zzs.f15726a, zzs.f15717N.f15695b);
                if (d.f15719P) {
                    mo21855i().mo21696b(zzs.f15726a, zzs.f15717N.f15695b);
                }
                if (zzs.f15725V != null) {
                    Bundle bundle = null;
                    if (zzs.f15725V.f15687b != null) {
                        bundle = zzs.f15725V.f15687b.mo21880i();
                    }
                    Bundle bundle2 = bundle;
                    m23786b(this.f15640i.mo21607u().mo21363a(zzs.f15726a, zzs.f15725V.f15686a, bundle2, d.f15727b, zzs.f15725V.f15685O, true, false), zzm);
                }
            } else {
                this.f15640i.mo21205d().mo21536w().mo21551a("Conditional user property doesn't exist", C5303k3.m23051a(zzs.f15726a), this.f15640i.mo21608v().mo21431c(zzs.f15717N.f15695b));
            }
            mo21855i().mo21708v();
        } finally {
            mo21855i().mo21668A();
        }
    }

    /* renamed from: a */
    private static void m23775a(C4980a aVar) {
        aVar.mo19587b(Long.MAX_VALUE).mo19592c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.mo19617l(); i++) {
            C4971c b = aVar.mo19586b(i);
            if (b.mo19480r() < aVar.mo19626p()) {
                aVar.mo19587b(b.mo19480r());
            }
            if (b.mo19480r() > aVar.mo19627q()) {
                aVar.mo19592c(b.mo19480r());
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    private final void m23776a(C4980a aVar, long j, boolean z) {
        C5265g9 g9Var;
        String str = z ? "_se" : "_lte";
        C5265g9 c = mo21855i().mo21698c(aVar.mo19630t(), str);
        if (c == null || c.f15074e == null) {
            g9Var = new C5265g9(aVar.mo19630t(), "auto", str, this.f15640i.mo21208g().mo18569a(), Long.valueOf(j));
        } else {
            g9Var = new C5265g9(aVar.mo19630t(), "auto", str, this.f15640i.mo21208g().mo18569a(), Long.valueOf(((Long) c.f15074e).longValue() + j));
        }
        C4988k kVar = (C4988k) C4988k.m21557w().mo19214a(str).mo19675a(this.f15640i.mo21208g().mo18569a()).mo19676b(((Long) g9Var.f15074e).longValue()).mo19056B();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= aVar.mo19624o()) {
                break;
            } else if (str.equals(aVar.mo19598d(i).mo19666p())) {
                aVar.mo19577a(i, kVar);
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (!z2) {
            aVar.mo19582a(kVar);
        }
        if (j > 0) {
            mo21855i().mo21691a(g9Var);
            this.f15640i.mo21205d().mo21527A().mo21551a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", g9Var.f15074e);
        }
    }

    /* renamed from: a */
    private final boolean m23781a(C4972a aVar, C4972a aVar2) {
        Object obj;
        C4300a0.m18627a("_e".equals(aVar.mo19495m()));
        mo21858l();
        C4975e a = C5221c9.m22540a((C4971c) aVar.mo19056B(), "_sc");
        String str = null;
        if (a == null) {
            obj = null;
        } else {
            obj = a.mo19502p();
        }
        mo21858l();
        C4975e a2 = C5221c9.m22540a((C4971c) aVar2.mo19056B(), "_pc");
        if (a2 != null) {
            str = a2.mo19502p();
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        m23784b(aVar, aVar2);
        return true;
    }

    @C4476d0
    /* renamed from: a */
    private static void m23774a(C4972a aVar, @C0193h0 String str) {
        List a = aVar.mo19491a();
        for (int i = 0; i < a.size(); i++) {
            if (str.equals(((C4975e) a.get(i)).mo19500a())) {
                aVar.mo19492b(i);
                return;
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    private static void m23773a(C4972a aVar, int i, String str) {
        List a = aVar.mo19491a();
        int i2 = 0;
        while (true) {
            String str2 = "_err";
            if (i2 >= a.size()) {
                C4975e eVar = (C4975e) C4975e.m21218u().mo19214a("_ev").mo19510b(str).mo19056B();
                aVar.mo19489a((C4975e) C4975e.m21218u().mo19214a(str2).mo19509a(Long.valueOf((long) i).longValue()).mo19056B()).mo19489a(eVar);
                return;
            } else if (!str2.equals(((C4975e) a.get(i2)).mo19500a())) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    @C0226w0
    @C4476d0
    /* renamed from: a */
    public final void mo21835a(int i, Throwable th, byte[] bArr, String str) {
        C5397s9 i2;
        m23793y();
        mo21861o();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f15649r = false;
                m23788t();
                throw th2;
            }
        }
        List<Long> list = this.f15653v;
        this.f15653v = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f15640i.mo21601o().f15570e.mo21826a(this.f15640i.mo21208g().mo18569a());
                this.f15640i.mo21601o().f15571f.mo21826a(0);
                m23767C();
                this.f15640i.mo21205d().mo21528C().mo21551a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo21855i().mo21712z();
                try {
                    for (Long l : list) {
                        try {
                            i2 = mo21855i();
                            long longValue = l.longValue();
                            i2.mo21209h();
                            i2.mo21739s();
                            if (i2.mo21709w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            i2.mo21205d().mo21533t().mo21550a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f15654w == null || !this.f15654w.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo21855i().mo21708v();
                    mo21855i().mo21668A();
                    this.f15654w = null;
                    if (!mo21854h().mo21576v() || !m23766A()) {
                        this.f15655x = -1;
                        m23767C();
                    } else {
                        mo21862p();
                    }
                    this.f15644m = 0;
                } catch (Throwable th3) {
                    mo21855i().mo21668A();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f15640i.mo21205d().mo21533t().mo21550a("Database error while trying to delete uploaded bundles", e3);
                this.f15644m = this.f15640i.mo21208g().mo18572d();
                this.f15640i.mo21205d().mo21528C().mo21550a("Disable upload, time", Long.valueOf(this.f15644m));
            }
        } else {
            this.f15640i.mo21205d().mo21528C().mo21551a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f15640i.mo21601o().f15571f.mo21826a(this.f15640i.mo21208g().mo18569a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f15640i.mo21601o().f15572g.mo21826a(this.f15640i.mo21208g().mo18569a());
            }
            mo21855i().mo21688a(list);
            m23767C();
        }
        this.f15649r = false;
        m23788t();
    }

    @C0226w0
    /* renamed from: a */
    private final void m23778a(C5239e5 e5Var) {
        m23793y();
        if (!TextUtils.isEmpty(e5Var.mo21282k()) || !TextUtils.isEmpty(e5Var.mo21284l())) {
            C5386r9 n = this.f15640i.mo21600n();
            Builder builder = new Builder();
            String k = e5Var.mo21282k();
            if (TextUtils.isEmpty(k)) {
                k = e5Var.mo21284l();
            }
            C0635a aVar = null;
            Builder encodedAuthority = builder.scheme((String) C5310l.f15249l.mo21225a(null)).encodedAuthority((String) C5310l.f15251m.mo21225a(null));
            String str = "config/app/";
            String valueOf = String.valueOf(k);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", e5Var.mo21280j()).appendQueryParameter(C2876e.f10125d0, "android").appendQueryParameter("gmp_version", String.valueOf(n.mo21652n()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f15640i.mo21205d().mo21528C().mo21550a("Fetching remote configuration", e5Var.mo21278i());
                C4924b a = mo21853f().mo21504a(e5Var.mo21278i());
                String b = mo21853f().mo21507b(e5Var.mo21278i());
                if (a != null && !TextUtils.isEmpty(b)) {
                    aVar = new C0635a();
                    aVar.put(C6610c.f18447v, b);
                }
                C0635a aVar2 = aVar;
                this.f15648q = true;
                C5347o3 h = mo21854h();
                String i = e5Var.mo21278i();
                C5472z8 z8Var = new C5472z8(this);
                h.mo21209h();
                h.mo21739s();
                C4300a0.m18620a(url);
                C4300a0.m18620a(z8Var);
                C5326m4 c = h.mo21203c();
                C5391s3 s3Var = new C5391s3(h, i, url, null, aVar2, z8Var);
                c.mo21557b((Runnable) s3Var);
            } catch (MalformedURLException unused) {
                this.f15640i.mo21205d().mo21533t().mo21551a("Failed to parse config URL. Not fetching. appId", C5303k3.m23051a(e5Var.mo21278i()), uri);
            }
        } else {
            mo21844a(e5Var.mo21278i(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    @androidx.annotation.C0226w0
    @com.google.android.gms.common.util.C4476d0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21844a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m23793y()
            r6.mo21861o()
            com.google.android.gms.common.internal.C4300a0.m18630b(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.p4 r1 = r6.f15640i     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.k3 r1 = r1.mo21205d()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.m3 r1 = r1.mo21528C()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.mo21550a(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.s9 r1 = r6.mo21855i()     // Catch:{ all -> 0x0196 }
            r1.mo21712z()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.s9 r1 = r6.mo21855i()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.e5 r1 = r1.mo21694b(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.p4 r8 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo21205d()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21536w()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r7)     // Catch:{ all -> 0x018d }
            r8.mo21550a(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.p4 r10 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.g r10 = r10.mo21208g()     // Catch:{ all -> 0x018d }
            long r10 = r10.mo18569a()     // Catch:{ all -> 0x018d }
            r1.mo21279i(r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.s9 r10 = r6.mo21855i()     // Catch:{ all -> 0x018d }
            r10.mo21685a(r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r10 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r10 = r10.mo21205d()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo21528C()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.mo21551a(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.j4 r9 = r6.mo21853f()     // Catch:{ all -> 0x018d }
            r9.mo21509c(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r7 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo21601o()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f15571f     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r9 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.g r9 = r9.mo21208g()     // Catch:{ all -> 0x018d }
            long r9 = r9.mo18569a()     // Catch:{ all -> 0x018d }
            r7.mo21826a(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.p4 r7 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.x3 r7 = r7.mo21601o()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.y3 r7 = r7.f15572g     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.p4 r8 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.g r8 = r8.mo21208g()     // Catch:{ all -> 0x018d }
            long r8 = r8.mo18569a()     // Catch:{ all -> 0x018d }
            r7.mo21826a(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.m23767C()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.j4 r9 = r6.mo21853f()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.mo21506a(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.s9 r7 = r6.mo21855i()     // Catch:{ all -> 0x0196 }
            r7.mo21668A()     // Catch:{ all -> 0x0196 }
            r6.f15648q = r0
            r6.m23788t()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.j4 r11 = r6.mo21853f()     // Catch:{ all -> 0x018d }
            com.google.android.gms.internal.measurement.q0$b r11 = r11.mo21504a(r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.j4 r11 = r6.mo21853f()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.mo21506a(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.s9 r7 = r6.mo21855i()     // Catch:{ all -> 0x0196 }
            r7.mo21668A()     // Catch:{ all -> 0x0196 }
            r6.f15648q = r0
            r6.m23788t()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.p4 r9 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.g r9 = r9.mo21208g()     // Catch:{ all -> 0x018d }
            long r2 = r9.mo18569a()     // Catch:{ all -> 0x018d }
            r1.mo21276h(r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.s9 r9 = r6.mo21855i()     // Catch:{ all -> 0x018d }
            r9.mo21685a(r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.p4 r8 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r8 = r8.mo21205d()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo21538y()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo21550a(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.p4 r7 = r6.f15640i     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.k3 r7 = r7.mo21205d()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo21528C()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.mo21551a(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.o3 r7 = r6.mo21854h()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.mo21576v()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.m23766A()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.mo21862p()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.m23767C()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.s9 r7 = r6.mo21855i()     // Catch:{ all -> 0x018d }
            r7.mo21708v()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.s9 r7 = r6.mo21855i()     // Catch:{ all -> 0x0196 }
            r7.mo21668A()     // Catch:{ all -> 0x0196 }
            r6.f15648q = r0
            r6.m23788t()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.s9 r8 = r6.mo21855i()     // Catch:{ all -> 0x0196 }
            r8.mo21668A()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.f15648q = r0
            r6.m23788t()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5461y8.mo21844a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21843a(Runnable runnable) {
        m23793y();
        if (this.f15645n == null) {
            this.f15645n = new ArrayList();
        }
        this.f15645n.add(runnable);
    }

    @C0226w0
    @C4476d0
    /* renamed from: a */
    private final int m23768a(FileChannel fileChannel) {
        m23793y();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f15640i.mo21205d().mo21533t().mo21549a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f15640i.mo21205d().mo21536w().mo21550a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f15640i.mo21205d().mo21533t().mo21550a("Failed to read from channel", e);
        }
    }

    @C0226w0
    @C4476d0
    /* renamed from: a */
    private final boolean m23780a(int i, FileChannel fileChannel) {
        m23793y();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f15640i.mo21205d().mo21533t().mo21549a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f15640i.mo21205d().mo21533t().mo21550a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f15640i.mo21205d().mo21533t().mo21550a("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: a */
    private final zzm m23771a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        String str5;
        int i;
        String str6 = str;
        String str7 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f15640i.mo21205d().mo21533t().mo21549a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str6);
        } catch (IllegalArgumentException unused) {
            this.f15640i.mo21205d().mo21533t().mo21550a("Error retrieving installer package name. appId", C5303k3.m23051a(str));
            str4 = str7;
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str8 = str4;
        try {
            PackageInfo b = C4439c.m19110a(context).mo18451b(str6, 0);
            if (b != null) {
                CharSequence b2 = C4439c.m19110a(context).mo18452b(str6);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                String str9 = b.versionName;
                i = b.versionCode;
                str5 = str9;
            } else {
                i = Integer.MIN_VALUE;
                str5 = str7;
            }
            this.f15640i.mo21189B();
            zzm zzm = new zzm(str, str2, str5, (long) i, str8, this.f15640i.mo21600n().mo21652n(), this.f15640i.mo21607u().mo21359a(context, str6), (String) null, z, false, "", 0, this.f15640i.mo21600n().mo21647i(str6) ? j : 0, 0, z2, z3, false, str3, (Boolean) null, 0, null);
            return zzm;
        } catch (NameNotFoundException unused2) {
            this.f15640i.mo21205d().mo21533t().mo21551a("Error retrieving newly installed package info. appId, appName", C5303k3.m23051a(str), str7);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21839a(zzjx zzjx, zzm zzm) {
        m23793y();
        mo21861o();
        if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
            return;
        }
        if (!zzm.f15701S) {
            m23787e(zzm);
            return;
        }
        int b = this.f15640i.mo21607u().mo21380b(zzjx.f15695b);
        if (b != 0) {
            this.f15640i.mo21607u();
            String a = C5254f9.m22827a(zzjx.f15695b, 24, true);
            String str = zzjx.f15695b;
            this.f15640i.mo21607u().mo21376a(zzm.f15709a, b, "_ev", a, str != null ? str.length() : 0);
            return;
        }
        int b2 = this.f15640i.mo21607u().mo21381b(zzjx.f15695b, zzjx.mo21886a());
        if (b2 != 0) {
            this.f15640i.mo21607u();
            String a2 = C5254f9.m22827a(zzjx.f15695b, 24, true);
            Object a3 = zzjx.mo21886a();
            this.f15640i.mo21607u().mo21376a(zzm.f15709a, b2, "_ev", a2, (a3 == null || (!(a3 instanceof String) && !(a3 instanceof CharSequence))) ? 0 : String.valueOf(a3).length());
            return;
        }
        Object c = this.f15640i.mo21607u().mo21383c(zzjx.f15695b, zzjx.mo21886a());
        if (c != null) {
            if ("_sid".equals(zzjx.f15695b) && this.f15640i.mo21600n().mo21651m(zzm.f15709a)) {
                long j = zzjx.f15688N;
                String str2 = zzjx.f15692R;
                long j2 = 0;
                C5265g9 c2 = mo21855i().mo21698c(zzm.f15709a, "_sno");
                if (c2 != null) {
                    Object obj = c2.f15074e;
                    if (obj instanceof Long) {
                        j2 = ((Long) obj).longValue();
                        zzjx zzjx2 = new zzjx("_sno", j, Long.valueOf(j2 + 1), str2);
                        mo21839a(zzjx2, zzm);
                    }
                }
                if (c2 != null) {
                    this.f15640i.mo21205d().mo21536w().mo21550a("Retrieved last session number from database does not contain a valid (long) value", c2.f15074e);
                }
                if (this.f15640i.mo21600n().mo21643e(zzm.f15709a, C5310l.f15234d0)) {
                    C5255g a4 = mo21855i().mo21677a(zzm.f15709a, "_s");
                    if (a4 != null) {
                        j2 = a4.f15043c;
                        this.f15640i.mo21205d().mo21528C().mo21550a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                }
                zzjx zzjx22 = new zzjx("_sno", j, Long.valueOf(j2 + 1), str2);
                mo21839a(zzjx22, zzm);
            }
            C5265g9 g9Var = new C5265g9(zzm.f15709a, zzjx.f15692R, zzjx.f15695b, zzjx.f15688N, c);
            this.f15640i.mo21205d().mo21527A().mo21551a("Setting user property", this.f15640i.mo21608v().mo21431c(g9Var.f15072c), c);
            mo21855i().mo21712z();
            try {
                m23787e(zzm);
                boolean a5 = mo21855i().mo21691a(g9Var);
                mo21855i().mo21708v();
                if (a5) {
                    this.f15640i.mo21205d().mo21527A().mo21551a("User property set", this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                } else {
                    this.f15640i.mo21205d().mo21533t().mo21551a("Too many unique user properties are set. Ignoring user property", this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                    this.f15640i.mo21607u().mo21376a(zzm.f15709a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo21855i().mo21668A();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21836a(C5429v8 v8Var) {
        this.f15646o++;
    }

    @C0226w0
    /* renamed from: a */
    private final zzm m23772a(String str) {
        String str2 = str;
        C5239e5 b = mo21855i().mo21694b(str2);
        if (b == null || TextUtils.isEmpty(b.mo21294q())) {
            this.f15640i.mo21205d().mo21527A().mo21550a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m23783b(b);
        if (b2 == null || b2.booleanValue()) {
            C5239e5 e5Var = b;
            zzm zzm = new zzm(str, b.mo21282k(), b.mo21294q(), b.mo21295r(), b.mo21296s(), b.mo21297t(), b.mo21298u(), (String) null, b.mo21300w(), false, b.mo21288n(), e5Var.mo21263d(), 0, 0, e5Var.mo21268e(), e5Var.mo21271f(), false, e5Var.mo21284l(), e5Var.mo21272g(), e5Var.mo21299v(), e5Var.mo21275h());
            return zzm;
        }
        this.f15640i.mo21205d().mo21533t().mo21550a("App version does not match; dropping. appId", C5303k3.m23051a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21841a(zzs zzs) {
        zzm a = m23772a(zzs.f15726a);
        if (a != null) {
            mo21842a(zzs, a);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21842a(zzs zzs, zzm zzm) {
        C4300a0.m18620a(zzs);
        C4300a0.m18630b(zzs.f15726a);
        C4300a0.m18620a(zzs.f15727b);
        C4300a0.m18620a(zzs.f15717N);
        C4300a0.m18630b(zzs.f15717N.f15695b);
        m23793y();
        mo21861o();
        if (TextUtils.isEmpty(zzm.f15711b) && TextUtils.isEmpty(zzm.f15713c0)) {
            return;
        }
        if (!zzm.f15701S) {
            m23787e(zzm);
            return;
        }
        zzs zzs2 = new zzs(zzs);
        boolean z = false;
        zzs2.f15719P = false;
        mo21855i().mo21712z();
        try {
            zzs d = mo21855i().mo21699d(zzs2.f15726a, zzs2.f15717N.f15695b);
            if (d != null && !d.f15727b.equals(zzs2.f15727b)) {
                this.f15640i.mo21205d().mo21536w().mo21552a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f15640i.mo21608v().mo21431c(zzs2.f15717N.f15695b), zzs2.f15727b, d.f15727b);
            }
            if (d != null && d.f15719P) {
                zzs2.f15727b = d.f15727b;
                zzs2.f15718O = d.f15718O;
                zzs2.f15722S = d.f15722S;
                zzs2.f15720Q = d.f15720Q;
                zzs2.f15723T = d.f15723T;
                zzs2.f15719P = d.f15719P;
                zzjx zzjx = new zzjx(zzs2.f15717N.f15695b, d.f15717N.f15688N, zzs2.f15717N.mo21886a(), d.f15717N.f15692R);
                zzs2.f15717N = zzjx;
            } else if (TextUtils.isEmpty(zzs2.f15720Q)) {
                zzjx zzjx2 = new zzjx(zzs2.f15717N.f15695b, zzs2.f15718O, zzs2.f15717N.mo21886a(), zzs2.f15717N.f15692R);
                zzs2.f15717N = zzjx2;
                zzs2.f15719P = true;
                z = true;
            }
            if (zzs2.f15719P) {
                zzjx zzjx3 = zzs2.f15717N;
                C5265g9 g9Var = new C5265g9(zzs2.f15726a, zzs2.f15727b, zzjx3.f15695b, zzjx3.f15688N, zzjx3.mo21886a());
                if (mo21855i().mo21691a(g9Var)) {
                    this.f15640i.mo21205d().mo21527A().mo21552a("User property updated immediately", zzs2.f15726a, this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                } else {
                    this.f15640i.mo21205d().mo21533t().mo21552a("(2)Too many active user properties, ignoring", C5303k3.m23051a(zzs2.f15726a), this.f15640i.mo21608v().mo21431c(g9Var.f15072c), g9Var.f15074e);
                }
                if (z && zzs2.f15723T != null) {
                    m23786b(new zzak(zzs2.f15723T, zzs2.f15718O), zzm);
                }
            }
            if (mo21855i().mo21692a(zzs2)) {
                this.f15640i.mo21205d().mo21527A().mo21552a("Conditional property added", zzs2.f15726a, this.f15640i.mo21608v().mo21431c(zzs2.f15717N.f15695b), zzs2.f15717N.mo21886a());
            } else {
                this.f15640i.mo21205d().mo21533t().mo21552a("Too many conditional properties, ignoring", C5303k3.m23051a(zzs2.f15726a), this.f15640i.mo21608v().mo21431c(zzs2.f15717N.f15695b), zzs2.f15717N.mo21886a());
            }
            mo21855i().mo21708v();
        } finally {
            mo21855i().mo21668A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21845a(boolean z) {
        m23767C();
    }
}
