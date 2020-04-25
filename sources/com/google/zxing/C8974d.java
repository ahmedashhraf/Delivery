package com.google.zxing;

import java.util.List;

/* renamed from: com.google.zxing.d */
/* compiled from: DecodeHintType */
public enum C8974d {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C8988q.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    
    private final Class<?> valueType;

    private C8974d(Class<?> cls) {
        this.valueType = cls;
    }

    /* renamed from: d */
    public Class<?> mo32797d() {
        return this.valueType;
    }
}
