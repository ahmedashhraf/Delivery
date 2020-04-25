package kotlin.p214b1;

import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.b1.m */
/* compiled from: KotlinReflectionNotSupportedError.kt */
public class C14414m extends Error {
    public C14414m() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public C14414m(@C6004e String str) {
        super(str);
    }

    public C14414m(@C6004e String str, @C6004e Throwable th) {
        super(str, th);
    }

    public C14414m(@C6004e Throwable th) {
        super(th);
    }
}
