package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: c.d.d.c.a */
/* compiled from: AbstractByteHasher */
abstract class C6528a extends C6531c {

    /* renamed from: a */
    private final ByteBuffer f18241a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    C6528a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo26424b(byte b);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26425b(byte[] bArr) {
        mo26426b(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26426b(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo26424b(bArr[i3]);
        }
    }

    /* renamed from: b */
    private C6563m m31022b(int i) {
        try {
            mo26426b(this.f18241a.array(), 0, i);
            return this;
        } finally {
            this.f18241a.clear();
        }
    }

    /* renamed from: a */
    public C6563m m31031a(byte b) {
        mo26424b(b);
        return this;
    }

    /* renamed from: a */
    public C6563m m31036a(byte[] bArr) {
        C7397x.m35664a(bArr);
        mo26425b(bArr);
        return this;
    }

    /* renamed from: a */
    public C6563m m31037a(byte[] bArr, int i, int i2) {
        C7397x.m35675b(i, i + i2, bArr.length);
        mo26426b(bArr, i, i2);
        return this;
    }

    /* renamed from: a */
    public C6563m m31035a(short s) {
        this.f18241a.putShort(s);
        return m31022b(2);
    }

    /* renamed from: a */
    public C6563m m31033a(int i) {
        this.f18241a.putInt(i);
        return m31022b(4);
    }

    /* renamed from: a */
    public C6563m m31034a(long j) {
        this.f18241a.putLong(j);
        return m31022b(8);
    }

    /* renamed from: a */
    public C6563m m31032a(char c) {
        this.f18241a.putChar(c);
        return m31022b(2);
    }

    /* renamed from: a */
    public <T> C6563m mo26420a(T t, C6548i<? super T> iVar) {
        iVar.mo26470a(t, this);
        return this;
    }
}
