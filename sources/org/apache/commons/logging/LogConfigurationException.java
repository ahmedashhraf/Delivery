package org.apache.commons.logging;

public class LogConfigurationException extends RuntimeException {

    /* renamed from: a */
    protected Throwable f43863a;

    public LogConfigurationException() {
        this.f43863a = null;
    }

    public Throwable getCause() {
        return this.f43863a;
    }

    public LogConfigurationException(String str) {
        super(str);
        this.f43863a = null;
    }

    public LogConfigurationException(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    public LogConfigurationException(String str, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th);
        stringBuffer.append(")");
        super(stringBuffer.toString());
        this.f43863a = null;
        this.f43863a = th;
    }
}
