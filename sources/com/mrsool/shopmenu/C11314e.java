package com.mrsool.shopmenu;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.mrsool.shopmenu.e */
/* compiled from: lambda */
public final /* synthetic */ class C11314e implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ int f31663N;

    /* renamed from: O */
    private final /* synthetic */ MaterialButton f31664O;

    /* renamed from: a */
    private final /* synthetic */ MenuOrderActivityStep2 f31665a;

    /* renamed from: b */
    private final /* synthetic */ Dialog f31666b;

    public /* synthetic */ C11314e(MenuOrderActivityStep2 menuOrderActivityStep2, Dialog dialog, int i, MaterialButton materialButton) {
        this.f31665a = menuOrderActivityStep2;
        this.f31666b = dialog;
        this.f31663N = i;
        this.f31664O = materialButton;
    }

    public final void onClick(View view) {
        this.f31665a.mo39141a(this.f31666b, this.f31663N, this.f31664O, view);
    }
}
