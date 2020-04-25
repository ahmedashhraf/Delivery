package org.jivesoftware.smackx.bytestreams.ibb;

import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Data;

class DataListener extends AbstractIqRequestHandler {
    private final InBandBytestreamManager manager;

    public DataListener(InBandBytestreamManager inBandBytestreamManager) {
        super("data", "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    public C15617IQ handleIQRequest(C15617IQ iq) {
        Data data = (Data) iq;
        InBandBytestreamSession inBandBytestreamSession = (InBandBytestreamSession) this.manager.getSessions().get(data.getDataPacketExtension().getSessionID());
        if (inBandBytestreamSession == null) {
            try {
                this.manager.replyItemNotFoundPacket(data);
            } catch (NotConnectedException unused) {
            }
        } else {
            inBandBytestreamSession.processIQPacket(data);
        }
        return null;
    }
}
