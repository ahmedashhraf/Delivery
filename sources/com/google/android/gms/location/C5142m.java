package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.location.C4633f;
import com.google.android.gms.internal.location.C4642i0;
import com.google.android.gms.internal.location.C4672x0;
import com.google.android.gms.internal.location.C4675z;

/* renamed from: com.google.android.gms.location.m */
public class C5142m {

    /* renamed from: a */
    private static final C4072g<C4675z> f14782a = new C4072g<>();

    /* renamed from: b */
    private static final C4060a<C4675z, C4067d> f14783b = new C5166x();

    /* renamed from: c */
    public static final C4059a<C4067d> f14784c = new C4059a<>("LocationServices.API", f14783b, f14782a);
    @Deprecated

    /* renamed from: d */
    public static final C5122d f14785d = new C4672x0();
    @Deprecated

    /* renamed from: e */
    public static final C5132h f14786e = new C4633f();
    @Deprecated

    /* renamed from: f */
    public static final C5154r f14787f = new C4642i0();

    /* renamed from: com.google.android.gms.location.m$a */
    public static abstract class C5143a<R extends C4246q> extends C4116a<R, C4675z> {
        public C5143a(C4086i iVar) {
            super(C5142m.f14784c, iVar);
        }
    }

    private C5142m() {
    }

    /* renamed from: a */
    public static C4675z m22410a(C4086i iVar) {
        boolean z = true;
        C4300a0.m18628a(iVar != null, (Object) "GoogleApiClient parameter is required.");
        C4675z zVar = (C4675z) iVar.mo17695a((C4062c<C>) f14782a);
        if (zVar == null) {
            z = false;
        }
        C4300a0.m18632b(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zVar;
    }

    /* renamed from: a */
    public static C5124e m22411a(@C0193h0 Activity activity) {
        return new C5124e(activity);
    }

    /* renamed from: a */
    public static C5124e m22412a(@C0193h0 Context context) {
        return new C5124e(context);
    }

    /* renamed from: b */
    public static C5134i m22413b(@C0193h0 Activity activity) {
        return new C5134i(activity);
    }

    /* renamed from: b */
    public static C5134i m22414b(@C0193h0 Context context) {
        return new C5134i(context);
    }

    /* renamed from: c */
    public static C5156s m22415c(@C0193h0 Activity activity) {
        return new C5156s(activity);
    }

    /* renamed from: c */
    public static C5156s m22416c(@C0193h0 Context context) {
        return new C5156s(context);
    }
}
