package org.jivesoftware.smack.proxy;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.SocketFactory;

public class Socks4ProxySocketFactory extends SocketFactory {
    private ProxyInfo proxy;

    public Socks4ProxySocketFactory(ProxyInfo proxyInfo) {
        this.proxy = proxyInfo;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        r12 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        throw r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0094 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC, Splitter:B:41:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec A[ExcHandler: RuntimeException (r12v1 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.Socket socks4ProxifiedSocket(java.lang.String r12, int r13) throws java.io.IOException {
        /*
            r11 = this;
            org.jivesoftware.smack.proxy.ProxyInfo r0 = r11.proxy
            java.lang.String r0 = r0.getProxyAddress()
            org.jivesoftware.smack.proxy.ProxyInfo r1 = r11.proxy
            int r1 = r1.getProxyPort()
            org.jivesoftware.smack.proxy.ProxyInfo r2 = r11.proxy
            java.lang.String r2 = r2.getProxyUsername()
            r3 = 0
            java.net.Socket r4 = new java.net.Socket     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d9 }
            r4.<init>(r0, r1)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d9 }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.io.OutputStream r1 = r4.getOutputStream()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r3 = 1
            r4.setTcpNoDelay(r3)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r6 = 4
            r7 = 0
            r5[r7] = r6     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r5[r3] = r3     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r8 = 3
            int r9 = r13 >>> 8
            byte r9 = (byte) r9     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r10 = 2
            r5[r10] = r9     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r13 = r13 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r5[r8] = r13     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.net.InetAddress r12 = java.net.InetAddress.getByName(r12)     // Catch:{ UnknownHostException -> 0x00ca }
            byte[] r12 = r12.getAddress()     // Catch:{ UnknownHostException -> 0x00ca }
            r13 = 0
        L_0x0043:
            int r8 = r12.length     // Catch:{ UnknownHostException -> 0x00ca }
            if (r13 >= r8) goto L_0x0050
            int r8 = r6 + 1
            byte r9 = r12[r13]     // Catch:{ UnknownHostException -> 0x00ca }
            r5[r6] = r9     // Catch:{ UnknownHostException -> 0x00ca }
            int r13 = r13 + 1
            r6 = r8
            goto L_0x0043
        L_0x0050:
            if (r2 == 0) goto L_0x0062
            byte[] r12 = r2.getBytes()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            int r13 = r2.length()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.System.arraycopy(r12, r7, r5, r6, r13)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            int r12 = r2.length()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            int r6 = r6 + r12
        L_0x0062:
            int r12 = r6 + 1
            r5[r6] = r7     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r1.write(r5, r7, r12)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r12 = 6
            r13 = 0
        L_0x006b:
            if (r13 >= r12) goto L_0x0081
            int r1 = 6 - r13
            int r1 = r0.read(r5, r13, r1)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            if (r1 <= 0) goto L_0x0077
            int r13 = r13 + r1
            goto L_0x006b
        L_0x0077:
            org.jivesoftware.smack.proxy.ProxyException r12 = new org.jivesoftware.smack.proxy.ProxyException     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            org.jivesoftware.smack.proxy.ProxyInfo$ProxyType r13 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r0 = "stream is closed"
            r12.<init>(r13, r0)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            throw r12     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
        L_0x0081:
            byte r12 = r5[r7]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            if (r12 != 0) goto L_0x00af
            byte r12 = r5[r3]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r13 = 90
            if (r12 != r13) goto L_0x0091
            byte[] r12 = new byte[r10]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r0.read(r12, r7, r10)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            return r4
        L_0x0091:
            r4.close()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r12.<init>()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r13 = "ProxySOCKS4: server returns CD "
            r12.append(r13)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            byte r13 = r5[r3]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r12.append(r13)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r12 = r12.toString()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            org.jivesoftware.smack.proxy.ProxyException r13 = new org.jivesoftware.smack.proxy.ProxyException     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            org.jivesoftware.smack.proxy.ProxyInfo$ProxyType r0 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r13.<init>(r0, r12)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            throw r13     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
        L_0x00af:
            org.jivesoftware.smack.proxy.ProxyException r12 = new org.jivesoftware.smack.proxy.ProxyException     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            org.jivesoftware.smack.proxy.ProxyInfo$ProxyType r13 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r1 = "server returns VN "
            r0.append(r1)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            byte r1 = r5[r7]     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r0.append(r1)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r12.<init>(r13, r0)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            throw r12     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
        L_0x00ca:
            r12 = move-exception
            org.jivesoftware.smack.proxy.ProxyException r13 = new org.jivesoftware.smack.proxy.ProxyException     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            org.jivesoftware.smack.proxy.ProxyInfo$ProxyType r0 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            java.lang.String r1 = r12.toString()     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            r13.<init>(r0, r1, r12)     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
            throw r13     // Catch:{ RuntimeException -> 0x00ec, Exception -> 0x00d7 }
        L_0x00d7:
            r12 = move-exception
            goto L_0x00db
        L_0x00d9:
            r12 = move-exception
            r4 = r3
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            r4.close()     // Catch:{ Exception -> 0x00e0 }
        L_0x00e0:
            org.jivesoftware.smack.proxy.ProxyException r13 = new org.jivesoftware.smack.proxy.ProxyException
            org.jivesoftware.smack.proxy.ProxyInfo$ProxyType r0 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4
            java.lang.String r12 = r12.toString()
            r13.<init>(r0, r12)
            throw r13
        L_0x00ec:
            r12 = move-exception
            goto L_0x00ef
        L_0x00ee:
            throw r12
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.proxy.Socks4ProxySocketFactory.socks4ProxifiedSocket(java.lang.String, int):java.net.Socket");
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return socks4ProxifiedSocket(str, i);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return socks4ProxifiedSocket(str, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return socks4ProxifiedSocket(inetAddress.getHostAddress(), i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return socks4ProxifiedSocket(inetAddress.getHostAddress(), i);
    }
}
