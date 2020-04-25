package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p008b.p009a.C0319a;
import androidx.appcompat.resources.C0351R;
import androidx.collection.C0635a;
import androidx.collection.C0642f;
import androidx.collection.C0650i;
import androidx.collection.LruCache;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.vectordrawable.p051a.p052a.C1968c;
import androidx.vectordrawable.p051a.p052a.C1979i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public final class ResourceManagerInternal {
    private static final C0436c COLOR_FILTER_CACHE = new C0436c(6);
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private C0635a<String, C0437d> mDelegates;
    private final WeakHashMap<Context, C0642f<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private C0438e mHooks;
    private C0650i<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, C0650i<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    @RequiresApi(11)
    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$a */
    static class C0434a implements C0437d {
        C0434a() {
        }

        /* renamed from: a */
        public Drawable mo2195a(@C0193h0 Context context, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) {
            try {
                return C0319a.m1743b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$b */
    private static class C0435b implements C0437d {
        C0435b() {
        }

        /* renamed from: a */
        public Drawable mo2195a(@C0193h0 Context context, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) {
            try {
                return C1968c.m10295a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$c */
    private static class C0436c extends LruCache<Integer, PorterDuffColorFilter> {
        public C0436c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m2447b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo2196a(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m2447b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo2197a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m2447b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$d */
    private interface C0437d {
        /* renamed from: a */
        Drawable mo2195a(@C0193h0 Context context, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$e */
    interface C0438e {
        /* renamed from: a */
        ColorStateList mo2198a(@C0193h0 Context context, @C0213q int i);

        /* renamed from: a */
        Mode mo2199a(int i);

        /* renamed from: a */
        Drawable mo2200a(@C0193h0 ResourceManagerInternal resourceManagerInternal, @C0193h0 Context context, @C0213q int i);

        /* renamed from: a */
        boolean mo2201a(@C0193h0 Context context, @C0213q int i, @C0193h0 Drawable drawable);

        /* renamed from: b */
        boolean mo2202b(@C0193h0 Context context, @C0213q int i, @C0193h0 Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.ResourceManagerInternal$f */
    private static class C0439f implements C0437d {
        C0439f() {
        }

        /* renamed from: a */
        public Drawable mo2195a(@C0193h0 Context context, @C0193h0 XmlPullParser xmlPullParser, @C0193h0 AttributeSet attributeSet, @C0195i0 Theme theme) {
            try {
                return C1979i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void addDelegate(@C0193h0 String str, @C0193h0 C0437d dVar) {
        if (this.mDelegates == null) {
            this.mDelegates = new C0635a<>();
        }
        this.mDelegates.put(str, dVar);
    }

    private synchronized boolean addDrawableToCache(@C0193h0 Context context, long j, @C0193h0 Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0642f fVar = (C0642f) this.mDrawableCaches.get(context);
        if (fVar == null) {
            fVar = new C0642f();
            this.mDrawableCaches.put(context, fVar);
        }
        fVar.mo3284c(j, new WeakReference(constantState));
        return true;
    }

    private void addTintListToCache(@C0193h0 Context context, @C0213q int i, @C0193h0 ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        C0650i iVar = (C0650i) this.mTintLists.get(context);
        if (iVar == null) {
            iVar = new C0650i();
            this.mTintLists.put(context, iVar);
        }
        iVar.mo3382a(i, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void checkVectorDrawableSetup(@C0193h0 Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, C0351R.C0353drawable.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable createDrawableIfNeeded(@C0193h0 Context context, @C0213q int i) {
        Drawable drawable;
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        C0438e eVar = this.mHooks;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo2200a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                INSTANCE = new ResourceManagerInternal();
                installDefaultInflateDelegates(INSTANCE);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable getCachedDrawable(@androidx.annotation.C0193h0 android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.mDrawableCaches     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.f r0 = (androidx.collection.C0642f) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo3283c(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo3281b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (ResourceManagerInternal.class) {
            a = COLOR_FILTER_CACHE.mo2196a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                COLOR_FILTER_CACHE.mo2197a(i, mode, a);
            }
        }
        return a;
    }

    private ColorStateList getTintListFromCache(@C0193h0 Context context, @C0213q int i) {
        WeakHashMap<Context, C0650i<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null) {
            return null;
        }
        C0650i iVar = (C0650i) weakHashMap.get(context);
        if (iVar != null) {
            return (ColorStateList) iVar.mo3391c(i);
        }
        return null;
    }

    private static void installDefaultInflateDelegates(@C0193h0 ResourceManagerInternal resourceManagerInternal) {
        if (VERSION.SDK_INT < 24) {
            resourceManagerInternal.addDelegate("vector", new C0439f());
            resourceManagerInternal.addDelegate("animated-vector", new C0435b());
            resourceManagerInternal.addDelegate("animated-selector", new C0434a());
        }
    }

    private static boolean isVectorDrawable(@C0193h0 Drawable drawable) {
        if (!(drawable instanceof C1979i)) {
            if (!PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable loadDrawableFromDelegates(@androidx.annotation.C0193h0 android.content.Context r11, @androidx.annotation.C0213q int r12) {
        /*
            r10 = this;
            androidx.collection.a<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$d> r0 = r10.mDelegates
            r1 = 0
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ab
            androidx.collection.i<java.lang.String> r0 = r10.mKnownDrawableIdTags
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo3391c(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.a<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$d> r3 = r10.mDelegates
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.i r0 = new androidx.collection.i
            r0.<init>()
            r10.mKnownDrawableIdTags = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.mTypedValue
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.mTypedValue = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.mTypedValue
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = createCacheKey(r0)
            android.graphics.drawable.Drawable r6 = r10.getCachedDrawable(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a3
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a3
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.i<java.lang.String> r8 = r10.mKnownDrawableIdTags     // Catch:{ Exception -> 0x00a2 }
            r8.mo3382a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.a<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$d> r8 = r10.mDelegates     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.ResourceManagerInternal$d r3 = (androidx.appcompat.widget.ResourceManagerInternal.C0437d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2195a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00a3
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.addDrawableToCache(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a3
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
        L_0x00a3:
            if (r6 != 0) goto L_0x00aa
            androidx.collection.i<java.lang.String> r11 = r10.mKnownDrawableIdTags
            r11.mo3382a(r12, r2)
        L_0x00aa:
            return r6
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.loadDrawableFromDelegates(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private void removeDelegate(@C0193h0 String str, @C0193h0 C0437d dVar) {
        C0635a<String, C0437d> aVar = this.mDelegates;
        if (aVar != null && aVar.get(str) == dVar) {
            this.mDelegates.remove(str);
        }
    }

    private Drawable tintDrawable(@C0193h0 Context context, @C0213q int i, boolean z, @C0193h0 Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (C0469a0.m2595a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0892a.m5161i(drawable);
            C0892a.m5146a(i2, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return i2;
            }
            C0892a.m5149a(i2, tintMode);
            return i2;
        }
        C0438e eVar = this.mHooks;
        if ((eVar == null || !eVar.mo2202b(context, i, drawable)) && !tintDrawableUsingColorFilter(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public synchronized Drawable getDrawable(@C0193h0 Context context, @C0213q int i) {
        return getDrawable(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    public synchronized ColorStateList getTintList(@C0193h0 Context context, @C0213q int i) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            tintListFromCache = this.mHooks == null ? null : this.mHooks.mo2198a(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    /* access modifiers changed from: 0000 */
    public Mode getTintMode(int i) {
        C0438e eVar = this.mHooks;
        if (eVar == null) {
            return null;
        }
        return eVar.mo2199a(i);
    }

    public synchronized void onConfigurationChanged(@C0193h0 Context context) {
        C0642f fVar = (C0642f) this.mDrawableCaches.get(context);
        if (fVar != null) {
            fVar.mo3279b();
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized Drawable onDrawableLoadedFromResources(@C0193h0 Context context, @C0193h0 C0565y0 y0Var, @C0213q int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = y0Var.mo3005a(i);
        }
        if (loadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i, false, loadDrawableFromDelegates);
    }

    public synchronized void setHooks(C0438e eVar) {
        this.mHooks = eVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean tintDrawableUsingColorFilter(@C0193h0 Context context, @C0213q int i, @C0193h0 Drawable drawable) {
        C0438e eVar = this.mHooks;
        return eVar != null && eVar.mo2201a(context, i, drawable);
    }

    /* access modifiers changed from: 0000 */
    public synchronized Drawable getDrawable(@C0193h0 Context context, @C0213q int i, boolean z) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = C0841b.m4928c(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            C0469a0.m2596b(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    static void tintDrawable(Drawable drawable, C0545r0 r0Var, int[] iArr) {
        if (!C0469a0.m2595a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.f2182d || r0Var.f2181c) {
                drawable.setColorFilter(createTintFilter(r0Var.f2182d ? r0Var.f2179a : null, r0Var.f2181c ? r0Var.f2180b : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
