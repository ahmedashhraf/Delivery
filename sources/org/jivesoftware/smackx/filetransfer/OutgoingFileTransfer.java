package org.jivesoftware.smackx.filetransfer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.IllegalStateChangeException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Error;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;

public class OutgoingFileTransfer extends FileTransfer {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(OutgoingFileTransfer.class.getName());
    private static int RESPONSE_TIMEOUT = 60000;
    private NegotiationProgress callback;
    private String initiator;
    /* access modifiers changed from: private */
    public OutputStream outputStream;
    private Thread transferThread;

    /* renamed from: org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer$4 */
    static /* synthetic */ class C156844 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition = new int[Condition.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.XMPPError$Condition[] r0 = org.jivesoftware.smack.packet.XMPPError.Condition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.XMPPError$Condition r1 = org.jivesoftware.smack.packet.XMPPError.Condition.forbidden     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.XMPPError$Condition r1 = org.jivesoftware.smack.packet.XMPPError.Condition.bad_request     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.C156844.<clinit>():void");
        }
    }

    public interface NegotiationProgress {
        void errorEstablishingStream(Exception exc);

        void outputStreamEstablished(OutputStream outputStream);

        void statusUpdated(Status status, Status status2);
    }

    protected OutgoingFileTransfer(String str, String str2, String str3, FileTransferNegotiator fileTransferNegotiator) {
        super(str2, str3, fileTransferNegotiator);
        this.initiator = str;
    }

    private void checkTransferThread() {
        Thread thread = this.transferThread;
        if ((thread != null && thread.isAlive()) || isDone()) {
            throw new IllegalStateException("File transfer in progress or has already completed.");
        }
    }

    public static int getResponseTimeout() {
        return RESPONSE_TIMEOUT;
    }

    /* access modifiers changed from: private */
    public void handleXMPPException(XMPPErrorException xMPPErrorException) {
        XMPPError xMPPError = xMPPErrorException.getXMPPError();
        if (xMPPError != null) {
            int i = C156844.$SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition[xMPPError.getCondition().ordinal()];
            if (i == 1) {
                setStatus(Status.refused);
                return;
            } else if (i != 2) {
                setStatus(Status.error);
            } else {
                setStatus(Status.error);
                setError(Error.not_acceptable);
            }
        }
        setException(xMPPErrorException);
    }

    /* access modifiers changed from: private */
    public OutputStream negotiateStream(String str, long j, String str2) throws SmackException, XMPPException {
        if (updateStatus(Status.initial, Status.negotiating_transfer)) {
            StreamNegotiator negotiateOutgoingTransfer = this.negotiator.negotiateOutgoingTransfer(getPeer(), this.streamID, str, j, str2, RESPONSE_TIMEOUT);
            if (updateStatus(Status.negotiating_transfer, Status.negotiating_stream)) {
                this.outputStream = negotiateOutgoingTransfer.createOutgoingStream(this.streamID, this.initiator, getPeer());
                if (updateStatus(Status.negotiating_stream, Status.negotiated)) {
                    return this.outputStream;
                }
                throw new IllegalStateChangeException();
            }
            throw new IllegalStateChangeException();
        }
        throw new IllegalStateChangeException();
    }

    public static void setResponseTimeout(int i) {
        RESPONSE_TIMEOUT = i;
    }

    public void cancel() {
        setStatus(Status.cancelled);
    }

    public long getBytesSent() {
        return this.amountWritten;
    }

    /* access modifiers changed from: protected */
    public OutputStream getOutputStream() {
        if (getStatus().equals(Status.negotiated)) {
            return this.outputStream;
        }
        return null;
    }

    public synchronized OutputStream sendFile(String str, long j, String str2) throws XMPPException, SmackException {
        if (isDone() || this.outputStream != null) {
            throw new IllegalStateException("The negotation process has already been attempted on this file transfer");
        }
        try {
            setFileInfo(str, j);
            this.outputStream = negotiateStream(str, j, str2);
        } catch (XMPPErrorException e) {
            handleXMPPException(e);
            throw e;
        }
        return this.outputStream;
    }

    public synchronized void sendStream(InputStream inputStream, String str, long j, String str2) {
        checkTransferThread();
        setFileInfo(str, j);
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        final InputStream inputStream2 = inputStream;
        C156833 r1 = new Runnable() {
            /* JADX INFO: finally extract failed */
            public void run() {
                OutgoingFileTransfer outgoingFileTransfer;
                try {
                    OutgoingFileTransfer.this.outputStream = OutgoingFileTransfer.this.negotiateStream(str3, j2, str4);
                } catch (XMPPErrorException e) {
                    OutgoingFileTransfer.this.handleXMPPException(e);
                    return;
                } catch (Exception e2) {
                    OutgoingFileTransfer.this.setException(e2);
                }
                if (OutgoingFileTransfer.this.outputStream != null && OutgoingFileTransfer.this.updateStatus(Status.negotiated, Status.in_progress)) {
                    try {
                        OutgoingFileTransfer.this.writeToStream(inputStream2, OutgoingFileTransfer.this.outputStream);
                        try {
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            OutgoingFileTransfer.this.outputStream.flush();
                            outgoingFileTransfer = OutgoingFileTransfer.this;
                            outgoingFileTransfer.outputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException e3) {
                        OutgoingFileTransfer.this.setStatus(Status.error);
                        OutgoingFileTransfer.this.setException(e3);
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        OutgoingFileTransfer.this.outputStream.flush();
                        outgoingFileTransfer = OutgoingFileTransfer.this;
                    } catch (Throwable th) {
                        try {
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            OutgoingFileTransfer.this.outputStream.flush();
                            OutgoingFileTransfer.this.outputStream.close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                    OutgoingFileTransfer.this.updateStatus(Status.in_progress, Status.complete);
                }
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append("File Transfer ");
        sb.append(this.streamID);
        this.transferThread = new Thread(r1, sb.toString());
        this.transferThread.start();
    }

    /* access modifiers changed from: protected */
    public void setException(Exception exc) {
        super.setException(exc);
        NegotiationProgress negotiationProgress = this.callback;
        if (negotiationProgress != null) {
            negotiationProgress.errorEstablishingStream(exc);
        }
    }

    /* access modifiers changed from: protected */
    public void setOutputStream(OutputStream outputStream2) {
        if (this.outputStream == null) {
            this.outputStream = outputStream2;
        }
    }

    /* access modifiers changed from: protected */
    public void setStatus(Status status) {
        Status status2 = getStatus();
        super.setStatus(status);
        NegotiationProgress negotiationProgress = this.callback;
        if (negotiationProgress != null) {
            negotiationProgress.statusUpdated(status2, status);
        }
    }

    /* access modifiers changed from: protected */
    public boolean updateStatus(Status status, Status status2) {
        boolean updateStatus = super.updateStatus(status, status2);
        NegotiationProgress negotiationProgress = this.callback;
        if (negotiationProgress != null && updateStatus) {
            negotiationProgress.statusUpdated(status, status2);
        }
        return updateStatus;
    }

    public synchronized void sendFile(String str, long j, String str2, NegotiationProgress negotiationProgress) {
        if (negotiationProgress != null) {
            try {
                checkTransferThread();
                if (isDone() || this.outputStream != null) {
                    throw new IllegalStateException("The negotation process has already been attempted for this file transfer");
                }
                setFileInfo(str, j);
                this.callback = negotiationProgress;
                final String str3 = str;
                final long j2 = j;
                final String str4 = str2;
                final NegotiationProgress negotiationProgress2 = negotiationProgress;
                C156811 r1 = new Runnable() {
                    public void run() {
                        try {
                            OutgoingFileTransfer.this.outputStream = OutgoingFileTransfer.this.negotiateStream(str3, j2, str4);
                            negotiationProgress2.outputStreamEstablished(OutgoingFileTransfer.this.outputStream);
                        } catch (XMPPErrorException e) {
                            OutgoingFileTransfer.this.handleXMPPException(e);
                        } catch (Exception e2) {
                            OutgoingFileTransfer.this.setException(e2);
                        }
                    }
                };
                StringBuilder sb = new StringBuilder();
                sb.append("File Transfer Negotiation ");
                sb.append(this.streamID);
                this.transferThread = new Thread(r1, sb.toString());
                this.transferThread.start();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Callback progress cannot be null.");
        }
    }

    public synchronized void sendFile(final File file, final String str) throws SmackException {
        checkTransferThread();
        if (file == null || !file.exists() || !file.canRead()) {
            throw new IllegalArgumentException("Could not read file");
        }
        setFileInfo(file.getAbsolutePath(), file.getName(), file.length());
        C156822 r1 = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC, Splitter:B:31:0x0082] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[SYNTHETIC, Splitter:B:44:0x00be] */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC, Splitter:B:54:0x00e2] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0074=Splitter:B:28:0x0074, B:41:0x00a9=Splitter:B:41:0x00a9} */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0090=Splitter:B:35:0x0090, B:20:0x005b=Splitter:B:20:0x005b, B:48:0x00cc=Splitter:B:48:0x00cc} */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = "Closing input stream"
                    java.lang.String r1 = "Closing output stream"
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    java.io.File r4 = r5     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    java.lang.String r4 = r4.getName()     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    java.io.File r5 = r5     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    long r5 = r5.length()     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    java.lang.String r7 = r6     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    java.io.OutputStream r3 = r3.negotiateStream(r4, r5, r7)     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    r2.outputStream = r3     // Catch:{ XMPPErrorException -> 0x0105, Exception -> 0x001e }
                    goto L_0x0024
                L_0x001e:
                    r2 = move-exception
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this
                    r3.setException(r2)
                L_0x0024:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this
                    java.io.OutputStream r2 = r2.outputStream
                    if (r2 != 0) goto L_0x002d
                    return
                L_0x002d:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r3 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.negotiated
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r4 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress
                    boolean r2 = r2.updateStatus(r3, r4)
                    if (r2 != 0) goto L_0x003a
                    return
                L_0x003a:
                    r2 = 0
                    java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0070, all -> 0x006a }
                    java.io.File r4 = r5     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0070, all -> 0x006a }
                    r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x0070, all -> 0x006a }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0066 }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0066 }
                    java.io.OutputStream r4 = r4.outputStream     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0066 }
                    r2.writeToStream(r3, r4)     // Catch:{ FileNotFoundException -> 0x0068, IOException -> 0x0066 }
                    r3.close()     // Catch:{ IOException -> 0x0051 }
                    goto L_0x005b
                L_0x0051:
                    r2 = move-exception
                    java.util.logging.Logger r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r4 = java.util.logging.Level.WARNING
                    r3.log(r4, r0, r2)
                L_0x005b:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ IOException -> 0x009a }
                    java.io.OutputStream r0 = r0.outputStream     // Catch:{ IOException -> 0x009a }
                    r0.close()     // Catch:{ IOException -> 0x009a }
                    goto L_0x00d5
                L_0x0066:
                    r2 = move-exception
                    goto L_0x0074
                L_0x0068:
                    r2 = move-exception
                    goto L_0x00a9
                L_0x006a:
                    r3 = move-exception
                    r8 = r3
                    r3 = r2
                    r2 = r8
                    goto L_0x00e0
                L_0x0070:
                    r3 = move-exception
                    r8 = r3
                    r3 = r2
                    r2 = r8
                L_0x0074:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r5 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error     // Catch:{ all -> 0x00df }
                    r4.setStatus(r5)     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ all -> 0x00df }
                    r4.setException(r2)     // Catch:{ all -> 0x00df }
                    if (r3 == 0) goto L_0x0090
                    r3.close()     // Catch:{ IOException -> 0x0086 }
                    goto L_0x0090
                L_0x0086:
                    r2 = move-exception
                    java.util.logging.Logger r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r4 = java.util.logging.Level.WARNING
                    r3.log(r4, r0, r2)
                L_0x0090:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ IOException -> 0x009a }
                    java.io.OutputStream r0 = r0.outputStream     // Catch:{ IOException -> 0x009a }
                    r0.close()     // Catch:{ IOException -> 0x009a }
                    goto L_0x00d5
                L_0x009a:
                    r0 = move-exception
                    java.util.logging.Logger r2 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r3 = java.util.logging.Level.WARNING
                    r2.log(r3, r1, r0)
                    goto L_0x00d5
                L_0x00a5:
                    r3 = move-exception
                    r8 = r3
                    r3 = r2
                    r2 = r8
                L_0x00a9:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r5 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error     // Catch:{ all -> 0x00df }
                    r4.setStatus(r5)     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Error r5 = org.jivesoftware.smackx.filetransfer.FileTransfer.Error.bad_file     // Catch:{ all -> 0x00df }
                    r4.setError(r5)     // Catch:{ all -> 0x00df }
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ all -> 0x00df }
                    r4.setException(r2)     // Catch:{ all -> 0x00df }
                    if (r3 == 0) goto L_0x00cc
                    r3.close()     // Catch:{ IOException -> 0x00c2 }
                    goto L_0x00cc
                L_0x00c2:
                    r2 = move-exception
                    java.util.logging.Logger r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r4 = java.util.logging.Level.WARNING
                    r3.log(r4, r0, r2)
                L_0x00cc:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ IOException -> 0x009a }
                    java.io.OutputStream r0 = r0.outputStream     // Catch:{ IOException -> 0x009a }
                    r0.close()     // Catch:{ IOException -> 0x009a }
                L_0x00d5:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r1 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress
                    org.jivesoftware.smackx.filetransfer.FileTransfer$Status r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.complete
                    r0.updateStatus(r1, r2)
                    return
                L_0x00df:
                    r2 = move-exception
                L_0x00e0:
                    if (r3 == 0) goto L_0x00f0
                    r3.close()     // Catch:{ IOException -> 0x00e6 }
                    goto L_0x00f0
                L_0x00e6:
                    r3 = move-exception
                    java.util.logging.Logger r4 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r5 = java.util.logging.Level.WARNING
                    r4.log(r5, r0, r3)
                L_0x00f0:
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this     // Catch:{ IOException -> 0x00fa }
                    java.io.OutputStream r0 = r0.outputStream     // Catch:{ IOException -> 0x00fa }
                    r0.close()     // Catch:{ IOException -> 0x00fa }
                    goto L_0x0104
                L_0x00fa:
                    r0 = move-exception
                    java.util.logging.Logger r3 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.LOGGER
                    java.util.logging.Level r4 = java.util.logging.Level.WARNING
                    r3.log(r4, r1, r0)
                L_0x0104:
                    throw r2
                L_0x0105:
                    r0 = move-exception
                    org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer r1 = org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.this
                    r1.handleXMPPException(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer.C156822.run():void");
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append("File Transfer ");
        sb.append(this.streamID);
        this.transferThread = new Thread(r1, sb.toString());
        this.transferThread.start();
    }
}
