package androidx.core.p015a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.facebook.share.internal.MessengerShareContentUtility;

/* renamed from: androidx.core.a.a */
/* compiled from: AccessibilityServiceInfoCompat */
public final class C0725a {

    /* renamed from: a */
    public static final int f3372a = 1;

    /* renamed from: b */
    public static final int f3373b = 2;

    /* renamed from: c */
    public static final int f3374c = 4;

    /* renamed from: d */
    public static final int f3375d = 8;

    /* renamed from: e */
    public static final int f3376e = 32;

    /* renamed from: f */
    public static final int f3377f = -1;

    /* renamed from: g */
    public static final int f3378g = 2;

    /* renamed from: h */
    public static final int f3379h = 4;

    /* renamed from: i */
    public static final int f3380i = 8;

    /* renamed from: j */
    public static final int f3381j = 16;

    /* renamed from: k */
    public static final int f3382k = 32;

    private C0725a() {
    }

    @C0193h0
    /* renamed from: a */
    public static String m4220a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @C0195i0
    /* renamed from: a */
    public static String m4221a(@C0193h0 AccessibilityServiceInfo accessibilityServiceInfo, @C0193h0 PackageManager packageManager) {
        if (VERSION.SDK_INT >= 16) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
        return accessibilityServiceInfo.getDescription();
    }

    @C0193h0
    /* renamed from: b */
    public static String m4222b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @C0195i0
    /* renamed from: c */
    public static String m4223c(int i) {
        if (i == 1) {
            return MessengerShareContentUtility.PREVIEW_DEFAULT;
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    /* renamed from: a */
    public static int m4219a(@C0193h0 AccessibilityServiceInfo accessibilityServiceInfo) {
        if (VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        return accessibilityServiceInfo.getCanRetrieveWindowContent() ? 1 : 0;
    }
}
