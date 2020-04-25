package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14274v;
import p212io.fabric.sdk.android.p493p.p496c.C14295k;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

class SessionAnalyticsFilesSender extends C14236a implements C14295k {
    static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final String FILE_PARAM_NAME = "session_analytics_file_";
    private final String apiKey;

    public SessionAnalyticsFilesSender(C14225i iVar, String str, String str2, C14388d dVar, String str3) {
        super(iVar, str, str2, dVar, C14387c.POST);
        this.apiKey = str3;
    }

    public boolean send(List<File> list) {
        HttpRequest d = getHttpRequest().mo45444d(C14236a.HEADER_CLIENT_TYPE, "android").mo45444d(C14236a.HEADER_CLIENT_VERSION, this.kit.getVersion()).mo45444d(C14236a.HEADER_API_KEY, this.apiKey);
        int i = 0;
        for (File file : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(FILE_PARAM_NAME);
            sb.append(i);
            d.mo45414a(sb.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        C14228l j = C14215d.m61672j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(getUrl());
        String sb3 = sb2.toString();
        String str = Answers.TAG;
        j.mo45042d(str, sb3);
        int n = d.mo45471n();
        C14228l j2 = C14215d.m61672j();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Response code for analytics file send is ");
        sb4.append(n);
        j2.mo45042d(str, sb4.toString());
        if (C14274v.m61931a(n) == 0) {
            return true;
        }
        return false;
    }
}
