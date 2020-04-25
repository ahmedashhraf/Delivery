package com.crashlytics.android.core;

import com.instabug.library.model.State;
import java.io.File;
import org.jivesoftware.smackx.workgroup.MetaData;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14274v;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

class NativeCreateReportSpiCall extends C14236a implements CreateReportSpiCall {
    private static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
    private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
    private static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
    private static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
    private static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
    private static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
    private static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
    private static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
    private static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
    private static final String REPORT_IDENTIFIER_PARAM = "report_id";
    private static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
    private static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";

    public NativeCreateReportSpiCall(C14225i iVar, String str, String str2, C14388d dVar) {
        super(iVar, str, str2, dVar, C14387c.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C14236a.CRASHLYTICS_USER_AGENT);
        sb.append(this.kit.getVersion());
        httpRequest.mo45444d("User-Agent", sb.toString()).mo45444d(C14236a.HEADER_CLIENT_TYPE, "android").mo45444d(C14236a.HEADER_CLIENT_VERSION, this.kit.getVersion()).mo45444d(C14236a.HEADER_API_KEY, str);
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        File[] files;
        httpRequest.mo45452f("report_id", report.getIdentifier());
        for (File file : report.getFiles()) {
            String str = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                httpRequest.mo45414a(MINIDUMP_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals(MetaData.ELEMENT_NAME)) {
                httpRequest.mo45414a(METADATA_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.mo45414a(BINARY_IMAGES_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals("session")) {
                httpRequest.mo45414a(SESSION_META_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals(C14330v.f42313b)) {
                httpRequest.mo45414a(APP_META_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals(State.KEY_DEVICE)) {
                httpRequest.mo45414a(DEVICE_META_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals(State.KEY_OS)) {
                httpRequest.mo45414a(OS_META_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals("user")) {
                httpRequest.mo45414a(USER_META_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.mo45414a(LOGS_FILE_MULTIPART_PARAM, file.getName(), str, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.mo45414a(KEYS_FILE_MULTIPART_PARAM, file.getName(), str, file);
            }
        }
        return httpRequest;
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
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
        sb3.append("Result was: ");
        sb3.append(n);
        j2.mo45042d(str, sb3.toString());
        return C14274v.m61931a(n) == 0;
    }
}
