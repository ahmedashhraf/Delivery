package com.fasterxml.jackson.core;

public class JsonParseException extends JsonProcessingException {
    static final long serialVersionUID = 123;

    public JsonParseException(String str, C3793g gVar) {
        super(str, gVar);
    }

    public JsonParseException(String str, C3793g gVar, Throwable th) {
        super(str, gVar, th);
    }
}
