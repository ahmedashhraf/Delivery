package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.C0696R.C0697id;
import androidx.constraintlayout.widget.C0702c.C0703a;
import androidx.constraintlayout.widget.ConstraintLayout.C0694a;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: ConstraintSet */
public class C0699b {

    /* renamed from: A */
    private static final int[] f3122A = {0, 4, 8};

    /* renamed from: A0 */
    private static final int f3123A0 = 50;

    /* renamed from: B */
    private static final int f3124B = 1;

    /* renamed from: B0 */
    private static final int f3125B0 = 51;

    /* renamed from: C */
    private static SparseIntArray f3126C = new SparseIntArray();

    /* renamed from: C0 */
    private static final int f3127C0 = 52;

    /* renamed from: D */
    private static final int f3128D = 1;

    /* renamed from: D0 */
    private static final int f3129D0 = 53;

    /* renamed from: E */
    private static final int f3130E = 2;

    /* renamed from: E0 */
    private static final int f3131E0 = 54;

    /* renamed from: F */
    private static final int f3132F = 3;

    /* renamed from: F0 */
    private static final int f3133F0 = 55;

    /* renamed from: G */
    private static final int f3134G = 4;

    /* renamed from: G0 */
    private static final int f3135G0 = 56;

    /* renamed from: H */
    private static final int f3136H = 5;

    /* renamed from: H0 */
    private static final int f3137H0 = 57;

    /* renamed from: I */
    private static final int f3138I = 6;

    /* renamed from: I0 */
    private static final int f3139I0 = 58;

    /* renamed from: J */
    private static final int f3140J = 7;

    /* renamed from: J0 */
    private static final int f3141J0 = 59;

    /* renamed from: K */
    private static final int f3142K = 8;

    /* renamed from: K0 */
    private static final int f3143K0 = 60;

    /* renamed from: L */
    private static final int f3144L = 9;

    /* renamed from: L0 */
    private static final int f3145L0 = 61;

    /* renamed from: M */
    private static final int f3146M = 10;

    /* renamed from: M0 */
    private static final int f3147M0 = 62;

    /* renamed from: N */
    private static final int f3148N = 11;

    /* renamed from: N0 */
    private static final int f3149N0 = 63;

    /* renamed from: O */
    private static final int f3150O = 12;

    /* renamed from: O0 */
    private static final int f3151O0 = 69;

    /* renamed from: P */
    private static final int f3152P = 13;

    /* renamed from: P0 */
    private static final int f3153P0 = 70;

    /* renamed from: Q */
    private static final int f3154Q = 14;

    /* renamed from: Q0 */
    private static final int f3155Q0 = 71;

    /* renamed from: R */
    private static final int f3156R = 15;

    /* renamed from: R0 */
    private static final int f3157R0 = 72;

    /* renamed from: S */
    private static final int f3158S = 16;

    /* renamed from: S0 */
    private static final int f3159S0 = 73;

    /* renamed from: T */
    private static final int f3160T = 17;

    /* renamed from: T0 */
    private static final int f3161T0 = 74;

    /* renamed from: U */
    private static final int f3162U = 18;

    /* renamed from: U0 */
    private static final int f3163U0 = 75;

    /* renamed from: V */
    private static final int f3164V = 19;

    /* renamed from: W */
    private static final int f3165W = 20;

    /* renamed from: X */
    private static final int f3166X = 21;

    /* renamed from: Y */
    private static final int f3167Y = 22;

    /* renamed from: Z */
    private static final int f3168Z = 23;

    /* renamed from: a0 */
    private static final int f3169a0 = 24;

    /* renamed from: b */
    private static final String f3170b = "ConstraintSet";

    /* renamed from: b0 */
    private static final int f3171b0 = 25;

    /* renamed from: c */
    public static final int f3172c = -1;

    /* renamed from: c0 */
    private static final int f3173c0 = 26;

    /* renamed from: d */
    public static final int f3174d = 0;

    /* renamed from: d0 */
    private static final int f3175d0 = 27;

    /* renamed from: e */
    public static final int f3176e = -2;

    /* renamed from: e0 */
    private static final int f3177e0 = 28;

    /* renamed from: f */
    public static final int f3178f = 1;

    /* renamed from: f0 */
    private static final int f3179f0 = 29;

    /* renamed from: g */
    public static final int f3180g = 0;

    /* renamed from: g0 */
    private static final int f3181g0 = 30;

    /* renamed from: h */
    public static final int f3182h = 0;

    /* renamed from: h0 */
    private static final int f3183h0 = 31;

    /* renamed from: i */
    public static final int f3184i = 0;

    /* renamed from: i0 */
    private static final int f3185i0 = 32;

    /* renamed from: j */
    public static final int f3186j = 1;

    /* renamed from: j0 */
    private static final int f3187j0 = 33;

    /* renamed from: k */
    public static final int f3188k = 0;

    /* renamed from: k0 */
    private static final int f3189k0 = 34;

    /* renamed from: l */
    public static final int f3190l = 1;

    /* renamed from: l0 */
    private static final int f3191l0 = 35;

    /* renamed from: m */
    public static final int f3192m = 0;

    /* renamed from: m0 */
    private static final int f3193m0 = 36;

    /* renamed from: n */
    public static final int f3194n = 4;

    /* renamed from: n0 */
    private static final int f3195n0 = 37;

    /* renamed from: o */
    public static final int f3196o = 8;

    /* renamed from: o0 */
    private static final int f3197o0 = 38;

    /* renamed from: p */
    public static final int f3198p = 1;

    /* renamed from: p0 */
    private static final int f3199p0 = 39;

    /* renamed from: q */
    public static final int f3200q = 2;

    /* renamed from: q0 */
    private static final int f3201q0 = 40;

    /* renamed from: r */
    public static final int f3202r = 3;

    /* renamed from: r0 */
    private static final int f3203r0 = 41;

    /* renamed from: s */
    public static final int f3204s = 4;

    /* renamed from: s0 */
    private static final int f3205s0 = 42;

    /* renamed from: t */
    public static final int f3206t = 5;

    /* renamed from: t0 */
    private static final int f3207t0 = 43;

    /* renamed from: u */
    public static final int f3208u = 6;

    /* renamed from: u0 */
    private static final int f3209u0 = 44;

    /* renamed from: v */
    public static final int f3210v = 7;

    /* renamed from: v0 */
    private static final int f3211v0 = 45;

    /* renamed from: w */
    public static final int f3212w = 0;

    /* renamed from: w0 */
    private static final int f3213w0 = 46;

    /* renamed from: x */
    public static final int f3214x = 1;

    /* renamed from: x0 */
    private static final int f3215x0 = 47;

    /* renamed from: y */
    public static final int f3216y = 2;

    /* renamed from: y0 */
    private static final int f3217y0 = 48;

    /* renamed from: z */
    private static final boolean f3218z = false;

    /* renamed from: z0 */
    private static final int f3219z0 = 49;

    /* renamed from: a */
    private HashMap<Integer, C0701b> f3220a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* compiled from: ConstraintSet */
    private static class C0701b {

        /* renamed from: w0 */
        static final int f3221w0 = -1;

        /* renamed from: A */
        public int f3222A;

        /* renamed from: B */
        public int f3223B;

        /* renamed from: C */
        public int f3224C;

        /* renamed from: D */
        public int f3225D;

        /* renamed from: E */
        public int f3226E;

        /* renamed from: F */
        public int f3227F;

        /* renamed from: G */
        public int f3228G;

        /* renamed from: H */
        public int f3229H;

        /* renamed from: I */
        public int f3230I;

        /* renamed from: J */
        public int f3231J;

        /* renamed from: K */
        public int f3232K;

        /* renamed from: L */
        public int f3233L;

        /* renamed from: M */
        public int f3234M;

        /* renamed from: N */
        public int f3235N;

        /* renamed from: O */
        public int f3236O;

        /* renamed from: P */
        public int f3237P;

        /* renamed from: Q */
        public float f3238Q;

        /* renamed from: R */
        public float f3239R;

        /* renamed from: S */
        public int f3240S;

        /* renamed from: T */
        public int f3241T;

        /* renamed from: U */
        public float f3242U;

        /* renamed from: V */
        public boolean f3243V;

        /* renamed from: W */
        public float f3244W;

        /* renamed from: X */
        public float f3245X;

        /* renamed from: Y */
        public float f3246Y;

        /* renamed from: Z */
        public float f3247Z;

        /* renamed from: a */
        boolean f3248a;

        /* renamed from: a0 */
        public float f3249a0;

        /* renamed from: b */
        public int f3250b;

        /* renamed from: b0 */
        public float f3251b0;

        /* renamed from: c */
        public int f3252c;

        /* renamed from: c0 */
        public float f3253c0;

        /* renamed from: d */
        int f3254d;

        /* renamed from: d0 */
        public float f3255d0;

        /* renamed from: e */
        public int f3256e;

        /* renamed from: e0 */
        public float f3257e0;

        /* renamed from: f */
        public int f3258f;

        /* renamed from: f0 */
        public float f3259f0;

        /* renamed from: g */
        public float f3260g;

        /* renamed from: g0 */
        public float f3261g0;

        /* renamed from: h */
        public int f3262h;

        /* renamed from: h0 */
        public boolean f3263h0;

        /* renamed from: i */
        public int f3264i;

        /* renamed from: i0 */
        public boolean f3265i0;

        /* renamed from: j */
        public int f3266j;

        /* renamed from: j0 */
        public int f3267j0;

        /* renamed from: k */
        public int f3268k;

        /* renamed from: k0 */
        public int f3269k0;

        /* renamed from: l */
        public int f3270l;

        /* renamed from: l0 */
        public int f3271l0;

        /* renamed from: m */
        public int f3272m;

        /* renamed from: m0 */
        public int f3273m0;

        /* renamed from: n */
        public int f3274n;

        /* renamed from: n0 */
        public int f3275n0;

        /* renamed from: o */
        public int f3276o;

        /* renamed from: o0 */
        public int f3277o0;

        /* renamed from: p */
        public int f3278p;

        /* renamed from: p0 */
        public float f3279p0;

        /* renamed from: q */
        public int f3280q;

        /* renamed from: q0 */
        public float f3281q0;

        /* renamed from: r */
        public int f3282r;

        /* renamed from: r0 */
        public boolean f3283r0;

        /* renamed from: s */
        public int f3284s;

        /* renamed from: s0 */
        public int f3285s0;

        /* renamed from: t */
        public int f3286t;

        /* renamed from: t0 */
        public int f3287t0;

        /* renamed from: u */
        public float f3288u;

        /* renamed from: u0 */
        public int[] f3289u0;

        /* renamed from: v */
        public float f3290v;

        /* renamed from: v0 */
        public String f3291v0;

        /* renamed from: w */
        public String f3292w;

        /* renamed from: x */
        public int f3293x;

        /* renamed from: y */
        public int f3294y;

        /* renamed from: z */
        public float f3295z;

        private C0701b() {
            this.f3248a = false;
            this.f3256e = -1;
            this.f3258f = -1;
            this.f3260g = -1.0f;
            this.f3262h = -1;
            this.f3264i = -1;
            this.f3266j = -1;
            this.f3268k = -1;
            this.f3270l = -1;
            this.f3272m = -1;
            this.f3274n = -1;
            this.f3276o = -1;
            this.f3278p = -1;
            this.f3280q = -1;
            this.f3282r = -1;
            this.f3284s = -1;
            this.f3286t = -1;
            this.f3288u = 0.5f;
            this.f3290v = 0.5f;
            this.f3292w = null;
            this.f3293x = -1;
            this.f3294y = 0;
            this.f3295z = 0.0f;
            this.f3222A = -1;
            this.f3223B = -1;
            this.f3224C = -1;
            this.f3225D = -1;
            this.f3226E = -1;
            this.f3227F = -1;
            this.f3228G = -1;
            this.f3229H = -1;
            this.f3230I = -1;
            this.f3231J = 0;
            this.f3232K = -1;
            this.f3233L = -1;
            this.f3234M = -1;
            this.f3235N = -1;
            this.f3236O = -1;
            this.f3237P = -1;
            this.f3238Q = 0.0f;
            this.f3239R = 0.0f;
            this.f3240S = 0;
            this.f3241T = 0;
            this.f3242U = 1.0f;
            this.f3243V = false;
            this.f3244W = 0.0f;
            this.f3245X = 0.0f;
            this.f3246Y = 0.0f;
            this.f3247Z = 0.0f;
            this.f3249a0 = 1.0f;
            this.f3251b0 = 1.0f;
            this.f3253c0 = Float.NaN;
            this.f3255d0 = Float.NaN;
            this.f3257e0 = 0.0f;
            this.f3259f0 = 0.0f;
            this.f3261g0 = 0.0f;
            this.f3263h0 = false;
            this.f3265i0 = false;
            this.f3267j0 = 0;
            this.f3269k0 = 0;
            this.f3271l0 = -1;
            this.f3273m0 = -1;
            this.f3275n0 = -1;
            this.f3277o0 = -1;
            this.f3279p0 = 1.0f;
            this.f3281q0 = 1.0f;
            this.f3283r0 = false;
            this.f3285s0 = -1;
            this.f3287t0 = -1;
        }

        public C0701b clone() {
            C0701b bVar = new C0701b();
            bVar.f3248a = this.f3248a;
            bVar.f3250b = this.f3250b;
            bVar.f3252c = this.f3252c;
            bVar.f3256e = this.f3256e;
            bVar.f3258f = this.f3258f;
            bVar.f3260g = this.f3260g;
            bVar.f3262h = this.f3262h;
            bVar.f3264i = this.f3264i;
            bVar.f3266j = this.f3266j;
            bVar.f3268k = this.f3268k;
            bVar.f3270l = this.f3270l;
            bVar.f3272m = this.f3272m;
            bVar.f3274n = this.f3274n;
            bVar.f3276o = this.f3276o;
            bVar.f3278p = this.f3278p;
            bVar.f3280q = this.f3280q;
            bVar.f3282r = this.f3282r;
            bVar.f3284s = this.f3284s;
            bVar.f3286t = this.f3286t;
            bVar.f3288u = this.f3288u;
            bVar.f3290v = this.f3290v;
            bVar.f3292w = this.f3292w;
            bVar.f3222A = this.f3222A;
            bVar.f3223B = this.f3223B;
            bVar.f3288u = this.f3288u;
            bVar.f3288u = this.f3288u;
            bVar.f3288u = this.f3288u;
            bVar.f3288u = this.f3288u;
            bVar.f3288u = this.f3288u;
            bVar.f3224C = this.f3224C;
            bVar.f3225D = this.f3225D;
            bVar.f3226E = this.f3226E;
            bVar.f3227F = this.f3227F;
            bVar.f3228G = this.f3228G;
            bVar.f3229H = this.f3229H;
            bVar.f3230I = this.f3230I;
            bVar.f3231J = this.f3231J;
            bVar.f3232K = this.f3232K;
            bVar.f3233L = this.f3233L;
            bVar.f3234M = this.f3234M;
            bVar.f3235N = this.f3235N;
            bVar.f3236O = this.f3236O;
            bVar.f3237P = this.f3237P;
            bVar.f3238Q = this.f3238Q;
            bVar.f3239R = this.f3239R;
            bVar.f3240S = this.f3240S;
            bVar.f3241T = this.f3241T;
            bVar.f3242U = this.f3242U;
            bVar.f3243V = this.f3243V;
            bVar.f3244W = this.f3244W;
            bVar.f3245X = this.f3245X;
            bVar.f3246Y = this.f3246Y;
            bVar.f3247Z = this.f3247Z;
            bVar.f3249a0 = this.f3249a0;
            bVar.f3251b0 = this.f3251b0;
            bVar.f3253c0 = this.f3253c0;
            bVar.f3255d0 = this.f3255d0;
            bVar.f3257e0 = this.f3257e0;
            bVar.f3259f0 = this.f3259f0;
            bVar.f3261g0 = this.f3261g0;
            bVar.f3263h0 = this.f3263h0;
            bVar.f3265i0 = this.f3265i0;
            bVar.f3267j0 = this.f3267j0;
            bVar.f3269k0 = this.f3269k0;
            bVar.f3271l0 = this.f3271l0;
            bVar.f3273m0 = this.f3273m0;
            bVar.f3275n0 = this.f3275n0;
            bVar.f3277o0 = this.f3277o0;
            bVar.f3279p0 = this.f3279p0;
            bVar.f3281q0 = this.f3281q0;
            bVar.f3285s0 = this.f3285s0;
            bVar.f3287t0 = this.f3287t0;
            int[] iArr = this.f3289u0;
            if (iArr != null) {
                bVar.f3289u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f3293x = this.f3293x;
            bVar.f3294y = this.f3294y;
            bVar.f3295z = this.f3295z;
            bVar.f3283r0 = this.f3283r0;
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4091a(C0698a aVar, int i, C0703a aVar2) {
            m4090a(i, aVar2);
            if (aVar instanceof Barrier) {
                this.f3287t0 = 1;
                Barrier barrier = (Barrier) aVar;
                this.f3285s0 = barrier.getType();
                this.f3289u0 = barrier.getReferencedIds();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4090a(int i, C0703a aVar) {
            m4089a(i, (C0694a) aVar);
            this.f3242U = aVar.f3298F0;
            this.f3245X = aVar.f3301I0;
            this.f3246Y = aVar.f3302J0;
            this.f3247Z = aVar.f3303K0;
            this.f3249a0 = aVar.f3304L0;
            this.f3251b0 = aVar.f3305M0;
            this.f3253c0 = aVar.f3306N0;
            this.f3255d0 = aVar.f3307O0;
            this.f3257e0 = aVar.f3308P0;
            this.f3259f0 = aVar.f3309Q0;
            this.f3261g0 = aVar.f3310R0;
            this.f3244W = aVar.f3300H0;
            this.f3243V = aVar.f3299G0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4089a(int i, C0694a aVar) {
            this.f3254d = i;
            this.f3262h = aVar.f3031d;
            this.f3264i = aVar.f3033e;
            this.f3266j = aVar.f3035f;
            this.f3268k = aVar.f3037g;
            this.f3270l = aVar.f3039h;
            this.f3272m = aVar.f3041i;
            this.f3274n = aVar.f3043j;
            this.f3276o = aVar.f3045k;
            this.f3278p = aVar.f3047l;
            this.f3280q = aVar.f3053p;
            this.f3282r = aVar.f3054q;
            this.f3284s = aVar.f3055r;
            this.f3286t = aVar.f3056s;
            this.f3288u = aVar.f3063z;
            this.f3290v = aVar.f2999A;
            this.f3292w = aVar.f3000B;
            this.f3293x = aVar.f3049m;
            this.f3294y = aVar.f3051n;
            this.f3295z = aVar.f3052o;
            this.f3222A = aVar.f3015Q;
            this.f3223B = aVar.f3016R;
            this.f3224C = aVar.f3017S;
            this.f3260g = aVar.f3029c;
            this.f3256e = aVar.f3025a;
            this.f3258f = aVar.f3027b;
            this.f3250b = aVar.width;
            this.f3252c = aVar.height;
            this.f3225D = aVar.leftMargin;
            this.f3226E = aVar.rightMargin;
            this.f3227F = aVar.topMargin;
            this.f3228G = aVar.bottomMargin;
            this.f3238Q = aVar.f3004F;
            this.f3239R = aVar.f3003E;
            this.f3241T = aVar.f3006H;
            this.f3240S = aVar.f3005G;
            boolean z = aVar.f3018T;
            this.f3263h0 = z;
            this.f3265i0 = aVar.f3019U;
            this.f3267j0 = aVar.f3007I;
            this.f3269k0 = aVar.f3008J;
            this.f3263h0 = z;
            this.f3271l0 = aVar.f3011M;
            this.f3273m0 = aVar.f3012N;
            this.f3275n0 = aVar.f3009K;
            this.f3277o0 = aVar.f3010L;
            this.f3279p0 = aVar.f3013O;
            this.f3281q0 = aVar.f3014P;
            if (VERSION.SDK_INT >= 17) {
                this.f3229H = aVar.getMarginEnd();
                this.f3230I = aVar.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo3915a(C0694a aVar) {
            aVar.f3031d = this.f3262h;
            aVar.f3033e = this.f3264i;
            aVar.f3035f = this.f3266j;
            aVar.f3037g = this.f3268k;
            aVar.f3039h = this.f3270l;
            aVar.f3041i = this.f3272m;
            aVar.f3043j = this.f3274n;
            aVar.f3045k = this.f3276o;
            aVar.f3047l = this.f3278p;
            aVar.f3053p = this.f3280q;
            aVar.f3054q = this.f3282r;
            aVar.f3055r = this.f3284s;
            aVar.f3056s = this.f3286t;
            aVar.leftMargin = this.f3225D;
            aVar.rightMargin = this.f3226E;
            aVar.topMargin = this.f3227F;
            aVar.bottomMargin = this.f3228G;
            aVar.f3061x = this.f3237P;
            aVar.f3062y = this.f3236O;
            aVar.f3063z = this.f3288u;
            aVar.f2999A = this.f3290v;
            aVar.f3049m = this.f3293x;
            aVar.f3051n = this.f3294y;
            aVar.f3052o = this.f3295z;
            aVar.f3000B = this.f3292w;
            aVar.f3015Q = this.f3222A;
            aVar.f3016R = this.f3223B;
            aVar.f3004F = this.f3238Q;
            aVar.f3003E = this.f3239R;
            aVar.f3006H = this.f3241T;
            aVar.f3005G = this.f3240S;
            aVar.f3018T = this.f3263h0;
            aVar.f3019U = this.f3265i0;
            aVar.f3007I = this.f3267j0;
            aVar.f3008J = this.f3269k0;
            aVar.f3011M = this.f3271l0;
            aVar.f3012N = this.f3273m0;
            aVar.f3009K = this.f3275n0;
            aVar.f3010L = this.f3277o0;
            aVar.f3013O = this.f3279p0;
            aVar.f3014P = this.f3281q0;
            aVar.f3017S = this.f3224C;
            aVar.f3029c = this.f3260g;
            aVar.f3025a = this.f3256e;
            aVar.f3027b = this.f3258f;
            aVar.width = this.f3250b;
            aVar.height = this.f3252c;
            if (VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f3230I);
                aVar.setMarginEnd(this.f3229H);
            }
            aVar.mo3828b();
        }
    }

    static {
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        f3126C.append(C0696R.styleable.ConstraintSet_android_orientation, 27);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginTop, 16);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginRight, 14);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginStart, 15);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintTop_creator, 75);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintRight_creator, 75);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginLeft, 24);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginRight, 28);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginStart, 31);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginEnd, 8);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginTop, 34);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_marginBottom, 2);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_width, 23);
        f3126C.append(C0696R.styleable.ConstraintSet_android_layout_height, 21);
        f3126C.append(C0696R.styleable.ConstraintSet_android_visibility, 22);
        f3126C.append(C0696R.styleable.ConstraintSet_android_alpha, 43);
        f3126C.append(C0696R.styleable.ConstraintSet_android_elevation, 44);
        f3126C.append(C0696R.styleable.ConstraintSet_android_rotationX, 45);
        f3126C.append(C0696R.styleable.ConstraintSet_android_rotationY, 46);
        f3126C.append(C0696R.styleable.ConstraintSet_android_rotation, 60);
        f3126C.append(C0696R.styleable.ConstraintSet_android_scaleX, 47);
        f3126C.append(C0696R.styleable.ConstraintSet_android_scaleY, 48);
        f3126C.append(C0696R.styleable.ConstraintSet_android_transformPivotX, 49);
        f3126C.append(C0696R.styleable.ConstraintSet_android_transformPivotY, 50);
        f3126C.append(C0696R.styleable.ConstraintSet_android_translationX, 51);
        f3126C.append(C0696R.styleable.ConstraintSet_android_translationY, 52);
        f3126C.append(C0696R.styleable.ConstraintSet_android_translationZ, 53);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintCircle, 61);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        f3126C.append(C0696R.styleable.ConstraintSet_android_id, 38);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        f3126C.append(C0696R.styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        f3126C.append(C0696R.styleable.ConstraintSet_chainUseRtl, 71);
        f3126C.append(C0696R.styleable.ConstraintSet_barrierDirection, 72);
        f3126C.append(C0696R.styleable.ConstraintSet_constraint_referenced_ids, 73);
        f3126C.append(C0696R.styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: g */
    private String m4018g(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return C11644i.f33457y3;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: a */
    public void mo3858a(Context context, int i) {
        mo3877c((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3869b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3220a.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f3220a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        bVar.f3287t0 = 1;
                    }
                    int i2 = bVar.f3287t0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(bVar.f3285s0);
                        barrier.setAllowsGoneWidget(bVar.f3283r0);
                        int[] iArr = bVar.f3289u0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f3291v0;
                            if (str != null) {
                                bVar.f3289u0 = m4016a((View) barrier, str);
                                barrier.setReferencedIds(bVar.f3289u0);
                            }
                        }
                    }
                    C0694a aVar = (C0694a) childAt.getLayoutParams();
                    bVar.mo3915a(aVar);
                    childAt.setLayoutParams(aVar);
                    childAt.setVisibility(bVar.f3231J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(bVar.f3242U);
                        childAt.setRotation(bVar.f3245X);
                        childAt.setRotationX(bVar.f3246Y);
                        childAt.setRotationY(bVar.f3247Z);
                        childAt.setScaleX(bVar.f3249a0);
                        childAt.setScaleY(bVar.f3251b0);
                        if (!Float.isNaN(bVar.f3253c0)) {
                            childAt.setPivotX(bVar.f3253c0);
                        }
                        if (!Float.isNaN(bVar.f3255d0)) {
                            childAt.setPivotY(bVar.f3255d0);
                        }
                        childAt.setTranslationX(bVar.f3257e0);
                        childAt.setTranslationY(bVar.f3259f0);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(bVar.f3261g0);
                            if (bVar.f3243V) {
                                childAt.setElevation(bVar.f3244W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0701b bVar2 = (C0701b) this.f3220a.get(num);
            int i3 = bVar2.f3287t0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.f3289u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f3291v0;
                    if (str2 != null) {
                        bVar2.f3289u0 = m4016a((View) barrier2, str2);
                        barrier2.setReferencedIds(bVar2.f3289u0);
                    }
                }
                barrier2.setType(bVar2.f3285s0);
                C0694a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo3838a();
                bVar2.mo3915a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (bVar2.f3248a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0694a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.mo3915a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: c */
    public C0701b mo3871c(int i) {
        return m4017f(i);
    }

    /* renamed from: d */
    public void mo3882d(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3852a(i, 3, i2, i3, i4);
        mo3852a(i, 4, i5, i6, i7);
        ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3290v = f;
    }

    /* renamed from: e */
    public void mo3886e(int i, int i2, int i3) {
        C0701b f = m4017f(i);
        switch (i2) {
            case 1:
                f.f3225D = i3;
                return;
            case 2:
                f.f3226E = i3;
                return;
            case 3:
                f.f3227F = i3;
                return;
            case 4:
                f.f3228G = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                f.f3230I = i3;
                return;
            case 7:
                f.f3229H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: f */
    public void mo3887f(int i, float f) {
        m4017f(i).f3288u = f;
    }

    /* renamed from: g */
    public void mo3890g(int i, int i2) {
        m4017f(i).f3252c = i2;
    }

    /* renamed from: h */
    public void mo3891h(int i, float f) {
        m4017f(i).f3245X = f;
    }

    /* renamed from: i */
    public void mo3893i(int i, float f) {
        m4017f(i).f3246Y = f;
    }

    /* renamed from: j */
    public void mo3895j(int i, float f) {
        m4017f(i).f3247Z = f;
    }

    /* renamed from: k */
    public void mo3897k(int i, float f) {
        m4017f(i).f3249a0 = f;
    }

    /* renamed from: l */
    public void mo3899l(int i, float f) {
        m4017f(i).f3251b0 = f;
    }

    /* renamed from: m */
    public void mo3901m(int i, float f) {
        m4017f(i).f3253c0 = f;
    }

    /* renamed from: n */
    public void mo3903n(int i, float f) {
        m4017f(i).f3255d0 = f;
    }

    /* renamed from: n */
    public void mo3904n(int i, int i2) {
    }

    /* renamed from: o */
    public void mo3905o(int i, float f) {
        m4017f(i).f3257e0 = f;
    }

    /* renamed from: p */
    public void mo3907p(int i, float f) {
        m4017f(i).f3259f0 = f;
    }

    /* renamed from: q */
    public void mo3909q(int i, float f) {
        m4017f(i).f3261g0 = f;
    }

    /* renamed from: r */
    public void mo3911r(int i, float f) {
        m4017f(i).f3290v = f;
    }

    /* renamed from: s */
    public void mo3914s(int i, int i2) {
        m4017f(i).f3231J = i2;
    }

    /* renamed from: a */
    public void mo3860a(C0699b bVar) {
        this.f3220a.clear();
        for (Integer num : bVar.f3220a.keySet()) {
            this.f3220a.put(num, ((C0701b) bVar.f3220a.get(num)).clone());
        }
    }

    /* renamed from: c */
    public void mo3877c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3220a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0694a aVar = (C0694a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f3220a.containsKey(Integer.valueOf(id))) {
                    this.f3220a.put(Integer.valueOf(id), new C0701b());
                }
                C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(id));
                bVar.m4089a(id, aVar);
                bVar.f3231J = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    bVar.f3242U = childAt.getAlpha();
                    bVar.f3245X = childAt.getRotation();
                    bVar.f3246Y = childAt.getRotationX();
                    bVar.f3247Z = childAt.getRotationY();
                    bVar.f3249a0 = childAt.getScaleX();
                    bVar.f3251b0 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        bVar.f3253c0 = pivotX;
                        bVar.f3255d0 = pivotY;
                    }
                    bVar.f3257e0 = childAt.getTranslationX();
                    bVar.f3259f0 = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        bVar.f3261g0 = childAt.getTranslationZ();
                        if (bVar.f3243V) {
                            bVar.f3244W = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.f3283r0 = barrier.mo3792b();
                    bVar.f3289u0 = barrier.getReferencedIds();
                    bVar.f3285s0 = barrier.getType();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: f */
    public void mo3888f(int i, int i2) {
        m4017f(i).f3267j0 = i2;
    }

    /* renamed from: g */
    public void mo3889g(int i, float f) {
        m4017f(i).f3239R = f;
    }

    /* renamed from: h */
    public void mo3892h(int i, int i2) {
        m4017f(i).f3273m0 = i2;
    }

    /* renamed from: i */
    public void mo3894i(int i, int i2) {
        m4017f(i).f3271l0 = i2;
    }

    /* renamed from: j */
    public void mo3896j(int i, int i2) {
        m4017f(i).f3277o0 = i2;
    }

    /* renamed from: k */
    public void mo3898k(int i, int i2) {
        m4017f(i).f3275n0 = i2;
    }

    /* renamed from: l */
    public void mo3900l(int i, int i2) {
        m4017f(i).f3250b = i2;
    }

    /* renamed from: m */
    public void mo3902m(int i, int i2) {
        C0701b f = m4017f(i);
        f.f3248a = true;
        f.f3224C = i2;
    }

    /* renamed from: o */
    public void mo3906o(int i, int i2) {
        m4017f(i).f3256e = i2;
        m4017f(i).f3258f = -1;
        m4017f(i).f3260g = -1.0f;
    }

    /* renamed from: p */
    public void mo3908p(int i, int i2) {
        m4017f(i).f3258f = i2;
        m4017f(i).f3256e = -1;
        m4017f(i).f3260g = -1.0f;
    }

    /* renamed from: q */
    public void mo3910q(int i, int i2) {
        m4017f(i).f3240S = i2;
    }

    /* renamed from: r */
    public void mo3912r(int i, int i2) {
        m4017f(i).f3241T = i2;
    }

    /* renamed from: s */
    public void mo3913s(int i, float f) {
        m4017f(i).f3238Q = f;
    }

    /* renamed from: f */
    private C0701b m4017f(int i) {
        if (!this.f3220a.containsKey(Integer.valueOf(i))) {
            this.f3220a.put(Integer.valueOf(i), new C0701b());
        }
        return (C0701b) this.f3220a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo3861a(C0702c cVar) {
        int childCount = cVar.getChildCount();
        this.f3220a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = cVar.getChildAt(i);
            C0703a aVar = (C0703a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f3220a.containsKey(Integer.valueOf(id))) {
                    this.f3220a.put(Integer.valueOf(id), new C0701b());
                }
                C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(id));
                if (childAt instanceof C0698a) {
                    bVar.m4091a((C0698a) childAt, id, aVar);
                }
                bVar.m4090a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo3880d(int i, int i2) {
        if (this.f3220a.containsKey(Integer.valueOf(i))) {
            C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    bVar.f3264i = -1;
                    bVar.f3262h = -1;
                    bVar.f3225D = -1;
                    bVar.f3232K = -1;
                    return;
                case 2:
                    bVar.f3268k = -1;
                    bVar.f3266j = -1;
                    bVar.f3226E = -1;
                    bVar.f3234M = -1;
                    return;
                case 3:
                    bVar.f3272m = -1;
                    bVar.f3270l = -1;
                    bVar.f3227F = -1;
                    bVar.f3233L = -1;
                    return;
                case 4:
                    bVar.f3274n = -1;
                    bVar.f3276o = -1;
                    bVar.f3228G = -1;
                    bVar.f3235N = -1;
                    return;
                case 5:
                    bVar.f3278p = -1;
                    return;
                case 6:
                    bVar.f3280q = -1;
                    bVar.f3282r = -1;
                    bVar.f3230I = -1;
                    bVar.f3237P = -1;
                    return;
                case 7:
                    bVar.f3284s = -1;
                    bVar.f3286t = -1;
                    bVar.f3229H = -1;
                    bVar.f3236O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: e */
    public void mo3885e(int i, int i2) {
        m4017f(i).f3269k0 = i2;
    }

    /* renamed from: e */
    public void mo3883e(int i) {
        if (this.f3220a.containsKey(Integer.valueOf(i))) {
            C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(i));
            int i2 = bVar.f3272m;
            int i3 = bVar.f3274n;
            if (!(i2 == -1 && i3 == -1)) {
                if (i2 != -1 && i3 != -1) {
                    mo3852a(i2, 4, i3, 3, 0);
                    mo3852a(i3, 3, i2, 4, 0);
                } else if (!(i2 == -1 && i3 == -1)) {
                    int i4 = bVar.f3276o;
                    if (i4 != -1) {
                        mo3852a(i2, 4, i4, 4, 0);
                    } else {
                        int i5 = bVar.f3270l;
                        if (i5 != -1) {
                            mo3852a(i3, 3, i5, 3, 0);
                        }
                    }
                }
            }
        }
        mo3880d(i, 3);
        mo3880d(i, 4);
    }

    /* renamed from: a */
    public void mo3859a(ConstraintLayout constraintLayout) {
        mo3869b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: a */
    public void mo3853a(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        int i8 = i3;
        float f2 = f;
        String str = "margin must be > 0";
        if (i4 < 0) {
            throw new IllegalArgumentException(str);
        } else if (i7 < 0) {
            throw new IllegalArgumentException(str);
        } else if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i8 == 1 || i8 == 2) {
            int i9 = i;
            mo3852a(i9, 1, i2, i3, i4);
            mo3852a(i9, 2, i5, i6, i7);
            ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3288u = f2;
        } else if (i8 == 6 || i8 == 7) {
            int i10 = i;
            mo3852a(i10, 6, i2, i3, i4);
            mo3852a(i10, 7, i5, i6, i7);
            ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3288u = f2;
        } else {
            int i11 = i;
            mo3852a(i11, 3, i2, i3, i4);
            mo3852a(i11, 4, i5, i6, i7);
            ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3290v = f2;
        }
    }

    /* renamed from: e */
    public void mo3884e(int i, float f) {
        m4017f(i).f3260g = f;
        m4017f(i).f3258f = -1;
        m4017f(i).f3256e = -1;
    }

    /* renamed from: d */
    public void mo3881d(int i, int i2, int i3) {
        C0701b f = m4017f(i);
        switch (i2) {
            case 1:
                f.f3232K = i3;
                return;
            case 2:
                f.f3234M = i3;
                return;
            case 3:
                f.f3233L = i3;
                return;
            case 4:
                f.f3235N = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                f.f3237P = i3;
                return;
            case 7:
                f.f3236O = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: a */
    public void mo3854a(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m4014a(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    /* renamed from: c */
    public void mo3875c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3852a(i, 6, i2, i3, i4);
        mo3852a(i, 7, i5, i6, i7);
        ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3288u = f;
    }

    /* renamed from: a */
    private void m4014a(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        String str = "must have 2 or more widgets in a chain";
        if (iArr2.length < 2) {
            throw new IllegalArgumentException(str);
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                m4017f(iArr2[0]).f3239R = fArr2[0];
            }
            m4017f(iArr2[0]).f3240S = i5;
            mo3852a(iArr2[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr2.length; i8++) {
                int i9 = iArr2[i8];
                int i10 = i8 - 1;
                mo3852a(iArr2[i8], i6, iArr2[i10], i7, -1);
                mo3852a(iArr2[i10], i7, iArr2[i8], i6, -1);
                if (fArr2 != null) {
                    m4017f(iArr2[i8]).f3239R = fArr2[i8];
                }
            }
            mo3852a(iArr2[iArr2.length - 1], i7, i3, i4, -1);
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public void mo3876c(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        String str = "must have 2 or more widgets in a chain";
        if (iArr2.length < 2) {
            throw new IllegalArgumentException(str);
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                m4017f(iArr2[0]).f3238Q = fArr2[0];
            }
            m4017f(iArr2[0]).f3241T = i5;
            mo3852a(iArr2[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr2.length; i6++) {
                int i7 = iArr2[i6];
                int i8 = i6 - 1;
                mo3852a(iArr2[i6], 3, iArr2[i8], 4, 0);
                mo3852a(iArr2[i8], 4, iArr2[i6], 3, 0);
                if (fArr2 != null) {
                    m4017f(iArr2[i6]).f3238Q = fArr2[i6];
                }
            }
            mo3852a(iArr2[iArr2.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: d */
    public void mo3879d(int i, float f) {
        m4017f(i).f3244W = f;
        m4017f(i).f3243V = true;
    }

    /* renamed from: d */
    public void mo3878d(int i) {
        if (this.f3220a.containsKey(Integer.valueOf(i))) {
            C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(i));
            int i2 = bVar.f3264i;
            int i3 = bVar.f3266j;
            if (i2 == -1 && i3 == -1) {
                int i4 = bVar.f3280q;
                int i5 = bVar.f3284s;
                if (!(i4 == -1 && i5 == -1)) {
                    if (i4 != -1 && i5 != -1) {
                        mo3852a(i4, 7, i5, 6, 0);
                        mo3852a(i5, 6, i2, 7, 0);
                    } else if (!(i2 == -1 && i5 == -1)) {
                        int i6 = bVar.f3268k;
                        if (i6 != -1) {
                            mo3852a(i2, 7, i6, 7, 0);
                        } else {
                            int i7 = bVar.f3262h;
                            if (i7 != -1) {
                                mo3852a(i5, 6, i7, 6, 0);
                            }
                        }
                    }
                }
                mo3880d(i, 6);
                mo3880d(i, 7);
                return;
            }
            if (i2 != -1 && i3 != -1) {
                mo3852a(i2, 2, i3, 1, 0);
                mo3852a(i3, 1, i2, 2, 0);
            } else if (!(i2 == -1 && i3 == -1)) {
                int i8 = bVar.f3268k;
                if (i8 != -1) {
                    mo3852a(i2, 2, i8, 2, 0);
                } else {
                    int i9 = bVar.f3262h;
                    if (i9 != -1) {
                        mo3852a(i3, 1, i9, 1, 0);
                    }
                }
            }
            mo3880d(i, 1);
            mo3880d(i, 2);
        }
    }

    /* renamed from: a */
    public void mo3852a(int i, int i2, int i3, int i4, int i5) {
        if (!this.f3220a.containsKey(Integer.valueOf(i))) {
            this.f3220a.put(Integer.valueOf(i), new C0701b());
        }
        C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.f3262h = i3;
                    bVar.f3264i = -1;
                } else if (i4 == 2) {
                    bVar.f3264i = i3;
                    bVar.f3262h = -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Left to ");
                    sb.append(m4018g(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
                bVar.f3225D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    bVar.f3266j = i3;
                    bVar.f3268k = -1;
                } else if (i4 == 2) {
                    bVar.f3268k = i3;
                    bVar.f3266j = -1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m4018g(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                bVar.f3226E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    bVar.f3270l = i3;
                    bVar.f3272m = -1;
                    bVar.f3278p = -1;
                } else if (i4 == 4) {
                    bVar.f3272m = i3;
                    bVar.f3270l = -1;
                    bVar.f3278p = -1;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m4018g(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
                bVar.f3227F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    bVar.f3276o = i3;
                    bVar.f3274n = -1;
                    bVar.f3278p = -1;
                } else if (i4 == 3) {
                    bVar.f3274n = i3;
                    bVar.f3276o = -1;
                    bVar.f3278p = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m4018g(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
                bVar.f3228G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    bVar.f3278p = i3;
                    bVar.f3276o = -1;
                    bVar.f3274n = -1;
                    bVar.f3270l = -1;
                    bVar.f3272m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(m4018g(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    bVar.f3282r = i3;
                    bVar.f3280q = -1;
                } else if (i4 == 7) {
                    bVar.f3280q = i3;
                    bVar.f3282r = -1;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(m4018g(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
                bVar.f3230I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    bVar.f3286t = i3;
                    bVar.f3284s = -1;
                } else if (i4 == 6) {
                    bVar.f3284s = i3;
                    bVar.f3286t = -1;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(m4018g(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
                bVar.f3229H = i5;
                return;
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m4018g(i2));
                sb8.append(" to ");
                sb8.append(m4018g(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    /* renamed from: c */
    public void mo3873c(int i, int i2) {
        if (i2 == 0) {
            mo3853a(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            mo3853a(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    /* renamed from: c */
    public void mo3872c(int i, float f) {
        m4017f(i).f3242U = f;
    }

    /* renamed from: c */
    public void mo3874c(int i, int i2, int i3) {
        mo3852a(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        mo3852a(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            mo3852a(i2, 4, i, 3, 0);
        }
        if (i2 != 0) {
            mo3852a(i3, 3, i, 4, 0);
        }
    }

    /* renamed from: b */
    public void mo3866b(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo3852a(i, 1, i2, i3, i4);
        mo3852a(i, 2, i5, i6, i7);
        ((C0701b) this.f3220a.get(Integer.valueOf(i))).f3288u = f;
    }

    /* renamed from: b */
    public void mo3867b(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m4014a(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    /* renamed from: b */
    public void mo3864b(int i, int i2) {
        if (i2 == 0) {
            mo3853a(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            mo3853a(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    /* renamed from: b */
    public boolean mo3870b(int i) {
        return m4017f(i).f3243V;
    }

    /* renamed from: b */
    public void mo3863b(int i, float f, float f2) {
        C0701b f3 = m4017f(i);
        f3.f3257e0 = f;
        f3.f3259f0 = f2;
    }

    /* renamed from: b */
    public void mo3862b(int i, float f) {
        m4017f(i).f3279p0 = f;
    }

    /* renamed from: b */
    public void mo3865b(int i, int i2, int i3) {
        mo3852a(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        mo3852a(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            mo3852a(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            mo3852a(i3, 6, i, 7, 0);
        }
    }

    /* renamed from: b */
    public void mo3868b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0701b a = m4013a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f3248a = true;
                    }
                    this.f3220a.put(Integer.valueOf(a.f3254d), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo3851a(int i, int i2, int i3, int i4) {
        if (!this.f3220a.containsKey(Integer.valueOf(i))) {
            this.f3220a.put(Integer.valueOf(i), new C0701b());
        }
        C0701b bVar = (C0701b) this.f3220a.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.f3262h = i3;
                    bVar.f3264i = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.f3264i = i3;
                    bVar.f3262h = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("left to ");
                    sb.append(m4018g(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    bVar.f3266j = i3;
                    bVar.f3268k = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.f3268k = i3;
                    bVar.f3266j = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m4018g(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    bVar.f3270l = i3;
                    bVar.f3272m = -1;
                    bVar.f3278p = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.f3272m = i3;
                    bVar.f3270l = -1;
                    bVar.f3278p = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m4018g(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    bVar.f3276o = i3;
                    bVar.f3274n = -1;
                    bVar.f3278p = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.f3274n = i3;
                    bVar.f3276o = -1;
                    bVar.f3278p = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m4018g(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    bVar.f3278p = i3;
                    bVar.f3276o = -1;
                    bVar.f3274n = -1;
                    bVar.f3270l = -1;
                    bVar.f3272m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(m4018g(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    bVar.f3282r = i3;
                    bVar.f3280q = -1;
                    return;
                } else if (i4 == 7) {
                    bVar.f3280q = i3;
                    bVar.f3282r = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(m4018g(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    bVar.f3286t = i3;
                    bVar.f3284s = -1;
                    return;
                } else if (i4 == 6) {
                    bVar.f3284s = i3;
                    bVar.f3286t = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(m4018g(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m4018g(i2));
                sb8.append(" to ");
                sb8.append(m4018g(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    /* renamed from: a */
    public void mo3848a(int i, int i2) {
        if (i2 == 0) {
            mo3853a(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            mo3853a(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    /* renamed from: a */
    public void mo3845a(int i) {
        this.f3220a.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo3856a(int i, String str) {
        m4017f(i).f3292w = str;
    }

    /* renamed from: a */
    public void mo3857a(int i, boolean z) {
        m4017f(i).f3243V = z;
    }

    /* renamed from: a */
    public void mo3847a(int i, float f, float f2) {
        C0701b f3 = m4017f(i);
        f3.f3255d0 = f2;
        f3.f3253c0 = f;
    }

    /* renamed from: a */
    public void mo3850a(int i, int i2, int i3, float f) {
        C0701b f2 = m4017f(i);
        f2.f3293x = i2;
        f2.f3294y = i3;
        f2.f3295z = f;
    }

    /* renamed from: a */
    public void mo3846a(int i, float f) {
        m4017f(i).f3281q0 = f;
    }

    /* renamed from: a */
    public void mo3849a(int i, int i2, int i3) {
        mo3852a(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        mo3852a(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            mo3852a(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            mo3852a(i3, 1, i, 2, 0);
        }
    }

    /* renamed from: a */
    public void mo3855a(int i, int i2, int... iArr) {
        C0701b f = m4017f(i);
        f.f3287t0 = 1;
        f.f3285s0 = i2;
        f.f3248a = false;
        f.f3289u0 = iArr;
    }

    /* renamed from: a */
    private static int m4012a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0701b m4013a(Context context, AttributeSet attributeSet) {
        C0701b bVar = new C0701b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintSet);
        m4015a(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    /* renamed from: a */
    private void m4015a(C0701b bVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f3126C.get(index);
            switch (i2) {
                case 1:
                    bVar.f3278p = m4012a(typedArray, index, bVar.f3278p);
                    break;
                case 2:
                    bVar.f3228G = typedArray.getDimensionPixelSize(index, bVar.f3228G);
                    break;
                case 3:
                    bVar.f3276o = m4012a(typedArray, index, bVar.f3276o);
                    break;
                case 4:
                    bVar.f3274n = m4012a(typedArray, index, bVar.f3274n);
                    break;
                case 5:
                    bVar.f3292w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f3222A = typedArray.getDimensionPixelOffset(index, bVar.f3222A);
                    break;
                case 7:
                    bVar.f3223B = typedArray.getDimensionPixelOffset(index, bVar.f3223B);
                    break;
                case 8:
                    bVar.f3229H = typedArray.getDimensionPixelSize(index, bVar.f3229H);
                    break;
                case 9:
                    bVar.f3286t = m4012a(typedArray, index, bVar.f3286t);
                    break;
                case 10:
                    bVar.f3284s = m4012a(typedArray, index, bVar.f3284s);
                    break;
                case 11:
                    bVar.f3235N = typedArray.getDimensionPixelSize(index, bVar.f3235N);
                    break;
                case 12:
                    bVar.f3236O = typedArray.getDimensionPixelSize(index, bVar.f3236O);
                    break;
                case 13:
                    bVar.f3232K = typedArray.getDimensionPixelSize(index, bVar.f3232K);
                    break;
                case 14:
                    bVar.f3234M = typedArray.getDimensionPixelSize(index, bVar.f3234M);
                    break;
                case 15:
                    bVar.f3237P = typedArray.getDimensionPixelSize(index, bVar.f3237P);
                    break;
                case 16:
                    bVar.f3233L = typedArray.getDimensionPixelSize(index, bVar.f3233L);
                    break;
                case 17:
                    bVar.f3256e = typedArray.getDimensionPixelOffset(index, bVar.f3256e);
                    break;
                case 18:
                    bVar.f3258f = typedArray.getDimensionPixelOffset(index, bVar.f3258f);
                    break;
                case 19:
                    bVar.f3260g = typedArray.getFloat(index, bVar.f3260g);
                    break;
                case 20:
                    bVar.f3288u = typedArray.getFloat(index, bVar.f3288u);
                    break;
                case 21:
                    bVar.f3252c = typedArray.getLayoutDimension(index, bVar.f3252c);
                    break;
                case 22:
                    bVar.f3231J = typedArray.getInt(index, bVar.f3231J);
                    bVar.f3231J = f3122A[bVar.f3231J];
                    break;
                case 23:
                    bVar.f3250b = typedArray.getLayoutDimension(index, bVar.f3250b);
                    break;
                case 24:
                    bVar.f3225D = typedArray.getDimensionPixelSize(index, bVar.f3225D);
                    break;
                case 25:
                    bVar.f3262h = m4012a(typedArray, index, bVar.f3262h);
                    break;
                case 26:
                    bVar.f3264i = m4012a(typedArray, index, bVar.f3264i);
                    break;
                case 27:
                    bVar.f3224C = typedArray.getInt(index, bVar.f3224C);
                    break;
                case 28:
                    bVar.f3226E = typedArray.getDimensionPixelSize(index, bVar.f3226E);
                    break;
                case 29:
                    bVar.f3266j = m4012a(typedArray, index, bVar.f3266j);
                    break;
                case 30:
                    bVar.f3268k = m4012a(typedArray, index, bVar.f3268k);
                    break;
                case 31:
                    bVar.f3230I = typedArray.getDimensionPixelSize(index, bVar.f3230I);
                    break;
                case 32:
                    bVar.f3280q = m4012a(typedArray, index, bVar.f3280q);
                    break;
                case 33:
                    bVar.f3282r = m4012a(typedArray, index, bVar.f3282r);
                    break;
                case 34:
                    bVar.f3227F = typedArray.getDimensionPixelSize(index, bVar.f3227F);
                    break;
                case 35:
                    bVar.f3272m = m4012a(typedArray, index, bVar.f3272m);
                    break;
                case 36:
                    bVar.f3270l = m4012a(typedArray, index, bVar.f3270l);
                    break;
                case 37:
                    bVar.f3290v = typedArray.getFloat(index, bVar.f3290v);
                    break;
                case 38:
                    bVar.f3254d = typedArray.getResourceId(index, bVar.f3254d);
                    break;
                case 39:
                    bVar.f3239R = typedArray.getFloat(index, bVar.f3239R);
                    break;
                case 40:
                    bVar.f3238Q = typedArray.getFloat(index, bVar.f3238Q);
                    break;
                case 41:
                    bVar.f3240S = typedArray.getInt(index, bVar.f3240S);
                    break;
                case 42:
                    bVar.f3241T = typedArray.getInt(index, bVar.f3241T);
                    break;
                case 43:
                    bVar.f3242U = typedArray.getFloat(index, bVar.f3242U);
                    break;
                case 44:
                    bVar.f3243V = true;
                    bVar.f3244W = typedArray.getDimension(index, bVar.f3244W);
                    break;
                case 45:
                    bVar.f3246Y = typedArray.getFloat(index, bVar.f3246Y);
                    break;
                case 46:
                    bVar.f3247Z = typedArray.getFloat(index, bVar.f3247Z);
                    break;
                case 47:
                    bVar.f3249a0 = typedArray.getFloat(index, bVar.f3249a0);
                    break;
                case 48:
                    bVar.f3251b0 = typedArray.getFloat(index, bVar.f3251b0);
                    break;
                case 49:
                    bVar.f3253c0 = typedArray.getFloat(index, bVar.f3253c0);
                    break;
                case 50:
                    bVar.f3255d0 = typedArray.getFloat(index, bVar.f3255d0);
                    break;
                case 51:
                    bVar.f3257e0 = typedArray.getDimension(index, bVar.f3257e0);
                    break;
                case 52:
                    bVar.f3259f0 = typedArray.getDimension(index, bVar.f3259f0);
                    break;
                case 53:
                    bVar.f3261g0 = typedArray.getDimension(index, bVar.f3261g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.f3245X = typedArray.getFloat(index, bVar.f3245X);
                            break;
                        case 61:
                            bVar.f3293x = m4012a(typedArray, index, bVar.f3293x);
                            break;
                        case 62:
                            bVar.f3294y = typedArray.getDimensionPixelSize(index, bVar.f3294y);
                            break;
                        case 63:
                            bVar.f3295z = typedArray.getFloat(index, bVar.f3295z);
                            break;
                        default:
                            String str = "   ";
                            switch (i2) {
                                case 69:
                                    bVar.f3279p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.f3281q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    bVar.f3285s0 = typedArray.getInt(index, bVar.f3285s0);
                                    break;
                                case 73:
                                    bVar.f3291v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.f3283r0 = typedArray.getBoolean(index, bVar.f3283r0);
                                    break;
                                case 75:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append(str);
                                    sb.append(f3126C.get(index));
                                    sb.toString();
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append(str);
                                    sb2.append(f3126C.get(index));
                                    sb2.toString();
                                    break;
                            }
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m4016a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0697id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo3798a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
