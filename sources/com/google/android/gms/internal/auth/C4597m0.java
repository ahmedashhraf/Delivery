package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.p165d.C4033f;
import com.google.android.gms.auth.p165d.C4034g;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.internal.auth.m0 */
public final class C4597m0 extends C4346k<C4033f> {
    public C4597m0(Context context, Looper looper, C4329f fVar, C4088b bVar, C4089c cVar) {
        super(context, looper, 120, fVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        return C4034g.m17482a(iBinder);
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
