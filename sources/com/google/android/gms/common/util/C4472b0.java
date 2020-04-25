package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import java.util.regex.Pattern;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.util.b0 */
public class C4472b0 {

    /* renamed from: a */
    private static final Pattern f13709a = Pattern.compile("\\$\\{(.*?)\\}");

    private C4472b0() {
    }

    @C4056a
    @C0195i0
    /* renamed from: a */
    public static String m19313a(@C0195i0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @C4056a
    /* renamed from: b */
    public static boolean m19314b(@C0195i0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
