package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.util.XmlStringBuilder;

public class OptionsExtension extends NodeExtension {

    /* renamed from: id */
    protected String f45006id;
    protected String jid;

    public OptionsExtension(String str) {
        this(str, null, null);
    }

    public String getId() {
        return this.f45006id;
    }

    public String getJid() {
        return this.jid;
    }

    public OptionsExtension(String str, String str2) {
        this(str, str2, null);
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement(getElementName());
        xmlStringBuilder.attribute("jid", this.jid);
        xmlStringBuilder.optAttribute("node", getNode());
        xmlStringBuilder.optAttribute("subid", this.f45006id);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }

    public OptionsExtension(String str, String str2, String str3) {
        super(PubSubElementType.OPTIONS, str2);
        this.jid = str;
        this.f45006id = str3;
    }
}
