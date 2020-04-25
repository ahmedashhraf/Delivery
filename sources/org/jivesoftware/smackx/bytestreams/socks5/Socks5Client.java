package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;

class Socks5Client {
    protected String digest;
    protected StreamHost streamHost;

    public Socks5Client(StreamHost streamHost2, String str) {
        this.streamHost = streamHost2;
        this.digest = str;
    }

    private byte[] createSocks5ConnectRequest() {
        byte[] bytes = this.digest.getBytes();
        byte[] bArr = new byte[(bytes.length + 7)];
        bArr[0] = 5;
        bArr[1] = 1;
        bArr[2] = 0;
        bArr[3] = 3;
        bArr[4] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 5, bytes.length);
        bArr[bArr.length - 2] = 0;
        bArr[bArr.length - 1] = 0;
        return bArr;
    }

    /* access modifiers changed from: protected */
    public boolean establish(Socket socket) throws SmackException, IOException {
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.write(new byte[]{5, 1, 0});
        dataOutputStream.flush();
        byte[] bArr = new byte[2];
        dataInputStream.readFully(bArr);
        if (bArr[0] != 5 || bArr[1] != 0) {
            return false;
        }
        byte[] createSocks5ConnectRequest = createSocks5ConnectRequest();
        dataOutputStream.write(createSocks5ConnectRequest);
        dataOutputStream.flush();
        byte[] receiveSocks5Message = Socks5Utils.receiveSocks5Message(dataInputStream);
        createSocks5ConnectRequest[1] = 0;
        return Arrays.equals(createSocks5ConnectRequest, receiveSocks5Message);
    }

    public Socket getSocket(int i) throws IOException, XMPPErrorException, InterruptedException, TimeoutException, SmackException, XMPPException {
        FutureTask futureTask = new FutureTask(new Callable<Socket>() {
            public Socket call() throws IOException, SmackException {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(Socks5Client.this.streamHost.getAddress(), Socks5Client.this.streamHost.getPort()));
                try {
                    if (Socks5Client.this.establish(socket)) {
                        return socket;
                    }
                    socket.close();
                    throw new SmackException("SOCKS5 negotiation failed");
                } catch (SmackException e) {
                    socket.close();
                    throw e;
                }
            }
        });
        new Thread(futureTask).start();
        try {
            return (Socket) futureTask.get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                } else if (cause instanceof SmackException) {
                    throw ((SmackException) cause);
                }
            }
            throw new IOException("Error while connection to SOCKS5 proxy");
        }
    }
}
