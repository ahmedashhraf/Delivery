package p053b.p059b.p060b;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: b.b.b.b */
/* compiled from: CursorFilter */
class C2095b extends Filter {

    /* renamed from: a */
    C2096a f7975a;

    /* renamed from: b.b.b.b$a */
    /* compiled from: CursorFilter */
    interface C2096a {
        /* renamed from: a */
        Cursor mo9083a();

        /* renamed from: a */
        Cursor mo2814a(CharSequence charSequence);

        /* renamed from: a */
        CharSequence mo2816a(Cursor cursor);

        /* renamed from: b */
        void mo2819b(Cursor cursor);
    }

    C2095b(C2096a aVar) {
        this.f7975a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f7975a.mo2816a((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f7975a.mo2814a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f7975a.mo9083a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f7975a.mo2819b((Cursor) obj);
        }
    }
}
