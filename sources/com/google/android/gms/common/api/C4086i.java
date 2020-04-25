package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import androidx.fragment.app.C1376c;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4059a.C4063d.C4066c;
import com.google.android.gms.common.api.C4059a.C4063d.C4068e;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.internal.C4107c3;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.api.internal.C4122f;
import com.google.android.gms.common.api.internal.C4149j3;
import com.google.android.gms.common.api.internal.C4157l;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4180p;
import com.google.android.gms.common.api.internal.C4183p2;
import com.google.android.gms.common.api.internal.C4211v;
import com.google.android.gms.common.api.internal.C4232z0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4329f.C4331b;
import com.google.android.gms.common.util.C4476d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2682c;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

@C4056a
@Deprecated
/* renamed from: com.google.android.gms.common.api.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4086i {
    @C4056a

    /* renamed from: a */
    public static final String f12841a = "<<default account>>";
    /* access modifiers changed from: private */
    @C5966a("sAllClients")

    /* renamed from: b */
    public static final Set<C4086i> f12842b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public static final int f12843c = 1;

    /* renamed from: d */
    public static final int f12844d = 2;

    @C4056a
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4087a {

        /* renamed from: a */
        private Account f12845a;

        /* renamed from: b */
        private final Set<Scope> f12846b;

        /* renamed from: c */
        private final Set<Scope> f12847c;

        /* renamed from: d */
        private int f12848d;

        /* renamed from: e */
        private View f12849e;

        /* renamed from: f */
        private String f12850f;

        /* renamed from: g */
        private String f12851g;

        /* renamed from: h */
        private final Map<C4059a<?>, C4331b> f12852h;

        /* renamed from: i */
        private boolean f12853i;

        /* renamed from: j */
        private final Context f12854j;

        /* renamed from: k */
        private final Map<C4059a<?>, C4063d> f12855k;

        /* renamed from: l */
        private C4157l f12856l;

        /* renamed from: m */
        private int f12857m;

        /* renamed from: n */
        private C4089c f12858n;

        /* renamed from: o */
        private Looper f12859o;

        /* renamed from: p */
        private C4279e f12860p;

        /* renamed from: q */
        private C4060a<? extends C2683d, C2679a> f12861q;

        /* renamed from: r */
        private final ArrayList<C4088b> f12862r;

        /* renamed from: s */
        private final ArrayList<C4089c> f12863s;

        /* renamed from: t */
        private boolean f12864t;

        @C4056a
        public C4087a(@C0193h0 Context context) {
            this.f12846b = new HashSet();
            this.f12847c = new HashSet();
            this.f12852h = new C0635a();
            this.f12853i = false;
            this.f12855k = new C0635a();
            this.f12857m = -1;
            this.f12860p = C4279e.m18476a();
            this.f12861q = C2682c.f9773c;
            this.f12862r = new ArrayList<>();
            this.f12863s = new ArrayList<>();
            this.f12864t = false;
            this.f12854j = context;
            this.f12859o = context.getMainLooper();
            this.f12850f = context.getPackageName();
            this.f12851g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C4087a mo17723a(@C0193h0 Handler handler) {
            C4300a0.m18621a(handler, (Object) "Handler must not be null");
            this.f12859o = handler.getLooper();
            return this;
        }

        @C4056a
        @C4476d0
        /* renamed from: b */
        public final C4329f mo17737b() {
            C2679a aVar = C2679a.f9761U;
            if (this.f12855k.containsKey(C2682c.f9777g)) {
                aVar = (C2679a) this.f12855k.get(C2682c.f9777g);
            }
            C4329f fVar = new C4329f(this.f12845a, this.f12846b, this.f12852h, this.f12848d, this.f12849e, this.f12850f, this.f12851g, aVar, false);
            return fVar;
        }

        /* renamed from: c */
        public final C4087a mo17738c() {
            return mo17734a("<<default account>>");
        }

        /* renamed from: a */
        public final C4087a mo17732a(@C0193h0 C4088b bVar) {
            C4300a0.m18621a(bVar, (Object) "Listener must not be null");
            this.f12862r.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17733a(@C0193h0 C4089c cVar) {
            C4300a0.m18621a(cVar, (Object) "Listener must not be null");
            this.f12863s.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17724a(@C0193h0 View view) {
            C4300a0.m18621a(view, (Object) "View must not be null");
            this.f12849e = view;
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17727a(@C0193h0 Scope scope) {
            C4300a0.m18621a(scope, (Object) "Scope must not be null");
            this.f12846b.add(scope);
            return this;
        }

        @C4056a
        /* renamed from: a */
        public final C4087a mo17735a(String[] strArr) {
            for (String scope : strArr) {
                this.f12846b.add(new Scope(scope));
            }
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17728a(@C0193h0 C4059a<? extends C4068e> aVar) {
            C4300a0.m18621a(aVar, (Object) "Api must not be null");
            this.f12855k.put(aVar, null);
            List a = aVar.mo17627c().mo17424a(null);
            this.f12847c.addAll(a);
            this.f12846b.addAll(a);
            return this;
        }

        @C4056a
        public C4087a(@C0193h0 Context context, @C0193h0 C4088b bVar, @C0193h0 C4089c cVar) {
            this(context);
            C4300a0.m18621a(bVar, (Object) "Must provide a connected listener");
            this.f12862r.add(bVar);
            C4300a0.m18621a(cVar, (Object) "Must provide a connection failed listener");
            this.f12863s.add(cVar);
        }

        /* renamed from: a */
        public final C4087a mo17731a(@C0193h0 C4059a<? extends C4068e> aVar, Scope... scopeArr) {
            C4300a0.m18621a(aVar, (Object) "Api must not be null");
            this.f12855k.put(aVar, null);
            m17654a(aVar, (O) null, scopeArr);
            return this;
        }

        /* renamed from: a */
        public final <O extends C4066c> C4087a mo17729a(@C0193h0 C4059a<O> aVar, @C0193h0 O o) {
            C4300a0.m18621a(aVar, (Object) "Api must not be null");
            C4300a0.m18621a(o, (Object) "Null options are not permitted for this Api");
            this.f12855k.put(aVar, o);
            List a = aVar.mo17627c().mo17424a(o);
            this.f12847c.addAll(a);
            this.f12846b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C4066c> C4087a mo17730a(@C0193h0 C4059a<O> aVar, @C0193h0 O o, Scope... scopeArr) {
            C4300a0.m18621a(aVar, (Object) "Api must not be null");
            C4300a0.m18621a(o, (Object) "Null options are not permitted for this Api");
            this.f12855k.put(aVar, o);
            m17654a(aVar, o, scopeArr);
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17734a(String str) {
            this.f12845a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17722a(int i) {
            this.f12848d = i;
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17725a(@C0193h0 C1376c cVar, int i, @C0195i0 C4089c cVar2) {
            C4157l lVar = new C4157l((Activity) cVar);
            C4300a0.m18628a(i >= 0, (Object) "clientId must be non-negative");
            this.f12857m = i;
            this.f12858n = cVar2;
            this.f12856l = lVar;
            return this;
        }

        /* renamed from: a */
        public final C4087a mo17726a(@C0193h0 C1376c cVar, @C0195i0 C4089c cVar2) {
            return mo17725a(cVar, 0, cVar2);
        }

        /* renamed from: a */
        public final C4086i mo17736a() {
            C4300a0.m18628a(!this.f12855k.isEmpty(), (Object) "must call addApi() to add at least one API");
            C4329f b = mo17737b();
            C4059a aVar = null;
            Map g = b.mo18300g();
            C0635a aVar2 = new C0635a();
            C0635a aVar3 = new C0635a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C4059a aVar4 : this.f12855k.keySet()) {
                Object obj = this.f12855k.get(aVar4);
                boolean z2 = g.get(aVar4) != null;
                aVar2.put(aVar4, Boolean.valueOf(z2));
                C4149j3 j3Var = new C4149j3(aVar4, z2);
                arrayList.add(j3Var);
                C4060a d = aVar4.mo17628d();
                C4059a aVar5 = aVar4;
                C4071f a = d.mo10343a(this.f12854j, this.f12859o, b, obj, (C4088b) j3Var, (C4089c) j3Var);
                aVar3.put(aVar5.mo17625a(), a);
                if (d.mo17632a() == 1) {
                    z = obj != null;
                }
                if (a.mo17533f()) {
                    if (aVar == null) {
                        aVar = aVar5;
                    } else {
                        String b2 = aVar5.mo17626b();
                        String b3 = aVar.mo17626b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(" cannot be used with ");
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    C4300a0.m18633b(this.f12845a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo17626b());
                    C4300a0.m18633b(this.f12846b.equals(this.f12847c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo17626b());
                } else {
                    String b4 = aVar.mo17626b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C4232z0 z0Var = new C4232z0(this.f12854j, new ReentrantLock(), this.f12859o, b, this.f12860p, this.f12861q, aVar2, this.f12862r, this.f12863s, aVar3, this.f12857m, C4232z0.m18298a((Iterable<C4071f>) aVar3.values(), true), arrayList, false);
            synchronized (C4086i.f12842b) {
                C4086i.f12842b.add(z0Var);
            }
            if (this.f12857m >= 0) {
                C4107c3.m17745b(this.f12856l).mo17787a(this.f12857m, z0Var, this.f12858n);
            }
            return z0Var;
        }

        /* renamed from: a */
        private final <O extends C4063d> void m17654a(C4059a<O> aVar, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(aVar.mo17627c().mo17424a(o));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.f12852h.put(aVar, new C4331b(hashSet));
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4088b extends C4122f {

        /* renamed from: i */
        public static final int f12865i = 1;

        /* renamed from: j */
        public static final int f12866j = 2;
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.i$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4089c extends C4180p {
    }

    /* renamed from: b */
    public static void m17621b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (f12842b) {
            int i = 0;
            String concat = String.valueOf(str).concat("  ");
            for (C4086i iVar : f12842b) {
                int i2 = i + 1;
                printWriter.append(str).append("GoogleApiClient#").println(i);
                iVar.mo17701a(concat, fileDescriptor, printWriter, strArr);
                i = i2;
            }
        }
    }

    @C4056a
    /* renamed from: k */
    public static Set<C4086i> m17622k() {
        Set<C4086i> set;
        synchronized (f12842b) {
            set = f12842b;
        }
        return set;
    }

    /* renamed from: a */
    public abstract ConnectionResult mo17692a();

    /* renamed from: a */
    public abstract ConnectionResult mo17693a(long j, @C0193h0 TimeUnit timeUnit);

    @C0193h0
    /* renamed from: a */
    public abstract ConnectionResult mo17694a(@C0193h0 C4059a<?> aVar);

    @C4056a
    /* renamed from: a */
    public <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17696a(@C0193h0 T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo17699a(@C0193h0 C1376c cVar);

    /* renamed from: a */
    public abstract void mo17701a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public abstract boolean mo17702a(@C0193h0 C4088b bVar);

    /* renamed from: a */
    public abstract boolean mo17703a(@C0193h0 C4089c cVar);

    /* renamed from: b */
    public abstract C4237l<Status> mo17706b();

    /* renamed from: b */
    public abstract void mo17707b(@C0193h0 C4088b bVar);

    /* renamed from: b */
    public abstract void mo17708b(@C0193h0 C4089c cVar);

    /* renamed from: c */
    public abstract void mo17711c();

    /* renamed from: c */
    public abstract void mo17712c(@C0193h0 C4088b bVar);

    /* renamed from: c */
    public abstract void mo17713c(@C0193h0 C4089c cVar);

    /* renamed from: c */
    public abstract boolean mo17714c(@C0193h0 C4059a<?> aVar);

    /* renamed from: d */
    public abstract void mo17715d();

    @C4056a
    /* renamed from: e */
    public Context mo17716e() {
        throw new UnsupportedOperationException();
    }

    @C4056a
    /* renamed from: f */
    public Looper mo17717f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract boolean mo17718g();

    /* renamed from: h */
    public abstract boolean mo17719h();

    @C4056a
    /* renamed from: i */
    public void mo17720i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public abstract void mo17721j();

    @C4056a
    /* renamed from: a */
    public <L> C4167n<L> mo17697a(@C0193h0 L l) {
        throw new UnsupportedOperationException();
    }

    @C0193h0
    @C4056a
    /* renamed from: a */
    public <C extends C4071f> C mo17695a(@C0193h0 C4062c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @C4056a
    /* renamed from: a */
    public boolean mo17704a(C4211v vVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo17698a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo17700a(C4183p2 p2Var) {
        throw new UnsupportedOperationException();
    }

    @C4056a
    /* renamed from: b */
    public <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17705b(@C0193h0 T t) {
        throw new UnsupportedOperationException();
    }

    @C4056a
    /* renamed from: b */
    public boolean mo17710b(@C0193h0 C4059a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo17709b(C4183p2 p2Var) {
        throw new UnsupportedOperationException();
    }
}
