package org.jivesoftware.smack.packet;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jivesoftware.smack.packet.p556id.StanzaIdUtil;
import org.jivesoftware.smack.util.MultiMap;
import org.jivesoftware.smack.util.PacketUtil;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import p205i.p486d.p487a.C14055b;

public abstract class Stanza implements TopLevelStreamElement, Packet {
    protected static final String DEFAULT_LANGUAGE = Locale.getDefault().getLanguage().toLowerCase(Locale.US);
    public static final String ITEM = "item";
    public static final String TEXT = "text";
    private XMPPError error;
    private String from;

    /* renamed from: id */
    private String f44978id;
    protected String language;
    private final MultiMap<String, ExtensionElement> packetExtensions;

    /* renamed from: to */
    private String f44979to;

    protected Stanza() {
        this(StanzaIdUtil.newStanzaId());
    }

    public static String getDefaultLanguage() {
        return DEFAULT_LANGUAGE;
    }

    /* access modifiers changed from: protected */
    public void addCommonAttributes(XmlStringBuilder xmlStringBuilder) {
        xmlStringBuilder.optAttribute("to", getTo());
        xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, getFrom());
        xmlStringBuilder.optAttribute("id", getStanzaId());
        xmlStringBuilder.xmllangAttribute(getLanguage());
    }

    public void addExtension(ExtensionElement extensionElement) {
        if (extensionElement != null) {
            String b = C14055b.m60641b(extensionElement.getElementName(), extensionElement.getNamespace());
            synchronized (this.packetExtensions) {
                this.packetExtensions.put(b, extensionElement);
            }
        }
    }

    public void addExtensions(Collection<ExtensionElement> collection) {
        if (collection != null) {
            for (ExtensionElement addExtension : collection) {
                addExtension(addExtension);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void appendErrorIfExists(XmlStringBuilder xmlStringBuilder) {
        XMPPError error2 = getError();
        if (error2 != null) {
            xmlStringBuilder.append(error2.toXML());
        }
    }

    public XMPPError getError() {
        return this.error;
    }

    public ExtensionElement getExtension(String str) {
        return PacketUtil.extensionElementFrom(getExtensions(), null, str);
    }

    public List<ExtensionElement> getExtensions() {
        List<ExtensionElement> values;
        synchronized (this.packetExtensions) {
            values = this.packetExtensions.values();
        }
        return values;
    }

    /* access modifiers changed from: protected */
    public final XmlStringBuilder getExtensionsXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        for (ExtensionElement xml : getExtensions()) {
            xmlStringBuilder.append(xml.toXML());
        }
        return xmlStringBuilder;
    }

    public String getFrom() {
        return this.from;
    }

    public String getLanguage() {
        return this.language;
    }

    @Deprecated
    public String getPacketID() {
        return getStanzaId();
    }

    public String getStanzaId() {
        return this.f44978id;
    }

    public String getTo() {
        return this.f44979to;
    }

    public boolean hasExtension(String str, String str2) {
        boolean containsKey;
        if (str == null) {
            return hasExtension(str2);
        }
        String b = C14055b.m60641b(str, str2);
        synchronized (this.packetExtensions) {
            containsKey = this.packetExtensions.containsKey(b);
        }
        return containsKey;
    }

    public boolean hasStanzaIdSet() {
        return this.f44978id != null;
    }

    public ExtensionElement overrideExtension(ExtensionElement extensionElement) {
        ExtensionElement removeExtension;
        if (extensionElement == null) {
            return null;
        }
        synchronized (this.packetExtensions) {
            removeExtension = removeExtension(extensionElement);
            addExtension(extensionElement);
        }
        return removeExtension;
    }

    public ExtensionElement removeExtension(String str, String str2) {
        ExtensionElement extensionElement;
        String b = C14055b.m60641b(str, str2);
        synchronized (this.packetExtensions) {
            extensionElement = (ExtensionElement) this.packetExtensions.remove(b);
        }
        return extensionElement;
    }

    public void setError(XMPPError xMPPError) {
        this.error = xMPPError;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    @Deprecated
    public void setPacketID(String str) {
        setStanzaId(str);
    }

    public void setStanzaId(String str) {
        if (str != null) {
            StringUtils.requireNotNullOrEmpty(str, "id must either be null or not the empty String");
        }
        this.f44978id = str;
    }

    public void setTo(String str) {
        this.f44979to = str;
    }

    public String toString() {
        return toXML().toString();
    }

    protected Stanza(String str) {
        this.packetExtensions = new MultiMap<>();
        this.f44978id = null;
        this.f44979to = null;
        this.from = null;
        this.error = null;
        setStanzaId(str);
    }

    public <PE extends ExtensionElement> PE getExtension(String str, String str2) {
        PE pe;
        if (str2 == null) {
            return null;
        }
        String b = C14055b.m60641b(str, str2);
        synchronized (this.packetExtensions) {
            pe = (ExtensionElement) this.packetExtensions.getFirst(b);
        }
        if (pe == null) {
            return null;
        }
        return pe;
    }

    public Set<ExtensionElement> getExtensions(String str, String str2) {
        StringUtils.requireNotNullOrEmpty(str, "elementName must not be null or empty");
        StringUtils.requireNotNullOrEmpty(str2, "namespace must not be null or empty");
        return this.packetExtensions.getAll(C14055b.m60641b(str, str2));
    }

    public ExtensionElement removeExtension(ExtensionElement extensionElement) {
        return removeExtension(extensionElement.getElementName(), extensionElement.getNamespace());
    }

    public boolean hasExtension(String str) {
        synchronized (this.packetExtensions) {
            for (ExtensionElement namespace : this.packetExtensions.values()) {
                if (namespace.getNamespace().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    protected Stanza(Stanza stanza) {
        this.packetExtensions = new MultiMap<>();
        this.f44978id = null;
        this.f44979to = null;
        this.from = null;
        this.error = null;
        this.f44978id = stanza.getStanzaId();
        this.f44979to = stanza.getTo();
        this.from = stanza.getFrom();
        this.error = stanza.error;
        for (ExtensionElement addExtension : stanza.getExtensions()) {
            addExtension(addExtension);
        }
    }
}
