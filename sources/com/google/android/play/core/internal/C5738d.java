package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.C5776q;
import com.google.android.play.core.splitinstall.C5777r;
import com.google.android.play.core.splitinstall.C5782x;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.Executor;
import p076c.p112d.p113a.p130b.p131a.p133d.C2699g;

/* renamed from: com.google.android.play.core.internal.d */
public final class C5738d implements C5777r {

    /* renamed from: a */
    private final Context f16607a;

    /* renamed from: b */
    private final C2699g f16608b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5740f f16609c;

    /* renamed from: d */
    private final Executor f16610d;

    /* renamed from: e */
    private final C5782x f16611e;

    public C5738d(Context context, Executor executor, C5740f fVar, C2699g gVar, C5782x xVar) {
        this.f16607a = context;
        this.f16608b = gVar;
        this.f16609c = fVar;
        this.f16610d = executor;
        this.f16611e = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        m25225a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer m25219a(java.util.List<android.content.Intent> r4) {
        /*
            r3 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0037 }
            c.d.a.b.a.d.g r1 = r3.f16608b     // Catch:{ Exception -> 0x0037 }
            java.io.File r1 = r1.mo10371b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0037 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0037 }
            r1 = 0
            java.nio.channels.FileLock r2 = r0.tryLock()     // Catch:{ OverlappingFileLockException -> 0x0019 }
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            goto L_0x0028
        L_0x0019:
            r2 = r1
        L_0x001a:
            if (r2 == 0) goto L_0x0030
            int r4 = r3.m25226b(r4)     // Catch:{ all -> 0x0017 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0017 }
            r2.release()     // Catch:{ all -> 0x0017 }
            goto L_0x0031
        L_0x0028:
            throw r4     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            if (r0 == 0) goto L_0x002f
            m25225a(r4, r0)     // Catch:{ Exception -> 0x0037 }
        L_0x002f:
            throw r1     // Catch:{ Exception -> 0x0037 }
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            m25225a(r1, r0)     // Catch:{ Exception -> 0x0037 }
        L_0x0036:
            return r4
        L_0x0037:
            r4 = -13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C5738d.m25219a(java.util.List):java.lang.Integer");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25222a(C5776q qVar) {
        try {
            if (!this.f16611e.mo23066a(this.f16607a.getApplicationContext())) {
                qVar.mo23061a(-12);
            } else {
                qVar.mo23060a();
            }
        } catch (Exception unused) {
            qVar.mo23061a(-12);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m25223a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C5744i0.m25251a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m25224a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                C5744i0.m25251a(th, th2);
            }
        } else {
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m25225a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C5744i0.m25251a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        m25224a(r10, (java.io.OutputStream) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        m25223a(r10, (java.io.InputStream) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25226b(java.util.List<android.content.Intent> r10) {
        /*
            r9 = this;
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x0095 }
        L_0x0004:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0095 }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0095 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0095 }
            java.lang.String r2 = "split_id"
            java.lang.String r2 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x0095 }
            android.content.Context r3 = r9.f16607a     // Catch:{ Exception -> 0x0095 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0095 }
            android.net.Uri r0 = r0.getData()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r4 = "r"
            android.content.res.AssetFileDescriptor r0 = r3.openAssetFileDescriptor(r0, r4)     // Catch:{ Exception -> 0x0095 }
            c.d.a.b.a.d.g r3 = r9.f16608b     // Catch:{ Exception -> 0x0095 }
            java.io.File r3 = r3.mo10368a(r2)     // Catch:{ Exception -> 0x0095 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0095 }
            if (r4 == 0) goto L_0x0041
            long r4 = r3.length()     // Catch:{ Exception -> 0x0095 }
            long r6 = r0.getLength()     // Catch:{ Exception -> 0x0095 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 != 0) goto L_0x004a
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0095 }
            if (r4 != 0) goto L_0x0004
        L_0x004a:
            c.d.a.b.a.d.g r4 = r9.f16608b     // Catch:{ Exception -> 0x0095 }
            java.io.File r2 = r4.mo10372b(r2)     // Catch:{ Exception -> 0x0095 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x0095 }
            if (r2 != 0) goto L_0x0004
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0095 }
            java.io.FileInputStream r0 = r0.createInputStream()     // Catch:{ Exception -> 0x0095 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0095 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0081 }
            r0.<init>(r3)     // Catch:{ all -> 0x0081 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x007a }
        L_0x0068:
            int r4 = r2.read(r3)     // Catch:{ all -> 0x007a }
            if (r4 <= 0) goto L_0x0072
            r0.write(r3, r1, r4)     // Catch:{ all -> 0x007a }
            goto L_0x0068
        L_0x0072:
            r0.close()     // Catch:{ all -> 0x0081 }
            r0 = 0
            m25223a(r0, r2)     // Catch:{ Exception -> 0x0095 }
            goto L_0x0004
        L_0x007a:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            m25224a(r10, r0)     // Catch:{ all -> 0x0081 }
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            m25223a(r10, r2)     // Catch:{ Exception -> 0x0095 }
            throw r0     // Catch:{ Exception -> 0x0095 }
        L_0x0088:
            r10 = -11
            com.google.android.play.core.internal.f r0 = r9.f16609c     // Catch:{ Exception -> 0x0094 }
            boolean r0 = r0.mo23041a()     // Catch:{ Exception -> 0x0094 }
            if (r0 != 0) goto L_0x0093
            return r10
        L_0x0093:
            return r1
        L_0x0094:
            return r10
        L_0x0095:
            r10 = -13
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C5738d.m25226b(java.util.List):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m25227b(List<Intent> list, C5776q qVar) {
        Integer a = m25219a(list);
        if (a != null) {
            if (a.intValue() == 0) {
                qVar.mo23062b();
            } else {
                qVar.mo23061a(a.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo23038a(List<Intent> list, C5776q qVar) {
        if (this.f16611e.mo23065a()) {
            this.f16610d.execute(new C5734b(this, list, qVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
