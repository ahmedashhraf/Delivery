package androidx.core.content.p020h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.annotation.C0217s;
import androidx.core.p033k.C0944i;

/* renamed from: androidx.core.content.h.g */
/* compiled from: ResourcesCompat */
public final class C0874g {

    /* renamed from: a */
    private static final String f4042a = "ResourcesCompat";

    /* renamed from: androidx.core.content.h.g$a */
    /* compiled from: ResourcesCompat */
    public static abstract class C0875a {

        /* renamed from: androidx.core.content.h.g$a$a */
        /* compiled from: ResourcesCompat */
        class C0876a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f4043a;

            C0876a(Typeface typeface) {
                this.f4043a = typeface;
            }

            public void run() {
                C0875a.this.mo2978a(this.f4043a);
            }
        }

        /* renamed from: androidx.core.content.h.g$a$b */
        /* compiled from: ResourcesCompat */
        class C0877b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f4045a;

            C0877b(int i) {
                this.f4045a = i;
            }

            public void run() {
                C0875a.this.mo2977a(this.f4045a);
            }
        }

        /* renamed from: a */
        public abstract void mo2977a(int i);

        /* renamed from: a */
        public abstract void mo2978a(@C0193h0 Typeface typeface);

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public final void mo4552a(Typeface typeface, @C0195i0 Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0876a(typeface));
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public final void mo4551a(int i, @C0195i0 Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0877b(i));
        }
    }

    private C0874g() {
    }

    @C0195i0
    /* renamed from: a */
    public static Drawable m5055a(@C0193h0 Resources resources, @C0213q int i, int i2, @C0195i0 Theme theme) throws NotFoundException {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 21) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
        if (i3 >= 15) {
            return resources.getDrawableForDensity(i, i2);
        }
        return resources.getDrawable(i);
    }

    @C0195i0
    /* renamed from: b */
    public static ColorStateList m5057b(@C0193h0 Resources resources, @C0202m int i, @C0195i0 Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    @C0195i0
    /* renamed from: c */
    public static Drawable m5058c(@C0193h0 Resources resources, @C0213q int i, @C0195i0 Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    @C0198k
    /* renamed from: a */
    public static int m5050a(@C0193h0 Resources resources, @C0202m int i, @C0195i0 Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: a */
    public static float m5049a(@C0193h0 Resources resources, @C0209o int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" type #0x");
        sb.append(Integer.toHexString(typedValue.type));
        sb.append(" is not valid");
        throw new NotFoundException(sb.toString());
    }

    @C0195i0
    /* renamed from: a */
    public static Typeface m5051a(@C0193h0 Context context, @C0217s int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m5053a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static void m5056a(@C0193h0 Context context, @C0217s int i, @C0193h0 C0875a aVar, @C0195i0 Handler handler) throws NotFoundException {
        C0944i.m5337a(aVar);
        if (context.isRestricted()) {
            aVar.mo4551a(-4, handler);
            return;
        }
        m5053a(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static Typeface m5052a(@C0193h0 Context context, @C0217s int i, TypedValue typedValue, int i2, @C0195i0 C0875a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m5053a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m5053a(@C0193h0 Context context, int i, TypedValue typedValue, int i2, @C0195i0 C0875a aVar, @C0195i0 Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m5054a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m5054a(@androidx.annotation.C0193h0 android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, @androidx.annotation.C0195i0 androidx.core.content.p020h.C0874g.C0875a r18, @androidx.annotation.C0195i0 android.os.Handler r19, boolean r20) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x0093
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = 0
            r12 = -3
            if (r0 != 0) goto L_0x0022
            if (r8 == 0) goto L_0x0021
            r8.mo4551a(r12, r9)
        L_0x0021:
            return r11
        L_0x0022:
            android.graphics.Typeface r0 = androidx.core.p018c.C0828g.m4842b(r14, r3, r4)
            if (r0 == 0) goto L_0x002e
            if (r8 == 0) goto L_0x002d
            r8.mo4552a(r0, r9)
        L_0x002d:
            return r0
        L_0x002e:
            java.lang.String r0 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            if (r0 == 0) goto L_0x005b
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            androidx.core.content.h.d$a r1 = androidx.core.content.p020h.C0865d.m5018a(r0, r14)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            if (r1 != 0) goto L_0x004a
            if (r8 == 0) goto L_0x0049
            r8.mo4551a(r12, r9)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
        L_0x0049:
            return r11
        L_0x004a:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = androidx.core.p018c.C0828g.m4839a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            return r0
        L_0x005b:
            r0 = r13
            android.graphics.Typeface r0 = androidx.core.p018c.C0828g.m4836a(r13, r14, r3, r10, r4)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            if (r8 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0068
            r8.mo4552a(r0, r9)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
            goto L_0x006b
        L_0x0068:
            r8.mo4551a(r12, r9)     // Catch:{ XmlPullParserException -> 0x007d, IOException -> 0x006c }
        L_0x006b:
            return r0
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r10)
            r0.toString()
            goto L_0x008d
        L_0x007d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r10)
            r0.toString()
        L_0x008d:
            if (r8 == 0) goto L_0x0092
            r8.mo4551a(r12, r9)
        L_0x0092:
            return r11
        L_0x0093:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p020h.C0874g.m5054a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.h.g$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
