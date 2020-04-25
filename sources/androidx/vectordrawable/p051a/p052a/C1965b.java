package androidx.vectordrawable.p051a.p052a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.vectordrawable.a.a.b */
/* compiled from: Animatable2Compat */
public interface C1965b extends Animatable {

    /* renamed from: androidx.vectordrawable.a.a.b$a */
    /* compiled from: Animatable2Compat */
    public static abstract class C1966a {

        /* renamed from: a */
        AnimationCallback f7568a;

        /* renamed from: androidx.vectordrawable.a.a.b$a$a */
        /* compiled from: Animatable2Compat */
        class C1967a extends AnimationCallback {
            C1967a() {
            }

            public void onAnimationEnd(Drawable drawable) {
                C1966a.this.mo8517a(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                C1966a.this.mo8518b(drawable);
            }
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(23)
        /* renamed from: a */
        public AnimationCallback mo8516a() {
            if (this.f7568a == null) {
                this.f7568a = new C1967a();
            }
            return this.f7568a;
        }

        /* renamed from: a */
        public void mo8517a(Drawable drawable) {
        }

        /* renamed from: b */
        public void mo8518b(Drawable drawable) {
        }
    }

    /* renamed from: a */
    void mo8513a();

    /* renamed from: a */
    void mo8514a(@C0193h0 C1966a aVar);

    /* renamed from: b */
    boolean mo8515b(@C0193h0 C1966a aVar);
}
