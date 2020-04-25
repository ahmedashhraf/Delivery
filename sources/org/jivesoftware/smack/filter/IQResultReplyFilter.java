package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Stanza;

public class IQResultReplyFilter extends IQReplyFilter {
    public IQResultReplyFilter(C15617IQ iq, XMPPConnection xMPPConnection) {
        super(iq, xMPPConnection);
    }

    public boolean accept(Stanza stanza) {
        if (!super.accept(stanza)) {
            return false;
        }
        return IQTypeFilter.RESULT.accept(stanza);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IQResultReplyFilter.class.getSimpleName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" (");
        sb2.append(super.toString());
        sb2.append(')');
        sb.append(sb2.toString());
        return sb.toString();
    }
}
