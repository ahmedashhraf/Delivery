package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.C4056a;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.util.r */
public final class C4499r {

    /* renamed from: a */
    private static final Pattern f13763a = Pattern.compile("\\\\.");

    /* renamed from: b */
    private static final Pattern f13764b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private C4499r() {
    }

    @C4056a
    /* renamed from: a */
    public static String m19401a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f13764b.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt == 12) {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                } else if (charAt == 13) {
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                } else if (charAt == '\"') {
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                } else if (charAt == '/') {
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            matcher.appendReplacement(stringBuffer, "\\\\b");
                            break;
                        case 9:
                            matcher.appendReplacement(stringBuffer, "\\\\t");
                            break;
                        case 10:
                            matcher.appendReplacement(stringBuffer, "\\\\n");
                            break;
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                }
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }

    @C4056a
    /* renamed from: b */
    public static String m19403b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = C4491j0.m19369a(str);
            Matcher matcher = f13763a.matcher(a);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(1);
                if (charAt == '\"') {
                    matcher.appendReplacement(stringBuffer, "\"");
                } else if (charAt == '/') {
                    matcher.appendReplacement(stringBuffer, "/");
                } else if (charAt == '\\') {
                    matcher.appendReplacement(stringBuffer, "\\\\");
                } else if (charAt == 'b') {
                    matcher.appendReplacement(stringBuffer, "\b");
                } else if (charAt == 'f') {
                    matcher.appendReplacement(stringBuffer, "\f");
                } else if (charAt == 'n') {
                    matcher.appendReplacement(stringBuffer, "\n");
                } else if (charAt == 'r') {
                    matcher.appendReplacement(stringBuffer, "\r");
                } else if (charAt == 't') {
                    matcher.appendReplacement(stringBuffer, "\t");
                } else {
                    throw new IllegalStateException("Found an escaped character that should never be.");
                }
            }
            if (stringBuffer == null) {
                return a;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19402a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (!jSONObject2.has(str)) {
                    return false;
                }
                try {
                    if (!m19402a(jSONObject.get(str), jSONObject2.get(str))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        } else if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!m19402a(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                    i++;
                } catch (JSONException unused2) {
                    return false;
                }
            }
            return true;
        }
    }
}
