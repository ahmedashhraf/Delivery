package com.instabug.library.annotation;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.C0195i0;
import androidx.core.p024e.p025b.C0886a;
import com.instabug.library.annotation.C9747b.C9750c;
import com.instabug.library.annotation.C9747b.C9751d;
import com.instabug.library.annotation.C9747b.C9754g;
import com.instabug.library.annotation.C9747b.C9755h;
import com.instabug.library.annotation.C9747b.C9756i;
import com.instabug.library.annotation.C9747b.C9757j;
import com.instabug.library.annotation.p381d.C9759a;
import com.instabug.library.util.OrientationUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"LI_LAZY_INIT_UPDATE_STATIC", "ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
public class AnnotationView extends ImageView {

    /* renamed from: u0 */
    private static C9763f f25740u0;

    /* renamed from: v0 */
    private static C9762e f25741v0;

    /* renamed from: w0 */
    private static transient /* synthetic */ boolean[] f25742w0;

    /* renamed from: N */
    private List<PointF> f25743N;

    /* renamed from: O */
    private Paint f25744O;

    /* renamed from: P */
    private int f25745P;

    /* renamed from: Q */
    private LinkedHashMap<Path, Integer> f25746Q;

    /* renamed from: R */
    private float f25747R;

    /* renamed from: S */
    private float f25748S;

    /* renamed from: T */
    private boolean f25749T;

    /* renamed from: U */
    private Drawable f25750U;

    /* renamed from: V */
    private PointF[] f25751V;

    /* renamed from: W */
    private Bitmap f25752W;

    /* renamed from: a */
    private final GestureDetector f25753a;

    /* renamed from: a0 */
    private Bitmap f25754a0;

    /* renamed from: b */
    private Path f25755b;

    /* renamed from: b0 */
    private int f25756b0;

    /* renamed from: c0 */
    private boolean f25757c0;

    /* renamed from: d0 */
    private Paint f25758d0;

    /* renamed from: e0 */
    private C9758c f25759e0;

    /* renamed from: f0 */
    private C9758c f25760f0;

    /* renamed from: g0 */
    private C9758c f25761g0;

    /* renamed from: h0 */
    private C9758c f25762h0;

    /* renamed from: i0 */
    private PointF f25763i0;

    /* renamed from: j0 */
    private C9722b f25764j0;

    /* renamed from: k0 */
    private C9723c f25765k0;

    /* renamed from: l0 */
    private C9759a f25766l0;

    /* renamed from: m0 */
    private C9726f f25767m0;

    /* renamed from: n0 */
    private C9727g f25768n0;

    /* renamed from: o0 */
    private C9728h f25769o0;

    /* renamed from: p0 */
    private boolean f25770p0;

    /* renamed from: q0 */
    private C9756i f25771q0;

    /* renamed from: r0 */
    private C9747b f25772r0;

    /* renamed from: s0 */
    private boolean f25773s0;

    /* renamed from: t0 */
    int f25774t0;

    /* renamed from: com.instabug.library.annotation.AnnotationView$a */
    static /* synthetic */ class C9721a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25775a = new int[C9723c.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f25776b = new int[C9722b.values().length];

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25777c;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r0[10] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
            r0[12] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0032 */
        static {
            /*
                boolean[] r0 = m45354a()
                com.instabug.library.annotation.AnnotationView$b[] r1 = com.instabug.library.annotation.AnnotationView.C9722b.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25776b = r1
                r1 = 0
                r2 = 5
                r3 = 6
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0023 }
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.instabug.library.annotation.AnnotationView$b r8 = com.instabug.library.annotation.AnnotationView.C9722b.DRAG     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r7] = r7
                goto L_0x0025
            L_0x0023:
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0025:
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.instabug.library.annotation.AnnotationView$b r8 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_RIGHT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r5] = r7
                goto L_0x0034
            L_0x0032:
                r0[r4] = r7     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0034:
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0041 }
                com.instabug.library.annotation.AnnotationView$b r8 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_LEFT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r1[r8] = r5     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r2] = r7
                goto L_0x0043
            L_0x0041:
                r0[r3] = r7     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0043:
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.instabug.library.annotation.AnnotationView$b r8 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_LEFT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1[r8] = r4     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1 = 7
                r0[r1] = r7
                goto L_0x0055
            L_0x0051:
                r1 = 8
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0055:
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.instabug.library.annotation.AnnotationView$b r4 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_RIGHT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1 = 9
                r0[r1] = r7
                goto L_0x0068
            L_0x0064:
                r1 = 10
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0068:
                int[] r1 = f25776b     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.instabug.library.annotation.AnnotationView$b r2 = com.instabug.library.annotation.AnnotationView.C9722b.DRAW     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
                r1 = 11
                r0[r1] = r7
                goto L_0x007b
            L_0x0077:
                r1 = 12
                r0[r1] = r7
            L_0x007b:
                com.instabug.library.annotation.AnnotationView$c[] r1 = com.instabug.library.annotation.AnnotationView.C9723c.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25775a = r1
                r1 = 13
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0097 }
                int[] r1 = f25775a     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.instabug.library.annotation.AnnotationView$c r2 = com.instabug.library.annotation.AnnotationView.C9723c.DRAW_RECT     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1[r2] = r7     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1 = 14
                r0[r1] = r7
                goto L_0x009b
            L_0x0097:
                r1 = 15
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x009b:
                int[] r1 = f25775a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.instabug.library.annotation.AnnotationView$c r2 = com.instabug.library.annotation.AnnotationView.C9723c.DRAW_CIRCLE     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r1[r2] = r6     // Catch:{ NoSuchFieldError -> 0x00aa }
                r1 = 16
                r0[r1] = r7
                goto L_0x00ae
            L_0x00aa:
                r1 = 17
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00ae:
                int[] r1 = f25775a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.instabug.library.annotation.AnnotationView$c r2 = com.instabug.library.annotation.AnnotationView.C9723c.DRAW_BLUR     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r1[r2] = r5     // Catch:{ NoSuchFieldError -> 0x00bd }
                r1 = 18
                r0[r1] = r7
                goto L_0x00c1
            L_0x00bd:
                r1 = 19
                r0[r1] = r7
            L_0x00c1:
                r1 = 20
                r0[r1] = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.C9721a.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45354a() {
            boolean[] zArr = f25777c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2354583992646525550L, "com/instabug/library/annotation/AnnotationView$1", 21);
            f25777c = a;
            return a;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$b */
    private enum C9722b {
        NONE,
        DRAG,
        RESIZE_BY_TOP_LEFT_BUTTON,
        RESIZE_BY_TOP_RIGHT_BUTTON,
        RESIZE_BY_BOTTOM_RIGHT_BUTTON,
        RESIZE_BY_BOTTOM_LEFT_BUTTON,
        DRAW;

        static {
            boolean[] d;
            d[9] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$c */
    public enum C9723c implements Serializable {
        NONE,
        DRAW_PATH,
        DRAW_RECT,
        DRAW_CIRCLE,
        DRAW_BLUR,
        DRAW_ZOOM;

        static {
            boolean[] d;
            d[8] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$d */
    private class C9724d extends SimpleOnGestureListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25778b;

        /* renamed from: a */
        final /* synthetic */ AnnotationView f25779a;

        private C9724d(AnnotationView annotationView) {
            boolean[] a = m45357a();
            this.f25779a = annotationView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45357a() {
            boolean[] zArr = f25778b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3686154065969212241L, "com/instabug/library/annotation/AnnotationView$GestureListener", 13);
            f25778b = a;
            return a;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean[] a = m45357a();
            if (AnnotationView.m45342e() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                AnnotationView.m45343f().mo34827e(AnnotationView.m45342e());
                a[3] = true;
                AnnotationView.m45342e().mo34812a(false);
                a[4] = true;
                if (!(AnnotationView.m45342e().mo34817e() instanceof C9757j)) {
                    a[5] = true;
                } else {
                    AnnotationView annotationView = this.f25779a;
                    annotationView.f25774t0--;
                    a[6] = true;
                    AnnotationView.m45333a(annotationView);
                    a[7] = true;
                }
                AnnotationView.m45329a((C9762e) null);
                a[8] = true;
                AnnotationView.m45339b(this.f25779a);
                a[9] = true;
                this.f25779a.invalidate();
                a[10] = true;
            }
            a[11] = true;
            return true;
        }

        /* synthetic */ C9724d(AnnotationView annotationView, C9721a aVar) {
            boolean[] a = m45357a();
            this(annotationView);
            a[12] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$e */
    enum C9725e {
        HIGH,
        LOW;

        static {
            boolean[] d;
            d[4] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$f */
    public interface C9726f {
        /* renamed from: d */
        void mo34700d();
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$g */
    public interface C9727g {
        /* renamed from: a */
        void mo34702a(boolean z);
    }

    /* renamed from: com.instabug.library.annotation.AnnotationView$h */
    public interface C9728h {
        /* renamed from: a */
        void mo34701a(Path path, Path path2);
    }

    public AnnotationView(Context context) {
        boolean[] k = m45348k();
        this(context, null);
        k[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9762e m45329a(C9762e eVar) {
        boolean[] k = m45348k();
        f25741v0 = eVar;
        k[464] = true;
        return eVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m45339b(AnnotationView annotationView) {
        boolean[] k = m45348k();
        annotationView.m45346i();
        k[465] = true;
    }

    /* renamed from: c */
    private void m45341c(float f, float f2) {
        boolean[] k = m45348k();
        float abs = Math.abs(f - this.f25747R);
        k[66] = true;
        float abs2 = Math.abs(f2 - this.f25748S);
        if (abs >= 8.0f) {
            k[67] = true;
        } else if (abs2 < 8.0f) {
            k[68] = true;
            k[72] = true;
        } else {
            k[69] = true;
        }
        Path path = this.f25755b;
        float f3 = this.f25747R;
        float f4 = this.f25748S;
        path.quadTo(f3, f4, (f + f3) / 2.0f, (f2 + f4) / 2.0f);
        this.f25747R = f;
        this.f25748S = f2;
        k[70] = true;
        this.f25743N.add(new PointF(f, f2));
        k[71] = true;
        k[72] = true;
    }

    /* renamed from: e */
    static /* synthetic */ C9762e m45342e() {
        boolean[] k = m45348k();
        C9762e eVar = f25741v0;
        k[461] = true;
        return eVar;
    }

    /* renamed from: f */
    static /* synthetic */ C9763f m45343f() {
        boolean[] k = m45348k();
        C9763f fVar = f25740u0;
        k[462] = true;
        return fVar;
    }

    /* renamed from: g */
    private void m45344g() {
        boolean[] k = m45348k();
        this.f25744O = new Paint();
        k[48] = true;
        this.f25744O.setAntiAlias(true);
        k[49] = true;
        this.f25744O.setDither(true);
        this.f25745P = C0886a.f4059c;
        k[50] = true;
        this.f25744O.setColor(this.f25745P);
        k[51] = true;
        this.f25744O.setStyle(Style.STROKE);
        k[52] = true;
        this.f25744O.setStrokeJoin(Join.ROUND);
        k[53] = true;
        this.f25744O.setStrokeCap(Cap.ROUND);
        k[54] = true;
        this.f25744O.setStrokeWidth(getContext().getResources().getDisplayMetrics().density * 4.0f);
        k[55] = true;
    }

    private Bitmap getOriginalBitmap() {
        boolean[] k = m45348k();
        if (this.f25752W != null) {
            k[377] = true;
        } else {
            k[378] = true;
            this.f25752W = mo34708c();
            k[379] = true;
        }
        Bitmap bitmap = this.f25752W;
        k[380] = true;
        return bitmap;
    }

    @C0195i0
    private Bitmap getScaledBitmap() {
        boolean[] k = m45348k();
        if (getWidth() <= 0) {
            k[447] = true;
        } else if (getHeight() <= 0) {
            k[448] = true;
        } else {
            if (this.f25754a0 != null) {
                k[450] = true;
            } else {
                k[451] = true;
                this.f25754a0 = Bitmap.createScaledBitmap(this.f25752W, getWidth(), getHeight(), true);
                k[452] = true;
            }
            Bitmap bitmap = this.f25754a0;
            k[453] = true;
            return bitmap;
        }
        k[449] = true;
        return null;
    }

    private C9763f getScaledDrawables() {
        boolean[] k = m45348k();
        this.f25766l0.mo34803c((float) getHeight());
        k[32] = true;
        this.f25766l0.mo34805d((float) getWidth());
        C9763f fVar = f25740u0;
        k[33] = true;
        k[34] = true;
        for (C9762e eVar : fVar.mo34820a()) {
            k[35] = true;
            C9747b bVar = new C9747b();
            k[36] = true;
            float d = eVar.f25901N.left * this.f25766l0.mo34804d();
            k[37] = true;
            float a = eVar.f25901N.top * this.f25766l0.mo34800a();
            k[38] = true;
            float d2 = eVar.f25901N.right * this.f25766l0.mo34804d();
            float f = eVar.f25901N.bottom;
            C9759a aVar = this.f25766l0;
            k[39] = true;
            float a2 = f * aVar.mo34800a();
            k[40] = true;
            bVar.set(d, a, d2, a2);
            k[41] = true;
            if (!(eVar.mo34817e() instanceof C9750c)) {
                k[42] = true;
            } else {
                k[43] = true;
                ((C9750c) eVar.mo34817e()).mo34781b(bVar);
                k[44] = true;
            }
            bVar.mo34765a(eVar.f25901N.mo34770m());
            k[45] = true;
            eVar.mo34811a(new C9747b(bVar));
            k[46] = true;
        }
        f25740u0 = fVar;
        C9763f fVar2 = f25740u0;
        k[47] = true;
        return fVar2;
    }

    private C9762e getSelectedMarkUpDrawable() {
        boolean[] k = m45348k();
        C9763f fVar = f25740u0;
        if (fVar == null) {
            k[357] = true;
            return null;
        }
        int d = fVar.mo34824d() - 1;
        k[358] = true;
        while (d >= 0) {
            k[359] = true;
            C9762e a = f25740u0.mo34819a(d);
            k[360] = true;
            if (a.mo34813a(this.f25763i0)) {
                k[361] = true;
                return a;
            }
            d--;
            k[362] = true;
        }
        k[363] = true;
        return null;
    }

    /* renamed from: h */
    private void m45345h() {
        boolean[] k = m45348k();
        this.f25755b.lineTo(this.f25747R, this.f25748S);
        k[73] = true;
        PathMeasure pathMeasure = new PathMeasure(this.f25755b, false);
        k[74] = true;
        if (pathMeasure.getLength() < 20.0f) {
            k[75] = true;
            this.f25746Q.remove(this.f25755b);
            k[76] = true;
            return;
        }
        Path path = this.f25755b;
        Paint paint = this.f25744O;
        k[77] = true;
        f25741v0 = new C9762e(new C9754g(path, paint.getStrokeWidth(), this.f25744O, this.f25743N));
        k[78] = true;
        C9747b bVar = new C9747b();
        k[79] = true;
        this.f25755b.computeBounds(bVar, true);
        k[80] = true;
        f25741v0.mo34811a(new C9747b(bVar));
        k[81] = true;
        f25740u0.mo34821a(f25741v0);
        k[82] = true;
        this.f25746Q.remove(this.f25755b);
        k[83] = true;
        invalidate();
        k[84] = true;
        m45336a(bVar);
        k[85] = true;
    }

    /* renamed from: i */
    private void m45346i() {
        boolean[] k = m45348k();
        if (this.f25764j0 == C9722b.DRAW) {
            k[273] = true;
        } else {
            k[274] = true;
            k[275] = true;
            int i = 1;
            while (i < f25740u0.mo34824d()) {
                k[277] = true;
                C9762e a = f25740u0.mo34819a(i);
                k[278] = true;
                if (f25740u0.mo34825d(f25741v0) > i) {
                    k[279] = true;
                } else {
                    k[280] = true;
                    if (!(a.mo34817e() instanceof C9757j)) {
                        k[281] = true;
                    } else {
                        k[282] = true;
                        if (!a.mo34818f()) {
                            k[283] = true;
                        } else {
                            k[284] = true;
                            C9757j jVar = (C9757j) a.mo34817e();
                            k[285] = true;
                            jVar.mo34794a(getScaledBitmap());
                            k[286] = true;
                        }
                    }
                }
                i++;
                k[287] = true;
            }
            k[276] = true;
        }
        k[288] = true;
    }

    /* renamed from: j */
    private void m45347j() {
        boolean[] k = m45348k();
        C9727g gVar = this.f25768n0;
        if (gVar == null) {
            k[424] = true;
        } else {
            if (this.f25774t0 != 5) {
                k[425] = true;
            } else {
                k[426] = true;
                gVar.mo34702a(false);
                k[427] = true;
            }
            if (this.f25774t0 != 4) {
                k[428] = true;
            } else {
                k[429] = true;
                this.f25768n0.mo34702a(true);
                k[430] = true;
            }
        }
        k[431] = true;
    }

    /* renamed from: k */
    private static /* synthetic */ boolean[] m45348k() {
        boolean[] zArr = f25742w0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5579481001824416675L, "com/instabug/library/annotation/AnnotationView", 466);
        f25742w0 = a;
        return a;
    }

    /* renamed from: d */
    public void mo34709d() {
        boolean[] k = m45348k();
        C9762e e = f25740u0.mo34826e();
        k[403] = true;
        if (e == null) {
            k[404] = true;
        } else if (!(e.mo34817e() instanceof C9757j)) {
            k[405] = true;
        } else {
            this.f25774t0--;
            k[406] = true;
            m45347j();
            k[407] = true;
        }
        f25741v0 = null;
        k[408] = true;
        m45346i();
        k[409] = true;
        invalidate();
        k[410] = true;
    }

    public C9723c getDrawingMode() {
        boolean[] k = m45348k();
        C9723c cVar = this.f25765k0;
        k[402] = true;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        boolean[] k = m45348k();
        super.onAttachedToWindow();
        k[18] = true;
        OrientationUtils.lockScreenOrientation(getContext());
        k[19] = true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean[] k = m45348k();
        super.onConfigurationChanged(configuration);
        this.f25754a0 = null;
        this.f25773s0 = true;
        k[446] = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        boolean[] k = m45348k();
        super.onDetachedFromWindow();
        f25740u0 = null;
        f25741v0 = null;
        k[459] = true;
        OrientationUtils.unlockOrientation(getContext());
        k[460] = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] k = m45348k();
        super.onDraw(canvas);
        Drawable drawable = this.f25750U;
        if (drawable == null) {
            k[167] = true;
        } else {
            k[168] = true;
            drawable.draw(canvas);
            k[169] = true;
        }
        if (this.f25757c0) {
            k[170] = true;
        } else {
            C9763f fVar = f25740u0;
            if (fVar == null) {
                k[171] = true;
            } else {
                k[172] = true;
                this.f25756b0 = fVar.mo34820a().size();
                k[173] = true;
            }
        }
        k[174] = true;
        for (C9762e eVar : f25740u0.mo34820a()) {
            k[175] = true;
            m45340b(eVar);
            k[176] = true;
            eVar.mo34808a(canvas);
            k[177] = true;
        }
        if (this.f25757c0) {
            k[178] = true;
        } else {
            C9762e eVar2 = f25741v0;
            if (eVar2 == null) {
                k[179] = true;
            } else {
                if (!this.f25770p0) {
                    k[180] = true;
                } else {
                    k[181] = true;
                    eVar2.mo34814b(canvas);
                    k[182] = true;
                }
                f25741v0.mo34809a(canvas, this.f25759e0, this.f25762h0, this.f25760f0, this.f25761g0);
                k[183] = true;
            }
        }
        if (this.f25746Q.isEmpty()) {
            k[184] = true;
        } else {
            k[185] = true;
            Iterator it = this.f25746Q.entrySet().iterator();
            k[186] = true;
            while (true) {
                Entry entry = (Entry) it.next();
                k[187] = true;
                this.f25744O.setColor(((Integer) entry.getValue()).intValue());
                k[188] = true;
                canvas.drawPath((Path) entry.getKey(), this.f25744O);
                k[189] = true;
                if (!it.hasNext()) {
                    break;
                }
                k[190] = true;
            }
            k[191] = true;
        }
        if (!this.f25773s0) {
            k[192] = true;
        } else {
            C9762e eVar3 = f25741v0;
            if (eVar3 == null) {
                k[193] = true;
            } else {
                this.f25773s0 = false;
                k[194] = true;
                if (eVar3.f25904a.mo34793d()) {
                    k[195] = true;
                } else {
                    k[196] = true;
                    m45336a(f25741v0.f25901N);
                    k[197] = true;
                }
            }
        }
        k[198] = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] k = m45348k();
        super.onMeasure(i, i2);
        k[20] = true;
        int measuredWidth = getMeasuredWidth();
        k[21] = true;
        int measuredHeight = getMeasuredHeight();
        k[22] = true;
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        k[23] = true;
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        k[24] = true;
        int paddingLeft2 = paddingLeft + getPaddingLeft() + getPaddingRight();
        k[25] = true;
        int paddingTop2 = paddingTop + getPaddingTop() + getPaddingBottom();
        k[26] = true;
        setMeasuredDimension(paddingLeft2, paddingTop2);
        k[27] = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean[] k = m45348k();
        if (!(parcelable instanceof Bundle)) {
            k[432] = true;
        } else {
            Bundle bundle = (Bundle) parcelable;
            k[433] = true;
            this.f25766l0 = (C9759a) bundle.getSerializable("aspectRatioCalculator");
            k[434] = true;
            this.f25756b0 = bundle.getInt("drawingLevel");
            k[435] = true;
            this.f25774t0 = bundle.getInt("magnifiersCount");
            k[436] = true;
            this.f25765k0 = (C9723c) bundle.getSerializable("drawingMode");
            k[437] = true;
            parcelable = bundle.getParcelable("superState");
            k[438] = true;
        }
        super.onRestoreInstanceState(parcelable);
        k[439] = true;
    }

    /* access modifiers changed from: protected */
    @C0195i0
    public Parcelable onSaveInstanceState() {
        boolean[] k = m45348k();
        Bundle bundle = new Bundle();
        k[417] = true;
        bundle.putParcelable("superState", super.onSaveInstanceState());
        k[418] = true;
        bundle.putSerializable("aspectRatioCalculator", this.f25766l0);
        k[419] = true;
        bundle.putSerializable("drawingMode", getDrawingMode());
        k[420] = true;
        bundle.putInt("drawingLevel", this.f25756b0);
        k[421] = true;
        bundle.putInt("magnifiersCount", this.f25774t0);
        k[422] = true;
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] k = m45348k();
        super.onSizeChanged(i, i2, i3, i4);
        k[30] = true;
        getScaledDrawables();
        k[31] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean[] r0 = m45348k()
            android.view.GestureDetector r1 = r11.f25753a
            boolean r1 = r1.onTouchEvent(r12)
            r2 = 1
            if (r1 == 0) goto L_0x0012
            r12 = 199(0xc7, float:2.79E-43)
            r0[r12] = r2
            return r2
        L_0x0012:
            int r1 = androidx.core.p034l.C1007o.m5780b(r12)
            r3 = 200(0xc8, float:2.8E-43)
            r0[r3] = r2
            float r3 = r12.getX()
            r4 = 201(0xc9, float:2.82E-43)
            r0[r4] = r2
            float r4 = r12.getY()
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L_0x00c1
            if (r1 == r2) goto L_0x004b
            if (r1 == r5) goto L_0x0034
            r1 = 202(0xca, float:2.83E-43)
            r0[r1] = r2
            goto L_0x0237
        L_0x0034:
            r11.m45332a(r12)
            r1 = 238(0xee, float:3.34E-43)
            r0[r1] = r2
            r11.m45346i()
            r1 = 239(0xef, float:3.35E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 240(0xf0, float:3.36E-43)
            r0[r1] = r2
            goto L_0x0237
        L_0x004b:
            r11.f25770p0 = r6
            com.instabug.library.annotation.AnnotationView$b r1 = r11.f25764j0
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.DRAG
            if (r1 != r7) goto L_0x0058
            r1 = 241(0xf1, float:3.38E-43)
            r0[r1] = r2
            goto L_0x0080
        L_0x0058:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_LEFT_BUTTON
            if (r1 != r7) goto L_0x0061
            r1 = 242(0xf2, float:3.39E-43)
            r0[r1] = r2
            goto L_0x0080
        L_0x0061:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_RIGHT_BUTTON
            if (r1 != r7) goto L_0x006a
            r1 = 243(0xf3, float:3.4E-43)
            r0[r1] = r2
            goto L_0x0080
        L_0x006a:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_RIGHT_BUTTON
            if (r1 != r7) goto L_0x0073
            r1 = 244(0xf4, float:3.42E-43)
            r0[r1] = r2
            goto L_0x0080
        L_0x0073:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_LEFT_BUTTON
            if (r1 == r7) goto L_0x007c
            r1 = 245(0xf5, float:3.43E-43)
            r0[r1] = r2
            goto L_0x009f
        L_0x007c:
            r1 = 246(0xf6, float:3.45E-43)
            r0[r1] = r2
        L_0x0080:
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x0089
            r1 = 247(0xf7, float:3.46E-43)
            r0[r1] = r2
            goto L_0x009f
        L_0x0089:
            r7 = 248(0xf8, float:3.48E-43)
            r0[r7] = r2
            com.instabug.library.annotation.f r7 = f25740u0
            r7.mo34827e(r1)
            r1 = 249(0xf9, float:3.49E-43)
            r0[r1] = r2
            com.instabug.library.annotation.e r1 = f25741v0
            r1.mo34806a()
            r1 = 250(0xfa, float:3.5E-43)
            r0[r1] = r2
        L_0x009f:
            android.graphics.PointF r1 = r11.f25763i0
            r1.set(r3, r4)
            com.instabug.library.annotation.AnnotationView$c r1 = r11.f25765k0
            com.instabug.library.annotation.AnnotationView$c r7 = com.instabug.library.annotation.AnnotationView.C9723c.DRAW_PATH
            if (r1 != r7) goto L_0x00b0
            r1 = 251(0xfb, float:3.52E-43)
            r0[r1] = r2
            goto L_0x0237
        L_0x00b0:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.NONE
            r11.f25764j0 = r1
            r1 = 252(0xfc, float:3.53E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 253(0xfd, float:3.55E-43)
            r0[r1] = r2
            goto L_0x0237
        L_0x00c1:
            r11.f25770p0 = r2
            r1 = 203(0xcb, float:2.84E-43)
            r0[r1] = r2
            r11.getOriginalBitmap()
            com.instabug.library.annotation.AnnotationView$f r1 = r11.f25767m0
            if (r1 != 0) goto L_0x00d3
            r1 = 204(0xcc, float:2.86E-43)
            r0[r1] = r2
            goto L_0x00de
        L_0x00d3:
            r7 = 205(0xcd, float:2.87E-43)
            r0[r7] = r2
            r1.mo34700d()
            r1 = 206(0xce, float:2.89E-43)
            r0[r1] = r2
        L_0x00de:
            android.graphics.PointF r1 = r11.f25763i0
            r1.set(r3, r4)
            r1 = 207(0xcf, float:2.9E-43)
            r0[r1] = r2
            com.instabug.library.annotation.c r1 = r11.f25760f0
            android.graphics.PointF r7 = r11.f25763i0
            boolean r1 = r1.mo34799b(r7)
            if (r1 != 0) goto L_0x00f6
            r1 = 208(0xd0, float:2.91E-43)
            r0[r1] = r2
            goto L_0x00fe
        L_0x00f6:
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x0221
            r1 = 209(0xd1, float:2.93E-43)
            r0[r1] = r2
        L_0x00fe:
            com.instabug.library.annotation.c r1 = r11.f25761g0
            android.graphics.PointF r7 = r11.f25763i0
            boolean r1 = r1.mo34799b(r7)
            if (r1 != 0) goto L_0x010d
            r1 = 211(0xd3, float:2.96E-43)
            r0[r1] = r2
            goto L_0x0115
        L_0x010d:
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x0218
            r1 = 212(0xd4, float:2.97E-43)
            r0[r1] = r2
        L_0x0115:
            com.instabug.library.annotation.c r1 = r11.f25759e0
            android.graphics.PointF r7 = r11.f25763i0
            boolean r1 = r1.mo34799b(r7)
            if (r1 != 0) goto L_0x0124
            r1 = 214(0xd6, float:3.0E-43)
            r0[r1] = r2
            goto L_0x012c
        L_0x0124:
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x020f
            r1 = 215(0xd7, float:3.01E-43)
            r0[r1] = r2
        L_0x012c:
            com.instabug.library.annotation.c r1 = r11.f25762h0
            android.graphics.PointF r7 = r11.f25763i0
            boolean r1 = r1.mo34799b(r7)
            if (r1 != 0) goto L_0x013b
            r1 = 217(0xd9, float:3.04E-43)
            r0[r1] = r2
            goto L_0x0143
        L_0x013b:
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x0206
            r1 = 218(0xda, float:3.05E-43)
            r0[r1] = r2
        L_0x0143:
            com.instabug.library.annotation.e r1 = r11.getSelectedMarkUpDrawable()
            f25741v0 = r1
            com.instabug.library.annotation.e r1 = f25741v0
            if (r1 != 0) goto L_0x01fd
            r1 = 220(0xdc, float:3.08E-43)
            r0[r1] = r2
            int[] r1 = com.instabug.library.annotation.AnnotationView.C9721a.f25775a
            com.instabug.library.annotation.AnnotationView$c r7 = r11.f25765k0
            int r7 = r7.ordinal()
            r1 = r1[r7]
            if (r1 == r2) goto L_0x01c6
            if (r1 == r5) goto L_0x0197
            r7 = 3
            if (r1 == r7) goto L_0x0168
            r1 = 221(0xdd, float:3.1E-43)
            r0[r1] = r2
            goto L_0x01f4
        L_0x0168:
            com.instabug.library.annotation.e r1 = new com.instabug.library.annotation.e
            com.instabug.library.annotation.b$d r7 = new com.instabug.library.annotation.b$d
            r8 = 230(0xe6, float:3.22E-43)
            r0[r8] = r2
            android.graphics.Bitmap r8 = r11.getOriginalBitmap()
            android.content.Context r9 = r11.getContext()
            r7.<init>(r8, r9)
            r1.<init>(r7)
            f25741v0 = r1
            r1 = 231(0xe7, float:3.24E-43)
            r0[r1] = r2
            com.instabug.library.annotation.f r1 = f25740u0
            com.instabug.library.annotation.e r7 = f25741v0
            r1.mo34822b(r7)
            r1 = 232(0xe8, float:3.25E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 233(0xe9, float:3.27E-43)
            r0[r1] = r2
            goto L_0x01f4
        L_0x0197:
            com.instabug.library.annotation.e r1 = new com.instabug.library.annotation.e
            com.instabug.library.annotation.b$f r7 = new com.instabug.library.annotation.b$f
            int r8 = r11.f25745P
            android.graphics.Paint r9 = r11.f25744O
            r10 = 226(0xe2, float:3.17E-43)
            r0[r10] = r2
            float r9 = r9.getStrokeWidth()
            r7.<init>(r8, r9, r6)
            r1.<init>(r7)
            f25741v0 = r1
            r1 = 227(0xe3, float:3.18E-43)
            r0[r1] = r2
            com.instabug.library.annotation.f r1 = f25740u0
            com.instabug.library.annotation.e r7 = f25741v0
            r1.mo34821a(r7)
            r1 = 228(0xe4, float:3.2E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 229(0xe5, float:3.21E-43)
            r0[r1] = r2
            goto L_0x01f4
        L_0x01c6:
            com.instabug.library.annotation.e r1 = new com.instabug.library.annotation.e
            com.instabug.library.annotation.b$h r7 = new com.instabug.library.annotation.b$h
            int r8 = r11.f25745P
            android.graphics.Paint r9 = r11.f25744O
            r10 = 222(0xde, float:3.11E-43)
            r0[r10] = r2
            float r9 = r9.getStrokeWidth()
            r7.<init>(r8, r9, r6)
            r1.<init>(r7)
            f25741v0 = r1
            r1 = 223(0xdf, float:3.12E-43)
            r0[r1] = r2
            com.instabug.library.annotation.f r1 = f25740u0
            com.instabug.library.annotation.e r7 = f25741v0
            r1.mo34821a(r7)
            r1 = 224(0xe0, float:3.14E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 225(0xe1, float:3.15E-43)
            r0[r1] = r2
        L_0x01f4:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.DRAW
            r11.f25764j0 = r1
            r1 = 234(0xea, float:3.28E-43)
            r0[r1] = r2
            goto L_0x0229
        L_0x01fd:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.DRAG
            r11.f25764j0 = r1
            r1 = 235(0xeb, float:3.3E-43)
            r0[r1] = r2
            goto L_0x0229
        L_0x0206:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_RIGHT_BUTTON
            r11.f25764j0 = r1
            r1 = 219(0xdb, float:3.07E-43)
            r0[r1] = r2
            goto L_0x0229
        L_0x020f:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_LEFT_BUTTON
            r11.f25764j0 = r1
            r1 = 216(0xd8, float:3.03E-43)
            r0[r1] = r2
            goto L_0x0229
        L_0x0218:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_LEFT_BUTTON
            r11.f25764j0 = r1
            r1 = 213(0xd5, float:2.98E-43)
            r0[r1] = r2
            goto L_0x0229
        L_0x0221:
            com.instabug.library.annotation.AnnotationView$b r1 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_RIGHT_BUTTON
            r11.f25764j0 = r1
            r1 = 210(0xd2, float:2.94E-43)
            r0[r1] = r2
        L_0x0229:
            r11.m45346i()
            r1 = 236(0xec, float:3.31E-43)
            r0[r1] = r2
            r11.invalidate()
            r1 = 237(0xed, float:3.32E-43)
            r0[r1] = r2
        L_0x0237:
            com.instabug.library.annotation.AnnotationView$b r1 = r11.f25764j0
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_LEFT_BUTTON
            if (r1 != r7) goto L_0x0243
            r12 = 254(0xfe, float:3.56E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x0243:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_TOP_RIGHT_BUTTON
            if (r1 != r7) goto L_0x024d
            r12 = 255(0xff, float:3.57E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x024d:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_RIGHT_BUTTON
            if (r1 != r7) goto L_0x0257
            r12 = 256(0x100, float:3.59E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x0257:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.RESIZE_BY_BOTTOM_LEFT_BUTTON
            if (r1 != r7) goto L_0x0261
            r12 = 257(0x101, float:3.6E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x0261:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.DRAG
            if (r1 != r7) goto L_0x026a
            r12 = 258(0x102, float:3.62E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x026a:
            com.instabug.library.annotation.AnnotationView$b r7 = com.instabug.library.annotation.AnnotationView.C9722b.DRAW
            if (r1 == r7) goto L_0x0273
            r12 = 259(0x103, float:3.63E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x0273:
            com.instabug.library.annotation.AnnotationView$c r1 = r11.f25765k0
            com.instabug.library.annotation.AnnotationView$c r7 = com.instabug.library.annotation.AnnotationView.C9723c.DRAW_PATH
            if (r1 == r7) goto L_0x027e
            r12 = 260(0x104, float:3.64E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x027e:
            r1 = 261(0x105, float:3.66E-43)
            r0[r1] = r2
            int r12 = r12.getAction()
            if (r12 == 0) goto L_0x02c5
            if (r12 == r2) goto L_0x02a6
            if (r12 == r5) goto L_0x0291
            r12 = 262(0x106, float:3.67E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x0291:
            r11.f25749T = r2
            r12 = 265(0x109, float:3.71E-43)
            r0[r12] = r2
            r11.m45341c(r3, r4)
            r12 = 266(0x10a, float:3.73E-43)
            r0[r12] = r2
            r11.invalidate()
            r12 = 267(0x10b, float:3.74E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x02a6:
            r11.m45345h()
            boolean r12 = r11.f25749T
            if (r12 == 0) goto L_0x02b2
            r12 = 268(0x10c, float:3.76E-43)
            r0[r12] = r2
            goto L_0x02bd
        L_0x02b2:
            r12 = 269(0x10d, float:3.77E-43)
            r0[r12] = r2
            r11.performClick()
            r12 = 270(0x10e, float:3.78E-43)
            r0[r12] = r2
        L_0x02bd:
            r11.invalidate()
            r12 = 271(0x10f, float:3.8E-43)
            r0[r12] = r2
            goto L_0x02d2
        L_0x02c5:
            r11.f25749T = r6
            r12 = 263(0x107, float:3.69E-43)
            r0[r12] = r2
            r11.m45330a(r3, r4)
            r12 = 264(0x108, float:3.7E-43)
            r0[r12] = r2
        L_0x02d2:
            r12 = 272(0x110, float:3.81E-43)
            r0[r12] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawingColor(int i) {
        boolean[] k = m45348k();
        this.f25745P = i;
        k[28] = true;
        this.f25744O.setColor(this.f25745P);
        k[29] = true;
    }

    public void setDrawingMode(C9723c cVar) {
        boolean[] k = m45348k();
        this.f25765k0 = cVar;
        k[401] = true;
    }

    public void setImageBitmap(Bitmap bitmap) {
        boolean[] k = m45348k();
        this.f25752W = bitmap;
        k[154] = true;
        super.setImageBitmap(bitmap);
        k[155] = true;
    }

    public void setOnActionDownListener(C9726f fVar) {
        boolean[] k = m45348k();
        this.f25767m0 = fVar;
        k[411] = true;
    }

    /* renamed from: setOnNewMagnifierAddingAِِِbilityChangedListener reason: contains not printable characters */
    public void m68856setOnNewMagnifierAddingAbilityChangedListener(C9727g gVar) {
        boolean[] k = m45348k();
        this.f25768n0 = gVar;
        k[423] = true;
    }

    public void setOnPathRecognizedListener(C9728h hVar) {
        boolean[] k = m45348k();
        this.f25769o0 = hVar;
        k[458] = true;
    }

    public void setScreenshot(Drawable drawable) {
        boolean[] k = m45348k();
        this.f25750U = drawable;
        k[389] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45333a(AnnotationView annotationView) {
        boolean[] k = m45348k();
        annotationView.m45347j();
        k[463] = true;
    }

    /* renamed from: b */
    private void m45338b(float f, float f2) {
        boolean[] k = m45348k();
        PointF[] pointFArr = this.f25751V;
        int length = pointFArr.length;
        k[63] = true;
        int i = 0;
        while (i < length) {
            PointF pointF = pointFArr[i];
            pointF.x = f;
            pointF.y = f2;
            i++;
            k[64] = true;
        }
        k[65] = true;
    }

    public AnnotationView(Context context, AttributeSet attributeSet) {
        boolean[] k = m45348k();
        this(context, attributeSet, 0);
        k[1] = true;
    }

    /* renamed from: a */
    private void m45330a(float f, float f2) {
        boolean[] k = m45348k();
        this.f25755b = new Path();
        k[56] = true;
        this.f25743N = new ArrayList();
        k[57] = true;
        this.f25746Q.put(this.f25755b, Integer.valueOf(this.f25745P));
        k[58] = true;
        this.f25755b.reset();
        k[59] = true;
        this.f25755b.moveTo(f, f2);
        k[60] = true;
        this.f25743N.add(new PointF(f, f2));
        this.f25747R = f;
        this.f25748S = f2;
        k[61] = true;
        m45338b(f, f2);
        k[62] = true;
    }

    public AnnotationView(Context context, AttributeSet attributeSet, int i) {
        boolean[] k = m45348k();
        super(context, attributeSet, i);
        k[2] = true;
        this.f25746Q = new LinkedHashMap<>();
        this.f25751V = new PointF[5];
        k[3] = true;
        this.f25763i0 = new PointF();
        this.f25764j0 = C9722b.NONE;
        this.f25765k0 = C9723c.NONE;
        k[4] = true;
        this.f25766l0 = new C9759a();
        int i2 = 0;
        this.f25773s0 = false;
        k[5] = true;
        f25740u0 = new C9763f();
        k[6] = true;
        this.f25753a = new GestureDetector(context, new C9724d(this, null));
        k[7] = true;
        this.f25758d0 = new Paint(1);
        k[8] = true;
        this.f25758d0.setColor(-65281);
        k[9] = true;
        this.f25759e0 = new C9758c();
        k[10] = true;
        this.f25760f0 = new C9758c();
        k[11] = true;
        this.f25761g0 = new C9758c();
        k[12] = true;
        this.f25762h0 = new C9758c();
        k[13] = true;
        m45344g();
        k[14] = true;
        while (true) {
            PointF[] pointFArr = this.f25751V;
            if (i2 < pointFArr.length) {
                k[15] = true;
                pointFArr[i2] = new PointF();
                i2++;
                k[16] = true;
            } else {
                k[17] = true;
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo34707b() {
        boolean[] k = m45348k();
        if (this.f25774t0 >= 5) {
            k[381] = true;
        } else {
            k[382] = true;
            mo34706a((C9756i) new C9757j(getScaledBitmap()));
            this.f25774t0++;
            k[383] = true;
        }
        if (this.f25774t0 != 5) {
            k[384] = true;
        } else {
            C9727g gVar = this.f25768n0;
            if (gVar == null) {
                k[385] = true;
            } else {
                k[386] = true;
                gVar.mo34702a(false);
                k[387] = true;
            }
        }
        k[388] = true;
    }

    @C0195i0
    /* renamed from: c */
    public Bitmap mo34708c() {
        boolean[] k = m45348k();
        if (getWidth() <= 0) {
            k[390] = true;
        } else if (getHeight() <= 0) {
            k[391] = true;
        } else {
            C9763f fVar = f25740u0;
            if (fVar == null) {
                k[392] = true;
            } else {
                Bitmap a = m45328a(fVar.mo34824d());
                k[394] = true;
                return a;
            }
        }
        k[393] = true;
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.instabug.library.annotation.b$i] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.instabug.library.annotation.b$f] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v18, types: [com.instabug.library.annotation.b$h] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02de  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45336a(com.instabug.library.annotation.C9747b r14) {
        /*
            r13 = this;
            boolean[] r0 = m45348k()
            com.instabug.library.annotation.a.c r1 = new com.instabug.library.annotation.a.c
            r1.<init>()
            r2 = 1
            r3 = 86
            r0[r3] = r2
            android.graphics.Path r3 = r13.f25755b
            com.instabug.library.annotation.a.c$a r1 = r1.mo34759a(r3)
            com.instabug.library.annotation.a.e$a r3 = r1.f25828a
            com.instabug.library.annotation.a.e$a r4 = com.instabug.library.annotation.p380a.C9742e.C9743a.ARROW
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 90
            if (r3 != r4) goto L_0x0023
            r3 = 87
            r0[r3] = r2
            goto L_0x002b
        L_0x0023:
            com.instabug.library.annotation.a.e$a r4 = com.instabug.library.annotation.p380a.C9742e.C9743a.LINE
            if (r3 != r4) goto L_0x00f1
            r3 = 88
            r0[r3] = r2
        L_0x002b:
            float r3 = r14.width()
            float r4 = r14.height()
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 89
            r0[r4] = r2
            float r4 = r14.centerX()
            float r3 = r3 / r5
            float r4 = r4 - r3
            r0[r6] = r2
            float r5 = r14.centerX()
            float r5 = r5 + r3
            r3 = 91
            r0[r3] = r2
            android.graphics.PointF r3 = new android.graphics.PointF
            float r6 = r14.centerY()
            r3.<init>(r4, r6)
            r4 = 92
            r0[r4] = r2
            android.graphics.PointF r4 = new android.graphics.PointF
            float r6 = r14.centerY()
            r4.<init>(r5, r6)
            r5 = 93
            r0[r5] = r2
            float r5 = r14.centerX()
            float r6 = r14.centerY()
            int r7 = r1.f25829b
            float r7 = (float) r7
            com.instabug.library.annotation.p381d.C9761c.m45518a(r5, r6, r7, r3)
            r5 = 94
            r0[r5] = r2
            float r5 = r14.centerX()
            float r6 = r14.centerY()
            int r7 = r1.f25829b
            float r7 = (float) r7
            com.instabug.library.annotation.p381d.C9761c.m45518a(r5, r6, r7, r4)
            com.instabug.library.annotation.b$c r5 = new com.instabug.library.annotation.b$c
            int r6 = r13.f25745P
            android.graphics.Paint r7 = r13.f25744O
            r8 = 95
            r0[r8] = r2
            float r7 = r7.getStrokeWidth()
            r5.<init>(r3, r4, r6, r7)
            r6 = 96
            r0[r6] = r2
            int r6 = r1.f25829b
            r5.mo34773a(r6)
            com.instabug.library.annotation.a.e$a r1 = r1.f25828a
            com.instabug.library.annotation.a.e$a r6 = com.instabug.library.annotation.p380a.C9742e.C9743a.ARROW
            if (r1 == r6) goto L_0x00ab
            r1 = 97
            r0[r1] = r2
            goto L_0x00b8
        L_0x00ab:
            r1 = 98
            r0[r1] = r2
            java.lang.String r1 = "arrow"
            r5.mo34782b(r1)
            r1 = 99
            r0[r1] = r2
        L_0x00b8:
            float r1 = r3.x
            float r6 = r4.x
            float r1 = java.lang.Math.min(r1, r6)
            r6 = 100
            r0[r6] = r2
            float r6 = r3.x
            float r7 = r4.x
            float r6 = java.lang.Math.max(r6, r7)
            r7 = 101(0x65, float:1.42E-43)
            r0[r7] = r2
            float r7 = r3.y
            float r8 = r4.y
            float r7 = java.lang.Math.min(r7, r8)
            r8 = 102(0x66, float:1.43E-43)
            r0[r8] = r2
            float r3 = r3.y
            float r4 = r4.y
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 103(0x67, float:1.44E-43)
            r0[r4] = r2
            r14.set(r1, r7, r6, r3)
            r1 = 104(0x68, float:1.46E-43)
            r0[r1] = r2
            goto L_0x02d3
        L_0x00f1:
            com.instabug.library.annotation.a.e$a r4 = com.instabug.library.annotation.p380a.C9742e.C9743a.RECT
            r7 = 0
            r8 = 70
            r9 = 20
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 != r4) goto L_0x0230
            r3 = 105(0x69, float:1.47E-43)
            r0[r3] = r2
            float r3 = r14.width()
            float r4 = r14.height()
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 106(0x6a, float:1.49E-43)
            r0[r4] = r2
            float r4 = r14.centerX()
            float r3 = r3 / r5
            float r4 = r4 - r3
            r5 = 107(0x6b, float:1.5E-43)
            r0[r5] = r2
            float r5 = r14.centerX()
            float r5 = r5 + r3
            r11 = 108(0x6c, float:1.51E-43)
            r0[r11] = r2
            float r11 = r14.centerY()
            float r11 = r11 - r3
            r12 = 109(0x6d, float:1.53E-43)
            r0[r12] = r2
            float r12 = r14.centerY()
            float r12 = r12 + r3
            r0[r10] = r2
            r14.set(r4, r11, r5, r12)
            r3 = 111(0x6f, float:1.56E-43)
            r0[r3] = r2
            float r3 = r1.f25830c
            float r4 = r14.width()
            float r3 = r3 * r4
            int r4 = r1.f25829b
            r5 = 160(0xa0, float:2.24E-43)
            r11 = 180(0xb4, float:2.52E-43)
            if (r4 > r9) goto L_0x0150
            r4 = 112(0x70, float:1.57E-43)
            r0[r4] = r2
            r4 = 0
            goto L_0x0171
        L_0x0150:
            if (r4 >= r8) goto L_0x0157
            r7 = 113(0x71, float:1.58E-43)
            r0[r7] = r2
            goto L_0x015d
        L_0x0157:
            if (r4 <= r10) goto L_0x016b
            r7 = 114(0x72, float:1.6E-43)
            r0[r7] = r2
        L_0x015d:
            if (r4 >= r5) goto L_0x0164
            r7 = 116(0x74, float:1.63E-43)
            r0[r7] = r2
            goto L_0x0171
        L_0x0164:
            r4 = 117(0x75, float:1.64E-43)
            r0[r4] = r2
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0171
        L_0x016b:
            r4 = 115(0x73, float:1.61E-43)
            r0[r4] = r2
            r4 = 90
        L_0x0171:
            if (r4 != 0) goto L_0x0178
            r6 = 118(0x76, float:1.65E-43)
            r0[r6] = r2
            goto L_0x017e
        L_0x0178:
            if (r4 != r11) goto L_0x018d
            r6 = 119(0x77, float:1.67E-43)
            r0[r6] = r2
        L_0x017e:
            float r6 = r14.left
            float r6 = r6 + r3
            r14.left = r6
            float r6 = r14.right
            float r6 = r6 - r3
            r14.right = r6
            r3 = 120(0x78, float:1.68E-43)
            r0[r3] = r2
            goto L_0x01ca
        L_0x018d:
            if (r4 != r6) goto L_0x019e
            float r6 = r14.top
            float r6 = r6 + r3
            r14.top = r6
            float r6 = r14.bottom
            float r6 = r6 - r3
            r14.bottom = r6
            r3 = 121(0x79, float:1.7E-43)
            r0[r3] = r2
            goto L_0x01ca
        L_0x019e:
            if (r4 > r6) goto L_0x01a5
            r6 = 122(0x7a, float:1.71E-43)
            r0[r6] = r2
            goto L_0x01ab
        L_0x01a5:
            if (r4 < r11) goto L_0x01ba
            r6 = 123(0x7b, float:1.72E-43)
            r0[r6] = r2
        L_0x01ab:
            float r6 = r14.left
            float r6 = r6 + r3
            r14.left = r6
            float r6 = r14.right
            float r6 = r6 - r3
            r14.right = r6
            r3 = 125(0x7d, float:1.75E-43)
            r0[r3] = r2
            goto L_0x01ca
        L_0x01ba:
            int r4 = r4 + -90
            float r6 = r14.top
            float r6 = r6 + r3
            r14.top = r6
            float r6 = r14.bottom
            float r6 = r6 - r3
            r14.bottom = r6
            r3 = 124(0x7c, float:1.74E-43)
            r0[r3] = r2
        L_0x01ca:
            int r3 = r1.f25829b
            if (r3 >= r9) goto L_0x01d3
            r3 = 126(0x7e, float:1.77E-43)
            r0[r3] = r2
            goto L_0x01de
        L_0x01d3:
            if (r3 > r8) goto L_0x01da
            r1 = 127(0x7f, float:1.78E-43)
            r0[r1] = r2
            goto L_0x01f2
        L_0x01da:
            r3 = 128(0x80, float:1.794E-43)
            r0[r3] = r2
        L_0x01de:
            int r1 = r1.f25829b
            if (r1 >= r10) goto L_0x01e7
            r1 = 129(0x81, float:1.81E-43)
            r0[r1] = r2
            goto L_0x021d
        L_0x01e7:
            if (r1 <= r5) goto L_0x01ee
            r1 = 130(0x82, float:1.82E-43)
            r0[r1] = r2
            goto L_0x021d
        L_0x01ee:
            r1 = 131(0x83, float:1.84E-43)
            r0[r1] = r2
        L_0x01f2:
            float r1 = r14.width()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r3
            r5 = 132(0x84, float:1.85E-43)
            r0[r5] = r2
            float r5 = r14.height()
            float r5 = r5 * r3
            float r3 = r14.left
            float r3 = r3 + r1
            r14.left = r3
            float r3 = r14.right
            float r3 = r3 - r1
            r14.right = r3
            float r1 = r14.top
            float r1 = r1 + r5
            r14.top = r1
            float r1 = r14.bottom
            float r1 = r1 - r5
            r14.bottom = r1
            r1 = 133(0x85, float:1.86E-43)
            r0[r1] = r2
        L_0x021d:
            com.instabug.library.annotation.b$h r5 = new com.instabug.library.annotation.b$h
            int r1 = r13.f25745P
            android.graphics.Paint r3 = r13.f25744O
            float r3 = r3.getStrokeWidth()
            r5.<init>(r1, r3, r4)
            r1 = 134(0x86, float:1.88E-43)
            r0[r1] = r2
            goto L_0x02d3
        L_0x0230:
            com.instabug.library.annotation.a.e$a r4 = com.instabug.library.annotation.p380a.C9742e.C9743a.OVAL
            if (r3 == r4) goto L_0x023b
            r1 = 135(0x87, float:1.89E-43)
            r0[r1] = r2
            r5 = 0
            goto L_0x02d3
        L_0x023b:
            r3 = 136(0x88, float:1.9E-43)
            r0[r3] = r2
            float r3 = r14.width()
            float r4 = r14.height()
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 137(0x89, float:1.92E-43)
            r0[r4] = r2
            float r4 = r14.centerX()
            float r3 = r3 / r5
            float r4 = r4 - r3
            r5 = 138(0x8a, float:1.93E-43)
            r0[r5] = r2
            float r5 = r14.centerX()
            float r5 = r5 + r3
            r11 = 139(0x8b, float:1.95E-43)
            r0[r11] = r2
            float r11 = r14.centerY()
            float r11 = r11 - r3
            r12 = 140(0x8c, float:1.96E-43)
            r0[r12] = r2
            float r12 = r14.centerY()
            float r12 = r12 + r3
            r3 = 141(0x8d, float:1.98E-43)
            r0[r3] = r2
            r14.set(r4, r11, r5, r12)
            r3 = 142(0x8e, float:1.99E-43)
            r0[r3] = r2
            float r3 = r1.f25830c
            float r4 = r14.width()
            float r3 = r3 * r4
            int r1 = r1.f25829b
            if (r1 > r9) goto L_0x028d
            r1 = 143(0x8f, float:2.0E-43)
            r0[r1] = r2
            r1 = 0
            goto L_0x02a1
        L_0x028d:
            if (r1 >= r8) goto L_0x0294
            r4 = 144(0x90, float:2.02E-43)
            r0[r4] = r2
            goto L_0x02a1
        L_0x0294:
            if (r1 <= r10) goto L_0x029b
            r4 = 145(0x91, float:2.03E-43)
            r0[r4] = r2
            goto L_0x02a1
        L_0x029b:
            r1 = 146(0x92, float:2.05E-43)
            r0[r1] = r2
            r1 = 90
        L_0x02a1:
            if (r1 < r6) goto L_0x02b4
            int r1 = r1 + -90
            float r4 = r14.top
            float r4 = r4 + r3
            r14.top = r4
            float r4 = r14.bottom
            float r4 = r4 - r3
            r14.bottom = r4
            r3 = 147(0x93, float:2.06E-43)
            r0[r3] = r2
            goto L_0x02c2
        L_0x02b4:
            float r4 = r14.left
            float r4 = r4 + r3
            r14.left = r4
            float r4 = r14.right
            float r4 = r4 - r3
            r14.right = r4
            r3 = 148(0x94, float:2.07E-43)
            r0[r3] = r2
        L_0x02c2:
            com.instabug.library.annotation.b$f r5 = new com.instabug.library.annotation.b$f
            int r3 = r13.f25745P
            android.graphics.Paint r4 = r13.f25744O
            float r4 = r4.getStrokeWidth()
            r5.<init>(r3, r4, r1)
            r1 = 149(0x95, float:2.09E-43)
            r0[r1] = r2
        L_0x02d3:
            r13.f25771q0 = r5
            r13.f25772r0 = r14
            if (r5 != 0) goto L_0x02de
            r14 = 150(0x96, float:2.1E-43)
            r0[r14] = r2
            goto L_0x02f1
        L_0x02de:
            r14 = 151(0x97, float:2.12E-43)
            r0[r14] = r2
            android.graphics.Path r14 = r13.f25755b
            com.instabug.library.annotation.b r1 = r13.f25772r0
            android.graphics.Path r1 = r5.mo34771a(r1)
            r13.m45331a(r14, r1)
            r14 = 152(0x98, float:2.13E-43)
            r0[r14] = r2
        L_0x02f1:
            r14 = 153(0x99, float:2.14E-43)
            r0[r14] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.m45336a(com.instabug.library.annotation.b):void");
    }

    /* renamed from: b */
    private void m45340b(C9762e eVar) {
        boolean[] k = m45348k();
        if (eVar.mo34817e() instanceof C9757j) {
            k[440] = true;
            ((C9757j) eVar.mo34817e()).mo34794a(getScaledBitmap());
            k[441] = true;
        } else if (!(eVar.mo34817e() instanceof C9751d)) {
            k[442] = true;
        } else {
            k[443] = true;
            ((C9751d) eVar.mo34817e()).mo34783a(getScaledBitmap());
            k[444] = true;
        }
        k[445] = true;
    }

    /* renamed from: a */
    private void m45334a(C9756i iVar, C9747b bVar) {
        boolean[] k = m45348k();
        C9762e eVar = f25741v0;
        if (eVar == null) {
            k[156] = true;
        } else {
            k[157] = true;
            eVar.mo34810a(iVar, bVar);
            k[158] = true;
            f25741v0.f25904a.mo34792a(true);
            k[159] = true;
            f25740u0.mo34827e(f25741v0);
            k[160] = true;
        }
        k[161] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34705a() {
        boolean[] k = m45348k();
        if (f25741v0 == null) {
            k[162] = true;
        } else {
            k[163] = true;
            m45334a(this.f25771q0, this.f25772r0);
            k[164] = true;
            invalidate();
            k[165] = true;
        }
        k[166] = true;
    }

    /* renamed from: a */
    private void m45332a(MotionEvent motionEvent) {
        boolean[] k = m45348k();
        float x = motionEvent.getX();
        k[289] = true;
        float y = motionEvent.getY();
        k[290] = true;
        switch (C9721a.f25776b[this.f25764j0.ordinal()]) {
            case 1:
                C9762e eVar = f25741v0;
                if (eVar != null) {
                    k[293] = true;
                    PointF pointF = this.f25763i0;
                    eVar.mo34807a((int) (x - pointF.x), (int) (y - pointF.y));
                    k[294] = true;
                    break;
                } else {
                    k[292] = true;
                    break;
                }
            case 2:
                if (f25741v0 != null) {
                    k[296] = true;
                    C9747b bVar = new C9747b();
                    C9747b bVar2 = f25741v0.f25902O;
                    float f = bVar2.left;
                    if (x < f) {
                        bVar.left = bVar2.right + ((float) ((int) (x - this.f25763i0.x)));
                        bVar.right = bVar2.left;
                        k[297] = true;
                    } else {
                        bVar.left = f;
                        bVar.right = bVar2.right + ((float) ((int) (x - this.f25763i0.x)));
                        k[298] = true;
                    }
                    C9747b bVar3 = f25741v0.f25902O;
                    float f2 = bVar3.top;
                    if (y < f2) {
                        bVar.top = bVar3.bottom + ((float) ((int) (y - this.f25763i0.y)));
                        bVar.bottom = bVar3.top;
                        k[299] = true;
                    } else {
                        bVar.top = f2;
                        bVar.bottom = bVar3.bottom + ((float) ((int) (y - this.f25763i0.y)));
                        k[300] = true;
                    }
                    f25741v0.mo34815b(bVar);
                    k[301] = true;
                    if (!(f25741v0.mo34817e() instanceof C9755h)) {
                        k[302] = true;
                    } else {
                        k[303] = true;
                        C9755h hVar = (C9755h) f25741v0.mo34817e();
                        k[304] = true;
                        hVar.mo34789c(x, y, f25741v0.f25901N);
                        k[305] = true;
                    }
                    k[306] = true;
                    break;
                } else {
                    k[295] = true;
                    break;
                }
            case 3:
                if (f25741v0 != null) {
                    k[308] = true;
                    C9747b bVar4 = new C9747b();
                    C9747b bVar5 = f25741v0.f25902O;
                    float f3 = bVar5.right;
                    if (x > f3) {
                        bVar4.left = f3;
                        bVar4.right = bVar5.left + ((float) ((int) (x - this.f25763i0.x)));
                        k[309] = true;
                    } else {
                        bVar4.left = bVar5.left + ((float) ((int) (x - this.f25763i0.x)));
                        bVar4.right = f3;
                        k[310] = true;
                    }
                    C9747b bVar6 = f25741v0.f25902O;
                    float f4 = bVar6.top;
                    if (y < f4) {
                        bVar4.top = bVar6.bottom + ((float) ((int) (y - this.f25763i0.y)));
                        bVar4.bottom = bVar6.top;
                        k[311] = true;
                    } else {
                        bVar4.top = f4;
                        bVar4.bottom = bVar6.bottom + ((float) ((int) (y - this.f25763i0.y)));
                        k[312] = true;
                    }
                    f25741v0.mo34815b(bVar4);
                    k[313] = true;
                    if (!(f25741v0.mo34817e() instanceof C9755h)) {
                        k[314] = true;
                    } else {
                        k[315] = true;
                        C9755h hVar2 = (C9755h) f25741v0.mo34817e();
                        k[316] = true;
                        hVar2.mo34790d(x, y, f25741v0.f25901N);
                        k[317] = true;
                    }
                    k[318] = true;
                    break;
                } else {
                    k[307] = true;
                    break;
                }
            case 4:
                C9762e eVar2 = f25741v0;
                if (eVar2 != null) {
                    k[320] = true;
                    if (!(eVar2.mo34817e() instanceof C9750c)) {
                        C9747b bVar7 = new C9747b();
                        C9747b bVar8 = f25741v0.f25902O;
                        float f5 = bVar8.right;
                        if (x > f5) {
                            bVar7.left = f5;
                            bVar7.right = bVar8.left + ((float) ((int) (x - this.f25763i0.x)));
                            k[324] = true;
                        } else {
                            bVar7.left = bVar8.left + ((float) ((int) (x - this.f25763i0.x)));
                            bVar7.right = f5;
                            k[325] = true;
                        }
                        C9747b bVar9 = f25741v0.f25902O;
                        float f6 = bVar9.bottom;
                        if (y > f6) {
                            bVar7.top = f6;
                            bVar7.bottom = bVar9.top + ((float) ((int) (y - this.f25763i0.y)));
                            k[326] = true;
                        } else {
                            bVar7.top = bVar9.top + ((float) ((int) (y - this.f25763i0.y)));
                            bVar7.bottom = f6;
                            k[327] = true;
                        }
                        f25741v0.mo34815b(bVar7);
                        k[328] = true;
                        if (!(f25741v0.mo34817e() instanceof C9755h)) {
                            k[329] = true;
                        } else {
                            k[330] = true;
                            C9755h hVar3 = (C9755h) f25741v0.mo34817e();
                            k[331] = true;
                            hVar3.mo34787a(x, y, f25741v0.f25901N);
                            k[332] = true;
                        }
                        k[333] = true;
                        break;
                    } else {
                        k[321] = true;
                        C9750c cVar = (C9750c) f25741v0.mo34817e();
                        k[322] = true;
                        cVar.mo34772a(x, y, f25741v0.f25901N);
                        k[323] = true;
                        break;
                    }
                } else {
                    k[319] = true;
                    break;
                }
            case 5:
                C9762e eVar3 = f25741v0;
                if (eVar3 != null) {
                    k[335] = true;
                    if (!(eVar3.mo34817e() instanceof C9750c)) {
                        C9747b bVar10 = new C9747b();
                        C9747b bVar11 = f25741v0.f25902O;
                        float f7 = bVar11.left;
                        if (x < f7) {
                            bVar10.left = bVar11.right + ((float) ((int) (x - this.f25763i0.x)));
                            bVar10.right = bVar11.left;
                            k[339] = true;
                        } else {
                            bVar10.left = f7;
                            bVar10.right = bVar11.right + ((float) ((int) (x - this.f25763i0.x)));
                            k[340] = true;
                        }
                        C9747b bVar12 = f25741v0.f25902O;
                        float f8 = bVar12.bottom;
                        if (y > f8) {
                            bVar10.top = f8;
                            bVar10.bottom = bVar12.top + ((float) ((int) (y - this.f25763i0.y)));
                            k[341] = true;
                        } else {
                            bVar10.top = bVar12.top + ((float) ((int) (y - this.f25763i0.y)));
                            bVar10.bottom = f8;
                            k[342] = true;
                        }
                        f25741v0.mo34815b(bVar10);
                        k[343] = true;
                        if (!(f25741v0.mo34817e() instanceof C9755h)) {
                            k[344] = true;
                        } else {
                            k[345] = true;
                            C9755h hVar4 = (C9755h) f25741v0.mo34817e();
                            k[346] = true;
                            hVar4.mo34788b(x, y, f25741v0.f25901N);
                            k[347] = true;
                        }
                        k[348] = true;
                        break;
                    } else {
                        k[336] = true;
                        C9750c cVar2 = (C9750c) f25741v0.mo34817e();
                        k[337] = true;
                        cVar2.mo34780b(x, y, f25741v0.f25901N);
                        k[338] = true;
                        break;
                    }
                } else {
                    k[334] = true;
                    break;
                }
            case 6:
                if (f25741v0 != null) {
                    k[350] = true;
                    C9747b bVar13 = new C9747b();
                    float f9 = this.f25763i0.x;
                    if (x < f9) {
                        bVar13.left = (float) ((int) x);
                        bVar13.right = (float) ((int) f9);
                        k[351] = true;
                    } else {
                        bVar13.left = (float) ((int) f9);
                        bVar13.right = (float) ((int) x);
                        k[352] = true;
                    }
                    float f10 = this.f25763i0.y;
                    if (y < f10) {
                        bVar13.top = (float) ((int) y);
                        bVar13.bottom = (float) ((int) f10);
                        k[353] = true;
                    } else {
                        bVar13.top = (float) ((int) f10);
                        bVar13.bottom = (float) ((int) y);
                        k[354] = true;
                    }
                    f25741v0.mo34811a(bVar13);
                    k[355] = true;
                    break;
                } else {
                    k[349] = true;
                    break;
                }
            default:
                k[291] = true;
                break;
        }
        k[356] = true;
    }

    /* renamed from: a */
    public void mo34706a(C9756i iVar) {
        boolean[] k = m45348k();
        int min = Math.min(getWidth(), getHeight()) / 2;
        k[364] = true;
        int width = (getWidth() - min) / 2;
        k[365] = true;
        int height = (getHeight() - min) / 2;
        k[366] = true;
        C9747b bVar = new C9747b((float) width, (float) (height - 30), (float) (width + min), (float) (min + height + 30));
        k[367] = true;
        m45335a(iVar, bVar, C9725e.HIGH);
        k[368] = true;
    }

    /* renamed from: a */
    private void m45335a(C9756i iVar, C9747b bVar, C9725e eVar) {
        boolean[] k = m45348k();
        C9762e eVar2 = new C9762e(iVar);
        k[370] = true;
        eVar2.mo34811a(bVar);
        k[371] = true;
        m45337a(eVar2, eVar);
        k[372] = true;
    }

    /* renamed from: a */
    private void m45337a(C9762e eVar, C9725e eVar2) {
        boolean[] k = m45348k();
        getOriginalBitmap();
        f25741v0 = eVar;
        if (eVar2 == C9725e.LOW) {
            k[373] = true;
            f25740u0.mo34822b(eVar);
            k[374] = true;
        } else {
            f25740u0.mo34821a(eVar);
            k[375] = true;
        }
        invalidate();
        k[376] = true;
    }

    /* renamed from: a */
    private Bitmap m45328a(int i) {
        boolean[] k = m45348k();
        this.f25756b0 = i;
        k[395] = true;
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        k[396] = true;
        Canvas canvas = new Canvas(createBitmap);
        this.f25757c0 = true;
        k[397] = true;
        invalidate();
        k[398] = true;
        draw(canvas);
        this.f25757c0 = false;
        k[399] = true;
        invalidate();
        k[400] = true;
        return createBitmap;
    }

    /* renamed from: a */
    private void m45331a(Path path, Path path2) {
        boolean[] k = m45348k();
        C9728h hVar = this.f25769o0;
        if (hVar == null) {
            k[454] = true;
        } else {
            k[455] = true;
            hVar.mo34701a(path, path2);
            k[456] = true;
        }
        k[457] = true;
    }
}
