package p076c.p112d.p113a.p114a.p118d.p121c;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: c.d.a.a.d.c.h */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C2602h extends ConstantState {

    /* renamed from: a */
    int f9718a;

    /* renamed from: b */
    int f9719b;

    C2602h(C2602h hVar) {
        if (hVar != null) {
            this.f9718a = hVar.f9718a;
            this.f9719b = hVar.f9719b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f9718a;
    }

    public final Drawable newDrawable() {
        return new C2599e(this);
    }
}
