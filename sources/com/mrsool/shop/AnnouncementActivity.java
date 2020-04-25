package com.mrsool.shop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.AnnouncementBean;
import com.mrsool.bean.AnnouncementMainBean;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.LastAnnouncementRating;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnnouncementActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private Context f31064S;

    /* renamed from: T */
    private LinearLayout f31065T;

    /* renamed from: U */
    private RelativeLayout f31066U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ProgressBar f31067V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public ImageView f31068W;

    /* renamed from: X */
    private TextView f31069X;

    /* renamed from: Y */
    private TextView f31070Y;

    /* renamed from: Z */
    private TextView f31071Z;

    /* renamed from: a0 */
    private Bundle f31072a0;

    /* renamed from: b0 */
    private int f31073b0;

    /* renamed from: c0 */
    private String f31074c0;

    /* renamed from: d0 */
    private String f31075d0;

    /* renamed from: e0 */
    private String f31076e0 = "";

    /* renamed from: f0 */
    private BroadcastReceiver f31077f0 = new C11199a();

    /* renamed from: com.mrsool.shop.AnnouncementActivity$a */
    class C11199a extends BroadcastReceiver {
        C11199a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33458y4)) {
                AnnouncementActivity announcementActivity = AnnouncementActivity.this;
                announcementActivity.f29642a.mo23493O(announcementActivity.getResources().getString(C10232R.string.msg_updateChecker));
            }
        }
    }

    /* renamed from: com.mrsool.shop.AnnouncementActivity$b */
    class C11200b extends C2557j<Bitmap> {
        C11200b() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (!AnnouncementActivity.this.isFinishing()) {
                bitmap.getHeight();
                bitmap.getWidth();
                int height = (bitmap.getHeight() * C11644i.f33097H) / bitmap.getWidth();
                if (bitmap.getWidth() / bitmap.getHeight() < 1) {
                    ImageView a = AnnouncementActivity.this.f31068W;
                    double d = (double) C11644i.f33105I;
                    Double.isNaN(d);
                    a.setMaxHeight((int) (d * 0.7d));
                    double d2 = (double) height;
                    double d3 = (double) C11644i.f33105I;
                    Double.isNaN(d3);
                    if (d2 > d3 * 0.7d) {
                        AnnouncementActivity.this.f31068W.setScaleType(ScaleType.CENTER_INSIDE);
                        double d4 = (double) C11644i.f33105I;
                        Double.isNaN(d4);
                        height = (int) (d4 * 0.7d);
                    } else {
                        AnnouncementActivity.this.f31068W.setScaleType(ScaleType.FIT_XY);
                    }
                }
                LayoutParams layoutParams = (LayoutParams) AnnouncementActivity.this.f31068W.getLayoutParams();
                layoutParams.height = height;
                AnnouncementActivity.this.f31068W.setLayoutParams(layoutParams);
                AnnouncementActivity.this.f31068W.setBackgroundColor(AnnouncementActivity.this.mo39026b(bitmap));
                AnnouncementActivity.this.f31068W.setImageBitmap(bitmap);
                AnnouncementActivity.this.f31068W.setVisibility(0);
                AnnouncementActivity.this.f31067V.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.shop.AnnouncementActivity$c */
    class C11201c implements Callback<DefaultBean> {
        C11201c() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
        }
    }

    /* renamed from: com.mrsool.shop.AnnouncementActivity$d */
    class C11202d implements Callback<AnnouncementMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f31081a;

        C11202d(String str) {
            this.f31081a = str;
        }

        public void onFailure(Call<AnnouncementMainBean> call, Throwable th) {
            try {
                AnnouncementActivity.this.f29642a.mo23492O();
            } catch (Exception unused) {
            }
        }

        public void onResponse(Call<AnnouncementMainBean> call, Response<AnnouncementMainBean> response) {
            AnnouncementActivity.this.f29642a.mo23492O();
            try {
                if (response.isSuccessful()) {
                    String str = this.f31081a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(C11644i.f33089G);
                    if (str.equalsIgnoreCase(sb.toString())) {
                        C11644i.f33089G = -1;
                    }
                    if (((AnnouncementMainBean) response.body()).getCode() <= 250) {
                        AnnouncementActivity.this.m50683a(((AnnouncementMainBean) response.body()).getAnnouncement());
                    } else {
                        AnnouncementActivity.this.f29642a.mo23615f(((AnnouncementMainBean) response.body()).getMessage(), AnnouncementActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shop.AnnouncementActivity$e */
    class C11203e implements Callback<LastAnnouncementRating> {
        C11203e() {
        }

        public void onFailure(Call<LastAnnouncementRating> call, Throwable th) {
            AnnouncementActivity.this.onBackPressed();
        }

        public void onResponse(Call<LastAnnouncementRating> call, Response<LastAnnouncementRating> response) {
            if (response.isSuccessful()) {
                LastAnnouncementRating lastAnnouncementRating = (LastAnnouncementRating) response.body();
                if (lastAnnouncementRating.getCode().intValue() <= 300) {
                    AnnouncementActivity.this.m50683a(lastAnnouncementRating.getAnnouncement());
                } else {
                    AnnouncementActivity.this.onBackPressed();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shop.AnnouncementActivity$f */
    class C11204f implements Callback<AnnouncementMainBean> {
        C11204f() {
        }

        public void onFailure(Call<AnnouncementMainBean> call, Throwable th) {
            AnnouncementActivity.this.onBackPressed();
        }

        public void onResponse(Call<AnnouncementMainBean> call, Response<AnnouncementMainBean> response) {
            try {
                if (response.isSuccessful()) {
                    AnnouncementMainBean announcementMainBean = (AnnouncementMainBean) response.body();
                    if (announcementMainBean.getCode() <= 300) {
                        AnnouncementActivity.this.m50683a(announcementMainBean.getAnnouncement());
                    } else {
                        AnnouncementActivity.this.onBackPressed();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: J */
    private void m50677J() {
        Bundle bundle = this.f31072a0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33463z1)) {
                m50688k(this.f31072a0.getString(C11644i.f33463z1));
            }
            String str = "";
            if (this.f31072a0.containsKey(C11644i.f33391q1)) {
                TextView textView = this.f31069X;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f31072a0.getString(C11644i.f33391q1));
                textView.setText(sb.toString());
            }
            if (this.f31072a0.containsKey(C11644i.f33243Z1)) {
                TextView textView2 = this.f31070Y;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f31072a0.getString(C11644i.f33243Z1));
                textView2.setText(sb2.toString());
            }
            String str2 = "action_button_type";
            if (this.f31072a0.containsKey(str2)) {
                this.f31073b0 = this.f31072a0.getInt(str2);
            }
            String str3 = "action_button_name";
            if (this.f31072a0.containsKey(str3)) {
                this.f31074c0 = this.f31072a0.getString(str3);
            }
            String str4 = "action_button_value";
            if (this.f31072a0.containsKey(str4)) {
                this.f31075d0 = this.f31072a0.getString(str4);
            }
            m50681N();
        }
    }

    /* renamed from: K */
    private void m50678K() {
        HashMap hashMap = new HashMap();
        hashMap.put("current_user_id", this.f29642a.mo23476G());
        hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        C5882b.m25774a(this.f29642a).getLastAnnouncement(hashMap).enqueue(new C11204f());
    }

    /* renamed from: L */
    private void m50679L() {
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        C5882b.m25774a(this.f29642a).getLastAnnouncementRating(this.f29642a.mo23476G(), hashMap).enqueue(new C11203e());
    }

    /* renamed from: M */
    private void m50680M() {
        if (this.f29642a.mo23496R()) {
            mo38399G();
        }
        this.f29642a.mo23540a(this.f31077f0, C11644i.f33458y4);
        this.f31072a0 = getIntent().getExtras();
        this.f31068W = (ImageView) findViewById(C10232R.C10236id.ivBanner);
        ImageView imageView = this.f31068W;
        double d = (double) C11644i.f33105I;
        Double.isNaN(d);
        imageView.setMaxHeight((int) (d * 0.7d));
        this.f31066U = (RelativeLayout) findViewById(C10232R.C10236id.llClose);
        this.f31067V = (ProgressBar) findViewById(C10232R.C10236id.pgProgressBar);
        this.f31069X = (TextView) findViewById(C10232R.C10236id.tvTitle);
        this.f31070Y = (TextView) findViewById(C10232R.C10236id.tvDetail);
        this.f31070Y.setMovementMethod(new ScrollingMovementMethod());
        this.f31071Z = (TextView) findViewById(C10232R.C10236id.tvOpen);
        this.f31071Z.setOnClickListener(this);
        this.f31068W.setOnClickListener(this);
        if (C5887x.m25797a(this.f31072a0).equalsIgnoreCase(getString(C10232R.string.lbl_frg_notification)) || C5887x.m25797a(this.f31072a0).equalsIgnoreCase(getString(C10232R.string.lbl_screen_home))) {
            m50686i(this.f31072a0.getString(C11644i.f33367n1));
        } else if (C5887x.m25797a(this.f31072a0).equalsIgnoreCase("push")) {
            m50686i(this.f31072a0.getString(C11644i.f33367n1));
        } else {
            m50677J();
        }
        Bundle bundle = this.f31072a0;
        if (bundle != null) {
            String str = "shouldUpgrade";
            if (bundle.containsKey(str) && this.f31072a0.getBoolean(str)) {
                this.f29642a.mo23493O(getResources().getString(C10232R.string.msg_updateChecker));
            }
        }
        m50687j(this.f31072a0.getString(C11644i.f33367n1));
        this.f31066U.setOnClickListener(this);
    }

    /* renamed from: N */
    private void m50681N() {
        if (this.f31073b0 != 1) {
            this.f31071Z.setVisibility(0);
            TextView textView = this.f31071Z;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f31074c0);
            textView.setText(sb.toString());
            return;
        }
        this.f31071Z.setVisibility(8);
    }

    /* renamed from: i */
    private void m50686i(String str) {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23619g(getResources().getString(C10232R.string.app_name), getResources().getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str);
            hashMap.put("announcement_id", sb.toString());
            C5882b.m25774a(this.f29642a).getAnnouncementDetail(str, hashMap).enqueue(new C11202d(str));
        }
    }

    /* renamed from: j */
    private void m50687j(String str) {
        if (this.f29642a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str);
            hashMap.put("announcement_id", sb.toString());
            C5882b.m25774a(this.f29642a).getAnnouncementView(str, hashMap).enqueue(new C11201c());
        }
    }

    /* renamed from: k */
    private void m50688k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f31076e0 = str;
            this.f31067V.setVisibility(0);
            C2232l.m11649c(getApplicationContext()).mo9515a(str).mo9441j().mo9458b(new C11200b());
        }
    }

    public void onBackPressed() {
        Bundle bundle = this.f31072a0;
        if (bundle != null) {
            String str = C11644i.f33199T5;
            if (bundle.containsKey(str) && (this.f31072a0.getString(str).equalsIgnoreCase(getString(C10232R.string.lbl_screen_home)) || this.f31072a0.getString(str).equalsIgnoreCase("homeActivity"))) {
                setResult(-1, new Intent());
                finish();
            }
        }
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.ivBanner) {
            try {
                if (!TextUtils.isEmpty(this.f31076e0)) {
                    Intent intent = new Intent(this.f31064S, ViewPhotoFullActivity.class);
                    intent.putExtra(C11644i.f33463z1, this.f31076e0);
                    this.f31064S.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        } else if (id == C10232R.C10236id.llClose) {
            onBackPressed();
        } else if (id == C10232R.C10236id.tvOpen) {
            C5880q.m25751b("clicked");
            String string = getResources().getString(C10232R.string.ct_event_param_value_announcement);
            StringBuilder sb = new StringBuilder();
            sb.append("Announcement - ");
            Bundle bundle = this.f31072a0;
            sb.append(bundle != null ? bundle.getString(C11644i.f33367n1) : "");
            CTEventBean cTEventBean = new CTEventBean(string, sb.toString());
            int i = this.f31073b0;
            String str = C11644i.f33207U5;
            String str2 = C11644i.f33199T5;
            if (i == 2) {
                Intent intent2 = new Intent(this, ShopDetailActivity.class);
                intent2.putExtra(str2, getString(C10232R.string.lbl_push_notification));
                intent2.putExtra(C11644i.f33367n1, this.f31075d0);
                intent2.putExtra(str, cTEventBean);
                startActivity(intent2);
            } else if (i == 3) {
                Intent intent3 = new Intent(this, ShopDetailPackageActivity.class);
                intent3.putExtra(str2, getString(C10232R.string.lbl_push_notification));
                intent3.putExtra(C11644i.f33367n1, this.f31075d0);
                intent3.putExtra(str, cTEventBean);
                startActivity(intent3);
            } else if (i == 4) {
                this.f29642a.mo23677z(this.f31075d0);
            } else if (i == 5) {
                this.f29642a.mo23489M(getString(C10232R.string.msg_copied));
                C5887x xVar = this.f29642a;
                String str3 = this.f31075d0;
                xVar.mo23554a(str3, str3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_announcement);
        C11644i.f33129L = true;
        m50680M();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11644i.f33129L = false;
        this.f29642a.mo23539a(this.f31077f0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: b */
    public int mo39026b(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        int pixel = createScaledBitmap.getPixel(0, 0);
        createScaledBitmap.recycle();
        return pixel;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50683a(AnnouncementBean announcementBean) {
        m50688k(announcementBean.getImage());
        TextView textView = this.f31069X;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(announcementBean.getTitle());
        textView.setText(sb.toString());
        TextView textView2 = this.f31070Y;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(announcementBean.getDescription());
        textView2.setText(sb2.toString());
        this.f31073b0 = announcementBean.getAction_button_type();
        this.f31074c0 = announcementBean.getAction_button_name();
        this.f31075d0 = announcementBean.getAction_button_value();
        m50681N();
    }
}
