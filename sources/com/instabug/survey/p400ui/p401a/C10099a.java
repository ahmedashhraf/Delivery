package com.instabug.survey.p400ui.p401a;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.instabug.library.Instabug;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.a.a */
/* compiled from: GestureListener */
public final class C10099a extends SimpleOnGestureListener {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26868b;

    /* renamed from: a */
    private final C10100a f26869a;

    /* renamed from: com.instabug.survey.ui.a.a$a */
    /* compiled from: GestureListener */
    public interface C10100a {
        /* renamed from: c */
        void mo36254c();

        /* renamed from: d */
        void mo36255d();

        /* renamed from: e */
        void mo36256e();

        /* renamed from: f */
        void mo36257f();

        /* renamed from: g */
        void mo36258g();
    }

    public C10099a(C10100a aVar) {
        boolean[] b = m46987b();
        this.f26869a = aVar;
        b[0] = true;
    }

    /* renamed from: a */
    private float m46986a() {
        float f;
        boolean[] b = m46987b();
        if (InstabugDeviceProperties.isTablet(Instabug.getApplicationContext())) {
            f = 3000.0f;
            b[28] = true;
        } else {
            f = 6000.0f;
            b[29] = true;
        }
        b[30] = true;
        return f;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46987b() {
        boolean[] zArr = f26868b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4185704520798416922L, "com/instabug/survey/ui/gestures/GestureListener", 31);
        f26868b = a;
        return a;
    }

    public boolean onDown(MotionEvent motionEvent) {
        m46987b()[1] = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean[] b = m46987b();
        boolean z = false;
        try {
            b[4] = true;
            float y = motionEvent2.getY() - motionEvent.getY();
            b[5] = true;
            float x = motionEvent2.getX() - motionEvent.getX();
            b[6] = true;
            if (Math.abs(x) > Math.abs(y)) {
                b[7] = true;
                if (Math.abs(x) <= 300.0f) {
                    b[8] = true;
                } else if (Math.abs(f) <= 800.0f) {
                    b[9] = true;
                } else {
                    if (x > 0.0f) {
                        b[10] = true;
                        this.f26869a.mo36255d();
                        b[11] = true;
                    } else {
                        this.f26869a.mo36254c();
                        b[12] = true;
                    }
                    try {
                        b[13] = true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                    }
                }
                b[24] = true;
                b[27] = true;
                return z;
            }
            if (Math.abs(y) <= 300.0f) {
                b[14] = true;
            } else if (Math.abs(f2) <= 800.0f) {
                b[15] = true;
            } else {
                if (y > 0.0f) {
                    b[16] = true;
                    if (Math.abs(f2) <= m46986a()) {
                        b[17] = true;
                    } else {
                        b[18] = true;
                        this.f26869a.mo36257f();
                        b[19] = true;
                    }
                } else if (Math.abs(f2) <= m46986a()) {
                    b[20] = true;
                } else {
                    b[21] = true;
                    this.f26869a.mo36256e();
                    b[22] = true;
                }
                b[23] = true;
            }
            b[24] = true;
            b[27] = true;
            return z;
            z = true;
            b[24] = true;
        } catch (Exception e2) {
            e = e2;
            b[25] = true;
            InstabugSDKLogger.m46624e(this, e.getMessage(), e);
            b[26] = true;
            b[27] = true;
            return z;
        }
        b[27] = true;
        return z;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean[] b = m46987b();
        this.f26869a.mo36258g();
        b[2] = true;
        boolean onSingleTapConfirmed = super.onSingleTapConfirmed(motionEvent);
        b[3] = true;
        return onSingleTapConfirmed;
    }
}
