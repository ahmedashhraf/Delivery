package org.jivesoftware.smack.proxy;

import javax.net.SocketFactory;

public class ProxyInfo {
    private String proxyAddress;
    private String proxyPassword;
    private int proxyPort;
    private ProxyType proxyType;
    private String proxyUsername;

    public enum ProxyType {
        NONE,
        HTTP,
        SOCKS4,
        SOCKS5
    }

    public ProxyInfo(ProxyType proxyType2, String str, int i, String str2, String str3) {
        this.proxyType = proxyType2;
        this.proxyAddress = str;
        this.proxyPort = i;
        this.proxyUsername = str2;
        this.proxyPassword = str3;
    }

    public static ProxyInfo forDefaultProxy() {
        ProxyInfo proxyInfo = new ProxyInfo(ProxyType.NONE, null, 0, null, null);
        return proxyInfo;
    }

    public static ProxyInfo forHttpProxy(String str, int i, String str2, String str3) {
        ProxyInfo proxyInfo = new ProxyInfo(ProxyType.HTTP, str, i, str2, str3);
        return proxyInfo;
    }

    public static ProxyInfo forNoProxy() {
        ProxyInfo proxyInfo = new ProxyInfo(ProxyType.NONE, null, 0, null, null);
        return proxyInfo;
    }

    public static ProxyInfo forSocks4Proxy(String str, int i, String str2, String str3) {
        ProxyInfo proxyInfo = new ProxyInfo(ProxyType.SOCKS4, str, i, str2, str3);
        return proxyInfo;
    }

    public static ProxyInfo forSocks5Proxy(String str, int i, String str2, String str3) {
        ProxyInfo proxyInfo = new ProxyInfo(ProxyType.SOCKS5, str, i, str2, str3);
        return proxyInfo;
    }

    public String getProxyAddress() {
        return this.proxyAddress;
    }

    public String getProxyPassword() {
        return this.proxyPassword;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public ProxyType getProxyType() {
        return this.proxyType;
    }

    public String getProxyUsername() {
        return this.proxyUsername;
    }

    public SocketFactory getSocketFactory() {
        ProxyType proxyType2 = this.proxyType;
        if (proxyType2 == ProxyType.NONE) {
            return new DirectSocketFactory();
        }
        if (proxyType2 == ProxyType.HTTP) {
            return new HTTPProxySocketFactory(this);
        }
        if (proxyType2 == ProxyType.SOCKS4) {
            return new Socks4ProxySocketFactory(this);
        }
        if (proxyType2 == ProxyType.SOCKS5) {
            return new Socks5ProxySocketFactory(this);
        }
        return null;
    }
}
