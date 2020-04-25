package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.l */
class C11869l extends URLSpan {

    /* renamed from: a */
    Context f34288a;

    C11869l(Context context, String str) {
        super(str);
        this.f34288a = context;
    }

    public void onClick(View view) {
        C11868k0.m53353a(this.f34288a).mo3032a(this.f34288a, Uri.parse(getURL()));
    }
}
