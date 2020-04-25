package androidx.core.content.p020h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.h.b */
/* compiled from: ComplexColorCompat */
public final class C0863b {

    /* renamed from: d */
    private static final String f4016d = "ComplexColorCompat";

    /* renamed from: a */
    private final Shader f4017a;

    /* renamed from: b */
    private final ColorStateList f4018b;

    /* renamed from: c */
    private int f4019c;

    private C0863b(Shader shader, ColorStateList colorStateList, @C0198k int i) {
        this.f4017a = shader;
        this.f4018b = colorStateList;
        this.f4019c = i;
    }

    /* renamed from: a */
    static C0863b m5006a(@C0193h0 Shader shader) {
        return new C0863b(shader, null, 0);
    }

    /* renamed from: b */
    static C0863b m5007b(@C0198k int i) {
        return new C0863b(null, null, i);
    }

    /* renamed from: c */
    public boolean mo4538c() {
        return this.f4017a != null;
    }

    /* renamed from: d */
    public boolean mo4539d() {
        if (this.f4017a == null) {
            ColorStateList colorStateList = this.f4018b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo4540e() {
        return mo4538c() || this.f4019c != 0;
    }

    /* renamed from: a */
    static C0863b m5004a(@C0193h0 ColorStateList colorStateList) {
        return new C0863b(null, colorStateList, colorStateList.getDefaultColor());
    }

    @C0195i0
    /* renamed from: b */
    public Shader mo4537b() {
        return this.f4017a;
    }

    @C0195i0
    /* renamed from: b */
    public static C0863b m5008b(@C0193h0 Resources resources, @C0202m int i, @C0195i0 Theme theme) {
        try {
            return m5005a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @C0198k
    /* renamed from: a */
    public int mo4534a() {
        return this.f4019c;
    }

    /* renamed from: a */
    public void mo4535a(@C0198k int i) {
        this.f4019c = i;
    }

    /* renamed from: a */
    public boolean mo4536a(int[] iArr) {
        if (mo4539d()) {
            ColorStateList colorStateList = this.f4018b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4019c) {
                this.f4019c = colorForState;
                return true;
            }
        }
        return false;
    }

    @C0193h0
    /* renamed from: a */
    private static C0863b m5005a(@C0193h0 Resources resources, @C0202m int i, @C0195i0 Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m5004a(C0862a.m5001a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m5006a(C0871e.m5037a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
