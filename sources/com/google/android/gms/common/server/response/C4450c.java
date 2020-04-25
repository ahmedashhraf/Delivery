package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4450c implements C4447a<Double> {
    C4450c() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException {
        return Double.valueOf(fastParser.m19216h(bufferedReader));
    }
}
