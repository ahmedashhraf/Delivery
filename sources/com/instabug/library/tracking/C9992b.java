package com.instabug.library.tracking;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.tracking.b */
/* compiled from: InstabugTouchEventsHandler */
public class C9992b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26592a;

    /* renamed from: com.instabug.library.tracking.b$a */
    /* compiled from: InstabugTouchEventsHandler */
    static class C9993a implements OnTouchListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26593b;

        /* renamed from: a */
        final /* synthetic */ Activity f26594a;

        C9993a(Activity activity) {
            boolean[] a = m46534a();
            this.f26594a = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46534a() {
            boolean[] zArr = f26593b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1153621988121153924L, "com/instabug/library/tracking/InstabugTouchEventsHandler$1", 5);
            f26593b = a;
            return a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean[] a = m46534a();
            if (!C9992b.m46531a()) {
                a[1] = true;
            } else {
                a[2] = true;
                InvocationManager.getInstance().handle(motionEvent);
                a[3] = true;
            }
            InstabugInternalTrackingDelegate.getInstance().trackTouchEvent(motionEvent, this.f26594a);
            a[4] = true;
            return false;
        }
    }

    public C9992b() {
        m46533c()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46531a() {
        boolean[] c = m46533c();
        boolean b = m46532b();
        c[14] = true;
        return b;
    }

    /* renamed from: b */
    private static boolean m46532b() {
        boolean[] c = m46533c();
        InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
        int length = currentInstabugInvocationEvents.length;
        c[10] = true;
        int i = 0;
        while (i < length) {
            if (currentInstabugInvocationEvents[i] == InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT) {
                c[11] = true;
                return true;
            }
            i++;
            c[12] = true;
        }
        c[13] = true;
        return false;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m46533c() {
        boolean[] zArr = f26592a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(786134292026679336L, "com/instabug/library/tracking/InstabugTouchEventsHandler", 15);
        f26592a = a;
        return a;
    }

    /* renamed from: a */
    public static void m46529a(MotionEvent motionEvent, Activity activity) {
        boolean[] c = m46533c();
        if (!m46532b()) {
            c[1] = true;
        } else {
            c[2] = true;
            InstabugSDKLogger.m46622d(C9992b.class, motionEvent.toString());
            c[3] = true;
            InvocationManager.getInstance().handle(motionEvent);
            c[4] = true;
        }
        if (motionEvent == null) {
            c[5] = true;
        } else {
            c[6] = true;
            InstabugInternalTrackingDelegate.getInstance().trackTouchEvent(motionEvent, activity);
            c[7] = true;
        }
        c[8] = true;
    }

    /* renamed from: a */
    public static void m46530a(View view, Activity activity) {
        boolean[] c = m46533c();
        view.setOnTouchListener(new C9993a(activity));
        c[9] = true;
    }
}
