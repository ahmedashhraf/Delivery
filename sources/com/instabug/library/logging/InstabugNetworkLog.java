package com.instabug.library.logging;

import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.model.NetworkLog;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"NM_METHOD_NAMING_CONVENTION"})
public class InstabugNetworkLog {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private NetworkLog networkLog = new NetworkLog();

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1795831778420478402L, "com/instabug/library/logging/InstabugNetworkLog", 80);
        $jacocoData = a;
        return a;
    }

    public InstabugNetworkLog() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    private void addHeaders(HttpURLConnection httpURLConnection) throws JSONException, IllegalArgumentException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[56] = true;
        $jacocoInit[57] = true;
        for (String str : httpURLConnection.getHeaderFields().keySet()) {
            if (str == null) {
                $jacocoInit[58] = true;
            } else {
                $jacocoInit[59] = true;
                $jacocoInit[60] = true;
                for (String str2 : (List) httpURLConnection.getHeaderFields().get(str)) {
                    $jacocoInit[62] = true;
                    if (!str.equalsIgnoreCase(NetworkLog.CONTENT_TYPE)) {
                        $jacocoInit[63] = true;
                    } else {
                        $jacocoInit[64] = true;
                        if (str2.contains("application/json")) {
                            $jacocoInit[65] = true;
                        } else {
                            $jacocoInit[66] = true;
                            if (str2.contains(NetworkLog.XML_1)) {
                                $jacocoInit[67] = true;
                            } else {
                                $jacocoInit[68] = true;
                                if (str2.contains(NetworkLog.XML_2)) {
                                    $jacocoInit[69] = true;
                                } else {
                                    $jacocoInit[70] = true;
                                    if (str2.contains(NetworkLog.HTML)) {
                                        $jacocoInit[71] = true;
                                    } else {
                                        $jacocoInit[72] = true;
                                        if (str2.contains("text/plain")) {
                                            $jacocoInit[73] = true;
                                        } else {
                                            $jacocoInit[74] = true;
                                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                                            $jacocoInit[75] = true;
                                            throw illegalArgumentException;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    jSONObject.put(str, str2);
                    $jacocoInit[76] = true;
                }
                $jacocoInit[61] = true;
            }
            $jacocoInit[77] = true;
        }
        this.networkLog.setRequestHeaders(jSONObject.toString());
        $jacocoInit[78] = true;
    }

    private void insert() {
        boolean[] $jacocoInit = $jacocoInit();
        this.networkLog.insert();
        $jacocoInit[79] = true;
    }

    private String validateBody(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[34] = true;
            return null;
        }
        $jacocoInit[35] = true;
        if (((long) str.getBytes(Charset.forName("UTF-8")).length) > 1000000) {
            $jacocoInit[36] = true;
            return NetworkLog.LIMIT_ERROR;
        }
        $jacocoInit[37] = true;
        return str;
    }

    @Deprecated
    public void Log(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[16] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[17] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[18] = true;
        Parameter[] parameterArr = {parameter.setName("connection").setType(HttpURLConnection.class), parameter2.setName("requestBody").setType(String.class), parameter3.setName("responseBody").setType(String.class)};
        $jacocoInit[19] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[20] = true;
        this.networkLog.setResponseCode(httpURLConnection.getResponseCode());
        $jacocoInit[21] = true;
        NetworkLog networkLog2 = this.networkLog;
        StringBuilder sb = new StringBuilder();
        sb.append(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        sb.append("");
        networkLog2.setDate(sb.toString());
        $jacocoInit[22] = true;
        this.networkLog.setMethod(httpURLConnection.getRequestMethod());
        $jacocoInit[23] = true;
        this.networkLog.setUrl(httpURLConnection.getURL().toString());
        try {
            $jacocoInit[24] = true;
            addHeaders(httpURLConnection);
            $jacocoInit[25] = true;
            this.networkLog.setRequest(validateBody(str));
            $jacocoInit[26] = true;
            this.networkLog.setResponse(validateBody(str2));
            $jacocoInit[27] = true;
        } catch (JSONException e) {
            $jacocoInit[28] = true;
            e.printStackTrace();
            $jacocoInit[29] = true;
        } catch (IllegalArgumentException unused) {
            $jacocoInit[30] = true;
            InstabugSDKLogger.m46622d(this, "Content-type is not allowed to be logged");
            this.networkLog = null;
            $jacocoInit[31] = true;
            return;
        }
        insert();
        $jacocoInit[32] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adding network log: ");
        sb2.append(this.networkLog.toString());
        InstabugSDKLogger.m46622d(this, sb2.toString());
        $jacocoInit[33] = true;
    }

    public void log(String str, String str2, String str3, String str4, int i) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[2] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[3] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[4] = true;
        Parameter[] parameterArr = {parameter.setName("connection").setType(HttpURLConnection.class), parameter2.setName("requestBody").setType(String.class), parameter3.setName("responseBody").setType(String.class)};
        $jacocoInit[5] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[6] = true;
        this.networkLog.setResponseCode(i);
        $jacocoInit[7] = true;
        NetworkLog networkLog2 = this.networkLog;
        StringBuilder sb = new StringBuilder();
        sb.append(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        sb.append("");
        networkLog2.setDate(sb.toString());
        $jacocoInit[8] = true;
        this.networkLog.setMethod(str2);
        $jacocoInit[9] = true;
        this.networkLog.setUrl(str);
        try {
            $jacocoInit[10] = true;
            this.networkLog.setRequest(validateBody(str3));
            $jacocoInit[11] = true;
            this.networkLog.setResponse(validateBody(str4));
            insert();
            $jacocoInit[14] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adding network log: ");
            sb2.append(this.networkLog.toString());
            InstabugSDKLogger.m46622d(this, sb2.toString());
            $jacocoInit[15] = true;
        } catch (IllegalArgumentException unused) {
            $jacocoInit[12] = true;
            InstabugSDKLogger.m46622d(this, "Content-type is not allowed to be logged");
            this.networkLog = null;
            $jacocoInit[13] = true;
        }
    }

    public void log(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[38] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[39] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[40] = true;
        Parameter[] parameterArr = {parameter.setName("connection").setType(HttpURLConnection.class), parameter2.setName("requestBody").setType(String.class), parameter3.setName("responseBody").setType(String.class)};
        $jacocoInit[41] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[42] = true;
        this.networkLog.setResponseCode(httpURLConnection.getResponseCode());
        $jacocoInit[43] = true;
        NetworkLog networkLog2 = this.networkLog;
        StringBuilder sb = new StringBuilder();
        sb.append(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        sb.append("");
        networkLog2.setDate(sb.toString());
        $jacocoInit[44] = true;
        this.networkLog.setMethod(httpURLConnection.getRequestMethod());
        $jacocoInit[45] = true;
        this.networkLog.setUrl(httpURLConnection.getURL().toString());
        try {
            $jacocoInit[46] = true;
            addHeaders(httpURLConnection);
            $jacocoInit[47] = true;
            this.networkLog.setRequest(validateBody(str));
            $jacocoInit[48] = true;
            this.networkLog.setResponse(validateBody(str2));
            $jacocoInit[49] = true;
        } catch (JSONException e) {
            $jacocoInit[50] = true;
            e.printStackTrace();
            $jacocoInit[51] = true;
        } catch (IllegalArgumentException unused) {
            $jacocoInit[52] = true;
            InstabugSDKLogger.m46622d(this, "Content-type is not allowed to be logged");
            this.networkLog = null;
            $jacocoInit[53] = true;
            return;
        }
        insert();
        $jacocoInit[54] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("adding network log: ");
        sb2.append(this.networkLog.toString());
        InstabugSDKLogger.m46622d(this, sb2.toString());
        $jacocoInit[55] = true;
    }
}
