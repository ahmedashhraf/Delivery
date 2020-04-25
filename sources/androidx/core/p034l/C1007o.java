package androidx.core.p034l;

import android.view.MotionEvent;

/* renamed from: androidx.core.l.o */
/* compiled from: MotionEventCompat */
public final class C1007o {
    @Deprecated

    /* renamed from: A */
    public static final int f4454A = 17;
    @Deprecated

    /* renamed from: B */
    public static final int f4455B = 18;
    @Deprecated

    /* renamed from: C */
    public static final int f4456C = 19;
    @Deprecated

    /* renamed from: D */
    public static final int f4457D = 20;
    @Deprecated

    /* renamed from: E */
    public static final int f4458E = 21;
    @Deprecated

    /* renamed from: F */
    public static final int f4459F = 22;
    @Deprecated

    /* renamed from: G */
    public static final int f4460G = 23;
    @Deprecated

    /* renamed from: H */
    public static final int f4461H = 24;
    @Deprecated

    /* renamed from: I */
    public static final int f4462I = 25;

    /* renamed from: J */
    public static final int f4463J = 26;

    /* renamed from: K */
    public static final int f4464K = 27;

    /* renamed from: L */
    public static final int f4465L = 28;
    @Deprecated

    /* renamed from: M */
    public static final int f4466M = 32;
    @Deprecated

    /* renamed from: N */
    public static final int f4467N = 33;
    @Deprecated

    /* renamed from: O */
    public static final int f4468O = 34;
    @Deprecated

    /* renamed from: P */
    public static final int f4469P = 35;
    @Deprecated

    /* renamed from: Q */
    public static final int f4470Q = 36;
    @Deprecated

    /* renamed from: R */
    public static final int f4471R = 37;
    @Deprecated

    /* renamed from: S */
    public static final int f4472S = 38;
    @Deprecated

    /* renamed from: T */
    public static final int f4473T = 39;
    @Deprecated

    /* renamed from: U */
    public static final int f4474U = 40;
    @Deprecated

    /* renamed from: V */
    public static final int f4475V = 41;
    @Deprecated

    /* renamed from: W */
    public static final int f4476W = 42;
    @Deprecated

    /* renamed from: X */
    public static final int f4477X = 43;
    @Deprecated

    /* renamed from: Y */
    public static final int f4478Y = 44;
    @Deprecated

    /* renamed from: Z */
    public static final int f4479Z = 45;
    @Deprecated

    /* renamed from: a */
    public static final int f4480a = 255;
    @Deprecated

    /* renamed from: a0 */
    public static final int f4481a0 = 46;
    @Deprecated

    /* renamed from: b */
    public static final int f4482b = 5;
    @Deprecated

    /* renamed from: b0 */
    public static final int f4483b0 = 47;
    @Deprecated

    /* renamed from: c */
    public static final int f4484c = 6;
    @Deprecated

    /* renamed from: c0 */
    public static final int f4485c0 = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f4486d = 7;
    @Deprecated

    /* renamed from: e */
    public static final int f4487e = 8;
    @Deprecated

    /* renamed from: f */
    public static final int f4488f = 65280;
    @Deprecated

    /* renamed from: g */
    public static final int f4489g = 8;
    @Deprecated

    /* renamed from: h */
    public static final int f4490h = 9;
    @Deprecated

    /* renamed from: i */
    public static final int f4491i = 10;
    @Deprecated

    /* renamed from: j */
    public static final int f4492j = 0;
    @Deprecated

    /* renamed from: k */
    public static final int f4493k = 1;
    @Deprecated

    /* renamed from: l */
    public static final int f4494l = 2;
    @Deprecated

    /* renamed from: m */
    public static final int f4495m = 3;
    @Deprecated

    /* renamed from: n */
    public static final int f4496n = 4;
    @Deprecated

    /* renamed from: o */
    public static final int f4497o = 5;
    @Deprecated

    /* renamed from: p */
    public static final int f4498p = 6;
    @Deprecated

    /* renamed from: q */
    public static final int f4499q = 7;
    @Deprecated

    /* renamed from: r */
    public static final int f4500r = 8;
    @Deprecated

    /* renamed from: s */
    public static final int f4501s = 9;
    @Deprecated

    /* renamed from: t */
    public static final int f4502t = 10;
    @Deprecated

    /* renamed from: u */
    public static final int f4503u = 11;
    @Deprecated

    /* renamed from: v */
    public static final int f4504v = 12;
    @Deprecated

    /* renamed from: w */
    public static final int f4505w = 13;
    @Deprecated

    /* renamed from: x */
    public static final int f4506x = 14;
    @Deprecated

    /* renamed from: y */
    public static final int f4507y = 15;
    @Deprecated

    /* renamed from: z */
    public static final int f4508z = 16;

    private C1007o() {
    }

    @Deprecated
    /* renamed from: a */
    public static int m5777a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: b */
    public static int m5780b(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: c */
    public static int m5782c(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: d */
    public static float m5783d(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: e */
    public static float m5785e(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: f */
    public static boolean m5787f(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    @Deprecated
    /* renamed from: a */
    public static int m5778a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static float m5779b(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    @Deprecated
    /* renamed from: c */
    public static int m5781c(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    /* renamed from: d */
    public static int m5784d(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    /* renamed from: e */
    public static int m5786e(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    /* renamed from: a */
    public static float m5776a(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }
}
