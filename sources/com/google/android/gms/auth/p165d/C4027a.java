package com.google.android.gms.auth.p165d;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.internal.auth.C4577c0;
import com.google.android.gms.internal.auth.C4597m0;

/* renamed from: com.google.android.gms.auth.d.a */
public class C4027a {

    /* renamed from: a */
    private static final C4072g<C4597m0> f12715a = new C4072g<>();

    /* renamed from: b */
    private static final C4060a<C4597m0, C4067d> f12716b = new C4036i();

    /* renamed from: c */
    public static final C4059a<C4067d> f12717c = new C4059a<>("WorkAccount.API", f12716b, f12715a);
    @Deprecated

    /* renamed from: d */
    public static final C4028b f12718d = new C4577c0();

    private C4027a() {
    }

    /* renamed from: a */
    public static C4030c m17466a(@C0193h0 Activity activity) {
        return new C4030c(activity);
    }

    /* renamed from: a */
    public static C4030c m17467a(@C0193h0 Context context) {
        return new C4030c(context);
    }
}
