package p076c.p112d.p113a.p114a.p128h;

import com.google.android.gms.common.C4420j;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.signin.internal.C5530a;

/* renamed from: c.d.a.a.h.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C2682c {

    /* renamed from: a */
    private static final C4072g<C5530a> f9771a = new C4072g<>();
    @C4312d0

    /* renamed from: b */
    private static final C4072g<C5530a> f9772b = new C4072g<>();

    /* renamed from: c */
    public static final C4060a<C5530a, C2679a> f9773c = new C2681b();

    /* renamed from: d */
    private static final C4060a<C5530a, Object> f9774d = new C2684e();

    /* renamed from: e */
    private static final Scope f9775e = new Scope(C4420j.f13552a);

    /* renamed from: f */
    private static final Scope f9776f = new Scope("email");

    /* renamed from: g */
    public static final C4059a<C2679a> f9777g = new C4059a<>("SignIn.API", f9773c, f9771a);

    /* renamed from: h */
    private static final C4059a<Object> f9778h = new C4059a<>("SignIn.INTERNAL_API", f9774d, f9772b);
}
