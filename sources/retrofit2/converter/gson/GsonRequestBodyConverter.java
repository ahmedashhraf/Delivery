package retrofit2.converter.gson;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p136d.C6289c;
import p468g.C13817d0;
import p468g.C13872x;
import p470h.C13887c;
import retrofit2.Converter;

final class GsonRequestBodyConverter<T> implements Converter<T, C13817d0> {
    private static final C13872x MEDIA_TYPE = C13872x.m59361b(C6289c.f17634a);
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final C8803u<T> adapter;
    private final C8775f gson;

    GsonRequestBodyConverter(C8775f fVar, C8803u<T> uVar) {
        this.gson = fVar;
        this.adapter = uVar;
    }

    public C13817d0 convert(T t) throws IOException {
        C13887c cVar = new C13887c();
        C8799d a = this.gson.mo32304a((Writer) new OutputStreamWriter(cVar.mo43902n(), UTF_8));
        this.adapter.mo32288a(a, t);
        a.close();
        return C13817d0.create(MEDIA_TYPE, cVar.mo43919t());
    }
}
