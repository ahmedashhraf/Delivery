package org.jcodec.movtool.streaming.tracks;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;

public class CachingTrack implements VirtualTrack {
    /* access modifiers changed from: private */
    public List<CachingPacket> cachedPackets = Collections.synchronizedList(new ArrayList());
    private ScheduledFuture<?> policyFuture;
    private VirtualTrack src;

    public class CachingPacket extends VirtualPacketWrapper {
        private ByteBuffer cache;

        public CachingPacket(VirtualPacket virtualPacket) {
            super(virtualPacket);
        }

        public synchronized ByteBuffer getData() throws IOException {
            CachingTrack.this.cachedPackets.remove(this);
            if (this.cache == null) {
                this.cache = this.src.getData();
            }
            CachingTrack.this.cachedPackets.add(this);
            return this.cache == null ? null : this.cache.duplicate();
        }

        public synchronized void wipe() {
            if (CachingTrack.this.cachedPackets.indexOf(this) == 0) {
                CachingTrack.this.cachedPackets.remove(0);
                this.cache = null;
            }
        }
    }

    /* renamed from: org.jcodec.movtool.streaming.tracks.CachingTrack$a */
    class C15578a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f44917a;

        C15578a(int i) {
            this.f44917a = i;
        }

        public void run() {
            while (CachingTrack.this.cachedPackets.size() > this.f44917a) {
                ((CachingPacket) CachingTrack.this.cachedPackets.get(0)).wipe();
            }
        }
    }

    public CachingTrack(VirtualTrack virtualTrack, int i, ScheduledExecutorService scheduledExecutorService) {
        if (i >= 1) {
            this.src = virtualTrack;
            this.policyFuture = scheduledExecutorService.scheduleAtFixedRate(new C15578a(i), 200, 200, TimeUnit.MILLISECONDS);
            return;
        }
        throw new IllegalArgumentException("Caching track with less then 1 entry.");
    }

    public void close() throws IOException {
        ScheduledFuture<?> scheduledFuture = this.policyFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.cachedPackets.clear();
        this.src.close();
    }

    public CodecMeta getCodecMeta() {
        return this.src.getCodecMeta();
    }

    public VirtualEdit[] getEdits() {
        return this.src.getEdits();
    }

    public int getPreferredTimescale() {
        return this.src.getPreferredTimescale();
    }

    public VirtualPacket nextPacket() throws IOException {
        VirtualPacket nextPacket = this.src.nextPacket();
        if (nextPacket == null) {
            return null;
        }
        return new CachingPacket(nextPacket);
    }
}
