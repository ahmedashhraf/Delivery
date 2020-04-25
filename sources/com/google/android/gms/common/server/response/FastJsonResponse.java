package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.C4413y.C4414a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.util.C4473c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4499r;
import com.google.android.gms.common.util.C4500s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C4056a
@C4312d0
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class FastJsonResponse {

    @C4392a(creator = "FieldCreator")
    @C4312d0
    @C4056a
    @C4476d0
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C4456i CREATOR = new C4456i();
        @C4394c(getter = "isTypeInArray", mo18384id = 3)

        /* renamed from: N */
        protected final boolean f13622N;
        @C4394c(getter = "getTypeOut", mo18384id = 4)

        /* renamed from: O */
        protected final int f13623O;
        @C4394c(getter = "isTypeOutArray", mo18384id = 5)

        /* renamed from: P */
        protected final boolean f13624P;
        @C4394c(getter = "getOutputFieldName", mo18384id = 6)

        /* renamed from: Q */
        protected final String f13625Q;
        @C4394c(getter = "getSafeParcelableFieldId", mo18384id = 7)

        /* renamed from: R */
        protected final int f13626R;

        /* renamed from: S */
        protected final Class<? extends FastJsonResponse> f13627S;
        @C4394c(getter = "getConcreteTypeName", mo18384id = 8)

        /* renamed from: T */
        private final String f13628T;

        /* renamed from: U */
        private zaj f13629U;
        /* access modifiers changed from: private */
        @C4394c(getter = "getWrappedConverter", mo18384id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")

        /* renamed from: V */
        public C4446a<I, O> f13630V;
        @C4398g(getter = "getVersionCode", mo18390id = 1)

        /* renamed from: a */
        private final int f13631a;
        @C4394c(getter = "getTypeIn", mo18384id = 2)

        /* renamed from: b */
        protected final int f13632b;

        @C4393b
        Field(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) boolean z, @C4396e(mo18387id = 4) int i3, @C4396e(mo18387id = 5) boolean z2, @C4396e(mo18387id = 6) String str, @C4396e(mo18387id = 7) int i4, @C4396e(mo18387id = 8) String str2, @C4396e(mo18387id = 9) zab zab) {
            this.f13631a = i;
            this.f13632b = i2;
            this.f13622N = z;
            this.f13623O = i3;
            this.f13624P = z2;
            this.f13625Q = str;
            this.f13626R = i4;
            if (str2 == null) {
                this.f13627S = null;
                this.f13628T = null;
            } else {
                this.f13627S = SafeParcelResponse.class;
                this.f13628T = str2;
            }
            if (zab == null) {
                this.f13630V = null;
            } else {
                this.f13630V = zab.mo18470N();
            }
        }

        /* renamed from: S */
        private final String m19167S() {
            String str = this.f13628T;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: T */
        private final zab m19168T() {
            C4446a<I, O> aVar = this.f13630V;
            if (aVar == null) {
                return null;
            }
            return zab.m19118a(aVar);
        }

        @C4056a
        /* renamed from: b */
        public static Field<Boolean, Boolean> m19173b(String str, int i) {
            Field field = new Field(6, false, 6, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: c */
        public static Field<Double, Double> m19175c(String str, int i) {
            Field field = new Field(4, false, 4, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: d */
        public static Field<Float, Float> m19176d(String str, int i) {
            Field field = new Field(3, false, 3, false, str, i, null, null);
            return field;
        }

        @C4056a
        @C4476d0
        /* renamed from: e */
        public static Field<Integer, Integer> m19177e(String str, int i) {
            Field field = new Field(0, false, 0, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: f */
        public static Field<Long, Long> m19178f(String str, int i) {
            Field field = new Field(2, false, 2, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: g */
        public static Field<String, String> m19179g(String str, int i) {
            Field field = new Field(7, false, 7, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: h */
        public static Field<HashMap<String, String>, HashMap<String, String>> m19180h(String str, int i) {
            Field field = new Field(10, false, 10, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: i */
        public static Field<ArrayList<String>, ArrayList<String>> m19181i(String str, int i) {
            Field field = new Field(7, true, 7, true, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: N */
        public int mo18507N() {
            return this.f13626R;
        }

        /* renamed from: O */
        public final Field<I, O> mo18508O() {
            Field field = new Field(this.f13631a, this.f13632b, this.f13622N, this.f13623O, this.f13624P, this.f13625Q, this.f13626R, this.f13628T, m19168T());
            return field;
        }

        /* renamed from: P */
        public final boolean mo18509P() {
            return this.f13630V != null;
        }

        /* renamed from: Q */
        public final FastJsonResponse mo18510Q() throws InstantiationException, IllegalAccessException {
            Class<? extends FastJsonResponse> cls = this.f13627S;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            C4300a0.m18621a(this.f13629U, (Object) "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f13629U, this.f13628T);
        }

        /* renamed from: R */
        public final Map<String, Field<?, ?>> mo18511R() {
            C4300a0.m18620a(this.f13628T);
            C4300a0.m18620a(this.f13629U);
            return this.f13629U.mo18539c(this.f13628T);
        }

        /* renamed from: a */
        public final void mo18513a(zaj zaj) {
            this.f13629U = zaj;
        }

        public final O convert(I i) {
            return this.f13630V.convert(i);
        }

        public String toString() {
            String str = "typeIn";
            String str2 = "typeInArray";
            String str3 = "typeOut";
            String str4 = "typeOutArray";
            String str5 = "outputFieldName";
            String str6 = "safeParcelFieldId";
            String str7 = "concreteTypeName";
            C4414a a = C4413y.m19052a((Object) this).mo18403a("versionCode", Integer.valueOf(this.f13631a)).mo18403a(str, Integer.valueOf(this.f13632b)).mo18403a(str2, Boolean.valueOf(this.f13622N)).mo18403a(str3, Integer.valueOf(this.f13623O)).mo18403a(str4, Boolean.valueOf(this.f13624P)).mo18403a(str5, this.f13625Q).mo18403a(str6, Integer.valueOf(this.f13626R)).mo18403a(str7, m19167S());
            Class<? extends FastJsonResponse> cls = this.f13627S;
            if (cls != null) {
                a.mo18403a("concreteType.class", cls.getCanonicalName());
            }
            C4446a<I, O> aVar = this.f13630V;
            if (aVar != null) {
                a.mo18403a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            C4399a.m18964a(parcel, 1, this.f13631a);
            C4399a.m18964a(parcel, 2, this.f13632b);
            C4399a.m18984a(parcel, 3, this.f13622N);
            C4399a.m18964a(parcel, 4, this.f13623O);
            C4399a.m18984a(parcel, 5, this.f13624P);
            C4399a.m18979a(parcel, 6, this.f13625Q, false);
            C4399a.m18964a(parcel, 7, mo18507N());
            C4399a.m18979a(parcel, 8, m19167S(), false);
            C4399a.m18969a(parcel, 9, (Parcelable) m19168T(), i, false);
            C4399a.m18959a(parcel, a);
        }

        @C4056a
        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m19174b(String str, int i, Class<T> cls) {
            Field field = new Field(11, true, 11, true, str, i, cls, null);
            return field;
        }

        /* renamed from: a */
        public final I mo18512a(O o) {
            return this.f13630V.mo18460a(o);
        }

        @C4056a
        @C4476d0
        /* renamed from: a */
        public static Field<byte[], byte[]> m19169a(String str, int i) {
            Field field = new Field(8, false, 8, false, str, i, null, null);
            return field;
        }

        @C4056a
        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m19171a(String str, int i, Class<T> cls) {
            Field field = new Field(11, false, 11, false, str, i, cls, null);
            return field;
        }

        @C4056a
        /* renamed from: a */
        public static Field m19170a(String str, int i, C4446a<?, ?> aVar, boolean z) {
            Field field = new Field(aVar.mo18457K(), z, aVar.mo18458L(), false, str, i, null, aVar);
            return field;
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C4446a<I, O> aVar) {
            this.f13631a = 1;
            this.f13632b = i;
            this.f13622N = z;
            this.f13623O = i2;
            this.f13624P = z2;
            this.f13625Q = str;
            this.f13626R = i3;
            this.f13627S = cls;
            if (cls == null) {
                this.f13628T = null;
            } else {
                this.f13628T = cls.getCanonicalName();
            }
            this.f13630V = aVar;
        }
    }

    @C4312d0
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface C4446a<I, O> {
        /* renamed from: K */
        int mo18457K();

        /* renamed from: L */
        int mo18458L();

        /* renamed from: a */
        I mo18460a(O o);

        O convert(I i);
    }

    /* renamed from: a */
    private final <I, O> void m19120a(Field<I, O> field, I i) {
        String str = field.f13625Q;
        Object convert = field.convert(i);
        int i2 = field.f13623O;
        switch (i2) {
            case 0:
                if (m19122a(str, (O) convert)) {
                    mo17335a(field, str, ((Integer) convert).intValue());
                    break;
                }
                break;
            case 1:
                mo18482a(field, str, (BigInteger) convert);
                return;
            case 2:
                if (m19122a(str, (O) convert)) {
                    mo18480a(field, str, ((Long) convert).longValue());
                    return;
                }
                break;
            case 4:
                if (m19122a(str, (O) convert)) {
                    mo18478a(field, str, ((Double) convert).doubleValue());
                    return;
                }
                break;
            case 5:
                mo18481a(field, str, (BigDecimal) convert);
                return;
            case 6:
                if (m19122a(str, (O) convert)) {
                    mo18484a(field, str, ((Boolean) convert).booleanValue());
                    return;
                }
                break;
            case 7:
                mo17333a(field, str, (String) convert);
                return;
            case 8:
            case 9:
                if (m19122a(str, (O) convert)) {
                    mo17336a(field, str, (byte[]) convert);
                    return;
                }
                break;
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    @C4056a
    /* renamed from: N0 */
    public abstract Map<String, Field<?, ?>> mo17325N0();

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract Object mo18472a(String str);

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: b */
    public boolean mo17329b(Field field) {
        if (field.f13623O != 11) {
            return mo18492b(field.f13625Q);
        }
        if (field.f13624P) {
            String str = field.f13625Q;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f13625Q;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: b */
    public abstract boolean mo18492b(String str);

    /* renamed from: c */
    public final <O> void mo18494c(Field<ArrayList<Long>, O> field, ArrayList<Long> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18497e(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: d */
    public final <O> void mo18496d(Field<ArrayList<Float>, O> field, ArrayList<Float> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18499f(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: e */
    public final <O> void mo18498e(Field<ArrayList<Double>, O> field, ArrayList<Double> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18501g(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: f */
    public final <O> void mo18500f(Field<ArrayList<BigDecimal>, O> field, ArrayList<BigDecimal> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18503h(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: g */
    public final <O> void mo18502g(Field<ArrayList<Boolean>, O> field, ArrayList<Boolean> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18505i(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: h */
    public final <O> void mo18504h(Field<ArrayList<String>, O> field, ArrayList<String> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo17331b(field, field.f13625Q, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18505i(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    @C4056a
    public String toString() {
        Map N0 = mo17325N0();
        StringBuilder sb = new StringBuilder(100);
        for (String str : N0.keySet()) {
            Field field = (Field) N0.get(str);
            if (mo17329b(field)) {
                Object b = m19123b(field, mo17326a(field));
                String str2 = ",";
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(str2);
                }
                String str3 = "\"";
                sb.append(str3);
                sb.append(str);
                sb.append("\":");
                if (b != null) {
                    switch (field.f13623O) {
                        case 8:
                            sb.append(str3);
                            sb.append(C4473c.m19315a((byte[]) b));
                            sb.append(str3);
                            break;
                        case 9:
                            sb.append(str3);
                            sb.append(C4473c.m19317b((byte[]) b));
                            sb.append(str3);
                            break;
                        case 10:
                            C4500s.m19404a(sb, (HashMap) b);
                            break;
                        default:
                            if (!field.f13622N) {
                                m19121a(sb, field, b);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) b;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(str2);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m19121a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18493c(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18495d(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18497e(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo18499f(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo18501g(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18503h(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    /* renamed from: b */
    protected static <O, I> I m19123b(Field<I, O> field, Object obj) {
        return field.f13630V != null ? field.mo18512a(obj) : obj;
    }

    /* renamed from: b */
    public final <O> void mo18491b(Field<ArrayList<BigInteger>, O> field, ArrayList<BigInteger> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18495d(field, field.f13625Q, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: b */
    public void mo17331b(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* renamed from: a */
    public final <O> void mo18475a(Field<Integer, O> field, int i) {
        if (field.f13630V != null) {
            m19120a(field, (I) Integer.valueOf(i));
        } else {
            mo17335a(field, field.f13625Q, i);
        }
    }

    /* renamed from: a */
    public final <O> void mo18487a(Field<ArrayList<Integer>, O> field, ArrayList<Integer> arrayList) {
        if (field.f13630V != null) {
            m19120a(field, (I) arrayList);
        } else {
            mo18493c(field, field.f13625Q, arrayList);
        }
    }

    /* renamed from: a */
    public final <O> void mo18486a(Field<BigInteger, O> field, BigInteger bigInteger) {
        if (field.f13630V != null) {
            m19120a(field, (I) bigInteger);
        } else {
            mo18482a(field, field.f13625Q, bigInteger);
        }
    }

    /* renamed from: a */
    public final <O> void mo18476a(Field<Long, O> field, long j) {
        if (field.f13630V != null) {
            m19120a(field, (I) Long.valueOf(j));
        } else {
            mo18480a(field, field.f13625Q, j);
        }
    }

    /* renamed from: a */
    public final <O> void mo18474a(Field<Float, O> field, float f) {
        if (field.f13630V != null) {
            m19120a(field, (I) Float.valueOf(f));
        } else {
            mo18479a(field, field.f13625Q, f);
        }
    }

    /* renamed from: a */
    public final <O> void mo18473a(Field<Double, O> field, double d) {
        if (field.f13630V != null) {
            m19120a(field, (I) Double.valueOf(d));
        } else {
            mo18478a(field, field.f13625Q, d);
        }
    }

    /* renamed from: a */
    public final <O> void mo18485a(Field<BigDecimal, O> field, BigDecimal bigDecimal) {
        if (field.f13630V != null) {
            m19120a(field, (I) bigDecimal);
        } else {
            mo18481a(field, field.f13625Q, bigDecimal);
        }
    }

    /* renamed from: a */
    public final <O> void mo18489a(Field<Boolean, O> field, boolean z) {
        if (field.f13630V != null) {
            m19120a(field, (I) Boolean.valueOf(z));
        } else {
            mo18484a(field, field.f13625Q, z);
        }
    }

    /* renamed from: a */
    public final <O> void mo18477a(Field<String, O> field, String str) {
        if (field.f13630V != null) {
            m19120a(field, (I) str);
        } else {
            mo17333a(field, field.f13625Q, str);
        }
    }

    /* renamed from: a */
    public final <O> void mo18490a(Field<byte[], O> field, byte[] bArr) {
        if (field.f13630V != null) {
            m19120a(field, (I) bArr);
        } else {
            mo17336a(field, field.f13625Q, bArr);
        }
    }

    /* renamed from: a */
    public final <O> void mo18488a(Field<Map<String, String>, O> field, Map<String, String> map) {
        if (field.f13630V != null) {
            m19120a(field, (I) map);
        } else {
            mo18483a(field, field.f13625Q, map);
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo17335a(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18482a(Field<?, ?> field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo18480a(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18479a(Field<?, ?> field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18478a(Field<?, ?> field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18481a(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo18484a(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo17333a(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo17336a(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo18483a(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    /* renamed from: a */
    private static <O> boolean m19122a(String str, O o) {
        if (o != null) {
            return true;
        }
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            sb.toString();
        }
        return false;
    }

    @C4056a
    /* renamed from: a */
    public <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @C4056a
    /* renamed from: a */
    public <T extends FastJsonResponse> void mo17328a(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public Object mo17326a(Field field) {
        String str = field.f13625Q;
        if (field.f13627S == null) {
            return mo18472a(str);
        }
        C4300a0.m18633b(mo18472a(str) == null, "Concrete field shouldn't be value object: %s", field.f13625Q);
        boolean z = field.f13624P;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m19121a(StringBuilder sb, Field field, Object obj) {
        int i = field.f13632b;
        if (i == 11) {
            sb.append(((FastJsonResponse) field.f13627S.cast(obj)).toString());
        } else if (i == 7) {
            String str = "\"";
            sb.append(str);
            sb.append(C4499r.m19401a((String) obj));
            sb.append(str);
        } else {
            sb.append(obj);
        }
    }
}
