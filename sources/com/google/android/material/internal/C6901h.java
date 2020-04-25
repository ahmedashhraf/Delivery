package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0395s;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.h */
/* compiled from: NavigationMenu */
public class C6901h extends C0370g {
    public C6901h(Context context) {
        super(context);
    }

    @C0193h0
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0375j jVar = (C0375j) mo1552a(i, i2, i3, charSequence);
        C6915j jVar2 = new C6915j(mo1601f(), this, jVar);
        jVar.mo1642a((C0395s) jVar2);
        return jVar2;
    }
}
