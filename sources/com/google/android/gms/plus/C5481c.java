package com.google.android.gms.plus;

import com.google.android.gms.common.C4420j;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4063d.C4069f;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.plus.C5090h;
import com.google.android.gms.internal.plus.C5093k;
import com.google.android.gms.internal.plus.C5094l;
import com.google.android.gms.internal.plus.C5095m;
import com.google.android.gms.plus.internal.C5521h;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.google.android.gms.plus.c */
public final class C5481c {

    /* renamed from: a */
    public static final C4072g<C5521h> f15740a = new C4072g<>();

    /* renamed from: b */
    private static final C4060a<C5521h, C5482a> f15741b = new C5528j();
    @Deprecated

    /* renamed from: c */
    public static final C4059a<C5482a> f15742c = new C4059a<>("Plus.API", f15741b, f15740a);
    @Deprecated

    /* renamed from: d */
    public static final Scope f15743d = new Scope("https://www.googleapis.com/auth/plus.login");
    @Deprecated

    /* renamed from: e */
    public static final Scope f15744e = new Scope(C4420j.f13556e);
    @Deprecated

    /* renamed from: f */
    public static final C5478b f15745f = new C5095m();
    @Deprecated

    /* renamed from: g */
    public static final C5477a f15746g = new C5090h();
    @Deprecated

    /* renamed from: h */
    private static final C5513i f15747h = new C5094l();

    /* renamed from: i */
    private static final C5512h f15748i = new C5093k();

    @Deprecated
    /* renamed from: com.google.android.gms.plus.c$a */
    public static final class C5482a implements C4069f {

        /* renamed from: a */
        private final String f15749a;

        /* renamed from: b */
        final Set<String> f15750b;

        @Deprecated
        /* renamed from: com.google.android.gms.plus.c$a$a */
        public static final class C5483a {

            /* renamed from: a */
            String f15751a;

            /* renamed from: b */
            final Set<String> f15752b = new HashSet();

            @Deprecated
            /* renamed from: a */
            public final C5483a mo21890a(String str) {
                this.f15751a = str;
                return this;
            }

            @Deprecated
            @C4476d0
            /* renamed from: a */
            public final C5483a mo21891a(String... strArr) {
                C4300a0.m18621a(strArr, (Object) "activityTypes may not be null.");
                for (String add : strArr) {
                    this.f15752b.add(add);
                }
                return this;
            }

            @Deprecated
            @C4476d0
            /* renamed from: a */
            public final C5482a mo21892a() {
                return new C5482a(this, null);
            }
        }

        private C5482a() {
            this.f15749a = null;
            this.f15750b = new HashSet();
        }

        private C5482a(C5483a aVar) {
            this.f15749a = aVar.f15751a;
            this.f15750b = aVar.f15752b;
        }

        /* synthetic */ C5482a(C5483a aVar, C5528j jVar) {
            this(aVar);
        }

        /* synthetic */ C5482a(C5528j jVar) {
            this();
        }

        @Deprecated
        @C4476d0
        /* renamed from: a */
        public static C5483a m23896a() {
            return new C5483a();
        }
    }

    /* renamed from: com.google.android.gms.plus.c$b */
    public static abstract class C5484b<R extends C4246q> extends C4116a<R, C5521h> {
        public C5484b(C4086i iVar) {
            super((C4062c<A>) C5481c.f15740a, iVar);
        }
    }

    private C5481c() {
    }

    /* renamed from: a */
    public static C5521h m23895a(C4086i iVar, boolean z) {
        C4300a0.m18628a(iVar != null, (Object) "GoogleApiClient parameter is required.");
        C4300a0.m18632b(iVar.mo17718g(), "GoogleApiClient must be connected.");
        C4300a0.m18632b(iVar.mo17710b(f15742c), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean c = iVar.mo17714c(f15742c);
        if (z && !c) {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        } else if (c) {
            return (C5521h) iVar.mo17695a((C4062c<C>) f15740a);
        } else {
            return null;
        }
    }
}
