package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Iterator;
import java.util.NoSuchElementException;

@C4056a
/* renamed from: com.google.android.gms.common.data.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4265c<T> implements Iterator<T> {

    /* renamed from: a */
    protected final C4264b<T> f13260a;

    /* renamed from: b */
    protected int f13261b = -1;

    public C4265c(C4264b<T> bVar) {
        this.f13260a = (C4264b) C4300a0.m18620a(bVar);
    }

    public boolean hasNext() {
        return this.f13261b < this.f13260a.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            C4264b<T> bVar = this.f13260a;
            int i = this.f13261b + 1;
            this.f13261b = i;
            return bVar.get(i);
        }
        int i2 = this.f13261b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
