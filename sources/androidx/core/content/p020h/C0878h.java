package androidx.core.content.p020h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0182c;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0218s0;
import org.xmlpull.v1.XmlPullParser;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.h.h */
/* compiled from: TypedArrayUtils */
public class C0878h {

    /* renamed from: a */
    private static final String f4047a = "http://schemas.android.com/apk/res/android";

    private C0878h() {
    }

    /* renamed from: a */
    public static boolean m5075a(@C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str) {
        return xmlPullParser.getAttributeValue(f4047a, str) != null;
    }

    /* renamed from: b */
    public static int m5077b(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i, int i2) {
        if (!m5075a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    @C0182c
    /* renamed from: c */
    public static int m5080c(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i, @C0182c int i2) {
        if (!m5075a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    @C0195i0
    /* renamed from: d */
    public static CharSequence[] m5082d(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: a */
    public static float m5063a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i, float f) {
        if (!m5075a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    @C0195i0
    /* renamed from: b */
    public static TypedValue m5078b(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, int i) {
        if (!m5075a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    @C0195i0
    /* renamed from: c */
    public static CharSequence m5081c(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: a */
    public static boolean m5074a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i, boolean z) {
        if (!m5075a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    @C0182c
    /* renamed from: b */
    public static int m5076b(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2, @C0182c int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @C0198k
    /* renamed from: a */
    public static int m5066a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i, @C0198k int i2) {
        if (!m5075a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    @C0195i0
    /* renamed from: b */
    public static String m5079b(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: a */
    public static C0863b m5071a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0195i0 Theme theme, @C0193h0 String str, @C0218s0 int i, @C0198k int i2) {
        if (m5075a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0863b.m5007b(typedValue.data);
            }
            C0863b b = C0863b.m5008b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C0863b.m5007b(i2);
    }

    @C0195i0
    /* renamed from: a */
    public static ColorStateList m5067a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0195i0 Theme theme, @C0193h0 String str, @C0218s0 int i) {
        if (!m5075a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        } else if (i2 < 28 || i2 > 31) {
            return C0862a.m4999a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m5068a(typedValue);
        }
    }

    @C0193h0
    /* renamed from: a */
    private static ColorStateList m5068a(@C0193h0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    @C0195i0
    /* renamed from: a */
    public static String m5072a(@C0193h0 TypedArray typedArray, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 String str, @C0218s0 int i) {
        if (!m5075a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    @C0193h0
    /* renamed from: a */
    public static TypedArray m5069a(@C0193h0 Resources resources, @C0195i0 Theme theme, @C0193h0 AttributeSet attributeSet, @C0193h0 int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static boolean m5073a(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @C0195i0
    /* renamed from: a */
    public static Drawable m5070a(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: a */
    public static int m5065a(@C0193h0 TypedArray typedArray, @C0218s0 int i, @C0218s0 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: a */
    public static int m5064a(@C0193h0 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
