package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.d */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4451d implements C4447a<Float> {
    C4451d() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException {
        return Float.valueOf(fastParser.m19214g(bufferedReader));
    }
}
