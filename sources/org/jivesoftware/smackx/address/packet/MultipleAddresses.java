package org.jivesoftware.smackx.address.packet;

import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class MultipleAddresses implements ExtensionElement {
    public static final String ELEMENT = "addresses";
    public static final String NAMESPACE = "http://jabber.org/protocol/address";
    private List<Address> addresses = new ArrayList();

    public static class Address implements NamedElement {
        public static final String ELEMENT = "address";
        private boolean delivered;
        private String description;
        private String jid;
        private String node;
        private final Type type;
        private String uri;

        /* access modifiers changed from: private */
        public void setDelivered(boolean z) {
            this.delivered = z;
        }

        /* access modifiers changed from: private */
        public void setDescription(String str) {
            this.description = str;
        }

        /* access modifiers changed from: private */
        public void setJid(String str) {
            this.jid = str;
        }

        /* access modifiers changed from: private */
        public void setNode(String str) {
            this.node = str;
        }

        /* access modifiers changed from: private */
        public void setUri(String str) {
            this.uri = str;
        }

        public String getDescription() {
            return this.description;
        }

        public String getElementName() {
            return "address";
        }

        public String getJid() {
            return this.jid;
        }

        public String getNode() {
            return this.node;
        }

        public Type getType() {
            return this.type;
        }

        public String getUri() {
            return this.uri;
        }

        public boolean isDelivered() {
            return this.delivered;
        }

        private Address(Type type2) {
            this.type = type2;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement((NamedElement) this).attribute("type", (Enum<?>) this.type);
            xmlStringBuilder.optAttribute("jid", this.jid);
            xmlStringBuilder.optAttribute("node", this.node);
            xmlStringBuilder.optAttribute("desc", this.description);
            String str = this.description;
            if (str != null && str.trim().length() > 0) {
                xmlStringBuilder.append((CharSequence) " desc=\"");
                xmlStringBuilder.append((CharSequence) this.description).append((CharSequence) "\"");
            }
            xmlStringBuilder.optBooleanAttribute("delivered", this.delivered);
            xmlStringBuilder.optAttribute(ShareConstants.MEDIA_URI, this.uri);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public enum Type {
        bcc,
        cc,
        noreply,
        replyroom,
        replyto,
        to,
        ofrom
    }

    public void addAddress(Type type, String str, String str2, String str3, boolean z, String str4) {
        Address address = new Address(type);
        address.setJid(str);
        address.setNode(str2);
        address.setDescription(str3);
        address.setDelivered(z);
        address.setUri(str4);
        this.addresses.add(address);
    }

    public List<Address> getAddressesOfType(Type type) {
        ArrayList arrayList = new ArrayList(this.addresses.size());
        for (Address address : this.addresses) {
            if (address.getType().equals(type)) {
                arrayList.add(address);
            }
        }
        return arrayList;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setNoReply() {
        this.addresses.add(new Address(Type.noreply));
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        for (Address xml : this.addresses) {
            xmlStringBuilder.append(xml.toXML());
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
