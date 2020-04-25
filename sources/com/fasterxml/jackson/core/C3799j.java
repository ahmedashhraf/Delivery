package com.fasterxml.jackson.core;

import com.facebook.internal.ServerProtocol;

/* renamed from: com.fasterxml.jackson.core.j */
/* compiled from: JsonToken */
public enum C3799j {
    NOT_AVAILABLE(null),
    START_OBJECT("{"),
    END_OBJECT("}"),
    START_ARRAY("["),
    END_ARRAY("]"),
    FIELD_NAME(null),
    VALUE_EMBEDDED_OBJECT(null),
    VALUE_STRING(null),
    VALUE_NUMBER_INT(null),
    VALUE_NUMBER_FLOAT(null),
    VALUE_TRUE(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE),
    VALUE_FALSE("false"),
    VALUE_NULL("null");
    
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    private C3799j(String str) {
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
            return;
        }
        this._serialized = str;
        this._serializedChars = str.toCharArray();
        int length = this._serializedChars.length;
        this._serializedBytes = new byte[length];
        for (int i = 0; i < length; i++) {
            this._serializedBytes[i] = (byte) this._serializedChars[i];
        }
    }

    /* renamed from: d */
    public byte[] mo16743d() {
        return this._serializedBytes;
    }

    /* renamed from: e */
    public char[] mo16744e() {
        return this._serializedChars;
    }

    /* renamed from: f */
    public String mo16745f() {
        return this._serialized;
    }

    /* renamed from: g */
    public boolean mo16746g() {
        return this == VALUE_NUMBER_INT || this == VALUE_NUMBER_FLOAT;
    }

    /* renamed from: h */
    public boolean mo16747h() {
        return ordinal() >= VALUE_EMBEDDED_OBJECT.ordinal();
    }
}
