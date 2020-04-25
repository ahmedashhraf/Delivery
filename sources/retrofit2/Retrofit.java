package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p201f.p202a.C5952h;
import p468g.C13817d0;
import p468g.C13821e.C13822a;
import p468g.C13826f0;
import p468g.C13868v;
import p468g.C13876z;
import retrofit2.CallAdapter.Factory;

public final class Retrofit {
    final C13868v baseUrl;
    final List<Factory> callAdapterFactories;
    final C13822a callFactory;
    @C5952h
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    private final Map<Method, ServiceMethod<?>> serviceMethodCache = new ConcurrentHashMap();
    final boolean validateEagerly;

    public static final class Builder {
        @C5952h
        private C13868v baseUrl;
        private final List<Factory> callAdapterFactories;
        @C5952h
        private C13822a callFactory;
        @C5952h
        private Executor callbackExecutor;
        private final List<Converter.Factory> converterFactories;
        private final Platform platform;
        private boolean validateEagerly;

        Builder(Platform platform2) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = platform2;
        }

        public Builder addCallAdapterFactory(Factory factory) {
            this.callAdapterFactories.add(Utils.checkNotNull(factory, "factory == null"));
            return this;
        }

        public Builder addConverterFactory(Converter.Factory factory) {
            this.converterFactories.add(Utils.checkNotNull(factory, "factory == null"));
            return this;
        }

        public Builder baseUrl(URL url) {
            Utils.checkNotNull(url, "baseUrl == null");
            return baseUrl(C13868v.m59278f(url.toString()));
        }

        public Retrofit build() {
            if (this.baseUrl != null) {
                C13822a aVar = this.callFactory;
                if (aVar == null) {
                    aVar = new C13876z();
                }
                C13822a aVar2 = aVar;
                Executor executor = this.callbackExecutor;
                if (executor == null) {
                    executor = this.platform.defaultCallbackExecutor();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.callAdapterFactories);
                arrayList.addAll(this.platform.defaultCallAdapterFactories(executor2));
                ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + this.platform.defaultConverterFactoriesSize());
                arrayList2.add(new BuiltInConverters());
                arrayList2.addAll(this.converterFactories);
                arrayList2.addAll(this.platform.defaultConverterFactories());
                Retrofit retrofit = new Retrofit(aVar2, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.validateEagerly);
                return retrofit;
            }
            throw new IllegalStateException("Base URL required.");
        }

        public List<Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(C13822a aVar) {
            this.callFactory = (C13822a) Utils.checkNotNull(aVar, "factory == null");
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            this.callbackExecutor = (Executor) Utils.checkNotNull(executor, "executor == null");
            return this;
        }

        public Builder client(C13876z zVar) {
            return callFactory((C13822a) Utils.checkNotNull(zVar, "client == null"));
        }

        public List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean z) {
            this.validateEagerly = z;
            return this;
        }

        public Builder baseUrl(String str) {
            Utils.checkNotNull(str, "baseUrl == null");
            return baseUrl(C13868v.m59278f(str));
        }

        public Builder() {
            this(Platform.get());
        }

        public Builder baseUrl(C13868v vVar) {
            Utils.checkNotNull(vVar, "baseUrl == null");
            List l = vVar.mo43654l();
            if ("".equals(l.get(l.size() - 1))) {
                this.baseUrl = vVar;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("baseUrl must end in /: ");
            sb.append(vVar);
            throw new IllegalArgumentException(sb.toString());
        }

        Builder(Retrofit retrofit) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = Platform.get();
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            int size = retrofit.converterFactories.size() - this.platform.defaultConverterFactoriesSize();
            for (int i = 1; i < size; i++) {
                this.converterFactories.add(retrofit.converterFactories.get(i));
            }
            int size2 = retrofit.callAdapterFactories.size() - this.platform.defaultCallAdapterFactoriesSize();
            for (int i2 = 0; i2 < size2; i2++) {
                this.callAdapterFactories.add(retrofit.callAdapterFactories.get(i2));
            }
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }
    }

    Retrofit(C13822a aVar, C13868v vVar, List<Converter.Factory> list, List<Factory> list2, @C5952h Executor executor, boolean z) {
        this.callFactory = aVar;
        this.baseUrl = vVar;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z;
    }

    private void eagerlyValidateMethods(Class<?> cls) {
        Method[] declaredMethods;
        Platform platform = Platform.get();
        for (Method method : cls.getDeclaredMethods()) {
            if (!platform.isDefaultMethod(method) && !Modifier.isStatic(method.getModifiers())) {
                loadServiceMethod(method);
            }
        }
    }

    public C13868v baseUrl() {
        return this.baseUrl;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public C13822a callFactory() {
        return this.callFactory;
    }

    @C5952h
    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(final Class<T> cls) {
        Utils.validateServiceInterface(cls);
        if (this.validateEagerly) {
            eagerlyValidateMethods(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            private final Object[] emptyArgs = new Object[0];
            private final Platform platform = Platform.get();

            @C5952h
            public Object invoke(Object obj, Method method, @C5952h Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.platform.isDefaultMethod(method)) {
                    return this.platform.invokeDefaultMethod(method, cls, obj, objArr);
                }
                ServiceMethod loadServiceMethod = Retrofit.this.loadServiceMethod(method);
                if (objArr == null) {
                    objArr = this.emptyArgs;
                }
                return loadServiceMethod.invoke(objArr);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public ServiceMethod<?> loadServiceMethod(Method method) {
        ServiceMethod<?> serviceMethod;
        ServiceMethod<?> serviceMethod2 = (ServiceMethod) this.serviceMethodCache.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.serviceMethodCache) {
            serviceMethod = (ServiceMethod) this.serviceMethodCache.get(method);
            if (serviceMethod == null) {
                serviceMethod = ServiceMethod.parseAnnotations(this, method);
                this.serviceMethodCache.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(@C5952h Factory factory, Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "returnType == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int indexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = ((Factory) this.callAdapterFactories.get(i)).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((Factory) this.callAdapterFactories.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((Factory) this.callAdapterFactories.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, C13817d0> nextRequestBodyConverter(@C5952h Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "parameterAnnotations == null");
        Utils.checkNotNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, C13817d0> requestBodyConverter = ((Converter.Factory) this.converterFactories.get(i)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (requestBodyConverter != null) {
                return requestBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((Converter.Factory) this.converterFactories.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((Converter.Factory) this.converterFactories.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<C13826f0, T> nextResponseBodyConverter(@C5952h Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<C13826f0, T> responseBodyConverter = ((Converter.Factory) this.converterFactories.get(i)).responseBodyConverter(type, annotationArr, this);
            if (responseBodyConverter != null) {
                return responseBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((Converter.Factory) this.converterFactories.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((Converter.Factory) this.converterFactories.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, C13817d0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<C13826f0, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> stringConverter = ((Converter.Factory) this.converterFactories.get(i)).stringConverter(type, annotationArr, this);
            if (stringConverter != null) {
                return stringConverter;
            }
        }
        return ToStringConverter.INSTANCE;
    }
}
