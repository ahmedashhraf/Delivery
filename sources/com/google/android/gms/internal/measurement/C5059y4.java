package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C5059y4 extends C4991t2<String> implements C5046x4, RandomAccess {

    /* renamed from: N */
    private static final C5059y4 f14536N;

    /* renamed from: O */
    private static final C5046x4 f14537O = f14536N;

    /* renamed from: b */
    private final List<Object> f14538b;

    static {
        C5059y4 y4Var = new C5059y4();
        f14536N = y4Var;
        y4Var.mo19361d();
    }

    public C5059y4() {
        this(10);
    }

    /* renamed from: a */
    public final void mo18920a(C5070z2 z2Var) {
        mo19681b();
        this.f14538b.add(z2Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo19681b();
        this.f14538b.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo19681b();
        this.f14538b.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final Object mo18921e(int i) {
        return this.f14538b.get(i);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public final C5046x4 mo18922g() {
        return mo19360a() ? new C4727d7(this) : this;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f14538b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5070z2) {
            C5070z2 z2Var = (C5070z2) obj;
            String i2 = z2Var.mo19764i();
            if (z2Var.mo19165e()) {
                this.f14538b.set(i, i2);
            }
            return i2;
        }
        byte[] bArr = (byte[]) obj;
        String b = C4819j4.m20399b(bArr);
        if (C4819j4.m20398a(bArr)) {
            this.f14538b.set(i, b);
        }
        return b;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final List<?> mo18924i() {
        return Collections.unmodifiableList(this.f14538b);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo19681b();
        return m21828a(this.f14538b.set(i, str));
    }

    public final int size() {
        return this.f14538b.size();
    }

    public C5059y4(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo19681b();
        if (collection instanceof C5046x4) {
            collection = ((C5046x4) collection).mo18924i();
        }
        boolean addAll = this.f14538b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo19681b();
        Object remove = this.f14538b.remove(i);
        this.modCount++;
        return m21828a(remove);
    }

    private C5059y4(ArrayList<Object> arrayList) {
        this.f14538b = arrayList;
    }

    /* renamed from: a */
    private static String m21828a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5070z2) {
            return ((C5070z2) obj).mo19764i();
        }
        return C4819j4.m20399b((byte[]) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo19360a() {
        return super.mo19360a();
    }

    /* renamed from: a */
    public final /* synthetic */ C4912p4 mo18907a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f14538b);
            return new C5059y4(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
