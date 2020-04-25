package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p201f.p202a.C5952h;
import p468g.C13826f0;
import retrofit2.Converter.Factory;

@IgnoreJRERequirement
final class OptionalConverterFactory extends Factory {
    static final Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    static final class OptionalConverter<T> implements Converter<C13826f0, Optional<T>> {
        final Converter<C13826f0, T> delegate;

        OptionalConverter(Converter<C13826f0, T> converter) {
            this.delegate = converter;
        }

        public Optional<T> convert(C13826f0 f0Var) throws IOException {
            return Optional.ofNullable(this.delegate.convert(f0Var));
        }
    }

    OptionalConverterFactory() {
    }

    @C5952h
    public Converter<C13826f0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
