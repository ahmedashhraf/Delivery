package p205i.p489f.p490h;

/* renamed from: i.f.h.d */
/* compiled from: FormattingTuple */
public class C14074d {

    /* renamed from: d */
    public static C14074d f41354d = new C14074d(null);

    /* renamed from: a */
    private String f41355a;

    /* renamed from: b */
    private Throwable f41356b;

    /* renamed from: c */
    private Object[] f41357c;

    public C14074d(String str) {
        this(str, null, null);
    }

    /* renamed from: a */
    static Object[] m60773a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    /* renamed from: b */
    public String mo44504b() {
        return this.f41355a;
    }

    /* renamed from: c */
    public Throwable mo44505c() {
        return this.f41356b;
    }

    public C14074d(String str, Object[] objArr, Throwable th) {
        this.f41355a = str;
        this.f41356b = th;
        if (th == null) {
            this.f41357c = objArr;
        } else {
            this.f41357c = m60773a(objArr);
        }
    }

    /* renamed from: a */
    public Object[] mo44503a() {
        return this.f41357c;
    }
}
