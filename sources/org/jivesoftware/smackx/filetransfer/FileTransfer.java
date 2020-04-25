package org.jivesoftware.smackx.filetransfer;

import com.facebook.internal.AnalyticsEvents;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class FileTransfer {
    private static final int BUFFER_SIZE = 8192;
    protected long amountWritten = -1;
    private Error error;
    private Exception exception;
    private String fileName;
    private String filePath;
    private long fileSize;
    protected FileTransferNegotiator negotiator;
    private String peer;
    private Status status = Status.initial;
    private final Object statusMonitor = new Object();
    protected String streamID;

    public enum Error {
        none("No error"),
        not_acceptable("The peer did not find any of the provided stream mechanisms acceptable."),
        bad_file("The provided file to transfer does not exist or could not be read."),
        no_response("The remote user did not respond or the connection timed out."),
        connection("An error occured over the socket connected to send the file."),
        stream("An error occured while sending or recieving the file.");
        
        private final String msg;

        private Error(String str) {
            this.msg = str;
        }

        public String getMessage() {
            return this.msg;
        }

        public String toString() {
            return this.msg;
        }
    }

    public enum Status {
        error("Error"),
        initial("Initial"),
        negotiating_transfer("Negotiating Transfer"),
        refused("Refused"),
        negotiating_stream("Negotiating Stream"),
        negotiated("Negotiated"),
        in_progress("In Progress"),
        complete("Complete"),
        cancelled(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED);
        
        private String status;

        private Status(String str) {
            this.status = str;
        }

        public String toString() {
            return this.status;
        }
    }

    protected FileTransfer(String str, String str2, FileTransferNegotiator fileTransferNegotiator) {
        this.peer = str;
        this.streamID = str2;
        this.negotiator = fileTransferNegotiator;
    }

    public abstract void cancel();

    public long getAmountWritten() {
        return this.amountWritten;
    }

    public Error getError() {
        return this.error;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getPeer() {
        return this.peer;
    }

    public double getProgress() {
        long j = this.amountWritten;
        if (j > 0) {
            long j2 = this.fileSize;
            if (j2 > 0) {
                double d = (double) j;
                double d2 = (double) j2;
                Double.isNaN(d);
                Double.isNaN(d2);
                return d / d2;
            }
        }
        return 0.0d;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStreamID() {
        return this.streamID;
    }

    public boolean isDone() {
        Status status2 = this.status;
        return status2 == Status.cancelled || status2 == Status.error || status2 == Status.complete || status2 == Status.refused;
    }

    /* access modifiers changed from: protected */
    public void setError(Error error2) {
        this.error = error2;
    }

    /* access modifiers changed from: protected */
    public void setException(Exception exc) {
        this.exception = exc;
    }

    /* access modifiers changed from: protected */
    public void setFileInfo(String str, long j) {
        this.fileName = str;
        this.fileSize = j;
    }

    /* access modifiers changed from: protected */
    public void setStatus(Status status2) {
        synchronized (this.statusMonitor) {
            this.status = status2;
        }
    }

    /* access modifiers changed from: protected */
    public boolean updateStatus(Status status2, Status status3) {
        synchronized (this.statusMonitor) {
            if (status2 != this.status) {
                return false;
            }
            this.status = status3;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void writeToStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        this.amountWritten = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0 && !getStatus().equals(Status.cancelled)) {
                outputStream.write(bArr, 0, read);
                this.amountWritten += (long) read;
            }
        }
        if (!getStatus().equals(Status.cancelled) && getError() == Error.none && this.amountWritten != this.fileSize) {
            setStatus(Status.error);
            this.error = Error.connection;
        }
    }

    /* access modifiers changed from: protected */
    public void setFileInfo(String str, String str2, long j) {
        this.filePath = str;
        this.fileName = str2;
        this.fileSize = j;
    }
}
