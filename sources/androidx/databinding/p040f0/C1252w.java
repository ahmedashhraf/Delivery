package androidx.databinding.p040f0;

import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1288q({@C1287p(attribute = "android:rating", type = RatingBar.class)})
/* renamed from: androidx.databinding.f0.w */
/* compiled from: RatingBarBindingAdapter */
public class C1252w {

    /* renamed from: androidx.databinding.f0.w$a */
    /* compiled from: RatingBarBindingAdapter */
    static class C1253a implements OnRatingBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnRatingBarChangeListener f5125a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5126b;

        C1253a(OnRatingBarChangeListener onRatingBarChangeListener, C1286o oVar) {
            this.f5125a = onRatingBarChangeListener;
            this.f5126b = oVar;
        }

        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            OnRatingBarChangeListener onRatingBarChangeListener = this.f5125a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f, z);
            }
            this.f5126b.mo5680a();
        }
    }

    @C1179d({"android:rating"})
    /* renamed from: a */
    public static void m6833a(RatingBar ratingBar, float f) {
        if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }

    @C1179d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    /* renamed from: a */
    public static void m6834a(RatingBar ratingBar, OnRatingBarChangeListener onRatingBarChangeListener, C1286o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new C1253a(onRatingBarChangeListener, oVar));
        }
    }
}
