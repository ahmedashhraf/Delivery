package org.jivesoftware.smackx.workgroup.packet;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public class DepartQueuePacket extends C15617IQ {
    private String user;

    private DepartQueuePacket() {
        super("depart-queue", "http://jabber.org/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.user != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<jid>").append((CharSequence) this.user).append((CharSequence) "</jid>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public DepartQueuePacket(String str) {
        this(str, null);
    }

    public DepartQueuePacket(String str, String str2) {
        this();
        this.user = str2;
        setTo(str);
        setType(Type.set);
        setFrom(str2);
    }
}
