package com.mrsool.stickers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.C0193h0;

/* renamed from: com.mrsool.stickers.q */
/* compiled from: WhitelistCheck */
public class C11504q {

    /* renamed from: a */
    private static final String f32492a = "authority";

    /* renamed from: b */
    private static final String f32493b = "identifier";

    /* renamed from: c */
    private static String f32494c = "com.mrsool.stickercontentprovider";

    /* renamed from: d */
    private static String f32495d = "com.whatsapp";

    /* renamed from: e */
    private static String f32496e = "com.whatsapp.w4b";

    /* renamed from: f */
    private static String f32497f = ".provider.sticker_whitelist_check";

    /* renamed from: g */
    private static String f32498g = "is_whitelisted";

    /* renamed from: h */
    private static String f32499h = "result";

    /* renamed from: a */
    static boolean m51900a(@C0193h0 Context context, @C0193h0 String str) {
        try {
            boolean a = m51901a(context, str, f32495d);
            boolean a2 = m51901a(context, str, f32496e);
            if (!a || !a2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r9 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        throw r10;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m51901a(@androidx.annotation.C0193h0 android.content.Context r9, @androidx.annotation.C0193h0 java.lang.String r10, java.lang.String r11) {
        /*
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            boolean r1 = m51902a(r11, r0)
            r2 = 1
            if (r1 == 0) goto L_0x0083
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = f32497f
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r11, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r3)
            android.net.Uri$Builder r11 = r0.authority(r11)
            java.lang.String r0 = f32498g
            android.net.Uri$Builder r11 = r11.appendPath(r0)
            java.lang.String r0 = f32494c
            java.lang.String r3 = "authority"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r3, r0)
            java.lang.String r0 = "identifier"
            android.net.Uri$Builder r10 = r11.appendQueryParameter(r0, r10)
            android.net.Uri r4 = r10.build()
            android.content.ContentResolver r3 = r9.getContentResolver()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            if (r9 == 0) goto L_0x007d
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0074 }
            if (r10 == 0) goto L_0x007d
            java.lang.String r10 = f32499h     // Catch:{ all -> 0x0074 }
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0074 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x0074 }
            if (r10 != r2) goto L_0x006e
            r1 = 1
        L_0x006e:
            if (r9 == 0) goto L_0x0073
            r9.close()
        L_0x0073:
            return r1
        L_0x0074:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r10 = move-exception
            if (r9 == 0) goto L_0x007c
            r9.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r10
        L_0x007d:
            if (r9 == 0) goto L_0x0082
            r9.close()
        L_0x0082:
            return r1
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.stickers.C11504q.m51901a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m51902a(String str, PackageManager packageManager) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.enabled;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
