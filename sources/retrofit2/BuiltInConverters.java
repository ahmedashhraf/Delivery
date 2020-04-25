package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.C14737p0;
import p201f.p202a.C5952h;
import p468g.C13817d0;
import p468g.C13826f0;
import retrofit2.Converter.Factory;
import retrofit2.http.Streaming;

final class BuiltInConverters extends Factory {
    private boolean checkForKotlinUnit = true;

    static final class BufferingResponseBodyConverter implements Converter<C13826f0, C13826f0> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        public C13826f0 convert(C13826f0 f0Var) throws IOException {
            try {
                return Utils.buffer(f0Var);
            } finally {
                f0Var.close();
            }
        }
    }

    static final class RequestBodyConverter implements Converter<C13817d0, C13817d0> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        RequestBodyConverter() {
        }

        public C13817d0 convert(C13817d0 d0Var) {
            return d0Var;
        }
    }

    static final class StreamingResponseBodyConverter implements Converter<C13826f0, C13826f0> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        StreamingResponseBodyConverter() {
        }

        public C13826f0 convert(C13826f0 f0Var) {
            return f0Var;
        }
    }

    static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        ToStringConverter() {
        }

        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class UnitResponseBodyConverter implements Converter<C13826f0, C14737p0> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        public C14737p0 convert(C13826f0 f0Var) {
            f0Var.close();
            return C14737p0.f42983a;
        }
    }

    static final class VoidResponseBodyConverter implements Converter<C13826f0, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        public Void convert(C13826f0 f0Var) {
            f0Var.close();
            return null;
        }
    }

    BuiltInConverters() {
    }

    @C5952h
    public Converter<?, C13817d0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (C13817d0.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @C5952h
    public Converter<C13826f0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Converter<C13826f0, ?> converter;
        if (type == C13826f0.class) {
            if (Utils.isAnnotationPresent(annotationArr, Streaming.class)) {
                converter = StreamingResponseBodyConverter.INSTANCE;
            } else {
                converter = BufferingResponseBodyConverter.INSTANCE;
            }
            return converter;
        } else if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        } else {
            if (this.checkForKotlinUnit && type == C14737p0.class) {
                try {
                    return UnitResponseBodyConverter.INSTANCE;
                } catch (NoClassDefFoundError unused) {
                    this.checkForKotlinUnit = false;
                }
            }
            return null;
        }
    }
}
