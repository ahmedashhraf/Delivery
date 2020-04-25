package org.jivesoftware.smack.packet;

import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;

public abstract class SimpleIQ extends C15617IQ {
    protected SimpleIQ(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }
}
