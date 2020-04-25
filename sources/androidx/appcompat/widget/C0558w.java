package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0238R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.w */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0558w {

    /* renamed from: k */
    private static final String f2245k = "ACTVAutoSizeHelper";

    /* renamed from: l */
    private static final RectF f2246l = new RectF();

    /* renamed from: m */
    private static final int f2247m = 12;

    /* renamed from: n */
    private static final int f2248n = 112;

    /* renamed from: o */
    private static final int f2249o = 1;

    /* renamed from: p */
    private static ConcurrentHashMap<String, Method> f2250p = new ConcurrentHashMap<>();

    /* renamed from: q */
    private static ConcurrentHashMap<String, Field> f2251q = new ConcurrentHashMap<>();

    /* renamed from: r */
    static final float f2252r = -1.0f;

    /* renamed from: s */
    private static final int f2253s = 1048576;

    /* renamed from: a */
    private int f2254a = 0;

    /* renamed from: b */
    private boolean f2255b = false;

    /* renamed from: c */
    private float f2256c = -1.0f;

    /* renamed from: d */
    private float f2257d = -1.0f;

    /* renamed from: e */
    private float f2258e = -1.0f;

    /* renamed from: f */
    private int[] f2259f = new int[0];

    /* renamed from: g */
    private boolean f2260g = false;

    /* renamed from: h */
    private TextPaint f2261h;

    /* renamed from: i */
    private final TextView f2262i;

    /* renamed from: j */
    private final Context f2263j;

    C0558w(TextView textView) {
        this.f2262i = textView;
        this.f2263j = this.f2262i.getContext();
    }

    /* renamed from: h */
    private void m3045h() {
        this.f2254a = 0;
        this.f2257d = -1.0f;
        this.f2258e = -1.0f;
        this.f2256c = -1.0f;
        this.f2259f = new int[0];
        this.f2255b = false;
    }

    /* renamed from: i */
    private boolean m3046i() {
        if (!m3048k() || this.f2254a != 1) {
            this.f2255b = false;
        } else {
            if (!this.f2260g || this.f2259f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2258e - this.f2257d) / this.f2256c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f2257d + (((float) i) * this.f2256c));
                }
                this.f2259f = m3040a(iArr);
            }
            this.f2255b = true;
        }
        return this.f2255b;
    }

    /* renamed from: j */
    private boolean m3047j() {
        int length = this.f2259f.length;
        this.f2260g = length > 0;
        if (this.f2260g) {
            this.f2254a = 1;
            int[] iArr = this.f2259f;
            this.f2257d = (float) iArr[0];
            this.f2258e = (float) iArr[length - 1];
            this.f2256c = -1.0f;
        }
        return this.f2260g;
    }

    /* renamed from: k */
    private boolean m3048k() {
        return !(this.f2262i instanceof C0518j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2985a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2263j.obtainStyledAttributes(attributeSet, C0238R.styleable.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.f2254a = obtainStyledAttributes.getInt(C0238R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0238R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0238R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0238R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0238R.styleable.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m3038a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m3048k()) {
            this.f2254a = 0;
        } else if (this.f2254a == 1) {
            if (!this.f2260g) {
                DisplayMetrics displayMetrics = this.f2263j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m3037a(dimension2, dimension3, dimension);
            }
            m3046i();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo2988b(int i) {
        if (!m3048k()) {
            return;
        }
        if (i == 0) {
            m3045h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f2263j.getResources().getDisplayMetrics();
            m3037a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m3046i()) {
                mo2981a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public int mo2989c() {
        return Math.round(this.f2257d);
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public int mo2990d() {
        return Math.round(this.f2256c);
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public int[] mo2991e() {
        return this.f2259f;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public int mo2992f() {
        return this.f2254a;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public boolean mo2993g() {
        return m3048k() && this.f2254a != 0;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public int mo2987b() {
        return Math.round(this.f2258e);
    }

    @RequiresApi(23)
    /* renamed from: b */
    private StaticLayout m3042b(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.f2261h, i);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f2262i.getLineSpacingExtra(), this.f2262i.getLineSpacingMultiplier()).setIncludePad(this.f2262i.getIncludeFontPadding()).setBreakStrategy(this.f2262i.getBreakStrategy()).setHyphenationFrequency(this.f2262i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            if (VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f2262i.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) m3043b((Object) this.f2262i, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    @RequiresApi(16)
    /* renamed from: b */
    private StaticLayout m3041b(CharSequence charSequence, Alignment alignment, int i) {
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f2261h, i, alignment, this.f2262i.getLineSpacingMultiplier(), this.f2262i.getLineSpacingExtra(), this.f2262i.getIncludeFontPadding());
        return staticLayout;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2984a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m3048k()) {
            DisplayMetrics displayMetrics = this.f2263j.getResources().getDisplayMetrics();
            m3037a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m3046i()) {
                mo2981a();
            }
        }
    }

    /* renamed from: b */
    private static <T> T m3043b(@C0193h0 Object obj, @C0193h0 String str, @C0193h0 T t) {
        try {
            return m3044b(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            sb.toString();
            return t;
        }
    }

    @C0195i0
    /* renamed from: b */
    private static Method m3044b(@C0193h0 String str) {
        try {
            Method method = (Method) f2250p.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f2250p.put(str, method);
                }
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            sb.toString();
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2986a(@C0193h0 int[] iArr, int i) throws IllegalArgumentException {
        if (m3048k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2263j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f2259f = m3040a(iArr2);
                if (!m3047j()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f2260g = false;
            }
            if (m3046i()) {
                mo2981a();
            }
        }
    }

    /* renamed from: a */
    private void m3038a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2259f = m3040a(iArr);
            m3047j();
        }
    }

    /* renamed from: a */
    private int[] m3040a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m3037a(float f, float f2, float f3) throws IllegalArgumentException {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f2254a = 1;
            this.f2257d = f;
            this.f2258e = f2;
            this.f2256c = f3;
            this.f2260g = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2981a() {
        boolean z;
        int i;
        if (mo2993g()) {
            if (this.f2255b) {
                if (this.f2262i.getMeasuredHeight() > 0 && this.f2262i.getMeasuredWidth() > 0) {
                    if (VERSION.SDK_INT >= 29) {
                        z = this.f2262i.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) m3043b((Object) this.f2262i, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue();
                    }
                    if (z) {
                        i = 1048576;
                    } else {
                        i = (this.f2262i.getMeasuredWidth() - this.f2262i.getTotalPaddingLeft()) - this.f2262i.getTotalPaddingRight();
                    }
                    int height = (this.f2262i.getHeight() - this.f2262i.getCompoundPaddingBottom()) - this.f2262i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f2246l) {
                            f2246l.setEmpty();
                            f2246l.right = (float) i;
                            f2246l.bottom = (float) height;
                            float a = (float) m3032a(f2246l);
                            if (a != this.f2262i.getTextSize()) {
                                mo2983a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f2255b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2983a(int i, float f) {
        Resources resources;
        Context context = this.f2263j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m3036a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m3036a(float f) {
        if (f != this.f2262i.getPaint().getTextSize()) {
            this.f2262i.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f2262i.isInLayout() : false;
            if (this.f2262i.getLayout() != null) {
                this.f2255b = false;
                try {
                    Method b = m3044b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f2262i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f2262i.requestLayout();
                } else {
                    this.f2262i.forceLayout();
                }
                this.f2262i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m3032a(RectF rectF) {
        int length = this.f2259f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m3039a(this.f2259f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f2259f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo2982a(int i) {
        TextPaint textPaint = this.f2261h;
        if (textPaint == null) {
            this.f2261h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2261h.set(this.f2262i.getPaint());
        this.f2261h.setTextSize((float) i);
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public StaticLayout mo2980a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            return m3042b(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m3041b(charSequence, alignment, i);
        }
        return m3033a(charSequence, alignment, i);
    }

    /* renamed from: a */
    private boolean m3039a(int i, RectF rectF) {
        CharSequence text = this.f2262i.getText();
        TransformationMethod transformationMethod = this.f2262i.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f2262i);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f2262i.getMaxLines() : -1;
        mo2982a(i);
        StaticLayout a = mo2980a(text, (Alignment) m3043b((Object) this.f2262i, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m3033a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue = ((Float) m3034a((Object) this.f2262i, "mSpacingMult", (T) Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) m3034a((Object) this.f2262i, "mSpacingAdd", (T) Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) m3034a((Object) this.f2262i, "mIncludePad", (T) Boolean.valueOf(true))).booleanValue();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f2261h, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private static <T> T m3034a(@C0193h0 Object obj, @C0193h0 String str, @C0193h0 T t) {
        try {
            Field a = m3035a(str);
            if (a == null) {
                return t;
            }
            return a.get(obj);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            sb.toString();
            return t;
        }
    }

    @C0195i0
    /* renamed from: a */
    private static Field m3035a(@C0193h0 String str) {
        try {
            Field field = (Field) f2251q.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    f2251q.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            sb.toString();
            return null;
        }
    }
}
