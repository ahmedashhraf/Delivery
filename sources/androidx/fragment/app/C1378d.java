package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;

/* renamed from: androidx.fragment.app.d */
/* compiled from: FragmentContainer */
public abstract class C1378d {
    @C0195i0
    /* renamed from: a */
    public abstract View mo6050a(@C0225w int i);

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public Fragment mo6174a(@C0193h0 Context context, @C0193h0 String str, @C0195i0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: a */
    public abstract boolean mo6051a();
}
