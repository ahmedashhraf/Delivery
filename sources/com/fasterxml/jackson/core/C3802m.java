package com.fasterxml.jackson.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.fasterxml.jackson.core.m */
/* compiled from: SerializableString */
public interface C3802m {
    /* renamed from: a */
    int mo16772a(OutputStream outputStream) throws IOException;

    /* renamed from: a */
    int mo16773a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: a */
    int mo16774a(byte[] bArr, int i);

    /* renamed from: a */
    int mo16775a(char[] cArr, int i);

    /* renamed from: a */
    char[] mo16776a();

    /* renamed from: b */
    int mo16777b(OutputStream outputStream) throws IOException;

    /* renamed from: b */
    int mo16778b(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    int mo16779b(byte[] bArr, int i);

    /* renamed from: b */
    int mo16780b(char[] cArr, int i);

    /* renamed from: d */
    byte[] mo16781d();

    /* renamed from: e */
    byte[] mo16782e();

    /* renamed from: f */
    int mo16783f();

    String getValue();
}
