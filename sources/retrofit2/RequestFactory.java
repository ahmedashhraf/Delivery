package retrofit2;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import p201f.p202a.C5952h;
import p468g.C13813c0;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13868v;
import p468g.C13872x;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

final class RequestFactory {
    private final C13868v baseUrl;
    @C5952h
    private final C13872x contentType;
    private final boolean hasBody;
    @C5952h
    private final C13866u headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;
    @C5952h
    private final String relativeUrl;

    static final class Builder {
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        @C5952h
        C13872x contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;
        @C5952h
        C13866u headers;
        @C5952h
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;
        @C5952h
        ParameterHandler<?>[] parameterHandlers;
        final Type[] parameterTypes;
        @C5952h
        String relativeUrl;
        @C5952h
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;

        Builder(Retrofit retrofit3, Method method2) {
            this.retrofit = retrofit3;
            this.method = method2;
            this.methodAnnotations = method2.getAnnotations();
            this.parameterTypes = method2.getGenericParameterTypes();
            this.parameterAnnotationsArray = method2.getParameterAnnotations();
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Class] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Class<?> boxIfPrimitive(java.lang.Class r1) {
            /*
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L_0x0007
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L_0x0007:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto L_0x000e
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            L_0x000e:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L_0x0015
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L_0x0015:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L_0x001c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L_0x001c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L_0x0023
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L_0x0023:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L_0x002a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L_0x002a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L_0x0031
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L_0x0031:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L_0x0037
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.RequestFactory.Builder.boxIfPrimitive(java.lang.Class):java.lang.Class");
        }

        private C13866u parseHeaders(String[] strArr) {
            C13867a aVar = new C13867a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.contentType = C13872x.m59360a(trim);
                    } catch (IllegalArgumentException e) {
                        throw Utils.methodError(this.method, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo43625a(substring, trim);
                }
            }
            return aVar.mo43627a();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z) {
            String str3 = this.httpMethod;
            if (str3 == null) {
                this.httpMethod = str;
                this.hasBody = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (PARAM_URL_REGEX.matcher(substring).find()) {
                            throw Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.relativeUrl = str2;
                    this.relativeUrlParamNames = parsePathParameters(str2);
                    return;
                }
                return;
            }
            throw Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof DELETE) {
                parseHttpMethodAndPath("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                parseHttpMethodAndPath("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                parseHttpMethodAndPath("HEAD", ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                parseHttpMethodAndPath(C7304t.f20670f, ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                parseHttpMethodAndPath("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                parseHttpMethodAndPath("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                parseHttpMethodAndPath("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof Headers) {
                String[] value = ((Headers) annotation).value();
                if (value.length != 0) {
                    this.headers = parseHeaders(value);
                } else {
                    throw Utils.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
                }
            } else {
                String str = "Only one encoding annotation is allowed.";
                if (annotation instanceof Multipart) {
                    if (!this.isFormEncoded) {
                        this.isMultipart = true;
                        return;
                    }
                    throw Utils.methodError(this.method, str, new Object[0]);
                } else if (!(annotation instanceof FormUrlEncoded)) {
                } else {
                    if (!this.isMultipart) {
                        this.isFormEncoded = true;
                        return;
                    }
                    throw Utils.methodError(this.method, str, new Object[0]);
                }
            }
        }

        @C5952h
        private ParameterHandler<?> parseParameter(int i, Type type, @C5952h Annotation[] annotationArr, boolean z) {
            ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation parseParameterAnnotation : annotationArr) {
                    ParameterHandler<?> parseParameterAnnotation2 = parseParameterAnnotation(i, type, annotationArr, parseParameterAnnotation);
                    if (parseParameterAnnotation2 != null) {
                        if (parameterHandler == null) {
                            parameterHandler = parseParameterAnnotation2;
                        } else {
                            throw Utils.parameterError(this.method, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            if (z) {
                try {
                    if (Utils.getRawType(type) == Continuation.class) {
                        this.isKotlinSuspendFunction = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw Utils.parameterError(this.method, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            if ("android.net.Uri".equals(((java.lang.Class) r12).getName()) != false) goto L_0x0051;
         */
        @p201f.p202a.C5952h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private retrofit2.ParameterHandler<?> parseParameterAnnotation(int r11, java.lang.reflect.Type r12, java.lang.annotation.Annotation[] r13, java.lang.annotation.Annotation r14) {
            /*
                r10 = this;
                java.lang.Class<g.y$b> r0 = p468g.C13873y.C13875b.class
                boolean r1 = r14 instanceof retrofit2.http.Url
                java.lang.String r2 = "@Path parameters may not be used with @Url."
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x009d
                r10.validateResolvableType(r11, r12)
                boolean r13 = r10.gotUrl
                if (r13 != 0) goto L_0x0092
                boolean r13 = r10.gotPath
                if (r13 != 0) goto L_0x0089
                boolean r13 = r10.gotQuery
                if (r13 != 0) goto L_0x007e
                boolean r13 = r10.gotQueryName
                if (r13 != 0) goto L_0x0073
                boolean r13 = r10.gotQueryMap
                if (r13 != 0) goto L_0x0068
                java.lang.String r13 = r10.relativeUrl
                if (r13 != 0) goto L_0x0059
                r10.gotUrl = r3
                java.lang.Class<g.v> r13 = p468g.C13868v.class
                if (r12 == r13) goto L_0x0051
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                if (r12 == r13) goto L_0x0051
                java.lang.Class<java.net.URI> r13 = java.net.URI.class
                if (r12 == r13) goto L_0x0051
                boolean r13 = r12 instanceof java.lang.Class
                if (r13 == 0) goto L_0x0046
                java.lang.Class r12 = (java.lang.Class) r12
                java.lang.String r12 = r12.getName()
                java.lang.String r13 = "android.net.Uri"
                boolean r12 = r13.equals(r12)
                if (r12 == 0) goto L_0x0046
                goto L_0x0051
            L_0x0046:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0051:
                retrofit2.ParameterHandler$RelativeUrl r12 = new retrofit2.ParameterHandler$RelativeUrl
                java.lang.reflect.Method r13 = r10.method
                r12.<init>(r13, r11)
                return r12
            L_0x0059:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = r10.httpMethod
                r13[r4] = r14
                java.lang.String r14 = "@Url cannot be used with @%s URL"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0068:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0073:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Url parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x007e:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Url parameter must not come after a @Query."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0089:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r2, r13)
                throw r11
            L_0x0092:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "Multiple @Url method annotations found."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x009d:
                boolean r1 = r14 instanceof retrofit2.http.Path
                if (r1 == 0) goto L_0x0110
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.gotQuery
                if (r0 != 0) goto L_0x0105
                boolean r0 = r10.gotQueryName
                if (r0 != 0) goto L_0x00fa
                boolean r0 = r10.gotQueryMap
                if (r0 != 0) goto L_0x00ef
                boolean r0 = r10.gotUrl
                if (r0 != 0) goto L_0x00e6
                java.lang.String r0 = r10.relativeUrl
                if (r0 == 0) goto L_0x00d7
                r10.gotPath = r3
                retrofit2.http.Path r14 = (retrofit2.http.Path) r14
                java.lang.String r3 = r14.value()
                r10.validatePathName(r11, r3)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r4 = r0.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Path r12 = new retrofit2.ParameterHandler$Path
                java.lang.reflect.Method r1 = r10.method
                boolean r5 = r14.encoded()
                r0 = r12
                r2 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r12
            L_0x00d7:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r14 = r10.httpMethod
                r13[r4] = r14
                java.lang.String r14 = "@Path can only be used with relative url on @%s"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x00e6:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r2, r13)
                throw r11
            L_0x00ef:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryMap."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x00fa:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Path parameter must not come after a @QueryName."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0105:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "A @Path parameter must not come after a @Query."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0110:
                boolean r1 = r14 instanceof retrofit2.http.Query
                java.lang.String r2 = "<String>)"
                java.lang.String r5 = " must include generic type (e.g., "
                if (r1 == 0) goto L_0x019d
                r10.validateResolvableType(r11, r12)
                retrofit2.http.Query r14 = (retrofit2.http.Query) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                r10.gotQuery = r3
                java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
                boolean r3 = r3.isAssignableFrom(r1)
                if (r3 == 0) goto L_0x0173
                boolean r3 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r3 == 0) goto L_0x014d
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler r11 = r12.iterable()
                return r11
            L_0x014d:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x0173:
                boolean r11 = r1.isArray()
                if (r11 == 0) goto L_0x0191
                java.lang.Class r11 = r1.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler r11 = r12.array()
                return r11
            L_0x0191:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Query r12 = new retrofit2.ParameterHandler$Query
                r12.<init>(r0, r11, r14)
                return r12
            L_0x019d:
                boolean r1 = r14 instanceof retrofit2.http.QueryName
                if (r1 == 0) goto L_0x0222
                r10.validateResolvableType(r11, r12)
                retrofit2.http.QueryName r14 = (retrofit2.http.QueryName) r14
                boolean r14 = r14.encoded()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                r10.gotQueryName = r3
                java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x01f8
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L_0x01d2
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                retrofit2.ParameterHandler r11 = r12.iterable()
                return r11
            L_0x01d2:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x01f8:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L_0x0216
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                retrofit2.ParameterHandler r11 = r12.array()
                return r11
            L_0x0216:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$QueryName r12 = new retrofit2.ParameterHandler$QueryName
                r12.<init>(r11, r14)
                return r12
            L_0x0222:
                boolean r1 = r14 instanceof retrofit2.http.QueryMap
                java.lang.String r6 = "Map must include generic types (e.g., Map<String, String>)"
                if (r1 == 0) goto L_0x0293
                r10.validateResolvableType(r11, r12)
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                r10.gotQueryMap = r3
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x0288
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r0, r1)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x027f
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L_0x0265
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r3, r12)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r12 = r0.stringConverter(r12, r13)
                retrofit2.ParameterHandler$QueryMap r13 = new retrofit2.ParameterHandler$QueryMap
                java.lang.reflect.Method r0 = r10.method
                retrofit2.http.QueryMap r14 = (retrofit2.http.QueryMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L_0x0265:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@QueryMap keys must be of type String: "
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x027f:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r6, r13)
                throw r11
            L_0x0288:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@QueryMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0293:
                boolean r1 = r14 instanceof retrofit2.http.Header
                if (r1 == 0) goto L_0x0316
                r10.validateResolvableType(r11, r12)
                retrofit2.http.Header r14 = (retrofit2.http.Header) r14
                java.lang.String r14 = r14.value()
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x02ec
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L_0x02c6
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                retrofit2.ParameterHandler r11 = r12.iterable()
                return r11
            L_0x02c6:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r0.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x02ec:
                boolean r11 = r0.isArray()
                if (r11 == 0) goto L_0x030a
                java.lang.Class r11 = r0.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                retrofit2.ParameterHandler r11 = r12.array()
                return r11
            L_0x030a:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Header r12 = new retrofit2.ParameterHandler$Header
                r12.<init>(r14, r11)
                return r12
            L_0x0316:
                boolean r1 = r14 instanceof retrofit2.http.HeaderMap
                if (r1 == 0) goto L_0x0389
                java.lang.Class<g.u> r14 = p468g.C13866u.class
                if (r12 != r14) goto L_0x0326
                retrofit2.ParameterHandler$Headers r12 = new retrofit2.ParameterHandler$Headers
                java.lang.reflect.Method r13 = r10.method
                r12.<init>(r13, r11)
                return r12
            L_0x0326:
                r10.validateResolvableType(r11, r12)
                java.lang.Class r14 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                boolean r0 = r0.isAssignableFrom(r14)
                if (r0 == 0) goto L_0x037e
                java.lang.Class<java.util.Map> r0 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r14, r0)
                boolean r14 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r14 == 0) goto L_0x0375
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r14 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                if (r0 != r14) goto L_0x035b
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r3, r12)
                retrofit2.Retrofit r14 = r10.retrofit
                retrofit2.Converter r12 = r14.stringConverter(r12, r13)
                retrofit2.ParameterHandler$HeaderMap r13 = new retrofit2.ParameterHandler$HeaderMap
                java.lang.reflect.Method r14 = r10.method
                r13.<init>(r14, r11, r12)
                return r13
            L_0x035b:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "@HeaderMap keys must be of type String: "
                r13.append(r0)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x0375:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r6, r13)
                throw r11
            L_0x037e:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@HeaderMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0389:
                boolean r1 = r14 instanceof retrofit2.http.Field
                if (r1 == 0) goto L_0x0421
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.isFormEncoded
                if (r0 == 0) goto L_0x0416
                retrofit2.http.Field r14 = (retrofit2.http.Field) r14
                java.lang.String r0 = r14.value()
                boolean r14 = r14.encoded()
                r10.gotField = r3
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.lang.Iterable> r3 = java.lang.Iterable.class
                boolean r3 = r3.isAssignableFrom(r1)
                if (r3 == 0) goto L_0x03ec
                boolean r3 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r3 == 0) goto L_0x03c6
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r11 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler r11 = r12.iterable()
                return r11
            L_0x03c6:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r1.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x03ec:
                boolean r11 = r1.isArray()
                if (r11 == 0) goto L_0x040a
                java.lang.Class r11 = r1.getComponentType()
                java.lang.Class r11 = boxIfPrimitive(r11)
                retrofit2.Retrofit r12 = r10.retrofit
                retrofit2.Converter r11 = r12.stringConverter(r11, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                retrofit2.ParameterHandler r11 = r12.array()
                return r11
            L_0x040a:
                retrofit2.Retrofit r11 = r10.retrofit
                retrofit2.Converter r11 = r11.stringConverter(r12, r13)
                retrofit2.ParameterHandler$Field r12 = new retrofit2.ParameterHandler$Field
                r12.<init>(r0, r11, r14)
                return r12
            L_0x0416:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@Field parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0421:
                boolean r1 = r14 instanceof retrofit2.http.FieldMap
                if (r1 == 0) goto L_0x049f
                r10.validateResolvableType(r11, r12)
                boolean r0 = r10.isFormEncoded
                if (r0 == 0) goto L_0x0494
                java.lang.Class r0 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                boolean r1 = r1.isAssignableFrom(r0)
                if (r1 == 0) goto L_0x0489
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r0, r1)
                boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x0480
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r0 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L_0x0466
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r3, r12)
                retrofit2.Retrofit r0 = r10.retrofit
                retrofit2.Converter r12 = r0.stringConverter(r12, r13)
                r10.gotField = r3
                retrofit2.ParameterHandler$FieldMap r13 = new retrofit2.ParameterHandler$FieldMap
                java.lang.reflect.Method r0 = r10.method
                retrofit2.http.FieldMap r14 = (retrofit2.http.FieldMap) r14
                boolean r14 = r14.encoded()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L_0x0466:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@FieldMap keys must be of type String: "
                r13.append(r14)
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x0480:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r6, r13)
                throw r11
            L_0x0489:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@FieldMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0494:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@FieldMap parameters can only be used with form encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x049f:
                boolean r1 = r14 instanceof retrofit2.http.Part
                if (r1 == 0) goto L_0x062d
                r10.validateResolvableType(r11, r12)
                boolean r1 = r10.isMultipart
                if (r1 == 0) goto L_0x0622
                retrofit2.http.Part r14 = (retrofit2.http.Part) r14
                r10.gotPart = r3
                java.lang.String r1 = r14.value()
                java.lang.Class r6 = retrofit2.Utils.getRawType(r12)
                boolean r7 = r1.isEmpty()
                if (r7 == 0) goto L_0x0542
                java.lang.Class<java.lang.Iterable> r13 = java.lang.Iterable.class
                boolean r13 = r13.isAssignableFrom(r6)
                java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r13 == 0) goto L_0x0510
                boolean r13 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L_0x04ea
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class r12 = retrofit2.Utils.getRawType(r12)
                boolean r12 = r0.isAssignableFrom(r12)
                if (r12 == 0) goto L_0x04e1
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                retrofit2.ParameterHandler r11 = r11.iterable()
                return r11
            L_0x04e1:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x04ea:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x0510:
                boolean r12 = r6.isArray()
                if (r12 == 0) goto L_0x0530
                java.lang.Class r12 = r6.getComponentType()
                boolean r12 = r0.isAssignableFrom(r12)
                if (r12 == 0) goto L_0x0527
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                retrofit2.ParameterHandler r11 = r11.array()
                return r11
            L_0x0527:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0530:
                boolean r12 = r0.isAssignableFrom(r6)
                if (r12 == 0) goto L_0x0539
                retrofit2.ParameterHandler$RawPart r11 = retrofit2.ParameterHandler.RawPart.INSTANCE
                return r11
            L_0x0539:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0542:
                r7 = 4
                java.lang.String[] r7 = new java.lang.String[r7]
                java.lang.String r8 = "Content-Disposition"
                r7[r4] = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "form-data; name=\""
                r8.append(r9)
                r8.append(r1)
                java.lang.String r1 = "\""
                r8.append(r1)
                java.lang.String r1 = r8.toString()
                r7[r3] = r1
                r1 = 2
                java.lang.String r3 = "Content-Transfer-Encoding"
                r7[r1] = r3
                r1 = 3
                java.lang.String r14 = r14.encoding()
                r7[r1] = r14
                g.u r14 = p468g.C13866u.m59238a(r7)
                java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
                boolean r1 = r1.isAssignableFrom(r6)
                java.lang.String r3 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r1 == 0) goto L_0x05d2
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L_0x05ac
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L_0x05a3
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                retrofit2.ParameterHandler r11 = r13.iterable()
                return r11
            L_0x05a3:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r3, r13)
                throw r11
            L_0x05ac:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = r6.getSimpleName()
                r13.append(r14)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x05d2:
                boolean r1 = r6.isArray()
                if (r1 == 0) goto L_0x0603
                java.lang.Class r12 = r6.getComponentType()
                java.lang.Class r12 = boxIfPrimitive(r12)
                boolean r0 = r0.isAssignableFrom(r12)
                if (r0 != 0) goto L_0x05fa
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                retrofit2.ParameterHandler r11 = r13.array()
                return r11
            L_0x05fa:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r3, r13)
                throw r11
            L_0x0603:
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 != 0) goto L_0x0619
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.ParameterHandler$Part r13 = new retrofit2.ParameterHandler$Part
                java.lang.reflect.Method r0 = r10.method
                r13.<init>(r0, r11, r14, r12)
                return r13
            L_0x0619:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r3, r13)
                throw r11
            L_0x0622:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@Part parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x062d:
                boolean r1 = r14 instanceof retrofit2.http.PartMap
                if (r1 == 0) goto L_0x06c2
                r10.validateResolvableType(r11, r12)
                boolean r1 = r10.isMultipart
                if (r1 == 0) goto L_0x06b7
                r10.gotPart = r3
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x06ac
                java.lang.Class<java.util.Map> r2 = java.util.Map.class
                java.lang.reflect.Type r12 = retrofit2.Utils.getSupertype(r12, r1, r2)
                boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
                if (r1 == 0) goto L_0x06a3
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                java.lang.reflect.Type r1 = retrofit2.Utils.getParameterUpperBound(r4, r12)
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                if (r2 != r1) goto L_0x0689
                java.lang.reflect.Type r12 = retrofit2.Utils.getParameterUpperBound(r3, r12)
                java.lang.Class r1 = retrofit2.Utils.getRawType(r12)
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L_0x067e
                retrofit2.Retrofit r0 = r10.retrofit
                java.lang.annotation.Annotation[] r1 = r10.methodAnnotations
                retrofit2.Converter r12 = r0.requestBodyConverter(r12, r13, r1)
                retrofit2.http.PartMap r14 = (retrofit2.http.PartMap) r14
                retrofit2.ParameterHandler$PartMap r13 = new retrofit2.ParameterHandler$PartMap
                java.lang.reflect.Method r0 = r10.method
                java.lang.String r14 = r14.encoding()
                r13.<init>(r0, r11, r12, r14)
                return r13
            L_0x067e:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0689:
                java.lang.reflect.Method r12 = r10.method
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "@PartMap keys must be of type String: "
                r13.append(r14)
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                java.lang.Object[] r14 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r13, r14)
                throw r11
            L_0x06a3:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r6, r13)
                throw r11
            L_0x06ac:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@PartMap parameter type must be Map."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x06b7:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x06c2:
                boolean r0 = r14 instanceof retrofit2.http.Body
                if (r0 == 0) goto L_0x070b
                r10.validateResolvableType(r11, r12)
                boolean r14 = r10.isFormEncoded
                if (r14 != 0) goto L_0x0700
                boolean r14 = r10.isMultipart
                if (r14 != 0) goto L_0x0700
                boolean r14 = r10.gotBody
                if (r14 != 0) goto L_0x06f5
                retrofit2.Retrofit r14 = r10.retrofit     // Catch:{ RuntimeException -> 0x06e7 }
                java.lang.annotation.Annotation[] r0 = r10.methodAnnotations     // Catch:{ RuntimeException -> 0x06e7 }
                retrofit2.Converter r12 = r14.requestBodyConverter(r12, r13, r0)     // Catch:{ RuntimeException -> 0x06e7 }
                r10.gotBody = r3
                retrofit2.ParameterHandler$Body r13 = new retrofit2.ParameterHandler$Body
                java.lang.reflect.Method r14 = r10.method
                r13.<init>(r14, r11, r12)
                return r13
            L_0x06e7:
                r13 = move-exception
                java.lang.reflect.Method r14 = r10.method
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r4] = r12
                java.lang.String r12 = "Unable to create @Body converter for %s"
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r14, r13, r11, r12, r0)
                throw r11
            L_0x06f5:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "Multiple @Body method annotations found."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x0700:
                java.lang.reflect.Method r12 = r10.method
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r14 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r12, r11, r14, r13)
                throw r11
            L_0x070b:
                boolean r13 = r14 instanceof retrofit2.http.Tag
                if (r13 == 0) goto L_0x0762
                r10.validateResolvableType(r11, r12)
                java.lang.Class r12 = retrofit2.Utils.getRawType(r12)
                int r13 = r11 + -1
            L_0x0718:
                if (r13 < 0) goto L_0x075c
                retrofit2.ParameterHandler<?>[] r14 = r10.parameterHandlers
                r14 = r14[r13]
                boolean r0 = r14 instanceof retrofit2.ParameterHandler.Tag
                if (r0 == 0) goto L_0x0759
                retrofit2.ParameterHandler$Tag r14 = (retrofit2.ParameterHandler.Tag) r14
                java.lang.Class<T> r14 = r14.cls
                boolean r14 = r14.equals(r12)
                if (r14 != 0) goto L_0x072d
                goto L_0x0759
            L_0x072d:
                java.lang.reflect.Method r14 = r10.method
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "@Tag type "
                r0.append(r1)
                java.lang.String r12 = r12.getName()
                r0.append(r12)
                java.lang.String r12 = " is duplicate of parameter #"
                r0.append(r12)
                int r13 = r13 + r3
                r0.append(r13)
                java.lang.String r12 = " and would always overwrite its value."
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.RuntimeException r11 = retrofit2.Utils.parameterError(r14, r11, r12, r13)
                throw r11
            L_0x0759:
                int r13 = r13 + -1
                goto L_0x0718
            L_0x075c:
                retrofit2.ParameterHandler$Tag r11 = new retrofit2.ParameterHandler$Tag
                r11.<init>(r12)
                return r11
            L_0x0762:
                r11 = 0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.RequestFactory.Builder.parseParameterAnnotation(int, java.lang.reflect.Type, java.lang.annotation.Annotation[], java.lang.annotation.Annotation):retrofit2.ParameterHandler");
        }

        static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw Utils.parameterError(this.method, i, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            } else if (!this.relativeUrlParamNames.contains(str)) {
                throw Utils.parameterError(this.method, i, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        private void validateResolvableType(int i, Type type) {
            if (Utils.hasUnresolvableType(type)) {
                throw Utils.parameterError(this.method, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: 0000 */
        public RequestFactory build() {
            for (Annotation parseMethodAnnotation : this.methodAnnotations) {
                parseMethodAnnotation(parseMethodAnnotation);
            }
            if (this.httpMethod != null) {
                if (!this.hasBody) {
                    if (this.isMultipart) {
                        throw Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.isFormEncoded) {
                        throw Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.parameterAnnotationsArray.length;
                this.parameterHandlers = new ParameterHandler[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
                    Type type = this.parameterTypes[i2];
                    Annotation[] annotationArr = this.parameterAnnotationsArray[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    parameterHandlerArr[i2] = parseParameter(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.relativeUrl == null && !this.gotUrl) {
                    throw Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
                } else if (!this.isFormEncoded && !this.isMultipart && !this.hasBody && this.gotBody) {
                    throw Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.isFormEncoded && !this.gotField) {
                    throw Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.isMultipart || this.gotPart) {
                    return new RequestFactory(this);
                } else {
                    throw Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    RequestFactory(Builder builder) {
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }

    static RequestFactory parseAnnotations(Retrofit retrofit, Method method2) {
        return new Builder(retrofit, method2).build();
    }

    /* access modifiers changed from: 0000 */
    public C13813c0 create(Object[] objArr) throws IOException {
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length == parameterHandlerArr.length) {
            RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
            if (this.isKotlinSuspendFunction) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                parameterHandlerArr[i].apply(requestBuilder, objArr[i]);
            }
            return requestBuilder.get().mo43365a(Invocation.class, new Invocation(this.method, arrayList)).mo43371a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(parameterHandlerArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
