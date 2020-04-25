package org.jivesoftware.smackx.filetransfer;

import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.filetransfer.FileTransferException.NoAcceptableTransferMechanisms;
import org.jivesoftware.smackx.filetransfer.FileTransferException.NoStreamMethodsOfferedException;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation.File;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Option;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;

public class FileTransferNegotiator extends Manager {
    public static boolean IBB_ONLY = false;
    private static final Map<XMPPConnection, FileTransferNegotiator> INSTANCES = new WeakHashMap();
    private static final String[] NAMESPACE = {"http://jabber.org/protocol/si", SI_PROFILE_FILE_TRANSFER_NAMESPACE};
    public static final String SI_NAMESPACE = "http://jabber.org/protocol/si";
    public static final String SI_PROFILE_FILE_TRANSFER_NAMESPACE = "http://jabber.org/protocol/si/profile/file-transfer";
    protected static final String STREAM_DATA_FIELD_NAME = "stream-method";
    private static final String STREAM_INIT_PREFIX = "jsi_";
    private static final Random randomGenerator = new Random();
    private final StreamNegotiator byteStreamTransferManager;
    private final StreamNegotiator inbandTransferManager;

    static {
        boolean z = false;
        if (System.getProperty("ibb") != null) {
            z = true;
        }
        IBB_ONLY = z;
    }

    private FileTransferNegotiator(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.byteStreamTransferManager = new Socks5TransferNegotiator(xMPPConnection);
        this.inbandTransferManager = new IBBTransferNegotiator(xMPPConnection);
        setServiceEnabled(xMPPConnection, true);
    }

    private DataForm createDefaultInitiationForm() {
        DataForm dataForm = new DataForm(Type.form);
        FormField formField = new FormField(STREAM_DATA_FIELD_NAME);
        formField.setType(FormField.Type.list_single);
        if (!IBB_ONLY) {
            formField.addOption(new Option(Bytestream.NAMESPACE));
        }
        formField.addOption(new Option("http://jabber.org/protocol/ibb"));
        dataForm.addField(formField);
        return dataForm;
    }

    public static synchronized FileTransferNegotiator getInstanceFor(XMPPConnection xMPPConnection) {
        FileTransferNegotiator fileTransferNegotiator;
        synchronized (FileTransferNegotiator.class) {
            fileTransferNegotiator = (FileTransferNegotiator) INSTANCES.get(xMPPConnection);
            if (fileTransferNegotiator == null) {
                fileTransferNegotiator = new FileTransferNegotiator(xMPPConnection);
                INSTANCES.put(xMPPConnection, fileTransferNegotiator);
            }
        }
        return fileTransferNegotiator;
    }

    private StreamNegotiator getNegotiator(FormField formField) throws NoAcceptableTransferMechanisms {
        boolean z = false;
        boolean z2 = false;
        for (Option value : formField.getOptions()) {
            String value2 = value.getValue();
            if (value2.equals(Bytestream.NAMESPACE) && !IBB_ONLY) {
                z = true;
            } else if (value2.equals("http://jabber.org/protocol/ibb")) {
                z2 = true;
            }
        }
        if (!z && !z2) {
            throw new NoAcceptableTransferMechanisms();
        } else if (z && z2) {
            return new FaultTolerantNegotiator(connection(), this.byteStreamTransferManager, this.inbandTransferManager);
        } else {
            if (z) {
                return this.byteStreamTransferManager;
            }
            return this.inbandTransferManager;
        }
    }

    private StreamNegotiator getOutgoingNegotiator(FormField formField) throws NoAcceptableTransferMechanisms {
        boolean z = false;
        boolean z2 = false;
        for (String str : formField.getValues()) {
            if (str.equals(Bytestream.NAMESPACE) && !IBB_ONLY) {
                z = true;
            } else if (str.equals("http://jabber.org/protocol/ibb")) {
                z2 = true;
            }
        }
        if (!z && !z2) {
            throw new NoAcceptableTransferMechanisms();
        } else if (z && z2) {
            return new FaultTolerantNegotiator(connection(), this.byteStreamTransferManager, this.inbandTransferManager);
        } else {
            if (z) {
                return this.byteStreamTransferManager;
            }
            return this.inbandTransferManager;
        }
    }

    private FormField getStreamMethodField(DataForm dataForm) {
        for (FormField formField : dataForm.getFields()) {
            if (formField.getVariable().equals(STREAM_DATA_FIELD_NAME)) {
                return formField;
            }
        }
        return null;
    }

    public static Collection<String> getSupportedProtocols() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection) {
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(NAMESPACE));
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        for (String includesFeature : arrayList) {
            if (!instanceFor.includesFeature(includesFeature)) {
                return false;
            }
        }
        return true;
    }

    private static void setServiceEnabled(XMPPConnection xMPPConnection, boolean z) {
        ServiceDiscoveryManager instanceFor = ServiceDiscoveryManager.getInstanceFor(xMPPConnection);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(NAMESPACE));
        arrayList.add("http://jabber.org/protocol/ibb");
        if (!IBB_ONLY) {
            arrayList.add(Bytestream.NAMESPACE);
        }
        for (String str : arrayList) {
            if (z) {
                instanceFor.addFeature(str);
            } else {
                instanceFor.removeFeature(str);
            }
        }
    }

    public String getNextStreamID() {
        StringBuilder sb = new StringBuilder();
        sb.append(STREAM_INIT_PREFIX);
        sb.append(Math.abs(randomGenerator.nextLong()));
        return sb.toString();
    }

    public StreamNegotiator negotiateOutgoingTransfer(String str, String str2, String str3, long j, String str4, int i) throws XMPPErrorException, NotConnectedException, NoResponseException, NoAcceptableTransferMechanisms {
        StreamInitiation streamInitiation = new StreamInitiation();
        streamInitiation.setSessionID(str2);
        streamInitiation.setMimeType(URLConnection.guessContentTypeFromName(str3));
        File file = new File(str3, j);
        file.setDesc(str4);
        streamInitiation.setFile(file);
        streamInitiation.setFeatureNegotiationForm(createDefaultInitiationForm());
        streamInitiation.setFrom(connection().getUser());
        streamInitiation.setTo(str);
        streamInitiation.setType(C15617IQ.Type.set);
        Stanza nextResultOrThrow = connection().createPacketCollectorAndSend(streamInitiation).nextResultOrThrow((long) i);
        if (!(nextResultOrThrow instanceof C15617IQ)) {
            return null;
        }
        C15617IQ iq = (C15617IQ) nextResultOrThrow;
        if (iq.getType().equals(C15617IQ.Type.result)) {
            return getOutgoingNegotiator(getStreamMethodField(((StreamInitiation) nextResultOrThrow).getFeatureNegotiationForm()));
        }
        throw new XMPPErrorException(iq.getError());
    }

    public StreamNegotiator selectStreamNegotiator(FileTransferRequest fileTransferRequest) throws NotConnectedException, NoStreamMethodsOfferedException, NoAcceptableTransferMechanisms {
        StreamInitiation streamInitiation = fileTransferRequest.getStreamInitiation();
        FormField streamMethodField = getStreamMethodField(streamInitiation.getFeatureNegotiationForm());
        if (streamMethodField != null) {
            try {
                return getNegotiator(streamMethodField);
            } catch (NoAcceptableTransferMechanisms e) {
                connection().sendStanza(C15617IQ.createErrorResponse(streamInitiation, XMPPError.from(Condition.bad_request, "No acceptable transfer mechanism")));
                throw e;
            }
        } else {
            connection().sendStanza(C15617IQ.createErrorResponse(streamInitiation, XMPPError.from(Condition.bad_request, "No stream methods contained in stanza.")));
            throw new NoStreamMethodsOfferedException();
        }
    }
}
