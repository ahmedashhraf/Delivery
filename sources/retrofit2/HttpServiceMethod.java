package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import p201f.p202a.C5952h;
import p468g.C13821e.C13822a;
import p468g.C13823e0;
import p468g.C13826f0;

abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final C13822a callFactory;
    private final RequestFactory requestFactory;
    private final Converter<C13826f0, ResponseT> responseConverter;

    static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        CallAdapted(RequestFactory requestFactory, C13822a aVar, Converter<C13826f0, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter2) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter2;
        }

        /* access modifiers changed from: protected */
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }
    }

    static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        SuspendForBody(RequestFactory requestFactory, C13822a aVar, Converter<C13826f0, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter2, boolean z) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter2;
            this.isNullable = z;
        }

        /* access modifiers changed from: protected */
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Object obj;
            Call call2 = (Call) this.callAdapter.adapt(call);
            Continuation continuation = objArr[objArr.length - 1];
            try {
                if (this.isNullable) {
                    obj = KotlinExtensions.awaitNullable(call2, continuation);
                } else {
                    obj = KotlinExtensions.await(call2, continuation);
                }
                return obj;
            } catch (Exception e) {
                return KotlinExtensions.yieldAndThrow(e, continuation);
            }
        }
    }

    static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        SuspendForResponse(RequestFactory requestFactory, C13822a aVar, Converter<C13826f0, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter2) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter2;
        }

        /* access modifiers changed from: protected */
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            return KotlinExtensions.awaitResponse((Call) this.callAdapter.adapt(call), objArr[objArr.length - 1]);
        }
    }

    HttpServiceMethod(RequestFactory requestFactory2, C13822a aVar, Converter<C13826f0, ResponseT> converter) {
        this.requestFactory = requestFactory2;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<C13826f0, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory2) {
        Type type;
        boolean z;
        Class<Response> cls = Response.class;
        boolean z2 = requestFactory2.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) != cls || !(parameterLowerBound instanceof ParameterizedType)) {
                z = false;
            } else {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                z = true;
            }
            type = new ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        CallAdapter createCallAdapter = createCallAdapter(retrofit, method, type, annotations);
        Type responseType = createCallAdapter.responseType();
        if (responseType == C13823e0.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(Utils.getRawType(responseType).getName());
            sb.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw Utils.methodError(method, sb.toString(), new Object[0]);
        } else if (responseType == cls) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!requestFactory2.httpMethod.equals("HEAD") || Void.class.equals(responseType)) {
            Converter createResponseConverter = createResponseConverter(retrofit, method, responseType);
            C13822a aVar = retrofit.callFactory;
            if (!z2) {
                return new CallAdapted(requestFactory2, aVar, createResponseConverter, createCallAdapter);
            }
            if (z) {
                return new SuspendForResponse(requestFactory2, aVar, createResponseConverter, createCallAdapter);
            }
            SuspendForBody suspendForBody = new SuspendForBody(requestFactory2, aVar, createResponseConverter, createCallAdapter, false);
            return suspendForBody;
        } else {
            throw Utils.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @C5952h
    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    /* access modifiers changed from: 0000 */
    @C5952h
    public final ReturnT invoke(Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, objArr, this.callFactory, this.responseConverter), objArr);
    }
}
