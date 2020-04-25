package org.apache.http.p547h0;

import java.util.NoSuchElementException;
import org.apache.http.C15134c0;
import org.apache.http.C15250f;
import org.apache.http.ParseException;

/* renamed from: org.apache.http.h0.q */
/* compiled from: BasicTokenIterator */
public class C15340q implements C15134c0 {

    /* renamed from: P */
    public static final String f44407P = " ,;=()<>@:\\\"/[]?{}\t";

    /* renamed from: N */
    protected String f44408N;

    /* renamed from: O */
    protected int f44409O;

    /* renamed from: a */
    protected final C15250f f44410a;

    /* renamed from: b */
    protected String f44411b;

    public C15340q(C15250f fVar) {
        if (fVar != null) {
            this.f44410a = fVar;
            this.f44409O = mo47502a(-1);
            return;
        }
        throw new IllegalArgumentException("Header iterator must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47502a(int i) throws ParseException {
        int i2;
        if (i >= 0) {
            i2 = mo47507c(i);
        } else if (!this.f44410a.hasNext()) {
            return -1;
        } else {
            this.f44411b = this.f44410a.mo47173e().getValue();
            i2 = 0;
        }
        int d = mo47509d(i2);
        if (d < 0) {
            this.f44408N = null;
            return -1;
        }
        int b = mo47505b(d);
        this.f44408N = mo47503a(this.f44411b, d, b);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47505b(int i) {
        if (i >= 0) {
            int length = this.f44411b.length();
            do {
                i++;
                if (i >= length) {
                    break;
                }
            } while (mo47506b(this.f44411b.charAt(i)));
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Token start position must not be negative: ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo47507c(int i) {
        if (i >= 0) {
            boolean z = false;
            int length = this.f44411b.length();
            while (!z && i < length) {
                char charAt = this.f44411b.charAt(i);
                if (mo47508c(charAt)) {
                    z = true;
                } else if (mo47510d(charAt)) {
                    i++;
                } else {
                    String str = "): ";
                    if (mo47506b(charAt)) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Tokens without separator (pos ");
                        stringBuffer.append(i);
                        stringBuffer.append(str);
                        stringBuffer.append(this.f44411b);
                        throw new ParseException(stringBuffer.toString());
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid character after token (pos ");
                    stringBuffer2.append(i);
                    stringBuffer2.append(str);
                    stringBuffer2.append(this.f44411b);
                    throw new ParseException(stringBuffer2.toString());
                }
            }
            return i;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("Search position must not be negative: ");
        stringBuffer3.append(i);
        throw new IllegalArgumentException(stringBuffer3.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo47508c(char c) {
        return c == ',';
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo47509d(int i) {
        if (i >= 0) {
            int i2 = i;
            boolean z = false;
            while (!z) {
                String str = this.f44411b;
                if (str == null) {
                    break;
                }
                int length = str.length();
                while (!z && i2 < length) {
                    char charAt = this.f44411b.charAt(i2);
                    if (mo47508c(charAt) || mo47510d(charAt)) {
                        i2++;
                    } else if (mo47506b(this.f44411b.charAt(i2))) {
                        z = true;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid character before token (pos ");
                        stringBuffer.append(i2);
                        stringBuffer.append("): ");
                        stringBuffer.append(this.f44411b);
                        throw new ParseException(stringBuffer.toString());
                    }
                }
                if (!z) {
                    if (this.f44410a.hasNext()) {
                        this.f44411b = this.f44410a.mo47173e().getValue();
                        i2 = 0;
                    } else {
                        this.f44411b = null;
                    }
                }
            }
            if (z) {
                return i2;
            }
            return -1;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Search position must not be negative: ");
        stringBuffer2.append(i);
        throw new IllegalArgumentException(stringBuffer2.toString());
    }

    /* renamed from: f */
    public String mo46918f() throws NoSuchElementException, ParseException {
        String str = this.f44408N;
        if (str != null) {
            this.f44409O = mo47502a(this.f44409O);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public boolean hasNext() {
        return this.f44408N != null;
    }

    public final Object next() throws NoSuchElementException, ParseException {
        return mo46918f();
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo47506b(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (!Character.isISOControl(c) && !mo47504a(c)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo47503a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47504a(char c) {
        return f44407P.indexOf(c) >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo47510d(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }
}
