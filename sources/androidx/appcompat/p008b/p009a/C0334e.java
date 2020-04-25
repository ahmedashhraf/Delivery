package androidx.appcompat.p008b.p009a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.C0351R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.p020h.C0878h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.b.a.e */
/* compiled from: StateListDrawable */
class C0334e extends C0327b {

    /* renamed from: d0 */
    private static final String f1104d0 = "StateListDrawable";

    /* renamed from: e0 */
    private static final boolean f1105e0 = false;

    /* renamed from: b0 */
    private C0335a f1106b0;

    /* renamed from: c0 */
    private boolean f1107c0;

    /* renamed from: androidx.appcompat.b.a.e$a */
    /* compiled from: StateListDrawable */
    static class C0335a extends C0330c {

        /* renamed from: J */
        int[][] f1108J;

        C0335a(C0335a aVar, C0334e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f1108J = aVar.f1108J;
            } else {
                this.f1108J = new int[mo1227d()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1308a(int[] iArr, Drawable drawable) {
            int a = mo1213a(drawable);
            this.f1108J[a] = iArr;
            return a;
        }

        @C0193h0
        public Drawable newDrawable() {
            return new C0334e(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo1193q() {
            int[][] iArr = this.f1108J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f1108J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f1108J = iArr2;
        }

        @C0193h0
        public Drawable newDrawable(Resources resources) {
            return new C0334e(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1307a(int[] iArr) {
            int[][] iArr2 = this.f1108J;
            int e = mo1228e();
            for (int i = 0; i < e; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo1215a(int i, int i2) {
            super.mo1215a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f1108J, 0, iArr, 0, i);
            this.f1108J = iArr;
        }
    }

    C0334e() {
        this(null, null);
    }

    /* renamed from: a */
    public void mo1145a(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f1106b0.mo1308a(iArr, drawable);
            onStateChange(getState());
        }
    }

    @RequiresApi(21)
    public void applyTheme(@C0193h0 Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1303d() {
        return this.f1106b0.mo1228e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0335a mo1305e() {
        return this.f1106b0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo1306f(int i) {
        return this.f1106b0.f1108J[i];
    }

    public boolean isStateful() {
        return true;
    }

    @C0193h0
    public Drawable mutate() {
        if (!this.f1107c0 && super.mutate() == this) {
            this.f1106b0.mo1193q();
            this.f1107c0 = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f1106b0.mo1307a(iArr);
        if (a < 0) {
            a = this.f1106b0.mo1307a(StateSet.WILD_CARD);
        }
        return mo1201a(a) || onStateChange;
    }

    C0334e(C0335a aVar, Resources resources) {
        mo1144a((C0330c) new C0335a(aVar, this, resources));
        onStateChange(getState());
    }

    /* renamed from: b */
    private void m1851b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        C0335a aVar = this.f1106b0;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C0351R.styleable.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(C0351R.styleable.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = ResourceManagerInternal.get().getDrawable(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = mo1302a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    aVar.mo1308a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Drawable mo1304e(int i) {
        return this.f1106b0.mo1214a(i);
    }

    /* renamed from: a */
    public void mo1143a(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C0351R.styleable.StateListDrawable);
        setVisible(a.getBoolean(C0351R.styleable.StateListDrawable_android_visible, true), true);
        m1850a(a);
        mo1199a(resources);
        a.recycle();
        m1851b(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    C0334e(@C0195i0 C0335a aVar) {
        if (aVar != null) {
            mo1144a((C0330c) aVar);
        }
    }

    /* renamed from: a */
    private void m1850a(TypedArray typedArray) {
        C0335a aVar = this.f1106b0;
        if (VERSION.SDK_INT >= 21) {
            aVar.f1063d |= typedArray.getChangingConfigurations();
        }
        aVar.f1068i = typedArray.getBoolean(C0351R.styleable.StateListDrawable_android_variablePadding, aVar.f1068i);
        aVar.f1071l = typedArray.getBoolean(C0351R.styleable.StateListDrawable_android_constantSize, aVar.f1071l);
        aVar.f1051A = typedArray.getInt(C0351R.styleable.StateListDrawable_android_enterFadeDuration, aVar.f1051A);
        aVar.f1052B = typedArray.getInt(C0351R.styleable.StateListDrawable_android_exitFadeDuration, aVar.f1052B);
        aVar.f1083x = typedArray.getBoolean(C0351R.styleable.StateListDrawable_android_dither, aVar.f1083x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo1302a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0335a m1859b() {
        return new C0335a(this.f1106b0, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1301a(int[] iArr) {
        return this.f1106b0.mo1307a(iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1141a() {
        super.mo1141a();
        this.f1107c0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1144a(@C0193h0 C0330c cVar) {
        super.mo1144a(cVar);
        if (cVar instanceof C0335a) {
            this.f1106b0 = (C0335a) cVar;
        }
    }
}
