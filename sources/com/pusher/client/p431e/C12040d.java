package com.pusher.client.p431e;

import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import p076c.p284e.p285a.p286j.C6748b;
import p076c.p284e.p285a.p288l.C6764h;

/* renamed from: com.pusher.client.e.d */
/* compiled from: SimpleWebSocket */
public class C12040d extends C6748b {
    public C12040d() throws URISyntaxException {
        super(new URI("ws://ws.pusherapp.com/app/387954142406c3c9cc13?protocol=6&client=js&version=0.1.2&flash=false"));
        System.out.println("SimpleWebSocket");
        mo26988k();
    }

    /* renamed from: a */
    public static void m54335a(String[] strArr) throws URISyntaxException {
        new C12040d();
    }

    /* renamed from: b */
    public void mo26984b(String str) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("onMessage: ");
        sb.append(str);
        printStream.println(sb.toString());
    }

    /* renamed from: a */
    public void mo26978a(C6764h hVar) {
        System.out.println("onOpen");
    }

    /* renamed from: a */
    public void mo26977a(int i, String str, boolean z) {
        System.out.println("onClose");
    }

    /* renamed from: a */
    public void mo26979a(Exception exc) {
        System.out.println("onError");
    }
}
