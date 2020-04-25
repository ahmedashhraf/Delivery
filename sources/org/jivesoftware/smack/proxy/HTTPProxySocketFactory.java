package org.jivesoftware.smack.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import org.jivesoftware.smack.proxy.ProxyInfo.ProxyType;
import org.jivesoftware.smack.util.stringencoder.Base64;

class HTTPProxySocketFactory extends SocketFactory {
    private static final Pattern RESPONSE_PATTERN = Pattern.compile("HTTP/\\S+\\s(\\d+)\\s(.*)\\s*");
    private ProxyInfo proxy;

    public HTTPProxySocketFactory(ProxyInfo proxyInfo) {
        this.proxy = proxyInfo;
    }

    private Socket httpProxifiedSocket(String str, int i) throws IOException {
        String str2;
        String str3;
        String proxyAddress = this.proxy.getProxyAddress();
        Socket socket = new Socket(proxyAddress, this.proxy.getProxyPort());
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(str);
        String str4 = ":";
        sb.append(str4);
        sb.append(i);
        String sb2 = sb.toString();
        String proxyUsername = this.proxy.getProxyUsername();
        if (proxyUsername == null) {
            str2 = "";
        } else {
            String proxyPassword = this.proxy.getProxyPassword();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("\r\nProxy-Authorization: Basic ");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(proxyUsername);
            sb4.append(str4);
            sb4.append(proxyPassword);
            sb3.append(Base64.encode(sb4.toString()));
            str2 = sb3.toString();
        }
        OutputStream outputStream = socket.getOutputStream();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(" HTTP/1.1\r\nHost: ");
        sb5.append(sb2);
        sb5.append(str2);
        sb5.append("\r\n\r\n");
        outputStream.write(sb5.toString().getBytes("UTF-8"));
        InputStream inputStream = socket.getInputStream();
        StringBuilder sb6 = new StringBuilder(100);
        int i2 = 0;
        do {
            char read = (char) inputStream.read();
            sb6.append(read);
            str3 = ", cancelling connection";
            if (sb6.length() > 1024) {
                ProxyType proxyType = ProxyType.HTTP;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Recieved header of >1024 characters from ");
                sb7.append(proxyAddress);
                sb7.append(str3);
                throw new ProxyException(proxyType, sb7.toString());
            } else if (read != 65535) {
                i2 = (((i2 == 0 || i2 == 2) && read == 13) || ((i2 == 1 || i2 == 3) && read == 10)) ? i2 + 1 : 0;
            } else {
                throw new ProxyException(ProxyType.HTTP);
            }
        } while (i2 != 4);
        if (i2 == 4) {
            String readLine = new BufferedReader(new StringReader(sb6.toString())).readLine();
            if (readLine != null) {
                Matcher matcher = RESPONSE_PATTERN.matcher(readLine);
                if (!matcher.matches()) {
                    ProxyType proxyType2 = ProxyType.HTTP;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Unexpected proxy response from ");
                    sb8.append(proxyAddress);
                    sb8.append(": ");
                    sb8.append(readLine);
                    throw new ProxyException(proxyType2, sb8.toString());
                } else if (Integer.parseInt(matcher.group(1)) == 200) {
                    return socket;
                } else {
                    throw new ProxyException(ProxyType.HTTP);
                }
            } else {
                ProxyType proxyType3 = ProxyType.HTTP;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Empty proxy response from ");
                sb9.append(proxyAddress);
                sb9.append(", cancelling");
                throw new ProxyException(proxyType3, sb9.toString());
            }
        } else {
            ProxyType proxyType4 = ProxyType.HTTP;
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Never received blank line from ");
            sb10.append(proxyAddress);
            sb10.append(str3);
            throw new ProxyException(proxyType4, sb10.toString());
        }
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return httpProxifiedSocket(str, i);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return httpProxifiedSocket(str, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return httpProxifiedSocket(inetAddress.getHostAddress(), i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return httpProxifiedSocket(inetAddress.getHostAddress(), i);
    }
}
