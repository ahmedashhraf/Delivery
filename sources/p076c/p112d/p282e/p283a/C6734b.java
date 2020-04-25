package p076c.p112d.p282e.p283a;

import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.e.a.b */
/* compiled from: PublicSuffixType */
enum C6734b {
    PRIVATE(':', ','),
    ICANN('!', '?');
    
    private final char innerNodeCode;
    private final char leafNodeCode;

    private C6734b(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    /* renamed from: a */
    static C6734b m32123a(char c) {
        C6734b[] values;
        for (C6734b bVar : values()) {
            if (bVar.mo26904d() == c || bVar.mo26905e() == c) {
                return bVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No enum corresponding to given code: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo26904d() {
        return this.innerNodeCode;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public char mo26905e() {
        return this.leafNodeCode;
    }

    /* renamed from: a */
    static C6734b m32124a(boolean z) {
        return z ? PRIVATE : ICANN;
    }
}
