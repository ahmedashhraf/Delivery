package com.google.api.client.http.p308j0;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.p537q.C15218d;

/* renamed from: com.google.api.client.http.j0.f */
/* compiled from: SSLSocketFactoryExtension */
final class C7281f extends C15218d {

    /* renamed from: l */
    private final SSLSocketFactory f20595l;

    C7281f(SSLContext sSLContext) throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {
        super((KeyStore) null);
        this.f20595l = sSLContext.getSocketFactory();
    }

    /* renamed from: a */
    public Socket mo28969a() throws IOException {
        return this.f20595l.createSocket();
    }

    /* renamed from: a */
    public Socket mo28970a(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.f20595l.createSocket(socket, str, i, z);
        mo47097b().mo47090a(str, sSLSocket);
        return sSLSocket;
    }
}
