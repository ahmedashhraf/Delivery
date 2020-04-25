package p076c.p284e.p285a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* renamed from: c.e.a.c */
/* compiled from: SocketChannelIOHelper */
public class C6738c {
    /* renamed from: a */
    public static boolean m32156a(ByteBuffer byteBuffer, C6744g gVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        boolean z = false;
        if (read == -1) {
            gVar.mo26964k();
            return false;
        }
        if (read != 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m32155a(ByteBuffer byteBuffer, C6744g gVar, C6746i iVar) throws IOException {
        byteBuffer.clear();
        int a = iVar.mo26909a(byteBuffer);
        byteBuffer.flip();
        if (a != -1) {
            return iVar.mo26908E();
        }
        gVar.mo26964k();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32154a(p076c.p284e.p285a.C6744g r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f18737N
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = r5 instanceof p076c.p284e.p285a.C6746i
            if (r0 == 0) goto L_0x0035
            r0 = r5
            c.e.a.i r0 = (p076c.p284e.p285a.C6746i) r0
            boolean r2 = r0.mo26907D()
            if (r2 == 0) goto L_0x0036
            r0.mo26906C()
            goto L_0x0036
        L_0x001c:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L_0x0026
            return r1
        L_0x0026:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f18737N
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f18737N
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L_0x001c
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x006b
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.f18737N
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x006b
            boolean r2 = r4.mo26941f()
            if (r2 == 0) goto L_0x006b
            com.pusher.java_websocket.drafts.Draft r2 = r4.mo26940e()
            if (r2 == 0) goto L_0x006b
            com.pusher.java_websocket.drafts.Draft r2 = r4.mo26940e()
            c.e.a.d$b r2 = r2.mo41208c()
            if (r2 == 0) goto L_0x006b
            com.pusher.java_websocket.drafts.Draft r2 = r4.mo26940e()
            c.e.a.d$b r2 = r2.mo41208c()
            c.e.a.d$b r3 = p076c.p284e.p285a.C6739d.C6741b.SERVER
            if (r2 != r3) goto L_0x006b
            monitor-enter(r4)
            r4.mo26963j()     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r5
        L_0x006b:
            r4 = 1
            if (r0 == 0) goto L_0x0078
            c.e.a.i r5 = (p076c.p284e.p285a.C6746i) r5
            boolean r5 = r5.mo26907D()
            if (r5 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.C6738c.m32154a(c.e.a.g, java.nio.channels.ByteChannel):boolean");
    }
}
