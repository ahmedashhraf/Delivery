package com.crashlytics.android.core;

import java.io.File;
import java.util.Map.Entry;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14274v;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

class DefaultCreateReportSpiCall extends C14236a implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";
    static final String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(C14225i iVar, String str, String str2, C14388d dVar) {
        super(iVar, str, str2, dVar, C14387c.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        HttpRequest d = httpRequest.mo45444d(C14236a.HEADER_API_KEY, createReportRequest.apiKey).mo45444d(C14236a.HEADER_CLIENT_TYPE, "android").mo45444d(C14236a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        for (Entry b : createReportRequest.report.getCustomHeaders().entrySet()) {
            d = d.mo45434b(b);
        }
        return d;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        File[] files;
        httpRequest.mo45452f(IDENTIFIER_PARAM, report.getIdentifier());
        int length = report.getFiles().length;
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = CrashlyticsCore.TAG;
        if (length == 1) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Adding single file ");
            sb.append(report.getFileName());
            sb.append(str2);
            sb.append(report.getIdentifier());
            j.mo45042d(str3, sb.toString());
            return httpRequest.mo45414a(FILE_PARAM, report.getFileName(), str, report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding file ");
            sb2.append(file.getName());
            sb2.append(str2);
            sb2.append(report.getIdentifier());
            j2.mo45042d(str3, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(MULTI_FILE_PARAM);
            sb3.append(i);
            sb3.append("]");
            httpRequest.mo45414a(sb3.toString(), file.getName(), str, file);
            i++;
        }
        return httpRequest;
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(getUrl());
        String sb2 = sb.toString();
        String str = CrashlyticsCore.TAG;
        j.mo45042d(str, sb2);
        int n = applyMultipartDataTo.mo45471n();
        C14228l j2 = C14215d.m61672j();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Create report request ID: ");
        sb3.append(applyMultipartDataTo.mo45466k(C14236a.HEADER_REQUEST_ID));
        j2.mo45042d(str, sb3.toString());
        C14228l j3 = C14215d.m61672j();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Result was: ");
        sb4.append(n);
        j3.mo45042d(str, sb4.toString());
        return C14274v.m61931a(n) == 0;
    }

    DefaultCreateReportSpiCall(C14225i iVar, String str, String str2, C14388d dVar, C14387c cVar) {
        super(iVar, str, str2, dVar, cVar);
    }
}
