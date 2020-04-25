package com.google.android.play.core.install.p188c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.install.c.f */
public final class C7123f {

    /* renamed from: a */
    private static final Map<Integer, String> f20219a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f20220b = new HashMap();

    static {
        Map<Integer, String> map = f20219a;
        Integer valueOf = Integer.valueOf(1);
        map.put(valueOf, "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        Map<Integer, String> map2 = f20219a;
        Integer valueOf2 = Integer.valueOf(-2);
        map2.put(valueOf2, "An unknown error occurred.");
        Map<Integer, String> map3 = f20219a;
        Integer valueOf3 = Integer.valueOf(-3);
        map3.put(valueOf3, "The API is not available on this device.");
        Map<Integer, String> map4 = f20219a;
        Integer valueOf4 = Integer.valueOf(-4);
        map4.put(valueOf4, "The request that was sent by the app is malformed.");
        Map<Integer, String> map5 = f20219a;
        Integer valueOf5 = Integer.valueOf(-5);
        map5.put(valueOf5, "The install is unavailable to this user or device.");
        Map<Integer, String> map6 = f20219a;
        Integer valueOf6 = Integer.valueOf(-6);
        map6.put(valueOf6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        Map<Integer, String> map7 = f20219a;
        Integer valueOf7 = Integer.valueOf(-7);
        map7.put(valueOf7, "The install/update has not been (fully) downloaded yet.");
        f20219a.put(Integer.valueOf(-8), "The install is already in progress and there is no UI flow to resume.");
        f20219a.put(Integer.valueOf(-100), "An internal error happened in the Play Store.");
        f20220b.put(valueOf, "NO_ERROR_PARTIALLY_ALLOWED");
        f20220b.put(valueOf2, "ERROR_UNKNOWN");
        f20220b.put(valueOf3, "ERROR_API_NOT_AVAILABLE");
        f20220b.put(valueOf4, "ERROR_INVALID_REQUEST");
        f20220b.put(valueOf5, "ERROR_INSTALL_UNAVAILABLE");
        f20220b.put(valueOf6, "ERROR_INSTALL_NOT_ALLOWED");
        f20220b.put(valueOf7, "ERROR_DOWNLOAD_NOT_PRESENT");
        f20220b.put(Integer.valueOf(-8), "ERROR_INSTALL_IN_PROGRESS");
        f20220b.put(Integer.valueOf(-100), "ERROR_INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m34298a(int i) {
        if (!f20219a.containsKey(Integer.valueOf(i)) || !f20220b.containsKey(Integer.valueOf(i))) {
            return "";
        }
        String str = (String) f20219a.get(Integer.valueOf(i));
        String str2 = (String) f20220b.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode");
        sb.append("#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
