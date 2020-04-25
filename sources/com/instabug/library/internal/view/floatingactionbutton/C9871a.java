package com.instabug.library.internal.view.floatingactionbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0202m;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.core.p034l.C0962e0;
import com.instabug.library.C9700R;
import com.instabug.library.view.IconView;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.internal.view.floatingactionbutton.a */
/* compiled from: FloatingActionButton */
public class C9871a extends IconView {

    /* renamed from: a0 */
    private static transient /* synthetic */ boolean[] f26180a0;

    /* renamed from: N */
    int f26181N;

    /* renamed from: O */
    String f26182O;
    @C0213q

    /* renamed from: P */
    private int f26183P;

    /* renamed from: Q */
    private Drawable f26184Q;

    /* renamed from: R */
    private int f26185R;

    /* renamed from: S */
    private float f26186S;

    /* renamed from: T */
    private float f26187T;

    /* renamed from: U */
    private float f26188U;

    /* renamed from: V */
    private int f26189V;

    /* renamed from: W */
    boolean f26190W;

    /* renamed from: a */
    int f26191a;

    /* renamed from: b */
    int f26192b;

    /* renamed from: com.instabug.library.internal.view.floatingactionbutton.a$a */
    /* compiled from: FloatingActionButton */
    class C9872a extends ShaderFactory {

        /* renamed from: g */
        private static transient /* synthetic */ boolean[] f26193g;

        /* renamed from: a */
        final /* synthetic */ int f26194a;

        /* renamed from: b */
        final /* synthetic */ int f26195b;

        /* renamed from: c */
        final /* synthetic */ int f26196c;

        /* renamed from: d */
        final /* synthetic */ int f26197d;

        /* renamed from: e */
        final /* synthetic */ int f26198e;

        /* renamed from: f */
        final /* synthetic */ C9871a f26199f;

        C9872a(C9871a aVar, int i, int i2, int i3, int i4, int i5) {
            boolean[] a = m45972a();
            this.f26199f = aVar;
            this.f26194a = i;
            this.f26195b = i2;
            this.f26196c = i3;
            this.f26197d = i4;
            this.f26198e = i5;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45972a() {
            boolean[] zArr = f26193g;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8956446182154796715L, "com/instabug/library/internal/view/floatingactionbutton/FloatingActionButton$1", 2);
            f26193g = a;
            return a;
        }

        public Shader resize(int i, int i2) {
            boolean[] a = m45972a();
            float f = ((float) i) / 2.0f;
            float f2 = f;
            LinearGradient linearGradient = new LinearGradient(f2, 0.0f, f, (float) i2, new int[]{this.f26194a, this.f26195b, this.f26196c, this.f26197d, this.f26198e}, new float[]{0.0f, 0.2f, 0.5f, 0.8f, 1.0f}, TileMode.CLAMP);
            a[1] = true;
            return linearGradient;
        }
    }

    /* renamed from: com.instabug.library.internal.view.floatingactionbutton.a$b */
    /* compiled from: FloatingActionButton */
    private static class C9873b extends LayerDrawable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26200b;

        /* renamed from: a */
        private final int f26201a;

        public C9873b(int i, Drawable... drawableArr) {
            boolean[] a = m45973a();
            super(drawableArr);
            this.f26201a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45973a() {
            boolean[] zArr = f26200b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-730802930943369990L, "com/instabug/library/internal/view/floatingactionbutton/FloatingActionButton$TranslucentLayerDrawable", 5);
            f26200b = a;
            return a;
        }

        public void draw(Canvas canvas) {
            boolean[] a = m45973a();
            Rect bounds = getBounds();
            a[1] = true;
            canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f26201a, 31);
            a[2] = true;
            super.draw(canvas);
            a[3] = true;
            canvas.restore();
            a[4] = true;
        }
    }

    public C9871a(Context context, AttributeSet attributeSet) {
        boolean[] d = mo35151d();
        super(context, attributeSet);
        d[1] = true;
        mo35119a(context, attributeSet);
        d[2] = true;
    }

    /* renamed from: b */
    private void mo35149b() {
        boolean[] d = mo35151d();
        this.f26189V = (int) (this.f26186S + (this.f26187T * 2.0f));
        d[21] = true;
    }

    /* renamed from: c */
    private void mo35150c() {
        int i;
        boolean[] d = mo35151d();
        if (this.f26185R == 0) {
            i = C9700R.dimen.instabug_fab_size_normal;
            d[22] = true;
        } else {
            i = C9700R.dimen.instabug_fab_size_mini;
            d[23] = true;
        }
        this.f26186S = mo35127b(i);
        d[24] = true;
    }

    /* renamed from: d */
    private int m45964d(int i) {
        boolean[] d = mo35151d();
        int b = m45957b(i, 1.1f);
        d[122] = true;
        return b;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] mo35151d() {
        boolean[] zArr = f26180a0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1235224978686648696L, "com/instabug/library/internal/view/floatingactionbutton/FloatingActionButton", C13959t.f40925l2);
        f26180a0 = a;
        return a;
    }

    /* renamed from: e */
    private int m45966e(int i) {
        boolean[] d = mo35151d();
        int argb = Color.argb(Color.alpha(i) / 2, Color.red(i), Color.green(i), Color.blue(i));
        d[127] = true;
        return argb;
    }

    /* renamed from: f */
    private int m45967f(int i) {
        boolean[] d = mo35151d();
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        d[128] = true;
        return rgb;
    }

    @SuppressLint({"NewApi"})
    private void setBackgroundCompat(Drawable drawable) {
        boolean[] d = mo35151d();
        if (VERSION.SDK_INT >= 16) {
            d[141] = true;
            setBackground(drawable);
            d[142] = true;
        } else {
            setBackgroundDrawable(drawable);
            d[143] = true;
        }
        d[144] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35119a(Context context, AttributeSet attributeSet) {
        boolean[] d = mo35151d();
        int[] iArr = C9700R.styleable.FloatingActionButton;
        d[5] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int i = C9700R.styleable.FloatingActionButton_instabug_fab_colorNormal;
        d[6] = true;
        this.f26191a = obtainStyledAttributes.getColor(i, -1);
        int i2 = C9700R.styleable.FloatingActionButton_instabug_fab_colorPressed;
        d[7] = true;
        this.f26192b = obtainStyledAttributes.getColor(i2, -3355444);
        int i3 = C9700R.styleable.FloatingActionButton_instabug_fab_colorDisabled;
        d[8] = true;
        int parseColor = Color.parseColor("#EFEFF4");
        d[9] = true;
        this.f26181N = obtainStyledAttributes.getColor(i3, parseColor);
        d[10] = true;
        this.f26185R = obtainStyledAttributes.getInt(C9700R.styleable.FloatingActionButton_instabug_fab_size, 0);
        d[11] = true;
        this.f26183P = obtainStyledAttributes.getResourceId(C9700R.styleable.FloatingActionButton_instabug_fab_icon, 0);
        d[12] = true;
        this.f26182O = obtainStyledAttributes.getString(C9700R.styleable.FloatingActionButton_instabug_fab_title);
        int i4 = C9700R.styleable.FloatingActionButton_instabug_fab_stroke_visible;
        d[13] = true;
        this.f26190W = obtainStyledAttributes.getBoolean(i4, true);
        d[14] = true;
        obtainStyledAttributes.recycle();
        d[15] = true;
        mo35150c();
        d[16] = true;
        this.f26187T = mo35127b(C9700R.dimen.instabug_fab_shadow_radius);
        d[17] = true;
        this.f26188U = mo35127b(C9700R.dimen.instabug_fab_shadow_offset);
        d[18] = true;
        mo35149b();
        d[19] = true;
        mo35126a();
        d[20] = true;
    }

    public int getColorDisabled() {
        boolean[] d = mo35151d();
        int i = this.f26181N;
        d[56] = true;
        return i;
    }

    public int getColorNormal() {
        boolean[] d = mo35151d();
        int i = this.f26191a;
        d[44] = true;
        return i;
    }

    public int getColorPressed() {
        boolean[] d = mo35151d();
        int i = this.f26192b;
        d[50] = true;
        return i;
    }

    /* access modifiers changed from: 0000 */
    public Drawable getIconDrawable() {
        boolean[] d = mo35151d();
        Drawable drawable = this.f26184Q;
        if (drawable != null) {
            d[90] = true;
            return drawable;
        } else if (this.f26183P != 0) {
            d[91] = true;
            Drawable drawable2 = getResources().getDrawable(this.f26183P);
            d[92] = true;
            return drawable2;
        } else {
            ColorDrawable colorDrawable = new ColorDrawable(0);
            d[93] = true;
            return colorDrawable;
        }
    }

    /* access modifiers changed from: 0000 */
    public TextView getLabelView() {
        TextView textView = (TextView) getTag(C9700R.C9704id.instabug_fab_label);
        mo35151d()[74] = true;
        return textView;
    }

    public int getSize() {
        boolean[] d = mo35151d();
        int i = this.f26185R;
        d[35] = true;
        return i;
    }

    public String getTitle() {
        boolean[] d = mo35151d();
        String str = this.f26182O;
        d[75] = true;
        return str;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] d = mo35151d();
        int i3 = this.f26189V;
        setMeasuredDimension(i3, i3);
        d[76] = true;
    }

    public void setColorDisabled(int i) {
        boolean[] d = mo35151d();
        if (this.f26181N == i) {
            d[58] = true;
        } else {
            this.f26181N = i;
            d[59] = true;
            mo35126a();
            d[60] = true;
        }
        d[61] = true;
    }

    public void setColorDisabledResId(@C0202m int i) {
        boolean[] d = mo35151d();
        setColorDisabled(mo35125a(i));
        d[57] = true;
    }

    public void setColorNormal(int i) {
        boolean[] d = mo35151d();
        if (this.f26191a == i) {
            d[46] = true;
        } else {
            this.f26191a = i;
            d[47] = true;
            mo35126a();
            d[48] = true;
        }
        d[49] = true;
    }

    public void setColorNormalResId(@C0202m int i) {
        boolean[] d = mo35151d();
        setColorNormal(mo35125a(i));
        d[45] = true;
    }

    public void setColorPressed(int i) {
        boolean[] d = mo35151d();
        if (this.f26192b == i) {
            d[52] = true;
        } else {
            this.f26192b = i;
            d[53] = true;
            mo35126a();
            d[54] = true;
        }
        d[55] = true;
    }

    public void setColorPressedResId(@C0202m int i) {
        boolean[] d = mo35151d();
        setColorPressed(mo35125a(i));
        d[51] = true;
    }

    public void setIcon(@C0213q int i) {
        boolean[] d = mo35151d();
        if (this.f26183P == i) {
            d[36] = true;
        } else {
            this.f26183P = i;
            this.f26184Q = null;
            d[37] = true;
            mo35126a();
            d[38] = true;
        }
        d[39] = true;
    }

    public void setIconDrawable(@C0193h0 Drawable drawable) {
        boolean[] d = mo35151d();
        if (this.f26184Q == drawable) {
            d[40] = true;
        } else {
            this.f26183P = 0;
            this.f26184Q = drawable;
            d[41] = true;
            mo35126a();
            d[42] = true;
        }
        d[43] = true;
    }

    public void setSize(int i) {
        boolean[] d = mo35151d();
        if (i == 1) {
            d[25] = true;
        } else if (i == 0) {
            d[26] = true;
        } else {
            d[27] = true;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Use @FAB_SIZE constants only!");
            d[28] = true;
            throw illegalArgumentException;
        }
        if (this.f26185R == i) {
            d[29] = true;
        } else {
            this.f26185R = i;
            d[30] = true;
            mo35150c();
            d[31] = true;
            mo35149b();
            d[32] = true;
            mo35126a();
            d[33] = true;
        }
        d[34] = true;
    }

    public void setStrokeVisible(boolean z) {
        boolean[] d = mo35151d();
        if (this.f26190W == z) {
            d[62] = true;
        } else {
            this.f26190W = z;
            d[63] = true;
            mo35126a();
            d[64] = true;
        }
        d[65] = true;
    }

    public void setTitle(String str) {
        boolean[] d = mo35151d();
        this.f26182O = str;
        d[69] = true;
        TextView labelView = getLabelView();
        if (labelView == null) {
            d[70] = true;
        } else {
            d[71] = true;
            labelView.setText(str);
            d[72] = true;
        }
        d[73] = true;
    }

    public void setVisibility(int i) {
        boolean[] d = mo35151d();
        TextView labelView = getLabelView();
        if (labelView == null) {
            d[145] = true;
        } else {
            d[146] = true;
            labelView.setVisibility(i);
            d[147] = true;
        }
        super.setVisibility(i);
        d[148] = true;
    }

    /* renamed from: c */
    private int m45960c(float f) {
        int i = (int) (f * 255.0f);
        mo35151d()[120] = true;
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo35127b(@C0209o int i) {
        boolean[] d = mo35151d();
        float dimension = getResources().getDimension(i);
        d[68] = true;
        return dimension;
    }

    /* renamed from: b */
    private Drawable m45958b(float f) {
        boolean[] d = mo35151d();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        d[113] = true;
        Paint paint = shapeDrawable.getPaint();
        d[114] = true;
        paint.setAntiAlias(true);
        d[115] = true;
        paint.setStrokeWidth(f);
        d[116] = true;
        paint.setStyle(Style.STROKE);
        d[117] = true;
        paint.setColor(C0962e0.f4343t);
        d[118] = true;
        paint.setAlpha(m45960c(0.02f));
        d[119] = true;
        return shapeDrawable;
    }

    /* renamed from: c */
    private int m45961c(int i) {
        boolean[] d = mo35151d();
        int b = m45957b(i, 0.9f);
        d[121] = true;
        return b;
    }

    /* renamed from: c */
    private Drawable m45962c(int i, float f) {
        boolean[] d = mo35151d();
        if (!this.f26190W) {
            d[129] = true;
            ColorDrawable colorDrawable = new ColorDrawable(0);
            d[130] = true;
            return colorDrawable;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        d[131] = true;
        int c = m45961c(i);
        d[132] = true;
        int e = m45966e(c);
        d[133] = true;
        int d2 = m45964d(i);
        d[134] = true;
        int e2 = m45966e(d2);
        d[135] = true;
        Paint paint = shapeDrawable.getPaint();
        d[136] = true;
        paint.setAntiAlias(true);
        d[137] = true;
        paint.setStrokeWidth(f);
        d[138] = true;
        paint.setStyle(Style.STROKE);
        d[139] = true;
        C9872a aVar = new C9872a(this, d2, e2, i, e, c);
        shapeDrawable.setShaderFactory(aVar);
        d[140] = true;
        return shapeDrawable;
    }

    /* renamed from: b */
    private int m45957b(int i, float f) {
        boolean[] d = mo35151d();
        float[] fArr = new float[3];
        d[123] = true;
        Color.colorToHSV(i, fArr);
        d[124] = true;
        fArr[2] = Math.min(fArr[2] * f, 1.0f);
        d[125] = true;
        int HSVToColor = Color.HSVToColor(Color.alpha(i), fArr);
        d[126] = true;
        return HSVToColor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo35125a(@C0202m int i) {
        boolean[] d = mo35151d();
        int color = getResources().getColor(i);
        d[67] = true;
        return color;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35126a() {
        int i;
        int i2;
        boolean[] d = mo35151d();
        float b = mo35127b(C9700R.dimen.instabug_fab_stroke_width);
        float f = b / 2.0f;
        Drawable[] drawableArr = new Drawable[4];
        d[77] = true;
        Resources resources = getResources();
        if (this.f26185R == 0) {
            i = C9700R.C9703drawable.instabug_fab_bg_normal;
            d[78] = true;
        } else {
            i = C9700R.C9703drawable.instabug_fab_bg_mini;
            d[79] = true;
        }
        drawableArr[0] = resources.getDrawable(i);
        d[80] = true;
        drawableArr[1] = m45956a(b);
        d[81] = true;
        drawableArr[2] = m45958b(b);
        drawableArr[3] = getIconDrawable();
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        if (this.f26185R == 0) {
            d[82] = true;
            i2 = ((int) (this.f26186S - mo35127b(C9700R.dimen.instabug_fab_icon_size_normal))) / 2;
            d[83] = true;
        } else {
            i2 = ((int) (this.f26186S - mo35127b(C9700R.dimen.instabug_fab_icon_size_mini))) / 2;
            d[84] = true;
        }
        float f2 = this.f26187T;
        int i3 = (int) f2;
        float f3 = this.f26188U;
        int i4 = (int) (f2 - f3);
        int i5 = (int) (f2 + f3);
        d[85] = true;
        layerDrawable.setLayerInset(1, i3, i4, i3, i5);
        d[86] = true;
        int i6 = (int) (((float) i3) - f);
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(2, i6, (int) (((float) i4) - f), i6, (int) (((float) i5) - f));
        d[87] = true;
        int i7 = i3 + i2;
        layerDrawable2.setLayerInset(3, i7, i4 + i2, i7, i5 + i2);
        d[88] = true;
        setBackgroundCompat(layerDrawable);
        d[89] = true;
    }

    /* renamed from: a */
    private StateListDrawable m45956a(float f) {
        boolean[] d = mo35151d();
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        int i = this.f26181N;
        d[94] = true;
        Drawable a = m45955a(i, f);
        d[95] = true;
        stateListDrawable.addState(iArr, a);
        int[] iArr2 = {16842919};
        int i2 = this.f26192b;
        d[96] = true;
        Drawable a2 = m45955a(i2, f);
        d[97] = true;
        stateListDrawable.addState(iArr2, a2);
        d[98] = true;
        stateListDrawable.addState(new int[0], m45955a(this.f26191a, f));
        d[99] = true;
        return stateListDrawable;
    }

    /* renamed from: a */
    private Drawable m45955a(int i, float f) {
        LayerDrawable layerDrawable;
        boolean[] d = mo35151d();
        int alpha = Color.alpha(i);
        d[100] = true;
        int f2 = m45967f(i);
        d[101] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        d[102] = true;
        Paint paint = shapeDrawable.getPaint();
        d[103] = true;
        paint.setAntiAlias(true);
        d[104] = true;
        paint.setColor(f2);
        d[105] = true;
        Drawable[] drawableArr = {shapeDrawable, m45962c(f2, f)};
        d[106] = true;
        if (alpha == 255) {
            d[107] = true;
        } else if (!this.f26190W) {
            d[108] = true;
        } else {
            layerDrawable = new C9873b(alpha, drawableArr);
            d[110] = true;
            int i2 = (int) (f / 2.0f);
            d[111] = true;
            layerDrawable.setLayerInset(1, i2, i2, i2, i2);
            d[112] = true;
            return layerDrawable;
        }
        layerDrawable = new LayerDrawable(drawableArr);
        d[109] = true;
        int i22 = (int) (f / 2.0f);
        d[111] = true;
        layerDrawable.setLayerInset(1, i22, i22, i22, i22);
        d[112] = true;
        return layerDrawable;
    }
}
