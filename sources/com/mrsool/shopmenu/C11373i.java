package com.mrsool.shopmenu;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: com.mrsool.shopmenu.i */
/* compiled from: lambda */
public final /* synthetic */ class C11373i implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ Dialog f31934N;

    /* renamed from: O */
    private final /* synthetic */ int f31935O;

    /* renamed from: a */
    private final /* synthetic */ MenuOrderActivityStep2 f31936a;

    /* renamed from: b */
    private final /* synthetic */ EditText f31937b;

    public /* synthetic */ C11373i(MenuOrderActivityStep2 menuOrderActivityStep2, EditText editText, Dialog dialog, int i) {
        this.f31936a = menuOrderActivityStep2;
        this.f31937b = editText;
        this.f31934N = dialog;
        this.f31935O = i;
    }

    public final void onClick(View view) {
        this.f31936a.mo39142a(this.f31937b, this.f31934N, this.f31935O, view);
    }
}
