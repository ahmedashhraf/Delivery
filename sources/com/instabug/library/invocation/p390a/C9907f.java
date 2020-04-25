package com.instabug.library.invocation.p390a;

import android.content.Context;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import androidx.core.p034l.C0978f;
import com.instabug.library.invocation.C9909b;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.a.f */
/* compiled from: TwoFingerSwipeLeftInvoker */
public class C9907f implements C9882a<MotionEvent> {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f26347Q;

    /* renamed from: N */
    private Context f26348N;

    /* renamed from: O */
    private boolean f26349O = false;

    /* renamed from: P */
    private C9909b f26350P;

    /* renamed from: a */
    private C0978f f26351a;

    /* renamed from: b */
    private C9908a f26352b;

    /* renamed from: com.instabug.library.invocation.a.f$a */
    /* compiled from: TwoFingerSwipeLeftInvoker */
    class C9908a extends SimpleOnGestureListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26353b;

        /* renamed from: a */
        final /* synthetic */ C9907f f26354a;

        C9908a(C9907f fVar) {
            boolean[] a = m46127a();
            this.f26354a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46127a() {
            boolean[] zArr = f26353b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5922242163232286864L, "com/instabug/library/invocation/invoker/TwoFingerSwipeLeftInvoker$GestureListener", 7);
            f26353b = a;
            return a;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean[] a = m46127a();
            if (!C9907f.m46120a(this.f26354a, motionEvent, motionEvent2)) {
                a[1] = true;
            } else if (!C9907f.m46119a(this.f26354a)) {
                a[2] = true;
            } else {
                a[3] = true;
                InstabugSDKLogger.m46622d(this, "Two fingers swiped left, invoking SDK");
                a[4] = true;
                C9907f.m46123b(this.f26354a).onInvocationRequested();
                a[5] = true;
            }
            C9907f.m46121a(this.f26354a, false);
            a[6] = true;
            return false;
        }
    }

    public C9907f(Context context, C9909b bVar) {
        boolean[] a = m46122a();
        this.f26348N = context;
        this.f26350P = bVar;
        a[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46119a(C9907f fVar) {
        boolean[] a = m46122a();
        boolean z = fVar.f26349O;
        a[18] = true;
        return z;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46122a() {
        boolean[] zArr = f26347Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3264556351157390522L, "com/instabug/library/invocation/invoker/TwoFingerSwipeLeftInvoker", 21);
        f26347Q = a;
        return a;
    }

    /* renamed from: b */
    static /* synthetic */ C9909b m46123b(C9907f fVar) {
        boolean[] a = m46122a();
        C9909b bVar = fVar.f26350P;
        a[19] = true;
        return bVar;
    }

    /* renamed from: c */
    public void mo35184c() {
        boolean[] a = m46122a();
        this.f26352b = null;
        this.f26351a = null;
        a[8] = true;
    }

    /* renamed from: d */
    public void mo35185d() {
        boolean[] a = m46122a();
        this.f26352b = new C9908a(this);
        a[1] = true;
        this.f26351a = new C0978f(this.f26348N, this.f26352b);
        a[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46120a(C9907f fVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean[] a = m46122a();
        boolean a2 = fVar.m46118a(motionEvent, motionEvent2);
        a[17] = true;
        return a2;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46121a(C9907f fVar, boolean z) {
        boolean[] a = m46122a();
        fVar.f26349O = z;
        a[20] = true;
        return z;
    }

    /* renamed from: a */
    public void mo35219a(MotionEvent motionEvent) {
        boolean[] a = m46122a();
        if (this.f26351a == null) {
            a[3] = true;
            return;
        }
        if ((motionEvent.getAction() & 255) != 2) {
            a[4] = true;
        } else if (motionEvent.getPointerCount() < 2) {
            a[5] = true;
            return;
        } else {
            this.f26349O = true;
            a[6] = true;
        }
        this.f26351a.mo4817a(motionEvent);
        a[7] = true;
    }

    /* renamed from: a */
    private boolean m46118a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        boolean[] a = m46122a();
        if (motionEvent == null) {
            a[9] = true;
        } else if (motionEvent2 == null) {
            a[10] = true;
        } else if (motionEvent.getX() <= motionEvent2.getX()) {
            a[11] = true;
        } else if (motionEvent.getX() - motionEvent2.getX() < Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            a[12] = true;
        } else {
            a[13] = true;
            z = true;
            a[15] = true;
            return z;
        }
        z = false;
        a[14] = true;
        a[15] = true;
        return z;
    }
}
