package com.mrsool.createorder;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.mrsool.createorder.d */
/* compiled from: lambda */
public final /* synthetic */ class C10631d implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ int f29030N;

    /* renamed from: O */
    private final /* synthetic */ MaterialButton f29031O;

    /* renamed from: a */
    private final /* synthetic */ C10677s f29032a;

    /* renamed from: b */
    private final /* synthetic */ Dialog f29033b;

    public /* synthetic */ C10631d(C10677s sVar, Dialog dialog, int i, MaterialButton materialButton) {
        this.f29032a = sVar;
        this.f29033b = dialog;
        this.f29030N = i;
        this.f29031O = materialButton;
    }

    public final void onClick(View view) {
        this.f29032a.mo38082b(this.f29033b, this.f29030N, this.f29031O, view);
    }
}
