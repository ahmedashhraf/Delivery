package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4098b0;
import com.google.android.gms.common.api.internal.C4102c;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.api.internal.C4128g0;
import com.google.android.gms.common.api.internal.C4137i;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.common.api.internal.C4148j2;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.common.api.internal.C4175o;
import com.google.android.gms.common.api.internal.C4192r1;
import com.google.android.gms.common.api.internal.C4195s;
import com.google.android.gms.common.api.internal.C4200t;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.api.internal.C4230z;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.h */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4083h<O extends C4063d> implements C4235j<O> {

    /* renamed from: a */
    private final Context f12827a;

    /* renamed from: b */
    private final C4059a<O> f12828b;

    /* renamed from: c */
    private final O f12829c;

    /* renamed from: d */
    private final C4102c<O> f12830d;

    /* renamed from: e */
    private final Looper f12831e;

    /* renamed from: f */
    private final int f12832f;

    /* renamed from: g */
    private final C4086i f12833g;

    /* renamed from: h */
    private final C4221x f12834h;

    /* renamed from: i */
    protected final C4137i f12835i;

    @C4056a
    /* renamed from: com.google.android.gms.common.api.h$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4084a {
        @C4056a

        /* renamed from: c */
        public static final C4084a f12836c = new C4085a().mo17691a();

        /* renamed from: a */
        public final C4221x f12837a;

        /* renamed from: b */
        public final Looper f12838b;

        @C4056a
        /* renamed from: com.google.android.gms.common.api.h$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class C4085a {

            /* renamed from: a */
            private C4221x f12839a;

            /* renamed from: b */
            private Looper f12840b;

            @C4056a
            /* renamed from: a */
            public C4085a mo17690a(C4221x xVar) {
                C4300a0.m18621a(xVar, (Object) "StatusExceptionMapper must not be null.");
                this.f12839a = xVar;
                return this;
            }

            @C4056a
            /* renamed from: a */
            public C4085a mo17689a(Looper looper) {
                C4300a0.m18621a(looper, (Object) "Looper must not be null.");
                this.f12840b = looper;
                return this;
            }

            @C4056a
            /* renamed from: a */
            public C4084a mo17691a() {
                if (this.f12839a == null) {
                    this.f12839a = new C4097b();
                }
                if (this.f12840b == null) {
                    this.f12840b = Looper.getMainLooper();
                }
                return new C4084a(this.f12839a, this.f12840b);
            }
        }

        @C4056a
        private C4084a(C4221x xVar, Account account, Looper looper) {
            this.f12837a = xVar;
            this.f12838b = looper;
        }
    }

    @C4056a
    protected C4083h(@C0193h0 Context context, C4059a<O> aVar, Looper looper) {
        C4300a0.m18621a(context, (Object) "Null context is not permitted.");
        C4300a0.m18621a(aVar, (Object) "Api must not be null.");
        C4300a0.m18621a(looper, (Object) "Looper must not be null.");
        this.f12827a = context.getApplicationContext();
        this.f12828b = aVar;
        this.f12829c = null;
        this.f12831e = looper;
        this.f12830d = C4102c.m17732a(aVar);
        this.f12833g = new C4192r1(this);
        this.f12835i = C4137i.m17841a(this.f12827a);
        this.f12832f = this.f12835i.mo17853b();
        this.f12834h = new C4097b();
    }

    /* renamed from: a */
    private final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T m17595a(int i, @C0193h0 T t) {
        t.mo17753g();
        this.f12835i.mo17850a(this, i, (C4116a<? extends C4246q, C4061b>) t);
        return t;
    }

    @C4056a
    /* renamed from: b */
    public <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17677b(@C0193h0 T t) {
        return m17595a(0, t);
    }

    @C4056a
    /* renamed from: c */
    public <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17680c(@C0193h0 T t) {
        return m17595a(1, t);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C4329f.C4330a mo17682d() {
        /*
            r3 = this;
            com.google.android.gms.common.internal.f$a r0 = new com.google.android.gms.common.internal.f$a
            r0.<init>()
            O r1 = r3.f12829c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C4059a.C4063d.C4065b
            if (r2 == 0) goto L_0x0018
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C4059a.C4063d.C4065b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo17631a()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.mo17457e()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.f12829c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C4059a.C4063d.C4064a
            if (r2 == 0) goto L_0x0025
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C4059a.C4063d.C4064a) r1
            android.accounts.Account r1 = r1.mo17630e()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            com.google.android.gms.common.internal.f$a r0 = r0.mo18308a(r1)
            O r1 = r3.f12829c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C4059a.C4063d.C4065b
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C4059a.C4063d.C4065b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo17631a()
            if (r1 == 0) goto L_0x003d
            java.util.Set r1 = r1.mo17451V()
            goto L_0x0041
        L_0x003d:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0041:
            com.google.android.gms.common.internal.f$a r0 = r0.mo18313a(r1)
            android.content.Context r1 = r3.f12827a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            com.google.android.gms.common.internal.f$a r0 = r0.mo18312a(r1)
            android.content.Context r1 = r3.f12827a
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.common.internal.f$a r0 = r0.mo18317b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4083h.mo17682d():com.google.android.gms.common.internal.f$a");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: e */
    public C5560k<Boolean> mo17683e() {
        return this.f12835i.mo17854b(this);
    }

    /* renamed from: f */
    public final C4059a<O> mo17684f() {
        return this.f12828b;
    }

    @C4056a
    /* renamed from: g */
    public O mo17685g() {
        return this.f12829c;
    }

    @C4056a
    /* renamed from: h */
    public Context mo17686h() {
        return this.f12827a;
    }

    /* renamed from: i */
    public final int mo17687i() {
        return this.f12832f;
    }

    @C4056a
    /* renamed from: j */
    public Looper mo17688j() {
        return this.f12831e;
    }

    @C4056a
    /* renamed from: b */
    public <TResult, A extends C4061b> C5560k<TResult> mo17678b(C4230z<A, TResult> zVar) {
        return m17596a(0, zVar);
    }

    @C4056a
    /* renamed from: c */
    public <TResult, A extends C4061b> C5560k<TResult> mo17681c(C4230z<A, TResult> zVar) {
        return m17596a(1, zVar);
    }

    /* renamed from: a */
    private final <TResult, A extends C4061b> C5560k<TResult> m17596a(int i, @C0193h0 C4230z<A, TResult> zVar) {
        C5562l lVar = new C5562l();
        this.f12835i.mo17851a(this, i, zVar, lVar, this.f12834h);
        return lVar.mo22017a();
    }

    /* renamed from: b */
    public C4102c<O> mo17676b() {
        return this.f12830d;
    }

    @C4056a
    /* renamed from: c */
    public C4086i mo17679c() {
        return this.f12833g;
    }

    @C4056a
    /* renamed from: a */
    public <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17669a(@C0193h0 T t) {
        return m17595a(2, t);
    }

    @C4056a
    /* renamed from: a */
    public <TResult, A extends C4061b> C5560k<TResult> mo17675a(C4230z<A, TResult> zVar) {
        return m17596a(2, zVar);
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public <A extends C4061b, T extends C4195s<A, ?>, U extends C4098b0<A, ?>> C5560k<Void> mo17673a(@C0193h0 T t, U u) {
        C4300a0.m18620a(t);
        C4300a0.m18620a(u);
        String str = "Listener has already been released.";
        C4300a0.m18621a(t.mo17956b(), (Object) str);
        C4300a0.m18621a(u.mo17775a(), (Object) str);
        C4300a0.m18628a(t.mo17956b().equals(u.mo17775a()), (Object) "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f12835i.mo17845a(this, (C4195s<C4061b, ?>) t, (C4098b0<C4061b, ?>) u);
    }

    @C4056a
    @Deprecated
    public C4083h(@C0193h0 Context context, C4059a<O> aVar, @C0195i0 O o, Looper looper, C4221x xVar) {
        this(context, aVar, o, new C4085a().mo17689a(looper).mo17690a(xVar).mo17691a());
    }

    @C4056a
    @C0187e0
    public C4083h(@C0193h0 Activity activity, C4059a<O> aVar, @C0195i0 O o, C4084a aVar2) {
        C4300a0.m18621a(activity, (Object) "Null activity is not permitted.");
        C4300a0.m18621a(aVar, (Object) "Api must not be null.");
        C4300a0.m18621a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f12827a = activity.getApplicationContext();
        this.f12828b = aVar;
        this.f12829c = o;
        this.f12831e = aVar2.f12838b;
        this.f12830d = C4102c.m17733a(this.f12828b, this.f12829c);
        this.f12833g = new C4192r1(this);
        this.f12835i = C4137i.m17841a(this.f12827a);
        this.f12832f = this.f12835i.mo17853b();
        this.f12834h = aVar2.f12837a;
        if (!(activity instanceof GoogleApiActivity)) {
            C4128g0.m17812a(activity, this.f12835i, this.f12830d);
        }
        this.f12835i.mo17849a(this);
    }

    @C4056a
    /* renamed from: a */
    public <A extends C4061b> C5560k<Void> mo17674a(@C0193h0 C4200t<A, ?> tVar) {
        C4300a0.m18620a(tVar);
        String str = "Listener has already been released.";
        C4300a0.m18621a(tVar.f13140a.mo17956b(), (Object) str);
        C4300a0.m18621a(tVar.f13141b.mo17775a(), (Object) str);
        return this.f12835i.mo17845a(this, tVar.f13140a, tVar.f13141b);
    }

    @C4056a
    /* renamed from: a */
    public C5560k<Boolean> mo17672a(@C0193h0 C4168a<?> aVar) {
        C4300a0.m18621a(aVar, (Object) "Listener key cannot be null.");
        return this.f12835i.mo17844a(this, aVar);
    }

    @C4056a
    /* renamed from: a */
    public <L> C4167n<L> mo17671a(@C0193h0 L l, String str) {
        return C4175o.m18099b(l, this.f12831e, str);
    }

    @C0226w0
    /* renamed from: a */
    public C4071f mo17668a(Looper looper, C4138a<O> aVar) {
        return this.f12828b.mo17628d().mo10343a(this.f12827a, looper, mo17682d().mo18315a(), this.f12829c, (C4088b) aVar, (C4089c) aVar);
    }

    @C4056a
    public C4083h(@C0193h0 Context context, C4059a<O> aVar, @C0195i0 O o, C4084a aVar2) {
        C4300a0.m18621a(context, (Object) "Null context is not permitted.");
        C4300a0.m18621a(aVar, (Object) "Api must not be null.");
        C4300a0.m18621a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f12827a = context.getApplicationContext();
        this.f12828b = aVar;
        this.f12829c = o;
        this.f12831e = aVar2.f12838b;
        this.f12830d = C4102c.m17733a(this.f12828b, this.f12829c);
        this.f12833g = new C4192r1(this);
        this.f12835i = C4137i.m17841a(this.f12827a);
        this.f12832f = this.f12835i.mo17853b();
        this.f12834h = aVar2.f12837a;
        this.f12835i.mo17849a(this);
    }

    /* renamed from: a */
    public C4148j2 mo17670a(Context context, Handler handler) {
        return new C4148j2(context, handler, mo17682d().mo18315a());
    }

    @C4056a
    @Deprecated
    public C4083h(@C0193h0 Activity activity, C4059a<O> aVar, @C0195i0 O o, C4221x xVar) {
        this(activity, aVar, o, new C4085a().mo17690a(xVar).mo17689a(activity.getMainLooper()).mo17691a());
    }

    @C4056a
    @Deprecated
    public C4083h(@C0193h0 Context context, C4059a<O> aVar, @C0195i0 O o, C4221x xVar) {
        this(context, aVar, o, new C4085a().mo17690a(xVar).mo17691a());
    }
}
