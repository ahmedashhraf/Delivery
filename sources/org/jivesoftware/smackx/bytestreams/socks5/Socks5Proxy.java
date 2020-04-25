package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;

public class Socks5Proxy {
    private static final Logger LOGGER = Logger.getLogger(Socks5Proxy.class.getName());
    private static boolean localSocks5ProxyEnabled = true;
    private static int localSocks5ProxyPort = -7777;
    private static Socks5Proxy socks5Server;
    /* access modifiers changed from: private */
    public final List<String> allowedConnections = Collections.synchronizedList(new LinkedList());
    /* access modifiers changed from: private */
    public final Map<String, Socket> connectionMap = new ConcurrentHashMap();
    private final Set<String> localAddresses = new LinkedHashSet(4);
    private Socks5ServerProcess serverProcess = new Socks5ServerProcess();
    /* access modifiers changed from: private */
    public ServerSocket serverSocket;
    private Thread serverThread;

    private class Socks5ServerProcess implements Runnable {
        private Socks5ServerProcess() {
        }

        private void establishConnection(Socket socket) throws SmackException, IOException {
            boolean z;
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            if (dataInputStream.read() == 5) {
                byte[] bArr = new byte[dataInputStream.read()];
                dataInputStream.readFully(bArr);
                byte[] bArr2 = new byte[2];
                bArr2[0] = 5;
                int i = 0;
                while (true) {
                    if (i >= bArr.length) {
                        z = false;
                        break;
                    } else if (bArr[i] == 0) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    bArr2[1] = 0;
                    dataOutputStream.write(bArr2);
                    dataOutputStream.flush();
                    byte[] receiveSocks5Message = Socks5Utils.receiveSocks5Message(dataInputStream);
                    String str = new String(receiveSocks5Message, 5, receiveSocks5Message[4]);
                    if (Socks5Proxy.this.allowedConnections.contains(str)) {
                        receiveSocks5Message[1] = 0;
                        dataOutputStream.write(receiveSocks5Message);
                        dataOutputStream.flush();
                        Socks5Proxy.this.connectionMap.put(str, socket);
                        return;
                    }
                    receiveSocks5Message[1] = 5;
                    dataOutputStream.write(receiveSocks5Message);
                    dataOutputStream.flush();
                    throw new SmackException("Connection is not allowed");
                }
                bArr2[1] = -1;
                dataOutputStream.write(bArr2);
                dataOutputStream.flush();
                throw new SmackException("Authentication method not supported");
            }
            throw new SmackException("Only SOCKS5 supported");
        }

        public void run() {
            while (true) {
                Socket socket = null;
                try {
                    if (Socks5Proxy.this.serverSocket != null && !Socks5Proxy.this.serverSocket.isClosed()) {
                        if (!Thread.currentThread().isInterrupted()) {
                            establishConnection(Socks5Proxy.this.serverSocket.accept());
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (SocketException unused2) {
                        }
                    }
                }
            }
        }
    }

    private Socks5Proxy() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            HashSet hashSet = new HashSet();
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    hashSet.add(((InetAddress) it2.next()).getHostAddress());
                }
            }
            if (!hashSet.isEmpty()) {
                replaceLocalAddresses(hashSet);
                return;
            }
            throw new IllegalStateException("Could not determine any local host address");
        } catch (SocketException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int getLocalSocks5ProxyPort() {
        return localSocks5ProxyPort;
    }

    public static synchronized Socks5Proxy getSocks5Proxy() {
        Socks5Proxy socks5Proxy;
        synchronized (Socks5Proxy.class) {
            if (socks5Server == null) {
                socks5Server = new Socks5Proxy();
            }
            if (isLocalSocks5ProxyEnabled()) {
                socks5Server.start();
            }
            socks5Proxy = socks5Server;
        }
        return socks5Proxy;
    }

    public static boolean isLocalSocks5ProxyEnabled() {
        return localSocks5ProxyEnabled;
    }

    public static void setLocalSocks5ProxyEnabled(boolean z) {
        localSocks5ProxyEnabled = z;
    }

    public static void setLocalSocks5ProxyPort(int i) {
        if (Math.abs(i) <= 65535) {
            localSocks5ProxyPort = i;
            return;
        }
        throw new IllegalArgumentException("localSocks5ProxyPort must be within (-65535,65535)");
    }

    public void addLocalAddress(String str) {
        if (str != null) {
            synchronized (this.localAddresses) {
                this.localAddresses.add(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addTransfer(String str) {
        this.allowedConnections.add(str);
    }

    public List<String> getLocalAddresses() {
        LinkedList linkedList;
        synchronized (this.localAddresses) {
            linkedList = new LinkedList(this.localAddresses);
        }
        return linkedList;
    }

    public int getPort() {
        if (!isRunning()) {
            return -1;
        }
        return this.serverSocket.getLocalPort();
    }

    /* access modifiers changed from: protected */
    public Socket getSocket(String str) {
        return (Socket) this.connectionMap.get(str);
    }

    public boolean isRunning() {
        return this.serverSocket != null;
    }

    public boolean removeLocalAddress(String str) {
        boolean remove;
        synchronized (this.localAddresses) {
            remove = this.localAddresses.remove(str);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    public void removeTransfer(String str) {
        this.allowedConnections.remove(str);
        this.connectionMap.remove(str);
    }

    public void replaceLocalAddresses(Collection<String> collection) {
        if (collection != null) {
            synchronized (this.localAddresses) {
                this.localAddresses.clear();
                this.localAddresses.addAll(collection);
            }
            return;
        }
        throw new IllegalArgumentException("list must not be null");
    }

    public synchronized void start() {
        if (!isRunning()) {
            try {
                if (getLocalSocks5ProxyPort() < 0) {
                    int abs = Math.abs(getLocalSocks5ProxyPort());
                    int i = 0;
                    while (i < 65535 - abs) {
                        try {
                            this.serverSocket = new ServerSocket(abs + i);
                            break;
                        } catch (IOException unused) {
                            i++;
                        }
                    }
                } else {
                    this.serverSocket = new ServerSocket(getLocalSocks5ProxyPort());
                }
                if (this.serverSocket != null) {
                    this.serverThread = new Thread(this.serverProcess);
                    this.serverThread.start();
                }
            } catch (IOException e) {
                Logger logger = LOGGER;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder();
                sb.append("couldn't setup local SOCKS5 proxy on port ");
                sb.append(getLocalSocks5ProxyPort());
                logger.log(level, sb.toString(), e);
            }
        } else {
            return;
        }
        return;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|7|8|9|(2:13|14)|15|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRunning()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.net.ServerSocket r0 = r1.serverSocket     // Catch:{ IOException -> 0x000e }
            r0.close()     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            java.lang.Thread r0 = r1.serverThread     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = r1.serverThread     // Catch:{ all -> 0x002b }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = r1.serverThread     // Catch:{ InterruptedException -> 0x0024 }
            r0.interrupt()     // Catch:{ InterruptedException -> 0x0024 }
            java.lang.Thread r0 = r1.serverThread     // Catch:{ InterruptedException -> 0x0024 }
            r0.join()     // Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            r0 = 0
            r1.serverThread = r0     // Catch:{ all -> 0x002b }
            r1.serverSocket = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.stop():void");
    }
}
