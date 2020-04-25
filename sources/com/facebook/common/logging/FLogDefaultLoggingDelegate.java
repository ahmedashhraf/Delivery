package com.facebook.common.logging;

import java.io.PrintWriter;
import java.io.StringWriter;

public class FLogDefaultLoggingDelegate implements LoggingDelegate {
    public static final FLogDefaultLoggingDelegate sInstance = new FLogDefaultLoggingDelegate();
    private String mApplicationTag = "unknown";
    private int mMinimumLoggingLevel = 5;

    private FLogDefaultLoggingDelegate() {
    }

    public static FLogDefaultLoggingDelegate getInstance() {
        return sInstance;
    }

    private static String getMsg(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return sb.toString();
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String prefixTag(String str) {
        if (this.mApplicationTag == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mApplicationTag);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    private void println(int i, String str, String str2) {
        prefixTag(str);
    }

    /* renamed from: d */
    public void mo13780d(String str, String str2) {
        println(3, str, str2);
    }

    /* renamed from: e */
    public void mo13782e(String str, String str2) {
        println(6, str, str2);
    }

    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    /* renamed from: i */
    public void mo13785i(String str, String str2) {
        println(4, str, str2);
    }

    public boolean isLoggable(int i) {
        return this.mMinimumLoggingLevel <= i;
    }

    public void log(int i, String str, String str2) {
        println(i, str, str2);
    }

    public void setApplicationTag(String str) {
        this.mApplicationTag = str;
    }

    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    /* renamed from: v */
    public void mo13791v(String str, String str2) {
        println(2, str, str2);
    }

    /* renamed from: w */
    public void mo13793w(String str, String str2) {
        println(5, str, str2);
    }

    public void wtf(String str, String str2) {
        println(6, str, str2);
    }

    private void println(int i, String str, String str2, Throwable th) {
        prefixTag(str);
        getMsg(str2, th);
    }

    /* renamed from: d */
    public void mo13781d(String str, String str2, Throwable th) {
        println(3, str, str2, th);
    }

    /* renamed from: e */
    public void mo13783e(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }

    /* renamed from: i */
    public void mo13786i(String str, String str2, Throwable th) {
        println(4, str, str2, th);
    }

    /* renamed from: v */
    public void mo13792v(String str, String str2, Throwable th) {
        println(2, str, str2, th);
    }

    /* renamed from: w */
    public void mo13794w(String str, String str2, Throwable th) {
        println(5, str, str2, th);
    }

    public void wtf(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }
}
