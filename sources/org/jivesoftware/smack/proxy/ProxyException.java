package org.jivesoftware.smack.proxy;

import java.io.IOException;
import org.jivesoftware.smack.proxy.ProxyInfo.ProxyType;

public class ProxyException extends IOException {
    private static final long serialVersionUID = 1;

    public ProxyException(ProxyType proxyType, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Proxy Exception ");
        sb.append(proxyType.toString());
        sb.append(" : ");
        sb.append(str);
        sb.append(", ");
        sb.append(th);
        super(sb.toString());
    }

    public ProxyException(ProxyType proxyType, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Proxy Exception ");
        sb.append(proxyType.toString());
        sb.append(" : ");
        sb.append(str);
        super(sb.toString());
    }

    public ProxyException(ProxyType proxyType) {
        StringBuilder sb = new StringBuilder();
        sb.append("Proxy Exception ");
        sb.append(proxyType.toString());
        sb.append(" : ");
        sb.append("Unknown Error");
        super(sb.toString());
    }
}
