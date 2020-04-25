package kotlin.p217i1;

/* renamed from: kotlin.i1.q */
/* compiled from: Regex.kt */
public enum C14688q implements C14668i {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    private final int mask;
    private final int value;

    protected C14688q(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }

    /* renamed from: d */
    public int mo45886d() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }
}
