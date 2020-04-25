package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C4471b;
import com.google.android.gms.common.util.C4473c;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4499r;
import com.google.android.gms.common.util.C4500s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@C4056a
@C4392a(creator = "SafeParcelResponseCreator")
@C4476d0
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @C4056a
    public static final Creator<SafeParcelResponse> CREATOR = new C4460m();

    /* renamed from: N */
    private final int f13653N;
    @C4394c(getter = "getFieldMappingDictionary", mo18384id = 3)

    /* renamed from: O */
    private final zaj f13654O;

    /* renamed from: P */
    private final String f13655P;

    /* renamed from: Q */
    private int f13656Q;

    /* renamed from: R */
    private int f13657R;
    @C4398g(getter = "getVersionCode", mo18390id = 1)

    /* renamed from: a */
    private final int f13658a;
    @C4394c(getter = "getParcel", mo18384id = 2)

    /* renamed from: b */
    private final Parcel f13659b;

    public SafeParcelResponse(zaj zaj, String str) {
        this.f13658a = 1;
        this.f13659b = Parcel.obtain();
        this.f13653N = 0;
        this.f13654O = (zaj) C4300a0.m18620a(zaj);
        this.f13655P = (String) C4300a0.m18620a(str);
        this.f13656Q = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel m19224P0() {
        /*
            r2 = this;
            int r0 = r2.f13656Q
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f13659b
            int r0 = com.google.android.gms.common.internal.safeparcel.C4399a.m18958a(r0)
            r2.f13657R = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f13659b
            int r1 = r2.f13657R
            com.google.android.gms.common.internal.safeparcel.C4399a.m18959a(r0, r1)
            r0 = 2
            r2.f13656Q = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f13659b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m19224P0():android.os.Parcel");
    }

    @C4056a
    /* renamed from: a */
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse m19225a(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        zaj zaj = new zaj(t.getClass());
        m19226a(zaj, t);
        zaj.mo18535O();
        zaj.mo18534N();
        return new SafeParcelResponse((SafeParcelable) t, zaj, canonicalName);
    }

    /* renamed from: c */
    private final void m19230c(Field<?, ?> field) {
        if (field.f13626R != -1) {
            Parcel parcel = this.f13659b;
            if (parcel != null) {
                int i = this.f13656Q;
                if (i == 0) {
                    this.f13657R = C4399a.m18958a(parcel);
                    this.f13656Q = 1;
                } else if (i == 1) {
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
                    }
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* renamed from: N0 */
    public Map<String, Field<?, ?>> mo17325N0() {
        zaj zaj = this.f13654O;
        if (zaj == null) {
            return null;
        }
        return zaj.mo18539c(this.f13655P);
    }

    /* renamed from: b */
    public boolean mo18492b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18495d(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        C4399a.m18996a(this.f13659b, field.mo18507N(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo18497e(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        C4399a.m18990a(this.f13659b, field.mo18507N(), jArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo18499f(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        C4399a.m18988a(this.f13659b, field.mo18507N(), fArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo18501g(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        C4399a.m18987a(this.f13659b, field.mo18507N(), dArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo18503h(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        C4399a.m18995a(this.f13659b, field.mo18507N(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18505i(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        C4399a.m18997a(this.f13659b, field.mo18507N(), zArr, true);
    }

    public String toString() {
        C4300a0.m18621a(this.f13654O, (Object) "Cannot convert to JSON on client side.");
        Parcel P0 = m19224P0();
        P0.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m19229a(sb, this.f13654O.mo18539c(this.f13655P), P0);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zaj zaj;
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13658a);
        C4399a.m18968a(parcel, 2, m19224P0(), false);
        int i2 = this.f13653N;
        if (i2 == 0) {
            zaj = null;
        } else if (i2 == 1) {
            zaj = this.f13654O;
        } else if (i2 == 2) {
            zaj = this.f13654O;
        } else {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        C4399a.m18969a(parcel, 3, (Parcelable) zaj, i, false);
        C4399a.m18959a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17331b(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        C4399a.m18994a(this.f13659b, field.mo18507N(), strArr, true);
    }

    /* renamed from: a */
    private static void m19226a(zaj zaj, FastJsonResponse fastJsonResponse) {
        Class cls = fastJsonResponse.getClass();
        if (!zaj.mo18538a(cls)) {
            Map N0 = fastJsonResponse.mo17325N0();
            zaj.mo18537a(cls, N0);
            for (String str : N0.keySet()) {
                Field field = (Field) N0.get(str);
                Class<? extends FastJsonResponse> cls2 = field.f13627S;
                if (cls2 != null) {
                    try {
                        m19226a(zaj, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        String str2 = "Could not instantiate an object of type ";
                        String valueOf = String.valueOf(field.f13627S.getCanonicalName());
                        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
                    } catch (IllegalAccessException e2) {
                        String str3 = "Could not access object of type ";
                        String valueOf2 = String.valueOf(field.f13627S.getCanonicalName());
                        throw new IllegalStateException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), e2);
                    }
                }
            }
        }
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zaj zaj, String str) {
        this.f13658a = 1;
        this.f13659b = Parcel.obtain();
        safeParcelable.writeToParcel(this.f13659b, 0);
        this.f13653N = 1;
        this.f13654O = (zaj) C4300a0.m18620a(zaj);
        this.f13655P = (String) C4300a0.m18620a(str);
        this.f13656Q = 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo18493c(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        m19230c(field);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        C4399a.m18989a(this.f13659b, field.mo18507N(), iArr, true);
    }

    @C4393b
    SafeParcelResponse(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) Parcel parcel, @C4396e(mo18387id = 3) zaj zaj) {
        this.f13658a = i;
        this.f13659b = (Parcel) C4300a0.m18620a(parcel);
        this.f13653N = 2;
        this.f13654O = zaj;
        zaj zaj2 = this.f13654O;
        if (zaj2 == null) {
            this.f13655P = null;
        } else {
            this.f13655P = zaj2.mo18536P();
        }
        this.f13656Q = 2;
    }

    /* renamed from: a */
    public Object mo18472a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17335a(Field<?, ?> field, String str, int i) {
        m19230c(field);
        C4399a.m18964a(this.f13659b, field.mo18507N(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18482a(Field<?, ?> field, String str, BigInteger bigInteger) {
        m19230c(field);
        C4399a.m18981a(this.f13659b, field.mo18507N(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18480a(Field<?, ?> field, String str, long j) {
        m19230c(field);
        C4399a.m18965a(this.f13659b, field.mo18507N(), j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18479a(Field<?, ?> field, String str, float f) {
        m19230c(field);
        C4399a.m18963a(this.f13659b, field.mo18507N(), f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18478a(Field<?, ?> field, String str, double d) {
        m19230c(field);
        C4399a.m18962a(this.f13659b, field.mo18507N(), d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18481a(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        m19230c(field);
        C4399a.m18980a(this.f13659b, field.mo18507N(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18484a(Field<?, ?> field, String str, boolean z) {
        m19230c(field);
        C4399a.m18984a(this.f13659b, field.mo18507N(), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17333a(Field<?, ?> field, String str, String str2) {
        m19230c(field);
        C4399a.m18979a(this.f13659b, field.mo18507N(), str2, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17336a(Field<?, ?> field, String str, byte[] bArr) {
        m19230c(field);
        C4399a.m18985a(this.f13659b, field.mo18507N(), bArr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18483a(Field<?, ?> field, String str, Map<String, String> map) {
        m19230c(field);
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        C4399a.m18966a(this.f13659b, field.mo18507N(), bundle, true);
    }

    /* renamed from: a */
    public <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
        m19230c(field);
        C4399a.m18968a(this.f13659b, field.mo18507N(), ((SafeParcelResponse) t).m19224P0(), true);
    }

    /* renamed from: a */
    public <T extends FastJsonResponse> void mo17328a(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        m19230c(field);
        ArrayList arrayList2 = new ArrayList();
        arrayList.size();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((SafeParcelResponse) obj).m19224P0());
        }
        C4399a.m19015h(this.f13659b, field.mo18507N(), arrayList2, true);
    }

    /* renamed from: a */
    private final void m19229a(StringBuilder sb, Map<String, Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((Field) entry.getValue()).mo18507N(), entry);
        }
        sb.append('{');
        int b = SafeParcelReader.m18926b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            Entry entry2 = (Entry) sparseArray.get(SafeParcelReader.m18919a(a));
            if (entry2 != null) {
                String str = ",";
                if (z) {
                    sb.append(str);
                }
                String str2 = (String) entry2.getKey();
                Field field = (Field) entry2.getValue();
                String str3 = "\"";
                sb.append(str3);
                sb.append(str2);
                sb.append("\":");
                if (field.mo18509P()) {
                    int i = field.f13623O;
                    switch (i) {
                        case 0:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) Integer.valueOf(SafeParcelReader.m18912T(parcel, a))));
                            break;
                        case 1:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) SafeParcelReader.m18929c(parcel, a)));
                            break;
                        case 2:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) Long.valueOf(SafeParcelReader.m18914V(parcel, a))));
                            break;
                        case 3:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) Float.valueOf(SafeParcelReader.m18909Q(parcel, a))));
                            break;
                        case 4:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) Double.valueOf(SafeParcelReader.m18907O(parcel, a))));
                            break;
                        case 5:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) SafeParcelReader.m18922a(parcel, a)));
                            break;
                        case 6:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) Boolean.valueOf(SafeParcelReader.m18903K(parcel, a))));
                            break;
                        case 7:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) SafeParcelReader.m18898F(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) SafeParcelReader.m18936h(parcel, a)));
                            break;
                        case 10:
                            Bundle g = SafeParcelReader.m18935g(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str4 : g.keySet()) {
                                hashMap.put(str4, g.getString(str4));
                            }
                            m19228a(sb, field, FastJsonResponse.m19123b(field, (Object) hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f13624P) {
                    sb.append("[");
                    switch (field.f13623O) {
                        case 0:
                            C4471b.m19300a(sb, SafeParcelReader.m18949u(parcel, a));
                            break;
                        case 1:
                            C4471b.m19302a(sb, (T[]) SafeParcelReader.m18932d(parcel, a));
                            break;
                        case 2:
                            C4471b.m19301a(sb, SafeParcelReader.m18951w(parcel, a));
                            break;
                        case 3:
                            C4471b.m19299a(sb, SafeParcelReader.m18943o(parcel, a));
                            break;
                        case 4:
                            C4471b.m19298a(sb, SafeParcelReader.m18940l(parcel, a));
                            break;
                        case 5:
                            C4471b.m19302a(sb, (T[]) SafeParcelReader.m18928b(parcel, a));
                            break;
                        case 6:
                            C4471b.m19304a(sb, SafeParcelReader.m18933e(parcel, a));
                            break;
                        case 7:
                            C4471b.m19303a(sb, SafeParcelReader.m18899G(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] z2 = SafeParcelReader.m18954z(parcel, a);
                            int length = z2.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(str);
                                }
                                z2[i2].setDataPosition(0);
                                m19229a(sb, field.mo18511R(), z2[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f13623O) {
                        case 0:
                            sb.append(SafeParcelReader.m18912T(parcel, a));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m18929c(parcel, a));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m18914V(parcel, a));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m18909Q(parcel, a));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m18907O(parcel, a));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m18922a(parcel, a));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m18903K(parcel, a));
                            break;
                        case 7:
                            String F = SafeParcelReader.m18898F(parcel, a);
                            sb.append(str3);
                            sb.append(C4499r.m19401a(F));
                            sb.append(str3);
                            break;
                        case 8:
                            byte[] h = SafeParcelReader.m18936h(parcel, a);
                            sb.append(str3);
                            sb.append(C4473c.m19315a(h));
                            sb.append(str3);
                            break;
                        case 9:
                            byte[] h2 = SafeParcelReader.m18936h(parcel, a);
                            sb.append(str3);
                            sb.append(C4473c.m19317b(h2));
                            sb.append(str3);
                            break;
                        case 10:
                            Bundle g2 = SafeParcelReader.m18935g(parcel, a);
                            Set<String> keySet = g2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z3 = true;
                            for (String str5 : keySet) {
                                if (!z3) {
                                    sb.append(str);
                                }
                                sb.append(str3);
                                sb.append(str5);
                                sb.append(str3);
                                sb.append(":");
                                sb.append(str3);
                                sb.append(C4499r.m19401a(g2.getString(str5)));
                                sb.append(str3);
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel y = SafeParcelReader.m18953y(parcel, a);
                            y.setDataPosition(0);
                            m19229a(sb, field.mo18511R(), y);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b);
        throw new ParseException(sb3.toString(), parcel);
    }

    /* renamed from: a */
    private final void m19228a(StringBuilder sb, Field<?, ?> field, Object obj) {
        if (field.f13622N) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m19227a(sb, field.f13632b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m19227a(sb, field.f13632b, obj);
    }

    /* renamed from: a */
    private static void m19227a(StringBuilder sb, int i, Object obj) {
        String str = "\"";
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append(str);
                sb.append(C4499r.m19401a(obj.toString()));
                sb.append(str);
                return;
            case 8:
                sb.append(str);
                sb.append(C4473c.m19315a((byte[]) obj));
                sb.append(str);
                return;
            case 9:
                sb.append(str);
                sb.append(C4473c.m19317b((byte[]) obj));
                sb.append(str);
                return;
            case 10:
                C4500s.m19404a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
