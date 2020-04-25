package com.google.android.gms.common.p172q;

import android.content.Context;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;

@C4056a
/* renamed from: com.google.android.gms.common.q.c */
public class C4439c {

    /* renamed from: b */
    private static C4439c f13607b = new C4439c();

    /* renamed from: a */
    private C4438b f13608a = null;

    @C4056a
    /* renamed from: a */
    public static C4438b m19110a(Context context) {
        return f13607b.m19111b(context);
    }

    @C4476d0
    /* renamed from: b */
    private final synchronized C4438b m19111b(Context context) {
        if (this.f13608a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f13608a = new C4438b(context);
        }
        return this.f13608a;
    }
}
