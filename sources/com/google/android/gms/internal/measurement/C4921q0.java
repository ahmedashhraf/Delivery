package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4802a;
import com.google.android.gms.internal.measurement.C4801i4.C4804c;
import com.google.android.gms.internal.measurement.C4842l0.C4843a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C4921q0 {

    /* renamed from: com.google.android.gms.internal.measurement.q0$a */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4922a extends C4801i4<C4922a, C4923a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4922a zzh;
        private static volatile C4684a6<C4922a> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.q0$a$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4923a extends C4802a<C4922a, C4923a> implements C4994t5 {
            private C4923a() {
                super(C4922a.zzh);
            }

            /* renamed from: a */
            public final String mo19372a() {
                return ((C4922a) this.f14185b).mo19367a();
            }

            /* renamed from: l */
            public final boolean mo19373l() {
                return ((C4922a) this.f14185b).mo19368o();
            }

            /* renamed from: m */
            public final boolean mo19374m() {
                return ((C4922a) this.f14185b).mo19369p();
            }

            /* renamed from: n */
            public final boolean mo19375n() {
                return ((C4922a) this.f14185b).mo19370q();
            }

            /* renamed from: o */
            public final int mo19376o() {
                return ((C4922a) this.f14185b).mo19371r();
            }

            /* synthetic */ C4923a(C4953s0 s0Var) {
                this();
            }

            /* renamed from: a */
            public final C4923a mo19214a(String str) {
                mo19065g();
                ((C4922a) this.f14185b).m20968a(str);
                return this;
            }
        }

        static {
            C4922a aVar = new C4922a();
            zzh = aVar;
            C4801i4.m20291a(C4922a.class, aVar);
        }

        private C4922a() {
        }

        /* renamed from: a */
        public final String mo19367a() {
            return this.zzd;
        }

        /* renamed from: o */
        public final boolean mo19368o() {
            return this.zze;
        }

        /* renamed from: p */
        public final boolean mo19369p() {
            return this.zzf;
        }

        /* renamed from: q */
        public final boolean mo19370q() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: r */
        public final int mo19371r() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20968a(String str) {
            if (str != null) {
                this.zzc |= 1;
                this.zzd = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4953s0.f14395a[i - 1]) {
                case 1:
                    return new C4922a();
                case 2:
                    return new C4923a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C4684a6<C4922a> a6Var = zzi;
                    if (a6Var == null) {
                        synchronized (C4922a.class) {
                            a6Var = zzi;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzh);
                                zzi = a6Var;
                            }
                        }
                    }
                    return a6Var;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.q0$b */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4924b extends C4801i4<C4924b, C4925a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4924b zzl;
        private static volatile C4684a6<C4924b> zzm;
        private int zzc;
        private long zzd;
        private String zze;
        private int zzf;
        private C4912p4<C4926c> zzg = C4801i4.m20295n();
        private C4912p4<C4922a> zzh = C4801i4.m20295n();
        private C4912p4<C4843a> zzi = C4801i4.m20295n();
        private String zzj;
        private boolean zzk;

        /* renamed from: com.google.android.gms.internal.measurement.q0$b$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4925a extends C4802a<C4924b, C4925a> implements C4994t5 {
            private C4925a() {
                super(C4924b.zzl);
            }

            /* renamed from: a */
            public final int mo19386a() {
                return ((C4924b) this.f14185b).mo19383s();
            }

            /* renamed from: l */
            public final List<C4843a> mo19389l() {
                return Collections.unmodifiableList(((C4924b) this.f14185b).mo19384t());
            }

            /* renamed from: m */
            public final C4925a mo19390m() {
                mo19065g();
                ((C4924b) this.f14185b).m20988y();
                return this;
            }

            /* synthetic */ C4925a(C4953s0 s0Var) {
                this();
            }

            /* renamed from: a */
            public final C4922a mo19387a(int i) {
                return ((C4924b) this.f14185b).mo19378b(i);
            }

            /* renamed from: a */
            public final C4925a mo19388a(int i, C4923a aVar) {
                mo19065g();
                ((C4924b) this.f14185b).m20982a(i, aVar);
                return this;
            }
        }

        static {
            C4924b bVar = new C4924b();
            zzl = bVar;
            C4801i4.m20291a(C4924b.class, bVar);
        }

        private C4924b() {
            String str = "";
            this.zze = str;
            this.zzj = str;
        }

        /* renamed from: v */
        public static C4925a m20985v() {
            return (C4925a) zzl.mo19050h();
        }

        /* renamed from: w */
        public static C4924b m20986w() {
            return zzl;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m20988y() {
            this.zzi = C4801i4.m20295n();
        }

        /* renamed from: a */
        public final boolean mo19377a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: b */
        public final C4922a mo19378b(int i) {
            return (C4922a) this.zzh.get(i);
        }

        /* renamed from: o */
        public final long mo19379o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final boolean mo19380p() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: q */
        public final String mo19381q() {
            return this.zze;
        }

        /* renamed from: r */
        public final List<C4926c> mo19382r() {
            return this.zzg;
        }

        /* renamed from: s */
        public final int mo19383s() {
            return this.zzh.size();
        }

        /* renamed from: t */
        public final List<C4843a> mo19384t() {
            return this.zzi;
        }

        /* renamed from: u */
        public final boolean mo19385u() {
            return this.zzk;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20982a(int i, C4923a aVar) {
            if (!this.zzh.mo19360a()) {
                this.zzh = C4801i4.m20287a(this.zzh);
            }
            this.zzh.set(i, (C4922a) aVar.mo19056B());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4953s0.f14395a[i - 1]) {
                case 1:
                    return new C4924b();
                case 2:
                    return new C4925a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C4926c.class, "zzh", C4922a.class, "zzi", C4843a.class, "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    C4684a6<C4924b> a6Var = zzm;
                    if (a6Var == null) {
                        synchronized (C4924b.class) {
                            a6Var = zzm;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzl);
                                zzm = a6Var;
                            }
                        }
                    }
                    return a6Var;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.q0$c */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4926c extends C4801i4<C4926c, C4927a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4926c zzf;
        private static volatile C4684a6<C4926c> zzg;
        private int zzc;
        private String zzd;
        private String zze;

        /* renamed from: com.google.android.gms.internal.measurement.q0$c$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4927a extends C4802a<C4926c, C4927a> implements C4994t5 {
            private C4927a() {
                super(C4926c.zzf);
            }

            /* synthetic */ C4927a(C4953s0 s0Var) {
                this();
            }
        }

        static {
            C4926c cVar = new C4926c();
            zzf = cVar;
            C4801i4.m20291a(C4926c.class, cVar);
        }

        private C4926c() {
            String str = "";
            this.zzd = str;
            this.zze = str;
        }

        /* renamed from: a */
        public final String mo19391a() {
            return this.zzd;
        }

        /* renamed from: o */
        public final String mo19392o() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4953s0.f14395a[i - 1]) {
                case 1:
                    return new C4926c();
                case 2:
                    return new C4927a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C4684a6<C4926c> a6Var = zzg;
                    if (a6Var == null) {
                        synchronized (C4926c.class) {
                            a6Var = zzg;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzf);
                                zzg = a6Var;
                            }
                        }
                    }
                    return a6Var;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
