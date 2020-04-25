package retrofit2;

import p201f.p202a.C5952h;
import p468g.C13799a0;
import p468g.C13813c0.C13814a;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13826f0;
import p468g.C13866u;

public final class Response<T> {
    @C5952h
    private final T body;
    @C5952h
    private final C13826f0 errorBody;
    private final C13823e0 rawResponse;

    private Response(C13823e0 e0Var, @C5952h T t, @C5952h C13826f0 f0Var) {
        this.rawResponse = e0Var;
        this.body = t;
        this.errorBody = f0Var;
    }

    public static <T> Response<T> error(int i, C13826f0 f0Var) {
        Utils.checkNotNull(f0Var, "body == null");
        if (i >= 400) {
            return error(f0Var, new C13824a().mo43434a((C13826f0) new NoContentResponseBody(f0Var.contentType(), f0Var.contentLength())).mo43429a(i).mo43437a("Response.error()").mo43431a(C13799a0.HTTP_1_1).mo43432a(new C13814a().mo43374b("http://localhost/").mo43371a()).mo43439a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("code < 400: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> Response<T> success(@C5952h T t) {
        return success(t, new C13824a().mo43429a(200).mo43437a("OK").mo43431a(C13799a0.HTTP_1_1).mo43432a(new C13814a().mo43374b("http://localhost/").mo43371a()).mo43439a());
    }

    @C5952h
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.mo43425g();
    }

    @C5952h
    public C13826f0 errorBody() {
        return this.errorBody;
    }

    public C13866u headers() {
        return this.rawResponse.mo43427i();
    }

    public boolean isSuccessful() {
        return this.rawResponse.mo43407F();
    }

    public String message() {
        return this.rawResponse.mo43408G();
    }

    public C13823e0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i, @C5952h T t) {
        if (i >= 200 && i < 300) {
            return success(t, new C13824a().mo43429a(i).mo43437a("Response.success()").mo43431a(C13799a0.HTTP_1_1).mo43432a(new C13814a().mo43374b("http://localhost/").mo43371a()).mo43439a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("code < 200 or >= 300: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> Response<T> error(C13826f0 f0Var, C13823e0 e0Var) {
        Utils.checkNotNull(f0Var, "body == null");
        Utils.checkNotNull(e0Var, "rawResponse == null");
        if (!e0Var.mo43407F()) {
            return new Response<>(e0Var, null, f0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@C5952h T t, C13866u uVar) {
        Utils.checkNotNull(uVar, "headers == null");
        return success(t, new C13824a().mo43429a(200).mo43437a("OK").mo43431a(C13799a0.HTTP_1_1).mo43436a(uVar).mo43432a(new C13814a().mo43374b("http://localhost/").mo43371a()).mo43439a());
    }

    public static <T> Response<T> success(@C5952h T t, C13823e0 e0Var) {
        Utils.checkNotNull(e0Var, "rawResponse == null");
        if (e0Var.mo43407F()) {
            return new Response<>(e0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
