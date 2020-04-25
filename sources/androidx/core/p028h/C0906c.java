package androidx.core.p028h;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0193h0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: androidx.core.h.c */
/* compiled from: TrafficStatsCompat */
public final class C0906c {
    private C0906c() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m5206a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    /* renamed from: b */
    public static int m5211b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    /* renamed from: a */
    public static void m5207a(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    /* renamed from: b */
    public static void m5212b(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m5208a(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    /* renamed from: b */
    public static void m5214b(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }

    @Deprecated
    /* renamed from: a */
    public static void m5210a(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* renamed from: b */
    public static void m5213b(@C0193h0 DatagramSocket datagramSocket) throws SocketException {
        if (VERSION.SDK_INT >= 24) {
            TrafficStats.untagDatagramSocket(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.untagSocket(new C0904b(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    /* renamed from: a */
    public static void m5209a(@C0193h0 DatagramSocket datagramSocket) throws SocketException {
        if (VERSION.SDK_INT >= 24) {
            TrafficStats.tagDatagramSocket(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.tagSocket(new C0904b(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }
}
