package org.jivesoftware.smack.util;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.common.base.C5785c;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Random;

public class StringUtils {
    public static final String AMP_ENCODE = "&amp;";
    public static final String APOS_ENCODE = "&apos;";
    public static final String GT_ENCODE = "&gt;";
    public static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    public static final String LT_ENCODE = "&lt;";
    public static final String MD5 = "MD5";
    public static final String QUOTE_ENCODE = "&quot;";
    public static final String SHA1 = "SHA-1";
    public static final String USASCII = "US-ASCII";
    public static final String UTF8 = "UTF-8";
    private static char[] numbersAndLetters = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static Random randGen = new Random();

    public static String collectionToString(Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        for (String append : collection) {
            sb.append(append);
            sb.append(C3868i.f12248b);
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1);
    }

    public static String encodeHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = HEX_CHARS;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & C5785c.f16698q];
        }
        return new String(cArr);
    }

    public static CharSequence escapeForXML(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        double d = (double) length;
        Double.isNaN(d);
        StringBuilder sb = new StringBuilder((int) (d * 1.3d));
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = charArray[i];
            CharSequence charSequence = c != '\"' ? c != '<' ? c != '>' ? c != '&' ? c != '\'' ? null : APOS_ENCODE : AMP_ENCODE : GT_ENCODE : LT_ENCODE : QUOTE_ENCODE;
            if (charSequence != null) {
                if (i > i2) {
                    sb.append(charArray, i2, i - i2);
                }
                sb.append(charSequence);
                i2 = i + 1;
                i = i2;
            } else {
                i++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        if (i > i2) {
            sb.append(charArray, i2, i - i2);
        }
        return sb;
    }

    @Deprecated
    public static synchronized String hash(String str) {
        String hex;
        synchronized (StringUtils.class) {
            hex = SHA1.hex(str);
        }
        return hex;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isNullOrEmpty(charSequence);
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || isEmpty(charSequence);
    }

    public static String maybeToString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static int nullSafeCharSequenceComperator(CharSequence charSequence, CharSequence charSequence2) {
        int i = 1;
        if ((charSequence == null) ^ (charSequence2 == null)) {
            if (charSequence == null) {
                i = -1;
            }
            return i;
        } else if (charSequence == null && charSequence2 == null) {
            return 0;
        } else {
            return charSequence.toString().compareTo(charSequence2.toString());
        }
    }

    public static boolean nullSafeCharSequenceEquals(CharSequence charSequence, CharSequence charSequence2) {
        return nullSafeCharSequenceComperator(charSequence, charSequence2) == 0;
    }

    public static String randomString(int i) {
        if (i < 1) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char[] cArr2 = numbersAndLetters;
            cArr[i2] = cArr2[randGen.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

    public static <CS extends CharSequence> CS requireNotNullOrEmpty(CS cs, String str) {
        if (!isNullOrEmpty(cs)) {
            return cs;
        }
        throw new IllegalArgumentException(str);
    }

    public static String returnIfNotEmptyTrimmed(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() > 0) {
            return trim;
        }
        return null;
    }

    public static byte[] toBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 encoding not supported by platform", e);
        }
    }
}
