package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;

public class UnparsedIQ extends C15617IQ {
    private final CharSequence content;

    public UnparsedIQ(String str, String str2, CharSequence charSequence) {
        super(str, str2);
        this.content = charSequence;
    }

    public CharSequence getContent() {
        return this.content;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        throw new UnsupportedOperationException();
    }
}
