package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.dynamic.l */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4529l implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f13793a;

    /* renamed from: b */
    private final /* synthetic */ Intent f13794b;

    C4529l(Context context, Intent intent) {
        this.f13793a = context;
        this.f13794b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f13793a.startActivity(this.f13794b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
