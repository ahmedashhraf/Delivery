package org.jivesoftware.smackx.pep.packet;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;

public class PEPPubSub extends C15617IQ {
    public static final String ELEMENT = "pubsub";
    public static final String NAMESPACE = "http://jabber.org/protocol/pubsub";
    private final PEPItem item;

    public PEPPubSub(PEPItem pEPItem) {
        super("pubsub", "http://jabber.org/protocol/pubsub");
        this.item = pEPItem;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        String str = "publish";
        iQChildElementXmlStringBuilder.openElement(str).attribute("node", this.item.getNode()).rightAngleBracket();
        iQChildElementXmlStringBuilder.append((CharSequence) this.item.toXML());
        iQChildElementXmlStringBuilder.closeElement(str);
        return iQChildElementXmlStringBuilder;
    }
}
