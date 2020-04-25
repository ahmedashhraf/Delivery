package androidx.core.p034l;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.core.C0721R;

/* renamed from: androidx.core.l.g0 */
/* compiled from: ViewGroupCompat */
public final class C0985g0 {

    /* renamed from: a */
    public static final int f4397a = 0;

    /* renamed from: b */
    public static final int f4398b = 1;

    private C0985g0() {
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5643a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m5645b(@C0193h0 ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(z);
        } else {
            viewGroup.setTag(C0721R.C0724id.tag_transition_group, Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public static boolean m5646c(@C0193h0 ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0721R.C0724id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0962e0.m5415S(viewGroup) == null) ? false : true;
    }

    @Deprecated
    /* renamed from: a */
    public static void m5642a(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    /* renamed from: a */
    public static int m5640a(@C0193h0 ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    /* renamed from: b */
    public static int m5644b(@C0193h0 ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        if (viewGroup instanceof C1052v) {
            return ((C1052v) viewGroup).getNestedScrollAxes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m5641a(@C0193h0 ViewGroup viewGroup, int i) {
        if (VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(i);
        }
    }
}
