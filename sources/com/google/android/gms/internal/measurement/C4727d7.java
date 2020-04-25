package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4727d7 extends AbstractList<String> implements C5046x4, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5046x4 f14044a;

    public C4727d7(C5046x4 x4Var) {
        this.f14044a = x4Var;
    }

    /* renamed from: a */
    public final void mo18920a(C5070z2 z2Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final Object mo18921e(int i) {
        return this.f14044a.mo18921e(i);
    }

    /* renamed from: g */
    public final C5046x4 mo18922g() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f14044a.get(i);
    }

    /* renamed from: i */
    public final List<?> mo18924i() {
        return this.f14044a.mo18924i();
    }

    public final Iterator<String> iterator() {
        return new C4777g7(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C4713c7(this, i);
    }

    public final int size() {
        return this.f14044a.size();
    }
}
