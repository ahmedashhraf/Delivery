package com.google.gson;

/* renamed from: com.google.gson.t */
/* compiled from: LongSerializationPolicy */
public enum C8800t {
    DEFAULT {
        /* renamed from: a */
        public C8787l mo32478a(Long l) {
            return new C8791p((Number) l);
        }
    },
    STRING {
        /* renamed from: a */
        public C8787l mo32478a(Long l) {
            return new C8791p(String.valueOf(l));
        }
    };

    /* renamed from: a */
    public abstract C8787l mo32478a(Long l);
}
