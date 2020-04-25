package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.o */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4175o {

    /* renamed from: a */
    private final Set<C4167n<?>> f13083a = Collections.newSetFromMap(new WeakHashMap());

    @C4056a
    /* renamed from: b */
    public static <L> C4167n<L> m18099b(@C0193h0 L l, @C0193h0 Looper looper, @C0193h0 String str) {
        C4300a0.m18621a(l, (Object) "Listener must not be null");
        C4300a0.m18621a(looper, (Object) "Looper must not be null");
        C4300a0.m18621a(str, (Object) "Listener type must not be null");
        return new C4167n<>(looper, l, str);
    }

    /* renamed from: a */
    public final <L> C4167n<L> mo17940a(@C0193h0 L l, @C0193h0 Looper looper, @C0193h0 String str) {
        C4167n<L> b = m18099b(l, looper, str);
        this.f13083a.add(b);
        return b;
    }

    /* renamed from: a */
    public final void mo17941a() {
        for (C4167n a : this.f13083a) {
            a.mo17930a();
        }
        this.f13083a.clear();
    }

    @C4056a
    /* renamed from: a */
    public static <L> C4168a<L> m18098a(@C0193h0 L l, @C0193h0 String str) {
        C4300a0.m18621a(l, (Object) "Listener must not be null");
        C4300a0.m18621a(str, (Object) "Listener type must not be null");
        C4300a0.m18622a(str, (Object) "Listener type must not be empty");
        return new C4168a<>(l, str);
    }
}
