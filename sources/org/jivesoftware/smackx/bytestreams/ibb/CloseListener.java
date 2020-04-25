package org.jivesoftware.smackx.bytestreams.ibb;

import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;

class CloseListener extends AbstractIqRequestHandler {
    private final InBandBytestreamManager manager;

    protected CloseListener(InBandBytestreamManager inBandBytestreamManager) {
        super(Close.ELEMENT, "http://jabber.org/protocol/ibb", Type.set, Mode.async);
        this.manager = inBandBytestreamManager;
    }

    public C15617IQ handleIQRequest(C15617IQ iq) {
        Close close = (Close) iq;
        InBandBytestreamSession inBandBytestreamSession = (InBandBytestreamSession) this.manager.getSessions().get(close.getSessionID());
        if (inBandBytestreamSession == null) {
            try {
                this.manager.replyItemNotFoundPacket(close);
            } catch (NotConnectedException unused) {
                return null;
            }
        } else {
            try {
                inBandBytestreamSession.closeByPeer(close);
                this.manager.getSessions().remove(close.getSessionID());
            } catch (NotConnectedException unused2) {
            }
        }
        return null;
    }
}
