package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public class EmptyResultIQ extends C15617IQ {
    public EmptyResultIQ() {
        super(null, null);
        setType(Type.result);
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        return null;
    }

    public EmptyResultIQ(C15617IQ iq) {
        this();
        if (iq.getType() == Type.get || iq.getType() == Type.set) {
            setStanzaId(iq.getStanzaId());
            setFrom(iq.getTo());
            setTo(iq.getFrom());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("IQ must be of type 'set' or 'get'. Original IQ: ");
        sb.append(iq.toXML());
        throw new IllegalArgumentException(sb.toString());
    }
}
