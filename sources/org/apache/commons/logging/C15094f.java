package org.apache.commons.logging;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.Properties;

/* renamed from: org.apache.commons.logging.f */
/* compiled from: LogFactory */
class C15094f implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ URL f43870a;

    C15094f(URL url) {
        this.f43870a = url;
    }

    public Object run() {
        try {
            InputStream openStream = this.f43870a.openStream();
            if (openStream != null) {
                Properties properties = new Properties();
                properties.load(openStream);
                openStream.close();
                return properties;
            }
        } catch (IOException unused) {
            if (C15096h.m66955i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to read URL ");
                stringBuffer.append(this.f43870a);
                C15096h.mo46816g(stringBuffer.toString());
            }
        }
        return null;
    }
}
