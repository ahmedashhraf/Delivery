package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.a */
final class C7124a implements C5735b0 {

    /* renamed from: a */
    private final FileChannel f20221a;

    /* renamed from: b */
    private final long f20222b;

    /* renamed from: c */
    private final long f20223c;

    public C7124a(FileChannel fileChannel, long j, long j2) {
        this.f20221a = fileChannel;
        this.f20222b = j;
        this.f20223c = j2;
    }

    /* renamed from: a */
    public final void mo23030a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f20221a.map(MapMode.READ_ONLY, this.f20222b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    /* renamed from: d */
    public final long mo23031d() {
        return this.f20223c;
    }
}
