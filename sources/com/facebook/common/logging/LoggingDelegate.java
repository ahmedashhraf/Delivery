package com.facebook.common.logging;

public interface LoggingDelegate {
    /* renamed from: d */
    void mo13780d(String str, String str2);

    /* renamed from: d */
    void mo13781d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo13782e(String str, String str2);

    /* renamed from: e */
    void mo13783e(String str, String str2, Throwable th);

    int getMinimumLoggingLevel();

    /* renamed from: i */
    void mo13785i(String str, String str2);

    /* renamed from: i */
    void mo13786i(String str, String str2, Throwable th);

    boolean isLoggable(int i);

    void log(int i, String str, String str2);

    void setMinimumLoggingLevel(int i);

    /* renamed from: v */
    void mo13791v(String str, String str2);

    /* renamed from: v */
    void mo13792v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo13793w(String str, String str2);

    /* renamed from: w */
    void mo13794w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
