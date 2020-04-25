package com.facebook.marketing.internal;

import android.os.Build;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

public class MarketingUtils {
    private static final String TAG = "com.facebook.marketing.internal.MarketingUtils";

    public static boolean isEmulator() {
        String str = Build.FINGERPRINT;
        String str2 = MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE;
        if (!str.startsWith(str2) && !Build.FINGERPRINT.startsWith("unknown")) {
            String str3 = Build.MODEL;
            String str4 = C14248i.f42027j;
            if (!str3.contains(str4) && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith(str2) || !Build.DEVICE.startsWith(str2)) && !str4.equals(Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    public static double normalizePrice(String str) {
        try {
            return NumberFormat.getNumberInstance(Locale.getDefault()).parse(str.replaceAll("[^\\d,.+-]", "")).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
