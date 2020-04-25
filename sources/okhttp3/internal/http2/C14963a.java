package okhttp3.internal.http2;

/* renamed from: okhttp3.internal.http2.a */
/* compiled from: ErrorCode */
public enum C14963a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    private C14963a(int i) {
        this.httpCode = i;
    }

    /* renamed from: a */
    public static C14963a m66297a(int i) {
        C14963a[] values;
        for (C14963a aVar : values()) {
            if (aVar.httpCode == i) {
                return aVar;
            }
        }
        return null;
    }
}
