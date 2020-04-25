package com.mrsool.chat;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.newBean.WayPoint;
import com.mrsool.newBean.WayPoint.WayPointType;
import com.mrsool.p423v.C11725f;
import java.util.ArrayList;

/* renamed from: com.mrsool.chat.q */
/* compiled from: WayPointAdapter */
public class C10537q extends C1638g<C10539b> {

    /* renamed from: c */
    private ArrayList<WayPoint> f28583c;

    /* renamed from: d */
    private Context f28584d;

    /* renamed from: e */
    private int f28585e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11725f f28586f;

    /* renamed from: com.mrsool.chat.q$a */
    /* compiled from: WayPointAdapter */
    class C10538a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10539b f28587a;

        C10538a(C10539b bVar) {
            this.f28587a = bVar;
        }

        public void onClick(View view) {
            C10537q.this.f28586f.mo37847a(this.f28587a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.chat.q$b */
    /* compiled from: WayPointAdapter */
    public static class C10539b extends C1635d0 {

        /* renamed from: A0 */
        View f28589A0;

        /* renamed from: s0 */
        TextView f28590s0;

        /* renamed from: t0 */
        TextView f28591t0;

        /* renamed from: u0 */
        TextView f28592u0;

        /* renamed from: v0 */
        ImageView f28593v0;

        /* renamed from: w0 */
        ImageView f28594w0;

        /* renamed from: x0 */
        View f28595x0;

        /* renamed from: y0 */
        View f28596y0;

        /* renamed from: z0 */
        View f28597z0;

        public C10539b(View view) {
            super(view);
            this.f28591t0 = (TextView) view.findViewById(C10232R.C10236id.tvTitle);
            this.f28590s0 = (TextView) view.findViewById(C10232R.C10236id.tvAddress);
            this.f28592u0 = (TextView) view.findViewById(C10232R.C10236id.tvDistance);
            this.f28595x0 = view.findViewById(C10232R.C10236id.ivRightDot);
            this.f28596y0 = view.findViewById(C10232R.C10236id.ivLeftDot);
            this.f28593v0 = (ImageView) view.findViewById(C10232R.C10236id.ivDirection);
            this.f28589A0 = view.findViewById(C10232R.C10236id.flDirection);
            this.f28594w0 = (ImageView) view.findViewById(C10232R.C10236id.ivIcon);
            this.f28597z0 = view.findViewById(C10232R.C10236id.divider);
        }
    }

    public C10537q(ArrayList<WayPoint> arrayList, Context context, C11725f fVar) {
        this.f28584d = context;
        this.f28583c = arrayList;
        this.f28586f = fVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        this.f28585e = displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public void mo7330b(C10539b bVar, int i) {
        if (this.f28583c.size() > 1) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.width = this.f28585e / 2;
            bVar.f6294a.setLayoutParams(layoutParams);
        }
        WayPoint wayPoint = (WayPoint) this.f28583c.get(i);
        WayPointType type = wayPoint.getType();
        WayPointType wayPointType = WayPointType.PICK_UP;
        int i2 = C10232R.string.lbl_pickup_location;
        if (type == wayPointType) {
            bVar.f28591t0.setText(this.f28584d.getString(C10232R.string.lbl_pickup_location));
            bVar.f28594w0.setImageResource(C10232R.C10235drawable.ic_pickup_location);
            bVar.f28592u0.setBackgroundResource(C10232R.C10235drawable.bg_pickup_location_12);
            bVar.f28589A0.setBackgroundResource(C10232R.C10235drawable.bg_navigation_pickup);
        } else {
            bVar.f28591t0.setText(this.f28584d.getString(C10232R.string.title_delivery_location));
            bVar.f28594w0.setImageResource(C10232R.C10235drawable.ic_delivery_location);
            bVar.f28592u0.setBackgroundResource(C10232R.C10235drawable.bg_delivery_location_12);
            bVar.f28589A0.setBackgroundResource(C10232R.C10235drawable.bg_navigation_delivery);
        }
        bVar.f28596y0.setVisibility(0);
        bVar.f28595x0.setVisibility(0);
        bVar.f28597z0.setVisibility(0);
        if (i == 0) {
            bVar.f28596y0.setVisibility(4);
        } else if (i == this.f28583c.size() - 1) {
            bVar.f28595x0.setVisibility(4);
            bVar.f28597z0.setVisibility(8);
        }
        TextView textView = bVar.f28591t0;
        Context context = this.f28584d;
        if (wayPoint.getType() != WayPointType.PICK_UP) {
            i2 = C10232R.string.title_delivery_location;
        }
        textView.setText(context.getString(i2));
        bVar.f28590s0.setText(wayPoint.getAddress());
        bVar.f28592u0.setText(String.format(this.f28584d.getString(C10232R.string.lbl_distance_value), new Object[]{wayPoint.getDistance()}));
        bVar.f28589A0.setOnClickListener(new C10538a(bVar));
    }

    /* renamed from: b */
    public C10539b m48672b(ViewGroup viewGroup, int i) {
        return new C10539b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_waypoint_item, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        ArrayList<WayPoint> arrayList = this.f28583c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
