package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.jivesoftware.smack.util.TLSUtils;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5287i9 extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f15135a;

    C5287i9(C5298j9 j9Var, SSLSocket sSLSocket) {
        this.f15135a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f15135a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f15135a.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f15135a.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f15135a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f15135a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f15135a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f15135a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f15135a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f15135a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f15135a.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f15135a.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f15135a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f15135a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f15135a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f15135a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f15135a.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f15135a.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f15135a.getOutputStream();
    }

    public final int getPort() {
        return this.f15135a.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f15135a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f15135a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f15135a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f15135a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f15135a.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.f15135a.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f15135a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f15135a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f15135a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f15135a.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f15135a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f15135a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f15135a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f15135a.isBound();
    }

    public final boolean isClosed() {
        return this.f15135a.isClosed();
    }

    public final boolean isConnected() {
        return this.f15135a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f15135a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f15135a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f15135a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f15135a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f15135a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f15135a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            List asList = Arrays.asList(strArr);
            String str = TLSUtils.PROTO_SSL3;
            if (asList.contains(str)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f15135a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove(str);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
        this.f15135a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f15135a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f15135a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f15135a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f15135a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f15135a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f15135a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f15135a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f15135a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f15135a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f15135a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f15135a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f15135a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f15135a.setWantClientAuth(z);
    }

    public final void shutdownInput() throws IOException {
        this.f15135a.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f15135a.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.f15135a.startHandshake();
    }

    public final String toString() {
        return this.f15135a.toString();
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f15135a.connect(socketAddress, i);
    }
}
