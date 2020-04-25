package com.google.android.play.core.splitinstall.p189c0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.splitinstall.c0.c */
public final class C7160c {

    /* renamed from: a */
    private static final Map<Integer, String> f20270a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f20271b = new HashMap();

    static {
        Map<Integer, String> map = f20270a;
        Integer valueOf = Integer.valueOf(-1);
        map.put(valueOf, "Too many sessions are running for current app, existing sessions must be resolved first.");
        Map<Integer, String> map2 = f20270a;
        Integer valueOf2 = Integer.valueOf(-2);
        map2.put(valueOf2, "A requested module is not available (to this user/device, for the installed apk).");
        Map<Integer, String> map3 = f20270a;
        Integer valueOf3 = Integer.valueOf(-3);
        map3.put(valueOf3, "Request is otherwise invalid.");
        Map<Integer, String> map4 = f20270a;
        Integer valueOf4 = Integer.valueOf(-4);
        map4.put(valueOf4, "Requested session is not found.");
        Map<Integer, String> map5 = f20270a;
        Integer valueOf5 = Integer.valueOf(-5);
        map5.put(valueOf5, "Split Install API is not available.");
        Map<Integer, String> map6 = f20270a;
        Integer valueOf6 = Integer.valueOf(-6);
        map6.put(valueOf6, "Network error: unable to obtain split details.");
        Map<Integer, String> map7 = f20270a;
        Integer valueOf7 = Integer.valueOf(-7);
        map7.put(valueOf7, "Download not permitted under current device circumstances (e.g. in background).");
        f20270a.put(Integer.valueOf(-8), "Requested session contains modules from an existing active session and also new");
        f20270a.put(Integer.valueOf(-9), "Service handling split install has died.");
        f20270a.put(Integer.valueOf(-10), "Install failed due to insufficient storage.");
        f20270a.put(Integer.valueOf(-11), "Signature verification error when invoking SplitCompat.");
        f20270a.put(Integer.valueOf(-12), "Error in SplitCompat emulation.");
        f20270a.put(Integer.valueOf(-13), "Error in copying files for SplitCompat.");
        f20270a.put(Integer.valueOf(-100), "Unknown error processing split install.");
        f20271b.put(valueOf, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        f20271b.put(valueOf2, "MODULE_UNAVAILABLE");
        f20271b.put(valueOf3, "INVALID_REQUEST");
        f20271b.put(valueOf4, "SESSION_NOT_FOUND");
        f20271b.put(valueOf5, "API_NOT_AVAILABLE");
        f20271b.put(valueOf6, "NETWORK_ERROR");
        f20271b.put(valueOf7, "ACCESS_DENIED");
        f20271b.put(Integer.valueOf(-8), "INCOMPATIBLE_WITH_EXISTING_SESSION");
        f20271b.put(Integer.valueOf(-9), "SERVICE_DIED");
        f20271b.put(Integer.valueOf(-10), "INSUFFICIENT_STORAGE");
        f20271b.put(Integer.valueOf(-11), "SPLITCOMPAT_VERIFICATION_ERROR");
        f20271b.put(Integer.valueOf(-12), "SPLITCOMPAT_EMULATION_ERROR");
        f20271b.put(Integer.valueOf(-13), "SPLITCOMPAT_COPY_ERROR");
    }

    /* renamed from: a */
    public static String m34414a(int i) {
        if (!f20270a.containsKey(Integer.valueOf(i)) || !f20271b.containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = (String) f20270a.get(Integer.valueOf(i));
        String str2 = (String) f20271b.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html");
        sb.append("#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
