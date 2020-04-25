package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p201f.p202a.C5952h;
import p468g.C13813c0;
import retrofit2.CallAdapter.Factory;

final class DefaultCallAdapterFactory extends Factory {
    @C5952h
    private final Executor callbackExecutor;

    static final class ExecutorCallbackCall<T> implements Call<T> {
        final Executor callbackExecutor;
        final Call<T> delegate;

        ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        public void cancel() {
            this.delegate.cancel();
        }

        public void enqueue(final Callback<T> callback) {
            Utils.checkNotNull(callback, "callback == null");
            this.delegate.enqueue(new Callback<T>() {
                public void onFailure(Call<T> call, final Throwable th) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new Runnable() {
                        public void run() {
                            C157581 r0 = C157581.this;
                            callback.onFailure(ExecutorCallbackCall.this, th);
                        }
                    });
                }

                public void onResponse(Call<T> call, final Response<T> response) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new Runnable() {
                        public void run() {
                            if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                                C157581 r0 = C157581.this;
                                callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                                return;
                            }
                            C157581 r02 = C157581.this;
                            callback.onResponse(ExecutorCallbackCall.this, response);
                        }
                    });
                }
            });
        }

        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        public C13813c0 request() {
            return this.delegate.request();
        }

        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }
    }

    DefaultCallAdapterFactory(@C5952h Executor executor) {
        this.callbackExecutor = executor;
    }

    @C5952h
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
            if (!Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.callbackExecutor;
            }
            return new CallAdapter<Object, Call<?>>() {
                public Type responseType() {
                    return parameterUpperBound;
                }

                public Call<Object> adapt(Call<Object> call) {
                    Executor executor = executor;
                    return executor == null ? call : new ExecutorCallbackCall(executor, call);
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
