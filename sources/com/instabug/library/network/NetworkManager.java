package com.instabug.library.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0193h0;
import com.instabug.library.Instabug;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.FileToUpload;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.Request.RequestParameter;
import com.instabug.library.user.C10009a;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;
import org.apache.http.p549j0.C15430e;
import org.json.JSONException;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p195e.p196a.p439b1.C12205a;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.services.network.C14393i;
import p212io.fabric.sdk.android.services.network.HttpRequest;

public class NetworkManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String APP_TOKEN = "application_token";
    private static final int DEFAULT_CONNECTION_TIME_OUT = 15000;
    private static final int DEFAULT_READ_TIME_OUT = 10000;
    public static final String UUID = "uuid";
    private OnDoRequestListener onDoRequestListener;

    public interface OnDoRequestListener {
        void onComplete();

        void onRequestStarted(Request request);

        void onStart();
    }

    public enum RequestType {
        NORMAL,
        MULTI_PART,
        FILE_DOWNLOAD;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.library.network.NetworkManager$a */
    class C9956a implements C12243e0<RequestResponse> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26467c;

        /* renamed from: a */
        final /* synthetic */ Request f26468a;

        /* renamed from: b */
        final /* synthetic */ NetworkManager f26469b;

        C9956a(NetworkManager networkManager, Request request) {
            boolean[] a = m46307a();
            this.f26469b = networkManager;
            this.f26468a = request;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46307a() {
            boolean[] zArr = f26467c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7718908702356357920L, "com/instabug/library/network/NetworkManager$1", 49);
            f26467c = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<RequestResponse> d0Var) {
            Class<NetworkManager> cls = NetworkManager.class;
            boolean[] a = m46307a();
            String str = "Request got error: ";
            if (NetworkManager.access$000(this.f26469b) == null) {
                a[1] = true;
            } else {
                a[2] = true;
                NetworkManager.access$000(this.f26469b).onStart();
                try {
                    a[3] = true;
                } catch (InterruptedIOException e) {
                    a[33] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    Request request = this.f26468a;
                    a[34] = true;
                    sb.append(request.mo35546k());
                    String sb2 = sb.toString();
                    a[35] = true;
                    InstabugSDKLogger.m46624e(cls, sb2, e);
                    try {
                        a[36] = true;
                        d0Var.onError(e);
                        a[37] = true;
                    } catch (Exception e2) {
                        a[38] = true;
                        C12205a.m54894b((Throwable) e2);
                        a[39] = true;
                    }
                    a[40] = true;
                } catch (IOException e3) {
                    a[41] = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    Request request2 = this.f26468a;
                    a[42] = true;
                    sb3.append(request2.mo35546k());
                    String sb4 = sb3.toString();
                    a[43] = true;
                    InstabugSDKLogger.m46624e(cls, sb4, e3);
                    try {
                        a[44] = true;
                        d0Var.onError(e3);
                        a[45] = true;
                    } catch (Exception e4) {
                        a[46] = true;
                        C12205a.m54894b((Throwable) e4);
                        a[47] = true;
                    }
                }
            }
            InstabugSDKLogger.m46626v(cls, "Starting do request");
            a[4] = true;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Request Url: ");
            Request request3 = this.f26468a;
            a[5] = true;
            sb5.append(request3.mo35546k());
            String sb6 = sb5.toString();
            a[6] = true;
            InstabugSDKLogger.m46626v(cls, sb6);
            a[7] = true;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Request Type: ");
            Request request4 = this.f26468a;
            a[8] = true;
            sb7.append(request4.mo35544i().toString());
            String sb8 = sb7.toString();
            a[9] = true;
            InstabugSDKLogger.m46626v(cls, sb8);
            a[10] = true;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Request Body: ");
            Request request5 = this.f26468a;
            a[11] = true;
            sb9.append(request5.mo35542g());
            String sb10 = sb9.toString();
            a[12] = true;
            InstabugSDKLogger.m46626v(cls, sb10);
            HttpURLConnection httpURLConnection = null;
            a[13] = true;
            int i = C9957b.f26470a[this.f26468a.mo35545j().ordinal()];
            if (i == 1) {
                httpURLConnection = NetworkManager.access$100(this.f26469b, this.f26468a);
                a[15] = true;
            } else if (i == 2) {
                httpURLConnection = NetworkManager.access$200(this.f26469b, this.f26468a);
                a[16] = true;
            } else if (i != 3) {
                a[14] = true;
            } else {
                httpURLConnection = NetworkManager.access$300(this.f26469b, this.f26468a);
                a[17] = true;
            }
            if (httpURLConnection == null) {
                a[18] = true;
            } else {
                a[19] = true;
                if (httpURLConnection.getResponseCode() < 300) {
                    a[20] = true;
                } else {
                    a[21] = true;
                    InstabugSDKLogger.m46623e(cls, "Network request got error");
                    a[22] = true;
                    NetworkManager.access$400(this.f26469b, httpURLConnection);
                    a[23] = true;
                }
                InstabugSDKLogger.m46626v(cls, "Network request completed successfully");
                a[24] = true;
                int i2 = C9957b.f26470a[this.f26468a.mo35545j().ordinal()];
                if (i2 == 1) {
                    d0Var.mo42030a(NetworkManager.access$500(this.f26469b, httpURLConnection));
                    a[26] = true;
                } else if (i2 == 2) {
                    d0Var.mo42030a(NetworkManager.access$600(this.f26469b, this.f26468a, httpURLConnection));
                    a[27] = true;
                } else if (i2 != 3) {
                    a[25] = true;
                } else {
                    d0Var.mo42030a(NetworkManager.access$700(this.f26469b, httpURLConnection));
                    a[28] = true;
                }
            }
            if (NetworkManager.access$000(this.f26469b) == null) {
                a[29] = true;
            } else {
                a[30] = true;
                NetworkManager.access$000(this.f26469b).onComplete();
                a[31] = true;
            }
            d0Var.onComplete();
            a[32] = true;
            a[48] = true;
        }
    }

    /* renamed from: com.instabug.library.network.NetworkManager$b */
    static /* synthetic */ class C9957b {

        /* renamed from: a */
        static final /* synthetic */ int[] f26470a = new int[RequestType.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26471b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m46309a()
                com.instabug.library.network.NetworkManager$RequestType[] r1 = com.instabug.library.network.NetworkManager.RequestType.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26470a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f26470a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.library.network.NetworkManager$RequestType r5 = com.instabug.library.network.NetworkManager.RequestType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f26470a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.network.NetworkManager$RequestType r5 = com.instabug.library.network.NetworkManager.RequestType.FILE_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f26470a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.network.NetworkManager$RequestType r3 = com.instabug.library.network.NetworkManager.RequestType.MULTI_PART     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.network.NetworkManager.C9957b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46309a() {
            boolean[] zArr = f26471b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3781760388323737575L, "com/instabug/library/network/NetworkManager$2", 8);
            f26471b = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4472767249223136859L, "com/instabug/library/network/NetworkManager", 122);
        $jacocoData = a;
        return a;
    }

    public NetworkManager() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ OnDoRequestListener access$000(NetworkManager networkManager) {
        boolean[] $jacocoInit = $jacocoInit();
        OnDoRequestListener onDoRequestListener2 = networkManager.onDoRequestListener;
        $jacocoInit[114] = true;
        return onDoRequestListener2;
    }

    static /* synthetic */ HttpURLConnection access$100(NetworkManager networkManager, Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        HttpURLConnection connectWithNormalType = networkManager.connectWithNormalType(request);
        $jacocoInit[115] = true;
        return connectWithNormalType;
    }

    static /* synthetic */ HttpURLConnection access$200(NetworkManager networkManager, Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        HttpURLConnection connectWithFileDownloadType = networkManager.connectWithFileDownloadType(request);
        $jacocoInit[116] = true;
        return connectWithFileDownloadType;
    }

    static /* synthetic */ HttpURLConnection access$300(NetworkManager networkManager, Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        HttpURLConnection connectWithMultiPartType = networkManager.connectWithMultiPartType(request);
        $jacocoInit[117] = true;
        return connectWithMultiPartType;
    }

    static /* synthetic */ void access$400(NetworkManager networkManager, HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        networkManager.handleServerConnectionError(httpURLConnection);
        $jacocoInit[118] = true;
    }

    static /* synthetic */ RequestResponse access$500(NetworkManager networkManager, HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse handleRequestResponse = networkManager.handleRequestResponse(httpURLConnection);
        $jacocoInit[119] = true;
        return handleRequestResponse;
    }

    static /* synthetic */ RequestResponse access$600(NetworkManager networkManager, Request request, HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse handleFileDownloadRequestResponse = networkManager.handleFileDownloadRequestResponse(request, httpURLConnection);
        $jacocoInit[120] = true;
        return handleFileDownloadRequestResponse;
    }

    static /* synthetic */ RequestResponse access$700(NetworkManager networkManager, HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse handleMultipartRequestResponse = networkManager.handleMultipartRequestResponse(httpURLConnection);
        $jacocoInit[121] = true;
        return handleMultipartRequestResponse;
    }

    private HttpURLConnection connectWithFileDownloadType(Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Connect to: ");
        sb.append(request.mo35546k());
        sb.append(" with fileDownload type");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[64] = true;
        HttpURLConnection connectWithNormalType = connectWithNormalType(request);
        $jacocoInit[65] = true;
        return connectWithNormalType;
    }

    private HttpURLConnection connectWithMultiPartType(Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Connect to: ");
        sb.append(request.mo35546k());
        sb.append(" with multiPart type");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[66] = true;
        HttpURLConnection buildConnection = buildConnection(request);
        $jacocoInit[67] = true;
        buildConnection.setRequestMethod(request.mo35544i().toString());
        $jacocoInit[68] = true;
        buildConnection.setRequestProperty("Connection", C15430e.f44590q);
        $jacocoInit[69] = true;
        buildConnection.setRequestProperty("Cache-Control", "no-cache");
        $jacocoInit[70] = true;
        buildConnection.setRequestProperty("Content-Encoding", "");
        $jacocoInit[71] = true;
        C9972e eVar = new C9972e(buildConnection);
        $jacocoInit[72] = true;
        ArrayList h = request.mo35543h();
        $jacocoInit[73] = true;
        Iterator it = h.iterator();
        $jacocoInit[74] = true;
        while (it.hasNext()) {
            RequestParameter requestParameter = (RequestParameter) it.next();
            $jacocoInit[75] = true;
            String key = requestParameter.getKey();
            Object value = requestParameter.getValue();
            $jacocoInit[76] = true;
            String obj = value.toString();
            $jacocoInit[77] = true;
            eVar.mo35578a(key, obj);
            $jacocoInit[78] = true;
        }
        FileToUpload e = request.mo35540e();
        $jacocoInit[79] = true;
        String filePartName = e.getFilePartName();
        File file = new File(e.getFilePath());
        $jacocoInit[80] = true;
        String fileName = e.getFileName();
        String fileType = e.getFileType();
        $jacocoInit[81] = true;
        eVar.mo35577a(filePartName, file, fileName, fileType);
        $jacocoInit[82] = true;
        eVar.mo35576a();
        $jacocoInit[83] = true;
        return buildConnection;
    }

    private HttpURLConnection connectWithNormalType(Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Connect to: ");
        sb.append(request.mo35546k());
        sb.append(" with normal type");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[47] = true;
        HttpURLConnection buildConnection = buildConnection(request);
        $jacocoInit[48] = true;
        setURLConnectionDefaultTimeOut(buildConnection);
        $jacocoInit[49] = true;
        buildConnection.setRequestMethod(request.mo35544i().toString());
        $jacocoInit[50] = true;
        if (request.mo35544i() == RequestMethod.Post) {
            $jacocoInit[51] = true;
        } else {
            $jacocoInit[52] = true;
            if (request.mo35544i() != RequestMethod.put) {
                $jacocoInit[53] = true;
                $jacocoInit[57] = true;
                return buildConnection;
            }
            $jacocoInit[54] = true;
        }
        buildConnection.setDoOutput(true);
        $jacocoInit[55] = true;
        writeRequestBody(buildConnection.getOutputStream(), request.mo35542g());
        $jacocoInit[56] = true;
        $jacocoInit[57] = true;
        return buildConnection;
    }

    private String convertStreamToString(InputStream inputStream) {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        $jacocoInit[107] = true;
        if (useDelimiter.hasNext()) {
            str = useDelimiter.next();
            $jacocoInit[108] = true;
        } else {
            $jacocoInit[109] = true;
            str = "";
        }
        $jacocoInit[110] = true;
        return str;
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                $jacocoInit[111] = true;
                outputStream.write(read);
                $jacocoInit[112] = true;
            } else {
                $jacocoInit[113] = true;
                return;
            }
        }
    }

    private RequestResponse handleFileDownloadRequestResponse(Request request, HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse requestResponse = new RequestResponse();
        $jacocoInit[93] = true;
        int responseCode = httpURLConnection.getResponseCode();
        $jacocoInit[94] = true;
        requestResponse.setResponseCode(responseCode);
        $jacocoInit[95] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("File downloader request response code: ");
        sb.append(responseCode);
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[96] = true;
        copyStream(httpURLConnection.getInputStream(), new FileOutputStream(request.mo35537c()));
        $jacocoInit[97] = true;
        requestResponse.setResponseBody(request.mo35537c());
        $jacocoInit[98] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("File downloader request response: ");
        $jacocoInit[99] = true;
        sb2.append(request.mo35537c().getPath());
        String sb3 = sb2.toString();
        $jacocoInit[100] = true;
        InstabugSDKLogger.m46626v(this, sb3);
        $jacocoInit[101] = true;
        httpURLConnection.disconnect();
        $jacocoInit[102] = true;
        return requestResponse;
    }

    private RequestResponse handleMultipartRequestResponse(HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse handleRequestResponse = handleRequestResponse(httpURLConnection);
        $jacocoInit[92] = true;
        return handleRequestResponse;
    }

    private RequestResponse handleRequestResponse(HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        RequestResponse requestResponse = new RequestResponse();
        $jacocoInit[84] = true;
        int responseCode = httpURLConnection.getResponseCode();
        $jacocoInit[85] = true;
        requestResponse.setResponseCode(responseCode);
        $jacocoInit[86] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Request response code: ");
        sb.append(responseCode);
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[87] = true;
        String convertStreamToString = convertStreamToString(httpURLConnection.getInputStream());
        $jacocoInit[88] = true;
        requestResponse.setResponseBody(convertStreamToString);
        $jacocoInit[89] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request response: ");
        sb2.append(convertStreamToString);
        InstabugSDKLogger.m46626v(this, sb2.toString());
        $jacocoInit[90] = true;
        httpURLConnection.disconnect();
        $jacocoInit[91] = true;
        return requestResponse;
    }

    private void handleServerConnectionError(HttpURLConnection httpURLConnection) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        InputStream errorStream = httpURLConnection.getErrorStream();
        $jacocoInit[103] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Error getting Network request response: ");
        $jacocoInit[104] = true;
        sb.append(convertStreamToString(errorStream));
        String sb2 = sb.toString();
        $jacocoInit[105] = true;
        InstabugSDKLogger.m46623e(this, sb2);
        $jacocoInit[106] = true;
    }

    public static boolean isOnline(Context context) {
        Class<NetworkManager> cls = NetworkManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        if (context == null) {
            try {
                $jacocoInit[1] = true;
            } catch (SecurityException e) {
                $jacocoInit[10] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not read network state. To enable please add the following line in your AndroidManifest.xml <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>\n");
                $jacocoInit[11] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                $jacocoInit[12] = true;
                InstabugSDKLogger.m46627w(cls, sb2);
                $jacocoInit[13] = true;
            } catch (Exception e2) {
                $jacocoInit[14] = true;
                InstabugSDKLogger.m46624e(cls, "Something went wrong while checking network state", e2);
                $jacocoInit[15] = true;
            }
        } else {
            $jacocoInit[2] = true;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                $jacocoInit[3] = true;
            } else {
                $jacocoInit[4] = true;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                $jacocoInit[5] = true;
                if (activeNetworkInfo == null) {
                    $jacocoInit[6] = true;
                } else if (!activeNetworkInfo.isConnectedOrConnecting()) {
                    $jacocoInit[7] = true;
                } else {
                    $jacocoInit[8] = true;
                    return true;
                }
            }
        }
        $jacocoInit[9] = true;
        $jacocoInit[16] = true;
        return false;
    }

    private HttpURLConnection setURLConnectionDefaultTimeOut(HttpURLConnection httpURLConnection) {
        boolean[] $jacocoInit = $jacocoInit();
        HttpURLConnection uRLConnectionTimeOut = setURLConnectionTimeOut(httpURLConnection, 10000, DEFAULT_CONNECTION_TIME_OUT);
        $jacocoInit[44] = true;
        return uRLConnectionTimeOut;
    }

    private void writeRequestBody(OutputStream outputStream, String str) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        $jacocoInit[58] = true;
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        $jacocoInit[59] = true;
        gZIPOutputStream.write(str.getBytes(Charset.forName(C14393i.f42526a)));
        $jacocoInit[60] = true;
        gZIPOutputStream.close();
        $jacocoInit[61] = true;
        outputStream.write(byteArrayOutputStream.toByteArray());
        $jacocoInit[62] = true;
        byteArrayOutputStream.close();
        $jacocoInit[63] = true;
    }

    public HttpURLConnection buildConnection(Request request) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        URL url = new URL(request.mo35546k());
        $jacocoInit[35] = true;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        $jacocoInit[36] = true;
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        $jacocoInit[37] = true;
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
        $jacocoInit[38] = true;
        httpURLConnection.setRequestProperty("Content-Encoding", HttpRequest.f42459o);
        $jacocoInit[39] = true;
        Iterator it = request.mo35541f().iterator();
        $jacocoInit[40] = true;
        while (it.hasNext()) {
            RequestParameter requestParameter = (RequestParameter) it.next();
            $jacocoInit[41] = true;
            httpURLConnection.setRequestProperty(requestParameter.getKey(), (String) requestParameter.getValue());
            $jacocoInit[42] = true;
        }
        httpURLConnection.setDoInput(true);
        $jacocoInit[43] = true;
        return httpURLConnection;
    }

    public Request buildRequest(Context context, Endpoint endpoint, RequestMethod requestMethod) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        Request buildRequest = buildRequest(context, endpoint, requestMethod, RequestType.NORMAL);
        $jacocoInit[22] = true;
        return buildRequest;
    }

    public Request buildRequestWithoutUUID(Context context, Endpoint endpoint, RequestMethod requestMethod) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        Request request = new Request(endpoint, RequestType.NORMAL);
        $jacocoInit[30] = true;
        request.mo35531a(requestMethod);
        $jacocoInit[31] = true;
        request.mo35528a(APP_TOKEN, Instabug.getAppToken());
        $jacocoInit[32] = true;
        return request;
    }

    public C5923b0<RequestResponse> doRequest(@C0193h0 Request request) {
        boolean[] $jacocoInit = $jacocoInit();
        OnDoRequestListener onDoRequestListener2 = this.onDoRequestListener;
        if (onDoRequestListener2 == null) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[19] = true;
            onDoRequestListener2.onRequestStarted(request);
            $jacocoInit[20] = true;
        }
        C5923b0<RequestResponse> a = C5923b0.m26095a((C12243e0<T>) new C9956a<T>(this, request));
        $jacocoInit[21] = true;
        return a;
    }

    public void setOnDoRequestListener(OnDoRequestListener onDoRequestListener2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.onDoRequestListener = onDoRequestListener2;
        $jacocoInit[17] = true;
    }

    public HttpURLConnection setURLConnectionTimeOut(HttpURLConnection httpURLConnection, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        httpURLConnection.setReadTimeout(i);
        $jacocoInit[45] = true;
        httpURLConnection.setConnectTimeout(i2);
        $jacocoInit[46] = true;
        return httpURLConnection;
    }

    public Request buildRequest(Context context, Endpoint endpoint, RequestMethod requestMethod, RequestType requestType) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        Request request = new Request(endpoint, requestType);
        $jacocoInit[23] = true;
        request.mo35531a(requestMethod);
        $jacocoInit[24] = true;
        Request buildRequest = buildRequest(context, request);
        $jacocoInit[25] = true;
        return buildRequest;
    }

    public Request buildRequest(@C0193h0 Context context, @C0193h0 String str, @C0193h0 RequestMethod requestMethod) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        Request buildRequest = buildRequest(context, str, requestMethod, RequestType.NORMAL);
        $jacocoInit[26] = true;
        return buildRequest;
    }

    public Request buildRequest(@C0193h0 Context context, @C0193h0 String str, @C0193h0 RequestMethod requestMethod, @C0193h0 RequestType requestType) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        Request request = new Request(str, requestType);
        $jacocoInit[27] = true;
        request.mo35531a(requestMethod);
        $jacocoInit[28] = true;
        Request buildRequest = buildRequest(context, request);
        $jacocoInit[29] = true;
        return buildRequest;
    }

    private Request buildRequest(@C0193h0 Context context, Request request) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        request.mo35528a(APP_TOKEN, Instabug.getAppToken());
        $jacocoInit[33] = true;
        request.mo35528a(UUID, C10009a.m46602f());
        $jacocoInit[34] = true;
        return request;
    }
}
