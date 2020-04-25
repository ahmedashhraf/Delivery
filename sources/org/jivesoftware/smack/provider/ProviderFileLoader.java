package org.jivesoftware.smack.provider;

import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ProviderFileLoader implements ProviderLoader {
    private static final Logger LOGGER = Logger.getLogger(ProviderFileLoader.class.getName());
    private List<Exception> exceptions;
    private final Collection<ExtensionProviderInfo> extProviders;
    private final Collection<IQProviderInfo> iqProviders;
    private final Collection<StreamFeatureProviderInfo> sfProviders;

    public ProviderFileLoader(InputStream inputStream) {
        this(inputStream, ProviderFileLoader.class.getClassLoader());
    }

    public Collection<ExtensionProviderInfo> getExtensionProviderInfo() {
        return this.extProviders;
    }

    public Collection<IQProviderInfo> getIQProviderInfo() {
        return this.iqProviders;
    }

    public List<Exception> getLoadingExceptions() {
        return Collections.unmodifiableList(this.exceptions);
    }

    public Collection<StreamFeatureProviderInfo> getStreamFeatureProviderInfo() {
        return this.sfProviders;
    }

    public ProviderFileLoader(InputStream inputStream, ClassLoader classLoader) {
        this.iqProviders = new LinkedList();
        this.extProviders = new LinkedList();
        this.sfProviders = new LinkedList();
        this.exceptions = new LinkedList();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, "UTF-8");
            int eventType = newPullParser.getEventType();
            do {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    try {
                        if (!"smackProviders".equals(name)) {
                            newPullParser.next();
                            newPullParser.next();
                            String nextText = newPullParser.nextText();
                            newPullParser.next();
                            newPullParser.next();
                            String nextText2 = newPullParser.nextText();
                            newPullParser.next();
                            newPullParser.next();
                            String nextText3 = newPullParser.nextText();
                            try {
                                Class loadClass = classLoader.loadClass(nextText3);
                                char c = 65535;
                                int hashCode = name.hashCode();
                                if (hashCode != -797518000) {
                                    if (hashCode != 80611175) {
                                        if (hashCode == 1834143545) {
                                            if (name.equals("iqProvider")) {
                                                c = 0;
                                            }
                                        }
                                    } else if (name.equals("streamFeatureProvider")) {
                                        c = 2;
                                    }
                                } else if (name.equals("extensionProvider")) {
                                    c = 1;
                                }
                                if (c != 0) {
                                    if (c != 1) {
                                        if (c != 2) {
                                            Logger logger = LOGGER;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Unknown provider type: ");
                                            sb.append(name);
                                            logger.warning(sb.toString());
                                        } else {
                                            this.sfProviders.add(new StreamFeatureProviderInfo(nextText, nextText2, (ExtensionElementProvider) loadClass.newInstance()));
                                        }
                                    } else if (ExtensionElementProvider.class.isAssignableFrom(loadClass)) {
                                        this.extProviders.add(new ExtensionProviderInfo(nextText, nextText2, (ExtensionElementProvider) loadClass.newInstance()));
                                    } else {
                                        List<Exception> list = this.exceptions;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(nextText3);
                                        sb2.append(" is not a PacketExtensionProvider");
                                        list.add(new IllegalArgumentException(sb2.toString()));
                                    }
                                } else if (IQProvider.class.isAssignableFrom(loadClass)) {
                                    this.iqProviders.add(new IQProviderInfo(nextText, nextText2, (IQProvider) loadClass.newInstance()));
                                } else {
                                    List<Exception> list2 = this.exceptions;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(nextText3);
                                    sb3.append(" is not a IQProvider");
                                    list2.add(new IllegalArgumentException(sb3.toString()));
                                }
                            } catch (ClassNotFoundException e) {
                                LOGGER.log(Level.SEVERE, "Could not find provider class", e);
                                this.exceptions.add(e);
                            } catch (InstantiationException e2) {
                                Logger logger2 = LOGGER;
                                Level level = Level.SEVERE;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Could not instanciate ");
                                sb4.append(nextText3);
                                logger2.log(level, sb4.toString(), e2);
                                this.exceptions.add(e2);
                            }
                        }
                    } catch (IllegalArgumentException e3) {
                        Logger logger3 = LOGGER;
                        Level level2 = Level.SEVERE;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid provider type found [");
                        sb5.append(name);
                        sb5.append("] when expecting iqProvider or extensionProvider");
                        logger3.log(level2, sb5.toString(), e3);
                        this.exceptions.add(e3);
                    }
                }
                eventType = newPullParser.next();
            } while (eventType != 1);
        } catch (Exception e4) {
            LOGGER.log(Level.SEVERE, "Unknown error occurred while parsing provider file", e4);
            this.exceptions.add(e4);
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
            throw th;
        }
        try {
            inputStream.close();
        } catch (Exception unused2) {
        }
    }
}
