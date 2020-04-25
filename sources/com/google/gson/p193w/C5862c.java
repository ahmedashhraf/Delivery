package com.google.gson.p193w;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.w.c */
/* compiled from: SerializedName */
public @interface C5862c {
    String[] alternate() default {};

    String value();
}
