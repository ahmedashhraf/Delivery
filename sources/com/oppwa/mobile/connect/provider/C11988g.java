package com.oppwa.mobile.connect.provider;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.provider.g */
class C11988g {
    /* renamed from: a */
    static JSONObject m54098a(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new JSONObject(sb.toString());
            }
            sb.append(readLine);
        }
    }
}
