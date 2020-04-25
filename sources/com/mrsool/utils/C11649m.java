package com.mrsool.utils;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.mrsool.utils.m */
/* compiled from: ExceptionHandler */
public class C11649m implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final Context f33482a;

    /* renamed from: b */
    private final String f33483b = "\n";

    public C11649m(Context context) {
        this.f33482a = context;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder sb = new StringBuilder();
        sb.append("************ CAUSE OF ERROR ************\n\n");
        sb.append(stringWriter.toString());
        sb.append("\n************ DEVICE INFORMATION ***********\n");
        sb.append("Brand: ");
        sb.append(Build.BRAND);
        String str = "\n";
        sb.append(str);
        sb.append("Device: ");
        sb.append(Build.DEVICE);
        sb.append(str);
        sb.append("Model: ");
        sb.append(Build.MODEL);
        sb.append(str);
        sb.append("Id: ");
        sb.append(Build.ID);
        sb.append(str);
        sb.append("Product: ");
        sb.append(Build.PRODUCT);
        sb.append(str);
        sb.append("\n************ FIRMWARE ************\n");
        sb.append("SDK: ");
        sb.append(VERSION.SDK_INT);
        sb.append(str);
        sb.append("Release: ");
        sb.append(VERSION.RELEASE);
        sb.append(str);
        sb.append("Incremental: ");
        sb.append(VERSION.INCREMENTAL);
        sb.append(str);
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
