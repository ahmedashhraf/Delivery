package androidx.appcompat.p008b.p009a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.C0892a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.b.a.b */
/* compiled from: DrawableContainer */
class C0327b extends Drawable implements Callback {

    /* renamed from: Y */
    private static final boolean f1033Y = false;

    /* renamed from: Z */
    private static final String f1034Z = "DrawableContainer";

    /* renamed from: a0 */
    private static final boolean f1035a0 = true;

    /* renamed from: N */
    private Drawable f1036N;

    /* renamed from: O */
    private Drawable f1037O;

    /* renamed from: P */
    private int f1038P = 255;

    /* renamed from: Q */
    private boolean f1039Q;

    /* renamed from: R */
    private int f1040R = -1;

    /* renamed from: S */
    private int f1041S = -1;

    /* renamed from: T */
    private boolean f1042T;

    /* renamed from: U */
    private Runnable f1043U;

    /* renamed from: V */
    private long f1044V;

    /* renamed from: W */
    private long f1045W;

    /* renamed from: X */
    private C0329b f1046X;

    /* renamed from: a */
    private C0330c f1047a;

    /* renamed from: b */
    private Rect f1048b;

    /* renamed from: androidx.appcompat.b.a.b$a */
    /* compiled from: DrawableContainer */
    class C0328a implements Runnable {
        C0328a() {
        }

        public void run() {
            C0327b.this.mo1200a(true);
            C0327b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.b.a.b$b */
    /* compiled from: DrawableContainer */
    static class C0329b implements Callback {

        /* renamed from: a */
        private Callback f1050a;

        C0329b() {
        }

        /* renamed from: a */
        public C0329b mo1209a(Callback callback) {
            this.f1050a = callback;
            return this;
        }

        public void invalidateDrawable(@C0193h0 Drawable drawable) {
        }

        public void scheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable, long j) {
            Callback callback = this.f1050a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable) {
            Callback callback = this.f1050a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* renamed from: a */
        public Callback mo1208a() {
            Callback callback = this.f1050a;
            this.f1050a = null;
            return callback;
        }
    }

    /* renamed from: androidx.appcompat.b.a.b$c */
    /* compiled from: DrawableContainer */
    static abstract class C0330c extends ConstantState {

        /* renamed from: A */
        int f1051A;

        /* renamed from: B */
        int f1052B;

        /* renamed from: C */
        boolean f1053C;

        /* renamed from: D */
        ColorFilter f1054D;

        /* renamed from: E */
        boolean f1055E;

        /* renamed from: F */
        ColorStateList f1056F;

        /* renamed from: G */
        Mode f1057G;

        /* renamed from: H */
        boolean f1058H;

        /* renamed from: I */
        boolean f1059I;

        /* renamed from: a */
        final C0327b f1060a;

        /* renamed from: b */
        Resources f1061b;

        /* renamed from: c */
        int f1062c = C13959t.f40969w2;

        /* renamed from: d */
        int f1063d;

        /* renamed from: e */
        int f1064e;

        /* renamed from: f */
        SparseArray<ConstantState> f1065f;

        /* renamed from: g */
        Drawable[] f1066g;

        /* renamed from: h */
        int f1067h;

        /* renamed from: i */
        boolean f1068i;

        /* renamed from: j */
        boolean f1069j;

        /* renamed from: k */
        Rect f1070k;

        /* renamed from: l */
        boolean f1071l;

        /* renamed from: m */
        boolean f1072m;

        /* renamed from: n */
        int f1073n;

        /* renamed from: o */
        int f1074o;

        /* renamed from: p */
        int f1075p;

        /* renamed from: q */
        int f1076q;

        /* renamed from: r */
        boolean f1077r;

        /* renamed from: s */
        int f1078s;

        /* renamed from: t */
        boolean f1079t;

        /* renamed from: u */
        boolean f1080u;

        /* renamed from: v */
        boolean f1081v;

        /* renamed from: w */
        boolean f1082w;

        /* renamed from: x */
        boolean f1083x;

        /* renamed from: y */
        boolean f1084y;

        /* renamed from: z */
        int f1085z;

        C0330c(C0330c cVar, C0327b bVar, Resources resources) {
            this.f1068i = false;
            this.f1071l = false;
            this.f1083x = true;
            this.f1051A = 0;
            this.f1052B = 0;
            this.f1060a = bVar;
            Resources resources2 = resources != null ? resources : cVar != null ? cVar.f1061b : null;
            this.f1061b = resources2;
            this.f1062c = C0327b.m1783a(resources, cVar != null ? cVar.f1062c : 0);
            if (cVar != null) {
                this.f1063d = cVar.f1063d;
                this.f1064e = cVar.f1064e;
                this.f1081v = true;
                this.f1082w = true;
                this.f1068i = cVar.f1068i;
                this.f1071l = cVar.f1071l;
                this.f1083x = cVar.f1083x;
                this.f1084y = cVar.f1084y;
                this.f1085z = cVar.f1085z;
                this.f1051A = cVar.f1051A;
                this.f1052B = cVar.f1052B;
                this.f1053C = cVar.f1053C;
                this.f1054D = cVar.f1054D;
                this.f1055E = cVar.f1055E;
                this.f1056F = cVar.f1056F;
                this.f1057G = cVar.f1057G;
                this.f1058H = cVar.f1058H;
                this.f1059I = cVar.f1059I;
                if (cVar.f1062c == this.f1062c) {
                    if (cVar.f1069j) {
                        this.f1070k = new Rect(cVar.f1070k);
                        this.f1069j = true;
                    }
                    if (cVar.f1072m) {
                        this.f1073n = cVar.f1073n;
                        this.f1074o = cVar.f1074o;
                        this.f1075p = cVar.f1075p;
                        this.f1076q = cVar.f1076q;
                        this.f1072m = true;
                    }
                }
                if (cVar.f1077r) {
                    this.f1078s = cVar.f1078s;
                    this.f1077r = true;
                }
                if (cVar.f1079t) {
                    this.f1080u = cVar.f1080u;
                    this.f1079t = true;
                }
                Drawable[] drawableArr = cVar.f1066g;
                this.f1066g = new Drawable[drawableArr.length];
                this.f1067h = cVar.f1067h;
                SparseArray<ConstantState> sparseArray = cVar.f1065f;
                if (sparseArray != null) {
                    this.f1065f = sparseArray.clone();
                } else {
                    this.f1065f = new SparseArray<>(this.f1067h);
                }
                int i = this.f1067h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f1065f.put(i2, constantState);
                        } else {
                            this.f1066g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f1066g = new Drawable[10];
            this.f1067h = 0;
        }

        /* renamed from: b */
        private Drawable m1798b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f1085z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f1060a);
            return mutate;
        }

        /* renamed from: r */
        private void m1799r() {
            SparseArray<ConstantState> sparseArray = this.f1065f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f1066g[this.f1065f.keyAt(i)] = m1798b(((ConstantState) this.f1065f.valueAt(i)).newDrawable(this.f1061b));
                }
                this.f1065f = null;
            }
        }

        /* renamed from: a */
        public final int mo1213a(Drawable drawable) {
            int i = this.f1067h;
            if (i >= this.f1066g.length) {
                mo1215a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1060a);
            this.f1066g[i] = drawable;
            this.f1067h++;
            this.f1064e = drawable.getChangingConfigurations() | this.f1064e;
            mo1238n();
            this.f1070k = null;
            this.f1069j = false;
            this.f1072m = false;
            this.f1081v = false;
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo1224c() {
            this.f1072m = true;
            m1799r();
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            this.f1074o = -1;
            this.f1073n = -1;
            this.f1076q = 0;
            this.f1075p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1073n) {
                    this.f1073n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1074o) {
                    this.f1074o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1075p) {
                    this.f1075p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1076q) {
                    this.f1076q = minimumHeight;
                }
            }
        }

        @RequiresApi(21)
        public boolean canApplyTheme() {
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f1065f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final int mo1227d() {
            return this.f1066g.length;
        }

        /* renamed from: e */
        public final int mo1228e() {
            return this.f1067h;
        }

        /* renamed from: f */
        public final int mo1229f() {
            if (!this.f1072m) {
                mo1224c();
            }
            return this.f1074o;
        }

        /* renamed from: g */
        public final int mo1230g() {
            if (!this.f1072m) {
                mo1224c();
            }
            return this.f1076q;
        }

        public int getChangingConfigurations() {
            return this.f1063d | this.f1064e;
        }

        /* renamed from: h */
        public final int mo1232h() {
            if (!this.f1072m) {
                mo1224c();
            }
            return this.f1075p;
        }

        /* renamed from: i */
        public final Rect mo1233i() {
            if (this.f1068i) {
                return null;
            }
            if (this.f1070k != null || this.f1069j) {
                return this.f1070k;
            }
            m1799r();
            Rect rect = new Rect();
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f1069j = true;
            this.f1070k = rect2;
            return rect2;
        }

        /* renamed from: j */
        public final int mo1234j() {
            if (!this.f1072m) {
                mo1224c();
            }
            return this.f1073n;
        }

        /* renamed from: k */
        public final int mo1235k() {
            return this.f1051A;
        }

        /* renamed from: l */
        public final int mo1236l() {
            return this.f1052B;
        }

        /* renamed from: m */
        public final int mo1237m() {
            if (this.f1077r) {
                return this.f1078s;
            }
            m1799r();
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f1078s = opacity;
            this.f1077r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo1238n() {
            this.f1077r = false;
            this.f1079t = false;
        }

        /* renamed from: o */
        public final boolean mo1239o() {
            return this.f1071l;
        }

        /* renamed from: p */
        public final boolean mo1240p() {
            if (this.f1079t) {
                return this.f1080u;
            }
            m1799r();
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f1080u = z;
            this.f1079t = true;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo1193q() {
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f1084y = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo1223b(int i, int i2) {
            int i3 = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f1085z = i;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1220b() {
            this.f1084y = false;
        }

        /* renamed from: b */
        public final void mo1222b(boolean z) {
            this.f1068i = z;
        }

        /* renamed from: b */
        public final void mo1221b(int i) {
            this.f1051A = i;
        }

        /* renamed from: a */
        public final Drawable mo1214a(int i) {
            Drawable drawable = this.f1066g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f1065f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m1798b(((ConstantState) this.f1065f.valueAt(indexOfKey)).newDrawable(this.f1061b));
                    this.f1066g[i] = b;
                    this.f1065f.removeAt(indexOfKey);
                    if (this.f1065f.size() == 0) {
                        this.f1065f = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final void mo1225c(int i) {
            this.f1052B = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1217a(Resources resources) {
            if (resources != null) {
                this.f1061b = resources;
                int a = C0327b.m1783a(resources, this.f1062c);
                int i = this.f1062c;
                this.f1062c = a;
                if (i != a) {
                    this.f1072m = false;
                    this.f1069j = false;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(21)
        /* renamed from: a */
        public final void mo1216a(Theme theme) {
            if (theme != null) {
                m1799r();
                int i = this.f1067h;
                Drawable[] drawableArr = this.f1066g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f1064e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo1217a(theme.getResources());
            }
        }

        /* renamed from: a */
        public final void mo1218a(boolean z) {
            this.f1071l = z;
        }

        /* renamed from: a */
        public void mo1215a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f1066g, 0, drawableArr, 0, i);
            this.f1066g = drawableArr;
        }

        /* renamed from: a */
        public synchronized boolean mo1219a() {
            if (this.f1081v) {
                return this.f1082w;
            }
            m1799r();
            this.f1081v = true;
            int i = this.f1067h;
            Drawable[] drawableArr = this.f1066g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f1082w = false;
                    return false;
                }
            }
            this.f1082w = true;
            return true;
        }
    }

    C0327b() {
    }

    /* renamed from: d */
    private boolean mo1303d() {
        if (!isAutoMirrored() || C0892a.m5157e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1201a(int r9) {
        /*
            r8 = this;
            int r0 = r8.f1040R
            r1 = 0
            if (r9 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.b.a.b$c r0 = r8.f1047a
            int r0 = r0.f1052B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r8.f1037O
            if (r0 == 0) goto L_0x001b
            r0.setVisible(r1, r1)
        L_0x001b:
            android.graphics.drawable.Drawable r0 = r8.f1036N
            if (r0 == 0) goto L_0x002e
            r8.f1037O = r0
            int r0 = r8.f1040R
            r8.f1041S = r0
            androidx.appcompat.b.a.b$c r0 = r8.f1047a
            int r0 = r0.f1052B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f1045W = r0
            goto L_0x003c
        L_0x002e:
            r8.f1037O = r5
            r8.f1041S = r4
            r8.f1045W = r6
            goto L_0x003c
        L_0x0035:
            android.graphics.drawable.Drawable r0 = r8.f1036N
            if (r0 == 0) goto L_0x003c
            r0.setVisible(r1, r1)
        L_0x003c:
            if (r9 < 0) goto L_0x005c
            androidx.appcompat.b.a.b$c r0 = r8.f1047a
            int r1 = r0.f1067h
            if (r9 >= r1) goto L_0x005c
            android.graphics.drawable.Drawable r0 = r0.mo1214a(r9)
            r8.f1036N = r0
            r8.f1040R = r9
            if (r0 == 0) goto L_0x0060
            androidx.appcompat.b.a.b$c r9 = r8.f1047a
            int r9 = r9.f1051A
            if (r9 <= 0) goto L_0x0058
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f1044V = r2
        L_0x0058:
            r8.m1784a(r0)
            goto L_0x0060
        L_0x005c:
            r8.f1036N = r5
            r8.f1040R = r4
        L_0x0060:
            long r0 = r8.f1044V
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x006d
            long r0 = r8.f1045W
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
        L_0x006d:
            java.lang.Runnable r0 = r8.f1043U
            if (r0 != 0) goto L_0x0079
            androidx.appcompat.b.a.b$a r0 = new androidx.appcompat.b.a.b$a
            r0.<init>()
            r8.f1043U = r0
            goto L_0x007c
        L_0x0079:
            r8.unscheduleSelf(r0)
        L_0x007c:
            r8.mo1200a(r9)
        L_0x007f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0327b.mo1201a(int):boolean");
    }

    @RequiresApi(21)
    public void applyTheme(@C0193h0 Theme theme) {
        this.f1047a.mo1216a(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1202b(int i) {
        mo1201a(i);
    }

    /* renamed from: c */
    public void mo1149c(int i) {
        this.f1047a.f1051A = i;
    }

    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.f1047a.canApplyTheme();
    }

    public void draw(@C0193h0 Canvas canvas) {
        Drawable drawable = this.f1036N;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1037O;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f1038P;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1047a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f1047a.mo1219a()) {
            return null;
        }
        this.f1047a.f1063d = getChangingConfigurations();
        return this.f1047a;
    }

    @C0193h0
    public Drawable getCurrent() {
        return this.f1036N;
    }

    public void getHotspotBounds(@C0193h0 Rect rect) {
        Rect rect2 = this.f1048b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f1047a.mo1239o()) {
            return this.f1047a.mo1229f();
        }
        Drawable drawable = this.f1036N;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f1047a.mo1239o()) {
            return this.f1047a.mo1234j();
        }
        Drawable drawable = this.f1036N;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f1047a.mo1239o()) {
            return this.f1047a.mo1230g();
        }
        Drawable drawable = this.f1036N;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f1047a.mo1239o()) {
            return this.f1047a.mo1232h();
        }
        Drawable drawable = this.f1036N;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f1036N;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1047a.mo1237m();
    }

    @RequiresApi(21)
    public void getOutline(@C0193h0 Outline outline) {
        Drawable drawable = this.f1036N;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(@C0193h0 Rect rect) {
        boolean z;
        Rect i = this.f1047a.mo1233i();
        if (i != null) {
            rect.set(i);
            z = (i.right | ((i.left | i.top) | i.bottom)) != 0;
        } else {
            Drawable drawable = this.f1036N;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (mo1303d()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    public void invalidateDrawable(@C0193h0 Drawable drawable) {
        C0330c cVar = this.f1047a;
        if (cVar != null) {
            cVar.mo1238n();
        }
        if (drawable == this.f1036N && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f1047a.f1053C;
    }

    public boolean isStateful() {
        return this.f1047a.mo1240p();
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1037O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1037O = null;
            this.f1041S = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1036N;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1039Q) {
                this.f1036N.setAlpha(this.f1038P);
            }
        }
        if (this.f1045W != 0) {
            this.f1045W = 0;
            z = true;
        }
        if (this.f1044V != 0) {
            this.f1044V = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @C0193h0
    public Drawable mutate() {
        if (!this.f1042T && super.mutate() == this) {
            C0330c b = mo1148b();
            b.mo1193q();
            mo1144a(b);
            this.f1042T = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1037O;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1036N;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f1047a.mo1223b(i, mo1203c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1037O;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f1036N;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1037O;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1036N;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable, long j) {
        if (drawable == this.f1036N && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f1039Q || this.f1038P != i) {
            this.f1039Q = true;
            this.f1038P = i;
            Drawable drawable = this.f1036N;
            if (drawable == null) {
                return;
            }
            if (this.f1044V == 0) {
                drawable.setAlpha(i);
            } else {
                mo1200a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0330c cVar = this.f1047a;
        if (cVar.f1053C != z) {
            cVar.f1053C = z;
            Drawable drawable = this.f1036N;
            if (drawable != null) {
                C0892a.m5150a(drawable, cVar.f1053C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0330c cVar = this.f1047a;
        cVar.f1055E = true;
        if (cVar.f1054D != colorFilter) {
            cVar.f1054D = colorFilter;
            Drawable drawable = this.f1036N;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0330c cVar = this.f1047a;
        if (cVar.f1083x != z) {
            cVar.f1083x = z;
            Drawable drawable = this.f1036N;
            if (drawable != null) {
                drawable.setDither(cVar.f1083x);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f1036N;
        if (drawable != null) {
            C0892a.m5144a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f1048b;
        if (rect == null) {
            this.f1048b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f1036N;
        if (drawable != null) {
            C0892a.m5145a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0330c cVar = this.f1047a;
        cVar.f1058H = true;
        if (cVar.f1056F != colorStateList) {
            cVar.f1056F = colorStateList;
            C0892a.m5146a(this.f1036N, colorStateList);
        }
    }

    public void setTintMode(@C0193h0 Mode mode) {
        C0330c cVar = this.f1047a;
        cVar.f1059I = true;
        if (cVar.f1057G != mode) {
            cVar.f1057G = mode;
            C0892a.m5149a(this.f1036N, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1037O;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1036N;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable) {
        if (drawable == this.f1036N && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0330c mo1148b() {
        return this.f1047a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1203c() {
        return this.f1040R;
    }

    /* renamed from: d */
    public void mo1151d(int i) {
        this.f1047a.f1052B = i;
    }

    /* renamed from: a */
    private void m1784a(Drawable drawable) {
        if (this.f1046X == null) {
            this.f1046X = new C0329b();
        }
        drawable.setCallback(this.f1046X.mo1209a(drawable.getCallback()));
        try {
            if (this.f1047a.f1051A <= 0 && this.f1039Q) {
                drawable.setAlpha(this.f1038P);
            }
            if (this.f1047a.f1055E) {
                drawable.setColorFilter(this.f1047a.f1054D);
            } else {
                if (this.f1047a.f1058H) {
                    C0892a.m5146a(drawable, this.f1047a.f1056F);
                }
                if (this.f1047a.f1059I) {
                    C0892a.m5149a(drawable, this.f1047a.f1057G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1047a.f1083x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f1047a.f1053C);
            }
            Rect rect = this.f1048b;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1046X.mo1208a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1200a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1039Q = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1036N
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f1044V
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f1038P
            r3.setAlpha(r9)
            r13.f1044V = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.b.a.b$c r9 = r13.f1047a
            int r9 = r9.f1051A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f1038P
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f1044V = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f1037O
            if (r9 == 0) goto L_0x0068
            long r10 = r13.f1045W
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x006a
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0055
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f1037O = r0
            r0 = -1
            r13.f1041S = r0
            r13.f1045W = r7
            goto L_0x006a
        L_0x0055:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.b.a.b$c r4 = r13.f1047a
            int r4 = r4.f1052B
            int r3 = r3 / r4
            int r4 = r13.f1038P
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x006b
        L_0x0068:
            r13.f1045W = r7
        L_0x006a:
            r0 = r3
        L_0x006b:
            if (r14 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0077
            java.lang.Runnable r14 = r13.f1043U
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p008b.p009a.C0327b.mo1200a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1199a(Resources resources) {
        this.f1047a.mo1217a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1141a() {
        this.f1047a.mo1220b();
        this.f1042T = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1144a(C0330c cVar) {
        this.f1047a = cVar;
        int i = this.f1040R;
        if (i >= 0) {
            this.f1036N = cVar.mo1214a(i);
            Drawable drawable = this.f1036N;
            if (drawable != null) {
                m1784a(drawable);
            }
        }
        this.f1041S = -1;
        this.f1037O = null;
    }

    /* renamed from: a */
    static int m1783a(@C0195i0 Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        return i == 0 ? C13959t.f40969w2 : i;
    }
}
