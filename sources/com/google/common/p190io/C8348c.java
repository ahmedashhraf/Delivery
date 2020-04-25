package com.google.common.p190io;

import java.io.DataOutput;

/* renamed from: com.google.common.io.c */
/* compiled from: ByteArrayDataOutput */
public interface C8348c extends DataOutput {
    /* renamed from: a */
    byte[] mo31422a();

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    void writeBoolean(boolean z);

    void writeByte(int i);

    @Deprecated
    void writeBytes(String str);

    void writeChar(int i);

    void writeChars(String str);

    void writeDouble(double d);

    void writeFloat(float f);

    void writeInt(int i);

    void writeLong(long j);

    void writeShort(int i);

    void writeUTF(String str);
}
