package org.jivesoftware.smackx.filetransfer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;

public class IncomingFileTransfer extends FileTransfer {
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(IncomingFileTransfer.class.getName());
    /* access modifiers changed from: private */
    public InputStream inputStream;
    /* access modifiers changed from: private */
    public FileTransferRequest recieveRequest;

    protected IncomingFileTransfer(FileTransferRequest fileTransferRequest, FileTransferNegotiator fileTransferNegotiator) {
        super(fileTransferRequest.getRequestor(), fileTransferRequest.getStreamID(), fileTransferNegotiator);
        this.recieveRequest = fileTransferRequest;
    }

    /* access modifiers changed from: private */
    public InputStream negotiateStream() throws SmackException, XMPPErrorException {
        setStatus(Status.negotiating_transfer);
        final StreamNegotiator selectStreamNegotiator = this.negotiator.selectStreamNegotiator(this.recieveRequest);
        setStatus(Status.negotiating_stream);
        FutureTask futureTask = new FutureTask(new Callable<InputStream>() {
            public InputStream call() throws Exception {
                return selectStreamNegotiator.createIncomingStream(IncomingFileTransfer.this.recieveRequest.getStreamInitiation());
            }
        });
        futureTask.run();
        try {
            InputStream inputStream2 = (InputStream) futureTask.get(15, TimeUnit.SECONDS);
            futureTask.cancel(true);
            setStatus(Status.negotiated);
            return inputStream2;
        } catch (InterruptedException e) {
            throw new SmackException("Interruption while executing", e);
        } catch (ExecutionException e2) {
            throw new SmackException("Error in execution", e2);
        } catch (TimeoutException e3) {
            throw new SmackException("Request timed out", e3);
        } catch (Throwable th) {
            futureTask.cancel(true);
            throw th;
        }
    }

    public void cancel() {
        setStatus(Status.cancelled);
    }

    public InputStream recieveFile() throws SmackException, XMPPErrorException {
        if (this.inputStream == null) {
            try {
                this.inputStream = negotiateStream();
                return this.inputStream;
            } catch (XMPPErrorException e) {
                setException(e);
                throw e;
            }
        } else {
            throw new IllegalStateException("Transfer already negotiated!");
        }
    }

    public void recieveFile(final File file) throws SmackException, IOException {
        if (file != null) {
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.canWrite()) {
                C156791 r1 = new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[SYNTHETIC, Splitter:B:20:0x0076] */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e A[SYNTHETIC, Splitter:B:25:0x008e] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r6 = this;
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ Exception -> 0x009f }
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r1 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ Exception -> 0x009f }
                            java.io.InputStream r1 = r1.negotiateStream()     // Catch:{ Exception -> 0x009f }
                            r0.inputStream = r1     // Catch:{ Exception -> 0x009f }
                            r0 = 0
                            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x002a }
                            java.io.File r2 = r4     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x002a }
                            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x002a }
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            r0.setStatus(r2)     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            java.io.InputStream r2 = r2.inputStream     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            r0.writeToStream(r2, r1)     // Catch:{ FileNotFoundException -> 0x0028, IOException -> 0x0026 }
                            goto L_0x0059
                        L_0x0026:
                            r0 = move-exception
                            goto L_0x002e
                        L_0x0028:
                            r0 = move-exception
                            goto L_0x0046
                        L_0x002a:
                            r1 = move-exception
                            r5 = r1
                            r1 = r0
                            r0 = r5
                        L_0x002e:
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r3 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error
                            r2.setStatus(r3)
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Error r3 = org.jivesoftware.smackx.filetransfer.FileTransfer.Error.stream
                            r2.setError(r3)
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            r2.setException(r0)
                            goto L_0x0059
                        L_0x0042:
                            r1 = move-exception
                            r5 = r1
                            r1 = r0
                            r0 = r5
                        L_0x0046:
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r3 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error
                            r2.setStatus(r3)
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Error r3 = org.jivesoftware.smackx.filetransfer.FileTransfer.Error.bad_file
                            r2.setError(r3)
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            r2.setException(r0)
                        L_0x0059:
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r0 = r0.getStatus()
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.in_progress
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x006e
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.complete
                            r0.setStatus(r2)
                        L_0x006e:
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            java.io.InputStream r0 = r0.inputStream
                            if (r0 == 0) goto L_0x008c
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r0 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this     // Catch:{ IOException -> 0x0080 }
                            java.io.InputStream r0 = r0.inputStream     // Catch:{ IOException -> 0x0080 }
                            r0.close()     // Catch:{ IOException -> 0x0080 }
                            goto L_0x008c
                        L_0x0080:
                            r0 = move-exception
                            java.util.logging.Logger r2 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.LOGGER
                            java.util.logging.Level r3 = java.util.logging.Level.WARNING
                            java.lang.String r4 = "Closing input stream"
                            r2.log(r3, r4, r0)
                        L_0x008c:
                            if (r1 == 0) goto L_0x009e
                            r1.close()     // Catch:{ IOException -> 0x0092 }
                            goto L_0x009e
                        L_0x0092:
                            r0 = move-exception
                            java.util.logging.Logger r1 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.LOGGER
                            java.util.logging.Level r2 = java.util.logging.Level.WARNING
                            java.lang.String r3 = "Closing output stream"
                            r1.log(r2, r3, r0)
                        L_0x009e:
                            return
                        L_0x009f:
                            r0 = move-exception
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r1 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            org.jivesoftware.smackx.filetransfer.FileTransfer$Status r2 = org.jivesoftware.smackx.filetransfer.FileTransfer.Status.error
                            r1.setStatus(r2)
                            org.jivesoftware.smackx.filetransfer.IncomingFileTransfer r1 = org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.this
                            r1.setException(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.filetransfer.IncomingFileTransfer.C156791.run():void");
                    }
                };
                StringBuilder sb = new StringBuilder();
                sb.append("File Transfer ");
                sb.append(this.streamID);
                new Thread(r1, sb.toString()).start();
                return;
            }
            throw new IllegalArgumentException("Cannot write to provided file");
        }
        throw new IllegalArgumentException("File cannot be null");
    }
}
