package com.clevertap.android.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.places.model.PlaceFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.w1 */
/* compiled from: Utils */
final class C3238w1 {
    C3238w1() {
    }

    /* renamed from: a */
    static long m15656a() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /* renamed from: b */
    static String m15664b(Context context) {
        String str = "Unavailable";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return str;
            }
            if (connectivityManager.getNetworkInfo(1).isConnected()) {
                return "WiFi";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (telephonyManager == null) {
                return str;
            }
            int networkType = telephonyManager.getNetworkType();
            if (networkType == 1) {
                return "GPRS";
            }
            if (networkType == 2) {
                return "EDGE";
            }
            if (networkType != 3) {
                if (networkType == 4) {
                    return "CDMA";
                }
                if (networkType == 13) {
                    return "LTE";
                }
                if (networkType != 15) {
                    switch (networkType) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                }
            }
            return "3G";
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: c */
    static boolean m15666c(String str) {
        if (str == null) {
            C3111h1.m14934e("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is NULL.");
            return false;
        } else if (str.isEmpty()) {
            C3111h1.m14934e("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is empty.");
            return false;
        } else if (str.length() > 64) {
            C3111h1.m14934e("Custom CleverTap ID passed is greater than 64 characters. ");
            return false;
        } else if (str.matches("[A-Za-z0-9()!:$@_-]*")) {
            return true;
        } else {
            C3111h1.m14934e("Custom CleverTap ID cannot contain special characters apart from :,(,),_,!,@,$ and - ");
            return false;
        }
    }

    /* renamed from: a */
    static HashMap<String, Object> m15662a(Bundle bundle) {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.putAll(m15662a((Bundle) obj));
            } else {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Error processing image bytes from url: ");
        r3.append(r8);
        com.clevertap.android.sdk.C3111h1.m14938f(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r2 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        com.clevertap.android.sdk.C3111h1.m14941f(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        com.clevertap.android.sdk.C3111h1.m14941f(r0, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0058 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[SYNTHETIC, Splitter:B:29:0x007a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] m15665b(java.lang.String r8) {
        /*
            java.lang.String r0 = "Couldn't close connection!"
            java.lang.String r1 = "/"
            java.lang.String r2 = "///"
            java.lang.String r8 = r8.replace(r2, r1)
            java.lang.String r2 = "//"
            java.lang.String r8 = r8.replace(r2, r1)
            java.lang.String r1 = "http:/"
            java.lang.String r2 = "http://"
            java.lang.String r8 = r8.replace(r1, r2)
            java.lang.String r1 = "https:/"
            java.lang.String r2 = "https://"
            java.lang.String r8 = r8.replace(r1, r2)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.io.InputStream r3 = r2.getInputStream()     // Catch:{ IOException -> 0x0058 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0058 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0058 }
            r5.<init>()     // Catch:{ IOException -> 0x0058 }
        L_0x0039:
            int r6 = r3.read(r4)     // Catch:{ IOException -> 0x0058 }
            r7 = -1
            if (r6 == r7) goto L_0x0045
            r7 = 0
            r5.write(r4, r7, r6)     // Catch:{ IOException -> 0x0058 }
            goto L_0x0039
        L_0x0045:
            byte[] r8 = r5.toByteArray()     // Catch:{ IOException -> 0x0058 }
            if (r2 == 0) goto L_0x0053
            r2.disconnect()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r1 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r1)
        L_0x0053:
            return r8
        L_0x0054:
            r8 = move-exception
            r2 = r1
            goto L_0x0078
        L_0x0057:
            r2 = r1
        L_0x0058:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "Error processing image bytes from url: "
            r3.append(r4)     // Catch:{ all -> 0x0077 }
            r3.append(r8)     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0077 }
            com.clevertap.android.sdk.C3111h1.m14938f(r8)     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0076
            r2.disconnect()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r8 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r8)
        L_0x0076:
            return r1
        L_0x0077:
            r8 = move-exception
        L_0x0078:
            if (r2 == 0) goto L_0x0082
            r2.disconnect()     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r1 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r1)
        L_0x0082:
            goto L_0x0084
        L_0x0083:
            throw r8
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3238w1.m15665b(java.lang.String):byte[]");
    }

    /* renamed from: a */
    static HashMap<String, Object> m15663a(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONObject) {
                    hashMap.putAll(m15663a((JSONObject) obj));
                } else {
                    hashMap.put(str, jSONObject.get(str));
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static Bitmap m15660a(String str, boolean z, Context context) throws NullPointerException {
        Bitmap bitmap = null;
        if (str == null || str.equals("")) {
            if (z) {
                bitmap = m15657a(context);
            }
            return bitmap;
        }
        if (!str.startsWith("http")) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://static.wizrocket.com/android/ico//");
            sb.append(str);
            str = sb.toString();
        }
        Bitmap a = m15659a(str);
        if (a != null) {
            bitmap = a;
        } else if (z) {
            bitmap = m15657a(context);
        }
        return bitmap;
    }

    /* renamed from: a */
    private static Bitmap m15657a(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo != null) {
                return m15658a(applicationLogo);
            }
            throw new Exception("Logo is null");
        } catch (Exception unused) {
            return m15658a(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
        }
    }

    /* renamed from: a */
    static Bitmap m15658a(Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Couldn't download the notification icon. URL was: ");
        r3.append(r5);
        com.clevertap.android.sdk.C3111h1.m14938f(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        com.clevertap.android.sdk.C3111h1.m14941f(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        com.clevertap.android.sdk.C3111h1.m14941f(r0, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[SYNTHETIC, Splitter:B:26:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m15659a(java.lang.String r5) {
        /*
            java.lang.String r0 = "Couldn't close connection!"
            java.lang.String r1 = "/"
            java.lang.String r2 = "///"
            java.lang.String r5 = r5.replace(r2, r1)
            java.lang.String r2 = "//"
            java.lang.String r5 = r5.replace(r2, r1)
            java.lang.String r1 = "http:/"
            java.lang.String r2 = "http://"
            java.lang.String r5 = r5.replace(r1, r2)
            java.lang.String r1 = "https:/"
            java.lang.String r2 = "https://"
            java.lang.String r5 = r5.replace(r1, r2)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            r3 = 1
            r2.setDoInput(r3)     // Catch:{ IOException -> 0x004a }
            r2.connect()     // Catch:{ IOException -> 0x004a }
            java.io.InputStream r3 = r2.getInputStream()     // Catch:{ IOException -> 0x004a }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ IOException -> 0x004a }
            if (r2 == 0) goto L_0x0045
            r2.disconnect()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r1)
        L_0x0045:
            return r5
        L_0x0046:
            r5 = move-exception
            r2 = r1
            goto L_0x006a
        L_0x0049:
            r2 = r1
        L_0x004a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r3.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "Couldn't download the notification icon. URL was: "
            r3.append(r4)     // Catch:{ all -> 0x0069 }
            r3.append(r5)     // Catch:{ all -> 0x0069 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0069 }
            com.clevertap.android.sdk.C3111h1.m14938f(r5)     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0068
            r2.disconnect()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r5 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r5)
        L_0x0068:
            return r1
        L_0x0069:
            r5 = move-exception
        L_0x006a:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r1 = move-exception
            com.clevertap.android.sdk.C3111h1.m14941f(r0, r1)
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3238w1.m15659a(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static int m15655a(Context context, String str) {
        if (context == null) {
            return -1;
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    /* renamed from: a */
    static ArrayList<String> m15661a(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not convert JSONArray to ArrayList - ");
                    sb.append(e.getMessage());
                    C3111h1.m14938f(sb.toString());
                }
            }
        }
        return arrayList;
    }
}
