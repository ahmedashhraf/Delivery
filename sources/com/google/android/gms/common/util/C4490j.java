package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.C4056a;
import java.io.ByteArrayOutputStream;

@C4056a
/* renamed from: com.google.android.gms.common.util.j */
public final class C4490j {
    @C4056a
    /* renamed from: a */
    public static void m19367a(String str, CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
        } else {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < str.length()) {
                charArrayBuffer.data = str.toCharArray();
            } else {
                str.getChars(0, str.length(), charArrayBuffer.data, 0);
            }
        }
        charArrayBuffer.sizeCopied = str.length();
    }

    @C4056a
    /* renamed from: a */
    public static byte[] m19368a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
