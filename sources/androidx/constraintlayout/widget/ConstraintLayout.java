package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.solver.C0656e;
import androidx.constraintlayout.solver.p014h.C0677h;
import androidx.constraintlayout.solver.p014h.C0677h.C0680c;
import androidx.constraintlayout.solver.p014h.C0681i;
import androidx.constraintlayout.solver.p014h.C0683k;
import androidx.core.p024e.p025b.C0886a;
import java.util.ArrayList;
import java.util.HashMap;
import p053b.p063d.p064b.C2108a;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: i0 */
    static final boolean f2954i0 = false;

    /* renamed from: j0 */
    private static final boolean f2955j0 = false;

    /* renamed from: k0 */
    public static final String f2956k0 = "ConstraintLayout-1.1.3";

    /* renamed from: l0 */
    private static final String f2957l0 = "ConstraintLayout";

    /* renamed from: m0 */
    private static final boolean f2958m0 = true;

    /* renamed from: n0 */
    private static final boolean f2959n0 = false;

    /* renamed from: o0 */
    public static final int f2960o0 = 0;

    /* renamed from: N */
    private final ArrayList<C0677h> f2961N = new ArrayList<>(100);

    /* renamed from: O */
    C0681i f2962O = new C0681i();

    /* renamed from: P */
    private int f2963P = 0;

    /* renamed from: Q */
    private int f2964Q = 0;

    /* renamed from: R */
    private int f2965R = Integer.MAX_VALUE;

    /* renamed from: S */
    private int f2966S = Integer.MAX_VALUE;

    /* renamed from: T */
    private boolean f2967T = true;

    /* renamed from: U */
    private int f2968U = 7;

    /* renamed from: V */
    private C0699b f2969V = null;

    /* renamed from: W */
    private int f2970W = -1;

    /* renamed from: a */
    SparseArray<View> f2971a = new SparseArray<>();

    /* renamed from: a0 */
    private HashMap<String, Integer> f2972a0 = new HashMap<>();

    /* renamed from: b */
    private ArrayList<C0698a> f2973b = new ArrayList<>(4);

    /* renamed from: b0 */
    private int f2974b0 = -1;

    /* renamed from: c0 */
    private int f2975c0 = -1;

    /* renamed from: d0 */
    int f2976d0 = -1;

    /* renamed from: e0 */
    int f2977e0 = -1;

    /* renamed from: f0 */
    int f2978f0 = 0;

    /* renamed from: g0 */
    int f2979g0 = 0;

    /* renamed from: h0 */
    private C0656e f2980h0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0694a extends MarginLayoutParams {

        /* renamed from: A0 */
        public static final int f2981A0 = 0;

        /* renamed from: B0 */
        public static final int f2982B0 = 2;

        /* renamed from: C0 */
        public static final int f2983C0 = 0;

        /* renamed from: D0 */
        public static final int f2984D0 = 1;

        /* renamed from: E0 */
        public static final int f2985E0 = 2;

        /* renamed from: n0 */
        public static final int f2986n0 = 0;

        /* renamed from: o0 */
        public static final int f2987o0 = 0;

        /* renamed from: p0 */
        public static final int f2988p0 = -1;

        /* renamed from: q0 */
        public static final int f2989q0 = 0;

        /* renamed from: r0 */
        public static final int f2990r0 = 1;

        /* renamed from: s0 */
        public static final int f2991s0 = 1;

        /* renamed from: t0 */
        public static final int f2992t0 = 2;

        /* renamed from: u0 */
        public static final int f2993u0 = 3;

        /* renamed from: v0 */
        public static final int f2994v0 = 4;

        /* renamed from: w0 */
        public static final int f2995w0 = 5;

        /* renamed from: x0 */
        public static final int f2996x0 = 6;

        /* renamed from: y0 */
        public static final int f2997y0 = 7;

        /* renamed from: z0 */
        public static final int f2998z0 = 1;

        /* renamed from: A */
        public float f2999A = 0.5f;

        /* renamed from: B */
        public String f3000B = null;

        /* renamed from: C */
        float f3001C = 0.0f;

        /* renamed from: D */
        int f3002D = 1;

        /* renamed from: E */
        public float f3003E = -1.0f;

        /* renamed from: F */
        public float f3004F = -1.0f;

        /* renamed from: G */
        public int f3005G = 0;

        /* renamed from: H */
        public int f3006H = 0;

        /* renamed from: I */
        public int f3007I = 0;

        /* renamed from: J */
        public int f3008J = 0;

        /* renamed from: K */
        public int f3009K = 0;

        /* renamed from: L */
        public int f3010L = 0;

        /* renamed from: M */
        public int f3011M = 0;

        /* renamed from: N */
        public int f3012N = 0;

        /* renamed from: O */
        public float f3013O = 1.0f;

        /* renamed from: P */
        public float f3014P = 1.0f;

        /* renamed from: Q */
        public int f3015Q = -1;

        /* renamed from: R */
        public int f3016R = -1;

        /* renamed from: S */
        public int f3017S = -1;

        /* renamed from: T */
        public boolean f3018T = false;

        /* renamed from: U */
        public boolean f3019U = false;

        /* renamed from: V */
        boolean f3020V = true;

        /* renamed from: W */
        boolean f3021W = true;

        /* renamed from: X */
        boolean f3022X = false;

        /* renamed from: Y */
        boolean f3023Y = false;

        /* renamed from: Z */
        boolean f3024Z = false;

        /* renamed from: a */
        public int f3025a = -1;

        /* renamed from: a0 */
        boolean f3026a0 = false;

        /* renamed from: b */
        public int f3027b = -1;

        /* renamed from: b0 */
        int f3028b0 = -1;

        /* renamed from: c */
        public float f3029c = -1.0f;

        /* renamed from: c0 */
        int f3030c0 = -1;

        /* renamed from: d */
        public int f3031d = -1;

        /* renamed from: d0 */
        int f3032d0 = -1;

        /* renamed from: e */
        public int f3033e = -1;

        /* renamed from: e0 */
        int f3034e0 = -1;

        /* renamed from: f */
        public int f3035f = -1;

        /* renamed from: f0 */
        int f3036f0 = -1;

        /* renamed from: g */
        public int f3037g = -1;

        /* renamed from: g0 */
        int f3038g0 = -1;

        /* renamed from: h */
        public int f3039h = -1;

        /* renamed from: h0 */
        float f3040h0 = 0.5f;

        /* renamed from: i */
        public int f3041i = -1;

        /* renamed from: i0 */
        int f3042i0;

        /* renamed from: j */
        public int f3043j = -1;

        /* renamed from: j0 */
        int f3044j0;

        /* renamed from: k */
        public int f3045k = -1;

        /* renamed from: k0 */
        float f3046k0;

        /* renamed from: l */
        public int f3047l = -1;

        /* renamed from: l0 */
        C0677h f3048l0 = new C0677h();

        /* renamed from: m */
        public int f3049m = -1;

        /* renamed from: m0 */
        public boolean f3050m0 = false;

        /* renamed from: n */
        public int f3051n = 0;

        /* renamed from: o */
        public float f3052o = 0.0f;

        /* renamed from: p */
        public int f3053p = -1;

        /* renamed from: q */
        public int f3054q = -1;

        /* renamed from: r */
        public int f3055r = -1;

        /* renamed from: s */
        public int f3056s = -1;

        /* renamed from: t */
        public int f3057t = -1;

        /* renamed from: u */
        public int f3058u = -1;

        /* renamed from: v */
        public int f3059v = -1;

        /* renamed from: w */
        public int f3060w = -1;

        /* renamed from: x */
        public int f3061x = -1;

        /* renamed from: y */
        public int f3062y = -1;

        /* renamed from: z */
        public float f3063z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        private static class C0695a {

            /* renamed from: A */
            public static final int f3064A = 26;

            /* renamed from: B */
            public static final int f3065B = 27;

            /* renamed from: C */
            public static final int f3066C = 28;

            /* renamed from: D */
            public static final int f3067D = 29;

            /* renamed from: E */
            public static final int f3068E = 30;

            /* renamed from: F */
            public static final int f3069F = 31;

            /* renamed from: G */
            public static final int f3070G = 32;

            /* renamed from: H */
            public static final int f3071H = 33;

            /* renamed from: I */
            public static final int f3072I = 34;

            /* renamed from: J */
            public static final int f3073J = 35;

            /* renamed from: K */
            public static final int f3074K = 36;

            /* renamed from: L */
            public static final int f3075L = 37;

            /* renamed from: M */
            public static final int f3076M = 38;

            /* renamed from: N */
            public static final int f3077N = 39;

            /* renamed from: O */
            public static final int f3078O = 40;

            /* renamed from: P */
            public static final int f3079P = 41;

            /* renamed from: Q */
            public static final int f3080Q = 42;

            /* renamed from: R */
            public static final int f3081R = 43;

            /* renamed from: S */
            public static final int f3082S = 44;

            /* renamed from: T */
            public static final int f3083T = 45;

            /* renamed from: U */
            public static final int f3084U = 46;

            /* renamed from: V */
            public static final int f3085V = 47;

            /* renamed from: W */
            public static final int f3086W = 48;

            /* renamed from: X */
            public static final int f3087X = 49;

            /* renamed from: Y */
            public static final int f3088Y = 50;

            /* renamed from: Z */
            public static final SparseIntArray f3089Z = new SparseIntArray();

            /* renamed from: a */
            public static final int f3090a = 0;

            /* renamed from: b */
            public static final int f3091b = 1;

            /* renamed from: c */
            public static final int f3092c = 2;

            /* renamed from: d */
            public static final int f3093d = 3;

            /* renamed from: e */
            public static final int f3094e = 4;

            /* renamed from: f */
            public static final int f3095f = 5;

            /* renamed from: g */
            public static final int f3096g = 6;

            /* renamed from: h */
            public static final int f3097h = 7;

            /* renamed from: i */
            public static final int f3098i = 8;

            /* renamed from: j */
            public static final int f3099j = 9;

            /* renamed from: k */
            public static final int f3100k = 10;

            /* renamed from: l */
            public static final int f3101l = 11;

            /* renamed from: m */
            public static final int f3102m = 12;

            /* renamed from: n */
            public static final int f3103n = 13;

            /* renamed from: o */
            public static final int f3104o = 14;

            /* renamed from: p */
            public static final int f3105p = 15;

            /* renamed from: q */
            public static final int f3106q = 16;

            /* renamed from: r */
            public static final int f3107r = 17;

            /* renamed from: s */
            public static final int f3108s = 18;

            /* renamed from: t */
            public static final int f3109t = 19;

            /* renamed from: u */
            public static final int f3110u = 20;

            /* renamed from: v */
            public static final int f3111v = 21;

            /* renamed from: w */
            public static final int f3112w = 22;

            /* renamed from: x */
            public static final int f3113x = 23;

            /* renamed from: y */
            public static final int f3114y = 24;

            /* renamed from: z */
            public static final int f3115z = 25;

            static {
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f3089Z.append(C0696R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private C0695a() {
            }
        }

        public C0694a(C0694a aVar) {
            super(aVar);
            this.f3025a = aVar.f3025a;
            this.f3027b = aVar.f3027b;
            this.f3029c = aVar.f3029c;
            this.f3031d = aVar.f3031d;
            this.f3033e = aVar.f3033e;
            this.f3035f = aVar.f3035f;
            this.f3037g = aVar.f3037g;
            this.f3039h = aVar.f3039h;
            this.f3041i = aVar.f3041i;
            this.f3043j = aVar.f3043j;
            this.f3045k = aVar.f3045k;
            this.f3047l = aVar.f3047l;
            this.f3049m = aVar.f3049m;
            this.f3051n = aVar.f3051n;
            this.f3052o = aVar.f3052o;
            this.f3053p = aVar.f3053p;
            this.f3054q = aVar.f3054q;
            this.f3055r = aVar.f3055r;
            this.f3056s = aVar.f3056s;
            this.f3057t = aVar.f3057t;
            this.f3058u = aVar.f3058u;
            this.f3059v = aVar.f3059v;
            this.f3060w = aVar.f3060w;
            this.f3061x = aVar.f3061x;
            this.f3062y = aVar.f3062y;
            this.f3063z = aVar.f3063z;
            this.f2999A = aVar.f2999A;
            this.f3000B = aVar.f3000B;
            this.f3001C = aVar.f3001C;
            this.f3002D = aVar.f3002D;
            this.f3003E = aVar.f3003E;
            this.f3004F = aVar.f3004F;
            this.f3005G = aVar.f3005G;
            this.f3006H = aVar.f3006H;
            this.f3018T = aVar.f3018T;
            this.f3019U = aVar.f3019U;
            this.f3007I = aVar.f3007I;
            this.f3008J = aVar.f3008J;
            this.f3009K = aVar.f3009K;
            this.f3011M = aVar.f3011M;
            this.f3010L = aVar.f3010L;
            this.f3012N = aVar.f3012N;
            this.f3013O = aVar.f3013O;
            this.f3014P = aVar.f3014P;
            this.f3015Q = aVar.f3015Q;
            this.f3016R = aVar.f3016R;
            this.f3017S = aVar.f3017S;
            this.f3020V = aVar.f3020V;
            this.f3021W = aVar.f3021W;
            this.f3022X = aVar.f3022X;
            this.f3023Y = aVar.f3023Y;
            this.f3028b0 = aVar.f3028b0;
            this.f3030c0 = aVar.f3030c0;
            this.f3032d0 = aVar.f3032d0;
            this.f3034e0 = aVar.f3034e0;
            this.f3036f0 = aVar.f3036f0;
            this.f3038g0 = aVar.f3038g0;
            this.f3040h0 = aVar.f3040h0;
            this.f3048l0 = aVar.f3048l0;
        }

        /* renamed from: a */
        public void mo3827a() {
            C0677h hVar = this.f3048l0;
            if (hVar != null) {
                hVar.mo3674k0();
            }
        }

        /* renamed from: b */
        public void mo3828b() {
            this.f3023Y = false;
            this.f3020V = true;
            this.f3021W = true;
            if (this.width == -2 && this.f3018T) {
                this.f3020V = false;
                this.f3007I = 1;
            }
            if (this.height == -2 && this.f3019U) {
                this.f3021W = false;
                this.f3008J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f3020V = false;
                if (this.width == 0 && this.f3007I == 1) {
                    this.width = -2;
                    this.f3018T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f3021W = false;
                if (this.height == 0 && this.f3008J == 1) {
                    this.height = -2;
                    this.f3019U = true;
                }
            }
            if (this.f3029c != -1.0f || this.f3025a != -1 || this.f3027b != -1) {
                this.f3023Y = true;
                this.f3020V = true;
                this.f3021W = true;
                if (!(this.f3048l0 instanceof C0683k)) {
                    this.f3048l0 = new C0683k();
                }
                ((C0683k) this.f3048l0).mo3739D(this.f3017S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f3032d0 = r7
                r6.f3034e0 = r7
                r6.f3028b0 = r7
                r6.f3030c0 = r7
                r6.f3036f0 = r7
                r6.f3038g0 = r7
                int r2 = r6.f3057t
                r6.f3036f0 = r2
                int r2 = r6.f3059v
                r6.f3038g0 = r2
                float r2 = r6.f3063z
                r6.f3040h0 = r2
                int r2 = r6.f3025a
                r6.f3042i0 = r2
                int r2 = r6.f3027b
                r6.f3044j0 = r2
                float r2 = r6.f3029c
                r6.f3046k0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x009a
                int r2 = r6.f3053p
                if (r2 == r7) goto L_0x0041
                r6.f3032d0 = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f3054q
                if (r2 == r7) goto L_0x0048
                r6.f3034e0 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f3055r
                if (r2 == r7) goto L_0x004f
                r6.f3030c0 = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.f3056s
                if (r2 == r7) goto L_0x0056
                r6.f3028b0 = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.f3061x
                if (r2 == r7) goto L_0x005c
                r6.f3038g0 = r2
            L_0x005c:
                int r2 = r6.f3062y
                if (r2 == r7) goto L_0x0062
                r6.f3036f0 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f3063z
                float r3 = r2 - r3
                r6.f3040h0 = r3
            L_0x006c:
                boolean r3 = r6.f3023Y
                if (r3 == 0) goto L_0x00be
                int r3 = r6.f3017S
                if (r3 != r4) goto L_0x00be
                float r3 = r6.f3029c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f3046k0 = r2
                r6.f3042i0 = r7
                r6.f3044j0 = r7
                goto L_0x00be
            L_0x0084:
                int r2 = r6.f3025a
                if (r2 == r7) goto L_0x008f
                r6.f3044j0 = r2
                r6.f3042i0 = r7
                r6.f3046k0 = r4
                goto L_0x00be
            L_0x008f:
                int r2 = r6.f3027b
                if (r2 == r7) goto L_0x00be
                r6.f3042i0 = r2
                r6.f3044j0 = r7
                r6.f3046k0 = r4
                goto L_0x00be
            L_0x009a:
                int r2 = r6.f3053p
                if (r2 == r7) goto L_0x00a0
                r6.f3030c0 = r2
            L_0x00a0:
                int r2 = r6.f3054q
                if (r2 == r7) goto L_0x00a6
                r6.f3028b0 = r2
            L_0x00a6:
                int r2 = r6.f3055r
                if (r2 == r7) goto L_0x00ac
                r6.f3032d0 = r2
            L_0x00ac:
                int r2 = r6.f3056s
                if (r2 == r7) goto L_0x00b2
                r6.f3034e0 = r2
            L_0x00b2:
                int r2 = r6.f3061x
                if (r2 == r7) goto L_0x00b8
                r6.f3036f0 = r2
            L_0x00b8:
                int r2 = r6.f3062y
                if (r2 == r7) goto L_0x00be
                r6.f3038g0 = r2
            L_0x00be:
                int r2 = r6.f3055r
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f3056s
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f3054q
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f3053p
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f3035f
                if (r2 == r7) goto L_0x00dd
                r6.f3032d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
                goto L_0x00eb
            L_0x00dd:
                int r2 = r6.f3037g
                if (r2 == r7) goto L_0x00eb
                r6.f3034e0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
            L_0x00eb:
                int r1 = r6.f3031d
                if (r1 == r7) goto L_0x00fa
                r6.f3028b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
                goto L_0x0108
            L_0x00fa:
                int r1 = r6.f3033e
                if (r1 == r7) goto L_0x0108
                r6.f3030c0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0694a.resolveLayoutDirection(int):void");
        }

        public C0694a(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (C0695a.f3089Z.get(index)) {
                    case 1:
                        this.f3017S = obtainStyledAttributes.getInt(index, this.f3017S);
                        break;
                    case 2:
                        this.f3049m = obtainStyledAttributes.getResourceId(index, this.f3049m);
                        if (this.f3049m != -1) {
                            break;
                        } else {
                            this.f3049m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f3051n = obtainStyledAttributes.getDimensionPixelSize(index, this.f3051n);
                        break;
                    case 4:
                        this.f3052o = obtainStyledAttributes.getFloat(index, this.f3052o) % 360.0f;
                        float f = this.f3052o;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f3052o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f3025a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3025a);
                        break;
                    case 6:
                        this.f3027b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3027b);
                        break;
                    case 7:
                        this.f3029c = obtainStyledAttributes.getFloat(index, this.f3029c);
                        break;
                    case 8:
                        this.f3031d = obtainStyledAttributes.getResourceId(index, this.f3031d);
                        if (this.f3031d != -1) {
                            break;
                        } else {
                            this.f3031d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f3033e = obtainStyledAttributes.getResourceId(index, this.f3033e);
                        if (this.f3033e != -1) {
                            break;
                        } else {
                            this.f3033e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f3035f = obtainStyledAttributes.getResourceId(index, this.f3035f);
                        if (this.f3035f != -1) {
                            break;
                        } else {
                            this.f3035f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f3037g = obtainStyledAttributes.getResourceId(index, this.f3037g);
                        if (this.f3037g != -1) {
                            break;
                        } else {
                            this.f3037g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f3039h = obtainStyledAttributes.getResourceId(index, this.f3039h);
                        if (this.f3039h != -1) {
                            break;
                        } else {
                            this.f3039h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f3041i = obtainStyledAttributes.getResourceId(index, this.f3041i);
                        if (this.f3041i != -1) {
                            break;
                        } else {
                            this.f3041i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f3043j = obtainStyledAttributes.getResourceId(index, this.f3043j);
                        if (this.f3043j != -1) {
                            break;
                        } else {
                            this.f3043j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f3045k = obtainStyledAttributes.getResourceId(index, this.f3045k);
                        if (this.f3045k != -1) {
                            break;
                        } else {
                            this.f3045k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f3047l = obtainStyledAttributes.getResourceId(index, this.f3047l);
                        if (this.f3047l != -1) {
                            break;
                        } else {
                            this.f3047l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f3053p = obtainStyledAttributes.getResourceId(index, this.f3053p);
                        if (this.f3053p != -1) {
                            break;
                        } else {
                            this.f3053p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f3054q = obtainStyledAttributes.getResourceId(index, this.f3054q);
                        if (this.f3054q != -1) {
                            break;
                        } else {
                            this.f3054q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f3055r = obtainStyledAttributes.getResourceId(index, this.f3055r);
                        if (this.f3055r != -1) {
                            break;
                        } else {
                            this.f3055r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f3056s = obtainStyledAttributes.getResourceId(index, this.f3056s);
                        if (this.f3056s != -1) {
                            break;
                        } else {
                            this.f3056s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f3057t = obtainStyledAttributes.getDimensionPixelSize(index, this.f3057t);
                        break;
                    case 22:
                        this.f3058u = obtainStyledAttributes.getDimensionPixelSize(index, this.f3058u);
                        break;
                    case 23:
                        this.f3059v = obtainStyledAttributes.getDimensionPixelSize(index, this.f3059v);
                        break;
                    case 24:
                        this.f3060w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3060w);
                        break;
                    case 25:
                        this.f3061x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3061x);
                        break;
                    case 26:
                        this.f3062y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3062y);
                        break;
                    case 27:
                        this.f3018T = obtainStyledAttributes.getBoolean(index, this.f3018T);
                        break;
                    case 28:
                        this.f3019U = obtainStyledAttributes.getBoolean(index, this.f3019U);
                        break;
                    case 29:
                        this.f3063z = obtainStyledAttributes.getFloat(index, this.f3063z);
                        break;
                    case 30:
                        this.f2999A = obtainStyledAttributes.getFloat(index, this.f2999A);
                        break;
                    case 31:
                        this.f3007I = obtainStyledAttributes.getInt(index, 0);
                        int i3 = this.f3007I;
                        break;
                    case 32:
                        this.f3008J = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.f3008J;
                        break;
                    case 33:
                        try {
                            this.f3009K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3009K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f3009K) != -2) {
                                break;
                            } else {
                                this.f3009K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f3011M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3011M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f3011M) != -2) {
                                break;
                            } else {
                                this.f3011M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f3013O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3013O));
                        break;
                    case 36:
                        try {
                            this.f3010L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3010L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f3010L) != -2) {
                                break;
                            } else {
                                this.f3010L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f3012N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3012N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f3012N) != -2) {
                                break;
                            } else {
                                this.f3012N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f3014P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3014P));
                        break;
                    case 44:
                        this.f3000B = obtainStyledAttributes.getString(index);
                        this.f3001C = Float.NaN;
                        this.f3002D = -1;
                        String str = this.f3000B;
                        if (str == null) {
                            break;
                        } else {
                            int length = str.length();
                            int indexOf = this.f3000B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f3000B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase(C2108a.f8103N4)) {
                                    this.f3002D = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f3002D = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f3000B.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.f3000B.substring(i, indexOf2);
                                String substring3 = this.f3000B.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f3002D != 1) {
                                                this.f3001C = Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                this.f3001C = Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.f3000B.substring(i);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    this.f3001C = Float.parseFloat(substring4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 45:
                        this.f3003E = obtainStyledAttributes.getFloat(index, this.f3003E);
                        break;
                    case 46:
                        this.f3004F = obtainStyledAttributes.getFloat(index, this.f3004F);
                        break;
                    case 47:
                        this.f3005G = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.f3006H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.f3015Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3015Q);
                        break;
                    case 50:
                        this.f3016R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3016R);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            mo3828b();
        }

        public C0694a(int i, int i2) {
            super(i, i2);
        }

        public C0694a(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m3989a((AttributeSet) null);
    }

    /* renamed from: b */
    private void m3991b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f2961N.clear();
            m3987a();
        }
    }

    /* renamed from: c */
    private void m3993c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0704d) {
                ((C0704d) childAt).mo3922a(this);
            }
        }
        int size = this.f2973b.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((C0698a) this.f2973b.get(i2)).mo3839b(this);
            }
        }
    }

    /* renamed from: a */
    public void mo3799a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2972a0 == null) {
                this.f2972a0 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2972a0.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0694a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(C0886a.f4059c);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.f2966S;
    }

    public int getMaxWidth() {
        return this.f2965R;
    }

    public int getMinHeight() {
        return this.f2964Q;
    }

    public int getMinWidth() {
        return this.f2963P;
    }

    public int getOptimizationLevel() {
        return this.f2962O.mo3726w0();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0694a aVar = (C0694a) childAt.getLayoutParams();
            C0677h hVar = aVar.f3048l0;
            if ((childAt.getVisibility() != 8 || aVar.f3023Y || aVar.f3024Z || isInEditMode) && !aVar.f3026a0) {
                int o = hVar.mo3683o();
                int p = hVar.mo3685p();
                int U = hVar.mo3593U() + o;
                int q = hVar.mo3688q() + p;
                childAt.layout(o, p, U, q);
                if (childAt instanceof C0704d) {
                    View content = ((C0704d) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(o, p, U, q);
                    }
                }
            }
        }
        int size = this.f2973b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((C0698a) this.f2973b.get(i6)).mo3830a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r25)
            int r4 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = android.view.View.MeasureSpec.getMode(r26)
            int r6 = android.view.View.MeasureSpec.getSize(r26)
            int r7 = r24.getPaddingLeft()
            int r8 = r24.getPaddingTop()
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            r9.mo3705x(r7)
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            r9.mo3707y(r8)
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            int r10 = r0.f2965R
            r9.mo3686p(r10)
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            int r10 = r0.f2966S
            r9.mo3684o(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 0
            r11 = 1
            r12 = 17
            if (r9 < r12) goto L_0x004f
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            int r12 = r24.getLayoutDirection()
            if (r12 != r11) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            r9.mo3722c(r12)
        L_0x004f:
            r24.m3994c(r25, r26)
            androidx.constraintlayout.solver.h.i r9 = r0.f2962O
            int r9 = r9.mo3593U()
            androidx.constraintlayout.solver.h.i r12 = r0.f2962O
            int r12 = r12.mo3688q()
            boolean r13 = r0.f2967T
            if (r13 == 0) goto L_0x0069
            r0.f2967T = r10
            r24.m3991b()
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            int r14 = r0.f2968U
            r15 = 8
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x0084
            androidx.constraintlayout.solver.h.i r15 = r0.f2962O
            r15.mo3715G0()
            androidx.constraintlayout.solver.h.i r15 = r0.f2962O
            r15.mo3724i(r9, r12)
            r24.m3992b(r25, r26)
            goto L_0x0087
        L_0x0084:
            r24.m3988a(r25, r26)
        L_0x0087:
            r24.m3993c()
            int r15 = r24.getChildCount()
            if (r15 <= 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            androidx.constraintlayout.solver.p014h.C0663a.m3635a(r13)
        L_0x0097:
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            boolean r15 = r13.f2854p1
            if (r15 == 0) goto L_0x00c9
            boolean r15 = r13.f2855q1
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x00b3
            if (r3 != r11) goto L_0x00b3
            int r15 = r13.f2857s1
            if (r15 >= r4) goto L_0x00ac
            r13.mo3699u(r15)
        L_0x00ac:
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r15 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r13.mo3617a(r15)
        L_0x00b3:
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            boolean r15 = r13.f2856r1
            if (r15 == 0) goto L_0x00c9
            if (r5 != r11) goto L_0x00c9
            int r11 = r13.f2858t1
            if (r11 >= r6) goto L_0x00c2
            r13.mo3679m(r11)
        L_0x00c2:
            androidx.constraintlayout.solver.h.i r11 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r13 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r11.mo3631b(r13)
        L_0x00c9:
            int r11 = r0.f2968U
            r13 = 32
            r11 = r11 & r13
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x011d
            androidx.constraintlayout.solver.h.i r11 = r0.f2962O
            int r11 = r11.mo3593U()
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            int r13 = r13.mo3688q()
            int r10 = r0.f2974b0
            if (r10 == r11) goto L_0x00ec
            if (r3 != r15) goto L_0x00ec
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            java.util.List<androidx.constraintlayout.solver.h.j> r3 = r3.f2853o1
            r10 = 0
            androidx.constraintlayout.solver.p014h.C0663a.m3637a(r3, r10, r11)
        L_0x00ec:
            int r3 = r0.f2975c0
            if (r3 == r13) goto L_0x00fa
            if (r5 != r15) goto L_0x00fa
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            java.util.List<androidx.constraintlayout.solver.h.j> r3 = r3.f2853o1
            r5 = 1
            androidx.constraintlayout.solver.p014h.C0663a.m3637a(r3, r5, r13)
        L_0x00fa:
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            boolean r5 = r3.f2855q1
            if (r5 == 0) goto L_0x010b
            int r5 = r3.f2857s1
            if (r5 <= r4) goto L_0x010b
            java.util.List<androidx.constraintlayout.solver.h.j> r3 = r3.f2853o1
            r10 = 0
            androidx.constraintlayout.solver.p014h.C0663a.m3637a(r3, r10, r4)
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            boolean r4 = r3.f2856r1
            if (r4 == 0) goto L_0x011d
            int r4 = r3.f2858t1
            if (r4 <= r6) goto L_0x011d
            java.util.List<androidx.constraintlayout.solver.h.j> r3 = r3.f2853o1
            r4 = 1
            androidx.constraintlayout.solver.p014h.C0663a.m3637a(r3, r4, r6)
            goto L_0x011e
        L_0x011d:
            r4 = 1
        L_0x011e:
            int r3 = r24.getChildCount()
            if (r3 <= 0) goto L_0x0129
            java.lang.String r3 = "First pass"
            r0.mo3801a(r3)
        L_0x0129:
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r3 = r0.f2961N
            int r3 = r3.size()
            int r5 = r24.getPaddingBottom()
            int r8 = r8 + r5
            int r5 = r24.getPaddingRight()
            int r7 = r7 + r5
            if (r3 <= 0) goto L_0x035b
            androidx.constraintlayout.solver.h.i r6 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r6 = r6.mo3698u()
            androidx.constraintlayout.solver.h.h$c r11 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r6 != r11) goto L_0x0147
            r6 = 1
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            androidx.constraintlayout.solver.h.i r11 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r11 = r11.mo3591S()
            androidx.constraintlayout.solver.h.h$c r13 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r11 != r13) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            int r13 = r13.mo3593U()
            int r4 = r0.f2963P
            int r4 = java.lang.Math.max(r13, r4)
            androidx.constraintlayout.solver.h.i r13 = r0.f2962O
            int r13 = r13.mo3688q()
            int r10 = r0.f2964Q
            int r10 = java.lang.Math.max(r13, r10)
            r13 = r4
            r5 = r10
            r4 = 0
            r10 = 0
            r17 = 0
        L_0x0173:
            r18 = 1
            if (r4 >= r3) goto L_0x02b4
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r15 = r0.f2961N
            java.lang.Object r15 = r15.get(r4)
            androidx.constraintlayout.solver.h.h r15 = (androidx.constraintlayout.solver.p014h.C0677h) r15
            java.lang.Object r20 = r15.mo3654f()
            r21 = r3
            r3 = r20
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0193
            r20 = r9
            r23 = r10
            r22 = r12
            goto L_0x02a0
        L_0x0193:
            android.view.ViewGroup$LayoutParams r20 = r3.getLayoutParams()
            r22 = r12
            r12 = r20
            androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.C0694a) r12
            r20 = r9
            boolean r9 = r12.f3024Z
            if (r9 != 0) goto L_0x029e
            boolean r9 = r12.f3023Y
            if (r9 == 0) goto L_0x01a9
            goto L_0x029e
        L_0x01a9:
            int r9 = r3.getVisibility()
            r23 = r10
            r10 = 8
            if (r9 != r10) goto L_0x01b5
        L_0x01b3:
            goto L_0x02a0
        L_0x01b5:
            if (r14 == 0) goto L_0x01cc
            androidx.constraintlayout.solver.h.p r9 = r15.mo3582I()
            boolean r9 = r9.mo3779d()
            if (r9 == 0) goto L_0x01cc
            androidx.constraintlayout.solver.h.p r9 = r15.mo3581H()
            boolean r9 = r9.mo3779d()
            if (r9 == 0) goto L_0x01cc
            goto L_0x01b3
        L_0x01cc:
            int r9 = r12.width
            r10 = -2
            if (r9 != r10) goto L_0x01dc
            boolean r9 = r12.f3020V
            if (r9 == 0) goto L_0x01dc
            int r9 = r12.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r9)
            goto L_0x01e6
        L_0x01dc:
            int r9 = r15.mo3593U()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
        L_0x01e6:
            int r10 = r12.height
            r1 = -2
            if (r10 != r1) goto L_0x01f6
            boolean r1 = r12.f3021W
            if (r1 == 0) goto L_0x01f6
            int r1 = r12.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r8, r1)
            goto L_0x0200
        L_0x01f6:
            int r1 = r15.mo3688q()
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x0200:
            r3.measure(r9, r1)
            androidx.constraintlayout.solver.e r1 = r0.f2980h0
            if (r1 == 0) goto L_0x020d
            long r9 = r1.f2611b
            long r9 = r9 + r18
            r1.f2611b = r9
        L_0x020d:
            int r1 = r3.getMeasuredWidth()
            int r9 = r3.getMeasuredHeight()
            int r10 = r15.mo3593U()
            if (r1 == r10) goto L_0x0244
            r15.mo3699u(r1)
            if (r14 == 0) goto L_0x0227
            androidx.constraintlayout.solver.h.p r10 = r15.mo3582I()
            r10.mo3773a(r1)
        L_0x0227:
            if (r6 == 0) goto L_0x0242
            int r1 = r15.mo3583J()
            if (r1 <= r13) goto L_0x0242
            int r1 = r15.mo3583J()
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            androidx.constraintlayout.solver.h.e r10 = r15.mo3599a(r10)
            int r10 = r10.mo3536c()
            int r1 = r1 + r10
            int r13 = java.lang.Math.max(r13, r1)
        L_0x0242:
            r23 = 1
        L_0x0244:
            int r1 = r15.mo3688q()
            if (r9 == r1) goto L_0x0274
            r15.mo3679m(r9)
            if (r14 == 0) goto L_0x0256
            androidx.constraintlayout.solver.h.p r1 = r15.mo3581H()
            r1.mo3773a(r9)
        L_0x0256:
            if (r11 == 0) goto L_0x0272
            int r1 = r15.mo3649e()
            if (r1 <= r5) goto L_0x0272
            int r1 = r15.mo3649e()
            androidx.constraintlayout.solver.h.e$d r9 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e r9 = r15.mo3599a(r9)
            int r9 = r9.mo3536c()
            int r1 = r1 + r9
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r1
        L_0x0272:
            r23 = 1
        L_0x0274:
            boolean r1 = r12.f3022X
            if (r1 == 0) goto L_0x028a
            int r1 = r3.getBaseline()
            r9 = -1
            if (r1 == r9) goto L_0x028a
            int r9 = r15.mo3643d()
            if (r1 == r9) goto L_0x028a
            r15.mo3659g(r1)
            r23 = 1
        L_0x028a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r1 < r9) goto L_0x029b
            int r1 = r3.getMeasuredState()
            r3 = r17
            int r17 = android.view.ViewGroup.combineMeasuredStates(r3, r1)
            goto L_0x02a4
        L_0x029b:
            r3 = r17
            goto L_0x02a4
        L_0x029e:
            r23 = r10
        L_0x02a0:
            r3 = r17
            r17 = r3
        L_0x02a4:
            r10 = r23
            int r4 = r4 + 1
            r1 = r25
            r9 = r20
            r3 = r21
            r12 = r22
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0173
        L_0x02b4:
            r21 = r3
            r20 = r9
            r23 = r10
            r22 = r12
            r3 = r17
            if (r23 == 0) goto L_0x0303
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            r4 = r20
            r1.mo3699u(r4)
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            r4 = r22
            r1.mo3679m(r4)
            if (r14 == 0) goto L_0x02d5
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            r1.mo3717I0()
        L_0x02d5:
            java.lang.String r1 = "2nd pass"
            r0.mo3801a(r1)
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            int r1 = r1.mo3593U()
            if (r1 >= r13) goto L_0x02e9
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            r1.mo3699u(r13)
            r11 = 1
            goto L_0x02ea
        L_0x02e9:
            r11 = 0
        L_0x02ea:
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            int r1 = r1.mo3688q()
            if (r1 >= r5) goto L_0x02fa
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            r1.mo3679m(r5)
            r16 = 1
            goto L_0x02fc
        L_0x02fa:
            r16 = r11
        L_0x02fc:
            if (r16 == 0) goto L_0x0303
            java.lang.String r1 = "3rd pass"
            r0.mo3801a(r1)
        L_0x0303:
            r1 = r21
            r4 = 0
        L_0x0306:
            if (r4 >= r1) goto L_0x035c
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r5 = r0.f2961N
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.solver.h.h r5 = (androidx.constraintlayout.solver.p014h.C0677h) r5
            java.lang.Object r6 = r5.mo3654f()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x031d
        L_0x0318:
            r10 = 8
        L_0x031a:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0358
        L_0x031d:
            int r9 = r6.getMeasuredWidth()
            int r10 = r5.mo3593U()
            if (r9 != r10) goto L_0x0331
            int r9 = r6.getMeasuredHeight()
            int r10 = r5.mo3688q()
            if (r9 == r10) goto L_0x0318
        L_0x0331:
            int r9 = r5.mo3592T()
            r10 = 8
            if (r9 == r10) goto L_0x031a
            int r9 = r5.mo3593U()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r5 = r5.mo3688q()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            r6.measure(r9, r5)
            androidx.constraintlayout.solver.e r5 = r0.f2980h0
            if (r5 == 0) goto L_0x0358
            long r12 = r5.f2611b
            long r12 = r12 + r18
            r5.f2611b = r12
        L_0x0358:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x035b:
            r3 = 0
        L_0x035c:
            androidx.constraintlayout.solver.h.i r1 = r0.f2962O
            int r1 = r1.mo3593U()
            int r1 = r1 + r7
            androidx.constraintlayout.solver.h.i r4 = r0.f2962O
            int r4 = r4.mo3688q()
            int r4 = r4 + r8
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r5 < r6) goto L_0x03a9
            r5 = r25
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r5, r3)
            int r3 = r3 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r4, r2, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f2965R
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f2966S
            int r2 = java.lang.Math.min(r3, r2)
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            boolean r3 = r3.mo3712D0()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0398
            r1 = r1 | r4
        L_0x0398:
            androidx.constraintlayout.solver.h.i r3 = r0.f2962O
            boolean r3 = r3.mo3710B0()
            if (r3 == 0) goto L_0x03a1
            r2 = r2 | r4
        L_0x03a1:
            r0.setMeasuredDimension(r1, r2)
            r0.f2974b0 = r1
            r0.f2975c0 = r2
            goto L_0x03b0
        L_0x03a9:
            r0.setMeasuredDimension(r1, r4)
            r0.f2974b0 = r1
            r0.f2975c0 = r4
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0677h a = mo3797a(view);
        if ((view instanceof Guideline) && !(a instanceof C0683k)) {
            C0694a aVar = (C0694a) view.getLayoutParams();
            aVar.f3048l0 = new C0683k();
            aVar.f3023Y = true;
            ((C0683k) aVar.f3048l0).mo3739D(aVar.f3017S);
        }
        if (view instanceof C0698a) {
            C0698a aVar2 = (C0698a) view;
            aVar2.mo3838a();
            ((C0694a) view.getLayoutParams()).f3024Z = true;
            if (!this.f2973b.contains(aVar2)) {
                this.f2973b.add(aVar2);
            }
        }
        this.f2971a.put(view.getId(), view);
        this.f2967T = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2971a.remove(view.getId());
        C0677h a = mo3797a(view);
        this.f2962O.mo3788g(a);
        this.f2973b.remove(view);
        this.f2961N.remove(a);
        this.f2967T = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2967T = true;
        this.f2974b0 = -1;
        this.f2975c0 = -1;
        this.f2976d0 = -1;
        this.f2977e0 = -1;
        this.f2978f0 = 0;
        this.f2979g0 = 0;
    }

    public void setConstraintSet(C0699b bVar) {
        this.f2969V = bVar;
    }

    public void setId(int i) {
        this.f2971a.remove(getId());
        super.setId(i);
        this.f2971a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2966S) {
            this.f2966S = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2965R) {
            this.f2965R = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2964Q) {
            this.f2964Q = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2963P) {
            this.f2963P = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2962O.mo3709A(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C0694a generateDefaultLayoutParams() {
        return new C0694a(-2, -2);
    }

    public C0694a generateLayoutParams(AttributeSet attributeSet) {
        return new C0694a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0694a(layoutParams);
    }

    /* renamed from: b */
    private final C0677h m3990b(int i) {
        C0677h hVar;
        if (i == 0) {
            return this.f2962O;
        }
        View view = (View) this.f2971a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f2962O;
        }
        if (view == null) {
            hVar = null;
        } else {
            hVar = ((C0694a) view.getLayoutParams()).f3048l0;
        }
        return hVar;
    }

    /* renamed from: c */
    private void m3994c(int i, int i2) {
        C0680c cVar;
        int i3;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0680c cVar2 = C0680c.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                cVar = C0680c.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                cVar = cVar2;
            } else {
                i3 = Math.min(this.f2965R, size) - paddingLeft;
                cVar = cVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            cVar = C0680c.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                cVar2 = C0680c.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f2966S, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            cVar2 = C0680c.WRAP_CONTENT;
        }
        this.f2962O.mo3692r(0);
        this.f2962O.mo3689q(0);
        this.f2962O.mo3617a(cVar);
        this.f2962O.mo3699u(i3);
        this.f2962O.mo3631b(cVar2);
        this.f2962O.mo3679m(size2);
        this.f2962O.mo3692r((this.f2963P - getPaddingLeft()) - getPaddingRight());
        this.f2962O.mo3689q((this.f2964Q - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    public Object mo3798a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2972a0;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f2972a0.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m3989a(AttributeSet attributeSet) {
        this.f2962O.mo3620a((Object) this);
        this.f2971a.put(getId(), this);
        this.f2969V = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0696R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f2963P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2963P);
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f2964Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2964Q);
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2965R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2965R);
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2966S = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2966S);
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2968U = obtainStyledAttributes.getInt(index, this.f2968U);
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f2969V = new C0699b();
                        this.f2969V.mo3868b(getContext(), resourceId);
                    } catch (NotFoundException unused) {
                        this.f2969V = null;
                    }
                    this.f2970W = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2962O.mo3709A(this.f2968U);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ca  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3992b(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00dc
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 != r10) goto L_0x0030
            goto L_0x00d4
        L_0x0030:
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r10 = (androidx.constraintlayout.widget.ConstraintLayout.C0694a) r10
            androidx.constraintlayout.solver.h.h r15 = r10.f3048l0
            boolean r6 = r10.f3023Y
            if (r6 != 0) goto L_0x00d4
            boolean r6 = r10.f3024Z
            if (r6 == 0) goto L_0x0042
            goto L_0x00d4
        L_0x0042:
            int r6 = r14.getVisibility()
            r15.mo3696t(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c4
            if (r13 != 0) goto L_0x0053
            goto L_0x00c4
        L_0x0053:
            if (r6 != r12) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            androidx.constraintlayout.solver.e r11 = r0.f2980h0
            r12 = r3
            if (r11 == 0) goto L_0x0076
            long r2 = r11.f2610a
            long r2 = r2 + r8
            r11.f2610a = r2
        L_0x0076:
            r2 = -2
            if (r6 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            r15.mo3634b(r3)
            if (r13 != r2) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            r15.mo3622a(r2)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.mo3699u(r2)
            r15.mo3679m(r3)
            if (r16 == 0) goto L_0x009a
            r15.mo3703w(r2)
        L_0x009a:
            if (r17 == 0) goto L_0x009f
            r15.mo3701v(r3)
        L_0x009f:
            boolean r6 = r10.f3022X
            if (r6 == 0) goto L_0x00ad
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00ad
            r15.mo3659g(r6)
        L_0x00ad:
            boolean r6 = r10.f3020V
            if (r6 == 0) goto L_0x00d5
            boolean r6 = r10.f3021W
            if (r6 == 0) goto L_0x00d5
            androidx.constraintlayout.solver.h.p r6 = r15.mo3582I()
            r6.mo3773a(r2)
            androidx.constraintlayout.solver.h.p r2 = r15.mo3581H()
            r2.mo3773a(r3)
            goto L_0x00d5
        L_0x00c4:
            r12 = r3
            androidx.constraintlayout.solver.h.p r2 = r15.mo3582I()
            r2.mo3777b()
            androidx.constraintlayout.solver.h.p r2 = r15.mo3581H()
            r2.mo3777b()
            goto L_0x00d5
        L_0x00d4:
            r12 = r3
        L_0x00d5:
            int r7 = r7 + 1
            r2 = r25
            r3 = r12
            goto L_0x001d
        L_0x00dc:
            r12 = r3
            androidx.constraintlayout.solver.h.i r2 = r0.f2962O
            r2.mo3717I0()
            r2 = 0
        L_0x00e3:
            if (r2 >= r5) goto L_0x02e0
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 != r10) goto L_0x00f1
            goto L_0x02cc
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.C0694a) r6
            androidx.constraintlayout.solver.h.h r7 = r6.f3048l0
            boolean r11 = r6.f3023Y
            if (r11 != 0) goto L_0x02cc
            boolean r11 = r6.f3024Z
            if (r11 == 0) goto L_0x0103
            goto L_0x02cc
        L_0x0103:
            int r11 = r3.getVisibility()
            r7.mo3696t(r11)
            int r11 = r6.width
            int r13 = r6.height
            if (r11 == 0) goto L_0x0114
            if (r13 == 0) goto L_0x0114
            goto L_0x02cc
        L_0x0114:
            androidx.constraintlayout.solver.h.e$d r14 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            androidx.constraintlayout.solver.h.e r14 = r7.mo3599a(r14)
            androidx.constraintlayout.solver.h.o r14 = r14.mo3542g()
            androidx.constraintlayout.solver.h.e$d r15 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            androidx.constraintlayout.solver.h.e r15 = r7.mo3599a(r15)
            androidx.constraintlayout.solver.h.o r15 = r15.mo3542g()
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            androidx.constraintlayout.solver.h.e r10 = r7.mo3599a(r10)
            androidx.constraintlayout.solver.h.e r10 = r10.mo3546k()
            if (r10 == 0) goto L_0x0142
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            androidx.constraintlayout.solver.h.e r10 = r7.mo3599a(r10)
            androidx.constraintlayout.solver.h.e r10 = r10.mo3546k()
            if (r10 == 0) goto L_0x0142
            r10 = 1
            goto L_0x0143
        L_0x0142:
            r10 = 0
        L_0x0143:
            androidx.constraintlayout.solver.h.e$d r8 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            androidx.constraintlayout.solver.h.e r8 = r7.mo3599a(r8)
            androidx.constraintlayout.solver.h.o r8 = r8.mo3542g()
            androidx.constraintlayout.solver.h.e$d r9 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e r9 = r7.mo3599a(r9)
            androidx.constraintlayout.solver.h.o r9 = r9.mo3542g()
            r17 = r5
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            androidx.constraintlayout.solver.h.e r5 = r7.mo3599a(r5)
            androidx.constraintlayout.solver.h.e r5 = r5.mo3546k()
            if (r5 == 0) goto L_0x0173
            androidx.constraintlayout.solver.h.e$d r5 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e r5 = r7.mo3599a(r5)
            androidx.constraintlayout.solver.h.e r5 = r5.mo3546k()
            if (r5 == 0) goto L_0x0173
            r5 = 1
            goto L_0x0174
        L_0x0173:
            r5 = 0
        L_0x0174:
            if (r11 != 0) goto L_0x0186
            if (r13 != 0) goto L_0x0186
            if (r10 == 0) goto L_0x0186
            if (r5 == 0) goto L_0x0186
            r5 = r25
            r20 = r2
            r3 = -1
            r10 = -2
            r18 = 1
            goto L_0x02d6
        L_0x0186:
            r20 = r2
            androidx.constraintlayout.solver.h.i r2 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r2 = r2.mo3698u()
            r21 = r6
            androidx.constraintlayout.solver.h.h$c r6 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r2 == r6) goto L_0x0196
            r6 = 1
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            androidx.constraintlayout.solver.h.i r2 = r0.f2962O
            androidx.constraintlayout.solver.h.h$c r2 = r2.mo3591S()
            androidx.constraintlayout.solver.h.h$c r0 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.WRAP_CONTENT
            if (r2 == r0) goto L_0x01a3
            r0 = 1
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            if (r6 != 0) goto L_0x01ad
            androidx.constraintlayout.solver.h.p r2 = r7.mo3582I()
            r2.mo3777b()
        L_0x01ad:
            if (r0 != 0) goto L_0x01b6
            androidx.constraintlayout.solver.h.p r2 = r7.mo3581H()
            r2.mo3777b()
        L_0x01b6:
            if (r11 != 0) goto L_0x01ee
            if (r6 == 0) goto L_0x01e5
            boolean r2 = r7.mo3668i0()
            if (r2 == 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e5
            boolean r2 = r14.mo3779d()
            if (r2 == 0) goto L_0x01e5
            boolean r2 = r15.mo3779d()
            if (r2 == 0) goto L_0x01e5
            float r2 = r15.mo3770g()
            float r10 = r14.mo3770g()
            float r2 = r2 - r10
            int r11 = (int) r2
            androidx.constraintlayout.solver.h.p r2 = r7.mo3582I()
            r2.mo3773a(r11)
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r2
            goto L_0x01f6
        L_0x01e5:
            r2 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r2)
            r14 = r6
            r2 = 1
            r6 = 0
            goto L_0x0202
        L_0x01ee:
            r2 = -2
            r10 = -1
            if (r11 != r10) goto L_0x01f8
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
        L_0x01f6:
            r2 = 0
            goto L_0x0202
        L_0x01f8:
            if (r11 != r2) goto L_0x01fc
            r2 = 1
            goto L_0x01fd
        L_0x01fc:
            r2 = 0
        L_0x01fd:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r10
        L_0x0202:
            if (r13 != 0) goto L_0x023e
            if (r0 == 0) goto L_0x0234
            boolean r10 = r7.mo3665h0()
            if (r10 == 0) goto L_0x0234
            if (r5 == 0) goto L_0x0234
            boolean r5 = r8.mo3779d()
            if (r5 == 0) goto L_0x0234
            boolean r5 = r9.mo3779d()
            if (r5 == 0) goto L_0x0234
            float r5 = r9.mo3770g()
            float r8 = r8.mo3770g()
            float r5 = r5 - r8
            int r13 = (int) r5
            androidx.constraintlayout.solver.h.p r5 = r7.mo3581H()
            r5.mo3773a(r13)
            r5 = r25
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r9 = r0
            r0 = r8
            goto L_0x024a
        L_0x0234:
            r5 = r25
            r8 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r8)
            r8 = 1
            r9 = 0
            goto L_0x025a
        L_0x023e:
            r5 = r25
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x024c
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r9)
            r9 = r0
            r0 = r10
        L_0x024a:
            r8 = 0
            goto L_0x025a
        L_0x024c:
            if (r13 != r8) goto L_0x0250
            r8 = 1
            goto L_0x0251
        L_0x0250:
            r8 = 0
        L_0x0251:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r22 = r9
            r9 = r0
            r0 = r22
        L_0x025a:
            r3.measure(r14, r0)
            r0 = r23
            androidx.constraintlayout.solver.e r10 = r0.f2980h0
            if (r10 == 0) goto L_0x026c
            long r14 = r10.f2610a
            r18 = 1
            long r14 = r14 + r18
            r10.f2610a = r14
            goto L_0x026e
        L_0x026c:
            r18 = 1
        L_0x026e:
            r10 = -2
            if (r11 != r10) goto L_0x0273
            r11 = 1
            goto L_0x0274
        L_0x0273:
            r11 = 0
        L_0x0274:
            r7.mo3634b(r11)
            if (r13 != r10) goto L_0x027b
            r11 = 1
            goto L_0x027c
        L_0x027b:
            r11 = 0
        L_0x027c:
            r7.mo3622a(r11)
            int r11 = r3.getMeasuredWidth()
            int r13 = r3.getMeasuredHeight()
            r7.mo3699u(r11)
            r7.mo3679m(r13)
            if (r2 == 0) goto L_0x0292
            r7.mo3703w(r11)
        L_0x0292:
            if (r8 == 0) goto L_0x0297
            r7.mo3701v(r13)
        L_0x0297:
            if (r6 == 0) goto L_0x02a1
            androidx.constraintlayout.solver.h.p r2 = r7.mo3582I()
            r2.mo3773a(r11)
            goto L_0x02a8
        L_0x02a1:
            androidx.constraintlayout.solver.h.p r2 = r7.mo3582I()
            r2.mo3774g()
        L_0x02a8:
            if (r9 == 0) goto L_0x02b2
            androidx.constraintlayout.solver.h.p r2 = r7.mo3581H()
            r2.mo3773a(r13)
            goto L_0x02b9
        L_0x02b2:
            androidx.constraintlayout.solver.h.p r2 = r7.mo3581H()
            r2.mo3774g()
        L_0x02b9:
            r6 = r21
            boolean r2 = r6.f3022X
            if (r2 == 0) goto L_0x02ca
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02d6
            r7.mo3659g(r2)
            goto L_0x02d6
        L_0x02ca:
            r3 = -1
            goto L_0x02d6
        L_0x02cc:
            r20 = r2
            r17 = r5
            r18 = r8
            r3 = -1
            r10 = -2
            r5 = r25
        L_0x02d6:
            int r2 = r20 + 1
            r5 = r17
            r8 = r18
            r10 = 8
            goto L_0x00e3
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m3992b(int, int):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3989a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3987a() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.isInEditMode()
            int r2 = r26.getChildCount()
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0048
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0048
            android.view.View r6 = r0.getChildAt(r5)
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            r0.mo3799a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0045 }
            r8 = 47
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            if (r8 == r4) goto L_0x003a
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x003a:
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            androidx.constraintlayout.solver.h.h r6 = r0.m3990b(r6)     // Catch:{ NotFoundException -> 0x0045 }
            r6.mo3621a(r7)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 >= r2) goto L_0x005c
            android.view.View r6 = r0.getChildAt(r5)
            androidx.constraintlayout.solver.h.h r6 = r0.mo3797a(r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.mo3674k0()
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x005c:
            int r5 = r0.f2970W
            if (r5 == r4) goto L_0x007e
            r5 = 0
        L_0x0061:
            if (r5 >= r2) goto L_0x007e
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getId()
            int r8 = r0.f2970W
            if (r7 != r8) goto L_0x007b
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.C0702c
            if (r7 == 0) goto L_0x007b
            androidx.constraintlayout.widget.c r6 = (androidx.constraintlayout.widget.C0702c) r6
            androidx.constraintlayout.widget.b r6 = r6.getConstraintSet()
            r0.f2969V = r6
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0061
        L_0x007e:
            androidx.constraintlayout.widget.b r5 = r0.f2969V
            if (r5 == 0) goto L_0x0085
            r5.mo3869b(r0)
        L_0x0085:
            androidx.constraintlayout.solver.h.i r5 = r0.f2962O
            r5.mo3790u0()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r5 = r0.f2973b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a3
            r6 = 0
        L_0x0093:
            if (r6 >= r5) goto L_0x00a3
            java.util.ArrayList<androidx.constraintlayout.widget.a> r7 = r0.f2973b
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.a r7 = (androidx.constraintlayout.widget.C0698a) r7
            r7.mo3831c(r0)
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 >= r2) goto L_0x00b6
            android.view.View r6 = r0.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.C0704d
            if (r7 == 0) goto L_0x00b3
            androidx.constraintlayout.widget.d r6 = (androidx.constraintlayout.widget.C0704d) r6
            r6.mo3923b(r0)
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 >= r2) goto L_0x03e5
            android.view.View r6 = r0.getChildAt(r5)
            androidx.constraintlayout.solver.h.h r13 = r0.mo3797a(r6)
            if (r13 != 0) goto L_0x00c5
            goto L_0x03e1
        L_0x00c5:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r14 = r7
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0694a) r14
            r14.mo3828b()
            boolean r7 = r14.f3050m0
            if (r7 == 0) goto L_0x00d6
            r14.f3050m0 = r3
            goto L_0x0108
        L_0x00d6:
            if (r1 == 0) goto L_0x0108
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r0.mo3799a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r8 = "id/"
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            androidx.constraintlayout.solver.h.h r8 = r0.m3990b(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r8.mo3621a(r7)     // Catch:{ NotFoundException -> 0x0107 }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            int r7 = r6.getVisibility()
            r13.mo3696t(r7)
            boolean r7 = r14.f3026a0
            if (r7 == 0) goto L_0x0118
            r7 = 8
            r13.mo3696t(r7)
        L_0x0118:
            r13.mo3620a(r6)
            androidx.constraintlayout.solver.h.i r6 = r0.f2962O
            r6.mo3787f(r13)
            boolean r6 = r14.f3021W
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.f3020V
            if (r6 != 0) goto L_0x012d
        L_0x0128:
            java.util.ArrayList<androidx.constraintlayout.solver.h.h> r6 = r0.f2961N
            r6.add(r13)
        L_0x012d:
            boolean r6 = r14.f3023Y
            r7 = 17
            if (r6 == 0) goto L_0x015e
            androidx.constraintlayout.solver.h.k r13 = (androidx.constraintlayout.solver.p014h.C0683k) r13
            int r6 = r14.f3042i0
            int r8 = r14.f3044j0
            float r9 = r14.f3046k0
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 >= r7) goto L_0x0145
            int r6 = r14.f3025a
            int r8 = r14.f3027b
            float r9 = r14.f3029c
        L_0x0145:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0150
            r13.mo3741e(r9)
            goto L_0x03e1
        L_0x0150:
            if (r6 == r4) goto L_0x0157
            r13.mo3511z(r6)
            goto L_0x03e1
        L_0x0157:
            if (r8 == r4) goto L_0x03e1
            r13.mo3734A(r8)
            goto L_0x03e1
        L_0x015e:
            int r6 = r14.f3031d
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3033e
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3035f
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3037g
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3054q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3053p
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3055r
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3056s
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3039h
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3041i
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3043j
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3045k
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3047l
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3015Q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3016R
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f3049m
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.width
            if (r6 == r4) goto L_0x01a6
            int r6 = r14.height
            if (r6 != r4) goto L_0x03e1
        L_0x01a6:
            int r6 = r14.f3028b0
            int r8 = r14.f3030c0
            int r9 = r14.f3032d0
            int r10 = r14.f3034e0
            int r11 = r14.f3036f0
            int r12 = r14.f3038g0
            float r15 = r14.f3040h0
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r7) goto L_0x01f7
            int r3 = r14.f3031d
            int r6 = r14.f3033e
            int r9 = r14.f3035f
            int r10 = r14.f3037g
            int r7 = r14.f3057t
            int r8 = r14.f3059v
            float r15 = r14.f3063z
            if (r3 != r4) goto L_0x01d9
            if (r6 != r4) goto L_0x01d9
            int r11 = r14.f3054q
            if (r11 == r4) goto L_0x01d4
            r25 = r11
            r11 = r6
            r6 = r25
            goto L_0x01db
        L_0x01d4:
            int r11 = r14.f3053p
            if (r11 == r4) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r6
        L_0x01da:
            r6 = r3
        L_0x01db:
            if (r9 != r4) goto L_0x01f2
            if (r10 != r4) goto L_0x01f2
            int r3 = r14.f3055r
            if (r3 == r4) goto L_0x01e7
            r12 = r7
            r16 = r8
            goto L_0x01fc
        L_0x01e7:
            int r3 = r14.f3056s
            if (r3 == r4) goto L_0x01f2
            r12 = r7
            r16 = r8
            r10 = r15
            r15 = r3
            r3 = r9
            goto L_0x0201
        L_0x01f2:
            r12 = r7
            r16 = r8
            r3 = r9
            goto L_0x01fc
        L_0x01f7:
            r3 = r9
            r16 = r12
            r12 = r11
            r11 = r8
        L_0x01fc:
            r25 = r15
            r15 = r10
            r10 = r25
        L_0x0201:
            int r7 = r14.f3049m
            if (r7 == r4) goto L_0x0214
            androidx.constraintlayout.solver.h.h r3 = r0.m3990b(r7)
            if (r3 == 0) goto L_0x0331
            float r6 = r14.f3052o
            int r7 = r14.f3051n
            r13.mo3619a(r3, r6, r7)
            goto L_0x0331
        L_0x0214:
            if (r6 == r4) goto L_0x022c
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r6)
            if (r9 == 0) goto L_0x0229
            androidx.constraintlayout.solver.h.e$d r6 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            int r11 = r14.leftMargin
            r7 = r13
            r8 = r6
            r17 = r10
            r10 = r6
            r7.mo3610a(r8, r9, r10, r11, r12)
            goto L_0x0240
        L_0x0229:
            r17 = r10
            goto L_0x0240
        L_0x022c:
            r17 = r10
            if (r11 == r4) goto L_0x0240
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r11)
            if (r9 == 0) goto L_0x0240
            androidx.constraintlayout.solver.h.e$d r8 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            int r11 = r14.leftMargin
            r7 = r13
            r7.mo3610a(r8, r9, r10, r11, r12)
        L_0x0240:
            if (r3 == r4) goto L_0x0255
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r3)
            if (r9 == 0) goto L_0x0268
            androidx.constraintlayout.solver.h.e$d r8 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            int r11 = r14.rightMargin
            r7 = r13
            r12 = r16
            r7.mo3610a(r8, r9, r10, r11, r12)
            goto L_0x0268
        L_0x0255:
            if (r15 == r4) goto L_0x0268
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r15)
            if (r9 == 0) goto L_0x0268
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            int r11 = r14.rightMargin
            r7 = r13
            r8 = r10
            r12 = r16
            r7.mo3610a(r8, r9, r10, r11, r12)
        L_0x0268:
            int r3 = r14.f3039h
            if (r3 == r4) goto L_0x027e
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r3)
            if (r9 == 0) goto L_0x0294
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            int r11 = r14.topMargin
            int r12 = r14.f3058u
            r7 = r13
            r8 = r10
            r7.mo3610a(r8, r9, r10, r11, r12)
            goto L_0x0294
        L_0x027e:
            int r3 = r14.f3041i
            if (r3 == r4) goto L_0x0294
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r3)
            if (r9 == 0) goto L_0x0294
            androidx.constraintlayout.solver.h.e$d r8 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            int r11 = r14.topMargin
            int r12 = r14.f3058u
            r7 = r13
            r7.mo3610a(r8, r9, r10, r11, r12)
        L_0x0294:
            int r3 = r14.f3043j
            if (r3 == r4) goto L_0x02ab
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r3)
            if (r9 == 0) goto L_0x02c0
            androidx.constraintlayout.solver.h.e$d r8 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            int r11 = r14.bottomMargin
            int r12 = r14.f3060w
            r7 = r13
            r7.mo3610a(r8, r9, r10, r11, r12)
            goto L_0x02c0
        L_0x02ab:
            int r3 = r14.f3045k
            if (r3 == r4) goto L_0x02c0
            androidx.constraintlayout.solver.h.h r9 = r0.m3990b(r3)
            if (r9 == 0) goto L_0x02c0
            androidx.constraintlayout.solver.h.e$d r10 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            int r11 = r14.bottomMargin
            int r12 = r14.f3060w
            r7 = r13
            r8 = r10
            r7.mo3610a(r8, r9, r10, r11, r12)
        L_0x02c0:
            int r3 = r14.f3047l
            if (r3 == r4) goto L_0x0314
            android.util.SparseArray<android.view.View> r6 = r0.f2971a
            java.lang.Object r3 = r6.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r6 = r14.f3047l
            androidx.constraintlayout.solver.h.h r6 = r0.m3990b(r6)
            if (r6 == 0) goto L_0x0314
            if (r3 == 0) goto L_0x0314
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0694a
            if (r7 == 0) goto L_0x0314
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0694a) r3
            r7 = 1
            r14.f3022X = r7
            r3.f3022X = r7
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BASELINE
            androidx.constraintlayout.solver.h.e r18 = r13.mo3599a(r3)
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BASELINE
            androidx.constraintlayout.solver.h.e r19 = r6.mo3599a(r3)
            r20 = 0
            r21 = -1
            androidx.constraintlayout.solver.h.e$c r22 = androidx.constraintlayout.solver.p014h.C0667e.C0670c.STRONG
            r23 = 0
            r24 = 1
            r18.mo3529a(r19, r20, r21, r22, r23, r24)
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            r3.mo3551p()
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            r3.mo3551p()
        L_0x0314:
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r15 = r17
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0324
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0324
            r13.mo3600a(r15)
        L_0x0324:
            float r7 = r14.f2999A
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0331
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0331
            r13.mo3638c(r7)
        L_0x0331:
            if (r1 == 0) goto L_0x0342
            int r3 = r14.f3015Q
            if (r3 != r4) goto L_0x033b
            int r3 = r14.f3016R
            if (r3 == r4) goto L_0x0342
        L_0x033b:
            int r3 = r14.f3015Q
            int r6 = r14.f3016R
            r13.mo3656f(r3, r6)
        L_0x0342:
            boolean r3 = r14.f3020V
            if (r3 != 0) goto L_0x036e
            int r3 = r14.width
            if (r3 != r4) goto L_0x0364
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_PARENT
            r13.mo3617a(r3)
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.LEFT
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            int r6 = r14.leftMargin
            r3.f2699e = r6
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.RIGHT
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            int r6 = r14.rightMargin
            r3.f2699e = r6
            goto L_0x0378
        L_0x0364:
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            r13.mo3617a(r3)
            r3 = 0
            r13.mo3699u(r3)
            goto L_0x0378
        L_0x036e:
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r13.mo3617a(r3)
            int r3 = r14.width
            r13.mo3699u(r3)
        L_0x0378:
            boolean r3 = r14.f3021W
            if (r3 != 0) goto L_0x03a5
            int r3 = r14.height
            if (r3 != r4) goto L_0x039b
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_PARENT
            r13.mo3631b(r3)
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.TOP
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            int r6 = r14.topMargin
            r3.f2699e = r6
            androidx.constraintlayout.solver.h.e$d r3 = androidx.constraintlayout.solver.p014h.C0667e.C0671d.BOTTOM
            androidx.constraintlayout.solver.h.e r3 = r13.mo3599a(r3)
            int r6 = r14.bottomMargin
            r3.f2699e = r6
            r3 = 0
            goto L_0x03b0
        L_0x039b:
            androidx.constraintlayout.solver.h.h$c r3 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.MATCH_CONSTRAINT
            r13.mo3631b(r3)
            r3 = 0
            r13.mo3679m(r3)
            goto L_0x03b0
        L_0x03a5:
            r3 = 0
            androidx.constraintlayout.solver.h.h$c r6 = androidx.constraintlayout.solver.p014h.C0677h.C0680c.FIXED
            r13.mo3631b(r6)
            int r6 = r14.height
            r13.mo3679m(r6)
        L_0x03b0:
            java.lang.String r6 = r14.f3000B
            if (r6 == 0) goto L_0x03b7
            r13.mo3633b(r6)
        L_0x03b7:
            float r6 = r14.f3003E
            r13.mo3627b(r6)
            float r6 = r14.f3004F
            r13.mo3645d(r6)
            int r6 = r14.f3005G
            r13.mo3682n(r6)
            int r6 = r14.f3006H
            r13.mo3694s(r6)
            int r6 = r14.f3007I
            int r7 = r14.f3009K
            int r8 = r14.f3011M
            float r9 = r14.f3013O
            r13.mo3604a(r6, r7, r8, r9)
            int r6 = r14.f3008J
            int r7 = r14.f3010L
            int r8 = r14.f3012N
            float r9 = r14.f3014P
            r13.mo3629b(r6, r7, r8, r9)
        L_0x03e1:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x03e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m3987a():void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3989a(attributeSet);
    }

    /* renamed from: a */
    public final C0677h mo3797a(View view) {
        C0677h hVar;
        if (view == this) {
            return this.f2962O;
        }
        if (view == null) {
            hVar = null;
        } else {
            hVar = ((C0694a) view.getLayoutParams()).f3048l0;
        }
        return hVar;
    }

    /* renamed from: a */
    private void m3988a(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0694a aVar = (C0694a) childAt.getLayoutParams();
                C0677h hVar = aVar.f3048l0;
                if (!aVar.f3023Y && !aVar.f3024Z) {
                    hVar.mo3696t(childAt.getVisibility());
                    int i8 = aVar.width;
                    int i9 = aVar.height;
                    boolean z3 = aVar.f3020V;
                    if (z3 || aVar.f3021W || (!z3 && aVar.f3007I == 1) || aVar.width == -1 || (!aVar.f3021W && (aVar.f3008J == 1 || aVar.height == -1))) {
                        if (i8 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -2);
                            z2 = true;
                        } else if (i8 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i8 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
                            z = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -1);
                            z = false;
                        } else {
                            z = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        C0656e eVar = this.f2980h0;
                        if (eVar != null) {
                            eVar.f2610a++;
                        }
                        hVar.mo3634b(i8 == -2);
                        hVar.mo3622a(i9 == -2);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    hVar.mo3699u(i8);
                    hVar.mo3679m(i9);
                    if (z2) {
                        hVar.mo3703w(i8);
                    }
                    if (z) {
                        hVar.mo3701v(i9);
                    }
                    if (aVar.f3022X) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            hVar.mo3659g(baseline);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3800a(C0656e eVar) {
        this.f2980h0 = eVar;
        this.f2962O.mo3719a(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3801a(String str) {
        this.f2962O.mo3725t0();
        C0656e eVar = this.f2980h0;
        if (eVar != null) {
            eVar.f2612c++;
        }
    }

    /* renamed from: a */
    public View mo3796a(int i) {
        return (View) this.f2971a.get(i);
    }
}
