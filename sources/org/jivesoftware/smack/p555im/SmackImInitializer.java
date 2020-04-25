package org.jivesoftware.smack.p555im;

import org.jivesoftware.smack.initializer.UrlInitializer;

/* renamed from: org.jivesoftware.smack.im.SmackImInitializer */
public class SmackImInitializer extends UrlInitializer {
    /* access modifiers changed from: protected */
    public String getConfigUrl() {
        return "classpath:org.jivesoftware.smack.im/smackim.xml";
    }

    /* access modifiers changed from: protected */
    public String getProvidersUrl() {
        return "classpath:org.jivesoftware.smack.im/smackim.providers";
    }
}
