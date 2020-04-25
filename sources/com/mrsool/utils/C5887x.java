package com.mrsool.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.media.ThumbnailUtils;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0727a;
import androidx.core.content.C0841b;
import androidx.core.content.FileProvider;
import androidx.core.content.p019g.C0852b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.C1712h;
import androidx.recyclerview.widget.RecyclerView;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.places.model.PlaceFields;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.p296f.C6845b;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.google.gson.C8775f;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;
import com.jackandphantom.circularimageview.RoundedImage;
import com.krishna.fileloader.p408i.C10186b;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.MainActivity;
import com.mrsool.SplashActivity;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.ComplaintTokenBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.bean.MyOrdersInactive;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ServiceManualMainBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.bean.XmppDetails;
import com.mrsool.bean.manualDataBean;
import com.mrsool.bean.messages;
import com.mrsool.bean.serviceManualStepsBean;
import com.mrsool.chat.AdvanceWebviewActivity;
import com.mrsool.chat.C10526n;
import com.mrsool.chat.C10526n.C10527a;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.order.C11056p;
import com.mrsool.order.C11065s;
import com.mrsool.order.C11065s.C11069d;
import com.mrsool.p409me.TermsOfServiceActivity;
import com.mrsool.p423v.C11728i;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shopmenu.bean.MenuDatabean;
import com.mrsool.socket.LocationService;
import com.mrsool.utils.C11644i.C11645a;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import com.mrsool.utils.webservice.C5882b;
import com.mrsool.utils.webservice.CustomTypefaceSpan;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p468g.C13817d0;
import p468g.C13872x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.utils.x */
/* compiled from: Utils */
public class C5887x {

    /* renamed from: q */
    public static Dialog f17105q;

    /* renamed from: r */
    public static Dialog f17106r;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f17107a;

    /* renamed from: b */
    private int f17108b = 2000;

    /* renamed from: c */
    public ProgressDialog f17109c;

    /* renamed from: d */
    private C5881v f17110d;

    /* renamed from: e */
    private C5881v f17111e;

    /* renamed from: f */
    private File f17112f = null;

    /* renamed from: g */
    private Bitmap f17113g = null;

    /* renamed from: h */
    private String f17114h = null;

    /* renamed from: i */
    public Toast f17115i;

    /* renamed from: j */
    public Toast f17116j;

    /* renamed from: k */
    public C11056p f17117k;

    /* renamed from: l */
    public Dialog f17118l;

    /* renamed from: m */
    public String f17119m = "filesdir";

    /* renamed from: n */
    public String f17120n = "/menu";

    /* renamed from: o */
    public Dialog f17121o;

    /* renamed from: p */
    private C5903h0 f17122p;

    /* renamed from: com.mrsool.utils.x$a */
    /* compiled from: Utils */
    class C5888a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f17123a;

        C5888a(Dialog dialog) {
            this.f17123a = dialog;
        }

        public void onClick(View view) {
            this.f17123a.dismiss();
            ((Activity) C5887x.this.f17107a).finish();
        }
    }

    /* renamed from: com.mrsool.utils.x$a0 */
    /* compiled from: Utils */
    class C5889a0 implements DialogInterface.OnClickListener {
        C5889a0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.mrsool.utils.x$b */
    /* compiled from: Utils */
    class C5890b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f17126a;

        C5890b(Dialog dialog) {
            this.f17126a = dialog;
        }

        public void onClick(View view) {
            this.f17126a.dismiss();
        }
    }

    /* renamed from: com.mrsool.utils.x$b0 */
    /* compiled from: Utils */
    class C5891b0 implements OnClickListener {
        C5891b0() {
        }

        public void onClick(View view) {
            C5887x.f17105q.dismiss();
            C5887x.f17105q = null;
        }
    }

    /* renamed from: com.mrsool.utils.x$c */
    /* compiled from: Utils */
    class C5892c implements Callback<UserDetail> {
        C5892c() {
        }

        public void onFailure(Call<UserDetail> call, Throwable th) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("callGetUserDetailAPI onFailure");
                sb.append(th.toString());
                C5880q.m25753d(sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UserDetail> call, Response<UserDetail> response) {
            try {
                if (response.isSuccessful() && ((UserDetail) response.body()).getCode() <= 300) {
                    C11644i.f33061C3 = ((UserDetail) response.body()).getUser().getPnMyActiveOrderCount();
                    C11644i.f33069D3 = ((UserDetail) response.body()).getUser().getPnMyInActiveOrderCount();
                    C11644i.f33077E3 = ((UserDetail) response.body()).getUser().getPnMyActiveDeliveriesCount();
                    C11644i.f33085F3 = ((UserDetail) response.body()).getUser().getPnMyInActiveDeliveriesCount();
                    C11644i.f33093G3 = ((UserDetail) response.body()).getUser().getPnNotificationListCount();
                    C11644i.f33101H3 = ((UserDetail) response.body()).getUser().getPnMyorderTotalCount();
                    C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                    C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                    C5887x.this.mo23468C().mo23449a(C11644i.f33395q5, ((UserDetail) response.body()).getUser().getVProfilePic());
                    C5887x.this.mo23468C().mo23449a("user_name", ((UserDetail) response.body()).getUser().getVFullName());
                    int i = 0;
                    HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                    if (C11644i.f33093G3 > 0) {
                        i = C11644i.f33093G3;
                    }
                    aHBottomNavigation.mo11496b(i, 2);
                    C11644i.f33112I6 = C11644i.f33093G3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$c0 */
    /* compiled from: Utils */
    class C5893c0 implements OnClickListener {
        C5893c0() {
        }

        public void onClick(View view) {
            C5887x.f17105q.dismiss();
            C5887x.f17105q = null;
        }
    }

    /* renamed from: com.mrsool.utils.x$d */
    /* compiled from: Utils */
    class C5894d extends AsyncTask<Void, String, String> {
        C5894d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str = "";
            C5887x.this.mo23627i("inside asynctask");
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
            } catch (Exception e) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("XmppUtil Utils : connectToXmpp looperexception:");
                    sb.append(e.getMessage());
                    C5880q.m25751b(sb.toString());
                } catch (IOException | KeyManagementException | NoSuchAlgorithmException | SmackException | XMPPException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("XmppUtil Utils : connectToXmppexception:");
                    sb2.append(e2.getMessage());
                    C5880q.m25751b(sb2.toString());
                    C5887x.this.mo23610e(e2.getMessage());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(e2.getMessage());
                    return sb3.toString();
                }
            }
            String f = C5887x.this.mo23468C().mo23459f("user_id");
            C11694e.INSTANCE.mo40197a(C5887x.this.f17107a, f, f, null);
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
        }
    }

    /* renamed from: com.mrsool.utils.x$d0 */
    /* compiled from: Utils */
    class C5895d0 implements Runnable {
        C5895d0() {
        }

        public void run() {
            C5887x.this.f17109c.dismiss();
            C5887x.this.f17109c = null;
        }
    }

    /* renamed from: com.mrsool.utils.x$e */
    /* compiled from: Utils */
    class C5896e implements DialogInterface.OnClickListener {
        C5896e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.mrsool.utils.x$e0 */
    /* compiled from: Utils */
    class C5897e0 implements OnClickListener {
        C5897e0() {
        }

        public void onClick(View view) {
            Dialog dialog = C5887x.f17106r;
            if (dialog != null) {
                dialog.dismiss();
            }
            C5887x.f17106r = null;
        }
    }

    /* renamed from: com.mrsool.utils.x$f */
    /* compiled from: Utils */
    class C5898f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f17135a;

        C5898f(Activity activity) {
            this.f17135a = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C5887x.this.mo23530a();
            C0727a.m4239a(this.f17135a);
            C5887x.this.f17107a.startActivity(new Intent(this.f17135a, SplashActivity.class));
            this.f17135a.finish();
        }
    }

    /* renamed from: com.mrsool.utils.x$f0 */
    /* compiled from: Utils */
    class C5899f0 implements OnClickListener {
        C5899f0() {
        }

        public void onClick(View view) {
            Dialog dialog = C5887x.f17106r;
            if (dialog != null) {
                dialog.dismiss();
            }
            try {
                ((Activity) C5887x.this.f17107a).startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), C11644i.f33366n0);
            } catch (Exception unused) {
            }
            C5887x.f17106r = null;
        }
    }

    /* renamed from: com.mrsool.utils.x$g */
    /* compiled from: Utils */
    class C5900g implements DialogInterface.OnClickListener {
        C5900g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                C5882b.f17061m = C5882b.f17046h;
            } else if (i == 1) {
                C5882b.f17061m = C5882b.f17043g;
            } else if (i == 2) {
                C5882b.f17061m = C5882b.f17058l;
            }
            C5887x.this.mo23470D().mo23449a("base_url", C5882b.f17061m);
        }
    }

    /* renamed from: com.mrsool.utils.x$g0 */
    /* compiled from: Utils */
    class C5901g0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f17139a;

        C5901g0(Dialog dialog) {
            this.f17139a = dialog;
        }

        public void onClick(View view) {
            this.f17139a.dismiss();
        }
    }

    /* renamed from: com.mrsool.utils.x$h */
    /* compiled from: Utils */
    class C5902h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f17141a;

        C5902h(Dialog dialog) {
            this.f17141a = dialog;
        }

        public void onClick(View view) {
            this.f17141a.dismiss();
        }
    }

    /* renamed from: com.mrsool.utils.x$h0 */
    /* compiled from: Utils */
    public interface C5903h0 {
        /* renamed from: a */
        void mo23697a();

        /* renamed from: b */
        void mo23698b();
    }

    /* renamed from: com.mrsool.utils.x$i */
    /* compiled from: Utils */
    class C5904i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f17143a;

        C5904i(Dialog dialog) {
            this.f17143a = dialog;
        }

        public void onClick(View view) {
            C5887x.this.mo23629i0();
            this.f17143a.dismiss();
        }
    }

    /* renamed from: com.mrsool.utils.x$j */
    /* compiled from: Utils */
    class C5905j implements AnimationListener {

        /* renamed from: N */
        final /* synthetic */ Animation f17145N;

        /* renamed from: a */
        final /* synthetic */ TextView f17147a;

        /* renamed from: b */
        final /* synthetic */ String f17148b;

        C5905j(TextView textView, String str, Animation animation) {
            this.f17147a = textView;
            this.f17148b = str;
            this.f17145N = animation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f17147a.setText(this.f17148b);
            this.f17147a.startAnimation(this.f17145N);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.utils.x$k */
    /* compiled from: Utils */
    class C5906k implements DialogInterface.OnClickListener {
        C5906k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.mrsool.utils.x$l */
    /* compiled from: Utils */
    class C5907l implements C11069d {

        /* renamed from: a */
        final /* synthetic */ List f17150a;

        /* renamed from: b */
        final /* synthetic */ C11065s f17151b;

        /* renamed from: c */
        final /* synthetic */ TextView f17152c;

        C5907l(List list, C11065s sVar, TextView textView) {
            this.f17150a = list;
            this.f17151b = sVar;
            this.f17152c = textView;
        }

        /* renamed from: a */
        public void mo23704a(int i) {
            ((serviceManualStepsBean) this.f17150a.get(i)).setRead(true);
            this.f17151b.mo7337d(i);
            if (C5887x.this.mo23565a(this.f17150a)) {
                this.f17152c.setEnabled(false);
                this.f17152c.setBackgroundResource(C10232R.C10235drawable.bg_got_it_button);
                C5887x.this.mo23558a(true, this.f17152c, true);
                return;
            }
            C5887x.this.mo23558a(false, this.f17152c, true);
        }

        /* renamed from: b */
        public void mo23705b(int i) {
            C5887x.this.mo23675y(((serviceManualStepsBean) this.f17150a.get(i)).getIconUrl());
        }
    }

    /* renamed from: com.mrsool.utils.x$m */
    /* compiled from: Utils */
    class C5908m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ServiceManualDataBean f17154a;

        C5908m(ServiceManualDataBean serviceManualDataBean) {
            this.f17154a = serviceManualDataBean;
        }

        public void onClick(View view) {
            C5880q.m25751b("Call log");
            C5887x xVar = C5887x.this;
            xVar.mo23536a(xVar.f17118l, this.f17154a);
        }
    }

    /* renamed from: com.mrsool.utils.x$n */
    /* compiled from: Utils */
    class C5909n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f17156a;

        C5909n(List list) {
            this.f17156a = list;
        }

        public void onClick(View view) {
            C5887x xVar = C5887x.this;
            xVar.mo23538a(xVar.f17118l, this.f17156a);
        }
    }

    /* renamed from: com.mrsool.utils.x$o */
    /* compiled from: Utils */
    class C5910o implements Callback<ServiceManualMainBean> {

        /* renamed from: a */
        final /* synthetic */ ServiceManualDataBean f17158a;

        C5910o(ServiceManualDataBean serviceManualDataBean) {
            this.f17158a = serviceManualDataBean;
        }

        public void onFailure(Call<ServiceManualMainBean> call, Throwable th) {
            C11056p pVar = C5887x.this.f17117k;
            if (pVar != null) {
                pVar.mo36511f(this.f17158a.getAction());
            }
        }

        public void onResponse(Call<ServiceManualMainBean> call, Response<ServiceManualMainBean> response) {
            try {
                if (response.isSuccessful()) {
                    if (((ServiceManualMainBean) response.body()).getCode() <= 300) {
                        C5887x.this.mo23556a(((manualDataBean) ((ServiceManualMainBean) response.body()).getManualData().get(0)).getServiceManualSteps(), this.f17158a);
                    } else if (C5887x.this.f17117k != null) {
                        C5887x.this.f17117k.mo36511f(this.f17158a.getAction());
                    }
                } else if (C5887x.this.f17117k != null) {
                    C5887x.this.f17117k.mo36511f(this.f17158a.getAction());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$p */
    /* compiled from: Utils */
    class C5911p implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ ServiceManualDataBean f17160a;

        /* renamed from: b */
        final /* synthetic */ Dialog f17161b;

        C5911p(ServiceManualDataBean serviceManualDataBean, Dialog dialog) {
            this.f17160a = serviceManualDataBean;
            this.f17161b = dialog;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5887x.this.mo23492O();
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                C5887x.this.mo23492O();
                if (response.isSuccessful() && ((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    if (C5887x.this.f17117k != null) {
                        C5887x.this.f17117k.mo36511f(this.f17160a.getAction());
                    }
                    if (this.f17161b != null) {
                        this.f17161b.dismiss();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$q */
    /* compiled from: Utils */
    class C5912q implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ ServiceManualDataBean f17163a;

        /* renamed from: b */
        final /* synthetic */ Dialog f17164b;

        C5912q(ServiceManualDataBean serviceManualDataBean, Dialog dialog) {
            this.f17163a = serviceManualDataBean;
            this.f17164b = dialog;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5887x.this.mo23492O();
            C5887x.this.mo23653q0();
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            C5887x.this.mo23492O();
            if (!response.isSuccessful()) {
                C5887x.this.mo23487L(response.message());
            } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                C11056p pVar = C5887x.this.f17117k;
                if (pVar != null) {
                    pVar.mo36511f(this.f17163a.getAction());
                }
                Dialog dialog = this.f17164b;
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else {
                C5887x.this.mo23487L(((DefaultBean) response.body()).getMessage());
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$r */
    /* compiled from: Utils */
    class C5913r implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ String f17166a;

        C5913r(String str) {
            this.f17166a = str;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                if (response.isSuccessful() && ((DefaultBean) response.body()).getCode().intValue() < 300) {
                    if (!this.f17166a.equalsIgnoreCase(C11644i.f33457y3)) {
                        C5887x.this.f17107a.getApplicationContext().stopService(new Intent(C5887x.this.f17107a, LocationService.class));
                    } else if (!C5887x.this.mo23584b(LocationService.class)) {
                        C5887x.this.mo23671w0();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$s */
    /* compiled from: Utils */
    class C5914s implements Callback<DefaultBean> {
        C5914s() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5880q.m25751b("onFailure");
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            C5880q.m25751b("onResponse");
        }
    }

    /* renamed from: com.mrsool.utils.x$t */
    /* compiled from: Utils */
    class C5915t implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ boolean f17170a;

        /* renamed from: b */
        final /* synthetic */ View[] f17171b;

        C5915t(boolean z, View[] viewArr) {
            this.f17170a = z;
            this.f17171b = viewArr;
        }

        public void onAnimationEnd(Animation animation) {
            if (!this.f17170a) {
                int i = 0;
                while (true) {
                    View[] viewArr = this.f17171b;
                    if (i < viewArr.length) {
                        viewArr[i].setVisibility(8);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (this.f17170a) {
                int i = 0;
                while (true) {
                    View[] viewArr = this.f17171b;
                    if (i < viewArr.length) {
                        viewArr[i].setVisibility(0);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$u */
    /* compiled from: Utils */
    class C5916u implements Callback<DefaultBean> {
        C5916u() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
        }
    }

    /* renamed from: com.mrsool.utils.x$v */
    /* compiled from: Utils */
    class C5917v implements DialogInterface.OnClickListener {
        C5917v() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.mrsool.utils.x$w */
    /* compiled from: Utils */
    class C5918w implements Callback<ComplaintTokenBean> {

        /* renamed from: a */
        final /* synthetic */ String f17174a;

        /* renamed from: b */
        final /* synthetic */ String f17175b;

        C5918w(String str, String str2) {
            this.f17174a = str;
            this.f17175b = str2;
        }

        public void onFailure(Call<ComplaintTokenBean> call, Throwable th) {
            C5887x.this.mo23492O();
            C5887x.this.mo23677z(C5887x.m25783B0());
        }

        public void onResponse(Call<ComplaintTokenBean> call, Response<ComplaintTokenBean> response) {
            String str;
            try {
                C5887x.this.mo23492O();
                if (!response.isSuccessful()) {
                    C5887x.this.mo23677z(C5887x.m25783B0());
                } else if (((ComplaintTokenBean) response.body()).getCode().intValue() > 300) {
                    C5887x.this.mo23677z(C5887x.m25783B0());
                } else if (TextUtils.isEmpty(((ComplaintTokenBean) response.body()).getToken())) {
                    C5887x.this.mo23677z(C5887x.m25783B0());
                } else {
                    if (this.f17174a.equalsIgnoreCase("become_courier")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C5887x.m25783B0());
                        sb.append("?token=");
                        sb.append(((ComplaintTokenBean) response.body()).getToken());
                        str = sb.toString();
                    } else {
                        str = C5887x.this.mo23572b(((ComplaintTokenBean) response.body()).getToken(), this.f17175b);
                    }
                    Intent intent = new Intent(C5887x.this.f17107a, AdvanceWebviewActivity.class);
                    intent.putExtra(C11644i.f33391q1, this.f17174a.equalsIgnoreCase("complaint") ? C5887x.this.f17107a.getResources().getString(C10232R.string.lbl_my_filed_complaint) : "");
                    intent.putExtra(C11644i.f33383p1, str);
                    C5887x.this.f17107a.startActivity(intent);
                }
            } catch (Exception unused) {
                C5887x.this.mo23677z(C5887x.m25783B0());
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$x */
    /* compiled from: Utils */
    class C5919x implements OnShowListener {
        C5919x() {
        }

        public void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet);
            BottomSheetBehavior.m24700c(frameLayout).mo22465b(false);
            frameLayout.requestLayout();
        }
    }

    /* renamed from: com.mrsool.utils.x$y */
    /* compiled from: Utils */
    class C5920y implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f17178a;

        C5920y(String str) {
            this.f17178a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300 && this.f17178a.equalsIgnoreCase(C11645a.f33474f)) {
                C5887x.this.mo23473E(CheckoutActivity.f34069j0);
            }
        }
    }

    /* renamed from: com.mrsool.utils.x$z */
    /* compiled from: Utils */
    class C5921z implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f17180a;

        C5921z(String str) {
            this.f17180a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300 && this.f17180a.equalsIgnoreCase(C11645a.f33474f)) {
                C5887x.this.mo23473E(CheckoutActivity.f34069j0);
            }
        }
    }

    public C5887x(Context context) {
        this.f17107a = context;
        this.f17110d = new C5881v(context);
        this.f17111e = new C5881v(context);
        if (context instanceof Activity) {
            try {
                this.f17109c = new ProgressDialog(context);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: A0 */
    public static String m25782A0() {
        return m25786E0() ? "https://forms.staging.mrsool.co/pay" : "https://forms.mrsool.co/pay";
    }

    /* renamed from: B0 */
    public static String m25783B0() {
        return m25786E0() ? "https://forms.staging.mrsool.co/signup" : "https://forms.mrsool.co/signup";
    }

    /* renamed from: C0 */
    public static boolean m25784C0() {
        return VERSION.SDK_INT <= 21;
    }

    /* renamed from: D0 */
    public static boolean m25785D0() {
        return VERSION.SDK_INT < 21;
    }

    /* renamed from: E0 */
    public static boolean m25786E0() {
        return C5882b.f17061m.equalsIgnoreCase(C5882b.f17043g);
    }

    /* renamed from: F0 */
    private int m25787F0() {
        String str = "base_url";
        boolean isEmpty = TextUtils.isEmpty(mo23470D().mo23459f(str));
        String str2 = C5882b.f17058l;
        String str3 = C5882b.f17043g;
        String str4 = C5882b.f17046h;
        int i = 0;
        if (!isEmpty) {
            String f = mo23470D().mo23459f(str);
            char c = 65535;
            int hashCode = f.hashCode();
            if (hashCode != 70508004) {
                if (hashCode != 560855354) {
                    if (hashCode == 1491041664 && f.equals(str4)) {
                        c = 0;
                    }
                } else if (f.equals(str2)) {
                    c = 2;
                }
            } else if (f.equals(str3)) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    i = 1;
                } else if (c == 2) {
                    i = 2;
                }
            }
        } else if (C5882b.f17061m.equalsIgnoreCase(str4)) {
            return 0;
        } else {
            if (C5882b.f17061m.equalsIgnoreCase(str3)) {
                return 1;
            }
            if (C5882b.f17061m.equalsIgnoreCase(str2)) {
                return 2;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static boolean m25789Q(String str) {
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 1536 && codePointAt <= 1760) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    /* renamed from: T */
    public static String m25792T(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("‭");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: x0 */
    private String m25818x0() {
        String str = "N";
        try {
            return C11644i.f33072D6.getUser().getIs_courier().booleanValue() ? "Y" : str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: y0 */
    public static String m25819y0() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://forms");
        sb.append(m25786E0() ? ".staging" : "");
        sb.append(".mrsool.co/iban_registration");
        return sb.toString();
    }

    /* renamed from: z0 */
    public static String m25820z0() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://forms");
        sb.append(m25786E0() ? ".staging" : "");
        sb.append(".mrsool.co/payout");
        return sb.toString();
    }

    /* renamed from: A */
    public String mo23465A(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f17107a.getAssets().open(str), "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: B */
    public int mo23466B() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f17107a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: C */
    public C5881v mo23468C() {
        return this.f17110d;
    }

    /* renamed from: D */
    public C5881v mo23470D() {
        return this.f17111e;
    }

    /* renamed from: E */
    public int mo23472E() {
        int identifier = this.f17107a.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f17107a.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: F */
    public void mo23475F(String str) {
        try {
            if (this.f17107a != null) {
                C6845b bVar = new C6845b(this.f17107a, C10232R.style.AlertDialogTheme);
                bVar.mo770b((CharSequence) this.f17107a.getResources().getString(C10232R.string.app_name));
                bVar.mo758a((CharSequence) str);
                bVar.mo776c((CharSequence) this.f17107a.getString(C10232R.string.lbl_ok), (DialogInterface.OnClickListener) new C5906k());
                if (!((Activity) this.f17107a).isFinishing()) {
                    bVar.mo778c();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: G */
    public void mo23477G(String str) {
        if (mo23661t(str) == null && this.f17107a != null) {
            str = Locale.getDefault().getLanguage();
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase(C11644i.f33191S5);
        String str2 = C11644i.f33183R5;
        if (!equalsIgnoreCase && !str.equalsIgnoreCase(str2)) {
            str = str2;
        }
        Locale.setDefault(new Locale(str));
        Configuration configuration = new Configuration(this.f17107a.getResources().getConfiguration());
        configuration.locale = Locale.getDefault();
        configuration.setLayoutDirection(new Locale(str));
        this.f17107a.getResources().updateConfiguration(configuration, this.f17107a.getResources().getDisplayMetrics());
    }

    /* renamed from: H */
    public String mo23478H() {
        String str = "language";
        String g = mo23468C().mo23460g(str);
        String str2 = C11644i.f33183R5;
        String str3 = C11644i.f33191S5;
        if (g != null || this.f17107a == null) {
            if (mo23468C().mo23460g(str) != null && mo23468C().mo23460g(str).equalsIgnoreCase(str2)) {
                return str2;
            }
            if ((mo23468C().mo23460g(str) != null && mo23468C().mo23460g(str).equalsIgnoreCase(str3)) || !mo23468C().mo23455b("isAutomatic")) {
                return str3;
            }
            if (Locale.getDefault().getLanguage().equalsIgnoreCase(str3) || Locale.getDefault().getLanguage().equalsIgnoreCase(str2)) {
                return Locale.getDefault().getLanguage();
            }
            return str3;
        } else if (Locale.getDefault().getLanguage().equalsIgnoreCase(str3) || Locale.getDefault().getLanguage().equalsIgnoreCase(str2)) {
            return Locale.getDefault().getLanguage();
        } else {
            return str3;
        }
    }

    /* renamed from: I */
    public void mo23481I(String str) {
        this.f17114h = str;
    }

    /* renamed from: J */
    public void mo23483J(String str) {
        try {
            if (this.f17107a != null) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                ((Activity) this.f17107a).startActivity(Intent.createChooser(intent, this.f17107a.getResources().getText(C10232R.string.lbl_share_to)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: K */
    public Bitmap mo23484K() {
        return this.f17113g;
    }

    /* renamed from: L */
    public File mo23486L() {
        return this.f17112f;
    }

    /* renamed from: M */
    public void mo23489M(String str) {
        try {
            if (mo23661t(str) != null && !mo23583b(this.f17107a)) {
                Toast.makeText(this.f17107a, str, 0).show();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    public void mo23491N(String str) {
        try {
            if (mo23661t(str) != null && !mo23583b(this.f17107a)) {
                Toast.makeText(this.f17107a, str, 1).show();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    public void mo23492O() {
        try {
            if (this.f17109c != null && this.f17109c.isShowing()) {
                ((Activity) this.f17107a).runOnUiThread(new C5895d0());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: P */
    public void mo23494P() {
        Context context = this.f17107a;
        if (context != null) {
            try {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(((Activity) this.f17107a).getCurrentFocus().getWindowToken(), 0);
            } catch (StackOverflowError e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: R */
    public boolean mo23496R() {
        return mo23470D().mo23460g("language").equalsIgnoreCase(C11644i.f33191S5);
    }

    /* renamed from: S */
    public boolean mo23497S() {
        if (SystemClock.elapsedRealtime() - C11644i.f33152N6 < 1000) {
            return false;
        }
        C11644i.f33152N6 = SystemClock.elapsedRealtime();
        return true;
    }

    /* renamed from: U */
    public boolean mo23499U() {
        return mo23468C().mo23450a(C11644i.f33411s5);
    }

    /* renamed from: V */
    public boolean mo23500V() {
        try {
            if (((LocationManager) this.f17107a.getSystemService("location")).isProviderEnabled("gps") || mo23482J() == 2) {
                return true;
            }
            mo23656r0();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: W */
    public boolean mo23501W() {
        return mo23468C().mo23450a(C11644i.f33222W4) || mo23468C().mo23450a(C11644i.f33206U4) || mo23468C().mo23450a(C11644i.f33214V4);
    }

    /* renamed from: X */
    public boolean mo23502X() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17107a.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable() && connectivityManager.getActiveNetworkInfo().isConnected()) {
                return true;
            }
            mo23644n0();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: Y */
    public boolean mo23503Y() {
        if (this.f17107a == null || !mo23468C().mo23450a(C11644i.f33230X4)) {
            return false;
        }
        Intent intent = new Intent(this.f17107a, MainActivity.class);
        intent.putExtra("isGuest", true);
        ((Activity) this.f17107a).startActivity(intent);
        return true;
    }

    /* renamed from: Z */
    public Boolean mo23504Z() {
        return Boolean.valueOf(mo23468C().mo23450a(C11644i.f33230X4));
    }

    /* renamed from: a */
    public int mo23506a(boolean z) {
        return z ? C10232R.C10235drawable.pin_customer : C10232R.C10235drawable.pin_dropoff;
    }

    /* renamed from: a0 */
    public boolean mo23566a0() {
        return TextUtils.isEmpty(mo23476G());
    }

    /* renamed from: b */
    public void mo23580b(String str, String str2, String str3) {
        Context context = this.f17107a;
        if (context != null) {
            C6845b bVar = new C6845b(context, C10232R.style.AlertDialogTheme);
            bVar.mo770b((CharSequence) this.f17107a.getResources().getString(C10232R.string.app_name));
            bVar.mo758a((CharSequence) str);
            bVar.mo776c((CharSequence) str2, (DialogInterface.OnClickListener) new C5917v());
            bVar.mo759a((CharSequence) str3, (DialogInterface.OnClickListener) new C5889a0());
            if (!((Activity) this.f17107a).isFinishing()) {
                bVar.mo778c();
            }
        }
    }

    /* renamed from: b0 */
    public boolean mo23585b0() {
        return mo23468C().mo23450a(C11644i.f33206U4) || mo23468C().mo23450a(C11644i.f33214V4) || mo23468C().mo23450a(C11644i.f33222W4);
    }

    /* renamed from: c */
    public void mo23589c(int i) {
        mo23605d(mo23510a(mo23484K(), i));
        mo23579b(m25807b(mo23484K(), 50));
    }

    /* renamed from: c0 */
    public boolean mo23599c0() {
        return TextUtils.isEmpty(C11644i.f33322i0) || TextUtils.isEmpty(C11644i.f33331j0) || TextUtils.isEmpty(C11644i.f33340k0);
    }

    /* renamed from: d */
    public int mo23601d(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, this.f17107a.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public int mo23602d(boolean z) {
        return z ? C10232R.C10235drawable.pin_store : C10232R.C10235drawable.pin_pickup;
    }

    /* renamed from: d0 */
    public void mo23609d0() {
        if (!((Activity) this.f17107a).isDestroyed()) {
            ((Activity) this.f17107a).finish();
        }
        mo23473E(C11644i.f33466z4);
    }

    /* renamed from: e */
    public boolean mo23612e() {
        try {
            if (((LocationManager) this.f17107a.getSystemService("location")).isProviderEnabled("gps") || mo23482J() == 2) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e0 */
    public void mo23613e0() {
        C5881v C = mo23468C();
        String str = C11644i.f33419t5;
        String f = C.mo23459f(str);
        mo23468C().mo23445a();
        mo23530a();
        if (mo23584b(LocationService.class)) {
            Context context = this.f17107a;
            context.stopService(new Intent(context, LocationService.class));
        }
        C11694e.m52677u().mo40209e();
        mo23468C().mo23449a(str, f);
        Intent intent = new Intent(this.f17107a, MainActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        this.f17107a.startActivity(intent);
        ((Activity) this.f17107a).finish();
    }

    /* renamed from: f */
    public boolean mo23616f() {
        boolean z;
        boolean z2;
        String str = "location";
        LocationManager locationManager = (LocationManager) this.f17107a.getSystemService(str);
        if (locationManager == null) {
            locationManager = (LocationManager) this.f17107a.getSystemService(str);
        }
        try {
            z = locationManager.isProviderEnabled("gps");
        } catch (Exception unused) {
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled(Network.TYPE_NETWORK);
        } catch (Exception unused2) {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public void mo23617f0() {
        try {
            RingtoneManager.getRingtone(this.f17107a, RingtoneManager.getDefaultUri(2)).play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public boolean mo23620g() {
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17107a.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g0 */
    public void mo23621g0() {
        String str = "CleverTap: profilePushed===========";
        String str2 = "Country Code";
        String str3 = "Phone";
        String str4 = "MSG-push";
        String str5 = "Courier";
        String str6 = "Year Of Birth";
        String str7 = "Email";
        String str8 = C11644i.f33451x5;
        String str9 = "Identity";
        String str10 = "Name";
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(str10, C11644i.f33072D6.getUser().getVFullName());
            hashMap.put(str9, mo23476G());
            hashMap.put(str8, C11644i.f33072D6.getUser().getvGender());
            hashMap.put(str7, C11644i.f33072D6.getUser().getVEmail());
            hashMap.put(str6, C11644i.f33072D6.getUser().getvBirthYear());
            hashMap.put(str5, m25818x0());
            hashMap.put(str4, C11644i.f33072D6.getUser().getbAnnouncement());
            hashMap.put(str3, C11644i.f33072D6.getUser().getVPhone());
            hashMap.put(str2, C11644i.f33072D6.getUser().getCountryCode());
            AppSingleton.f16949P.mo12451a((Map<String, Object>) hashMap);
            C5880q.m25751b(str);
            StringBuilder sb = new StringBuilder();
            sb.append("CleverTap: Name:");
            sb.append(hashMap.get(str10).toString());
            C5880q.m25751b(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CleverTap: Identity:");
            sb2.append(hashMap.get(str9).toString());
            C5880q.m25751b(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CleverTap: gender:");
            sb3.append(hashMap.get(str8).toString());
            C5880q.m25751b(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("CleverTap: Email:");
            sb4.append(hashMap.get(str7).toString());
            C5880q.m25751b(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CleverTap: Year Of Birth:");
            sb5.append(hashMap.get(str6).toString());
            C5880q.m25751b(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("CleverTap: Courier:");
            sb6.append(hashMap.get(str5).toString());
            C5880q.m25751b(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("CleverTap: MSG-push:");
            sb7.append(hashMap.get(str4).toString());
            C5880q.m25751b(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("CleverTap: Phone:");
            sb8.append(hashMap.get(str3).toString());
            C5880q.m25751b(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("CleverTap: Country Code:");
            sb9.append(hashMap.get(str2).toString());
            C5880q.m25751b(sb9.toString());
            C5880q.m25751b(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public boolean mo23624h() {
        return C11728i.m52794a((Activity) this.f17107a);
    }

    /* renamed from: h0 */
    public String mo23625h0() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f17107a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (!(primaryClip == null || primaryClipDescription == null || !primaryClipDescription.hasMimeType("text/plain"))) {
                return String.valueOf(primaryClip.getItemAt(0).getText()).trim();
            }
        }
        return "";
    }

    /* renamed from: i */
    public void mo23626i() {
        C5880q.m25751b("XmppUtil Utils : connectToXmpp");
        StringBuilder sb = new StringBuilder();
        sb.append("XmppUtil Utils : connectToXmpp:");
        sb.append(C11694e.INSTANCE.mo40213h());
        C5880q.m25751b(sb.toString());
        mo23627i("try to connect xmpp");
        try {
            if (C11694e.INSTANCE.mo40213h()) {
                if (C11694e.INSTANCE.connection.isAuthenticated()) {
                    C5880q.m25751b("in xmpp else");
                    mo23627i("connection is already connected");
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("inside check connect : isconnected ");
            sb2.append(C11694e.INSTANCE.mo40213h());
            mo23627i(sb2.toString());
            new C5894d().execute(new Void[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i0 */
    public void mo23629i0() {
        String str = "android.intent.action.VIEW";
        String packageName = this.f17107a.getPackageName();
        try {
            Context context = this.f17107a;
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(packageName);
            context.startActivity(new Intent(str, Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            Context context2 = this.f17107a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://play.google.com/store/apps/details?id=");
            sb2.append(packageName);
            context2.startActivity(new Intent(str, Uri.parse(sb2.toString())));
        }
    }

    /* renamed from: j */
    public void mo23631j() {
        File file = new File("sdcard/Mrsool_Rating_Issue.txt");
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: j0 */
    public void mo23632j0() {
        try {
            Location location = new Location("current");
            location.setLatitude(mo23648p().latitude);
            location.setLongitude(mo23648p().longitude);
            AppSingleton.f16949P.mo12433a(location);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public String mo23633k() {
        try {
            PackageInfo packageInfo = this.f17107a.getPackageManager().getPackageInfo(this.f17107a.getPackageName(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C0852b.m4948a(packageInfo));
            return sb.toString();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "108";
        }
    }

    /* renamed from: k0 */
    public void mo23635k0() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f17107a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            if (i > 0) {
                C11644i.f33105I = i;
            }
            if (i2 > 0) {
                C11644i.f33097H = i2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public String mo23636l() {
        try {
            return this.f17107a.getPackageManager().getPackageInfo(this.f17107a.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "1.0";
        }
    }

    /* renamed from: l0 */
    public void mo23638l0() {
        try {
            if (mo23474F() == 0) {
                int identifier = this.f17107a.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    mo23470D().mo23452b(C11644i.f33304g0, this.f17107a.getResources().getDimensionPixelSize(identifier));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public String mo23640m() {
        return mo23468C().mo23459f(C11644i.f33443w5);
    }

    /* renamed from: m0 */
    public void mo23641m0() {
        try {
            if (f17105q == null && this.f17107a != null) {
                f17105q = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
                f17105q.setContentView(C10232R.layout.dialog_pos_neg);
                f17105q.setCancelable(false);
                ((TextView) f17105q.findViewById(C10232R.C10236id.txtdMessage)).setText(this.f17107a.getString(C10232R.string.msg_info_internet_connection));
                ((TextView) f17105q.findViewById(C10232R.C10236id.txtdTitle)).setText(this.f17107a.getString(C10232R.string.msg_dg_title_network));
                TextView textView = (TextView) f17105q.findViewById(C10232R.C10236id.txtNegetive);
                textView.setText(this.f17107a.getString(C10232R.string.lbl_dg_title_cancel));
                TextView textView2 = (TextView) f17105q.findViewById(C10232R.C10236id.txtPositive);
                textView2.setText(this.f17107a.getString(C10232R.string.lbl_ok));
                textView.setOnClickListener(new C5891b0());
                textView2.setOnClickListener(new C5893c0());
                if (!((Activity) this.f17107a).isFinishing()) {
                    f17105q.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n */
    public long mo23642n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (str.contains(".")) {
                return (long) Double.parseDouble(str);
            }
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: n */
    public String mo23643n() {
        return "20170322";
    }

    /* renamed from: n0 */
    public void mo23644n0() {
        try {
            mo23489M(this.f17107a.getString(C10232R.string.msg_info_internet_connection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public String mo23646o(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    if (str.length() <= 2) {
                        return str;
                    }
                    String substring = str.substring(0, 2);
                    String substring2 = str.substring(str.length() - 1, str.length());
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("**");
                    sb.append(substring2);
                    return sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        return "-";
    }

    /* renamed from: o0 */
    public void mo23647o0() {
        mo23608d(((Activity) this.f17107a).findViewById(C10232R.C10236id.llContainerMain));
    }

    /* renamed from: p */
    public LatLng mo23648p() {
        String str = C11644i.f33312h;
        String str2 = C11644i.f33303g;
        try {
            String t = mo23661t(mo23468C().mo23459f(str2));
            String str3 = C11644i.f33223W5;
            String str4 = C11644i.f33231X5;
            if (t != null) {
                if (mo23661t(mo23468C().mo23459f(str)) != null) {
                    if (mo23661t(mo23468C().mo23459f(str2)) != null) {
                        str4 = mo23468C().mo23459f(str2);
                    }
                    double doubleValue = Double.valueOf(str4).doubleValue();
                    if (mo23661t(mo23468C().mo23459f(str)) != null) {
                        str3 = mo23468C().mo23459f(str);
                    }
                    return new LatLng(doubleValue, Double.valueOf(str3).doubleValue());
                }
            }
            return new LatLng(Double.valueOf(str4).doubleValue(), Double.valueOf(str3).doubleValue());
        } catch (Exception e) {
            e.printStackTrace();
            return new LatLng(0.0d, 0.0d);
        }
    }

    /* renamed from: p0 */
    public boolean mo23650p0() {
        for (int i = 0; i < C11644i.f33056B6.size(); i++) {
            if (((MyOrdersActive) C11644i.f33056B6.get(i)).isTrack_order()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public String mo23652q(String str) {
        String str2;
        try {
            if (!Environment.getExternalStorageState().equalsIgnoreCase("mounted") || Environment.getExternalStorageState().equalsIgnoreCase("mounted_ro")) {
                str2 = this.f17107a.getFilesDir().getAbsolutePath();
            } else {
                str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q0 */
    public void mo23653q0() {
        try {
            mo23492O();
            mo23615f(this.f17107a.getString(C10232R.string.msg_error_server_issue), this.f17107a.getString(C10232R.string.app_name));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public String mo23654r() {
        return (String) DateFormat.format("hh:mm:ss aaa", Calendar.getInstance().getTime());
    }

    /* renamed from: r0 */
    public void mo23656r0() {
        try {
            if (f17106r == null && this.f17107a != null) {
                f17106r = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
                f17106r.setContentView(C10232R.layout.dialog_pos_neg);
                f17106r.setCancelable(false);
                TextView textView = (TextView) f17106r.findViewById(C10232R.C10236id.txtdMessage);
                TextView textView2 = (TextView) f17106r.findViewById(C10232R.C10236id.txtdTitle);
                TextView textView3 = (TextView) f17106r.findViewById(C10232R.C10236id.txtNegetive);
                textView3.setText(this.f17107a.getString(C10232R.string.lbl_dg_title_cancel));
                TextView textView4 = (TextView) f17106r.findViewById(C10232R.C10236id.txtPositive);
                textView4.setText(this.f17107a.getString(C10232R.string.msg_alert_gps_enable));
                textView2.setText(this.f17107a.getString(C10232R.string.lbl_gps));
                textView.setText(this.f17107a.getString(C10232R.string.msg_alert_gps_enable_title));
                textView3.setOnClickListener(new C5897e0());
                textView4.setOnClickListener(new C5899f0());
                if (!((Activity) this.f17107a).isFinishing()) {
                    f17106r.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public void mo23658s(String str) {
        String str2;
        boolean z;
        int i = 0;
        while (true) {
            int size = C11644i.f33468z6.size();
            str2 = C11644i.f33229X3;
            if (i >= size) {
                z = false;
                break;
            } else if (((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId() == null || !((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId().equals(str)) {
                i++;
            } else {
                MyOrdersActive myOrdersActive = (MyOrdersActive) C11644i.f33468z6.get(i);
                if (myOrdersActive.getUnread().intValue() == 0) {
                    C11644i.f33061C3++;
                    C11644i.f33045A3++;
                    C11644i.f33101H3++;
                }
                myOrdersActive.setUnread(Integer.valueOf(myOrdersActive.getUnread().intValue() + 1));
                C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                int i2 = C11644i.f33101H3;
                if (i2 <= 0) {
                    i2 = 0;
                }
                aHBottomNavigation.mo11496b(i2, 1);
                C11644i.f33468z6.remove(i);
                C11644i.f33468z6.add(0, myOrdersActive);
                mo23473E(str2);
                z = true;
            }
        }
        if (!z) {
            int i3 = 0;
            while (true) {
                if (i3 >= C11644i.f33048A6.size()) {
                    break;
                } else if (((MyOrdersInactive) C11644i.f33048A6.get(i3)).getIOrderId() == null || !((MyOrdersInactive) C11644i.f33048A6.get(i3)).getIOrderId().equals(str)) {
                    i3++;
                } else {
                    MyOrdersInactive myOrdersInactive = (MyOrdersInactive) C11644i.f33048A6.get(i3);
                    if (myOrdersInactive.getUnread().intValue() == 0) {
                        C11644i.f33069D3++;
                        C11644i.f33053B3++;
                    }
                    myOrdersInactive.setUnread(Integer.valueOf(myOrdersInactive.getUnread().intValue() + 1));
                    C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                    AHBottomNavigation aHBottomNavigation2 = HomeActivity.f27246i1;
                    int i4 = C11644i.f33101H3;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    aHBottomNavigation2.mo11496b(i4, 1);
                    C11644i.f33048A6.remove(i3);
                    C11644i.f33048A6.add(0, myOrdersInactive);
                    mo23473E(str2);
                    z = true;
                }
            }
            if (!z) {
                int i5 = 0;
                while (true) {
                    if (i5 >= C11644i.f33056B6.size()) {
                        break;
                    } else if (((MyOrdersActive) C11644i.f33056B6.get(i5)).getIOrderId() == null || !((MyOrdersActive) C11644i.f33056B6.get(i5)).getIOrderId().equals(str)) {
                        i5++;
                    } else {
                        MyOrdersActive myOrdersActive2 = (MyOrdersActive) C11644i.f33056B6.get(i5);
                        if (myOrdersActive2.getUnread().intValue() == 0) {
                            C11644i.f33077E3++;
                            C11644i.f33045A3++;
                        }
                        myOrdersActive2.setUnread(Integer.valueOf(myOrdersActive2.getUnread().intValue() + 1));
                        C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                        AHBottomNavigation aHBottomNavigation3 = HomeActivity.f27246i1;
                        int i6 = C11644i.f33101H3;
                        if (i6 <= 0) {
                            i6 = 0;
                        }
                        aHBottomNavigation3.mo11496b(i6, 1);
                        C11644i.f33056B6.remove(i5);
                        C11644i.f33056B6.add(0, myOrdersActive2);
                        mo23473E(str2);
                        z = true;
                    }
                }
                if (!z) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= C11644i.f33064C6.size()) {
                            break;
                        } else if (((MyOrdersInactive) C11644i.f33064C6.get(i7)).getIOrderId() == null || !((MyOrdersInactive) C11644i.f33064C6.get(i7)).getIOrderId().equals(str)) {
                            i7++;
                        } else {
                            MyOrdersInactive myOrdersInactive2 = (MyOrdersInactive) C11644i.f33064C6.get(i7);
                            if (myOrdersInactive2.getUnread().intValue() == 0) {
                                C11644i.f33085F3++;
                                C11644i.f33053B3++;
                            }
                            myOrdersInactive2.setUnread(Integer.valueOf(myOrdersInactive2.getUnread().intValue() + 1));
                            C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                            AHBottomNavigation aHBottomNavigation4 = HomeActivity.f27246i1;
                            int i8 = C11644i.f33101H3;
                            if (i8 <= 0) {
                                i8 = 0;
                            }
                            aHBottomNavigation4.mo11496b(i8, 1);
                            C11644i.f33064C6.remove(i7);
                            C11644i.f33064C6.add(0, myOrdersInactive2);
                            mo23473E(str2);
                            z = true;
                        }
                    }
                    if (z) {
                    }
                }
            }
        }
    }

    /* renamed from: s0 */
    public void mo23659s0() {
        UserDetail userDetail = C11644i.f33072D6;
        if (userDetail != null && userDetail.getUser() != null && C11644i.f33072D6.getUser().getIs_courier().booleanValue() && C11644i.f33200T6 <= 2) {
            mo23491N(this.f17107a.getString(C10232R.string.lbl_gps_warning));
        }
    }

    /* renamed from: t */
    public String mo23661t(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* renamed from: t0 */
    public boolean mo23662t0() {
        try {
            return mo23468C().mo23450a(C11644i.f33071D5);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    public int mo23663u(String str) {
        return C0841b.m4916a(this.f17107a, str);
    }

    /* renamed from: u0 */
    public void mo23665u0() {
        try {
            if (this.f17107a != null) {
                mo23619g(this.f17107a.getString(C10232R.string.app_name), this.f17107a.getString(C10232R.string.lbl_dg_loader_loading));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: v */
    public boolean mo23667v(String str) {
        return str.length() >= 7;
    }

    /* renamed from: v0 */
    public void mo23668v0() {
        Context context = this.f17107a;
        if (context != null) {
            try {
                ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(0, 1);
            } catch (StackOverflowError e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    public String mo23670w(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1).toUpperCase());
        sb.append(str.substring(1));
        return sb.toString();
    }

    /* renamed from: w0 */
    public void mo23671w0() {
        try {
            if (mo23495Q()) {
                this.f17107a.getApplicationContext().startForegroundService(new Intent(this.f17107a, LocationService.class));
            } else {
                this.f17107a.getApplicationContext().startService(new Intent(this.f17107a, LocationService.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: x */
    public C1712h mo23672x() {
        return null;
    }

    /* renamed from: x */
    public void mo23673x(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this.f17107a, ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, str);
                this.f17107a.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public void mo23675y(String str) {
        try {
            Intent intent = new Intent(this.f17107a, ViewPhotoFullActivity.class);
            intent.putExtra(C11644i.f33463z1, str);
            this.f17107a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    public void mo23677z(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            this.f17107a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R */
    public static String m25790R(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(StringUtils.MD5).digest(str.getBytes("UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* renamed from: C */
    public void mo23469C(String str) {
        String str2 = "android.intent.action.VIEW";
        try {
            Context context = this.f17107a;
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(str);
            context.startActivity(new Intent(str2, Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            Context context2 = this.f17107a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://play.google.com/store/apps/details?id=");
            sb2.append(str);
            context2.startActivity(new Intent(str2, Uri.parse(sb2.toString())));
        }
    }

    /* renamed from: D */
    public String mo23471D(String str) {
        return TextUtils.isEmpty(str) ? "" : str.trim();
    }

    /* renamed from: I */
    public XmppDetails mo23480I() {
        return (XmppDetails) new C8775f().mo32314a(mo23470D().mo23459f(C11644i.f33313h0), XmppDetails.class);
    }

    /* renamed from: K */
    public void mo23485K(String str) {
        try {
            if (this.f17107a != null) {
                Dialog dialog = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
                dialog.setContentView(C10232R.layout.dialog_show_ok);
                dialog.setCancelable(false);
                TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
                TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
                ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(this.f17107a.getResources().getString(C10232R.string.app_name));
                textView2.setText(str);
                textView.setOnClickListener(new C5888a(dialog));
                if (!((Activity) this.f17107a).isFinishing()) {
                    dialog.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: L */
    public void mo23487L(String str) {
        try {
            if (this.f17107a != null) {
                Dialog dialog = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
                dialog.setContentView(C10232R.layout.dialog_show_ok);
                TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
                TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
                ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(this.f17107a.getResources().getString(C10232R.string.app_name));
                textView2.setText(str);
                textView.setOnClickListener(new C5890b(dialog));
                if (!((Activity) this.f17107a).isFinishing()) {
                    dialog.show();
                }
                mo23494P();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T */
    public boolean mo23498T() {
        if (C11644i.f33453y && !TextUtils.isEmpty(C11644i.f33049B)) {
            if (C5854b.f16924f.equalsIgnoreCase(C11644i.f33057C)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Bitmap mo23509a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: d */
    public void mo23605d(Bitmap bitmap) {
        this.f17113g = bitmap;
    }

    /* renamed from: h */
    public C13817d0 mo23622h(String str) {
        return C13817d0.create(C13872x.m59361b("text/plain"), str);
    }

    /* renamed from: m */
    public double mo23639m(String str) {
        try {
            return Double.parseDouble(str.substring(0, str.indexOf(37)));
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: r */
    public String mo23655r(String str) {
        boolean z = C11644i.f33073E;
        return str;
    }

    /* renamed from: t */
    public Uri mo23660t() {
        C5881v C = mo23468C();
        String str = C11644i.f33111I5;
        if (C.mo23459f(str) == null) {
            return RingtoneManager.getDefaultUri(2);
        }
        try {
            if (VERSION.SDK_INT < 24) {
                return Uri.parse(mo23468C().mo23459f(str));
            }
            File file = new File(Uri.parse(mo23468C().mo23459f(str)).getPath());
            if (!file.exists()) {
                return Uri.parse(mo23468C().mo23459f(str));
            }
            Context context = this.f17107a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17107a.getPackageName());
            sb.append(".provider");
            return FileProvider.m4903a(context, sb.toString(), file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: u */
    public void mo23664u() {
        Signature[] signatureArr;
        String str = "KeyHash:";
        try {
            for (Signature signature : this.f17107a.getPackageManager().getPackageInfo(this.f17107a.getPackageName(), 64).signatures) {
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(Base64.encodeToString(instance.digest(), 0));
                C5880q.m25750a(sb.toString());
            }
        } catch (NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(e.getMessage());
            C5880q.m25750a(sb2.toString());
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(e2.getMessage());
            C5880q.m25750a(sb3.toString());
        }
    }

    /* renamed from: v */
    public String mo23666v() {
        try {
            return C11644i.f33072D6.getUser().getvGender();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: S */
    public static double m25791S(String str) {
        try {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
            decimalFormat.applyPattern("#.##");
            return Double.parseDouble(decimalFormat.format(Double.parseDouble(str)));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* renamed from: d */
    public static String m25814d(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        try {
            return new SimpleDateFormat(str2, Locale.US).format(Long.valueOf(simpleDateFormat.parse(str3).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
            return str3;
        }
    }

    /* renamed from: E */
    public void mo23473E(String str) {
        C2128a.m11089a(this.f17107a).mo9219a(new Intent(str));
    }

    /* renamed from: M */
    public String mo23488M() {
        return this.f17114h;
    }

    /* renamed from: N */
    public C11056p mo23490N() {
        return this.f17117k;
    }

    /* renamed from: O */
    public void mo23493O(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(" shouldOpenUpgrade  ");
        sb.append(C11644i.f33113J);
        C5880q.m25751b(sb.toString());
        if (C11644i.f33113J) {
            Dialog dialog = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_pos_neg);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
            TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f17107a.getResources().getString(C10232R.string.lbl_upgrade));
            textView4.setText(sb2.toString());
            textView2.setText(this.f17107a.getString(C10232R.string.app_name));
            if (TextUtils.isEmpty(C11644i.f33277d0)) {
                textView.setText(this.f17107a.getString(C10232R.string.msg_updateChecker));
            } else {
                textView.setText(C11644i.f33277d0);
            }
            textView3.setOnClickListener(new C5902h(dialog));
            textView4.setOnClickListener(new C5904i(dialog));
            try {
                if (!((Activity) this.f17107a).isFinishing()) {
                    dialog.show();
                }
                C11644i.f33113J = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public Bitmap mo23586c(Bitmap bitmap) {
        try {
            int width = bitmap.getWidth();
            float f = (float) width;
            return Bitmap.createScaledBitmap(bitmap, width, (int) (f / (f / ((float) bitmap.getHeight()))), true);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* renamed from: h */
    public void mo23623h(String str, String str2) {
        if (mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", mo23476G());
            hashMap.put("auth_token", mo23640m());
            hashMap.put("status", str);
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            sb.append(str3);
            sb.append(mo23648p().latitude);
            hashMap.put("current_latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(mo23648p().longitude);
            hashMap.put("current_longitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("start/stop : ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C5882b.m25774a(this).updateTrackingStatus(str2, hashMap).enqueue(new C5913r(str));
        }
    }

    /* renamed from: l */
    public String mo23637l(String str) {
        if (m25786E0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://forms.staging.mrsool.co/signup?token=");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://forms.mrsool.co/signup?token=");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: w */
    public String mo23669w() {
        C5881v D = mo23470D();
        String str = C11644i.f33295f0;
        if (TextUtils.isEmpty(D.mo23459f(str))) {
            return "";
        }
        return mo23470D().mo23459f(str);
    }

    /* renamed from: B */
    public void mo23467B(String str) {
        String str2;
        boolean z;
        int i = 0;
        Integer valueOf = Integer.valueOf(0);
        int i2 = 0;
        while (true) {
            int size = C11644i.f33468z6.size();
            str2 = C11644i.f33229X3;
            if (i2 >= size) {
                z = false;
                break;
            } else if (((MyOrdersActive) C11644i.f33468z6.get(i2)).getIOrderId() == null || !((MyOrdersActive) C11644i.f33468z6.get(i2)).getIOrderId().equals(str)) {
                i2++;
            } else {
                if (((MyOrdersActive) C11644i.f33468z6.get(i2)).getUnread().intValue() > 0) {
                    C11644i.f33061C3--;
                    C11644i.f33045A3--;
                    C11644i.f33101H3--;
                }
                ((MyOrdersActive) C11644i.f33468z6.get(i2)).setUnread(valueOf);
                C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                int i3 = C11644i.f33101H3;
                if (i3 <= 0) {
                    i3 = 0;
                }
                aHBottomNavigation.mo11496b(i3, 1);
                mo23473E(str2);
                z = true;
            }
        }
        if (!z) {
            int i4 = 0;
            while (true) {
                if (i4 >= C11644i.f33048A6.size()) {
                    break;
                } else if (((MyOrdersInactive) C11644i.f33048A6.get(i4)).getIOrderId() == null || !((MyOrdersInactive) C11644i.f33048A6.get(i4)).getIOrderId().equals(str)) {
                    i4++;
                } else {
                    if (((MyOrdersInactive) C11644i.f33048A6.get(i4)).getUnread().intValue() > 0) {
                        C11644i.f33069D3--;
                        C11644i.f33053B3--;
                    }
                    ((MyOrdersInactive) C11644i.f33048A6.get(i4)).setUnread(valueOf);
                    C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                    AHBottomNavigation aHBottomNavigation2 = HomeActivity.f27246i1;
                    int i5 = C11644i.f33101H3;
                    if (i5 <= 0) {
                        i5 = 0;
                    }
                    aHBottomNavigation2.mo11496b(i5, 1);
                    mo23473E(str2);
                    z = true;
                }
            }
            if (!z) {
                int i6 = 0;
                while (true) {
                    if (i6 >= C11644i.f33056B6.size()) {
                        break;
                    } else if (((MyOrdersActive) C11644i.f33056B6.get(i6)).getIOrderId() == null || !((MyOrdersActive) C11644i.f33056B6.get(i6)).getIOrderId().equals(str)) {
                        i6++;
                    } else {
                        if (((MyOrdersActive) C11644i.f33056B6.get(i6)).getUnread().intValue() > 0) {
                            C11644i.f33077E3--;
                            C11644i.f33045A3--;
                        }
                        ((MyOrdersActive) C11644i.f33056B6.get(i6)).setUnread(valueOf);
                        C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                        AHBottomNavigation aHBottomNavigation3 = HomeActivity.f27246i1;
                        int i7 = C11644i.f33101H3;
                        if (i7 <= 0) {
                            i7 = 0;
                        }
                        aHBottomNavigation3.mo11496b(i7, 1);
                        mo23473E(str2);
                        z = true;
                    }
                }
                if (!z) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= C11644i.f33064C6.size()) {
                            break;
                        } else if (((MyOrdersInactive) C11644i.f33064C6.get(i8)).getIOrderId() == null || !((MyOrdersInactive) C11644i.f33064C6.get(i8)).getIOrderId().equals(str)) {
                            i8++;
                        } else {
                            if (((MyOrdersInactive) C11644i.f33064C6.get(i8)).getUnread().intValue() > 0) {
                                C11644i.f33085F3--;
                                C11644i.f33053B3--;
                            }
                            ((MyOrdersInactive) C11644i.f33064C6.get(i8)).setUnread(valueOf);
                            C11644i.f33101H3 = C11644i.f33045A3 + C11644i.f33053B3;
                            AHBottomNavigation aHBottomNavigation4 = HomeActivity.f27246i1;
                            int i9 = C11644i.f33101H3;
                            if (i9 > 0) {
                                i = i9;
                            }
                            aHBottomNavigation4.mo11496b(i, 1);
                            mo23473E(str2);
                            z = true;
                        }
                    }
                    if (z) {
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public boolean mo23495Q() {
        return VERSION.SDK_INT >= 26;
    }

    /* renamed from: g */
    public void mo23619g(String str, String str2) {
        try {
            if (this.f17107a != null) {
                this.f17109c = new ProgressDialog(this.f17107a);
                this.f17109c.setCanceledOnTouchOutside(false);
                this.f17109c.setCancelable(false);
                if (str == null || str.length() <= 0) {
                    this.f17109c.setTitle(this.f17107a.getString(C10232R.string.app_name));
                } else {
                    this.f17109c.setTitle(str);
                }
                if (str2 == null || str2.length() <= 0) {
                    this.f17109c.setMessage(this.f17107a.getString(C10232R.string.lbl_dg_loader_loading));
                } else {
                    this.f17109c.setMessage(str2);
                }
                this.f17109c.setMessage(str2);
                if (this.f17109c.isShowing()) {
                    this.f17109c.dismiss();
                }
                if (!((Activity) this.f17107a).isFinishing()) {
                    this.f17109c.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public String mo23630j(String str) {
        try {
            InputStream open = this.f17107a.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr);
        } catch (IOException unused) {
            return "";
        }
    }

    /* renamed from: k */
    public String mo23634k(String str) {
        if (m25786E0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://forms.staging.mrsool.co/reimbursement_complaint?token=");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://forms.mrsool.co/reimbursement_complaint?token=");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: e */
    public static Bitmap m25815e(Bitmap bitmap) {
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            return ThumbnailUtils.extractThumbnail(bitmap, min, min);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* renamed from: f */
    public void mo23615f(String str, String str2) {
        try {
            if (this.f17107a != null) {
                Dialog dialog = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyle);
                dialog.setContentView(C10232R.layout.dialog_show_ok);
                TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
                TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
                ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
                textView2.setText(str);
                textView.setOnClickListener(new C5901g0(dialog));
                if (!((Activity) this.f17107a).isFinishing()) {
                    dialog.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    public String mo23674y() {
        return mo23470D().mo23461h(C11644i.f33055B5);
    }

    /* renamed from: z */
    public Typeface mo23676z() {
        return Typeface.createFromAsset(this.f17107a.getAssets(), "Roboto-Medium.ttf");
    }

    /* renamed from: P */
    public static int m25788P(String str) {
        if (str.equalsIgnoreCase(C10527a.f28544e)) {
            return C10232R.C10235drawable.card_visa;
        }
        if (str.equalsIgnoreCase("master") || str.equalsIgnoreCase("master_card") || str.equalsIgnoreCase("master card")) {
            return C10232R.C10235drawable.card_master;
        }
        return str.equalsIgnoreCase("mada") ? C10232R.C10235drawable.card_type_mada : C10232R.C10235drawable.card_unknown_gray;
    }

    /* renamed from: c */
    public void mo23588c() {
        C5882b.m25774a(this).getUserDetail(String.valueOf(mo23468C().mo23459f("user_id"))).enqueue(new C5892c());
    }

    /* renamed from: p */
    public CharSequence mo23649p(String str) {
        String str2 = ".";
        try {
            int dimensionPixelSize = this.f17107a.getResources().getDimensionPixelSize(C10232R.dimen.sp_14);
            int dimensionPixelSize2 = this.f17107a.getResources().getDimensionPixelSize(C10232R.dimen.sp_9);
            if (str.contains(str2)) {
                String[] split = str.split("\\.");
                SpannableString spannableString = new SpannableString(split[0]);
                spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, split[0].length(), 18);
                SpannableString spannableString2 = new SpannableString(split[1]);
                spannableString2.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), 0, split[1].length(), 18);
                return TextUtils.concat(new CharSequence[]{spannableString, str2, spannableString2});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: q */
    public String mo23651q() {
        return (String) DateFormat.format("hh:mm aaa", Calendar.getInstance().getTime());
    }

    /* renamed from: e */
    public void mo23611e(String str, String str2) {
        try {
            if (mo23502X()) {
                Intent intent = new Intent(this.f17107a, TermsOfServiceActivity.class);
                intent.putExtra(C11644i.f33391q1, str);
                intent.putExtra(C11644i.f33383p1, str2);
                intent.addFlags(268435456);
                this.f17107a.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public String mo23645o() {
        String str = "language";
        if (TextUtils.isEmpty(mo23470D().mo23460g(str))) {
            return C11644i.f33191S5;
        }
        return mo23470D().mo23460g(str);
    }

    /* renamed from: J */
    public int mo23482J() {
        int i = 0;
        try {
            if (VERSION.SDK_INT >= 19) {
                i = Secure.getInt(this.f17107a.getContentResolver(), "location_mode");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LocationMode: ");
            sb.append(i);
            C5880q.m25751b(sb.toString());
        } catch (SettingNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    /* renamed from: c */
    public void mo23591c(Context context) {
        if (!mo23583b(context)) {
            Toast toast = this.f17116j;
            if (toast != null) {
                toast.cancel();
            }
            this.f17116j = Toast.makeText(context, context.getString(C10232R.string.msg_error_server_issue), 1);
            this.f17116j.show();
        }
    }

    /* renamed from: d */
    public void mo23604d() {
        try {
            String g = mo23468C().mo23460g("language");
            if (!Locale.getDefault().getLanguage().equalsIgnoreCase(g)) {
                mo23477G(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: A */
    public Typeface mo23464A() {
        return Typeface.createFromAsset(this.f17107a.getAssets(), "Roboto-Regular.ttf");
    }

    /* renamed from: F */
    public int mo23474F() {
        return mo23470D().mo23458e(C11644i.f33304g0);
    }

    /* renamed from: G */
    public String mo23476G() {
        return mo23468C().mo23459f("user_id");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23479H(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = -382565870(0xffffffffe9328212, float:-1.348769E25)
            r2 = 2
            java.lang.String r3 = "isLogin"
            java.lang.String r4 = "isFBLogin"
            java.lang.String r5 = "isGPlusLogin"
            r6 = 1
            r7 = 0
            if (r0 == r1) goto L_0x002d
            r1 = 1714404259(0x662fbba3, float:2.0746886E23)
            if (r0 == r1) goto L_0x0025
            r1 = 2064555103(0x7b0e9c5f, float:7.404777E35)
            if (r0 == r1) goto L_0x001d
            goto L_0x0035
        L_0x001d:
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x0035
            r9 = 0
            goto L_0x0036
        L_0x0025:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x0035
            r9 = 2
            goto L_0x0036
        L_0x002d:
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x0036
        L_0x0035:
            r9 = -1
        L_0x0036:
            if (r9 == 0) goto L_0x0081
            if (r9 == r6) goto L_0x005f
            if (r9 == r2) goto L_0x003d
            goto L_0x00a2
        L_0x003d:
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r3, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r5, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.mo23448a(r4, r0)
            goto L_0x00a2
        L_0x005f:
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r3, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.mo23448a(r5, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r4, r0)
            goto L_0x00a2
        L_0x0081:
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.mo23448a(r3, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r5, r0)
            com.mrsool.utils.v r9 = r8.mo23468C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.mo23448a(r4, r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.C5887x.mo23479H(java.lang.String):void");
    }

    /* renamed from: b */
    public String mo23568b() {
        return new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH).format(new Date());
    }

    /* renamed from: a */
    public void mo23546a(ImageView imageView, int i) {
        imageView.setColorFilter(C0841b.m4915a(this.f17107a, i));
    }

    /* renamed from: b */
    public String mo23570b(Location location) {
        return location != null ? String.valueOf(location.getLongitude()) : "";
    }

    /* renamed from: i */
    public void mo23627i(String str) {
        if (C11644i.f33145N) {
            messages messages = new messages();
            String str2 = "";
            messages.setId(str2);
            messages.setiFromUserId(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            messages.setvType("text");
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(System.currentTimeMillis());
            messages.setvMessageId(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            messages.setTxContent(sb2.toString());
            messages.setiToOrderID(C11644i.f33194T0);
            Intent intent = new Intent(C11644i.f33117J3);
            intent.putExtra(C11644i.f33274c6, messages);
            intent.putExtra("stanzaId", str2);
            C2128a.m11089a(this.f17107a).mo9219a(intent);
        }
    }

    /* renamed from: a */
    public static int m25794a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m25805b(double d, double d2, double d3, double d4) {
        String str = "";
        Location location = new Location(str);
        location.setLatitude(d);
        location.setLongitude(d2);
        Location location2 = new Location(str);
        location2.setLatitude(d3);
        location2.setLongitude(d4);
        return location.distanceTo(location2);
    }

    /* renamed from: d */
    public String mo23603d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://maps.google.com/maps/api/staticmap?center=");
        sb.append(str);
        String str3 = ",";
        sb.append(str3);
        sb.append(str2);
        sb.append("&zoom=15&size=200x200&sensor=false400x400&&markers=%20marker|");
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m25811c(Context context, String str) {
        return C0841b.m4916a(context, str) == 0;
    }

    /* renamed from: a */
    public boolean mo23562a(int i) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17107a.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
                return true;
            }
            try {
                mo23491N(this.f17107a.getString(C10232R.string.msg_info_internet_connection));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public void mo23606d(RatingBar ratingBar, int i) {
        LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
        layerDrawable.getDrawable(2).setColorFilter(C0841b.m4915a(this.f17107a, i), Mode.SRC_ATOP);
        layerDrawable.getDrawable(1).setColorFilter(C0841b.m4915a(this.f17107a, i), Mode.SRC_ATOP);
    }

    /* renamed from: e */
    public static String m25816e(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public void mo23593c(RatingBar ratingBar, int i) {
        LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(1)), C0841b.m4915a(this.f17107a, i));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(2)), C0841b.m4915a(this.f17107a, i));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(0)), C0841b.m4915a(this.f17107a, i));
    }

    /* renamed from: e */
    public void mo23610e(String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33783f3, "Xmpp");
            hashMap.put("error_message", str);
            hashMap.put("current_user_id", mo23476G());
            hashMap.put("auth_token", mo23640m());
            C11687c.m52645a(this).reportError(hashMap).enqueue(new C5916u());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public void mo23607d(String str) {
        if (!C11644i.f33073E) {
            File file = new File("sdcard/Mrsool_Rating_Issue.txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.append(str);
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public static void m25817f(Context context) {
        String str = "android.intent.action.VIEW";
        String packageName = context.getPackageName();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(packageName);
            context.startActivity(new Intent(str, Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://play.google.com/store/apps/details?id=");
            sb2.append(packageName);
            context.startActivity(new Intent(str, Uri.parse(sb2.toString())));
        }
    }

    /* renamed from: a */
    public void mo23543a(View view) {
        Context context = this.f17107a;
        if (!(context == null || view == null)) {
            try {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo23596c(boolean z) {
        Uri uri;
        if (z) {
            try {
                if (VERSION.SDK_INT >= 24) {
                    File file = new File(Uri.parse(mo23468C().mo23459f(C11644i.f33111I5)).getPath());
                    if (file.exists()) {
                        Context context = this.f17107a;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f17107a.getPackageName());
                        sb.append(".provider");
                        uri = FileProvider.m4903a(context, sb.toString(), file);
                    } else {
                        uri = RingtoneManager.getDefaultUri(2);
                    }
                } else {
                    uri = RingtoneManager.getDefaultUri(2);
                }
                RingtoneManager.getRingtone(this.f17107a, uri).play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo23573b(int i) {
        mo23605d(mo23510a(mo23484K(), i));
        mo23579b(m25807b(mo23484K(), 80));
    }

    /* renamed from: f */
    public void mo23614f(String str) {
        if (mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", mo23476G());
            hashMap.put("auth_token", mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put(C11687c.f33701M2, str);
            C11687c.m52645a(this).seenPromotion(mo23476G(), hashMap).enqueue(new C5914s());
        }
    }

    /* renamed from: g */
    public void mo23618g(String str) {
        try {
            if (this.f17107a != null) {
                Intent intent = new Intent("android.intent.action.DIAL");
                StringBuilder sb = new StringBuilder();
                sb.append("tel:");
                sb.append(str);
                intent.setData(Uri.parse(sb.toString()));
                this.f17107a.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static File m25807b(Bitmap bitmap, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/mrsool/");
            File file = new File(sb.toString());
            file.mkdirs();
            File file2 = new File(file, String.format("mrsool_IMG_%d.jpg", new Object[]{Long.valueOf(System.currentTimeMillis())}));
            m25801a(bitmap, file2, i);
            return file2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo23563a(EditText editText) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f17107a, C10232R.anim.shake);
        if (editText == null || editText.getText().toString().length() <= 0) {
            editText.startAnimation(loadAnimation);
            return false;
        } else if (Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$").matcher(editText.getText().toString().trim()).matches()) {
            return true;
        } else {
            editText.startAnimation(loadAnimation);
            return false;
        }
    }

    /* renamed from: i */
    public void mo23628i(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33751Z0, str2);
        hashMap.put("status", str);
        C11687c.m52645a(this).updatePaymentProcess(ChatActivityNew.f27655C6, hashMap).enqueue(new C5920y(str));
    }

    /* renamed from: d */
    public void mo23608d(View... viewArr) {
        if (mo23496R()) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setTextDirection(4);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo23579b(File file) {
        this.f17112f = file;
    }

    /* renamed from: c */
    public void mo23597c(View... viewArr) {
        if (mo23496R()) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setTextDirection(3);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo23576b(Context context, String str) {
        if (!mo23583b(context)) {
            Toast toast = this.f17116j;
            if (toast != null) {
                toast.cancel();
            }
            this.f17116j = Toast.makeText(context, str, 1);
            this.f17116j.show();
        }
    }

    /* renamed from: d */
    public static String m25813d(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                Signature signature = signatureArr[0];
                signature.toByteArray();
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                String encodeToString = Base64.encodeToString(instance.digest(), 0);
                StringBuilder sb = new StringBuilder();
                sb.append("PAK_SIGNATUREInclude this string as a value for SIGNATURE:");
                sb.append(encodeToString);
                C5880q.m25750a(sb.toString());
                return encodeToString.trim();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    public boolean mo23564a(String str) {
        if (str == null || str.length() <= 0 || !Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$").matcher(str.toString().trim()).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo23598c(String str) {
        try {
            this.f17107a.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public void mo23592c(View view) {
        view.setPadding(0, mo23474F(), 0, 0);
    }

    /* renamed from: a */
    public String mo23524a(EditText editText, int i, int i2) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f17107a, C10232R.anim.shake);
        String trim = editText.getText().toString().trim();
        if (trim.length() >= i && trim.length() <= i2) {
            return editText.getText().toString().trim();
        }
        editText.startAnimation(loadAnimation);
        editText.setError(this.f17107a.getString(C10232R.string.msg_error_password_between));
        return null;
    }

    /* renamed from: b */
    public boolean mo23583b(Context context) {
        if (context == null) {
            return false;
        }
        boolean z = true;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (VERSION.SDK_INT > 20) {
                boolean z2 = true;
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.importance == 100) {
                        boolean z3 = z2;
                        for (String equals : runningAppProcessInfo.pkgList) {
                            if (equals.equals(context.getPackageName())) {
                                z3 = false;
                            }
                        }
                        z2 = z3;
                    }
                }
                z = z2;
            } else if (((RunningTaskInfo) activityManager.getRunningTasks(1).get(0)).topActivity.getPackageName().equals(context.getPackageName())) {
                z = false;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: c */
    public String mo23587c(double d) {
        if (d <= 0.0d) {
            return "00:00";
        }
        double round = (double) Math.round(d / 1000.0d);
        Double.isNaN(round);
        double d2 = round * 1000.0d;
        long j = (long) d2;
        return String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
    }

    /* renamed from: c */
    public static float m25810c(float f, Context context) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: c */
    public void mo23594c(String str, String str2) {
        if (mo23502X()) {
            mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", mo23640m());
            if (str.equalsIgnoreCase("become_courier")) {
                hashMap.put(C11687c.f33843u1, "courier_registration");
            }
            C11687c.m52645a(this).getCourierWeblinkToken(mo23476G(), hashMap).enqueue(new C5918w(str, str2));
        }
    }

    /* renamed from: d */
    public double mo23600d(double d) {
        long j = (long) d;
        return (double) (((TimeUnit.MILLISECONDS.toMinutes(j) * 60) + TimeUnit.MILLISECONDS.toSeconds(j)) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)));
    }

    /* renamed from: d */
    public static Bitmap m25812d(View view) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public String mo23523a(Location location) {
        return location != null ? String.valueOf(location.getLatitude()) : "";
    }

    /* renamed from: a */
    public String mo23525a(EditText editText, EditText editText2, int i, int i2) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f17107a, C10232R.anim.shake);
        String trim = editText.getText().toString().trim();
        String trim2 = editText2.getText().toString().trim();
        String str = "";
        if (trim.length() < i || trim.length() > i2) {
            editText.startAnimation(loadAnimation);
            editText.setError(this.f17107a.getString(C10232R.string.msg_error_password_between));
            trim = str;
            trim2 = trim;
        }
        if (trim2.length() < i || trim2.length() > i2) {
            editText2.startAnimation(loadAnimation);
            editText.setError(this.f17107a.getString(C10232R.string.msg_error_password_between));
            return null;
        } else if (trim.equalsIgnoreCase(trim2)) {
            return editText.getText().toString().trim();
        } else {
            editText2.startAnimation(loadAnimation);
            editText.setError(this.f17107a.getString(C10232R.string.msg_error_password_not_match));
            return null;
        }
    }

    /* renamed from: b */
    public C0894c mo23567b(Bitmap bitmap) {
        C0894c a = C0895d.m5185a(this.f17107a.getResources(), m25815e(bitmap));
        a.mo4601b(true);
        return a;
    }

    /* renamed from: b */
    public void mo23574b(Activity activity) {
        C6845b bVar = new C6845b(this.f17107a, C10232R.style.AlertDialogTheme);
        C6845b a = bVar.mo770b((CharSequence) "Select Build Type").mo761a(new CharSequence[]{"Local", "Staging", "Live"}, m25787F0(), (DialogInterface.OnClickListener) new C5900g());
        C5898f fVar = new C5898f(activity);
        a.mo776c((CharSequence) "Ok", (DialogInterface.OnClickListener) fVar).mo759a((CharSequence) "Cancel", (DialogInterface.OnClickListener) new C5896e());
        bVar.mo778c();
    }

    /* renamed from: c */
    public void mo23590c(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
            activity.getWindow().setStatusBarColor(-1);
        }
    }

    /* renamed from: c */
    public void mo23595c(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33751Z0, str2);
        hashMap.put("status", str);
        C11687c.m52645a(this).updatePaymentProcess(str3, hashMap).enqueue(new C5921z(str));
    }

    @RequiresApi(api = 21)
    /* renamed from: b */
    public void mo23578b(RatingBar ratingBar, int i) {
        ((LayerDrawable) ratingBar.getProgressDrawable()).getDrawable(2).setTint(C0841b.m4915a(this.f17107a, i));
    }

    /* renamed from: b */
    public boolean mo23584b(Class<?> cls) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) this.f17107a.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Bitmap mo23510a(Bitmap bitmap, int i) {
        int i2;
        try {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            if (width > 1.0f) {
                i2 = (int) (((float) i) / width);
            } else {
                int i3 = (int) (((float) i) * width);
                i2 = i;
                i = i3;
            }
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* renamed from: s */
    public String mo23657s() {
        C5881v C = mo23468C();
        String str = C11644i.f33467z5;
        return !TextUtils.isEmpty(C.mo23459f(str)) ? mo23468C().mo23459f(str) : "not Found";
    }

    /* renamed from: b */
    public void mo23575b(BroadcastReceiver broadcastReceiver, String... strArr) {
        for (String a : strArr) {
            mo23540a(broadcastReceiver, a);
        }
    }

    /* renamed from: a */
    public static void m25801a(Bitmap bitmap, File file, int i) throws IOException {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        createBitmap.compress(CompressFormat.JPEG, i, fileOutputStream);
        fileOutputStream.close();
    }

    /* renamed from: b */
    public void mo23577b(View view) {
        if (view != null) {
            view.setLayoutDirection(1);
        }
    }

    /* renamed from: b */
    public void mo23582b(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                if (mo23496R()) {
                    view.setTextDirection(4);
                } else {
                    view.setTextDirection(3);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo23581b(boolean z) {
        Intent intent;
        try {
            CTEventBean cTEventBean = new CTEventBean(this.f17107a.getResources().getString(C10232R.string.ct_event_param_value_deeplinking), "");
            if (C11644i.f33041A.equalsIgnoreCase(C11644i.f33244Z2)) {
                intent = new Intent(this.f17107a, ShopDetailActivity.class);
            } else if (C11644i.f33041A.equalsIgnoreCase(C11644i.f33253a3)) {
                intent = new Intent(this.f17107a, ShopDetailPackageActivity.class);
            } else {
                return;
            }
            intent.putExtra(C11644i.f33199T5, this.f17107a.getString(C10232R.string.lbl_screen_home));
            intent.putExtra(C11644i.f33207U5, cTEventBean);
            intent.putExtra(C11644i.f33367n1, C11644i.f33461z);
            this.f17107a.startActivity(intent);
            if (z) {
                ((Activity) this.f17107a).finish();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public Bitmap mo23511a(File file) {
        Options options = new Options();
        options.inPreferredConfig = Config.ARGB_8888;
        try {
            return BitmapFactory.decodeStream(new FileInputStream(file), null, options);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public GoogleMap mo23514a(GoogleMap googleMap, SupportMapFragment supportMapFragment, boolean z, boolean z2) {
        if (googleMap != null) {
            googleMap.setMyLocationEnabled(true);
            googleMap.getUiSettings().setMyLocationButtonEnabled(true);
            googleMap.setBuildingsEnabled(true);
            googleMap.getUiSettings().setRotateGesturesEnabled(false);
            googleMap.getUiSettings().setCompassEnabled(false);
            googleMap.getUiSettings().setScrollGesturesEnabled(z2);
            googleMap.getUiSettings().setTiltGesturesEnabled(false);
            googleMap.getUiSettings().setZoomControlsEnabled(false);
            googleMap.getUiSettings().setZoomGesturesEnabled(true);
            googleMap.getUiSettings().setMapToolbarEnabled(false);
        }
        return googleMap;
    }

    /* renamed from: b */
    public String mo23569b(double d) {
        try {
            return new DecimalFormat("0.00").format(d);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(d);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public void mo23531a(double d, double d2, double d3, double d4) {
        if (this.f17107a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://maps.google.com/maps?saddr=");
            sb.append(d);
            String str = ",";
            sb.append(str);
            sb.append(d2);
            sb.append("&daddr=");
            sb.append(d3);
            sb.append(str);
            sb.append(d4);
            mo23677z(sb.toString());
        }
    }

    /* renamed from: b */
    public String mo23571b(String str) {
        FileInputStream fileInputStream;
        String str2 = "";
        try {
            File dir = this.f17107a.getDir(this.f17119m, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17120n);
            sb.append(str);
            sb.append(C10186b.f27190c);
            fileInputStream = new FileInputStream(new File(dir, sb.toString()));
            try {
                FileChannel channel = fileInputStream.getChannel();
                str2 = Charset.defaultCharset().decode(channel.map(MapMode.READ_ONLY, 0, channel.size())).toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            fileInputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return str2;
    }

    /* renamed from: a */
    public void mo23532a(double d, double d2, double d3, double d4, double d5, double d6) {
        if (this.f17107a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://maps.google.com/maps?saddr=");
            sb.append(d);
            String str = ",";
            sb.append(str);
            sb.append(d2);
            sb.append("&daddr=");
            sb.append(d3);
            sb.append(str);
            sb.append(d4);
            sb.append("+to:");
            sb.append(d5);
            sb.append(str);
            sb.append(d6);
            mo23677z(sb.toString());
        }
    }

    /* renamed from: a */
    public long mo23507a(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("compareTwoTimeStamps : oldTimeStamp= ");
        sb.append(j);
        sb.append("   currentTimeStamps=");
        sb.append(j2);
        sb.toString();
        long j3 = (j2 / 1000) - j;
        long j4 = j3 / 1000;
        long j5 = j3 / 60;
        long j6 = j3 / 3600;
        long j7 = j3 / 86400;
        return j5;
    }

    /* renamed from: b */
    public static String m25809b(Double d) {
        try {
            return String.format(Locale.US, "%.2f", new Object[]{d});
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(d);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public String mo23529a(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2, Locale.US);
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        try {
            return simpleDateFormat2.format(Long.valueOf(simpleDateFormat.parse(str3).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
            return str3;
        }
    }

    /* renamed from: b */
    public static float m25806b(float f, Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: b */
    public String mo23572b(String str, String str2) {
        String str3 = "?token=";
        if (m25786E0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://forms.staging.mrsool.co/courier_complaints/");
            sb.append(str2);
            sb.append(str3);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://forms.mrsool.co/courier_complaints/");
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m25808b(long j) {
        long j2 = (j / 60000) % 60;
        long j3 = (j / 1000) % 60;
        return String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
    }

    /* renamed from: a */
    public String mo23521a(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.US).format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m25804a(Context context, Class<?> cls) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m25799a(Context context, String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("geo:");
            sb.append(str);
            sb.append(",");
            sb.append(str2);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo23555a(ArrayList<FourSquareMainBean> arrayList, int i, Context context) {
        if (context == null) {
            context = this.f17107a;
            if (context == null) {
                return;
            }
        }
        AppSingleton appSingleton = (AppSingleton) context.getApplicationContext();
        if (appSingleton != null) {
            appSingleton.f16954a.setDistance(((FourSquareMainBean) arrayList.get(i)).getDistance());
            appSingleton.f16954a.setFormattedAddress(((FourSquareMainBean) arrayList.get(i)).getFormattedAddress());
            appSingleton.f16954a.setLatitude(((FourSquareMainBean) arrayList.get(i)).getLatitude());
            appSingleton.f16954a.setLongitude(((FourSquareMainBean) arrayList.get(i)).getLongitude());
            appSingleton.f16954a.setRatings(((FourSquareMainBean) arrayList.get(i)).getRatings());
            appSingleton.f16954a.setShopId(((FourSquareMainBean) arrayList.get(i)).getShopId());
            appSingleton.f16954a.setShopName(((FourSquareMainBean) arrayList.get(i)).getShopName());
            appSingleton.f16954a.setShopPic(((FourSquareMainBean) arrayList.get(i)).getShopPic());
            appSingleton.f16954a.setType(((FourSquareMainBean) arrayList.get(i)).getType());
            appSingleton.f16954a.setvDataSource(((FourSquareMainBean) arrayList.get(i)).getvDataSource());
        }
    }

    /* renamed from: a */
    public void mo23530a() {
        C11644i.f33460y6.clear();
        C11644i.f33468z6.clear();
        C11644i.f33048A6.clear();
        C11644i.f33056B6.clear();
        C11644i.f33064C6.clear();
        C11644i.f33072D6 = null;
        C11644i.f33080E6 = 1;
        C11644i.f33112I6 = 0;
        C11644i.f33136L6 = false;
        C11644i.f33144M6 = false;
        C11644i.f33120J6 = false;
        C11644i.f33128K6 = false;
        C11644i.f33144M6 = false;
        C11644i.f33093G3 = 0;
        C11694e.INSTANCE.mo40209e();
    }

    /* renamed from: a */
    public void mo23542a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    /* renamed from: a */
    public String mo23526a(messages messages) {
        if (messages.getvType().equalsIgnoreCase("text")) {
            if (TextUtils.isEmpty(messages.getSender_username())) {
                return messages.getTxContent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(messages.getSender_username());
            sb.append(": ");
            sb.append(messages.getTxContent());
            return sb.toString();
        } else if (messages.getvType().equalsIgnoreCase("image")) {
            if (TextUtils.isEmpty(messages.getSender_username())) {
                return "Got a picture message";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(messages.getSender_username());
            sb2.append(" sent a picture message");
            return sb2.toString();
        } else if (!messages.getvType().equalsIgnoreCase("location")) {
            return "";
        } else {
            if (TextUtils.isEmpty(messages.getSender_username())) {
                return "Got a location";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(messages.getSender_username());
            sb3.append(" sent a location");
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public void mo23540a(BroadcastReceiver broadcastReceiver, String str) {
        C2128a.m11089a(this.f17107a).mo9218a(broadcastReceiver, new IntentFilter(str));
    }

    /* renamed from: a */
    public void mo23541a(BroadcastReceiver broadcastReceiver, String... strArr) {
        for (String a : strArr) {
            mo23540a(broadcastReceiver, a);
        }
    }

    /* renamed from: a */
    public void mo23539a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            C2128a.m11089a(this.f17107a).mo9217a(broadcastReceiver);
        }
    }

    /* renamed from: a */
    public void mo23549a(RecyclerView recyclerView) {
        if (C11644i.f33153O && recyclerView != null) {
            recyclerView.stopScroll();
            recyclerView.getRecycledViewPool().mo7542b();
        }
    }

    /* renamed from: a */
    public C0894c mo23513a(Bitmap bitmap) {
        C0894c a = C0895d.m5185a(this.f17107a.getResources(), bitmap);
        a.mo4601b(true);
        return a;
    }

    /* renamed from: a */
    public int mo23505a(float f, Context context) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public String mo23520a(float f) {
        if (((double) f) == 0.0d) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(f);
        String sb2 = sb.toString();
        int i = (int) f;
        if (f / ((float) i) == 1.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(i);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    public void mo23547a(RatingBar ratingBar, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 24) {
            mo23593c(ratingBar, i);
        } else if (i2 == 23) {
            mo23578b(ratingBar, i);
        } else {
            mo23606d(ratingBar, i);
        }
    }

    /* renamed from: a */
    public void mo23554a(String str, String str2) {
        ((ClipboardManager) this.f17107a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    /* renamed from: a */
    public String mo23522a(Context context) {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            if (C0841b.m4916a(this.f17107a, "android.permission.READ_PHONE_STATE") != 0) {
                return str;
            }
            return telephonyManager != null ? telephonyManager.getDeviceId() : null;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public void mo23558a(boolean z, TextView textView, boolean z2) {
        if (textView != null) {
            if (z) {
                textView.setEnabled(true);
                textView.setAlpha(1.0f);
            } else {
                textView.setEnabled(false);
                if (z2) {
                    textView.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23557a(boolean z, View view, boolean z2) {
        if (view != null) {
            if (z) {
                view.setEnabled(true);
                view.setAlpha(1.0f);
            } else {
                view.setEnabled(false);
                if (z2) {
                    view.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23533a(int i, View... viewArr) {
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static String m25797a(Bundle bundle) {
        String str = C11644i.f33199T5;
        if (bundle != null) {
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m25798a(Bundle bundle, String str) {
        if (bundle != null) {
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo23548a(TextView textView, String str) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f17107a, 17432577);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f17107a, 17432576);
        loadAnimation.setDuration(100);
        loadAnimation2.setDuration(100);
        loadAnimation.setAnimationListener(new C5905j(textView, str, loadAnimation2));
        textView.startAnimation(loadAnimation);
    }

    /* renamed from: a */
    public void mo23544a(View view, int i) {
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setGravity(i);
        }
    }

    /* renamed from: a */
    public void mo23545a(ImageView imageView) {
        if (imageView != null) {
            imageView.setScaleX(-1.0f);
        }
    }

    /* renamed from: a */
    public void mo23561a(ImageView... imageViewArr) {
        if (mo23496R()) {
            for (ImageView imageView : imageViewArr) {
                if (imageView != null) {
                    imageView.setScaleX(-1.0f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23556a(List<serviceManualStepsBean> list, ServiceManualDataBean serviceManualDataBean) {
        Dialog dialog = this.f17118l;
        if (dialog != null && dialog.isShowing()) {
            this.f17118l.dismiss();
        }
        this.f17118l = new Dialog(this.f17107a, C10232R.style.AlertCustomerDialogStyleFullScreen);
        this.f17118l.requestWindowFeature(1);
        this.f17118l.setContentView(C10232R.layout.dialog_service_manual);
        this.f17118l.getWindow().setLayout(-1, -1);
        this.f17118l.setCancelable(false);
        ImageView imageView = (ImageView) this.f17118l.findViewById(C10232R.C10236id.imgClose);
        RecyclerView recyclerView = (RecyclerView) this.f17118l.findViewById(C10232R.C10236id.rvSteps);
        TextView textView = (TextView) this.f17118l.findViewById(C10232R.C10236id.tvDone);
        textView.setEnabled(false);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this.f17107a);
        wrapContentLinearLayoutManager.mo7000l(1);
        recyclerView.setLayoutManager(wrapContentLinearLayoutManager);
        recyclerView.setItemAnimator(mo23672x());
        recyclerView.setNestedScrollingEnabled(false);
        C11065s sVar = new C11065s(list, this.f17107a);
        recyclerView.setAdapter(sVar);
        sVar.mo38824a((C11069d) new C5907l(list, sVar, textView));
        textView.setOnClickListener(new C5908m(serviceManualDataBean));
        imageView.setOnClickListener(new C5909n(list));
        if (!((Activity) this.f17107a).isFinishing()) {
            this.f17118l.show();
        }
    }

    /* renamed from: a */
    public void mo23538a(Dialog dialog, List<serviceManualStepsBean> list) {
        if (mo23565a(list)) {
            mo23491N("Great !");
            dialog.dismiss();
            return;
        }
        mo23491N("You must read all steps");
    }

    /* renamed from: a */
    public boolean mo23565a(List<serviceManualStepsBean> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!((serviceManualStepsBean) list.get(i)).isRead()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo23551a(ServiceManualDataBean serviceManualDataBean) {
        if (mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("manual_hash", TextUtils.isEmpty(serviceManualDataBean.getManualHash()) ? "" : serviceManualDataBean.getManualHash());
            C5882b.m25774a(this).callgetShopManual(hashMap).enqueue(new C5910o(serviceManualDataBean));
        }
    }

    /* renamed from: a */
    public void mo23536a(Dialog dialog, ServiceManualDataBean serviceManualDataBean) {
        if (mo23502X()) {
            mo23665u0();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(serviceManualDataBean.getManualHash())) {
                hashMap.put("manual_hash", serviceManualDataBean.getManualHash());
            }
            String str = "";
            hashMap.put("vShopId", TextUtils.isEmpty(serviceManualDataBean.getShopID()) ? str : serviceManualDataBean.getShopID());
            hashMap.put("manual_ids", TextUtils.isEmpty(serviceManualDataBean.getManualIds()) ? str : serviceManualDataBean.getManualIds());
            hashMap.put("order_id", TextUtils.isEmpty(serviceManualDataBean.getOrderId()) ? str : serviceManualDataBean.getOrderId());
            if (!TextUtils.isEmpty(serviceManualDataBean.getTriggerType())) {
                str = serviceManualDataBean.getTriggerType();
            }
            hashMap.put("trigger_type", str);
            StringBuilder sb = new StringBuilder();
            sb.append("callMarkAsRead : ");
            sb.append(hashMap);
            C5880q.m25751b(sb.toString());
            C5882b.m25774a(this).callAddManualLog(hashMap).enqueue(new C5911p(serviceManualDataBean, dialog));
        }
    }

    /* renamed from: a */
    public void mo23537a(Dialog dialog, ServiceManualDataBean serviceManualDataBean, String str) {
        if (mo23502X()) {
            mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("manual_hash", str);
            StringBuilder sb = new StringBuilder();
            sb.append("callMarkAsRead : ");
            sb.append(hashMap);
            C5880q.m25751b(sb.toString());
            C5882b.m25774a(this).callAddManualLog(hashMap).enqueue(new C5912q(serviceManualDataBean, dialog));
        }
    }

    /* renamed from: a */
    public void mo23553a(C11056p pVar) {
        this.f17117k = pVar;
    }

    /* renamed from: a */
    public String mo23528a(Object obj) {
        String str = "service_manual";
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject(new C8775f().mo32317a(obj));
            if (!jSONObject.has(str)) {
                return str2;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (!jSONObject2.getBoolean("show_manual")) {
                return str2;
            }
            str2 = jSONObject2.getJSONObject("manual_hash").toString();
            return str2;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo23519a(double d, double d2) {
        String str = "";
        try {
            Double valueOf = Double.valueOf((d / 100.0d) * d2);
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
            decimalFormat.applyPattern("#.##");
            try {
                return decimalFormat.format(valueOf);
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(valueOf);
                return sb.toString();
            }
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(d);
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public String mo23518a(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.##");
        try {
            return decimalFormat.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(d);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public Boolean mo23515a(Class cls) {
        for (RunningTaskInfo runningTaskInfo : ((ActivityManager) this.f17107a.getSystemService("activity")).getRunningTasks(Integer.MAX_VALUE)) {
            if (cls.getCanonicalName().equalsIgnoreCase(runningTaskInfo.topActivity.getClassName())) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public void mo23560a(View... viewArr) {
        if (mo23496R()) {
            for (View rotation : viewArr) {
                rotation.setRotation(180.0f);
            }
        }
    }

    /* renamed from: a */
    public View mo23512a(int i, String str) {
        View inflate = ((LayoutInflater) this.f17107a.getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_branch, null);
        RoundedImage roundedImage = (RoundedImage) inflate.findViewById(C10232R.C10236id.ivPin);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
        ((TextView) inflate.findViewById(C10232R.C10236id.tvDistance)).setVisibility(8);
        roundedImage.setImageResource(i);
        textView.setText(str);
        textView.setPadding(0, (int) this.f17107a.getResources().getDimension(C10232R.dimen.dp_1), 0, 0);
        linearLayout.setBackgroundResource(C10232R.C10235drawable.marker_bg_new_small);
        return inflate;
    }

    /* renamed from: a */
    public String mo23527a(MenuDatabean menuDatabean) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17107a.getDir(this.f17119m, 0));
            sb.append(this.f17120n);
            sb.append(menuDatabean.getShopId());
            sb.append(C10186b.f27190c);
            File file = new File(sb.toString());
            if (file.exists() && menuDatabean.isMenuUpdated()) {
                file.delete();
            } else if (file.exists() && !menuDatabean.isMenuUpdated()) {
                return mo23571b(menuDatabean.getShopId());
            }
            file.createNewFile();
            URLConnection openConnection = new URL(menuDatabean.getMenuUrl()).openConnection();
            openConnection.setReadTimeout(C10526n.f28536a);
            openConnection.setConnectTimeout(C14236a.DEFAULT_TIMEOUT);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(openConnection.getInputStream(), 5120);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[5120];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    return mo23571b(menuDatabean.getShopId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static double m25793a(Double d) {
        try {
            return Double.parseDouble(String.format(Locale.US, "%.2f", new Object[]{d}));
        } catch (Exception unused) {
            return d.doubleValue();
        }
    }

    /* renamed from: a */
    public void mo23559a(boolean z, View... viewArr) {
        float f = 0.0f;
        float f2 = 1.0f;
        if (!z) {
            f = 1.0f;
            f2 = 0.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(false);
        for (View startAnimation : viewArr) {
            startAnimation.startAnimation(alphaAnimation);
        }
        alphaAnimation.setAnimationListener(new C5915t(z, viewArr));
    }

    /* renamed from: a */
    public static String m25796a(long j) {
        long j2 = j % 60;
        long j3 = (j / 60) % 60;
        long j4 = (j / 3600) % 24;
        return String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)});
    }

    /* renamed from: a */
    public void mo23535a(Dialog dialog) {
        if (dialog != null) {
            try {
                dialog.getWindow().setLayout((C11644i.f33097H * 6) / 7, -2);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(this.f17107a.getResources().getColor(17170445)));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public Long mo23517a(long j, long j2, int i) {
        long j3 = (long) (i * 60);
        long j4 = j2 - j;
        if (j4 >= 0) {
            return Long.valueOf(j4 * 1000);
        }
        return Long.valueOf(j3 * 1000);
    }

    /* renamed from: a */
    public Dialog mo23508a(int i, boolean z) {
        Dialog dialog = new Dialog(this.f17107a);
        dialog.requestWindowFeature(1);
        dialog.setContentView(i);
        dialog.setCancelable(z);
        mo23535a(dialog);
        return dialog;
    }

    /* renamed from: a */
    public void mo23552a(XmppDetails xmppDetails) {
        mo23470D().mo23449a(C11644i.f33313h0, new C8775f().mo32317a((Object) xmppDetails));
    }

    /* renamed from: a */
    public static void m25802a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m25802a(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: a */
    public CharSequence mo23516a(String str, List<String> list) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, str.length(), 33);
        for (int i = 0; i < list.size(); i++) {
            int i2 = -1;
            while (true) {
                int indexOf = str.indexOf((String) list.get(i), i2 + 1);
                if (indexOf == -1) {
                    break;
                }
                System.out.println(indexOf);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a(this.f17107a, (int) C10232R.C10234color.white)), indexOf, ((String) list.get(i)).length() + indexOf, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, ((String) list.get(i)).length() + indexOf, 33);
                spannableString.setSpan(new CustomTypefaceSpan("", Typeface.createFromAsset(this.f17107a.getAssets(), "Roboto-Medium.ttf")), indexOf, ((String) list.get(i)).length() + indexOf, 33);
                i2 = indexOf + 1;
            }
        }
        return TextUtils.concat(new CharSequence[]{spannableString});
    }

    /* renamed from: a */
    public static void m25803a(Window window, int i, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags = 201326592 | attributes.flags;
            int i2 = 256;
            if (z) {
                i2 = 1280;
            }
            window.getDecorView().setSystemUiVisibility(i2);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.flags &= -201326593;
            window.setStatusBarColor(i);
        }
    }

    /* renamed from: a */
    public void mo23534a(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() ^ 8192);
            activity.getWindow().setStatusBarColor(-16711936);
        }
    }

    /* renamed from: a */
    public void mo23550a(C5665a aVar) {
        aVar.setOnShowListener(new C5919x());
    }

    /* renamed from: a */
    public static void m25800a(Context context, String str, String str2, String str3, TextView textView) {
        int indexOf = str.indexOf(str2);
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("", createFromAsset), indexOf, str2.length() + indexOf, 34);
        textView.setText(spannableStringBuilder);
    }
}
