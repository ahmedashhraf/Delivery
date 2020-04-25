package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.graphics.drawable.i */
/* compiled from: WrappedDrawableState */
final class C0901i extends ConstantState {

    /* renamed from: a */
    int f4122a;

    /* renamed from: b */
    ConstantState f4123b;

    /* renamed from: c */
    ColorStateList f4124c = null;

    /* renamed from: d */
    Mode f4125d = C0899g.f4113R;

    C0901i(@C0195i0 C0901i iVar) {
        if (iVar != null) {
            this.f4122a = iVar.f4122a;
            this.f4123b = iVar.f4123b;
            this.f4124c = iVar.f4124c;
            this.f4125d = iVar.f4125d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4656a() {
        return this.f4123b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f4122a;
        ConstantState constantState = this.f4123b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @C0193h0
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @C0193h0
    public Drawable newDrawable(@C0195i0 Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new C0900h(this, resources);
        }
        return new C0899g(this, resources);
    }
}
