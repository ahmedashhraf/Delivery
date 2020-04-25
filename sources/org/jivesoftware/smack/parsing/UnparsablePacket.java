package org.jivesoftware.smack.parsing;

public class UnparsablePacket {
    private final CharSequence content;

    /* renamed from: e */
    private final Exception f44984e;

    public UnparsablePacket(CharSequence charSequence, Exception exc) {
        this.content = charSequence;
        this.f44984e = exc;
    }

    public CharSequence getContent() {
        return this.content;
    }

    public Exception getParsingException() {
        return this.f44984e;
    }
}
