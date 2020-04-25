package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p150g.C6641g;

@C2775a
/* renamed from: com.google.common.io.z */
/* compiled from: LittleEndianDataOutputStream */
public class C8427z extends FilterOutputStream implements DataOutput {
    public C8427z(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) C7397x.m35664a(outputStream)));
    }

    public void close() throws IOException {
        this.out.close();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }

    public void writeBoolean(boolean z) throws IOException {
        ((DataOutputStream) this.out).writeBoolean(z);
    }

    public void writeByte(int i) throws IOException {
        ((DataOutputStream) this.out).writeByte(i);
    }

    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) this.out).writeBytes(str);
    }

    public void writeChar(int i) throws IOException {
        writeShort(i);
    }

    public void writeChars(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            writeChar(str.charAt(i));
        }
    }

    public void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    public void writeFloat(float f) throws IOException {
        writeInt(Float.floatToIntBits(f));
    }

    public void writeInt(int i) throws IOException {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
        this.out.write((i >> 16) & 255);
        this.out.write((i >> 24) & 255);
    }

    public void writeLong(long j) throws IOException {
        byte[] b = C6641g.m31709b(Long.reverseBytes(j));
        write(b, 0, b.length);
    }

    public void writeShort(int i) throws IOException {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
    }

    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) this.out).writeUTF(str);
    }
}
