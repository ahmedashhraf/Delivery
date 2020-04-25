package com.google.android.gms.common.api;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4246q;

/* renamed from: com.google.android.gms.common.api.s */
public abstract class C4248s<R extends C4246q> implements C4247r<R> {
    /* renamed from: a */
    public abstract void mo18007a(@C0193h0 Status status);

    @C4056a
    /* renamed from: a */
    public final void mo17815a(@C0193h0 R r) {
        Status f = r.mo17504f();
        if (f.mo17617T()) {
            mo18009b(r);
            return;
        }
        mo18007a(f);
        if (r instanceof C4243n) {
            try {
                ((C4243n) r).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(r);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* renamed from: b */
    public abstract void mo18009b(@C0193h0 R r);
}
