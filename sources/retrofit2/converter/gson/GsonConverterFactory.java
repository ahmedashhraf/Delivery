package retrofit2.converter.gson;

import com.google.gson.C8775f;
import com.google.gson.p324y.C8928a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p468g.C13817d0;
import p468g.C13826f0;
import retrofit2.Converter;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit;

public final class GsonConverterFactory extends Factory {
    private final C8775f gson;

    private GsonConverterFactory(C8775f fVar) {
        if (fVar != null) {
            this.gson = fVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    public static GsonConverterFactory create() {
        return create(new C8775f());
    }

    public Converter<?, C13817d0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.mo32306a(C8928a.m41700b(type)));
    }

    public Converter<C13826f0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.mo32306a(C8928a.m41700b(type)));
    }

    public static GsonConverterFactory create(C8775f fVar) {
        return new GsonConverterFactory(fVar);
    }
}
