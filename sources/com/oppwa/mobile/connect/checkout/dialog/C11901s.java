package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.s */
public abstract class C11901s extends C11795a0 {

    /* renamed from: a0 */
    protected ListView f34359a0;

    /* renamed from: b0 */
    protected C11830e1 f34360b0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.s$a */
    class C11902a implements OnItemClickListener {
        C11902a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C11901s.this.f34360b0.mo40449a(i);
            C11901s.this.f34360b0.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    private void m53510g() {
        this.f34360b0 = new C11830e1(getContext(), mo40447e());
        this.f34359a0.setAdapter(this.f34360b0);
        this.f34359a0.setOnItemClickListener(new C11902a());
        this.f34360b0.mo40449a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C11832b[] mo40447e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40574f() {
        return ((C11832b) this.f34359a0.getItemAtPosition(this.f34360b0.mo40448a())).f34205b;
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_list_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34359a0 = (ListView) view.findViewById(C11771R.C11775id.list_view);
        m53510g();
    }
}
