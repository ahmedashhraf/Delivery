package com.google.android.gms.common.p170o;

import com.google.android.gms.common.annotation.C4056a;
import java.util.concurrent.ScheduledExecutorService;

@C4056a
/* renamed from: com.google.android.gms.common.o.a */
public class C4433a {

    /* renamed from: a */
    private static C4434a f13602a;

    /* renamed from: com.google.android.gms.common.o.a$a */
    public interface C4434a {
        @C4056a
        /* renamed from: a */
        ScheduledExecutorService mo18438a();
    }

    private C4433a() {
    }

    @C4056a
    /* renamed from: a */
    public static synchronized C4434a m19096a() {
        C4434a aVar;
        synchronized (C4433a.class) {
            if (f13602a == null) {
                f13602a = new C4435b();
            }
            aVar = f13602a;
        }
        return aVar;
    }
}
