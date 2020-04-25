package org.jivesoftware.smackx.bytestreams.ibb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.bytestreams.BytestreamSession;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Data;
import org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;

public class InBandBytestreamSession implements BytestreamSession {
    /* access modifiers changed from: private */
    public final Open byteStreamRequest;
    private boolean closeBothStreamsEnabled = false;
    /* access modifiers changed from: private */
    public final XMPPConnection connection;
    private IBBInputStream inputStream;
    private boolean isClosed = false;
    private IBBOutputStream outputStream;
    /* access modifiers changed from: private */
    public String remoteJID;

    /* renamed from: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$1 */
    static /* synthetic */ class C156501 {

        /* renamed from: $SwitchMap$org$jivesoftware$smackx$bytestreams$ibb$InBandBytestreamManager$StanzaType */
        static final /* synthetic */ int[] f44997xda8e09c8 = new int[StanzaType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager$StanzaType[] r0 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44997xda8e09c8 = r0
                int[] r0 = f44997xda8e09c8     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager$StanzaType r1 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType.IQ     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44997xda8e09c8     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager$StanzaType r1 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.C156501.<clinit>():void");
        }
    }

    private class IBBDataPacketFilter implements StanzaFilter {
        private IBBDataPacketFilter() {
        }

        public boolean accept(Stanza stanza) {
            DataPacketExtension dataPacketExtension;
            if (!stanza.getFrom().equalsIgnoreCase(InBandBytestreamSession.this.remoteJID)) {
                return false;
            }
            if (stanza instanceof Data) {
                dataPacketExtension = ((Data) stanza).getDataPacketExtension();
            } else {
                dataPacketExtension = (DataPacketExtension) stanza.getExtension("data", "http://jabber.org/protocol/ibb");
                if (dataPacketExtension == null) {
                    return false;
                }
            }
            if (!dataPacketExtension.getSessionID().equals(InBandBytestreamSession.this.byteStreamRequest.getSessionID())) {
                return false;
            }
            return true;
        }

        /* synthetic */ IBBDataPacketFilter(InBandBytestreamSession inBandBytestreamSession, C156501 r2) {
            this();
        }
    }

    private abstract class IBBInputStream extends InputStream {
        private byte[] buffer;
        private int bufferPointer = -1;
        private boolean closeInvoked = false;
        /* access modifiers changed from: private */
        public final StanzaListener dataPacketListener = getDataPacketListener();
        protected final BlockingQueue<DataPacketExtension> dataQueue = new LinkedBlockingQueue();
        /* access modifiers changed from: private */
        public boolean isClosed = false;
        /* access modifiers changed from: private */
        public int readTimeout = 0;
        private long seq = -1;

        public IBBInputStream() {
            InBandBytestreamSession.this.connection.addSyncStanzaListener(this.dataPacketListener, getDataPacketFilter());
        }

        private void checkClosed() throws IOException {
            if (this.closeInvoked) {
                this.dataQueue.clear();
                throw new IOException("Stream is closed");
            }
        }

        /* access modifiers changed from: private */
        public void cleanup() {
            InBandBytestreamSession.this.connection.removeSyncStanzaListener(this.dataPacketListener);
        }

        /* access modifiers changed from: private */
        public void closeInternal() {
            if (!this.isClosed) {
                this.isClosed = true;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:33|34|35|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
            return false;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0070 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0070=Splitter:B:33:0x0070, B:16:0x0033=Splitter:B:16:0x0033} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized boolean loadBuffer() throws java.io.IOException {
            /*
                r9 = this;
                monitor-enter(r9)
                r0 = 0
                r1 = 0
                int r2 = r9.readTimeout     // Catch:{ InterruptedException -> 0x0070 }
                if (r2 != 0) goto L_0x0024
            L_0x0007:
                if (r0 != 0) goto L_0x0033
                boolean r0 = r9.isClosed     // Catch:{ InterruptedException -> 0x0070 }
                if (r0 == 0) goto L_0x0017
                java.util.concurrent.BlockingQueue<org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension> r0 = r9.dataQueue     // Catch:{ InterruptedException -> 0x0070 }
                boolean r0 = r0.isEmpty()     // Catch:{ InterruptedException -> 0x0070 }
                if (r0 == 0) goto L_0x0017
                monitor-exit(r9)
                return r1
            L_0x0017:
                java.util.concurrent.BlockingQueue<org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension> r0 = r9.dataQueue     // Catch:{ InterruptedException -> 0x0070 }
                r2 = 1000(0x3e8, double:4.94E-321)
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0070 }
                java.lang.Object r0 = r0.poll(r2, r4)     // Catch:{ InterruptedException -> 0x0070 }
                org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension r0 = (org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension) r0     // Catch:{ InterruptedException -> 0x0070 }
                goto L_0x0007
            L_0x0024:
                java.util.concurrent.BlockingQueue<org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension> r0 = r9.dataQueue     // Catch:{ InterruptedException -> 0x0070 }
                int r2 = r9.readTimeout     // Catch:{ InterruptedException -> 0x0070 }
                long r2 = (long) r2     // Catch:{ InterruptedException -> 0x0070 }
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0070 }
                java.lang.Object r0 = r0.poll(r2, r4)     // Catch:{ InterruptedException -> 0x0070 }
                org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension r0 = (org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension) r0     // Catch:{ InterruptedException -> 0x0070 }
                if (r0 == 0) goto L_0x0068
            L_0x0033:
                long r2 = r9.seq     // Catch:{ all -> 0x006e }
                r4 = 65535(0xffff, double:3.23786E-319)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0040
                r2 = -1
                r9.seq = r2     // Catch:{ all -> 0x006e }
            L_0x0040:
                long r2 = r0.getSeq()     // Catch:{ all -> 0x006e }
                r4 = 1
                long r4 = r2 - r4
                long r6 = r9.seq     // Catch:{ all -> 0x006e }
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x005b
                r9.seq = r2     // Catch:{ all -> 0x006e }
                byte[] r0 = r0.getDecodedData()     // Catch:{ all -> 0x006e }
                r9.buffer = r0     // Catch:{ all -> 0x006e }
                r9.bufferPointer = r1     // Catch:{ all -> 0x006e }
                r0 = 1
                monitor-exit(r9)
                return r0
            L_0x005b:
                org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession r0 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.this     // Catch:{ all -> 0x006e }
                r0.close()     // Catch:{ all -> 0x006e }
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x006e }
                java.lang.String r1 = "Packets out of sequence"
                r0.<init>(r1)     // Catch:{ all -> 0x006e }
                throw r0     // Catch:{ all -> 0x006e }
            L_0x0068:
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ InterruptedException -> 0x0070 }
                r0.<init>()     // Catch:{ InterruptedException -> 0x0070 }
                throw r0     // Catch:{ InterruptedException -> 0x0070 }
            L_0x006e:
                r0 = move-exception
                goto L_0x0079
            L_0x0070:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006e }
                r0.interrupt()     // Catch:{ all -> 0x006e }
                monitor-exit(r9)
                return r1
            L_0x0079:
                monitor-exit(r9)
                goto L_0x007c
            L_0x007b:
                throw r0
            L_0x007c:
                goto L_0x007b
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.IBBInputStream.loadBuffer():boolean");
        }

        public void close() throws IOException {
            if (!this.closeInvoked) {
                this.closeInvoked = true;
                InBandBytestreamSession.this.closeByLocal(true);
            }
        }

        /* access modifiers changed from: protected */
        public abstract StanzaFilter getDataPacketFilter();

        /* access modifiers changed from: protected */
        public abstract StanzaListener getDataPacketListener();

        public boolean markSupported() {
            return false;
        }

        public synchronized int read() throws IOException {
            checkClosed();
            if ((this.bufferPointer == -1 || this.bufferPointer >= this.buffer.length) && !loadBuffer()) {
                return -1;
            }
            byte[] bArr = this.buffer;
            int i = this.bufferPointer;
            this.bufferPointer = i + 1;
            return bArr[i] & 255;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0044=Splitter:B:30:0x0044, B:23:0x002d=Splitter:B:23:0x002d} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            /*
                r3 = this;
                monitor-enter(r3)
                if (r4 == 0) goto L_0x004a
                if (r5 < 0) goto L_0x0044
                int r0 = r4.length     // Catch:{ all -> 0x0050 }
                if (r5 > r0) goto L_0x0044
                if (r6 < 0) goto L_0x0044
                int r0 = r5 + r6
                int r1 = r4.length     // Catch:{ all -> 0x0050 }
                if (r0 > r1) goto L_0x0044
                if (r0 < 0) goto L_0x0044
                if (r6 != 0) goto L_0x0016
                r4 = 0
                monitor-exit(r3)
                return r4
            L_0x0016:
                r3.checkClosed()     // Catch:{ all -> 0x0050 }
                int r0 = r3.bufferPointer     // Catch:{ all -> 0x0050 }
                r1 = -1
                if (r0 == r1) goto L_0x0025
                int r0 = r3.bufferPointer     // Catch:{ all -> 0x0050 }
                byte[] r2 = r3.buffer     // Catch:{ all -> 0x0050 }
                int r2 = r2.length     // Catch:{ all -> 0x0050 }
                if (r0 < r2) goto L_0x002d
            L_0x0025:
                boolean r0 = r3.loadBuffer()     // Catch:{ all -> 0x0050 }
                if (r0 != 0) goto L_0x002d
                monitor-exit(r3)
                return r1
            L_0x002d:
                byte[] r0 = r3.buffer     // Catch:{ all -> 0x0050 }
                int r0 = r0.length     // Catch:{ all -> 0x0050 }
                int r1 = r3.bufferPointer     // Catch:{ all -> 0x0050 }
                int r0 = r0 - r1
                if (r6 <= r0) goto L_0x0036
                r6 = r0
            L_0x0036:
                byte[] r0 = r3.buffer     // Catch:{ all -> 0x0050 }
                int r1 = r3.bufferPointer     // Catch:{ all -> 0x0050 }
                java.lang.System.arraycopy(r0, r1, r4, r5, r6)     // Catch:{ all -> 0x0050 }
                int r4 = r3.bufferPointer     // Catch:{ all -> 0x0050 }
                int r4 = r4 + r6
                r3.bufferPointer = r4     // Catch:{ all -> 0x0050 }
                monitor-exit(r3)
                return r6
            L_0x0044:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0050 }
                r4.<init>()     // Catch:{ all -> 0x0050 }
                throw r4     // Catch:{ all -> 0x0050 }
            L_0x004a:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0050 }
                r4.<init>()     // Catch:{ all -> 0x0050 }
                throw r4     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.IBBInputStream.read(byte[], int, int):int");
        }

        public synchronized int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }
    }

    private abstract class IBBOutputStream extends OutputStream {
        protected final byte[] buffer;
        protected int bufferPointer = 0;
        protected boolean isClosed = false;
        protected long seq = 0;

        public IBBOutputStream() {
            this.buffer = new byte[InBandBytestreamSession.this.byteStreamRequest.getBlockSize()];
        }

        private synchronized void flushBuffer() throws IOException {
            if (this.bufferPointer != 0) {
                try {
                    writeToXML(new DataPacketExtension(InBandBytestreamSession.this.byteStreamRequest.getSessionID(), this.seq, Base64.encodeToString(this.buffer, 0, this.bufferPointer)));
                    this.bufferPointer = 0;
                    this.seq = this.seq + 1 == 65535 ? 0 : this.seq + 1;
                } catch (NotConnectedException e) {
                    IOException iOException = new IOException();
                    iOException.initCause(e);
                    throw iOException;
                }
            }
        }

        private synchronized void writeOut(byte[] bArr, int i, int i2) throws IOException {
            if (!this.isClosed) {
                int i3 = 0;
                if (i2 > this.buffer.length - this.bufferPointer) {
                    i3 = this.buffer.length - this.bufferPointer;
                    System.arraycopy(bArr, i, this.buffer, this.bufferPointer, i3);
                    this.bufferPointer += i3;
                    flushBuffer();
                }
                int i4 = i2 - i3;
                System.arraycopy(bArr, i + i3, this.buffer, this.bufferPointer, i4);
                this.bufferPointer += i4;
            } else {
                throw new IOException("Stream is closed");
            }
        }

        public void close() throws IOException {
            if (!this.isClosed) {
                InBandBytestreamSession.this.closeByLocal(false);
            }
        }

        /* access modifiers changed from: protected */
        public void closeInternal(boolean z) {
            if (!this.isClosed) {
                this.isClosed = true;
                if (z) {
                    try {
                        flushBuffer();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.isClosed) {
                flushBuffer();
            } else {
                throw new IOException("Stream is closed");
            }
        }

        public synchronized void write(int i) throws IOException {
            if (!this.isClosed) {
                if (this.bufferPointer >= this.buffer.length) {
                    flushBuffer();
                }
                byte[] bArr = this.buffer;
                int i2 = this.bufferPointer;
                this.bufferPointer = i2 + 1;
                bArr[i2] = (byte) i;
            } else {
                throw new IOException("Stream is closed");
            }
        }

        /* access modifiers changed from: protected */
        public abstract void writeToXML(DataPacketExtension dataPacketExtension) throws IOException, NotConnectedException;

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            /*
                r2 = this;
                monitor-enter(r2)
                if (r3 == 0) goto L_0x0043
                if (r4 < 0) goto L_0x003d
                int r0 = r3.length     // Catch:{ all -> 0x0049 }
                if (r4 > r0) goto L_0x003d
                if (r5 < 0) goto L_0x003d
                int r0 = r4 + r5
                int r1 = r3.length     // Catch:{ all -> 0x0049 }
                if (r0 > r1) goto L_0x003d
                if (r0 < 0) goto L_0x003d
                if (r5 != 0) goto L_0x0015
                monitor-exit(r2)
                return
            L_0x0015:
                boolean r0 = r2.isClosed     // Catch:{ all -> 0x0049 }
                if (r0 != 0) goto L_0x0035
                byte[] r0 = r2.buffer     // Catch:{ all -> 0x0049 }
                int r0 = r0.length     // Catch:{ all -> 0x0049 }
                if (r5 < r0) goto L_0x0030
                byte[] r0 = r2.buffer     // Catch:{ all -> 0x0049 }
                int r0 = r0.length     // Catch:{ all -> 0x0049 }
                r2.writeOut(r3, r4, r0)     // Catch:{ all -> 0x0049 }
                byte[] r0 = r2.buffer     // Catch:{ all -> 0x0049 }
                int r0 = r0.length     // Catch:{ all -> 0x0049 }
                int r4 = r4 + r0
                byte[] r0 = r2.buffer     // Catch:{ all -> 0x0049 }
                int r0 = r0.length     // Catch:{ all -> 0x0049 }
                int r5 = r5 - r0
                r2.write(r3, r4, r5)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0030:
                r2.writeOut(r3, r4, r5)     // Catch:{ all -> 0x0049 }
            L_0x0033:
                monitor-exit(r2)
                return
            L_0x0035:
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0049 }
                java.lang.String r4 = "Stream is closed"
                r3.<init>(r4)     // Catch:{ all -> 0x0049 }
                throw r3     // Catch:{ all -> 0x0049 }
            L_0x003d:
                java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0049 }
                r3.<init>()     // Catch:{ all -> 0x0049 }
                throw r3     // Catch:{ all -> 0x0049 }
            L_0x0043:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ all -> 0x0049 }
                r3.<init>()     // Catch:{ all -> 0x0049 }
                throw r3     // Catch:{ all -> 0x0049 }
            L_0x0049:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.IBBOutputStream.write(byte[], int, int):void");
        }

        public synchronized void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }
    }

    private class IQIBBInputStream extends IBBInputStream {
        private IQIBBInputStream() {
            super();
        }

        /* access modifiers changed from: protected */
        public StanzaFilter getDataPacketFilter() {
            return new AndFilter(new StanzaTypeFilter(Data.class), new IBBDataPacketFilter(InBandBytestreamSession.this, null));
        }

        /* access modifiers changed from: protected */
        public StanzaListener getDataPacketListener() {
            return new StanzaListener() {
                private long lastSequence = -1;

                public void processPacket(Stanza stanza) throws NotConnectedException {
                    DataPacketExtension dataPacketExtension = ((Data) stanza).getDataPacketExtension();
                    if (dataPacketExtension.getSeq() <= this.lastSequence) {
                        InBandBytestreamSession.this.connection.sendStanza(C15617IQ.createErrorResponse((C15617IQ) stanza, new XMPPError(Condition.unexpected_request)));
                    } else if (dataPacketExtension.getDecodedData() == null) {
                        InBandBytestreamSession.this.connection.sendStanza(C15617IQ.createErrorResponse((C15617IQ) stanza, new XMPPError(Condition.bad_request)));
                    } else {
                        IQIBBInputStream.this.dataQueue.offer(dataPacketExtension);
                        InBandBytestreamSession.this.connection.sendStanza(C15617IQ.createResultIQ((C15617IQ) stanza));
                        this.lastSequence = dataPacketExtension.getSeq();
                        if (this.lastSequence == 65535) {
                            this.lastSequence = -1;
                        }
                    }
                }
            };
        }

        /* synthetic */ IQIBBInputStream(InBandBytestreamSession inBandBytestreamSession, C156501 r2) {
            this();
        }
    }

    private class IQIBBOutputStream extends IBBOutputStream {
        private IQIBBOutputStream() {
            super();
        }

        /* access modifiers changed from: protected */
        public synchronized void writeToXML(DataPacketExtension dataPacketExtension) throws IOException {
            Data data = new Data(dataPacketExtension);
            data.setTo(InBandBytestreamSession.this.remoteJID);
            try {
                InBandBytestreamSession.this.connection.createPacketCollectorAndSend(data).nextResultOrThrow();
            } catch (Exception e) {
                if (!this.isClosed) {
                    InBandBytestreamSession.this.close();
                    IOException iOException = new IOException();
                    iOException.initCause(e);
                    throw iOException;
                }
            }
        }

        /* synthetic */ IQIBBOutputStream(InBandBytestreamSession inBandBytestreamSession, C156501 r2) {
            this();
        }
    }

    private class MessageIBBInputStream extends IBBInputStream {
        private MessageIBBInputStream() {
            super();
        }

        /* access modifiers changed from: protected */
        public StanzaFilter getDataPacketFilter() {
            return new AndFilter(new StanzaTypeFilter(Message.class), new IBBDataPacketFilter(InBandBytestreamSession.this, null));
        }

        /* access modifiers changed from: protected */
        public StanzaListener getDataPacketListener() {
            return new StanzaListener() {
                public void processPacket(Stanza stanza) {
                    DataPacketExtension dataPacketExtension = (DataPacketExtension) stanza.getExtension("data", "http://jabber.org/protocol/ibb");
                    if (dataPacketExtension.getDecodedData() != null) {
                        MessageIBBInputStream.this.dataQueue.offer(dataPacketExtension);
                    }
                }
            };
        }

        /* synthetic */ MessageIBBInputStream(InBandBytestreamSession inBandBytestreamSession, C156501 r2) {
            this();
        }
    }

    private class MessageIBBOutputStream extends IBBOutputStream {
        private MessageIBBOutputStream() {
            super();
        }

        /* access modifiers changed from: protected */
        public synchronized void writeToXML(DataPacketExtension dataPacketExtension) throws NotConnectedException {
            Message message = new Message(InBandBytestreamSession.this.remoteJID);
            message.addExtension(dataPacketExtension);
            InBandBytestreamSession.this.connection.sendStanza(message);
        }

        /* synthetic */ MessageIBBOutputStream(InBandBytestreamSession inBandBytestreamSession, C156501 r2) {
            this();
        }
    }

    protected InBandBytestreamSession(XMPPConnection xMPPConnection, Open open, String str) {
        this.connection = xMPPConnection;
        this.byteStreamRequest = open;
        this.remoteJID = str;
        int i = C156501.f44997xda8e09c8[open.getStanza().ordinal()];
        if (i == 1) {
            this.inputStream = new IQIBBInputStream(this, null);
            this.outputStream = new IQIBBOutputStream(this, null);
        } else if (i == 2) {
            this.inputStream = new MessageIBBInputStream(this, null);
            this.outputStream = new MessageIBBOutputStream(this, null);
        }
    }

    public void close() throws IOException {
        closeByLocal(true);
        closeByLocal(false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void closeByLocal(boolean r3) throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isClosed     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            boolean r0 = r2.closeBothStreamsEnabled     // Catch:{ all -> 0x006c }
            r1 = 1
            if (r0 == 0) goto L_0x0017
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBInputStream r3 = r2.inputStream     // Catch:{ all -> 0x006c }
            r3.closeInternal()     // Catch:{ all -> 0x006c }
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBOutputStream r3 = r2.outputStream     // Catch:{ all -> 0x006c }
            r3.closeInternal(r1)     // Catch:{ all -> 0x006c }
            goto L_0x0024
        L_0x0017:
            if (r3 == 0) goto L_0x001f
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBInputStream r3 = r2.inputStream     // Catch:{ all -> 0x006c }
            r3.closeInternal()     // Catch:{ all -> 0x006c }
            goto L_0x0024
        L_0x001f:
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBOutputStream r3 = r2.outputStream     // Catch:{ all -> 0x006c }
            r3.closeInternal(r1)     // Catch:{ all -> 0x006c }
        L_0x0024:
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBInputStream r3 = r2.inputStream     // Catch:{ all -> 0x006c }
            boolean r3 = r3.isClosed     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x006a
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBOutputStream r3 = r2.outputStream     // Catch:{ all -> 0x006c }
            boolean r3 = r3.isClosed     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x006a
            r2.isClosed = r1     // Catch:{ all -> 0x006c }
            org.jivesoftware.smackx.bytestreams.ibb.packet.Close r3 = new org.jivesoftware.smackx.bytestreams.ibb.packet.Close     // Catch:{ all -> 0x006c }
            org.jivesoftware.smackx.bytestreams.ibb.packet.Open r0 = r2.byteStreamRequest     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r0.getSessionID()     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r2.remoteJID     // Catch:{ all -> 0x006c }
            r3.setTo(r0)     // Catch:{ all -> 0x006c }
            org.jivesoftware.smack.XMPPConnection r0 = r2.connection     // Catch:{ Exception -> 0x0060 }
            org.jivesoftware.smack.PacketCollector r3 = r0.createPacketCollectorAndSend(r3)     // Catch:{ Exception -> 0x0060 }
            r3.nextResultOrThrow()     // Catch:{ Exception -> 0x0060 }
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession$IBBInputStream r3 = r2.inputStream     // Catch:{ all -> 0x006c }
            r3.cleanup()     // Catch:{ all -> 0x006c }
            org.jivesoftware.smack.XMPPConnection r3 = r2.connection     // Catch:{ all -> 0x006c }
            org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager r3 = org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.getByteStreamManager(r3)     // Catch:{ all -> 0x006c }
            java.util.Map r3 = r3.getSessions()     // Catch:{ all -> 0x006c }
            r3.remove(r2)     // Catch:{ all -> 0x006c }
            goto L_0x006a
        L_0x0060:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x006c }
            r0.<init>()     // Catch:{ all -> 0x006c }
            r0.initCause(r3)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r2)
            return
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamSession.closeByLocal(boolean):void");
    }

    /* access modifiers changed from: protected */
    public void closeByPeer(Close close) throws NotConnectedException {
        this.inputStream.closeInternal();
        this.inputStream.cleanup();
        this.outputStream.closeInternal(false);
        this.connection.sendStanza(C15617IQ.createResultIQ(close));
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public int getReadTimeout() {
        return this.inputStream.readTimeout;
    }

    public boolean isCloseBothStreamsEnabled() {
        return this.closeBothStreamsEnabled;
    }

    public void processIQPacket(Data data) throws NotConnectedException {
        this.inputStream.dataPacketListener.processPacket(data);
    }

    public void setCloseBothStreamsEnabled(boolean z) {
        this.closeBothStreamsEnabled = z;
    }

    public void setReadTimeout(int i) {
        if (i >= 0) {
            this.inputStream.readTimeout = i;
            return;
        }
        throw new IllegalArgumentException("Timeout must be >= 0");
    }
}
