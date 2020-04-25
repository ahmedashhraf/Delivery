package androidx.vectordrawable.p051a.p052a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.collection.C0635a;
import androidx.core.content.p020h.C0878h;
import androidx.core.graphics.drawable.C0892a;
import androidx.vectordrawable.p051a.p052a.C1965b.C1966a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.a.a.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C1968c extends C1978h implements C1965b {

    /* renamed from: T */
    private static final String f7570T = "AnimatedVDCompat";

    /* renamed from: U */
    private static final String f7571U = "animated-vector";

    /* renamed from: V */
    private static final String f7572V = "target";

    /* renamed from: W */
    private static final boolean f7573W = false;

    /* renamed from: N */
    private Context f7574N;

    /* renamed from: O */
    private ArgbEvaluator f7575O;

    /* renamed from: P */
    C1972d f7576P;

    /* renamed from: Q */
    private AnimatorListener f7577Q;

    /* renamed from: R */
    ArrayList<C1966a> f7578R;

    /* renamed from: S */
    final Callback f7579S;

    /* renamed from: b */
    private C1971c f7580b;

    /* renamed from: androidx.vectordrawable.a.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C1969a implements Callback {
        C1969a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1968c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1968c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1968c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C1970b extends AnimatorListenerAdapter {
        C1970b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C1968c.this.f7578R);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1966a) arrayList.get(i)).mo8517a(C1968c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C1968c.this.f7578R);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1966a) arrayList.get(i)).mo8518b(C1968c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.a.a.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1971c extends ConstantState {

        /* renamed from: a */
        int f7583a;

        /* renamed from: b */
        C1979i f7584b;

        /* renamed from: c */
        AnimatorSet f7585c;

        /* renamed from: d */
        ArrayList<Animator> f7586d;

        /* renamed from: e */
        C0635a<Animator, String> f7587e;

        public C1971c(Context context, C1971c cVar, Callback callback, Resources resources) {
            if (cVar != null) {
                this.f7583a = cVar.f7583a;
                C1979i iVar = cVar.f7584b;
                if (iVar != null) {
                    ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f7584b = (C1979i) constantState.newDrawable(resources);
                    } else {
                        this.f7584b = (C1979i) constantState.newDrawable();
                    }
                    this.f7584b = (C1979i) this.f7584b.mutate();
                    this.f7584b.setCallback(callback);
                    this.f7584b.setBounds(cVar.f7584b.getBounds());
                    this.f7584b.mo8580a(false);
                }
                ArrayList<Animator> arrayList = cVar.f7586d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f7586d = new ArrayList<>(size);
                    this.f7587e = new C0635a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) cVar.f7586d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f7587e.get(animator);
                        clone.setTarget(this.f7584b.mo8579a(str));
                        this.f7586d.add(clone);
                        this.f7587e.put(clone, str);
                    }
                    mo8565a();
                }
            }
        }

        /* renamed from: a */
        public void mo8565a() {
            if (this.f7585c == null) {
                this.f7585c = new AnimatorSet();
            }
            this.f7585c.playTogether(this.f7586d);
        }

        public int getChangingConfigurations() {
            return this.f7583a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.vectordrawable.a.a.c$d */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1972d extends ConstantState {

        /* renamed from: a */
        private final ConstantState f7588a;

        public C1972d(ConstantState constantState) {
            this.f7588a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f7588a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f7588a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1968c cVar = new C1968c();
            cVar.f7605a = this.f7588a.newDrawable();
            cVar.f7605a.setCallback(cVar.f7579S);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1968c cVar = new C1968c();
            cVar.f7605a = this.f7588a.newDrawable(resources);
            cVar.f7605a.setCallback(cVar.f7579S);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1968c cVar = new C1968c();
            cVar.f7605a = this.f7588a.newDrawable(resources, theme);
            cVar.f7605a.setCallback(cVar.f7579S);
            return cVar;
        }
    }

    C1968c() {
        this(null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[Catch:{ IOException | XmlPullParserException -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ IOException | XmlPullParserException -> 0x005c }] */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.p051a.p052a.C1968c m10294a(@androidx.annotation.C0193h0 android.content.Context r4, @androidx.annotation.C0213q int r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x002e
            androidx.vectordrawable.a.a.c r0 = new androidx.vectordrawable.a.a.c
            r0.<init>(r4)
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            android.graphics.drawable.Drawable r4 = androidx.core.content.p020h.C0874g.m5058c(r1, r5, r4)
            r0.f7605a = r4
            android.graphics.drawable.Drawable r4 = r0.f7605a
            android.graphics.drawable.Drawable$Callback r5 = r0.f7579S
            r4.setCallback(r5)
            androidx.vectordrawable.a.a.c$d r4 = new androidx.vectordrawable.a.a.c$d
            android.graphics.drawable.Drawable r5 = r0.f7605a
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f7576P = r4
            return r0
        L_0x002e:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005c }
        L_0x003a:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            r2 = 2
            if (r1 == r2) goto L_0x0045
            r3 = 1
            if (r1 == r3) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            if (r1 != r2) goto L_0x0054
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            android.content.res.Resources$Theme r2 = r4.getTheme()     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            androidx.vectordrawable.a.a.c r4 = m10295a(r4, r1, r5, r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            return r4
        L_0x0054:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005c }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x005c }
        L_0x005c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.p051a.p052a.C1968c.m10294a(android.content.Context, int):androidx.vectordrawable.a.a.c");
    }

    @RequiresApi(23)
    /* renamed from: b */
    private static boolean m10302b(AnimatedVectorDrawable animatedVectorDrawable, C1966a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.mo8516a());
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5147a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5151a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f7580b.f7584b.draw(canvas);
        if (this.f7580b.f7585c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5155c(drawable);
        }
        return this.f7580b.f7584b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f7580b.f7583a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5156d(drawable);
        }
        return this.f7580b.f7584b.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f7605a;
        if (drawable == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1972d(drawable.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f7580b.f7584b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f7580b.f7584b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f7580b.f7584b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5148a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f7571U.equals(name)) {
                    TypedArray a = C0878h.m5069a(resources, theme, attributeSet, C1964a.f7502M);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1979i a2 = C1979i.m10338a(resources, resourceId, theme);
                        a2.mo8580a(false);
                        a2.setCallback(this.f7579S);
                        C1979i iVar = this.f7580b.f7584b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f7580b.f7584b = a2;
                    }
                    a.recycle();
                } else if (f7572V.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1964a.f7504O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f7574N;
                        if (context != null) {
                            m10300a(string, C1974e.m10312a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f7580b.mo8565a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return C0892a.m5158f(drawable);
        }
        return this.f7580b.f7584b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f7580b.f7585c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f7580b.f7584b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7580b.f7584b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f7580b.f7584b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f7580b.f7584b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f7580b.f7584b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5150a(drawable, z);
        } else {
            this.f7580b.f7584b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5154b(drawable, i);
        } else {
            this.f7580b.f7584b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5146a(drawable, colorStateList);
        } else {
            this.f7580b.f7584b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            C0892a.m5149a(drawable, mode);
        } else {
            this.f7580b.f7584b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f7580b.f7584b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f7580b.f7585c.isStarted()) {
            this.f7580b.f7585c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7580b.f7585c.end();
        }
    }

    private C1968c(@C0195i0 Context context) {
        this(context, null, null);
    }

    /* renamed from: b */
    private void m10301b() {
        AnimatorListener animatorListener = this.f7577Q;
        if (animatorListener != null) {
            this.f7580b.f7585c.removeListener(animatorListener);
            this.f7577Q = null;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7580b.f7584b.setColorFilter(colorFilter);
        }
    }

    private C1968c(@C0195i0 Context context, @C0195i0 C1971c cVar, @C0195i0 Resources resources) {
        this.f7575O = null;
        this.f7577Q = null;
        this.f7578R = null;
        this.f7579S = new C1969a();
        this.f7574N = context;
        if (cVar != null) {
            this.f7580b = cVar;
        } else {
            this.f7580b = new C1971c(context, cVar, this.f7579S, resources);
        }
    }

    /* renamed from: b */
    public boolean mo8515b(@C0193h0 C1966a aVar) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            m10302b((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<C1966a> arrayList = this.f7578R;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f7578R.size() == 0) {
            m10301b();
        }
        return remove;
    }

    /* renamed from: b */
    public static boolean m10303b(Drawable drawable, C1966a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        if (VERSION.SDK_INT >= 24) {
            return m10302b((AnimatedVectorDrawable) drawable, aVar);
        }
        return ((C1968c) drawable).mo8515b(aVar);
    }

    /* renamed from: a */
    public static C1968c m10295a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1968c cVar = new C1968c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m10296a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m10296a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f7575O == null) {
                    this.f7575O = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f7575O);
            }
        }
    }

    /* renamed from: a */
    private void m10300a(String str, Animator animator) {
        animator.setTarget(this.f7580b.f7584b.mo8579a(str));
        if (VERSION.SDK_INT < 21) {
            m10296a(animator);
        }
        C1971c cVar = this.f7580b;
        if (cVar.f7586d == null) {
            cVar.f7586d = new ArrayList<>();
            this.f7580b.f7587e = new C0635a<>();
        }
        this.f7580b.f7586d.add(animator);
        this.f7580b.f7587e.put(animator, str);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* renamed from: a */
    public void mo8514a(@C0193h0 C1966a aVar) {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            m10297a((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.f7578R == null) {
                this.f7578R = new ArrayList<>();
            }
            if (!this.f7578R.contains(aVar)) {
                this.f7578R.add(aVar);
                if (this.f7577Q == null) {
                    this.f7577Q = new C1970b();
                }
                this.f7580b.f7585c.addListener(this.f7577Q);
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: a */
    private static void m10297a(@C0193h0 AnimatedVectorDrawable animatedVectorDrawable, @C0193h0 C1966a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.mo8516a());
    }

    /* renamed from: a */
    public void mo8513a() {
        Drawable drawable = this.f7605a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m10301b();
        ArrayList<C1966a> arrayList = this.f7578R;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* renamed from: a */
    public static void m10299a(Drawable drawable, C1966a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            if (VERSION.SDK_INT >= 24) {
                m10297a((AnimatedVectorDrawable) drawable, aVar);
            } else {
                ((C1968c) drawable).mo8514a(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m10298a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((C1968c) drawable).mo8513a();
            }
        }
    }
}
