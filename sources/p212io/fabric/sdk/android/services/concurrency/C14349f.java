package p212io.fabric.sdk.android.services.concurrency;

/* renamed from: io.fabric.sdk.android.services.concurrency.f */
/* compiled from: Priority */
public enum C14349f {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: a */
    static <Y> int m62094a(C14363j jVar, Y y) {
        C14349f fVar;
        if (y instanceof C14363j) {
            fVar = ((C14363j) y).getPriority();
        } else {
            fVar = NORMAL;
        }
        return fVar.ordinal() - jVar.getPriority().ordinal();
    }
}
