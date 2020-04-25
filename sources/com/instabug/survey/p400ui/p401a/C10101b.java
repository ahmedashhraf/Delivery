package com.instabug.survey.p400ui.p401a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.C0193h0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.a.b */
/* compiled from: SurveysGesturesHandler */
public class C10101b {

    /* renamed from: a */
    private static int f26870a = 5;

    /* renamed from: b */
    private static boolean f26871b = false;

    /* renamed from: c */
    private static float f26872c = -1.0f;

    /* renamed from: d */
    private static int f26873d = -1;

    /* renamed from: e */
    private static float f26874e;

    /* renamed from: f */
    private static float f26875f;

    /* renamed from: g */
    private static C10103b f26876g;

    /* renamed from: h */
    private static transient /* synthetic */ boolean[] f26877h;

    /* renamed from: com.instabug.survey.ui.a.b$a */
    /* compiled from: SurveysGesturesHandler */
    static class C10102a implements AnimatorUpdateListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26878b;

        /* renamed from: a */
        final /* synthetic */ View f26879a;

        C10102a(View view) {
            boolean[] a = m46998a();
            this.f26879a = view;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46998a() {
            boolean[] zArr = f26878b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3126680828786872677L, "com/instabug/survey/ui/gestures/SurveysGesturesHandler$1", 4);
            f26878b = a;
            return a;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean[] a = m46998a();
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a[1] = true;
            LayoutParams layoutParams = this.f26879a.getLayoutParams();
            layoutParams.height = intValue;
            a[2] = true;
            this.f26879a.setLayoutParams(layoutParams);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.a.b$b */
    /* compiled from: SurveysGesturesHandler */
    public interface C10103b {
        /* renamed from: c */
        void mo36263c();

        /* renamed from: d */
        void mo36264d();
    }

    static {
        boolean[] b = m46997b();
        b[90] = true;
    }

    /* renamed from: a */
    public static void m46995a(View view, MotionEvent motionEvent, boolean z, boolean z2, @C0193h0 C10103b bVar) {
        View view2;
        boolean[] b = m46997b();
        if (f26876g != null) {
            b[1] = true;
        } else {
            f26876g = bVar;
            b[2] = true;
        }
        if (z) {
            b[3] = true;
            view2 = (View) view.getParent();
            b[4] = true;
        } else {
            view2 = (View) view.getParent().getParent().getParent().getParent();
            b[5] = true;
        }
        LayoutParams layoutParams = view2.getLayoutParams();
        if (f26873d != -1) {
            b[6] = true;
        } else {
            f26873d = layoutParams.height;
            b[7] = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z3 = false;
            if (actionMasked == 1) {
                b[50] = true;
                float x = motionEvent.getX();
                b[51] = true;
                float y = motionEvent.getY();
                b[52] = true;
                if (!m46996a(f26874e, x, f26875f, y)) {
                    b[53] = true;
                } else if (!z) {
                    b[54] = true;
                } else if (f26871b) {
                    b[55] = true;
                } else if (z2) {
                    b[56] = true;
                } else {
                    b[57] = true;
                    bVar.mo36264d();
                    f26871b = true;
                    f26873d = -1;
                    b[58] = true;
                    z3 = true;
                }
                if (f26871b) {
                    b[59] = true;
                } else {
                    if (z) {
                        int i = f26873d;
                        int i2 = layoutParams.height;
                        if (i == i2) {
                            b[60] = true;
                        } else if (i <= i2) {
                            b[61] = true;
                        } else if (((float) i2) / ((float) i) < 0.7f) {
                            f26871b = true;
                            b[62] = true;
                            bVar.mo36263c();
                            f26873d = -1;
                            b[63] = true;
                        } else {
                            m46994a(view2, i2, i);
                            b[64] = true;
                        }
                        int i3 = f26873d;
                        int i4 = layoutParams.height;
                        if (i3 == i4) {
                            b[65] = true;
                        } else if (i3 >= i4) {
                            b[66] = true;
                        } else {
                            if (((float) i4) / ((float) i3) <= 1.4f) {
                                m46994a(view2, i4, i3);
                                b[70] = true;
                            } else if (z2) {
                                b[67] = true;
                            } else {
                                b[68] = true;
                                bVar.mo36264d();
                                f26873d = -1;
                                b[69] = true;
                            }
                            b[71] = true;
                        }
                    } else {
                        int i5 = f26873d;
                        int i6 = layoutParams.height;
                        if (i5 == i6) {
                            b[72] = true;
                        } else if (i5 <= i6) {
                            b[73] = true;
                        } else {
                            b[74] = true;
                            m46994a(view2, i6, i5);
                            b[75] = true;
                        }
                    }
                    z3 = true;
                }
                if (!z3) {
                    b[76] = true;
                } else {
                    f26873d = -1;
                    b[77] = true;
                }
            } else if (actionMasked != 2) {
                b[8] = true;
            } else {
                if (z2) {
                    b[12] = true;
                    if (f26872c < motionEvent.getRawY()) {
                        b[13] = true;
                        layoutParams.height = (int) (((float) layoutParams.height) - (motionEvent.getRawY() - f26872c));
                        b[14] = true;
                        view2.setLayoutParams(layoutParams);
                        b[15] = true;
                        f26872c = motionEvent.getRawY();
                        b[16] = true;
                    } else if (f26872c <= motionEvent.getRawY()) {
                        b[17] = true;
                    } else {
                        int i7 = layoutParams.height;
                        if (i7 >= f26873d) {
                            b[18] = true;
                        } else {
                            b[19] = true;
                            layoutParams.height = (int) (((float) i7) + (f26872c - motionEvent.getRawY()));
                            b[20] = true;
                            view2.setLayoutParams(layoutParams);
                            b[21] = true;
                            f26872c = motionEvent.getRawY();
                            b[22] = true;
                        }
                    }
                } else if (z) {
                    b[23] = true;
                    if (f26872c < motionEvent.getRawY()) {
                        b[24] = true;
                        layoutParams.height = (int) (((float) layoutParams.height) - (motionEvent.getRawY() - f26872c));
                        b[25] = true;
                        view2.setLayoutParams(layoutParams);
                        b[26] = true;
                        f26872c = motionEvent.getRawY();
                        b[27] = true;
                    } else if (f26872c <= motionEvent.getRawY()) {
                        b[28] = true;
                    } else {
                        b[29] = true;
                        layoutParams.height = (int) (((float) layoutParams.height) + (f26872c - motionEvent.getRawY()));
                        b[30] = true;
                        view2.setLayoutParams(layoutParams);
                        b[31] = true;
                        f26872c = motionEvent.getRawY();
                        b[32] = true;
                    }
                } else if (f26872c < motionEvent.getRawY()) {
                    b[33] = true;
                    layoutParams.height = (int) (((float) layoutParams.height) - (motionEvent.getRawY() - f26872c));
                    b[34] = true;
                    view2.setLayoutParams(layoutParams);
                    b[35] = true;
                    f26872c = motionEvent.getRawY();
                    b[36] = true;
                } else if (f26872c <= motionEvent.getRawY()) {
                    b[37] = true;
                } else {
                    int i8 = layoutParams.height;
                    if (i8 >= f26873d) {
                        b[38] = true;
                    } else {
                        b[39] = true;
                        layoutParams.height = (int) (((float) i8) + (f26872c - motionEvent.getRawY()));
                        b[40] = true;
                        view2.setLayoutParams(layoutParams);
                        b[41] = true;
                    }
                    f26872c = motionEvent.getRawY();
                    b[42] = true;
                }
                if (z) {
                    if (((float) layoutParams.height) / ((float) f26873d) <= 2.0f) {
                        f26871b = false;
                        b[46] = true;
                    } else if (z2) {
                        b[43] = true;
                    } else {
                        b[44] = true;
                        bVar.mo36264d();
                        f26871b = false;
                        b[45] = true;
                    }
                } else if (((float) layoutParams.height) / ((float) f26873d) < 0.7f) {
                    f26871b = true;
                    b[47] = true;
                    bVar.mo36263c();
                    f26873d = -1;
                    b[48] = true;
                } else {
                    f26871b = false;
                    b[49] = true;
                }
            }
        } else {
            f26874e = motionEvent.getX();
            b[9] = true;
            f26875f = motionEvent.getY();
            b[10] = true;
            f26872c = motionEvent.getRawY();
            b[11] = true;
        }
        b[78] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46997b() {
        boolean[] zArr = f26877h;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1125758541890832576L, "com/instabug/survey/ui/gestures/SurveysGesturesHandler", 91);
        f26877h = a;
        return a;
    }

    /* renamed from: a */
    private static void m46994a(View view, int i, int i2) {
        boolean[] b = m46997b();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        b[79] = true;
        ofInt.addUpdateListener(new C10102a(view));
        b[80] = true;
        ofInt.setDuration(300);
        b[81] = true;
        ofInt.start();
        b[82] = true;
    }

    /* renamed from: a */
    private static boolean m46996a(float f, float f2, float f3, float f4) {
        boolean z;
        boolean[] b = m46997b();
        float abs = Math.abs(f - f2);
        b[83] = true;
        float abs2 = Math.abs(f3 - f4);
        int i = f26870a;
        if (abs > ((float) i)) {
            b[84] = true;
        } else if (abs2 > ((float) i)) {
            b[85] = true;
        } else {
            b[86] = true;
            z = true;
            b[88] = true;
            return z;
        }
        z = false;
        b[87] = true;
        b[88] = true;
        return z;
    }

    /* renamed from: a */
    public static void m46993a() {
        boolean[] b = m46997b();
        f26873d = -1;
        f26872c = -1.0f;
        b[89] = true;
    }
}
