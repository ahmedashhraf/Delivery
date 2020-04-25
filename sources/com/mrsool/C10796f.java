package com.mrsool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import com.mrsool.utils.p420b0.C11584e;

/* renamed from: com.mrsool.f */
/* compiled from: BaseLocationActivity */
public class C10796f extends C0295d {

    /* renamed from: a */
    public C11584e f29659a;

    /* renamed from: C */
    public void mo38426C() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            C11584e eVar = this.f29659a;
            if (eVar != null) {
                eVar.mo39752b();
            }
        }
    }

    /* renamed from: D */
    public void mo38427D() {
        C11584e eVar = this.f29659a;
        if (eVar != null) {
            eVar.mo39759f();
        }
    }

    /* renamed from: a */
    public void mo38428a(boolean z, int i) {
        this.f29659a.mo39753b(i);
        this.f29659a.mo39754b(false);
        this.f29659a.mo39751a(z);
        this.f29659a.mo39747a();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C11584e eVar = this.f29659a;
        if (eVar != null) {
            eVar.mo39749a(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29659a = C11584e.m52207a((Activity) this);
    }
}
