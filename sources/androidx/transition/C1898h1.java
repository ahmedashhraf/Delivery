package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: androidx.transition.h1 */
/* compiled from: WindowIdApi18 */
class C1898h1 implements C1909i1 {

    /* renamed from: a */
    private final WindowId f7321a;

    C1898h1(@C0193h0 View view) {
        this.f7321a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1898h1) && ((C1898h1) obj).f7321a.equals(this.f7321a);
    }

    public int hashCode() {
        return this.f7321a.hashCode();
    }
}
