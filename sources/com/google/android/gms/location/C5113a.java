package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.internal.location.C4652n0;
import com.google.android.gms.internal.location.C4675z;

/* renamed from: com.google.android.gms.location.a */
public class C5113a {

    /* renamed from: a */
    public static final String f14753a = "activity_recognition";

    /* renamed from: b */
    private static final C4072g<C4675z> f14754b = new C4072g<>();

    /* renamed from: c */
    private static final C4060a<C4675z, C4067d> f14755c = new C5158t();

    /* renamed from: d */
    public static final C4059a<C4067d> f14756d = new C4059a<>("ActivityRecognition.API", f14755c, f14754b);
    @Deprecated

    /* renamed from: e */
    public static final C5117b f14757e = new C4652n0();

    /* renamed from: com.google.android.gms.location.a$a */
    public static abstract class C5114a<R extends C4246q> extends C4116a<R, C4675z> {
        public C5114a(C4086i iVar) {
            super(C5113a.f14756d, iVar);
        }
    }

    private C5113a() {
    }

    /* renamed from: a */
    public static C5120c m22350a(Activity activity) {
        return new C5120c(activity);
    }

    /* renamed from: a */
    public static C5120c m22351a(Context context) {
        return new C5120c(context);
    }
}
