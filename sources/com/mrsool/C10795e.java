package com.mrsool;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.mrsool.utils.C11644i;

/* renamed from: com.mrsool.e */
/* compiled from: BaseDefaultFontSizeActivity */
public class C10795e extends C10787d {
    /* renamed from: b */
    public void mo36556b(Configuration configuration) {
        boolean z;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (configuration.fontScale != 1.0f) {
            this.f29642a.mo23468C().mo23446a(C11644i.f33220W2, configuration.fontScale);
            configuration.fontScale = 1.0f;
            z = true;
        } else {
            z = false;
        }
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (configuration.densityDpi != ((int) getResources().getDisplayMetrics().xdpi)) {
            this.f29642a.mo23468C().mo23446a(C11644i.f33236Y2, displayMetrics.scaledDensity);
            this.f29642a.mo23468C().mo23447a(C11644i.f33228X2, displayMetrics.densityDpi);
            displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
            configuration.densityDpi = (int) getResources().getDisplayMetrics().xdpi;
            z = true;
        }
        if (z) {
            getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
