package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4713c7 implements ListIterator<String> {

    /* renamed from: N */
    private final /* synthetic */ C4727d7 f14029N;

    /* renamed from: a */
    private ListIterator<String> f14030a = this.f14029N.f14044a.listIterator(this.f14031b);

    /* renamed from: b */
    private final /* synthetic */ int f14031b;

    C4713c7(C4727d7 d7Var, int i) {
        this.f14029N = d7Var;
        this.f14031b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f14030a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f14030a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f14030a.next();
    }

    public final int nextIndex() {
        return this.f14030a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f14030a.previous();
    }

    public final int previousIndex() {
        return this.f14030a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
