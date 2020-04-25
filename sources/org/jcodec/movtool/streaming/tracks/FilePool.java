package org.jcodec.movtool.streaming.tracks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;

public class FilePool implements ByteChannelPool {
    private List<SeekableByteChannel> allChannels = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public BlockingQueue<SeekableByteChannel> channels;
    private File file;
    private int max;

    public class PoolChannel extends SeekableByteChannelWrapper {
        public PoolChannel(SeekableByteChannel seekableByteChannel) throws IOException {
            super(seekableByteChannel);
            seekableByteChannel.position(0);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:1|2|4|3) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:2:?, LOOP_START, SYNTHETIC, Splitter:B:1:0x0005] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r2 = this;
                org.jcodec.common.SeekableByteChannel r0 = r2.src
                r1 = 0
                r2.src = r1
            L_0x0005:
                org.jcodec.movtool.streaming.tracks.FilePool r1 = org.jcodec.movtool.streaming.tracks.FilePool.this     // Catch:{ InterruptedException -> 0x0005 }
                java.util.concurrent.BlockingQueue r1 = r1.channels     // Catch:{ InterruptedException -> 0x0005 }
                r1.put(r0)     // Catch:{ InterruptedException -> 0x0005 }
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.FilePool.PoolChannel.close():void");
        }

        public boolean isOpen() {
            return this.src != null;
        }
    }

    public FilePool(File file2, int i) {
        this.file = file2;
        this.max = i;
        this.channels = new LinkedBlockingQueue();
    }

    public void close() {
        while (!this.allChannels.isEmpty()) {
            SeekableByteChannel seekableByteChannel = (SeekableByteChannel) this.allChannels.remove(0);
            if (seekableByteChannel != null) {
                try {
                    seekableByteChannel.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0020 A[LOOP:0: B:5:0x0020->B:6:?, LOOP_START, SYNTHETIC, Splitter:B:5:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jcodec.common.SeekableByteChannel getChannel() throws java.io.IOException {
        /*
            r2 = this;
            java.util.concurrent.BlockingQueue<org.jcodec.common.SeekableByteChannel> r0 = r2.channels
            java.lang.Object r0 = r0.poll()
            org.jcodec.common.SeekableByteChannel r0 = (org.jcodec.common.SeekableByteChannel) r0
            if (r0 != 0) goto L_0x0028
            java.util.List<org.jcodec.common.SeekableByteChannel> r0 = r2.allChannels
            int r0 = r0.size()
            int r1 = r2.max
            if (r0 >= r1) goto L_0x0020
            java.io.File r0 = r2.file
            org.jcodec.common.SeekableByteChannel r0 = r2.newChannel(r0)
            java.util.List<org.jcodec.common.SeekableByteChannel> r1 = r2.allChannels
            r1.add(r0)
            goto L_0x0028
        L_0x0020:
            java.util.concurrent.BlockingQueue<org.jcodec.common.SeekableByteChannel> r0 = r2.channels     // Catch:{ InterruptedException -> 0x0020 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x0020 }
            org.jcodec.common.SeekableByteChannel r0 = (org.jcodec.common.SeekableByteChannel) r0     // Catch:{ InterruptedException -> 0x0020 }
        L_0x0028:
            org.jcodec.movtool.streaming.tracks.FilePool$PoolChannel r1 = new org.jcodec.movtool.streaming.tracks.FilePool$PoolChannel
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.FilePool.getChannel():org.jcodec.common.SeekableByteChannel");
    }

    /* access modifiers changed from: protected */
    public SeekableByteChannel newChannel(File file2) throws FileNotFoundException {
        return NIOUtils.readableFileChannel(file2);
    }
}
