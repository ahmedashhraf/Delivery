package org.jivesoftware.smack.tcp;

import org.jivesoftware.smack.ConnectionConfiguration;

public class XMPPTCPConnectionConfiguration extends ConnectionConfiguration {
    public static int DEFAULT_CONNECT_TIMEOUT = 30000;
    private final boolean compressionEnabled;
    private final int connectTimeout;

    public static class Builder extends org.jivesoftware.smack.ConnectionConfiguration.Builder<Builder, XMPPTCPConnectionConfiguration> {
        /* access modifiers changed from: private */
        public boolean compressionEnabled;
        /* access modifiers changed from: private */
        public int connectTimeout;

        /* access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder setCompressionEnabled(boolean z) {
            this.compressionEnabled = z;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        private Builder() {
            this.compressionEnabled = false;
            this.connectTimeout = XMPPTCPConnectionConfiguration.DEFAULT_CONNECT_TIMEOUT;
        }

        public XMPPTCPConnectionConfiguration build() {
            return new XMPPTCPConnectionConfiguration(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public boolean isCompressionEnabled() {
        return this.compressionEnabled;
    }

    private XMPPTCPConnectionConfiguration(Builder builder) {
        super(builder);
        this.compressionEnabled = builder.compressionEnabled;
        this.connectTimeout = builder.connectTimeout;
    }
}
