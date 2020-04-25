package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.t0 */
class C11906t0 {
    /* renamed from: a */
    static int m53533a(Context context, String str) {
        return context.getResources().getIdentifier(str.toLowerCase(), "drawable", context.getPackageName());
    }

    /* renamed from: a */
    static String m53534a(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        if (openRawResource == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            } finally {
                try {
                    openRawResource.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    static int m53535b(Context context, String str) {
        return context.getResources().getIdentifier(str.toLowerCase(), "string", context.getPackageName());
    }
}
