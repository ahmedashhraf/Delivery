package androidx.customview.p039a;

import android.graphics.Rect;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: androidx.customview.a.b */
/* compiled from: FocusStrategy */
class C1134b {

    /* renamed from: androidx.customview.a.b$a */
    /* compiled from: FocusStrategy */
    public interface C1135a<T> {
        /* renamed from: a */
        void mo5412a(T t, Rect rect);
    }

    /* renamed from: androidx.customview.a.b$b */
    /* compiled from: FocusStrategy */
    public interface C1136b<T, V> {
        /* renamed from: a */
        int mo5414a(T t);

        /* renamed from: a */
        V mo5416a(T t, int i);
    }

    /* renamed from: androidx.customview.a.b$c */
    /* compiled from: FocusStrategy */
    private static class C1137c<T> implements Comparator<T> {

        /* renamed from: N */
        private final boolean f4966N;

        /* renamed from: O */
        private final C1135a<T> f4967O;

        /* renamed from: a */
        private final Rect f4968a = new Rect();

        /* renamed from: b */
        private final Rect f4969b = new Rect();

        C1137c(boolean z, C1135a<T> aVar) {
            this.f4966N = z;
            this.f4967O = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f4968a;
            Rect rect2 = this.f4969b;
            this.f4967O.mo5412a(t, rect);
            this.f4967O.mo5412a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.f4966N) {
                    i3 = 1;
                }
                return i3;
            } else if (i4 > i5) {
                if (!this.f4966N) {
                    i3 = 1;
                }
                return i3;
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                int i8 = rect.right;
                int i9 = rect2.right;
                if (i8 < i9) {
                    if (this.f4966N) {
                        i3 = 1;
                    }
                    return i3;
                } else if (i8 <= i9) {
                    return 0;
                } else {
                    if (!this.f4966N) {
                        i3 = 1;
                    }
                    return i3;
                }
            }
        }
    }

    private C1134b() {
    }

    /* renamed from: a */
    private static int m6458a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m6459a(@C0193h0 L l, @C0193h0 C1136b<L, T> bVar, @C0193h0 C1135a<T> aVar, @C0195i0 T t, int i, boolean z, boolean z2) {
        int a = bVar.mo5414a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo5416a(l, i2));
        }
        Collections.sort(arrayList, new C1137c(z, aVar));
        if (i == 1) {
            return m6465b(t, arrayList, z2);
        }
        if (i == 2) {
            return m6461a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: b */
    private static <T> T m6465b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: c */
    private static int m6468c(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        return Math.max(0, m6469d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m6469d(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: e */
    private static int m6470e(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        return Math.max(1, m6471f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m6471f(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: g */
    private static int m6472g(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: b */
    private static boolean m6467b(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2, @C0193h0 Rect rect3) {
        boolean z = false;
        if (!m6464a(rect, rect2, i)) {
            return false;
        }
        if (!m6464a(rect, rect3, i) || m6463a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m6463a(i, rect, rect3, rect2)) {
            return false;
        }
        if (m6458a(m6468c(i, rect, rect2), m6472g(i, rect, rect2)) < m6458a(m6468c(i, rect, rect3), m6472g(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static <T> T m6461a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    public static <L, T> T m6460a(@C0193h0 L l, @C0193h0 C1136b<L, T> bVar, @C0193h0 C1135a<T> aVar, @C0195i0 T t, @C0193h0 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a = bVar.mo5414a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo5416a(l, i2);
            if (a2 != t) {
                aVar.mo5412a(a2, rect3);
                if (m6467b(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: b */
    private static boolean m6466b(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m6463a(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2, @C0193h0 Rect rect3) {
        boolean a = m6462a(i, rect, rect2);
        if (m6462a(i, rect, rect3) || !a) {
            return false;
        }
        boolean z = true;
        if (!m6466b(i, rect, rect3)) {
            return true;
        }
        if (!(i == 17 || i == 66 || m6468c(i, rect, rect2) < m6470e(i, rect, rect3))) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m6464a(@C0193h0 Rect rect, @C0193h0 Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 <= i3 && rect.left < i3) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 <= i5 && rect.top < i5) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 >= i7 && rect.right > i7) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m6462a(int i, @C0193h0 Rect rect, @C0193h0 Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }
}
