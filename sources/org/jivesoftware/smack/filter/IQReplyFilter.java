package org.jivesoftware.smack.filter;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Stanza;
import p205i.p486d.p487a.C14055b;

public class IQReplyFilter implements StanzaFilter {
    private static final Logger LOGGER = Logger.getLogger(IQReplyFilter.class.getName());
    private final OrFilter fromFilter;
    private final StanzaFilter iqAndIdFilter;
    private final String local;
    private final String packetId;
    private final String server;

    /* renamed from: to */
    private final String f44974to;

    public IQReplyFilter(C15617IQ iq, XMPPConnection xMPPConnection) {
        if (iq.isRequestIQ()) {
            if (iq.getTo() != null) {
                this.f44974to = iq.getTo().toLowerCase(Locale.US);
            } else {
                this.f44974to = null;
            }
            String user = xMPPConnection.getUser();
            if (user != null) {
                this.local = user.toLowerCase(Locale.US);
                this.server = xMPPConnection.getServiceName().toLowerCase(Locale.US);
                this.packetId = iq.getStanzaId();
                this.iqAndIdFilter = new AndFilter(new OrFilter(IQTypeFilter.ERROR, IQTypeFilter.RESULT), new StanzaIdFilter((Stanza) iq));
                this.fromFilter = new OrFilter();
                this.fromFilter.addFilter(FromMatchesFilter.createFull(this.f44974to));
                String str = this.f44974to;
                if (str == null) {
                    this.fromFilter.addFilter(FromMatchesFilter.createBare(this.local));
                    this.fromFilter.addFilter(FromMatchesFilter.createFull(this.server));
                } else if (str.equals(C14055b.m60645e(this.local))) {
                    this.fromFilter.addFilter(FromMatchesFilter.createFull(null));
                }
            } else {
                throw new IllegalArgumentException("Must have a local (user) JID set. Either you didn't configure one or you where not connected at least once");
            }
        } else {
            throw new IllegalArgumentException("IQ must be a request IQ, i.e. of type 'get' or 'set'.");
        }
    }

    public boolean accept(Stanza stanza) {
        if (!this.iqAndIdFilter.accept(stanza)) {
            return false;
        }
        if (this.fromFilter.accept(stanza)) {
            return true;
        }
        LOGGER.log(Level.WARNING, String.format("Rejected potentially spoofed reply to IQ-packet. Filter settings: packetId=%s, to=%s, local=%s, server=%s. Received packet with from=%s", new Object[]{this.packetId, this.f44974to, this.local, this.server, stanza.getFrom()}), stanza);
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": iqAndIdFilter (");
        sb.append(this.iqAndIdFilter.toString());
        sb.append("), ");
        sb.append(": fromFilter (");
        sb.append(this.fromFilter.toString());
        sb.append(')');
        return sb.toString();
    }
}
