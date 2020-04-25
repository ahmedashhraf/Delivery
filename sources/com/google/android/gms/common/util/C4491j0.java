package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C4476d0
/* renamed from: com.google.android.gms.common.util.j0 */
public final class C4491j0 {

    /* renamed from: a */
    private static final Pattern f13738a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    /* renamed from: a */
    public static String m19369a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f13738a.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                matcher.appendReplacement(stringBuffer, new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }
}
