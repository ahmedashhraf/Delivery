package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4243n;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface C4264b<T> extends C4243n, Closeable, Iterable<T> {
    void close();

    T get(int i);

    int getCount();

    @Deprecated
    boolean isClosed();

    Iterator<T> iterator();

    @C4056a
    /* renamed from: j */
    Bundle mo17665j();

    /* renamed from: k */
    Iterator<T> mo17666k();

    void release();
}
