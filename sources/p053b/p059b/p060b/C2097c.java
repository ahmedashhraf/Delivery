package p053b.p059b.p060b;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.b.b.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C2097c extends C2092a {

    /* renamed from: W */
    private int f7976W;

    /* renamed from: X */
    private int f7977X;

    /* renamed from: Y */
    private LayoutInflater f7978Y;

    @Deprecated
    public C2097c(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f7977X = i;
        this.f7976W = i;
        this.f7978Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo9084a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7978Y.inflate(this.f7977X, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2818b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7978Y.inflate(this.f7976W, viewGroup, false);
    }

    /* renamed from: a */
    public void mo9102a(int i) {
        this.f7977X = i;
    }

    /* renamed from: b */
    public void mo9103b(int i) {
        this.f7976W = i;
    }

    @Deprecated
    public C2097c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f7977X = i;
        this.f7976W = i;
        this.f7978Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C2097c(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f7977X = i;
        this.f7976W = i;
        this.f7978Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
