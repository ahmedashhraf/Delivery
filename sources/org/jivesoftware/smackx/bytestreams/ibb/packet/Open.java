package org.jivesoftware.smackx.bytestreams.ibb.packet;

import java.util.Locale;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType;

public class Open extends C15617IQ {
    public static final String ELEMENT = "open";
    public static final String NAMESPACE = "http://jabber.org/protocol/ibb";
    private final int blockSize;
    private final String sessionID;
    private final StanzaType stanza;

    public Open(String str, int i, StanzaType stanzaType) {
        super("open", "http://jabber.org/protocol/ibb");
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("Session ID must not be null or empty");
        } else if (i > 0) {
            this.sessionID = str;
            this.blockSize = i;
            this.stanza = stanzaType;
            setType(Type.set);
        } else {
            throw new IllegalArgumentException("Block size must be greater than zero");
        }
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("block-size", Integer.toString(this.blockSize));
        iQChildElementXmlStringBuilder.attribute("sid", this.sessionID);
        iQChildElementXmlStringBuilder.attribute("stanza", this.stanza.toString().toLowerCase(Locale.US));
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public StanzaType getStanza() {
        return this.stanza;
    }

    public Open(String str, int i) {
        this(str, i, StanzaType.IQ);
    }
}
