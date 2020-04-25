package androidx.databinding.p040f0;

import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView.Validator;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.p040f0.C1197e.C1198a;
import androidx.databinding.p040f0.C1197e.C1199b;
import androidx.databinding.p040f0.C1197e.C1200c;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @C1267g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @C1267g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @C1267g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
/* renamed from: androidx.databinding.f0.f */
/* compiled from: AutoCompleteTextViewBindingAdapter */
public class C1202f {

    /* renamed from: androidx.databinding.f0.f$a */
    /* compiled from: AutoCompleteTextViewBindingAdapter */
    static class C1203a implements Validator {

        /* renamed from: a */
        final /* synthetic */ C1205c f5081a;

        /* renamed from: b */
        final /* synthetic */ C1204b f5082b;

        C1203a(C1205c cVar, C1204b bVar) {
            this.f5081a = cVar;
            this.f5082b = bVar;
        }

        public CharSequence fixText(CharSequence charSequence) {
            C1204b bVar = this.f5082b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        public boolean isValid(CharSequence charSequence) {
            C1205c cVar = this.f5081a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* renamed from: androidx.databinding.f0.f$b */
    /* compiled from: AutoCompleteTextViewBindingAdapter */
    public interface C1204b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* renamed from: androidx.databinding.f0.f$c */
    /* compiled from: AutoCompleteTextViewBindingAdapter */
    public interface C1205c {
        boolean isValid(CharSequence charSequence);
    }

    @C1179d(requireAll = false, value = {"android:fixText", "android:isValid"})
    /* renamed from: a */
    public static void m6749a(AutoCompleteTextView autoCompleteTextView, C1204b bVar, C1205c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new C1203a(cVar, bVar));
        }
    }

    @C1179d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    /* renamed from: a */
    public static void m6748a(AutoCompleteTextView autoCompleteTextView, C1198a aVar, C1200c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new C1199b(aVar, cVar, null));
        }
    }
}
