package org.jivesoftware.smackx.filetransfer;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;
import p205i.p486d.p487a.C14055b;

public class FileTransferManager extends Manager {
    private static final Map<XMPPConnection, FileTransferManager> INSTANCES = new WeakHashMap();
    private final FileTransferNegotiator fileTransferNegotiator;
    /* access modifiers changed from: private */
    public final List<FileTransferListener> listeners = new CopyOnWriteArrayList();

    private FileTransferManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.fileTransferNegotiator = FileTransferNegotiator.getInstanceFor(xMPPConnection);
        C156771 r1 = new AbstractIqRequestHandler(StreamInitiation.ELEMENT, "http://jabber.org/protocol/si", Type.set, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                FileTransferRequest fileTransferRequest = new FileTransferRequest(FileTransferManager.this, (StreamInitiation) iq);
                for (FileTransferListener fileTransferRequest2 : FileTransferManager.this.listeners) {
                    fileTransferRequest2.fileTransferRequest(fileTransferRequest);
                }
                return null;
            }
        };
        xMPPConnection.registerIQRequestHandler(r1);
    }

    public static synchronized FileTransferManager getInstanceFor(XMPPConnection xMPPConnection) {
        FileTransferManager fileTransferManager;
        synchronized (FileTransferManager.class) {
            fileTransferManager = (FileTransferManager) INSTANCES.get(xMPPConnection);
            if (fileTransferManager == null) {
                fileTransferManager = new FileTransferManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, fileTransferManager);
            }
        }
        return fileTransferManager;
    }

    public void addFileTransferListener(FileTransferListener fileTransferListener) {
        this.listeners.add(fileTransferListener);
    }

    /* access modifiers changed from: protected */
    public IncomingFileTransfer createIncomingFileTransfer(FileTransferRequest fileTransferRequest) {
        if (fileTransferRequest != null) {
            IncomingFileTransfer incomingFileTransfer = new IncomingFileTransfer(fileTransferRequest, this.fileTransferNegotiator);
            incomingFileTransfer.setFileInfo(fileTransferRequest.getFileName(), fileTransferRequest.getFileSize());
            return incomingFileTransfer;
        }
        throw new NullPointerException("RecieveRequest cannot be null");
    }

    public OutgoingFileTransfer createOutgoingFileTransfer(String str) {
        if (str == null) {
            throw new IllegalArgumentException("userID was null");
        } else if (C14055b.m60643c(str)) {
            return new OutgoingFileTransfer(connection().getUser(), str, this.fileTransferNegotiator.getNextStreamID(), this.fileTransferNegotiator);
        } else {
            throw new IllegalArgumentException("The provided user id was not a full JID (i.e. with resource part)");
        }
    }

    /* access modifiers changed from: protected */
    public void rejectIncomingFileTransfer(FileTransferRequest fileTransferRequest) throws NotConnectedException {
        connection().sendStanza(C15617IQ.createErrorResponse(fileTransferRequest.getStreamInitiation(), new XMPPError(Condition.forbidden)));
    }

    public void removeFileTransferListener(FileTransferListener fileTransferListener) {
        this.listeners.remove(fileTransferListener);
    }
}
