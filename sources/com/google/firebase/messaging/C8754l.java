package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5566n;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p076c.p112d.p113a.p114a.p118d.p123e.C2630k;

/* renamed from: com.google.firebase.messaging.l */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
final class C8754l implements Closeable {
    @C0195i0

    /* renamed from: N */
    private volatile InputStream f22973N;

    /* renamed from: a */
    private final URL f22974a;
    @C0195i0

    /* renamed from: b */
    private C5560k<Bitmap> f22975b;

    private C8754l(URL url) {
        this.f22974a = url;
    }

    @C0195i0
    /* renamed from: b */
    public static C8754l m41032b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C8754l(new URL(str));
        } catch (MalformedURLException unused) {
            String str2 = "Not downloading image, bad URL: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        p076c.p112d.p113a.p114a.p118d.p123e.C2632m.m12742a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        throw r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] m41033e() throws java.io.IOException {
        /*
            r6 = this;
            java.net.URL r0 = r6.f22974a
            java.net.URLConnection r0 = r0.openConnection()
            int r1 = r0.getContentLength()
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r1 > r2) goto L_0x0070
            java.io.InputStream r0 = r0.getInputStream()
            r6.f22973N = r0     // Catch:{ all -> 0x0062 }
            r3 = 1048577(0x100001, double:5.18066E-318)
            java.io.InputStream r1 = p076c.p112d.p113a.p114a.p118d.p123e.C2629j.m12737a(r0, r3)     // Catch:{ all -> 0x0062 }
            byte[] r1 = p076c.p112d.p113a.p114a.p118d.p123e.C2629j.m12738a(r1)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0024
            r0.close()
        L_0x0024:
            r0 = 2
            java.lang.String r3 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0056
            int r0 = r1.length
            java.net.URL r3 = r6.f22974a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Downloaded "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = " bytes from "
            r5.append(r0)
            r5.append(r3)
            r5.toString()
        L_0x0056:
            int r0 = r1.length
            if (r0 > r2) goto L_0x005a
            return r1
        L_0x005a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Image exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r2 = move-exception
            if (r0 == 0) goto L_0x006f
            r0.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            p076c.p112d.p113a.p114a.p118d.p123e.C2632m.m12742a(r1, r0)
        L_0x006f:
            throw r2
        L_0x0070:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8754l.m41033e():byte[]");
    }

    /* renamed from: a */
    public final void mo32259a(Executor executor) {
        this.f22975b = C5566n.m24214a(executor, (Callable<TResult>) new C8753k<TResult>(this));
    }

    public final void close() {
        C2630k.m12740a(this.f22973N);
    }

    /* renamed from: d */
    public final Bitmap mo32261d() throws IOException {
        String valueOf = String.valueOf(this.f22974a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        sb.toString();
        byte[] e = m41033e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e, 0, e.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f22974a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                sb2.toString();
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f22974a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }

    /* renamed from: a */
    public final C5560k<Bitmap> mo32258a() {
        return (C5560k) C4300a0.m18620a(this.f22975b);
    }
}
