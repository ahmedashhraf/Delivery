package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4448a implements C4447a<Long> {
    C4448a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException {
        return Long.valueOf(fastParser.m19210e(bufferedReader));
    }
}
