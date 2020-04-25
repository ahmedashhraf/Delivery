package com.instabug.survey.p398b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.c */
/* compiled from: PlayStoreUtils */
public class C10067c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26796a;

    public C10067c() {
        m46831a()[0] = true;
    }

    /* renamed from: a */
    public static void m46830a(Context context) {
        boolean[] a = m46831a();
        StringBuilder sb = new StringBuilder();
        sb.append("market://details?id=");
        sb.append(context.getPackageName());
        Uri parse = Uri.parse(sb.toString());
        a[1] = true;
        String str = "android.intent.action.VIEW";
        Intent intent = new Intent(str, parse);
        a[2] = true;
        intent.addFlags(1208483840);
        a[3] = true;
        intent.addFlags(268435456);
        try {
            a[4] = true;
            context.startActivity(intent);
            a[5] = true;
        } catch (ActivityNotFoundException unused) {
            try {
                a[6] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://play.google.com/store/apps/details?id=");
                a[7] = true;
                sb2.append(context.getPackageName());
                Intent intent2 = new Intent(str, Uri.parse(sb2.toString()));
                a[8] = true;
                intent2.addFlags(268435456);
                a[9] = true;
                context.startActivity(intent2);
                a[10] = true;
            } catch (Exception e) {
                a[11] = true;
                InstabugSDKLogger.m46623e(C10067c.class, e.getMessage());
                a[12] = true;
            }
        }
        a[13] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46831a() {
        boolean[] zArr = f26796a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(196497769759751120L, "com/instabug/survey/utils/PlayStoreUtils", 14);
        f26796a = a;
        return a;
    }
}
