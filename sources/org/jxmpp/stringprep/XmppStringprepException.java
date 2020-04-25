package org.jxmpp.stringprep;

public class XmppStringprepException extends Exception {
    private static final long serialVersionUID = -8491853210107124624L;

    /* renamed from: a */
    private final String f45027a;

    public XmppStringprepException(String str, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppStringprepException caused by '");
        sb.append(str);
        sb.append("': ");
        sb.append(exc);
        super(sb.toString(), exc);
        this.f45027a = str;
    }

    /* renamed from: a */
    public String mo51817a() {
        return this.f45027a;
    }

    public XmppStringprepException(String str, String str2) {
        super(str2);
        this.f45027a = str;
    }
}
