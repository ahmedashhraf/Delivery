package org.jivesoftware.smack.extensions;

import org.jivesoftware.smack.initializer.UrlInitializer;

public class ExtensionsInitializer extends UrlInitializer {
    /* access modifiers changed from: protected */
    public String getConfigUrl() {
        return "classpath:org.jivesoftware.smack.extensions/extensions.xml";
    }

    /* access modifiers changed from: protected */
    public String getProvidersUrl() {
        return "classpath:org.jivesoftware.smack.extensions/extensions.providers";
    }
}
