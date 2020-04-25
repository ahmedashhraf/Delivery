package androidx.core.content.p020h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.annotation.C0231x0;
import androidx.core.C0721R;
import androidx.core.p034l.C0962e0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.h.a */
/* compiled from: ColorStateListInflaterCompat */
public final class C0862a {
    private C0862a() {
    }

    @C0195i0
    /* renamed from: a */
    public static ColorStateList m4999a(@C0193h0 Resources resources, @C0231x0 int i, @C0195i0 Theme theme) {
        try {
            return m5000a(resources, (XmlPullParser) resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static ColorStateList m5003b(@C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        AttributeSet attributeSet2 = attributeSet;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next != 2 || depth2 > depth || !xmlPullParser.getName().equals("item")) {
                Resources resources2 = resources;
                Theme theme2 = theme;
            } else {
                TypedArray a = m5002a(resources, theme, attributeSet2, C0721R.styleable.ColorStateListItem);
                int color = a.getColor(C0721R.styleable.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (a.hasValue(C0721R.styleable.ColorStateListItem_android_alpha)) {
                    f = a.getFloat(C0721R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(C0721R.styleable.ColorStateListItem_alpha)) {
                    f = a.getFloat(C0721R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0721R.attr.alpha)) {
                        int i5 = i3 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i3);
                iArr2 = C0873f.m5041a(iArr2, i2, m4998a(color, f));
                iArr = (int[][]) C0873f.m5046a((T[]) iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr4 = new int[i2];
        int[][] iArr5 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        return new ColorStateList(iArr5, iArr4);
    }

    @C0193h0
    /* renamed from: a */
    public static ColorStateList m5000a(@C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m5001a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @C0193h0
    /* renamed from: a */
    public static ColorStateList m5001a(@C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m5003b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: a */
    private static TypedArray m5002a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @C0198k
    /* renamed from: a */
    private static int m4998a(@C0198k int i, @C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        return (i & C0962e0.f4342s) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
