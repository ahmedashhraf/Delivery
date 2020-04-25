package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.util.C4471b;
import com.google.android.gms.measurement.AppMeasurement.C5177d;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.internal.C5219c7;
import com.google.android.gms.measurement.internal.C5371q5;
import com.google.android.gms.measurement.internal.C5393s5;
import com.google.firebase.analytics.FirebaseAnalytics.C5853a;
import com.google.firebase.analytics.p313a.C8617a.C8620c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public final class C8631d {

    /* renamed from: a */
    private static final Set<String> f22651a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", C5853a.f16873f, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List<String> f22652b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", C5853a.f16871d});

    /* renamed from: c */
    private static final List<String> f22653c = Arrays.asList(new String[]{"auto", C14330v.f42313b, "am"});

    /* renamed from: d */
    private static final List<String> f22654d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    private static final List<String> f22655e = Arrays.asList((String[]) C4471b.m19311a((T[][]) new String[][]{C5393s5.f15453a, C5393s5.f15454b}));

    /* renamed from: f */
    private static final List<String> f22656f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static boolean m40607a(@C0193h0 String str) {
        return !f22653c.contains(str);
    }

    /* renamed from: b */
    public static boolean m40612b(@C0193h0 String str) {
        return !f22651a.contains(str);
    }

    /* renamed from: c */
    public static boolean m40613c(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m40614d(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: e */
    public static String m40615e(String str) {
        String a = C5371q5.m23392a(str);
        return a != null ? a : str;
    }

    /* renamed from: f */
    public static String m40616f(String str) {
        String b = C5371q5.m23393b(str);
        return b != null ? b : str;
    }

    /* renamed from: a */
    public static boolean m40608a(@C0193h0 String str, @C0195i0 Bundle bundle) {
        if (f22652b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : f22654d) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static ConditionalUserProperty m40611b(C8620c cVar) {
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mOrigin = cVar.f22622a;
        conditionalUserProperty.mActive = cVar.f22635n;
        conditionalUserProperty.mCreationTimestamp = cVar.f22634m;
        conditionalUserProperty.mExpiredEventName = cVar.f22632k;
        Bundle bundle = cVar.f22633l;
        if (bundle != null) {
            conditionalUserProperty.mExpiredEventParams = new Bundle(bundle);
        }
        conditionalUserProperty.mName = cVar.f22623b;
        conditionalUserProperty.mTimedOutEventName = cVar.f22627f;
        Bundle bundle2 = cVar.f22628g;
        if (bundle2 != null) {
            conditionalUserProperty.mTimedOutEventParams = new Bundle(bundle2);
        }
        conditionalUserProperty.mTimeToLive = cVar.f22631j;
        conditionalUserProperty.mTriggeredEventName = cVar.f22629h;
        Bundle bundle3 = cVar.f22630i;
        if (bundle3 != null) {
            conditionalUserProperty.mTriggeredEventParams = new Bundle(bundle3);
        }
        conditionalUserProperty.mTriggeredTimestamp = cVar.f22636o;
        conditionalUserProperty.mTriggerEventName = cVar.f22625d;
        conditionalUserProperty.mTriggerTimeout = cVar.f22626e;
        Object obj = cVar.f22624c;
        if (obj != null) {
            conditionalUserProperty.mValue = C5219c7.m22537a(obj);
        }
        return conditionalUserProperty;
    }

    /* renamed from: a */
    public static boolean m40609a(@C0193h0 String str, @C0193h0 String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        }
        if (C5177d.f14829c.equals(str2)) {
            return str.equals(str3) || str.equals("fiam");
        }
        if (f22655e.contains(str2)) {
            return false;
        }
        for (String matches : f22656f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m40606a(C8620c cVar) {
        if (cVar == null) {
            return false;
        }
        String str = cVar.f22622a;
        if (str == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f22624c;
        if ((obj != null && C5219c7.m22537a(obj) == null) || !m40607a(str) || !m40609a(str, cVar.f22623b)) {
            return false;
        }
        String str2 = cVar.f22632k;
        if (str2 != null && (!m40608a(str2, cVar.f22633l) || !m40610a(str, cVar.f22632k, cVar.f22633l))) {
            return false;
        }
        String str3 = cVar.f22629h;
        if (str3 != null && (!m40608a(str3, cVar.f22630i) || !m40610a(str, cVar.f22629h, cVar.f22630i))) {
            return false;
        }
        String str4 = cVar.f22627f;
        if (str4 == null || (m40608a(str4, cVar.f22628g) && m40610a(str, cVar.f22627f, cVar.f22628g))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m40610a(@C0193h0 String str, @C0193h0 String str2, @C0195i0 Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m40607a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f22654d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        String str3 = "_cis";
        if (c == 0) {
            bundle.putString(str3, "fcm_integration");
            return true;
        } else if (c == 1) {
            bundle.putString(str3, "fdl_integration");
            return true;
        } else if (c != 2) {
            return false;
        } else {
            bundle.putString(str3, "fiam_integration");
            return true;
        }
    }

    /* renamed from: a */
    public static C8620c m40605a(ConditionalUserProperty conditionalUserProperty) {
        C8620c cVar = new C8620c();
        cVar.f22622a = conditionalUserProperty.mOrigin;
        cVar.f22635n = conditionalUserProperty.mActive;
        cVar.f22634m = conditionalUserProperty.mCreationTimestamp;
        cVar.f22632k = conditionalUserProperty.mExpiredEventName;
        Bundle bundle = conditionalUserProperty.mExpiredEventParams;
        if (bundle != null) {
            cVar.f22633l = new Bundle(bundle);
        }
        cVar.f22623b = conditionalUserProperty.mName;
        cVar.f22627f = conditionalUserProperty.mTimedOutEventName;
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            cVar.f22628g = new Bundle(bundle2);
        }
        cVar.f22631j = conditionalUserProperty.mTimeToLive;
        cVar.f22629h = conditionalUserProperty.mTriggeredEventName;
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            cVar.f22630i = new Bundle(bundle3);
        }
        cVar.f22636o = conditionalUserProperty.mTriggeredTimestamp;
        cVar.f22625d = conditionalUserProperty.mTriggerEventName;
        cVar.f22626e = conditionalUserProperty.mTriggerTimeout;
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            cVar.f22624c = C5219c7.m22537a(obj);
        }
        return cVar;
    }
}
