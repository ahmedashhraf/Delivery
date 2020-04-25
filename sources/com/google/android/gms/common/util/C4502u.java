package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C4056a;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.util.u */
public class C4502u {
    private C4502u() {
    }

    @C4056a
    /* renamed from: a */
    public static long m19406a(String str) {
        if (str.length() > 16) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
            sb.append("Invalid input: ");
            sb.append(str);
            sb.append(" exceeds 16 characters");
            throw new NumberFormatException(sb.toString());
        } else if (str.length() != 16) {
            return Long.parseLong(str, 16);
        } else {
            return (Long.parseLong(str.substring(0, 8), 16) << 32) | Long.parseLong(str.substring(8), 16);
        }
    }
}
