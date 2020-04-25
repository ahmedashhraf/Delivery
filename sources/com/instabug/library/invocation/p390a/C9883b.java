package com.instabug.library.invocation.p390a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.invocation.C9909b;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.a.b */
/* compiled from: FloatingButtonInvoker */
public class C9883b implements OnClickListener, C9882a<Void> {

    /* renamed from: X */
    static final /* synthetic */ boolean f26233X;

    /* renamed from: Y */
    private static transient /* synthetic */ boolean[] f26234Y;

    /* renamed from: N */
    int f26235N = 0;

    /* renamed from: O */
    private int f26236O;

    /* renamed from: P */
    private int f26237P = 0;

    /* renamed from: Q */
    int f26238Q = 0;

    /* renamed from: R */
    int f26239R = 0;

    /* renamed from: S */
    int f26240S = 0;

    /* renamed from: T */
    float f26241T;

    /* renamed from: U */
    private C9909b f26242U;

    /* renamed from: V */
    private C9888d f26243V;

    /* renamed from: W */
    private int f26244W;

    /* renamed from: a */
    private LayoutParams f26245a;

    /* renamed from: b */
    int f26246b;

    /* renamed from: com.instabug.library.invocation.a.b$b */
    /* compiled from: FloatingButtonInvoker */
    static class C9885b extends SimpleOnGestureListener {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26247a;

        C9885b() {
            m46004a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46004a() {
            boolean[] zArr = f26247a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5922573312864391550L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker$FlingListener", 6);
            f26247a = a;
            return a;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            boolean[] a = m46004a();
            if (Math.abs(motionEvent2.getX() - motionEvent.getX()) >= 90.0f) {
                a[1] = true;
            } else if (motionEvent2.getY() - motionEvent.getY() <= 90.0f) {
                a[2] = true;
            } else {
                a[3] = true;
                z = true;
                a[5] = true;
                return z;
            }
            z = false;
            a[4] = true;
            a[5] = true;
            return z;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.b$c */
    /* compiled from: FloatingButtonInvoker */
    public class C9886c extends ImageButton {

        /* renamed from: T */
        private static transient /* synthetic */ boolean[] f26248T;

        /* renamed from: N */
        private C9887a f26249N;

        /* renamed from: O */
        private long f26250O;

        /* renamed from: P */
        private float f26251P;

        /* renamed from: Q */
        private float f26252Q;

        /* renamed from: R */
        private boolean f26253R = false;

        /* renamed from: S */
        final /* synthetic */ C9883b f26254S;

        /* renamed from: a */
        private GestureDetector f26255a;

        /* renamed from: b */
        private boolean f26256b = true;

        /* renamed from: com.instabug.library.invocation.a.b$c$a */
        /* compiled from: FloatingButtonInvoker */
        private class C9887a implements Runnable {

            /* renamed from: Q */
            private static transient /* synthetic */ boolean[] f26257Q;

            /* renamed from: N */
            private float f26258N;

            /* renamed from: O */
            private long f26259O;

            /* renamed from: P */
            final /* synthetic */ C9886c f26260P;

            /* renamed from: a */
            private Handler f26261a;

            /* renamed from: b */
            private float f26262b;

            private C9887a(C9886c cVar) {
                boolean[] b = m46014b();
                this.f26260P = cVar;
                b[0] = true;
                this.f26261a = new Handler(Looper.getMainLooper());
                b[1] = true;
            }

            /* renamed from: a */
            static /* synthetic */ void m46012a(C9887a aVar) {
                boolean[] b = m46014b();
                aVar.m46010a();
                b[14] = true;
            }

            /* renamed from: b */
            private static /* synthetic */ boolean[] m46014b() {
                boolean[] zArr = f26257Q;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(3192176438674878457L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker$FloatingButton$MoveAnimator", 16);
                f26257Q = a;
                return a;
            }

            public void run() {
                boolean[] b = m46014b();
                if (this.f26260P.getParent() == null) {
                    b[5] = true;
                } else {
                    b[6] = true;
                    float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f26259O)) / 400.0f);
                    float f = this.f26262b;
                    C9886c cVar = this.f26260P;
                    C9883b bVar = cVar.f26254S;
                    int i = bVar.f26246b;
                    float f2 = (f - ((float) i)) * min;
                    float f3 = this.f26258N;
                    int i2 = bVar.f26235N;
                    float f4 = (f3 - ((float) i2)) * min;
                    b[7] = true;
                    cVar.mo35190a((int) (((float) i) + f2), (int) (((float) i2) + f4));
                    if (min >= 1.0f) {
                        b[8] = true;
                    } else {
                        b[9] = true;
                        this.f26261a.post(this);
                        b[10] = true;
                    }
                }
                b[11] = true;
            }

            /* renamed from: a */
            static /* synthetic */ void m46013a(C9887a aVar, float f, float f2) {
                boolean[] b = m46014b();
                aVar.m46011a(f, f2);
                b[15] = true;
            }

            /* synthetic */ C9887a(C9886c cVar, C9884a aVar) {
                boolean[] b = m46014b();
                this(cVar);
                b[13] = true;
            }

            /* renamed from: a */
            private void m46011a(float f, float f2) {
                boolean[] b = m46014b();
                this.f26262b = f;
                this.f26258N = f2;
                b[2] = true;
                this.f26259O = System.currentTimeMillis();
                b[3] = true;
                this.f26261a.post(this);
                b[4] = true;
            }

            /* renamed from: a */
            private void m46010a() {
                boolean[] b = m46014b();
                this.f26261a.removeCallbacks(this);
                b[12] = true;
            }
        }

        public C9886c(C9883b bVar, Context context) {
            boolean[] b = m46007b();
            this.f26254S = bVar;
            b[0] = true;
            super(context);
            b[1] = true;
            this.f26255a = new GestureDetector(context, new C9885b());
            b[2] = true;
            this.f26249N = new C9887a(this, null);
            b[3] = true;
            setId(C9700R.C9704id.instabug_floating_button);
            b[4] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m46006a(C9886c cVar) {
            boolean[] b = m46007b();
            cVar.m46005a();
            b[70] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46007b() {
            boolean[] zArr = f26248T;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4597554791581101406L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker$FloatingButton", 71);
            f26248T = a;
            return a;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean[] b = m46007b();
            if (!this.f26256b) {
                b[13] = true;
                z = false;
            } else {
                b[14] = true;
                z = this.f26255a.onTouchEvent(motionEvent);
                b[15] = true;
            }
            if (z) {
                b[16] = true;
                m46005a();
                b[17] = true;
            } else {
                float rawX = motionEvent.getRawX();
                b[18] = true;
                float rawY = motionEvent.getRawY();
                b[19] = true;
                int action = motionEvent.getAction();
                if (action == 0) {
                    b[20] = true;
                    this.f26250O = System.currentTimeMillis();
                    b[21] = true;
                    C9887a.m46012a(this.f26249N);
                    this.f26253R = true;
                    b[22] = true;
                } else if (action == 1) {
                    b[23] = true;
                    if (System.currentTimeMillis() - this.f26250O >= 200) {
                        b[24] = true;
                    } else {
                        b[25] = true;
                        performClick();
                        b[26] = true;
                    }
                    this.f26253R = false;
                    b[27] = true;
                    m46005a();
                    b[28] = true;
                } else if (action != 2) {
                    b[29] = true;
                } else if (!this.f26253R) {
                    b[30] = true;
                } else {
                    b[31] = true;
                    mo35189a(rawX - this.f26251P, rawY - this.f26252Q);
                    b[32] = true;
                }
                this.f26251P = rawX;
                this.f26252Q = rawY;
                b[33] = true;
            }
            b[34] = true;
            return true;
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            boolean[] b = m46007b();
            C9883b.m45994a(this.f26254S, (LayoutParams) layoutParams);
            b[11] = true;
            super.setLayoutParams(layoutParams);
            b[12] = true;
        }

        /* renamed from: a */
        private void m46005a() {
            float f;
            float f2;
            float f3;
            float f4;
            boolean[] b = m46007b();
            if (InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().f26265a == InstabugFloatingButtonEdge.LEFT) {
                b[35] = true;
                C9883b bVar = this.f26254S;
                if (((float) bVar.f26246b) >= ((float) C9883b.m45993a(bVar)) / 2.0f) {
                    f3 = (float) ((C9883b.m45993a(this.f26254S) - C9883b.m45996b(this.f26254S)) + 10);
                    b[36] = true;
                } else {
                    f3 = -10.0f;
                    b[37] = true;
                }
                b[38] = true;
                C9887a aVar = this.f26249N;
                C9883b bVar2 = this.f26254S;
                if (bVar2.f26235N > C9883b.m45998c(bVar2) - C9883b.m45996b(this.f26254S)) {
                    f4 = (float) (C9883b.m45998c(this.f26254S) - (C9883b.m45996b(this.f26254S) * 2));
                    b[39] = true;
                } else {
                    f4 = (float) this.f26254S.f26235N;
                    b[40] = true;
                }
                C9887a.m46013a(aVar, f3, f4);
                b[41] = true;
            } else {
                C9883b bVar3 = this.f26254S;
                if (((float) bVar3.f26246b) >= ((float) C9883b.m45993a(bVar3)) / 2.0f) {
                    f = (float) (C9883b.m45993a(this.f26254S) + 10);
                    b[42] = true;
                } else {
                    f = (float) (C9883b.m45996b(this.f26254S) - 10);
                    b[43] = true;
                }
                b[44] = true;
                C9887a aVar2 = this.f26249N;
                C9883b bVar4 = this.f26254S;
                if (bVar4.f26235N > C9883b.m45998c(bVar4) - C9883b.m45996b(this.f26254S)) {
                    f2 = (float) (C9883b.m45998c(this.f26254S) - (C9883b.m45996b(this.f26254S) * 2));
                    b[45] = true;
                } else {
                    f2 = (float) this.f26254S.f26235N;
                    b[46] = true;
                }
                C9887a.m46013a(aVar2, f, f2);
                b[47] = true;
            }
            b[48] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35190a(int i, int i2) {
            boolean[] b = m46007b();
            C9883b bVar = this.f26254S;
            bVar.f26246b = i;
            bVar.f26235N = i2;
            b[49] = true;
            LayoutParams d = C9883b.m45999d(bVar);
            C9883b bVar2 = this.f26254S;
            d.leftMargin = bVar2.f26246b + 0;
            b[50] = true;
            LayoutParams d2 = C9883b.m45999d(bVar2);
            int a = C9883b.m45993a(this.f26254S);
            C9883b bVar3 = this.f26254S;
            d2.rightMargin = a - bVar3.f26246b;
            b[51] = true;
            if (bVar3.f26240S != 2) {
                b[52] = true;
            } else if (bVar3.f26238Q <= C9883b.m45993a(bVar3)) {
                b[53] = true;
            } else {
                b[54] = true;
                C9883b.m45999d(this.f26254S).rightMargin = (int) (((float) C9883b.m45999d(this.f26254S).rightMargin) + (this.f26254S.f26241T * 48.0f));
                b[55] = true;
            }
            LayoutParams d3 = C9883b.m45999d(this.f26254S);
            C9883b bVar4 = this.f26254S;
            d3.topMargin = bVar4.f26235N + 0;
            b[56] = true;
            LayoutParams d4 = C9883b.m45999d(bVar4);
            int c = C9883b.m45998c(this.f26254S);
            C9883b bVar5 = this.f26254S;
            d4.bottomMargin = c - bVar5.f26235N;
            b[57] = true;
            setLayoutParams(C9883b.m45999d(bVar5));
            b[58] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35189a(float f, float f2) {
            boolean[] b = m46007b();
            C9883b bVar = this.f26254S;
            int i = bVar.f26235N;
            if (((float) i) + f2 <= 50.0f) {
                b[59] = true;
            } else {
                b[60] = true;
                mo35190a((int) (((float) bVar.f26246b) + f), (int) (((float) i) + f2));
                b[61] = true;
            }
            if (!this.f26256b) {
                b[62] = true;
            } else if (this.f26253R) {
                b[63] = true;
            } else if (Math.abs(C9883b.m45999d(this.f26254S).rightMargin) >= 50) {
                b[64] = true;
            } else {
                C9883b bVar2 = this.f26254S;
                b[65] = true;
                if (Math.abs(C9883b.m45999d(bVar2).topMargin - (getContext().getResources().getDisplayMetrics().heightPixels / 2)) >= 250) {
                    b[66] = true;
                } else {
                    b[67] = true;
                    m46005a();
                    b[68] = true;
                }
            }
            b[69] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.b$d */
    /* compiled from: FloatingButtonInvoker */
    public static class C9888d extends FrameLayout {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26263a;

        public C9888d(Context context) {
            boolean[] a = m46015a();
            super(context);
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46015a() {
            boolean[] zArr = f26263a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8209219294474489059L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker$FloatingButtonFrameLayout", 4);
            f26263a = a;
            return a;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.b$e */
    /* compiled from: FloatingButtonInvoker */
    public static class C9889e {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26264c;

        /* renamed from: a */
        public InstabugFloatingButtonEdge f26265a = InstabugFloatingButtonEdge.RIGHT;

        /* renamed from: b */
        public int f26266b = C1750f.f6813c;

        public C9889e() {
            boolean[] a = m46016a();
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46016a() {
            boolean[] zArr = f26264c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7487033171981564636L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker$FloatingButtonParams", 1);
            f26264c = a;
            return a;
        }
    }

    static {
        boolean z;
        boolean[] e = m46000e();
        if (!C9883b.class.desiredAssertionStatus()) {
            e[66] = true;
            z = true;
        } else {
            z = false;
            e[67] = true;
        }
        f26233X = z;
        e[68] = true;
    }

    public C9883b(C9909b bVar) {
        boolean[] e = m46000e();
        this.f26242U = bVar;
        e[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ int m45993a(C9883b bVar) {
        boolean[] e = m46000e();
        int i = bVar.f26236O;
        e[62] = true;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m45996b(C9883b bVar) {
        boolean[] e = m46000e();
        int i = bVar.f26244W;
        e[63] = true;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m45998c(C9883b bVar) {
        boolean[] e = m46000e();
        int i = bVar.f26237P;
        e[64] = true;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ LayoutParams m45999d(C9883b bVar) {
        boolean[] e = m46000e();
        LayoutParams layoutParams = bVar.f26245a;
        e[65] = true;
        return layoutParams;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m46000e() {
        boolean[] zArr = f26234Y;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4479385837098643869L, "com/instabug/library/invocation/invoker/FloatingButtonInvoker", 69);
        f26234Y = a;
        return a;
    }

    public void onClick(View view) {
        boolean[] e = m46000e();
        this.f26242U.onInvocationRequested();
        e[59] = true;
    }

    /* renamed from: a */
    static /* synthetic */ LayoutParams m45994a(C9883b bVar, LayoutParams layoutParams) {
        boolean[] e = m46000e();
        bVar.f26245a = layoutParams;
        e[61] = true;
        return layoutParams;
    }

    /* renamed from: b */
    private void m45997b() {
        boolean[] e = m46000e();
        C9888d dVar = this.f26243V;
        if (dVar == null) {
            e[48] = true;
        } else {
            e[49] = true;
            dVar.setOnClickListener(null);
            e[50] = true;
            if (this.f26243V.getParent() == null) {
                e[51] = true;
            } else if (!(this.f26243V.getParent() instanceof ViewGroup)) {
                e[52] = true;
            } else {
                e[53] = true;
                ViewGroup viewGroup = (ViewGroup) this.f26243V.getParent();
                e[54] = true;
                viewGroup.removeView(this.f26243V);
                e[55] = true;
            }
        }
        e[56] = true;
    }

    /* renamed from: c */
    public void mo35184c() {
        boolean[] e = m46000e();
        m45997b();
        e[7] = true;
    }

    /* renamed from: d */
    public void mo35185d() {
        boolean[] e = m46000e();
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        e[1] = true;
        Activity currentActivity = instance.getCurrentActivity();
        if (currentActivity == null) {
            e[2] = true;
        } else {
            e[3] = true;
            m45995a(currentActivity);
            e[4] = true;
        }
        e[5] = true;
    }

    /* renamed from: a */
    private void m45995a(Activity activity) {
        Activity activity2 = activity;
        boolean[] e = m46000e();
        this.f26243V = new C9888d(activity2);
        e[8] = true;
        this.f26240S = activity.getResources().getConfiguration().orientation;
        e[9] = true;
        this.f26241T = activity.getResources().getDisplayMetrics().density;
        e[10] = true;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = this.f26236O;
        int i2 = this.f26237P;
        e[11] = true;
        this.f26237P = activity.getResources().getDisplayMetrics().heightPixels;
        e[12] = true;
        this.f26236O = activity.getResources().getDisplayMetrics().widthPixels;
        if (VERSION.SDK_INT < 17) {
            e[13] = true;
        } else {
            e[14] = true;
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            this.f26239R = displayMetrics.heightPixels;
            this.f26238Q = displayMetrics.widthPixels;
            e[15] = true;
        }
        this.f26244W = (int) (this.f26241T * 56.0f);
        e[16] = true;
        C9886c cVar = new C9886c(this, activity2);
        e[17] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        e[18] = true;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        e[19] = true;
        shapeDrawable2.getPaint().setColor(Instabug.getPrimaryColor());
        e[20] = true;
        shapeDrawable.getPaint().setColor(Instabug.getPrimaryColor());
        Drawable[] drawableArr = {shapeDrawable2, shapeDrawable};
        e[21] = true;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        e[22] = true;
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, 0, 0, 0, 0);
        e[23] = true;
        layerDrawable2.setLayerInset(1, 2, 2, 2, 2);
        e[24] = true;
        cVar.setBackgroundDrawable(layerDrawable);
        e[25] = true;
        Drawable drawable = activity.getResources().getDrawable(C9700R.C9703drawable.instabug_ic_floating_btn);
        e[26] = true;
        if (f26233X) {
            e[27] = true;
        } else if (drawable != null) {
            e[28] = true;
        } else {
            AssertionError assertionError = new AssertionError();
            e[29] = true;
            throw assertionError;
        }
        cVar.setImageDrawable(drawable);
        e[30] = true;
        cVar.setScaleType(ScaleType.CENTER);
        if (this.f26245a == null) {
            e[31] = true;
            if (InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().f26265a == InstabugFloatingButtonEdge.LEFT) {
                e[32] = true;
                int i3 = this.f26244W;
                this.f26245a = new LayoutParams(i3, i3, 51);
                e[33] = true;
                cVar.setLayoutParams(this.f26245a);
                e[34] = true;
                cVar.mo35190a(-10, InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().f26266b);
                e[35] = true;
            } else {
                int i4 = this.f26244W;
                this.f26245a = new LayoutParams(i4, i4, 53);
                e[36] = true;
                cVar.setLayoutParams(this.f26245a);
                e[37] = true;
                cVar.mo35190a(this.f26236O + 10, InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().f26266b);
                e[38] = true;
            }
        } else {
            float f = ((float) (this.f26246b * this.f26236O)) / ((float) i);
            float f2 = ((float) (this.f26235N * this.f26237P)) / ((float) i2);
            e[39] = true;
            this.f26246b = Math.round(f);
            e[40] = true;
            this.f26235N = Math.round(f2);
            LayoutParams layoutParams = this.f26245a;
            int i5 = this.f26246b;
            layoutParams.leftMargin = i5;
            layoutParams.rightMargin = this.f26236O - i5;
            int i6 = this.f26235N;
            layoutParams.topMargin = i6;
            layoutParams.bottomMargin = this.f26237P - i6;
            e[41] = true;
            cVar.setLayoutParams(layoutParams);
            e[42] = true;
            C9886c.m46006a(cVar);
            e[43] = true;
        }
        cVar.setOnClickListener(this);
        e[44] = true;
        cVar.setScaleType(ScaleType.CENTER_INSIDE);
        e[45] = true;
        this.f26243V.addView(cVar);
        e[46] = true;
        ((FrameLayout) activity.getWindow().getDecorView()).addView(this.f26243V, new ViewGroup.LayoutParams(-1, -1));
        e[47] = true;
    }

    /* renamed from: a */
    public void mo35186a() {
        boolean[] e = m46000e();
        mo35184c();
        this.f26245a = null;
        e[57] = true;
        mo35185d();
        e[58] = true;
    }
}
