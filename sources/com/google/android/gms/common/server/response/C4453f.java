package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.f */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4453f implements C4447a<Boolean> {
    C4453f() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException {
        return Boolean.valueOf(fastParser.m19201a(bufferedReader, false));
    }
}
