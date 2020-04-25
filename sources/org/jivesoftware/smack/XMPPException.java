package org.jivesoftware.smack;

import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StreamError;
import org.jivesoftware.smack.packet.XMPPError;

public abstract class XMPPException extends Exception {
    private static final long serialVersionUID = 6881651633890968625L;

    public static class StreamErrorException extends XMPPException {
        private static final long serialVersionUID = 3400556867134848886L;
        private final StreamError streamError;

        public StreamErrorException(StreamError streamError2) {
            StringBuilder sb = new StringBuilder();
            sb.append(streamError2.getCondition().toString());
            sb.append(" You can read more about the meaning of this stream error at http://xmpp.org/rfcs/rfc6120.html#streams-error-conditions\n");
            sb.append(streamError2.toString());
            super(sb.toString());
            this.streamError = streamError2;
        }

        public StreamError getStreamError() {
            return this.streamError;
        }
    }

    public static class XMPPErrorException extends XMPPException {
        private static final long serialVersionUID = 212790389529249604L;
        private final XMPPError error;

        public XMPPErrorException(XMPPError xMPPError) {
            this.error = xMPPError;
        }

        public static void ifHasErrorThenThrow(Stanza stanza) throws XMPPErrorException {
            XMPPError error2 = stanza.getError();
            if (error2 != null) {
                throw new XMPPErrorException(error2);
            }
        }

        public String getMessage() {
            String message = super.getMessage();
            if (message != null) {
                return message;
            }
            return this.error.toString();
        }

        public XMPPError getXMPPError() {
            return this.error;
        }

        public XMPPErrorException(String str, XMPPError xMPPError, Throwable th) {
            super(str, th);
            this.error = xMPPError;
        }

        public XMPPErrorException(String str, XMPPError xMPPError) {
            super(str);
            this.error = xMPPError;
        }
    }

    protected XMPPException() {
    }

    protected XMPPException(String str) {
        super(str);
    }

    protected XMPPException(String str, Throwable th) {
        super(str, th);
    }
}
