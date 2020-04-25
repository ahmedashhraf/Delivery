package com.fasterxml.jackson.core;

public class JsonGenerationException extends JsonProcessingException {
    private static final long serialVersionUID = 123;

    public JsonGenerationException(Throwable th) {
        super(th);
    }

    public JsonGenerationException(String str) {
        super(str, (C3793g) null);
    }

    public JsonGenerationException(String str, Throwable th) {
        super(str, null, th);
    }
}
