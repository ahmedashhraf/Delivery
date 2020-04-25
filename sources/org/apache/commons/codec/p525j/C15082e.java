package org.apache.commons.codec.p525j;

import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.j.e */
/* compiled from: SoundexUtils */
final class C15082e {
    C15082e() {
    }

    /* renamed from: a */
    static String m66866a(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            char[] cArr = new char[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isLetter(str.charAt(i2))) {
                    int i3 = i + 1;
                    cArr[i] = str.charAt(i2);
                    i = i3;
                }
            }
            if (i == length) {
                return str.toUpperCase();
            }
            str = new String(cArr, 0, i).toUpperCase();
        }
        return str;
    }

    /* renamed from: a */
    static int m66865a(C15071f fVar, String str, String str2) throws EncoderException {
        return m66864a(fVar.encode(str), fVar.encode(str2));
    }

    /* renamed from: a */
    static int m66864a(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (str.charAt(i2) == str2.charAt(i2)) {
                i++;
            }
        }
        return i;
    }
}
