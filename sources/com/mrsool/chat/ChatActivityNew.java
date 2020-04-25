package com.mrsool.chat;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.transition.Slide;
import android.transition.Visibility;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.C0512i0;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.recyclerview.widget.RecyclerView;
import cafe.adriel.androidaudiorecorder.C2794c;
import cafe.adriel.androidaudiorecorder.p151e.C2796a;
import cafe.adriel.androidaudiorecorder.p151e.C2798b;
import cafe.adriel.androidaudiorecorder.p151e.C2799c;
import com.airbnb.lottie.LottieAnimationView;
import com.amplitude.api.C2876e;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.github.aakira.expandablelayout.C3902d;
import com.github.aakira.expandablelayout.C3911g;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds.Builder;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.C8775f;
import com.mrsool.C10232R;
import com.mrsool.C10797g;
import com.mrsool.C10831j;
import com.mrsool.C10832k;
import com.mrsool.C10943o;
import com.mrsool.CreateBillActivity;
import com.mrsool.HomeActivity;
import com.mrsool.bean.CallOptionsBean;
import com.mrsool.bean.CallOptionsMainBean;
import com.mrsool.bean.CancelReasonBean;
import com.mrsool.bean.CancelReasonMainBean;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.bean.ComplaintTokenBean;
import com.mrsool.bean.CourierLastLocationBean;
import com.mrsool.bean.CourierLastLocationMainBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.DefaultBeanUrl;
import com.mrsool.bean.LastCourierLocationHistoryBean;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.bean.OptionMenuItemsBean;
import com.mrsool.bean.OrderDeliveredBean;
import com.mrsool.bean.OrderReasonBean;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentHashBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.PaymentOptionsList;
import com.mrsool.bean.PaymentReceiptBean;
import com.mrsool.bean.PaymentStatusBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.bean.TrackingCoOrdinateBean;
import com.mrsool.bean.TrackingHistoryDataBean;
import com.mrsool.bean.TrackingHistoryMainBean;
import com.mrsool.bean.TrackingHistoryParamBean;
import com.mrsool.bean.messages;
import com.mrsool.bean.messages.AUDIO_STATE;
import com.mrsool.chat.C10487g.C10511r;
import com.mrsool.chat.C10512h.C10515c;
import com.mrsool.chat.C10516i.C10518b;
import com.mrsool.complaint.ComplaintDetailActivity;
import com.mrsool.createorder.PicOrderLocationActivityRevised;
import com.mrsool.customeview.audiorecordingview.AudioRecordView;
import com.mrsool.customeview.audiorecordingview.AudioRecordView.C10773n;
import com.mrsool.offer.OfferOrderActivity;
import com.mrsool.order.C11056p;
import com.mrsool.order.ChangeCourierActivity;
import com.mrsool.order.FileComplainActivity;
import com.mrsool.p409me.UserFeedbackActivity;
import com.mrsool.p423v.C11718b;
import com.mrsool.p423v.C11720d;
import com.mrsool.p423v.C11728i;
import com.mrsool.p425y.C11759b;
import com.mrsool.p425y.C11759b.C11760a;
import com.mrsool.payment.C11095j;
import com.mrsool.payment.C11095j.C11113o;
import com.mrsool.payment.C11118l;
import com.mrsool.payment.C11120n;
import com.mrsool.payment.C11124o;
import com.mrsool.payment.C11127q;
import com.mrsool.payment.C11127q.C11130c;
import com.mrsool.shop.ViewLocationActivity;
import com.mrsool.socket.C11460a;
import com.mrsool.socket.C11460a.C11463c;
import com.mrsool.socket.C11471d;
import com.mrsool.socket.LocationService;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11571b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11644i.C11645a;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.ConnectivityChange.NetworkSchedulerService;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p420b0.C11573b;
import com.mrsool.utils.p420b0.C11574c;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.p421c.C11615d;
import com.mrsool.utils.p421c.C11616e;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.APIInterface;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11692d;
import com.mrsool.utils.webservice.C11694e;
import com.mrsool.utils.webservice.C11713f;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.oppwa.mobile.connect.service.C11991a;
import com.pusher.client.C11995c;
import com.pusher.client.C12036d;
import com.pusher.client.channel.C11996a;
import com.pusher.client.channel.C11997b;
import com.pusher.client.channel.C12002g;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import com.skyfishjy.library.RippleBackground;
import java.io.File;
import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import omrecorder.C15035b;
import omrecorder.C15042f;
import omrecorder.C15044h.C15048b;
import omrecorder.C15044h.C15050d;
import omrecorder.C15056j;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p065e.p066b.p067a.C2118c;
import p053b.p072g.p073b.C2128a;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p205i.p489f.C14069f;
import p212io.branch.referral.C14130h;
import p212io.branch.referral.C6009d;
import p212io.branch.referral.C6009d.C6017h;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatActivityNew extends C10797g implements OnClickListener, C10943o, C11056p, C11760a, C10518b, C10515c, C11573b {

    /* renamed from: A6 */
    private static final String f27653A6 = "STATE_RESOURCE_PATH";

    /* renamed from: B6 */
    public static String f27654B6 = null;

    /* renamed from: C6 */
    public static String f27655C6 = "";

    /* renamed from: D6 */
    public static OnClickListener f27656D6 = null;

    /* renamed from: E6 */
    private static final int f27657E6 = 30000;

    /* renamed from: F6 */
    public static boolean f27658F6 = false;

    /* renamed from: G6 */
    public static String f27659G6;

    /* renamed from: H6 */
    static final /* synthetic */ boolean f27660H6 = false;

    /* renamed from: z6 */
    public static Activity f27661z6;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public CardView f27662A0;

    /* renamed from: A1 */
    private Drawable f27663A1;

    /* renamed from: A2 */
    private String f27664A2;

    /* renamed from: A3 */
    private Dialog f27665A3;

    /* renamed from: A4 */
    private ImageView f27666A4;
    /* access modifiers changed from: private */

    /* renamed from: A5 */
    public CancelReasonMainBean f27667A5;

    /* renamed from: B0 */
    private TextView f27668B0;

    /* renamed from: B1 */
    private Drawable f27669B1;

    /* renamed from: B2 */
    private Bundle f27670B2;
    /* access modifiers changed from: private */

    /* renamed from: B3 */
    public Dialog f27671B3;

    /* renamed from: B4 */
    private TextView f27672B4;
    /* access modifiers changed from: private */

    /* renamed from: B5 */
    public int f27673B5;

    /* renamed from: C0 */
    private TextView f27674C0;

    /* renamed from: C1 */
    public WrapContentLinearLayoutManager f27675C1;
    /* access modifiers changed from: private */

    /* renamed from: C2 */
    public C11617f f27676C2;
    /* access modifiers changed from: private */

    /* renamed from: C3 */
    public ExpandableLinearLayout f27677C3;
    /* access modifiers changed from: private */

    /* renamed from: C4 */
    public int f27678C4;

    /* renamed from: C5 */
    private final int f27679C5;

    /* renamed from: D0 */
    private TextView f27680D0;

    /* renamed from: D1 */
    private Parcelable f27681D1;

    /* renamed from: D2 */
    private String f27682D2;
    /* access modifiers changed from: private */

    /* renamed from: D3 */
    public TextView f27683D3;

    /* renamed from: D4 */
    private LinearLayout f27684D4;
    /* access modifiers changed from: private */

    /* renamed from: D5 */
    public boolean f27685D5;

    /* renamed from: E0 */
    private TextView f27686E0;

    /* renamed from: E1 */
    private String f27687E1;

    /* renamed from: E2 */
    private String f27688E2;
    /* access modifiers changed from: private */

    /* renamed from: E3 */
    public TextView f27689E3;

    /* renamed from: E4 */
    private LinearLayout f27690E4;

    /* renamed from: E5 */
    private boolean f27691E5;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public TextView f27692F0;
    /* access modifiers changed from: private */

    /* renamed from: F1 */
    public FrameLayout f27693F1;

    /* renamed from: F2 */
    private String f27694F2;
    /* access modifiers changed from: private */

    /* renamed from: F3 */
    public TextView f27695F3;
    /* access modifiers changed from: private */

    /* renamed from: F4 */
    public boolean f27696F4;

    /* renamed from: F5 */
    private boolean f27697F5;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public TextView f27698G0;

    /* renamed from: G1 */
    private ConstraintLayout f27699G1;

    /* renamed from: G2 */
    private final int f27700G2;

    /* renamed from: G3 */
    private TextView f27701G3;

    /* renamed from: G4 */
    private Animation f27702G4;
    /* access modifiers changed from: private */

    /* renamed from: G5 */
    public boolean f27703G5;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public TextView f27704H0;

    /* renamed from: H1 */
    private ProgressBar f27705H1;

    /* renamed from: H2 */
    private final int f27706H2;
    /* access modifiers changed from: private */

    /* renamed from: H3 */
    public ImageView f27707H3;

    /* renamed from: H4 */
    private Location f27708H4;
    /* access modifiers changed from: private */

    /* renamed from: H5 */
    public String f27709H5;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public TextView f27710I0;

    /* renamed from: I1 */
    private ImageView f27711I1;

    /* renamed from: I2 */
    private final int f27712I2;

    /* renamed from: I3 */
    public List<CancelReasonBean> f27713I3;
    /* access modifiers changed from: private */

    /* renamed from: I4 */
    public Location f27714I4;

    /* renamed from: I5 */
    private C11614c f27715I5;

    /* renamed from: J0 */
    private TextView f27716J0;

    /* renamed from: J1 */
    private LottieAnimationView f27717J1;

    /* renamed from: J2 */
    private final int f27718J2;

    /* renamed from: J3 */
    private C10831j f27719J3;
    /* access modifiers changed from: private */

    /* renamed from: J4 */
    public Marker f27720J4;

    /* renamed from: J5 */
    private C11615d f27721J5;

    /* renamed from: K0 */
    private TextView f27722K0;

    /* renamed from: K1 */
    private LottieAnimationView f27723K1;

    /* renamed from: K2 */
    private final int f27724K2;
    /* access modifiers changed from: private */

    /* renamed from: K3 */
    public Spinner f27725K3;
    /* access modifiers changed from: private */

    /* renamed from: K4 */
    public String f27726K4;
    /* access modifiers changed from: private */

    /* renamed from: K5 */
    public AudioRecordView f27727K5;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public TextView f27728L0;

    /* renamed from: L1 */
    private TextView f27729L1;

    /* renamed from: L2 */
    private final int f27730L2;

    /* renamed from: L3 */
    private String f27731L3;

    /* renamed from: L4 */
    private ProgressBar f27732L4;

    /* renamed from: L5 */
    public MediaPlayer f27733L5;

    /* renamed from: M0 */
    private TextView f27734M0;

    /* renamed from: M1 */
    private TextView f27735M1;

    /* renamed from: M2 */
    private final int f27736M2;
    /* access modifiers changed from: private */

    /* renamed from: M3 */
    public boolean f27737M3;

    /* renamed from: M4 */
    private ProgressBar f27738M4;
    /* access modifiers changed from: private */

    /* renamed from: M5 */
    public Handler f27739M5;

    /* renamed from: N0 */
    private TextView f27740N0;
    /* access modifiers changed from: private */

    /* renamed from: N1 */
    public TextView f27741N1;

    /* renamed from: N2 */
    private final int f27742N2;
    /* access modifiers changed from: private */

    /* renamed from: N3 */
    public boolean f27743N3;

    /* renamed from: N4 */
    private float f27744N4;
    /* access modifiers changed from: private */

    /* renamed from: N5 */
    public C15056j f27745N5;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public TextView f27746O0;
    /* access modifiers changed from: private */

    /* renamed from: O1 */
    public ConstraintLayout f27747O1;

    /* renamed from: O2 */
    private final String f27748O2;
    /* access modifiers changed from: private */

    /* renamed from: O3 */
    public boolean f27749O3;

    /* renamed from: O4 */
    private float f27750O4;

    /* renamed from: O5 */
    private int f27751O5;

    /* renamed from: P0 */
    private TextView f27752P0;

    /* renamed from: P1 */
    private TextView f27753P1;

    /* renamed from: P2 */
    private final String f27754P2;
    /* access modifiers changed from: private */

    /* renamed from: P3 */
    public boolean f27755P3;

    /* renamed from: P4 */
    private float f27756P4;

    /* renamed from: P5 */
    private int f27757P5;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public TextView f27758Q0;

    /* renamed from: Q1 */
    private ImageView f27759Q1;

    /* renamed from: Q2 */
    private final String f27760Q2;
    /* access modifiers changed from: private */

    /* renamed from: Q3 */
    public CallOptionsMainBean f27761Q3;

    /* renamed from: Q4 */
    private float f27762Q4;

    /* renamed from: Q5 */
    private int f27763Q5;

    /* renamed from: R0 */
    private TextView f27764R0;

    /* renamed from: R1 */
    private CardView f27765R1;

    /* renamed from: R2 */
    private final String f27766R2;
    /* access modifiers changed from: private */

    /* renamed from: R3 */
    public ArrayList<OptionMenuItemsBean> f27767R3;

    /* renamed from: R4 */
    private float f27768R4;

    /* renamed from: R5 */
    private View f27769R5;

    /* renamed from: S0 */
    private RatingBar f27770S0;

    /* renamed from: S1 */
    private CardView f27771S1;

    /* renamed from: S2 */
    private final String f27772S2;
    /* access modifiers changed from: private */

    /* renamed from: S3 */
    public boolean f27773S3;

    /* renamed from: S4 */
    private float f27774S4;

    /* renamed from: S5 */
    private Timer f27775S5;

    /* renamed from: T0 */
    private FrameLayout f27776T0;
    /* access modifiers changed from: private */

    /* renamed from: T1 */
    public ConstraintLayout f27777T1;

    /* renamed from: T2 */
    private final String f27778T2;
    /* access modifiers changed from: private */

    /* renamed from: T3 */
    public C5665a f27779T3;

    /* renamed from: T4 */
    private float f27780T4;
    /* access modifiers changed from: private */

    /* renamed from: T5 */
    public Timer f27781T5;

    /* renamed from: U0 */
    private FrameLayout f27782U0;

    /* renamed from: U1 */
    private CardView f27783U1;

    /* renamed from: U2 */
    private final String f27784U2;
    /* access modifiers changed from: private */

    /* renamed from: U3 */
    public ConstraintLayout f27785U3;
    /* access modifiers changed from: private */

    /* renamed from: U4 */
    public Handler f27786U4;

    /* renamed from: U5 */
    private Timer f27787U5;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public FrameLayout f27788V0;

    /* renamed from: V1 */
    private CardView f27789V1;

    /* renamed from: V2 */
    private final String f27790V2;

    /* renamed from: V3 */
    private ConstraintLayout f27791V3;
    /* access modifiers changed from: private */

    /* renamed from: V4 */
    public Runnable f27792V4;
    /* access modifiers changed from: private */

    /* renamed from: V5 */
    public Timer f27793V5;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public ConstraintLayout f27794W0;
    /* access modifiers changed from: private */

    /* renamed from: W1 */
    public ArrayList<messages> f27795W1;

    /* renamed from: W2 */
    private final String f27796W2;
    /* access modifiers changed from: private */

    /* renamed from: W3 */
    public View f27797W3;

    /* renamed from: W4 */
    private FloatingActionButton f27798W4;
    /* access modifiers changed from: private */

    /* renamed from: W5 */
    public Boolean f27799W5;

    /* renamed from: X0 */
    private LinearLayout f27800X0;
    /* access modifiers changed from: private */

    /* renamed from: X1 */
    public C10487g f27801X1;

    /* renamed from: X2 */
    private final String f27802X2;
    /* access modifiers changed from: private */

    /* renamed from: X3 */
    public View f27803X3;

    /* renamed from: X4 */
    private FloatingActionButton f27804X4;
    /* access modifiers changed from: private */

    /* renamed from: X5 */
    public boolean f27805X5;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public LinearLayout f27806Y0;

    /* renamed from: Y1 */
    private List<Dialog> f27807Y1 = new ArrayList();

    /* renamed from: Y2 */
    private final String f27808Y2;
    /* access modifiers changed from: private */

    /* renamed from: Y3 */
    public LinearLayout f27809Y3;

    /* renamed from: Y4 */
    private ArrayList<Marker> f27810Y4;
    /* access modifiers changed from: private */

    /* renamed from: Y5 */
    public boolean f27811Y5;

    /* renamed from: Z0 */
    private LinearLayout f27812Z0;

    /* renamed from: Z1 */
    private List<messages> f27813Z1 = new ArrayList();

    /* renamed from: Z2 */
    private final String f27814Z2;
    /* access modifiers changed from: private */

    /* renamed from: Z3 */
    public LinearLayout f27815Z3;
    /* access modifiers changed from: private */

    /* renamed from: Z4 */
    public ArrayList<Marker> f27816Z4;

    /* renamed from: Z5 */
    private boolean f27817Z5;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public ImageView f27818a1;
    /* access modifiers changed from: private */

    /* renamed from: a2 */
    public List<TrackingCoOrdinateBean> f27819a2 = new ArrayList();

    /* renamed from: a3 */
    private final String f27820a3;
    /* access modifiers changed from: private */

    /* renamed from: a4 */
    public LinearLayout f27821a4;

    /* renamed from: a5 */
    private Animation f27822a5;
    /* access modifiers changed from: private */

    /* renamed from: a6 */
    public C11120n f27823a6;

    /* renamed from: b1 */
    private ImageView f27824b1;
    /* access modifiers changed from: private */

    /* renamed from: b2 */
    public String f27825b2;

    /* renamed from: b3 */
    private final String f27826b3;
    /* access modifiers changed from: private */

    /* renamed from: b4 */
    public LinearLayout f27827b4;
    /* access modifiers changed from: private */

    /* renamed from: b5 */
    public boolean f27828b5;

    /* renamed from: b6 */
    private C11095j f27829b6;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public ImageView f27830c1;

    /* renamed from: c2 */
    private String f27831c2;

    /* renamed from: c3 */
    private final int f27832c3;

    /* renamed from: c4 */
    private LinearLayout f27833c4;
    /* access modifiers changed from: private */

    /* renamed from: c5 */
    public float f27834c5;
    /* access modifiers changed from: private */

    /* renamed from: c6 */
    public C10523l f27835c6;

    /* renamed from: d1 */
    private ImageView f27836d1;

    /* renamed from: d2 */
    private String f27837d2;

    /* renamed from: d3 */
    private final int f27838d3;
    /* access modifiers changed from: private */

    /* renamed from: d4 */
    public LinearLayout f27839d4;

    /* renamed from: d5 */
    private Animation f27840d5;

    /* renamed from: d6 */
    private ImageView f27841d6;

    /* renamed from: e1 */
    private ImageView f27842e1;

    /* renamed from: e2 */
    private String f27843e2;

    /* renamed from: e3 */
    private final int f27844e3;
    /* access modifiers changed from: private */

    /* renamed from: e4 */
    public TextView f27845e4;

    /* renamed from: e5 */
    private Animation f27846e5;
    /* access modifiers changed from: private */

    /* renamed from: e6 */
    public ImageView f27847e6;

    /* renamed from: f1 */
    private ImageView f27848f1;
    /* access modifiers changed from: private */

    /* renamed from: f2 */
    public String f27849f2;
    /* access modifiers changed from: private */

    /* renamed from: f3 */
    public CourierLastLocationBean f27850f3;
    /* access modifiers changed from: private */

    /* renamed from: f4 */
    public TextView f27851f4;

    /* renamed from: f5 */
    private Long f27852f5;
    /* access modifiers changed from: private */

    /* renamed from: f6 */
    public TextView f27853f6;

    /* renamed from: g1 */
    private ImageView f27854g1;
    /* access modifiers changed from: private */

    /* renamed from: g2 */
    public boolean f27855g2;

    /* renamed from: g3 */
    private final int f27856g3;

    /* renamed from: g4 */
    private RelativeLayout f27857g4;
    /* access modifiers changed from: private */

    /* renamed from: g5 */
    public boolean f27858g5;
    /* access modifiers changed from: private */

    /* renamed from: g6 */
    public LinearLayout f27859g6;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public EditText f27860h1;
    /* access modifiers changed from: private */

    /* renamed from: h2 */
    public boolean f27861h2;

    /* renamed from: h3 */
    private final String f27862h3;

    /* renamed from: h4 */
    private RelativeLayout f27863h4;

    /* renamed from: h5 */
    private C11995c f27864h5;

    /* renamed from: h6 */
    private CountDownTimer f27865h6;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public LinearLayout f27866i1;

    /* renamed from: i2 */
    private boolean f27867i2;

    /* renamed from: i3 */
    private String f27868i3;

    /* renamed from: i4 */
    private RelativeLayout f27869i4;

    /* renamed from: i5 */
    C11996a f27870i5;

    /* renamed from: i6 */
    private AlphaAnimation f27871i6;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public LinearLayout f27872j1;
    /* access modifiers changed from: private */

    /* renamed from: j2 */
    public boolean f27873j2;
    /* access modifiers changed from: private */

    /* renamed from: j3 */
    public boolean f27874j3;

    /* renamed from: j4 */
    private RelativeLayout f27875j4;
    /* access modifiers changed from: private */

    /* renamed from: j5 */
    public boolean f27876j5;

    /* renamed from: j6 */
    private boolean f27877j6;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public LinearLayout f27878k1;

    /* renamed from: k2 */
    private int f27879k2;

    /* renamed from: k3 */
    private C6009d f27880k3;

    /* renamed from: k4 */
    private RelativeLayout f27881k4;
    /* access modifiers changed from: private */

    /* renamed from: k5 */
    public String f27882k5;

    /* renamed from: k6 */
    private C11991a f27883k6;

    /* renamed from: l1 */
    private LinearLayout f27884l1;
    /* access modifiers changed from: private */

    /* renamed from: l2 */
    public boolean f27885l2;

    /* renamed from: l3 */
    private C11616e f27886l3;

    /* renamed from: l4 */
    private RelativeLayout f27887l4;
    /* access modifiers changed from: private */

    /* renamed from: l5 */
    public GoogleMap f27888l5;
    /* access modifiers changed from: private */

    /* renamed from: l6 */
    public Dialog f27889l6;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public LinearLayout f27890m1;

    /* renamed from: m2 */
    private boolean f27891m2;

    /* renamed from: m3 */
    private Dialog f27892m3;

    /* renamed from: m4 */
    private RelativeLayout f27893m4;
    /* access modifiers changed from: private */

    /* renamed from: m5 */
    public SupportMapFragment f27894m5;

    /* renamed from: m6 */
    Dialog f27895m6;
    /* access modifiers changed from: private */

    /* renamed from: n1 */
    public LinearLayout f27896n1;
    /* access modifiers changed from: private */

    /* renamed from: n2 */
    public int f27897n2;

    /* renamed from: n3 */
    private Dialog f27898n3;

    /* renamed from: n4 */
    private RelativeLayout f27899n4;

    /* renamed from: n5 */
    private Thread f27900n5;

    /* renamed from: n6 */
    Dialog f27901n6;
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public LinearLayout f27902o1;

    /* renamed from: o2 */
    private int f27903o2;

    /* renamed from: o3 */
    private Dialog f27904o3;
    /* access modifiers changed from: private */

    /* renamed from: o4 */
    public FrameLayout f27905o4;

    /* renamed from: o5 */
    private CountDownTimer f27906o5;

    /* renamed from: o6 */
    Runnable f27907o6;
    /* access modifiers changed from: private */

    /* renamed from: p1 */
    public LinearLayout f27908p1;

    /* renamed from: p2 */
    private int f27909p2;
    /* access modifiers changed from: private */

    /* renamed from: p3 */
    public Dialog f27910p3;
    /* access modifiers changed from: private */

    /* renamed from: p4 */
    public AppBarLayout f27911p4;

    /* renamed from: p5 */
    private FloatingActionButton f27912p5;

    /* renamed from: p6 */
    private int f27913p6;
    /* access modifiers changed from: private */

    /* renamed from: q1 */
    public LinearLayout f27914q1;

    /* renamed from: q2 */
    private long f27915q2;
    /* access modifiers changed from: private */

    /* renamed from: q3 */
    public Dialog f27916q3;

    /* renamed from: q4 */
    private ImageView f27917q4;

    /* renamed from: q5 */
    private final int f27918q5;

    /* renamed from: q6 */
    private int f27919q6;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C11669t f27920r0;

    /* renamed from: r1 */
    private LinearLayout f27921r1;
    /* access modifiers changed from: private */

    /* renamed from: r2 */
    public long f27922r2;

    /* renamed from: r3 */
    private Dialog f27923r3;

    /* renamed from: r4 */
    private ImageView f27924r4;

    /* renamed from: r5 */
    private final int f27925r5;

    /* renamed from: r6 */
    private int f27926r6;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public AppSingleton f27927s0;
    /* access modifiers changed from: private */

    /* renamed from: s1 */
    public ProgressBar f27928s1;
    /* access modifiers changed from: private */

    /* renamed from: s2 */
    public ChatInitModel f27929s2;

    /* renamed from: s3 */
    private Dialog f27930s3;

    /* renamed from: s4 */
    private ImageView f27931s4;

    /* renamed from: s5 */
    private final int f27932s5;

    /* renamed from: s6 */
    private int f27933s6;

    /* renamed from: t0 */
    private boolean f27934t0 = false;

    /* renamed from: t1 */
    private ProgressBar f27935t1;
    /* access modifiers changed from: private */

    /* renamed from: t2 */
    public Dialog f27936t2;

    /* renamed from: t3 */
    private Dialog f27937t3;
    /* access modifiers changed from: private */

    /* renamed from: t4 */
    public ImageView f27938t4;

    /* renamed from: t5 */
    private final int f27939t5;

    /* renamed from: t6 */
    private int f27940t6;

    /* renamed from: u0 */
    C11571b f27941u0;

    /* renamed from: u1 */
    private ProgressBar f27942u1;

    /* renamed from: u2 */
    private Dialog f27943u2;
    /* access modifiers changed from: private */

    /* renamed from: u3 */
    public Dialog f27944u3;

    /* renamed from: u4 */
    private ImageView f27945u4;

    /* renamed from: u5 */
    private final String f27946u5;

    /* renamed from: u6 */
    private boolean f27947u6;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public Toolbar f27948v0;
    /* access modifiers changed from: private */

    /* renamed from: v1 */
    public ProgressBar f27949v1;
    /* access modifiers changed from: private */

    /* renamed from: v2 */
    public Dialog f27950v2;

    /* renamed from: v3 */
    private Dialog f27951v3;

    /* renamed from: v4 */
    private ImageView f27952v4;

    /* renamed from: v5 */
    private final String f27953v5;

    /* renamed from: v6 */
    private boolean f27954v6;

    /* renamed from: w0 */
    private ImageView f27955w0;
    /* access modifiers changed from: private */

    /* renamed from: w1 */
    public ProgressBar f27956w1;

    /* renamed from: w2 */
    private Dialog f27957w2;
    /* access modifiers changed from: private */

    /* renamed from: w3 */
    public Dialog f27958w3;

    /* renamed from: w4 */
    private ImageView f27959w4;

    /* renamed from: w5 */
    private final String f27960w5;

    /* renamed from: w6 */
    private ProgressBar f27961w6;

    /* renamed from: x0 */
    public RecyclerView f27962x0;
    /* access modifiers changed from: private */

    /* renamed from: x1 */
    public ViewGroup f27963x1;

    /* renamed from: x2 */
    private Dialog f27964x2;

    /* renamed from: x3 */
    private Dialog f27965x3;

    /* renamed from: x4 */
    private ImageView f27966x4;

    /* renamed from: x5 */
    private final String f27967x5;

    /* renamed from: x6 */
    public BroadcastReceiver f27968x6;

    /* renamed from: y0 */
    private C11574c f27969y0;
    /* access modifiers changed from: private */

    /* renamed from: y1 */
    public View f27970y1;

    /* renamed from: y2 */
    private Dialog f27971y2;
    /* access modifiers changed from: private */

    /* renamed from: y3 */
    public Dialog f27972y3;

    /* renamed from: y4 */
    private ImageView f27973y4;

    /* renamed from: y5 */
    private final String f27974y5;

    /* renamed from: y6 */
    private OnGlobalLayoutListener f27975y6;

    /* renamed from: z0 */
    public View f27976z0;

    /* renamed from: z1 */
    private View f27977z1;

    /* renamed from: z2 */
    private C0512i0 f27978z2;

    /* renamed from: z3 */
    private Dialog f27979z3;

    /* renamed from: z4 */
    private ImageView f27980z4;

    /* renamed from: z5 */
    private final String f27981z5;

    /* renamed from: com.mrsool.chat.ChatActivityNew$a */
    class C10303a implements AnimationListener {

        /* renamed from: com.mrsool.chat.ChatActivityNew$a$a */
        class C10304a implements Runnable {
            C10304a() {
            }

            public void run() {
                RecyclerView recyclerView = ChatActivityNew.this.f27962x0;
                recyclerView.scrollToPosition(recyclerView.getAdapter().mo7325b() - 1);
            }
        }

        C10303a() {
        }

        public void onAnimationEnd(Animation animation) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48019a(8, chatActivityNew.f27815Z3, ChatActivityNew.this.f27905o4);
            ChatActivityNew.this.f27815Z3.setAlpha(1.0f);
            ChatActivityNew.this.f27815Z3.setTranslationY(0.0f);
            ChatActivityNew.this.f27809Y3.setTranslationY(0.0f);
            ChatActivityNew.this.f27905o4.setTranslationY(0.0f);
            ChatActivityNew.this.f27821a4.setTranslationY(0.0f);
            ChatActivityNew.this.f27905o4.setVisibility(8);
            ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
            chatActivityNew2.m48070a(true, chatActivityNew2.f27962x0, chatActivityNew2.f27727K5);
            if (ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) {
                if (ChatActivityNew.this.f27929s2.isShowPay()) {
                    ChatActivityNew.this.m48346w(true);
                } else {
                    ChatActivityNew.this.f27809Y3.setVisibility(8);
                }
            } else if (!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered")) {
                ChatActivityNew.this.f27809Y3.setVisibility(8);
            }
            new Handler().postDelayed(new C10304a(), 50);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$a0 */
    class C10305a0 implements C12002g {
        C10305a0() {
        }

        /* renamed from: a */
        public void mo37682a(String str, String str2, String str3) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$a1 */
    class C10306a1 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27985a;

        C10306a1(Dialog dialog) {
            this.f27985a = dialog;
        }

        public void onClick(View view) {
            this.f27985a.dismiss();
            if (ChatActivityNew.this.f27888l5 != null) {
                ChatActivityNew.this.f27888l5.setMapType(1);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$a2 */
    class C10307a2 implements OnClickListener {
        C10307a2() {
        }

        public void onClick(View view) {
            String str;
            C5880q.m25751b("send is clicked");
            if (!ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                chatActivityNew.f29642a.mo23491N(chatActivityNew.getResources().getString(C10232R.string.alert_xmpp_error));
            } else if (ChatActivityNew.this.f27727K5.mo38326b()) {
                ChatActivityNew.this.f27727K5.mo38321a();
                ChatActivityNew.this.mo36519N();
                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                if (chatActivityNew2.f27855g2) {
                    str = ChatActivityNew.this.f27929s2.getOrder().getiCourierId();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(ChatActivityNew.this.f27929s2.getOrder().getiBuyerId());
                    str = sb.toString();
                }
                chatActivityNew2.m47882F(str);
            } else {
                ChatActivityNew.this.m47905I1();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$a3 */
    class C10308a3 implements Callback<DefaultBeanUrl> {

        /* renamed from: a */
        final /* synthetic */ String f27988a;

        /* renamed from: b */
        final /* synthetic */ messages f27989b;

        /* renamed from: c */
        final /* synthetic */ String f27990c;

        C10308a3(String str, messages messages, String str2) {
            this.f27988a = str;
            this.f27989b = messages;
            this.f27990c = str2;
        }

        public void onFailure(Call<DefaultBeanUrl> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23475F(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<DefaultBeanUrl> call, Response<DefaultBeanUrl> response) {
            String str;
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        if (response.isSuccessful()) {
                            DefaultBeanUrl defaultBeanUrl = (DefaultBeanUrl) response.body();
                            if (defaultBeanUrl.getCode() <= 300) {
                                int i = 0;
                                while (true) {
                                    str = "";
                                    if (i >= ChatActivityNew.this.f27795W1.size()) {
                                        break;
                                    }
                                    messages messages = (messages) ChatActivityNew.this.f27795W1.get(i);
                                    ChatActivityNew chatActivityNew = ChatActivityNew.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(messages.getiFromUserId());
                                    if (chatActivityNew.m48320t(sb.toString()) && messages.getId().equalsIgnoreCase(this.f27988a)) {
                                        this.f27989b.setTxContent(((DefaultBeanUrl) response.body()).getUrl());
                                        C11694e eVar = C11694e.INSTANCE;
                                        messages messages2 = this.f27989b;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(this.f27990c);
                                        sb2.append("@");
                                        sb2.append(C11694e.SERVICE);
                                        eVar.mo40195a(messages2, sb2.toString());
                                        messages.setIsImageLoaded(true);
                                        messages.setSent2Server(true);
                                        messages.setTxContent(ChatActivityNew.this.f29642a.mo23488M());
                                        ChatActivityNew.this.f27795W1.set(i, messages);
                                        ChatActivityNew.this.f29642a.mo23549a(ChatActivityNew.this.f27962x0);
                                        ChatActivityNew.this.f27801X1.mo7337d(i);
                                    }
                                    i++;
                                }
                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                if (!TextUtils.isEmpty(a)) {
                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                }
                                try {
                                    ChatActivityNew.this.m48062a(((DefaultBeanUrl) response.body()).getNoChatInOrder());
                                } catch (Exception unused) {
                                }
                            } else if (((DefaultBeanUrl) response.body()).getCode() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finishActivity();
                                }
                            } else if (ChatActivityNew.this.f29642a != null) {
                                ChatActivityNew.this.f29642a.mo23475F(defaultBeanUrl.getMessages());
                            }
                        } else if (ChatActivityNew.this.f29642a != null) {
                            ChatActivityNew.this.f29642a.mo23475F(response.message());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$a4 */
    class C10309a4 implements OnClickListener {
        C10309a4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.onBackPressed();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b */
    class C10310b implements OnClickListener {
        C10310b() {
        }

        public void onClick(View view) {
            if (ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew.this.m48015a(0, 3, true);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b0 */
    class C10311b0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f27995a;

        /* renamed from: b */
        final /* synthetic */ boolean f27996b;

        C10311b0(ArrayList arrayList, boolean z) {
            this.f27995a = arrayList;
            this.f27996b = z;
        }

        /* renamed from: a */
        public /* synthetic */ void mo37687a(int i, int i2) {
            ChatActivityNew.this.f27888l5.setPadding(20, i, i2, ChatActivityNew.this.f27809Y3.getHeight());
        }

        public void run() {
            String str;
            try {
                Builder builder = new Builder();
                Iterator it = this.f27995a.iterator();
                while (true) {
                    str = ",";
                    if (!it.hasNext()) {
                        break;
                    }
                    Marker marker = (Marker) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("marker :");
                    sb.append(marker.getTitle());
                    sb.append("lat");
                    sb.append(marker.getPosition().latitude);
                    sb.append(str);
                    sb.append(marker.getPosition().longitude);
                    C5880q.m25751b(sb.toString());
                    builder.include(marker.getPosition());
                }
                Drawable drawable = ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_tracking_pin_pickup_new);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_car).getIntrinsicWidth();
                ChatActivityNew.this.f27809Y3.post(new C10482b(this, intrinsicHeight, intrinsicWidth));
                if (this.f27996b) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("bound :");
                    sb2.append(builder.build().northeast);
                    sb2.append(str);
                    sb2.append(builder.build().southwest);
                    C5880q.m25751b(sb2.toString());
                    ChatActivityNew.this.f27888l5.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 0), 500, null);
                    return;
                }
                ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 100));
            } catch (Exception e) {
                if (ChatActivityNew.this.f27888l5 != null) {
                    ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                }
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b1 */
    class C10312b1 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27997a;

        C10312b1(Dialog dialog) {
            this.f27997a = dialog;
        }

        public void onClick(View view) {
            this.f27997a.dismiss();
            if (ChatActivityNew.this.f27888l5 != null) {
                ChatActivityNew.this.f27888l5.setMapType(4);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b2 */
    class C10313b2 implements OnClickListener {
        C10313b2() {
        }

        public void onClick(View view) {
            String str;
            C5880q.m25751b("send is clicked");
            if (!ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                chatActivityNew.f29642a.mo23491N(chatActivityNew.getResources().getString(C10232R.string.alert_xmpp_error));
            } else if (ChatActivityNew.this.f27727K5.mo38326b()) {
                ChatActivityNew.this.f27727K5.mo38321a();
                ChatActivityNew.this.mo36519N();
                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                if (chatActivityNew2.f27855g2) {
                    str = ChatActivityNew.this.f27929s2.getOrder().getiCourierId();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(ChatActivityNew.this.f27929s2.getOrder().getiBuyerId());
                    str = sb.toString();
                }
                chatActivityNew2.m47882F(str);
            } else {
                ChatActivityNew.this.m47905I1();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b3 */
    class C10314b3 implements Runnable {
        C10314b3() {
        }

        public void run() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.f29642a.mo23549a(chatActivityNew.f27962x0);
            ChatActivityNew.this.f27801X1.mo7337d(ChatActivityNew.this.f27795W1.size() - 1);
            ChatActivityNew.this.m48072a0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$b4 */
    class C10315b4 implements OnKeyListener {
        C10315b4() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                ChatActivityNew.this.f27916q3.dismiss();
                ChatActivityNew.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$c */
    class C10316c implements OnClickListener {
        C10316c() {
        }

        public void onClick(View view) {
            if (ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew.this.m48015a(0, 3, false);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$c0 */
    class C10317c0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28004a;

        /* renamed from: b */
        final /* synthetic */ Builder f28005b;

        C10317c0(boolean z, Builder builder) {
            this.f28004a = z;
            this.f28005b = builder;
        }

        /* renamed from: a */
        public /* synthetic */ void mo37694a(int i, int i2) {
            ChatActivityNew.this.f27888l5.setPadding(20, i, i2, ChatActivityNew.this.f27809Y3.getHeight());
        }

        public void run() {
            try {
                Drawable drawable = ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_tracking_pin_pickup_new);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_car).getIntrinsicWidth();
                ChatActivityNew.this.f27809Y3.post(new C10483c(this, intrinsicHeight, intrinsicWidth));
                if (this.f28004a) {
                    ChatActivityNew.this.f27888l5.animateCamera(CameraUpdateFactory.newLatLngBounds(this.f28005b.build(), 0), 500, null);
                } else {
                    ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f28005b.build(), 100));
                }
            } catch (Exception e) {
                if (ChatActivityNew.this.f27888l5 != null) {
                    ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                }
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$c1 */
    class C10318c1 implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ boolean f28007a;

        /* renamed from: b */
        final /* synthetic */ View[] f28008b;

        C10318c1(boolean z, View[] viewArr) {
            this.f28007a = z;
            this.f28008b = viewArr;
        }

        public void onAnimationEnd(Animation animation) {
            if (!this.f28007a) {
                int i = 0;
                while (true) {
                    View[] viewArr = this.f28008b;
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
            if (this.f28007a) {
                int i = 0;
                while (true) {
                    View[] viewArr = this.f28008b;
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

    /* renamed from: com.mrsool.chat.ChatActivityNew$c2 */
    class C10319c2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28009a;

        C10319c2(Dialog dialog) {
            this.f28009a = dialog;
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48220k0();
            this.f28009a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$c3 */
    class C10320c3 implements Callback<DefaultBeanUrl> {

        /* renamed from: a */
        final /* synthetic */ String f28011a;

        /* renamed from: b */
        final /* synthetic */ messages f28012b;

        /* renamed from: c */
        final /* synthetic */ String f28013c;

        C10320c3(String str, messages messages, String str2) {
            this.f28011a = str;
            this.f28012b = messages;
            this.f28013c = str2;
        }

        public void onFailure(Call<DefaultBeanUrl> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23475F(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<DefaultBeanUrl> call, Response<DefaultBeanUrl> response) {
            String str;
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        if (response.isSuccessful()) {
                            if (((DefaultBeanUrl) response.body()).getCode() <= 300) {
                                int i = 0;
                                while (true) {
                                    str = "";
                                    if (i >= ChatActivityNew.this.f27795W1.size()) {
                                        break;
                                    }
                                    messages messages = (messages) ChatActivityNew.this.f27795W1.get(i);
                                    ChatActivityNew chatActivityNew = ChatActivityNew.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(messages.getiFromUserId());
                                    if (chatActivityNew.m48320t(sb.toString()) && messages.getId().equalsIgnoreCase(this.f28011a)) {
                                        messages.setAudioState(AUDIO_STATE.IDLE.ordinal());
                                        messages.setSent2Server(true);
                                        ChatActivityNew.this.f27795W1.set(i, messages);
                                        this.f28012b.setTxContent(((DefaultBeanUrl) response.body()).getUrl());
                                        C11694e eVar = C11694e.INSTANCE;
                                        messages messages2 = this.f28012b;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(this.f28013c);
                                        sb2.append("@");
                                        sb2.append(C11694e.SERVICE);
                                        eVar.mo40195a(messages2, sb2.toString());
                                        ChatActivityNew.this.f29642a.mo23549a(ChatActivityNew.this.f27962x0);
                                        ChatActivityNew.this.f27801X1.mo7337d(i);
                                    }
                                    i++;
                                }
                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                if (!TextUtils.isEmpty(a)) {
                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                }
                                if (ChatActivityNew.this.f27855g2) {
                                    ChatActivityNew.this.m48210j1();
                                }
                            } else if (((DefaultBeanUrl) response.body()).getCode() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finishActivity();
                                }
                            } else {
                                ChatActivityNew.this.m47876E(this.f28011a);
                            }
                        } else if (ChatActivityNew.this.f29642a != null) {
                            ChatActivityNew.this.f29642a.mo23475F(response.message());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$c4 */
    class C10321c4 implements AnimationListener {
        C10321c4() {
        }

        public void onAnimationEnd(Animation animation) {
            ChatActivityNew.this.f27815Z3.setVisibility(8);
            ChatActivityNew.this.f27815Z3.setAlpha(1.0f);
            ChatActivityNew.this.f27815Z3.setTranslationY(0.0f);
            ChatActivityNew.this.f27905o4.setVisibility(8);
            ChatActivityNew.this.f27809Y3.setTranslationY(0.0f);
            ChatActivityNew.this.f27905o4.setTranslationY(0.0f);
            ChatActivityNew.this.f27821a4.setTranslationY(0.0f);
            RecyclerView recyclerView = ChatActivityNew.this.f27962x0;
            recyclerView.scrollToPosition(recyclerView.getAdapter().mo7325b() - 1);
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48070a(true, chatActivityNew.f27962x0, chatActivityNew.f27727K5);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48069a(false, (View) chatActivityNew.f27821a4);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d */
    class C10322d implements OnClickListener {
        C10322d() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48197i0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d0 */
    class C10323d0 implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ String f28017a;

        /* renamed from: b */
        final /* synthetic */ boolean f28018b;

        C10323d0(String str, boolean z) {
            this.f28017a = str;
            this.f28018b = z;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                if (!response.isSuccessful()) {
                    ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                } else if (((DefaultBean) response.body()).getCode().intValue() >= 300) {
                    ChatActivityNew.this.f29642a.mo23615f(((DefaultBean) response.body()).getMessage(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                } else if (this.f28017a.equalsIgnoreCase(C11644i.f33457y3)) {
                    ChatActivityNew.this.m48334u2();
                    ChatActivityNew.this.m48277p(true);
                    ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_start_tracking, false);
                    if (this.f28018b && ChatActivityNew.this.f29642a.mo23502X()) {
                        ChatActivityNew.this.mo37650Q();
                    }
                } else {
                    ChatActivityNew.this.mo37669e(false);
                    ChatActivityNew.this.m48277p(false);
                    if (ChatActivityNew.this.f29642a.mo23650p0()) {
                        ChatActivityNew.this.m48361x2();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d1 */
    class C10324d1 implements C11673d {

        /* renamed from: com.mrsool.chat.ChatActivityNew$d1$a */
        class C10325a implements OnMapReadyCallback {
            C10325a() {
            }

            public void onMapReady(GoogleMap googleMap) {
                if (C0841b.m4916a((Context) ChatActivityNew.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) ChatActivityNew.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    ChatActivityNew chatActivityNew = ChatActivityNew.this;
                    chatActivityNew.f27888l5 = chatActivityNew.f29642a.mo23514a(googleMap, chatActivityNew.f27894m5, true, true);
                    ChatActivityNew.this.f27888l5.getUiSettings().setMapToolbarEnabled(true);
                    ChatActivityNew.this.f27888l5.setMyLocationEnabled(false);
                    ChatActivityNew.this.f27888l5.getUiSettings().setMyLocationButtonEnabled(false);
                    ChatActivityNew.this.f27888l5.setTrafficEnabled(true);
                    ChatActivityNew.this.f27888l5.setMaxZoomPreference(ChatActivityNew.this.f27834c5);
                    ChatActivityNew.this.m47915K0();
                }
            }
        }

        C10324d1() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            try {
                C1382h supportFragmentManager = ChatActivityNew.this.getSupportFragmentManager();
                ChatActivityNew.this.f27894m5 = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
                if (ChatActivityNew.this.f27894m5 == null) {
                    ChatActivityNew.this.f27894m5 = SupportMapFragment.newInstance();
                    supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, ChatActivityNew.this.f27894m5).mo6100f();
                }
                if (ChatActivityNew.this.f27888l5 == null && ChatActivityNew.this.f29642a.mo23502X() && ChatActivityNew.this.f29642a.mo23500V()) {
                    ChatActivityNew.this.f27894m5.getMapAsync(new C10325a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d2 */
    class C10326d2 implements Runnable {
        C10326d2() {
        }

        public void run() {
            if (ChatActivityNew.this.f27720J4 != null) {
                ChatActivityNew.this.f27720J4.setVisible(false);
            }
            ChatActivityNew.this.m48357x0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d3 */
    class C10327d3 implements Callback<DefaultBeanUrl> {

        /* renamed from: a */
        final /* synthetic */ String f28023a;

        /* renamed from: b */
        final /* synthetic */ messages f28024b;

        /* renamed from: c */
        final /* synthetic */ String f28025c;

        C10327d3(String str, messages messages, String str2) {
            this.f28023a = str;
            this.f28024b = messages;
            this.f28025c = str2;
        }

        public void onFailure(Call<DefaultBeanUrl> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23475F(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<DefaultBeanUrl> call, Response<DefaultBeanUrl> response) {
            String str;
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        if (response.isSuccessful()) {
                            DefaultBeanUrl defaultBeanUrl = (DefaultBeanUrl) response.body();
                            if (defaultBeanUrl.getCode() <= 300) {
                                int i = 0;
                                while (true) {
                                    str = "";
                                    if (i >= ChatActivityNew.this.f27795W1.size()) {
                                        break;
                                    }
                                    messages messages = (messages) ChatActivityNew.this.f27795W1.get(i);
                                    ChatActivityNew chatActivityNew = ChatActivityNew.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(messages.getiFromUserId());
                                    if (chatActivityNew.m48320t(sb.toString()) && messages.getId().equalsIgnoreCase(this.f28023a)) {
                                        messages.setSent2Server(true);
                                        ChatActivityNew.this.f27795W1.set(i, messages);
                                        C11694e eVar = C11694e.INSTANCE;
                                        messages messages2 = this.f28024b;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(this.f28025c);
                                        sb2.append("@");
                                        sb2.append(C11694e.SERVICE);
                                        eVar.mo40195a(messages2, sb2.toString());
                                        ChatActivityNew.this.f29642a.mo23549a(ChatActivityNew.this.f27962x0);
                                        ChatActivityNew.this.f27801X1.mo7337d(i);
                                    }
                                    i++;
                                }
                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                if (!TextUtils.isEmpty(a)) {
                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                }
                                try {
                                    ChatActivityNew.this.m48062a(((DefaultBeanUrl) response.body()).getNoChatInOrder());
                                } catch (Exception unused) {
                                }
                            } else if (((DefaultBeanUrl) response.body()).getCode() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finishActivity();
                                }
                            } else if (ChatActivityNew.this.f29642a != null) {
                                ChatActivityNew.this.f29642a.mo23475F(defaultBeanUrl.getMessage());
                            }
                        } else if (ChatActivityNew.this.f29642a != null) {
                            ChatActivityNew.this.f29642a.mo23475F(response.message());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$d4 */
    class C10328d4 implements OnClickListener {
        C10328d4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48253n(false);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e */
    class C10329e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28028a;

        C10329e(Dialog dialog) {
            this.f28028a = dialog;
        }

        public void onClick(View view) {
            this.f28028a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e0 */
    class C10330e0 implements Callback<CancelReasonMainBean> {
        C10330e0() {
        }

        public void onFailure(Call<CancelReasonMainBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    ChatActivityNew.this.f29642a.mo23653q0();
                }
            }
        }

        public void onResponse(Call<CancelReasonMainBean> call, Response<CancelReasonMainBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f27667A5 = (CancelReasonMainBean) response.body();
                        if (((CancelReasonMainBean) response.body()).getCode() < 300) {
                            ChatActivityNew chatActivityNew = ChatActivityNew.this;
                            chatActivityNew.m48031a(chatActivityNew.f27667A5, 3);
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("", a));
                                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                                chatActivityNew2.f29642a.mo23553a((C11056p) chatActivityNew2);
                                return;
                            }
                            return;
                        }
                        ChatActivityNew.this.f29642a.mo23615f(((CancelReasonMainBean) response.body()).getMessage(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                        return;
                    }
                    ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e1 */
    class C10331e1 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28031a;

        C10331e1(Dialog dialog) {
            this.f28031a = dialog;
        }

        public void onClick(View view) {
            this.f28031a.dismiss();
            if (ChatActivityNew.this.f27888l5 != null) {
                ChatActivityNew.this.f27888l5.setMapType(2);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e2 */
    class C10332e2 implements TextWatcher {
        C10332e2() {
        }

        public void afterTextChanged(Editable editable) {
            if (!ChatActivityNew.this.f27703G5) {
                C5880q.m25751b("TYPING Composing...");
                C11694e.m52677u().mo40199a(ChatState.composing, ChatActivityNew.this.m47945Q0(), C11713f.COMPOSING.ordinal());
                ChatActivityNew.this.f27703G5 = true;
                ChatActivityNew.this.m48373z(true);
            }
            ChatActivityNew.this.m47859B2();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ChatActivityNew.this.m48072a0();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C11694e.INSTANCE.mo40213h()) {
                ChatActivityNew.this.m48174g(!TextUtils.isEmpty(charSequence.toString()));
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e3 */
    class C10333e3 implements Runnable {
        C10333e3() {
        }

        public void run() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.f29642a.mo23549a(chatActivityNew.f27962x0);
            ChatActivityNew.this.f27801X1.mo7337d(ChatActivityNew.this.f27795W1.size() - 1);
            ChatActivityNew.this.m48072a0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$e4 */
    class C10334e4 implements OnClickListener {
        C10334e4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.onBackPressed();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f */
    class C10335f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28037a;

        /* renamed from: b */
        final /* synthetic */ boolean f28038b;

        C10335f(Dialog dialog, boolean z) {
            this.f28037a = dialog;
            this.f28038b = z;
        }

        public void onClick(View view) {
            this.f28037a.dismiss();
            if (this.f28038b) {
                ChatActivityNew.this.finish();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f0 */
    class C10336f0 implements Callback<TrackingHistoryMainBean> {
        C10336f0() {
        }

        public void onFailure(Call<TrackingHistoryMainBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    ChatActivityNew.this.f29642a.mo23653q0();
                }
            }
        }

        public void onResponse(Call<TrackingHistoryMainBean> call, Response<TrackingHistoryMainBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (response.isSuccessful() && ((TrackingHistoryMainBean) response.body()).getCode().intValue() < 300 && ((TrackingHistoryMainBean) response.body()).getData() != null && ((TrackingHistoryMainBean) response.body()).getData().size() > 0) {
                        ChatActivityNew.this.f27819a2 = ((TrackingHistoryDataBean) ((TrackingHistoryMainBean) response.body()).getData().get(0)).getLocation_array();
                        ChatActivityNew.this.m47986Y();
                        String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("", a));
                            ChatActivityNew chatActivityNew = ChatActivityNew.this;
                            chatActivityNew.f29642a.mo23553a((C11056p) chatActivityNew);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f1 */
    class C10337f1 implements OnGlobalLayoutListener {

        /* renamed from: N */
        final /* synthetic */ int f28040N;

        /* renamed from: a */
        final /* synthetic */ TextView f28042a;

        /* renamed from: b */
        final /* synthetic */ int f28043b;

        C10337f1(TextView textView, int i, int i2) {
            this.f28042a = textView;
            this.f28043b = i;
            this.f28040N = i2;
        }

        public void onGlobalLayout() {
            float f;
            float f2;
            this.f28042a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Paint paint = new Paint(this.f28042a.getPaint());
            if (this.f28042a.getText().toString().isEmpty()) {
                f = paint.measureText(this.f28042a.getHint().toString());
            } else {
                f = paint.measureText(this.f28042a.getText().toString());
            }
            float width = (float) this.f28042a.getWidth();
            int maxLines = this.f28042a.getMaxLines();
            while (width > 0.0f && f / ((float) maxLines) > width - ((float) (this.f28042a.getCompoundDrawablePadding() + this.f28043b))) {
                float textSize = paint.getTextSize();
                paint.setTextSize(textSize - 1.0f);
                if (this.f28042a.getText().toString().isEmpty()) {
                    f2 = paint.measureText(this.f28042a.getHint().toString());
                } else {
                    f2 = paint.measureText(this.f28042a.getText().toString());
                }
                if (textSize < TypedValue.applyDimension(2, (float) this.f28040N, ChatActivityNew.this.getResources().getDisplayMetrics())) {
                    break;
                }
                f = f2;
            }
            this.f28042a.setTextSize(0, paint.getTextSize());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f2 */
    class C10338f2 extends TimerTask {
        C10338f2() {
        }

        public void run() {
            ChatActivityNew.this.f27703G5 = false;
            C5880q.m25751b("TYPING Paused");
            C11694e.m52677u().mo40199a(ChatState.paused, ChatActivityNew.this.m47945Q0(), C11713f.COMPOSING_PAUSED.ordinal());
            if (ChatActivityNew.this.f27781T5 != null) {
                ChatActivityNew.this.f27781T5.cancel();
                ChatActivityNew.this.f27781T5 = null;
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f3 */
    class C10339f3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28046a;

        /* renamed from: b */
        final /* synthetic */ boolean f28047b;

        C10339f3(Dialog dialog, boolean z) {
            this.f28046a = dialog;
            this.f28047b = z;
        }

        public void onClick(View view) {
            this.f28046a.dismiss();
            ChatActivityNew.this.f29642a.mo23468C().mo23448a(C11644i.f33175Q5, Boolean.valueOf(true));
            if (ChatActivityNew.this.f27855g2) {
                ChatActivityNew.this.m47868D(C11644i.f33181R3);
                ChatActivityNew.this.m47868D(C11644i.f33205U3);
            } else {
                ChatActivityNew.this.m47868D(C11644i.f33189S3);
                ChatActivityNew.this.m47868D(C11644i.f33197T3);
            }
            if (this.f28047b) {
                ChatActivityNew.this.onBackPressed();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$f4 */
    class C10340f4 extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f28048R;

        C10340f4(ImageView imageView, ImageView imageView2) {
            this.f28048R = imageView2;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            Resources resources = ChatActivityNew.this.getResources();
            C5887x xVar = ChatActivityNew.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            this.f28048R.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g */
    class C10341g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28050a;

        C10341g(Dialog dialog) {
            this.f28050a = dialog;
        }

        public void onClick(View view) {
            this.f28050a.dismiss();
            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33189S3);
            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33197T3);
            ChatActivityNew.this.finish();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g0 */
    class C10342g0 implements Runnable {
        C10342g0() {
        }

        public void run() {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew.this.f27874j3 = true;
                try {
                    if (ChatActivityNew.this.f27720J4 != null && ChatActivityNew.this.f27888l5 != null) {
                        ChatActivityNew.this.f27720J4.setIcon(BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.ic_car));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g1 */
    class C10343g1 implements Callback<PaymentOptionsList> {
        C10343g1() {
        }

        public void onFailure(Call<PaymentOptionsList> call, Throwable th) {
            if (ChatActivityNew.this.f27950v2 != null) {
                ChatActivityNew.this.f27950v2.dismiss();
            }
        }

        public void onResponse(Call<PaymentOptionsList> call, Response<PaymentOptionsList> response) {
            if (!response.isSuccessful()) {
                ChatActivityNew.this.m48355x(false);
                ChatActivityNew.this.f29642a.mo23487L(response.message());
            } else if (((PaymentOptionsList) response.body()).getCode().intValue() <= 300) {
                ChatActivityNew.this.m48150e(((PaymentOptionsList) response.body()).getPaymentOptions());
            } else {
                ChatActivityNew.this.m48355x(false);
                ChatActivityNew.this.f29642a.mo23487L(((PaymentOptionsList) response.body()).getMessage());
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g2 */
    class C10344g2 extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ boolean f28054a;

        C10344g2(boolean z) {
            this.f28054a = z;
        }

        public void run() {
            C11694e.m52677u().mo40199a(ChatState.composing, ChatActivityNew.this.m47945Q0(), (this.f28054a ? C11713f.COMPOSING : C11713f.RECORDING).ordinal());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g3 */
    class C10345g3 implements OnDismissListener {
        C10345g3() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ChatActivityNew.this.m47932N1();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$g4 */
    class C10346g4 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28057a;

        C10346g4(Dialog dialog) {
            this.f28057a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28057a.dismiss();
                ChatActivityNew.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h */
    class C10347h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28059a;

        C10347h(Dialog dialog) {
            this.f28059a = dialog;
        }

        public void onClick(View view) {
            this.f28059a.dismiss();
            C11644i.f33250a0 = false;
            C5881v D = ChatActivityNew.this.f29642a.mo23470D();
            StringBuilder sb = new StringBuilder();
            sb.append("welcome_");
            sb.append(ChatActivityNew.this.f27825b2);
            D.mo23448a(sb.toString(), Boolean.valueOf(true));
            if (ChatActivityNew.this.m48109b1()) {
                ChatActivityNew.this.m47932N1();
            }
            if (ChatActivityNew.this.f27936t2 != null) {
                ChatActivityNew.this.f27936t2.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h0 */
    class C10348h0 implements Callback<ServiceManualDefaultBean> {
        C10348h0() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    ChatActivityNew.this.f29642a.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (!response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                    } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() < 300) {
                        if (ChatActivityNew.this.f27671B3 != null && ChatActivityNew.this.f27671B3.isShowing()) {
                            ChatActivityNew.this.f27671B3.dismiss();
                        }
                        String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("", a));
                            ChatActivityNew chatActivityNew = ChatActivityNew.this;
                            chatActivityNew.f29642a.mo23553a((C11056p) chatActivityNew);
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h1 */
    class C10349h1 implements C11124o {

        /* renamed from: a */
        final /* synthetic */ List f28062a;

        C10349h1(List list) {
            this.f28062a = list;
        }

        /* renamed from: a */
        public void mo37723a() {
        }

        /* renamed from: a */
        public void mo37724a(int i) {
            if (((PaymentListBean) this.f28062a.get(i)).getCode().equalsIgnoreCase("credit_card")) {
                ChatActivityNew.this.m48355x(true);
                ChatActivityNew.this.m48135d(((PaymentListBean) this.f28062a.get(0)).getCode(), C11645a.f33473e);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h2 */
    class C10350h2 implements Callback<ChatInitModel> {
        C10350h2() {
        }

        public void onFailure(Call<ChatInitModel> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    try {
                        chatActivityNew.f27811Y5 = false;
                        ChatActivityNew.this.f27805X5 = false;
                        ChatActivityNew.this.f27928s1.setVisibility(8);
                        ChatActivityNew.this.f29642a.mo23492O();
                        ChatActivityNew.this.f29642a.mo23653q0();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<ChatInitModel> call, Response<ChatInitModel> response) {
            String str = "";
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        C11644i.f33201U = true;
                        xVar.mo23492O();
                        if (!response.isSuccessful()) {
                            ChatActivityNew.this.f27928s1.setVisibility(8);
                            if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null || ChatActivityNew.this.isFinishing())) {
                                ChatActivityNew.this.f27928s1.setVisibility(8);
                                ChatActivityNew.this.f29642a.mo23492O();
                                ChatActivityNew.this.mo37664a(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name), true);
                            }
                        } else if (((ChatInitModel) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                            return;
                        } else {
                            ChatActivityNew.this.f27727K5.setVisibility(8);
                            ChatActivityNew.this.f27860h1.setEnabled(true);
                            ChatActivityNew.this.f27727K5.mo38325b(true);
                            ChatActivityNew.this.m48206j(false);
                            ChatActivityNew.this.f27948v0.setVisibility(0);
                            ChatInitModel chatInitModel = (ChatInitModel) response.body();
                            if (chatInitModel.getCode().intValue() <= 300) {
                                ChatActivityNew.this.f27929s2 = (ChatInitModel) response.body();
                                ChatActivityNew.this.f27795W1.clear();
                                ChatActivityNew.f27655C6 = ChatActivityNew.this.f27929s2.getOrder().getiOrderId();
                                if (!(ChatActivityNew.this.f27929s2.getOrder() == null || ChatActivityNew.this.f27929s2.getOrder().getiOrderId() == null)) {
                                    C11644i.f33194T0 = String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId());
                                }
                                ChatActivityNew.this.f27855g2 = String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiBuyerId()).equalsIgnoreCase(ChatActivityNew.this.f29642a.mo23476G());
                                ChatActivityNew.this.f27743N3 = ChatActivityNew.this.f27929s2.getOrder().getvShopType().equalsIgnoreCase(C11644i.f33247Z5);
                                ChatActivityNew.this.f27767R3 = OptionMenuItemsBean.getMenu(ChatActivityNew.this.f27855g2, ChatActivityNew.this);
                                ChatActivityNew.this.m47973V1();
                                ChatActivityNew.this.f27896n1.setVisibility(8);
                                if (!ChatActivityNew.this.f27811Y5) {
                                    ChatActivityNew.this.f27727K5.mo38324a(ChatActivityNew.this.f27929s2.isEnableVoiceNote());
                                    if (ChatActivityNew.this.f27860h1.getText().length() > 0 && !ChatActivityNew.this.f27860h1.hasFocus()) {
                                        ChatActivityNew.this.f27860h1.requestFocus();
                                    }
                                }
                                boolean w1 = ChatActivityNew.this.f27855g2;
                                String str2 = C11644i.f33441w3;
                                String str3 = "delivered";
                                String str4 = C11644i.f33307g3;
                                String str5 = C11644i.f33298f3;
                                String str6 = C3868i.f12248b;
                                if (w1) {
                                    ChatActivityNew.this.f27726K4 = ChatActivityNew.this.f27929s2.getOrder().getiCourierId();
                                    ChatActivityNew.this.m48032a(ChatActivityNew.this.f27929s2, true);
                                    ChatActivityNew.this.f27882k5 = ChatActivityNew.this.f27929s2.getOrder_track().getTrack_channel_name();
                                    ChatActivityNew.this.f27866i1.setVisibility(8);
                                    ChatActivityNew.this.f27727K5.setVisibility(0);
                                    ChatActivityNew.this.f27741N1.setText(ChatActivityNew.this.getString(C10232R.string.lbl_cancel_order));
                                    boolean equalsIgnoreCase = ChatActivityNew.this.f27929s2.getOffer_issue().equalsIgnoreCase(C11644i.f33271c3);
                                    String str7 = C11644i.f33316h3;
                                    if (equalsIgnoreCase) {
                                        ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4);
                                        String str8 = ChatActivityNew.this.f27929s2.getOrder().getvStatus();
                                        char c = 65535;
                                        int hashCode = str8.hashCode();
                                        if (hashCode != -1367724422) {
                                            if (hashCode != -1309235419) {
                                                if (hashCode == -682587753) {
                                                    if (str8.equals(str4)) {
                                                        c = 1;
                                                    }
                                                }
                                            } else if (str8.equals(str7)) {
                                                c = 2;
                                            }
                                        } else if (str8.equals(str5)) {
                                            c = 0;
                                        }
                                        if (c == 0) {
                                            ChatActivityNew.this.m47895H(str5);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_file_a_compaint, true);
                                        } else if (c != 1) {
                                            if (c == 2) {
                                                ChatActivityNew.this.m47895H(str7);
                                            }
                                        } else if (ChatActivityNew.this.f27929s2.isChangePayOption()) {
                                            ChatActivityNew.this.mo37666c(false);
                                        }
                                    } else if (ChatActivityNew.this.f27929s2.getOffer_issue().equalsIgnoreCase(C11644i.f33289e3)) {
                                        String str9 = ChatActivityNew.this.f27929s2.getOrder().getvStatus();
                                        char c2 = 65535;
                                        switch (str9.hashCode()) {
                                            case -1367724422:
                                                if (str9.equals(str5)) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                break;
                                            case -1309235419:
                                                if (str9.equals(str7)) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                break;
                                            case -575131179:
                                                if (str9.equals(C11644i.f33325i3)) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                break;
                                            case -242327420:
                                                if (str9.equals(str3)) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                break;
                                            case 355903494:
                                                if (str9.equals(C11644i.f33343k3)) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                break;
                                        }
                                        if (c2 == 0) {
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1, ChatActivityNew.this.f27727K5);
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27866i1);
                                            ChatActivityNew.this.m48206j(true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_file_a_compaint, true);
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            ChatActivityNew.this.m47911J1();
                                            ChatActivityNew.this.m47988Y0();
                                            ChatActivityNew.this.m48283p2();
                                            TextView h2 = ChatActivityNew.this.f27845e4;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str);
                                            sb.append(String.format(ChatActivityNew.this.getResources().getString(C10232R.string.lbl_distance_away), new Object[]{String.format("%.2f", new Object[]{Double.valueOf(Double.parseDouble(ChatActivityNew.this.f27929s2.getOrder().getDistance_courier_shop()) + Double.parseDouble(ChatActivityNew.this.f27929s2.getOrder().getDistance_shop_buyer()))})}));
                                            h2.setText(sb.toString());
                                            TextView i2 = ChatActivityNew.this.f27728L0;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str);
                                            sb2.append(String.format(ChatActivityNew.this.getResources().getString(C10232R.string.lbl_distance_value), new Object[]{String.format("%.2f", new Object[]{Double.valueOf(Double.parseDouble(ChatActivityNew.this.f27929s2.getOrder().getDistance_courier_shop()) + Double.parseDouble(ChatActivityNew.this.f27929s2.getOrder().getDistance_shop_buyer()))})}));
                                            i2.setText(sb2.toString());
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_start_tracking, false);
                                            if (ChatActivityNew.this.f27929s2.getOrder_track().getBuyer_show_track_bar().booleanValue()) {
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27797W3);
                                                if (ChatActivityNew.this.f27905o4.getVisibility() == 8) {
                                                    ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27809Y3);
                                                } else {
                                                    ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27809Y3);
                                                }
                                                ChatActivityNew.this.mo37669e(true);
                                            } else {
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27809Y3, ChatActivityNew.this.f27797W3);
                                                ChatActivityNew.this.mo37669e(false);
                                            }
                                            if (ChatActivityNew.this.f27815Z3.getVisibility() == 0) {
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3);
                                            }
                                            ChatActivityNew.this.m48297r(15);
                                        } else if (c2 == 1) {
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1, ChatActivityNew.this.f27727K5);
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27866i1);
                                            ChatActivityNew.this.m48206j(true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_file_a_compaint, true);
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            ChatActivityNew.this.m47911J1();
                                            ChatActivityNew.this.m47988Y0();
                                            ChatActivityNew.this.m48283p2();
                                            if (ChatActivityNew.this.f27929s2.getOrder_track().getBuyer_show_track_bar().booleanValue()) {
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27797W3);
                                                if (ChatActivityNew.this.f27905o4.getVisibility() == 8) {
                                                    ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27809Y3);
                                                } else {
                                                    ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27809Y3);
                                                }
                                                ChatActivityNew.this.mo37669e(true);
                                            } else {
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27809Y3, ChatActivityNew.this.f27797W3);
                                                ChatActivityNew.this.mo37669e(false);
                                            }
                                            ChatActivityNew.this.m48143d2();
                                            if (!(ChatActivityNew.this.f27929s2.getOrderBill() == null || ChatActivityNew.this.f27929s2.getOrderBill().getvStatus() == null || !ChatActivityNew.this.f27929s2.getOrderBill().getvStatus().equalsIgnoreCase(str2))) {
                                                TextView l2 = ChatActivityNew.this.f27683D3;
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbOrderCost());
                                                sb3.append(str6);
                                                sb3.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                l2.setText(sb3.toString());
                                                TextView m2 = ChatActivityNew.this.f27689E3;
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbDeliveryCost());
                                                sb4.append(str6);
                                                sb4.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                m2.setText(sb4.toString());
                                                TextView n2 = ChatActivityNew.this.f27695F3;
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb5.append(str6);
                                                sb5.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                n2.setText(sb5.toString());
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27707H3, ChatActivityNew.this.f27890m1, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1);
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27902o1);
                                                ChatActivityNew.this.m48297r(60);
                                            }
                                            ChatActivityNew.this.m48297r(60);
                                            if (ChatActivityNew.this.f27815Z3.getVisibility() == 0) {
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3);
                                            }
                                        } else if (c2 == 2) {
                                            ChatActivityNew.this.m47895H(str5);
                                        } else if (c2 == 3) {
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1, ChatActivityNew.this.f27809Y3);
                                            ChatActivityNew.this.m48206j(true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_change_courier, false);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_cancel_order, false);
                                            ChatActivityNew.this.f27845e4.setText(C10232R.string.lbl_order_delivered);
                                            if (!(ChatActivityNew.this.f27929s2.getOrderBill() == null || ChatActivityNew.this.f27929s2.getOrderBill().getvStatus() == null || !ChatActivityNew.this.f27929s2.getOrderBill().getvStatus().equalsIgnoreCase(str2))) {
                                                TextView l22 = ChatActivityNew.this.f27683D3;
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbOrderCost());
                                                sb6.append(str6);
                                                sb6.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                l22.setText(sb6.toString());
                                                TextView m22 = ChatActivityNew.this.f27689E3;
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbDeliveryCost());
                                                sb7.append(str6);
                                                sb7.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                m22.setText(sb7.toString());
                                                TextView n22 = ChatActivityNew.this.f27695F3;
                                                StringBuilder sb8 = new StringBuilder();
                                                sb8.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb8.append(str6);
                                                sb8.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                n22.setText(sb8.toString());
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27902o1);
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27890m1, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1, ChatActivityNew.this.f27809Y3, ChatActivityNew.this.f27707H3);
                                            }
                                            if (ChatActivityNew.this.f27815Z3.getVisibility() == 0) {
                                                ChatActivityNew.this.m48236l2();
                                                ChatActivityNew.this.mo37669e(false);
                                            }
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27809Y3, ChatActivityNew.this.f27851f4);
                                            ChatActivityNew.this.f27851f4.setText(ChatActivityNew.this.getResources().getString(C10232R.string.lbl_track_it));
                                            if (!ChatActivityNew.this.f27929s2.getOrder().isUser_rated()) {
                                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                                if (!TextUtils.isEmpty(a)) {
                                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("from Rating", a));
                                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                                } else {
                                                    ChatActivityNew.this.m48241m(false);
                                                }
                                            } else if (!(ChatActivityNew.this.f27929s2.getServiceManual() == null || ChatActivityNew.this.f27929s2.getServiceManual().getManualIds() == null || TextUtils.isEmpty(ChatActivityNew.this.f27929s2.getServiceManual().getManualIds()))) {
                                                String a2 = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                                if (!TextUtils.isEmpty(a2)) {
                                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("from Rating", a2));
                                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                                }
                                            }
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            ChatActivityNew.this.m48223k2();
                                        } else if (c2 == 4) {
                                            ChatActivityNew.this.m47895H(str7);
                                        }
                                    }
                                    if (ChatActivityNew.this.f27929s2.getHide_withdraw_cancel_courier().intValue() == 1) {
                                        ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_change_courier, false);
                                    }
                                    if (!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str3) || ChatActivityNew.this.f27929s2.getOrder().isUser_rated()) {
                                        ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_rate_the_courier, false);
                                    } else {
                                        ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_rate_the_courier, true);
                                    }
                                    ChatActivityNew.this.m47956S0();
                                    String a3 = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                    if (!TextUtils.isEmpty(a3) && !ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str3)) {
                                        ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("from chat", a3));
                                        ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                    }
                                    ChatActivityNew.this.m48156e2();
                                } else {
                                    if (!TextUtils.isEmpty(ChatActivityNew.this.f27849f2) && ChatActivityNew.this.f27849f2.equalsIgnoreCase(str4) && (ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3) || ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3))) {
                                        ChatActivityNew.this.m48333u1();
                                    }
                                    ChatActivityNew.this.f27849f2 = ChatActivityNew.this.f27929s2.getOrder().getvStatus();
                                    ChatActivityNew.this.f27726K4 = ChatActivityNew.this.f29642a.mo23476G();
                                    ChatActivityNew.this.f27741N1.setText(ChatActivityNew.this.getString(C10232R.string.lbl_withdraw_offer));
                                    if (!ChatActivityNew.this.f27873j2) {
                                        ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27693F1);
                                    }
                                    ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27866i1, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4);
                                    ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27872j1, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27727K5, ChatActivityNew.this.f27747O1, ChatActivityNew.this.f27777T1);
                                    ChatActivityNew.this.m48032a(ChatActivityNew.this.f27929s2, false);
                                    if (ChatActivityNew.this.f27929s2.getOffer_issue().equalsIgnoreCase(C11644i.f33271c3)) {
                                        ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27914q1, ChatActivityNew.this.f27806Y0);
                                        ChatActivityNew.this.f27861h2 = false;
                                        if (ChatActivityNew.this.f27929s2 != null && ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str5)) {
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27809Y3);
                                        } else if (ChatActivityNew.this.f27929s2 == null || ChatActivityNew.this.f27929s2.isCourier_pnotification()) {
                                            if (ChatActivityNew.this.f27929s2 != null && ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str4)) {
                                                ChatActivityNew.this.m48315s2();
                                            }
                                        }
                                        ChatActivityNew.this.mo37669e(false);
                                        ChatActivityNew.this.m48192h2();
                                    } else if (ChatActivityNew.this.f27929s2.getOffer_issue().equalsIgnoreCase(C11644i.f33289e3)) {
                                        String str10 = ChatActivityNew.this.f27929s2.getOrder().getvStatus();
                                        char c3 = 65535;
                                        switch (str10.hashCode()) {
                                            case -1367724422:
                                                if (str10.equals(str5)) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                break;
                                            case -682587753:
                                                if (str10.equals(str4)) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                break;
                                            case -575131179:
                                                if (str10.equals(C11644i.f33325i3)) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                break;
                                            case -242327420:
                                                if (str10.equals(str3)) {
                                                    c3 = 4;
                                                    break;
                                                }
                                                break;
                                            case 355903494:
                                                if (str10.equals(C11644i.f33343k3)) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                break;
                                        }
                                        if (c3 == 0) {
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27727K5);
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27866i1, ChatActivityNew.this.f27809Y3);
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27797W3);
                                            ChatActivityNew.this.m48206j(true);
                                            ChatActivityNew.this.m48283p2();
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            ChatActivityNew.this.m47911J1();
                                            ChatActivityNew.this.m47988Y0();
                                            ChatActivityNew.this.m48343v2();
                                            ChatActivityNew.this.m48202i2();
                                            ChatActivityNew.this.m48169f2();
                                        } else if (c3 == 1) {
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27821a4, ChatActivityNew.this.f27727K5);
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27866i1, ChatActivityNew.this.f27809Y3);
                                            ChatActivityNew.this.m48206j(true);
                                            ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27797W3);
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            ChatActivityNew.this.m47911J1();
                                            ChatActivityNew.this.m48283p2();
                                            ChatActivityNew.this.m47988Y0();
                                            if (!(ChatActivityNew.this.f27929s2.getOrderBill() == null || ChatActivityNew.this.f27929s2.getOrderBill().getvStatus() == null || !ChatActivityNew.this.f27929s2.getOrderBill().getvStatus().equalsIgnoreCase(str2))) {
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27890m1, ChatActivityNew.this.f27902o1, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27803X3);
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27896n1);
                                                TextView v = ChatActivityNew.this.f27704H0;
                                                StringBuilder sb9 = new StringBuilder();
                                                sb9.append(str);
                                                sb9.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb9.append(str6);
                                                sb9.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                v.setText(sb9.toString());
                                                ChatActivityNew.this.f27710I0.setText(ChatActivityNew.this.getString(C10232R.string.lbl_bill_accepted));
                                                ChatActivityNew.this.f27698G0.setText(ChatActivityNew.this.getString(C10232R.string.lbl_total_cost1));
                                                TextView y = ChatActivityNew.this.f27692F0;
                                                StringBuilder sb10 = new StringBuilder();
                                                sb10.append(str);
                                                sb10.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb10.append(str6);
                                                sb10.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                y.setText(sb10.toString());
                                                ChatActivityNew.this.m48181g2();
                                                ChatActivityNew.this.m48017a((int) C10232R.C10236id.action_issue_bill, ChatActivityNew.this.getString(C10232R.string.lbl_change_bill));
                                            }
                                            ChatActivityNew.this.m48343v2();
                                            ChatActivityNew.this.m48202i2();
                                            if (ChatActivityNew.this.f27929s2.isPaid()) {
                                                ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_issue_bill, false);
                                            }
                                            ChatActivityNew.this.m48169f2();
                                        } else if (c3 == 2) {
                                            ChatActivityNew.this.f27806Y0.setVisibility(8);
                                            ChatActivityNew.this.f27878k1.setVisibility(8);
                                            ChatActivityNew.this.mo37669e(false);
                                            if (ChatActivityNew.this.f27929s2.isCourier_pnotification()) {
                                                if (ChatActivityNew.this.f27929s2.getOrderOffer().getvStatus().equalsIgnoreCase(C11644i.f33352l3)) {
                                                    ChatActivityNew.this.f27727K5.setVisibility(8);
                                                    ChatActivityNew.this.f27866i1.setVisibility(0);
                                                    if (ChatActivityNew.this.f27929s2 != null && ChatActivityNew.this.f27929s2.getCourierCancel().intValue() == 1) {
                                                        ChatActivityNew.this.m48363y(ChatActivityNew.this.f27929s2.getCourierCancelMessage());
                                                    }
                                                } else if (ChatActivityNew.this.f27929s2.getOrderOffer().getvStatus().equalsIgnoreCase("Offer pending")) {
                                                    TextView y2 = ChatActivityNew.this.f27692F0;
                                                    StringBuilder sb11 = new StringBuilder();
                                                    sb11.append(str6);
                                                    sb11.append(ChatActivityNew.this.f27929s2.getOrderOffer().getDbDeliveryCost_txt());
                                                    y2.setText(sb11.toString());
                                                    ChatActivityNew.this.f27866i1.setVisibility(8);
                                                    ChatActivityNew.this.m48161f(ChatActivityNew.this.f27929s2.getOrderOffer().getDbDeliveryCost_txt(), ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_text());
                                                    ChatActivityNew.this.f27885l2 = true;
                                                    ChatActivityNew.this.supportInvalidateOptionsMenu();
                                                }
                                            }
                                        } else if (c3 == 3) {
                                            ChatActivityNew.this.mo37669e(false);
                                            ChatActivityNew.this.f27866i1.setVisibility(8);
                                            ChatActivityNew.this.f27727K5.setVisibility(0);
                                        } else if (c3 == 4) {
                                            ChatActivityNew.this.f27785U3.setVisibility(0);
                                            ChatActivityNew.this.f27821a4.setVisibility(0);
                                            ChatActivityNew.this.f27866i1.setVisibility(8);
                                            ChatActivityNew.this.f27878k1.setVisibility(0);
                                            ChatActivityNew.this.f27727K5.setVisibility(0);
                                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27797W3);
                                            ChatActivityNew.this.m48206j(false);
                                            ChatActivityNew.this.m48229l(ChatActivityNew.this.f27825b2);
                                            if (!(ChatActivityNew.this.f27929s2.getOrderBill() == null || ChatActivityNew.this.f27929s2.getOrderBill() == null || ChatActivityNew.this.f27929s2.getOrderBill().getvStatus() == null || !ChatActivityNew.this.f27929s2.getOrderBill().getvStatus().equalsIgnoreCase(str2))) {
                                                ChatActivityNew.this.m48019a(0, ChatActivityNew.this.f27878k1, ChatActivityNew.this.f27902o1);
                                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27890m1, ChatActivityNew.this.f27902o1, ChatActivityNew.this.f27896n1, ChatActivityNew.this.f27803X3);
                                                TextView v2 = ChatActivityNew.this.f27704H0;
                                                StringBuilder sb12 = new StringBuilder();
                                                sb12.append(str);
                                                sb12.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb12.append(str6);
                                                sb12.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                v2.setText(sb12.toString());
                                                ChatActivityNew.this.f27710I0.setText(ChatActivityNew.this.getString(C10232R.string.lbl_bill_accepted));
                                                ChatActivityNew.this.m48017a((int) C10232R.C10236id.action_issue_bill, ChatActivityNew.this.getString(C10232R.string.lbl_change_bill));
                                                TextView y3 = ChatActivityNew.this.f27692F0;
                                                StringBuilder sb13 = new StringBuilder();
                                                sb13.append(str);
                                                sb13.append(ChatActivityNew.this.f27929s2.getOrderBill().getDbTotalCost());
                                                sb13.append(str6);
                                                sb13.append(ChatActivityNew.this.f27929s2.getOrder().getCurrency());
                                                y3.setText(sb13.toString());
                                                ChatActivityNew.this.f27698G0.setText(ChatActivityNew.this.getString(C10232R.string.lbl_total_cost1));
                                            }
                                            if (!ChatActivityNew.this.f27929s2.getOrder().isUser_rated()) {
                                                ChatActivityNew.this.m48241m(false);
                                            }
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_share_location, true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_Choose_Photo, true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_file_a_compaint, true);
                                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_start_tracking, false);
                                        }
                                    }
                                    ChatActivityNew.this.m47932N1();
                                    if (!ChatActivityNew.this.m48077a2() && ChatActivityNew.this.f27929s2.getHide_withdraw_cancel_courier().intValue() == 1) {
                                        ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_withdraw_order, false);
                                    }
                                    ChatActivityNew.this.m48192h2();
                                    ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_cancel_order, false);
                                    ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_share_location, false);
                                    ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_change_courier, false);
                                    ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_rate_the_courier, false);
                                    StringBuilder sb14 = new StringBuilder();
                                    sb14.append("in api shouldShowCourierWelcomeMessage :");
                                    sb14.append(ChatActivityNew.this.f27737M3);
                                    sb14.append(",isAPicalled:");
                                    sb14.append(ChatActivityNew.this.f27749O3);
                                    C5880q.m25751b(sb14.toString());
                                    ChatActivityNew.this.f27749O3 = true;
                                    String a4 = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                    if (!TextUtils.isEmpty(a4)) {
                                        ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("from chat", a4));
                                        ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                    }
                                }
                                ChatActivityNew.this.m48156e2();
                                ChatActivityNew.this.m48244m0();
                                ChatActivityNew.this.f27795W1.clear();
                                if (ChatActivityNew.this.f27801X1 != null) {
                                    ChatActivityNew.this.f27801X1.mo37860c(ChatActivityNew.this.f27929s2.getHide_map_location().booleanValue());
                                }
                                ChatActivityNew.this.f27801X1.mo37857a(ChatActivityNew.this.f27929s2);
                                ChatActivityNew.this.f27795W1.addAll(ChatActivityNew.this.m47863C0());
                                ChatActivityNew.this.f29642a.mo23549a(ChatActivityNew.this.f27962x0);
                                ChatActivityNew.this.f27801X1.mo7341e();
                                ChatActivityNew.this.m48072a0();
                                ChatActivityNew.this.f27928s1.setVisibility(8);
                                ChatActivityNew.this.m47942P1();
                                ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_Choose_Photo, false);
                                C11644i.f33241Z = ChatActivityNew.this.f27929s2.getOrder().getvStatus();
                                ChatActivityNew.this.m47981X0();
                                MapsInitializer.initialize(ChatActivityNew.this.getApplicationContext());
                                ChatActivityNew.this.f27948v0.setVisibility(0);
                                ChatActivityNew.this.f27749O3 = true;
                            } else {
                                ChatActivityNew.this.f27928s1.setVisibility(8);
                                if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null || ChatActivityNew.this.isFinishing())) {
                                    ChatActivityNew.this.mo37664a(chatInitModel.getMessage() != null ? chatInitModel.getMessage() : str, ChatActivityNew.this.getString(C10232R.string.app_name), true);
                                }
                            }
                        }
                    } catch (Exception e) {
                        Exception exc = e;
                        C5887x xVar2 = ChatActivityNew.this.f29642a;
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(str);
                        sb15.append(exc.getMessage());
                        xVar2.mo23491N(sb15.toString());
                        exc.printStackTrace();
                    }
                    ChatActivityNew.this.f27811Y5 = false;
                    ChatActivityNew.this.f27805X5 = false;
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h3 */
    class C10351h3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28066a;

        /* renamed from: b */
        final /* synthetic */ boolean f28067b;

        C10351h3(Dialog dialog, boolean z) {
            this.f28066a = dialog;
            this.f28067b = z;
        }

        public void onClick(View view) {
            this.f28066a.dismiss();
            ChatActivityNew.this.f29642a.mo23468C().mo23448a(C11644i.f33167P5, Boolean.valueOf(true));
            if (ChatActivityNew.this.f27855g2) {
                ChatActivityNew.this.m47868D(C11644i.f33181R3);
                ChatActivityNew.this.m47868D(C11644i.f33205U3);
            } else {
                ChatActivityNew.this.m47868D(C11644i.f33189S3);
                ChatActivityNew.this.m47868D(C11644i.f33197T3);
            }
            if (this.f28067b) {
                ChatActivityNew.this.onBackPressed();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$h4 */
    class C10352h4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f28068a;

        C10352h4(TextView textView) {
            this.f28068a = textView;
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48026a(this.f28068a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i */
    class C10353i implements Runnable {
        C10353i() {
        }

        public void run() {
            ChatActivityNew.this.m48230l(true);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i0 */
    class C10354i0 implements Callback<CourierLastLocationMainBean> {
        C10354i0() {
        }

        public void onFailure(Call<CourierLastLocationMainBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    chatActivityNew.f27949v1.setVisibility(8);
                    ChatActivityNew.this.m47927M1();
                }
            }
        }

        public void onResponse(Call<CourierLastLocationMainBean> call, Response<CourierLastLocationMainBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    try {
                        chatActivityNew.f27949v1.setVisibility(8);
                        if (!response.isSuccessful()) {
                            ChatActivityNew.this.m47927M1();
                        } else if (((CourierLastLocationMainBean) response.body()).getCode().intValue() < 300) {
                            ChatActivityNew.this.f27850f3 = ((CourierLastLocationMainBean) response.body()).getCourierLastLocationBean();
                            if (ChatActivityNew.this.f27850f3 != null) {
                                ChatActivityNew.this.f27929s2.getOrder_track().setCourier_base_lat(ChatActivityNew.this.f27850f3.getLatitude());
                                ChatActivityNew.this.f27929s2.getOrder_track().setCourier_base_lng(ChatActivityNew.this.f27850f3.getLongitude());
                                ChatActivityNew.this.m47927M1();
                            } else {
                                ChatActivityNew.this.m47927M1();
                            }
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("", a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            }
                        } else {
                            ChatActivityNew.this.m47927M1();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i1 */
    class C10355i1 implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f28072a;

        C10355i1(String str) {
            this.f28072a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            ChatActivityNew.this.m48310s(false);
            if (ChatActivityNew.this.f27950v2 != null) {
                ChatActivityNew.this.f27950v2.dismiss();
            }
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (ChatActivityNew.this.f27950v2 != null) {
                ChatActivityNew.this.f27950v2.dismiss();
            }
            ChatActivityNew.this.m48355x(false);
            if (!response.isSuccessful()) {
                ChatActivityNew.this.m48310s(false);
                ChatActivityNew.this.f29642a.mo23487L(response.message());
            } else if (((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300) {
                PaymentHashBean paymentHash = ((PaymentStatusMainBean) response.body()).getPaymentHash();
                if (!C11645a.f33473e.equalsIgnoreCase(this.f28072a)) {
                    ChatActivityNew.this.m48143d2();
                } else if (paymentHash.isPaid()) {
                    ChatActivityNew.this.m48310s(false);
                } else if (!paymentHash.isPaid() && paymentHash.getPaymentStatus().equalsIgnoreCase(C11645a.f33471c)) {
                    ChatActivityNew.f27659G6 = ((PaymentStatusMainBean) response.body()).getPaymentHash().getData().getCheckoutId();
                    ChatActivityNew.this.m48034a((PaymentStatusMainBean) response.body());
                }
            } else {
                ChatActivityNew.this.m48310s(false);
                ChatActivityNew.this.f29642a.mo23487L(((PaymentStatusMainBean) response.body()).getMessage());
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i2 */
    class C10356i2 implements AnimationListener {
        C10356i2() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            ChatActivityNew.this.f27794W0.setVisibility(0);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i3 */
    class C10357i3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28075a;

        C10357i3(Dialog dialog) {
            this.f28075a = dialog;
        }

        public void onClick(View view) {
            this.f28075a.dismiss();
            ChatActivityNew.this.finishActivity();
            ChatActivityNew.this.f29642a.mo23468C().mo23448a(C11644i.f33159O5, Boolean.valueOf(true));
            if (ChatActivityNew.this.f29642a.mo23502X()) {
                C5887x.m25817f((Context) ChatActivityNew.this);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$i4 */
    class C10358i4 implements OnClickListener {
        C10358i4() {
        }

        public void onClick(View view) {
            if (ChatActivityNew.this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton() == null || !ChatActivityNew.this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton().booleanValue()) {
                ChatActivityNew.this.m48214k(0);
            } else if (ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew.this.m48015a(0, 3, true);
            }
            try {
                if (C11644i.f33437w) {
                    ChatActivityNew.this.f27676C2.mo39862a(String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), "", ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_id());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j */
    class C10359j extends BroadcastReceiver {

        /* renamed from: com.mrsool.chat.ChatActivityNew$j$a */
        class C10360a implements Runnable {
            C10360a() {
            }

            public void run() {
                C11644i.f33250a0 = false;
                ChatActivityNew.this.f27928s1.setVisibility(0);
                ChatActivityNew.this.f27755P3 = true;
                ChatActivityNew.this.f27799W5 = Boolean.valueOf(true);
                ChatActivityNew.this.mo37650Q();
            }
        }

        C10359j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0380, code lost:
            r9 = r8.f28078a;
            r9.f29642a.mo23549a(r9.f27962x0);
            com.mrsool.chat.ChatActivityNew.m47849A1(r8.f28078a).mo7341e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r9 = r10.getAction()
                int r0 = r9.hashCode()
                r1 = 2
                r2 = 8
                java.lang.String r3 = "refresh_chat_list"
                r4 = 0
                r5 = 1
                switch(r0) {
                    case -2094653058: goto L_0x00d9;
                    case -2009736763: goto L_0x00ce;
                    case -1766404204: goto L_0x00c3;
                    case -1464282144: goto L_0x00b8;
                    case -1419500238: goto L_0x00ad;
                    case -1268520472: goto L_0x00a3;
                    case -503466033: goto L_0x0099;
                    case -337314070: goto L_0x008f;
                    case -323942941: goto L_0x0084;
                    case -256366582: goto L_0x0079;
                    case 535417094: goto L_0x006e;
                    case 795085876: goto L_0x0063;
                    case 874986063: goto L_0x0057;
                    case 892312456: goto L_0x004b;
                    case 999354301: goto L_0x0040;
                    case 1348905776: goto L_0x0035;
                    case 1435953244: goto L_0x0029;
                    case 1603740865: goto L_0x0020;
                    case 2046320981: goto L_0x0014;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x00e4
            L_0x0014:
                java.lang.String r0 = "com.oppwa.mobile.connect.checkout.dialog.action.ACTION_ON_BEFORE_SUBMIT"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 17
                goto L_0x00e5
            L_0x0020:
                boolean r9 = r9.equals(r3)
                if (r9 == 0) goto L_0x00e4
                r9 = 4
                goto L_0x00e5
            L_0x0029:
                java.lang.String r0 = "broadcast_auto_start_track"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 11
                goto L_0x00e5
            L_0x0035:
                java.lang.String r0 = "broadcast_courier_confirm"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 6
                goto L_0x00e5
            L_0x0040:
                java.lang.String r0 = "seen_msg"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 2
                goto L_0x00e5
            L_0x004b:
                java.lang.String r0 = "broadcast_chatstatus"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 15
                goto L_0x00e5
            L_0x0057:
                java.lang.String r0 = "broadcast_internet_on_off"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 18
                goto L_0x00e5
            L_0x0063:
                java.lang.String r0 = "Message_got"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 0
                goto L_0x00e5
            L_0x006e:
                java.lang.String r0 = "broadcast_finish_chat"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 7
                goto L_0x00e5
            L_0x0079:
                java.lang.String r0 = "broadcast_background2ForGround"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 14
                goto L_0x00e5
            L_0x0084:
                java.lang.String r0 = "bill_issued"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 9
                goto L_0x00e5
            L_0x008f:
                java.lang.String r0 = "recipt_got"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 1
                goto L_0x00e5
            L_0x0099:
                java.lang.String r0 = "refresh_chat_screen"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 3
                goto L_0x00e5
            L_0x00a3:
                java.lang.String r0 = "broadcaset_connection_disconnection"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 5
                goto L_0x00e5
            L_0x00ad:
                java.lang.String r0 = "broadcast_start_tracking"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 10
                goto L_0x00e5
            L_0x00b8:
                java.lang.String r0 = "broadcast_auto_stop_track"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 12
                goto L_0x00e5
            L_0x00c3:
                java.lang.String r0 = "filed_complaint"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 16
                goto L_0x00e5
            L_0x00ce:
                java.lang.String r0 = "broadcast_finish_chat_screen"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 8
                goto L_0x00e5
            L_0x00d9:
                java.lang.String r0 = "broadcast_network_on_off"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L_0x00e4
                r9 = 13
                goto L_0x00e5
            L_0x00e4:
                r9 = -1
            L_0x00e5:
                java.lang.String r0 = "finalized"
                switch(r9) {
                    case 0: goto L_0x03d4;
                    case 1: goto L_0x0394;
                    case 2: goto L_0x0362;
                    case 3: goto L_0x0319;
                    case 4: goto L_0x02da;
                    case 5: goto L_0x02cd;
                    case 6: goto L_0x02c9;
                    case 7: goto L_0x02b8;
                    case 8: goto L_0x02a9;
                    case 9: goto L_0x0256;
                    case 10: goto L_0x018b;
                    case 11: goto L_0x0171;
                    case 12: goto L_0x0157;
                    case 13: goto L_0x04a0;
                    case 14: goto L_0x0131;
                    case 15: goto L_0x012a;
                    case 16: goto L_0x0123;
                    case 17: goto L_0x0117;
                    case 18: goto L_0x00ec;
                    default: goto L_0x00ea;
                }
            L_0x00ea:
                goto L_0x04a0
            L_0x00ec:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                boolean r9 = r9.mo23620g()
                if (r9 == 0) goto L_0x04a0
                boolean r9 = com.mrsool.chat.ChatActivityNew.f27658F6
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                java.lang.Class<com.mrsool.chat.ChatActivityNew> r10 = com.mrsool.chat.ChatActivityNew.class
                java.lang.Boolean r9 = r9.mo23515a(r10)
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r10 = com.mrsool.utils.C11644i.C11645a.f33469a
                java.lang.String r0 = "credit_card"
                r9.mo37665b(r10, r0)
                com.mrsool.chat.ChatActivityNew.f27658F6 = r4
                goto L_0x04a0
            L_0x0117:
                java.lang.String r9 = "CheckoutActivity.ACTION_ON_BEFORE_SUBMIT"
                com.mrsool.utils.C5880q.m25751b(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48310s(r5)
                goto L_0x04a0
            L_0x0123:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.mo37650Q()
                goto L_0x04a0
            L_0x012a:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48113c(r10)
                goto L_0x04a0
            L_0x0131:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                com.mrsool.bean.Order r9 = r9.getOrder()
                java.lang.String r9 = r9.getvStatus()
                boolean r9 = r9.equalsIgnoreCase(r0)
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                boolean r9 = r9.mo23502X()
                goto L_0x04a0
            L_0x0157:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 != 0) goto L_0x0160
                return
            L_0x0160:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                boolean r9 = r9.f27855g2
                if (r9 != 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r10 = "stop"
                r9.m48136d(r10, r4)
                goto L_0x04a0
            L_0x0171:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 != 0) goto L_0x017a
                return
            L_0x017a:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                boolean r9 = r9.f27855g2
                if (r9 != 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r10 = "start"
                r9.m48136d(r10, r5)
                goto L_0x04a0
            L_0x018b:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m47879E1()
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 != 0) goto L_0x0199
                return
            L_0x0199:
                android.os.Bundle r9 = r10.getExtras()
                java.lang.String r0 = com.mrsool.utils.C11644i.f33314h1
                boolean r9 = r9.containsKey(r0)
                if (r9 == 0) goto L_0x04a0
                android.os.Bundle r9 = r10.getExtras()
                java.lang.String r0 = com.mrsool.utils.C11644i.f33314h1
                java.lang.String r9 = r9.getString(r0)
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r9 = r9.f27825b2
                android.os.Bundle r0 = r10.getExtras()
                java.lang.String r1 = com.mrsool.utils.C11644i.f33314h1
                java.lang.String r0 = r0.getString(r1)
                boolean r9 = r9.equalsIgnoreCase(r0)
                if (r9 == 0) goto L_0x04a0
                android.os.Bundle r9 = r10.getExtras()     // Catch:{ Exception -> 0x0216 }
                java.lang.String r0 = com.mrsool.utils.C11644i.f33341k1     // Catch:{ Exception -> 0x0216 }
                boolean r9 = r9.containsKey(r0)     // Catch:{ Exception -> 0x0216 }
                if (r9 == 0) goto L_0x021a
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this     // Catch:{ Exception -> 0x0216 }
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2     // Catch:{ Exception -> 0x0216 }
                com.mrsool.bean.OrderTrackBean r9 = r9.getOrder_track()     // Catch:{ Exception -> 0x0216 }
                android.os.Bundle r0 = r10.getExtras()     // Catch:{ Exception -> 0x0216 }
                java.lang.String r1 = com.mrsool.utils.C11644i.f33341k1     // Catch:{ Exception -> 0x0216 }
                java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0216 }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0216 }
                java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
                r9.setCourier_base_lat(r0)     // Catch:{ Exception -> 0x0216 }
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this     // Catch:{ Exception -> 0x0216 }
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2     // Catch:{ Exception -> 0x0216 }
                com.mrsool.bean.OrderTrackBean r9 = r9.getOrder_track()     // Catch:{ Exception -> 0x0216 }
                android.os.Bundle r0 = r10.getExtras()     // Catch:{ Exception -> 0x0216 }
                java.lang.String r1 = com.mrsool.utils.C11644i.f33350l1     // Catch:{ Exception -> 0x0216 }
                java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0216 }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0216 }
                java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0216 }
                r9.setCourier_base_lng(r0)     // Catch:{ Exception -> 0x0216 }
                goto L_0x021a
            L_0x0216:
                r9 = move-exception
                r9.printStackTrace()
            L_0x021a:
                android.os.Bundle r9 = r10.getExtras()
                java.lang.String r10 = com.mrsool.utils.C11644i.f33171Q1
                boolean r9 = r9.getBoolean(r10)
                if (r9 == 0) goto L_0x0242
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.mo37669e(r5)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                boolean r9 = r9.f27855g2
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                android.view.View[] r10 = new android.view.View[r5]
                android.view.View r0 = r9.f27797W3
                r10[r4] = r0
                r9.m48019a(r4, r10)
                goto L_0x04a0
            L_0x0242:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.mo37669e(r4)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                boolean r9 = r9.f27855g2
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48236l2()
                goto L_0x04a0
            L_0x0256:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                boolean r9 = r9.mo23502X()
                if (r9 == 0) goto L_0x0277
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r9 = r9.f27825b2
                if (r9 == 0) goto L_0x0277
                android.os.Handler r9 = new android.os.Handler
                r9.<init>()
                com.mrsool.chat.ChatActivityNew$j$a r10 = new com.mrsool.chat.ChatActivityNew$j$a
                r10.<init>()
                r6 = 1500(0x5dc, double:7.41E-321)
                r9.postDelayed(r10, r6)
            L_0x0277:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                int r10 = r9.f27678C4
                int r10 = r10 + r1
                r9.f27678C4 = r10
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48212j2()
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                com.mrsool.bean.PortalOrderDetail r9 = r9.getPortalOrderDetail()
                if (r9 != 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                android.view.View[] r10 = new android.view.View[r5]
                androidx.constraintlayout.widget.ConstraintLayout r0 = r9.f27785U3
                r10[r4] = r0
                r9.m48019a(r2, r10)
                goto L_0x04a0
            L_0x02a9:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                boolean r9 = r9.isDestroyed()
                if (r9 != 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.finish()
                goto L_0x04a0
            L_0x02b8:
                android.os.Bundle r9 = r10.getExtras()
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r0 = com.mrsool.utils.C11644i.f33261b2
                java.lang.String r9 = r9.getString(r0)
                r10.m47860C(r9)
                goto L_0x04a0
            L_0x02c9:
                com.mrsool.utils.C11644i.f33250a0 = r5
                goto L_0x04a0
            L_0x02cd:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.webservice.e r10 = com.mrsool.utils.webservice.C11694e.INSTANCE
                boolean r10 = r10.mo40213h()
                r9.m48364y(r10)
                goto L_0x04a0
            L_0x02da:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                boolean r9 = r9.mo23502X()
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.String r9 = r9.f27825b2
                if (r9 == 0) goto L_0x04a0
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                android.widget.LinearLayout r9 = r9.f27821a4
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L_0x0301
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
                r9.f27799W5 = r10
            L_0x0301:
                java.lang.String r9 = com.mrsool.utils.C11644i.f33241Z
                boolean r9 = r9.equalsIgnoreCase(r0)
                if (r9 != 0) goto L_0x0312
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                android.widget.ProgressBar r9 = r9.f27928s1
                r9.setVisibility(r4)
            L_0x0312:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.mo37650Q()
                goto L_0x04a0
            L_0x0319:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m47980X()
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                if (r9 != 0) goto L_0x0327
                return
            L_0x0327:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                com.mrsool.bean.Order r9 = r9.getOrder()
                java.lang.String r9 = r9.getvStatus()
                java.lang.String r10 = "in-progress"
                boolean r9 = r9.equalsIgnoreCase(r10)
                if (r9 != 0) goto L_0x0359
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r9 = r9.f27929s2
                com.mrsool.bean.Order r9 = r9.getOrder()
                java.lang.String r9 = r9.getvStatus()
                boolean r9 = r9.equalsIgnoreCase(r0)
                if (r9 == 0) goto L_0x0352
                goto L_0x0359
            L_0x0352:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.initViews()
                goto L_0x04a0
            L_0x0359:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r9 = r9.f29642a
                r9.mo23473E(r3)
                goto L_0x04a0
            L_0x0362:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r9 = r9.f27795W1
                int r9 = r9.size()
                if (r4 >= r9) goto L_0x0380
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r9 = r9.f27795W1
                java.lang.Object r9 = r9.get(r4)
                com.mrsool.bean.messages r9 = (com.mrsool.bean.messages) r9
                r9.setRead(r5)
                int r4 = r4 + 1
                goto L_0x0362
            L_0x0380:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r10 = r9.f29642a
                androidx.recyclerview.widget.RecyclerView r9 = r9.f27962x0
                r10.mo23549a(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.chat.g r9 = r9.f27801X1
                r9.mo7341e()
                goto L_0x04a0
            L_0x0394:
                android.os.Bundle r9 = r10.getExtras()
                java.lang.String r10 = "type"
                r9.getString(r10)
            L_0x039d:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r9 = r9.f27795W1
                int r9 = r9.size()
                if (r4 >= r9) goto L_0x03bb
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r9 = r9.f27795W1
                java.lang.Object r9 = r9.get(r4)
                com.mrsool.bean.messages r9 = (com.mrsool.bean.messages) r9
                r9.setRead(r5)
                int r4 = r4 + 1
                goto L_0x039d
            L_0x03bb:
                java.lang.String r9 = "recyclePoolList"
                com.mrsool.utils.C5880q.m25751b(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r10 = r9.f29642a
                androidx.recyclerview.widget.RecyclerView r9 = r9.f27962x0
                r10.mo23549a(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.chat.g r9 = r9.f27801X1
                r9.mo7341e()
                goto L_0x04a0
            L_0x03d4:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                androidx.recyclerview.widget.RecyclerView r9 = r9.f27962x0
                r9.stopScroll()
                android.os.Bundle r9 = r10.getExtras()
                java.lang.String r10 = "chat"
                java.io.Serializable r9 = r9.getSerializable(r10)
                com.mrsool.bean.messages r9 = (com.mrsool.bean.messages) r9
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r10 = r10.f27795W1
                int r10 = r10.size()
                if (r10 <= 0) goto L_0x0436
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r10 = r10.f27795W1
                com.mrsool.chat.ChatActivityNew r0 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r0 = r0.f27795W1
                int r0 = r0.size()
                int r0 = r0 - r5
                java.lang.Object r10 = r10.get(r0)
                com.mrsool.bean.messages r10 = (com.mrsool.bean.messages) r10
                java.lang.String r10 = r10.getvMessageId()
                if (r10 == 0) goto L_0x0436
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r10 = r10.f27795W1
                com.mrsool.chat.ChatActivityNew r0 = com.mrsool.chat.ChatActivityNew.this
                java.util.ArrayList r0 = r0.f27795W1
                int r0 = r0.size()
                int r0 = r0 - r5
                java.lang.Object r10 = r10.get(r0)
                com.mrsool.bean.messages r10 = (com.mrsool.bean.messages) r10
                java.lang.String r10 = r10.getvMessageId()
                java.lang.String r0 = r9.getvMessageId()
                boolean r10 = r10.equalsIgnoreCase(r0)
                if (r10 == 0) goto L_0x0436
                return
            L_0x0436:
                if (r9 == 0) goto L_0x044c
                java.lang.String r10 = r9.getvMessageId()
                if (r10 == 0) goto L_0x044c
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                java.lang.String r10 = java.lang.String.valueOf(r0)
                r9.setvMessageId(r10)
            L_0x044c:
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r10 = r10.f27929s2
                if (r10 == 0) goto L_0x046e
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r10 = r10.f27929s2
                boolean r10 = r10.isDisableChat()
                if (r10 == 0) goto L_0x046e
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.bean.ChatInitModel r10 = r10.f27929s2
                r10.setDisableChat(r4)
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                r10.m48169f2()
            L_0x046e:
                com.mrsool.chat.ChatActivityNew r10 = com.mrsool.chat.ChatActivityNew.this
                r10.m48036a(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                android.widget.LinearLayout r9 = r9.f27815Z3
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L_0x0489
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.f27678C4 = r9.f27678C4 + 1
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48212j2()
            L_0x0489:
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.utils.x r10 = r9.f29642a
                androidx.recyclerview.widget.RecyclerView r9 = r9.f27962x0
                r10.mo23549a(r9)
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                com.mrsool.chat.g r9 = r9.f27801X1
                r9.mo7341e()
                com.mrsool.chat.ChatActivityNew r9 = com.mrsool.chat.ChatActivityNew.this
                r9.m48072a0()
            L_0x04a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.ChatActivityNew.C10359j.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j0 */
    class C10361j0 implements Runnable {
        C10361j0() {
        }

        public void run() {
            ChatActivityNew.this.m48218k(true);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j1 */
    class C10362j1 implements Callback<PaymentStatusMainBean> {

        /* renamed from: a */
        final /* synthetic */ String f28081a;

        C10362j1(String str) {
            this.f28081a = str;
        }

        public void onFailure(Call<PaymentStatusMainBean> call, Throwable th) {
            ChatActivityNew.this.m48143d2();
        }

        public void onResponse(Call<PaymentStatusMainBean> call, Response<PaymentStatusMainBean> response) {
            if (response.isSuccessful() && ((PaymentStatusMainBean) response.body()).getCode().intValue() <= 300) {
                if (this.f28081a.equalsIgnoreCase(C11645a.f33474f)) {
                    ChatActivityNew.this.f29642a.mo23473E(CheckoutActivity.f34069j0);
                } else if (this.f28081a.equalsIgnoreCase(C11645a.f33469a)) {
                    ChatActivityNew.this.m48135d("credit_card", C11645a.f33472d);
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j2 */
    class C10363j2 extends CountDownTimer {
        C10363j2(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            ChatActivityNew.this.m48240m("expire_portal_order");
        }

        public void onTick(long j) {
            ChatActivityNew.this.f27746O0.setText(ChatActivityNew.this.m48084b(j));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j3 */
    class C10364j3 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28084a;

        C10364j3(Dialog dialog) {
            this.f28084a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28084a.dismiss();
                ChatActivityNew.this.finishActivity();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$j4 */
    class C10365j4 implements OnClickListener {
        C10365j4() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(ChatActivityNew.this, ChangeCourierActivity.class);
            intent.putExtra(C11644i.f33314h1, ChatActivityNew.this.f27825b2);
            intent.putExtra(C11644i.f33367n1, ChatActivityNew.this.f27929s2.getOrder().getvShopId());
            intent.putExtra(C11644i.f33203U1, false);
            String str = C11644i.f33219W1;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
            intent.putExtra(str, sb.toString());
            intent.putExtra(C11644i.f33211V1, ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_id());
            intent.putExtra(C11644i.f33323i1, ChatActivityNew.this.f27929s2.getOrder().getvShopName());
            intent.putExtra(C11644i.f33323i1, ChatActivityNew.this.f27929s2.getOrder().getvShopName());
            intent.putExtra(C11644i.f33351l2, ChatActivityNew.this.f27929s2.getOrder().getCurrency());
            intent.putExtra(C11644i.f33188S2, ChatActivityNew.this.f27929s2.getMin_del_cost());
            ChatActivityNew.this.startActivity(intent);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k */
    class C10366k extends TimerTask {

        /* renamed from: com.mrsool.chat.ChatActivityNew$k$a */
        class C10367a implements Runnable {
            C10367a() {
            }

            public void run() {
                ChatActivityNew.this.m47961T0();
            }
        }

        C10366k() {
        }

        public void run() {
            C5880q.m25751b("TYPING: Hide : checkOtherUserTyping");
            ChatActivityNew.this.runOnUiThread(new C10367a());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k0 */
    class C10368k0 implements Runnable {
        C10368k0() {
        }

        public void run() {
            ChatActivityNew.this.f29642a.mo23665u0();
            ChatActivityNew.this.f27662A0.setEnabled(true);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k1 */
    class C10369k1 implements C11118l {

        /* renamed from: a */
        final /* synthetic */ PaymentStatusMainBean f28090a;

        C10369k1(PaymentStatusMainBean paymentStatusMainBean) {
            this.f28090a = paymentStatusMainBean;
        }

        /* renamed from: a */
        public void mo37743a() {
            PaymentReceiptBean paymentReceipt = this.f28090a.getPaymentReceipt();
            String format = String.format(ChatActivityNew.this.getString(C10232R.string.lbl_two_string), new Object[]{paymentReceipt.getGrandTotal().getValue(), paymentReceipt.getGrandTotal().getCurrency()});
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48065a(format, chatActivityNew.m48080b(this.f28090a.getCards()));
            ChatActivityNew.this.f27835c6.mo37908b();
            ChatActivityNew.this.f27835c6 = null;
        }

        /* renamed from: b */
        public void mo37744b() {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k2 */
    class C10370k2 implements C6017h {
        C10370k2() {
        }

        /* renamed from: a */
        public void mo24851a(JSONObject jSONObject, C14130h hVar) {
            String str = "type";
            if (hVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Chat BRANCH SDK Splash: ");
                sb.append(jSONObject.toString());
                C5880q.m25752c(sb.toString());
                try {
                    if (jSONObject.getBoolean("+clicked_branch_link")) {
                        C11644i.f33453y = true;
                        C11644i.f33461z = jSONObject.getString("shopid");
                        C11644i.f33041A = jSONObject.has(str) ? jSONObject.getString(str) : "";
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Chat BRANCH SDK : ");
                sb2.append(hVar.mo44646b());
                C5880q.m25752c(sb2.toString());
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k3 */
    class C10371k3 implements OnLayoutChangeListener {

        /* renamed from: com.mrsool.chat.ChatActivityNew$k3$a */
        class C10372a implements Runnable {
            C10372a() {
            }

            public void run() {
                if (ChatActivityNew.this.f27962x0.getAdapter().mo7325b() > 0) {
                    RecyclerView recyclerView = ChatActivityNew.this.f27962x0;
                    recyclerView.smoothScrollToPosition(recyclerView.getAdapter().mo7325b() - 1);
                }
            }
        }

        C10371k3() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 < i8) {
                ChatActivityNew.this.f27962x0.postDelayed(new C10372a(), 100);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$k4 */
    class C10373k4 implements OnClickListener {
        C10373k4() {
        }

        public void onClick(View view) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48336v(String.valueOf(chatActivityNew.f27929s2.getOrderOffer().getCourierId()));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l */
    class C10374l extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f28096R;

        C10374l(ImageView imageView, ImageView imageView2) {
            this.f28096R = imageView2;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            Resources resources = ChatActivityNew.this.getResources();
            C5887x xVar = ChatActivityNew.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            this.f28096R.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l0 */
    class C10375l0 implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ String f28098a;

        C10375l0(String str) {
            this.f28098a = str;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (!response.isSuccessful()) {
                        C5887x xVar2 = ChatActivityNew.this.f29642a;
                        if (xVar2 != null) {
                            xVar2.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                        ChatActivityNew.this.f29642a.mo23491N(((ServiceManualDefaultBean) response.body()).getMessage());
                        if (this.f28098a.equalsIgnoreCase("order_pickup")) {
                            C11598a.m52263f().mo39830b(ChatActivityNew.this.f27825b2, ChatActivityNew.this.f27929s2.getOrder().getvShopId());
                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_package_pickedup, false);
                            ChatActivityNew.this.m48304r1();
                        }
                        if (ChatActivityNew.this.f27929s2.getOrder_track().getCourier_show_start_tracking().booleanValue() && !ChatActivityNew.this.f27929s2.getOrder_track().getTrack_order().booleanValue()) {
                            ChatActivityNew.this.m48136d(C11644i.f33457y3, true);
                            ChatActivityNew.this.m48277p(true);
                        }
                        if (ChatActivityNew.this.f29642a.mo23502X()) {
                            ChatActivityNew.this.mo37650Q();
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l1 */
    class C10376l1 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PaymentStatusMainBean f28100a;

        C10376l1(PaymentStatusMainBean paymentStatusMainBean) {
            this.f28100a = paymentStatusMainBean;
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48093b(this.f28100a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l2 */
    class C10377l2 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28103a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f28104b;

        C10377l2(String str, ArrayList arrayList) {
            this.f28103a = str;
            this.f28104b = arrayList;
        }

        public void run() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48019a(0, chatActivityNew.f27847e6, ChatActivityNew.this.f27859g6);
            ChatActivityNew.this.f27853f6.setText(ChatActivityNew.this.m48008a(this.f28103a, this.f28104b));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l3 */
    class C10378l3 implements Callback<OrderDeliveredBean> {
        C10378l3() {
        }

        public void onFailure(Call<OrderDeliveredBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23615f(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue), ChatActivityNew.this.getString(C10232R.string.app_name));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<OrderDeliveredBean> call, Response<OrderDeliveredBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        OrderDeliveredBean orderDeliveredBean = (OrderDeliveredBean) response.body();
                        if (orderDeliveredBean.getCode().intValue() <= 250) {
                            ChatActivityNew.this.m47868D(C11644i.f33189S3);
                            ChatActivityNew.this.m47868D(C11644i.f33197T3);
                            C11644i.f33136L6 = false;
                            C11598a.m52263f().mo39806a((double) ChatActivityNew.this.f29642a.mo23507a(ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_received_at(), System.currentTimeMillis()), "", ChatActivityNew.this.f27825b2, ChatActivityNew.this.f27929s2.getOrder().getvShopId());
                            try {
                                if (C11644i.f33437w) {
                                    ChatActivityNew.this.f27676C2.mo39871c(ChatActivityNew.this.f27676C2.mo39861a(ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_received_at()), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), ChatActivityNew.this.f27929s2.getOrder().getfBuyerRatings(), ChatActivityNew.this.f27929s2.getOrder().getfCourierRatings(), ((CancelReasonBean) ChatActivityNew.this.f27713I3.get(ChatActivityNew.this.f27725K3.getSelectedItemPosition())).getReason(), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId()), ChatActivityNew.this.f27676C2.mo39860a());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            ChatActivityNew.this.m47980X();
                            ChatActivityNew.this.initViews();
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            String str = "withdrawOrder";
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            } else {
                                ChatActivityNew.this.mo36511f(str);
                            }
                        } else {
                            if (orderDeliveredBean.getCode().intValue() != 300) {
                                if (orderDeliveredBean.getCode().intValue() != 400) {
                                    if (((OrderDeliveredBean) response.body()).getCode().intValue() == 402) {
                                        if (!ChatActivityNew.this.isDestroyed()) {
                                            ChatActivityNew.this.finishActivity();
                                        }
                                        return;
                                    }
                                    ChatActivityNew.this.f29642a.mo23615f(orderDeliveredBean.getMessages(), ChatActivityNew.this.getString(C10232R.string.app_name));
                                }
                            }
                            C11598a.m52263f().mo39806a((double) ChatActivityNew.this.f29642a.mo23507a(ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_received_at(), System.currentTimeMillis()), orderDeliveredBean.getMessage(), ChatActivityNew.this.f27825b2, ChatActivityNew.this.f27929s2.getOrder().getvShopId());
                            if (!TextUtils.isEmpty(orderDeliveredBean.getMessage())) {
                                ChatActivityNew.this.f29642a.mo23615f(orderDeliveredBean.getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                            } else {
                                ChatActivityNew.this.f29642a.mo23615f(orderDeliveredBean.getMessages(), ChatActivityNew.this.getString(C10232R.string.app_name));
                            }
                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_withdraw_order, false);
                            if (ChatActivityNew.this.f27958w3 != null) {
                                ChatActivityNew.this.f27958w3.dismiss();
                            }
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (ChatActivityNew.this.f29642a != null) {
                            ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$l4 */
    class C10379l4 implements AnimatorListener {
        C10379l4() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ChatActivityNew.this.m48291q0();
            ChatActivityNew.this.m47932N1();
            ChatActivityNew.this.m48283p2();
            ChatActivityNew.this.f27873j2 = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m */
    class C10380m extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f28107R;

        C10380m(ImageView imageView, ImageView imageView2) {
            this.f28107R = imageView2;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            Resources resources = ChatActivityNew.this.getResources();
            C5887x xVar = ChatActivityNew.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            this.f28107R.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m0 */
    class C10381m0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28109a;

        C10381m0(Dialog dialog) {
            this.f28109a = dialog;
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48064a(C11644i.f33385p3, this.f28109a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m1 */
    class C10382m1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28111a;

        C10382m1(String str) {
            this.f28111a = str;
        }

        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString(C11644i.f33383p1, this.f28111a);
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.f27823a6 = new C11120n(chatActivityNew, bundle);
            ChatActivityNew.this.f27823a6.mo38928c();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m2 */
    class C10383m2 extends C2550c {
        C10383m2(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            ChatActivityNew.this.f27830c1.setImageDrawable(ChatActivityNew.this.f29642a.mo23567b(bitmap));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m3 */
    class C10384m3 implements Callback<CancelReasonMainBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f28114a;

        /* renamed from: b */
        final /* synthetic */ int f28115b;

        C10384m3(boolean z, int i) {
            this.f28114a = z;
            this.f28115b = i;
        }

        public void onFailure(Call<CancelReasonMainBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    if (!this.f28114a) {
                        chatActivityNew.m48226l(3);
                    }
                    ChatActivityNew.this.f29642a.mo23653q0();
                }
            }
        }

        public void onResponse(Call<CancelReasonMainBean> call, Response<CancelReasonMainBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    if (this.f28114a) {
                        xVar.mo23492O();
                    }
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f27667A5 = (CancelReasonMainBean) response.body();
                        if (((CancelReasonMainBean) response.body()).getCode() <= 300) {
                            ChatActivityNew.this.f27673B5 = this.f28115b;
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f27773S3 = this.f28114a;
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("CancelReasonList", a));
                                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                                chatActivityNew.f29642a.mo23553a((C11056p) chatActivityNew);
                            } else if (!this.f28114a) {
                                ChatActivityNew.this.m48273p(this.f28115b);
                            } else {
                                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                                chatActivityNew2.m48031a(chatActivityNew2.f27667A5, this.f28115b);
                            }
                        } else if (((CancelReasonMainBean) response.body()).getCode() == 402) {
                            ChatActivityNew.this.m48226l(3);
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                        } else {
                            if (!this.f28114a) {
                                ChatActivityNew.this.m48226l(3);
                            }
                            ChatActivityNew.this.f29642a.mo23615f(((CancelReasonMainBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    } else {
                        if (!this.f28114a) {
                            ChatActivityNew.this.m48226l(3);
                        }
                        C5887x xVar2 = ChatActivityNew.this.f29642a;
                        if (xVar2 != null) {
                            xVar2.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$m4 */
    class C10385m4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f28117a;

        C10385m4(boolean z) {
            this.f28117a = z;
        }

        public void onClick(View view) {
            if (this.f28117a) {
                ChatActivityNew.this.m47877E0();
            } else {
                ChatActivityNew.this.m47851A2();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n */
    class C10386n implements OnClickListener {
        C10386n() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48269o1();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n0 */
    class C10387n0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28120a;

        C10387n0(Dialog dialog) {
            this.f28120a = dialog;
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48064a("decline", this.f28120a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n1 */
    class C10388n1 implements C11113o {
        C10388n1() {
        }

        /* renamed from: a */
        public void mo37759a(String str) {
            ChatActivityNew.this.m48372z(str);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n2 */
    class C10389n2 extends C2550c {
        C10389n2(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            Resources resources = ChatActivityNew.this.getResources();
            C5887x xVar = ChatActivityNew.this.f29642a;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            ChatActivityNew.this.f27818a1.setImageDrawable(a);
            ChatActivityNew.this.f27938t4.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n3 */
    class C10390n3 implements Callback<OrderDeliveredBean> {
        C10390n3() {
        }

        public void onFailure(Call<OrderDeliveredBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23615f(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue), ChatActivityNew.this.getString(C10232R.string.app_name));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<OrderDeliveredBean> call, Response<OrderDeliveredBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        OrderDeliveredBean orderDeliveredBean = (OrderDeliveredBean) response.body();
                        if (orderDeliveredBean.getCode().intValue() <= 300) {
                            ChatActivityNew.this.m48234l1();
                            boolean z = false;
                            C11644i.f33136L6 = false;
                            ChatActivityNew.this.m47868D(C11644i.f33189S3);
                            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33197T3);
                            C11694e eVar = C11694e.INSTANCE;
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            sb.append(ChatActivityNew.this.f27929s2.getOrder().getiBuyerId());
                            eVar.mo40206d(sb.toString(), ChatActivityNew.this.f27825b2);
                            try {
                                if (C11644i.f33437w) {
                                    ChatActivityNew.this.f27676C2.mo39868b(ChatActivityNew.this.m47940P0(), ChatActivityNew.this.f27676C2.mo39860a(), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), ChatActivityNew.this.f27929s2.getOrder().getfBuyerRatings(), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId()));
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (orderDeliveredBean.getiTotalOrderPlaced().intValue() == 0) {
                                ChatActivityNew.this.m48071a(ChatActivityNew.this.f27929s2.getOrder().getiBuyerId(), ChatActivityNew.this.f27929s2.getOrder().getiOrderId());
                            }
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            String str = "OrderDelivered";
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            } else {
                                ChatActivityNew.this.mo36511f(str);
                            }
                            C11598a f = C11598a.m52263f();
                            ChatActivityNew chatActivityNew = ChatActivityNew.this;
                            if (!TextUtils.isEmpty(a)) {
                                z = true;
                            }
                            f.mo39825a(chatActivityNew.m48193i(z));
                        } else if (((OrderDeliveredBean) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                        } else {
                            ChatActivityNew.this.f29642a.mo23492O();
                            ChatActivityNew.this.f29642a.mo23615f(((OrderDeliveredBean) response.body()).getMessage() != null ? ((OrderDeliveredBean) response.body()).getMessage() : ((OrderDeliveredBean) response.body()).getMessages(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (ChatActivityNew.this.f29642a != null) {
                            ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                            ChatActivityNew.this.m48241m(true);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$n4 */
    class C10391n4 implements Runnable {
        C10391n4() {
        }

        public void run() {
            ((FrameLayout) ChatActivityNew.this.findViewById(C10232R.C10236id.layMapContainer)).setVisibility(0);
            ChatActivityNew.this.f27839d4.setVisibility(0);
            ChatActivityNew.this.f27905o4.setVisibility(0);
            ChatActivityNew.this.f27815Z3.setVisibility(0);
            ChatActivityNew.this.f27851f4.setText(C10232R.string.lbl_back_to_chat);
            ChatActivityNew.this.f27696F4 = false;
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
            chatActivityNew.m48019a(8, chatActivityNew.f27785U3, chatActivityNew2.f27962x0, chatActivityNew2.f27727K5);
            if (ChatActivityNew.this.f27970y1 == null) {
                ChatActivityNew.this.m48124c0();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o */
    class C10392o implements Callback<DefaultBean> {
        C10392o() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        try {
                            if (((DefaultBean) response.body()).getCode().intValue() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finish();
                                }
                            } else if (ChatActivityNew.this.m48075a1().equalsIgnoreCase(ChatActivityNew.this.getString(C10232R.string.lbl_push_notification))) {
                                ChatActivityNew.this.f29642a.mo23588c();
                                ChatActivityNew.this.f29642a.mo23467B(ChatActivityNew.this.f27825b2);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (ChatActivityNew.this.f29642a != null && response.code() == 401) {
                        ChatActivityNew.this.f29642a.mo23613e0();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o0 */
    class C10393o0 implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ Dialog f28127a;

        /* renamed from: b */
        final /* synthetic */ String f28128b;

        C10393o0(Dialog dialog, String str) {
            this.f28127a = dialog;
            this.f28128b = str;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (response.isSuccessful()) {
                        try {
                            if (this.f28127a != null && !ChatActivityNew.this.isFinishing()) {
                                this.f28127a.dismiss();
                            }
                        } catch (Exception unused) {
                        }
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() > 300) {
                            ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        } else if (this.f28128b.equalsIgnoreCase(C11644i.f33385p3)) {
                            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33189S3);
                            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33197T3);
                            ChatActivityNew.this.f29642a.mo23473E(C11644i.f33157O3);
                            ChatActivityNew.this.m47980X();
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            String str = "";
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                                chatActivityNew.f29642a.mo23553a((C11056p) chatActivityNew);
                                return;
                            }
                            ChatActivityNew.this.mo36511f(str);
                        }
                    } else {
                        C5887x xVar2 = ChatActivityNew.this.f29642a;
                        if (xVar2 != null) {
                            xVar2.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o1 */
    class C10394o1 implements UncaughtExceptionHandler {
        C10394o1() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Intent intent = new Intent(ChatActivityNew.this, ChatActivityNew.class);
            intent.putExtra(C11644i.f33215V5, true);
            intent.putExtras(ChatActivityNew.this.getIntent().getExtras());
            ChatActivityNew.this.startActivity(intent);
            ChatActivityNew.this.finish();
            System.exit(1);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o2 */
    class C10395o2 implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ CancelReasonBean f28131a;

        C10395o2(CancelReasonBean cancelReasonBean) {
            this.f28131a = cancelReasonBean;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23653q0();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            try {
                if (!ChatActivityNew.this.isFinishing()) {
                    if (ChatActivityNew.this.f29642a != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Call Unsuccess:");
                        sb.append(response);
                        C5880q.m25751b(sb.toString());
                        if (response.isSuccessful()) {
                            ChatActivityNew.this.f29642a.mo23492O();
                            if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                                C11644i.f33136L6 = false;
                                C11694e eVar = C11694e.INSTANCE;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("");
                                sb2.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                                eVar.mo40206d(sb2.toString(), ChatActivityNew.this.f27825b2);
                                ChatActivityNew.this.f29642a.mo23473E(C11644i.f33181R3);
                                ChatActivityNew.this.f29642a.mo23473E(C11644i.f33205U3);
                                ChatActivityNew.this.f29642a.mo23473E(C11644i.f33157O3);
                                ChatActivityNew.this.m47980X();
                                ChatActivityNew.this.m47935O0();
                                try {
                                    if (!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                                        if (C11644i.f33437w) {
                                            ChatActivityNew.this.f27676C2.mo39869b(ChatActivityNew.this.m47940P0(), ChatActivityNew.this.f27676C2.mo39860a(), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getfCourierRatings()), ((CancelReasonBean) ChatActivityNew.this.f27713I3.get(ChatActivityNew.this.f27725K3.getSelectedItemPosition())).getReason(), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId()), "false");
                                        }
                                    } else if (C11644i.f33437w) {
                                        ChatActivityNew.this.f27676C2.mo39869b(ChatActivityNew.this.m47940P0(), ChatActivityNew.this.f27676C2.mo39860a(), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getfCourierRatings()), ((CancelReasonBean) ChatActivityNew.this.f27713I3.get(ChatActivityNew.this.f27725K3.getSelectedItemPosition())).getReason(), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId()), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                ChatActivityNew.this.m48328u(this.f28131a.getReason());
                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                String str = "CancelOffer";
                                if (!TextUtils.isEmpty(a)) {
                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                } else {
                                    ChatActivityNew.this.mo36511f(str);
                                }
                            } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finishActivity();
                                }
                            } else if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                                ChatActivityNew.this.m47980X();
                                ChatActivityNew.this.m48120c(((ServiceManualDefaultBean) response.body()).getMessages() != null ? ((ServiceManualDefaultBean) response.body()).getMessages().toString() : ((ServiceManualDefaultBean) response.body()).getMessage(), false);
                            }
                        } else if (!ChatActivityNew.this.isFinishing()) {
                            if (ChatActivityNew.this.f29642a != null) {
                                ChatActivityNew.this.f29642a.mo23492O();
                                if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                                    ChatActivityNew.this.mo37664a(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name), true);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o3 */
    class C10396o3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28134a;

        /* renamed from: b */
        final /* synthetic */ boolean f28135b;

        C10396o3(Dialog dialog, boolean z) {
            this.f28134a = dialog;
            this.f28135b = z;
        }

        public void onClick(View view) {
            this.f28134a.dismiss();
            if (this.f28135b) {
                ChatActivityNew.this.finishActivity();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$o4 */
    class C10397o4 implements Runnable {

        /* renamed from: com.mrsool.chat.ChatActivityNew$o4$a */
        class C10398a implements AnimatorUpdateListener {
            C10398a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatActivityNew.this.f27809Y3.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                StringBuilder sb = new StringBuilder();
                sb.append("showHideTrackingViews ");
                sb.append(valueAnimator.getAnimatedValue());
                C5880q.m25750a(sb.toString());
            }
        }

        /* renamed from: com.mrsool.chat.ChatActivityNew$o4$b */
        class C10399b implements AnimationListener {

            /* renamed from: com.mrsool.chat.ChatActivityNew$o4$b$a */
            class C10400a implements Runnable {
                C10400a() {
                }

                public void run() {
                    RecyclerView recyclerView = ChatActivityNew.this.f27962x0;
                    recyclerView.scrollToPosition(recyclerView.getAdapter().mo7325b() - 1);
                }
            }

            C10399b() {
            }

            public void onAnimationEnd(Animation animation) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                chatActivityNew.m48019a(8, chatActivityNew.f27815Z3, ChatActivityNew.this.f27905o4);
                ChatActivityNew.this.f27785U3.setVisibility(0);
                ChatActivityNew.this.f27815Z3.setAlpha(1.0f);
                ChatActivityNew.this.f27815Z3.setTranslationY(0.0f);
                ChatActivityNew.this.f27809Y3.setTranslationY(0.0f);
                ChatActivityNew.this.f27905o4.setTranslationY(0.0f);
                ChatActivityNew.this.f27821a4.setTranslationY(0.0f);
                ChatActivityNew.this.f27905o4.setVisibility(8);
                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                chatActivityNew2.m48070a(true, chatActivityNew2.f27962x0, chatActivityNew2.f27727K5);
                if (ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) {
                    if (ChatActivityNew.this.f27929s2.isShowPay()) {
                        ChatActivityNew.this.m48346w(true);
                    } else {
                        ChatActivityNew.this.f27809Y3.setVisibility(8);
                    }
                } else if (!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered")) {
                    ChatActivityNew.this.f27809Y3.setVisibility(8);
                }
                new Handler().postDelayed(new C10400a(), 50);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        C10397o4() {
        }

        public void run() {
            if (!((!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3) && !ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) || ChatActivityNew.this.f27786U4 == null || ChatActivityNew.this.f27792V4 == null)) {
                ChatActivityNew.this.f27786U4.postDelayed(ChatActivityNew.this.f27792V4, 20000);
            }
            ChatActivityNew.this.f27696F4 = false;
            ChatActivityNew.this.f27678C4 = 0;
            ChatActivityNew.this.m48212j2();
            StringBuilder sb = new StringBuilder();
            sb.append("showHideTrackingViews Height ");
            sb.append(ChatActivityNew.this.f27905o4.getHeight());
            C5880q.m25750a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("showHideTrackingViews llTrackIt Y ");
            sb2.append(ChatActivityNew.this.f27809Y3.getY());
            C5880q.m25750a(sb2.toString());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) ((-ChatActivityNew.this.f27905o4.getHeight()) + ChatActivityNew.this.f29642a.mo23601d(56))});
            ofFloat.setDuration((long) ChatActivityNew.this.f27897n2);
            ofFloat.addUpdateListener(new C10398a());
            ofFloat.start();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) ChatActivityNew.this.f27897n2);
            alphaAnimation.setFillAfter(false);
            ChatActivityNew.this.f27815Z3.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new C10399b());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p */
    class C10401p implements OnClickListener {
        C10401p() {
        }

        public void onClick(View view) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m47913K(chatActivityNew.getString(C10232R.string.lbl_see_route));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p0 */
    class C10402p0 extends CountDownTimer {
        C10402p0(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            ChatActivityNew.this.f27788V0.setEnabled(true);
            ChatActivityNew.this.f27908p1.setVisibility(8);
            ChatActivityNew.this.f27956w1.setVisibility(8);
        }

        public void onTick(long j) {
            ChatActivityNew.this.f27922r2 = j / 1000;
            TextView Z0 = ChatActivityNew.this.f27758Q0;
            StringBuilder sb = new StringBuilder();
            sb.append("00:0");
            sb.append(ChatActivityNew.this.f27922r2);
            Z0.setText(sb.toString());
            ChatActivityNew.this.f27956w1.setProgress((int) (100 - ((j * 100) / ((ChatActivityNew.this.f27929s2 != null ? ChatActivityNew.this.f27929s2.getOfferDelaySec() : 1) * 1000))));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p1 */
    class C10403p1 implements OnClickListener {
        C10403p1() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.f27895m6.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p2 */
    class C10404p2 implements Callback<ServiceManualDefaultBean> {
        C10404p2() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23653q0();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            String str = "";
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 250) {
                            ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4);
                            ChatActivityNew.this.mo37669e(false);
                            ChatActivityNew.this.m48089b(ChatActivityNew.this.f27936t2);
                            ChatActivityNew.this.m48369y1();
                            C11644i.f33136L6 = false;
                            C11694e eVar = C11694e.INSTANCE;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                            eVar.mo40206d(sb.toString(), ChatActivityNew.this.f27825b2);
                            ChatActivityNew.this.m47868D(C11644i.f33181R3);
                            ChatActivityNew.this.m47868D(C11644i.f33205U3);
                            ChatActivityNew.this.m48200i1();
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            }
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 300) {
                            ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_change_courier, false);
                            if (ChatActivityNew.this.f27944u3 != null) {
                                ChatActivityNew.this.f27944u3.dismiss();
                            }
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                        } else if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                            ChatActivityNew.this.mo37664a(((ServiceManualDefaultBean) response.body()).getMessages() != null ? ((ServiceManualDefaultBean) response.body()).getMessages().toString() : ((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name), false);
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                            ChatActivityNew.this.mo37664a(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name), true);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Call Un success:");
                        sb2.append(response);
                        C5880q.m25751b(sb2.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p3 */
    class C10405p3 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28144a;

        C10405p3(Dialog dialog) {
            this.f28144a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28144a.dismiss();
                ChatActivityNew.this.finishActivity();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$p4 */
    class C10406p4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f28147a;

        /* renamed from: b */
        final /* synthetic */ Dialog f28148b;

        C10406p4(boolean z, Dialog dialog) {
            this.f28147a = z;
            this.f28148b = dialog;
        }

        public void onClick(View view) {
            if (this.f28147a) {
                this.f28148b.dismiss();
            } else if (ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew.this.m48015a(0, 3, true);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q */
    class C10407q implements Callback<ServiceManualDefaultBean> {
        C10407q() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    try {
                        chatActivityNew.m48226l(3);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        ServiceManualDefaultBean serviceManualDefaultBean = (ServiceManualDefaultBean) response.body();
                        if (serviceManualDefaultBean.getCode().intValue() <= 250) {
                            ChatActivityNew.this.m48035a((ServiceManualDefaultBean) response.body());
                        } else if (serviceManualDefaultBean.getCode().intValue() == 300) {
                            ChatActivityNew.this.m48226l(3);
                            ChatActivityNew.this.f29642a.mo23615f(serviceManualDefaultBean.getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finish();
                            }
                        } else {
                            ChatActivityNew.this.m48226l(3);
                            ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage() != null ? ((ServiceManualDefaultBean) response.body()).getMessage() : ((ServiceManualDefaultBean) response.body()).getMessages(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    } else {
                        ChatActivityNew.this.m48226l(3);
                        ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q0 */
    class C10408q0 implements Callback<PaymentStatusBean> {

        /* renamed from: a */
        final /* synthetic */ String f28150a;

        C10408q0(String str) {
            this.f28150a = str;
        }

        public void onFailure(Call<PaymentStatusBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<PaymentStatusBean> call, Response<PaymentStatusBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (!response.isSuccessful()) {
                        if (ChatActivityNew.this.f27950v2 != null) {
                            ChatActivityNew.this.f27950v2.dismiss();
                        }
                        ChatActivityNew.this.f29642a.mo23487L(response.message());
                    } else if (((PaymentStatusBean) response.body()).getCode().intValue() >= 300) {
                        if (ChatActivityNew.this.f27950v2 != null) {
                            ChatActivityNew.this.f27950v2.dismiss();
                        }
                        ChatActivityNew.this.f29642a.mo23487L(((PaymentStatusBean) response.body()).getMessage());
                    } else if (((PaymentStatusBean) response.body()).getPaymentHash().isPaid()) {
                        if (ChatActivityNew.this.f27950v2 != null) {
                            ChatActivityNew.this.f27950v2.dismiss();
                        }
                        ChatActivityNew.this.f27929s2.setPaid(true);
                        if (ChatActivityNew.this.f27855g2) {
                            ChatActivityNew.this.m48129c2();
                        }
                    } else if (this.f28150a.equalsIgnoreCase("from_pay_now")) {
                        if (ChatActivityNew.this.f29642a.mo23502X()) {
                            try {
                                ChatActivityNew.this.m47845A(ChatActivityNew.this.f29642a.mo23655r(((PaymentStatusBean) response.body()).getPaymentHash().getPaymentData().getDeeplink()));
                            } catch (Exception unused) {
                            }
                        }
                        if (ChatActivityNew.this.f27950v2 != null) {
                            ChatActivityNew.this.f27950v2.dismiss();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q1 */
    class C10409q1 implements OnClickListener {
        C10409q1() {
        }

        public void onClick(View view) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            C5887x xVar = chatActivityNew.f29642a;
            if (xVar != null) {
                xVar.mo23673x(chatActivityNew.f27929s2.getOrderDetailBill().getImage());
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q2 */
    class C10410q2 implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ int f28153a;

        C10410q2(int i) {
            this.f28153a = i;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    try {
                        xVar.mo23492O();
                        ChatActivityNew.this.f29642a.mo23653q0();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 250) {
                            String str = "";
                            if (this.f28153a == 0) {
                                C11694e eVar = C11694e.INSTANCE;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                                eVar.mo40206d(sb.toString(), ChatActivityNew.this.f27825b2);
                                ChatActivityNew.this.m48019a(8, ChatActivityNew.this.f27785U3, ChatActivityNew.this.f27821a4);
                                ChatActivityNew.this.mo37669e(false);
                                ChatActivityNew.this.m48369y1();
                                try {
                                    if (C11644i.f33437w) {
                                        ChatActivityNew.this.f27676C2.mo39865a(ChatActivityNew.this.f27676C2.mo39861a(ChatActivityNew.this.f27929s2.getOrderOffer().getOffer_received_at()), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), ChatActivityNew.this.f27929s2.getOrder().getfBuyerRatings(), ChatActivityNew.this.f27929s2.getOrder().getfCourierRatings(), ((CancelReasonBean) ChatActivityNew.this.f27713I3.get(ChatActivityNew.this.f27725K3.getSelectedItemPosition())).getReason(), String.valueOf(ChatActivityNew.this.f27929s2.getOrder().getiOrderId()), ChatActivityNew.this.f27676C2.mo39860a());
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                C11644i.f33136L6 = false;
                            }
                            C11694e eVar2 = C11694e.INSTANCE;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                            eVar2.mo40206d(sb2.toString(), ChatActivityNew.this.f27825b2);
                            ChatActivityNew.this.m47868D(C11644i.f33181R3);
                            ChatActivityNew.this.m47868D(C11644i.f33205U3);
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            }
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 300) {
                            ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getResources().getString(C10232R.string.app_name));
                            ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_change_courier, false);
                            if (ChatActivityNew.this.f27944u3 != null) {
                                ChatActivityNew.this.f27944u3.dismiss();
                            }
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                        } else if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                            ChatActivityNew.this.mo37664a(((ServiceManualDefaultBean) response.body()).getMessages() != null ? ((ServiceManualDefaultBean) response.body()).getMessages().toString() : ((ServiceManualDefaultBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name), false);
                        }
                    } else {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                            ChatActivityNew.this.mo37664a(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name), false);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q3 */
    class C10411q3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28155a;

        /* renamed from: com.mrsool.chat.ChatActivityNew$q3$a */
        class C10412a implements Runnable {
            C10412a() {
            }

            public void run() {
                ChatActivityNew.this.m47868D(C11644i.f33189S3);
                ChatActivityNew.this.m47868D(C11644i.f33197T3);
            }
        }

        C10411q3(Dialog dialog) {
            this.f28155a = dialog;
        }

        public void onClick(View view) {
            try {
                if (ChatActivityNew.this.m48075a1().equalsIgnoreCase(ChatActivityNew.this.getString(C10232R.string.lbl_shop_detail))) {
                    ChatActivityNew.this.m47868D(C11644i.f33157O3);
                } else if (!ChatActivityNew.this.m48075a1().equalsIgnoreCase(ChatActivityNew.this.getString(C10232R.string.lbl_my_delivery)) && !ChatActivityNew.this.m48075a1().equalsIgnoreCase(ChatActivityNew.this.getString(C10232R.string.lbl_frg_notification))) {
                    ChatActivityNew.this.m47868D(C11644i.f33181R3);
                    ChatActivityNew.this.m47868D(C11644i.f33205U3);
                    new Handler().postDelayed(new C10412a(), 200);
                }
                ChatActivityNew.this.m48018a((int) C10232R.C10236id.action_file_a_compaint, true);
                this.f28155a.dismiss();
                ChatActivityNew.this.onBackPressed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$q4 */
    class C10413q4 implements OnClickListener {
        C10413q4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.f27779T3.hide();
            ChatActivityNew.this.m47877E0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r */
    class C10414r implements Callback<CallOptionsMainBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f28159a;

        C10414r(boolean z) {
            this.f28159a = z;
        }

        public void onFailure(Call<CallOptionsMainBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    chatActivityNew.m48299r(false);
                    ChatActivityNew.this.f29642a.mo23492O();
                    ChatActivityNew.this.f29642a.mo23653q0();
                }
            }
        }

        public void onResponse(Call<CallOptionsMainBean> call, Response<CallOptionsMainBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f29642a != null) {
                    try {
                        if (this.f28159a) {
                            chatActivityNew.m48299r(false);
                        }
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (response.isSuccessful()) {
                            ChatActivityNew.this.f27761Q3 = (CallOptionsMainBean) response.body();
                            if (ChatActivityNew.this.f27761Q3.getCode().intValue() <= 300) {
                                ChatActivityNew.this.m48121c(ChatActivityNew.this.f27761Q3.getCall_options());
                                String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                                if (!TextUtils.isEmpty(a)) {
                                    ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("", a));
                                    ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                                }
                            } else if (((CallOptionsMainBean) response.body()).getCode().intValue() == 402) {
                                if (!ChatActivityNew.this.isDestroyed()) {
                                    ChatActivityNew.this.finish();
                                }
                            } else {
                                ChatActivityNew.this.f29642a.mo23615f(ChatActivityNew.this.f27761Q3.getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                            }
                        } else {
                            ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        ChatActivityNew.this.f29642a.mo23492O();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r0 */
    class C10415r0 implements Runnable {

        /* renamed from: N */
        final /* synthetic */ float f28161N;

        /* renamed from: O */
        final /* synthetic */ float f28162O;

        /* renamed from: P */
        final /* synthetic */ Marker f28163P;

        /* renamed from: Q */
        final /* synthetic */ Handler f28164Q;

        /* renamed from: a */
        final /* synthetic */ long f28166a;

        /* renamed from: b */
        final /* synthetic */ Interpolator f28167b;

        C10415r0(long j, Interpolator interpolator, float f, float f2, Marker marker, Handler handler) {
            this.f28166a = j;
            this.f28167b = interpolator;
            this.f28161N = f;
            this.f28162O = f2;
            this.f28163P = marker;
            this.f28164Q = handler;
        }

        public void run() {
            float interpolation = this.f28167b.getInterpolation(((float) (SystemClock.uptimeMillis() - this.f28166a)) / 500.0f);
            float f = (this.f28161N * interpolation) + ((1.0f - interpolation) * this.f28162O);
            Marker marker = this.f28163P;
            if ((-f) > 180.0f) {
                f /= 2.0f;
            }
            marker.setRotation(f);
            if (((double) interpolation) < 1.0d) {
                this.f28164Q.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r1 */
    class C10416r1 implements C10511r {
        C10416r1() {
        }

        /* renamed from: a */
        public void mo37780a(int i) {
            if (ChatActivityNew.this.f27795W1.size() > 0 && ((messages) ChatActivityNew.this.f27795W1.get(i)).getvType().equalsIgnoreCase("complaint") && !TextUtils.isEmpty(((messages) ChatActivityNew.this.f27795W1.get(i)).getiAddress())) {
                if (ChatActivityNew.this.f27855g2) {
                    Intent intent = new Intent(ChatActivityNew.this, ComplaintDetailActivity.class);
                    intent.putExtra(C11644i.f33439w1, ((messages) ChatActivityNew.this.f27795W1.get(i)).getiAddress());
                    intent.putExtra(C11644i.f33043A1, true);
                    ChatActivityNew.this.startActivity(intent);
                    return;
                }
                ChatActivityNew.this.m48063a(Boolean.valueOf(false), ((messages) ChatActivityNew.this.f27795W1.get(i)).getiAddress());
            }
        }

        /* renamed from: b */
        public void mo37781b(int i) {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            String a = C11718b.m52720a((Context) chatActivityNew, true, chatActivityNew.f27825b2);
            StringBuilder sb = new StringBuilder();
            sb.append(((messages) ChatActivityNew.this.f27929s2.getMessages().get(i)).getvMessageId());
            sb.append(C11718b.f33921m);
            C11718b.m52714a(a, sb.toString()).exists();
        }

        /* renamed from: c */
        public void mo37782c(int i) {
            if (!TextUtils.isEmpty(((messages) ChatActivityNew.this.f27795W1.get(i)).getTxContent())) {
                Intent intent = new Intent(ChatActivityNew.this, ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((messages) ChatActivityNew.this.f27795W1.get(i)).getTxContent());
                ChatActivityNew.this.startActivity(intent);
            }
        }

        /* renamed from: d */
        public void mo37783d(int i) {
            String str = ",";
            if (((messages) ChatActivityNew.this.f27795W1.get(i)).getTxContent().contains(str)) {
                String[] split = ((messages) ChatActivityNew.this.f27795W1.get(i)).getTxContent().split(str);
                if (split.length > 1) {
                    Intent intent = new Intent(ChatActivityNew.this, ViewLocationActivity.class);
                    intent.putExtra(C11644i.f33341k1, split[0]);
                    intent.putExtra(C11644i.f33350l1, split[1]);
                    intent.putExtra(C11644i.f33147N1, ChatActivityNew.this.f27743N3);
                    intent.putExtra(C11644i.f33391q1, ((messages) ChatActivityNew.this.f27795W1.get(i)).getVtxTitle());
                    intent.putExtra(C11644i.f33163P1, ((messages) ChatActivityNew.this.f27795W1.get(i)).getiAddress());
                    ChatActivityNew.this.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r2 */
    class C10417r2 implements C11673d {
        C10417r2() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            Intent intent = new Intent(ChatActivityNew.this, TakeImages.class);
            intent.putExtra("PicType", ChatActivityNew.this.getString(C10232R.string.lbl_dg_title_both));
            intent.putExtra("pictureRatio", "1,1");
            ChatActivityNew.this.startActivityForResult(intent, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r3 */
    class C10418r3 implements AnimatorUpdateListener {
        C10418r3() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!ChatActivityNew.this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3) || !ChatActivityNew.this.f27929s2.isShowPay()) {
                ChatActivityNew.this.f27809Y3.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ChatActivityNew.this.f27809Y3.setVisibility(8);
                return;
            }
            ChatActivityNew.this.f27809Y3.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ChatActivityNew.this.m48346w(true);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$r4 */
    class C10419r4 implements OnClickListener {
        C10419r4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.f27779T3.hide();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s */
    class C10420s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f28172a;

        C10420s(Builder builder) {
            this.f28172a = builder;
        }

        /* renamed from: a */
        public /* synthetic */ void mo37786a(int i, int i2) {
            ChatActivityNew.this.f27888l5.setPadding(20, i, i2, ChatActivityNew.this.f27809Y3.getHeight());
        }

        public void run() {
            try {
                Drawable drawable = ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_tracking_pin_pickup_new);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                ChatActivityNew.this.getResources().getDrawable(C10232R.C10235drawable.ic_car).getIntrinsicWidth();
                ChatActivityNew.this.f27809Y3.post(new C10481a(this, intrinsicHeight, intrinsicWidth));
                ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f28172a.build(), 1, 1, 0));
            } catch (Exception e) {
                if (ChatActivityNew.this.f27888l5 != null) {
                    ChatActivityNew.this.f27888l5.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                }
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s0 */
    class C10421s0 implements Callback<DefaultBean> {
        C10421s0() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (!response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                    } else if (((DefaultBean) response.body()).getCode().intValue() < 300) {
                        if (ChatActivityNew.this.f27950v2 != null) {
                            ChatActivityNew.this.f27950v2.dismiss();
                        }
                        ChatActivityNew.this.f29642a.mo23491N(((DefaultBean) response.body()).getMessage());
                    } else {
                        ChatActivityNew.this.f29642a.mo23615f(((DefaultBean) response.body()).getMessage(), ChatActivityNew.this.getString(C10232R.string.app_name));
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s1 */
    class C10422s1 implements OnFocusChangeListener {
        C10422s1() {
        }

        public void onFocusChange(View view, boolean z) {
            C5880q.m25751b("onfocus");
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s2 */
    class C10423s2 implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ TextView f28176a;

        /* renamed from: com.mrsool.chat.ChatActivityNew$s2$a */
        class C10424a implements Runnable {
            C10424a() {
            }

            public void run() {
                ChatActivityNew.this.m48230l(true);
            }
        }

        C10423s2(TextView textView) {
            this.f28176a = textView;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (this.f28176a != null) {
                        this.f28176a.setEnabled(true);
                    }
                    ChatActivityNew.this.m48255n0();
                    ChatActivityNew.this.f29642a.mo23492O();
                    ChatActivityNew.this.f29642a.mo23615f(ChatActivityNew.this.getString(C10232R.string.msg_error_server_issue), ChatActivityNew.this.getString(C10232R.string.app_name));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            String str = "";
            if (!ChatActivityNew.this.isFinishing() && ChatActivityNew.this.f29642a != null) {
                try {
                    if (this.f28176a != null) {
                        this.f28176a.setEnabled(true);
                    }
                    if (response.isSuccessful()) {
                        ChatActivityNew.this.f29642a.mo23492O();
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                            ChatActivityNew.this.m48178g1();
                            if (ChatActivityNew.this.f27936t2 != null) {
                                ChatActivityNew.this.f27936t2.dismiss();
                            }
                            ChatActivityNew.this.m48330u0();
                            try {
                                C6009d.m27516c(ChatActivityNew.this.getApplicationContext()).mo24810e(ChatActivityNew.this.getResources().getString(C10232R.string.branch_event_accept_offer));
                                if (C11644i.f33437w) {
                                    ChatActivityNew.this.f27676C2.mo39872d(ChatActivityNew.this.f27676C2.mo39860a(), String.valueOf(ChatActivityNew.this.f27929s2.getOrderOffer().getdDiscountCost()), ChatActivityNew.this.f27825b2);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            messages messages = new messages();
                            messages.setiFromUserId(ChatActivityNew.this.f29642a.mo23476G());
                            messages.setiToOrderID(ChatActivityNew.this.f27825b2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                            messages.setiToUserId(sb.toString());
                            C11694e.INSTANCE.mo40194a(messages);
                            C11694e eVar = C11694e.INSTANCE;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(ChatActivityNew.this.f27929s2.getOrderOffer().getCourierId());
                            eVar.mo40208e(sb2.toString(), ChatActivityNew.this.f27825b2);
                            ChatActivityNew.this.m47868D(C11644i.f33181R3);
                            ChatActivityNew.this.m47868D(C11644i.f33205U3);
                            String a = ChatActivityNew.this.f29642a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean("from accept", a));
                                ChatActivityNew.this.f29642a.mo23553a((C11056p) ChatActivityNew.this);
                            } else {
                                ChatActivityNew.this.m47935O0();
                                new Handler().postDelayed(new C10424a(), 10);
                            }
                            if (ChatActivityNew.this.f27936t2 != null) {
                                ChatActivityNew.this.f27936t2.dismiss();
                            }
                        } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                            if (!ChatActivityNew.this.isDestroyed()) {
                                ChatActivityNew.this.finishActivity();
                            }
                        } else {
                            ChatActivityNew.this.m48255n0();
                            if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                                ChatActivityNew.this.f29642a.mo23492O();
                                ChatActivityNew.this.f29642a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage() != null ? ((ServiceManualDefaultBean) response.body()).getMessage() : ((ServiceManualDefaultBean) response.body()).getMessages(), ChatActivityNew.this.getString(C10232R.string.app_name));
                            }
                        }
                    } else {
                        ChatActivityNew.this.m48255n0();
                        if (!(ChatActivityNew.this.f29642a == null || ChatActivityNew.this.f27927s0 == null)) {
                            ChatActivityNew.this.f29642a.mo23492O();
                            ChatActivityNew.this.f29642a.mo23615f(response.message(), ChatActivityNew.this.getString(C10232R.string.app_name));
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s3 */
    class C10425s3 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28179a;

        C10425s3(Dialog dialog) {
            this.f28179a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28179a.dismiss();
                ChatActivityNew.this.finishActivity();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$s4 */
    class C10426s4 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28181a;

        C10426s4(Dialog dialog) {
            this.f28181a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28181a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t */
    class C10427t implements OnCameraMoveStartedListener {
        C10427t() {
        }

        public void onCameraMoveStarted(int i) {
            if (i == 1) {
                C5880q.m25751b("MAP : REASON_GESTURE");
                ChatActivityNew.this.f27828b5 = false;
                ChatActivityNew.this.m48329u(true);
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t0 */
    class C10428t0 implements C11673d {
        C10428t0() {
        }

        /* renamed from: a */
        static /* synthetic */ void m48440a(C15035b bVar) {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            ChatActivityNew.this.f27801X1.mo37866k();
            C11720d.m52774l();
            ChatActivityNew.this.f27745N5 = C15042f.m66698b(new C15048b(C2794c.m13407a(C2799c.MIC, C2796a.MONO, C2798b.HZ_8000), (C15050d) C10484d.f28340a), new File(C11718b.m52753j((Context) ChatActivityNew.this)));
            ChatActivityNew.this.f27745N5.mo46686c();
            ChatActivityNew.this.m48379z2();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t1 */
    class C10429t1 implements OnEditorActionListener {
        C10429t1() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            ChatActivityNew.this.f29642a.mo23494P();
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t2 */
    class C10430t2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f28187a;

        /* renamed from: b */
        final /* synthetic */ int f28188b;

        C10430t2(List list, int i) {
            this.f28187a = list;
            this.f28188b = i;
        }

        public void onClick(View view) {
            ChatActivityNew.this.f29642a.mo23618g(((CallOptionsBean) this.f28187a.get(this.f28188b)).getPhone_no());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t3 */
    class C10431t3 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28189a;

        C10431t3(Dialog dialog) {
            this.f28189a = dialog;
        }

        public void onClick(View view) {
            try {
                ChatActivityNew.this.m47868D(C11644i.f33157O3);
                this.f28189a.dismiss();
                ChatActivityNew.this.onBackPressed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$t4 */
    class C10432t4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28191a;

        C10432t4(Dialog dialog) {
            this.f28191a = dialog;
        }

        public void onClick(View view) {
            this.f28191a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u */
    class C10433u implements OnGlobalLayoutListener {
        C10433u() {
        }

        public void onGlobalLayout() {
            if (ChatActivityNew.this.f27963x1.getRootView().getHeight() - ChatActivityNew.this.f27963x1.getHeight() >= 500) {
                C5880q.m25751b("Keyboard opens...");
                if (!ChatActivityNew.this.m47996Z1()) {
                    if (VERSION.SDK_INT >= 21) {
                        ChatActivityNew.this.f27911p4.setElevation(1.0f);
                    }
                    ChatActivityNew chatActivityNew = ChatActivityNew.this;
                    chatActivityNew.m48101b(false, (View) chatActivityNew.f27827b4);
                    ChatActivityNew.this.f27785U3.setVisibility(8);
                    ChatActivityNew.this.f27696F4 = true;
                    ChatActivityNew.this.f27685D5 = true;
                    ChatActivityNew.this.mo38430K();
                }
            } else if (ChatActivityNew.this.f27685D5) {
                ChatActivityNew.this.f27685D5 = false;
                C5880q.m25751b("Keyboard closed...");
                if (ChatActivityNew.this.f27696F4) {
                    ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                    chatActivityNew2.m48101b(true, (View) chatActivityNew2.f27827b4);
                    ChatActivityNew.this.f27785U3.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u0 */
    class C10434u0 implements C11673d {
        C10434u0() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u1 */
    class C10435u1 extends C3902d {
        C10435u1() {
        }

        /* renamed from: c */
        public void mo17227c() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.mo37657a((View) chatActivityNew.f27707H3, 180.0f, 0.0f).start();
            ChatActivityNew.this.f27677C3.setExpanded(false);
        }

        /* renamed from: e */
        public void mo17229e() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.mo37657a((View) chatActivityNew.f27707H3, 0.0f, 180.0f).start();
            ChatActivityNew.this.f27677C3.setExpanded(true);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u2 */
    class C10436u2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28197a;

        /* renamed from: b */
        final /* synthetic */ List f28198b;

        C10436u2(Dialog dialog, List list) {
            this.f28197a = dialog;
            this.f28198b = list;
        }

        public void onClick(View view) {
            this.f28197a.dismiss();
            ChatActivityNew.this.f29642a.mo23618g(((CallOptionsBean) this.f28198b.get(0)).getPhone_no());
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u3 */
    class C10437u3 implements OnKeyListener {
        C10437u3() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                ChatActivityNew.this.f27910p3.dismiss();
                ChatActivityNew.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$u4 */
    class C10438u4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28200a;

        C10438u4(Dialog dialog) {
            this.f28200a = dialog;
        }

        public void onClick(View view) {
            this.f28200a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v */
    class C10439v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11471d f28203a;

        /* renamed from: b */
        final /* synthetic */ C11460a f28204b;

        C10439v(C11471d dVar, C11460a aVar) {
            this.f28203a = dVar;
            this.f28204b = aVar;
        }

        public void run() {
            C11471d.m51814b(ChatActivityNew.this.f27720J4, new LatLng(ChatActivityNew.this.f27714I4.getLatitude(), ChatActivityNew.this.f27714I4.getLongitude()), this.f28204b);
            if (ChatActivityNew.this.f27828b5) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                chatActivityNew.m48068a(chatActivityNew.f27816Z4, true);
            } else {
                ChatActivityNew.this.f27888l5.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(ChatActivityNew.this.f27714I4.getLatitude(), ChatActivityNew.this.f27714I4.getLongitude()), ChatActivityNew.this.f27888l5.getCameraPosition().zoom, ChatActivityNew.this.f27888l5.getCameraPosition().tilt, ChatActivityNew.this.f27888l5.getCameraPosition().bearing)), 500, null);
            }
            ChatActivityNew.this.f27858g5 = false;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v0 */
    class C10440v0 extends TimerTask {
        C10440v0() {
        }

        public void run() {
            try {
                if (ChatActivityNew.this.f29642a.mo23620g()) {
                    if (!C11694e.m52677u().mo40215k()) {
                        ChatActivityNew.this.f29642a.mo23626i();
                    }
                    ChatActivityNew.this.f27793V5.cancel();
                    ChatActivityNew.this.f27793V5 = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v1 */
    class C10441v1 implements OnClickListener {
        C10441v1() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.f27677C3.setExpanded(false);
            ChatActivityNew.this.f27677C3.toggle();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v2 */
    class C10442v2 implements OnClickListener {
        C10442v2() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.f27889l6.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v3 */
    class C10443v3 implements OnClickListener {
        C10443v3() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.finish();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$v4 */
    class C10444v4 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28209a;

        C10444v4(Dialog dialog) {
            this.f28209a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28209a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w */
    class C10445w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28211a;

        C10445w(String str) {
            this.f28211a = str;
        }

        public void run() {
            ChatActivityNew.this.f29642a.mo23489M(this.f28211a);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w0 */
    class C10446w0 implements Callback<ComplaintTokenBean> {

        /* renamed from: a */
        final /* synthetic */ Boolean f28213a;

        /* renamed from: b */
        final /* synthetic */ String f28214b;

        C10446w0(Boolean bool, String str) {
            this.f28213a = bool;
            this.f28214b = str;
        }

        public void onFailure(Call<ComplaintTokenBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ComplaintTokenBean> call, Response<ComplaintTokenBean> response) {
            try {
                ChatActivityNew.this.f29642a.mo23492O();
                if (!response.isSuccessful()) {
                    ChatActivityNew.this.f29642a.mo23487L(response.message());
                } else if (((ComplaintTokenBean) response.body()).getCode().intValue() > 300) {
                    ChatActivityNew.this.f29642a.mo23487L(((ComplaintTokenBean) response.body()).getMessage());
                } else if (this.f28213a.booleanValue()) {
                    if (!TextUtils.isEmpty(((ComplaintTokenBean) response.body()).getToken())) {
                        Intent intent = new Intent(ChatActivityNew.this, AdvanceWebviewActivity.class);
                        intent.putExtra(C11644i.f33391q1, ChatActivityNew.this.getResources().getString(C10232R.string.title_file_a_compaint));
                        intent.putExtra(C11644i.f33383p1, ChatActivityNew.this.m48272p(((ComplaintTokenBean) response.body()).getToken()));
                        ChatActivityNew.this.startActivityForResult(intent, 113);
                    }
                } else if (!TextUtils.isEmpty(((ComplaintTokenBean) response.body()).getToken())) {
                    Intent intent2 = new Intent(ChatActivityNew.this, AdvanceWebviewActivity.class);
                    intent2.putExtra(C11644i.f33391q1, ChatActivityNew.this.getResources().getString(C10232R.string.lbl_my_filed_complaint));
                    intent2.putExtra(C11644i.f33383p1, ChatActivityNew.this.m48112c(((ComplaintTokenBean) response.body()).getToken(), this.f28214b));
                    ChatActivityNew.this.startActivity(intent2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w1 */
    class C10447w1 implements OnSeekBarChangeListener {
        C10447w1() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            MediaPlayer mediaPlayer = ChatActivityNew.this.f27733L5;
            if (mediaPlayer == null) {
                return;
            }
            if (mediaPlayer.getCurrentPosition() >= ChatActivityNew.this.f27733L5.getDuration()) {
                if (ChatActivityNew.this.f27733L5.isPlaying()) {
                    ChatActivityNew.this.f27733L5.stop();
                }
                ChatActivityNew.this.f27727K5.getPlayPauseImageView().setTag(Integer.valueOf(0));
                ChatActivityNew.this.f27727K5.getPlayPauseImageView().setImageResource(C10232R.C10235drawable.img_play_new);
                TextView timerTextView = ChatActivityNew.this.f27727K5.getTimerTextView();
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                timerTextView.setText(chatActivityNew.f29642a.mo23587c((double) chatActivityNew.f27733L5.getDuration()));
                ChatActivityNew.this.f27727K5.getSeekBar().setProgress(0);
            } else if (ChatActivityNew.this.f27733L5.isPlaying()) {
                TextView timerTextView2 = ChatActivityNew.this.f27727K5.getTimerTextView();
                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                timerTextView2.setText(chatActivityNew2.f29642a.mo23587c((double) chatActivityNew2.f27733L5.getCurrentPosition()));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaPlayer mediaPlayer = ChatActivityNew.this.f27733L5;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                ChatActivityNew.this.f27733L5.seekTo(seekBar.getProgress());
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w2 */
    class C10448w2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28217a;

        C10448w2(Dialog dialog) {
            this.f28217a = dialog;
        }

        public void onClick(View view) {
            this.f28217a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w3 */
    class C10449w3 implements OnClickListener {
        C10449w3() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48231l0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$w4 */
    class C10450w4 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28220a;

        C10450w4(Dialog dialog) {
            this.f28220a = dialog;
        }

        public void onClick(View view) {
            this.f28220a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x */
    class C10451x implements C11997b {
        C10451x() {
        }

        /* renamed from: a */
        public void mo37813a(String str) {
            C5880q.m25751b("PUSHER:Channel subscribed...");
            ChatActivityNew.this.f27876j5 = true;
        }

        /* renamed from: a */
        public void mo37682a(String str, String str2, String str3) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x0 */
    class C10452x0 implements Callback<DefaultBean> {
        C10452x0() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (!ChatActivityNew.this.isFinishing()) {
                C5887x xVar = ChatActivityNew.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                    ChatActivityNew.this.f27662A0.setEnabled(true);
                }
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                ChatActivityNew.this.f29642a.mo23492O();
                if (!response.isSuccessful()) {
                    ChatActivityNew.this.f29642a.mo23487L(response.message());
                    ChatActivityNew.this.f27662A0.setEnabled(true);
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    ChatActivityNew.this.f29642a.mo23473E(C11644i.f33299f4);
                    ChatActivityNew.this.f27662A0.setEnabled(true);
                } else {
                    ChatActivityNew.this.f29642a.mo23487L(((DefaultBean) response.body()).getMessage());
                    ChatActivityNew.this.f27662A0.setEnabled(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x1 */
    class C10453x1 implements Runnable {
        C10453x1() {
        }

        public void run() {
            ChatActivityNew.this.mo37653T();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x2 */
    class C10454x2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28226a;

        /* renamed from: b */
        final /* synthetic */ String f28227b;

        C10454x2(Dialog dialog, String str) {
            this.f28226a = dialog;
            this.f28227b = str;
        }

        public void onClick(View view) {
            this.f28226a.dismiss();
            ChatActivityNew.this.f29642a.mo23618g(this.f28227b);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x3 */
    class C10455x3 implements OnClickListener {
        C10455x3() {
        }

        public void onClick(View view) {
            if (ChatActivityNew.this.f29642a.mo23502X()) {
                ChatActivityNew.this.m48231l0();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$x4 */
    class C10456x4 implements OnClickListener {
        C10456x4() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.finish();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y */
    class C10457y implements C12018b {
        C10457y() {
        }

        /* renamed from: a */
        public void mo37818a(C12019c cVar) {
            if (cVar.mo41138a().toString().equalsIgnoreCase("connected")) {
                ChatActivityNew.this.m47907J("Connected...");
                C5880q.m25751b("PUSHER:Connected...");
                return;
            }
            cVar.mo41138a().toString().equalsIgnoreCase("disconnected");
        }

        /* renamed from: a */
        public void mo37819a(String str, String str2, Exception exc) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y0 */
    class C10458y0 implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ int f28231a;

        C10458y0(int i) {
            this.f28231a = i;
        }

        public void onAnimationEnd(Animation animation) {
            ChatActivityNew.this.m48330u0();
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.m48031a(chatActivityNew.f27667A5, this.f28231a);
            ChatActivityNew.this.m48226l(3);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y1 */
    class C10459y1 implements C10773n {

        /* renamed from: com.mrsool.chat.ChatActivityNew$y1$a */
        class C10460a implements C11673d {
            C10460a() {
            }

            /* renamed from: a */
            public void mo36513a() {
                C5880q.m25751b("permissionDenied...");
                ChatActivityNew.this.mo37654U();
            }

            /* renamed from: b */
            public void mo36514b() {
            }
        }

        C10459y1() {
        }

        /* renamed from: a */
        public void mo37824a(boolean z) {
            if (z) {
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                if (chatActivityNew.f27733L5 != null) {
                    chatActivityNew.f27801X1.mo37866k();
                    C11720d.m52774l();
                    ChatActivityNew.this.f27733L5.start();
                    ChatActivityNew.this.f27727K5.getSeekBar().setEnabled(true);
                    ChatActivityNew.this.f27739M5.removeCallbacks(ChatActivityNew.this.f27907o6);
                    ChatActivityNew.this.mo37653T();
                    return;
                }
                return;
            }
            MediaPlayer mediaPlayer = ChatActivityNew.this.f27733L5;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                ChatActivityNew.this.f27739M5.removeCallbacks(ChatActivityNew.this.f27907o6);
                TextView timerTextView = ChatActivityNew.this.f27727K5.getTimerTextView();
                ChatActivityNew chatActivityNew2 = ChatActivityNew.this;
                timerTextView.setText(chatActivityNew2.f29642a.mo23587c((double) chatActivityNew2.f27733L5.getDuration()));
            }
        }

        /* renamed from: b */
        public void mo37825b() {
            ChatActivityNew.this.m48140d0();
        }

        /* renamed from: c */
        public void mo37826c() {
        }

        /* renamed from: d */
        public void mo37827d() {
            try {
                if (ChatActivityNew.this.f27745N5 != null) {
                    ChatActivityNew.this.f27745N5.mo46684a();
                }
            } catch (Exception unused) {
            }
            ChatActivityNew.this.m48321t0();
            C11718b.m52741d(C11718b.m52753j((Context) ChatActivityNew.this));
            C11718b.m52741d(ChatActivityNew.this.f27709H5);
        }

        /* renamed from: e */
        public void mo37828e() {
            try {
                ChatActivityNew.this.m48352w2();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: f */
        public void mo37829f() {
            ChatActivityNew.this.f27920r0.mo40036a(C11644i.f33373o, (C11673d) new C10460a());
        }

        /* renamed from: a */
        public void mo37823a() {
            try {
                ChatActivityNew.this.f27860h1.clearFocus();
                ChatActivityNew.this.findViewById(C10232R.C10236id.focus_thief).requestFocus();
                ChatActivityNew.this.m48305r2();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y2 */
    class C10461y2 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28235a;

        C10461y2(Dialog dialog) {
            this.f28235a = dialog;
        }

        public void onClick(View view) {
            this.f28235a.dismiss();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y3 */
    class C10462y3 implements OnKeyListener {
        C10462y3() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                ChatActivityNew.this.f27972y3.dismiss();
                ChatActivityNew.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$y4 */
    class C10463y4 implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28238a;

        C10463y4(Dialog dialog) {
            this.f28238a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f28238a.dismiss();
                ChatActivityNew.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z */
    class C10464z implements C12002g {

        /* renamed from: com.mrsool.chat.ChatActivityNew$z$a */
        class C10465a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f28241a;

            C10465a(String str) {
                this.f28241a = str;
            }

            public void run() {
                ChatActivityNew.this.m47854B(this.f28241a);
            }
        }

        C10464z() {
        }

        /* renamed from: a */
        public void mo37682a(String str, String str2, String str3) {
            ChatActivityNew.this.runOnUiThread(new C10465a(str3));
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z0 */
    class C10466z0 implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ServiceManualDefaultBean f28243a;

        C10466z0(ServiceManualDefaultBean serviceManualDefaultBean) {
            this.f28243a = serviceManualDefaultBean;
        }

        public void onAnimationEnd(Animation animation) {
            ChatActivityNew.this.m48226l(3);
            ChatActivityNew.this.m48330u0();
            String a = ChatActivityNew.this.f29642a.mo23528a((Object) this.f28243a);
            String str = "withdrawBeforeOrder";
            if (!TextUtils.isEmpty(a)) {
                ChatActivityNew.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                chatActivityNew.f29642a.mo23553a((C11056p) chatActivityNew);
                return;
            }
            ChatActivityNew.this.mo36511f(str);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z1 */
    class C10467z1 implements C11673d {
        C10467z1() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            if (ChatActivityNew.this.f29642a.mo23502X() && ChatActivityNew.this.f29642a.mo23500V()) {
                C5881v D = ChatActivityNew.this.f29642a.mo23470D();
                ChatActivityNew chatActivityNew = ChatActivityNew.this;
                D.mo23449a(C11644i.f33295f0, chatActivityNew.f29642a.mo23522a((Context) chatActivityNew));
                ChatActivityNew.this.m47992Z();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z2 */
    class C10468z2 implements Runnable {
        C10468z2() {
        }

        public void run() {
            ChatActivityNew chatActivityNew = ChatActivityNew.this;
            chatActivityNew.f29642a.mo23549a(chatActivityNew.f27962x0);
            ChatActivityNew.this.f27801X1.mo7337d(ChatActivityNew.this.f27795W1.size() - 1);
            ChatActivityNew.this.m48072a0();
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z3 */
    class C10469z3 implements OnClickListener {
        C10469z3() {
        }

        public void onClick(View view) {
            ChatActivityNew.this.m48253n(false);
        }
    }

    /* renamed from: com.mrsool.chat.ChatActivityNew$z4 */
    public class C10470z4 implements OnClickListener {

        /* renamed from: a */
        private final Context f28248a;

        /* synthetic */ C10470z4(ChatActivityNew chatActivityNew, Context context, C10394o1 o1Var) {
            this(context);
        }

        public void onClick(View view) {
            if (ChatActivityNew.this.f29642a.mo23502X()) {
                int childLayoutPosition = ChatActivityNew.this.f27962x0.getChildLayoutPosition(view);
                if (ChatActivityNew.this.f27795W1.size() <= 0) {
                    return;
                }
                if (((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getvType().equalsIgnoreCase("image")) {
                    if (!TextUtils.isEmpty(((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getTxContent())) {
                        Intent intent = new Intent(ChatActivityNew.this, ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, ((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getTxContent());
                        ChatActivityNew.this.startActivity(intent);
                    }
                } else if (((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getvType().equalsIgnoreCase("location")) {
                    String str = ",";
                    if (((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getTxContent().contains(str)) {
                        String[] split = ((messages) ChatActivityNew.this.f27795W1.get(childLayoutPosition)).getTxContent().split(str);
                        if (split.length > 1) {
                            Intent intent2 = new Intent(ChatActivityNew.this, ViewLocationActivity.class);
                            intent2.putExtra(C11644i.f33341k1, split[0]);
                            intent2.putExtra(C11644i.f33350l1, split[1]);
                            ChatActivityNew.this.startActivity(intent2);
                        }
                    }
                }
            }
        }

        private C10470z4(Context context) {
            this.f28248a = context;
        }
    }

    static {
        Class<ChatActivityNew> cls = ChatActivityNew.class;
    }

    public ChatActivityNew() {
        String str = C14265s.f42076o;
        this.f27831c2 = str;
        this.f27837d2 = str;
        String str2 = "";
        this.f27843e2 = str2;
        this.f27849f2 = str2;
        this.f27855g2 = true;
        this.f27861h2 = false;
        this.f27873j2 = false;
        this.f27885l2 = false;
        this.f27891m2 = true;
        this.f27897n2 = 300;
        this.f27903o2 = 200;
        this.f27909p2 = 100;
        this.f27915q2 = 0;
        this.f27922r2 = 5;
        this.f27664A2 = str2;
        this.f27682D2 = "dd/MM/yyyy hh:mm a";
        this.f27688E2 = "hh:mm a";
        this.f27694F2 = "dd MMM yyyy";
        this.f27700G2 = 1;
        this.f27706H2 = 2;
        this.f27712I2 = 3;
        this.f27718J2 = 4;
        this.f27724K2 = 45;
        this.f27730L2 = 15;
        this.f27736M2 = 90;
        this.f27742N2 = 60;
        this.f27748O2 = "start_journey";
        this.f27754P2 = "issue_bill";
        this.f27760Q2 = "order_pickup";
        this.f27766R2 = "order_deliver";
        this.f27772S2 = "courier_arrived";
        this.f27778T2 = "send_order";
        this.f27784U2 = "timer_action";
        this.f27790V2 = "expire_portal_order";
        this.f27796W2 = "under_creation";
        this.f27802X2 = C11644i.f33307g3;
        this.f27808Y2 = "accepted";
        this.f27814Z2 = "ready";
        this.f27820a3 = "time_out";
        this.f27826b3 = "rejected";
        this.f27832c3 = 0;
        this.f27838d3 = 1;
        this.f27844e3 = 2;
        this.f27856g3 = 20000;
        this.f27862h3 = "\n";
        this.f27868i3 = str2;
        this.f27874j3 = false;
        this.f27713I3 = new ArrayList();
        this.f27731L3 = str2;
        this.f27737M3 = false;
        this.f27749O3 = false;
        this.f27755P3 = false;
        this.f27767R3 = new ArrayList<>();
        this.f27773S3 = false;
        this.f27678C4 = 0;
        this.f27696F4 = false;
        this.f27810Y4 = new ArrayList<>();
        this.f27816Z4 = new ArrayList<>();
        this.f27828b5 = true;
        this.f27834c5 = 18.0f;
        this.f27858g5 = false;
        this.f27876j5 = false;
        this.f27882k5 = "courier-test-channel";
        this.f27900n5 = null;
        this.f27918q5 = 3;
        this.f27925r5 = 4;
        this.f27932s5 = 1;
        this.f27939t5 = 2;
        this.f27946u5 = "CancelOffer";
        this.f27953v5 = "withdrawOrder";
        this.f27960w5 = "CancelReasonList";
        this.f27967x5 = "OrderDelivered";
        this.f27974y5 = "withdrawBeforeOrder";
        this.f27981z5 = str2;
        this.f27679C5 = 5;
        this.f27685D5 = false;
        this.f27691E5 = false;
        this.f27697F5 = false;
        this.f27739M5 = new Handler();
        this.f27751O5 = 6000;
        this.f27757P5 = C14236a.DEFAULT_TIMEOUT;
        this.f27763Q5 = 12000;
        this.f27799W5 = Boolean.valueOf(false);
        this.f27805X5 = true;
        this.f27811Y5 = false;
        this.f27817Z5 = false;
        this.f27877j6 = true;
        this.f27907o6 = new C10453x1();
        this.f27913p6 = 0;
        this.f27919q6 = 0;
        this.f27926r6 = 0;
        this.f27933s6 = 0;
        this.f27940t6 = 0;
        this.f27947u6 = false;
        this.f27954v6 = false;
        this.f27968x6 = new C10359j();
        this.f27975y6 = new C10433u();
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public void m47851A2() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("buyer_payment_option_id", "1");
            C11687c.m52645a(this.f29642a).changePaymentMethod(this.f27825b2, hashMap).enqueue(new C10421s0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m47859B2() {
        Timer timer = this.f27775S5;
        if (timer != null) {
            timer.cancel();
        }
        this.f27775S5 = new Timer();
        this.f27775S5.schedule(new C10338f2(), (long) this.f27751O5);
    }

    /* renamed from: b */
    private void m48090b(RatingBar ratingBar, int i) {
    }

    /* access modifiers changed from: private */
    public void finishActivity() {
        if (this.f27697F5) {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
            return;
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m48174g(boolean z) {
    }

    /* access modifiers changed from: private */
    public void initViews() {
        m47984X1();
        f27661z6 = this;
        this.f27920r0 = new C11669t(this);
        this.f27927s0 = (AppSingleton) getApplicationContext();
        this.f27670B2 = getIntent().getExtras();
        this.f27715I5 = new C11614c(this);
        this.f27721J5 = new C11615d(this);
        Bundle bundle = this.f27670B2;
        if (bundle != null) {
            String str = C11644i.f33215V5;
            if (bundle.containsKey(str)) {
                this.f27697F5 = this.f27670B2.getBoolean(str);
            }
        }
        this.f27676C2 = new C11617f(this);
        this.f29642a.mo23553a((C11056p) this);
        this.f27693F1 = (FrameLayout) findViewById(C10232R.C10236id.flCancel);
        this.f27705H1 = (ProgressBar) findViewById(C10232R.C10236id.pbPending);
        this.f27711I1 = (ImageView) findViewById(C10232R.C10236id.ivSuccess);
        this.f27699G1 = (ConstraintLayout) findViewById(C10232R.C10236id.flWaiting);
        this.f27717J1 = (LottieAnimationView) findViewById(C10232R.C10236id.lvProgress);
        this.f27729L1 = (TextView) findViewById(C10232R.C10236id.tvProgressTitle);
        this.f27735M1 = (TextView) findViewById(C10232R.C10236id.tvProgressMessage);
        this.f27741N1 = (TextView) findViewById(C10232R.C10236id.tvProgressCancel);
        this.f27723K1 = (LottieAnimationView) findViewById(C10232R.C10236id.lvPaymentView);
        this.f27747O1 = (ConstraintLayout) findViewById(C10232R.C10236id.clChangeOffer);
        this.f27753P1 = (TextView) findViewById(C10232R.C10236id.tvWarnChangeOffer);
        this.f27765R1 = (CardView) findViewById(C10232R.C10236id.cvChangeOffer);
        this.f27771S1 = (CardView) findViewById(C10232R.C10236id.cvWithdrawOffer);
        this.f27759Q1 = (ImageView) findViewById(C10232R.C10236id.ivWarning);
        this.f27765R1.setOnClickListener(this);
        this.f27771S1.setOnClickListener(this);
        this.f27777T1 = (ConstraintLayout) findViewById(C10232R.C10236id.clRejectedOffer);
        this.f27783U1 = (CardView) findViewById(C10232R.C10236id.cvPostOffer);
        this.f27789V1 = (CardView) findViewById(C10232R.C10236id.cvCancelOffer);
        this.f27783U1.setOnClickListener(this);
        this.f27789V1.setOnClickListener(this);
        this.f27668B0 = (TextView) this.f27948v0.findViewById(C10232R.C10236id.txtTitle);
        this.f27674C0 = (TextView) this.f27948v0.findViewById(C10232R.C10236id.txtOrderId);
        this.f27680D0 = (TextView) this.f27948v0.findViewById(C10232R.C10236id.txtOrderStatus);
        this.f27686E0 = (TextView) findViewById(C10232R.C10236id.txtUserName);
        this.f27692F0 = (TextView) findViewById(C10232R.C10236id.txtDeliveryCost);
        this.f27698G0 = (TextView) findViewById(C10232R.C10236id.txtDeliveryCostLabel);
        this.f27704H0 = (TextView) findViewById(C10232R.C10236id.txtTotalBill);
        this.f27710I0 = (TextView) findViewById(C10232R.C10236id.txtBillStatus);
        this.f27734M0 = (TextView) findViewById(C10232R.C10236id.tvRating);
        this.f27716J0 = (TextView) findViewById(C10232R.C10236id.txtUserLabel);
        this.f27672B4 = (TextView) findViewById(C10232R.C10236id.tvUnReadCount);
        this.f27672B4.setOnClickListener(this);
        this.f27722K0 = (TextView) findViewById(C10232R.C10236id.txtCancelStatus);
        this.f27728L0 = (TextView) findViewById(C10232R.C10236id.tvDistance);
        this.f27845e4 = (TextView) findViewById(C10232R.C10236id.tvDistanceAway);
        this.f27851f4 = (TextView) findViewById(C10232R.C10236id.tvTrackIt);
        boolean z = true;
        this.f27845e4.setText(String.format(getResources().getString(C10232R.string.lbl_distance_away), new Object[]{C14069f.f41343G}));
        this.f27683D3 = (TextView) findViewById(C10232R.C10236id.txtBillGoodCost);
        this.f27689E3 = (TextView) findViewById(C10232R.C10236id.txtBillDeliveryCost);
        this.f27695F3 = (TextView) findViewById(C10232R.C10236id.txtBillTotalCost);
        this.f27740N0 = (TextView) findViewById(C10232R.C10236id.tvActionMessage);
        this.f27746O0 = (TextView) findViewById(C10232R.C10236id.tvActionNext);
        this.f27662A0 = (CardView) findViewById(C10232R.C10236id.cvActionNext);
        this.f27662A0.setOnClickListener(this);
        this.f27752P0 = (TextView) findViewById(C10232R.C10236id.tvIwillDeliver);
        this.f27758Q0 = (TextView) findViewById(C10232R.C10236id.tvIwillDeliverTimer);
        this.f27764R0 = (TextView) findViewById(C10232R.C10236id.tvBillProgress);
        this.f27701G3 = (TextView) findViewById(C10232R.C10236id.tvtyping);
        this.f27769R5 = findViewById(C10232R.C10236id.llTyping);
        this.f27841d6 = (ImageView) findViewById(C10232R.C10236id.ivTooltipClose);
        this.f27847e6 = (ImageView) findViewById(C10232R.C10236id.ivToolTipArrow);
        this.f27853f6 = (TextView) findViewById(C10232R.C10236id.tvTooltipMessage);
        this.f27859g6 = (LinearLayout) findViewById(C10232R.C10236id.llToolTip);
        this.f27859g6.setOnClickListener(this);
        this.f27841d6.setOnClickListener(this);
        this.f27727K5 = (AudioRecordView) findViewById(C10232R.C10236id.recordingView);
        this.f27727K5.mo38322a((Activity) this);
        try {
            this.f27727K5.mo38324a(this.f27929s2 != null ? this.f27929s2.isEnableVoiceNote() : true);
        } catch (Exception unused) {
        }
        this.f27727K5.setDeviceWidth(m47896H0());
        this.f27727K5.setMaxRecordingTime(2);
        m47958S1();
        this.f27860h1 = this.f27727K5.getMessageView();
        this.f27976z0 = this.f27727K5.getMoreActionView();
        this.f27976z0.setOnClickListener(this);
        this.f27785U3 = (ConstraintLayout) findViewById(C10232R.C10236id.clUserInfo);
        this.f27800X0 = (LinearLayout) findViewById(C10232R.C10236id.llWaitingForCourier);
        this.f27806Y0 = (LinearLayout) findViewById(C10232R.C10236id.llCall);
        this.f27806Y0.setOnClickListener(this);
        this.f27782U0 = (FrameLayout) findViewById(C10232R.C10236id.flChatContainer);
        this.f27776T0 = (FrameLayout) findViewById(C10232R.C10236id.flBack);
        this.f27776T0.setOnClickListener(this);
        this.f27963x1 = (LinearLayout) findViewById(C10232R.C10236id.llContainerMain);
        this.f27902o1 = (LinearLayout) findViewById(C10232R.C10236id.llBill);
        this.f27902o1.setOnClickListener(this);
        this.f27908p1 = (LinearLayout) findViewById(C10232R.C10236id.llIwillDeliverTimer);
        this.f27921r1 = (LinearLayout) findViewById(C10232R.C10236id.llClientOffline);
        this.f27914q1 = (LinearLayout) findViewById(C10232R.C10236id.llDistance);
        this.f27809Y3 = (LinearLayout) findViewById(C10232R.C10236id.llTrackIt);
        this.f27815Z3 = (LinearLayout) findViewById(C10232R.C10236id.llTrackPoints);
        this.f27821a4 = (LinearLayout) findViewById(C10232R.C10236id.llTrackingMap);
        this.f27827b4 = (LinearLayout) findViewById(C10232R.C10236id.llUserTrackBar);
        this.f27833c4 = (LinearLayout) findViewById(C10232R.C10236id.llBackToChat);
        this.f27839d4 = (LinearLayout) findViewById(C10232R.C10236id.llMapControls);
        this.f27833c4.setOnClickListener(this);
        this.f27797W3 = findViewById(C10232R.C10236id.cgJournery);
        this.f27803X3 = findViewById(C10232R.C10236id.dividerForCourierReceipt);
        this.f27666A4 = (ImageView) findViewById(C10232R.C10236id.ivLocationTracking);
        this.f27666A4.setOnClickListener(this);
        this.f27872j1 = (LinearLayout) findViewById(C10232R.C10236id.llSeeRoute);
        this.f27866i1 = (LinearLayout) findViewById(C10232R.C10236id.llChatDeliver);
        this.f27878k1 = (LinearLayout) findViewById(C10232R.C10236id.llshipping);
        this.f27890m1 = (LinearLayout) findViewById(C10232R.C10236id.llTotalBill);
        this.f27896n1 = (LinearLayout) findViewById(C10232R.C10236id.llBillStatus);
        this.f27791V3 = (ConstraintLayout) findViewById(C10232R.C10236id.clAtPickUp);
        this.f27872j1.setOnClickListener(this);
        this.f27794W0 = (ConstraintLayout) findViewById(C10232R.C10236id.clActionSuggestion);
        this.f27893m4 = (RelativeLayout) findViewById(C10232R.C10236id.rlTrackPointsShop);
        this.f27899n4 = (RelativeLayout) findViewById(C10232R.C10236id.rlTrackPointsService);
        this.f27857g4 = (RelativeLayout) findViewById(C10232R.C10236id.rlDriverLeft);
        this.f27863h4 = (RelativeLayout) findViewById(C10232R.C10236id.rlAtCustomer);
        this.f27869i4 = (RelativeLayout) findViewById(C10232R.C10236id.rlAtStore);
        this.f27875j4 = (RelativeLayout) findViewById(C10232R.C10236id.rlDriverLeftService);
        this.f27881k4 = (RelativeLayout) findViewById(C10232R.C10236id.rlAtPickUp);
        this.f27887l4 = (RelativeLayout) findViewById(C10232R.C10236id.rlAtDropOff);
        this.f27905o4 = (FrameLayout) findViewById(C10232R.C10236id.flMap);
        this.f27788V0 = (FrameLayout) findViewById(C10232R.C10236id.flIwillDeliver);
        this.f27788V0.setOnClickListener(this);
        this.f27818a1 = (ImageView) findViewById(C10232R.C10236id.ivUser);
        this.f27818a1.setOnClickListener(this);
        this.f27824b1 = (ImageView) findViewById(C10232R.C10236id.ivBack);
        this.f27830c1 = (ImageView) this.f27948v0.findViewById(C10232R.C10236id.ivIcon);
        this.f27836d1 = (ImageView) findViewById(C10232R.C10236id.imgCall);
        this.f27938t4 = (ImageView) findViewById(C10232R.C10236id.ivTrackingProfilePic);
        this.f27945u4 = (ImageView) findViewById(C10232R.C10236id.ivLiveGlowing);
        this.f27917q4 = (ImageView) findViewById(C10232R.C10236id.ivDriverLeft);
        this.f27924r4 = (ImageView) findViewById(C10232R.C10236id.ivAtStore);
        this.f27931s4 = (ImageView) findViewById(C10232R.C10236id.ivAtCustomer);
        this.f27842e1 = (ImageView) findViewById(C10232R.C10236id.ivBuyerPaymentDone);
        this.f27848f1 = (ImageView) findViewById(C10232R.C10236id.ivAccountVerifed);
        this.f27854g1 = (ImageView) findViewById(C10232R.C10236id.ivPhoneClientUnavailable);
        this.f27812Z0 = (LinearLayout) findViewById(C10232R.C10236id.llReportOrder);
        this.f27812Z0.setOnClickListener(this);
        this.f27959w4 = (ImageView) findViewById(C10232R.C10236id.ivDriverLeftService);
        this.f27966x4 = (ImageView) findViewById(C10232R.C10236id.ivAtPickUp);
        this.f27973y4 = (ImageView) findViewById(C10232R.C10236id.ivAtDropOff);
        this.f27980z4 = (ImageView) findViewById(C10232R.C10236id.ivBillProgressDone);
        this.f27707H3 = (ImageView) findViewById(C10232R.C10236id.ivShowBillDetail);
        this.f27952v4 = (ImageView) findViewById(C10232R.C10236id.ivAlert);
        this.f27770S0 = (RatingBar) findViewById(C10232R.C10236id.rating);
        this.f27798W4 = (FloatingActionButton) findViewById(C10232R.C10236id.fabViewPoints);
        this.f27798W4.setOnClickListener(this);
        this.f27804X4 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMapStyle);
        this.f27804X4.setOnClickListener(this);
        this.f27911p4 = (AppBarLayout) findViewById(C10232R.C10236id.appbar);
        this.f27677C3 = (ExpandableLinearLayout) findViewById(C10232R.C10236id.exlBillDetail);
        this.f27912p5 = (FloatingActionButton) findViewById(C10232R.C10236id.fabInAppropriateFlag);
        this.f27928s1 = (ProgressBar) findViewById(C10232R.C10236id.pg1);
        this.f27935t1 = (ProgressBar) findViewById(C10232R.C10236id.pgChat);
        this.f27942u1 = (ProgressBar) findViewById(C10232R.C10236id.pgCall);
        this.f27732L4 = (ProgressBar) findViewById(C10232R.C10236id.pbShop);
        this.f27738M4 = (ProgressBar) findViewById(C10232R.C10236id.pbService);
        this.f27949v1 = (ProgressBar) findViewById(C10232R.C10236id.pgLastLocationTemp);
        this.f27956w1 = (ProgressBar) findViewById(C10232R.C10236id.pbDelay);
        m47952R1();
        m47948Q1();
        this.f27860h1.setOnFocusChangeListener(new C10422s1());
        this.f27860h1.setOnEditorActionListener(new C10429t1());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(C11644i.f33314h1)) {
                this.f27825b2 = extras.getString(C11644i.f33314h1);
            }
            if (extras.containsKey(C11644i.f33332j1)) {
                this.f27879k2 = extras.getInt(C11644i.f33332j1);
            }
            String str2 = "order_status";
            if (extras.containsKey(str2)) {
                this.f27731L3 = extras.getString(str2);
                C11644i.f33210V0 = this.f27731L3;
            }
            if (extras.containsKey(C11644i.f33227X1)) {
                if (extras.getInt(C11644i.f33227X1) <= 0) {
                    z = false;
                }
                this.f27891m2 = z;
            }
            this.f27929s2 = null;
            if (this.f29642a.mo23502X() && this.f27929s2 == null) {
                if (this.f27825b2 != null) {
                    this.f27928s1.setVisibility(0);
                    m48187h0();
                    mo37650Q();
                    m47898H1();
                } else {
                    finishActivity();
                }
            }
        }
        this.f27677C3.setListener(new C10435u1());
        this.f27707H3.setOnClickListener(new C10441v1());
        this.f27963x1.getViewTreeObserver().addOnGlobalLayoutListener(this.f27975y6);
        this.f27727K5.getSeekBar().setOnSeekBarChangeListener(new C10447w1());
    }

    /* renamed from: q2 */
    private void m48294q2() {
        if (this.f27811Y5 || this.f27805X5 || this.f27929s2.getNextQuickAction().getActionName().equals(this.f27746O0.getText().toString().trim())) {
            this.f27794W0.setVisibility(0);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, C10232R.anim.slide_in_left);
        this.f27794W0.setAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new C10356i2());
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m48305r2() throws Exception {
        this.f27920r0.mo40036a(C11644i.f33373o, (C11673d) new C10428t0());
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public void m48315s2() {
        if (C11644i.f33073E && this.f27929s2.getOfferDelaySec() > 0) {
            this.f27788V0.setEnabled(false);
            this.f27956w1.setVisibility(0);
            C10402p0 p0Var = new C10402p0((this.f27929s2.getOfferDelaySec() * 1000) + 100, 1);
            this.f27906o5 = p0Var;
            this.f27906o5.start();
        }
    }

    /* renamed from: t2 */
    private void m48325t2() {
        this.f27793V5 = new Timer();
        this.f27793V5.schedule(new C10440v0(), 0, 3000);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m48334u2() {
        if (!this.f29642a.mo23584b(LocationService.class)) {
            try {
                if (this.f29642a.mo23495Q()) {
                    startForegroundService(new Intent(this, LocationService.class));
                } else {
                    startService(new Intent(this, LocationService.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public void m48343v2() {
        if (this.f27929s2.getOrder_track().getTrack_order().booleanValue()) {
            mo37669e(true);
            m48018a((int) C10232R.C10236id.action_start_tracking, false);
        }
        if (this.f27929s2.getOrder_track().getCourier_show_start_tracking().booleanValue()) {
            m48018a((int) C10232R.C10236id.action_start_tracking, true);
        } else {
            m48018a((int) C10232R.C10236id.action_start_tracking, false);
        }
        if (this.f27929s2.getOrder_track().getCourier_show_stop_tracking().booleanValue()) {
            m48018a((int) C10232R.C10236id.action_start_tracking, true);
            m48017a((int) C10232R.C10236id.action_start_tracking, getResources().getString(C10232R.string.menu_stop_tracking));
        }
        if (this.f27929s2.getOrder_track().getCourier_autostart_tracking().booleanValue()) {
            m48136d(C11644i.f33457y3, true);
        }
        if (this.f27929s2.getOrder_track().getCourier_autostop_tracking().booleanValue()) {
            m48136d(C11644i.f33465z3, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public void m48352w2() throws Exception {
        C15056j jVar = this.f27745N5;
        if (jVar != null) {
            jVar.mo46684a();
            this.f27745N5 = null;
        }
        m48321t0();
        this.f27709H5 = C11718b.m52734c((Context) this).getAbsolutePath();
        boolean a = C11718b.m52725a(new File(C11718b.m52753j((Context) this)), new File(this.f27709H5));
        StringBuilder sb = new StringBuilder();
        sb.append("New media path :");
        sb.append(this.f27709H5);
        sb.append(" iscopy ");
        sb.append(a);
        C5880q.m25751b(sb.toString());
        C11718b.m52741d(C11718b.m52753j((Context) this));
        this.f27727K5.getPlayPauseImageView().setTag(Integer.valueOf(0));
        this.f27727K5.getPlayPauseImageView().setImageResource(C10232R.C10235drawable.img_play_new);
        TextView timerTextView = this.f27727K5.getTimerTextView();
        C5887x xVar = this.f29642a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(C11718b.m52728b((Context) this, this.f27709H5));
        timerTextView.setText(xVar.mo23587c(Double.parseDouble(sb2.toString())));
        mo36520O();
        this.f27733L5 = new MediaPlayer();
        this.f27733L5.setDataSource(this.f27709H5);
        this.f27733L5.prepare();
        this.f27727K5.getSeekBar().setProgress(0);
        this.f27727K5.getSeekBar().setEnabled(false);
        this.f27727K5.getSeekBar().setMax(this.f27733L5.getDuration());
    }

    /* renamed from: x */
    private void m48354x(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m48361x2() {
        if (this.f29642a.mo23584b(LocationService.class)) {
            stopService(new Intent(this, LocationService.class));
        }
    }

    /* renamed from: y2 */
    private void m48370y2() {
        C11996a aVar = this.f27870i5;
        if (aVar != null && aVar.mo41094a()) {
            this.f27870i5.mo41093a(getResources().getString(C10232R.string.pusher_event), new C10305a0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m48379z2() {
        Timer timer = this.f27781T5;
        if (timer != null) {
            timer.cancel();
            this.f27781T5 = null;
        }
        C11694e.m52677u().mo40199a(ChatState.composing, m47945Q0(), C11713f.RECORDING.ordinal());
        m48373z(false);
    }

    /* renamed from: a */
    public void mo36525a(Location location) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C11574c cVar = this.f27969y0;
        if (cVar != null) {
            cVar.mo39721a(i, i2, intent);
        }
        ChatInitModel chatInitModel = this.f27929s2;
        if (!(chatInitModel == null || chatInitModel.getOrder() == null)) {
            String str = "";
            if (i == 777 && i2 == -1) {
                String str2 = "image_path";
                if (intent.getExtras().getString(str2) != null) {
                    this.f29642a.mo23481I(intent.getExtras().getString(str2));
                    C5887x xVar = this.f29642a;
                    xVar.mo23579b(new File(xVar.mo23488M()));
                    C5887x xVar2 = this.f29642a;
                    xVar2.mo23605d(xVar2.mo23511a(xVar2.mo23486L()));
                    if (this.f29642a.mo23484K().getWidth() == 0 || this.f29642a.mo23484K().getHeight() == 0) {
                        this.f29642a.mo23491N(getString(C10232R.string.error_upload_image));
                        return;
                    }
                    if (this.f29642a.mo23484K().getWidth() > 600) {
                        this.f29642a.mo23573b((int) C14330v.f42355w);
                    } else {
                        C5887x xVar3 = this.f29642a;
                        xVar3.mo23573b(xVar3.mo23484K().getWidth());
                    }
                    this.f27817Z5 = true;
                    if (this.f29642a.mo23502X()) {
                        if (this.f27855g2) {
                            m47889G(this.f27929s2.getOrder().getiCourierId());
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(this.f27929s2.getOrder().getiBuyerId());
                            m47889G(sb.toString());
                        }
                    }
                }
            } else if (i == 888 && i2 == -1) {
                if (this.f29642a.mo23502X() && intent != null) {
                    this.f27831c2 = intent.getExtras().getString("selectedLat");
                    this.f27837d2 = intent.getExtras().getString("selectedLng");
                    this.f27843e2 = intent.getExtras().getString("selectedAddress");
                    this.f27868i3 = intent.getExtras().getString("selectedFloorNo");
                    String d = this.f29642a.mo23603d(this.f27831c2, this.f27837d2);
                    String str3 = "location";
                    if (this.f27855g2) {
                        String str4 = this.f27929s2.getOrder().getiCourierId();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(System.currentTimeMillis() / 1000);
                        messages b = m48082b(str4, str3, d, sb2.toString());
                        b.setSent2Server(false);
                        this.f27795W1.add(m48081b(b));
                        this.f29642a.mo23549a(this.f27962x0);
                        this.f27801X1.mo7342e(this.f27795W1.size() - 1);
                        String str5 = this.f27929s2.getOrder().getiCourierId();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(System.currentTimeMillis() / 1000);
                        mo37663a(str5, str3, d, sb3.toString());
                    } else {
                        String str6 = this.f27929s2.getOrder().getiCourierId();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(System.currentTimeMillis() / 1000);
                        messages b2 = m48082b(str6, str3, d, sb4.toString());
                        b2.setSent2Server(false);
                        this.f27795W1.add(m48081b(b2));
                        this.f29642a.mo23549a(this.f27962x0);
                        this.f27801X1.mo7342e(this.f27795W1.size() - 1);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append(this.f27929s2.getOrder().getiBuyerId());
                        String sb6 = sb5.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append(System.currentTimeMillis() / 1000);
                        mo37663a(sb6, str3, d, sb7.toString());
                    }
                }
            } else if (i == 112 && i2 == -1) {
                if (!isFinishing()) {
                    Dialog dialog = this.f27916q3;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
                if (this.f29642a.mo23502X()) {
                    mo37650Q();
                }
                this.f27885l2 = true;
            } else if (i == 108 && i2 == -1) {
                boolean booleanValue = ((Boolean) intent.getExtras().get("success")).booleanValue();
                int intValue = ((Integer) intent.getExtras().get(XHTMLText.CODE)).intValue();
                if (booleanValue && intValue == 200 && this.f29642a.mo23502X()) {
                    mo37650Q();
                    if (this.f27929s2.getOrder_track().getCourier_show_start_tracking().booleanValue() && !this.f27929s2.getOrder_track().getTrack_order().booleanValue()) {
                        m48136d(C11644i.f33457y3, false);
                        m48277p(true);
                    }
                }
            } else if (i == 113 && i2 == -1) {
                mo37650Q();
            }
        }
    }

    public void onBackPressed() {
        if (this.f29642a == null) {
            return;
        }
        if (this.f27905o4.getVisibility() == 0) {
            m48236l2();
            return;
        }
        if (m48075a1().equalsIgnoreCase(getString(C10232R.string.lbl_push_notification))) {
            this.f29642a.mo23473E(C11644i.f33181R3);
            this.f29642a.mo23473E(C11644i.f33205U3);
            this.f29642a.mo23473E(C11644i.f33189S3);
            this.f29642a.mo23473E(C11644i.f33197T3);
            try {
                if (HomeActivity.f27246i1 != null) {
                    HomeActivity.f27246i1.setCurrentItem(1);
                }
            } catch (Exception unused) {
            }
            finishActivity();
        } else if (m48075a1().equalsIgnoreCase(getString(C10232R.string.lbl_shop_detail))) {
            m47868D(C11644i.f33157O3);
            finishActivity();
        } else {
            finishActivity();
        }
        m47893G1();
    }

    public void onCancel() {
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.cvActionNext /*2131362101*/:
                m48376z0();
                break;
            case C10232R.C10236id.cvCancelOffer /*2131362104*/:
                if (!this.f27929s2.getOrderDialogFlags().getShowRejectedOfferDialog().booleanValue()) {
                    if (this.f29642a.mo23502X()) {
                        m48231l0();
                        break;
                    }
                } else {
                    onBackPressed();
                    break;
                }
                break;
            case C10232R.C10236id.cvChangeOffer /*2131362105*/:
                m48253n(false);
                break;
            case C10232R.C10236id.cvPostOffer /*2131362110*/:
                m48253n(false);
                break;
            case C10232R.C10236id.cvWithdrawOffer /*2131362118*/:
                if (this.f29642a.mo23502X()) {
                    m48231l0();
                    break;
                }
                break;
            case C10232R.C10236id.fabMapStyle /*2131362217*/:
                m48248m2();
                break;
            case C10232R.C10236id.fabViewPoints /*2131362222*/:
                this.f27828b5 = true;
                m48068a(this.f27816Z4, true);
                m48329u(false);
                break;
            case C10232R.C10236id.flBack /*2131362263*/:
                onBackPressed();
                break;
            case C10232R.C10236id.flIwillDeliver /*2131362280*/:
                ChatInitModel chatInitModel = this.f27929s2;
                if (chatInitModel != null && chatInitModel.getCourierCancel().intValue() == 1) {
                    m48363y(this.f27929s2.getCourierCancelMessage());
                    break;
                } else {
                    ChatInitModel chatInitModel2 = this.f27929s2;
                    if (chatInitModel2 != null && chatInitModel2.isDisableChat()) {
                        m48186h(false);
                        break;
                    } else {
                        m48253n(true);
                        break;
                    }
                }
                break;
            case C10232R.C10236id.ivActionMore /*2131362697*/:
                m48350w1();
                break;
            case C10232R.C10236id.ivLocationTracking /*2131362807*/:
                this.f29642a.mo23494P();
                if (!this.f27855g2) {
                    m47913K(getString(C10232R.string.lbl_see_route));
                    break;
                } else {
                    m48236l2();
                    break;
                }
            case C10232R.C10236id.ivTooltipClose /*2131362872*/:
                this.f27859g6.setVisibility(8);
                this.f27847e6.setVisibility(8);
                break;
            case C10232R.C10236id.ivUser /*2131362877*/:
                mo37651R();
                break;
            case C10232R.C10236id.llBackToChat /*2131362969*/:
                if (!this.f27851f4.getText().equals(getResources().getString(C10232R.string.lbl_pay_now)) || this.f27723K1.getVisibility() == 0) {
                    if (this.f27851f4.getText().equals(getResources().getString(C10232R.string.lbl_back_to_chat)) || this.f27851f4.getText().equals(getResources().getString(C10232R.string.lbl_track_it))) {
                        m48236l2();
                        break;
                    }
                } else {
                    mo37655V();
                    break;
                }
                break;
            case C10232R.C10236id.llBill /*2131362972*/:
                m48259n2();
                break;
            case C10232R.C10236id.llCall /*2131362978*/:
                m48186h(true);
                break;
            case C10232R.C10236id.llReportOrder /*2131363138*/:
                m47909J0();
                break;
            case C10232R.C10236id.llSend /*2131363147*/:
                if (this.f27929s2 != null) {
                    m47905I1();
                    break;
                } else {
                    return;
                }
            case C10232R.C10236id.llToolTip /*2131363176*/:
                m48259n2();
                break;
            case C10232R.C10236id.tvNewMessage /*2131363913*/:
                this.f27678C4 = 0;
                m48212j2();
                this.f27851f4.setText(getResources().getString(C10232R.string.lbl_track_it));
                m48019a(0, this.f27785U3);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) ((-this.f27905o4.getHeight()) + this.f29642a.mo23601d(68))});
                ofFloat.setDuration((long) this.f27897n2);
                ofFloat.addUpdateListener(new C10418r3());
                ofFloat.start();
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration((long) this.f27897n2);
                alphaAnimation.setFillAfter(false);
                this.f27815Z3.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new C10321c4());
                this.f27905o4.setVisibility(8);
                break;
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m47967U1();
        getIntent().getAction();
        try {
            if (getIntent().getExtras() == null) {
                finish();
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C11644i.f33193T = true;
        this.f29642a.mo23553a((C11056p) this);
        this.f29642a.mo23604d();
        setContentView((int) C10232R.layout.activity_chat1_new);
        C11644i.f33226X0 = true;
        f27656D6 = new C10470z4(this, this, null);
        HomeActivity.m47469b((C10943o) this);
        this.f27886l3 = new C11616e(this);
        initViews();
        m47977W1();
        m48102b(C11644i.f33117J3, C11644i.f33125K3, C11644i.f33133L3, C11644i.f33141M3, C11644i.f33299f4, C11644i.f33353l4, C11644i.f33386p4, C11644i.f33410s4, C11644i.f33466z4, C11644i.f33054B4, C11644i.f33070D4, C11644i.f33086F4, C11644i.f33094G4, C11644i.f33102H4, C11644i.f33450x4, C11644i.f33158O4, C11644i.f33062C4, CheckoutActivity.f34069j0, C11644i.f33110I4);
        m48364y(!C11694e.INSTANCE.mo40213h());
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23620g() || C11694e.INSTANCE.mo40213h()) {
            m48364y(true);
        } else {
            this.f29642a.mo23626i();
        }
        if (this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
            m47886F1();
        }
        if (bundle != null) {
            this.f27687E1 = bundle.getString(f27653A6);
        }
        m47970V0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f27969y0 != null) {
                this.f27969y0.mo39730f();
            }
            m48265o(true);
            m47893G1();
            if (this.f27906o5 != null) {
                this.f27906o5.cancel();
            }
            C11644i.f33193T = false;
            C11644i.f33250a0 = false;
            this.f29642a.mo23539a(this.f27968x6);
            if (this.f27900n5 != null) {
                this.f27900n5.interrupt();
            }
            if (this.f27855g2) {
                m48357x0();
            }
            C11720d.m52774l();
            if (this.f27781T5 != null) {
                this.f27781T5.cancel();
            }
            if (this.f27787U5 != null) {
                this.f27787U5.cancel();
            }
            if (this.f27775S5 != null) {
                this.f27775S5.cancel();
            }
            if (this.f27793V5 != null) {
                this.f27793V5.cancel();
            }
            C11694e.m52677u().mo40199a(ChatState.paused, m47945Q0(), C11713f.COMPOSING_PAUSED.ordinal());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f27670B2 = intent.getExtras();
        if (!isFinishing()) {
            m48021a(intent);
            if ((intent == null || !getResources().getString(C10232R.string.callback_scheme).equalsIgnoreCase(intent.getScheme())) && !m48103b(intent)) {
                Dialog dialog = this.f27916q3;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (this.f27699G1.getVisibility() == 0) {
                    m48311s0();
                }
                setIntent(intent);
                m47980X();
                initViews();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C5880q.m25751b("onPause");
        C11644i.f33226X0 = false;
        mo38398E();
        m47866C1();
        this.f27703G5 = false;
        C11694e.INSTANCE.mo40199a(ChatState.paused, m47945Q0(), C11713f.COMPOSING_PAUSED.ordinal());
        if (this.f27745N5 != null) {
            this.f27727K5.mo38329d();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f27920r0;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (C11644i.f33302f7) {
                C11728i.m52794a(this);
            }
            C11644i.f33226X0 = true;
            if (m47989Y1()) {
                m47873D1();
            }
            if (!C11694e.INSTANCE.mo40213h()) {
                m48364y(false);
            }
            if (this.f29642a == null || !this.f29642a.mo23620g() || C11694e.INSTANCE.mo40213h()) {
                m48364y(C11694e.INSTANCE.mo40213h());
            } else {
                this.f29642a.mo23626i();
            }
            if (this.f27815Z3 != null) {
                this.f27815Z3.invalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putString(f27653A6, this.f27687E1);
    }

    /* renamed from: s */
    public void mo36531s() {
    }

    /* renamed from: t */
    public void mo36532t() {
    }

    /* renamed from: A0 */
    private LatLng m47848A0() {
        try {
            LastCourierLocationHistoryBean lastCourierLocationHistoryBean = (LastCourierLocationHistoryBean) new C8775f().mo32314a(this.f29642a.mo23470D().mo23459f(this.f27726K4), LastCourierLocationHistoryBean.class);
            StringBuilder sb = new StringBuilder();
            sb.append("Tracking Changes | Fetched location :");
            sb.append(lastCourierLocationHistoryBean.getLatitude());
            sb.append(",");
            sb.append(lastCourierLocationHistoryBean.getLongitude());
            C5880q.m25751b(sb.toString());
            if (!m48006a(lastCourierLocationHistoryBean.getTimeStamp()).booleanValue()) {
                C5880q.m25751b("Tracking Changes | Less than One minute");
                return new LatLng(lastCourierLocationHistoryBean.getLatitude().doubleValue(), lastCourierLocationHistoryBean.getLongitude().doubleValue());
            }
            C5880q.m25751b("Tracking Changes | One minute Extended");
            this.f29642a.mo23470D().mo23451b().edit().remove(this.f27726K4).commit();
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: A1 */
    private void m47850A1() {
        if (!m48122c(this.f27972y3)) {
            m48020a(this.f27972y3);
            this.f27972y3 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            this.f27972y3.setContentView(C10232R.layout.dialog_change_order);
            this.f27972y3.setCancelable(false);
            this.f27807Y1.add(this.f27972y3);
            TextView textView = (TextView) this.f27972y3.findViewById(C10232R.C10236id.txtNewOffer);
            TextView textView2 = (TextView) this.f27972y3.findViewById(C10232R.C10236id.txtCancel);
            TextView textView3 = (TextView) this.f27972y3.findViewById(C10232R.C10236id.txtdMessage);
            textView.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
            ChatInitModel chatInitModel = this.f27929s2;
            String str = "";
            if (chatInitModel == null || TextUtils.isEmpty(chatInitModel.getSuperseded_text())) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(getResources().getString(C10232R.string.lbl_msg_superseeded));
                textView3.setText(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f27929s2.getSuperseded_text());
                textView3.setText(sb2.toString());
            }
            this.f27972y3.setOnKeyListener(new C10462y3());
            textView.setOnClickListener(new C10469z3());
            textView2.setOnClickListener(new C10309a4());
            if (!isFinishing() && !this.f27972y3.isShowing()) {
                this.f27972y3.show();
            }
        }
    }

    /* renamed from: B0 */
    private C11571b m47855B0() {
        if (this.f27941u0 == null) {
            this.f27941u0 = new C11571b(this);
        }
        return this.f27941u0;
    }

    /* renamed from: B1 */
    private void m47858B1() {
        if (this.f27929s2.getOrderDialogFlags().getShowSupersededDialog().booleanValue()) {
            m48369y1();
            ChatInitModel chatInitModel = this.f27929s2;
            if (!(chatInitModel == null || chatInitModel.getOrderDialogFlags() == null || TextUtils.isEmpty(this.f27929s2.getOrderDialogFlags().getSupersededDialogText()))) {
                this.f27735M1.setText(this.f27929s2.getOrderDialogFlags().getSupersededDialogText());
            }
            m48019a(0, this.f27747O1);
            int i = 8;
            m48019a(8, this.f27693F1, this.f27866i1);
            ChatInitModel chatInitModel2 = this.f27929s2;
            if (chatInitModel2 != null && chatInitModel2.getOrderDialogFlags() != null) {
                if (!TextUtils.isEmpty(this.f27929s2.getOrderDialogFlags().getSupersededDialogText())) {
                    this.f27735M1.setText(this.f27929s2.getOrderDialogFlags().getSupersededDialogText());
                }
                if (!TextUtils.isEmpty(this.f27929s2.getOrderDialogFlags().getSupersededDialogTextNew())) {
                    this.f27753P1.setText(this.f27929s2.getOrderDialogFlags().getSupersededDialogTextNew());
                    this.f27759Q1.setVisibility(0);
                } else {
                    this.f27759Q1.setVisibility(8);
                }
                CardView cardView = this.f27765R1;
                if (!this.f27929s2.getOrderDialogFlags().getHideChangeOfferButton().booleanValue()) {
                    i = 0;
                }
                cardView.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public ArrayList<messages> m47863C0() {
        String str = "";
        for (int i = 0; i < this.f27929s2.getMessages().size(); i++) {
            String a = this.f29642a.mo23521a(((messages) this.f27929s2.getMessages().get(i)).getCreated_at() * 1000, this.f27682D2);
            String d = C5887x.m25814d(this.f27682D2, this.f27694F2, a);
            String d2 = C5887x.m25814d(this.f27682D2, this.f27688E2, a);
            ((messages) this.f27929s2.getMessages().get(i)).setMessageDate(d);
            ((messages) this.f27929s2.getMessages().get(i)).setMessageTime(d2);
            if (!str.equalsIgnoreCase(d)) {
                ((messages) this.f27929s2.getMessages().get(i)).setIsDateVisible(true);
            } else {
                ((messages) this.f27929s2.getMessages().get(i)).setIsDateVisible(false);
            }
            str = ((messages) this.f27929s2.getMessages().get(i)).getMessageDate();
        }
        return this.f27929s2.getMessages();
    }

    /* renamed from: C1 */
    private void m47866C1() {
        MediaPlayer mediaPlayer = this.f27733L5;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            C10487g gVar = this.f27801X1;
            if (gVar != null) {
                gVar.mo37865j();
            }
            return;
        }
        mo36519N();
    }

    /* renamed from: D0 */
    private String m47870D0() {
        ChatInitModel chatInitModel = this.f27929s2;
        return (chatInitModel == null || chatInitModel.getPortalOrderDetail() == null) ? "" : this.f27929s2.getPortalOrderDetail().getBusinessOrderId();
    }

    /* renamed from: D1 */
    private void m47873D1() {
        try {
            if (this.f29642a.mo23502X() && this.f27825b2 != null) {
                if (this.f27821a4.getVisibility() == 0) {
                    this.f27799W5 = Boolean.valueOf(true);
                }
                this.f27811Y5 = true;
                mo37650Q();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m47877E0() {
        m48355x(true);
        HashMap hashMap = new HashMap();
        hashMap.put("iBuyerId", this.f29642a.mo23476G());
        C11687c.m52645a(this.f29642a).getBuyerPaymentOptions(this.f27825b2, hashMap).enqueue(new C10343g1());
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public void m47879E1() {
        int i = 0;
        while (true) {
            try {
                if (i >= this.f27816Z4.size()) {
                    break;
                } else if (((Marker) this.f27816Z4.get(i)).getTitle().equalsIgnoreCase("store")) {
                    this.f27816Z4.remove(i);
                    break;
                } else {
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        for (int i2 = 0; i2 < this.f27810Y4.size(); i2++) {
            if (((Marker) this.f27810Y4.get(i2)).getTitle().equalsIgnoreCase("you")) {
                this.f27816Z4.add(this.f27810Y4.get(i2));
            }
        }
    }

    /* renamed from: F0 */
    private void m47885F0() {
        if (this.f29642a.mo23502X()) {
            this.f27949v1.setVisibility(0);
            C10832k kVar = new C10832k(this.f27929s2.getOrder_track().getTrack_channel_name(), this.f29642a.mo23640m(), this.f27929s2.getOrder().getiCourierId(), this.f29642a.mo23476G());
            StringBuilder sb = new StringBuilder();
            sb.append("getCourierLastLocation : ==>");
            sb.append(kVar);
            C5880q.m25751b(sb.toString());
            C11687c.m52646b().getLastCourierLocation(kVar).enqueue(new C10354i0());
        }
    }

    /* renamed from: F1 */
    private void m47886F1() {
        this.f27920r0.mo40036a(C11644i.f33339k, (C11673d) new C10467z1());
    }

    /* renamed from: G */
    private void m47889G(String str) {
        String str2;
        C5887x xVar;
        C5887x xVar2 = this.f29642a;
        if (xVar2 != null && xVar2.mo23502X()) {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str3 = "image";
            messages b = m48082b(str, str3, this.f29642a.mo23488M(), valueOf);
            b.setIsImageLoaded(false);
            b.setSent2Server(false);
            m48036a(b);
            runOnUiThread(new C10468z2());
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", this.f29642a.mo23622h(this.f27825b2));
            hashMap.put("vMessageId", this.f29642a.mo23622h(valueOf));
            C5887x xVar3 = this.f29642a;
            hashMap.put("iFromUserId", xVar3.mo23622h(String.valueOf(xVar3.mo23468C().mo23459f("user_id"))));
            hashMap.put("iToUserId", this.f29642a.mo23622h(str));
            String str4 = "txContent";
            hashMap.put(str4, this.f29642a.mo23622h(this.f27860h1.getText().toString().trim()));
            hashMap.put("vType", this.f29642a.mo23622h(str3));
            hashMap.put("online", this.f29642a.mo23622h("1"));
            C5887x xVar4 = this.f29642a;
            StringBuilder sb = new StringBuilder();
            String str5 = "";
            sb.append(str5);
            sb.append(this.f29642a.mo23648p().latitude);
            hashMap.put("clatitude", xVar4.mo23622h(sb.toString()));
            C5887x xVar5 = this.f29642a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(this.f29642a.mo23648p().longitude);
            hashMap.put("clongitude", xVar5.mo23622h(sb2.toString()));
            if (this.f27855g2) {
                xVar = this.f29642a;
                str2 = "buyer";
            } else {
                xVar = this.f29642a;
                str2 = C11644i.f33256a6;
            }
            hashMap.put("image_type", xVar.mo23622h(str2));
            C13875b bVar = null;
            if (this.f29642a.mo23488M() != null) {
                bVar = C13875b.m59383a(str4, new File(this.f29642a.mo23488M()).getName(), C13817d0.create(C13872x.m59361b("image/jpeg"), this.f29642a.mo23486L()));
            }
            C11687c.m52645a(this.f29642a).saveMessage1(String.valueOf(this.f27825b2), hashMap, bVar).enqueue(new C10308a3(valueOf, b, str));
        }
    }

    /* renamed from: G0 */
    private String m47891G0() {
        String str = "";
        try {
            double parseDouble = Double.parseDouble(this.f27929s2.getOrderDetailBill().getDbDeliveryCost()) + Double.parseDouble(this.f27929s2.getOrderDetailBill().getVatAmount());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29642a.mo23569b(parseDouble));
            return sb.toString();
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f27929s2.getOrderDetailBill().getDbDeliveryCost());
            return sb2.toString();
        }
    }

    /* renamed from: G1 */
    private void m47893G1() {
        try {
            if ((this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3) || this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) && this.f27855g2 && this.f27714I4 != null) {
                this.f29642a.mo23470D().mo23449a(this.f27726K4, new C8775f().mo32317a((Object) m47921L0()));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m47895H(String str) {
        if (m47994Z0()) {
            this.f27755P3 = true;
        }
        this.f27800X0.setVisibility(0);
        if (str.equalsIgnoreCase(C11644i.f33298f3)) {
            this.f27722K0.setText(C10232R.string.msg_order_cancel);
        } else {
            this.f27722K0.setText(C10232R.string.msg_order_expired);
        }
        this.f27860h1.setEnabled(false);
        this.f27727K5.mo38325b(false);
        this.f27860h1.setClickable(false);
        this.f27727K5.mo38323a(Boolean.valueOf(false));
        m48206j(false);
        if (this.f27755P3) {
            this.f29642a.mo23473E(C11644i.f33181R3);
            this.f29642a.mo23473E(C11644i.f33205U3);
            this.f27755P3 = false;
        }
    }

    /* renamed from: H0 */
    private int m47896H0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @RequiresApi(api = 21)
    /* renamed from: H1 */
    private void m47898H1() {
        if (VERSION.SDK_INT >= 21) {
            ((JobScheduler) getSystemService("jobscheduler")).schedule(new JobInfo.Builder(0, new ComponentName(this, NetworkSchedulerService.class)).setRequiresCharging(false).setMinimumLatency(1000).setOverrideDeadline(2000).setRequiredNetworkType(1).setPersisted(true).build());
        }
    }

    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47901I(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case -1367724422: goto L_0x0044;
                case -1309235419: goto L_0x003a;
                case -682587753: goto L_0x0030;
                case -575131179: goto L_0x0026;
                case -242327420: goto L_0x001c;
                case 3314342: goto L_0x0012;
                case 355903494: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "finalized"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 4
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "late"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "delivered"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 3
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "in-progress"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "pending"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 0
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "expired"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 6
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "cancel"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 5
            goto L_0x004f
        L_0x004e:
            r0 = -1
        L_0x004f:
            r1 = 2131100150(0x7f0601f6, float:1.7812673E38)
            r2 = 2131100187(0x7f06021b, float:1.7812748E38)
            r3 = 2131231042(0x7f080142, float:1.8078154E38)
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0087;
                case 2: goto L_0x007f;
                case 3: goto L_0x0077;
                case 4: goto L_0x006f;
                case 5: goto L_0x0064;
                case 6: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x009f
        L_0x005c:
            r5 = 2131887148(0x7f12042c, float:1.9408895E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x006b
        L_0x0064:
            r5 = 2131887145(0x7f120429, float:1.9408889E38)
            java.lang.String r5 = r4.getString(r5)
        L_0x006b:
            r2 = 2131100150(0x7f0601f6, float:1.7812673E38)
            goto L_0x009f
        L_0x006f:
            r5 = 2131887149(0x7f12042d, float:1.9408897E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x009f
        L_0x0077:
            r5 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x009f
        L_0x007f:
            r5 = 2131887150(0x7f12042e, float:1.9408899E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x009f
        L_0x0087:
            r5 = 2131887147(0x7f12042b, float:1.9408893E38)
            java.lang.String r5 = r4.getString(r5)
            goto L_0x009f
        L_0x008f:
            r1 = 2131100223(0x7f06023f, float:1.7812821E38)
            r3 = 2131231051(0x7f08014b, float:1.8078172E38)
            r5 = 2131887151(0x7f12042f, float:1.94089E38)
            java.lang.String r5 = r4.getString(r5)
            r2 = 2131100223(0x7f06023f, float:1.7812821E38)
        L_0x009f:
            android.widget.TextView r0 = r4.f27680D0
            r0.setBackgroundResource(r3)
            android.widget.TextView r0 = r4.f27680D0
            int r1 = androidx.core.content.C0841b.m4915a(r4, r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f27680D0
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.ChatActivityNew.m47901I(java.lang.String):void");
    }

    /* renamed from: I0 */
    private void m47902I0() {
        if (this.f27819a2.size() <= 0) {
            m48068a(this.f27810Y4, false);
            C5887x xVar = this.f29642a;
            if (xVar != null && xVar.mo23502X()) {
                this.f29642a.mo23665u0();
                m48297r(100);
                m48019a(8, this.f27798W4);
                new HashMap();
                TrackingHistoryParamBean trackingHistoryParamBean = new TrackingHistoryParamBean(this.f27929s2.getOrder_track().getTrack_channel_name(), this.f29642a.mo23640m(), this.f27929s2.getOrder().getiCourierId(), this.f29642a.mo23476G());
                StringBuilder sb = new StringBuilder();
                sb.append("TrackingHistoryParamBean : ==>");
                sb.append(trackingHistoryParamBean.toString());
                C5880q.m25751b(sb.toString());
                C11687c.m52646b().getHistory(trackingHistoryParamBean).enqueue(new C10336f0());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public void m47905I1() {
        String str = "text";
        String str2 = "";
        if (this.f27877j6) {
            if (this.f29642a.mo23502X()) {
                if (!C11694e.INSTANCE.mo40213h() || !C11694e.INSTANCE.connection.isAuthenticated()) {
                    C5887x xVar = this.f29642a;
                    if (xVar != null) {
                        xVar.mo23626i();
                    }
                }
                if (TextUtils.isEmpty(this.f27860h1.getText().toString().trim())) {
                    return;
                }
                if (this.f27855g2) {
                    String str3 = this.f27929s2.getOrder().getiCourierId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(System.currentTimeMillis() / 1000);
                    mo37663a(str3, str, str2, sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f27929s2.getOrder().getiBuyerId());
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(System.currentTimeMillis() / 1000);
                mo37663a(sb3, str, str2, sb4.toString());
                return;
            }
            this.f29642a.mo23491N(getResources().getString(C10232R.string.alert_xmpp_error));
        } else if (!this.f29642a.mo23502X()) {
        } else {
            if (!C11694e.INSTANCE.mo40213h() || !C11694e.INSTANCE.connection.isAuthenticated()) {
                C5887x xVar2 = this.f29642a;
                if (xVar2 != null) {
                    xVar2.mo23626i();
                }
                this.f29642a.mo23491N(getResources().getString(C10232R.string.alert_xmpp_error));
            } else if (TextUtils.isEmpty(this.f27860h1.getText().toString().trim())) {
            } else {
                if (this.f27855g2) {
                    String str4 = this.f27929s2.getOrder().getiCourierId();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(System.currentTimeMillis() / 1000);
                    mo37663a(str4, str, str2, sb5.toString());
                    return;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(this.f27929s2.getOrder().getiBuyerId());
                String sb7 = sb6.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(System.currentTimeMillis() / 1000);
                mo37663a(sb7, str, str2, sb8.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m47907J(String str) {
        runOnUiThread(new C10445w(str));
    }

    /* renamed from: J0 */
    private void m47909J0() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            C11687c.m52645a(this.f29642a).getInAppropriateReasons(hashMap).enqueue(new C10330e0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public void m47911J1() {
        C11694e u = C11694e.m52677u();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27855g2 ? this.f27929s2.getOrder().getiCourierId() : this.f27929s2.getOrder().getiBuyerId());
        sb.append("@");
        sb.append(C11694e.SERVICE);
        u.mo40211f(sb.toString(), this.f27825b2);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m47913K(String str) {
        Intent intent = new Intent(this, ShowLocationActivity.class);
        intent.putExtra(C11644i.f33179R1, this.f27929s2);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m47915K0() {
        double d;
        try {
            Builder builder = new Builder();
            double d2 = 0.0d;
            if (!this.f27929s2.getOrder().getvShopType().equalsIgnoreCase("service") || this.f27929s2.getOrder().getServicePickupAvailable()) {
                d2 = (this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLat()) : Double.valueOf(this.f27929s2.getOrder().getPlatitude())).doubleValue();
                d = (this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLong()) : Double.valueOf(this.f27929s2.getOrder().getPlongitude())).doubleValue();
            } else {
                d = 0.0d;
            }
            if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                builder.include(new LatLng(this.f29642a.mo23648p().latitude, this.f29642a.mo23648p().longitude));
                builder.include(new LatLng(d2, d));
            } else if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) {
                builder.include(new LatLng(d2, d));
                builder.include(new LatLng(this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude()));
            } else {
                builder.include(new LatLng(this.f29642a.mo23648p().latitude, this.f29642a.mo23648p().longitude));
                builder.include(new LatLng(d2, d));
            }
            new Handler().postDelayed(new C10420s(builder), 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: K1 */
    private void m47916K1() {
        if (!this.f27874j3) {
            new Handler().postDelayed(new C10342g0(), 250);
        }
    }

    /* renamed from: L */
    private void m47919L(String str) {
        try {
            if (this.f27870i5 == null || !this.f27870i5.mo41094a()) {
                if (this.f27864h5 == null) {
                    m48339v0();
                }
                this.f27870i5 = this.f27864h5.mo41080a(this.f27882k5, (C11997b) new C10451x(), new String[0]);
                return;
            }
            this.f29642a.mo23489M("Connected...");
            C5880q.m25751b("PUSHER:Connected...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: L0 */
    private LastCourierLocationHistoryBean m47921L0() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tracking Changes | saved location :");
        sb.append(this.f27714I4.getLatitude());
        sb.append(",");
        sb.append(this.f27714I4.getLongitude());
        C5880q.m25751b(sb.toString());
        return new LastCourierLocationHistoryBean(Double.valueOf(this.f27714I4.getLatitude()), Double.valueOf(this.f27714I4.getLongitude()), this.f27726K4, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: L1 */
    private void m47922L1() {
        LatLng A0 = m47848A0();
        if (A0 != null) {
            this.f27850f3 = new CourierLastLocationBean();
            this.f27850f3.setLatitude(Double.valueOf(A0.latitude));
            this.f27850f3.setLongitude(Double.valueOf(A0.longitude));
            this.f27929s2.getOrder_track().setCourier_base_lat(this.f27850f3.getLatitude());
            this.f27929s2.getOrder_track().setCourier_base_lng(this.f27850f3.getLongitude());
            this.f27714I4 = new Location("current");
            this.f27714I4.setLatitude(A0.latitude);
            this.f27714I4.setLongitude(A0.longitude);
            m48245m1();
            Marker marker = this.f27720J4;
            if (marker != null) {
                marker.setVisible(true);
            }
        }
    }

    /* renamed from: M0 */
    private String m47926M0() {
        String str;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(m48285q(this.f27709H5))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(System.currentTimeMillis() / 1000);
                str = sb.toString();
            } else {
                str = m48285q(this.f27709H5);
            }
            return str;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(System.currentTimeMillis() / 1000);
            return sb2.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public void m47927M1() {
        if (this.f27708H4 == null) {
            this.f27708H4 = new Location("last");
            this.f27708H4.setLatitude(this.f27929s2.getOrder_track().getCourier_base_lat().doubleValue());
            this.f27708H4.setLongitude(this.f27929s2.getOrder_track().getCourier_base_lng().doubleValue());
        }
        if (this.f27714I4 == null) {
            this.f27714I4 = new Location("current");
        }
        Location location = this.f27714I4;
        CourierLastLocationBean courierLastLocationBean = this.f27850f3;
        location.setLatitude((courierLastLocationBean != null ? courierLastLocationBean.getLatitude() : this.f27929s2.getOrder_track().getCourier_base_lat()).doubleValue());
        Location location2 = this.f27714I4;
        CourierLastLocationBean courierLastLocationBean2 = this.f27850f3;
        location2.setLongitude((courierLastLocationBean2 != null ? courierLastLocationBean2.getLongitude() : this.f27929s2.getOrder_track().getCourier_base_lng()).doubleValue());
        m48245m1();
        new Handler().postDelayed(new C10361j0(), 1000);
        m48068a(this.f27816Z4, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public void mo37650Q() {
        HashMap hashMap = new HashMap();
        hashMap.put("with_messages", "1");
        hashMap.put("current_user", this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("current_latitude", this.f29642a.mo23468C().mo23459f(C11644i.f33303g));
        hashMap.put("current_longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
        StringBuilder sb = new StringBuilder();
        sb.append("getOrderInfo params : ");
        sb.append(hashMap);
        C5880q.m25751b(sb.toString());
        m47937O1();
        C11687c.m52645a(this.f29642a).getChatMessage(String.valueOf(this.f27825b2), hashMap).enqueue(new C10350h2());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01eb, code lost:
        if ("ready".equals(r12.f27929s2.getPortalOrderDetail().getStatus()) != false) goto L_0x01ed;
     */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m47932N1() {
        /*
            r12 = this;
            boolean r0 = r12.m48109b1()
            if (r0 == 0) goto L_0x0011
            android.app.Dialog r0 = r12.f27889l6
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            android.widget.ImageView r0 = r12.f27847e6
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r12.f27859g6
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r12.f27859g6
            r2 = 0
            r0.setOnClickListener(r2)
            android.os.CountDownTimer r0 = r12.f27865h6
            if (r0 == 0) goto L_0x002a
            r0.cancel()
        L_0x002a:
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            r3 = 1
            if (r0 == 0) goto L_0x0218
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            if (r0 == 0) goto L_0x0218
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            java.lang.String r0 = r0.getActionName()
            if (r0 == 0) goto L_0x0218
            android.os.CountDownTimer r0 = r12.f27865h6
            java.lang.String r4 = "timer_action"
            if (r0 == 0) goto L_0x0057
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            java.lang.String r0 = r0.getActionValue()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x005a
        L_0x0057:
            r12.m48294q2()
        L_0x005a:
            boolean r0 = r12.m48109b1()
            if (r0 == 0) goto L_0x00e7
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            java.lang.String r0 = r0.getActionValue()
            java.lang.String r5 = "send_order"
            boolean r0 = r0.equals(r5)
            r5 = 2131100254(0x7f06025e, float:1.7812884E38)
            if (r0 == 0) goto L_0x00ca
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f27794W0
            r6 = 2131100263(0x7f060267, float:1.7812903E38)
            int r7 = androidx.core.content.C0841b.m4915a(r12, r6)
            r0.setBackgroundColor(r7)
            androidx.cardview.widget.CardView r0 = r12.f27662A0
            int r5 = androidx.core.content.C0841b.m4915a(r12, r5)
            r0.setCardBackgroundColor(r5)
            android.widget.TextView r0 = r12.f27746O0
            int r5 = androidx.core.content.C0841b.m4915a(r12, r6)
            r0.setTextColor(r5)
            com.mrsool.utils.x r0 = r12.f29642a
            com.mrsool.utils.v r0 = r0.mo23470D()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "welcome_"
            r5.append(r6)
            java.lang.String r6 = r12.f27825b2
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r0 = r0.mo23450a(r5)
            if (r0 == 0) goto L_0x00e7
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.TooltipDetail r0 = r0.getTooltipDetail()
            java.lang.String r0 = r0.getLabel()
            com.mrsool.bean.ChatInitModel r5 = r12.f27929s2
            com.mrsool.bean.TooltipDetail r5 = r5.getTooltipDetail()
            java.util.ArrayList r5 = r5.getHighlight()
            r12.m48099b(r0, r5)
            goto L_0x00e7
        L_0x00ca:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f27794W0
            r6 = 2131231038(0x7f08013e, float:1.8078146E38)
            r0.setBackgroundResource(r6)
            androidx.cardview.widget.CardView r0 = r12.f27662A0
            int r5 = androidx.core.content.C0841b.m4915a(r12, r5)
            r0.setCardBackgroundColor(r5)
            android.widget.TextView r0 = r12.f27746O0
            r5 = 2131100222(0x7f06023e, float:1.781282E38)
            int r5 = androidx.core.content.C0841b.m4915a(r12, r5)
            r0.setTextColor(r5)
        L_0x00e7:
            android.widget.TextView r0 = r12.f27746O0
            com.mrsool.bean.ChatInitModel r5 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r5 = r5.getNextQuickAction()
            java.lang.String r5 = r5.getActionName()
            r0.setText(r5)
            android.widget.TextView r0 = r12.f27740N0
            com.mrsool.bean.ChatInitModel r5 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r5 = r5.getNextQuickAction()
            java.lang.String r5 = r5.getDescriptionLabel()
            r0.setText(r5)
            boolean r0 = r12.m48109b1()
            java.lang.String r5 = "accepted"
            if (r0 == 0) goto L_0x0177
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            java.lang.String r0 = r0.getActionValue()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0177
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            if (r0 == 0) goto L_0x01c3
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            java.lang.String r4 = "pending"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01c3
            com.mrsool.chat.ChatActivityNew$j2 r0 = new com.mrsool.chat.ChatActivityNew$j2
            com.mrsool.utils.x r6 = r12.f29642a
            com.mrsool.bean.ChatInitModel r4 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r4 = r4.getPortalOrderDetail()
            long r7 = r4.getCurrentTime()
            com.mrsool.bean.ChatInitModel r4 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r4 = r4.getPortalOrderDetail()
            com.mrsool.bean.TimerDetails r4 = r4.getTimerDetails()
            long r9 = r4.getOrderExpiredAt()
            com.mrsool.bean.ChatInitModel r4 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r4 = r4.getPortalOrderDetail()
            com.mrsool.bean.TimerDetails r4 = r4.getTimerDetails()
            int r11 = r4.getOrderExpireMin()
            java.lang.Long r4 = r6.mo23517a(r7, r9, r11)
            long r8 = r4.longValue()
            r10 = 1000(0x3e8, double:4.94E-321)
            r6 = r0
            r7 = r12
            r6.<init>(r8, r10)
            android.os.CountDownTimer r0 = r0.start()
            r12.f27865h6 = r0
            goto L_0x01c3
        L_0x0177:
            boolean r0 = r12.m48109b1()
            if (r0 == 0) goto L_0x01c3
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.NextQuickActionBean r0 = r0.getNextQuickAction()
            java.lang.String r0 = r0.getActionValue()
            java.lang.String r4 = "order_pickup"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01c3
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            if (r0 == 0) goto L_0x01c3
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01c3
            android.widget.LinearLayout r0 = r12.f27859g6
            r0.setOnClickListener(r12)
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.TooltipDetail r0 = r0.getTooltipDetail()
            java.lang.String r0 = r0.getLabel()
            com.mrsool.bean.ChatInitModel r4 = r12.f27929s2
            com.mrsool.bean.TooltipDetail r4 = r4.getTooltipDetail()
            java.util.ArrayList r4 = r4.getHighlight()
            r12.m48099b(r0, r4)
        L_0x01c3:
            boolean r0 = r12.m48109b1()
            r4 = 2
            r6 = 0
            if (r0 == 0) goto L_0x0200
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x01ed
            com.mrsool.bean.ChatInitModel r0 = r12.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            java.lang.String r5 = "ready"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0200
        L_0x01ed:
            android.widget.LinearLayout r0 = r12.f27902o1
            r0.setOnClickListener(r12)
            android.view.View[] r0 = new android.view.View[r4]
            android.widget.LinearLayout r1 = r12.f27902o1
            r0[r6] = r1
            android.view.View r1 = r12.f27803X3
            r0[r3] = r1
            r12.m48019a(r6, r0)
            goto L_0x021d
        L_0x0200:
            android.widget.LinearLayout r0 = r12.f27902o1
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r12.f27902o1
            r0.setOnClickListener(r2)
            android.view.View[] r0 = new android.view.View[r4]
            android.widget.LinearLayout r2 = r12.f27902o1
            r0[r6] = r2
            android.view.View r2 = r12.f27803X3
            r0[r3] = r2
            r12.m48019a(r1, r0)
            goto L_0x021d
        L_0x0218:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f27794W0
            r0.setVisibility(r1)
        L_0x021d:
            androidx.cardview.widget.CardView r0 = r12.f27662A0
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.ChatActivityNew.m47932N1():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void m47935O0() {
        if (!this.f29642a.mo23502X()) {
            return;
        }
        if (this.f27825b2 != null) {
            this.f27860h1.setEnabled(false);
            this.f27727K5.mo38325b(false);
            this.f27928s1.setVisibility(0);
            mo37650Q();
            return;
        }
        finishActivity();
    }

    /* renamed from: O1 */
    private void m47937O1() {
        this.f27749O3 = false;
        this.f27662A0.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public String m47940P0() {
        try {
            return this.f29642a.mo23521a(((messages) this.f27929s2.getMessages().get(0)).getCreated_at() * 1000, this.f27676C2.f32892c);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public void m47942P1() {
        ChatInitModel chatInitModel = this.f27929s2;
        if (chatInitModel != null && chatInitModel.getNoChatInOrder().booleanValue()) {
            this.f27727K5.mo38323a(Boolean.valueOf(false));
            m48018a((int) C10232R.C10236id.action_Choose_Photo, false);
            m48018a((int) C10232R.C10236id.action_share_location, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public String m47945Q0() {
        String str = "";
        try {
            if (this.f27855g2) {
                return this.f27929s2.getOrder().getiCourierId();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f27929s2.getOrder().getiBuyerId());
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: Q1 */
    private void m47948Q1() {
        this.f27786U4 = new Handler();
        this.f27792V4 = new C10326d2();
    }

    /* renamed from: R0 */
    private String m47950R0() {
        String str;
        try {
            if (this.f27855g2) {
                str = this.f27929s2.getOrder().getvCourierName();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f27929s2.getOrder().getvBuyerName());
                str = sb.toString();
            }
            return str;
        } catch (Exception unused) {
            return "User";
        }
    }

    /* renamed from: R1 */
    private void m47952R1() {
        this.f27860h1.addTextChangedListener(new C10332e2());
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public void m47956S0() {
        m48018a((int) C10232R.C10236id.action_goods_delivered, false);
        m48018a((int) C10232R.C10236id.action_withdraw_order, false);
        m48018a((int) C10232R.C10236id.action_route, false);
        m48018a((int) C10232R.C10236id.action_issue_bill, false);
        m48018a((int) C10232R.C10236id.action_start_tracking, false);
        m48018a((int) C10232R.C10236id.action_package_pickedup, false);
    }

    /* renamed from: S1 */
    private void m47958S1() {
        this.f27727K5.setRecordingListener(new C10459y1());
        this.f27727K5.getSendView().setOnClickListener(new C10307a2());
        this.f27727K5.getSendViewAudio().setOnClickListener(new C10313b2());
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public void m47961T0() {
        m48319t(false);
        Timer timer = this.f27787U5;
        if (timer != null) {
            timer.cancel();
            this.f27787U5 = null;
        }
    }

    /* renamed from: T1 */
    private void m47963T1() {
        for (int i = 0; i < this.f27713I3.size(); i++) {
            if (((CancelReasonBean) this.f27713I3.get(i)).getCode() == ((CancelReasonBean) this.f27713I3.get(this.f27725K3.getSelectedItemPosition())).getCode()) {
                this.f27725K3.setSelection(i);
                return;
            }
        }
    }

    /* renamed from: U0 */
    private void m47966U0() {
        this.f27809Y3.animate().translationY((float) (-this.f27809Y3.getHeight())).setInterpolator(new AccelerateInterpolator(2.0f));
    }

    /* renamed from: U1 */
    private void m47967U1() {
        Thread.setDefaultUncaughtExceptionHandler(new C10394o1());
    }

    /* renamed from: V0 */
    private void m47970V0() {
        this.f27871i6 = new AlphaAnimation(1.0f, 0.0f);
        this.f27871i6.setDuration((long) this.f27897n2);
        this.f27871i6.setFillAfter(false);
        this.f27871i6.setAnimationListener(new C10303a());
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m47973V1() {
        if (this.f27743N3) {
            this.f27899n4.setVisibility(8);
            this.f27893m4.setVisibility(0);
            return;
        }
        this.f27899n4.setVisibility(0);
        this.f27893m4.setVisibility(8);
    }

    /* renamed from: W0 */
    private void m47976W0() {
        if (this.f27880k3 == null) {
            this.f27880k3 = C6009d.m27463J();
        }
        this.f27880k3.mo24778a((C6017h) new C10370k2(), getIntent().getData(), (Activity) this);
    }

    /* renamed from: W1 */
    private void m47977W1() {
        this.f27962x0 = (RecyclerView) findViewById(C10232R.C10236id.rvChat);
        this.f27675C1 = new WrapContentLinearLayoutManager(this);
        this.f27675C1.mo7000l(1);
        this.f27962x0.setLayoutManager(this.f27675C1);
        this.f27962x0.setItemAnimator(this.f29642a.mo23672x());
        this.f27962x0.setNestedScrollingEnabled(false);
        this.f27795W1 = new ArrayList<>();
        this.f27801X1 = new C10487g(this.f27795W1, this);
        this.f27962x0.setAdapter(this.f27801X1);
        this.f27801X1.mo37858a((C10511r) new C10416r1());
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m47980X() {
        try {
            if (this.f27807Y1 != null) {
                for (int i = 0; i < this.f27807Y1.size(); i++) {
                    if (this.f27807Y1.get(i) != null && ((Dialog) this.f27807Y1.get(i)).isShowing()) {
                        ((Dialog) this.f27807Y1.get(i)).dismiss();
                    }
                }
            }
            m48330u0();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public void m47981X0() {
        this.f29642a.mo23553a((C11056p) this);
        this.f27920r0 = new C11669t(this);
        this.f27920r0.mo40036a(C11644i.f33339k, (C11673d) new C10324d1());
    }

    /* renamed from: X1 */
    private void m47984X1() {
        this.f27948v0 = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        this.f27955w0 = (ImageView) this.f27948v0.findViewById(C10232R.C10236id.imgClose);
        setSupportActionBar(this.f27948v0);
        this.f27948v0.setVisibility(8);
        if (this.f29642a.mo23496R()) {
            this.f27955w0.setScaleX(-1.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m47986Y() {
        if (this.f27888l5 != null) {
            Builder builder = new Builder();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f27819a2.size(); i++) {
                LatLng latLng = new LatLng(((TrackingCoOrdinateBean) this.f27819a2.get(i)).getLatitude().doubleValue(), ((TrackingCoOrdinateBean) this.f27819a2.get(i)).getLongitude().doubleValue());
                builder.include(latLng);
                arrayList.add(latLng);
            }
            this.f27888l5.addPolyline(mo37658a((Context) this, arrayList, 2, getResources().getColor(C10232R.C10234color.Black)).width(10.0f));
            Iterator it = this.f27810Y4.iterator();
            while (it.hasNext()) {
                builder.include(((Marker) it.next()).getPosition());
            }
            m48028a(builder, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public void m47988Y0() {
        C12036d dVar = new C12036d();
        dVar.mo41172b(this.f27929s2.getOrder_track().getPusher_cluster());
        this.f27864h5 = new C11995c(this.f27929s2.getOrder_track().getPusher_key(), dVar);
        this.f27768R4 = C5887x.m25805b(this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude(), Double.parseDouble(this.f27929s2.getOrder().getvShopLat()), Double.parseDouble(this.f27929s2.getOrder().getvShopLong()));
    }

    /* renamed from: Y1 */
    private boolean m47989Y1() {
        boolean z = true;
        try {
            if (this.f27805X5 || this.f27817Z5 || (!this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3) && !this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3))) {
                z = false;
            }
            return z;
        } catch (Exception unused) {
            this.f27817Z5 = false;
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m47992Z() {
        this.f27969y0 = C11574c.m52155a((Activity) this);
        this.f27969y0.mo39722a((C11573b) this);
        this.f27969y0.mo39720a(0);
        this.f27969y0.mo39726b(true);
        this.f27969y0.mo39723a(true);
        this.f27969y0.mo39719a();
        m48265o(false);
    }

    /* renamed from: Z0 */
    private boolean m47994Z0() {
        for (int i = 0; i < C11644i.f33468z6.size(); i++) {
            String str = this.f27825b2;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
            if (str.equalsIgnoreCase(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public boolean m47996Z1() {
        if (this.f29642a.mo23497S()) {
            C11095j jVar = this.f27829b6;
            if (jVar == null || !jVar.mo38893g()) {
                C11120n nVar = this.f27823a6;
                if (nVar == null || !nVar.mo38927b()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m48072a0() {
        this.f27962x0.addOnLayoutChangeListener(new C10371k3());
        if (this.f27795W1.size() > 0) {
            this.f27962x0.scrollToPosition(this.f27795W1.size() - 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public String m48075a1() {
        String str = C11644i.f33199T5;
        try {
            if (this.f27670B2 != null && this.f27670B2.containsKey(str)) {
                return this.f27670B2.getString(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public boolean m48077a2() {
        try {
            if ((m48109b1() && "accepted".equals(this.f27929s2.getPortalOrderDetail().getStatus())) || "ready".equals(this.f27929s2.getPortalOrderDetail().getStatus())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b0 */
    private void m48107b0() {
        if (this.f27720J4 == null) {
            if (!(this.f27929s2.getOrder_track().getCourier_base_lat().doubleValue() == 0.0d || this.f27929s2.getOrder_track().getCourier_base_lng().doubleValue() == 0.0d)) {
                this.f27720J4 = this.f27888l5.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.ic_car)).position(new LatLng(this.f27929s2.getOrder_track().getCourier_base_lat().doubleValue(), this.f27929s2.getOrder_track().getCourier_base_lng().doubleValue())).anchor(0.5f, 0.7f).title("driver"));
                this.f27810Y4.add(this.f27720J4);
                if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3) || this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                    this.f27816Z4.add(this.f27720J4);
                }
            }
            m48068a(this.f27816Z4, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public boolean m48109b1() {
        if (this.f27929s2.getPortalOrderDetail() != null && !TextUtils.isEmpty(this.f27929s2.getPortalOrderDetail().getBusinessOrderId())) {
            if (!"time_out".equalsIgnoreCase(this.f27929s2.getPortalOrderDetail().getStatus())) {
                if (!"rejected".equalsIgnoreCase(this.f27929s2.getPortalOrderDetail().getStatus())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b2 */
    private void m48111b2() {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_pos_neg);
            dialog.setCancelable(true);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView.setText(this.f27929s2.getOrderDialogFlags().getOrderCancelRequestDialogText());
            textView2.setText(getResources().getString(C10232R.string.msg_cancel_request_positive));
            textView3.setText(getResources().getString(C10232R.string.msg_cancel_request_negetive));
            textView2.setOnClickListener(new C10381m0(dialog));
            textView3.setOnClickListener(new C10387n0(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m48124c0() {
        GoogleMap googleMap = this.f27888l5;
        if (googleMap != null && this.f27927s0 != null && this.f29642a != null) {
            googleMap.clear();
            this.f27810Y4.clear();
            this.f27816Z4.clear();
            String str = "";
            if (this.f29642a.mo23648p() != null) {
                if (this.f27977z1 == null) {
                    this.f27977z1 = m48237m(4);
                }
                Marker addMarker = this.f27888l5.addMarker(new MarkerOptions().icon(this.f27743N3 ? BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.map_pin_new) : BitmapDescriptorFactory.fromBitmap(this.f29642a.mo23509a((Context) this, this.f27977z1))).position(new LatLng(this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude())).anchor(0.2f, 1.0f).title(str));
                this.f27810Y4.add(addMarker);
                if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3) || (this.f27929s2.getOrder().getvShopType().equalsIgnoreCase(C11644i.f33253a3) && !this.f27929s2.getOrder().getServicePickupAvailable())) {
                    this.f27816Z4.add(addMarker);
                }
            }
            if (this.f27929s2.getOrder().getvShopLat() != null) {
                if (!this.f27929s2.getOrder().getvShopType().equalsIgnoreCase("service") || this.f27929s2.getOrder().getServicePickupAvailable()) {
                    if (this.f27970y1 == null) {
                        this.f27970y1 = m48237m(3);
                    }
                    Marker addMarker2 = this.f27888l5.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(this.f29642a.mo23509a((Context) this, this.f27970y1))).position(new LatLng((this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLat()) : Double.valueOf(this.f27929s2.getOrder().getPlatitude())).doubleValue(), (this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLong()) : Double.valueOf(this.f27929s2.getOrder().getPlongitude())).doubleValue())).anchor(0.2f, 1.0f).title(str));
                    this.f27810Y4.add(addMarker2);
                    if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                        this.f27816Z4.add(addMarker2);
                    }
                } else {
                    this.f27791V3.setVisibility(8);
                }
            }
            LatLng A0 = m47848A0();
            if (A0 != null) {
                this.f27850f3 = new CourierLastLocationBean();
                this.f27850f3.setLatitude(Double.valueOf(A0.latitude));
                this.f27850f3.setLongitude(Double.valueOf(A0.longitude));
                this.f27929s2.getOrder_track().setCourier_base_lat(this.f27850f3.getLatitude());
                this.f27929s2.getOrder_track().setCourier_base_lng(this.f27850f3.getLongitude());
                m48218k(true);
            } else {
                m48218k(false);
            }
            m48068a(this.f27816Z4, false);
            this.f27888l5.setOnCameraMoveStartedListener(new C10427t());
        }
    }

    /* renamed from: c1 */
    private boolean m48127c1() {
        if (this.f27725K3.getSelectedItemPosition() > 0) {
            return true;
        }
        this.f29642a.mo23615f(getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m48129c2() {
        if (this.f27929s2.isShowPay()) {
            if (this.f27929s2.isPaid()) {
                this.f27845e4.setText(C10232R.string.lbl_payment_done);
                this.f27851f4.setVisibility(4);
                this.f27842e1.setVisibility(0);
            } else {
                this.f27851f4.setText(C10232R.string.lbl_pay_now);
                this.f27851f4.setVisibility(0);
                this.f27842e1.setVisibility(8);
                if (!this.f29642a.mo23598c(C11644i.f33445x)) {
                    this.f27851f4.setAlpha(0.7f);
                }
            }
            this.f27809Y3.setVisibility(0);
        } else if (this.f27799W5.booleanValue() && this.f27905o4.getVisibility() == 0) {
            this.f27809Y3.setVisibility(0);
            this.f27799W5 = Boolean.valueOf(false);
        } else if (this.f27905o4.getVisibility() == 0) {
            this.f27809Y3.setVisibility(0);
        } else {
            this.f27809Y3.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m48140d0() {
        this.f27920r0.mo40036a(C11644i.f33330j, (C11673d) new C10417r2());
    }

    /* renamed from: d1 */
    private boolean m48142d1() {
        if (this.f27725K3.getSelectedItemPosition() > 0) {
            return true;
        }
        this.f29642a.mo23615f(getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m48143d2() {
        if (this.f27929s2.isPaid()) {
            this.f29642a.mo23533a(0, this.f27794W0);
            this.f29642a.mo23533a(8, this.f27662A0);
            this.f27740N0.setText(getResources().getString(C10232R.string.lbl_payment_done));
            findViewById(C10232R.C10236id.ivArrow).setVisibility(8);
        } else if (this.f27929s2.isShowPay()) {
            this.f29642a.mo23533a(0, this.f27794W0, this.f27746O0);
            this.f29642a.mo23533a(8, this.f27723K1);
            m48091b(this.f27740N0);
            if (this.f27929s2.getOrderPayment().getPaymentStatus().equalsIgnoreCase("processing")) {
                m48310s(true);
                return;
            }
            this.f29642a.mo23533a(0, this.f27794W0, this.f27746O0);
            this.f29642a.mo23533a(8, this.f27723K1);
            this.f27746O0.setText(getResources().getString(C10232R.string.lbl_pay_now));
            this.f27662A0.setEnabled(true);
            findViewById(C10232R.C10236id.ivArrow).setVisibility(0);
        } else {
            this.f29642a.mo23533a(8, this.f27794W0);
        }
    }

    /* renamed from: e0 */
    private void m48152e0() {
        try {
            if (this.f27870i5 == null) {
                m47919L(this.f27726K4);
            }
            this.f27870i5.mo41095b(getResources().getString(C10232R.string.pusher_event), new C10464z());
        } catch (Exception unused) {
        }
    }

    /* renamed from: e1 */
    private boolean m48155e1() {
        if (this.f27725K3.getSelectedItemPosition() > 0) {
            return true;
        }
        this.f29642a.mo23615f(getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if ("accepted".equals(r2.f27929s2.getPortalOrderDetail().getStatus()) == false) goto L_0x0018;
     */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m48156e2() {
        /*
            r2 = this;
            boolean r0 = r2.m48109b1()
            if (r0 == 0) goto L_0x0018
            com.mrsool.bean.ChatInitModel r0 = r2.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            java.lang.String r1 = "accepted"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0018:
            com.mrsool.bean.ChatInitModel r0 = r2.f27929s2
            com.mrsool.bean.PortalOrderDetail r0 = r0.getPortalOrderDetail()
            java.lang.String r0 = r0.getStatus()
            java.lang.String r1 = "ready"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            boolean r0 = r2.f27855g2
            if (r0 == 0) goto L_0x003c
            r0 = 2131361861(0x7f0a0045, float:1.8343486E38)
            r1 = 2131886687(0x7f12025f, float:1.940796E38)
            java.lang.String r1 = r2.getString(r1)
            r2.m48088b(r0, r1)
            goto L_0x0049
        L_0x003c:
            r0 = 2131361887(0x7f0a005f, float:1.834354E38)
            r1 = 2131887240(0x7f120488, float:1.9409081E38)
            java.lang.String r1 = r2.getString(r1)
            r2.m48088b(r0, r1)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.ChatActivityNew.m48156e2():void");
    }

    @RequiresApi(api = 21)
    /* renamed from: f0 */
    private Visibility m48165f0() {
        Slide slide = new Slide();
        slide.setDuration(500);
        slide.setSlideEdge(5);
        return slide;
    }

    /* renamed from: f1 */
    private void m48167f1() {
        this.f27830c1.setVisibility(0);
        C2232l.m11649c(getApplicationContext()).mo9515a(this.f27929s2.getOrder().getvShopPic()).mo9441j().m11411d().mo9458b(new C10383m2(this.f27830c1));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m48169f2() {
        String str;
        if (this.f27929s2.isDisableChat()) {
            this.f27866i1.setVisibility(0);
            this.f27727K5.setVisibility(8);
            this.f27854g1.setVisibility(0);
            this.f27921r1.setVisibility(0);
            this.f27752P0.setText(this.f27929s2.getDisableChatLabel());
            str = "Roboto-Medium.ttf";
        } else {
            this.f27866i1.setVisibility(8);
            this.f27854g1.setVisibility(8);
            this.f27921r1.setVisibility(8);
            this.f27727K5.setVisibility(0);
            str = "Roboto-Bold.ttf";
        }
        this.f27752P0.setTypeface(Typeface.createFromAsset(getAssets(), str));
    }

    /* renamed from: g0 */
    private void m48176g0() {
        this.f27940t6 = 0;
        this.f27933s6 = 0;
        this.f27926r6 = 0;
        this.f27919q6 = 0;
        this.f27913p6 = 0;
        this.f27954v6 = false;
        this.f27947u6 = false;
        String str = this.f27929s2.getOrder().getiBuyerId();
        String str2 = this.f27929s2.getOrder().getiCourierId();
        Iterator it = this.f27795W1.iterator();
        while (it.hasNext()) {
            messages messages = (messages) it.next();
            if (messages.getvType().equalsIgnoreCase("text")) {
                if (messages.getiFromUserId().equals(str)) {
                    this.f27940t6++;
                } else if (messages.getiFromUserId().equals(str2)) {
                    this.f27933s6++;
                }
            } else if (messages.getvType().equalsIgnoreCase("image")) {
                this.f27913p6++;
            } else if (messages.getvType().equalsIgnoreCase("audio")) {
                if (messages.getiFromUserId().equals(str)) {
                    this.f27926r6++;
                } else if (messages.getiFromUserId().equals(str2)) {
                    this.f27919q6++;
                }
            } else if (messages.getvType().equalsIgnoreCase("complaint") && messages.getVtxTitle().equals(C11644i.f33307g3)) {
                if (messages.getiFromUserId().equals(str)) {
                    this.f27947u6 = true;
                } else if (messages.getiFromUserId().equals(str2)) {
                    this.f27954v6 = true;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public void m48178g1() {
        boolean z;
        Iterator it = this.f27929s2.getOrderOffer().getPaymentOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((PaymentListBean) it.next()).getCode().equalsIgnoreCase(C11601c.Cash.mo39844d())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C11598a.m52263f().mo39826a(this.f27929s2.getMultiple_offers_count().intValue() == 0, this.f27929s2.getMultiple_offers_count().intValue(), this.f27929s2.getOrderOffer().getDbDeliveryCost() - this.f27929s2.getMin_del_cost(), this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton().booleanValue(), z, this.f27929s2.getOrderOffer().getDbDeliveryCost(), this.f27929s2.getOrder().getiOrderId());
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m48181g2() {
        if (this.f27929s2.getOrderPayment().isShowPay()) {
            m48019a(8, this.f27890m1);
            m48019a(0, this.f27896n1, this.f27764R0, this.f27980z4);
            String str = " - ";
            if (this.f27929s2.getOrderPayment().isPaid()) {
                TextView textView = this.f27764R0;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(getResources().getString(C10232R.string.lbl_payment_received));
                textView.setText(sb.toString());
                this.f27980z4.setVisibility(0);
                return;
            }
            TextView textView2 = this.f27764R0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(getResources().getString(C10232R.string.lbl_payment_pending));
            textView2.setText(sb2.toString());
            this.f27980z4.setVisibility(8);
            return;
        }
        this.f27764R0.setVisibility(8);
        this.f27980z4.setVisibility(8);
        m48019a(0, this.f27890m1);
        m48019a(8, this.f27896n1);
    }

    /* renamed from: h0 */
    private void m48187h0() {
        m47855B0().mo39717a(new C10485e(this));
    }

    /* renamed from: h1 */
    private void m48190h1() {
        if (this.f27855g2) {
            C11598a.m52263f().mo39816a(this.f27929s2.getOrder().getOrderStatus(), this.f27929s2.getOrder().getiOrderId(), (double) this.f29642a.mo23507a(this.f27929s2.getOrderOffer().getOffer_received_at(), System.currentTimeMillis()), this.f27929s2.getOrder().getvShopId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public void m48192h2() {
        if (this.f27866i1.getVisibility() == 0) {
            ChatInitModel chatInitModel = this.f27929s2;
            if (chatInitModel != null && !chatInitModel.isDisableChat()) {
                this.f27812Z0.setVisibility(0);
                supportInvalidateOptionsMenu();
            }
        }
        this.f27812Z0.setVisibility(8);
        supportInvalidateOptionsMenu();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m48197i0() {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("iOrderId", this.f27825b2);
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f27929s2.getOrderOffer().getCourierId());
        hashMap.put("iCourierId", sb.toString());
        hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("vStatus", "delivered");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb2.toString());
        m48176g0();
        C11687c.m52645a(this.f29642a).withdrawOrder(String.valueOf(this.f27825b2), hashMap).enqueue(new C10390n3());
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public void m48200i1() {
        boolean z;
        Iterator it = this.f27929s2.getOrderOffer().getPaymentOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((PaymentListBean) it.next()).getCode().equalsIgnoreCase(C11601c.Cash.mo39844d())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C11598a.m52263f().mo39832b(true, this.f27929s2.getMultiple_offers_count().intValue(), this.f27929s2.getOrderOffer().getDbDeliveryCost() - this.f27929s2.getMin_del_cost(), this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton().booleanValue(), z, this.f27929s2.getOrderOffer().getDbDeliveryCost(), this.f27929s2.getOrder().getiOrderId());
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m48202i2() {
        ChatInitModel chatInitModel = this.f27929s2;
        if (chatInitModel != null) {
            m48018a((int) C10232R.C10236id.action_issue_bill, chatInitModel.getIssue_bill_option().booleanValue());
            if (this.f27929s2.getIssue_bill_option().booleanValue()) {
                m48018a((int) C10232R.C10236id.action_issue_bill, true);
            } else {
                m48018a((int) C10232R.C10236id.action_issue_bill, false);
            }
            if (!this.f27929s2.getPackage_picked_option().booleanValue() || this.f27929s2.getOrder().getPackagePickedUp()) {
                m48018a((int) C10232R.C10236id.action_package_pickedup, false);
            } else {
                m48018a((int) C10232R.C10236id.action_package_pickedup, true);
            }
        }
    }

    /* renamed from: j0 */
    private void m48208j0() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f27662A0.setEnabled(false);
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33747Y0, m47870D0());
            hashMap.put("order_id", this.f27825b2);
            hashMap.put("language", this.f29642a.mo23645o().toUpperCase());
            C11687c.m52644a().sendOrder(hashMap).enqueue(new C10452x0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public void m48210j1() {
        C11598a f = C11598a.m52263f();
        C5887x xVar = this.f29642a;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(C11718b.m52728b((Context) this, this.f27709H5));
        f.mo39805a(xVar.mo23600d(Double.parseDouble(sb.toString())), this.f27929s2.getOrder().getiOrderId(), this.f27929s2.getOrder().getvShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m48212j2() {
        if (this.f27678C4 > 0) {
            m48070a(true, this.f27672B4);
            this.f27672B4.setVisibility(0);
            TextView textView = this.f27672B4;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f27678C4);
            textView.setText(sb.toString());
            return;
        }
        m48070a(false, this.f27672B4);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m48220k0() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    /* renamed from: k1 */
    private void m48221k1() {
        try {
            C11598a.m52263f().mo39821a(this.f27929s2.getOrder().getiOrderId(), C11644i.f33056B6.size() > 0, C5887x.m25791S(this.f27929s2.getOrder().getDistance_courier_shop()), C5887x.m25791S(this.f27929s2.getOrder().getDistance_shop_buyer()) + C5887x.m25791S(this.f27929s2.getOrder().getDistance_courier_shop()), this.f27929s2.getOrder().getvShopId());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m48223k2() {
        if (this.f27855g2 && this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered") && this.f27929s2.isPaid()) {
            this.f29642a.mo23533a(0, this.f27794W0);
            this.f29642a.mo23533a(8, this.f27662A0);
            this.f27740N0.setText(getResources().getString(C10232R.string.lbl_payment_done));
            findViewById(C10232R.C10236id.ivArrow).setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m48231l0() {
        m48226l(1);
        if (TextUtils.isEmpty(this.f27929s2.getOrderOffer().getOffer_id())) {
            mo37664a(getResources().getString(C10232R.string.msg_error_server_issue), getResources().getString(C10232R.string.app_name), true);
            return;
        }
        HashMap hashMap = new HashMap();
        String str = "user_id";
        hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f(str));
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f29642a.mo23468C().mo23459f(str));
        hashMap.put("iCourierId", sb2.toString());
        hashMap.put("status", C11644i.f33298f3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(this.f27929s2.getOrderOffer().getDbDeliveryCost());
        hashMap.put("delivery_cost", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(this.f27929s2.getOrderOffer().getOffer_id());
        hashMap.put("offer_id", sb4.toString());
        C11687c.m52645a(this.f29642a).withdrawOrderBeforeAccept(String.valueOf(this.f27825b2), hashMap).enqueue(new C10407q());
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public void m48234l1() {
        try {
            this.f27715I5.mo39848a(this.f27929s2.getOrder().getvShopId(), this.f27929s2.getOrderOffer().getdDiscountCost());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m48236l2() {
        if (this.f27929s2 != null) {
            if (this.f27815Z3.getVisibility() == 8) {
                if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3) || this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) {
                    m47885F0();
                    this.f29642a.mo23489M("Connecting...");
                    C5880q.m25751b("PUSHER:Connecting...");
                    m48339v0();
                    m47919L(this.f27726K4);
                    m48152e0();
                    Handler handler = this.f27786U4;
                    if (handler != null) {
                        Runnable runnable = this.f27792V4;
                        if (runnable != null) {
                            handler.removeCallbacks(runnable);
                        }
                    }
                } else if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered")) {
                    m47902I0();
                }
                this.f27678C4 = 0;
                m48212j2();
                m48069a(true, (View) this.f27821a4);
                m48346w(false);
                new Handler().postDelayed(new C10391n4(), 10);
            } else {
                new Handler().postDelayed(new C10397o4(), 0);
                ((FrameLayout) findViewById(C10232R.C10236id.layMapContainer)).setVisibility(4);
                this.f27839d4.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m48244m0() {
        if (this.f27929s2.getOrderDialogFlags().getShowWaitingForOfferDialog().booleanValue() || this.f27929s2.getOrderDialogFlags().getShowWaitingOfferAcceptDialog().booleanValue()) {
            m48369y1();
        }
        if (this.f27929s2.getOrderDialogFlags().getShowAcceptRejectDialog().booleanValue()) {
            m48019a(0, this.f27785U3, this.f27821a4);
            m48281p1();
        }
        if (this.f27929s2.getOrderDialogFlags().getShowCancelOrderDialog().booleanValue()) {
            m48292q1();
        }
        if (this.f27929s2.getOrderDialogFlags().getShowAlreadyTakenDialog().booleanValue() || this.f27929s2.getOrderDialogFlags().getShowCourierBlockedDialog().booleanValue()) {
            m48345w(this.f27929s2.getOrderDialogFlags().getShowAlreadyTakenDialog().booleanValue() ? this.f27929s2.getOrderDialogFlags().getAlreadyTakenDialogText() : this.f27929s2.getOrderDialogFlags().getCourierBlockedDialogText());
        }
        if (this.f27929s2.getOrderDialogFlags().getShowOrderCancelRequestDialog().booleanValue()) {
            m48111b2();
        }
        if (this.f27929s2.getOrderDialogFlags().getShowSupersededDialog().booleanValue()) {
            m47858B1();
        }
        if (this.f27929s2.getOrderDialogFlags().getShowRejectedOfferDialog().booleanValue()) {
            m48341v1();
        }
    }

    /* renamed from: m1 */
    private void m48245m1() {
        if (this.f27720J4 != null) {
            C11463c cVar = new C11463c();
            C11471d dVar = new C11471d();
            StringBuilder sb = new StringBuilder();
            sb.append("Current : (");
            sb.append(this.f27714I4.getLatitude());
            sb.append(",");
            sb.append(this.f27714I4.getLongitude());
            sb.append(")");
            C5880q.m25751b(sb.toString());
            try {
                float bearingTo = this.f27708H4.bearingTo(this.f27714I4);
                if (bearingTo != 0.0f) {
                    this.f27858g5 = true;
                    m48029a(this.f27720J4, bearingTo);
                    m47916K1();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Handler().postDelayed(new C10439v(dVar, cVar), 500);
            return;
        }
        GoogleMap googleMap = this.f27888l5;
        if (googleMap != null) {
            this.f27720J4 = googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.ic_current_location_temp)).position(new LatLng(this.f27714I4.getLatitude(), this.f27714I4.getLongitude())).anchor(0.5f, 0.7f).title("driver"));
        }
    }

    /* renamed from: m2 */
    private void m48248m2() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_map_style);
        dialog.setCancelable(true);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvSatellite);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvHybrid);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMap)).setOnClickListener(new C10306a1(dialog));
        textView2.setOnClickListener(new C10312b1(dialog));
        textView.setOnClickListener(new C10331e1(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m48255n0() {
        if (this.f27929s2.getOrderDialogFlags().getShowAcceptRejectDialog().booleanValue()) {
            m48281p1();
        }
    }

    /* renamed from: n1 */
    private void m48257n1() {
        try {
            ArrayList arrayList = new ArrayList();
            String str = "service";
            if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                Marker addMarker = this.f27888l5.addMarker(new MarkerOptions().position(new LatLng(this.f29642a.mo23648p().latitude, this.f29642a.mo23648p().longitude)).icon(BitmapDescriptorFactory.defaultMarker(120.0f)));
                addMarker.setVisible(false);
                arrayList.add(addMarker);
                if (this.f27929s2.getOrder().getvShopLat() != null) {
                    if (!this.f27929s2.getOrder().getvShopType().equalsIgnoreCase(str) || this.f27929s2.getOrder().getServicePickupAvailable()) {
                        Marker addMarker2 = this.f27888l5.addMarker(new MarkerOptions().position(new LatLng((this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLat()) : Double.valueOf(this.f27929s2.getOrder().getPlatitude())).doubleValue(), (this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLong()) : Double.valueOf(this.f27929s2.getOrder().getPlongitude())).doubleValue())).icon(BitmapDescriptorFactory.defaultMarker(120.0f)));
                        addMarker2.setVisible(false);
                        arrayList.add(addMarker2);
                    }
                }
            } else if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3)) {
                if (this.f27929s2.getOrder().getvShopLat() != null) {
                    if (!this.f27929s2.getOrder().getvShopType().equalsIgnoreCase(str) || this.f27929s2.getOrder().getServicePickupAvailable()) {
                        Marker addMarker3 = this.f27888l5.addMarker(new MarkerOptions().position(new LatLng((this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLat()) : Double.valueOf(this.f27929s2.getOrder().getPlatitude())).doubleValue(), (this.f27743N3 ? Double.valueOf(this.f27929s2.getOrder().getvShopLong()) : Double.valueOf(this.f27929s2.getOrder().getPlongitude())).doubleValue())).icon(BitmapDescriptorFactory.defaultMarker(120.0f)));
                        addMarker3.setVisible(false);
                        arrayList.add(addMarker3);
                    }
                }
                Marker addMarker4 = this.f27888l5.addMarker(new MarkerOptions().position(new LatLng(this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude())).icon(BitmapDescriptorFactory.defaultMarker(120.0f)));
                addMarker4.setVisible(false);
                arrayList.add(addMarker4);
            }
            m48068a(arrayList, false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: n2 */
    private void m48259n2() {
        if (this.f27929s2 != null) {
            try {
                this.f27895m6 = this.f29642a.mo23508a((int) C10232R.layout.dialog_order_reciept, true);
                TextView textView = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvCostOfProduct);
                TextView textView2 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvDeliveryCostValue);
                TextView textView3 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvTotalCost);
                TextView textView4 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvTaxNumberValue);
                TextView textView5 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvDeliveryCost);
                TextView textView6 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvLabelDeliveryVat);
                TextView textView7 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvWarning);
                TextView textView8 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.btnDone);
                TextView textView9 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvDeliveryDiscount);
                TextView textView10 = (TextView) this.f27895m6.findViewById(C10232R.C10236id.tvTaxValue);
                CardView cardView = (CardView) this.f27895m6.findViewById(C10232R.C10236id.cvReceiptImage);
                ImageView imageView = (ImageView) this.f27895m6.findViewById(C10232R.C10236id.ivReceipt);
                LinearLayout linearLayout = (LinearLayout) this.f27895m6.findViewById(C10232R.C10236id.llWarning);
                LinearLayout linearLayout2 = (LinearLayout) this.f27895m6.findViewById(C10232R.C10236id.llDeliveryDiscount);
                LinearLayout linearLayout3 = (LinearLayout) this.f27895m6.findViewById(C10232R.C10236id.llTax);
                LinearLayout linearLayout4 = linearLayout2;
                LinearLayout linearLayout5 = linearLayout;
                ((TextView) this.f27895m6.findViewById(C10232R.C10236id.tvOrderID)).setText(String.format(getResources().getString(C10232R.string.lbl_order_id_value), new Object[]{String.valueOf(this.f27929s2.getOrder().getiOrderId())}));
                textView.setText(String.format(getResources().getString(C10232R.string.lbl_two_string), new Object[]{this.f27929s2.getOrderDetailBill().getDbOrderCost(), this.f27929s2.getOrder().getCurrency()}));
                textView2.setText(String.format(getResources().getString(C10232R.string.lbl_two_string), new Object[]{m47891G0(), this.f27929s2.getOrder().getCurrency()}));
                textView3.setText(String.format(getResources().getString(C10232R.string.lbl_two_string), new Object[]{this.f27929s2.getOrderDetailBill().getDbTotalCost(), this.f27929s2.getOrder().getCurrency()}));
                textView4.setText(this.f27929s2.getOrderDetailBill().getTaxNumber());
                textView7.setText(this.f27929s2.getOrderDetailBill().getBillWarningLabel());
                textView9.setText(String.format(getResources().getString(C10232R.string.lbl_two_string_negetive), new Object[]{this.f27929s2.getOrderDetailBill().getDiscountAmount(), this.f27929s2.getOrder().getCurrency()}));
                textView10.setText(String.format(getResources().getString(C10232R.string.lbl_two_string), new Object[]{this.f27929s2.getOrderDetailBill().getVatAmount(), this.f27929s2.getOrder().getCurrency()}));
                if (!TextUtils.isEmpty(this.f27929s2.getOrderDetailBill().getImage())) {
                    cardView.setVisibility(0);
                    C2232l.m11636a((C1376c) this).mo9515a(this.f27929s2.getOrderDetailBill().getImage()).m11500e((int) C10232R.C10235drawable.ic_price_walkthrough_place_holder).m11491c((int) C10232R.C10235drawable.ic_price_walkthrough_place_holder).mo9424a(imageView);
                } else {
                    cardView.setVisibility(8);
                }
                textView8.setOnClickListener(new C10403p1());
                imageView.setOnClickListener(new C10409q1());
                if (TextUtils.isEmpty(this.f27929s2.getOrderDetailBill().getBillWarningLabel())) {
                    linearLayout5.setVisibility(8);
                } else {
                    linearLayout5.setVisibility(0);
                }
                if (Double.parseDouble(this.f27929s2.getOrderDetailBill().getDiscountAmount()) == 0.0d) {
                    linearLayout4.setVisibility(8);
                } else {
                    linearLayout4.setVisibility(0);
                }
                if (!isFinishing() && !this.f27895m6.isShowing()) {
                    this.f27895m6.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o0 */
    private void m48267o0() {
        Timer timer = this.f27787U5;
        if (timer != null) {
            timer.cancel();
            this.f27787U5 = null;
        }
        if (this.f27787U5 == null) {
            this.f27787U5 = new Timer();
            Timer timer2 = this.f27787U5;
            C10366k kVar = new C10366k();
            int i = this.f27763Q5;
            timer2.schedule(kVar, (long) i, (long) i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public void m48269o1() {
        if (this.f27929s2 != null) {
            Intent intent = new Intent(this, UserFeedbackActivity.class);
            intent.putExtra(C11644i.f33067D1, C11644i.f33083F1);
            String str = "userId";
            if (this.f27855g2) {
                if (this.f27929s2.getOrder().getiCourierId() != null) {
                    intent.putExtra(str, String.valueOf(this.f27929s2.getOrder().getiCourierId()));
                }
            } else if (this.f27929s2.getOrder().getiBuyerId() != null) {
                intent.putExtra(str, String.valueOf(this.f27929s2.getOrder().getiBuyerId()));
            }
            startActivity(intent);
        }
    }

    /* renamed from: o2 */
    private void m48271o2() {
        this.f27809Y3.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    /* renamed from: p0 */
    private void m48278p0() {
        if (this.f27703G5) {
            C11694e.INSTANCE.mo40199a(ChatState.paused, m47945Q0(), C11713f.COMPOSING_PAUSED.ordinal());
            this.f27703G5 = false;
        }
        Timer timer = this.f27775S5;
        if (timer != null) {
            timer.cancel();
            this.f27775S5 = null;
        }
        Timer timer2 = this.f27781T5;
        if (timer2 != null) {
            timer2.cancel();
            this.f27781T5 = null;
        }
    }

    /* renamed from: p1 */
    private void m48281p1() {
        if (m48122c(this.f27936t2)) {
            m48089b(this.f27936t2);
        }
        m48020a(this.f27936t2);
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyleAcceptReject);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(C10232R.layout.dialog_order_accept_reject_1);
        dialog.setCancelable(true);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtUserName);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtCost);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtDiscountCost);
        FrameLayout frameLayout = (FrameLayout) dialog.findViewById(C10232R.C10236id.flBestOffer);
        TextView textView5 = (TextView) dialog.findViewById(C10232R.C10236id.txtOffersCount);
        ImageView imageView = (ImageView) dialog.findViewById(C10232R.C10236id.ivSelectedPaymentMethod);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(C10232R.C10236id.llSeeAllOffers);
        LinearLayout linearLayout2 = (LinearLayout) dialog.findViewById(C10232R.C10236id.llselectedPayments);
        ImageView imageView2 = (ImageView) dialog.findViewById(C10232R.C10236id.ivArrowRightOffer);
        CardView cardView = (CardView) dialog.findViewById(C10232R.C10236id.cvMiddleStack);
        TextView textView6 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        CardView cardView2 = (CardView) dialog.findViewById(C10232R.C10236id.cvBottomStack);
        TextView textView7 = (TextView) dialog.findViewById(C10232R.C10236id.txtDistance);
        TextView textView8 = (TextView) dialog.findViewById(C10232R.C10236id.txtDeliveryTime);
        ImageView imageView3 = (ImageView) dialog.findViewById(C10232R.C10236id.ivCourier);
        LayoutParams layoutParams = new LayoutParams(105, 34);
        layoutParams.setMargins(0, 0, 30, 0);
        int i = 0;
        while (i < this.f27929s2.getOrderOffer().getPaymentOptions().size()) {
            ImageView imageView4 = new ImageView(this);
            TextView textView9 = textView2;
            imageView4.setScaleType(ScaleType.CENTER_INSIDE);
            imageView4.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = layoutParams;
            C2232l.m11636a((C1376c) this).mo9515a(((PaymentListBean) this.f27929s2.getOrderOffer().getPaymentOptions().get(i)).getPaymentIconUrl()).mo9424a(imageView4);
            linearLayout2.addView(imageView4);
            i++;
            textView2 = textView9;
            layoutParams = layoutParams2;
        }
        TextView textView10 = textView2;
        int i2 = 8;
        m48027a(textView3, 0, 8);
        m48027a(textView4, 0, 12);
        if (this.f29642a.mo23496R()) {
            imageView2.setRotation(180.0f);
        }
        if (this.f27929s2.getOrderDialogFlags() != null) {
            if (this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton() == null || !this.f27929s2.getOrderDialogFlags().getReplaceRejectCancelButton().booleanValue()) {
                frameLayout.setVisibility(8);
            } else {
                frameLayout.setVisibility(0);
            }
            textView.setText(this.f27929s2.getOrderDialogFlags().getRejectCancelButtonLabel());
        }
        String str = "";
        if (this.f27929s2.isHas_multiple_offers()) {
            linearLayout.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27929s2.getMultiple_offers_count());
            sb.append(str);
            textView5.setText(sb.toString());
            cardView.setVisibility(0);
            cardView2.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
            cardView.setVisibility(8);
            cardView2.setVisibility(8);
        }
        textView3.setPaintFlags(textView3.getPaintFlags() | 16);
        TextView textView11 = (TextView) dialog.findViewById(C10232R.C10236id.txtRating);
        ((RatingBar) dialog.findViewById(C10232R.C10236id.rating1)).setRating(this.f27929s2.getOrderOffer().getfCourierRatings());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27929s2.getOrderOffer().getUser_delivery_count());
        sb2.append(str);
        textView11.setText(sb2.toString());
        this.f27936t2 = dialog;
        this.f27807Y1.add(this.f27936t2);
        m48330u0();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f27929s2.getOrderOffer().getCourierName());
        textView10.setText(sb3.toString());
        ImageView imageView5 = imageView3;
        C2232l.m11649c(getApplicationContext()).mo9515a(this.f27929s2.getOrderOffer().getCourierPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10340f4(imageView5, imageView5));
        textView3.setPaintFlags(17);
        if (this.f27929s2.getOrderOffer().getDbDeliveryCost() != this.f27929s2.getOrderOffer().getdDiscountCost()) {
            i2 = 0;
        }
        textView3.setVisibility(i2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(this.f27929s2.getOrderOffer().getdDiscountCost_txt());
        textView4.setText(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(this.f27929s2.getOrderOffer().getDbDeliveryCost_txt());
        textView3.setText(sb5.toString());
        String dbDeliveryCost_txt = this.f27929s2.getOrderOffer().getDbDeliveryCost_txt();
        String str2 = "(";
        if (dbDeliveryCost_txt.contains(str2)) {
            try {
                String substring = dbDeliveryCost_txt.substring(0, dbDeliveryCost_txt.indexOf(str2));
                String substring2 = dbDeliveryCost_txt.substring(dbDeliveryCost_txt.indexOf(str2), dbDeliveryCost_txt.length());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(substring);
                sb6.append("\n");
                sb6.append(substring2);
                textView3.setText(sb6.toString());
            } catch (Exception unused) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(dbDeliveryCost_txt);
                textView3.setText(sb7.toString());
            }
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append(dbDeliveryCost_txt);
            textView3.setText(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(str);
        sb9.append(this.f27929s2.getOrderOffer().getDeliverWithin());
        textView8.setText(sb9.toString());
        StringBuilder sb10 = new StringBuilder();
        sb10.append(str);
        String string = getResources().getString(C10232R.string.lbl_distance_km);
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str);
        sb11.append(this.f27929s2.getOrderOffer().getDbDistanceFromMe());
        sb10.append(String.format(string, new Object[]{sb11.toString()}));
        textView7.setText(sb10.toString());
        dialog.setOnKeyListener(new C10346g4(dialog));
        TextView textView12 = textView6;
        textView12.setOnClickListener(new C10352h4(textView12));
        textView.setOnClickListener(new C10358i4());
        linearLayout.setOnClickListener(new C10365j4());
        imageView5.setOnClickListener(new C10373k4());
        if (!isFinishing()) {
            dialog.show();
        }
        try {
            if (C11644i.f33437w) {
                C11617f fVar = this.f27676C2;
                String a = this.f27676C2.mo39861a(this.f27929s2.getOrderOffer().getOffer_received_at());
                String valueOf = String.valueOf(this.f27929s2.getOrderOffer().getdDiscountCost());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(this.f27929s2.getOrder().isCourierVerified());
                fVar.mo39864a(a, valueOf, sb12.toString(), this.f27929s2.getOrder().getfCourierRatings(), String.valueOf(this.f27929s2.getOrder().getiOrderId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public void m48283p2() {
        SharedPreferences b = this.f29642a.mo23470D().mo23451b();
        StringBuilder sb = new StringBuilder();
        sb.append("welcome_");
        sb.append(this.f27825b2);
        if (!b.contains(sb.toString())) {
            m48230l(this.f27855g2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m48291q0() {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 8) {
            this.f27717J1.setRepeatCount(-1);
            this.f27717J1.cancelAnimation();
            this.f27699G1.setVisibility(8);
        }
    }

    /* renamed from: q1 */
    private void m48292q1() {
        if (!m48122c(this.f27904o3)) {
            m48020a(this.f27904o3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_cancel_order);
            dialog.setCancelable(false);
            this.f27904o3 = dialog;
            this.f27807Y1.add(dialog);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtOk);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdMessage)).setText(this.f27929s2.getOrderDialogFlags().getCancelOrderDialogText());
            dialog.setOnKeyListener(new C10405p3(dialog));
            textView.setOnClickListener(new C10411q3(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* renamed from: r0 */
    private void m48302r0() {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 8) {
            this.f27717J1.setRepeatCount(-1);
            this.f27717J1.cancelAnimation();
            this.f27699G1.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public void m48304r1() {
        if (!this.f27929s2.isPaid() && this.f27929s2.isShowPay()) {
            Dialog dialog = this.f27957w2;
            if (dialog == null || !dialog.isShowing()) {
                Dialog dialog2 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
                dialog2.setContentView(C10232R.layout.dialog_courier_payment_receive_warning);
                dialog2.setCancelable(false);
                this.f27957w2 = dialog2;
                this.f27807Y1.add(this.f27957w2);
                TextView textView = (TextView) dialog2.findViewById(C10232R.C10236id.txtdMessage);
                TextView textView2 = (TextView) dialog2.findViewById(C10232R.C10236id.txtPositive);
                TextView textView3 = (TextView) dialog2.findViewById(C10232R.C10236id.txtNegetive);
                ImageView imageView = (ImageView) dialog2.findViewById(C10232R.C10236id.ivIcon);
                dialog2.setOnKeyListener(new C10426s4(dialog2));
                textView2.setOnClickListener(new C10432t4(dialog2));
                textView3.setOnClickListener(new C10438u4(dialog2));
                if (!isFinishing()) {
                    dialog2.show();
                }
            }
        }
    }

    /* renamed from: s0 */
    private void m48311s0() {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 8) {
            this.f27717J1.cancelAnimation();
            this.f27699G1.setVisibility(8);
        }
    }

    /* renamed from: s1 */
    private void m48314s1() {
        SharedPreferences b = this.f29642a.mo23470D().mo23451b();
        StringBuilder sb = new StringBuilder();
        sb.append("payment_done_");
        sb.append(this.f27825b2);
        if (!b.contains(sb.toString())) {
            Dialog dialog = this.f27964x2;
            if (dialog == null || !dialog.isShowing()) {
                Dialog dialog2 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle_new);
                dialog2.setContentView(C10232R.layout.dialog_courier_payment_received);
                dialog2.setCancelable(false);
                this.f27964x2 = dialog2;
                this.f27807Y1.add(this.f27964x2);
                TextView textView = (TextView) dialog2.findViewById(C10232R.C10236id.txtdMessage);
                TextView textView2 = (TextView) dialog2.findViewById(C10232R.C10236id.txtPositive);
                ImageView imageView = (ImageView) dialog2.findViewById(C10232R.C10236id.ivIcon);
                dialog2.setOnKeyListener(new C10444v4(dialog2));
                textView2.setOnClickListener(new C10450w4(dialog2));
                if (!isFinishing()) {
                    dialog2.show();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m48321t0() {
        Timer timer = this.f27781T5;
        if (timer != null) {
            timer.cancel();
            this.f27781T5 = null;
        }
        C11694e.m52677u().mo40199a(ChatState.paused, m47945Q0(), C11713f.RECORDING_PAUSED.ordinal());
    }

    /* renamed from: t1 */
    private void m48324t1() {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        dialog.setCancelable(true);
        this.f27951v3 = dialog;
        this.f27807Y1.add(dialog);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.lbl_delivered_it);
        textView.setText(C10232R.string.masg_ask_have_you_delivered);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setText(getResources().getString(C10232R.string.lbl_dg_title_yes));
        textView2.setAllCaps(true);
        textView3.setText(getResources().getString(C10232R.string.lbl_dg_title_no));
        textView3.setAllCaps(true);
        textView2.setOnClickListener(new C10322d());
        textView3.setOnClickListener(new C10329e(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m48330u0() {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 8) {
            this.f27717J1.cancelAnimation();
            this.f27699G1.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public void m48333u1() {
        supportInvalidateOptionsMenu();
        this.f27873j2 = true;
        this.f27699G1.setVisibility(0);
        this.f27693F1.setVisibility(8);
        this.f27717J1.setRepeatCount(0);
        this.f27717J1.setSpeed(0.8f);
        this.f27717J1.setAnimation("accept.json");
        this.f27717J1.addAnimatorListener(new C10379l4());
        this.f27729L1.setText("");
        this.f27735M1.setText(getString(C10232R.string.lbl_offer_accepted));
        this.f27717J1.playAnimation();
    }

    /* renamed from: v0 */
    private void m48339v0() {
        try {
            if (this.f27864h5 == null) {
                m47988Y0();
            }
            this.f27864h5.mo41084a(new C10457y(), ConnectionState.ALL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v1 */
    private void m48341v1() {
        supportInvalidateOptionsMenu();
        m48019a(0, this.f27699G1, this.f27777T1);
        m48019a(8, this.f27866i1, this.f27693F1);
        this.f27717J1.setRepeatCount(0);
        this.f27717J1.setSpeed(0.8f);
        this.f27717J1.setAnimation("reject.json");
        String str = "";
        this.f27729L1.setText(str);
        if (!TextUtils.isEmpty(this.f27929s2.getOrderDialogFlags().getRejectedOfferDialogText())) {
            TextView textView = this.f27735M1;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f27929s2.getOrderDialogFlags().getRejectedOfferDialogText());
            textView.setText(sb.toString());
        } else {
            this.f27735M1.setText(str);
        }
        this.f27717J1.playAnimation();
    }

    /* renamed from: w0 */
    private void m48349w0() {
        if (this.f27743N3) {
            this.f27857g4.setActivated(false);
            this.f27869i4.setActivated(false);
            this.f27863h4.setActivated(false);
            m48023a(this.f27917q4, (int) C10232R.C10234color.coupon_gray);
            m48023a(this.f27924r4, (int) C10232R.C10234color.coupon_gray);
            m48023a(this.f27931s4, (int) C10232R.C10234color.coupon_gray);
            return;
        }
        this.f27875j4.setActivated(false);
        this.f27881k4.setActivated(false);
        this.f27887l4.setActivated(false);
    }

    /* renamed from: w1 */
    private void m48350w1() {
        C10516i.m48615b(this.f27767R3).show(getSupportFragmentManager(), "ChatOptionMenuDialogFragment");
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m48357x0() {
        try {
            if (this.f27864h5 != null) {
                this.f27864h5.mo41083a();
                this.f27864h5.mo41089d(this.f27882k5);
            }
            m48370y2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: x1 */
    private void m48360x1() {
        Dialog dialog = this.f27943u2;
        if (dialog == null || !dialog.isShowing()) {
            m48020a(this.f27943u2);
            Dialog dialog2 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog2.setContentView(C10232R.layout.dialog_order_please_wait);
            dialog2.setCancelable(false);
            TextView textView = (TextView) dialog2.findViewById(C10232R.C10236id.txtdMessage);
            ChatInitModel chatInitModel = this.f27929s2;
            if (chatInitModel != null && !TextUtils.isEmpty(chatInitModel.getPending_order_text())) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f27929s2.getPending_order_text());
                textView.setText(sb.toString());
            }
            this.f27943u2 = dialog2;
            this.f27807Y1.add(dialog2);
            TextView textView2 = (TextView) dialog2.findViewById(C10232R.C10236id.txtNegetive);
            ((TextView) dialog2.findViewById(C10232R.C10236id.txtPositive)).setOnClickListener(new C10456x4());
            dialog2.setOnKeyListener(new C10463y4(dialog2));
            textView2.setOnClickListener(new C10310b());
            if (!isFinishing()) {
                dialog2.show();
            }
        }
    }

    /* renamed from: y0 */
    private void m48366y0() {
        boolean z;
        if (this.f27767R3 != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f27767R3.size()) {
                    z = false;
                    break;
                } else if (((OptionMenuItemsBean) this.f27767R3.get(i2)).isVisible()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            View view = this.f27976z0;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public void m48369y1() {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 0) {
            this.f27699G1.setVisibility(0);
            this.f27729L1.setText(getString(this.f27855g2 ? C10232R.string.lbl_waiting_for_offer_ : C10232R.string.lbl_waiting_for_buyer_));
            this.f27717J1.setAnimation("circle_loader.json");
            ChatInitModel chatInitModel = this.f27929s2;
            if (chatInitModel != null && !TextUtils.isEmpty(chatInitModel.getPending_order_text())) {
                TextView textView = this.f27735M1;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f27929s2.getPending_order_text());
                textView.setText(sb.toString());
            }
            this.f27693F1.setOnClickListener(new C10316c());
            this.f27717J1.setRepeatCount(-1);
            this.f27717J1.playAnimation();
        }
    }

    /* renamed from: z0 */
    private void m48376z0() {
        if (this.f29642a.mo23502X()) {
            if (this.f27855g2) {
                mo37666c(true);
            } else {
                ChatInitModel chatInitModel = this.f27929s2;
                if (!(chatInitModel == null || chatInitModel.getNextQuickAction() == null || this.f27929s2.getNextQuickAction().getActionValue() == null)) {
                    String actionValue = this.f27929s2.getNextQuickAction().getActionValue();
                    char c = 65535;
                    String str = "courier_arrived";
                    switch (actionValue.hashCode()) {
                        case -133231525:
                            if (actionValue.equals(str)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 823915479:
                            if (actionValue.equals("send_order")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 945376397:
                            if (actionValue.equals("order_pickup")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1001232611:
                            if (actionValue.equals("start_journey")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1370491188:
                            if (actionValue.equals("order_deliver")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1442829229:
                            if (actionValue.equals("issue_bill")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        m48286q((int) C10232R.C10236id.action_start_tracking);
                    } else if (c == 1) {
                        m48286q((int) C10232R.C10236id.action_issue_bill);
                    } else if (c == 2) {
                        m48286q((int) C10232R.C10236id.action_package_pickedup);
                    } else if (c == 3) {
                        mo37668e((int) C10232R.C10236id.action_goods_delivered);
                    } else if (c == 4) {
                        this.f27662A0.setEnabled(false);
                        m48240m(str);
                    } else if (c == 5) {
                        m48208j0();
                    }
                }
            }
        }
    }

    /* renamed from: z1 */
    private void m48378z1() {
        if (!m48122c(this.f27916q3)) {
            m48020a(this.f27916q3);
            this.f27916q3 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            this.f27916q3.setContentView(C10232R.layout.dialog_change_order);
            this.f27916q3.setCancelable(false);
            TextView textView = (TextView) this.f27916q3.findViewById(C10232R.C10236id.txtdMessage);
            ChatInitModel chatInitModel = this.f27929s2;
            if (chatInitModel != null && !TextUtils.isEmpty(chatInitModel.getReoffer_text())) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f27929s2.getReoffer_text());
                textView.setText(sb.toString());
            }
            this.f27807Y1.add(this.f27916q3);
            TextView textView2 = (TextView) this.f27916q3.findViewById(C10232R.C10236id.txtNewOffer);
            TextView textView3 = (TextView) this.f27916q3.findViewById(C10232R.C10236id.txtCancel);
            textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
            this.f27916q3.setOnKeyListener(new C10315b4());
            textView2.setOnClickListener(new C10328d4());
            textView3.setOnClickListener(new C10334e4());
            if (!isFinishing() && !this.f27916q3.isShowing()) {
                this.f27916q3.show();
            }
        }
    }

    /* renamed from: N */
    public void mo36519N() {
        MediaPlayer mediaPlayer = this.f27733L5;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            MediaPlayer mediaPlayer2 = this.f27733L5;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
                this.f27739M5.removeCallbacks(this.f27907o6);
                this.f27727K5.getTimerTextView().setText(this.f29642a.mo23587c((double) this.f27733L5.getDuration()));
                this.f27727K5.getPlayPauseImageView().setTag(Integer.valueOf(0));
                this.f27727K5.getPlayPauseImageView().setImageResource(C10232R.C10235drawable.img_play_new);
            }
        }
    }

    /* renamed from: O */
    public void mo36520O() {
        MediaPlayer mediaPlayer = this.f27733L5;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f27733L5.release();
            this.f27733L5 = null;
            this.f27727K5.getPlayPauseImageView().setTag(Integer.valueOf(0));
            this.f27727K5.getPlayPauseImageView().setImageResource(C10232R.C10235drawable.img_play_new);
        }
    }

    /* renamed from: P */
    public boolean mo37649P() {
        return this.f27727K5.mo38328c();
    }

    /* renamed from: R */
    public void mo37651R() {
        if (this.f27929s2 != null) {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_user_info);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtFeedbackCountArrow);
            LinearLayout linearLayout = (LinearLayout) dialog.findViewById(C10232R.C10236id.llMeUserFeedback);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtUserName);
            String str = "&nbsp;";
            String str2 = "<i>&nbsp;";
            if (this.f27855g2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f27929s2.getOrderOffer().getCourierName());
                sb.append(str);
                textView2.setText(Html.fromHtml(sb.toString()));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f29642a.mo23646o(this.f27929s2.getOrder().getvBuyerName()));
                sb2.append(str);
                textView2.setText(Html.fromHtml(sb2.toString()));
            }
            RatingBar ratingBar = (RatingBar) dialog.findViewById(C10232R.C10236id.rbCourierRate);
            ratingBar.setStepSize(0.1f);
            if (this.f27855g2) {
                if (!(this.f27929s2.getOrderOffer() == null || this.f27929s2.getOrderOffer().getfCourierRatings() == 0.0f)) {
                    ratingBar.setRating(Float.valueOf(String.valueOf(this.f27929s2.getOrderOffer().getfCourierRatings())).floatValue());
                }
            } else if (!(this.f27929s2.getOrder() == null || this.f27929s2.getOrder().getfBuyerRatings() == null)) {
                ratingBar.setRating(Float.valueOf(this.f27929s2.getOrder().getfBuyerRatings()).floatValue());
            }
            ((TextView) dialog.findViewById(C10232R.C10236id.txtOrderCount)).setText(String.valueOf(this.f27929s2.getUser_delivery_count()));
            ((TextView) dialog.findViewById(C10232R.C10236id.txtFeedbackCount)).setText(String.valueOf(this.f27929s2.getUser_feedback_count()));
            ImageView imageView = (ImageView) dialog.findViewById(C10232R.C10236id.imgUserPic);
            if (this.f27855g2) {
                if (!TextUtils.isEmpty(this.f27929s2.getOrder().getvCourierPic())) {
                    C2232l.m11649c(getApplicationContext()).mo9515a(this.f27929s2.getOrder().getvCourierPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10374l(imageView, imageView));
                }
            } else if (!TextUtils.isEmpty(this.f27929s2.getOrder().getvBuyerPic())) {
                C2232l.m11649c(getApplicationContext()).mo9515a(this.f27929s2.getOrder().getvBuyerPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10380m(imageView, imageView));
            }
            ImageView imageView2 = (ImageView) dialog.findViewById(C10232R.C10236id.ivAccountVerifed);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtMeAccountVerified);
            if (this.f27855g2) {
                if (this.f27929s2.getOrder().isCourierVerified()) {
                    textView3.setText(getResources().getString(C10232R.string.lbl_edit_p_account_is_verified));
                    textView3.setTextColor(getResources().getColor(C10232R.C10234color.apptheme_color));
                    imageView2.setBackgroundResource(C10232R.C10235drawable.icon_ac_verified);
                } else {
                    textView3.setText(getResources().getString(C10232R.string.lbl_edit_p_account_not_verified));
                    imageView2.setBackgroundResource(C10232R.C10235drawable.icon_ac_nt_verified);
                    textView3.setTextColor(getResources().getColor(C10232R.C10234color.color_unverified));
                }
            } else if (this.f27929s2.getOrder().isBuyerVerified()) {
                textView3.setText(getResources().getString(C10232R.string.lbl_edit_p_account_is_verified));
                textView3.setTextColor(getResources().getColor(C10232R.C10234color.apptheme_color));
                imageView2.setBackgroundResource(C10232R.C10235drawable.icon_ac_verified);
            } else {
                textView3.setText(getResources().getString(C10232R.string.lbl_edit_p_account_not_verified));
                imageView2.setBackgroundResource(C10232R.C10235drawable.icon_ac_nt_verified);
                textView3.setTextColor(getResources().getColor(C10232R.C10234color.color_unverified));
            }
            linearLayout.setOnClickListener(new C10386n());
            if (this.f27929s2 != null && !isFinishing()) {
                dialog.show();
            }
        }
    }

    /* renamed from: S */
    public void mo37652S() {
        this.f27727K5.getSeekBar().setEnabled(false);
        this.f27727K5.getSeekBar().setProgress(0);
    }

    /* renamed from: T */
    public void mo37653T() {
        if (this.f27733L5 != null) {
            this.f27727K5.getSeekBar().setProgress(this.f27733L5.getCurrentPosition());
            this.f27739M5.postDelayed(this.f27907o6, 100);
        }
    }

    /* renamed from: U */
    public void mo37654U() {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setText(getResources().getString(C10232R.string.lbl_audio_record_permission_dialog));
            textView2.setMaxLines(Integer.MAX_VALUE);
            textView2.setEllipsize(null);
            textView.setText(C10232R.string.lbl_settings);
            textView.setOnClickListener(new C10319c2(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: V */
    public void mo37655V() {
        View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_payment_make_sure_courier_arrived, null);
        inflate.findViewById(C10232R.C10236id.btnPayNow).setOnClickListener(new C10413q4());
        inflate.findViewById(C10232R.C10236id.btnWaitAndPay).setOnClickListener(new C10419r4());
        this.f27779T3 = new C5665a(this);
        this.f27779T3.setContentView(inflate);
        this.f27779T3.show();
    }

    /* renamed from: W */
    public void mo37656W() {
        this.f27920r0.mo40036a(C11644i.f33357m, (C11673d) new C10434u0());
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m47845A(String str) {
        if (!this.f29642a.mo23598c(C11644i.f33445x)) {
            this.f29642a.mo23469C(C11644i.f33445x);
        } else {
            this.f29642a.mo23677z(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m47854B(String str) {
        try {
            if (!this.f27858g5) {
                JSONObject jSONObject = new JSONObject(str);
                StringBuilder sb = new StringBuilder();
                sb.append("Coordinates : ");
                sb.append(str);
                C5880q.m25751b(sb.toString());
                String string = jSONObject.getString(getResources().getString(C10232R.string.pusher_event_key_latitude));
                String string2 = jSONObject.getString(getResources().getString(C10232R.string.pusher_event_key_longitude));
                String str2 = "sent_at";
                if (this.f27852f5 == null) {
                    this.f27852f5 = Long.valueOf(this.f29642a.mo23642n(jSONObject.getString(str2)));
                }
                if (!m48105b(Long.valueOf(this.f29642a.mo23642n(jSONObject.getString(str2))))) {
                    this.f27852f5 = Long.valueOf(this.f29642a.mo23642n(jSONObject.getString(str2)));
                    if (this.f27708H4 == null) {
                        this.f27708H4 = new Location("last");
                        this.f27708H4.setLatitude(Double.parseDouble(string));
                        this.f27708H4.setLongitude(Double.parseDouble(string2));
                    }
                    this.f27714I4 = new Location("current");
                    this.f27714I4.setLatitude(Double.parseDouble(string));
                    this.f27714I4.setLongitude(Double.parseDouble(string2));
                    if (this.f27929s2 != null) {
                        boolean z = this.f27743N3;
                        String str3 = C11644i.f33343k3;
                        if (z) {
                            if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str3)) {
                                m48182h(this.f27714I4);
                            } else {
                                m48158f(this.f27714I4);
                            }
                        } else if (!this.f27929s2.getOrder().getServicePickupAvailable()) {
                            m48131d(this.f27714I4);
                        } else if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(str3)) {
                            m48172g(this.f27714I4);
                        } else {
                            m48146e(this.f27714I4);
                        }
                        m48114c(this.f27714I4);
                        if (this.f27720J4 != null && !this.f27720J4.isVisible()) {
                            this.f27720J4.setVisible(true);
                        }
                        m48245m1();
                        this.f27708H4 = this.f27714I4;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m47860C(String str) {
        if (!mo38432M()) {
            if (this.f27855g2) {
                m47868D(C11644i.f33181R3);
                m47868D(C11644i.f33205U3);
            } else {
                m47868D(C11644i.f33189S3);
                m47868D(C11644i.f33197T3);
            }
            if (C11644i.f33278d1) {
                onBackPressed();
            }
        } else if (mo38437j(this.f27825b2)) {
            mo37667d(true);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m47868D(String str) {
        C2128a.m11089a((Context) this).mo9219a(new Intent(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m47876E(String str) {
        for (int i = 0; i < this.f27929s2.getMessages().size(); i++) {
            if (((messages) this.f27929s2.getMessages().get(i)).getvMessageId().equalsIgnoreCase(str)) {
                ((messages) this.f27929s2.getMessages().get(i)).setAudioState(AUDIO_STATE.IDLE.ordinal());
                this.f27801X1.mo7337d(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m47882F(String str) {
        String str2;
        C5887x xVar;
        C5887x xVar2 = this.f29642a;
        if (xVar2 != null && xVar2.mo23502X()) {
            String M0 = m47926M0();
            String str3 = "audio";
            messages b = m48082b(str, str3, this.f27709H5, M0);
            b.setSent2Server(false);
            b.setAudioState(AUDIO_STATE.DOWNLOADING.ordinal());
            m48036a(b);
            runOnUiThread(new C10314b3());
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", this.f29642a.mo23622h(this.f27825b2));
            hashMap.put("vMessageId", this.f29642a.mo23622h(M0));
            C5887x xVar3 = this.f29642a;
            hashMap.put("iFromUserId", xVar3.mo23622h(String.valueOf(xVar3.mo23468C().mo23459f("user_id"))));
            hashMap.put("iToUserId", this.f29642a.mo23622h(str));
            String str4 = "txContent";
            hashMap.put(str4, this.f29642a.mo23622h(this.f27860h1.getText().toString().trim()));
            hashMap.put("vType", this.f29642a.mo23622h(str3));
            hashMap.put("online", this.f29642a.mo23622h("1"));
            C5887x xVar4 = this.f29642a;
            StringBuilder sb = new StringBuilder();
            String str5 = "";
            sb.append(str5);
            sb.append(this.f29642a.mo23648p().latitude);
            hashMap.put("clatitude", xVar4.mo23622h(sb.toString()));
            C5887x xVar5 = this.f29642a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(this.f29642a.mo23648p().longitude);
            hashMap.put("clongitude", xVar5.mo23622h(sb2.toString()));
            if (this.f27855g2) {
                xVar = this.f29642a;
                str2 = "buyer";
            } else {
                xVar = this.f29642a;
                str2 = C11644i.f33256a6;
            }
            hashMap.put("image_type", xVar.mo23622h(str2));
            C13875b bVar = null;
            if (!TextUtils.isEmpty(this.f27709H5)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getMimeType () ");
                sb3.append(m48306s(this.f27709H5));
                C5880q.m25754e(sb3.toString());
                bVar = C13875b.m59383a(str4, new File(this.f27709H5).getName(), C13817d0.create(C13872x.m59361b(m48306s(this.f27709H5)), new File(this.f27709H5)));
            }
            C11687c.m52645a(this.f29642a).saveMessage1(String.valueOf(this.f27825b2), hashMap, bVar).enqueue(new C10320c3(M0, b, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m48329u(boolean z) {
        if (!this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered")) {
            m48019a(z ? 0 : 8, this.f27798W4);
        }
    }

    /* renamed from: v */
    private void m48337v(boolean z) {
        if (!this.f29642a.mo23584b(LocationService.class)) {
            startService(new Intent(this, LocationService.class));
            m48277p(true);
            m48018a((int) C10232R.C10236id.action_start_tracking, false);
        }
    }

    /* renamed from: w */
    private void m48345w(String str) {
        if (!m48122c(this.f27904o3)) {
            m48020a(this.f27904o3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_cancel_order);
            dialog.setCancelable(false);
            this.f27904o3 = dialog;
            this.f27807Y1.add(dialog);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str);
            textView.setText(sb.toString());
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtOk);
            dialog.setOnKeyListener(new C10425s3(dialog));
            textView2.setOnClickListener(new C10431t3(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m48355x(boolean z) {
        try {
            if (this.f27950v2 == null) {
                return;
            }
            if (z) {
                this.f27950v2.findViewById(C10232R.C10236id.pgPay).setVisibility(0);
                this.f27950v2.findViewById(C10232R.C10236id.txtPositive).setVisibility(4);
                this.f27950v2.findViewById(C10232R.C10236id.txtNegetive).setEnabled(false);
                return;
            }
            this.f27950v2.findViewById(C10232R.C10236id.pgPay).setVisibility(8);
            this.f27950v2.findViewById(C10232R.C10236id.txtPositive).setVisibility(0);
            this.f27950v2.findViewById(C10232R.C10236id.txtNegetive).setEnabled(true);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m48363y(String str) {
        if (!m48122c(this.f27965x3)) {
            m48020a(this.f27965x3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            this.f27965x3 = dialog;
            this.f27807Y1.add(dialog);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
            textView.setText(str);
            textView2.setOnClickListener(new C10341g(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m48372z(String str) {
        runOnUiThread(new C10382m1(str));
    }

    /* renamed from: h */
    private void m48186h(boolean z) {
        if (z) {
            m48299r(true);
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("current_user_id", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f27825b2);
        hashMap.put("order_id", sb3.toString());
        C11687c.m52645a(this.f29642a).getcallOption(hashMap).enqueue(new C10414r(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public JSONObject m48193i(boolean z) {
        String str = ",";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order_id", this.f27825b2);
            jSONObject.put("buyer id", this.f27929s2.getOrder().getiBuyerId());
            jSONObject.put("courier id", this.f27929s2.getOrder().getiCourierId());
            jSONObject.put(C11687c.f33862z0, this.f27929s2.getOrder().getvShopId());
            jSONObject.put("delivery window selected", this.f27929s2.getOrder().getExpiry_time());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27929s2.getOrder().getLatitude());
            sb.append(str);
            sb.append(this.f27929s2.getOrder().getLongitude());
            jSONObject.put("pickup location", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27929s2.getOrder().getPlatitude());
            sb2.append(str);
            sb2.append(this.f27929s2.getOrder().getPlongitude());
            jSONObject.put("dropoff location", sb2.toString());
            jSONObject.put("payment method", "Cash");
            jSONObject.put("text description", this.f27929s2.getOrder().getTxDescription());
            jSONObject.put("image attached", this.f27913p6 > 0);
            jSONObject.put("has discount", this.f27929s2.getOrderOffer().hasDiscount());
            jSONObject.put("courier rating", (double) this.f27929s2.getOrderOffer().getfCourierRatings());
            jSONObject.put("buyer rating", this.f27929s2.getOrder().getfBuyerRatings());
            jSONObject.put("courier voice notes count", this.f27919q6);
            jSONObject.put("buyer voice notes count", this.f27926r6);
            jSONObject.put("courier chat messages count", this.f27933s6);
            jSONObject.put("buyer chat messages count", this.f27940t6);
            jSONObject.put("has buyer complaint", this.f27947u6);
            jSONObject.put("has courier complaint", this.f27954v6);
            jSONObject.put("delivery fees", this.f27929s2.getOrderOffer().getDbDeliveryCostNoVat());
            jSONObject.put("cost of goods amount", this.f27929s2.getOrderBill().getDbOrderCost());
            jSONObject.put("vat amount", Double.parseDouble(this.f27929s2.getOrderDetailBill().getVatAmount()));
            jSONObject.put("total bill amount", this.f27929s2.getOrderOffer().getDbDeliveryCostNoVat() + this.f27929s2.getOrderBill().getDbOrderCost() + Double.parseDouble(this.f27929s2.getOrderDetailBill().getVatAmount()) + (this.f27929s2.getOrderOffer().getDbDeliveryCost() - this.f27929s2.getOrderOffer().getDbDeliveryCostNoVat()));
            jSONObject.put("has service manual", z);
            jSONObject.put("service fees amount", this.f27929s2.getOrderOffer().getDbDeliveryCost() - this.f27929s2.getOrderOffer().getDbDeliveryCostNoVat());
            jSONObject.put("discount amount", Double.parseDouble(this.f27929s2.getOrderDetailBill().getDiscountAmount()));
            jSONObject.put("has coupon", this.f27929s2.hasCoupon());
            String str2 = "type";
            if (this.f27929s2.isBomsLinked()) {
                jSONObject.put(str2, "M4B menu order");
                jSONObject.put("cart items price total", this.f27929s2.getOrderBill().getDbOrderCost());
            } else if (this.f27929s2.getShowItemList()) {
                jSONObject.put(str2, "itemlist order");
            } else {
                jSONObject.put(str2, "default order");
            }
            jSONObject.put("discount type", this.f27929s2.getOrder().getDiscountType());
            jSONObject.put("order duration", this.f29642a.mo23507a(this.f27929s2.getOrderOffer().getOffer_received_at(), System.currentTimeMillis()));
            jSONObject.put("has courier changed by buyer", this.f27929s2.isHasCourierWithdrawn());
            jSONObject.put("has courier withdrawn", this.f27929s2.isHasCourierChangedByBuyer());
            jSONObject.put("discount amount percentage", (double) this.f27929s2.getOrderOffer().getDiscountPercentage());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m48214k(int i) {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        String str = "user_id";
        hashMap.put("iBuyerId", this.f29642a.mo23468C().mo23459f(str));
        hashMap.put("vStatus", C11644i.f33352l3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(this.f27929s2.getOrderOffer().getOffer_id());
        hashMap.put("new_offer_id", sb.toString());
        hashMap.put("iOrderId", this.f27825b2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        hashMap.put("reject_popup", sb2.toString());
        hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f(str));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb3.toString());
        hashMap.put("new_version", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("callChangeOffer params:");
        sb4.append(hashMap);
        C5880q.m25751b(sb4.toString());
        C11687c.m52645a(this.f29642a).AccpetRejectOffer(String.valueOf(this.f27825b2), hashMap).enqueue(new C10404p2());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m48230l(boolean z) {
        if (this.f27929s2.getOrderOffer().isbWarningMessage() && !m48122c(this.f27665A3)) {
            m48020a(this.f27937t3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            this.f27665A3 = dialog;
            this.f27807Y1.add(dialog);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            ChatInitModel chatInitModel = this.f27929s2;
            if (chatInitModel != null) {
                textView.setText(chatInitModel.getWelcomePopupTitle());
            }
            String str = "";
            if (z) {
                ChatInitModel chatInitModel2 = this.f27929s2;
                if (chatInitModel2 == null || chatInitModel2.getHwcc_buyer() == null || TextUtils.isEmpty(this.f27929s2.getHwcc_buyer())) {
                    textView2.setText(C10232R.string.msg_info_order_started);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.f27929s2.getHwcc_buyer());
                    textView2.setText(sb.toString());
                }
            } else {
                ChatInitModel chatInitModel3 = this.f27929s2;
                if (chatInitModel3 == null || chatInitModel3.getHwcc_courier() == null || TextUtils.isEmpty(this.f27929s2.getHwcc_courier())) {
                    textView2.setText(C10232R.string.msg_info_order_started);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f27929s2.getHwcc_courier());
                    textView2.setText(sb2.toString());
                }
            }
            textView3.setOnClickListener(new C10347h(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m48241m(boolean z) {
        if (!this.f27929s2.getOrder().isUser_rated() && !C11644i.f33121K) {
            C11644i.f33278d1 = z;
            this.f27929s2.getOrder().setvCourierName(this.f27929s2.getOrderOffer().getCourierName());
            mo38433a(this.f27929s2.getOrder(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m48253n(boolean z) {
        if (this.f27929s2 == null) {
            finish();
        }
        m48221k1();
        Intent intent = new Intent(this, OfferOrderActivity.class);
        intent.putExtra(C11644i.f33332j1, this.f27879k2);
        intent.putExtra(C11644i.f33297f2, this.f27929s2);
        intent.putExtra(C11644i.f33368n2, z);
        Bundle bundle = this.f27670B2;
        String str = C11644i.f33258b;
        intent.putExtra(str, bundle.getString(str));
        String str2 = "count";
        intent.putExtra(str2, this.f27670B2.getInt(str2));
        startActivityForResult(intent, 112);
    }

    /* renamed from: o */
    private String m48261o(int i) {
        for (int i2 = 0; i2 < this.f27767R3.size(); i2++) {
            OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) this.f27767R3.get(i2);
            if (i == optionMenuItemsBean.getId()) {
                return optionMenuItemsBean.getTitle();
            }
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m48277p(boolean z) {
        Intent intent = new Intent(C11644i.f33070D4);
        intent.putExtra(C11644i.f33314h1, this.f27825b2);
        intent.putExtra(C11644i.f33171Q1, z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* renamed from: q */
    private void m48286q(int i) {
        mo37672j(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m48299r(boolean z) {
        if (z) {
            this.f27942u1.setVisibility(0);
            this.f27806Y0.setEnabled(false);
            this.f27836d1.setVisibility(8);
            return;
        }
        this.f27942u1.setVisibility(8);
        this.f27806Y0.setEnabled(true);
        this.f27836d1.setVisibility(0);
    }

    /* renamed from: s */
    public static String m48306s(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public boolean m48320t(String str) {
        try {
            return this.f29642a.mo23476G().equalsIgnoreCase(str);
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m48373z(boolean z) {
        if (this.f27781T5 == null) {
            this.f27781T5 = new Timer();
            Timer timer = this.f27781T5;
            C10344g2 g2Var = new C10344g2(z);
            int i = this.f27757P5;
            timer.schedule(g2Var, (long) i, (long) i);
        }
    }

    /* renamed from: g */
    public void mo37671g(int i) {
        mo37672j(i);
    }

    /* renamed from: j */
    public void mo37672j(int i) {
        ChatInitModel chatInitModel = this.f27929s2;
        if (chatInitModel != null) {
            switch (i) {
                case C10232R.C10236id.action_Choose_Photo /*2131361852*/:
                    if (chatInitModel != null) {
                        m48140d0();
                        return;
                    }
                    return;
                case C10232R.C10236id.action_cancel_order /*2131361861*/:
                    if (!this.f29642a.mo23502X()) {
                        return;
                    }
                    if (m48077a2()) {
                        this.f27886l3.mo39859a(this.f27855g2, this.f27825b2);
                        return;
                    } else {
                        m48015a(0, 4, true);
                        return;
                    }
                case C10232R.C10236id.action_change_courier /*2131361862*/:
                    if (this.f29642a.mo23502X()) {
                        m48015a(2, 1, true);
                        return;
                    }
                    return;
                case C10232R.C10236id.action_file_a_compaint /*2131361866*/:
                    if (!this.f29642a.mo23502X()) {
                        return;
                    }
                    if (this.f27855g2) {
                        Intent intent = new Intent(this, FileComplainActivity.class);
                        intent.putExtra(C11644i.f33314h1, this.f27825b2);
                        String str = C11644i.f33367n1;
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        sb.append(this.f27929s2.getOrder().getvShopId());
                        intent.putExtra(str, sb.toString());
                        startActivity(intent);
                        m48190h1();
                        return;
                    }
                    m48063a(Boolean.valueOf(true), (String) null);
                    return;
                case C10232R.C10236id.action_goods_delivered /*2131361867*/:
                    m48197i0();
                    return;
                case C10232R.C10236id.action_issue_bill /*2131361870*/:
                    if (this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
                        Intent intent2 = new Intent(this, CreateBillActivity.class);
                        intent2.putExtra(C11644i.f33314h1, this.f27825b2);
                        intent2.putExtra(C11644i.f33139M1, this.f27929s2.getOrder().getiOrderId());
                        intent2.putExtra(C11644i.f33123K1, this.f27929s2.getOrder().getiBuyerId());
                        intent2.putExtra(C11644i.f33131L1, this.f27929s2.getOrder().getiCourierId());
                        intent2.putExtra(C11644i.f33091G1, this.f27929s2.getOrderOffer().getDbDeliveryCost());
                        intent2.putExtra(C11644i.f33099H1, this.f27929s2.getOrderOffer().getDbDeliveryCost_txt());
                        intent2.putExtra(C11644i.f33107I1, this.f27929s2.getOrderOffer().getdDiscountCost());
                        intent2.putExtra(C11644i.f33115J1, this.f27929s2.getOrderOffer().getdDiscountCost_txt());
                        if (this.f27929s2.getOrderBill() != null && !TextUtils.isEmpty(this.f27929s2.getOrderBill().getvStatus()) && this.f27929s2.getOrderBill().getvStatus().equalsIgnoreCase(C11644i.f33441w3)) {
                            intent2.putExtra(C11644i.f33187S1, this.f27929s2.getOrderBill().getImage());
                            intent2.putExtra(C11644i.f33195T1, this.f27929s2.getOrderBill().getDbOrderCost());
                        }
                        intent2.putExtra(C11644i.f33297f2, this.f27929s2);
                        startActivityForResult(intent2, 108);
                        return;
                    }
                    return;
                case C10232R.C10236id.action_package_pickedup /*2131361878*/:
                    m48240m("order_pickup");
                    return;
                case C10232R.C10236id.action_rate_the_courier /*2131361879*/:
                    m48241m(false);
                    return;
                case C10232R.C10236id.action_route /*2131361880*/:
                    m47913K(getString(C10232R.string.lbl_see_route));
                    return;
                case C10232R.C10236id.action_share_location /*2131361884*/:
                    if (this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
                        Intent intent3 = new Intent(this, PicOrderLocationActivityRevised.class);
                        intent3.putExtra(C11644i.f33391q1, getResources().getString(C10232R.string.menu_share_location));
                        intent3.putExtra(C11644i.f33155O1, true);
                        startActivityForResult(intent3, C11644i.f33414t0);
                        return;
                    }
                    return;
                case C10232R.C10236id.action_start_tracking /*2131361885*/:
                    if (this.f29642a.mo23502X()) {
                        try {
                            String o = m48261o((int) C10232R.C10236id.action_start_tracking);
                            if (TextUtils.isEmpty(o)) {
                                return;
                            }
                            if (o.equalsIgnoreCase(getResources().getString(C10232R.string.menu_start_tracking))) {
                                try {
                                    this.f27889l6 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
                                    this.f27889l6.setContentView(C10232R.layout.dialog_show_ok);
                                    TextView textView = (TextView) this.f27889l6.findViewById(C10232R.C10236id.txtdOk);
                                    TextView textView2 = (TextView) this.f27889l6.findViewById(C10232R.C10236id.txtdMessage);
                                    ((TextView) this.f27889l6.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
                                    textView2.setText(getResources().getString(C10232R.string.msg_keep_alive_app_popup));
                                    textView.setOnClickListener(new C10442v2());
                                    this.f27889l6.setOnDismissListener(new C10345g3());
                                    if (!isFinishing()) {
                                        this.f27889l6.show();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                m48136d(C11644i.f33457y3, true);
                                return;
                            }
                            m48136d(C11644i.f33465z3, false);
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    } else {
                        return;
                    }
                case C10232R.C10236id.action_withdraw_order /*2131361887*/:
                    if (!this.f29642a.mo23502X()) {
                        return;
                    }
                    if (m48077a2()) {
                        this.f27886l3.mo39859a(this.f27855g2, this.f27825b2);
                        return;
                    } else {
                        m48015a(1, 2, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    /* renamed from: e */
    private void m48149e(String str, String str2) {
        this.f27727K5.setVisibility(0);
        this.f27866i1.setVisibility(8);
        if (!m48122c(this.f27910p3)) {
            m48020a(this.f27910p3);
            this.f27910p3 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            this.f27910p3.setContentView(C10232R.layout.dialog_offer_submitted_ok);
            this.f27910p3.setCancelable(false);
            this.f27807Y1.add(this.f27910p3);
            TextView textView = (TextView) this.f27910p3.findViewById(C10232R.C10236id.txtdTitle);
            TextView textView2 = (TextView) this.f27910p3.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView3 = (TextView) this.f27910p3.findViewById(C10232R.C10236id.txtdOk);
            TextView textView4 = (TextView) this.f27910p3.findViewById(C10232R.C10236id.txtWithdraw);
            textView4.setVisibility(0);
            textView.setText(C10232R.string.lbl_dg_alert_offer_submitted);
            if (!TextUtils.isEmpty(str2)) {
                textView2.setText(str2);
            } else {
                String string = getResources().getString(C10232R.string.lbl_dg_alert_offer_submitted_Detail);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(str);
                textView2.setText(String.format(string, new Object[]{sb.toString()}));
            }
            this.f27910p3.setOnKeyListener(new C10437u3());
            textView3.setOnClickListener(new C10443v3());
            textView4.setOnClickListener(new C10449w3());
            try {
                if (!isFinishing() && !this.f27910p3.isShowing()) {
                    this.f27910p3.show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m48161f(String str, String str2) {
        supportInvalidateOptionsMenu();
        if (this.f27699G1.getVisibility() != 0) {
            this.f27699G1.setVisibility(0);
        }
        m48019a(8, this.f27747O1, this.f27777T1);
        this.f27729L1.setText(getString(this.f27855g2 ? C10232R.string.lbl_waiting_for_offer_ : C10232R.string.lbl_waiting_for_buyer_));
        if (!TextUtils.isEmpty(str2)) {
            this.f27735M1.setText(str2);
        } else {
            TextView textView = this.f27735M1;
            String string = getResources().getString(C10232R.string.lbl_dg_alert_offer_submitted_Detail);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str);
            textView.setText(String.format(string, new Object[]{sb.toString()}));
        }
        this.f27693F1.setOnClickListener(new C10455x3());
        this.f27717J1.setAnimation("circle_loader.json");
        this.f27717J1.setRepeatCount(-1);
        this.f27717J1.playAnimation();
    }

    /* renamed from: g */
    private void m48172g(Location location) {
        float b = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getPlatitude(), this.f27929s2.getOrder().getPlongitude());
        float b2 = C5887x.m25805b(this.f27929s2.getOrder().getPlatitude(), this.f27929s2.getOrder().getPlongitude(), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        int i = (int) (((b2 - b) * 100.0f) / b2);
        StringBuilder sb = new StringBuilder();
        sb.append("progrss Original : ");
        sb.append(i);
        C5880q.m25751b(sb.toString());
        int i2 = i + 55;
        if (i2 < 55) {
            i2 = 55;
        }
        if (i2 <= 90) {
            m48297r(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("progress S2C : ");
            sb2.append(this.f27732L4.getProgress());
            C5880q.m25751b(sb2.toString());
        }
    }

    /* renamed from: q */
    private String m48285q(String str) {
        return C11718b.m52746f(str).replace(C11718b.f33921m, "");
    }

    /* renamed from: t */
    private void m48319t(boolean z) {
        this.f27769R5.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m48328u(String str) {
        if (this.f27855g2) {
            C11598a.m52263f().mo39815a(this.f27929s2.getOrder().getOrderStatus(), this.f27933s6, this.f27929s2.getOrder().getiOrderId(), (double) this.f29642a.mo23507a(this.f27929s2.getOrderOffer().getOffer_received_at(), System.currentTimeMillis()), str, this.f27929s2.getOrder().getvShopId());
        }
    }

    /* renamed from: q */
    private void m48288q(boolean z) {
        Resources resources;
        int i;
        m48319t(true);
        TextView textView = this.f27701G3;
        if (z) {
            resources = getResources();
            i = C10232R.string.lbl_user_typing;
        } else {
            resources = getResources();
            i = C10232R.string.lbl_user_recording;
        }
        textView.setText(String.format(resources.getString(i), new Object[]{m47950R0()}));
        m48267o0();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m48310s(boolean z) {
        if (z) {
            this.f27746O0.setText(getResources().getString(C10232R.string.lbl_pay_now));
            m48019a(4, this.f27746O0);
            m48019a(0, this.f27723K1);
            return;
        }
        m48143d2();
    }

    /* renamed from: d */
    public void mo37667d(boolean z) {
        if (!m48122c(this.f27892m3)) {
            m48020a(this.f27892m3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_ask_for_rating);
            dialog.setCancelable(false);
            this.f27807Y1.add(dialog);
            this.f27892m3 = dialog;
            ((TextView) dialog.findViewById(C10232R.C10236id.txtLater)).setOnClickListener(new C10339f3(dialog, z));
            ((TextView) dialog.findViewById(C10232R.C10236id.txtNoThanks)).setOnClickListener(new C10351h3(dialog, z));
            ((TextView) dialog.findViewById(C10232R.C10236id.txtRateNow)).setOnClickListener(new C10357i3(dialog));
            dialog.setOnKeyListener(new C10364j3(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48121c(List<CallOptionsBean> list) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_user_call);
        dialog.setCancelable(true);
        this.f27979z3 = dialog;
        this.f27807Y1.add(this.f27979z3);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(C10232R.C10236id.llCallMultiple);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
        textView.setText(C10232R.string.msg_call_reduce);
        textView2.setText(C10232R.string.lbl_call);
        textView3.setText(C10232R.string.lbl_me_cancel);
        textView2.setAllCaps(true);
        textView3.setAllCaps(true);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setVisibility(list.size() == 1 ? 0 : 8);
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                View inflate = getLayoutInflater().inflate(C10232R.layout.row_call_option, null);
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llPhone);
                TextView textView4 = (TextView) inflate.findViewById(C10232R.C10236id.tvPhone);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(((CallOptionsBean) list.get(i)).getLabel());
                textView4.setText(sb.toString());
                linearLayout2.setOnClickListener(new C10430t2(list, i));
                linearLayout.addView(inflate);
            }
        }
        textView2.setOnClickListener(new C10436u2(dialog, list));
        textView3.setOnClickListener(new C10448w2(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: v */
    public void mo37677v() {
        Thread thread = this.f27900n5;
        if (thread != null && thread.getState() == State.NEW) {
            this.f27900n5.start();
        }
    }

    /* renamed from: o */
    private String m48262o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C11718b.m52720a((Context) this, false, this.f27825b2));
        sb.append(str);
        sb.append(C11718b.f33921m);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public String m48272p(String str) {
        if (C5887x.m25786E0()) {
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

    /* renamed from: m */
    private View m48237m(int i) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_layout_tracking, null);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivMarkerIcon);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvLabel);
        if (i == 3) {
            imageView.setImageResource(C10232R.C10235drawable.ic_tracking_pin_pickup_new);
            textView.setText(getResources().getString(C10232R.string.lbl_pickup));
        } else if (i == 4) {
            imageView.setImageResource(C10232R.C10235drawable.icon_home_delivery);
            textView.setText(getResources().getString(C10232R.string.lbl_dropoff));
        }
        return inflate;
    }

    /* renamed from: o */
    private void m48265o(boolean z) {
        Intent intent = new Intent(C11644i.f33118J4);
        intent.putExtra(C11644i.f33124K2, z);
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m48336v(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(this, UserFeedbackActivity.class);
            intent.putExtra(C11644i.f33067D1, C11644i.f33083F1);
            intent.putExtra("userId", str);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m48297r(int i) {
        if (this.f27743N3) {
            m48349w0();
            this.f27732L4.setProgress(i);
            if (i > 0 && i < 50) {
                m48025a(this.f27857g4, this.f27917q4);
            }
            if (i >= 50 && i <= 95) {
                m48025a(this.f27857g4, this.f27917q4);
                m48025a(this.f27869i4, this.f27924r4);
            }
            if (i >= 95 && i < 100) {
                m48025a(this.f27857g4, this.f27917q4);
                m48025a(this.f27869i4, this.f27924r4);
                m48025a(this.f27863h4, this.f27931s4);
            }
            if (i >= 100) {
                m48025a(this.f27857g4, this.f27917q4);
                m48025a(this.f27869i4, this.f27924r4);
                m48025a(this.f27863h4, this.f27931s4);
                return;
            }
            return;
        }
        m48349w0();
        this.f27738M4.setProgress(i);
        if (i > 0 && i < 50) {
            m48025a(this.f27875j4, this.f27959w4);
        }
        if (i >= 50 && i <= 95) {
            m48025a(this.f27875j4, this.f27959w4);
            m48025a(this.f27881k4, this.f27966x4);
        }
        if (i >= 95 && i < 100) {
            m48025a(this.f27875j4, this.f27959w4);
            m48025a(this.f27881k4, this.f27966x4);
            m48025a(this.f27887l4, this.f27973y4);
        }
        if (i >= 100) {
            m48025a(this.f27875j4, this.f27959w4);
            m48025a(this.f27881k4, this.f27966x4);
            m48025a(this.f27887l4, this.f27973y4);
        }
    }

    /* renamed from: h */
    private void m48182h(Location location) {
        this.f27744N4 = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        float b = C5887x.m25805b(Double.parseDouble(this.f27929s2.getOrder().getvShopLat()), Double.parseDouble(this.f27929s2.getOrder().getvShopLong()), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        int i = (int) (((b - this.f27744N4) * 100.0f) / b);
        StringBuilder sb = new StringBuilder();
        sb.append("progrss Original : ");
        sb.append(i);
        C5880q.m25751b(sb.toString());
        int i2 = i + 55;
        if (i2 < 55) {
            i2 = 55;
        }
        if (i2 <= 90) {
            m48297r(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("progress S2C : ");
            sb2.append(this.f27732L4.getProgress());
            C5880q.m25751b(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m48273p(int i) {
        this.f27705H1.setVisibility(8);
        this.f27741N1.setVisibility(0);
        mo37661a((View) this.f27711I1, 0, (AnimationListener) new C10458y0(i));
    }

    /* renamed from: b */
    private void m48102b(String... strArr) {
        for (String a : strArr) {
            this.f29642a.mo23540a(this.f27968x6, a);
        }
    }

    /* renamed from: n */
    private void m48252n(String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            if (this.f27929s2.isPaid()) {
                m48129c2();
                return;
            }
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_checking_payment_status));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).CheckPaymentStatus(this.f27825b2, hashMap).enqueue(new C10408q0(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m48101b(boolean z, View view) {
        if (z) {
            try {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                ((ViewGroup) view).setLayoutTransition(layoutTransition);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            ((ViewGroup) view).setLayoutTransition(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m48240m(String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            runOnUiThread(new C10368k0());
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("action_type", str);
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(this.f29642a.mo23648p().latitude);
            hashMap.put("clatitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f29642a.mo23648p().longitude);
            hashMap.put("clongitude", sb2.toString());
            C11687c.m52645a(this.f29642a).updateOrderState(this.f27825b2, hashMap).enqueue(new C10375l0(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m48346w(boolean z) {
        this.f27809Y3.setVisibility(0);
        this.f27851f4.setVisibility(0);
        if (z) {
            this.f27851f4.setText(getResources().getString(C10232R.string.lbl_pay_now));
            m48091b(this.f27845e4);
            return;
        }
        this.f27851f4.setText(getResources().getString(C10232R.string.lbl_back_to_chat));
        this.f27845e4.setText(String.format(getResources().getString(C10232R.string.lbl_distance_away), new Object[]{this.f27929s2.getOrder().getDistance_shop_buyer()}));
        this.f27728L0.setText(String.format(getResources().getString(C10232R.string.lbl_distance_value), new Object[]{this.f27929s2.getOrder().getDistance_shop_buyer()}));
    }

    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36511f(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1005002140: goto L_0x005b;
                case -828253453: goto L_0x0051;
                case -625282244: goto L_0x0047;
                case -618783498: goto L_0x003d;
                case -397479362: goto L_0x0033;
                case 0: goto L_0x0029;
                case 466096198: goto L_0x001f;
                case 605598949: goto L_0x0014;
                case 758866341: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0065
        L_0x000a:
            java.lang.String r0 = "withdrawBeforeOrder"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 5
            goto L_0x0066
        L_0x0014:
            java.lang.String r0 = "StoreRateNReview"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 8
            goto L_0x0066
        L_0x001f:
            java.lang.String r0 = "RateNReview"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 7
            goto L_0x0066
        L_0x0029:
            java.lang.String r0 = ""
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 6
            goto L_0x0066
        L_0x0033:
            java.lang.String r0 = "from accept"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 0
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = "OrderDelivered"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 4
            goto L_0x0066
        L_0x0047:
            java.lang.String r0 = "CancelReasonList"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 3
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "from Rating"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 1
            goto L_0x0066
        L_0x005b:
            java.lang.String r0 = "withdrawOrder"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0065
            r4 = 2
            goto L_0x0066
        L_0x0065:
            r4 = -1
        L_0x0066:
            switch(r4) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00a0;
                case 2: goto L_0x009c;
                case 3: goto L_0x0088;
                case 4: goto L_0x0084;
                case 5: goto L_0x0080;
                case 6: goto L_0x007c;
                case 7: goto L_0x006e;
                case 8: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x00b6
        L_0x006a:
            r3.mo38431L()
            goto L_0x00b6
        L_0x006e:
            com.mrsool.bean.ChatInitModel r4 = r3.f27929s2
            com.mrsool.bean.Order r4 = r4.getOrder()
            java.lang.String r4 = r4.getiOrderId()
            r3.mo38436i(r4)
            goto L_0x00b6
        L_0x007c:
            r3.onBackPressed()
            goto L_0x00b6
        L_0x0080:
            r3.onBackPressed()
            goto L_0x00b6
        L_0x0084:
            r3.m48241m(r1)
            goto L_0x00b6
        L_0x0088:
            boolean r4 = r3.f27773S3
            if (r4 != 0) goto L_0x0094
            r3.f27773S3 = r2
            int r4 = r3.f27673B5
            r3.m48273p(r4)
            goto L_0x00b6
        L_0x0094:
            com.mrsool.bean.CancelReasonMainBean r4 = r3.f27667A5
            int r0 = r3.f27673B5
            r3.m48031a(r4, r0)
            goto L_0x00b6
        L_0x009c:
            r3.onBackPressed()
            goto L_0x00b6
        L_0x00a0:
            r3.m48241m(r2)
            goto L_0x00b6
        L_0x00a4:
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            com.mrsool.chat.ChatActivityNew$i r0 = new com.mrsool.chat.ChatActivityNew$i
            r0.<init>()
            r1 = 10
            r4.postDelayed(r0, r1)
            r3.m47935O0()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.ChatActivityNew.mo36511f(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m48218k(boolean z) {
        if (this.f27720J4 == null && this.f27888l5 != null && !this.f27929s2.getOrder().getvStatus().equalsIgnoreCase("delivered")) {
            this.f27720J4 = this.f27888l5.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.ic_current_location_temp)).position(new LatLng(this.f27929s2.getOrder_track().getCourier_base_lat().doubleValue(), this.f27929s2.getOrder_track().getCourier_base_lng().doubleValue())).anchor(0.5f, 0.7f).title("driver"));
            this.f27810Y4.add(this.f27720J4);
            if (this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33343k3) || this.f27929s2.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33325i3)) {
                this.f27816Z4.add(this.f27720J4);
            }
        }
        Marker marker = this.f27720J4;
        if (marker != null) {
            marker.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m48364y(boolean z) {
        this.f27727K5.mo38327c(z);
        if (!z && this.f27701G3.getVisibility() == 0) {
            m48319t(false);
        }
        if (!z && !this.f29642a.mo23620g()) {
            m48325t2();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateConnectionStatus : isConnected ");
        sb.append(z);
        C5880q.m25754e(sb.toString());
    }

    /* renamed from: b */
    private boolean m48103b(Intent intent) {
        return getString(C10232R.string.checkout_ui_callback_scheme).equals(intent.getScheme());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m48093b(PaymentStatusMainBean paymentStatusMainBean) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(C11644i.f33164P2, (ArrayList) paymentStatusMainBean.getCards());
        C11127q qVar = new C11127q(this, bundle);
        qVar.mo38940b();
        qVar.mo38939a((C11130c) new C10486f(this, paymentStatusMainBean, qVar));
    }

    /* renamed from: d */
    private void m48137d(List<messages> list) {
        C8775f fVar = new C8775f();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.f29642a.mo23468C().mo23449a("unsaved", fVar.mo32317a((Object) arrayList));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m48229l(String str) {
        if (this.f27891m2) {
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", str);
            String str2 = "user_id";
            hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f(str2));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("auth_token", sb.toString());
            hashMap.put("iToUserId", this.f29642a.mo23468C().mo23459f(str2));
            C11687c.m52645a(this.f29642a).readChatMessage(str, hashMap).enqueue(new C10392o());
        }
    }

    /* renamed from: k */
    private void m48217k(String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("reason", str);
            C11687c.m52645a(this.f29642a).markInAppropriate(this.f27825b2, hashMap).enqueue(new C10348h0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PaymentCardsBean m48080b(List<PaymentCardsBean> list) {
        for (PaymentCardsBean paymentCardsBean : list) {
            if (paymentCardsBean.isDefault()) {
                return paymentCardsBean;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m48131d(Location location) {
        float b = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        if (this.f27780T4 == 0.0f) {
            this.f27780T4 = b;
        }
        float f = this.f27780T4;
        int i = (int) ((((f - b) * 100.0f) / f) + 5.0f);
        if (i <= 90) {
            if (i < 60) {
                i = 60;
            }
            m48297r(i);
            StringBuilder sb = new StringBuilder();
            sb.append("progress D2S : ");
            sb.append(this.f27738M4.getProgress());
            C5880q.m25751b(sb.toString());
        }
    }

    /* renamed from: e */
    public void mo37668e(int i) {
        if (i != C10232R.C10236id.action_change_courier && i != C10232R.C10236id.action_goods_delivered && i != C10232R.C10236id.action_cancel_order && i != C10232R.C10236id.action_withdraw_order) {
            mo37672j(i);
        } else if (!m48077a2() || !(i == C10232R.C10236id.action_cancel_order || i == C10232R.C10236id.action_withdraw_order)) {
            C10512h a = C10512h.m48596a(i, this.f27825b2);
            a.setCancelable(false);
            a.show(getSupportFragmentManager(), "ChatOptionMenuConfirmationDialogFragment");
        } else {
            this.f27886l3.mo39859a(this.f27855g2, this.f27825b2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m48084b(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        if (j3 > 0) {
            j2 %= 60;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m48009a(j3));
        sb.append(":");
        sb.append(m48009a(j2));
        return sb.toString();
    }

    /* renamed from: f */
    public void mo37670f(int i) {
        if (i == 0) {
            m48244m0();
        } else if (i == 1) {
        }
    }

    /* renamed from: f */
    private void m48158f(Location location) {
        this.f27762Q4 = C5887x.m25805b(location.getLatitude(), location.getLongitude(), Double.parseDouble(this.f27929s2.getOrder().getvShopLat()), Double.parseDouble(this.f27929s2.getOrder().getvShopLong()));
        if (this.f27756P4 == 0.0f) {
            this.f27756P4 = this.f27762Q4;
        }
        float f = this.f27756P4;
        int i = ((int) ((((f - this.f27762Q4) * 100.0f) / f) + 5.0f)) / 2;
        if (i <= 45) {
            if (i < 15) {
                i = 15;
            }
            m48297r(i);
            StringBuilder sb = new StringBuilder();
            sb.append("progress D2S : ");
            sb.append(this.f27732L4.getProgress());
            C5880q.m25751b(sb.toString());
        }
    }

    /* renamed from: b */
    private void m48099b(String str, ArrayList<String> arrayList) {
        new Handler().postDelayed(new C10377l2(str, arrayList), 350);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m48136d(String str, boolean z) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", this.f27929s2.getOrder().getiCourierId());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("status", str);
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(this.f29642a.mo23648p().latitude);
            hashMap.put("current_latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f29642a.mo23648p().longitude);
            hashMap.put("current_longitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("start/stop :");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C11687c.m52645a(this.f29642a).updateTrackingStatus(this.f27825b2, hashMap).enqueue(new C10323d0(str, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m48226l(int i) {
        if (i == 1) {
            this.f27741N1.setVisibility(8);
            this.f27705H1.setVisibility(0);
            this.f27711I1.setVisibility(8);
        } else if (i != 2 && i == 3) {
            this.f27705H1.setVisibility(8);
            this.f27711I1.setVisibility(8);
            this.f27741N1.setVisibility(0);
        }
    }

    /* renamed from: r */
    private String m48296r(String str) {
        JSONObject jSONObject = new JSONObject();
        String str2 = "duration";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11718b.m52728b((Context) this, str).floatValue() / 1000.0f);
            jSONObject.put(str2, sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        new C8775f().mo32317a((Object) jSONObject);
        return jSONObject.toString();
    }

    /* renamed from: b */
    private void m48100b(String str, boolean z) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_user_call);
        dialog.setCancelable(true);
        this.f27979z3 = dialog;
        this.f27807Y1.add(this.f27979z3);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(C10232R.C10236id.llCallMultiple);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
        textView.setText(C10232R.string.msg_call_reduce);
        textView2.setText(C10232R.string.lbl_call);
        textView3.setText(C10232R.string.lbl_me_cancel);
        textView2.setAllCaps(true);
        textView3.setAllCaps(true);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setOnClickListener(new C10454x2(dialog, str));
        textView3.setOnClickListener(new C10461y2(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: e */
    private void m48146e(Location location) {
        float b = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getPlatitude(), this.f27929s2.getOrder().getPlongitude());
        if (this.f27774S4 == 0.0f) {
            this.f27774S4 = b;
        }
        float f = this.f27774S4;
        int i = ((int) ((((f - b) * 100.0f) / f) + 5.0f)) / 2;
        if (i <= 45) {
            if (i < 15) {
                i = 15;
            }
            m48297r(i);
            StringBuilder sb = new StringBuilder();
            sb.append("progress D2S : ");
            sb.append(this.f27738M4.getProgress());
            C5880q.m25751b(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo37666c(boolean z) {
        Dialog dialog = this.f27950v2;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialog2 = new Dialog(this, C10232R.style.AlertCustomerDialogStyle_new);
            dialog2.setContentView(C10232R.layout.dialog_change_confirm_payment_method);
            dialog2.setCancelable(false);
            this.f27950v2 = dialog2;
            this.f27807Y1.add(this.f27950v2);
            TextView textView = (TextView) dialog2.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog2.findViewById(C10232R.C10236id.txtPositive);
            TextView textView3 = (TextView) dialog2.findViewById(C10232R.C10236id.txtNegetive);
            ImageView imageView = (ImageView) dialog2.findViewById(C10232R.C10236id.ivIcon);
            if (z) {
                this.f27961w6 = (ProgressBar) dialog2.findViewById(C10232R.C10236id.pgPay);
                textView.setText(C10232R.string.lbl_payment_confirm);
                textView2.setText(getResources().getString(C10232R.string.lbl_pay));
                imageView.setImageResource(C10232R.C10235drawable.ic_pay_confirm);
                textView3.setText(getResources().getString(C10232R.string.lbl_dg_title_cancel));
            } else {
                textView.setText(this.f27929s2.getChangePayAppAlert());
                textView2.setText(getResources().getString(C10232R.string.lbl_yes));
                imageView.setImageResource(C10232R.C10235drawable.ic_change_payment_method);
                textView3.setText(getResources().getString(C10232R.string.lbl_cancel_order));
            }
            textView2.setOnClickListener(new C10385m4(z));
            textView3.setOnClickListener(new C10406p4(z, dialog2));
            if (!isFinishing()) {
                dialog2.show();
            }
        }
    }

    /* renamed from: f */
    private void m48162f(boolean z) {
        if (z) {
            this.f27952v4.setVisibility(0);
            this.f27840d5 = AnimationUtils.loadAnimation(this, C10232R.anim.blink_animation);
            this.f27952v4.startAnimation(this.f27840d5);
            return;
        }
        this.f27952v4.setVisibility(8);
        this.f27952v4.clearAnimation();
    }

    /* renamed from: a */
    private void m48029a(Marker marker, float f) {
        Handler handler = new Handler();
        C10415r0 r0Var = new C10415r0(SystemClock.uptimeMillis(), new LinearInterpolator(), f, marker.getRotation(), marker, handler);
        handler.post(r0Var);
    }

    /* renamed from: e */
    public void mo37669e(boolean z) {
        if (this.f27822a5 == null) {
            this.f27822a5 = AnimationUtils.loadAnimation(f27661z6, C10232R.anim.rotate);
        }
        RippleBackground rippleBackground = (RippleBackground) findViewById(C10232R.C10236id.ripplebgLocation);
        if (z) {
            this.f27945u4.setVisibility(8);
            rippleBackground.mo41218b();
            return;
        }
        this.f27945u4.clearAnimation();
        this.f27945u4.setVisibility(8);
        rippleBackground.mo41219c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m48135d(String str, String str2) {
        if (this.f29642a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33751Z0, str);
            hashMap.put("status", str2);
            C11687c.m52645a(this.f29642a).getBuyerPaymentStatus(this.f27825b2, hashMap).enqueue(new C10355i1(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48019a(int i, View... viewArr) {
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48070a(boolean z, View... viewArr) {
        float f = 0.0f;
        float f2 = 1.0f;
        if (!z) {
            f = 1.0f;
            f2 = 0.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration((long) this.f27897n2);
        alphaAnimation.setFillAfter(false);
        for (View startAnimation : viewArr) {
            startAnimation.startAnimation(alphaAnimation);
        }
        alphaAnimation.setAnimationListener(new C10318c1(z, viewArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m48150e(List<PaymentListBean> list) {
        if (list.size() == 0) {
            m48355x(false);
        } else if (list.size() == 1) {
            m48135d(((PaymentListBean) list.get(0)).getCode(), C11645a.f33473e);
        } else {
            C11692d dVar = new C11692d(this, list, -1);
            dVar.mo40193c();
            dVar.mo40190a((C11124o) new C10349h1(list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48069a(boolean z, View view) {
        if (z) {
            try {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                ((ViewGroup) view).setLayoutTransition(layoutTransition);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f27821a4.setLayoutTransition(null);
        }
    }

    /* renamed from: b */
    private messages m48082b(String str, String str2, String str3, String str4) {
        messages messages = new messages();
        messages.setId(str4);
        messages.setvMessageId(str4);
        String str5 = "audio";
        if (str2.equalsIgnoreCase(str5)) {
            messages.setTotalDuration((double) C11718b.m52728b((Context) this, m48262o(str4)).floatValue());
        }
        C5887x xVar = this.f29642a;
        messages.setSender_username(xVar.mo23646o(xVar.mo23468C().mo23459f("user_name")));
        messages.setCreated_at(String.valueOf(System.currentTimeMillis() / 1000));
        messages.setImageType(this.f27855g2 ? "buyer" : C11644i.f33256a6);
        String str6 = "location";
        if (str2.equalsIgnoreCase(str6)) {
            if (TextUtils.isEmpty(this.f27868i3)) {
                messages.setiAddress(this.f27843e2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27868i3);
                sb.append("\n");
                sb.append(this.f27843e2);
                messages.setiAddress(sb.toString());
            }
        } else if (str2.equalsIgnoreCase(str5)) {
            messages.setiAddress(m48296r(m48262o(str4)));
        } else {
            messages.setiAddress("");
        }
        messages.setOrderId(this.f27825b2);
        messages.setiToOrderID(this.f27825b2);
        messages.setiFromUserId(this.f29642a.mo23468C().mo23459f("user_id"));
        messages.setiToUserId(str);
        messages.setvType(str2);
        if (str2.equalsIgnoreCase("text")) {
            messages.setTxContent(this.f27860h1.getText().toString().trim());
        } else if (str2.equalsIgnoreCase("image") || str2.equalsIgnoreCase(str5)) {
            messages.setTxContent(str3);
        } else if (str2.equalsIgnoreCase(str6)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27831c2);
            sb2.append(",");
            sb2.append(this.f27837d2);
            messages.setTxContent(sb2.toString());
        }
        return messages;
    }

    /* renamed from: a */
    private void m48021a(Intent intent) {
        if (m48103b(intent)) {
            m47855B0().mo39718a(f27655C6, false);
            f27655C6 = "";
            m48135d("credit_card", C11645a.f33472d);
            C11095j jVar = this.f27829b6;
            if (jVar != null) {
                jVar.mo38891e();
            }
            C11120n nVar = this.f27823a6;
            if (nVar != null) {
                nVar.mo38926a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48120c(String str, boolean z) {
        if (!m48122c(this.f27965x3)) {
            m48020a(this.f27965x3);
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            this.f27965x3 = dialog;
            this.f27807Y1.add(dialog);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
            textView.setText(str);
            textView2.setOnClickListener(new C10335f(dialog, z));
            if (!isFinishing()) {
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48034a(PaymentStatusMainBean paymentStatusMainBean) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(C11644i.f33164P2, paymentStatusMainBean);
        this.f27835c6 = new C10523l(this, bundle);
        this.f27835c6.mo37910d();
        this.f27835c6.mo37907a((C11118l) new C10369k1(paymentStatusMainBean));
        this.f27835c6.mo37906a((OnClickListener) new C10376l1(paymentStatusMainBean));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m48206j(boolean z) {
        ArrayList<OptionMenuItemsBean> arrayList = this.f27767R3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OptionMenuItemsBean) it.next()).setVisible(z);
            }
        }
        m48366y0();
    }

    /* renamed from: a */
    public /* synthetic */ void mo37662a(PaymentStatusMainBean paymentStatusMainBean, C11127q qVar, List list, PaymentCardsBean paymentCardsBean) {
        if (list != null) {
            paymentStatusMainBean.setCards(list);
            qVar.mo38938a();
            this.f27835c6.mo37909c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48065a(String str, PaymentCardsBean paymentCardsBean) {
        Bundle bundle = new Bundle();
        bundle.putString(C11644i.f33164P2, str);
        bundle.putSerializable(C11644i.f33180R2, paymentCardsBean);
        this.f27829b6 = new C11095j(this, bundle);
        this.f27829b6.mo38896j();
        this.f27829b6.mo38885a((C11113o) new C10388n1());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48113c(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            int i = intent.getExtras().getInt("status");
            if (i == C11713f.COMPOSING.ordinal()) {
                m48288q(true);
            } else if (i == C11713f.COMPOSING_PAUSED.ordinal() || i == C11713f.RECORDING_PAUSED.ordinal()) {
                m47961T0();
            } else if (i == C11713f.RECORDING.ordinal()) {
                m48288q(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public CharSequence m48008a(String str, ArrayList<String> arrayList) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, str.length(), 33);
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = -1;
            while (true) {
                int indexOf = str.indexOf((String) arrayList.get(i), i2 + 1);
                if (indexOf == -1) {
                    break;
                }
                System.out.println(indexOf);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow_5)), indexOf, ((String) arrayList.get(i)).length() + indexOf, 33);
                i2 = indexOf + 1;
            }
        }
        return TextUtils.concat(new CharSequence[]{spannableString});
    }

    /* renamed from: b */
    private void m48088b(int i, String str) {
        for (int i2 = 0; i2 < this.f27767R3.size(); i2++) {
            OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) this.f27767R3.get(i2);
            if (i == optionMenuItemsBean.getId()) {
                optionMenuItemsBean.setEnable(false);
                optionMenuItemsBean.setDisableMessage(str);
                m48366y0();
                return;
            }
        }
    }

    /* renamed from: c */
    private boolean m48122c(Dialog dialog) {
        if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m48114c(Location location) {
        float f;
        if (this.f27743N3) {
            f = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        } else {
            f = C5887x.m25805b(location.getLatitude(), location.getLongitude(), this.f27929s2.getOrder().getLatitude(), this.f27929s2.getOrder().getLongitude());
        }
        float f2 = f / 1000.0f;
        String str = "%.2f";
        this.f27845e4.setText(String.format(getResources().getString(C10232R.string.lbl_distance_away), new Object[]{String.format(str, new Object[]{Float.valueOf(f2)})}));
        this.f27728L0.setText(String.format(getResources().getString(C10232R.string.lbl_distance_value), new Object[]{String.format(str, new Object[]{Float.valueOf(f2)})}));
    }

    /* renamed from: b */
    private void m48092b(CancelReasonBean cancelReasonBean) {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("iOrderId", this.f27825b2);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f27929s2.getOrderOffer().getCourierId());
        hashMap.put("iCourierId", sb.toString());
        hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("reject_popup", "1");
        hashMap.put("reject_reason", C11644i.f33369n3);
        hashMap.put("vStatus", C11644i.f33298f3);
        hashMap.put("cancel_reason", cancelReasonBean.getCode());
        C11687c.m52645a(this.f29642a).withdrawOrder(String.valueOf(this.f27825b2), hashMap).enqueue(new C10378l3());
    }

    /* renamed from: a */
    private String m48009a(long j) {
        if (j < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(j);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append("");
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48017a(int i, String str) {
        for (int i2 = 0; i2 < this.f27767R3.size(); i2++) {
            OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) this.f27767R3.get(i2);
            if (i == optionMenuItemsBean.getId()) {
                optionMenuItemsBean.setTitle(str);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m48112c(String str, String str2) {
        String str3 = "?token=";
        if (C5887x.m25786E0()) {
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48032a(ChatInitModel chatInitModel, boolean z) {
        String str;
        this.f27668B0.setText(chatInitModel.getOrder().getvShopName());
        TextView textView = this.f27674C0;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(chatInitModel.getOrder().getiOrderId());
        textView.setText(sb.toString());
        m47901I(this.f27929s2.getOrder().getvStatus());
        String str2 = "";
        if (z) {
            this.f27716J0.setText(getResources().getString(C10232R.string.lbl_courier));
            if (!(chatInitModel.getOrderOffer() == null || chatInitModel.getOrderOffer().getCourierName() == null)) {
                this.f27686E0.setText(chatInitModel.getOrderOffer().getCourierName());
            }
            ChatInitModel chatInitModel2 = this.f27929s2;
            if (chatInitModel2 == null || chatInitModel2.getOrder() == null || this.f27929s2.getOrderOffer().getCourierPic() == null) {
                f27654B6 = str2;
            } else {
                f27654B6 = this.f27929s2.getOrderOffer().getCourierPic();
            }
        } else {
            this.f27716J0.setText(getResources().getString(C10232R.string.lbl_buyer));
            this.f27686E0.setText(this.f29642a.mo23646o(this.f27929s2.getOrder().getvBuyerName()));
            ChatInitModel chatInitModel3 = this.f27929s2;
            if (chatInitModel3 == null || chatInitModel3.getOrderOffer() == null || this.f27929s2.getOrder().getvBuyerPic() == null) {
                f27654B6 = str2;
            } else {
                f27654B6 = this.f27929s2.getOrder().getvBuyerPic();
            }
        }
        if (z) {
            if (TextUtils.isEmpty(this.f27929s2.getOrderOffer().getCourierPic())) {
                str = this.f27929s2.getOrder().getvCourierPic();
            } else {
                str = this.f27929s2.getOrderOffer().getCourierPic();
            }
            boolean isCourierVerified = this.f27929s2.getOrder().isCourierVerified();
        } else {
            str = this.f27929s2.getOrder().getvBuyerPic();
            boolean isBuyerVerified = this.f27929s2.getOrder().isBuyerVerified();
        }
        this.f27848f1.setVisibility(8);
        C2232l.m11649c(getApplicationContext()).mo9515a(str).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10389n2(this.f27818a1));
        try {
            this.f27770S0.setRating(Float.valueOf(z ? chatInitModel.getOrder().getfCourierRatings() : this.f27929s2.getOrder().getfBuyerRatings()).floatValue());
            this.f27734M0.setText(z ? chatInitModel.getOrder().getfCourierRatings() : this.f27929s2.getOrder().getfBuyerRatings());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (chatInitModel.getOrderOffer() != null) {
            TextView textView2 = this.f27692F0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3868i.f12248b);
            sb2.append(chatInitModel.getOrderOffer().getdDiscountCost_txt());
            textView2.setText(sb2.toString());
        }
    }

    /* renamed from: b */
    public void mo36526b(Location location) {
        C5880q.m25751b("CHAT_MESSAGE : onLocationUpdate Chatscreen");
        if (location != null) {
            this.f29642a.mo23468C().mo23449a(C11644i.f33303g, this.f29642a.mo23523a(location));
            this.f29642a.mo23468C().mo23449a(C11644i.f33312h, this.f29642a.mo23570b(location));
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23473E(C11644i.f33046A4);
            }
        }
    }

    /* renamed from: b */
    private messages m48081b(messages messages) {
        if (this.f27795W1.size() > 0) {
            int size = this.f27795W1.size() - 1;
            String str = messages.getvMessageId();
            if (str != null) {
                String str2 = ".";
                if (str.contains(str2)) {
                    str = str.substring(0, str.indexOf(str2));
                }
            }
            if (str != null) {
                String a = this.f29642a.mo23521a(Long.parseLong(str) * 1000, this.f27682D2);
                String d = C5887x.m25814d(this.f27682D2, this.f27694F2, a);
                String d2 = C5887x.m25814d(this.f27682D2, this.f27688E2, a);
                messages.setMessageDate(d);
                messages.setMessageTime(d2);
                if (((messages) this.f27795W1.get(size)).getMessageDate() != null && !((messages) this.f27795W1.get(size)).getMessageDate().equalsIgnoreCase(d)) {
                    messages.setIsDateVisible(true);
                }
            }
        }
        return messages;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m48089b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    /* renamed from: b */
    private boolean m48105b(Long l) {
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f27852f5.longValue());
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(l.longValue());
            if (instance2.before(instance)) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    private void m48030a(CancelReasonBean cancelReasonBean) {
        String str = "cancel_reason";
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            String str2 = "user_id";
            hashMap.put("iBuyerId", this.f29642a.mo23468C().mo23459f(str2));
            hashMap.put("iOrderId", this.f27825b2);
            hashMap.put("vSource", "offer");
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            sb.append(str3);
            sb.append(this.f27929s2.getOrderOffer().getCourierId());
            hashMap.put("iCourierId", sb.toString());
            hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f(str2));
            hashMap.put("vStatus", C11644i.f33298f3);
            try {
                hashMap.put(str, cancelReasonBean.getCode());
            } catch (Exception e) {
                e.printStackTrace();
                hashMap.put(str, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("callCancelOffer params:");
            sb2.append(hashMap);
            C5880q.m25751b(sb2.toString());
            m48176g0();
            C11687c.m52645a(this.f29642a).ChangeOffer(String.valueOf(this.f27825b2), hashMap).enqueue(new C10395o2(cancelReasonBean));
        }
    }

    /* renamed from: b */
    private void m48091b(TextView textView) {
        boolean R = this.f29642a.mo23496R();
        String str = C3868i.f12248b;
        if (R) {
            StringBuilder sb = new StringBuilder();
            sb.append("المجموع ");
            sb.append(this.f27929s2.getOrderBill().getDbTotalCost());
            sb.append(str);
            sb.append(this.f27929s2.getOrder().getCurrency());
            textView.setText(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Total Cost ");
        sb2.append(this.f27929s2.getOrderBill().getDbTotalCost());
        sb2.append(str);
        sb2.append(this.f27929s2.getOrder().getCurrency());
        textView.setText(sb2.toString());
    }

    /* renamed from: b */
    public void mo37665b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33751Z0, str2);
        hashMap.put("status", str);
        C11687c.m52645a(this.f29642a).updatePaymentProcess(f27655C6, hashMap).enqueue(new C10362j1(str));
    }

    /* renamed from: a */
    private void m48016a(int i, CancelReasonBean cancelReasonBean) {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        String str = "user_id";
        hashMap.put("iBuyerId", this.f29642a.mo23468C().mo23459f(str));
        hashMap.put("iOrderId", this.f27825b2);
        hashMap.put("vCourier", C11644i.f33298f3);
        hashMap.put("vSource", "offer");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f27929s2.getOrderOffer().getCourierId());
        hashMap.put("iCourierId", sb.toString());
        hashMap.put("reject_popup", "1");
        hashMap.put("current_user_id", this.f29642a.mo23468C().mo23459f(str));
        hashMap.put("cancel_reason", cancelReasonBean.getCode());
        hashMap.put("reject_reason", C11644i.f33449x3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("callChangeOffer params:");
        sb2.append(hashMap);
        C5880q.m25751b(sb2.toString());
        C11687c.m52645a(this.f29642a).ChangeOffer(String.valueOf(this.f27825b2), hashMap).enqueue(new C10410q2(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48026a(TextView textView) {
        if (!isFinishing()) {
            if (textView != null) {
                textView.setEnabled(false);
            }
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            }
            Dialog dialog = this.f27936t2;
            if (dialog != null) {
                dialog.dismiss();
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f29642a.mo23468C().mo23459f("user_id"));
            hashMap.put("current_user_id", sb.toString());
            hashMap.put("iBuyerId", this.f29642a.mo23476G());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("auth_token", sb2.toString());
            hashMap.put("vStatus", C11644i.f33385p3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f27929s2.getOrderOffer().getOffer_id());
            hashMap.put("new_offer_id", sb3.toString());
            APIInterface a = C11687c.m52645a(this.f29642a);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f27929s2.getOrder().getiOrderId());
            a.AccpetRejectOffer(sb4.toString(), hashMap).enqueue(new C10423s2(textView));
        }
    }

    /* renamed from: a */
    public void mo37663a(String str, String str2, String str3, String str4) {
        messages b = m48082b(str, str2, str3, str4);
        String trim = this.f27860h1.getText().toString().trim();
        b.setTxContent(trim);
        String str5 = "image";
        String str6 = "audio";
        if (!str2.equalsIgnoreCase(str5) && !str2.equalsIgnoreCase(str6)) {
            m48066a(str, str2, str4);
            if (this.f29642a.mo23612e()) {
                m48067a(str, str2, str4, trim, b);
            } else {
                m48067a(str, str2, str4, trim, b);
            }
        } else if (str2.equalsIgnoreCase(str5) || str2.equalsIgnoreCase("location") || str2.equalsIgnoreCase(str6)) {
            this.f29642a.mo23549a(this.f27962x0);
            this.f27801X1.mo7341e();
        }
        if (str2.equalsIgnoreCase("text")) {
            this.f27860h1.setText("");
            this.f29642a.mo23549a(this.f27962x0);
            this.f27801X1.mo7342e(this.f27795W1.size() - 1);
        }
        m48278p0();
        m48072a0();
    }

    /* renamed from: a */
    private void m48067a(String str, String str2, String str3, String str4, messages messages) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iOrderId", this.f27825b2);
            StringBuilder sb = new StringBuilder();
            String str5 = "";
            sb.append(str5);
            sb.append(str3);
            hashMap.put("vMessageId", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(this.f29642a.mo23476G());
            hashMap.put("iFromUserId", sb2.toString());
            hashMap.put("iToUserId", str);
            String str6 = "txContent";
            if (str2.equalsIgnoreCase("text")) {
                hashMap.put(str6, str4);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f27831c2);
                sb3.append(",");
                sb3.append(this.f27837d2);
                hashMap.put(str6, sb3.toString());
            }
            if (str2.equalsIgnoreCase("location")) {
                hashMap.put("iAddress", this.f27843e2);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("sendMessage Lat : ");
            sb4.append(this.f29642a.mo23648p().latitude);
            sb4.append(" && Lang : ");
            sb4.append(this.f29642a.mo23648p().longitude);
            C5880q.m25751b(sb4.toString());
            hashMap.put("vType", str2);
            hashMap.put("online", "1");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str5);
            sb5.append(this.f29642a.mo23648p().latitude);
            hashMap.put("clatitude", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str5);
            sb6.append(this.f29642a.mo23648p().longitude);
            hashMap.put("clongitude", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("CHAT_MESSAGE ");
            sb7.append(this.f29642a.mo23648p().latitude);
            sb7.append("|");
            sb7.append(this.f29642a.mo23648p().longitude);
            C5880q.m25751b(sb7.toString());
            hashMap.put("image_type", this.f27855g2 ? "buyer" : C11644i.f33256a6);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("param: ");
            sb8.append(hashMap);
            C5880q.m25751b(sb8.toString());
            C11687c.m52645a(this.f29642a).saveMessage(String.valueOf(this.f27825b2), hashMap).enqueue(new C10327d3(str3, messages, str));
        }
    }

    /* renamed from: a */
    private void m48066a(String str, String str2, String str3) {
        String str4 = "text";
        if (str2.equalsIgnoreCase(str4)) {
            messages b = m48082b(str, str4, this.f29642a.mo23488M(), str3);
            b.setSent2Server(false);
            m48036a(b);
            runOnUiThread(new C10333e3());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48062a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f27929s2.setNoChatInOrder(Boolean.valueOf(true));
            m47942P1();
        }
    }

    /* renamed from: a */
    private void m48024a(RatingBar ratingBar, int i) {
        LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(1)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(2)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(0)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48018a(int i, boolean z) {
        for (int i2 = 0; i2 < this.f27767R3.size(); i2++) {
            OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) this.f27767R3.get(i2);
            if (i == optionMenuItemsBean.getId()) {
                optionMenuItemsBean.setVisible(z);
                m48366y0();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48031a(CancelReasonMainBean cancelReasonMainBean, int i) {
        this.f27713I3 = cancelReasonMainBean.getReasons();
        if (i == 0) {
            OrderReasonBean orderReasonBean = new OrderReasonBean(this.f27713I3, i, getString(C10232R.string.lbl_delete_order), getString(C10232R.string.masg_ask_to_delete_order), getString(C10232R.string.lbl_delete), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean);
        } else if (i == 1) {
            OrderReasonBean orderReasonBean2 = new OrderReasonBean(this.f27713I3, i, getString(C10232R.string.lbl_withdraw), getString(C10232R.string.masg_ask_to_withdraw_order), getString(C10232R.string.lbl_withdraw), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean2);
        } else if (i == 2) {
            OrderReasonBean orderReasonBean3 = new OrderReasonBean(this.f27713I3, i, getString(C10232R.string.lbl_change_courier), getString(C10232R.string.masg_ask_to_change_courier), getString(C10232R.string.lbl_change_courier), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean3);
        } else if (i == 3) {
            OrderReasonBean orderReasonBean4 = new OrderReasonBean(this.f27713I3, i, getString(C10232R.string.lbl_report_inappropriate), getString(C10232R.string.lbl_choose_reason_for_report), getString(C10232R.string.btn_submit), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48015a(int i, int i2, boolean z) {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            if (z) {
                xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            } else {
                m48226l(1);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("user_id", this.f29642a.mo23476G());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f27825b2);
            hashMap.put("order_id", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i2);
            hashMap.put("type", sb2.toString());
            C11687c.m52645a(this.f29642a).cancelReason(hashMap).enqueue(new C10384m3(z, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48071a(String... strArr) {
        this.f27721J5.mo39857a(strArr[0], strArr[1]);
    }

    /* renamed from: a */
    public void mo37664a(String str, String str2, boolean z) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_show_ok);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
        textView2.setText(str);
        textView.setOnClickListener(new C10396o3(dialog, z));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: a */
    private void m48033a(OrderReasonBean orderReasonBean) {
        C11759b a = C11759b.m52887a(orderReasonBean);
        a.setCancelable(false);
        a.show(getSupportFragmentManager(), "ShowReasonDialogFragment");
    }

    /* renamed from: a */
    public void mo37659a(int i, int i2) {
        if (i == 0) {
            m48030a((CancelReasonBean) this.f27713I3.get(i2));
        } else if (i == 1) {
            m48092b((CancelReasonBean) this.f27713I3.get(i2));
        } else if (i == 2) {
            m48016a(0, (CancelReasonBean) this.f27713I3.get(i2));
        } else if (i == 3) {
            m48217k(((CancelReasonBean) this.f27713I3.get(i2)).getCode());
        }
    }

    /* renamed from: a */
    public void mo37660a(int i, int i2, CancelReasonMainBean cancelReasonMainBean) {
        this.f27673B5 = i2;
        this.f27667A5 = cancelReasonMainBean;
        this.f27713I3 = cancelReasonMainBean.getReasons();
        if (i2 == 0) {
            OrderReasonBean orderReasonBean = new OrderReasonBean(this.f27713I3, i2, getString(C10232R.string.lbl_delete_order), getString(C10232R.string.masg_ask_to_delete_order), getString(C10232R.string.lbl_delete), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean);
        } else if (i2 == 1) {
            OrderReasonBean orderReasonBean2 = new OrderReasonBean(this.f27713I3, i2, getString(C10232R.string.lbl_withdraw), getString(C10232R.string.masg_ask_to_withdraw_order), getString(C10232R.string.lbl_withdraw), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean2);
        } else if (i2 == 2) {
            OrderReasonBean orderReasonBean3 = new OrderReasonBean(this.f27713I3, i2, getString(C10232R.string.lbl_change_courier), getString(C10232R.string.masg_ask_to_change_courier), getString(C10232R.string.lbl_change_courier), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean3);
        } else if (i2 == 3) {
            OrderReasonBean orderReasonBean4 = new OrderReasonBean(this.f27713I3, i2, getString(C10232R.string.lbl_report_inappropriate), getString(C10232R.string.lbl_choose_reason_for_report), getString(C10232R.string.btn_submit), getString(C10232R.string.lbl_dg_title_cancel));
            m48033a(orderReasonBean4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48036a(messages messages) {
        if (this.f27795W1.size() > 0) {
            int size = this.f27795W1.size() - 1;
            String str = messages.getvMessageId();
            if (str != null) {
                String str2 = ".";
                if (str.contains(str2)) {
                    str = str.substring(0, str.indexOf(str2));
                }
            }
            if (str != null) {
                String a = this.f29642a.mo23521a(Long.parseLong(str) * 1000, this.f27682D2);
                String d = C5887x.m25814d(this.f27682D2, this.f27694F2, a);
                String d2 = C5887x.m25814d(this.f27682D2, this.f27688E2, a);
                messages.setMessageDate(d);
                messages.setMessageTime(d2);
                if (((messages) this.f27795W1.get(size)).getMessageDate() != null && !((messages) this.f27795W1.get(size)).getMessageDate().equalsIgnoreCase(d)) {
                    messages.setIsDateVisible(true);
                }
            }
            this.f27795W1.add(messages);
        }
    }

    /* renamed from: a */
    private void m48022a(Menu menu) {
        View inflate = ((LayoutInflater) getBaseContext().getSystemService("layout_inflater")).inflate(C10232R.layout.row_custom_option, null);
        menu.findItem(C10232R.C10236id.action_route).setActionView(inflate);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtTitle);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llSeeRoute);
        textView.setText(C10232R.string.lbl_route);
        linearLayout.setOnClickListener(new C10401p());
    }

    /* renamed from: a */
    private void m48020a(Dialog dialog) {
        int i = 0;
        while (i < this.f27807Y1.size()) {
            try {
                if (!(this.f27807Y1.get(i) == null || !((Dialog) this.f27807Y1.get(i)).isShowing() || this.f27807Y1.get(i) == dialog)) {
                    ((Dialog) this.f27807Y1.get(i)).dismiss();
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: a */
    public ObjectAnimator mo37657a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{f, f2});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C3911g.m17082a(8));
        return ofFloat;
    }

    /* renamed from: a */
    private void m48023a(ImageView imageView, int i) {
        imageView.setColorFilter(C0841b.m4915a((Context) this, i), Mode.SRC_IN);
    }

    /* renamed from: a */
    private void m48025a(RelativeLayout relativeLayout, ImageView imageView) {
        m48023a(imageView, (int) C10232R.C10234color.white);
        relativeLayout.setActivated(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48068a(ArrayList<Marker> arrayList, boolean z) {
        new Handler().postDelayed(new C10311b0(arrayList, z), 500);
    }

    /* renamed from: a */
    private void m48028a(Builder builder, boolean z) {
        new Handler().postDelayed(new C10317c0(z, builder), 500);
    }

    /* renamed from: a */
    public PolylineOptions mo37658a(Context context, ArrayList<LatLng> arrayList, int i, int i2) {
        PolylineOptions geodesic = new PolylineOptions().width((float) this.f29642a.mo23601d(i)).color(i2).geodesic(true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            geodesic.add((LatLng) it.next());
        }
        return geodesic;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48064a(String str, Dialog dialog) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("action_type", str);
            C11687c.m52645a(this.f29642a).updateCancelRequest(this.f27825b2, hashMap).enqueue(new C10393o0(dialog, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48063a(Boolean bool, String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("order_id", this.f27825b2);
            if (bool.booleanValue()) {
                hashMap.put(C11687c.f33843u1, "reimbursement_complaint");
            }
            C11687c.m52645a(this.f29642a).getCourierWeblinkToken(this.f29642a.mo23476G(), hashMap).enqueue(new C10446w0(bool, str));
        }
    }

    /* renamed from: a */
    private Boolean m48006a(Long l) {
        return Boolean.valueOf(l.longValue() < System.currentTimeMillis() - C2876e.f10137n);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48035a(ServiceManualDefaultBean serviceManualDefaultBean) {
        this.f27705H1.setVisibility(8);
        this.f27741N1.setVisibility(0);
        mo37661a((View) this.f27711I1, 0, (AnimationListener) new C10466z0(serviceManualDefaultBean));
    }

    /* renamed from: a */
    public void mo37661a(View view, int i, AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new C2118c());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        long j = (long) i;
        alphaAnimation.setStartOffset(j);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500);
        scaleAnimation.setStartOffset(j);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(animationListener);
        view.startAnimation(animationSet);
    }

    /* renamed from: a */
    private void m48027a(TextView textView, int i, int i2) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C10337f1(textView, i, i2));
    }
}
