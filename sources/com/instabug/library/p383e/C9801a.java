package com.instabug.library.p383e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AbsSeekBar;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.util.StringUtility;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.e.a */
/* compiled from: MotionEventRecognizer */
public class C9801a {

    /* renamed from: c */
    private static C9801a f25990c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f25991d;

    /* renamed from: a */
    private final GestureDetector f25992a = new GestureDetector(Instabug.getApplicationContext(), new C9805c(this, null));

    /* renamed from: b */
    private final ScaleGestureDetector f25993b;

    /* renamed from: com.instabug.library.e.a$b */
    /* compiled from: MotionEventRecognizer */
    private static class C9803b {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25994c;

        /* renamed from: a */
        View f25995a;

        /* renamed from: b */
        C9804a f25996b;

        /* renamed from: com.instabug.library.e.a$b$a */
        /* compiled from: MotionEventRecognizer */
        enum C9804a {
            SCROLLABLE,
            SWIPEABLE;

            static {
                boolean[] d;
                d[4] = true;
            }
        }

        public C9803b(C9804a aVar, View view) {
            boolean[] a = m45748a();
            this.f25995a = view;
            this.f25996b = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        static C9803b m45747a(View view) {
            boolean[] a = m45748a();
            C9803b bVar = new C9803b(C9804a.SCROLLABLE, view);
            a[1] = true;
            return bVar;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45748a() {
            boolean[] zArr = f25994c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(545242227230515966L, "com/instabug/library/usersteps/MotionEventRecognizer$FlingableView", 3);
            f25994c = a;
            return a;
        }

        /* renamed from: b */
        static C9803b m45749b(View view) {
            boolean[] a = m45748a();
            C9803b bVar = new C9803b(C9804a.SWIPEABLE, view);
            a[2] = true;
            return bVar;
        }
    }

    /* renamed from: com.instabug.library.e.a$c */
    /* compiled from: MotionEventRecognizer */
    private class C9805c extends SimpleOnGestureListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25997N;

        /* renamed from: a */
        private MotionEvent f25998a;

        /* renamed from: b */
        final /* synthetic */ C9801a f25999b;

        private C9805c(C9801a aVar) {
            boolean[] a = m45751a();
            this.f25999b = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45751a() {
            boolean[] zArr = f25997N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4289779880645217020L, "com/instabug/library/usersteps/MotionEventRecognizer$GestureListener", 11);
            f25997N = a;
            return a;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean[] a = m45751a();
            C9801a.m45735a(this.f25999b, C9954a.DOUBLE_TAP, motionEvent);
            a[4] = true;
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            boolean[] a = m45751a();
            this.f25998a = motionEvent;
            a[1] = true;
            boolean onDown = super.onDown(motionEvent);
            a[2] = true;
            return onDown;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean[] a = m45751a();
            if (motionEvent == null) {
                motionEvent = this.f25998a;
                a[6] = true;
            } else {
                a[7] = true;
            }
            a[8] = true;
            C9801a.m45735a(this.f25999b, C9954a.FLING, motionEvent);
            a[9] = true;
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            boolean[] a = m45751a();
            C9801a.m45735a(this.f25999b, C9954a.LONG_PRESS, motionEvent);
            a[5] = true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            boolean[] a = m45751a();
            C9801a.m45735a(this.f25999b, C9954a.TAP, motionEvent);
            a[3] = true;
            return false;
        }

        /* synthetic */ C9805c(C9801a aVar, C9802a aVar2) {
            boolean[] a = m45751a();
            this(aVar);
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.library.e.a$d */
    /* compiled from: MotionEventRecognizer */
    private class C9806d extends SimpleOnScaleGestureListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26000b;

        /* renamed from: a */
        final /* synthetic */ C9801a f26001a;

        private C9806d(C9801a aVar) {
            boolean[] a = m45752a();
            this.f26001a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45752a() {
            boolean[] zArr = f26000b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7588562953501960012L, "com/instabug/library/usersteps/MotionEventRecognizer$PinchListener", 5);
            f26000b = a;
            return a;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            boolean[] a = m45752a();
            C9801a aVar = this.f26001a;
            C9954a aVar2 = C9954a.PINCH;
            float focusX = scaleGestureDetector.getFocusX();
            a[1] = true;
            float focusY = scaleGestureDetector.getFocusY();
            a[2] = true;
            C9801a.m45734a(aVar, aVar2, focusX, focusY);
            a[3] = true;
            return true;
        }

        /* synthetic */ C9806d(C9801a aVar, C9802a aVar2) {
            boolean[] a = m45752a();
            this(aVar);
            a[4] = true;
        }
    }

    private C9801a() {
        boolean[] d = m45744d();
        d[0] = true;
        d[1] = true;
        this.f25993b = new ScaleGestureDetector(Instabug.getApplicationContext(), new C9806d(this, null));
        d[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45734a(C9801a aVar, C9954a aVar2, float f, float f2) {
        boolean[] d = m45744d();
        aVar.m45736a(aVar2, f, f2);
        d[131] = true;
    }

    /* renamed from: b */
    private boolean m45740b(View view) {
        boolean z;
        boolean[] d = m45744d();
        if (view instanceof SwitchCompat) {
            d[60] = true;
        } else if (view instanceof AbsSeekBar) {
            d[61] = true;
        } else if (view instanceof ViewPager) {
            d[62] = true;
        } else {
            z = false;
            d[64] = true;
            d[65] = true;
            return z;
        }
        d[63] = true;
        z = true;
        d[65] = true;
        return z;
    }

    @C0195i0
    /* renamed from: c */
    private String m45741c(View view) {
        String str;
        boolean[] d = m45744d();
        d[66] = true;
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof String)) {
            d[67] = true;
            str = null;
        } else {
            d[68] = true;
            str = (String) textView.getText();
            d[69] = true;
            String trimString = StringUtility.trimString(str, 15);
            d[70] = true;
            if (trimString.length() >= str.length()) {
                d[71] = true;
            } else {
                d[72] = true;
                StringBuilder sb = new StringBuilder();
                sb.append(trimString);
                sb.append("...");
                str = sb.toString();
                d[73] = true;
            }
        }
        d[74] = true;
        return str;
    }

    /* renamed from: d */
    private C9803b m45743d(View view) {
        boolean[] d = m45744d();
        if (m45738a(view)) {
            d[115] = true;
            C9803b a = C9803b.m45747a(view);
            d[116] = true;
            return a;
        } else if (m45740b(view)) {
            d[117] = true;
            C9803b b = C9803b.m45749b(view);
            d[118] = true;
            return b;
        } else {
            C9803b e = m45745e(view);
            d[119] = true;
            return e;
        }
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m45744d() {
        boolean[] zArr = f25991d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2373239898194270281L, "com/instabug/library/usersteps/MotionEventRecognizer", C13959t.f40847U1);
        f25991d = a;
        return a;
    }

    /* renamed from: e */
    private C9803b m45745e(View view) {
        boolean[] d = m45744d();
        ViewParent parent = view.getParent();
        d[120] = true;
        while (true) {
            if (parent == null) {
                d[121] = true;
                break;
            } else if (!(parent instanceof ViewGroup)) {
                d[122] = true;
                break;
            } else {
                View view2 = (View) parent;
                d[123] = true;
                if (m45738a(view2)) {
                    d[124] = true;
                    C9803b a = C9803b.m45747a(view2);
                    d[125] = true;
                    return a;
                } else if (m45740b(view2)) {
                    d[126] = true;
                    C9803b b = C9803b.m45749b(view2);
                    d[127] = true;
                    return b;
                } else {
                    parent = parent.getParent();
                    d[128] = true;
                }
            }
        }
        d[129] = true;
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m45735a(C9801a aVar, C9954a aVar2, MotionEvent motionEvent) {
        boolean[] d = m45744d();
        aVar.m45737a(aVar2, motionEvent);
        d[130] = true;
    }

    /* renamed from: b */
    private boolean m45739b() {
        boolean z;
        boolean[] d = m45744d();
        if (C9780c.m45631b().mo34869b(Feature.TRACK_USER_STEPS) == State.ENABLED) {
            d[75] = true;
            z = true;
        } else {
            z = false;
            d[76] = true;
        }
        d[77] = true;
        return z;
    }

    /* renamed from: a */
    public static C9801a m45732a() {
        boolean[] d = m45744d();
        if (f25990c != null) {
            d[3] = true;
        } else {
            d[4] = true;
            f25990c = new C9801a();
            d[5] = true;
        }
        C9801a aVar = f25990c;
        d[6] = true;
        return aVar;
    }

    /* renamed from: a */
    public void mo34925a(MotionEvent motionEvent) {
        boolean[] d = m45744d();
        this.f25992a.onTouchEvent(motionEvent);
        d[7] = true;
        this.f25993b.onTouchEvent(motionEvent);
        d[8] = true;
    }

    /* renamed from: c */
    private boolean m45742c() {
        boolean z;
        boolean[] d = m45744d();
        if (C9780c.m45631b().mo34869b(Feature.REPRO_STEPS) == State.ENABLED) {
            d[78] = true;
            z = true;
        } else {
            z = false;
            d[79] = true;
        }
        d[80] = true;
        return z;
    }

    /* renamed from: a */
    private void m45737a(C9954a aVar, MotionEvent motionEvent) {
        boolean[] d = m45744d();
        m45736a(aVar, (float) ((int) motionEvent.getRawX()), (float) ((int) motionEvent.getRawY()));
        d[9] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45736a(com.instabug.library.model.C9953d.C9954a r11, float r12, float r13) {
        /*
            r10 = this;
            boolean[] r0 = m45744d()
            com.instabug.library.tracking.InstabugInternalTrackingDelegate r1 = com.instabug.library.tracking.InstabugInternalTrackingDelegate.getInstance()
            android.app.Activity r1 = r1.getTargetActivity()
            r2 = 1
            if (r1 != 0) goto L_0x0014
            r11 = 10
            r0[r11] = r2
            return
        L_0x0014:
            android.view.View r12 = r10.m45730a(r1, r12, r13)
            if (r12 != 0) goto L_0x001f
            r11 = 11
            r0[r11] = r2
            return
        L_0x001f:
            com.instabug.library.model.d$a r13 = com.instabug.library.model.C9953d.C9954a.FLING
            if (r11 == r13) goto L_0x0029
            r13 = 12
            r0[r13] = r2
            r13 = r12
            goto L_0x0056
        L_0x0029:
            r13 = 13
            r0[r13] = r2
            com.instabug.library.e.a$b r12 = r10.m45743d(r12)
            if (r12 != 0) goto L_0x0038
            r11 = 14
            r0[r11] = r2
            return
        L_0x0038:
            android.view.View r13 = r12.f25995a
            com.instabug.library.e.a$b$a r12 = r12.f25996b
            com.instabug.library.e.a$b$a r3 = com.instabug.library.p383e.C9801a.C9803b.C9804a.SCROLLABLE
            if (r12 != r3) goto L_0x0047
            com.instabug.library.model.d$a r11 = com.instabug.library.model.C9953d.C9954a.SCROLL
            r12 = 15
            r0[r12] = r2
            goto L_0x0056
        L_0x0047:
            com.instabug.library.e.a$b$a r3 = com.instabug.library.p383e.C9801a.C9803b.C9804a.SWIPEABLE
            if (r12 == r3) goto L_0x0050
            r12 = 16
            r0[r12] = r2
            goto L_0x0056
        L_0x0050:
            com.instabug.library.model.d$a r11 = com.instabug.library.model.C9953d.C9954a.SWIPE
            r12 = 17
            r0[r12] = r2
        L_0x0056:
            r12 = 0
            boolean r3 = r13 instanceof android.widget.TextView
            if (r3 != 0) goto L_0x0060
            r3 = 18
            r0[r3] = r2
            goto L_0x006c
        L_0x0060:
            r12 = 19
            r0[r12] = r2
            java.lang.String r12 = r10.m45741c(r13)
            r3 = 20
            r0[r3] = r2
        L_0x006c:
            if (r13 != 0) goto L_0x0074
            r11 = 21
            r0[r11] = r2
            goto L_0x0149
        L_0x0074:
            r3 = 22
            r0[r3] = r2
            int r3 = r13.getId()
            java.lang.String r9 = m45733a(r1, r3)
            r3 = 23
            r0[r3] = r2
            boolean r3 = r10.m45739b()
            if (r3 != 0) goto L_0x008f
            r3 = 24
            r0[r3] = r2
            goto L_0x00dc
        L_0x008f:
            r3 = 25
            r0[r3] = r2
            java.lang.Class r3 = r13.getClass()
            java.lang.String r3 = r3.getName()
            r4 = 26
            r0[r4] = r2
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 27
            r0[r5] = r2
            java.lang.String r5 = com.instabug.library.p383e.C9807b.m45756a(r11, r3, r9, r12, r4)
            r3 = 28
            r0[r3] = r2
            com.instabug.library.tracking.d r3 = com.instabug.library.tracking.C9995d.m46539c()
            r4 = 29
            r0[r4] = r2
            java.lang.Class r4 = r13.getClass()
            java.lang.String r6 = r4.getName()
            r4 = 30
            r0[r4] = r2
            java.lang.Class r4 = r1.getClass()
            java.lang.String r8 = r4.getName()
            r4 = 31
            r0[r4] = r2
            r4 = r11
            r7 = r12
            r3.mo35845a(r4, r5, r6, r7, r8)
            r3 = 32
            r0[r3] = r2
        L_0x00dc:
            boolean r3 = r10.m45742c()
            if (r3 != 0) goto L_0x00e7
            r11 = 33
            r0[r11] = r2
            goto L_0x0149
        L_0x00e7:
            r3 = 34
            r0[r3] = r2
            if (r12 != 0) goto L_0x00f2
            r12 = 35
            r0[r12] = r2
            goto L_0x00fc
        L_0x00f2:
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L_0x0111
            r12 = 36
            r0[r12] = r2
        L_0x00fc:
            if (r9 == 0) goto L_0x0104
            r12 = 38
            r0[r12] = r2
            r12 = r9
            goto L_0x0115
        L_0x0104:
            java.lang.Class r12 = r13.getClass()
            java.lang.String r12 = r12.getName()
            r13 = 39
            r0[r13] = r2
            goto L_0x0115
        L_0x0111:
            r13 = 37
            r0[r13] = r2
        L_0x0115:
            com.instabug.library.model.d$a r13 = com.instabug.library.model.C9953d.C9954a.PINCH
            if (r11 == r13) goto L_0x011e
            r13 = 40
            r0[r13] = r2
            goto L_0x012e
        L_0x011e:
            r12 = 41
            r0[r12] = r2
            java.lang.Class r12 = r1.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r13 = 42
            r0[r13] = r2
        L_0x012e:
            com.instabug.library.visualusersteps.d r13 = com.instabug.library.visualusersteps.C10040d.m46740b()
            r3 = 43
            r0[r3] = r2
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r3 = 44
            r0[r3] = r2
            r13.mo36088a(r11, r1, r12)
            r11 = 45
            r0[r11] = r2
        L_0x0149:
            r11 = 46
            r0[r11] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p383e.C9801a.m45736a(com.instabug.library.model.d$a, float, float):void");
    }

    /* renamed from: a */
    private boolean m45738a(View view) {
        boolean z;
        boolean[] d = m45744d();
        if (view instanceof ScrollView) {
            d[47] = true;
        } else if (view instanceof HorizontalScrollView) {
            d[48] = true;
        } else if (view instanceof GridView) {
            d[49] = true;
        } else if (view instanceof ListView) {
            d[50] = true;
        } else if (view instanceof WebView) {
            d[51] = true;
        } else if (view instanceof NestedScrollView) {
            d[52] = true;
        } else {
            d[53] = true;
            if (view.getClass().getName().equals("androidx.recyclerview.widget.RecyclerView")) {
                d[54] = true;
            } else {
                d[55] = true;
                if (view.getClass().getName().equals("com.google.android.material.tabs.TabLayout")) {
                    d[56] = true;
                } else {
                    z = false;
                    d[58] = true;
                    d[59] = true;
                    return z;
                }
            }
        }
        d[57] = true;
        z = true;
        d[59] = true;
        return z;
    }

    /* renamed from: a */
    private static String m45733a(Context context, int i) {
        String str;
        boolean[] d = m45744d();
        if (i != -1) {
            d[81] = true;
            if (context == null) {
                try {
                    d[83] = true;
                } catch (NotFoundException unused) {
                    d[89] = true;
                    return null;
                }
            } else if (context.getResources() == null) {
                d[84] = true;
            } else {
                d[85] = true;
                str = context.getResources().getResourceEntryName(i);
                d[86] = true;
                d[88] = true;
                return str;
            }
            d[87] = true;
            str = null;
            d[88] = true;
            return str;
        }
        d[82] = true;
        return null;
    }

    /* renamed from: a */
    private View m45730a(Activity activity, float f, float f2) {
        boolean[] d = m45744d();
        View a = m45731a(activity.getWindow().getDecorView(), (int) f, (int) f2);
        d[90] = true;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad A[LOOP:0: B:17:0x0057->B:37:0x00ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m45731a(android.view.View r8, int r9, int r10) {
        /*
            r7 = this;
            boolean[] r0 = m45744d()
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r3 = 91
            r0[r3] = r2
            r8.getLocationInWindow(r1)
            r3 = 92
            r0[r3] = r2
            r3 = r1[r2]
            r4 = 0
            if (r10 >= r3) goto L_0x001d
            r8 = 93
            r0[r8] = r2
            goto L_0x0046
        L_0x001d:
            r3 = 0
            r5 = r1[r3]
            if (r9 >= r5) goto L_0x0027
            r8 = 94
            r0[r8] = r2
            goto L_0x0046
        L_0x0027:
            r5 = r1[r2]
            int r6 = r8.getHeight()
            int r5 = r5 + r6
            if (r10 <= r5) goto L_0x0035
            r8 = 95
            r0[r8] = r2
            goto L_0x0046
        L_0x0035:
            r1 = r1[r3]
            r5 = 96
            r0[r5] = r2
            int r5 = r8.getWidth()
            int r1 = r1 + r5
            if (r9 <= r1) goto L_0x004b
            r8 = 97
            r0[r8] = r2
        L_0x0046:
            r8 = 113(0x71, float:1.58E-43)
            r0[r8] = r2
            return r4
        L_0x004b:
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00b4
            r1 = 98
            r0[r1] = r2
            r1 = 99
            r0[r1] = r2
        L_0x0057:
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r5 = r1.getChildCount()
            if (r3 < r5) goto L_0x0065
            r9 = 100
            r0[r9] = r2
            goto L_0x00a0
        L_0x0065:
            r5 = 101(0x65, float:1.42E-43)
            r0[r5] = r2
            android.view.View r1 = r1.getChildAt(r3)
            boolean r5 = r1 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x008a
            r5 = 102(0x66, float:1.43E-43)
            r0[r5] = r2
            android.view.View r1 = r7.m45731a(r1, r9, r10)
            if (r1 != 0) goto L_0x0081
            r1 = 103(0x67, float:1.44E-43)
            r0[r1] = r2
            r1 = r4
            goto L_0x0085
        L_0x0081:
            r4 = 104(0x68, float:1.46E-43)
            r0[r4] = r2
        L_0x0085:
            r4 = 105(0x69, float:1.47E-43)
            r0[r4] = r2
            goto L_0x0099
        L_0x008a:
            android.view.View r1 = r7.m45731a(r1, r9, r10)
            if (r1 != 0) goto L_0x0095
            r1 = 106(0x6a, float:1.49E-43)
            r0[r1] = r2
            goto L_0x009a
        L_0x0095:
            r4 = 107(0x6b, float:1.5E-43)
            r0[r4] = r2
        L_0x0099:
            r4 = r1
        L_0x009a:
            if (r4 == 0) goto L_0x00ad
            r9 = 108(0x6c, float:1.51E-43)
            r0[r9] = r2
        L_0x00a0:
            if (r4 == 0) goto L_0x00a8
            r8 = 110(0x6e, float:1.54E-43)
            r0[r8] = r2
            r8 = r4
            goto L_0x00b8
        L_0x00a8:
            r9 = 111(0x6f, float:1.56E-43)
            r0[r9] = r2
            goto L_0x00b8
        L_0x00ad:
            int r3 = r3 + 1
            r1 = 109(0x6d, float:1.53E-43)
            r0[r1] = r2
            goto L_0x0057
        L_0x00b4:
            r9 = 112(0x70, float:1.57E-43)
            r0[r9] = r2
        L_0x00b8:
            r9 = 114(0x72, float:1.6E-43)
            r0[r9] = r2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p383e.C9801a.m45731a(android.view.View, int, int):android.view.View");
    }
}
