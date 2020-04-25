package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import p076c.p112d.p113a.p130b.p131a.p133d.C2699g;

/* renamed from: com.google.android.play.core.internal.f */
public final class C5740f {

    /* renamed from: a */
    private final C2699g f16612a;

    /* renamed from: b */
    private final C5732a0 f16613b;

    /* renamed from: c */
    private final Context f16614c;

    public C5740f(Context context, C2699g gVar, C5732a0 a0Var) {
        this.f16612a = gVar;
        this.f16613b = a0Var;
        this.f16614c = context;
    }

    /* renamed from: a */
    private static X509Certificate m25231a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final boolean m25232a(String str, List<X509Certificate> list) {
        StringBuilder sb;
        boolean z;
        String str2 = " is not signed.";
        String str3 = "Downloaded split ";
        try {
            X509Certificate[][] a = C5732a0.m25206a(str);
            if (a == null || a.length == 0 || a[0].length == 0) {
                sb = new StringBuilder(String.valueOf(str).length() + 32);
                sb.append(str3);
                sb.append(str);
                sb.append(str2);
                sb.toString();
                return false;
            } else if (list.isEmpty()) {
                return false;
            } else {
                Iterator it = list.iterator();
                do {
                    z = true;
                    if (it.hasNext()) {
                        X509Certificate x509Certificate = (X509Certificate) it.next();
                        int length = a.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                continue;
                                break;
                            } else if (a[i][0].equals(x509Certificate)) {
                                continue;
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        return true;
                    }
                } while (z);
                return false;
            }
        } catch (Exception unused) {
            sb = new StringBuilder(String.valueOf(str).length() + 32);
        }
    }

    /* renamed from: b */
    private final Signature[] m25233b() {
        try {
            return this.f16614c.getPackageManager().getPackageInfo(this.f16614c.getPackageName(), 64).signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23041a() {
        /*
            r7 = this;
            r0 = 0
            c.d.a.b.a.d.g r1 = r7.f16612a     // Catch:{ IOException -> 0x0057 }
            java.io.File r1 = r1.mo10374c()     // Catch:{ IOException -> 0x0057 }
            android.content.pm.Signature[] r2 = r7.m25233b()
            if (r2 != 0) goto L_0x000f
            r2 = 0
            goto L_0x0027
        L_0x000f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
        L_0x0016:
            if (r5 >= r4) goto L_0x0026
            r6 = r2[r5]
            java.security.cert.X509Certificate r6 = m25231a(r6)
            if (r6 == 0) goto L_0x0023
            r3.add(r6)
        L_0x0023:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0026:
            r2 = r3
        L_0x0027:
            if (r2 == 0) goto L_0x0057
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0030
            goto L_0x0057
        L_0x0030:
            java.io.File[] r1 = r1.listFiles()
            java.util.Arrays.sort(r1)
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
        L_0x003a:
            if (r3 < 0) goto L_0x0056
            r5 = r1[r3]
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0055 }
            boolean r6 = r7.m25232a(r6, r2)     // Catch:{ Exception -> 0x0055 }
            if (r6 != 0) goto L_0x0049
            return r0
        L_0x0049:
            c.d.a.b.a.d.g r6 = r7.f16612a     // Catch:{  }
            java.io.File r6 = r6.mo10367a(r5)     // Catch:{  }
            r5.renameTo(r6)     // Catch:{  }
            int r3 = r3 + -1
            goto L_0x003a
        L_0x0055:
            return r0
        L_0x0056:
            return r4
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C5740f.mo23041a():boolean");
    }

    /* renamed from: a */
    public final boolean mo23042a(List<Intent> list) throws IOException {
        for (Intent stringExtra : list) {
            if (!this.f16612a.mo10372b(stringExtra.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
