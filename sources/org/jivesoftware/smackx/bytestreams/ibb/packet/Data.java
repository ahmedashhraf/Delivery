package org.jivesoftware.smackx.bytestreams.ibb.packet;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public class Data extends C15617IQ {
    private final DataPacketExtension dataPacketExtension;

    public Data(DataPacketExtension dataPacketExtension2) {
        super("data", "http://jabber.org/protocol/ibb");
        if (dataPacketExtension2 != null) {
            this.dataPacketExtension = dataPacketExtension2;
            setType(Type.set);
            return;
        }
        throw new IllegalArgumentException("Data must not be null");
    }

    public DataPacketExtension getDataPacketExtension() {
        return this.dataPacketExtension;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        return this.dataPacketExtension.getIQChildElementBuilder(iQChildElementXmlStringBuilder);
    }
}
