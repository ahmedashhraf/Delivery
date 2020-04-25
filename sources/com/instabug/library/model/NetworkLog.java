package com.instabug.library.model;

import android.content.Context;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.NetworkLogEntry;
import com.instabug.library.logging.C9932b;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class NetworkLog {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String CONTENT_TYPE = "content-type";
    public static final String HTML = "text/html";
    public static final String JSON = "application/json";
    public static final String LIMIT_ERROR = "{\"InstabugNetworkLog Error\":\"Response body exceeded limit\"}";
    public static final String PLAIN_TEXT = "text/plain";
    public static final String XML_1 = "application/xml";
    public static final String XML_2 = "text/xml";
    private String date;
    private String method;
    private String request;
    private String requestHeaders;
    private String response;
    private int responseCode;
    private String responseHeaders;
    private long totalDuration;
    private String url;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9131222686038722363L, "com/instabug/library/model/NetworkLog", 105);
        $jacocoData = a;
        return a;
    }

    public NetworkLog() {
        $jacocoInit()[0] = true;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (this == obj) {
            $jacocoInit[19] = true;
            return true;
        } else if (!(obj instanceof NetworkLog)) {
            $jacocoInit[20] = true;
            return false;
        } else {
            NetworkLog networkLog = (NetworkLog) obj;
            if (this.responseCode != networkLog.responseCode) {
                $jacocoInit[21] = true;
                return false;
            }
            String str = this.date;
            if (str != null) {
                if (str.equals(networkLog.date)) {
                    $jacocoInit[22] = true;
                } else {
                    $jacocoInit[23] = true;
                    $jacocoInit[26] = true;
                    return false;
                }
            } else if (networkLog.date == null) {
                $jacocoInit[24] = true;
            } else {
                $jacocoInit[25] = true;
                $jacocoInit[26] = true;
                return false;
            }
            String str2 = this.url;
            if (str2 != null) {
                if (str2.equals(networkLog.url)) {
                    $jacocoInit[27] = true;
                } else {
                    $jacocoInit[28] = true;
                    $jacocoInit[31] = true;
                    return false;
                }
            } else if (networkLog.url == null) {
                $jacocoInit[29] = true;
            } else {
                $jacocoInit[30] = true;
                $jacocoInit[31] = true;
                return false;
            }
            String str3 = this.request;
            if (str3 != null) {
                if (str3.equals(networkLog.request)) {
                    $jacocoInit[32] = true;
                } else {
                    $jacocoInit[33] = true;
                    $jacocoInit[36] = true;
                    return false;
                }
            } else if (networkLog.request == null) {
                $jacocoInit[34] = true;
            } else {
                $jacocoInit[35] = true;
                $jacocoInit[36] = true;
                return false;
            }
            String str4 = this.response;
            if (str4 != null) {
                if (str4.equals(networkLog.response)) {
                    $jacocoInit[37] = true;
                } else {
                    $jacocoInit[38] = true;
                    $jacocoInit[41] = true;
                    return false;
                }
            } else if (networkLog.response == null) {
                $jacocoInit[39] = true;
            } else {
                $jacocoInit[40] = true;
                $jacocoInit[41] = true;
                return false;
            }
            String str5 = this.method;
            if (str5 != null) {
                if (str5.equals(networkLog.method)) {
                    $jacocoInit[42] = true;
                } else {
                    $jacocoInit[43] = true;
                    $jacocoInit[46] = true;
                    return false;
                }
            } else if (networkLog.method == null) {
                $jacocoInit[44] = true;
            } else {
                $jacocoInit[45] = true;
                $jacocoInit[46] = true;
                return false;
            }
            if (this.totalDuration != networkLog.totalDuration) {
                $jacocoInit[47] = true;
                return false;
            }
            String str6 = this.responseHeaders;
            if (str6 != null) {
                if (str6.equals(networkLog.responseHeaders)) {
                    $jacocoInit[48] = true;
                } else {
                    $jacocoInit[49] = true;
                    $jacocoInit[52] = true;
                    return false;
                }
            } else if (networkLog.responseHeaders == null) {
                $jacocoInit[50] = true;
            } else {
                $jacocoInit[51] = true;
                $jacocoInit[52] = true;
                return false;
            }
            String str7 = this.requestHeaders;
            String str8 = networkLog.requestHeaders;
            if (str7 != null) {
                z = str7.equals(str8);
                $jacocoInit[53] = true;
            } else if (str8 == null) {
                $jacocoInit[54] = true;
                z = true;
            } else {
                $jacocoInit[55] = true;
                z = false;
            }
            $jacocoInit[56] = true;
            return z;
        }
    }

    public String getDate() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.date;
        $jacocoInit[1] = true;
        return str;
    }

    public String getMethod() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.method;
        $jacocoInit[9] = true;
        return str;
    }

    public String getRequest() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.request;
        $jacocoInit[5] = true;
        return str;
    }

    public String getRequestHeaders() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.requestHeaders;
        $jacocoInit[13] = true;
        return str;
    }

    public String getResponse() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.response;
        $jacocoInit[7] = true;
        return str;
    }

    public int getResponseCode() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.responseCode;
        $jacocoInit[11] = true;
        return i;
    }

    public String getResponseHeaders() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.responseHeaders;
        $jacocoInit[14] = true;
        return str;
    }

    public long getTotalDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.totalDuration;
        $jacocoInit[17] = true;
        return j;
    }

    public String getUrl() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.url;
        $jacocoInit[3] = true;
        return str;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.date;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
            $jacocoInit[57] = true;
        } else {
            $jacocoInit[58] = true;
            i = 0;
        }
        $jacocoInit[59] = true;
        int i8 = i * 31;
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            i2 = 0;
        }
        int i9 = i8 + i2;
        $jacocoInit[62] = true;
        int i10 = i9 * 31;
        String str3 = this.request;
        if (str3 != null) {
            i3 = str3.hashCode();
            $jacocoInit[63] = true;
        } else {
            $jacocoInit[64] = true;
            i3 = 0;
        }
        int i11 = i10 + i3;
        $jacocoInit[65] = true;
        int i12 = i11 * 31;
        String str4 = this.response;
        if (str4 != null) {
            i4 = str4.hashCode();
            $jacocoInit[66] = true;
        } else {
            $jacocoInit[67] = true;
            i4 = 0;
        }
        int i13 = i12 + i4;
        $jacocoInit[68] = true;
        int i14 = i13 * 31;
        String str5 = this.method;
        if (str5 != null) {
            i5 = str5.hashCode();
            $jacocoInit[69] = true;
        } else {
            $jacocoInit[70] = true;
            i5 = 0;
        }
        int i15 = ((i14 + i5) * 31) + this.responseCode;
        $jacocoInit[71] = true;
        int i16 = i15 * 31;
        String str6 = this.responseHeaders;
        if (str6 != null) {
            i6 = str6.hashCode();
            $jacocoInit[72] = true;
        } else {
            $jacocoInit[73] = true;
            i6 = 0;
        }
        int i17 = i16 + i6;
        $jacocoInit[74] = true;
        int i18 = i17 * 31;
        String str7 = this.requestHeaders;
        if (str7 != null) {
            i7 = str7.hashCode();
            $jacocoInit[75] = true;
        } else {
            $jacocoInit[76] = true;
        }
        int i19 = i18 + i7;
        $jacocoInit[77] = true;
        int hashCode = (i19 * 31) + Long.valueOf(this.totalDuration).hashCode();
        $jacocoInit[78] = true;
        return hashCode;
    }

    @Deprecated
    public long insert(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        long insert = insert();
        $jacocoInit[80] = true;
        return insert;
    }

    public void setDate(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.date = str;
        $jacocoInit[2] = true;
    }

    public void setMethod(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.method = str;
        $jacocoInit[10] = true;
    }

    public void setRequest(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.request = str;
        $jacocoInit[6] = true;
    }

    public void setRequestHeaders(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.requestHeaders = str;
        $jacocoInit[15] = true;
    }

    public void setResponse(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.response = str;
        $jacocoInit[8] = true;
    }

    public void setResponseCode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.responseCode = i;
        $jacocoInit[12] = true;
    }

    public void setResponseHeaders(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.responseHeaders = str;
        $jacocoInit[16] = true;
    }

    public void setTotalDuration(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.totalDuration = j;
        $jacocoInit[18] = true;
    }

    public void setUrl(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.url = str;
        $jacocoInit[4] = true;
    }

    public JSONObject toJsonObject() throws JSONException {
        String str = "response";
        String str2 = "request";
        String str3 = NetworkLogEntry.COLUMN_RESPONSE_HEADERS;
        String str4 = "headers";
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[82] = true;
        jSONObject.put("date", getDate());
        $jacocoInit[83] = true;
        jSONObject.put("method", getMethod());
        $jacocoInit[84] = true;
        jSONObject.put("status", getResponseCode());
        $jacocoInit[85] = true;
        jSONObject.put("url", getUrl());
        $jacocoInit[86] = true;
        jSONObject.put(NetworkLogEntry.COLUMN_NETWORK_TIME, getTotalDuration());
        try {
            $jacocoInit[87] = true;
            JSONObject jSONObject2 = new JSONObject(getRequestHeaders());
            $jacocoInit[88] = true;
            jSONObject.put(str4, jSONObject2);
            $jacocoInit[89] = true;
        } catch (Exception unused) {
            $jacocoInit[90] = true;
            jSONObject.put(str4, getRequestHeaders());
            try {
                $jacocoInit[91] = true;
            } catch (Exception unused2) {
                $jacocoInit[94] = true;
                jSONObject.put(str3, getResponseHeaders());
                try {
                    $jacocoInit[95] = true;
                } catch (Exception unused3) {
                    $jacocoInit[98] = true;
                    jSONObject.put(str2, getRequest());
                    try {
                        $jacocoInit[99] = true;
                    } catch (Exception unused4) {
                        $jacocoInit[102] = true;
                        jSONObject.put(str, getResponse());
                        $jacocoInit[103] = true;
                    }
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject(getResponseHeaders());
        $jacocoInit[92] = true;
        jSONObject.put(str3, jSONObject3);
        $jacocoInit[93] = true;
        JSONObject jSONObject4 = new JSONObject(getRequest());
        $jacocoInit[96] = true;
        jSONObject.put(str2, jSONObject4);
        $jacocoInit[97] = true;
        JSONObject jSONObject5 = new JSONObject(getResponse());
        $jacocoInit[100] = true;
        jSONObject.put(str, jSONObject5);
        $jacocoInit[101] = true;
        $jacocoInit[104] = true;
        return jSONObject;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkLog{date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", request='");
        sb.append(this.request);
        sb.append('\'');
        sb.append(", method='");
        sb.append(this.method);
        sb.append('\'');
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append(", headers='");
        sb.append(this.requestHeaders);
        sb.append('\'');
        sb.append(", response='");
        sb.append(this.response);
        sb.append('\'');
        sb.append(", response_headers='");
        sb.append(this.responseHeaders);
        sb.append('\'');
        sb.append(", totalDuration='");
        sb.append(this.totalDuration);
        sb.append('\'');
        sb.append('}');
        String sb2 = sb.toString();
        $jacocoInit[79] = true;
        return sb2;
    }

    public long insert() {
        boolean[] $jacocoInit = $jacocoInit();
        long a = C9932b.m46213a(this);
        $jacocoInit[81] = true;
        return a;
    }
}
