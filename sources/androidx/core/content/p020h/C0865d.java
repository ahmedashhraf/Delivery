package androidx.core.content.p020h;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.C0186e;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.C0721R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.h.d */
/* compiled from: FontResourcesParserCompat */
public class C0865d {

    /* renamed from: a */
    private static final int f4020a = 400;

    /* renamed from: b */
    private static final int f4021b = 1;

    /* renamed from: c */
    public static final int f4022c = 0;

    /* renamed from: d */
    public static final int f4023d = 1;

    /* renamed from: e */
    public static final int f4024e = -1;

    /* renamed from: f */
    private static final int f4025f = 500;

    /* renamed from: androidx.core.content.h.d$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C0866a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.h.d$b */
    /* compiled from: FontResourcesParserCompat */
    public @interface C0867b {
    }

    /* renamed from: androidx.core.content.h.d$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0868c implements C0866a {
        @C0193h0

        /* renamed from: a */
        private final C0869d[] f4026a;

        public C0868c(@C0193h0 C0869d[] dVarArr) {
            this.f4026a = dVarArr;
        }

        @C0193h0
        /* renamed from: a */
        public C0869d[] mo4541a() {
            return this.f4026a;
        }
    }

    /* renamed from: androidx.core.content.h.d$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0869d {
        @C0193h0

        /* renamed from: a */
        private final String f4027a;

        /* renamed from: b */
        private int f4028b;

        /* renamed from: c */
        private boolean f4029c;

        /* renamed from: d */
        private String f4030d;

        /* renamed from: e */
        private int f4031e;

        /* renamed from: f */
        private int f4032f;

        public C0869d(@C0193h0 String str, int i, boolean z, @C0195i0 String str2, int i2, int i3) {
            this.f4027a = str;
            this.f4028b = i;
            this.f4029c = z;
            this.f4030d = str2;
            this.f4031e = i2;
            this.f4032f = i3;
        }

        @C0193h0
        /* renamed from: a */
        public String mo4542a() {
            return this.f4027a;
        }

        /* renamed from: b */
        public int mo4543b() {
            return this.f4032f;
        }

        /* renamed from: c */
        public int mo4544c() {
            return this.f4031e;
        }

        @C0195i0
        /* renamed from: d */
        public String mo4545d() {
            return this.f4030d;
        }

        /* renamed from: e */
        public int mo4546e() {
            return this.f4028b;
        }

        /* renamed from: f */
        public boolean mo4547f() {
            return this.f4029c;
        }
    }

    /* renamed from: androidx.core.content.h.d$e */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0870e implements C0866a {
        @C0193h0

        /* renamed from: a */
        private final FontRequest f4033a;

        /* renamed from: b */
        private final int f4034b;

        /* renamed from: c */
        private final int f4035c;

        public C0870e(@C0193h0 FontRequest fontRequest, int i, int i2) {
            this.f4033a = fontRequest;
            this.f4035c = i;
            this.f4034b = i2;
        }

        /* renamed from: a */
        public int mo4548a() {
            return this.f4035c;
        }

        @C0193h0
        /* renamed from: b */
        public FontRequest mo4549b() {
            return this.f4033a;
        }

        /* renamed from: c */
        public int mo4550c() {
            return this.f4034b;
        }
    }

    private C0865d() {
    }

    @C0195i0
    /* renamed from: a */
    public static C0866a m5018a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m5022b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @C0195i0
    /* renamed from: b */
    private static C0866a m5022b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m5023c(xmlPullParser, resources);
        }
        m5021a(xmlPullParser);
        return null;
    }

    @C0195i0
    /* renamed from: c */
    private static C0866a m5023c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0721R.styleable.FontFamily);
        String string = obtainAttributes.getString(C0721R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0721R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0721R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0721R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0721R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0721R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m5024d(xmlPullParser, resources));
                    } else {
                        m5021a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0868c((C0869d[]) arrayList.toArray(new C0869d[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m5021a(xmlPullParser);
        }
        return new C0870e(new FontRequest(string, string2, string3, m5019a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0869d m5024d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0721R.styleable.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0721R.styleable.FontFamilyFont_fontWeight) ? C0721R.styleable.FontFamilyFont_fontWeight : C0721R.styleable.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0721R.styleable.FontFamilyFont_fontStyle) ? C0721R.styleable.FontFamilyFont_fontStyle : C0721R.styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0721R.styleable.FontFamilyFont_ttcIndex) ? C0721R.styleable.FontFamilyFont_ttcIndex : C0721R.styleable.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0721R.styleable.FontFamilyFont_fontVariationSettings) ? C0721R.styleable.FontFamilyFont_fontVariationSettings : C0721R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0721R.styleable.FontFamilyFont_font) ? C0721R.styleable.FontFamilyFont_font : C0721R.styleable.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m5021a(xmlPullParser);
        }
        C0869d dVar = new C0869d(string2, i, z, string, i3, resourceId);
        return dVar;
    }

    /* renamed from: a */
    private static int m5017a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m5019a(Resources resources, @C0186e int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m5017a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m5020a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m5020a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m5020a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m5021a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
