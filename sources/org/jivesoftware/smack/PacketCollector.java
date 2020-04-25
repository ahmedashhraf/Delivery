package org.jivesoftware.smack;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

public class PacketCollector {
    private static final Logger LOGGER = Logger.getLogger(PacketCollector.class.getName());
    private boolean cancelled = false;
    private final PacketCollector collectorToReset;
    private final XMPPConnection connection;
    private final StanzaFilter packetFilter;
    private final ArrayBlockingQueue<Stanza> resultQueue;
    private volatile long waitStart;

    public static class Configuration {
        /* access modifiers changed from: private */
        public PacketCollector collectorToReset;
        /* access modifiers changed from: private */
        public StanzaFilter packetFilter;
        /* access modifiers changed from: private */
        public int size;

        public Configuration setCollectorToReset(PacketCollector packetCollector) {
            this.collectorToReset = packetCollector;
            return this;
        }

        @Deprecated
        public Configuration setPacketFilter(StanzaFilter stanzaFilter) {
            return setStanzaFilter(stanzaFilter);
        }

        public Configuration setSize(int i) {
            this.size = i;
            return this;
        }

        public Configuration setStanzaFilter(StanzaFilter stanzaFilter) {
            this.packetFilter = stanzaFilter;
            return this;
        }

        private Configuration() {
            this.size = SmackConfiguration.getPacketCollectorSize();
        }
    }

    protected PacketCollector(XMPPConnection xMPPConnection, Configuration configuration) {
        this.connection = xMPPConnection;
        this.packetFilter = configuration.packetFilter;
        this.resultQueue = new ArrayBlockingQueue<>(configuration.size);
        this.collectorToReset = configuration.collectorToReset;
    }

    public static Configuration newConfiguration() {
        return new Configuration();
    }

    private final void throwIfCancelled() {
        if (this.cancelled) {
            throw new IllegalStateException("Packet collector already cancelled");
        }
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.connection.removePacketCollector(this);
        }
    }

    public int getCollectedCount() {
        return this.resultQueue.size();
    }

    @Deprecated
    public StanzaFilter getPacketFilter() {
        return getStanzaFilter();
    }

    public StanzaFilter getStanzaFilter() {
        return this.packetFilter;
    }

    public <P extends Stanza> P nextResult() {
        return nextResult(this.connection.getPacketReplyTimeout());
    }

    public <P extends Stanza> P nextResultBlockForever() {
        throwIfCancelled();
        P p = null;
        while (p == null) {
            try {
                p = (Stanza) this.resultQueue.take();
            } catch (InterruptedException e) {
                LOGGER.log(Level.FINE, "nextResultBlockForever was interrupted", e);
            }
        }
        return p;
    }

    public <P extends Stanza> P nextResultOrThrow() throws NoResponseException, XMPPErrorException {
        return nextResultOrThrow(this.connection.getPacketReplyTimeout());
    }

    public <P extends Stanza> P pollResult() {
        return (Stanza) this.resultQueue.poll();
    }

    public <P extends Stanza> P pollResultOrThrow() throws XMPPErrorException {
        P pollResult = pollResult();
        if (pollResult != null) {
            XMPPErrorException.ifHasErrorThenThrow(pollResult);
        }
        return pollResult;
    }

    /* access modifiers changed from: protected */
    public void processPacket(Stanza stanza) {
        StanzaFilter stanzaFilter = this.packetFilter;
        if (stanzaFilter == null || stanzaFilter.accept(stanza)) {
            while (!this.resultQueue.offer(stanza)) {
                this.resultQueue.poll();
            }
            PacketCollector packetCollector = this.collectorToReset;
            if (packetCollector != null) {
                packetCollector.waitStart = System.currentTimeMillis();
            }
        }
    }

    public <P extends Stanza> P nextResult(long j) {
        throwIfCancelled();
        this.waitStart = System.currentTimeMillis();
        long j2 = j;
        P p = null;
        do {
            try {
                p = (Stanza) this.resultQueue.poll(j2, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                LOGGER.log(Level.FINE, "nextResult was interrupted", e);
            }
            if (p != null) {
                return p;
            }
            j2 = j - (System.currentTimeMillis() - this.waitStart);
        } while (j2 > 0);
        return null;
    }

    public <P extends Stanza> P nextResultOrThrow(long j) throws NoResponseException, XMPPErrorException {
        P nextResult = nextResult(j);
        cancel();
        if (nextResult != null) {
            XMPPErrorException.ifHasErrorThenThrow(nextResult);
            return nextResult;
        }
        throw NoResponseException.newWith(this.connection, this);
    }
}
