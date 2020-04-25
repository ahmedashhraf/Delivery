package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4802a;
import com.google.android.gms.internal.measurement.C4801i4.C4804c;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Collections;
import java.util.List;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.google.android.gms.internal.measurement.t0 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C4966t0 {

    /* renamed from: com.google.android.gms.internal.measurement.t0$a */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4967a extends C4801i4<C4967a, C4968a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4967a zzh;
        private static volatile C4684a6<C4967a> zzi;
        private int zzc;
        private int zzd;
        private C4984i zze;
        private C4984i zzf;
        private boolean zzg;

        /* renamed from: com.google.android.gms.internal.measurement.t0$a$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4968a extends C4802a<C4967a, C4968a> implements C4994t5 {
            private C4968a() {
                super(C4967a.zzh);
            }

            /* renamed from: a */
            public final C4968a mo19462a(int i) {
                mo19065g();
                ((C4967a) this.f14185b).m21122b(i);
                return this;
            }

            /* renamed from: l */
            public final boolean mo19467l() {
                return ((C4967a) this.f14185b).mo19458q();
            }

            /* renamed from: m */
            public final C4984i mo19468m() {
                return ((C4967a) this.f14185b).mo19459r();
            }

            /* synthetic */ C4968a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4984i mo19466a() {
                return ((C4967a) this.f14185b).mo19457p();
            }

            /* renamed from: a */
            public final C4968a mo19463a(C4985a aVar) {
                mo19065g();
                ((C4967a) this.f14185b).m21119a(aVar);
                return this;
            }

            /* renamed from: a */
            public final C4968a mo19464a(C4984i iVar) {
                mo19065g();
                ((C4967a) this.f14185b).m21120a(iVar);
                return this;
            }

            /* renamed from: a */
            public final C4968a mo19465a(boolean z) {
                mo19065g();
                ((C4967a) this.f14185b).m21121a(z);
                return this;
            }
        }

        static {
            C4967a aVar = new C4967a();
            zzh = aVar;
            C4801i4.m20291a(C4967a.class, aVar);
        }

        private C4967a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21122b(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: u */
        public static C4968a m21123u() {
            return (C4968a) zzh.mo19050h();
        }

        /* renamed from: a */
        public final boolean mo19455a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final int mo19456o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final C4984i mo19457p() {
            C4984i iVar = this.zze;
            return iVar == null ? C4984i.m21499w() : iVar;
        }

        /* renamed from: q */
        public final boolean mo19458q() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: r */
        public final C4984i mo19459r() {
            C4984i iVar = this.zzf;
            return iVar == null ? C4984i.m21499w() : iVar;
        }

        /* renamed from: s */
        public final boolean mo19460s() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: t */
        public final boolean mo19461t() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21119a(C4985a aVar) {
            this.zze = (C4984i) aVar.mo19056B();
            this.zzc |= 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21120a(C4984i iVar) {
            if (iVar != null) {
                this.zzf = iVar;
                this.zzc |= 4;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21121a(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4967a();
                case 2:
                    return new C4968a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C4684a6<C4967a> a6Var = zzi;
                    if (a6Var == null) {
                        synchronized (C4967a.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$b */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4969b extends C4801i4<C4969b, C4970a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4969b zzf;
        private static volatile C4684a6<C4969b> zzg;
        private int zzc;
        private int zzd;
        private long zze;

        /* renamed from: com.google.android.gms.internal.measurement.t0$b$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4970a extends C4802a<C4969b, C4970a> implements C4994t5 {
            private C4970a() {
                super(C4969b.zzf);
            }

            /* renamed from: a */
            public final C4970a mo19473a(int i) {
                mo19065g();
                ((C4969b) this.f14185b).m21143b(i);
                return this;
            }

            /* synthetic */ C4970a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4970a mo19474a(long j) {
                mo19065g();
                ((C4969b) this.f14185b).m21140a(j);
                return this;
            }
        }

        static {
            C4969b bVar = new C4969b();
            zzf = bVar;
            C4801i4.m20291a(C4969b.class, bVar);
        }

        private C4969b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21143b(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: r */
        public static C4970a m21144r() {
            return (C4970a) zzf.mo19050h();
        }

        /* renamed from: a */
        public final boolean mo19469a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final int mo19470o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final boolean mo19471p() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: q */
        public final long mo19472q() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21140a(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4969b();
                case 2:
                    return new C4970a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C4684a6<C4969b> a6Var = zzg;
                    if (a6Var == null) {
                        synchronized (C4969b.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$c */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4971c extends C4801i4<C4971c, C4972a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4971c zzi;
        private static volatile C4684a6<C4971c> zzj;
        private int zzc;
        private C4912p4<C4975e> zzd = C4801i4.m20295n();
        private String zze = "";
        private long zzf;
        private long zzg;
        private int zzh;

        /* renamed from: com.google.android.gms.internal.measurement.t0$c$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4972a extends C4802a<C4971c, C4972a> implements C4994t5 {
            private C4972a() {
                super(C4971c.zzi);
            }

            /* renamed from: a */
            public final List<C4975e> mo19491a() {
                return Collections.unmodifiableList(((C4971c) this.f14185b).mo19475a());
            }

            /* renamed from: b */
            public final C4972a mo19492b(int i) {
                mo19065g();
                ((C4971c) this.f14185b).m21168c(i);
                return this;
            }

            /* renamed from: l */
            public final int mo19494l() {
                return ((C4971c) this.f14185b).mo19477o();
            }

            /* renamed from: m */
            public final String mo19495m() {
                return ((C4971c) this.f14185b).mo19478p();
            }

            /* renamed from: n */
            public final boolean mo19496n() {
                return ((C4971c) this.f14185b).mo19479q();
            }

            /* renamed from: o */
            public final long mo19497o() {
                return ((C4971c) this.f14185b).mo19480r();
            }

            /* renamed from: p */
            public final long mo19498p() {
                return ((C4971c) this.f14185b).mo19482t();
            }

            /* synthetic */ C4972a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: b */
            public final C4972a mo19493b(long j) {
                mo19065g();
                ((C4971c) this.f14185b).m21166b(j);
                return this;
            }

            /* renamed from: a */
            public final C4975e mo19490a(int i) {
                return ((C4971c) this.f14185b).mo19476b(i);
            }

            /* renamed from: a */
            public final C4972a mo19486a(int i, C4975e eVar) {
                mo19065g();
                ((C4971c) this.f14185b).m21154a(i, eVar);
                return this;
            }

            /* renamed from: a */
            public final C4972a mo19485a(int i, C4976a aVar) {
                mo19065g();
                ((C4971c) this.f14185b).m21153a(i, aVar);
                return this;
            }

            /* renamed from: a */
            public final C4972a mo19489a(C4975e eVar) {
                mo19065g();
                ((C4971c) this.f14185b).m21164a(eVar);
                return this;
            }

            /* renamed from: a */
            public final C4972a mo19488a(C4976a aVar) {
                mo19065g();
                ((C4971c) this.f14185b).m21163a(aVar);
                return this;
            }

            /* renamed from: a */
            public final C4972a mo19214a(String str) {
                mo19065g();
                ((C4971c) this.f14185b).m21165a(str);
                return this;
            }

            /* renamed from: a */
            public final C4972a mo19487a(long j) {
                mo19065g();
                ((C4971c) this.f14185b).m21155a(j);
                return this;
            }
        }

        static {
            C4971c cVar = new C4971c();
            zzi = cVar;
            C4801i4.m20291a(C4971c.class, cVar);
        }

        private C4971c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21168c(int i) {
            m21171y();
            this.zzd.remove(i);
        }

        /* renamed from: w */
        public static C4972a m21169w() {
            return (C4972a) zzi.mo19050h();
        }

        /* renamed from: y */
        private final void m21171y() {
            if (!this.zzd.mo19360a()) {
                this.zzd = C4801i4.m20287a(this.zzd);
            }
        }

        /* renamed from: a */
        public final List<C4975e> mo19475a() {
            return this.zzd;
        }

        /* renamed from: b */
        public final C4975e mo19476b(int i) {
            return (C4975e) this.zzd.get(i);
        }

        /* renamed from: o */
        public final int mo19477o() {
            return this.zzd.size();
        }

        /* renamed from: p */
        public final String mo19478p() {
            return this.zze;
        }

        /* renamed from: q */
        public final boolean mo19479q() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: r */
        public final long mo19480r() {
            return this.zzf;
        }

        /* renamed from: s */
        public final boolean mo19481s() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: t */
        public final long mo19482t() {
            return this.zzg;
        }

        /* renamed from: u */
        public final boolean mo19483u() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: v */
        public final int mo19484v() {
            return this.zzh;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21154a(int i, C4975e eVar) {
            if (eVar != null) {
                m21171y();
                this.zzd.set(i, eVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21166b(long j) {
            this.zzc |= 4;
            this.zzg = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21153a(int i, C4976a aVar) {
            m21171y();
            this.zzd.set(i, (C4975e) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21164a(C4975e eVar) {
            if (eVar != null) {
                m21171y();
                this.zzd.add(eVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21163a(C4976a aVar) {
            m21171y();
            this.zzd.add((C4975e) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21165a(String str) {
            if (str != null) {
                this.zzc |= 1;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21155a(long j) {
            this.zzc |= 2;
            this.zzf = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4971c();
                case 2:
                    return new C4972a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", C4975e.class, "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C4684a6<C4971c> a6Var = zzj;
                    if (a6Var == null) {
                        synchronized (C4971c.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$d */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4973d extends C4801i4<C4973d, C4974a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4973d zzf;
        private static volatile C4684a6<C4973d> zzg;
        private int zzc;
        private String zzd = "";
        private long zze;

        /* renamed from: com.google.android.gms.internal.measurement.t0$d$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4974a extends C4802a<C4973d, C4974a> implements C4994t5 {
            private C4974a() {
                super(C4973d.zzf);
            }

            /* renamed from: a */
            public final C4974a mo19214a(String str) {
                mo19065g();
                ((C4973d) this.f14185b).m21202a(str);
                return this;
            }

            /* synthetic */ C4974a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4974a mo19499a(long j) {
                mo19065g();
                ((C4973d) this.f14185b).m21199a(j);
                return this;
            }
        }

        static {
            C4973d dVar = new C4973d();
            zzf = dVar;
            C4801i4.m20291a(C4973d.class, dVar);
        }

        private C4973d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21202a(String str) {
            if (str != null) {
                this.zzc |= 1;
                this.zzd = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21199a(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* renamed from: a */
        public static C4974a m21198a() {
            return (C4974a) zzf.mo19050h();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4973d();
                case 2:
                    return new C4974a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C4684a6<C4973d> a6Var = zzg;
                    if (a6Var == null) {
                        synchronized (C4973d.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$e */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4975e extends C4801i4<C4975e, C4976a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4975e zzi;
        private static volatile C4684a6<C4975e> zzj;
        private int zzc;
        private String zzd;
        private String zze;
        private long zzf;
        private float zzg;
        private double zzh;

        /* renamed from: com.google.android.gms.internal.measurement.t0$e$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4976a extends C4802a<C4975e, C4976a> implements C4994t5 {
            private C4976a() {
                super(C4975e.zzi);
            }

            /* renamed from: a */
            public final C4976a mo19214a(String str) {
                mo19065g();
                ((C4975e) this.f14185b).m21213a(str);
                return this;
            }

            /* renamed from: b */
            public final C4976a mo19510b(String str) {
                mo19065g();
                ((C4975e) this.f14185b).m21216b(str);
                return this;
            }

            /* renamed from: l */
            public final C4976a mo19511l() {
                mo19065g();
                ((C4975e) this.f14185b).m21221x();
                return this;
            }

            /* renamed from: m */
            public final C4976a mo19512m() {
                mo19065g();
                ((C4975e) this.f14185b).m21222y();
                return this;
            }

            /* synthetic */ C4976a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4976a mo19507a() {
                mo19065g();
                ((C4975e) this.f14185b).m21220w();
                return this;
            }

            /* renamed from: a */
            public final C4976a mo19509a(long j) {
                mo19065g();
                ((C4975e) this.f14185b).m21208a(j);
                return this;
            }

            /* renamed from: a */
            public final C4976a mo19508a(double d) {
                mo19065g();
                ((C4975e) this.f14185b).m21207a(d);
                return this;
            }
        }

        static {
            C4975e eVar = new C4975e();
            zzi = eVar;
            C4801i4.m20291a(C4975e.class, eVar);
        }

        private C4975e() {
            String str = "";
            this.zzd = str;
            this.zze = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21216b(String str) {
            if (str != null) {
                this.zzc |= 2;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: u */
        public static C4976a m21218u() {
            return (C4976a) zzi.mo19050h();
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public final void m21220w() {
            this.zzc &= -3;
            this.zze = zzi.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public final void m21221x() {
            this.zzc &= -5;
            this.zzf = 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m21222y() {
            this.zzc &= -17;
            this.zzh = 0.0d;
        }

        /* renamed from: a */
        public final String mo19500a() {
            return this.zzd;
        }

        /* renamed from: o */
        public final boolean mo19501o() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: p */
        public final String mo19502p() {
            return this.zze;
        }

        /* renamed from: q */
        public final boolean mo19503q() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: r */
        public final long mo19504r() {
            return this.zzf;
        }

        /* renamed from: s */
        public final boolean mo19505s() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: t */
        public final double mo19506t() {
            return this.zzh;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21213a(String str) {
            if (str != null) {
                this.zzc |= 1;
                this.zzd = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21208a(long j) {
            this.zzc |= 4;
            this.zzf = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21207a(double d) {
            this.zzc |= 16;
            this.zzh = d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4975e();
                case 2:
                    return new C4976a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C4684a6<C4975e> a6Var = zzj;
                    if (a6Var == null) {
                        synchronized (C4975e.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$f */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4977f extends C4801i4<C4977f, C4978a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4977f zzd;
        private static volatile C4684a6<C4977f> zze;
        private C4912p4<C4979g> zzc = C4801i4.m20295n();

        /* renamed from: com.google.android.gms.internal.measurement.t0$f$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4978a extends C4802a<C4977f, C4978a> implements C4994t5 {
            private C4978a() {
                super(C4977f.zzd);
            }

            /* renamed from: a */
            public final C4979g mo19516a(int i) {
                return ((C4977f) this.f14185b).mo19514b(0);
            }

            /* synthetic */ C4978a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4978a mo19515a(C4980a aVar) {
                mo19065g();
                ((C4977f) this.f14185b).m21239a(aVar);
                return this;
            }
        }

        static {
            C4977f fVar = new C4977f();
            zzd = fVar;
            C4801i4.m20291a(C4977f.class, fVar);
        }

        private C4977f() {
        }

        /* renamed from: o */
        public static C4978a m21240o() {
            return (C4978a) zzd.mo19050h();
        }

        /* renamed from: a */
        public final List<C4979g> mo19513a() {
            return this.zzc;
        }

        /* renamed from: b */
        public final C4979g mo19514b(int i) {
            return (C4979g) this.zzc.get(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21239a(C4980a aVar) {
            if (!this.zzc.mo19360a()) {
                this.zzc = C4801i4.m20287a(this.zzc);
            }
            this.zzc.add((C4979g) aVar.mo19056B());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4977f();
                case 2:
                    return new C4978a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C4979g.class});
                case 4:
                    return zzd;
                case 5:
                    C4684a6<C4977f> a6Var = zze;
                    if (a6Var == null) {
                        synchronized (C4977f.class) {
                            a6Var = zze;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzd);
                                zze = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$g */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4979g extends C4801i4<C4979g, C4980a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4979g zzav;
        private static volatile C4684a6<C4979g> zzaw;
        private int zzaa;
        private String zzab;
        private String zzac;
        private boolean zzad;
        private C4912p4<C4967a> zzae;
        private String zzaf;
        private int zzag;
        private int zzah;
        private int zzai;
        private String zzaj;
        private long zzak;
        private long zzal;
        private String zzam;
        private String zzan;
        private int zzao;
        private String zzap;
        private C4981h zzaq;
        private C4886n4 zzar;
        private long zzas;
        private long zzat;
        private String zzau;
        private int zzc;
        private int zzd;
        private int zze;
        private C4912p4<C4971c> zzf = C4801i4.m20295n();
        private C4912p4<C4988k> zzg = C4801i4.m20295n();
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private String zzm;
        private String zzn;
        private String zzo;
        private String zzp;
        private int zzq;
        private String zzr;
        private String zzs;
        private String zzt;
        private long zzu;
        private long zzv;
        private String zzw;
        private boolean zzx;
        private String zzy;
        private long zzz;

        /* renamed from: com.google.android.gms.internal.measurement.t0$g$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4980a extends C4802a<C4979g, C4980a> implements C4994t5 {
            private C4980a() {
                super(C4979g.zzav);
            }

            /* renamed from: a */
            public final C4980a mo19575a(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21288d(1);
                return this;
            }

            /* renamed from: b */
            public final C4971c mo19586b(int i) {
                return ((C4979g) this.f14185b).mo19545b(i);
            }

            /* renamed from: c */
            public final C4980a mo19591c(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21297e(i);
                return this;
            }

            /* renamed from: d */
            public final C4988k mo19598d(int i) {
                return ((C4979g) this.f14185b).mo19547c(i);
            }

            /* renamed from: e */
            public final C4980a mo19600e(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21298e(j);
                return this;
            }

            /* renamed from: f */
            public final C4980a mo19604f(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21310f(str);
                return this;
            }

            /* renamed from: g */
            public final C4980a mo19607g(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21315g(str);
                return this;
            }

            /* renamed from: h */
            public final C4980a mo19610h(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21320h(str);
                return this;
            }

            /* renamed from: i */
            public final C4980a mo19612i(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21325i(str);
                return this;
            }

            /* renamed from: j */
            public final C4980a mo19614j(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21329j(str);
                return this;
            }

            /* renamed from: k */
            public final C4980a mo19616k(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21333k(str);
                return this;
            }

            /* renamed from: l */
            public final int mo19617l() {
                return ((C4979g) this.f14185b).mo19540X();
            }

            /* renamed from: m */
            public final C4980a mo19620m() {
                mo19065g();
                ((C4979g) this.f14185b).m21347u0();
                return this;
            }

            /* renamed from: n */
            public final List<C4988k> mo19623n() {
                return Collections.unmodifiableList(((C4979g) this.f14185b).mo19541Y());
            }

            /* renamed from: o */
            public final int mo19624o() {
                return ((C4979g) this.f14185b).mo19542Z();
            }

            /* renamed from: p */
            public final long mo19626p() {
                return ((C4979g) this.f14185b).mo19549d0();
            }

            /* renamed from: q */
            public final long mo19627q() {
                return ((C4979g) this.f14185b).mo19551f0();
            }

            /* renamed from: r */
            public final C4980a mo19628r() {
                mo19065g();
                ((C4979g) this.f14185b).m21349w0();
                return this;
            }

            /* renamed from: s */
            public final C4980a mo19629s() {
                mo19065g();
                ((C4979g) this.f14185b).m21350x0();
                return this;
            }

            /* renamed from: t */
            public final String mo19630t() {
                return ((C4979g) this.f14185b).mo19561o0();
            }

            /* renamed from: u */
            public final C4980a mo19631u() {
                mo19065g();
                ((C4979g) this.f14185b).m21351y0();
                return this;
            }

            /* renamed from: v */
            public final String mo19632v() {
                return ((C4979g) this.f14185b).mo19519C();
            }

            /* renamed from: w */
            public final C4980a mo19633w() {
                mo19065g();
                ((C4979g) this.f14185b).m21352z0();
                return this;
            }

            /* renamed from: x */
            public final C4980a mo19634x() {
                mo19065g();
                ((C4979g) this.f14185b).m21247A0();
                return this;
            }

            /* synthetic */ C4980a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: b */
            public final C4980a mo19588b(Iterable<? extends C4988k> iterable) {
                mo19065g();
                ((C4979g) this.f14185b).m21277b(iterable);
                return this;
            }

            /* renamed from: d */
            public final C4980a mo19595d(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21289d(j);
                return this;
            }

            /* renamed from: l */
            public final C4980a mo19619l(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21337l(str);
                return this;
            }

            /* renamed from: o */
            public final C4980a mo19625o(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21343o(str);
                return this;
            }

            /* renamed from: a */
            public final List<C4971c> mo19585a() {
                return Collections.unmodifiableList(((C4979g) this.f14185b).mo19539W());
            }

            /* renamed from: c */
            public final C4980a mo19592c(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21280c(j);
                return this;
            }

            /* renamed from: e */
            public final C4980a mo19599e(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21304f(i);
                return this;
            }

            /* renamed from: f */
            public final C4980a mo19603f(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21305f(j);
                return this;
            }

            /* renamed from: g */
            public final C4980a mo19606g(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21312g(j);
                return this;
            }

            /* renamed from: h */
            public final C4980a mo19609h(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21317h(j);
                return this;
            }

            /* renamed from: i */
            public final C4980a mo19611i(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21322i(j);
                return this;
            }

            /* renamed from: j */
            public final C4980a mo19613j(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21326j(j);
                return this;
            }

            /* renamed from: k */
            public final C4980a mo19615k(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21330k(j);
                return this;
            }

            /* renamed from: m */
            public final C4980a mo19621m(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21339m(str);
                return this;
            }

            /* renamed from: b */
            public final C4980a mo19587b(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21270b(j);
                return this;
            }

            /* renamed from: d */
            public final C4980a mo19597d(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21296d(str);
                return this;
            }

            /* renamed from: l */
            public final C4980a mo19618l(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21334l(j);
                return this;
            }

            /* renamed from: n */
            public final C4980a mo19622n(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21341n(null);
                return this;
            }

            /* renamed from: c */
            public final C4980a mo19594c(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21287c(str);
                return this;
            }

            /* renamed from: e */
            public final C4980a mo19601e(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21303e(str);
                return this;
            }

            /* renamed from: f */
            public final C4980a mo19602f(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21311g(i);
                return this;
            }

            /* renamed from: g */
            public final C4980a mo19605g(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21316h(i);
                return this;
            }

            /* renamed from: h */
            public final C4980a mo19608h(int i) {
                mo19065g();
                ((C4979g) this.f14185b).m21321i(i);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19576a(int i, C4972a aVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21248a(i, aVar);
                return this;
            }

            /* renamed from: b */
            public final C4980a mo19589b(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21278b(str);
                return this;
            }

            /* renamed from: d */
            public final C4980a mo19596d(Iterable<? extends Integer> iterable) {
                mo19065g();
                ((C4979g) this.f14185b).m21295d(iterable);
                return this;
            }

            /* renamed from: c */
            public final C4980a mo19593c(Iterable<? extends C4967a> iterable) {
                mo19065g();
                ((C4979g) this.f14185b).m21286c(iterable);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19579a(C4972a aVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21251a(aVar);
                return this;
            }

            /* renamed from: b */
            public final C4980a mo19590b(boolean z) {
                mo19065g();
                ((C4979g) this.f14185b).m21279b(z);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19583a(Iterable<? extends C4971c> iterable) {
                mo19065g();
                ((C4979g) this.f14185b).m21267a(iterable);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19577a(int i, C4988k kVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21249a(i, kVar);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19582a(C4988k kVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21266a(kVar);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19581a(C4989a aVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21265a(aVar);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19578a(long j) {
                mo19065g();
                ((C4979g) this.f14185b).m21250a(j);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19214a(String str) {
                mo19065g();
                ((C4979g) this.f14185b).m21268a(str);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19584a(boolean z) {
                mo19065g();
                ((C4979g) this.f14185b).m21269a(z);
                return this;
            }

            /* renamed from: a */
            public final C4980a mo19580a(C4983b bVar) {
                mo19065g();
                ((C4979g) this.f14185b).m21264a(bVar);
                return this;
            }
        }

        static {
            C4979g gVar = new C4979g();
            zzav = gVar;
            C4801i4.m20291a(C4979g.class, gVar);
        }

        private C4979g() {
            String str = "";
            this.zzm = str;
            this.zzn = str;
            this.zzo = str;
            this.zzp = str;
            this.zzr = str;
            this.zzs = str;
            this.zzt = str;
            this.zzw = str;
            this.zzy = str;
            this.zzab = str;
            this.zzac = str;
            this.zzae = C4801i4.m20295n();
            this.zzaf = str;
            this.zzaj = str;
            this.zzam = str;
            this.zzan = str;
            this.zzap = str;
            this.zzar = C4801i4.m20293l();
            this.zzau = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: A0 */
        public final void m21247A0() {
            this.zzc &= Integer.MAX_VALUE;
            this.zzam = zzav.zzam;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21288d(int i) {
            this.zzc |= 1;
            this.zze = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m21297e(int i) {
            m21346t0();
            this.zzf.remove(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m21304f(int i) {
            this.zzc |= 1024;
            this.zzq = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m21315g(String str) {
            if (str != null) {
                this.zzc |= 8192;
                this.zzt = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m21320h(String str) {
            if (str != null) {
                this.zzc |= 65536;
                this.zzw = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m21325i(String str) {
            if (str != null) {
                this.zzc |= 262144;
                this.zzy = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final void m21329j(String str) {
            if (str != null) {
                this.zzc |= 2097152;
                this.zzab = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final void m21333k(String str) {
            if (str != null) {
                this.zzc |= 4194304;
                this.zzac = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m21337l(String str) {
            if (str != null) {
                this.zzc |= 16777216;
                this.zzaf = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m21339m(String str) {
            if (str != null) {
                this.zzc |= 268435456;
                this.zzaj = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m21341n(String str) {
            if (str != null) {
                this.zzc |= Integer.MIN_VALUE;
                this.zzam = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: r0 */
        public static C4980a m21344r0() {
            return (C4980a) zzav.mo19050h();
        }

        /* renamed from: t0 */
        private final void m21346t0() {
            if (!this.zzf.mo19360a()) {
                this.zzf = C4801i4.m20287a(this.zzf);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u0 */
        public final void m21347u0() {
            this.zzf = C4801i4.m20295n();
        }

        /* renamed from: v0 */
        private final void m21348v0() {
            if (!this.zzg.mo19360a()) {
                this.zzg = C4801i4.m20287a(this.zzg);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w0 */
        public final void m21349w0() {
            this.zzc &= -17;
            this.zzk = 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: x0 */
        public final void m21350x0() {
            this.zzc &= -33;
            this.zzl = 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: y0 */
        public final void m21351y0() {
            this.zzc &= -2097153;
            this.zzab = zzav.zzab;
        }

        /* access modifiers changed from: private */
        /* renamed from: z0 */
        public final void m21352z0() {
            this.zzae = C4801i4.m20295n();
        }

        /* renamed from: A */
        public final String mo19517A() {
            return this.zzab;
        }

        /* renamed from: B */
        public final boolean mo19518B() {
            return (this.zzc & 1024) != 0;
        }

        /* renamed from: C */
        public final String mo19519C() {
            return this.zzac;
        }

        /* renamed from: D */
        public final boolean mo19520D() {
            return (this.zzc & 8388608) != 0;
        }

        /* renamed from: E */
        public final boolean mo19521E() {
            return this.zzad;
        }

        /* renamed from: F */
        public final String mo19522F() {
            return this.zzp;
        }

        /* renamed from: G */
        public final List<C4967a> mo19523G() {
            return this.zzae;
        }

        /* renamed from: H */
        public final String mo19524H() {
            return this.zzaf;
        }

        /* renamed from: I */
        public final boolean mo19525I() {
            return (this.zzc & MediaHttpDownloader.f20486j) != 0;
        }

        /* renamed from: J */
        public final int mo19526J() {
            return this.zzag;
        }

        /* renamed from: K */
        public final String mo19527K() {
            return this.zzaj;
        }

        /* renamed from: L */
        public final boolean mo19528L() {
            return (this.zzc & 536870912) != 0;
        }

        /* renamed from: M */
        public final long mo19529M() {
            return this.zzak;
        }

        /* renamed from: N */
        public final boolean mo19530N() {
            return (this.zzc & C6637f.f18605b) != 0;
        }

        /* renamed from: O */
        public final long mo19531O() {
            return this.zzal;
        }

        /* renamed from: P */
        public final String mo19532P() {
            return this.zzam;
        }

        /* renamed from: Q */
        public final boolean mo19533Q() {
            return (this.zzd & 2) != 0;
        }

        /* renamed from: R */
        public final int mo19534R() {
            return this.zze;
        }

        /* renamed from: S */
        public final int mo19535S() {
            return this.zzao;
        }

        /* renamed from: T */
        public final String mo19536T() {
            return this.zzap;
        }

        /* renamed from: U */
        public final boolean mo19537U() {
            return (this.zzd & 16) != 0;
        }

        /* renamed from: V */
        public final long mo19538V() {
            return this.zzas;
        }

        /* renamed from: W */
        public final List<C4971c> mo19539W() {
            return this.zzf;
        }

        /* renamed from: X */
        public final int mo19540X() {
            return this.zzf.size();
        }

        /* renamed from: Y */
        public final List<C4988k> mo19541Y() {
            return this.zzg;
        }

        /* renamed from: Z */
        public final int mo19542Z() {
            return this.zzg.size();
        }

        /* renamed from: a */
        public final boolean mo19543a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: a0 */
        public final boolean mo19544a0() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: b */
        public final C4971c mo19545b(int i) {
            return (C4971c) this.zzf.get(i);
        }

        /* renamed from: b0 */
        public final long mo19546b0() {
            return this.zzh;
        }

        /* renamed from: c */
        public final C4988k mo19547c(int i) {
            return (C4988k) this.zzg.get(i);
        }

        /* renamed from: c0 */
        public final boolean mo19548c0() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: d0 */
        public final long mo19549d0() {
            return this.zzi;
        }

        /* renamed from: e0 */
        public final boolean mo19550e0() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: f0 */
        public final long mo19551f0() {
            return this.zzj;
        }

        /* renamed from: g0 */
        public final boolean mo19552g0() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: h0 */
        public final long mo19553h0() {
            return this.zzk;
        }

        /* renamed from: i0 */
        public final boolean mo19554i0() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: j0 */
        public final long mo19555j0() {
            return this.zzl;
        }

        /* renamed from: k0 */
        public final String mo19556k0() {
            return this.zzm;
        }

        /* renamed from: l0 */
        public final String mo19557l0() {
            return this.zzn;
        }

        /* renamed from: m0 */
        public final String mo19558m0() {
            return this.zzo;
        }

        /* renamed from: n0 */
        public final String mo19559n0() {
            return this.zzr;
        }

        /* renamed from: o */
        public final int mo19560o() {
            return this.zzq;
        }

        /* renamed from: o0 */
        public final String mo19561o0() {
            return this.zzs;
        }

        /* renamed from: p */
        public final long mo19562p() {
            return this.zzu;
        }

        /* renamed from: p0 */
        public final String mo19563p0() {
            return this.zzt;
        }

        /* renamed from: q */
        public final boolean mo19564q() {
            return (this.zzc & 32768) != 0;
        }

        /* renamed from: q0 */
        public final boolean mo19565q0() {
            return (this.zzc & 16384) != 0;
        }

        /* renamed from: r */
        public final long mo19566r() {
            return this.zzv;
        }

        /* renamed from: s */
        public final String mo19567s() {
            return this.zzw;
        }

        /* renamed from: t */
        public final boolean mo19568t() {
            return (this.zzc & 131072) != 0;
        }

        /* renamed from: u */
        public final boolean mo19569u() {
            return this.zzx;
        }

        /* renamed from: v */
        public final String mo19570v() {
            return this.zzy;
        }

        /* renamed from: w */
        public final boolean mo19571w() {
            return (this.zzc & 524288) != 0;
        }

        /* renamed from: x */
        public final long mo19572x() {
            return this.zzz;
        }

        /* renamed from: y */
        public final boolean mo19573y() {
            return (this.zzc & 1048576) != 0;
        }

        /* renamed from: z */
        public final int mo19574z() {
            return this.zzaa;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21248a(int i, C4972a aVar) {
            m21346t0();
            this.zzf.set(i, (C4971c) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21277b(Iterable<? extends C4988k> iterable) {
            m21348v0();
            C4910p2.m20917a(iterable, this.zzg);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21280c(long j) {
            this.zzc |= 8;
            this.zzj = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m21343o(String str) {
            if (str != null) {
                this.zzd |= 4;
                this.zzap = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21289d(long j) {
            this.zzc |= 16;
            this.zzk = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m21298e(long j) {
            this.zzc |= 32;
            this.zzl = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m21310f(String str) {
            if (str != null) {
                this.zzc |= 4096;
                this.zzs = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21251a(C4972a aVar) {
            m21346t0();
            this.zzf.add((C4971c) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21270b(long j) {
            this.zzc |= 4;
            this.zzi = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21287c(String str) {
            if (str != null) {
                this.zzc |= 256;
                this.zzo = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m21312g(long j) {
            this.zzc |= 32768;
            this.zzv = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m21317h(long j) {
            this.zzc |= 524288;
            this.zzz = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m21322i(long j) {
            this.zzc |= 536870912;
            this.zzak = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final void m21326j(long j) {
            this.zzc |= C6637f.f18605b;
            this.zzal = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final void m21330k(long j) {
            this.zzd |= 16;
            this.zzas = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m21334l(long j) {
            this.zzd |= 32;
            this.zzat = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21296d(String str) {
            if (str != null) {
                this.zzc |= 512;
                this.zzp = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m21303e(String str) {
            if (str != null) {
                this.zzc |= 2048;
                this.zzr = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21267a(Iterable<? extends C4971c> iterable) {
            m21346t0();
            C4910p2.m20917a(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21278b(String str) {
            if (str != null) {
                this.zzc |= 128;
                this.zzn = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m21305f(long j) {
            this.zzc |= 16384;
            this.zzu = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m21311g(int i) {
            this.zzc |= 1048576;
            this.zzaa = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m21316h(int i) {
            this.zzc |= MediaHttpDownloader.f20486j;
            this.zzag = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m21321i(int i) {
            this.zzd |= 2;
            this.zzao = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21286c(Iterable<? extends C4967a> iterable) {
            if (!this.zzae.mo19360a()) {
                this.zzae = C4801i4.m20287a(this.zzae);
            }
            C4910p2.m20917a(iterable, this.zzae);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21249a(int i, C4988k kVar) {
            if (kVar != null) {
                m21348v0();
                this.zzg.set(i, kVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21295d(Iterable<? extends Integer> iterable) {
            if (!this.zzar.mo19360a()) {
                C4886n4 n4Var = this.zzar;
                int size = n4Var.size();
                this.zzar = n4Var.mo19168e(size == 0 ? 10 : size << 1);
            }
            C4910p2.m20917a(iterable, this.zzar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21279b(boolean z) {
            this.zzc |= 8388608;
            this.zzad = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21266a(C4988k kVar) {
            if (kVar != null) {
                m21348v0();
                this.zzg.add(kVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21265a(C4989a aVar) {
            m21348v0();
            this.zzg.add((C4988k) aVar.mo19056B());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21250a(long j) {
            this.zzc |= 2;
            this.zzh = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21268a(String str) {
            if (str != null) {
                this.zzc |= 64;
                this.zzm = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21269a(boolean z) {
            this.zzc |= 131072;
            this.zzx = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21264a(C4983b bVar) {
            this.zzaq = (C4981h) bVar.mo19056B();
            this.zzd |= 8;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4979g();
                case 2:
                    return new C4980a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzav, "\u0001+\u0000\u0002\u00012+\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019 \u0004\u001a!\u0004\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f&\b '\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%2\b&", new Object[]{"zzc", "zzd", "zze", "zzf", C4971c.class, "zzg", C4988k.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", C4967a.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau"});
                case 4:
                    return zzav;
                case 5:
                    C4684a6<C4979g> a6Var = zzaw;
                    if (a6Var == null) {
                        synchronized (C4979g.class) {
                            a6Var = zzaw;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzav);
                                zzaw = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$h */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4981h extends C4801i4<C4981h, C4983b> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4981h zzf;
        private static volatile C4684a6<C4981h> zzg;
        private int zzc;
        private int zzd = 1;
        private C4912p4<C4973d> zze = C4801i4.m20295n();

        /* renamed from: com.google.android.gms.internal.measurement.t0$h$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public enum C4982a implements C4873m4 {
            RADS(1),
            PROVISIONING(2);
            
            private static final C4860l4<C4982a> zzc = null;
            private final int zzd;

            static {
                zzc = new C5029w0();
            }

            private C4982a(int i) {
                this.zzd = i;
            }

            /* renamed from: i */
            public static C4899o4 m21479i() {
                return C5016v0.f14459a;
            }

            /* renamed from: a */
            public final int mo19235a() {
                return this.zzd;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C4982a.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzd);
                sb.append(" name=");
                sb.append(name());
                sb.append(C14662d0.f42854e);
                return sb.toString();
            }

            /* renamed from: a */
            public static C4982a m21478a(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.t0$h$b */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4983b extends C4802a<C4981h, C4983b> implements C4994t5 {
            private C4983b() {
                super(C4981h.zzf);
            }

            /* renamed from: a */
            public final C4983b mo19636a(C4974a aVar) {
                mo19065g();
                ((C4981h) this.f14185b).m21474a(aVar);
                return this;
            }

            /* synthetic */ C4983b(C5002u0 u0Var) {
                this();
            }
        }

        static {
            C4981h hVar = new C4981h();
            zzf = hVar;
            C4801i4.m20291a(C4981h.class, hVar);
        }

        private C4981h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21474a(C4974a aVar) {
            if (!this.zze.mo19360a()) {
                this.zze = C4801i4.m20287a(this.zze);
            }
            this.zze.add((C4973d) aVar.mo19056B());
        }

        /* renamed from: a */
        public static C4983b m21473a() {
            return (C4983b) zzf.mo19050h();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4981h();
                case 2:
                    return new C4983b(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C4982a.m21479i(), "zze", C4973d.class});
                case 4:
                    return zzf;
                case 5:
                    C4684a6<C4981h> a6Var = zzg;
                    if (a6Var == null) {
                        synchronized (C4981h.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$i */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4984i extends C4801i4<C4984i, C4985a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4984i zzg;
        private static volatile C4684a6<C4984i> zzh;
        private C4931q4 zzc = C4801i4.m20294m();
        private C4931q4 zzd = C4801i4.m20294m();
        private C4912p4<C4969b> zze = C4801i4.m20295n();
        private C4912p4<C4986j> zzf = C4801i4.m20295n();

        /* renamed from: com.google.android.gms.internal.measurement.t0$i$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4985a extends C4802a<C4984i, C4985a> implements C4994t5 {
            private C4985a() {
                super(C4984i.zzg);
            }

            /* renamed from: a */
            public final C4985a mo19649a(Iterable<? extends Long> iterable) {
                mo19065g();
                ((C4984i) this.f14185b).m21487a(iterable);
                return this;
            }

            /* renamed from: b */
            public final C4985a mo19651b(Iterable<? extends Long> iterable) {
                mo19065g();
                ((C4984i) this.f14185b).m21491b(iterable);
                return this;
            }

            /* renamed from: c */
            public final C4985a mo19652c(Iterable<? extends C4969b> iterable) {
                mo19065g();
                ((C4984i) this.f14185b).m21493c(iterable);
                return this;
            }

            /* renamed from: d */
            public final C4985a mo19653d(Iterable<? extends C4986j> iterable) {
                mo19065g();
                ((C4984i) this.f14185b).m21496d(iterable);
                return this;
            }

            /* renamed from: l */
            public final C4985a mo19654l() {
                mo19065g();
                ((C4984i) this.f14185b).m21502z();
                return this;
            }

            /* synthetic */ C4985a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4985a mo19647a() {
                mo19065g();
                ((C4984i) this.f14185b).m21501y();
                return this;
            }

            /* renamed from: b */
            public final C4985a mo19650b(int i) {
                mo19065g();
                ((C4984i) this.f14185b).m21497e(i);
                return this;
            }

            /* renamed from: a */
            public final C4985a mo19648a(int i) {
                mo19065g();
                ((C4984i) this.f14185b).m21494d(i);
                return this;
            }
        }

        static {
            C4984i iVar = new C4984i();
            zzg = iVar;
            C4801i4.m20291a(C4984i.class, iVar);
        }

        private C4984i() {
        }

        /* renamed from: A */
        private final void m21482A() {
            if (!this.zze.mo19360a()) {
                this.zze = C4801i4.m20287a(this.zze);
            }
        }

        /* renamed from: C */
        private final void m21483C() {
            if (!this.zzf.mo19360a()) {
                this.zzf = C4801i4.m20287a(this.zzf);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21491b(Iterable<? extends Long> iterable) {
            if (!this.zzd.mo19360a()) {
                this.zzd = C4801i4.m20288a(this.zzd);
            }
            C4910p2.m20917a(iterable, this.zzd);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21493c(Iterable<? extends C4969b> iterable) {
            m21482A();
            C4910p2.m20917a(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21494d(int i) {
            m21482A();
            this.zze.remove(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m21497e(int i) {
            m21483C();
            this.zzf.remove(i);
        }

        /* renamed from: v */
        public static C4985a m21498v() {
            return (C4985a) zzg.mo19050h();
        }

        /* renamed from: w */
        public static C4984i m21499w() {
            return zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m21501y() {
            this.zzc = C4801i4.m20294m();
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public final void m21502z() {
            this.zzd = C4801i4.m20294m();
        }

        /* renamed from: a */
        public final List<Long> mo19637a() {
            return this.zzc;
        }

        /* renamed from: o */
        public final int mo19640o() {
            return this.zzc.size();
        }

        /* renamed from: p */
        public final List<Long> mo19641p() {
            return this.zzd;
        }

        /* renamed from: q */
        public final int mo19642q() {
            return this.zzd.size();
        }

        /* renamed from: r */
        public final List<C4969b> mo19643r() {
            return this.zze;
        }

        /* renamed from: s */
        public final int mo19644s() {
            return this.zze.size();
        }

        /* renamed from: t */
        public final List<C4986j> mo19645t() {
            return this.zzf;
        }

        /* renamed from: u */
        public final int mo19646u() {
            return this.zzf.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21487a(Iterable<? extends Long> iterable) {
            if (!this.zzc.mo19360a()) {
                this.zzc = C4801i4.m20288a(this.zzc);
            }
            C4910p2.m20917a(iterable, this.zzc);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m21496d(Iterable<? extends C4986j> iterable) {
            m21483C();
            C4910p2.m20917a(iterable, this.zzf);
        }

        /* renamed from: c */
        public final C4986j mo19639c(int i) {
            return (C4986j) this.zzf.get(i);
        }

        /* renamed from: b */
        public final C4969b mo19638b(int i) {
            return (C4969b) this.zze.get(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4984i();
                case 2:
                    return new C4985a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C4969b.class, "zzf", C4986j.class});
                case 4:
                    return zzg;
                case 5:
                    C4684a6<C4984i> a6Var = zzh;
                    if (a6Var == null) {
                        synchronized (C4984i.class) {
                            a6Var = zzh;
                            if (a6Var == null) {
                                a6Var = new C4804c<>(zzg);
                                zzh = a6Var;
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$j */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4986j extends C4801i4<C4986j, C4987a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4986j zzf;
        private static volatile C4684a6<C4986j> zzg;
        private int zzc;
        private int zzd;
        private C4931q4 zze = C4801i4.m20294m();

        /* renamed from: com.google.android.gms.internal.measurement.t0$j$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4987a extends C4802a<C4986j, C4987a> implements C4994t5 {
            private C4987a() {
                super(C4986j.zzf);
            }

            /* renamed from: a */
            public final C4987a mo19661a(int i) {
                mo19065g();
                ((C4986j) this.f14185b).m21528c(i);
                return this;
            }

            /* synthetic */ C4987a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4987a mo19662a(long j) {
                mo19065g();
                ((C4986j) this.f14185b).m21522a(j);
                return this;
            }

            /* renamed from: a */
            public final C4987a mo19663a(Iterable<? extends Long> iterable) {
                mo19065g();
                ((C4986j) this.f14185b).m21527a(iterable);
                return this;
            }

            /* renamed from: a */
            public final C4987a mo19660a() {
                mo19065g();
                ((C4986j) this.f14185b).m21532u();
                return this;
            }
        }

        static {
            C4986j jVar = new C4986j();
            zzf = jVar;
            C4801i4.m20291a(C4986j.class, jVar);
        }

        private C4986j() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m21528c(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: r */
        public static C4987a m21529r() {
            return (C4987a) zzf.mo19050h();
        }

        /* renamed from: t */
        private final void m21531t() {
            if (!this.zze.mo19360a()) {
                this.zze = C4801i4.m20288a(this.zze);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final void m21532u() {
            this.zze = C4801i4.m20294m();
        }

        /* renamed from: a */
        public final boolean mo19655a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: b */
        public final long mo19656b(int i) {
            return this.zze.mo18983e(i);
        }

        /* renamed from: o */
        public final int mo19657o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final List<Long> mo19658p() {
            return this.zze;
        }

        /* renamed from: q */
        public final int mo19659q() {
            return this.zze.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21522a(long j) {
            m21531t();
            this.zze.mo18982a(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21527a(Iterable<? extends Long> iterable) {
            m21531t();
            C4910p2.m20917a(iterable, this.zze);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4986j();
                case 2:
                    return new C4987a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C4684a6<C4986j> a6Var = zzg;
                    if (a6Var == null) {
                        synchronized (C4986j.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.t0$k */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
    public static final class C4988k extends C4801i4<C4988k, C4989a> implements C4994t5 {
        /* access modifiers changed from: private */
        public static final C4988k zzj;
        private static volatile C4684a6<C4988k> zzk;
        private int zzc;
        private long zzd;
        private String zze;
        private String zzf;
        private long zzg;
        private float zzh;
        private double zzi;

        /* renamed from: com.google.android.gms.internal.measurement.t0$k$a */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
        public static final class C4989a extends C4802a<C4988k, C4989a> implements C4994t5 {
            private C4989a() {
                super(C4988k.zzj);
            }

            /* renamed from: a */
            public final C4989a mo19675a(long j) {
                mo19065g();
                ((C4988k) this.f14185b).m21545a(j);
                return this;
            }

            /* renamed from: b */
            public final C4989a mo19677b(String str) {
                mo19065g();
                ((C4988k) this.f14185b).m21555b(str);
                return this;
            }

            /* renamed from: l */
            public final C4989a mo19678l() {
                mo19065g();
                ((C4988k) this.f14185b).m21560z();
                return this;
            }

            /* renamed from: m */
            public final C4989a mo19679m() {
                mo19065g();
                ((C4988k) this.f14185b).m21543A();
                return this;
            }

            /* synthetic */ C4989a(C5002u0 u0Var) {
                this();
            }

            /* renamed from: a */
            public final C4989a mo19214a(String str) {
                mo19065g();
                ((C4988k) this.f14185b).m21550a(str);
                return this;
            }

            /* renamed from: b */
            public final C4989a mo19676b(long j) {
                mo19065g();
                ((C4988k) this.f14185b).m21551b(j);
                return this;
            }

            /* renamed from: a */
            public final C4989a mo19673a() {
                mo19065g();
                ((C4988k) this.f14185b).m21559y();
                return this;
            }

            /* renamed from: a */
            public final C4989a mo19674a(double d) {
                mo19065g();
                ((C4988k) this.f14185b).m21544a(d);
                return this;
            }
        }

        static {
            C4988k kVar = new C4988k();
            zzj = kVar;
            C4801i4.m20291a(C4988k.class, kVar);
        }

        private C4988k() {
            String str = "";
            this.zze = str;
            this.zzf = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public final void m21543A() {
            this.zzc &= -33;
            this.zzi = 0.0d;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21555b(String str) {
            if (str != null) {
                this.zzc |= 4;
                this.zzf = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: w */
        public static C4989a m21557w() {
            return (C4989a) zzj.mo19050h();
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m21559y() {
            this.zzc &= -5;
            this.zzf = zzj.zzf;
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public final void m21560z() {
            this.zzc &= -9;
            this.zzg = 0;
        }

        /* renamed from: a */
        public final boolean mo19664a() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: o */
        public final long mo19665o() {
            return this.zzd;
        }

        /* renamed from: p */
        public final String mo19666p() {
            return this.zze;
        }

        /* renamed from: q */
        public final boolean mo19667q() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: r */
        public final String mo19668r() {
            return this.zzf;
        }

        /* renamed from: s */
        public final boolean mo19669s() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: t */
        public final long mo19670t() {
            return this.zzg;
        }

        /* renamed from: u */
        public final boolean mo19671u() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: v */
        public final double mo19672v() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21545a(long j) {
            this.zzc |= 1;
            this.zzd = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21550a(String str) {
            if (str != null) {
                this.zzc |= 2;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m21551b(long j) {
            this.zzc |= 8;
            this.zzg = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m21544a(double d) {
            this.zzc |= 32;
            this.zzi = d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo19042a(int i, Object obj, Object obj2) {
            switch (C5002u0.f14423a[i - 1]) {
                case 1:
                    return new C4988k();
                case 2:
                    return new C4989a(null);
                case 3:
                    return C4801i4.m20289a((C4945r5) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    C4684a6<C4988k> a6Var = zzk;
                    if (a6Var == null) {
                        synchronized (C4988k.class) {
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
}
