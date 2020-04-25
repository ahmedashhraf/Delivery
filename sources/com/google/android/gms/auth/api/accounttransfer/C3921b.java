package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4083h.C4084a.C4085a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.api.internal.C4230z;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.auth.C4599n0;
import com.google.android.gms.internal.auth.C4603p0;
import com.google.android.gms.internal.auth.C4609s0;
import com.google.android.gms.internal.auth.C4611t0;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public class C3921b extends C4083h<C3939q> {

    /* renamed from: j */
    private static final C4072g<C4603p0> f12441j = new C4072g<>();

    /* renamed from: k */
    private static final C4060a<C4603p0, C3939q> f12442k = new C3929g();

    /* renamed from: l */
    private static final C4059a<C3939q> f12443l = new C4059a<>("AccountTransfer.ACCOUNT_TRANSFER_API", f12442k, f12441j);

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.b$a */
    private static class C3922a<T> extends C4599n0 {

        /* renamed from: b */
        private C3923b<T> f12444b;

        public C3922a(C3923b<T> bVar) {
            this.f12444b = bVar;
        }

        /* renamed from: h */
        public final void mo17308h(Status status) {
            this.f12444b.mo17309a(status);
        }
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.b$b */
    private static abstract class C3923b<T> extends C4230z<C4603p0, T> {

        /* renamed from: c */
        private C5562l<T> f12445c;

        private C3923b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo17310a(C4611t0 t0Var) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17311a(T t) {
            this.f12445c.mo22019a(t);
        }

        /* synthetic */ C3923b(C3929g gVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17309a(Status status) {
            C3921b.m17109a((C5562l) this.f12445c, status);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public /* synthetic */ void mo10089a(C4061b bVar, C5562l lVar) throws RemoteException {
            C4603p0 p0Var = (C4603p0) bVar;
            this.f12445c = lVar;
            mo17310a((C4611t0) p0Var.mo18262z());
        }
    }

    /* renamed from: com.google.android.gms.auth.api.accounttransfer.b$c */
    private static abstract class C3924c extends C3923b<Void> {

        /* renamed from: d */
        C4609s0 f12446d;

        private C3924c() {
            super(null);
            this.f12446d = new C3937o(this);
        }

        /* synthetic */ C3924c(C3929g gVar) {
            this();
        }
    }

    C3921b(@C0193h0 Context context) {
        super(context, f12443l, null, new C4085a().mo17690a((C4221x) new C4097b()).mo17691a());
    }

    /* renamed from: a */
    public C5560k<Void> mo17306a(String str, byte[] bArr) {
        C4300a0.m18620a(str);
        C4300a0.m18620a(bArr);
        return mo17681c((C4230z<A, TResult>) new C3930h<A,TResult>(this, new zzaf(str, bArr)));
    }

    /* renamed from: b */
    public C5560k<byte[]> mo17307b(String str) {
        C4300a0.m18620a(str);
        return mo17678b((C4230z<A, TResult>) new C3931i<A,TResult>(this, new zzad(str)));
    }

    C3921b(@C0193h0 Activity activity) {
        super(activity, f12443l, null, new C4085a().mo17690a((C4221x) new C4097b()).mo17691a());
    }

    /* renamed from: a */
    public C5560k<DeviceMetaData> mo17303a(String str) {
        C4300a0.m18620a(str);
        return mo17678b((C4230z<A, TResult>) new C3933k<A,TResult>(this, new zzv(str)));
    }

    /* renamed from: a */
    public C5560k<Void> mo17305a(String str, PendingIntent pendingIntent) {
        C4300a0.m18620a(str);
        C4300a0.m18620a(pendingIntent);
        return mo17681c((C4230z<A, TResult>) new C3935m<A,TResult>(this, new zzah(str, pendingIntent)));
    }

    /* renamed from: a */
    public C5560k<Void> mo17304a(String str, int i) {
        C4300a0.m18620a(str);
        return mo17681c((C4230z<A, TResult>) new C3936n<A,TResult>(this, new zzab(str, i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17109a(C5562l lVar, Status status) {
        lVar.mo22018a((Exception) new AccountTransferException(status));
    }
}
