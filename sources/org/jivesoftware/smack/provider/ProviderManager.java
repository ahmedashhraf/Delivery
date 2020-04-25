package org.jivesoftware.smack.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.StringUtils;
import p205i.p486d.p487a.C14055b;

public final class ProviderManager {
    private static final Map<String, ExtensionElementProvider<ExtensionElement>> extensionProviders = new ConcurrentHashMap();
    private static final Map<String, IQProvider<C15617IQ>> iqProviders = new ConcurrentHashMap();
    private static final Map<String, ExtensionElementProvider<ExtensionElement>> streamFeatureProviders = new ConcurrentHashMap();

    static {
        SmackConfiguration.getVersion();
    }

    public static void addExtensionProvider(String str, String str2, Object obj) {
        validate(str, str2);
        String removeExtensionProvider = removeExtensionProvider(str, str2);
        if (obj instanceof ExtensionElementProvider) {
            extensionProviders.put(removeExtensionProvider, (ExtensionElementProvider) obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider");
    }

    public static void addIQProvider(String str, String str2, Object obj) {
        validate(str, str2);
        String removeIQProvider = removeIQProvider(str, str2);
        if (obj instanceof IQProvider) {
            iqProviders.put(removeIQProvider, (IQProvider) obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be an IQProvider");
    }

    public static void addLoader(ProviderLoader providerLoader) {
        if (providerLoader.getIQProviderInfo() != null) {
            for (IQProviderInfo iQProviderInfo : providerLoader.getIQProviderInfo()) {
                addIQProvider(iQProviderInfo.getElementName(), iQProviderInfo.getNamespace(), iQProviderInfo.getProvider());
            }
        }
        if (providerLoader.getExtensionProviderInfo() != null) {
            for (ExtensionProviderInfo extensionProviderInfo : providerLoader.getExtensionProviderInfo()) {
                addExtensionProvider(extensionProviderInfo.getElementName(), extensionProviderInfo.getNamespace(), extensionProviderInfo.getProvider());
            }
        }
        if (providerLoader.getStreamFeatureProviderInfo() != null) {
            for (StreamFeatureProviderInfo streamFeatureProviderInfo : providerLoader.getStreamFeatureProviderInfo()) {
                addStreamFeatureProvider(streamFeatureProviderInfo.getElementName(), streamFeatureProviderInfo.getNamespace(), (ExtensionElementProvider) streamFeatureProviderInfo.getProvider());
            }
        }
    }

    public static void addStreamFeatureProvider(String str, String str2, ExtensionElementProvider<ExtensionElement> extensionElementProvider) {
        validate(str, str2);
        streamFeatureProviders.put(getKey(str, str2), extensionElementProvider);
    }

    public static ExtensionElementProvider<ExtensionElement> getExtensionProvider(String str, String str2) {
        return (ExtensionElementProvider) extensionProviders.get(getKey(str, str2));
    }

    public static List<ExtensionElementProvider<ExtensionElement>> getExtensionProviders() {
        ArrayList arrayList = new ArrayList(extensionProviders.size());
        arrayList.addAll(extensionProviders.values());
        return arrayList;
    }

    public static IQProvider<C15617IQ> getIQProvider(String str, String str2) {
        return (IQProvider) iqProviders.get(getKey(str, str2));
    }

    public static List<IQProvider<C15617IQ>> getIQProviders() {
        ArrayList arrayList = new ArrayList(iqProviders.size());
        arrayList.addAll(iqProviders.values());
        return arrayList;
    }

    private static String getKey(String str, String str2) {
        return C14055b.m60641b(str, str2);
    }

    public static ExtensionElementProvider<ExtensionElement> getStreamFeatureProvider(String str, String str2) {
        return (ExtensionElementProvider) streamFeatureProviders.get(getKey(str, str2));
    }

    public static String removeExtensionProvider(String str, String str2) {
        String key = getKey(str, str2);
        extensionProviders.remove(key);
        return key;
    }

    public static String removeIQProvider(String str, String str2) {
        String key = getKey(str, str2);
        iqProviders.remove(key);
        return key;
    }

    public static void removeStreamFeatureProvider(String str, String str2) {
        streamFeatureProviders.remove(getKey(str, str2));
    }

    private static void validate(String str, String str2) {
        if (StringUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("elementName must not be null or empty");
        } else if (StringUtils.isNullOrEmpty(str2)) {
            throw new IllegalArgumentException("namespace must not be null or empty");
        }
    }
}
