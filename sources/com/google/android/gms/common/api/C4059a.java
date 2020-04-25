package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.internal.C4122f;
import com.google.android.gms.common.api.internal.C4180p;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4314e.C4317c;
import com.google.android.gms.common.internal.C4314e.C4319e;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4375p;
import com.google.android.gms.common.util.C4476d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4059a<O extends C4063d> {

    /* renamed from: a */
    private final C4060a<?, O> f12792a;

    /* renamed from: b */
    private final C4074i<?, O> f12793b = null;

    /* renamed from: c */
    private final C4072g<?> f12794c;

    /* renamed from: d */
    private final C4075j<?> f12795d;

    /* renamed from: e */
    private final String f12796e;

    @C4056a
    @C4476d0
    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4060a<T extends C4071f, O> extends C4070e<T, O> {
        @C4056a
        @Deprecated
        /* renamed from: a */
        public T mo10343a(Context context, Looper looper, C4329f fVar, O o, C4088b bVar, C4089c cVar) {
            return mo17629a(context, looper, fVar, o, (C4122f) bVar, (C4180p) cVar);
        }

        @C4056a
        /* renamed from: a */
        public T mo17629a(Context context, Looper looper, C4329f fVar, O o, C4122f fVar2, C4180p pVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4061b {
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4062c<C extends C4061b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4063d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C4064a extends C4066c, C4068e {
            /* renamed from: e */
            Account mo17630e();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C4065b extends C4066c {
            /* renamed from: a */
            GoogleSignInAccount mo17631a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C4066c extends C4063d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static final class C4067d implements C4068e {
            private C4067d() {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C4068e extends C4063d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$f */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C4069f extends C4066c, C4068e {
        }
    }

    @C4056a
    @C4476d0
    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4070e<T extends C4061b, O> {
        @C4056a

        /* renamed from: a */
        public static final int f12797a = 1;
        @C4056a

        /* renamed from: b */
        public static final int f12798b = 2;
        @C4056a

        /* renamed from: c */
        public static final int f12799c = Integer.MAX_VALUE;

        @C4056a
        /* renamed from: a */
        public int mo17632a() {
            return Integer.MAX_VALUE;
        }

        @C4056a
        /* renamed from: a */
        public List<Scope> mo17424a(O o) {
            return Collections.emptyList();
        }
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4071f extends C4061b {
        @C4056a
        /* renamed from: a */
        void mo17633a();

        @C4056a
        /* renamed from: a */
        void mo17634a(C4317c cVar);

        @C4056a
        /* renamed from: a */
        void mo17635a(C4319e eVar);

        @C4056a
        /* renamed from: a */
        void mo17636a(C4375p pVar, Set<Scope> set);

        @C4056a
        /* renamed from: a */
        void mo17637a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        @C4056a
        /* renamed from: d */
        boolean mo17638d();

        @C4056a
        /* renamed from: e */
        boolean mo17639e();

        @C4056a
        /* renamed from: f */
        boolean mo17533f();

        @C0193h0
        @C4056a
        /* renamed from: g */
        Set<Scope> mo17640g();

        @C4056a
        /* renamed from: h */
        String mo17641h();

        @C4056a
        boolean isConnected();

        @C4056a
        /* renamed from: j */
        Feature[] mo17643j();

        @C4056a
        /* renamed from: k */
        boolean mo17644k();

        @C4056a
        /* renamed from: l */
        int mo10085l();

        @C4056a
        /* renamed from: m */
        Feature[] mo17645m();

        @C4056a
        /* renamed from: n */
        Intent mo17534n();

        @C4056a
        /* renamed from: o */
        boolean mo17646o();

        @C4056a
        @C0195i0
        /* renamed from: p */
        IBinder mo17647p();
    }

    @C4056a
    @C4476d0
    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4072g<C extends C4071f> extends C4062c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4073h<T extends IInterface> extends C4061b {
        /* renamed from: a */
        T mo17648a(IBinder iBinder);

        /* renamed from: a */
        void mo17649a(int i, T t);

        /* renamed from: c */
        Context mo17650c();

        /* renamed from: q */
        String mo17651q();

        /* renamed from: r */
        String mo17652r();
    }

    @C4476d0
    /* renamed from: com.google.android.gms.common.api.a$i */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4074i<T extends C4073h<? extends IInterface>, O> extends C4070e<T, O> {
    }

    @C4476d0
    /* renamed from: com.google.android.gms.common.api.a$j */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4075j<C extends C4073h<? extends IInterface>> extends C4062c<C> {
    }

    public <C extends C4071f> C4059a(String str, C4060a<C, O> aVar, C4072g<C> gVar) {
        C4300a0.m18621a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C4300a0.m18621a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f12796e = str;
        this.f12792a = aVar;
        this.f12794c = gVar;
        this.f12795d = null;
    }

    /* renamed from: a */
    public final C4062c<?> mo17625a() {
        C4072g<?> gVar = this.f12794c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo17626b() {
        return this.f12796e;
    }

    /* renamed from: c */
    public final C4070e<?, O> mo17627c() {
        return this.f12792a;
    }

    /* renamed from: d */
    public final C4060a<?, O> mo17628d() {
        C4300a0.m18632b(this.f12792a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f12792a;
    }
}
