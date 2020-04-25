package org.jivesoftware.smack.util.dns;

import org.jivesoftware.smack.util.Objects;

public class HostAddress {
    private Exception exception;
    private final String fqdn;
    private final int port;

    public HostAddress(String str) {
        this(str, 5222);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAddress)) {
            return false;
        }
        HostAddress hostAddress = (HostAddress) obj;
        if (!this.fqdn.equals(hostAddress.fqdn)) {
            return false;
        }
        if (this.port != hostAddress.port) {
            z = false;
        }
        return z;
    }

    public String getErrorMessage() {
        if (this.exception == null) {
            return "No error logged";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(toString());
        sb.append("' failed because ");
        sb.append(this.exception.toString());
        return sb.toString();
    }

    public Exception getException() {
        return this.exception;
    }

    public String getFQDN() {
        return this.fqdn;
    }

    public int getPort() {
        return this.port;
    }

    public int hashCode() {
        return ((this.fqdn.hashCode() + 37) * 37) + this.port;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.fqdn);
        sb.append(":");
        sb.append(this.port);
        return sb.toString();
    }

    public HostAddress(String str, int i) {
        Objects.requireNonNull(str, "FQDN is null");
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder();
            sb.append("Port must be a 16-bit unsiged integer (i.e. between 0-65535. Port was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (str.charAt(str.length() - 1) == '.') {
            this.fqdn = str.substring(0, str.length() - 1);
        } else {
            this.fqdn = str;
        }
        this.port = i;
    }
}
