package p053b.p059b.p060b;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;

/* renamed from: b.b.b.a */
/* compiled from: CursorAdapter */
public abstract class C2092a extends BaseAdapter implements Filterable, C2096a {
    @Deprecated

    /* renamed from: U */
    public static final int f7962U = 1;

    /* renamed from: V */
    public static final int f7963V = 2;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: N */
    protected Cursor f7964N;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: O */
    protected Context f7965O;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: P */
    protected int f7966P;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: Q */
    protected C2093a f7967Q;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: R */
    protected DataSetObserver f7968R;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: S */
    protected C2095b f7969S;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: T */
    protected FilterQueryProvider f7970T;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: a */
    protected boolean f7971a;
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: b */
    protected boolean f7972b;

    /* renamed from: b.b.b.a$a */
    /* compiled from: CursorAdapter */
    private class C2093a extends ContentObserver {
        C2093a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C2092a.this.mo9090c();
        }
    }

    /* renamed from: b.b.b.a$b */
    /* compiled from: CursorAdapter */
    private class C2094b extends DataSetObserver {
        C2094b() {
        }

        public void onChanged() {
            C2092a aVar = C2092a.this;
            aVar.f7971a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C2092a aVar = C2092a.this;
            aVar.f7971a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public C2092a(Context context, Cursor cursor) {
        mo9085a(context, cursor, 1);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo9086a(Context context, Cursor cursor, boolean z) {
        mo9085a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public abstract void mo2817a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo2818b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    public void mo2819b(Cursor cursor) {
        Cursor c = mo9089c(cursor);
        if (c != null) {
            c.close();
        }
    }

    /* renamed from: c */
    public Cursor mo9089c(Cursor cursor) {
        Cursor cursor2 = this.f7964N;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2093a aVar = this.f7967Q;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f7968R;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7964N = cursor;
        if (cursor != null) {
            C2093a aVar2 = this.f7967Q;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f7968R;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f7966P = cursor.getColumnIndexOrThrow(FeatureRequestEntry.COLUMN_ID);
            this.f7971a = true;
            notifyDataSetChanged();
        } else {
            this.f7966P = -1;
            this.f7971a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        if (this.f7971a) {
            Cursor cursor = this.f7964N;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f7971a) {
            return null;
        }
        this.f7964N.moveToPosition(i);
        if (view == null) {
            view = mo9084a(this.f7965O, this.f7964N, viewGroup);
        }
        mo2817a(view, this.f7965O, this.f7964N);
        return view;
    }

    public Filter getFilter() {
        if (this.f7969S == null) {
            this.f7969S = new C2095b(this);
        }
        return this.f7969S;
    }

    public Object getItem(int i) {
        if (this.f7971a) {
            Cursor cursor = this.f7964N;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f7964N;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f7971a) {
            Cursor cursor = this.f7964N;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f7964N.getLong(this.f7966P);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f7971a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f7964N.moveToPosition(i)) {
            if (view == null) {
                view = mo2818b(this.f7965O, this.f7964N, viewGroup);
            }
            mo2817a(view, this.f7965O, this.f7964N);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9085a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f7972b = true;
        } else {
            this.f7972b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f7964N = cursor;
        this.f7971a = z;
        this.f7965O = context;
        this.f7966P = z ? cursor.getColumnIndexOrThrow(FeatureRequestEntry.COLUMN_ID) : -1;
        if ((i & 2) == 2) {
            this.f7967Q = new C2093a();
            this.f7968R = new C2094b();
        } else {
            this.f7967Q = null;
            this.f7968R = null;
        }
        if (z) {
            C2093a aVar = this.f7967Q;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f7968R;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public C2092a(Context context, Cursor cursor, boolean z) {
        mo9085a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: b */
    public FilterQueryProvider mo9088b() {
        return this.f7970T;
    }

    public C2092a(Context context, Cursor cursor, int i) {
        mo9085a(context, cursor, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9090c() {
        if (this.f7972b) {
            Cursor cursor = this.f7964N;
            if (cursor != null && !cursor.isClosed()) {
                this.f7971a = this.f7964N.requery();
            }
        }
    }

    /* renamed from: a */
    public Cursor mo9083a() {
        return this.f7964N;
    }

    /* renamed from: a */
    public View mo9084a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2818b(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public CharSequence mo2816a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo2814a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f7970T;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f7964N;
    }

    /* renamed from: a */
    public void mo9087a(FilterQueryProvider filterQueryProvider) {
        this.f7970T = filterQueryProvider;
    }
}
