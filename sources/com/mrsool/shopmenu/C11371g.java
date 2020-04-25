package com.mrsool.shopmenu;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.mrsool.shopmenu.g */
/* compiled from: lambda */
public final /* synthetic */ class C11371g implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ int f31929N;

    /* renamed from: O */
    private final /* synthetic */ MaterialButton f31930O;

    /* renamed from: a */
    private final /* synthetic */ MenuOrderActivityStep2 f31931a;

    /* renamed from: b */
    private final /* synthetic */ Dialog f31932b;

    public /* synthetic */ C11371g(MenuOrderActivityStep2 menuOrderActivityStep2, Dialog dialog, int i, MaterialButton materialButton) {
        this.f31931a = menuOrderActivityStep2;
        this.f31932b = dialog;
        this.f31929N = i;
        this.f31930O = materialButton;
    }

    public final void onClick(View view) {
        this.f31931a.mo39146b(this.f31932b, this.f31929N, this.f31930O, view);
    }
}
