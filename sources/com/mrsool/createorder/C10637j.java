package com.mrsool.createorder;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.mrsool.createorder.j */
/* compiled from: lambda */
public final /* synthetic */ class C10637j implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ int f29043N;

    /* renamed from: O */
    private final /* synthetic */ MaterialButton f29044O;

    /* renamed from: a */
    private final /* synthetic */ C10677s f29045a;

    /* renamed from: b */
    private final /* synthetic */ Dialog f29046b;

    public /* synthetic */ C10637j(C10677s sVar, Dialog dialog, int i, MaterialButton materialButton) {
        this.f29045a = sVar;
        this.f29046b = dialog;
        this.f29043N = i;
        this.f29044O = materialButton;
    }

    public final void onClick(View view) {
        this.f29045a.mo38077a(this.f29046b, this.f29043N, this.f29044O, view);
    }
}
