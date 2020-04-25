package androidx.databinding;

import androidx.annotation.C0195i0;
import java.io.Serializable;

/* renamed from: androidx.databinding.y */
/* compiled from: ObservableField */
public class C1300y<T> extends C1173b implements Serializable {
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private T f5179b;

    public C1300y(T t) {
        this.f5179b = t;
    }

    /* renamed from: b */
    public void mo5709b(T t) {
        if (t != this.f5179b) {
            this.f5179b = t;
            mo5577a();
        }
    }

    @C0195i0
    /* renamed from: i */
    public T mo5710i() {
        return this.f5179b;
    }

    public C1300y() {
    }

    public C1300y(C1296v... vVarArr) {
        super(vVarArr);
    }
}
