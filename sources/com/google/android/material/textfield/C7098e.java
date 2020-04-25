package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
/* compiled from: EndIconDelegate */
abstract class C7098e {

    /* renamed from: a */
    TextInputLayout f20123a;

    /* renamed from: b */
    Context f20124b;

    /* renamed from: c */
    CheckableImageButton f20125c;

    C7098e(@C0193h0 TextInputLayout textInputLayout) {
        this.f20123a = textInputLayout;
        this.f20124b = textInputLayout.getContext();
        this.f20125c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo28402a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28403a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo28415a(int i) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo28416b() {
        return false;
    }
}
