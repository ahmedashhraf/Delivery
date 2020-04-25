package androidx.core.content.p020h;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.C0721R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.h.e */
/* compiled from: GradientColorInflaterCompat */
final class C0871e {

    /* renamed from: a */
    private static final int f4036a = 0;

    /* renamed from: b */
    private static final int f4037b = 1;

    /* renamed from: c */
    private static final int f4038c = 2;

    /* renamed from: androidx.core.content.h.e$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class C0872a {

        /* renamed from: a */
        final int[] f4039a;

        /* renamed from: b */
        final float[] f4040b;

        C0872a(@C0193h0 List<Integer> list, @C0193h0 List<Float> list2) {
            int size = list.size();
            this.f4039a = new int[size];
            this.f4040b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f4039a[i] = ((Integer) list.get(i)).intValue();
                this.f4040b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0872a(@C0198k int i, @C0198k int i2) {
            this.f4039a = new int[]{i, i2};
            this.f4040b = new float[]{0.0f, 1.0f};
        }

        C0872a(@C0198k int i, @C0198k int i2, @C0198k int i3) {
            this.f4039a = new int[]{i, i2, i3};
            this.f4040b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    private C0871e() {
    }

    /* renamed from: a */
    static Shader m5036a(@C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m5037a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p020h.C0871e.C0872a m5039b(@androidx.annotation.C0193h0 android.content.res.Resources r8, @androidx.annotation.C0193h0 org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.C0193h0 android.util.AttributeSet r10, @androidx.annotation.C0195i0 android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = androidx.core.C0721R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.p020h.C0878h.m5069a(r8, r11, r10, r3)
            int r5 = androidx.core.C0721R.styleable.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.C0721R.styleable.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = androidx.core.C0721R.styleable.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.C0721R.styleable.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            androidx.core.content.h.e$a r8 = new androidx.core.content.h.e$a
            r8.<init>(r4, r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p020h.C0871e.m5039b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.h.e$a");
    }

    /* renamed from: a */
    static Shader m5037a(@C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray a = C0878h.m5069a(resources, theme2, attributeSet, C0721R.styleable.GradientColor);
            float a2 = C0878h.m5063a(a, xmlPullParser2, "startX", C0721R.styleable.GradientColor_android_startX, 0.0f);
            float a3 = C0878h.m5063a(a, xmlPullParser2, "startY", C0721R.styleable.GradientColor_android_startY, 0.0f);
            float a4 = C0878h.m5063a(a, xmlPullParser2, "endX", C0721R.styleable.GradientColor_android_endX, 0.0f);
            float a5 = C0878h.m5063a(a, xmlPullParser2, "endY", C0721R.styleable.GradientColor_android_endY, 0.0f);
            float a6 = C0878h.m5063a(a, xmlPullParser2, "centerX", C0721R.styleable.GradientColor_android_centerX, 0.0f);
            float a7 = C0878h.m5063a(a, xmlPullParser2, "centerY", C0721R.styleable.GradientColor_android_centerY, 0.0f);
            int b = C0878h.m5077b(a, xmlPullParser2, "type", C0721R.styleable.GradientColor_android_type, 0);
            int a8 = C0878h.m5066a(a, xmlPullParser2, "startColor", C0721R.styleable.GradientColor_android_startColor, 0);
            String str = "centerColor";
            boolean a9 = C0878h.m5075a(xmlPullParser2, str);
            int a10 = C0878h.m5066a(a, xmlPullParser2, str, C0721R.styleable.GradientColor_android_centerColor, 0);
            int a11 = C0878h.m5066a(a, xmlPullParser2, "endColor", C0721R.styleable.GradientColor_android_endColor, 0);
            int b2 = C0878h.m5077b(a, xmlPullParser2, "tileMode", C0721R.styleable.GradientColor_android_tileMode, 0);
            float f = a6;
            float a12 = C0878h.m5063a(a, xmlPullParser2, "gradientRadius", C0721R.styleable.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C0872a a13 = m5038a(m5039b(resources, xmlPullParser, attributeSet, theme), a8, a11, a9, a10);
            if (b == 1) {
                float f2 = f;
                if (a12 > 0.0f) {
                    int[] iArr = a13.f4039a;
                    RadialGradient radialGradient = new RadialGradient(f2, a7, a12, iArr, a13.f4040b, m5035a(b2));
                    return radialGradient;
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b != 2) {
                LinearGradient linearGradient = new LinearGradient(a2, a3, a4, a5, a13.f4039a, a13.f4040b, m5035a(b2));
                return linearGradient;
            } else {
                return new SweepGradient(f, a7, a13.f4039a, a13.f4040b);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* renamed from: a */
    private static C0872a m5038a(@C0195i0 C0872a aVar, @C0198k int i, @C0198k int i2, boolean z, @C0198k int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0872a(i, i3, i2);
        }
        return new C0872a(i, i2);
    }

    /* renamed from: a */
    private static TileMode m5035a(int i) {
        if (i == 1) {
            return TileMode.REPEAT;
        }
        if (i != 2) {
            return TileMode.CLAMP;
        }
        return TileMode.MIRROR;
    }
}
