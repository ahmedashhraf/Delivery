package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.C4056a;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4263a<T> implements C4264b<T> {

    /* renamed from: a */
    protected final DataHolder f13259a;

    @C4056a
    protected C4263a(DataHolder dataHolder) {
        this.f13259a = dataHolder;
    }

    public final void close() {
        release();
    }

    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.f13259a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.f13259a;
        return dataHolder == null || dataHolder.isClosed();
    }

    public Iterator<T> iterator() {
        return new C4265c(this);
    }

    /* renamed from: j */
    public Bundle mo17665j() {
        return this.f13259a.mo18051j();
    }

    /* renamed from: k */
    public Iterator<T> mo17666k() {
        return new C4275l(this);
    }

    public void release() {
        DataHolder dataHolder = this.f13259a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
