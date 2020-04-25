package androidx.core.p034l.p035o0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.C0721R;
import androidx.core.p034l.p035o0.C1025g.C1026a;
import androidx.core.p034l.p035o0.C1025g.C1027b;
import androidx.core.p034l.p035o0.C1025g.C1028c;
import androidx.core.p034l.p035o0.C1025g.C1029d;
import androidx.core.p034l.p035o0.C1025g.C1030e;
import androidx.core.p034l.p035o0.C1025g.C1031f;
import androidx.core.p034l.p035o0.C1025g.C1032g;
import androidx.core.p034l.p035o0.C1025g.C1033h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.l.o0.d */
/* compiled from: AccessibilityNodeInfoCompat */
public class C1016d {

    /* renamed from: A */
    public static final int f4541A = 512;

    /* renamed from: B */
    public static final int f4542B = 1024;

    /* renamed from: C */
    public static final int f4543C = 2048;

    /* renamed from: D */
    public static final int f4544D = 4096;

    /* renamed from: E */
    public static final int f4545E = 8192;

    /* renamed from: F */
    public static final int f4546F = 16384;

    /* renamed from: G */
    public static final int f4547G = 32768;

    /* renamed from: H */
    public static final int f4548H = 65536;

    /* renamed from: I */
    public static final int f4549I = 131072;

    /* renamed from: J */
    public static final int f4550J = 262144;

    /* renamed from: K */
    public static final int f4551K = 524288;

    /* renamed from: L */
    public static final int f4552L = 1048576;

    /* renamed from: M */
    public static final int f4553M = 2097152;

    /* renamed from: N */
    public static final String f4554N = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: O */
    public static final String f4555O = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: P */
    public static final String f4556P = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: Q */
    public static final String f4557Q = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: R */
    public static final String f4558R = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: S */
    public static final String f4559S = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: T */
    public static final String f4560T = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: U */
    public static final String f4561U = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: V */
    public static final String f4562V = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: W */
    public static final String f4563W = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: X */
    public static final String f4564X = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* renamed from: Y */
    public static final int f4565Y = 1;

    /* renamed from: Z */
    public static final int f4566Z = 2;

    /* renamed from: a0 */
    public static final int f4567a0 = 1;

    /* renamed from: b0 */
    public static final int f4568b0 = 2;

    /* renamed from: c0 */
    public static final int f4569c0 = 4;

    /* renamed from: d */
    private static final String f4570d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: d0 */
    public static final int f4571d0 = 8;

    /* renamed from: e */
    private static final String f4572e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: e0 */
    public static final int f4573e0 = 16;

    /* renamed from: f */
    private static final String f4574f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: f0 */
    private static int f4575f0 = 0;

    /* renamed from: g */
    private static final String f4576g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: h */
    private static final String f4577h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: i */
    private static final String f4578i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: j */
    private static final String f4579j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: k */
    private static final String f4580k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: l */
    private static final String f4581l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: m */
    private static final String f4582m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: n */
    private static final int f4583n = 1;

    /* renamed from: o */
    private static final int f4584o = 2;

    /* renamed from: p */
    private static final int f4585p = 4;

    /* renamed from: q */
    private static final int f4586q = 8;

    /* renamed from: r */
    public static final int f4587r = 1;

    /* renamed from: s */
    public static final int f4588s = 2;

    /* renamed from: t */
    public static final int f4589t = 4;

    /* renamed from: u */
    public static final int f4590u = 8;

    /* renamed from: v */
    public static final int f4591v = 16;

    /* renamed from: w */
    public static final int f4592w = 32;

    /* renamed from: x */
    public static final int f4593x = 64;

    /* renamed from: y */
    public static final int f4594y = 128;

    /* renamed from: z */
    public static final int f4595z = 256;

    /* renamed from: a */
    private final AccessibilityNodeInfo f4596a;
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public int f4597b = -1;

    /* renamed from: c */
    private int f4598c = -1;

    /* renamed from: androidx.core.l.o0.d$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C1017a {

        /* renamed from: A */
        public static final C1017a f4599A = new C1017a(1048576, null);

        /* renamed from: B */
        public static final C1017a f4600B = new C1017a(2097152, (CharSequence) null, C1033h.class);

        /* renamed from: C */
        public static final C1017a f4601C;

        /* renamed from: D */
        public static final C1017a f4602D;

        /* renamed from: E */
        public static final C1017a f4603E;

        /* renamed from: F */
        public static final C1017a f4604F;

        /* renamed from: G */
        public static final C1017a f4605G;

        /* renamed from: H */
        public static final C1017a f4606H;

        /* renamed from: I */
        public static final C1017a f4607I;

        /* renamed from: J */
        public static final C1017a f4608J;

        /* renamed from: K */
        public static final C1017a f4609K;

        /* renamed from: L */
        public static final C1017a f4610L;

        /* renamed from: M */
        public static final C1017a f4611M;

        /* renamed from: f */
        private static final String f4612f = "A11yActionCompat";

        /* renamed from: g */
        public static final C1017a f4613g = new C1017a(1, null);

        /* renamed from: h */
        public static final C1017a f4614h = new C1017a(2, null);

        /* renamed from: i */
        public static final C1017a f4615i = new C1017a(4, null);

        /* renamed from: j */
        public static final C1017a f4616j = new C1017a(8, null);

        /* renamed from: k */
        public static final C1017a f4617k = new C1017a(16, null);

        /* renamed from: l */
        public static final C1017a f4618l = new C1017a(32, null);

        /* renamed from: m */
        public static final C1017a f4619m = new C1017a(64, null);

        /* renamed from: n */
        public static final C1017a f4620n = new C1017a(128, null);

        /* renamed from: o */
        public static final C1017a f4621o;

        /* renamed from: p */
        public static final C1017a f4622p;

        /* renamed from: q */
        public static final C1017a f4623q;

        /* renamed from: r */
        public static final C1017a f4624r;

        /* renamed from: s */
        public static final C1017a f4625s = new C1017a(4096, null);

        /* renamed from: t */
        public static final C1017a f4626t = new C1017a(8192, null);

        /* renamed from: u */
        public static final C1017a f4627u = new C1017a(16384, null);

        /* renamed from: v */
        public static final C1017a f4628v = new C1017a(32768, null);

        /* renamed from: w */
        public static final C1017a f4629w = new C1017a(65536, null);

        /* renamed from: x */
        public static final C1017a f4630x = new C1017a(131072, (CharSequence) null, C1032g.class);

        /* renamed from: y */
        public static final C1017a f4631y = new C1017a(262144, null);

        /* renamed from: z */
        public static final C1017a f4632z = new C1017a(524288, null);

        /* renamed from: a */
        final Object f4633a;

        /* renamed from: b */
        private final int f4634b;

        /* renamed from: c */
        private final CharSequence f4635c;

        /* renamed from: d */
        private final Class<? extends C1026a> f4636d;
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: e */
        protected final C1025g f4637e;

        static {
            Class<C1028c> cls = C1028c.class;
            Class<C1027b> cls2 = C1027b.class;
            AccessibilityAction accessibilityAction = null;
            f4621o = new C1017a(256, (CharSequence) null, cls2);
            f4622p = new C1017a(512, (CharSequence) null, cls2);
            f4623q = new C1017a(1024, (CharSequence) null, cls);
            f4624r = new C1017a(2048, (CharSequence) null, cls);
            C1017a aVar = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            f4601C = aVar;
            C1017a aVar2 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, C1030e.class);
            f4602D = aVar2;
            C1017a aVar3 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f4603E = aVar3;
            C1017a aVar4 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f4604F = aVar4;
            C1017a aVar5 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f4605G = aVar5;
            C1017a aVar6 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f4606H = aVar6;
            C1017a aVar7 = new C1017a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f4607I = aVar7;
            C1017a aVar8 = new C1017a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C1031f.class);
            f4608J = aVar8;
            C1017a aVar9 = new C1017a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C1029d.class);
            f4609K = aVar9;
            C1017a aVar10 = new C1017a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            f4610L = aVar10;
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            C1017a aVar11 = new C1017a(accessibilityAction, 16908357, null, null, null);
            f4611M = aVar11;
        }

        public C1017a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public int mo5037a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f4633a).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence mo5040b() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f4633a).getLabel();
            }
            return null;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        public C1017a(int i, CharSequence charSequence, C1025g gVar) {
            this(null, i, charSequence, gVar, null);
        }

        C1017a(Object obj) {
            this(obj, 0, null, null, null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
        @androidx.annotation.C0207n0({androidx.annotation.C0207n0.C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5039a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.l.o0.g r0 = r4.f4637e
                r1 = 0
                if (r0 == 0) goto L_0x0042
                r0 = 0
                java.lang.Class<? extends androidx.core.l.o0.g$a> r2 = r4.f4636d
                if (r2 == 0) goto L_0x003b
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001f }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x001f }
                androidx.core.l.o0.g$a r1 = (androidx.core.p034l.p035o0.C1025g.C1026a) r1     // Catch:{ Exception -> 0x001f }
                r1.mo5112a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x003b
            L_0x001d:
                r0 = r1
                goto L_0x0020
            L_0x001f:
            L_0x0020:
                java.lang.Class<? extends androidx.core.l.o0.g$a> r6 = r4.f4636d
                if (r6 != 0) goto L_0x0027
                java.lang.String r6 = "null"
                goto L_0x002b
            L_0x0027:
                java.lang.String r6 = r6.getName()
            L_0x002b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to execute command with argument class ViewCommandArgument: "
                r1.append(r2)
                r1.append(r6)
                r1.toString()
            L_0x003b:
                androidx.core.l.o0.g r6 = r4.f4637e
                boolean r5 = r6.mo5111a(r5, r0)
                return r5
            L_0x0042:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.p034l.p035o0.C1016d.C1017a.mo5039a(android.view.View, android.os.Bundle):boolean");
        }

        private C1017a(int i, CharSequence charSequence, Class<? extends C1026a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C1017a(Object obj, int i, CharSequence charSequence, C1025g gVar, Class<? extends C1026a> cls) {
            this.f4634b = i;
            this.f4635c = charSequence;
            this.f4637e = gVar;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.f4633a = obj;
            } else {
                this.f4633a = new AccessibilityAction(i, charSequence);
            }
            this.f4636d = cls;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public C1017a mo5038a(CharSequence charSequence, C1025g gVar) {
            C1017a aVar = new C1017a(null, this.f4634b, charSequence, gVar, this.f4636d);
            return aVar;
        }
    }

    /* renamed from: androidx.core.l.o0.d$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C1018b {

        /* renamed from: b */
        public static final int f4638b = 0;

        /* renamed from: c */
        public static final int f4639c = 1;

        /* renamed from: d */
        public static final int f4640d = 2;

        /* renamed from: a */
        final Object f4641a;

        C1018b(Object obj) {
            this.f4641a = obj;
        }

        /* renamed from: a */
        public static C1018b m5960a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C1018b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C1018b(CollectionInfo.obtain(i, i2, z));
            }
            return new C1018b(null);
        }

        /* renamed from: b */
        public int mo5042b() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionInfo) this.f4641a).getRowCount();
            }
            return 0;
        }

        /* renamed from: c */
        public int mo5043c() {
            if (VERSION.SDK_INT >= 21) {
                return ((CollectionInfo) this.f4641a).getSelectionMode();
            }
            return 0;
        }

        /* renamed from: d */
        public boolean mo5044d() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionInfo) this.f4641a).isHierarchical();
            }
            return false;
        }

        /* renamed from: a */
        public static C1018b m5959a(int i, int i2, boolean z) {
            if (VERSION.SDK_INT >= 19) {
                return new C1018b(CollectionInfo.obtain(i, i2, z));
            }
            return new C1018b(null);
        }

        /* renamed from: a */
        public int mo5041a() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionInfo) this.f4641a).getColumnCount();
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.l.o0.d$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C1019c {

        /* renamed from: a */
        final Object f4642a;

        C1019c(Object obj) {
            this.f4642a = obj;
        }

        /* renamed from: a */
        public static C1019c m5966a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C1019c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C1019c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C1019c(null);
        }

        /* renamed from: b */
        public int mo5046b() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.f4642a).getColumnSpan();
            }
            return 0;
        }

        /* renamed from: c */
        public int mo5047c() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.f4642a).getRowIndex();
            }
            return 0;
        }

        /* renamed from: d */
        public int mo5048d() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.f4642a).getRowSpan();
            }
            return 0;
        }

        @Deprecated
        /* renamed from: e */
        public boolean mo5049e() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.f4642a).isHeading();
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo5050f() {
            if (VERSION.SDK_INT >= 21) {
                return ((CollectionItemInfo) this.f4642a).isSelected();
            }
            return false;
        }

        /* renamed from: a */
        public static C1019c m5965a(int i, int i2, int i3, int i4, boolean z) {
            if (VERSION.SDK_INT >= 19) {
                return new C1019c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C1019c(null);
        }

        /* renamed from: a */
        public int mo5045a() {
            if (VERSION.SDK_INT >= 19) {
                return ((CollectionItemInfo) this.f4642a).getColumnIndex();
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.l.o0.d$d */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C1020d {

        /* renamed from: b */
        public static final int f4643b = 0;

        /* renamed from: c */
        public static final int f4644c = 1;

        /* renamed from: d */
        public static final int f4645d = 2;

        /* renamed from: a */
        final Object f4646a;

        C1020d(Object obj) {
            this.f4646a = obj;
        }

        /* renamed from: a */
        public static C1020d m5973a(int i, float f, float f2, float f3) {
            if (VERSION.SDK_INT >= 19) {
                return new C1020d(RangeInfo.obtain(i, f, f2, f3));
            }
            return new C1020d(null);
        }

        /* renamed from: b */
        public float mo5052b() {
            if (VERSION.SDK_INT >= 19) {
                return ((RangeInfo) this.f4646a).getMax();
            }
            return 0.0f;
        }

        /* renamed from: c */
        public float mo5053c() {
            if (VERSION.SDK_INT >= 19) {
                return ((RangeInfo) this.f4646a).getMin();
            }
            return 0.0f;
        }

        /* renamed from: d */
        public int mo5054d() {
            if (VERSION.SDK_INT >= 19) {
                return ((RangeInfo) this.f4646a).getType();
            }
            return 0;
        }

        /* renamed from: a */
        public float mo5051a() {
            if (VERSION.SDK_INT >= 19) {
                return ((RangeInfo) this.f4646a).getCurrent();
            }
            return 0.0f;
        }
    }

    @Deprecated
    public C1016d(Object obj) {
        this.f4596a = (AccessibilityNodeInfo) obj;
    }

    /* renamed from: a */
    public static C1016d m5806a(@C0193h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1016d(accessibilityNodeInfo);
    }

    /* renamed from: c */
    static C1016d m5810c(Object obj) {
        if (obj != null) {
            return new C1016d(obj);
        }
        return null;
    }

    /* renamed from: e */
    private List<Integer> m5812e(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.f4596a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.f4596a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* renamed from: g0 */
    private void m5813g0() {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.getExtras().remove(f4579j);
            this.f4596a.getExtras().remove(f4580k);
            this.f4596a.getExtras().remove(f4581l);
            this.f4596a.getExtras().remove(f4578i);
        }
    }

    /* renamed from: h0 */
    private boolean m5814h0() {
        return !m5812e(f4579j).isEmpty();
    }

    /* renamed from: i */
    public static C1016d m5816i(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            return m5810c((Object) AccessibilityNodeInfo.obtain(view, i));
        }
        return null;
    }

    /* renamed from: i0 */
    public static C1016d m5817i0() {
        return m5806a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: k */
    public static C1016d m5820k(View view) {
        return m5806a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: k */
    private static String m5821k(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: A */
    public int mo4903A() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4596a.getTextSelectionStart();
        }
        return -1;
    }

    @C0195i0
    /* renamed from: B */
    public CharSequence mo4904B() {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return this.f4596a.getTooltipText();
        }
        if (i >= 19) {
            return this.f4596a.getExtras().getCharSequence(f4574f);
        }
        return null;
    }

    /* renamed from: C */
    public C1016d mo4905C() {
        if (VERSION.SDK_INT >= 22) {
            return m5810c((Object) this.f4596a.getTraversalAfter());
        }
        return null;
    }

    /* renamed from: D */
    public C1016d mo4906D() {
        if (VERSION.SDK_INT >= 22) {
            return m5810c((Object) this.f4596a.getTraversalBefore());
        }
        return null;
    }

    /* renamed from: E */
    public String mo4907E() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4596a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: F */
    public C1034h mo4908F() {
        if (VERSION.SDK_INT >= 21) {
            return C1034h.m6049a((Object) this.f4596a.getWindow());
        }
        return null;
    }

    /* renamed from: G */
    public int mo4909G() {
        return this.f4596a.getWindowId();
    }

    /* renamed from: H */
    public boolean mo4910H() {
        if (VERSION.SDK_INT >= 16) {
            return this.f4596a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo4911I() {
        return this.f4596a.isCheckable();
    }

    /* renamed from: J */
    public boolean mo4912J() {
        return this.f4596a.isChecked();
    }

    /* renamed from: K */
    public boolean mo4913K() {
        return this.f4596a.isClickable();
    }

    /* renamed from: L */
    public boolean mo4914L() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.isContentInvalid();
        }
        return false;
    }

    /* renamed from: M */
    public boolean mo4915M() {
        if (VERSION.SDK_INT >= 23) {
            return this.f4596a.isContextClickable();
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo4916N() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.isDismissable();
        }
        return false;
    }

    /* renamed from: O */
    public boolean mo4917O() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4596a.isEditable();
        }
        return false;
    }

    /* renamed from: P */
    public boolean mo4918P() {
        return this.f4596a.isEnabled();
    }

    /* renamed from: Q */
    public boolean mo4919Q() {
        return this.f4596a.isFocusable();
    }

    /* renamed from: R */
    public boolean mo4920R() {
        return this.f4596a.isFocused();
    }

    /* renamed from: S */
    public boolean mo4921S() {
        if (VERSION.SDK_INT >= 28) {
            return this.f4596a.isHeading();
        }
        boolean z = true;
        if (m5823l(2)) {
            return true;
        }
        C1019c g = mo4987g();
        if (g == null || !g.mo5049e()) {
            z = false;
        }
        return z;
    }

    /* renamed from: T */
    public boolean mo4922T() {
        if (VERSION.SDK_INT >= 24) {
            return this.f4596a.isImportantForAccessibility();
        }
        return true;
    }

    /* renamed from: U */
    public boolean mo4923U() {
        return this.f4596a.isLongClickable();
    }

    /* renamed from: V */
    public boolean mo4924V() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.isMultiLine();
        }
        return false;
    }

    /* renamed from: W */
    public boolean mo4925W() {
        return this.f4596a.isPassword();
    }

    /* renamed from: X */
    public boolean mo4926X() {
        if (VERSION.SDK_INT >= 28) {
            return this.f4596a.isScreenReaderFocusable();
        }
        return m5823l(1);
    }

    /* renamed from: Y */
    public boolean mo4927Y() {
        return this.f4596a.isScrollable();
    }

    /* renamed from: Z */
    public boolean mo4928Z() {
        return this.f4596a.isSelected();
    }

    /* renamed from: a0 */
    public boolean mo4943a0() {
        if (VERSION.SDK_INT >= 26) {
            return this.f4596a.isShowingHintText();
        }
        return m5823l(4);
    }

    /* renamed from: b */
    public C1016d mo4944b(int i) {
        if (VERSION.SDK_INT >= 16) {
            return m5810c((Object) this.f4596a.findFocus(i));
        }
        return null;
    }

    /* renamed from: b0 */
    public boolean mo4954b0() {
        return m5823l(8);
    }

    /* renamed from: c0 */
    public boolean mo4963c0() {
        if (VERSION.SDK_INT >= 16) {
            return this.f4596a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: d */
    public int mo4964d() {
        return this.f4596a.getChildCount();
    }

    /* renamed from: d0 */
    public void mo4971d0() {
        this.f4596a.recycle();
    }

    /* renamed from: e0 */
    public boolean mo4978e0() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4596a.refresh();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1016d.class != obj.getClass()) {
            return false;
        }
        C1016d dVar = (C1016d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4596a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f4596a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f4596a)) {
            return false;
        }
        return this.f4598c == dVar.f4598c && this.f4597b == dVar.f4597b;
    }

    /* renamed from: f */
    public void mo4982f(View view) {
        this.f4598c = -1;
        this.f4596a.setSource(view);
    }

    /* renamed from: f0 */
    public AccessibilityNodeInfo mo4986f0() {
        return this.f4596a;
    }

    /* renamed from: g */
    public C1019c mo4987g() {
        if (VERSION.SDK_INT >= 19) {
            CollectionItemInfo collectionItemInfo = this.f4596a.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                return new C1019c(collectionItemInfo);
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo4997h(CharSequence charSequence) {
        this.f4596a.setText(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4596a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: j */
    public void mo5005j(int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.setMovementGranularities(i);
        }
    }

    /* renamed from: l */
    public void mo5010l(boolean z) {
        this.f4596a.setFocused(z);
    }

    @Deprecated
    /* renamed from: m */
    public Object mo5011m() {
        return this.f4596a;
    }

    /* renamed from: n */
    public void mo5014n(boolean z) {
        if (VERSION.SDK_INT >= 24) {
            this.f4596a.setImportantForAccessibility(z);
        }
    }

    /* renamed from: o */
    public void mo5016o(boolean z) {
        this.f4596a.setLongClickable(z);
    }

    /* renamed from: p */
    public C1016d mo5017p() {
        if (VERSION.SDK_INT >= 17) {
            return m5810c((Object) this.f4596a.getLabeledBy());
        }
        return null;
    }

    /* renamed from: q */
    public void mo5020q(boolean z) {
        this.f4596a.setPassword(z);
    }

    /* renamed from: r */
    public int mo5021r() {
        if (VERSION.SDK_INT >= 21) {
            return this.f4596a.getMaxTextLength();
        }
        return -1;
    }

    /* renamed from: s */
    public int mo5023s() {
        if (VERSION.SDK_INT >= 16) {
            return this.f4596a.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: t */
    public void mo5026t(boolean z) {
        this.f4596a.setSelected(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo4932a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo4947b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo5025t());
        sb.append("; className: ");
        sb.append(mo4972e());
        sb.append("; text: ");
        sb.append(mo5035y());
        sb.append("; contentDescription: ");
        sb.append(mo4993h());
        sb.append("; viewId: ");
        sb.append(mo4907E());
        sb.append("; checkable: ");
        sb.append(mo4911I());
        sb.append("; checked: ");
        sb.append(mo4912J());
        sb.append("; focusable: ");
        sb.append(mo4919Q());
        sb.append("; focused: ");
        sb.append(mo4920R());
        sb.append("; selected: ");
        sb.append(mo4928Z());
        sb.append("; clickable: ");
        sb.append(mo4913K());
        sb.append("; longClickable: ");
        sb.append(mo4923U());
        sb.append("; enabled: ");
        sb.append(mo4918P());
        sb.append("; password: ");
        sb.append(mo4925W());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo4927Y());
        sb.append(sb4.toString());
        sb.append("; [");
        int c = mo4955c();
        while (c != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(c);
            c &= numberOfTrailingZeros ^ -1;
            sb.append(m5821k(numberOfTrailingZeros));
            if (c != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @C0195i0
    /* renamed from: u */
    public CharSequence mo5028u() {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return this.f4596a.getPaneTitle();
        }
        if (i >= 19) {
            return this.f4596a.getExtras().getCharSequence(f4572e);
        }
        return null;
    }

    /* renamed from: v */
    public C1016d mo5030v() {
        return m5810c((Object) this.f4596a.getParent());
    }

    /* renamed from: w */
    public void mo5033w(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.setVisibleToUser(z);
        }
    }

    @C0195i0
    /* renamed from: x */
    public CharSequence mo5034x() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.getExtras().getCharSequence(f4570d);
        }
        return null;
    }

    /* renamed from: y */
    public CharSequence mo5035y() {
        if (!m5814h0()) {
            return this.f4596a.getText();
        }
        List e = m5812e(f4579j);
        List e2 = m5812e(f4580k);
        List e3 = m5812e(f4581l);
        List e4 = m5812e(f4578i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4596a.getText(), 0, this.f4596a.getText().length()));
        for (int i = 0; i < e.size(); i++) {
            spannableString.setSpan(new C1008a(((Integer) e4.get(i)).intValue(), this, mo5007k().getInt(f4582m)), ((Integer) e.get(i)).intValue(), ((Integer) e2.get(i)).intValue(), ((Integer) e3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: z */
    public int mo5036z() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4596a.getTextSelectionEnd();
        }
        return -1;
    }

    /* renamed from: a */
    public static C1016d m5807a(C1016d dVar) {
        return m5806a(AccessibilityNodeInfo.obtain(dVar.f4596a));
    }

    /* renamed from: l */
    private void m5822l(View view) {
        SparseArray j = m5818j(view);
        if (j != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < j.size(); i++) {
                if (((WeakReference) j.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                j.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: c */
    public C1016d mo4956c(int i) {
        if (VERSION.SDK_INT >= 16) {
            return m5810c((Object) this.f4596a.focusSearch(i));
        }
        return null;
    }

    /* renamed from: d */
    public C1016d mo4965d(int i) {
        return m5810c((Object) this.f4596a.getChild(i));
    }

    /* renamed from: h */
    public CharSequence mo4993h() {
        return this.f4596a.getContentDescription();
    }

    /* renamed from: k */
    public void mo5008k(boolean z) {
        this.f4596a.setFocusable(z);
    }

    /* renamed from: m */
    public void mo5012m(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f4596a.setHeading(z);
        } else {
            m5808a(2, z);
        }
    }

    /* renamed from: o */
    public C1016d mo5015o() {
        if (VERSION.SDK_INT >= 17) {
            return m5810c((Object) this.f4596a.getLabelFor());
        }
        return null;
    }

    /* renamed from: q */
    public int mo5019q() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.getLiveRegion();
        }
        return 0;
    }

    /* renamed from: t */
    public CharSequence mo5025t() {
        return this.f4596a.getPackageName();
    }

    /* renamed from: v */
    public void mo5031v(boolean z) {
        m5808a(8, z);
    }

    /* renamed from: d */
    private List<CharSequence> m5811d(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList charSequenceArrayList = this.f4596a.getExtras().getCharSequenceArrayList(str);
        if (charSequenceArrayList == null) {
            charSequenceArrayList = new ArrayList();
            this.f4596a.getExtras().putCharSequenceArrayList(str, charSequenceArrayList);
        }
        return charSequenceArrayList;
    }

    /* renamed from: a */
    public void mo4933a(View view) {
        this.f4596a.addChild(view);
    }

    /* renamed from: b */
    public boolean mo4951b(View view) {
        if (VERSION.SDK_INT >= 21) {
            return this.f4596a.removeChild(view);
        }
        return false;
    }

    /* renamed from: f */
    public void mo4983f(View view, int i) {
        this.f4598c = i;
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.setSource(view, i);
        }
    }

    /* renamed from: h */
    public void mo4994h(int i) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setLiveRegion(i);
        }
    }

    /* renamed from: j */
    public void mo5006j(boolean z) {
        this.f4596a.setEnabled(z);
    }

    /* renamed from: k */
    public Bundle mo5007k() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: n */
    public int mo5013n() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.getInputType();
        }
        return 0;
    }

    /* renamed from: p */
    public void mo5018p(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setMultiLine(z);
        }
    }

    /* renamed from: r */
    public void mo5022r(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f4596a.setScreenReaderFocusable(z);
        } else {
            m5808a(1, z);
        }
    }

    /* renamed from: s */
    public void mo5024s(boolean z) {
        this.f4596a.setScrollable(z);
    }

    /* renamed from: w */
    public C1020d mo5032w() {
        if (VERSION.SDK_INT >= 19) {
            RangeInfo rangeInfo = this.f4596a.getRangeInfo();
            if (rangeInfo != null) {
                return new C1020d(rangeInfo);
            }
        }
        return null;
    }

    /* renamed from: i */
    private SparseArray<WeakReference<ClickableSpan>> m5815i(View view) {
        SparseArray<WeakReference<ClickableSpan>> j = m5818j(view);
        if (j != null) {
            return j;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0721R.C0724id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: j */
    private SparseArray<WeakReference<ClickableSpan>> m5818j(View view) {
        return (SparseArray) view.getTag(C0721R.C0724id.tag_accessibility_clickable_spans);
    }

    /* renamed from: a */
    public void mo4934a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.addChild(view, i);
        }
    }

    /* renamed from: c */
    public int mo4955c() {
        return this.f4596a.getActions();
    }

    /* renamed from: g */
    public void mo4992g(boolean z) {
        if (VERSION.SDK_INT >= 23) {
            this.f4596a.setContextClickable(z);
        }
    }

    /* renamed from: u */
    public void mo5029u(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f4596a.setShowingHintText(z);
        } else {
            m5808a(4, z);
        }
    }

    private C1016d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4596a = accessibilityNodeInfo;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public static ClickableSpan[] m5819j(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo4952b(View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.f4596a.removeChild(view, i);
        }
        return false;
    }

    /* renamed from: c */
    public void mo4957c(Rect rect) {
        this.f4596a.setBoundsInParent(rect);
    }

    /* renamed from: h */
    public void mo4995h(View view) {
        if (VERSION.SDK_INT >= 22) {
            this.f4596a.setTraversalBefore(view);
        }
    }

    /* renamed from: a */
    public void mo4930a(int i) {
        this.f4596a.addAction(i);
    }

    /* renamed from: c */
    public void mo4962c(boolean z) {
        this.f4596a.setCheckable(z);
    }

    /* renamed from: f */
    public void mo4981f(int i) {
        if (VERSION.SDK_INT >= 24) {
            this.f4596a.setDrawingOrder(i);
        }
    }

    /* renamed from: g */
    public void mo4988g(int i) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setInputType(i);
        }
    }

    /* renamed from: a */
    public void mo4935a(C1017a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f4596a.addAction((AccessibilityAction) aVar.f4633a);
        }
    }

    /* renamed from: b */
    public boolean mo4953b(C1017a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f4596a.removeAction((AccessibilityAction) aVar.f4633a);
        }
        return false;
    }

    /* renamed from: c */
    public void mo4961c(String str) {
        if (VERSION.SDK_INT >= 18) {
            this.f4596a.setViewIdResourceName(str);
        }
    }

    /* renamed from: e */
    public boolean mo4977e(int i) {
        return this.f4596a.performAction(i);
    }

    /* renamed from: h */
    public void mo4996h(View view, int i) {
        if (VERSION.SDK_INT >= 22) {
            this.f4596a.setTraversalBefore(view, i);
        }
    }

    /* renamed from: i */
    public int mo5000i() {
        if (VERSION.SDK_INT >= 24) {
            return this.f4596a.getDrawingOrder();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo4973e(View view) {
        this.f4597b = -1;
        this.f4596a.setParent(view);
    }

    /* renamed from: f */
    public C1018b mo4980f() {
        if (VERSION.SDK_INT >= 19) {
            CollectionInfo collectionInfo = this.f4596a.getCollectionInfo();
            if (collectionInfo != null) {
                return new C1018b(collectionInfo);
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo4989g(View view) {
        if (VERSION.SDK_INT >= 22) {
            this.f4596a.setTraversalAfter(view);
        }
    }

    /* renamed from: j */
    public CharSequence mo5004j() {
        if (VERSION.SDK_INT >= 21) {
            return this.f4596a.getError();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo4942a(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.f4596a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public void mo4947b(Rect rect) {
        this.f4596a.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void mo4960c(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f4596a.setError(charSequence);
        }
    }

    /* renamed from: d */
    public void mo4966d(Rect rect) {
        this.f4596a.setBoundsInScreen(rect);
    }

    /* renamed from: h */
    public void mo4998h(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setDismissable(z);
        }
    }

    /* renamed from: i */
    public void mo5001i(int i) {
        if (VERSION.SDK_INT >= 21) {
            this.f4596a.setMaxTextLength(i);
        }
    }

    @C0195i0
    /* renamed from: l */
    public CharSequence mo5009l() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.f4596a.getHintText();
        }
        if (i >= 19) {
            return this.f4596a.getExtras().getCharSequence(f4576g);
        }
        return null;
    }

    /* renamed from: b */
    public void mo4948b(CharSequence charSequence) {
        this.f4596a.setContentDescription(charSequence);
    }

    /* renamed from: d */
    public void mo4970d(boolean z) {
        this.f4596a.setChecked(z);
    }

    /* renamed from: e */
    public void mo4974e(View view, int i) {
        this.f4597b = i;
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.setParent(view, i);
        }
    }

    /* renamed from: g */
    public void mo4990g(View view, int i) {
        if (VERSION.SDK_INT >= 22) {
            this.f4596a.setTraversalAfter(view, i);
        }
    }

    /* renamed from: a */
    public List<C1016d> mo4929a(String str) {
        ArrayList arrayList = new ArrayList();
        List findAccessibilityNodeInfosByText = this.f4596a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m5806a((AccessibilityNodeInfo) findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo4949b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C1019c) obj).f4642a);
        }
    }

    /* renamed from: c */
    public void mo4958c(View view) {
        if (VERSION.SDK_INT >= 17) {
            this.f4596a.setLabelFor(view);
        }
    }

    /* renamed from: d */
    public void mo4969d(@C0195i0 CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f4596a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f4596a.getExtras().putCharSequence(f4576g, charSequence);
        }
    }

    /* renamed from: f */
    public void mo4985f(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setContentInvalid(z);
        }
    }

    /* renamed from: i */
    public void mo5003i(boolean z) {
        if (VERSION.SDK_INT >= 18) {
            this.f4596a.setEditable(z);
        }
    }

    /* renamed from: l */
    private boolean m5823l(int i) {
        Bundle k = mo5007k();
        boolean z = false;
        if (k == null) {
            return false;
        }
        if ((k.getInt(f4577h, 0) & i) == i) {
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    public void mo4991g(@C0195i0 CharSequence charSequence) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.getExtras().putCharSequence(f4570d, charSequence);
        }
    }

    /* renamed from: b */
    public List<C1017a> mo4945b() {
        List actionList = VERSION.SDK_INT >= 21 ? this.f4596a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1017a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo4959c(View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            this.f4596a.setLabelFor(view, i);
        }
    }

    /* renamed from: e */
    public void mo4976e(boolean z) {
        this.f4596a.setClickable(z);
    }

    /* renamed from: f */
    public void mo4984f(@C0195i0 CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f4596a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f4596a.getExtras().putCharSequence(f4572e, charSequence);
        }
    }

    /* renamed from: i */
    public void mo5002i(@C0195i0 CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f4596a.setTooltipText(charSequence);
        } else if (i >= 19) {
            this.f4596a.getExtras().putCharSequence(f4574f, charSequence);
        }
    }

    /* renamed from: d */
    public void mo4967d(View view) {
        if (VERSION.SDK_INT >= 17) {
            this.f4596a.setLabeledBy(view);
        }
    }

    /* renamed from: e */
    public void mo4975e(CharSequence charSequence) {
        this.f4596a.setPackageName(charSequence);
    }

    /* renamed from: e */
    public CharSequence mo4972e() {
        return this.f4596a.getClassName();
    }

    /* renamed from: a */
    public void mo4932a(Rect rect) {
        this.f4596a.getBoundsInParent(rect);
    }

    /* renamed from: d */
    public void mo4968d(View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            this.f4596a.setLabeledBy(view, i);
        }
    }

    /* renamed from: a */
    public void mo4940a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f4596a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public void mo4937a(CharSequence charSequence) {
        this.f4596a.setClassName(charSequence);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo4938a(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m5813g0();
            m5822l(view);
            ClickableSpan[] j = m5819j(charSequence);
            if (j != null && j.length > 0) {
                mo5007k().putInt(f4582m, C0721R.C0724id.accessibility_action_clickable_span);
                SparseArray i2 = m5815i(view);
                int i3 = 0;
                while (j != null && i3 < j.length) {
                    int a = m5805a(j[i3], i2);
                    i2.put(a, new WeakReference(j[i3]));
                    m5809a(j[i3], (Spanned) charSequence, a);
                    i3++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4950b(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setCanOpenPopup(z);
        }
    }

    /* renamed from: b */
    public List<C1016d> mo4946b(String str) {
        if (VERSION.SDK_INT < 18) {
            return Collections.emptyList();
        }
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f4596a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo a : findAccessibilityNodeInfosByViewId) {
            arrayList.add(m5806a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private int m5805a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f4575f0;
        f4575f0 = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    private void m5809a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m5812e(f4579j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m5812e(f4580k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m5812e(f4581l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m5812e(f4578i).add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo4939a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C1018b) obj).f4641a);
        }
    }

    /* renamed from: a */
    public void mo4936a(C1020d dVar) {
        if (VERSION.SDK_INT >= 19) {
            this.f4596a.setRangeInfo((RangeInfo) dVar.f4646a);
        }
    }

    /* renamed from: a */
    public boolean mo4941a() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4596a.canOpenPopup();
        }
        return false;
    }

    /* renamed from: a */
    public void mo4931a(int i, int i2) {
        if (VERSION.SDK_INT >= 18) {
            this.f4596a.setTextSelection(i, i2);
        }
    }

    /* renamed from: a */
    private void m5808a(int i, boolean z) {
        Bundle k = mo5007k();
        if (k != null) {
            String str = f4577h;
            int i2 = k.getInt(str, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            k.putInt(str, i | i2);
        }
    }
}
