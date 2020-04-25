package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.p172q.C4439c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p076c.p112d.p113a.p114a.p118d.p122d.C2619g;

@C4056a
/* renamed from: com.google.android.gms.common.util.a */
public class C4469a {

    /* renamed from: a */
    private static volatile int f13708a = -1;

    @C4056a
    /* renamed from: a */
    public static byte[] m19294a(Context context, String str) throws NameNotFoundException {
        PackageInfo b = C4439c.m19110a(context).mo18451b(str, 64);
        Signature[] signatureArr = b.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            MessageDigest a = m19293a("SHA1");
            if (a != null) {
                return a.digest(b.signatures[0].toByteArray());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static MessageDigest m19293a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @C4056a
    @TargetApi(24)
    @Deprecated
    /* renamed from: a */
    public static Context m19292a(Context context) {
        return C2619g.m12730a() ? C2619g.m12729a(context) : context;
    }
}
