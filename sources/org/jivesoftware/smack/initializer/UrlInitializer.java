package org.jivesoftware.smack.initializer;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackInitialization;
import org.jivesoftware.smack.provider.ProviderFileLoader;
import org.jivesoftware.smack.provider.ProviderManager;
import org.jivesoftware.smack.util.FileUtils;

public abstract class UrlInitializer implements SmackInitializer {
    private static final Logger LOGGER = Logger.getLogger(UrlInitializer.class.getName());

    /* access modifiers changed from: protected */
    public String getConfigUrl() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getProvidersUrl() {
        return null;
    }

    public List<Exception> initialize() {
        String str = "No input stream created for ";
        ClassLoader classLoader = getClass().getClassLoader();
        LinkedList linkedList = new LinkedList();
        String providersUrl = getProvidersUrl();
        if (providersUrl != null) {
            try {
                InputStream streamForUrl = FileUtils.getStreamForUrl(providersUrl, classLoader);
                if (streamForUrl != null) {
                    Logger logger = LOGGER;
                    Level level = Level.FINE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Loading providers for providerUrl [");
                    sb.append(providersUrl);
                    sb.append("]");
                    logger.log(level, sb.toString());
                    ProviderFileLoader providerFileLoader = new ProviderFileLoader(streamForUrl, classLoader);
                    ProviderManager.addLoader(providerFileLoader);
                    linkedList.addAll(providerFileLoader.getLoadingExceptions());
                } else {
                    Logger logger2 = LOGGER;
                    Level level2 = Level.WARNING;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(providersUrl);
                    logger2.log(level2, sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(providersUrl);
                    linkedList.add(new IOException(sb3.toString()));
                }
            } catch (Exception e) {
                Logger logger3 = LOGGER;
                Level level3 = Level.SEVERE;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Error trying to load provider file ");
                sb4.append(providersUrl);
                logger3.log(level3, sb4.toString(), e);
                linkedList.add(e);
            }
        }
        String configUrl = getConfigUrl();
        if (configUrl != null) {
            try {
                SmackInitialization.processConfigFile(FileUtils.getStreamForUrl(configUrl, classLoader), linkedList, classLoader);
            } catch (Exception e2) {
                linkedList.add(e2);
            }
        }
        return linkedList;
    }
}
