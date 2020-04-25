package bolts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: bolts.e */
/* compiled from: AppLinks */
public final class C2165e {

    /* renamed from: a */
    static final String f8611a = "al_applink_data";

    /* renamed from: b */
    static final String f8612b = "extras";

    /* renamed from: c */
    static final String f8613c = "target_url";

    /* renamed from: a */
    public static Bundle m11194a(Intent intent) {
        return intent.getBundleExtra(f8611a);
    }

    /* renamed from: b */
    public static Bundle m11195b(Intent intent) {
        Bundle a = m11194a(intent);
        if (a == null) {
            return null;
        }
        return a.getBundle("extras");
    }

    /* renamed from: c */
    public static Uri m11196c(Intent intent) {
        Bundle a = m11194a(intent);
        if (a != null) {
            String string = a.getString(f8613c);
            if (string != null) {
                return Uri.parse(string);
            }
        }
        return intent.getData();
    }

    /* renamed from: a */
    public static Uri m11193a(Context context, Intent intent) {
        Bundle a = m11194a(intent);
        if (a != null) {
            String string = a.getString(f8613c);
            if (string != null) {
                C2176m.m11226a(context, C2176m.f8638h, intent, null);
                return Uri.parse(string);
            }
        }
        return null;
    }
}
