package com.oppwa.mobile.connect.p427b;

import android.text.TextUtils;
import androidx.annotation.C0193h0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.oppwa.mobile.connect.b.b */
public class C11779b {
    /* renamed from: a */
    public static String m52946a(@C0193h0 InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    /* renamed from: a */
    public static String m52947a(String str) {
        if (!m52955b((CharSequence) str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        m52948a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m52948a(StringBuilder sb) {
        if (!TextUtils.isEmpty(sb)) {
            for (int i = 0; i < sb.length(); i++) {
                char charAt = sb.charAt(i);
                if (m52951a(charAt)) {
                    int numericValue = Character.getNumericValue(charAt);
                    if (numericValue >= 0) {
                        sb.setCharAt(i, (char) (numericValue + 48));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m52949a(@C0193h0 StringBuilder sb, String str) {
        m52950a(sb, str, "");
    }

    /* renamed from: a */
    public static void m52950a(@C0193h0 StringBuilder sb, String str, String str2) {
        int indexOf = sb.indexOf(str);
        while (indexOf != -1) {
            sb.replace(indexOf, str.length() + indexOf, str2);
            indexOf = sb.indexOf(str, indexOf + str2.length());
        }
    }

    /* renamed from: a */
    private static boolean m52951a(char c) {
        return Character.isDigit(c) && (c < '0' || c > '9');
    }

    /* renamed from: a */
    public static boolean m52952a(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != sb2.length()) {
            return false;
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m52953a(@C0193h0 CharSequence charSequence) {
        ByteBuffer encode = Charset.forName("UTF-8").encode(CharBuffer.wrap(charSequence));
        byte[] copyOfRange = Arrays.copyOfRange(encode.array(), encode.position(), encode.limit());
        Arrays.fill(encode.array(), 0);
        return copyOfRange;
    }

    /* renamed from: b */
    public static void m52954b(@C0193h0 StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, 0);
        }
    }

    /* renamed from: b */
    public static boolean m52955b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (m52951a(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
