package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.util.XmlStringBuilder;

public class UnsubscribeExtension extends NodeExtension {

    /* renamed from: id */
    protected String f45012id;
    protected String jid;

    public UnsubscribeExtension(String str) {
        this(str, null, null);
    }

    public String getId() {
        return this.f45012id;
    }

    public String getJid() {
        return this.jid;
    }

    public UnsubscribeExtension(String str, String str2) {
        this(str, str2, null);
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(getElementName());
        xmlStringBuilder.attribute("jid", this.jid);
        xmlStringBuilder.optAttribute("node", getNode());
        xmlStringBuilder.optAttribute("subid", this.f45012id);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }

    public UnsubscribeExtension(String str, String str2, String str3) {
        super(PubSubElementType.UNSUBSCRIBE, str2);
        this.jid = str;
        this.f45012id = str3;
    }
}
