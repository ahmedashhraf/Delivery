package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.C4056a;
import java.util.NoSuchElementException;

@C4056a
/* renamed from: com.google.android.gms.common.data.l */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4275l<T> extends C4265c<T> {

    /* renamed from: N */
    private T f13272N;

    public C4275l(C4264b<T> bVar) {
        super(bVar);
    }

    public T next() {
        if (hasNext()) {
            this.f13261b++;
            int i = this.f13261b;
            if (i == 0) {
                this.f13272N = this.f13260a.get(0);
                T t = this.f13272N;
                if (!(t instanceof C4269f)) {
                    String valueOf = String.valueOf(t.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((C4269f) this.f13272N).mo18069a(i);
            }
            return this.f13272N;
        }
        int i2 = this.f13261b;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
