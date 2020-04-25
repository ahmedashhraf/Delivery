package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.collection.C0637b;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4086i.C4087a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.C4476d0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p201f.p202a.C5952h;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4329f {

    /* renamed from: l */
    public static final String f13453l = "com.google.android.gms.common.internal.ClientSettings.sessionId";

    /* renamed from: a */
    private final Account f13454a;

    /* renamed from: b */
    private final Set<Scope> f13455b;

    /* renamed from: c */
    private final Set<Scope> f13456c;

    /* renamed from: d */
    private final Map<C4059a<?>, C4331b> f13457d;

    /* renamed from: e */
    private final int f13458e;

    /* renamed from: f */
    private final View f13459f;

    /* renamed from: g */
    private final String f13460g;

    /* renamed from: h */
    private final String f13461h;

    /* renamed from: i */
    private final C2679a f13462i;

    /* renamed from: j */
    private final boolean f13463j;

    /* renamed from: k */
    private Integer f13464k;

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.f$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4330a {

        /* renamed from: a */
        private Account f13465a;

        /* renamed from: b */
        private C0637b<Scope> f13466b;

        /* renamed from: c */
        private Map<C4059a<?>, C4331b> f13467c;

        /* renamed from: d */
        private int f13468d = 0;

        /* renamed from: e */
        private View f13469e;

        /* renamed from: f */
        private String f13470f;

        /* renamed from: g */
        private String f13471g;

        /* renamed from: h */
        private C2679a f13472h = C2679a.f9761U;

        /* renamed from: i */
        private boolean f13473i;

        /* renamed from: a */
        public final C4330a mo18308a(Account account) {
            this.f13465a = account;
            return this;
        }

        @C4056a
        /* renamed from: b */
        public final C4330a mo18317b(String str) {
            this.f13470f = str;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18311a(Scope scope) {
            if (this.f13466b == null) {
                this.f13466b = new C0637b<>();
            }
            this.f13466b.add(scope);
            return this;
        }

        /* renamed from: b */
        public final C4330a mo18316b() {
            this.f13473i = true;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18313a(Collection<Scope> collection) {
            if (this.f13466b == null) {
                this.f13466b = new C0637b<>();
            }
            this.f13466b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18314a(Map<C4059a<?>, C4331b> map) {
            this.f13467c = map;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18307a(int i) {
            this.f13468d = i;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18309a(View view) {
            this.f13469e = view;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18312a(String str) {
            this.f13471g = str;
            return this;
        }

        /* renamed from: a */
        public final C4330a mo18310a(C2679a aVar) {
            this.f13472h = aVar;
            return this;
        }

        @C4056a
        /* renamed from: a */
        public final C4329f mo18315a() {
            C4329f fVar = new C4329f(this.f13465a, this.f13466b, this.f13467c, this.f13468d, this.f13469e, this.f13470f, this.f13471g, this.f13472h, this.f13473i);
            return fVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.f$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C4331b {

        /* renamed from: a */
        public final Set<Scope> f13474a;

        public C4331b(Set<Scope> set) {
            C4300a0.m18620a(set);
            this.f13474a = Collections.unmodifiableSet(set);
        }
    }

    @C4056a
    public C4329f(Account account, Set<Scope> set, Map<C4059a<?>, C4331b> map, int i, View view, String str, String str2, C2679a aVar) {
        this(account, set, map, i, view, str, str2, aVar, false);
    }

    @C4056a
    /* renamed from: a */
    public static C4329f m18746a(Context context) {
        return new C4087a(context).mo17737b();
    }

    @C4056a
    @C5952h
    @Deprecated
    /* renamed from: b */
    public final String mo18295b() {
        Account account = this.f13454a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @C4056a
    /* renamed from: c */
    public final Account mo18296c() {
        Account account = this.f13454a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @C4056a
    /* renamed from: d */
    public final Set<Scope> mo18297d() {
        return this.f13456c;
    }

    @C5952h
    /* renamed from: e */
    public final Integer mo18298e() {
        return this.f13464k;
    }

    @C4056a
    /* renamed from: f */
    public final int mo18299f() {
        return this.f13458e;
    }

    /* renamed from: g */
    public final Map<C4059a<?>, C4331b> mo18300g() {
        return this.f13457d;
    }

    @C5952h
    /* renamed from: h */
    public final String mo18301h() {
        return this.f13461h;
    }

    @C4056a
    @C5952h
    /* renamed from: i */
    public final String mo18302i() {
        return this.f13460g;
    }

    @C4056a
    /* renamed from: j */
    public final Set<Scope> mo18303j() {
        return this.f13455b;
    }

    @C5952h
    /* renamed from: k */
    public final C2679a mo18304k() {
        return this.f13462i;
    }

    @C4056a
    @C5952h
    /* renamed from: l */
    public final View mo18305l() {
        return this.f13459f;
    }

    /* renamed from: m */
    public final boolean mo18306m() {
        return this.f13463j;
    }

    public C4329f(Account account, Set<Scope> set, Map<C4059a<?>, C4331b> map, int i, View view, String str, String str2, C2679a aVar, boolean z) {
        this.f13454a = account;
        this.f13455b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f13457d = map;
        this.f13459f = view;
        this.f13458e = i;
        this.f13460g = str;
        this.f13461h = str2;
        this.f13462i = aVar;
        this.f13463j = z;
        HashSet hashSet = new HashSet(this.f13455b);
        for (C4331b bVar : this.f13457d.values()) {
            hashSet.addAll(bVar.f13474a);
        }
        this.f13456c = Collections.unmodifiableSet(hashSet);
    }

    @C4056a
    @C5952h
    /* renamed from: a */
    public final Account mo18292a() {
        return this.f13454a;
    }

    /* renamed from: a */
    public final void mo18294a(Integer num) {
        this.f13464k = num;
    }

    @C4056a
    /* renamed from: a */
    public final Set<Scope> mo18293a(C4059a<?> aVar) {
        C4331b bVar = (C4331b) this.f13457d.get(aVar);
        if (bVar == null || bVar.f13474a.isEmpty()) {
            return this.f13455b;
        }
        HashSet hashSet = new HashSet(this.f13455b);
        hashSet.addAll(bVar.f13474a);
        return hashSet;
    }
}
