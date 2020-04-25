package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.data.C4263a;
import com.google.android.gms.common.data.C4264b;
import java.util.Iterator;

@C4056a
/* renamed from: com.google.android.gms.common.api.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4082g<T, R extends C4263a<T> & C4246q> extends C4245p<R> implements C4264b<T> {
    @C4056a
    public C4082g() {
    }

    public void close() {
        ((C4263a) getResult()).close();
    }

    public T get(int i) {
        return ((C4263a) getResult()).get(i);
    }

    public int getCount() {
        return ((C4263a) getResult()).getCount();
    }

    public boolean isClosed() {
        return ((C4263a) getResult()).isClosed();
    }

    public Iterator<T> iterator() {
        return ((C4263a) getResult()).iterator();
    }

    /* renamed from: j */
    public Bundle mo17665j() {
        return ((C4263a) getResult()).mo17665j();
    }

    /* renamed from: k */
    public Iterator<T> mo17666k() {
        return ((C4263a) getResult()).mo17666k();
    }

    public void release() {
        ((C4263a) getResult()).release();
    }

    @C4056a
    public C4082g(@C0193h0 R r) {
        super(r);
    }
}
