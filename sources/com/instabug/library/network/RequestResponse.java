package com.instabug.library.network;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class RequestResponse {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private Object responseBody;
    private int responseCode;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1587133370021596334L, "com/instabug/library/network/RequestResponse", 5);
        $jacocoData = a;
        return a;
    }

    public RequestResponse() {
        $jacocoInit()[0] = true;
    }

    public Object getResponseBody() {
        boolean[] $jacocoInit = $jacocoInit();
        Object obj = this.responseBody;
        $jacocoInit[3] = true;
        return obj;
    }

    public int getResponseCode() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.responseCode;
        $jacocoInit[1] = true;
        return i;
    }

    public RequestResponse setResponseBody(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        this.responseBody = obj;
        $jacocoInit[4] = true;
        return this;
    }

    public RequestResponse setResponseCode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.responseCode = i;
        $jacocoInit[2] = true;
        return this;
    }
}
