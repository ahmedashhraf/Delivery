package com.google.android.gms.common.api.internal;

import android.util.SparseArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4300a0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.c3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4107c3 extends C4121e3 {

    /* renamed from: Q */
    private final SparseArray<C4108a> f12902Q = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.c3$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private class C4108a implements C4089c {

        /* renamed from: N */
        public final C4089c f12903N;

        /* renamed from: a */
        public final int f12905a;

        /* renamed from: b */
        public final C4086i f12906b;

        public C4108a(int i, C4086i iVar, C4089c cVar) {
            this.f12905a = i;
            this.f12906b = iVar;
            this.f12903N = cVar;
            iVar.mo17708b((C4089c) this);
        }

        /* renamed from: a */
        public final void mo17767a(@C0193h0 ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            sb.toString();
            C4107c3.this.mo17817b(connectionResult, this.f12905a);
        }
    }

    private C4107c3(C4162m mVar) {
        super(mVar);
        this.f12884a.mo17920a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public static C4107c3 m17745b(C4157l lVar) {
        C4162m a = LifecycleCallback.m17698a(lVar);
        C4107c3 c3Var = (C4107c3) a.mo17919a("AutoManageHelper", C4107c3.class);
        if (c3Var != null) {
            return c3Var;
        }
        return new C4107c3(a);
    }

    /* renamed from: a */
    public final void mo17787a(int i, C4086i iVar, C4089c cVar) {
        C4300a0.m18621a(iVar, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f12902Q.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C4300a0.m18632b(z, sb.toString());
        C4131g3 g3Var = (C4131g3) this.f12929N.get();
        boolean z2 = this.f12932b;
        String valueOf = String.valueOf(g3Var);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        String str = C3868i.f12248b;
        sb2.append(str);
        sb2.append(z2);
        sb2.append(str);
        sb2.append(valueOf);
        sb2.toString();
        this.f12902Q.put(i, new C4108a(i, iVar, cVar));
        if (this.f12932b && g3Var == null) {
            String valueOf2 = String.valueOf(iVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            sb3.toString();
            iVar.mo17711c();
        }
    }

    /* renamed from: d */
    public void mo17764d() {
        super.mo17764d();
        boolean z = this.f12932b;
        String valueOf = String.valueOf(this.f12902Q);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(C3868i.f12248b);
        sb.append(valueOf);
        sb.toString();
        if (this.f12929N.get() == null) {
            for (int i = 0; i < this.f12902Q.size(); i++) {
                C4108a b = m17744b(i);
                if (b != null) {
                    b.f12906b.mo17711c();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo17765e() {
        super.mo17765e();
        for (int i = 0; i < this.f12902Q.size(); i++) {
            C4108a b = m17744b(i);
            if (b != null) {
                b.f12906b.mo17715d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17789f() {
        for (int i = 0; i < this.f12902Q.size(); i++) {
            C4108a b = m17744b(i);
            if (b != null) {
                b.f12906b.mo17711c();
            }
        }
    }

    @C0195i0
    /* renamed from: b */
    private final C4108a m17744b(int i) {
        if (this.f12902Q.size() <= i) {
            return null;
        }
        SparseArray<C4108a> sparseArray = this.f12902Q;
        return (C4108a) sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo17786a(int i) {
        C4108a aVar = (C4108a) this.f12902Q.get(i);
        this.f12902Q.remove(i);
        if (aVar != null) {
            aVar.f12906b.mo17713c((C4089c) aVar);
            aVar.f12906b.mo17715d();
        }
    }

    /* renamed from: a */
    public void mo17760a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f12902Q.size(); i++) {
            C4108a b = m17744b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f12905a);
                printWriter.println(":");
                b.f12906b.mo17701a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17788a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            new Exception();
            return;
        }
        C4108a aVar = (C4108a) this.f12902Q.get(i);
        if (aVar != null) {
            mo17786a(i);
            C4089c cVar = aVar.f12903N;
            if (cVar != null) {
                cVar.mo17767a(connectionResult);
            }
        }
    }
}
