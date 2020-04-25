package org.jivesoftware.smackx.workgroup.agent;

import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.workgroup.packet.Transcript;
import org.jivesoftware.smackx.workgroup.packet.Transcripts;

public class TranscriptManager {
    private XMPPConnection connection;

    public TranscriptManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public Transcript getTranscript(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Transcript transcript = new Transcript(str2);
        transcript.setTo(str);
        return (Transcript) this.connection.createPacketCollectorAndSend(transcript).nextResultOrThrow();
    }

    public Transcripts getTranscripts(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        Transcripts transcripts = new Transcripts(str2);
        transcripts.setTo(str);
        return (Transcripts) this.connection.createPacketCollectorAndSend(transcripts).nextResultOrThrow();
    }
}
