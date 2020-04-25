package p212io.branch.referral.network;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;
import p212io.branch.referral.C14204x;
import p212io.branch.referral.network.BranchRemoteInterface.BranchRemoteException;
import p212io.branch.referral.network.BranchRemoteInterface.C14150a;

/* renamed from: io.branch.referral.network.a */
/* compiled from: BranchRemoteInterfaceUrlConnection */
public class C14151a extends BranchRemoteInterface {

    /* renamed from: c */
    private static final int f41633c = 3000;

    /* renamed from: b */
    C14204x f41634b;

    C14151a(Context context) {
        this.f41634b = C14204x.m61505a(context);
    }

    /* renamed from: a */
    public C14150a mo44714a(String str) throws BranchRemoteException {
        return m61229a(str, 0);
    }

    /* renamed from: a */
    public C14150a mo44715a(String str, JSONObject jSONObject) throws BranchRemoteException {
        return m61230a(str, jSONObject, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:54:0x00d0, B:60:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe A[SYNTHETIC, Splitter:B:60:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0119 A[SYNTHETIC, Splitter:B:69:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p212io.branch.referral.network.BranchRemoteInterface.C14150a m61229a(java.lang.String r8, int r9) throws p212io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /*
            r7 = this;
            java.lang.String r0 = "?"
            r1 = -113(0xffffffffffffff8f, float:NaN)
            r2 = 0
            io.branch.referral.x r3 = r7.f41634b     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            int r3 = r3.mo44934G()     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            if (r3 > 0) goto L_0x000f
            r3 = 3000(0xbb8, float:4.204E-42)
        L_0x000f:
            boolean r4 = r8.contains(r0)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            if (r4 == 0) goto L_0x0017
            java.lang.String r0 = "&"
        L_0x0017:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r4.<init>()     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r4.append(r8)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r4.append(r0)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            java.lang.String r0 = "retryNumber"
            r4.append(r0)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            java.lang.String r0 = "="
            r4.append(r0)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r4.append(r9)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            java.lang.String r0 = r4.toString()     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            java.net.URL r4 = new java.net.URL     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r4.<init>(r0)     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            java.net.URLConnection r0 = r4.openConnection()     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ SocketException -> 0x0121, SocketTimeoutException -> 0x00f6, IOException -> 0x00cf }
            r0.setConnectTimeout(r3)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            r0.setReadTimeout(r3)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            int r3 = r0.getResponseCode()     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 < r4) goto L_0x006f
            io.branch.referral.x r4 = r7.f41634b     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            int r4 = r4.mo44930C()     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            if (r9 >= r4) goto L_0x006f
            io.branch.referral.x r2 = r7.f41634b     // Catch:{ InterruptedException -> 0x005f }
            int r2 = r2.mo44931D()     // Catch:{ InterruptedException -> 0x005f }
            long r2 = (long) r2     // Catch:{ InterruptedException -> 0x005f }
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
        L_0x0063:
            int r9 = r9 + 1
            io.branch.referral.network.BranchRemoteInterface$a r8 = r7.m61229a(r8, r9)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            if (r0 == 0) goto L_0x006e
            r0.disconnect()
        L_0x006e:
            return r8
        L_0x006f:
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L_0x008c
            java.io.InputStream r4 = r0.getErrorStream()     // Catch:{ FileNotFoundException -> 0x009f }
            if (r4 == 0) goto L_0x008c
            io.branch.referral.network.BranchRemoteInterface$a r4 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x009f }
            java.io.InputStream r5 = r0.getErrorStream()     // Catch:{ FileNotFoundException -> 0x009f }
            java.lang.String r5 = r7.m61231a(r5)     // Catch:{ FileNotFoundException -> 0x009f }
            r4.<init>(r5, r3)     // Catch:{ FileNotFoundException -> 0x009f }
            if (r0 == 0) goto L_0x008b
            r0.disconnect()
        L_0x008b:
            return r4
        L_0x008c:
            io.branch.referral.network.BranchRemoteInterface$a r4 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x009f }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ FileNotFoundException -> 0x009f }
            java.lang.String r5 = r7.m61231a(r5)     // Catch:{ FileNotFoundException -> 0x009f }
            r4.<init>(r5, r3)     // Catch:{ FileNotFoundException -> 0x009f }
            if (r0 == 0) goto L_0x009e
            r0.disconnect()
        L_0x009e:
            return r4
        L_0x009f:
            java.lang.String r4 = "BranchSDK"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            r5.<init>()     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            java.lang.String r6 = "A resource conflict occurred with this request "
            r5.append(r6)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            r5.append(r8)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            p212io.branch.referral.C14204x.m61509d(r4, r5)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            io.branch.referral.network.BranchRemoteInterface$a r4 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            r4.<init>(r2, r3)     // Catch:{ SocketException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, all -> 0x00c0 }
            if (r0 == 0) goto L_0x00bf
            r0.disconnect()
        L_0x00bf:
            return r4
        L_0x00c0:
            r8 = move-exception
            r2 = r0
            goto L_0x0148
        L_0x00c4:
            r8 = move-exception
            r2 = r0
            goto L_0x00d0
        L_0x00c7:
            r2 = r0
            goto L_0x00f6
        L_0x00c9:
            r8 = move-exception
            r2 = r0
            goto L_0x0122
        L_0x00cc:
            r8 = move-exception
            goto L_0x0148
        L_0x00cf:
            r8 = move-exception
        L_0x00d0:
            java.lang.Class r9 = r7.getClass()     // Catch:{ all -> 0x00cc }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r0.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "Branch connect exception: "
            r0.append(r3)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00cc }
            r0.append(r8)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00cc }
            p212io.branch.referral.C14204x.m61509d(r9, r8)     // Catch:{ all -> 0x00cc }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cc }
            r8.<init>(r1)     // Catch:{ all -> 0x00cc }
            throw r8     // Catch:{ all -> 0x00cc }
        L_0x00f6:
            io.branch.referral.x r0 = r7.f41634b     // Catch:{ all -> 0x00cc }
            int r0 = r0.mo44930C()     // Catch:{ all -> 0x00cc }
            if (r9 >= r0) goto L_0x0119
            io.branch.referral.x r0 = r7.f41634b     // Catch:{ InterruptedException -> 0x0109 }
            int r0 = r0.mo44931D()     // Catch:{ InterruptedException -> 0x0109 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0109 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00cc }
        L_0x010d:
            int r9 = r9 + 1
            io.branch.referral.network.BranchRemoteInterface$a r8 = r7.m61229a(r8, r9)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0118
            r2.disconnect()
        L_0x0118:
            return r8
        L_0x0119:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cc }
            r9 = -111(0xffffffffffffff91, float:NaN)
            r8.<init>(r9)     // Catch:{ all -> 0x00cc }
            throw r8     // Catch:{ all -> 0x00cc }
        L_0x0121:
            r8 = move-exception
        L_0x0122:
            java.lang.Class r9 = r7.getClass()     // Catch:{ all -> 0x00cc }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r0.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "Http connect exception: "
            r0.append(r3)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00cc }
            r0.append(r8)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00cc }
            p212io.branch.referral.C14204x.m61509d(r9, r8)     // Catch:{ all -> 0x00cc }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r8 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00cc }
            r8.<init>(r1)     // Catch:{ all -> 0x00cc }
            throw r8     // Catch:{ all -> 0x00cc }
        L_0x0148:
            if (r2 == 0) goto L_0x014d
            r2.disconnect()
        L_0x014d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.network.C14151a.m61229a(java.lang.String, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0178, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e1, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e8, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e9, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0114, code lost:
        r10 = r10 instanceof android.os.NetworkOnMainThreadException;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011d, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x015f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:86:0x0124, B:92:0x0154] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x016e A[SYNTHETIC, Splitter:B:101:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098 A[SYNTHETIC, Splitter:B:34:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c7 A[SYNTHETIC, Splitter:B:51:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8 A[SYNTHETIC, Splitter:B:61:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:10:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0154 A[SYNTHETIC, Splitter:B:92:0x0154] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p212io.branch.referral.network.BranchRemoteInterface.C14150a m61230a(java.lang.String r10, org.json.JSONObject r11, int r12) throws p212io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /*
            r9 = this;
            java.lang.String r0 = "application/json"
            io.branch.referral.x r1 = r9.f41634b
            int r1 = r1.mo44934G()
            if (r1 > 0) goto L_0x000c
            r1 = 3000(0xbb8, float:4.204E-42)
        L_0x000c:
            java.lang.String r2 = "retryNumber"
            r11.put(r2, r12)     // Catch:{ JSONException -> 0x0011 }
        L_0x0011:
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 1
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x014c, IOException -> 0x0123, Exception -> 0x00ec }
            r5.<init>(r10)     // Catch:{ SocketTimeoutException -> 0x014c, IOException -> 0x0123, Exception -> 0x00ec }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ SocketTimeoutException -> 0x014c, IOException -> 0x0123, Exception -> 0x00ec }
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ SocketTimeoutException -> 0x014c, IOException -> 0x0123, Exception -> 0x00ec }
            r5.setConnectTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r5.setReadTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r5.setDoInput(r3)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r5.setDoOutput(r3)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.lang.String r1 = "Content-Type"
            r5.setRequestProperty(r1, r0)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.lang.String r1 = "Accept"
            r5.setRequestProperty(r1, r0)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r0.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            java.lang.String r1 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r0.write(r1)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r0.flush()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            r0.close()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            int r0 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            if (r0 < r2) goto L_0x007a
            io.branch.referral.x r1 = r9.f41634b     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            int r1 = r1.mo44930C()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            if (r12 >= r1) goto L_0x007a
            io.branch.referral.x r0 = r9.f41634b     // Catch:{ InterruptedException -> 0x006a }
            int r0 = r0.mo44931D()     // Catch:{ InterruptedException -> 0x006a }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x006a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
        L_0x006e:
            int r12 = r12 + 1
            io.branch.referral.network.BranchRemoteInterface$a r10 = r9.m61230a(r10, r11, r12)     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x0079
            r5.disconnect()
        L_0x0079:
            return r10
        L_0x007a:
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x0089
            java.io.InputStream r1 = r5.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00a9, all -> 0x00a6 }
            if (r1 == 0) goto L_0x0089
            java.io.InputStream r1 = r5.getErrorStream()     // Catch:{ FileNotFoundException -> 0x00a9, all -> 0x00a6 }
            goto L_0x008d
        L_0x0089:
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ FileNotFoundException -> 0x00a9, all -> 0x00a6 }
        L_0x008d:
            io.branch.referral.network.BranchRemoteInterface$a r6 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x00aa }
            java.lang.String r7 = r9.m61231a(r1)     // Catch:{ FileNotFoundException -> 0x00aa }
            r6.<init>(r7, r0)     // Catch:{ FileNotFoundException -> 0x00aa }
            if (r1 == 0) goto L_0x00a0
            r1.close()     // Catch:{ IOException -> 0x009c, Exception -> 0x00e1 }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
        L_0x00a0:
            if (r5 == 0) goto L_0x00a5
            r5.disconnect()
        L_0x00a5:
            return r6
        L_0x00a6:
            r0 = move-exception
            r1 = r4
            goto L_0x00d6
        L_0x00a9:
            r1 = r4
        L_0x00aa:
            java.lang.String r6 = "BranchSDK"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r7.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "A resource conflict occurred with this request "
            r7.append(r8)     // Catch:{ all -> 0x00d5 }
            r7.append(r10)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00d5 }
            p212io.branch.referral.C14204x.m61509d(r6, r7)     // Catch:{ all -> 0x00d5 }
            io.branch.referral.network.BranchRemoteInterface$a r6 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ all -> 0x00d5 }
            r6.<init>(r4, r0)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00cf
            r1.close()     // Catch:{ IOException -> 0x00cb, Exception -> 0x00e1 }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
        L_0x00cf:
            if (r5 == 0) goto L_0x00d4
            r5.disconnect()
        L_0x00d4:
            return r6
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            if (r1 == 0) goto L_0x00e0
            r1.close()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00e1 }
            goto L_0x00e0
        L_0x00dc:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
        L_0x00e0:
            throw r0     // Catch:{ SocketTimeoutException -> 0x00e6, IOException -> 0x00e3, Exception -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
            goto L_0x00ee
        L_0x00e3:
            r10 = move-exception
            r4 = r5
            goto L_0x0124
        L_0x00e6:
            r4 = r5
            goto L_0x014c
        L_0x00e8:
            r10 = move-exception
            r5 = r4
            goto L_0x0176
        L_0x00ec:
            r10 = move-exception
            r5 = r4
        L_0x00ee:
            java.lang.Class r11 = r9.getClass()     // Catch:{ all -> 0x0121 }
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r12.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Exception: "
            r12.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r10.getMessage()     // Catch:{ all -> 0x0121 }
            r12.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0121 }
            p212io.branch.referral.C14204x.m61509d(r11, r12)     // Catch:{ all -> 0x0121 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0121 }
            r12 = 11
            if (r11 < r12) goto L_0x0116
            boolean r10 = r10 instanceof android.os.NetworkOnMainThreadException     // Catch:{ all -> 0x0121 }
        L_0x0116:
            io.branch.referral.network.BranchRemoteInterface$a r10 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ all -> 0x0121 }
            r10.<init>(r4, r2)     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x0120
            r5.disconnect()
        L_0x0120:
            return r10
        L_0x0121:
            r10 = move-exception
            goto L_0x0176
        L_0x0123:
            r10 = move-exception
        L_0x0124:
            java.lang.Class r11 = r9.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x00e8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r12.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "Http connect exception: "
            r12.append(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00e8 }
            r12.append(r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x00e8 }
            p212io.branch.referral.C14204x.m61509d(r11, r10)     // Catch:{ all -> 0x00e8 }
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r10 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00e8 }
            r11 = -113(0xffffffffffffff8f, float:NaN)
            r10.<init>(r11)     // Catch:{ all -> 0x00e8 }
            throw r10     // Catch:{ all -> 0x00e8 }
        L_0x014c:
            io.branch.referral.x r0 = r9.f41634b     // Catch:{ all -> 0x00e8 }
            int r0 = r0.mo44930C()     // Catch:{ all -> 0x00e8 }
            if (r12 >= r0) goto L_0x016e
            io.branch.referral.x r0 = r9.f41634b     // Catch:{ InterruptedException -> 0x015f }
            int r0 = r0.mo44931D()     // Catch:{ InterruptedException -> 0x015f }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x015f }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x015f }
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00e8 }
        L_0x0163:
            int r12 = r12 + r3
            io.branch.referral.network.BranchRemoteInterface$a r10 = r9.m61230a(r10, r11, r12)     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x016d
            r4.disconnect()
        L_0x016d:
            return r10
        L_0x016e:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r10 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x00e8 }
            r11 = -111(0xffffffffffffff91, float:NaN)
            r10.<init>(r11)     // Catch:{ all -> 0x00e8 }
            throw r10     // Catch:{ all -> 0x00e8 }
        L_0x0176:
            if (r5 == 0) goto L_0x017b
            r5.disconnect()
        L_0x017b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.network.C14151a.m61230a(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* renamed from: a */
    private String m61231a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                return new BufferedReader(new InputStreamReader(inputStream)).readLine();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
