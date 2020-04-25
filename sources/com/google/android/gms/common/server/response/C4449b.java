package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.server.response.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4449b implements C4447a<Integer> {
    C4449b() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18518a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException {
        return Integer.valueOf(fastParser.m19209d(bufferedReader));
    }
}
