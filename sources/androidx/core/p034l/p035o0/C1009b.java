package androidx.core.p034l.p035o0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.l.o0.b */
/* compiled from: AccessibilityEventCompat */
public final class C1009b {
    @Deprecated

    /* renamed from: a */
    public static final int f4513a = 128;
    @Deprecated

    /* renamed from: b */
    public static final int f4514b = 256;
    @Deprecated

    /* renamed from: c */
    public static final int f4515c = 512;
    @Deprecated

    /* renamed from: d */
    public static final int f4516d = 1024;
    @Deprecated

    /* renamed from: e */
    public static final int f4517e = 2048;
    @Deprecated

    /* renamed from: f */
    public static final int f4518f = 4096;
    @Deprecated

    /* renamed from: g */
    public static final int f4519g = 8192;

    /* renamed from: h */
    public static final int f4520h = 16384;

    /* renamed from: i */
    public static final int f4521i = 32768;

    /* renamed from: j */
    public static final int f4522j = 65536;

    /* renamed from: k */
    public static final int f4523k = 131072;

    /* renamed from: l */
    public static final int f4524l = 262144;

    /* renamed from: m */
    public static final int f4525m = 524288;

    /* renamed from: n */
    public static final int f4526n = 1048576;

    /* renamed from: o */
    public static final int f4527o = 2097152;

    /* renamed from: p */
    public static final int f4528p = 4194304;

    /* renamed from: q */
    public static final int f4529q = 8388608;

    /* renamed from: r */
    public static final int f4530r = 16777216;

    /* renamed from: s */
    public static final int f4531s = 0;

    /* renamed from: t */
    public static final int f4532t = 1;

    /* renamed from: u */
    public static final int f4533u = 2;

    /* renamed from: v */
    public static final int f4534v = 4;

    /* renamed from: w */
    public static final int f4535w = 8;

    /* renamed from: x */
    public static final int f4536x = 16;

    /* renamed from: y */
    public static final int f4537y = 32;

    /* renamed from: z */
    public static final int f4538z = -1;

    private C1009b() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m5790a(AccessibilityEvent accessibilityEvent, C1024f fVar) {
        accessibilityEvent.appendRecord((AccessibilityRecord) fVar.mo5088g());
    }

    /* renamed from: b */
    public static void m5792b(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityEvent.setAction(i);
        }
    }

    /* renamed from: c */
    public static void m5794c(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: d */
    public static void m5796d(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @Deprecated
    /* renamed from: e */
    public static int m5797e(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    @Deprecated
    /* renamed from: a */
    public static C1024f m5789a(AccessibilityEvent accessibilityEvent, int i) {
        return new C1024f(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    /* renamed from: a */
    public static C1024f m5788a(AccessibilityEvent accessibilityEvent) {
        return new C1024f(accessibilityEvent);
    }

    /* renamed from: b */
    public static int m5791b(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getAction();
        }
        return 0;
    }

    /* renamed from: c */
    public static int m5793c(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: d */
    public static int m5795d(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 16) {
            return accessibilityEvent.getMovementGranularity();
        }
        return 0;
    }
}
