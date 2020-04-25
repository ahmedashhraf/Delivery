package retrofit2;

import java.io.IOException;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p468g.C13813c0;
import p468g.C13821e;
import p468g.C13821e.C13822a;
import p468g.C13823e0;
import p468g.C13825f;
import p468g.C13826f0;
import p468g.C13872x;
import p470h.C13883a0;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13899i;
import p470h.C13906p;

final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final C13822a callFactory;
    private volatile boolean canceled;
    @C5952h
    @C5966a("this")
    private Throwable creationFailure;
    @C5966a("this")
    private boolean executed;
    @C5952h
    @C5966a("this")
    private C13821e rawCall;
    private final RequestFactory requestFactory;
    private final Converter<C13826f0, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends C13826f0 {
        private final C13826f0 delegate;
        private final C13894e delegateSource;
        @C5952h
        IOException thrownException;

        ExceptionCatchingResponseBody(C13826f0 f0Var) {
            this.delegate = f0Var;
            this.delegateSource = C13906p.m59739a((C13883a0) new C13899i(f0Var.source()) {
                public long read(C13887c cVar, long j) throws IOException {
                    try {
                        return super.read(cVar, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        public void close() {
            this.delegate.close();
        }

        public long contentLength() {
            return this.delegate.contentLength();
        }

        public C13872x contentType() {
            return this.delegate.contentType();
        }

        public C13894e source() {
            return this.delegateSource;
        }

        /* access modifiers changed from: 0000 */
        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class NoContentResponseBody extends C13826f0 {
        private final long contentLength;
        @C5952h
        private final C13872x contentType;

        NoContentResponseBody(@C5952h C13872x xVar, long j) {
            this.contentType = xVar;
            this.contentLength = j;
        }

        public long contentLength() {
            return this.contentLength;
        }

        public C13872x contentType() {
            return this.contentType;
        }

        public C13894e source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(RequestFactory requestFactory2, Object[] objArr, C13822a aVar, Converter<C13826f0, T> converter) {
        this.requestFactory = requestFactory2;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private C13821e createRawCall() throws IOException {
        C13821e a = this.callFactory.mo43405a(this.requestFactory.create(this.args));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void cancel() {
        C13821e eVar;
        this.canceled = true;
        synchronized (this) {
            eVar = this.rawCall;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public void enqueue(final Callback<T> callback) {
        C13821e eVar;
        Throwable th;
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                eVar = this.rawCall;
                th = this.creationFailure;
                if (eVar == null && th == null) {
                    try {
                        C13821e createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        eVar = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        eVar.mo43292a(new C13825f() {
            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    Utils.throwIfFatal(th2);
                    th2.printStackTrace();
                }
            }

            public void onFailure(C13821e eVar, IOException iOException) {
                callFailure(iOException);
            }

            public void onResponse(C13821e eVar, C13823e0 e0Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(e0Var));
                    } catch (Throwable th) {
                        Utils.throwIfFatal(th);
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    Utils.throwIfFatal(th2);
                    callFailure(th2);
                }
            }
        });
    }

    public Response<T> execute() throws IOException {
        C13821e eVar;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                if (this.creationFailure == null) {
                    eVar = this.rawCall;
                    if (eVar == null) {
                        try {
                            eVar = createRawCall();
                            this.rawCall = eVar;
                        } catch (IOException | Error | RuntimeException e) {
                            Utils.throwIfFatal(e);
                            this.creationFailure = e;
                            throw e;
                        }
                    }
                } else if (this.creationFailure instanceof IOException) {
                    throw ((IOException) this.creationFailure);
                } else if (this.creationFailure instanceof RuntimeException) {
                    throw ((RuntimeException) this.creationFailure);
                } else {
                    throw ((Error) this.creationFailure);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            eVar.cancel();
        }
        return parseResponse(eVar.execute());
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            if (this.rawCall == null || !this.rawCall.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* access modifiers changed from: 0000 */
    public Response<T> parseResponse(C13823e0 e0Var) throws IOException {
        C13826f0 a = e0Var.mo43416a();
        C13823e0 a2 = e0Var.mo43410I().mo43434a((C13826f0) new NoContentResponseBody(a.contentType(), a.contentLength())).mo43439a();
        int g = a2.mo43425g();
        if (g < 200 || g >= 300) {
            try {
                return Response.error(Utils.buffer(a), a2);
            } finally {
                a.close();
            }
        } else if (g == 204 || g == 205) {
            a.close();
            return Response.success(null, a2);
        } else {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(a);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), a2);
            } catch (RuntimeException e) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e;
            }
        }
    }

    public synchronized C13813c0 request() {
        C13821e eVar = this.rawCall;
        if (eVar != null) {
            return eVar.request();
        } else if (this.creationFailure == null) {
            try {
                C13821e createRawCall = createRawCall();
                this.rawCall = createRawCall;
                return createRawCall.request();
            } catch (RuntimeException e) {
                e = e;
                Utils.throwIfFatal(e);
                this.creationFailure = e;
                throw e;
            } catch (Error e2) {
                e = e2;
                Utils.throwIfFatal(e);
                this.creationFailure = e;
                throw e;
            } catch (IOException e3) {
                this.creationFailure = e3;
                throw new RuntimeException("Unable to create request.", e3);
            }
        } else if (this.creationFailure instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.creationFailure);
        } else if (this.creationFailure instanceof RuntimeException) {
            throw ((RuntimeException) this.creationFailure);
        } else {
            throw ((Error) this.creationFailure);
        }
    }

    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
