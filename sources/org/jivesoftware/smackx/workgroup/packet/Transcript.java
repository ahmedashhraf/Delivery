package org.jivesoftware.smackx.workgroup.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.Stanza;

public class Transcript extends C15617IQ {
    private List<Stanza> packets;
    private String sessionID;

    public Transcript(String str) {
        this(str, new ArrayList());
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.append((CharSequence) " sessionID=\"").append((CharSequence) this.sessionID).append((CharSequence) "\">");
        for (Stanza xml : this.packets) {
            iQChildElementXmlStringBuilder.append(xml.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Stanza> getPackets() {
        return Collections.unmodifiableList(this.packets);
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public Transcript(String str, List<Stanza> list) {
        super("transcript", "http://jabber.org/protocol/workgroup");
        this.sessionID = str;
        this.packets = list;
    }
}
