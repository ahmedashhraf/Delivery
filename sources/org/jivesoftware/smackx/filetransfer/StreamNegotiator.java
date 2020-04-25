package org.jivesoftware.smackx.filetransfer;

import java.io.InputStream;
import java.io.OutputStream;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.EventManger;
import org.jivesoftware.smack.util.EventManger.Callback;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public abstract class StreamNegotiator {
    protected static final EventManger<String, C15617IQ, NotConnectedException> initationSetEvents = new EventManger<>();

    protected static StreamInitiation createInitiationAccept(StreamInitiation streamInitiation, String[] strArr) {
        StreamInitiation streamInitiation2 = new StreamInitiation();
        streamInitiation2.setTo(streamInitiation.getFrom());
        streamInitiation2.setFrom(streamInitiation.getTo());
        streamInitiation2.setType(Type.result);
        streamInitiation2.setStanzaId(streamInitiation.getStanzaId());
        DataForm dataForm = new DataForm(DataForm.Type.submit);
        FormField formField = new FormField("stream-method");
        for (String addValue : strArr) {
            formField.addValue(addValue);
        }
        dataForm.addField(formField);
        streamInitiation2.setFeatureNegotiationForm(dataForm);
        return streamInitiation2;
    }

    public static void signal(String str, C15617IQ iq) {
        initationSetEvents.signalEvent(str, iq);
    }

    public abstract InputStream createIncomingStream(StreamInitiation streamInitiation) throws XMPPErrorException, InterruptedException, NoResponseException, SmackException;

    public abstract OutputStream createOutgoingStream(String str, String str2, String str3) throws XMPPErrorException, NoResponseException, SmackException, XMPPException;

    public abstract String[] getNamespaces();

    /* access modifiers changed from: protected */
    public final C15617IQ initiateIncomingStream(final XMPPConnection xMPPConnection, StreamInitiation streamInitiation) throws NoResponseException, XMPPErrorException, NotConnectedException {
        final StreamInitiation createInitiationAccept = createInitiationAccept(streamInitiation, getNamespaces());
        newStreamInitiation(streamInitiation.getFrom(), streamInitiation.getSessionID());
        StringBuilder sb = new StringBuilder();
        sb.append(streamInitiation.getFrom().toString());
        sb.append(9);
        sb.append(streamInitiation.getSessionID());
        try {
            C15617IQ iq = (C15617IQ) initationSetEvents.performActionAndWaitForEvent(sb.toString(), xMPPConnection.getPacketReplyTimeout(), new Callback<NotConnectedException>() {
                public void action() throws NotConnectedException {
                    xMPPConnection.sendStanza(createInitiationAccept);
                }
            });
            if (iq != null) {
                XMPPErrorException.ifHasErrorThenThrow(iq);
                return iq;
            }
            throw NoResponseException.newWith(xMPPConnection);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract InputStream negotiateIncomingStream(Stanza stanza) throws XMPPErrorException, InterruptedException, NoResponseException, SmackException;

    /* access modifiers changed from: protected */
    public abstract void newStreamInitiation(String str, String str2);
}
