package androidx.core.p038os;

import androidx.annotation.C0195i0;

/* renamed from: androidx.core.os.OperationCanceledException */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@C0195i0 String str) {
        if (str == null) {
            str = "The operation has been canceled.";
        }
        super(str);
    }
}
