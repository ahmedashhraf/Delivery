package com.instabug.library.invocation.p390a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
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
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.internal.media.AudioPlayer;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.view.floatingactionbutton.C9874b;
import com.instabug.library.internal.view.floatingactionbutton.C9876c;
import com.instabug.library.internal.view.floatingactionbutton.RecordingFloatingActionButton;
import com.instabug.library.internal.view.floatingactionbutton.RecordingFloatingActionButton.RecordingState;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import com.instabug.library.p386i.p387a.C9820a;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.C10023d;
import com.instabug.library.util.InstabugSDKLogger;
import p195e.p196a.C5923b0;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.invocation.a.c */
/* compiled from: ScreenRecordingFab */
public class C9890c implements OnClickListener {

    /* renamed from: p0 */
    private static transient /* synthetic */ boolean[] f26267p0;

    /* renamed from: N */
    private int f26268N = 0;

    /* renamed from: O */
    private int f26269O = 0;

    /* renamed from: P */
    private int f26270P = 0;

    /* renamed from: Q */
    private int f26271Q = 0;

    /* renamed from: R */
    private int f26272R = 0;

    /* renamed from: S */
    private int f26273S = 0;

    /* renamed from: T */
    private int f26274T = 0;

    /* renamed from: U */
    private float f26275U;

    /* renamed from: V */
    private int f26276V;

    /* renamed from: W */
    private boolean f26277W = false;

    /* renamed from: X */
    private boolean f26278X = false;

    /* renamed from: Y */
    private boolean f26279Y;

    /* renamed from: Z */
    private boolean f26280Z = true;

    /* renamed from: a */
    private LayoutParams f26281a;

    /* renamed from: a0 */
    private C9874b f26282a0;

    /* renamed from: b */
    private final C12313b f26283b = new C12313b();

    /* renamed from: b0 */
    private C9876c f26284b0;

    /* renamed from: c0 */
    private C9820a f26285c0;

    /* renamed from: d0 */
    private int f26286d0;

    /* renamed from: e0 */
    private int f26287e0;

    /* renamed from: f0 */
    private int f26288f0;

    /* renamed from: g0 */
    private int f26289g0;

    /* renamed from: h0 */
    private int f26290h0;

    /* renamed from: i0 */
    private Handler f26291i0;

    /* renamed from: j0 */
    private long f26292j0;

    /* renamed from: k0 */
    private Runnable f26293k0;

    /* renamed from: l0 */
    private FrameLayout f26294l0;

    /* renamed from: m0 */
    private int f26295m0;

    /* renamed from: n0 */
    private C9898h f26296n0;

    /* renamed from: o0 */
    private C9901j f26297o0;

    /* renamed from: com.instabug.library.invocation.a.c$a */
    /* compiled from: ScreenRecordingFab */
    class C9891a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26298b;

        /* renamed from: a */
        final /* synthetic */ C9890c f26299a;

        C9891a(C9890c cVar) {
            boolean[] a = m46069a();
            this.f26299a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46069a() {
            boolean[] zArr = f26298b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1685026018905755424L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$1", 7);
            f26298b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46069a();
            long d = C9890c.m46030d(this.f26299a);
            a[1] = true;
            long currentTimeMillis = System.currentTimeMillis() - d;
            a[2] = true;
            C9898h e = C9890c.m46032e(this.f26299a);
            a[3] = true;
            String formattedDurationText = AudioPlayer.getFormattedDurationText(currentTimeMillis);
            a[4] = true;
            e.mo35120a(formattedDurationText, true);
            a[5] = true;
            C9890c.m46034f(this.f26299a).postDelayed(this, 1000);
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$b */
    /* compiled from: ScreenRecordingFab */
    class C9892b implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26300b;

        /* renamed from: a */
        final /* synthetic */ C9890c f26301a;

        C9892b(C9890c cVar) {
            boolean[] a = m46070a();
            this.f26301a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46070a() {
            boolean[] zArr = f26300b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(335715199806113112L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$2", 7);
            f26300b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m46070a();
            if (C9890c.m46036g(this.f26301a).mo35149b()) {
                a[1] = true;
                C10023d.m46637b(Instabug.getApplicationContext());
                a[2] = true;
                C9890c.m46024a(this.f26301a, false);
                a[3] = true;
            } else {
                C10023d.m46635a(Instabug.getApplicationContext());
                a[4] = true;
                C9890c.m46024a(this.f26301a, true);
                a[5] = true;
            }
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$c */
    /* compiled from: ScreenRecordingFab */
    class C9893c implements C12331g<Boolean> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26302b;

        /* renamed from: a */
        final /* synthetic */ C9890c f26303a;

        C9893c(C9890c cVar) {
            boolean[] a = m46071a();
            this.f26303a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46071a() {
            boolean[] zArr = f26302b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7315955725088961059L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$3", 3);
            f26302b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35200a(Boolean bool) {
            boolean[] a = m46071a();
            C9890c.m46038h(this.f26303a).setEnabled(bool.booleanValue());
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46071a();
            mo35200a((Boolean) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$d */
    /* compiled from: ScreenRecordingFab */
    class C9894d implements OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26304b;

        /* renamed from: a */
        final /* synthetic */ C9890c f26305a;

        C9894d(C9890c cVar) {
            boolean[] a = m46074a();
            this.f26305a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46074a() {
            boolean[] zArr = f26304b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8559818927946522487L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$4", 10);
            f26304b = a;
            return a;
        }

        public void onClick(View view) {
            boolean[] a = m46074a();
            if (!C9890c.m46041i(this.f26305a)) {
                a[1] = true;
            } else {
                a[2] = true;
                C9890c.m46043j(this.f26305a);
                a[3] = true;
                if (C9890c.m46044k(this.f26305a) == null) {
                    a[4] = true;
                } else {
                    a[5] = true;
                    C9890c.m46044k(this.f26305a).stop();
                    a[6] = true;
                }
                C9890c.m46028b(this.f26305a, false);
                a[7] = true;
                C9890c.m46034f(this.f26305a).removeCallbacks(C9890c.m46046l(this.f26305a));
                a[8] = true;
            }
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$e */
    /* compiled from: ScreenRecordingFab */
    class C9895e implements C12331g<ActivityLifeCycleEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26306b;

        /* renamed from: a */
        final /* synthetic */ C9890c f26307a;

        C9895e(C9890c cVar) {
            boolean[] a = m46075a();
            this.f26307a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46075a() {
            boolean[] zArr = f26306b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4550284368480066959L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$5", 6);
            f26306b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35202a(ActivityLifeCycleEvent activityLifeCycleEvent) {
            boolean[] a = m46075a();
            int i = C9897g.f26312b[activityLifeCycleEvent.ordinal()];
            if (i == 1) {
                C9890c.m46049m(this.f26307a);
                a[2] = true;
            } else if (i != 2) {
                a[1] = true;
            } else {
                C9890c.m46051n(this.f26307a);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46075a();
            mo35202a((ActivityLifeCycleEvent) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$f */
    /* compiled from: ScreenRecordingFab */
    class C9896f implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26308N;

        /* renamed from: a */
        final /* synthetic */ LayoutParams f26309a;

        /* renamed from: b */
        final /* synthetic */ C9890c f26310b;

        C9896f(C9890c cVar, LayoutParams layoutParams) {
            boolean[] a = m46078a();
            this.f26310b = cVar;
            this.f26309a = layoutParams;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46078a() {
            boolean[] zArr = f26308N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2743251437421055773L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$6", 8);
            f26308N = a;
            return a;
        }

        public void run() {
            boolean[] a = m46078a();
            LayoutParams layoutParams = this.f26309a;
            int i = C9890c.m46062w(this.f26310b).leftMargin;
            C9820a b = C9890c.m46027b(this.f26310b);
            a[1] = true;
            layoutParams.leftMargin = i - b.getWidth();
            a[2] = true;
            this.f26309a.rightMargin = C9890c.m46054p(this.f26310b) - C9890c.m46062w(this.f26310b).leftMargin;
            a[3] = true;
            LayoutParams layoutParams2 = this.f26309a;
            int i2 = C9890c.m46062w(this.f26310b).topMargin;
            C9890c cVar = this.f26310b;
            a[4] = true;
            int c = (C9890c.m46062w(cVar).height + C9890c.m46029c(this.f26310b)) / 2;
            C9820a b2 = C9890c.m46027b(this.f26310b);
            a[5] = true;
            layoutParams2.topMargin = i2 + ((c - b2.getHeight()) / 2);
            a[6] = true;
            C9890c.m46027b(this.f26310b).setLayoutParams(this.f26309a);
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$g */
    /* compiled from: ScreenRecordingFab */
    static /* synthetic */ class C9897g {

        /* renamed from: a */
        static final /* synthetic */ int[] f26311a = new int[InstabugVideoRecordingButtonPosition.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f26312b = new int[ActivityLifeCycleEvent.values().length];

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26313c;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
        static {
            /*
                boolean[] r0 = m46079a()
                com.instabug.library.tracking.ActivityLifeCycleEvent[] r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26312b = r1
                r1 = 0
                r2 = 3
                r3 = 4
                r4 = 2
                r5 = 1
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                int[] r1 = f26312b     // Catch:{ NoSuchFieldError -> 0x0021 }
                com.instabug.library.tracking.ActivityLifeCycleEvent r6 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r5] = r5
                goto L_0x0023
            L_0x0021:
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0023:
                int[] r1 = f26312b     // Catch:{ NoSuchFieldError -> 0x0030 }
                com.instabug.library.tracking.ActivityLifeCycleEvent r6 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r2] = r5
                goto L_0x0032
            L_0x0030:
                r0[r3] = r5
            L_0x0032:
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition[] r1 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26311a = r1
                r1 = 5
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                int[] r1 = f26311a     // Catch:{ NoSuchFieldError -> 0x004c }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r6 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x004c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                r1 = 6
                r0[r1] = r5
                goto L_0x004f
            L_0x004c:
                r1 = 7
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x004f:
                int[] r1 = f26311a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r6 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                r1 = 8
                r0[r1] = r5
                goto L_0x0062
            L_0x005e:
                r1 = 9
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0062:
                int[] r1 = f26311a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r4 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1 = 10
                r0[r1] = r5
                goto L_0x0075
            L_0x0071:
                r1 = 11
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0075:
                int[] r1 = f26311a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r2 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1 = 12
                r0[r1] = r5
                goto L_0x0088
            L_0x0084:
                r1 = 13
                r0[r1] = r5
            L_0x0088:
                r1 = 14
                r0[r1] = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.invocation.p390a.C9890c.C9897g.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46079a() {
            boolean[] zArr = f26313c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3514538304573967353L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$7", 15);
            f26313c = a;
            return a;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$h */
    /* compiled from: ScreenRecordingFab */
    public class C9898h extends RecordingFloatingActionButton {

        /* renamed from: o0 */
        private static transient /* synthetic */ boolean[] f26314o0;

        /* renamed from: g0 */
        private GestureDetector f26315g0;

        /* renamed from: h0 */
        private boolean f26316h0 = true;

        /* renamed from: i0 */
        private C9899a f26317i0;

        /* renamed from: j0 */
        private long f26318j0;

        /* renamed from: k0 */
        private float f26319k0;

        /* renamed from: l0 */
        private float f26320l0;

        /* renamed from: m0 */
        private boolean f26321m0 = false;

        /* renamed from: n0 */
        final /* synthetic */ C9890c f26322n0;

        /* renamed from: com.instabug.library.invocation.a.c$h$a */
        /* compiled from: ScreenRecordingFab */
        private class C9899a implements Runnable {

            /* renamed from: Q */
            private static transient /* synthetic */ boolean[] f26323Q;

            /* renamed from: N */
            private float f26324N;

            /* renamed from: O */
            private long f26325O;

            /* renamed from: P */
            final /* synthetic */ C9898h f26326P;

            /* renamed from: a */
            private Handler f26327a;

            /* renamed from: b */
            private float f26328b;

            private C9899a(C9898h hVar) {
                boolean[] b = m46089b();
                this.f26326P = hVar;
                b[0] = true;
                this.f26327a = new Handler(Looper.getMainLooper());
                b[1] = true;
            }

            /* renamed from: a */
            static /* synthetic */ void m46087a(C9899a aVar) {
                boolean[] b = m46089b();
                aVar.m46085a();
                b[16] = true;
            }

            /* renamed from: b */
            private static /* synthetic */ boolean[] m46089b() {
                boolean[] zArr = f26323Q;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6240327981047108213L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$DraggableRecordingFloatingActionButton$MoveAnimator", 18);
                f26323Q = a;
                return a;
            }

            public void run() {
                boolean[] b = m46089b();
                if (this.f26326P.getParent() == null) {
                    b[5] = true;
                } else {
                    b[6] = true;
                    float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f26325O)) / 400.0f);
                    b[7] = true;
                    float o = (this.f26328b - ((float) C9890c.m46052o(this.f26326P.f26322n0))) * min;
                    b[8] = true;
                    float s = (this.f26324N - ((float) C9890c.m46058s(this.f26326P.f26322n0))) * min;
                    b[9] = true;
                    C9898h hVar = this.f26326P;
                    hVar.mo35205a((int) (((float) C9890c.m46052o(hVar.f26322n0)) + o), (int) (((float) C9890c.m46058s(this.f26326P.f26322n0)) + s));
                    if (min >= 1.0f) {
                        b[10] = true;
                    } else {
                        b[11] = true;
                        this.f26327a.post(this);
                        b[12] = true;
                    }
                }
                b[13] = true;
            }

            /* renamed from: a */
            static /* synthetic */ void m46088a(C9899a aVar, float f, float f2) {
                boolean[] b = m46089b();
                aVar.m46086a(f, f2);
                b[17] = true;
            }

            /* synthetic */ C9899a(C9898h hVar, C9891a aVar) {
                boolean[] b = m46089b();
                this(hVar);
                b[15] = true;
            }

            /* renamed from: a */
            private void m46086a(float f, float f2) {
                boolean[] b = m46089b();
                this.f26328b = f;
                this.f26324N = f2;
                b[2] = true;
                this.f26325O = System.currentTimeMillis();
                b[3] = true;
                this.f26327a.post(this);
                b[4] = true;
            }

            /* renamed from: a */
            private void m46085a() {
                boolean[] b = m46089b();
                this.f26327a.removeCallbacks(this);
                b[14] = true;
            }
        }

        public C9898h(C9890c cVar, Context context) {
            boolean[] c = m46082c();
            this.f26322n0 = cVar;
            c[0] = true;
            super(context);
            c[1] = true;
            this.f26315g0 = new GestureDetector(context, new C9900i());
            c[2] = true;
            this.f26317i0 = new C9899a(this, null);
            c[3] = true;
            setId(C9700R.C9704id.instabug_floating_button);
            c[4] = true;
        }

        /* renamed from: a */
        static /* synthetic */ void m46080a(C9898h hVar) {
            boolean[] c = m46082c();
            hVar.m46081b();
            c[70] = true;
        }

        /* renamed from: b */
        private void m46081b() {
            int i;
            int i2;
            boolean[] c = m46082c();
            if (C9890c.m46052o(this.f26322n0) >= C9890c.m46054p(this.f26322n0) / 2) {
                i = C9890c.m46056q(this.f26322n0);
                c[33] = true;
            } else {
                i = C9890c.m46057r(this.f26322n0);
                c[34] = true;
            }
            c[35] = true;
            if (C9890c.m46058s(this.f26322n0) >= C9890c.m46059t(this.f26322n0) / 2) {
                i2 = C9890c.m46060u(this.f26322n0);
                c[36] = true;
            } else {
                i2 = C9890c.m46061v(this.f26322n0);
                c[37] = true;
            }
            c[38] = true;
            C9899a.m46088a(this.f26317i0, (float) i, (float) i2);
            c[39] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46082c() {
            boolean[] zArr = f26314o0;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(41124627423876093L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$DraggableRecordingFloatingActionButton", 71);
            f26314o0 = a;
            return a;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean[] c = m46082c();
            if (!this.f26316h0) {
                c[11] = true;
                z = false;
            } else {
                c[12] = true;
                z = this.f26315g0.onTouchEvent(motionEvent);
                c[13] = true;
            }
            if (z) {
                c[14] = true;
                m46081b();
                c[15] = true;
            } else {
                float rawX = motionEvent.getRawX();
                c[16] = true;
                float rawY = motionEvent.getRawY();
                c[17] = true;
                int action = motionEvent.getAction();
                if (action == 0) {
                    c[18] = true;
                    this.f26318j0 = System.currentTimeMillis();
                    c[19] = true;
                    C9899a.m46087a(this.f26317i0);
                    this.f26321m0 = true;
                    c[20] = true;
                } else if (action == 1) {
                    c[21] = true;
                    if (System.currentTimeMillis() - this.f26318j0 >= 200) {
                        c[22] = true;
                    } else {
                        c[23] = true;
                        performClick();
                        c[24] = true;
                    }
                    this.f26321m0 = false;
                    c[25] = true;
                    m46081b();
                    c[26] = true;
                } else if (action != 2) {
                    c[27] = true;
                } else if (!this.f26321m0) {
                    c[28] = true;
                } else {
                    c[29] = true;
                    mo35204a(rawX - this.f26319k0, rawY - this.f26320l0);
                    c[30] = true;
                }
                this.f26319k0 = rawX;
                this.f26320l0 = rawY;
                c[31] = true;
            }
            c[32] = true;
            return true;
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            boolean[] c = m46082c();
            C9890c.m46021a(this.f26322n0, (LayoutParams) layoutParams);
            c[9] = true;
            super.setLayoutParams(layoutParams);
            c[10] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35205a(int i, int i2) {
            boolean[] c = m46082c();
            C9890c.m46020a(this.f26322n0, i);
            c[40] = true;
            C9890c.m46026b(this.f26322n0, i2);
            c[41] = true;
            C9890c.m46062w(this.f26322n0).leftMargin = C9890c.m46052o(this.f26322n0);
            c[42] = true;
            C9890c.m46062w(this.f26322n0).rightMargin = C9890c.m46054p(this.f26322n0) - C9890c.m46052o(this.f26322n0);
            c[43] = true;
            if (C9890c.m46063x(this.f26322n0) != 2) {
                c[44] = true;
            } else if (C9890c.m46064y(this.f26322n0) <= C9890c.m46054p(this.f26322n0)) {
                c[45] = true;
            } else {
                c[46] = true;
                LayoutParams w = C9890c.m46062w(this.f26322n0);
                C9890c cVar = this.f26322n0;
                c[47] = true;
                w.rightMargin = (int) (((float) C9890c.m46062w(cVar).rightMargin) + (C9890c.m46065z(this.f26322n0) * 48.0f));
                c[48] = true;
            }
            C9890c.m46062w(this.f26322n0).topMargin = C9890c.m46058s(this.f26322n0);
            c[49] = true;
            C9890c.m46062w(this.f26322n0).bottomMargin = C9890c.m46059t(this.f26322n0) - C9890c.m46058s(this.f26322n0);
            c[50] = true;
            setLayoutParams(C9890c.m46062w(this.f26322n0));
            c[51] = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35204a(float f, float f2) {
            boolean[] c = m46082c();
            if (((float) C9890c.m46058s(this.f26322n0)) + f2 <= 50.0f) {
                c[52] = true;
            } else {
                c[53] = true;
                mo35205a((int) (((float) C9890c.m46052o(this.f26322n0)) + f), (int) (((float) C9890c.m46058s(this.f26322n0)) + f2));
                c[54] = true;
                C9890c.m46017A(this.f26322n0);
                c[55] = true;
                if (!C9890c.m46018B(this.f26322n0)) {
                    c[56] = true;
                } else {
                    c[57] = true;
                    C9890c.m46019C(this.f26322n0);
                    c[58] = true;
                }
                C9890c.m46023a(this.f26322n0);
                c[59] = true;
            }
            if (!this.f26316h0) {
                c[60] = true;
            } else if (this.f26321m0) {
                c[61] = true;
            } else {
                C9890c cVar = this.f26322n0;
                c[62] = true;
                if (Math.abs(C9890c.m46062w(cVar).rightMargin) >= 50) {
                    c[63] = true;
                } else {
                    C9890c cVar2 = this.f26322n0;
                    c[64] = true;
                    int i = C9890c.m46062w(cVar2).topMargin - (getContext().getResources().getDisplayMetrics().heightPixels / 2);
                    c[65] = true;
                    if (Math.abs(i) >= 250) {
                        c[66] = true;
                    } else {
                        c[67] = true;
                        m46081b();
                        c[68] = true;
                    }
                }
            }
            c[69] = true;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$i */
    /* compiled from: ScreenRecordingFab */
    static class C9900i extends SimpleOnGestureListener {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26329a;

        C9900i() {
            m46090a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46090a() {
            boolean[] zArr = f26329a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5847489499916374782L, "com/instabug/library/invocation/invoker/ScreenRecordingFab$FlingListener", 7);
            f26329a = a;
            return a;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            boolean[] a = m46090a();
            if (Math.abs(motionEvent2.getX() - motionEvent.getX()) >= 90.0f) {
                a[1] = true;
            } else {
                a[2] = true;
                if (motionEvent2.getY() - motionEvent.getY() <= 90.0f) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    z = true;
                    a[6] = true;
                    return z;
                }
            }
            z = false;
            a[5] = true;
            a[6] = true;
            return z;
        }
    }

    /* renamed from: com.instabug.library.invocation.a.c$j */
    /* compiled from: ScreenRecordingFab */
    public interface C9901j {
        void start();

        void stop();
    }

    public C9890c(C9901j jVar) {
        boolean[] p = m46055p();
        p[0] = true;
        p[1] = true;
        this.f26291i0 = new Handler();
        p[2] = true;
        this.f26293k0 = new C9891a(this);
        this.f26297o0 = jVar;
        p[3] = true;
    }

    /* renamed from: A */
    static /* synthetic */ void m46017A(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46048m();
        p[162] = true;
    }

    /* renamed from: B */
    static /* synthetic */ boolean m46018B(C9890c cVar) {
        boolean[] p = m46055p();
        boolean z = cVar.f26278X;
        p[163] = true;
        return z;
    }

    /* renamed from: C */
    static /* synthetic */ void m46019C(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46047l();
        p[164] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m46023a(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46053o();
        p[165] = true;
    }

    /* renamed from: b */
    static /* synthetic */ C9820a m46027b(C9890c cVar) {
        boolean[] p = m46055p();
        C9820a aVar = cVar.f26285c0;
        p[166] = true;
        return aVar;
    }

    /* renamed from: c */
    static /* synthetic */ int m46029c(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26295m0;
        p[167] = true;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ long m46030d(C9890c cVar) {
        boolean[] p = m46055p();
        long j = cVar.f26292j0;
        p[134] = true;
        return j;
    }

    /* renamed from: e */
    static /* synthetic */ C9898h m46032e(C9890c cVar) {
        boolean[] p = m46055p();
        C9898h hVar = cVar.f26296n0;
        p[135] = true;
        return hVar;
    }

    /* renamed from: f */
    static /* synthetic */ Handler m46034f(C9890c cVar) {
        boolean[] p = m46055p();
        Handler handler = cVar.f26291i0;
        p[136] = true;
        return handler;
    }

    /* renamed from: g */
    static /* synthetic */ C9874b m46036g(C9890c cVar) {
        boolean[] p = m46055p();
        C9874b bVar = cVar.f26282a0;
        p[137] = true;
        return bVar;
    }

    /* renamed from: h */
    static /* synthetic */ C9876c m46038h(C9890c cVar) {
        boolean[] p = m46055p();
        C9876c cVar2 = cVar.f26284b0;
        p[139] = true;
        return cVar2;
    }

    /* renamed from: i */
    static /* synthetic */ boolean m46041i(C9890c cVar) {
        boolean[] p = m46055p();
        boolean z = cVar.f26277W;
        p[140] = true;
        return z;
    }

    /* renamed from: j */
    static /* synthetic */ void m46043j(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46031d();
        p[141] = true;
    }

    /* renamed from: k */
    static /* synthetic */ C9901j m46044k(C9890c cVar) {
        boolean[] p = m46055p();
        C9901j jVar = cVar.f26297o0;
        p[142] = true;
        return jVar;
    }

    /* renamed from: l */
    static /* synthetic */ Runnable m46046l(C9890c cVar) {
        boolean[] p = m46055p();
        Runnable runnable = cVar.f26293k0;
        p[144] = true;
        return runnable;
    }

    /* renamed from: m */
    static /* synthetic */ void m46049m(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46035f();
        p[145] = true;
    }

    /* renamed from: n */
    static /* synthetic */ void m46051n(C9890c cVar) {
        boolean[] p = m46055p();
        cVar.m46037g();
        p[146] = true;
    }

    /* renamed from: o */
    static /* synthetic */ int m46052o(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26268N;
        p[148] = true;
        return i;
    }

    /* renamed from: p */
    static /* synthetic */ int m46054p(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26270P;
        p[149] = true;
        return i;
    }

    /* renamed from: p */
    private static /* synthetic */ boolean[] m46055p() {
        boolean[] zArr = f26267p0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1814117385434376502L, "com/instabug/library/invocation/invoker/ScreenRecordingFab", C13959t.f40784E2);
        f26267p0 = a;
        return a;
    }

    /* renamed from: q */
    static /* synthetic */ int m46056q(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26288f0;
        p[150] = true;
        return i;
    }

    /* renamed from: r */
    static /* synthetic */ int m46057r(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26287e0;
        p[151] = true;
        return i;
    }

    /* renamed from: s */
    static /* synthetic */ int m46058s(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26269O;
        p[152] = true;
        return i;
    }

    /* renamed from: t */
    static /* synthetic */ int m46059t(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26271Q;
        p[153] = true;
        return i;
    }

    /* renamed from: u */
    static /* synthetic */ int m46060u(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26290h0;
        p[154] = true;
        return i;
    }

    /* renamed from: v */
    static /* synthetic */ int m46061v(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26289g0;
        p[155] = true;
        return i;
    }

    /* renamed from: w */
    static /* synthetic */ LayoutParams m46062w(C9890c cVar) {
        boolean[] p = m46055p();
        LayoutParams layoutParams = cVar.f26281a;
        p[158] = true;
        return layoutParams;
    }

    /* renamed from: x */
    static /* synthetic */ int m46063x(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26274T;
        p[159] = true;
        return i;
    }

    /* renamed from: y */
    static /* synthetic */ int m46064y(C9890c cVar) {
        boolean[] p = m46055p();
        int i = cVar.f26272R;
        p[160] = true;
        return i;
    }

    /* renamed from: z */
    static /* synthetic */ float m46065z(C9890c cVar) {
        boolean[] p = m46055p();
        float f = cVar.f26275U;
        p[161] = true;
        return f;
    }

    public void onClick(View view) {
        boolean[] p = m46055p();
        m46042j();
        if (this.f26277W) {
            p[71] = true;
        } else {
            this.f26277W = true;
            C9901j jVar = this.f26297o0;
            if (jVar == null) {
                p[72] = true;
            } else {
                p[73] = true;
                jVar.start();
                p[74] = true;
            }
            C10023d.m46635a(Instabug.getApplicationContext());
            p[75] = true;
            this.f26296n0.setRecordingState(RecordingState.RECORDING);
            p[76] = true;
            m46040i();
            p[77] = true;
        }
        m46053o();
        p[78] = true;
    }

    /* renamed from: a */
    static /* synthetic */ int m46020a(C9890c cVar, int i) {
        boolean[] p = m46055p();
        cVar.f26268N = i;
        p[156] = true;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m46026b(C9890c cVar, int i) {
        boolean[] p = m46055p();
        cVar.f26269O = i;
        p[157] = true;
        return i;
    }

    /* renamed from: d */
    private void m46031d() {
        boolean[] p = m46055p();
        FrameLayout frameLayout = this.f26294l0;
        if (frameLayout == null) {
            p[61] = true;
        } else {
            p[62] = true;
            frameLayout.setOnClickListener(null);
            p[63] = true;
            if (this.f26294l0.getParent() == null) {
                p[64] = true;
            } else {
                FrameLayout frameLayout2 = this.f26294l0;
                p[65] = true;
                if (!(frameLayout2.getParent() instanceof ViewGroup)) {
                    p[66] = true;
                } else {
                    p[67] = true;
                    ViewGroup viewGroup = (ViewGroup) this.f26294l0.getParent();
                    p[68] = true;
                    viewGroup.removeView(this.f26294l0);
                    p[69] = true;
                }
            }
        }
        p[70] = true;
    }

    /* renamed from: e */
    private void m46033e() {
        boolean[] p = m46055p();
        C12313b bVar = this.f26283b;
        CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
        C9895e eVar = new C9895e(this);
        p[79] = true;
        C12314c subscribe = instance.subscribe(eVar);
        p[80] = true;
        bVar.mo42072b(subscribe);
        p[81] = true;
    }

    /* renamed from: f */
    private void m46035f() {
        boolean[] p = m46055p();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            p[82] = true;
            m46022a(currentActivity);
            p[83] = true;
        } else {
            InstabugSDKLogger.m46626v(C9890c.class, "current activity equal null");
            p[84] = true;
        }
        p[85] = true;
    }

    /* renamed from: g */
    private void m46037g() {
        boolean[] p = m46055p();
        m46031d();
        p[86] = true;
    }

    /* renamed from: h */
    private void m46039h() {
        RecordingState recordingState;
        boolean[] p = m46055p();
        if (this.f26277W) {
            recordingState = RecordingState.RECORDING;
            p[87] = true;
        } else {
            recordingState = RecordingState.STOPPED;
            p[88] = true;
        }
        p[89] = true;
        this.f26296n0.setRecordingState(recordingState);
        p[90] = true;
    }

    /* renamed from: i */
    private void m46040i() {
        boolean[] p = m46055p();
        this.f26292j0 = System.currentTimeMillis();
        p[91] = true;
        this.f26291i0.removeCallbacks(this.f26293k0);
        p[92] = true;
        this.f26291i0.postDelayed(this.f26293k0, 0);
        p[93] = true;
    }

    /* renamed from: j */
    private void m46042j() {
        boolean[] p = m46055p();
        if (this.f26278X) {
            p[94] = true;
            m46047l();
            p[95] = true;
        } else {
            m46045k();
            p[96] = true;
        }
        p[97] = true;
    }

    /* renamed from: k */
    private void m46045k() {
        boolean[] p = m46055p();
        p[98] = true;
        if (Math.abs(this.f26281a.leftMargin - this.f26287e0) <= 20) {
            p[99] = true;
        } else {
            int i = this.f26281a.leftMargin - this.f26288f0;
            p[100] = true;
            if (Math.abs(i) > 20) {
                p[101] = true;
                p[107] = true;
                return;
            }
            p[102] = true;
        }
        if (Math.abs(this.f26281a.topMargin - this.f26289g0) <= 20) {
            p[103] = true;
        } else {
            int i2 = this.f26281a.topMargin - this.f26290h0;
            p[104] = true;
            if (Math.abs(i2) <= 20) {
                p[105] = true;
            } else {
                p[106] = true;
                p[107] = true;
                return;
            }
        }
        m46048m();
        p[108] = true;
        this.f26294l0.addView(this.f26282a0);
        p[109] = true;
        this.f26294l0.addView(this.f26284b0);
        this.f26278X = true;
        p[110] = true;
    }

    /* renamed from: l */
    private void m46047l() {
        boolean[] p = m46055p();
        this.f26294l0.removeView(this.f26282a0);
        p[111] = true;
        this.f26294l0.removeView(this.f26284b0);
        this.f26278X = false;
        p[112] = true;
    }

    /* renamed from: m */
    private void m46048m() {
        int i;
        int i2;
        boolean[] p = m46055p();
        int i3 = this.f26276V;
        LayoutParams layoutParams = new LayoutParams(i3, i3);
        layoutParams.leftMargin = this.f26281a.leftMargin + ((this.f26295m0 - this.f26276V) / 2);
        layoutParams.rightMargin = this.f26281a.rightMargin + ((this.f26295m0 - this.f26276V) / 2);
        C9876c cVar = this.f26284b0;
        p[113] = true;
        LayoutParams layoutParams2 = new LayoutParams(cVar.getWidth(), this.f26284b0.getHeight());
        layoutParams2.leftMargin = this.f26281a.leftMargin + ((this.f26295m0 - this.f26276V) / 2);
        int i4 = this.f26281a.rightMargin;
        int i5 = this.f26295m0;
        int i6 = this.f26276V;
        layoutParams2.rightMargin = i4 + ((i5 - i6) / 2);
        if (this.f26281a.topMargin > (i6 + (this.f26286d0 * 2)) * 2) {
            int i7 = this.f26281a.topMargin;
            int i8 = this.f26276V;
            int i9 = this.f26286d0;
            i2 = i7 - (i8 + i9);
            i = i2 - (i8 + i9);
            p[114] = true;
        } else {
            int i10 = this.f26281a.topMargin + this.f26295m0;
            int i11 = this.f26286d0;
            i2 = i10 + i11;
            i = i11 + this.f26276V + i2;
            p[115] = true;
        }
        layoutParams2.topMargin = i2;
        layoutParams.topMargin = i;
        p[116] = true;
        this.f26282a0.setLayoutParams(layoutParams);
        p[117] = true;
        this.f26284b0.setLayoutParams(layoutParams2);
        p[118] = true;
    }

    /* renamed from: n */
    private void m46050n() {
        boolean[] p = m46055p();
        if (this.f26279Y) {
            p[122] = true;
        } else if (this.f26281a.leftMargin == this.f26287e0) {
            p[123] = true;
        } else {
            this.f26279Y = true;
            p[124] = true;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            p[125] = true;
            this.f26285c0.setLayoutParams(layoutParams);
            p[126] = true;
            this.f26285c0.post(new C9896f(this, layoutParams));
            p[127] = true;
            this.f26294l0.addView(this.f26285c0);
            p[128] = true;
        }
        p[129] = true;
    }

    /* renamed from: o */
    private void m46053o() {
        boolean[] p = m46055p();
        if (!this.f26279Y) {
            p[130] = true;
        } else {
            this.f26279Y = false;
            p[131] = true;
            this.f26294l0.removeView(this.f26285c0);
            p[132] = true;
        }
        p[133] = true;
    }

    /* renamed from: c */
    public void mo35196c() {
        boolean[] p = m46055p();
        this.f26277W = false;
        this.f26280Z = true;
        p[7] = true;
        this.f26291i0.removeCallbacks(this.f26293k0);
        p[8] = true;
        m46031d();
        p[9] = true;
    }

    /* renamed from: a */
    static /* synthetic */ LayoutParams m46021a(C9890c cVar, LayoutParams layoutParams) {
        boolean[] p = m46055p();
        cVar.f26281a = layoutParams;
        p[147] = true;
        return layoutParams;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m46028b(C9890c cVar, boolean z) {
        boolean[] p = m46055p();
        cVar.f26277W = z;
        p[143] = true;
        return z;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46024a(C9890c cVar, boolean z) {
        boolean[] p = m46055p();
        cVar.f26280Z = z;
        p[138] = true;
        return z;
    }

    /* renamed from: b */
    public void mo35195b() {
        boolean[] p = m46055p();
        this.f26283b.mo42067a();
        p[5] = true;
        mo35196c();
        p[6] = true;
    }

    /* renamed from: a */
    public void mo35194a() {
        boolean[] p = m46055p();
        m46033e();
        p[4] = true;
    }

    /* renamed from: a */
    private void m46022a(Activity activity) {
        boolean[] p = m46055p();
        this.f26294l0 = new FrameLayout(activity);
        p[10] = true;
        this.f26274T = activity.getResources().getConfiguration().orientation;
        p[11] = true;
        int b = m46025b(activity);
        p[12] = true;
        this.f26275U = activity.getResources().getDisplayMetrics().density;
        p[13] = true;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = this.f26270P;
        int i2 = this.f26271Q;
        p[14] = true;
        this.f26271Q = activity.getResources().getDisplayMetrics().heightPixels;
        p[15] = true;
        this.f26270P = activity.getResources().getDisplayMetrics().widthPixels;
        if (VERSION.SDK_INT < 17) {
            p[16] = true;
        } else {
            p[17] = true;
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            this.f26273S = displayMetrics.heightPixels;
            this.f26272R = displayMetrics.widthPixels;
            p[18] = true;
        }
        p[19] = true;
        this.f26295m0 = (int) activity.getResources().getDimension(C9700R.dimen.instabug_fab_size_normal);
        p[20] = true;
        this.f26276V = (int) activity.getResources().getDimension(C9700R.dimen.instabug_fab_size_mini);
        p[21] = true;
        this.f26286d0 = (int) activity.getResources().getDimension(C9700R.dimen.instabug_fab_actions_spacing);
        this.f26287e0 = 0;
        int i3 = this.f26270P;
        int i4 = this.f26295m0;
        int i5 = this.f26286d0;
        this.f26288f0 = i3 - (i4 + i5);
        this.f26289g0 = b;
        this.f26290h0 = this.f26271Q - (i4 + i5);
        p[22] = true;
        this.f26285c0 = new C9820a(activity);
        p[23] = true;
        this.f26285c0.setText(C9700R.string.instabug_str_video_recording_hint);
        p[24] = true;
        this.f26282a0 = new C9874b(activity);
        p[25] = true;
        if (C10023d.m46636a()) {
            p[26] = true;
        } else {
            p[27] = true;
            if (this.f26282a0.getVisibility() != 0) {
                p[28] = true;
            } else {
                p[29] = true;
                this.f26282a0.setVisibility(8);
                p[30] = true;
            }
        }
        if (this.f26280Z) {
            p[31] = true;
            this.f26282a0.mo35151d();
            p[32] = true;
        } else {
            this.f26282a0.mo35150c();
            p[33] = true;
        }
        this.f26282a0.setOnClickListener(new C9892b(this));
        p[34] = true;
        this.f26284b0 = new C9876c(activity);
        p[35] = true;
        C12313b bVar = this.f26283b;
        InternalScreenRecordHelper instance = InternalScreenRecordHelper.getInstance();
        p[36] = true;
        C5923b0 isStopableObservable = instance.getIsStopableObservable();
        C9893c cVar = new C9893c(this);
        p[37] = true;
        C12314c i6 = isStopableObservable.mo24041i((C12331g<? super T>) cVar);
        p[38] = true;
        bVar.mo42072b(i6);
        p[39] = true;
        this.f26284b0.setOnClickListener(new C9894d(this));
        p[40] = true;
        this.f26296n0 = new C9898h(this, activity);
        if (this.f26281a == null) {
            p[41] = true;
            int i7 = this.f26295m0;
            this.f26281a = new LayoutParams(i7, i7, 51);
            p[42] = true;
            this.f26296n0.setLayoutParams(this.f26281a);
            p[43] = true;
            int i8 = C9897g.f26311a[InvocationManager.getInstance().getCurrentInvocationSettings().getVideoRecordingButtonPosition().ordinal()];
            if (i8 == 1) {
                this.f26296n0.mo35205a(this.f26288f0, this.f26290h0);
                p[44] = true;
            } else if (i8 == 2) {
                this.f26296n0.mo35205a(this.f26287e0, this.f26290h0);
                p[45] = true;
            } else if (i8 == 3) {
                this.f26296n0.mo35205a(this.f26287e0, this.f26289g0);
                p[46] = true;
            } else if (i8 != 4) {
                this.f26296n0.mo35205a(this.f26288f0, this.f26290h0);
                p[48] = true;
            } else {
                this.f26296n0.mo35205a(this.f26288f0, this.f26289g0);
                p[47] = true;
            }
        } else {
            float f = ((float) (this.f26268N * this.f26270P)) / ((float) i);
            float f2 = ((float) (this.f26269O * this.f26271Q)) / ((float) i2);
            p[49] = true;
            this.f26268N = Math.round(f);
            p[50] = true;
            this.f26269O = Math.round(f2);
            LayoutParams layoutParams = this.f26281a;
            int i9 = this.f26268N;
            layoutParams.leftMargin = i9;
            layoutParams.rightMargin = this.f26270P - i9;
            int i10 = this.f26269O;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = this.f26271Q - i10;
            p[51] = true;
            this.f26296n0.setLayoutParams(layoutParams);
            p[52] = true;
            C9898h.m46080a(this.f26296n0);
            p[53] = true;
        }
        if (this.f26277W) {
            p[54] = true;
        } else {
            p[55] = true;
            m46050n();
            p[56] = true;
        }
        this.f26296n0.setOnClickListener(this);
        p[57] = true;
        this.f26294l0.addView(this.f26296n0);
        p[58] = true;
        m46039h();
        p[59] = true;
        ((FrameLayout) activity.getWindow().getDecorView()).addView(this.f26294l0, new ViewGroup.LayoutParams(-1, -1));
        p[60] = true;
    }

    /* renamed from: b */
    private static int m46025b(Activity activity) {
        boolean[] p = m46055p();
        Rect rect = new Rect();
        p[119] = true;
        Window window = activity.getWindow();
        p[120] = true;
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        p[121] = true;
        return i;
    }
}
