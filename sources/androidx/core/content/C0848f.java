package androidx.core.content;

import android.content.SharedPreferences.Editor;
import androidx.annotation.C0193h0;

@Deprecated
/* renamed from: androidx.core.content.f */
/* compiled from: SharedPreferencesCompat */
public final class C0848f {

    @Deprecated
    /* renamed from: androidx.core.content.f$a */
    /* compiled from: SharedPreferencesCompat */
    public static final class C0849a {

        /* renamed from: b */
        private static C0849a f3992b;

        /* renamed from: a */
        private final C0850a f3993a = new C0850a();

        /* renamed from: androidx.core.content.f$a$a */
        /* compiled from: SharedPreferencesCompat */
        private static class C0850a {
            C0850a() {
            }

            /* renamed from: a */
            public void mo4503a(@C0193h0 Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private C0849a() {
        }

        @Deprecated
        /* renamed from: a */
        public static C0849a m4945a() {
            if (f3992b == null) {
                f3992b = new C0849a();
            }
            return f3992b;
        }

        @Deprecated
        /* renamed from: a */
        public void mo4502a(@C0193h0 Editor editor) {
            this.f3993a.mo4503a(editor);
        }
    }

    private C0848f() {
    }
}
