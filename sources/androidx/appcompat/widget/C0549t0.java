package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0218s0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.content.p020h.C0874g;
import androidx.core.content.p020h.C0874g.C0875a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.t0 */
/* compiled from: TintTypedArray */
public class C0549t0 {

    /* renamed from: a */
    private final Context f2191a;

    /* renamed from: b */
    private final TypedArray f2192b;

    /* renamed from: c */
    private TypedValue f2193c;

    private C0549t0(Context context, TypedArray typedArray) {
        this.f2191a = context;
        this.f2192b = typedArray;
    }

    /* renamed from: a */
    public static C0549t0 m2909a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0549t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: b */
    public Drawable mo2875b(int i) {
        if (this.f2192b.hasValue(i)) {
            int resourceId = this.f2192b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0242a.m1109c(this.f2191a, resourceId);
            }
        }
        return this.f2192b.getDrawable(i);
    }

    /* renamed from: c */
    public Drawable mo2877c(int i) {
        if (this.f2192b.hasValue(i)) {
            int resourceId = this.f2192b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0510i.m2770b().mo2671a(this.f2191a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo2879d(int i) {
        return this.f2192b.getIndex(i);
    }

    /* renamed from: e */
    public int mo2882e() {
        return this.f2192b.length();
    }

    /* renamed from: f */
    public String mo2886f(int i) {
        return this.f2192b.getString(i);
    }

    /* renamed from: g */
    public CharSequence mo2889g(int i) {
        return this.f2192b.getText(i);
    }

    /* renamed from: h */
    public CharSequence[] mo2890h(int i) {
        return this.f2192b.getTextArray(i);
    }

    /* renamed from: i */
    public int mo2891i(int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.f2192b.getType(i);
        }
        if (this.f2193c == null) {
            this.f2193c = new TypedValue();
        }
        this.f2192b.getValue(i, this.f2193c);
        return this.f2193c.type;
    }

    /* renamed from: j */
    public boolean mo2892j(int i) {
        return this.f2192b.hasValue(i);
    }

    /* renamed from: k */
    public TypedValue mo2893k(int i) {
        return this.f2192b.peekValue(i);
    }

    /* renamed from: a */
    public static C0549t0 m2910a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0549t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: d */
    public Resources mo2881d() {
        return this.f2192b.getResources();
    }

    /* renamed from: e */
    public String mo2884e(int i) {
        return this.f2192b.getNonResourceString(i);
    }

    /* renamed from: f */
    public int mo2885f(int i, int i2) {
        return this.f2192b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo2888g(int i, int i2) {
        return this.f2192b.getResourceId(i, i2);
    }

    /* renamed from: d */
    public int mo2880d(int i, int i2) {
        return this.f2192b.getInt(i, i2);
    }

    /* renamed from: e */
    public int mo2883e(int i, int i2) {
        return this.f2192b.getInteger(i, i2);
    }

    /* renamed from: f */
    public void mo2887f() {
        this.f2192b.recycle();
    }

    /* renamed from: a */
    public static C0549t0 m2908a(Context context, int i, int[] iArr) {
        return new C0549t0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: c */
    public int mo2876c(int i, int i2) {
        return this.f2192b.getDimensionPixelSize(i, i2);
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo2869a(@C0218s0 int i, int i2, @C0195i0 C0875a aVar) {
        int resourceId = this.f2192b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2193c == null) {
            this.f2193c = new TypedValue();
        }
        return C0874g.m5052a(this.f2191a, resourceId, this.f2193c, i2, aVar);
    }

    /* renamed from: b */
    public int mo2873b() {
        return this.f2192b.getIndexCount();
    }

    /* renamed from: c */
    public String mo2878c() {
        return this.f2192b.getPositionDescription();
    }

    /* renamed from: b */
    public float mo2872b(int i, float f) {
        return this.f2192b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo2874b(int i, int i2) {
        return this.f2192b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: a */
    public boolean mo2871a(int i, boolean z) {
        return this.f2192b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo2866a(int i, int i2) {
        return this.f2192b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo2868a(int i) {
        if (this.f2192b.hasValue(i)) {
            int resourceId = this.f2192b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C0242a.m1108b(this.f2191a, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return this.f2192b.getColorStateList(i);
    }

    /* renamed from: a */
    public float mo2863a(int i, float f) {
        return this.f2192b.getDimension(i, f);
    }

    /* renamed from: a */
    public int mo2867a(int i, String str) {
        return this.f2192b.getLayoutDimension(i, str);
    }

    /* renamed from: a */
    public float mo2864a(int i, int i2, int i3, float f) {
        return this.f2192b.getFraction(i, i2, i3, f);
    }

    /* renamed from: a */
    public boolean mo2870a(int i, TypedValue typedValue) {
        return this.f2192b.getValue(i, typedValue);
    }

    @RequiresApi(21)
    /* renamed from: a */
    public int mo2865a() {
        return this.f2192b.getChangingConfigurations();
    }
}
