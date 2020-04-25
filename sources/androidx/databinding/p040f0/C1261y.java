package androidx.databinding.p040f0;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1288q({@C1287p(attribute = "android:progress", type = SeekBar.class)})
/* renamed from: androidx.databinding.f0.y */
/* compiled from: SeekBarBindingAdapter */
public class C1261y {

    /* renamed from: androidx.databinding.f0.y$a */
    /* compiled from: SeekBarBindingAdapter */
    static class C1262a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1263b f5131a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5132b;

        /* renamed from: c */
        final /* synthetic */ C1264c f5133c;

        /* renamed from: d */
        final /* synthetic */ C1265d f5134d;

        C1262a(C1263b bVar, C1286o oVar, C1264c cVar, C1265d dVar) {
            this.f5131a = bVar;
            this.f5132b = oVar;
            this.f5133c = cVar;
            this.f5134d = dVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C1263b bVar = this.f5131a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i, z);
            }
            C1286o oVar = this.f5132b;
            if (oVar != null) {
                oVar.mo5680a();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C1264c cVar = this.f5133c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C1265d dVar = this.f5134d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* renamed from: androidx.databinding.f0.y$b */
    /* compiled from: SeekBarBindingAdapter */
    public interface C1263b {
        void onProgressChanged(SeekBar seekBar, int i, boolean z);
    }

    /* renamed from: androidx.databinding.f0.y$c */
    /* compiled from: SeekBarBindingAdapter */
    public interface C1264c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* renamed from: androidx.databinding.f0.y$d */
    /* compiled from: SeekBarBindingAdapter */
    public interface C1265d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @C1179d({"android:progress"})
    /* renamed from: a */
    public static void m6837a(SeekBar seekBar, int i) {
        if (i != seekBar.getProgress()) {
            seekBar.setProgress(i);
        }
    }

    @C1179d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    /* renamed from: a */
    public static void m6838a(SeekBar seekBar, C1264c cVar, C1265d dVar, C1263b bVar, C1286o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new C1262a(bVar, oVar, cVar, dVar));
        }
    }
}
