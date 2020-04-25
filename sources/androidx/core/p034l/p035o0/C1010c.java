package androidx.core.p034l.p035o0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.util.List;

/* renamed from: androidx.core.l.o0.c */
/* compiled from: AccessibilityManagerCompat */
public final class C1010c {

    @Deprecated
    /* renamed from: androidx.core.l.o0.c$a */
    /* compiled from: AccessibilityManagerCompat */
    public interface C1011a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.core.l.o0.c$b */
    /* compiled from: AccessibilityManagerCompat */
    public static abstract class C1012b implements C1011a {
    }

    /* renamed from: androidx.core.l.o0.c$c */
    /* compiled from: AccessibilityManagerCompat */
    private static class C1013c implements AccessibilityStateChangeListener {

        /* renamed from: a */
        C1011a f4539a;

        C1013c(@C0193h0 C1011a aVar) {
            this.f4539a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1013c.class != obj.getClass()) {
                return false;
            }
            return this.f4539a.equals(((C1013c) obj).f4539a);
        }

        public int hashCode() {
            return this.f4539a.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.f4539a.onAccessibilityStateChanged(z);
        }
    }

    /* renamed from: androidx.core.l.o0.c$d */
    /* compiled from: AccessibilityManagerCompat */
    public interface C1014d {
        void onTouchExplorationStateChanged(boolean z);
    }

    @RequiresApi(19)
    /* renamed from: androidx.core.l.o0.c$e */
    /* compiled from: AccessibilityManagerCompat */
    private static class C1015e implements TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C1014d f4540a;

        C1015e(@C0193h0 C1014d dVar) {
            this.f4540a = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1015e.class != obj.getClass()) {
                return false;
            }
            return this.f4540a.equals(((C1015e) obj).f4540a);
        }

        public int hashCode() {
            return this.f4540a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f4540a.onTouchExplorationStateChanged(z);
        }
    }

    private C1010c() {
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5800a(AccessibilityManager accessibilityManager, C1011a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new C1013c(aVar));
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m5803b(AccessibilityManager accessibilityManager, C1011a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new C1013c(aVar));
    }

    @Deprecated
    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m5798a(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m5802b(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m5799a(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    /* renamed from: b */
    public static boolean m5804b(AccessibilityManager accessibilityManager, C1014d dVar) {
        if (VERSION.SDK_INT < 19 || dVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C1015e(dVar));
    }

    /* renamed from: a */
    public static boolean m5801a(AccessibilityManager accessibilityManager, C1014d dVar) {
        if (VERSION.SDK_INT < 19 || dVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new C1015e(dVar));
    }
}
