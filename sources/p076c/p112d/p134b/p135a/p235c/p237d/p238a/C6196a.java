package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.auth.oauth2.C7236t;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6290d;

/* renamed from: c.d.b.a.c.d.a.a */
/* compiled from: CloudShellCredential */
public class C6196a extends C6208h {

    /* renamed from: A */
    protected static final String f17439A = "2\n[]";

    /* renamed from: y */
    private static final int f17440y = 2;

    /* renamed from: z */
    private static final int f17441z = 5000;

    /* renamed from: w */
    private final int f17442w;

    /* renamed from: x */
    private final C6290d f17443x;

    public C6196a(int i, C6290d dVar) {
        this.f17442w = i;
        this.f17443x = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7236t mo25187a() throws IOException {
        Socket socket = new Socket("localhost", mo25188x());
        socket.setSoTimeout(5000);
        C7236t tVar = new C7236t();
        try {
            new PrintWriter(socket.getOutputStream(), true).println(f17439A);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            tVar.mo25115a(((List) this.f17443x.mo25143a((Reader) bufferedReader).mo25517a(LinkedList.class, Object.class)).get(2).toString());
            return tVar;
        } finally {
            socket.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo25188x() {
        return this.f17442w;
    }
}
