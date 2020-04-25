package com.instabug.library.util;

import com.facebook.appevents.AppEventsConstants;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jivesoftware.smack.util.StringUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.c */
/* compiled from: MD5Generator */
public class C10022c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26669a;

    /* renamed from: a */
    public static String m46633a(String str) {
        boolean[] a = m46634a();
        if (str == null) {
            a[1] = true;
        } else if (!str.isEmpty()) {
            a[2] = true;
            try {
                byte[] bytes = str.getBytes("UTF-8");
                a[5] = true;
                MessageDigest instance = MessageDigest.getInstance(StringUtils.MD5);
                a[6] = true;
                byte[] digest = instance.digest(bytes);
                a[7] = true;
                StringBuilder sb = new StringBuilder();
                int length = digest.length;
                int i = 0;
                a[8] = true;
                while (i < length) {
                    byte b = digest[i] & 255;
                    if (b < 16) {
                        a[9] = true;
                        sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        a[10] = true;
                        sb.append(Integer.toHexString(b));
                        a[11] = true;
                    } else {
                        sb.append(Integer.toHexString(b));
                        a[12] = true;
                    }
                    i++;
                    a[13] = true;
                }
                String sb2 = sb.toString();
                a[14] = true;
                return sb2;
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                a[15] = true;
                e.printStackTrace();
                a[16] = true;
                return null;
            }
        } else {
            a[3] = true;
        }
        a[4] = true;
        return "";
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46634a() {
        boolean[] zArr = f26669a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2001226971870196333L, "com/instabug/library/util/MD5Generator", 17);
        f26669a = a;
        return a;
    }
}
