package com.google.android.gms.auth.api.p164d;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.tasks.C5560k;
import p076c.p112d.p113a.p114a.p118d.p120b.C2590i;

/* renamed from: com.google.android.gms.auth.api.d.d */
public abstract class C3971d extends C4083h<C4067d> implements C3970c {

    /* renamed from: j */
    private static final C4072g<C2590i> f12571j = new C4072g<>();

    /* renamed from: k */
    private static final C4060a<C2590i, C4067d> f12572k = new C3972e();

    /* renamed from: l */
    private static final C4059a<C4067d> f12573l = new C4059a<>("SmsRetriever.API", f12572k, f12571j);

    public C3971d(@C0193h0 Activity activity) {
        super(activity, f12573l, null, (C4221x) new C4097b());
    }

    public C3971d(@C0193h0 Context context) {
        super(context, f12573l, null, (C4221x) new C4097b());
    }

    /* renamed from: a */
    public abstract C5560k<Void> mo10086a();
}
