package androidx.appcompat.p008b.p009a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.C0351R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.C0642f;
import androidx.collection.C0650i;
import androidx.core.content.p020h.C0878h;
import androidx.core.graphics.drawable.C0897e;
import androidx.vectordrawable.p051a.p052a.C1968c;
import androidx.vectordrawable.p051a.p052a.C1979i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.b.a.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C0319a extends C0334e implements C0897e {

    /* renamed from: k0 */
    private static final String f1011k0 = C0319a.class.getSimpleName();

    /* renamed from: l0 */
    private static final String f1012l0 = "transition";

    /* renamed from: m0 */
    private static final String f1013m0 = "item";

    /* renamed from: n0 */
    private static final String f1014n0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: o0 */
    private static final String f1015o0 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: p0 */
    private static final String f1016p0 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: f0 */
    private C0322c f1017f0;

    /* renamed from: g0 */
    private C0326g f1018g0;

    /* renamed from: h0 */
    private int f1019h0;

    /* renamed from: i0 */
    private int f1020i0;

    /* renamed from: j0 */
    private boolean f1021j0;

    /* renamed from: androidx.appcompat.b.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0321b extends C0326g {

        /* renamed from: a */
        private final Animatable f1022a;

        C0321b(Animatable animatable) {
            super();
            this.f1022a = animatable;
        }

        /* renamed from: c */
        public void mo1182c() {
            this.f1022a.start();
        }

        /* renamed from: d */
        public void mo1183d() {
            this.f1022a.stop();
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C0322c extends C0335a {

        /* renamed from: M */
        private static final long f1023M = 4294967296L;

        /* renamed from: N */
        private static final long f1024N = 8589934592L;

        /* renamed from: K */
        C0642f<Long> f1025K;

        /* renamed from: L */
        C0650i<Integer> f1026L;

        C0322c(@C0195i0 C0322c cVar, @C0193h0 C0319a aVar, @C0195i0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f1025K = cVar.f1025K;
                this.f1026L = cVar.f1026L;
                return;
            }
            this.f1025K = new C0642f<>();
            this.f1026L = new C0650i<>();
        }

        /* renamed from: f */
        private static long m1762f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1184a(int i, int i2, @C0193h0 Drawable drawable, boolean z) {
            int a = super.mo1213a(drawable);
            long f = m1762f(i, i2);
            long j = z ? f1024N : 0;
            long j2 = (long) a;
            this.f1025K.mo3272a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f1025K.mo3272a(m1762f(i2, i), Long.valueOf(f1023M | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo1186b(@C0193h0 int[] iArr) {
            int a = super.mo1307a(iArr);
            if (a >= 0) {
                return a;
            }
            return super.mo1307a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo1187c(int i, int i2) {
            return (int) ((Long) this.f1025K.mo3278b(m1762f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo1188d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f1026L.mo3388b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo1190e(int i, int i2) {
            return (((Long) this.f1025K.mo3278b(m1762f(i, i2), Long.valueOf(-1))).longValue() & f1024N) != 0;
        }

        @C0193h0
        public Drawable newDrawable() {
            return new C0319a(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo1193q() {
            this.f1025K = this.f1025K.clone();
            this.f1026L = this.f1026L.clone();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo1189d(int i, int i2) {
            return (((Long) this.f1025K.mo3278b(m1762f(i, i2), Long.valueOf(-1))).longValue() & f1023M) != 0;
        }

        @C0193h0
        public Drawable newDrawable(Resources resources) {
            return new C0319a(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1185a(@C0193h0 int[] iArr, @C0193h0 Drawable drawable, int i) {
            int a = super.mo1308a(iArr, drawable);
            this.f1026L.mo3392c(a, Integer.valueOf(i));
            return a;
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0323d extends C0326g {

        /* renamed from: a */
        private final C1968c f1027a;

        C0323d(C1968c cVar) {
            super();
            this.f1027a = cVar;
        }

        /* renamed from: c */
        public void mo1182c() {
            this.f1027a.start();
        }

        /* renamed from: d */
        public void mo1183d() {
            this.f1027a.stop();
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0324e extends C0326g {

        /* renamed from: a */
        private final ObjectAnimator f1028a;

        /* renamed from: b */
        private final boolean f1029b;

        C0324e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0325f fVar = new C0325f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo1196a());
            ofInt.setInterpolator(fVar);
            this.f1029b = z2;
            this.f1028a = ofInt;
        }

        /* renamed from: a */
        public boolean mo1194a() {
            return this.f1029b;
        }

        /* renamed from: b */
        public void mo1195b() {
            this.f1028a.reverse();
        }

        /* renamed from: c */
        public void mo1182c() {
            this.f1028a.start();
        }

        /* renamed from: d */
        public void mo1183d() {
            this.f1028a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0325f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f1030a;

        /* renamed from: b */
        private int f1031b;

        /* renamed from: c */
        private int f1032c;

        C0325f(AnimationDrawable animationDrawable, boolean z) {
            mo1197a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1197a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1031b = numberOfFrames;
            int[] iArr = this.f1030a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1030a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1030a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f1032c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f1032c)) + 0.5f);
            int i2 = this.f1031b;
            int[] iArr = this.f1030a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f1032c) : 0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1196a() {
            return this.f1032c;
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C0326g {
        private C0326g() {
        }

        /* renamed from: a */
        public boolean mo1194a() {
            return false;
        }

        /* renamed from: b */
        public void mo1195b() {
        }

        /* renamed from: c */
        public abstract void mo1182c();

        /* renamed from: d */
        public abstract void mo1183d();
    }

    public C0319a() {
        this(null, null);
    }

    /* renamed from: e */
    private int m1746e(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C0351R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0351R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0351R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0351R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z = a.getBoolean(C0351R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        String str = f1014n0;
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = C1968c.m10295a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f1017f0.mo1184a(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(f1015o0);
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: f */
    private void m1747f() {
        onStateChange(getState());
    }

    /* renamed from: g */
    private boolean m1748g(int i) {
        int i2;
        C0326g gVar;
        C0326g gVar2 = this.f1018g0;
        if (gVar2 == null) {
            i2 = mo1203c();
        } else if (i == this.f1019h0) {
            return true;
        } else {
            if (i != this.f1020i0 || !gVar2.mo1194a()) {
                i2 = this.f1019h0;
                gVar2.mo1183d();
            } else {
                gVar2.mo1195b();
                this.f1019h0 = this.f1020i0;
                this.f1020i0 = i;
                return true;
            }
        }
        this.f1018g0 = null;
        this.f1020i0 = -1;
        this.f1019h0 = -1;
        C0322c cVar = this.f1017f0;
        int d = cVar.mo1188d(i2);
        int d2 = cVar.mo1188d(i);
        if (!(d2 == 0 || d == 0)) {
            int c = cVar.mo1187c(d, d2);
            if (c < 0) {
                return false;
            }
            boolean e = cVar.mo1190e(d, d2);
            mo1201a(c);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                gVar = new C0324e((AnimationDrawable) current, cVar.mo1189d(d, d2), e);
            } else if (current instanceof C1968c) {
                gVar = new C0323d((C1968c) current);
            } else if (current instanceof Animatable) {
                gVar = new C0321b((Animatable) current);
            }
            gVar.mo1182c();
            this.f1018g0 = gVar;
            this.f1020i0 = i2;
            this.f1019h0 = i;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1145a(int[] iArr, Drawable drawable) {
        super.mo1145a(iArr, drawable);
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void applyTheme(@C0193h0 Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo1149c(int i) {
        super.mo1149c(i);
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo1151d(int i) {
        super.mo1151d(i);
    }

    public /* bridge */ /* synthetic */ void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @C0193h0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(@C0193h0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @RequiresApi(21)
    public /* bridge */ /* synthetic */ void getOutline(@C0193h0 Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(@C0193h0 Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(@C0193h0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0326g gVar = this.f1018g0;
        if (gVar != null) {
            gVar.mo1183d();
            this.f1018g0 = null;
            mo1201a(this.f1019h0);
            this.f1019h0 = -1;
            this.f1020i0 = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f1021j0 && super.mutate() == this) {
            this.f1017f0.mo1193q();
            this.f1021j0 = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f1017f0.mo1186b(iArr);
        boolean z = b != mo1203c() && (m1748g(b) || mo1201a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@C0193h0 Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f1018g0 != null && (visible || z2)) {
            if (z) {
                this.f1018g0.mo1182c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C0319a(@C0195i0 C0322c cVar, @C0195i0 Resources resources) {
        super(null);
        this.f1019h0 = -1;
        this.f1020i0 = -1;
        mo1144a((C0330c) new C0322c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019 A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.appcompat.p008b.p009a.C0319a m1741a(@androidx.annotation.C0193h0 android.content.Context r5, @androidx.annotation.C0213q int r6, @androidx.annotation.C0195i0 android.content.res.Resources.Theme r7) {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x000c:
            int r2 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            r3 = 2
            if (r2 == r3) goto L_0x0017
            r4 = 1
            if (r2 == r4) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r2 != r3) goto L_0x001e
            androidx.appcompat.b.a.a r5 = m1743b(r5, r0, r6, r1, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            return r5
        L_0x001e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            java.lang.String r6 = "No start tag found"
            r5.<init>(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            throw r5     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0319a.m1741a(android.content.Context, int, android.content.res.Resources$Theme):androidx.appcompat.b.a.a");
    }

    /* renamed from: c */
    private void m1744c(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m1745d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(f1012l0)) {
                        m1746e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m1745d(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C0351R.styleable.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0351R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0351R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        a.recycle();
        int[] a2 = mo1302a(attributeSet);
        String str = f1016p0;
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = C1979i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.f1017f0.mo1185a(a2, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: b */
    public static C0319a m1743b(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0319a aVar = new C0319a();
            aVar.mo1143a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: a */
    public void mo1143a(@C0193h0 Context context, @C0193h0 Resources resources, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C0351R.styleable.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0351R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        m1742a(a);
        mo1199a(resources);
        a.recycle();
        m1744c(context, resources, xmlPullParser, attributeSet, theme);
        m1747f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0322c m1757b() {
        return new C0322c(this.f1017f0, this, null);
    }

    /* renamed from: a */
    public void mo1146a(@C0193h0 int[] iArr, @C0193h0 Drawable drawable, int i) {
        if (drawable != null) {
            this.f1017f0.mo1185a(iArr, drawable, i);
            onStateChange(getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }

    /* renamed from: a */
    public <T extends Drawable & Animatable> void mo1142a(int i, int i2, @C0193h0 T t, boolean z) {
        if (t != null) {
            this.f1017f0.mo1184a(i, i2, t, z);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }

    /* renamed from: a */
    private void m1742a(TypedArray typedArray) {
        C0322c cVar = this.f1017f0;
        if (VERSION.SDK_INT >= 21) {
            cVar.f1063d |= typedArray.getChangingConfigurations();
        }
        cVar.mo1222b(typedArray.getBoolean(C0351R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f1068i));
        cVar.mo1218a(typedArray.getBoolean(C0351R.styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f1071l));
        cVar.mo1221b(typedArray.getInt(C0351R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f1051A));
        cVar.mo1225c(typedArray.getInt(C0351R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f1052B));
        setDither(typedArray.getBoolean(C0351R.styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f1083x));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1141a() {
        super.mo1141a();
        this.f1021j0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1144a(@C0193h0 C0330c cVar) {
        super.mo1144a(cVar);
        if (cVar instanceof C0322c) {
            this.f1017f0 = (C0322c) cVar;
        }
    }
}
