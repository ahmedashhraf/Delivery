package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.places.model.PlaceFields;
import com.google.android.gms.common.C4420j;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4395d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.plus.C5493f;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5496a;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5497b;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5497b.C5498a;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5497b.C5499b;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5502d;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5503e;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5505g;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5507h;
import com.google.android.gms.plus.p177g.p178a.C5495a.C5509j;
import com.mrsool.utils.C11644i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

@C4392a(creator = "PersonEntityCreator")
@C4476d0
public final class zzr extends FastSafeParcelableJsonResponse implements C5495a {
    public static final Creator<zzr> CREATOR = new C5103u();

    /* renamed from: l0 */
    private static final HashMap<String, Field<?, ?>> f14590l0;
    @C4394c(mo18384id = 2)

    /* renamed from: N */
    private String f14591N;
    @C4394c(mo18384id = 3)

    /* renamed from: O */
    private zza f14592O;
    @C4394c(mo18384id = 4)

    /* renamed from: P */
    private String f14593P;
    @C4394c(mo18384id = 5)

    /* renamed from: Q */
    private String f14594Q;
    @C4394c(mo18384id = 6)

    /* renamed from: R */
    private int f14595R;
    @C4394c(mo18384id = 7)

    /* renamed from: S */
    private zzb f14596S;
    @C4394c(mo18384id = 8)

    /* renamed from: T */
    private String f14597T;
    @C4394c(mo18384id = 9)

    /* renamed from: U */
    private String f14598U;
    @C4394c(mo18384id = 12)

    /* renamed from: V */
    private int f14599V;
    @C4394c(mo18384id = 14)

    /* renamed from: W */
    private String f14600W;
    @C4394c(mo18384id = 15)

    /* renamed from: X */
    private zzc f14601X;
    @C4394c(mo18384id = 16)

    /* renamed from: Y */
    private boolean f14602Y;
    @C4394c(mo18384id = 18)

    /* renamed from: Z */
    private String f14603Z;
    @C4395d

    /* renamed from: a */
    private final Set<Integer> f14604a;
    @C4394c(mo18384id = 19)

    /* renamed from: a0 */
    private zzd f14605a0;
    @C4398g(mo18390id = 1)

    /* renamed from: b */
    private final int f14606b;
    @C4394c(mo18384id = 20)

    /* renamed from: b0 */
    private String f14607b0;
    @C4394c(mo18384id = 21)

    /* renamed from: c0 */
    private int f14608c0;
    @C4394c(mo18384id = 22)

    /* renamed from: d0 */
    private List<zze> f14609d0;
    @C4394c(mo18384id = 23)

    /* renamed from: e0 */
    private List<zzf> f14610e0;
    @C4394c(mo18384id = 24)

    /* renamed from: f0 */
    private int f14611f0;
    @C4394c(mo18384id = 25)

    /* renamed from: g0 */
    private int f14612g0;
    @C4394c(mo18384id = 26)

    /* renamed from: h0 */
    private String f14613h0;
    @C4394c(mo18384id = 27)

    /* renamed from: i0 */
    private String f14614i0;
    @C4394c(mo18384id = 28)

    /* renamed from: j0 */
    private List<zzg> f14615j0;
    @C4394c(mo18384id = 29)

    /* renamed from: k0 */
    private boolean f14616k0;

    @C4392a(creator = "PersonEntity_AgeRangeEntityCreator")
    @C4476d0
    public static final class zza extends FastSafeParcelableJsonResponse implements C5496a {
        public static final Creator<zza> CREATOR = new C5104v();

        /* renamed from: P */
        private static final HashMap<String, Field<?, ?>> f14617P;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private int f14618N;
        @C4394c(mo18384id = 3)

        /* renamed from: O */
        private int f14619O;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14620a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14621b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14617P = hashMap;
            String str = "max";
            hashMap.put(str, Field.m19177e(str, 2));
            String str2 = "min";
            f14617P.put(str2, Field.m19177e(str2, 3));
        }

        public zza() {
            this.f14621b = 1;
            this.f14620a = new HashSet();
        }

        @C4393b
        zza(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) int i3) {
            this.f14620a = set;
            this.f14621b = i;
            this.f14618N = i2;
            this.f14619O = i3;
        }

        /* renamed from: I0 */
        public final int mo19897I0() {
            return this.f14619O;
        }

        /* renamed from: M0 */
        public final int mo19898M0() {
            return this.f14618N;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14617P;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            int i;
            int N = field.mo18507N();
            if (N == 2) {
                i = this.f14618N;
            } else if (N == 3) {
                i = this.f14619O;
            } else {
                int N2 = field.mo18507N();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(N2);
                throw new IllegalStateException(sb.toString());
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17335a(Field<?, ?> field, String str, int i) {
            int N = field.mo18507N();
            if (N == 2) {
                this.f14618N = i;
            } else if (N == 3) {
                this.f14619O = i;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(N);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f14620a.add(Integer.valueOf(N));
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14620a.contains(Integer.valueOf(field.mo18507N()));
        }

        /* renamed from: b0 */
        public final boolean mo19899b0() {
            return this.f14620a.contains(Integer.valueOf(3));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zza zza = (zza) obj;
            for (Field field : f14617P.values()) {
                if (mo17329b(field)) {
                    if (!zza.mo17329b(field) || !mo17326a(field).equals(zza.mo17326a(field))) {
                        return false;
                    }
                } else if (zza.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f0 */
        public final boolean mo19900f0() {
            return this.f14620a.contains(Integer.valueOf(2));
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14617P.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14620a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14621b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18964a(parcel, 2, this.f14618N);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18964a(parcel, 3, this.f14619O);
            }
            C4399a.m18959a(parcel, a);
        }
    }

    @C4392a(creator = "PersonEntity_CoverEntityCreator")
    @C4476d0
    public static final class zzb extends FastSafeParcelableJsonResponse implements C5497b {
        public static final Creator<zzb> CREATOR = new C5105w();

        /* renamed from: Q */
        private static final HashMap<String, Field<?, ?>> f14622Q;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private zza f14623N;
        @C4394c(mo18384id = 3)

        /* renamed from: O */
        private C15805zzb f14624O;
        @C4394c(mo18384id = 4)

        /* renamed from: P */
        private int f14625P;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14626a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14627b;

        @C4392a(creator = "PersonEntity_CoverEntity_CoverInfoEntityCreator")
        @C4476d0
        public static final class zza extends FastSafeParcelableJsonResponse implements C5498a {
            public static final Creator<zza> CREATOR = new C5106x();

            /* renamed from: P */
            private static final HashMap<String, Field<?, ?>> f14628P;
            @C4394c(mo18384id = 2)

            /* renamed from: N */
            private int f14629N;
            @C4394c(mo18384id = 3)

            /* renamed from: O */
            private int f14630O;
            @C4395d

            /* renamed from: a */
            private final Set<Integer> f14631a;
            @C4398g(mo18390id = 1)

            /* renamed from: b */
            private final int f14632b;

            static {
                HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
                f14628P = hashMap;
                String str = "leftImageOffset";
                hashMap.put(str, Field.m19177e(str, 2));
                String str2 = "topImageOffset";
                f14628P.put(str2, Field.m19177e(str2, 3));
            }

            public zza() {
                this.f14632b = 1;
                this.f14631a = new HashSet();
            }

            @C4393b
            zza(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) int i3) {
                this.f14631a = set;
                this.f14632b = i;
                this.f14629N = i2;
                this.f14630O = i3;
            }

            /* renamed from: B0 */
            public final boolean mo19909B0() {
                return this.f14631a.contains(Integer.valueOf(2));
            }

            /* renamed from: F0 */
            public final int mo19910F0() {
                return this.f14630O;
            }

            /* renamed from: H0 */
            public final boolean mo19911H0() {
                return this.f14631a.contains(Integer.valueOf(3));
            }

            /* renamed from: N0 */
            public final /* synthetic */ Map mo17325N0() {
                return f14628P;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo17326a(Field field) {
                int i;
                int N = field.mo18507N();
                if (N == 2) {
                    i = this.f14629N;
                } else if (N == 3) {
                    i = this.f14630O;
                } else {
                    int N2 = field.mo18507N();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(N2);
                    throw new IllegalStateException(sb.toString());
                }
                return Integer.valueOf(i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo17335a(Field<?, ?> field, String str, int i) {
                int N = field.mo18507N();
                if (N == 2) {
                    this.f14629N = i;
                } else if (N == 3) {
                    this.f14630O = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(N);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f14631a.add(Integer.valueOf(N));
            }

            /* renamed from: a */
            public final boolean mo18088a() {
                return true;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo18089b() {
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final boolean mo17329b(Field field) {
                return this.f14631a.contains(Integer.valueOf(field.mo18507N()));
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof zza)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                zza zza = (zza) obj;
                for (Field field : f14628P.values()) {
                    if (mo17329b(field)) {
                        if (!zza.mo17329b(field) || !mo17326a(field).equals(zza.mo17326a(field))) {
                            return false;
                        }
                    } else if (zza.mo17329b(field)) {
                        return false;
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (Field field : f14628P.values()) {
                    if (mo17329b(field)) {
                        i = i + field.mo18507N() + mo17326a(field).hashCode();
                    }
                }
                return i;
            }

            /* renamed from: w0 */
            public final int mo19912w0() {
                return this.f14629N;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = C4399a.m18958a(parcel);
                Set<Integer> set = this.f14631a;
                if (set.contains(Integer.valueOf(1))) {
                    C4399a.m18964a(parcel, 1, this.f14632b);
                }
                if (set.contains(Integer.valueOf(2))) {
                    C4399a.m18964a(parcel, 2, this.f14629N);
                }
                if (set.contains(Integer.valueOf(3))) {
                    C4399a.m18964a(parcel, 3, this.f14630O);
                }
                C4399a.m18959a(parcel, a);
            }
        }

        @C4392a(creator = "PersonEntity_CoverEntity_CoverPhotoEntityCreator")
        @C4476d0
        /* renamed from: com.google.android.gms.internal.plus.zzr$zzb$zzb reason: collision with other inner class name */
        public static final class C15805zzb extends FastSafeParcelableJsonResponse implements C5499b {
            public static final Creator<C15805zzb> CREATOR = new C5107y();

            /* renamed from: Q */
            private static final HashMap<String, Field<?, ?>> f14633Q;
            @C4394c(mo18384id = 2)

            /* renamed from: N */
            private int f14634N;
            @C4394c(mo18384id = 3)

            /* renamed from: O */
            private String f14635O;
            @C4394c(mo18384id = 4)

            /* renamed from: P */
            private int f14636P;
            @C4395d

            /* renamed from: a */
            private final Set<Integer> f14637a;
            @C4398g(mo18390id = 1)

            /* renamed from: b */
            private final int f14638b;

            static {
                HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
                f14633Q = hashMap;
                String str = C14330v.f42320e0;
                hashMap.put(str, Field.m19177e(str, 2));
                String str2 = "url";
                f14633Q.put(str2, Field.m19179g(str2, 3));
                HashMap<String, Field<?, ?>> hashMap2 = f14633Q;
                String str3 = C14330v.f42318d0;
                hashMap2.put(str3, Field.m19177e(str3, 4));
            }

            public C15805zzb() {
                this.f14638b = 1;
                this.f14637a = new HashSet();
            }

            @C4393b
            C15805zzb(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) int i3) {
                this.f14637a = set;
                this.f14638b = i;
                this.f14634N = i2;
                this.f14635O = str;
                this.f14636P = i3;
            }

            /* renamed from: N0 */
            public final /* synthetic */ Map mo17325N0() {
                return f14633Q;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo17326a(Field field) {
                int i;
                int N = field.mo18507N();
                if (N == 2) {
                    i = this.f14634N;
                } else if (N == 3) {
                    return this.f14635O;
                } else {
                    if (N == 4) {
                        i = this.f14636P;
                    } else {
                        int N2 = field.mo18507N();
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(N2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return Integer.valueOf(i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo17335a(Field<?, ?> field, String str, int i) {
                int N = field.mo18507N();
                if (N == 2) {
                    this.f14634N = i;
                } else if (N == 4) {
                    this.f14636P = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(N);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f14637a.add(Integer.valueOf(N));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo17333a(Field<?, ?> field, String str, String str2) {
                int N = field.mo18507N();
                if (N == 3) {
                    this.f14635O = str2;
                    this.f14637a.add(Integer.valueOf(N));
                    return;
                }
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(N);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }

            /* renamed from: a */
            public final boolean mo18088a() {
                return true;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo18089b() {
                return this;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final boolean mo17329b(Field field) {
                return this.f14637a.contains(Integer.valueOf(field.mo18507N()));
            }

            /* renamed from: c */
            public final String mo19914c() {
                return this.f14635O;
            }

            /* renamed from: e */
            public final boolean mo19915e() {
                return this.f14637a.contains(Integer.valueOf(3));
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C15805zzb)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C15805zzb zzb = (C15805zzb) obj;
                for (Field field : f14633Q.values()) {
                    if (mo17329b(field)) {
                        if (!zzb.mo17329b(field) || !mo17326a(field).equals(zzb.mo17326a(field))) {
                            return false;
                        }
                    } else if (zzb.mo17329b(field)) {
                        return false;
                    }
                }
                return true;
            }

            public final int getHeight() {
                return this.f14634N;
            }

            public final int getWidth() {
                return this.f14636P;
            }

            public final int hashCode() {
                int i = 0;
                for (Field field : f14633Q.values()) {
                    if (mo17329b(field)) {
                        i = i + field.mo18507N() + mo17326a(field).hashCode();
                    }
                }
                return i;
            }

            /* renamed from: p0 */
            public final boolean mo19918p0() {
                return this.f14637a.contains(Integer.valueOf(4));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = C4399a.m18958a(parcel);
                Set<Integer> set = this.f14637a;
                if (set.contains(Integer.valueOf(1))) {
                    C4399a.m18964a(parcel, 1, this.f14638b);
                }
                if (set.contains(Integer.valueOf(2))) {
                    C4399a.m18964a(parcel, 2, this.f14634N);
                }
                if (set.contains(Integer.valueOf(3))) {
                    C4399a.m18979a(parcel, 3, this.f14635O, true);
                }
                if (set.contains(Integer.valueOf(4))) {
                    C4399a.m18964a(parcel, 4, this.f14636P);
                }
                C4399a.m18959a(parcel, a);
            }

            /* renamed from: y0 */
            public final boolean mo19920y0() {
                return this.f14637a.contains(Integer.valueOf(2));
            }
        }

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14622Q = hashMap;
            String str = "coverInfo";
            hashMap.put(str, Field.m19171a(str, 2, zza.class));
            String str2 = "coverPhoto";
            f14622Q.put(str2, Field.m19171a(str2, 3, C15805zzb.class));
            String str3 = "layout";
            f14622Q.put(str3, Field.m19170a(str3, 4, new StringToIntConverter().mo18459a("banner", 0), false));
        }

        public zzb() {
            this.f14627b = 1;
            this.f14626a = new HashSet();
        }

        @C4393b
        zzb(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) zza zza2, @C4396e(mo18387id = 3) C15805zzb zzb, @C4396e(mo18387id = 4) int i2) {
            this.f14626a = set;
            this.f14627b = i;
            this.f14623N = zza2;
            this.f14624O = zzb;
            this.f14625P = i2;
        }

        /* renamed from: K0 */
        public final C5498a mo19902K0() {
            return this.f14623N;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14622Q;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            int N = field.mo18507N();
            if (N == 2) {
                return this.f14623N;
            }
            if (N == 3) {
                return this.f14624O;
            }
            if (N == 4) {
                return Integer.valueOf(this.f14625P);
            }
            int N2 = field.mo18507N();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(N2);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17335a(Field<?, ?> field, String str, int i) {
            int N = field.mo18507N();
            if (N == 4) {
                this.f14625P = i;
                this.f14626a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
            int N = field.mo18507N();
            if (N == 2) {
                this.f14623N = (zza) t;
            } else if (N == 3) {
                this.f14624O = (C15805zzb) t;
            } else {
                String canonicalName = t.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                sb.append("Field with id=");
                sb.append(N);
                sb.append(" is not a known custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f14626a.add(Integer.valueOf(N));
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: a0 */
        public final boolean mo19903a0() {
            return this.f14626a.contains(Integer.valueOf(3));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14626a.contains(Integer.valueOf(field.mo18507N()));
        }

        /* renamed from: e0 */
        public final boolean mo19904e0() {
            return this.f14626a.contains(Integer.valueOf(4));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzb)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzb zzb = (zzb) obj;
            for (Field field : f14622Q.values()) {
                if (mo17329b(field)) {
                    if (!zzb.mo17329b(field) || !mo17326a(field).equals(zzb.mo17326a(field))) {
                        return false;
                    }
                } else if (zzb.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14622Q.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: l0 */
        public final boolean mo19905l0() {
            return this.f14626a.contains(Integer.valueOf(2));
        }

        /* renamed from: o0 */
        public final C5499b mo19906o0() {
            return this.f14624O;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14626a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14627b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18969a(parcel, 2, (Parcelable) this.f14623N, i, true);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18969a(parcel, 3, (Parcelable) this.f14624O, i, true);
            }
            if (set.contains(Integer.valueOf(4))) {
                C4399a.m18964a(parcel, 4, this.f14625P);
            }
            C4399a.m18959a(parcel, a);
        }

        /* renamed from: z0 */
        public final int mo19908z0() {
            return this.f14625P;
        }
    }

    @C4392a(creator = "PersonEntity_ImageEntityCreator")
    @C4476d0
    public static final class zzc extends FastSafeParcelableJsonResponse implements C5502d {
        public static final Creator<zzc> CREATOR = new C5108z();

        /* renamed from: O */
        private static final HashMap<String, Field<?, ?>> f14639O;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private String f14640N;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14641a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14642b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14639O = hashMap;
            String str = "url";
            hashMap.put(str, Field.m19179g(str, 2));
        }

        public zzc() {
            this.f14642b = 1;
            this.f14641a = new HashSet();
        }

        public zzc(String str) {
            this.f14641a = new HashSet();
            this.f14642b = 1;
            this.f14640N = str;
            this.f14641a.add(Integer.valueOf(2));
        }

        @C4393b
        zzc(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str) {
            this.f14641a = set;
            this.f14642b = i;
            this.f14640N = str;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14639O;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            if (field.mo18507N() == 2) {
                return this.f14640N;
            }
            int N = field.mo18507N();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(N);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17333a(Field<?, ?> field, String str, String str2) {
            int N = field.mo18507N();
            if (N == 2) {
                this.f14640N = str2;
                this.f14641a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14641a.contains(Integer.valueOf(field.mo18507N()));
        }

        /* renamed from: c */
        public final String mo19921c() {
            return this.f14640N;
        }

        /* renamed from: e */
        public final boolean mo19922e() {
            return this.f14641a.contains(Integer.valueOf(2));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzc)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzc zzc = (zzc) obj;
            for (Field field : f14639O.values()) {
                if (mo17329b(field)) {
                    if (!zzc.mo17329b(field) || !mo17326a(field).equals(zzc.mo17326a(field))) {
                        return false;
                    }
                } else if (zzc.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14639O.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14641a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14642b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18979a(parcel, 2, this.f14640N, true);
            }
            C4399a.m18959a(parcel, a);
        }
    }

    @C4392a(creator = "PersonEntity_NameEntityCreator")
    @C4476d0
    public static final class zzd extends FastSafeParcelableJsonResponse implements C5503e {
        public static final Creator<zzd> CREATOR = new C5082a0();

        /* renamed from: T */
        private static final HashMap<String, Field<?, ?>> f14643T;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private String f14644N;
        @C4394c(mo18384id = 3)

        /* renamed from: O */
        private String f14645O;
        @C4394c(mo18384id = 4)

        /* renamed from: P */
        private String f14646P;
        @C4394c(mo18384id = 5)

        /* renamed from: Q */
        private String f14647Q;
        @C4394c(mo18384id = 6)

        /* renamed from: R */
        private String f14648R;
        @C4394c(mo18384id = 7)

        /* renamed from: S */
        private String f14649S;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14650a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14651b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14643T = hashMap;
            String str = "familyName";
            hashMap.put(str, Field.m19179g(str, 2));
            String str2 = "formatted";
            f14643T.put(str2, Field.m19179g(str2, 3));
            String str3 = "givenName";
            f14643T.put(str3, Field.m19179g(str3, 4));
            String str4 = "honorificPrefix";
            f14643T.put(str4, Field.m19179g(str4, 5));
            String str5 = "honorificSuffix";
            f14643T.put(str5, Field.m19179g(str5, 6));
            String str6 = "middleName";
            f14643T.put(str6, Field.m19179g(str6, 7));
        }

        public zzd() {
            this.f14651b = 1;
            this.f14650a = new HashSet();
        }

        @C4393b
        zzd(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) String str3, @C4396e(mo18387id = 5) String str4, @C4396e(mo18387id = 6) String str5, @C4396e(mo18387id = 7) String str6) {
            this.f14650a = set;
            this.f14651b = i;
            this.f14644N = str;
            this.f14645O = str2;
            this.f14646P = str3;
            this.f14647Q = str4;
            this.f14648R = str5;
            this.f14649S = str6;
        }

        /* renamed from: A0 */
        public final String mo19924A0() {
            return this.f14646P;
        }

        /* renamed from: E0 */
        public final boolean mo19925E0() {
            return this.f14650a.contains(Integer.valueOf(2));
        }

        /* renamed from: G0 */
        public final boolean mo19926G0() {
            return this.f14650a.contains(Integer.valueOf(3));
        }

        /* renamed from: J0 */
        public final boolean mo19927J0() {
            return this.f14650a.contains(Integer.valueOf(4));
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14643T;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            switch (field.mo18507N()) {
                case 2:
                    return this.f14644N;
                case 3:
                    return this.f14645O;
                case 4:
                    return this.f14646P;
                case 5:
                    return this.f14647Q;
                case 6:
                    return this.f14648R;
                case 7:
                    return this.f14649S;
                default:
                    int N = field.mo18507N();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(N);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17333a(Field<?, ?> field, String str, String str2) {
            int N = field.mo18507N();
            switch (N) {
                case 2:
                    this.f14644N = str2;
                    break;
                case 3:
                    this.f14645O = str2;
                    break;
                case 4:
                    this.f14646P = str2;
                    break;
                case 5:
                    this.f14647Q = str2;
                    break;
                case 6:
                    this.f14648R = str2;
                    break;
                case 7:
                    this.f14649S = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(N);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
            this.f14650a.add(Integer.valueOf(N));
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14650a.contains(Integer.valueOf(field.mo18507N()));
        }

        /* renamed from: d0 */
        public final String mo19928d0() {
            return this.f14644N;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzd)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzd zzd = (zzd) obj;
            for (Field field : f14643T.values()) {
                if (mo17329b(field)) {
                    if (!zzd.mo17329b(field) || !mo17326a(field).equals(zzd.mo17326a(field))) {
                        return false;
                    }
                } else if (zzd.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: h0 */
        public final String mo19929h0() {
            return this.f14645O;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14643T.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: n0 */
        public final boolean mo19930n0() {
            return this.f14650a.contains(Integer.valueOf(5));
        }

        /* renamed from: q0 */
        public final String mo19931q0() {
            return this.f14647Q;
        }

        /* renamed from: r0 */
        public final boolean mo19932r0() {
            return this.f14650a.contains(Integer.valueOf(7));
        }

        /* renamed from: t0 */
        public final String mo19933t0() {
            return this.f14649S;
        }

        /* renamed from: v0 */
        public final boolean mo19934v0() {
            return this.f14650a.contains(Integer.valueOf(6));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14650a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14651b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18979a(parcel, 2, this.f14644N, true);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18979a(parcel, 3, this.f14645O, true);
            }
            if (set.contains(Integer.valueOf(4))) {
                C4399a.m18979a(parcel, 4, this.f14646P, true);
            }
            if (set.contains(Integer.valueOf(5))) {
                C4399a.m18979a(parcel, 5, this.f14647Q, true);
            }
            if (set.contains(Integer.valueOf(6))) {
                C4399a.m18979a(parcel, 6, this.f14648R, true);
            }
            if (set.contains(Integer.valueOf(7))) {
                C4399a.m18979a(parcel, 7, this.f14649S, true);
            }
            C4399a.m18959a(parcel, a);
        }

        /* renamed from: x0 */
        public final String mo19936x0() {
            return this.f14648R;
        }
    }

    @C4392a(creator = "PersonEntity_OrganizationsEntityCreator")
    @C4476d0
    public static final class zze extends FastSafeParcelableJsonResponse implements C5505g {
        public static final Creator<zze> CREATOR = new C5084b0();

        /* renamed from: W */
        private static final HashMap<String, Field<?, ?>> f14652W;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private String f14653N;
        @C4394c(mo18384id = 3)

        /* renamed from: O */
        private String f14654O;
        @C4394c(mo18384id = 4)

        /* renamed from: P */
        private String f14655P;
        @C4394c(mo18384id = 5)

        /* renamed from: Q */
        private String f14656Q;
        @C4394c(mo18384id = 6)

        /* renamed from: R */
        private String f14657R;
        @C4394c(mo18384id = 7)

        /* renamed from: S */
        private boolean f14658S;
        @C4394c(mo18384id = 8)

        /* renamed from: T */
        private String f14659T;
        @C4394c(mo18384id = 9)

        /* renamed from: U */
        private String f14660U;
        @C4394c(mo18384id = 10)

        /* renamed from: V */
        private int f14661V;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14662a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14663b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14652W = hashMap;
            String str = "department";
            hashMap.put(str, Field.m19179g(str, 2));
            String str2 = "description";
            f14652W.put(str2, Field.m19179g(str2, 3));
            String str3 = "endDate";
            f14652W.put(str3, Field.m19179g(str3, 4));
            String str4 = "location";
            f14652W.put(str4, Field.m19179g(str4, 5));
            String str5 = "name";
            f14652W.put(str5, Field.m19179g(str5, 6));
            String str6 = "primary";
            f14652W.put(str6, Field.m19173b(str6, 7));
            String str7 = "startDate";
            f14652W.put(str7, Field.m19179g(str7, 8));
            String str8 = "title";
            f14652W.put(str8, Field.m19179g(str8, 9));
            String str9 = "type";
            f14652W.put(str9, Field.m19170a(str9, 10, new StringToIntConverter().mo18459a("work", 0).mo18459a("school", 1), false));
        }

        public zze() {
            this.f14663b = 1;
            this.f14662a = new HashSet();
        }

        @C4393b
        zze(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) String str3, @C4396e(mo18387id = 5) String str4, @C4396e(mo18387id = 6) String str5, @C4396e(mo18387id = 7) boolean z, @C4396e(mo18387id = 8) String str6, @C4396e(mo18387id = 9) String str7, @C4396e(mo18387id = 10) int i2) {
            this.f14662a = set;
            this.f14663b = i;
            this.f14653N = str;
            this.f14654O = str2;
            this.f14655P = str3;
            this.f14656Q = str4;
            this.f14657R = str5;
            this.f14658S = z;
            this.f14659T = str6;
            this.f14660U = str7;
            this.f14661V = i2;
        }

        /* renamed from: C0 */
        public final String mo19937C0() {
            return this.f14653N;
        }

        /* renamed from: D0 */
        public final boolean mo19938D0() {
            return this.f14662a.contains(Integer.valueOf(4));
        }

        /* renamed from: L0 */
        public final String mo19939L0() {
            return this.f14659T;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14652W;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            switch (field.mo18507N()) {
                case 2:
                    return this.f14653N;
                case 3:
                    return this.f14654O;
                case 4:
                    return this.f14655P;
                case 5:
                    return this.f14656Q;
                case 6:
                    return this.f14657R;
                case 7:
                    return Boolean.valueOf(this.f14658S);
                case 8:
                    return this.f14659T;
                case 9:
                    return this.f14660U;
                case 10:
                    return Integer.valueOf(this.f14661V);
                default:
                    int N = field.mo18507N();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(N);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17335a(Field<?, ?> field, String str, int i) {
            int N = field.mo18507N();
            if (N == 10) {
                this.f14661V = i;
                this.f14662a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17333a(Field<?, ?> field, String str, String str2) {
            int N = field.mo18507N();
            switch (N) {
                case 2:
                    this.f14653N = str2;
                    break;
                case 3:
                    this.f14654O = str2;
                    break;
                case 4:
                    this.f14655P = str2;
                    break;
                case 5:
                    this.f14656Q = str2;
                    break;
                case 6:
                    this.f14657R = str2;
                    break;
                case 8:
                    this.f14659T = str2;
                    break;
                case 9:
                    this.f14660U = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(N);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
            this.f14662a.add(Integer.valueOf(N));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo18484a(Field<?, ?> field, String str, boolean z) {
            int N = field.mo18507N();
            if (N == 7) {
                this.f14658S = z;
                this.f14662a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14662a.contains(Integer.valueOf(field.mo18507N()));
        }

        /* renamed from: c0 */
        public final boolean mo19940c0() {
            return this.f14662a.contains(Integer.valueOf(2));
        }

        /* renamed from: d */
        public final String mo19941d() {
            return this.f14654O;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zze)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zze zze = (zze) obj;
            for (Field field : f14652W.values()) {
                if (mo17329b(field)) {
                    if (!zze.mo17329b(field) || !mo17326a(field).equals(zze.mo17326a(field))) {
                        return false;
                    }
                } else if (zze.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo19942f() {
            return this.f14662a.contains(Integer.valueOf(6));
        }

        /* renamed from: g */
        public final boolean mo19943g() {
            return this.f14662a.contains(Integer.valueOf(7));
        }

        public final String getLocation() {
            return this.f14656Q;
        }

        public final String getName() {
            return this.f14657R;
        }

        public final String getTitle() {
            return this.f14660U;
        }

        public final int getType() {
            return this.f14661V;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14652W.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: i0 */
        public final boolean mo19948i0() {
            return this.f14662a.contains(Integer.valueOf(8));
        }

        /* renamed from: j */
        public final boolean mo19949j() {
            return this.f14658S;
        }

        /* renamed from: j0 */
        public final boolean mo19950j0() {
            return this.f14662a.contains(Integer.valueOf(5));
        }

        /* renamed from: k */
        public final boolean mo19951k() {
            return this.f14662a.contains(Integer.valueOf(10));
        }

        /* renamed from: m0 */
        public final boolean mo19952m0() {
            return this.f14662a.contains(Integer.valueOf(9));
        }

        /* renamed from: s0 */
        public final boolean mo19953s0() {
            return this.f14662a.contains(Integer.valueOf(3));
        }

        /* renamed from: u0 */
        public final String mo19954u0() {
            return this.f14655P;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14662a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14663b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18979a(parcel, 2, this.f14653N, true);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18979a(parcel, 3, this.f14654O, true);
            }
            if (set.contains(Integer.valueOf(4))) {
                C4399a.m18979a(parcel, 4, this.f14655P, true);
            }
            if (set.contains(Integer.valueOf(5))) {
                C4399a.m18979a(parcel, 5, this.f14656Q, true);
            }
            if (set.contains(Integer.valueOf(6))) {
                C4399a.m18979a(parcel, 6, this.f14657R, true);
            }
            if (set.contains(Integer.valueOf(7))) {
                C4399a.m18984a(parcel, 7, this.f14658S);
            }
            if (set.contains(Integer.valueOf(8))) {
                C4399a.m18979a(parcel, 8, this.f14659T, true);
            }
            if (set.contains(Integer.valueOf(9))) {
                C4399a.m18979a(parcel, 9, this.f14660U, true);
            }
            if (set.contains(Integer.valueOf(10))) {
                C4399a.m18964a(parcel, 10, this.f14661V);
            }
            C4399a.m18959a(parcel, a);
        }
    }

    @C4392a(creator = "PersonEntity_PlacesLivedEntityCreator")
    @C4476d0
    public static final class zzf extends FastSafeParcelableJsonResponse implements C5507h {
        public static final Creator<zzf> CREATOR = new C5083b();

        /* renamed from: P */
        private static final HashMap<String, Field<?, ?>> f14664P;
        @C4394c(mo18384id = 2)

        /* renamed from: N */
        private boolean f14665N;
        @C4394c(mo18384id = 3)

        /* renamed from: O */
        private String f14666O;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14667a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14668b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14664P = hashMap;
            String str = "primary";
            hashMap.put(str, Field.m19173b(str, 2));
            String str2 = "value";
            f14664P.put(str2, Field.m19179g(str2, 3));
        }

        public zzf() {
            this.f14668b = 1;
            this.f14667a = new HashSet();
        }

        @C4393b
        zzf(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) boolean z, @C4396e(mo18387id = 3) String str) {
            this.f14667a = set;
            this.f14668b = i;
            this.f14665N = z;
            this.f14666O = str;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14664P;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            int N = field.mo18507N();
            if (N == 2) {
                return Boolean.valueOf(this.f14665N);
            }
            if (N == 3) {
                return this.f14666O;
            }
            int N2 = field.mo18507N();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(N2);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17333a(Field<?, ?> field, String str, String str2) {
            int N = field.mo18507N();
            if (N == 3) {
                this.f14666O = str2;
                this.f14667a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo18484a(Field<?, ?> field, String str, boolean z) {
            int N = field.mo18507N();
            if (N == 2) {
                this.f14665N = z;
                this.f14667a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14667a.contains(Integer.valueOf(field.mo18507N()));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzf)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzf zzf = (zzf) obj;
            for (Field field : f14664P.values()) {
                if (mo17329b(field)) {
                    if (!zzf.mo17329b(field) || !mo17326a(field).equals(zzf.mo17326a(field))) {
                        return false;
                    }
                } else if (zzf.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final boolean mo19956g() {
            return this.f14667a.contains(Integer.valueOf(2));
        }

        public final String getValue() {
            return this.f14666O;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14664P.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: j */
        public final boolean mo19958j() {
            return this.f14665N;
        }

        /* renamed from: q */
        public final boolean mo19959q() {
            return this.f14667a.contains(Integer.valueOf(3));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14667a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14668b);
            }
            if (set.contains(Integer.valueOf(2))) {
                C4399a.m18984a(parcel, 2, this.f14665N);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18979a(parcel, 3, this.f14666O, true);
            }
            C4399a.m18959a(parcel, a);
        }
    }

    @C4392a(creator = "PersonEntity_UrlsEntityCreator")
    @C4476d0
    public static final class zzg extends FastSafeParcelableJsonResponse implements C5509j {
        public static final Creator<zzg> CREATOR = new C5085c();

        /* renamed from: R */
        private static final HashMap<String, Field<?, ?>> f14669R;
        @C4394c(mo18384id = 5)

        /* renamed from: N */
        private String f14670N;
        @C4394c(getter = "getType_DEPRECATED_FENACHO", mo18384id = 3)

        /* renamed from: O */
        private final int f14671O;
        @C4394c(mo18384id = 6)

        /* renamed from: P */
        private int f14672P;
        @C4394c(mo18384id = 4)

        /* renamed from: Q */
        private String f14673Q;
        @C4395d

        /* renamed from: a */
        private final Set<Integer> f14674a;
        @C4398g(mo18390id = 1)

        /* renamed from: b */
        private final int f14675b;

        static {
            HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
            f14669R = hashMap;
            String str = C5493f.f15781i;
            hashMap.put(str, Field.m19179g(str, 5));
            String str2 = "type";
            f14669R.put(str2, Field.m19170a(str2, 6, new StringToIntConverter().mo18459a("home", 0).mo18459a("work", 1).mo18459a("blog", 2).mo18459a(C4420j.f13552a, 3).mo18459a(FacebookRequestErrorClassification.KEY_OTHER, 4).mo18459a("otherProfile", 5).mo18459a("contributor", 6).mo18459a(PlaceFields.WEBSITE, 7), false));
            String str3 = "value";
            f14669R.put(str3, Field.m19179g(str3, 4));
        }

        public zzg() {
            this.f14671O = 4;
            this.f14675b = 1;
            this.f14674a = new HashSet();
        }

        @C4393b
        zzg(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 5) String str, @C4396e(mo18387id = 6) int i2, @C4396e(mo18387id = 4) String str2, @C4396e(mo18387id = 3) int i3) {
            this.f14671O = 4;
            this.f14674a = set;
            this.f14675b = i;
            this.f14670N = str;
            this.f14672P = i2;
            this.f14673Q = str2;
        }

        /* renamed from: N0 */
        public final /* synthetic */ Map mo17325N0() {
            return f14669R;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo17326a(Field field) {
            int N = field.mo18507N();
            if (N == 4) {
                return this.f14673Q;
            }
            if (N == 5) {
                return this.f14670N;
            }
            if (N == 6) {
                return Integer.valueOf(this.f14672P);
            }
            int N2 = field.mo18507N();
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(N2);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17335a(Field<?, ?> field, String str, int i) {
            int N = field.mo18507N();
            if (N == 6) {
                this.f14672P = i;
                this.f14674a.add(Integer.valueOf(N));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo17333a(Field<?, ?> field, String str, String str2) {
            int N = field.mo18507N();
            if (N == 4) {
                this.f14673Q = str2;
            } else if (N == 5) {
                this.f14670N = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(N);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f14674a.add(Integer.valueOf(N));
        }

        /* renamed from: a */
        public final boolean mo18088a() {
            return true;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18089b() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo17329b(Field field) {
            return this.f14674a.contains(Integer.valueOf(field.mo18507N()));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzg)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzg zzg = (zzg) obj;
            for (Field field : f14669R.values()) {
                if (mo17329b(field)) {
                    if (!zzg.mo17329b(field) || !mo17326a(field).equals(zzg.mo17326a(field))) {
                        return false;
                    }
                } else if (zzg.mo17329b(field)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g0 */
        public final boolean mo19961g0() {
            return this.f14674a.contains(Integer.valueOf(5));
        }

        public final int getType() {
            return this.f14672P;
        }

        public final String getValue() {
            return this.f14673Q;
        }

        public final int hashCode() {
            int i = 0;
            for (Field field : f14669R.values()) {
                if (mo17329b(field)) {
                    i = i + field.mo18507N() + mo17326a(field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: k */
        public final boolean mo19964k() {
            return this.f14674a.contains(Integer.valueOf(6));
        }

        /* renamed from: k0 */
        public final String mo19965k0() {
            return this.f14670N;
        }

        /* renamed from: q */
        public final boolean mo19966q() {
            return this.f14674a.contains(Integer.valueOf(4));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            Set<Integer> set = this.f14674a;
            if (set.contains(Integer.valueOf(1))) {
                C4399a.m18964a(parcel, 1, this.f14675b);
            }
            if (set.contains(Integer.valueOf(3))) {
                C4399a.m18964a(parcel, 3, 4);
            }
            if (set.contains(Integer.valueOf(4))) {
                C4399a.m18979a(parcel, 4, this.f14673Q, true);
            }
            if (set.contains(Integer.valueOf(5))) {
                C4399a.m18979a(parcel, 5, this.f14670N, true);
            }
            if (set.contains(Integer.valueOf(6))) {
                C4399a.m18964a(parcel, 6, this.f14672P);
            }
            C4399a.m18959a(parcel, a);
        }
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f14590l0 = hashMap;
        String str = "aboutMe";
        hashMap.put(str, Field.m19179g(str, 2));
        String str2 = "ageRange";
        f14590l0.put(str2, Field.m19171a(str2, 3, zza.class));
        String str3 = "birthday";
        f14590l0.put(str3, Field.m19179g(str3, 4));
        String str4 = "braggingRights";
        f14590l0.put(str4, Field.m19179g(str4, 5));
        String str5 = "circledByCount";
        f14590l0.put(str5, Field.m19177e(str5, 6));
        HashMap<String, Field<?, ?>> hashMap2 = f14590l0;
        String str6 = PlaceFields.COVER;
        hashMap2.put(str6, Field.m19171a(str6, 7, zzb.class));
        String str7 = "currentLocation";
        f14590l0.put(str7, Field.m19179g(str7, 8));
        f14590l0.put("displayName", Field.m19179g("displayName", 9));
        f14590l0.put(C11644i.f33451x5, Field.m19170a(C11644i.f33451x5, 12, new StringToIntConverter().mo18459a(C11644i.f33087F5, 0).mo18459a(C11644i.f33095G5, 1).mo18459a(FacebookRequestErrorClassification.KEY_OTHER, 2), false));
        f14590l0.put("id", Field.m19179g("id", 14));
        f14590l0.put("image", Field.m19171a("image", 15, zzc.class));
        f14590l0.put("isPlusUser", Field.m19173b("isPlusUser", 16));
        f14590l0.put("language", Field.m19179g("language", 18));
        f14590l0.put("name", Field.m19171a("name", 19, zzd.class));
        f14590l0.put("nickname", Field.m19179g("nickname", 20));
        f14590l0.put("objectType", Field.m19170a("objectType", 21, new StringToIntConverter().mo18459a("person", 0).mo18459a("page", 1), false));
        f14590l0.put("organizations", Field.m19174b("organizations", 22, zze.class));
        f14590l0.put("placesLived", Field.m19174b("placesLived", 23, zzf.class));
        f14590l0.put("plusOneCount", Field.m19177e("plusOneCount", 24));
        f14590l0.put("relationshipStatus", Field.m19170a("relationshipStatus", 25, new StringToIntConverter().mo18459a("single", 0).mo18459a("in_a_relationship", 1).mo18459a("engaged", 2).mo18459a("married", 3).mo18459a("its_complicated", 4).mo18459a("open_relationship", 5).mo18459a("widowed", 6).mo18459a("in_domestic_partnership", 7).mo18459a("in_civil_union", 8), false));
        f14590l0.put("tagline", Field.m19179g("tagline", 26));
        f14590l0.put("url", Field.m19179g("url", 27));
        f14590l0.put("urls", Field.m19174b("urls", 28, zzg.class));
        f14590l0.put("verified", Field.m19173b("verified", 29));
    }

    public zzr() {
        this.f14606b = 1;
        this.f14604a = new HashSet();
    }

    public zzr(String str, String str2, zzc zzc2, int i, String str3) {
        this.f14606b = 1;
        this.f14604a = new HashSet();
        this.f14598U = str;
        this.f14604a.add(Integer.valueOf(9));
        this.f14600W = str2;
        this.f14604a.add(Integer.valueOf(14));
        this.f14601X = zzc2;
        this.f14604a.add(Integer.valueOf(15));
        this.f14608c0 = i;
        this.f14604a.add(Integer.valueOf(21));
        this.f14614i0 = str3;
        this.f14604a.add(Integer.valueOf(27));
    }

    @C4393b
    zzr(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) zza zza2, @C4396e(mo18387id = 4) String str2, @C4396e(mo18387id = 5) String str3, @C4396e(mo18387id = 6) int i2, @C4396e(mo18387id = 7) zzb zzb2, @C4396e(mo18387id = 8) String str4, @C4396e(mo18387id = 9) String str5, @C4396e(mo18387id = 12) int i3, @C4396e(mo18387id = 14) String str6, @C4396e(mo18387id = 15) zzc zzc2, @C4396e(mo18387id = 16) boolean z, @C4396e(mo18387id = 18) String str7, @C4396e(mo18387id = 19) zzd zzd2, @C4396e(mo18387id = 20) String str8, @C4396e(mo18387id = 21) int i4, @C4396e(mo18387id = 22) List<zze> list, @C4396e(mo18387id = 23) List<zzf> list2, @C4396e(mo18387id = 24) int i5, @C4396e(mo18387id = 25) int i6, @C4396e(mo18387id = 26) String str9, @C4396e(mo18387id = 27) String str10, @C4396e(mo18387id = 28) List<zzg> list3, @C4396e(mo18387id = 29) boolean z2) {
        this.f14604a = set;
        this.f14606b = i;
        this.f14591N = str;
        this.f14592O = zza2;
        this.f14593P = str2;
        this.f14594Q = str3;
        this.f14595R = i2;
        this.f14596S = zzb2;
        this.f14597T = str4;
        this.f14598U = str5;
        this.f14599V = i3;
        this.f14600W = str6;
        this.f14601X = zzc2;
        this.f14602Y = z;
        this.f14603Z = str7;
        this.f14605a0 = zzd2;
        this.f14607b0 = str8;
        this.f14608c0 = i4;
        this.f14609d0 = list;
        this.f14610e0 = list2;
        this.f14611f0 = i5;
        this.f14612g0 = i6;
        this.f14613h0 = str9;
        this.f14614i0 = str10;
        this.f14615j0 = list3;
        this.f14616k0 = z2;
    }

    /* renamed from: a */
    public static zzr m22108a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzr zzr = (zzr) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzr;
    }

    /* renamed from: A */
    public final boolean mo19822A() {
        return this.f14604a.contains(Integer.valueOf(16));
    }

    /* renamed from: B */
    public final boolean mo19823B() {
        return this.f14604a.contains(Integer.valueOf(20));
    }

    /* renamed from: C */
    public final boolean mo19824C() {
        return this.f14604a.contains(Integer.valueOf(25));
    }

    /* renamed from: D */
    public final List<C5505g> mo19825D() {
        return (ArrayList) this.f14609d0;
    }

    /* renamed from: E */
    public final String mo19826E() {
        return this.f14593P;
    }

    /* renamed from: F */
    public final boolean mo19827F() {
        return this.f14604a.contains(Integer.valueOf(24));
    }

    /* renamed from: G */
    public final boolean mo19828G() {
        return this.f14604a.contains(Integer.valueOf(8));
    }

    /* renamed from: H */
    public final C5502d mo19829H() {
        return this.f14601X;
    }

    /* renamed from: I */
    public final List<C5507h> mo19830I() {
        return (ArrayList) this.f14610e0;
    }

    /* renamed from: J */
    public final int mo19831J() {
        return this.f14612g0;
    }

    /* renamed from: K */
    public final boolean mo19832K() {
        return this.f14604a.contains(Integer.valueOf(7));
    }

    /* renamed from: L */
    public final boolean mo19833L() {
        return this.f14604a.contains(Integer.valueOf(29));
    }

    /* renamed from: M */
    public final C5496a mo19834M() {
        return this.f14592O;
    }

    /* renamed from: N */
    public final boolean mo19835N() {
        return this.f14604a.contains(Integer.valueOf(23));
    }

    /* renamed from: N0 */
    public final /* synthetic */ Map mo17325N0() {
        return f14590l0;
    }

    /* renamed from: O */
    public final int mo19836O() {
        return this.f14595R;
    }

    /* renamed from: P */
    public final int mo19837P() {
        return this.f14611f0;
    }

    /* renamed from: Q */
    public final boolean mo19838Q() {
        return this.f14604a.contains(Integer.valueOf(14));
    }

    /* renamed from: R */
    public final C5497b mo19839R() {
        return this.f14596S;
    }

    /* renamed from: S */
    public final String mo19840S() {
        return this.f14597T;
    }

    /* renamed from: T */
    public final boolean mo19841T() {
        return this.f14604a.contains(Integer.valueOf(28));
    }

    /* renamed from: U */
    public final boolean mo19842U() {
        return this.f14604a.contains(Integer.valueOf(6));
    }

    /* renamed from: V */
    public final List<C5509j> mo19843V() {
        return (ArrayList) this.f14615j0;
    }

    /* renamed from: W */
    public final boolean mo19844W() {
        return this.f14604a.contains(Integer.valueOf(21));
    }

    /* renamed from: X */
    public final boolean mo19845X() {
        return this.f14602Y;
    }

    /* renamed from: Y */
    public final boolean mo19846Y() {
        return this.f14604a.contains(Integer.valueOf(22));
    }

    /* renamed from: Z */
    public final int mo19847Z() {
        return this.f14599V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo17326a(Field field) {
        switch (field.mo18507N()) {
            case 2:
                return this.f14591N;
            case 3:
                return this.f14592O;
            case 4:
                return this.f14593P;
            case 5:
                return this.f14594Q;
            case 6:
                return Integer.valueOf(this.f14595R);
            case 7:
                return this.f14596S;
            case 8:
                return this.f14597T;
            case 9:
                return this.f14598U;
            case 12:
                return Integer.valueOf(this.f14599V);
            case 14:
                return this.f14600W;
            case 15:
                return this.f14601X;
            case 16:
                return Boolean.valueOf(this.f14602Y);
            case 18:
                return this.f14603Z;
            case 19:
                return this.f14605a0;
            case 20:
                return this.f14607b0;
            case 21:
                return Integer.valueOf(this.f14608c0);
            case 22:
                return this.f14609d0;
            case 23:
                return this.f14610e0;
            case 24:
                return Integer.valueOf(this.f14611f0);
            case 25:
                return Integer.valueOf(this.f14612g0);
            case 26:
                return this.f14613h0;
            case 27:
                return this.f14614i0;
            case 28:
                return this.f14615j0;
            case 29:
                return Boolean.valueOf(this.f14616k0);
            default:
                int N = field.mo18507N();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(N);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17335a(Field<?, ?> field, String str, int i) {
        int N = field.mo18507N();
        if (N == 6) {
            this.f14595R = i;
        } else if (N == 12) {
            this.f14599V = i;
        } else if (N == 21) {
            this.f14608c0 = i;
        } else if (N == 24) {
            this.f14611f0 = i;
        } else if (N == 25) {
            this.f14612g0 = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14604a.add(Integer.valueOf(N));
    }

    /* renamed from: a */
    public final <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
        int N = field.mo18507N();
        if (N == 3) {
            this.f14592O = (zza) t;
        } else if (N == 7) {
            this.f14596S = (zzb) t;
        } else if (N == 15) {
            this.f14601X = (zzc) t;
        } else if (N == 19) {
            this.f14605a0 = (zzd) t;
        } else {
            String canonicalName = t.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14604a.add(Integer.valueOf(N));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17333a(Field<?, ?> field, String str, String str2) {
        int N = field.mo18507N();
        if (N == 2) {
            this.f14591N = str2;
        } else if (N == 14) {
            this.f14600W = str2;
        } else if (N == 18) {
            this.f14603Z = str2;
        } else if (N == 20) {
            this.f14607b0 = str2;
        } else if (N == 4) {
            this.f14593P = str2;
        } else if (N == 5) {
            this.f14594Q = str2;
        } else if (N == 8) {
            this.f14597T = str2;
        } else if (N == 9) {
            this.f14598U = str2;
        } else if (N == 26) {
            this.f14613h0 = str2;
        } else if (N == 27) {
            this.f14614i0 = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14604a.add(Integer.valueOf(N));
    }

    /* renamed from: a */
    public final <T extends FastJsonResponse> void mo17328a(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        int N = field.mo18507N();
        if (N == 22) {
            this.f14609d0 = arrayList;
        } else if (N == 23) {
            this.f14610e0 = arrayList;
        } else if (N == 28) {
            this.f14615j0 = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14604a.add(Integer.valueOf(N));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18484a(Field<?, ?> field, String str, boolean z) {
        int N = field.mo18507N();
        if (N == 16) {
            this.f14602Y = z;
        } else if (N == 29) {
            this.f14616k0 = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(N);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14604a.add(Integer.valueOf(N));
    }

    /* renamed from: a */
    public final boolean mo18088a() {
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18089b() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo17329b(Field field) {
        return this.f14604a.contains(Integer.valueOf(field.mo18507N()));
    }

    /* renamed from: c */
    public final String mo19848c() {
        return this.f14614i0;
    }

    /* renamed from: e */
    public final boolean mo19849e() {
        return this.f14604a.contains(Integer.valueOf(27));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzr zzr = (zzr) obj;
        for (Field field : f14590l0.values()) {
            if (mo17329b(field)) {
                if (!zzr.mo17329b(field) || !mo17326a(field).equals(zzr.mo17326a(field))) {
                    return false;
                }
            } else if (zzr.mo17329b(field)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo19850f() {
        return this.f14604a.contains(Integer.valueOf(19));
    }

    public final String getId() {
        return this.f14600W;
    }

    public final String getLanguage() {
        return this.f14603Z;
    }

    public final C5503e getName() {
        return this.f14605a0;
    }

    /* renamed from: h */
    public final boolean mo19854h() {
        return this.f14604a.contains(Integer.valueOf(3));
    }

    public final int hashCode() {
        int i = 0;
        for (Field field : f14590l0.values()) {
            if (mo17329b(field)) {
                i = i + field.mo18507N() + mo17326a(field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo19855i() {
        return this.f14604a.contains(Integer.valueOf(15));
    }

    /* renamed from: l */
    public final boolean mo19856l() {
        return this.f14604a.contains(Integer.valueOf(18));
    }

    /* renamed from: m */
    public final String mo19857m() {
        return this.f14613h0;
    }

    /* renamed from: n */
    public final boolean mo19858n() {
        return this.f14604a.contains(Integer.valueOf(2));
    }

    /* renamed from: o */
    public final boolean mo19859o() {
        return this.f14616k0;
    }

    /* renamed from: p */
    public final String mo19860p() {
        return this.f14594Q;
    }

    /* renamed from: r */
    public final boolean mo19861r() {
        return this.f14604a.contains(Integer.valueOf(5));
    }

    /* renamed from: s */
    public final String mo19862s() {
        return this.f14598U;
    }

    /* renamed from: t */
    public final String mo19863t() {
        return this.f14607b0;
    }

    /* renamed from: u */
    public final boolean mo19864u() {
        return this.f14604a.contains(Integer.valueOf(12));
    }

    /* renamed from: v */
    public final String mo19865v() {
        return this.f14591N;
    }

    /* renamed from: w */
    public final int mo19866w() {
        return this.f14608c0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        Set<Integer> set = this.f14604a;
        if (set.contains(Integer.valueOf(1))) {
            C4399a.m18964a(parcel, 1, this.f14606b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C4399a.m18979a(parcel, 2, this.f14591N, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C4399a.m18969a(parcel, 3, (Parcelable) this.f14592O, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C4399a.m18979a(parcel, 4, this.f14593P, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C4399a.m18979a(parcel, 5, this.f14594Q, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C4399a.m18964a(parcel, 6, this.f14595R);
        }
        if (set.contains(Integer.valueOf(7))) {
            C4399a.m18969a(parcel, 7, (Parcelable) this.f14596S, i, true);
        }
        if (set.contains(Integer.valueOf(8))) {
            C4399a.m18979a(parcel, 8, this.f14597T, true);
        }
        if (set.contains(Integer.valueOf(9))) {
            C4399a.m18979a(parcel, 9, this.f14598U, true);
        }
        if (set.contains(Integer.valueOf(12))) {
            C4399a.m18964a(parcel, 12, this.f14599V);
        }
        if (set.contains(Integer.valueOf(14))) {
            C4399a.m18979a(parcel, 14, this.f14600W, true);
        }
        if (set.contains(Integer.valueOf(15))) {
            C4399a.m18969a(parcel, 15, (Parcelable) this.f14601X, i, true);
        }
        if (set.contains(Integer.valueOf(16))) {
            C4399a.m18984a(parcel, 16, this.f14602Y);
        }
        if (set.contains(Integer.valueOf(18))) {
            C4399a.m18979a(parcel, 18, this.f14603Z, true);
        }
        if (set.contains(Integer.valueOf(19))) {
            C4399a.m18969a(parcel, 19, (Parcelable) this.f14605a0, i, true);
        }
        if (set.contains(Integer.valueOf(20))) {
            C4399a.m18979a(parcel, 20, this.f14607b0, true);
        }
        if (set.contains(Integer.valueOf(21))) {
            C4399a.m18964a(parcel, 21, this.f14608c0);
        }
        if (set.contains(Integer.valueOf(22))) {
            C4399a.m19017j(parcel, 22, this.f14609d0, true);
        }
        if (set.contains(Integer.valueOf(23))) {
            C4399a.m19017j(parcel, 23, this.f14610e0, true);
        }
        if (set.contains(Integer.valueOf(24))) {
            C4399a.m18964a(parcel, 24, this.f14611f0);
        }
        if (set.contains(Integer.valueOf(25))) {
            C4399a.m18964a(parcel, 25, this.f14612g0);
        }
        if (set.contains(Integer.valueOf(26))) {
            C4399a.m18979a(parcel, 26, this.f14613h0, true);
        }
        if (set.contains(Integer.valueOf(27))) {
            C4399a.m18979a(parcel, 27, this.f14614i0, true);
        }
        if (set.contains(Integer.valueOf(28))) {
            C4399a.m19017j(parcel, 28, this.f14615j0, true);
        }
        if (set.contains(Integer.valueOf(29))) {
            C4399a.m18984a(parcel, 29, this.f14616k0);
        }
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: x */
    public final boolean mo19867x() {
        return this.f14604a.contains(Integer.valueOf(9));
    }

    /* renamed from: y */
    public final boolean mo19868y() {
        return this.f14604a.contains(Integer.valueOf(4));
    }

    /* renamed from: z */
    public final boolean mo19869z() {
        return this.f14604a.contains(Integer.valueOf(26));
    }
}
