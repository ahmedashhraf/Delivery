package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.C4476d0;
import java.util.concurrent.atomic.AtomicReference;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* renamed from: com.google.android.gms.common.api.internal.e3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4121e3 extends LifecycleCallback implements OnCancelListener {

    /* renamed from: N */
    protected final AtomicReference<C4131g3> f12929N;

    /* renamed from: O */
    private final Handler f12930O;

    /* renamed from: P */
    protected final C4279e f12931P;

    /* renamed from: b */
    protected volatile boolean f12932b;

    protected C4121e3(C4162m mVar) {
        this(mVar, C4279e.m18476a());
    }

    /* renamed from: a */
    public void mo17759a(Bundle bundle) {
        super.mo17759a(bundle);
        if (bundle != null) {
            this.f12929N.set(bundle.getBoolean("resolving_error", false) ? new C4131g3(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17788a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo17762b(Bundle bundle) {
        super.mo17762b(bundle);
        C4131g3 g3Var = (C4131g3) this.f12929N.get();
        if (g3Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", g3Var.mo17837b());
            bundle.putInt("failed_status", g3Var.mo17836a().mo17576N());
            bundle.putParcelable("failed_resolution", g3Var.mo17836a().mo17578P());
        }
    }

    /* renamed from: d */
    public void mo17764d() {
        super.mo17764d();
        this.f12932b = true;
    }

    /* renamed from: e */
    public void mo17765e() {
        super.mo17765e();
        this.f12932b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo17789f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo17818g() {
        this.f12929N.set(null);
        mo17789f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo17788a(new ConnectionResult(13, null), m17787a((C4131g3) this.f12929N.get()));
        mo17818g();
    }

    @C4476d0
    private C4121e3(C4162m mVar, C4279e eVar) {
        super(mVar);
        this.f12929N = new AtomicReference<>(null);
        this.f12930O = new C2612r(Looper.getMainLooper());
        this.f12931P = eVar;
    }

    /* renamed from: b */
    public final void mo17817b(ConnectionResult connectionResult, int i) {
        C4131g3 g3Var = new C4131g3(connectionResult, i);
        if (this.f12929N.compareAndSet(null, g3Var)) {
            this.f12930O.post(new C4126f3(this, g3Var));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17758a(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.g3> r0 = r4.f12929N
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.g3 r0 = (com.google.android.gms.common.api.internal.C4131g3) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0030
            r6 = 2
            if (r5 == r6) goto L_0x0010
            goto L_0x005d
        L_0x0010:
            com.google.android.gms.common.e r5 = r4.f12931P
            android.app.Activity r6 = r4.mo17757a()
            int r5 = r5.mo18113d(r6)
            if (r5 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r6 = r0.mo17836a()
            int r6 = r6.mo17576N()
            r7 = 18
            if (r6 != r7) goto L_0x005e
            if (r5 != r7) goto L_0x005e
            return
        L_0x0030:
            r5 = -1
            if (r6 != r5) goto L_0x0034
            goto L_0x005e
        L_0x0034:
            if (r6 != 0) goto L_0x005d
            r5 = 13
            if (r7 == 0) goto L_0x0040
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L_0x0040:
            com.google.android.gms.common.api.internal.g3 r6 = new com.google.android.gms.common.api.internal.g3
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            com.google.android.gms.common.ConnectionResult r3 = r0.mo17836a()
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = m17787a(r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.g3> r5 = r4.f12929N
            r5.set(r6)
            r0 = r6
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0064
            r4.mo17818g()
            return
        L_0x0064:
            if (r0 == 0) goto L_0x0071
            com.google.android.gms.common.ConnectionResult r5 = r0.mo17836a()
            int r6 = r0.mo17837b()
            r4.mo17788a(r5, r6)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C4121e3.mo17758a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    private static int m17787a(@C0195i0 C4131g3 g3Var) {
        if (g3Var == null) {
            return -1;
        }
        return g3Var.mo17837b();
    }
}
