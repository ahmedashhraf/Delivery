package org.jivesoftware.smackx.workgroup.agent;

import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.search.ReportedData;
import org.jivesoftware.smackx.workgroup.packet.TranscriptSearch;
import org.jivesoftware.smackx.xdata.Form;

public class TranscriptSearchManager {
    private XMPPConnection connection;

    public TranscriptSearchManager(XMPPConnection xMPPConnection) {
        this.connection = xMPPConnection;
    }

    public Form getSearchForm(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        TranscriptSearch transcriptSearch = new TranscriptSearch();
        transcriptSearch.setType(Type.get);
        transcriptSearch.setTo(str);
        return Form.getFormFrom((TranscriptSearch) this.connection.createPacketCollectorAndSend(transcriptSearch).nextResultOrThrow());
    }

    public ReportedData submitSearch(String str, Form form) throws NoResponseException, XMPPErrorException, NotConnectedException {
        TranscriptSearch transcriptSearch = new TranscriptSearch();
        transcriptSearch.setType(Type.get);
        transcriptSearch.setTo(str);
        transcriptSearch.addExtension(form.getDataFormToSend());
        return ReportedData.getReportedDataFrom((TranscriptSearch) this.connection.createPacketCollectorAndSend(transcriptSearch).nextResultOrThrow());
    }
}
