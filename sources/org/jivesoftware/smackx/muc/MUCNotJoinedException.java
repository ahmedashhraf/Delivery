package org.jivesoftware.smackx.muc;

import org.jivesoftware.smack.SmackException;

public class MUCNotJoinedException extends SmackException {
    private static final long serialVersionUID = -5204934585663465576L;

    public MUCNotJoinedException(MultiUserChat multiUserChat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Client not currently joined ");
        sb.append(multiUserChat.getRoom());
        super(sb.toString());
    }
}
