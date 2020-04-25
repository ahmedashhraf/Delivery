package retrofit2.converter.gson;

import com.google.gson.C8775f;
import com.google.gson.C8803u;
import java.io.IOException;
import p468g.C13826f0;
import retrofit2.Converter;

final class GsonResponseBodyConverter<T> implements Converter<C13826f0, T> {
    private final C8803u<T> adapter;
    private final C8775f gson;

    GsonResponseBodyConverter(C8775f fVar, C8803u<T> uVar) {
        this.gson = fVar;
        this.adapter = uVar;
    }

    public T convert(C13826f0 f0Var) throws IOException {
        try {
            return this.adapter.mo32287a(this.gson.mo32303a(f0Var.charStream()));
        } finally {
            f0Var.close();
        }
    }
}
