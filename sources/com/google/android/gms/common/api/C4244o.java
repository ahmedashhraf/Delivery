package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.api.o */
public abstract class C4244o<R extends C4246q> extends C4248s<R> {

    /* renamed from: a */
    private final Activity f13226a;

    /* renamed from: b */
    private final int f13227b;

    protected C4244o(@C0193h0 Activity activity, int i) {
        this.f13226a = (Activity) C4300a0.m18621a(activity, (Object) "Activity must not be null");
        this.f13227b = i;
    }

    @C4056a
    /* renamed from: a */
    public final void mo18007a(@C0193h0 Status status) {
        if (status.mo17614Q()) {
            try {
                status.mo17618a(this.f13226a, this.f13227b);
            } catch (SendIntentException unused) {
                mo18008b(new Status(8));
            }
        } else {
            mo18008b(status);
        }
    }

    /* renamed from: b */
    public abstract void mo18008b(@C0193h0 Status status);

    /* renamed from: b */
    public abstract void mo18009b(@C0193h0 R r);
}
