package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p279f.C6610c;
import p201f.p202a.C5952h;
import p468g.C13817d0;
import p468g.C13866u;
import p468g.C13873y.C13875b;

abstract class ParameterHandler<T> {

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, C13817d0> converter;
        private final Method method;

        /* renamed from: p */
        private final int f45034p;

        Body(Method method2, int i, Converter<T, C13817d0> converter2) {
            this.method = method2;
            this.f45034p = i;
            this.converter = converter2;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody((C13817d0) this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f45034p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw Utils.parameterError(method2, e, i, sb.toString(), new Object[0]);
                }
            } else {
                throw Utils.parameterError(this.method, this.f45034p, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException {
            if (t != null) {
                String str = (String) this.valueConverter.convert(t);
                if (str != null) {
                    requestBuilder.addFormField(this.name, str, this.encoded);
                }
            }
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f45035p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f45035p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.valueConverter.convert(value);
                            if (str3 != null) {
                                requestBuilder.addFormField(str, str3, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f45035p;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.valueConverter.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f45035p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw Utils.parameterError(method3, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f45035p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f45035p, "Field map was null.", new Object[0]);
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException {
            if (t != null) {
                String str = (String) this.valueConverter.convert(t);
                if (str != null) {
                    requestBuilder.addHeader(this.name, str);
                }
            }
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f45036p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method2, int i, Converter<T, String> converter) {
            this.method = method2;
            this.f45036p = i;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(str, (String) this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f45036p;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f45036p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f45036p, "Header map was null.", new Object[0]);
        }
    }

    static final class Headers extends ParameterHandler<C13866u> {
        private final Method method;

        /* renamed from: p */
        private final int f45037p;

        Headers(Method method2, int i) {
            this.method = method2;
            this.f45037p = i;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h C13866u uVar) {
            if (uVar != null) {
                requestBuilder.addHeaders(uVar);
            } else {
                throw Utils.parameterError(this.method, this.f45037p, "Headers parameter must not be null.", new Object[0]);
            }
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, C13817d0> converter;
        private final C13866u headers;
        private final Method method;

        /* renamed from: p */
        private final int f45038p;

        Part(Method method2, int i, C13866u uVar, Converter<T, C13817d0> converter2) {
            this.method = method2;
            this.f45038p = i;
            this.headers = uVar;
            this.converter = converter2;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.headers, (C13817d0) this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f45038p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw Utils.parameterError(method2, i, sb.toString(), e);
                }
            }
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f45039p;
        private final String transferEncoding;
        private final Converter<T, C13817d0> valueConverter;

        PartMap(Method method2, int i, Converter<T, C13817d0> converter, String str) {
            this.method = method2;
            this.f45039p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            requestBuilder.addPart(C13866u.m59238a(C6610c.f18396R, sb.toString(), "Content-Transfer-Encoding", this.transferEncoding), (C13817d0) this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f45039p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw Utils.parameterError(method2, i, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f45039p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f45039p, "Part map was null.", new Object[0]);
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p */
        private final int f45040p;
        private final Converter<T, String> valueConverter;

        Path(Method method2, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f45040p = i;
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, (String) this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method2 = this.method;
            int i = this.f45040p;
            StringBuilder sb = new StringBuilder();
            sb.append("Path parameter \"");
            sb.append(this.name);
            sb.append("\" value must not be null.");
            throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException {
            if (t != null) {
                String str = (String) this.valueConverter.convert(t);
                if (str != null) {
                    requestBuilder.addQueryParam(this.name, str, this.encoded);
                }
            }
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f45041p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f45041p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.valueConverter.convert(value);
                            if (str3 != null) {
                                requestBuilder.addQueryParam(str, str3, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f45041p;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.valueConverter.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw Utils.parameterError(method2, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f45041p;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw Utils.parameterError(method3, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f45041p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f45041p, "Query map was null", new Object[0]);
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam((String) this.nameConverter.convert(t), null, this.encoded);
            }
        }
    }

    static final class RawPart extends ParameterHandler<C13875b> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h C13875b bVar) {
            if (bVar != null) {
                requestBuilder.addPart(bVar);
            }
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p */
        private final int f45042p;

        RelativeUrl(Method method2, int i) {
            this.method = method2;
            this.f45042p = i;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
            } else {
                throw Utils.parameterError(this.method, this.f45042p, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls2) {
            this.cls = cls2;
        }

        /* access modifiers changed from: 0000 */
        public void apply(RequestBuilder requestBuilder, @C5952h T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }

    ParameterHandler() {
    }

    /* access modifiers changed from: 0000 */
    public abstract void apply(RequestBuilder requestBuilder, @C5952h T t) throws IOException;

    /* access modifiers changed from: 0000 */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* access modifiers changed from: 0000 */
            public void apply(RequestBuilder requestBuilder, @C5952h Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* access modifiers changed from: 0000 */
            public void apply(RequestBuilder requestBuilder, @C5952h Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T apply : iterable) {
                        ParameterHandler.this.apply(requestBuilder, apply);
                    }
                }
            }
        };
    }
}
