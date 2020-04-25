package org.jivesoftware.smackx.pubsub.packet;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.pubsub.PubSubElementType;

public class PubSub extends C15617IQ {
    public static final String ELEMENT = "pubsub";
    public static final String NAMESPACE = "http://jabber.org/protocol/pubsub";

    public PubSub() {
        super("pubsub", "http://jabber.org/protocol/pubsub");
    }

    public static PubSub createPubsubPacket(String str, Type type, ExtensionElement extensionElement, PubSubNamespace pubSubNamespace) {
        PubSub pubSub = new PubSub(str, type, pubSubNamespace);
        pubSub.addExtension(extensionElement);
        return pubSub;
    }

    public String getElementName() {
        return "pubsub";
    }

    public <PE extends ExtensionElement> PE getExtension(PubSubElementType pubSubElementType) {
        return getExtension(pubSubElementType.getElementName(), pubSubElementType.getNamespace().getXmlns());
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        return iQChildElementXmlStringBuilder;
    }

    public PubSub(PubSubNamespace pubSubNamespace) {
        super("pubsub", pubSubNamespace.getXmlns());
    }

    public PubSub(String str, Type type, PubSubNamespace pubSubNamespace) {
        if (pubSubNamespace == null) {
            pubSubNamespace = PubSubNamespace.BASIC;
        }
        super("pubsub", pubSubNamespace.getXmlns());
        setTo(str);
        setType(type);
    }
}
