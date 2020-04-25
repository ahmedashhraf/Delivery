package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4802a;
import com.google.android.gms.internal.measurement.C4801i4.C4804c;
import java.util.List;
import kotlin.p217i1.C14662d0;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C4842l0 {

    /* renamed from: com.google.android.gms.internal.measurement.l0$a */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4843a extends C4801i4<C4843a, C4844a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4843a zzi;
        private static volatile C4684a6<C4843a> zzj;
        private int zzc;
        private int zzd;
        private C4912p4<C4852e> zze = C4801i4.m20295n();
        private C4912p4<C4845b> zzf = C4801i4.m20295n();
        private boolean zzg;
        private boolean zzh;

        /* renamed from: com.google.android.gms.internal.measurement.l0$a$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4844a extends C4802a<C4843a, C4844a> implements C4994t5 {
            private C4844a() {
                super(C4843a.zzi);
            }

            /* renamed from: a */
            public final int mo19195a() {
                return ((C4843a) this.f14185b).mo19192q();
            }

            /* renamed from: b */
            public final C4845b mo19199b(int i) {
                return ((C4843a) this.f14185b).mo19189c(i);
            }

            /* renamed from: l */
            public final int mo19200l() {
                return ((C4843a) this.f14185b).mo19194s();
            }

            /* synthetic */ C4844a(C4869m0 m0Var) {
                this();
            }

            /* renamed from: a */
            public final C4852e mo19198a(int i) {
                return ((C4843a) this.f14185b).mo19188b(i);
            }

            /* renamed from: a */
            public final C4844a mo19197a(int i, C4853a aVar) {
                mo19065g();
                ((C4843a) this.f14185b).m20525a(i, aVar);
                return this;
            }

            /* renamed from: a */
            public final C4844a mo19196a(int i, C4846a aVar) {
                mo19065g();
                ((C4843a) this.f14185b).m20524a(i, aVar);
                return this;
            }
        }

        static {
            C4843a aVar = new C4843a();
            zzi = aVar;
            C4801i4.m20291a(C4843a.class, aVar);
        }

        private C4843a() {
        }

        /* renamed from: a */
        public final boolean mo19187a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: b */
        public final C4852e mo19188b(int i) {
            return (C4852e) this.zze.get(i);
        }

        /* renamed from: c */
        public final C4845b mo19189c(int i) {
            return (C4845b) this.zzf.get(i);
        }

        /* renamed from: o */
        public final int mo19190o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final List<C4852e> mo19191p() {
            return this.zze;
        }

        /* renamed from: q */
        public final int mo19192q() {
            return this.zze.size();
        }

        /* renamed from: r */
        public final List<C4845b> mo19193r() {
            return this.zzf;
        }

        /* renamed from: s */
        public final int mo19194s() {
            return this.zzf.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20525a(int i, C4853a aVar) {
            if (!this.zze.mo19360a()) {
                this.zze = C4801i4.m20287a(this.zze);
            }
            this.zze.set(i, (C4852e) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20524a(int i, C4846a aVar) {
            if (!this.zzf.mo19360a()) {
                this.zzf = C4801i4.m20287a(this.zzf);
            }
            this.zzf.set(i, (C4845b) aVar.mo19056B());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4843a();
                case 2:
                    return new C4844a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", C4852e.class, "zzf", C4845b.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C4684a6<C4843a> a6Var = zzj;
                    if (a6Var == null) {
                        synchronized (C4843a.class) {
                            a6Var = zzj;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzi);
                                zzj = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.l0$b */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4845b extends C4801i4<C4845b, C4846a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4845b zzl;
        private static volatile C4684a6<C4845b> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private C4912p4<C4847c> zzf = C4801i4.m20295n();
        private boolean zzg;
        private C4849d zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* renamed from: com.google.android.gms.internal.measurement.l0$b$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4846a extends C4802a<C4845b, C4846a> implements C4994t5 {
            private C4846a() {
                super(C4845b.zzl);
            }

            /* renamed from: a */
            public final String mo19216a() {
                return ((C4845b) this.f14185b).mo19204p();
            }

            /* renamed from: l */
            public final int mo19217l() {
                return ((C4845b) this.f14185b).mo19206r();
            }

            /* synthetic */ C4846a(C4869m0 m0Var) {
                this();
            }

            /* renamed from: a */
            public final C4846a mo19214a(String str) {
                mo19065g();
                ((C4845b) this.f14185b).m20547a(str);
                return this;
            }

            /* renamed from: a */
            public final C4847c mo19215a(int i) {
                return ((C4845b) this.f14185b).mo19202b(i);
            }

            /* renamed from: a */
            public final C4846a mo19213a(int i, C4847c cVar) {
                mo19065g();
                ((C4845b) this.f14185b).m20544a(i, cVar);
                return this;
            }
        }

        static {
            C4845b bVar = new C4845b();
            zzl = bVar;
            C4801i4.m20291a(C4845b.class, bVar);
        }

        private C4845b() {
        }

        /* renamed from: y */
        public static C4846a m20548y() {
            return (C4846a) zzl.mo19050h();
        }

        /* renamed from: a */
        public final boolean mo19201a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: b */
        public final C4847c mo19202b(int i) {
            return (C4847c) this.zzf.get(i);
        }

        /* renamed from: o */
        public final int mo19203o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final String mo19204p() {
            return this.zze;
        }

        /* renamed from: q */
        public final List<C4847c> mo19205q() {
            return this.zzf;
        }

        /* renamed from: r */
        public final int mo19206r() {
            return this.zzf.size();
        }

        /* renamed from: s */
        public final boolean mo19207s() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: t */
        public final C4849d mo19208t() {
            C4849d dVar = this.zzh;
            return dVar == null ? C4849d.m20581x() : dVar;
        }

        /* renamed from: u */
        public final boolean mo19209u() {
            return this.zzi;
        }

        /* renamed from: v */
        public final boolean mo19210v() {
            return this.zzj;
        }

        /* renamed from: w */
        public final boolean mo19211w() {
            return (this.zzc & 64) != 0;
        }

        /* renamed from: x */
        public final boolean mo19212x() {
            return this.zzk;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20547a(String str) {
            if (str != null) {
                this.zzc |= 2;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20544a(int i, C4847c cVar) {
            if (cVar != null) {
                if (!this.zzf.mo19360a()) {
                    this.zzf = C4801i4.m20287a(this.zzf);
                }
                this.zzf.set(i, cVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4845b();
                case 2:
                    return new C4846a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C4847c.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    C4684a6<C4845b> a6Var = zzm;
                    if (a6Var == null) {
                        synchronized (C4845b.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.l0$c */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4847c extends C4801i4<C4847c, C4848a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4847c zzh;
        private static volatile C4684a6<C4847c> zzi;
        private int zzc;
        private C4854f zzd;
        private C4849d zze;
        private boolean zzf;
        private String zzg = "";

        /* renamed from: com.google.android.gms.internal.measurement.l0$c$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4848a extends C4802a<C4847c, C4848a> implements C4994t5 {
            private C4848a() {
                super(C4847c.zzh);
            }

            /* renamed from: a */
            public final C4848a mo19214a(String str) {
                mo19065g();
                ((C4847c) this.f14185b).m20569a(str);
                return this;
            }

            /* synthetic */ C4848a(C4869m0 m0Var) {
                this();
            }
        }

        static {
            C4847c cVar = new C4847c();
            zzh = cVar;
            C4801i4.m20291a(C4847c.class, cVar);
        }

        private C4847c() {
        }

        /* renamed from: u */
        public static C4847c m20570u() {
            return zzh;
        }

        /* renamed from: a */
        public final boolean mo19218a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final C4854f mo19219o() {
            C4854f fVar = this.zzd;
            return fVar == null ? C4854f.m20611v() : fVar;
        }

        /* renamed from: p */
        public final boolean mo19220p() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: q */
        public final C4849d mo19221q() {
            C4849d dVar = this.zze;
            return dVar == null ? C4849d.m20581x() : dVar;
        }

        /* renamed from: r */
        public final boolean mo19222r() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: s */
        public final boolean mo19223s() {
            return this.zzf;
        }

        /* renamed from: t */
        public final String mo19224t() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20569a(String str) {
            if (str != null) {
                this.zzc |= 8;
                this.zzg = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4847c();
                case 2:
                    return new C4848a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C4684a6<C4847c> a6Var = zzi;
                    if (a6Var == null) {
                        synchronized (C4847c.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.l0$d */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4849d extends C4801i4<C4849d, C4851b> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4849d zzi;
        private static volatile C4684a6<C4849d> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf;
        private String zzg;
        private String zzh;

        /* renamed from: com.google.android.gms.internal.measurement.l0$d$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public enum C4850a implements C4873m4 {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final C4860l4<C4850a> zzf = null;
            private final int zzg;

            static {
                zzf = new C4895o0();
            }

            private C4850a(int i) {
                this.zzg = i;
            }

            /* renamed from: i */
            public static C4899o4 m20595i() {
                return C4882n0.f14282a;
            }

            /* renamed from: a */
            public final int mo19235a() {
                return this.zzg;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C4850a.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzg);
                sb.append(" name=");
                sb.append(name());
                sb.append(C14662d0.f42854e);
                return sb.toString();
            }

            /* renamed from: a */
            public static C4850a m20594a(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.l0$d$b */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4851b extends C4802a<C4849d, C4851b> implements C4994t5 {
            private C4851b() {
                super(C4849d.zzi);
            }

            /* synthetic */ C4851b(C4869m0 m0Var) {
                this();
            }
        }

        static {
            C4849d dVar = new C4849d();
            zzi = dVar;
            C4801i4.m20291a(C4849d.class, dVar);
        }

        private C4849d() {
            String str = "";
            this.zzf = str;
            this.zzg = str;
            this.zzh = str;
        }

        /* renamed from: x */
        public static C4849d m20581x() {
            return zzi;
        }

        /* renamed from: a */
        public final boolean mo19225a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final C4850a mo19226o() {
            C4850a a = C4850a.m20594a(this.zzd);
            return a == null ? C4850a.UNKNOWN_COMPARISON_TYPE : a;
        }

        /* renamed from: p */
        public final boolean mo19227p() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: q */
        public final boolean mo19228q() {
            return this.zze;
        }

        /* renamed from: r */
        public final boolean mo19229r() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: s */
        public final String mo19230s() {
            return this.zzf;
        }

        /* renamed from: t */
        public final boolean mo19231t() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: u */
        public final String mo19232u() {
            return this.zzg;
        }

        /* renamed from: v */
        public final boolean mo19233v() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: w */
        public final String mo19234w() {
            return this.zzh;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4849d();
                case 2:
                    return new C4851b(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", C4850a.m20595i(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C4684a6<C4849d> a6Var = zzj;
                    if (a6Var == null) {
                        synchronized (C4849d.class) {
                            a6Var = zzj;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzi);
                                zzj = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.l0$e */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4852e extends C4801i4<C4852e, C4853a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4852e zzj;
        private static volatile C4684a6<C4852e> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private C4847c zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        /* renamed from: com.google.android.gms.internal.measurement.l0$e$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4853a extends C4802a<C4852e, C4853a> implements C4994t5 {
            private C4853a() {
                super(C4852e.zzj);
            }

            /* renamed from: a */
            public final C4853a mo19214a(String str) {
                mo19065g();
                ((C4852e) this.f14185b).m20598a(str);
                return this;
            }

            /* synthetic */ C4853a(C4869m0 m0Var) {
                this();
            }
        }

        static {
            C4852e eVar = new C4852e();
            zzj = eVar;
            C4801i4.m20291a(C4852e.class, eVar);
        }

        private C4852e() {
        }

        /* renamed from: v */
        public static C4853a m20599v() {
            return (C4853a) zzj.mo19050h();
        }

        /* renamed from: a */
        public final boolean mo19237a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final int mo19238o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final String mo19239p() {
            return this.zze;
        }

        /* renamed from: q */
        public final C4847c mo19240q() {
            C4847c cVar = this.zzf;
            return cVar == null ? C4847c.m20570u() : cVar;
        }

        /* renamed from: r */
        public final boolean mo19241r() {
            return this.zzg;
        }

        /* renamed from: s */
        public final boolean mo19242s() {
            return this.zzh;
        }

        /* renamed from: t */
        public final boolean mo19243t() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: u */
        public final boolean mo19244u() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m20598a(String str) {
            if (str != null) {
                this.zzc |= 2;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4852e();
                case 2:
                    return new C4853a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    C4684a6<C4852e> a6Var = zzk;
                    if (a6Var == null) {
                        synchronized (C4852e.class) {
                            a6Var = zzk;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzj);
                                zzk = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.l0$f */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4854f extends C4801i4<C4854f, C4855a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4854f zzh;
        private static volatile C4684a6<C4854f> zzi;
        private int zzc;
        private int zzd;
        private String zze = "";
        private boolean zzf;
        private C4912p4<String> zzg = C4801i4.m20295n();

        /* renamed from: com.google.android.gms.internal.measurement.l0$f$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4855a extends C4802a<C4854f, C4855a> implements C4994t5 {
            private C4855a() {
                super(C4854f.zzh);
            }

            /* synthetic */ C4855a(C4869m0 m0Var) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.l0$f$b */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public enum C4856b implements C4873m4 {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final C4860l4<C4856b> zzh = null;
            private final int zzi;

            static {
                zzh = new C4908p0();
            }

            private C4856b(int i) {
                this.zzi = i;
            }

            /* renamed from: i */
            public static C4899o4 m20623i() {
                return C4940r0.f14382a;
            }

            /* renamed from: a */
            public final int mo19235a() {
                return this.zzi;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C4856b.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzi);
                sb.append(" name=");
                sb.append(name());
                sb.append(C14662d0.f42854e);
                return sb.toString();
            }

            /* renamed from: a */
            public static C4856b m20622a(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        static {
            C4854f fVar = new C4854f();
            zzh = fVar;
            C4801i4.m20291a(C4854f.class, fVar);
        }

        private C4854f() {
        }

        /* renamed from: v */
        public static C4854f m20611v() {
            return zzh;
        }

        /* renamed from: a */
        public final boolean mo19245a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final C4856b mo19246o() {
            C4856b a = C4856b.m20622a(this.zzd);
            return a == null ? C4856b.UNKNOWN_MATCH_TYPE : a;
        }

        /* renamed from: p */
        public final boolean mo19247p() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: q */
        public final String mo19248q() {
            return this.zze;
        }

        /* renamed from: r */
        public final boolean mo19249r() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: s */
        public final boolean mo19250s() {
            return this.zzf;
        }

        /* renamed from: t */
        public final List<String> mo19251t() {
            return this.zzg;
        }

        /* renamed from: u */
        public final int mo19252u() {
            return this.zzg.size();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C4869m0.f14256a[i - 1]) {
                case 1:
                    return new C4854f();
                case 2:
                    return new C4855a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C4856b.m20623i(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C4684a6<C4854f> a6Var = zzi;
                    if (a6Var == null) {
                        synchronized (C4854f.class) {
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
}
