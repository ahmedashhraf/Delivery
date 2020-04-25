package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4306c0.C4309c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;
import com.google.android.gms.common.internal.C4380q;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.C5478b.C5479a;
import com.google.android.gms.plus.C5481c;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.gms.plus.internal.h */
public final class C5521h extends C4346k<C5519f> {

    /* renamed from: L */
    private C5495a f15815L;

    /* renamed from: M */
    private final zzn f15816M;

    public C5521h(Context context, Looper looper, C4329f fVar, zzn zzn, C4088b bVar, C4089c cVar) {
        super(context, looper, 2, fVar, bVar, cVar);
        this.f15816M = zzn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.plus.service.START";
    }

    @C4476d0
    /* renamed from: E */
    public final String mo17532E() {
        mo18253q();
        try {
            return ((C5519f) mo18262z()).mo21935x0();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @C4476d0
    /* renamed from: F */
    public final void mo18787F() {
        mo18253q();
        try {
            this.f15815L = null;
            ((C5519f) mo18262z()).mo21932a();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @C4476d0
    /* renamed from: G */
    public final C5495a mo21936G() {
        mo18253q();
        return this.f15815L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return queryLocalInterface instanceof C5519f ? (C5519f) queryLocalInterface : new C5520g(iBinder);
    }

    @C4476d0
    /* renamed from: a */
    public final C4380q mo21937a(C4117b<C5479a> bVar, int i, String str) {
        mo18253q();
        C5523j jVar = new C5523j(bVar);
        try {
            return ((C5519f) mo18262z()).mo21931a(jVar, 1, i, -1, str);
        } catch (RemoteException unused) {
            jVar.mo21925a(DataHolder.m18401h(8), null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18233a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            String str = "loaded_person";
            if (bundle.containsKey(str)) {
                this.f15815L = zzr.m22108a(bundle.getByteArray(str));
            }
        }
        super.mo18233a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final void mo21938a(C4117b<C5479a> bVar) {
        mo18253q();
        C5523j jVar = new C5523j(bVar);
        try {
            ((C5519f) mo18262z()).mo21931a(jVar, 2, 1, -1, null);
        } catch (RemoteException unused) {
            jVar.mo21925a(DataHolder.m18401h(8), null);
        }
    }

    @C4476d0
    /* renamed from: a */
    public final void mo21939a(C4117b<C5479a> bVar, Collection<String> collection) {
        mo18253q();
        C5523j jVar = new C5523j(bVar);
        try {
            ((C5519f) mo18262z()).mo21934a(jVar, new ArrayList(collection));
        } catch (RemoteException unused) {
            jVar.mo21925a(DataHolder.m18401h(8), null);
        }
    }

    /* renamed from: a */
    public final void mo21940a(C4117b<C5479a> bVar, String[] strArr) {
        mo21939a(bVar, (Collection<String>) Arrays.asList(strArr));
    }

    @C4476d0
    /* renamed from: b */
    public final void mo21941b(C4117b<Status> bVar) {
        mo18253q();
        mo18787F();
        C5524k kVar = new C5524k(bVar);
        try {
            ((C5519f) mo18262z()).mo21933a(kVar);
        } catch (RemoteException unused) {
            kVar.mo21928c(8, null);
        }
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: o */
    public final boolean mo18251o() {
        Set a = mo18328D().mo18293a(C5481c.f15742c);
        if (a == null || a.isEmpty()) {
            return false;
        }
        return a.size() != 1 || !a.contains(new Scope("plus_one_placeholder_scope"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Bundle mo18258v() {
        Bundle P = this.f15816M.mo21948P();
        P.putStringArray("request_visible_actions", this.f15816M.mo21946N());
        P.putString(C4309c.f13389a, this.f15816M.mo21947O());
        return P;
    }
}
