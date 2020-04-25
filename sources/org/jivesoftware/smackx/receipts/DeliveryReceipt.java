package org.jivesoftware.smackx.receipts;

import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.provider.EmbeddedExtensionProvider;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class DeliveryReceipt implements ExtensionElement {
    public static final String ELEMENT = "received";
    public static final String NAMESPACE = "urn:xmpp:receipts";

    /* renamed from: id */
    private final String f45013id;

    public static class Provider extends EmbeddedExtensionProvider<DeliveryReceipt> {
        /* access modifiers changed from: protected */
        public DeliveryReceipt createReturnExtension(String str, String str2, Map<String, String> map, List<? extends ExtensionElement> list) {
            return new DeliveryReceipt((String) map.get("id"));
        }
    }

    public DeliveryReceipt(String str) {
        this.f45013id = (String) StringUtils.requireNotNullOrEmpty(str, "id must not be null");
    }

    public static DeliveryReceipt from(Message message) {
        return (DeliveryReceipt) message.getExtension(ELEMENT, NAMESPACE);
    }

    @Deprecated
    public static DeliveryReceipt getFrom(Message message) {
        return from(message);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getId() {
        return this.f45013id;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute("id", this.f45013id);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
