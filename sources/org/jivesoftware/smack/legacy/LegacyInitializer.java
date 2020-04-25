package org.jivesoftware.smack.legacy;

import org.jivesoftware.smack.initializer.UrlInitializer;

public class LegacyInitializer extends UrlInitializer {
    /* access modifiers changed from: protected */
    public String getProvidersUrl() {
        return "classpath:org.jivesoftware.smack.legacy/legacy.providers";
    }
}
