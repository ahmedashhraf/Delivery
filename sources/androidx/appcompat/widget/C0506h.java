package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.annotation.C0195i0;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.widget.C1108c;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatCompoundButtonHelper */
class C0506h {

    /* renamed from: a */
    private final CompoundButton f2032a;

    /* renamed from: b */
    private ColorStateList f2033b = null;

    /* renamed from: c */
    private Mode f2034c = null;

    /* renamed from: d */
    private boolean f2035d = false;

    /* renamed from: e */
    private boolean f2036e = false;

    /* renamed from: f */
    private boolean f2037f;

    /* renamed from: androidx.appcompat.widget.h$a */
    /* compiled from: AppCompatCompoundButtonHelper */
    interface C0507a {
        /* renamed from: a */
        void mo2662a(Drawable drawable);
    }

    C0506h(CompoundButton compoundButton) {
        this.f2032a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2658a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f2032a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0238R.styleable.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f2032a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f2032a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = androidx.appcompat.p006a.p007a.C0242a.m1109c(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f2032a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f2032a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = androidx.appcompat.p006a.p007a.C0242a.m1109c(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f2032a     // Catch:{ all -> 0x0080 }
            int r0 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C1108c.m6317a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f2032a     // Catch:{ all -> 0x0080 }
            int r0 = androidx.appcompat.C0238R.styleable.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0469a0.m2594a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C1108c.m6318a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0506h.mo2658a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo2659b() {
        return this.f2033b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo2660c() {
        return this.f2034c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2661d() {
        if (this.f2037f) {
            this.f2037f = false;
            return;
        }
        this.f2037f = true;
        mo2655a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2656a(ColorStateList colorStateList) {
        this.f2033b = colorStateList;
        this.f2035d = true;
        mo2655a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2657a(@C0195i0 Mode mode) {
        this.f2034c = mode;
        this.f2036e = true;
        mo2655a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2655a() {
        Drawable a = C1108c.m6316a(this.f2032a);
        if (a == null) {
            return;
        }
        if (this.f2035d || this.f2036e) {
            Drawable mutate = C0892a.m5161i(a).mutate();
            if (this.f2035d) {
                C0892a.m5146a(mutate, this.f2033b);
            }
            if (this.f2036e) {
                C0892a.m5149a(mutate, this.f2034c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2032a.getDrawableState());
            }
            this.f2032a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2654a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C1108c.m6316a(this.f2032a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
