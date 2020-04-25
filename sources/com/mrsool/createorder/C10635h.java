package com.mrsool.createorder;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: com.mrsool.createorder.h */
/* compiled from: lambda */
public final /* synthetic */ class C10635h implements OnClickListener {

    /* renamed from: N */
    private final /* synthetic */ Dialog f29038N;

    /* renamed from: O */
    private final /* synthetic */ int f29039O;

    /* renamed from: a */
    private final /* synthetic */ C10677s f29040a;

    /* renamed from: b */
    private final /* synthetic */ EditText f29041b;

    public /* synthetic */ C10635h(C10677s sVar, EditText editText, Dialog dialog, int i) {
        this.f29040a = sVar;
        this.f29041b = editText;
        this.f29038N = dialog;
        this.f29039O = i;
    }

    public final void onClick(View view) {
        this.f29040a.mo38078a(this.f29041b, this.f29038N, this.f29039O, view);
    }
}
