package org.jivesoftware.smack.util.dns.minidns;

import java.util.LinkedList;
import java.util.List;
import org.jivesoftware.smack.initializer.SmackInitializer;
import org.jivesoftware.smack.util.DNSUtil;
import org.jivesoftware.smack.util.dns.DNSResolver;
import org.jivesoftware.smack.util.dns.SRVRecord;
import p205i.p486d.p487a.p488c.C14057b;
import p433d.p434a.p435a.C12172a;
import p433d.p434a.p435a.C12174b;
import p433d.p434a.p435a.C12175c;
import p433d.p434a.p435a.C12180e;
import p433d.p434a.p435a.C12181f;
import p433d.p434a.p435a.C12181f.C12183b;
import p433d.p434a.p435a.C12181f.C12184c;
import p433d.p434a.p435a.p436g.C12192h;

public class MiniDnsResolver implements SmackInitializer, DNSResolver {
    private static final long ONE_DAY = 86400000;
    /* access modifiers changed from: private */
    public static final C14057b<C12180e, C12175c> cache = new C14057b<>(10, ONE_DAY);
    private static final MiniDnsResolver instance = new MiniDnsResolver();
    private final C12172a client = new C12172a((C12174b) new C12174b() {
        public C12175c get(C12180e eVar) {
            return (C12175c) MiniDnsResolver.cache.get(eVar);
        }

        public void put(C12180e eVar, C12175c cVar) {
            long j;
            C12181f[] b = cVar.mo41673b();
            int length = b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    j = MiniDnsResolver.ONE_DAY;
                    break;
                }
                C12181f fVar = b[i];
                if (fVar.mo41710a(eVar)) {
                    j = fVar.mo41712c();
                    break;
                }
                i++;
            }
            MiniDnsResolver.cache.mo44388a(eVar, cVar, j);
        }
    });

    public static DNSResolver getInstance() {
        return instance;
    }

    public static void setup() {
        DNSUtil.setDNSResolver(getInstance());
    }

    public List<Exception> initialize() {
        setup();
        return null;
    }

    public List<SRVRecord> lookupSRVRecords(String str) {
        LinkedList linkedList = new LinkedList();
        C12175c a = this.client.mo41658a(str, C12184c.SRV, C12183b.IN);
        if (a == null) {
            return linkedList;
        }
        for (C12181f b : a.mo41673b()) {
            C12192h hVar = (C12192h) b.mo41711b();
            linkedList.add(new SRVRecord(hVar.mo41732b(), hVar.mo41734c(), hVar.mo41736d(), hVar.mo41737e()));
        }
        return linkedList;
    }
}
