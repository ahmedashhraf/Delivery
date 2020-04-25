package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p201f.p202a.C5952h;
import retrofit2.CallAdapter.Factory;

@IgnoreJRERequirement
final class CompletableFutureCallAdapterFactory extends Factory {
    static final Factory INSTANCE = new CompletableFutureCallAdapterFactory();

    @IgnoreJRERequirement
    private static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {
        private final Type responseType;

        BodyCallAdapter(Type type) {
            this.responseType = type;
        }

        public Type responseType() {
            return this.responseType;
        }

        public CompletableFuture<R> adapt(final Call<R> call) {
            final C157531 r0 = new CompletableFuture<R>() {
                public boolean cancel(boolean z) {
                    if (z) {
                        call.cancel();
                    }
                    return super.cancel(z);
                }
            };
            call.enqueue(new Callback<R>() {
                public void onFailure(Call<R> call, Throwable th) {
                    r0.completeExceptionally(th);
                }

                public void onResponse(Call<R> call, Response<R> response) {
                    if (response.isSuccessful()) {
                        r0.complete(response.body());
                    } else {
                        r0.completeExceptionally(new HttpException(response));
                    }
                }
            });
            return r0;
        }
    }

    @IgnoreJRERequirement
    private static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {
        private final Type responseType;

        ResponseCallAdapter(Type type) {
            this.responseType = type;
        }

        public Type responseType() {
            return this.responseType;
        }

        public CompletableFuture<Response<R>> adapt(final Call<R> call) {
            final C157551 r0 = new CompletableFuture<Response<R>>() {
                public boolean cancel(boolean z) {
                    if (z) {
                        call.cancel();
                    }
                    return super.cancel(z);
                }
            };
            call.enqueue(new Callback<R>() {
                public void onFailure(Call<R> call, Throwable th) {
                    r0.completeExceptionally(th);
                }

                public void onResponse(Call<R> call, Response<R> response) {
                    r0.complete(response);
                }
            });
            return r0;
        }
    }

    CompletableFutureCallAdapterFactory() {
    }

    @C5952h
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Factory.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = Factory.getParameterUpperBound(0, (ParameterizedType) type);
            if (Factory.getRawType(parameterUpperBound) != Response.class) {
                return new BodyCallAdapter(parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new ResponseCallAdapter(Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
