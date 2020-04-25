package com.mrsool.bean;

import android.text.TextUtils;
import com.google.gson.p193w.C5862c;
import com.mrsool.utils.C11644i;

public class XmppDetails {
    private String domain;
    private String host;
    @C5862c("support_tls")
    private boolean isTls;
    private String port;

    public XmppDetails(String str, String str2, String str3, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.host = str;
            this.domain = str2;
            this.port = str3;
            this.isTls = z;
        }
    }

    public String getDomain() {
        if (TextUtils.isEmpty(this.domain)) {
            return C11644i.f33322i0;
        }
        return this.domain;
    }

    public String getHost() {
        if (TextUtils.isEmpty(this.host)) {
            return C11644i.f33331j0;
        }
        return this.host;
    }

    public String getPort() {
        if (TextUtils.isEmpty(this.port)) {
            return C11644i.f33340k0;
        }
        return this.port;
    }

    public boolean isTls() {
        return this.isTls;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public void setTls(boolean z) {
        this.isTls = z;
    }
}
