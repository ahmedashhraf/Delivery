package p076c.p112d.p134b.p135a.p262f.p263a.p264h;

import java.io.IOException;
import org.apache.http.C15116a;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.client.C15135a;
import org.apache.http.client.C15139e;
import org.apache.http.client.C15140f;
import org.apache.http.client.C15141g;
import org.apache.http.client.C15143i;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15183g;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.impl.client.C15376h;
import org.apache.http.p547h0.C15333j;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;
import org.apache.http.p549j0.C15434i;
import org.apache.http.p549j0.C15435j;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.f.a.h.a */
/* compiled from: MockHttpClient */
public class C6343a extends C15376h {

    /* renamed from: r */
    int f17734r;

    /* renamed from: c.d.b.a.f.a.h.a$a */
    /* compiled from: MockHttpClient */
    class C6344a implements C15141g {
        C6344a() {
        }

        @C2766f
        public C15466r execute(C15460l lVar, C15463o oVar, C15431f fVar) throws HttpException, IOException {
            return new C15333j((C15473y) C15471w.f44689R, C6343a.this.f17734r, (String) null);
        }
    }

    /* renamed from: J */
    public final int mo25673J() {
        return this.f17734r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15141g mo25674a(C15435j jVar, C15179c cVar, C15116a aVar, C15183g gVar, C15204d dVar, C15434i iVar, C15139e eVar, C15140f fVar, C15135a aVar2, C15135a aVar3, C15143i iVar2, C15357i iVar3) {
        return new C6344a();
    }

    /* renamed from: c */
    public C6343a mo25675c(int i) {
        C6381h0.m29666a(i >= 0);
        this.f17734r = i;
        return this;
    }
}
