package com.mrsool.utils;

import android.app.NotificationManager;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.bean.MyOrdersInactive;
import com.mrsool.bean.NotificationRow;
import com.mrsool.bean.UserDetail;
import com.mrsool.bean.messages;
import com.mrsool.utils.webservice.C11687c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

/* renamed from: com.mrsool.utils.i */
/* compiled from: Constant */
public class C11644i {

    /* renamed from: A */
    public static String f33041A = null;

    /* renamed from: A0 */
    public static final int f33042A0 = 101;

    /* renamed from: A1 */
    public static String f33043A1 = "isEditable";

    /* renamed from: A2 */
    public static String f33044A2 = "isDropOffFixed";

    /* renamed from: A3 */
    public static int f33045A3 = 0;

    /* renamed from: A4 */
    public static final String f33046A4 = "broadcast_update_coordinates";

    /* renamed from: A5 */
    public static final String f33047A5 = "is_regular_after_update";

    /* renamed from: A6 */
    public static List<MyOrdersInactive> f33048A6 = new ArrayList();

    /* renamed from: B */
    public static String f33049B = null;

    /* renamed from: B0 */
    public static final int f33050B0 = 1021;

    /* renamed from: B1 */
    public static String f33051B1 = "complaintId";

    /* renamed from: B2 */
    public static String f33052B2 = "isPickupAvail";

    /* renamed from: B3 */
    public static int f33053B3 = 0;

    /* renamed from: B4 */
    public static final String f33054B4 = "bill_issued";

    /* renamed from: B5 */
    public static final String f33055B5 = "notification_channel";

    /* renamed from: B6 */
    public static List<MyOrdersActive> f33056B6 = new ArrayList();

    /* renamed from: C */
    public static String f33057C = null;

    /* renamed from: C0 */
    public static final int f33058C0 = 1022;

    /* renamed from: C1 */
    public static String f33059C1 = "isFromComplaintList";

    /* renamed from: C2 */
    public static String f33060C2 = "isDropOffAvail";

    /* renamed from: C3 */
    public static int f33061C3 = 0;

    /* renamed from: C4 */
    public static final String f33062C4 = "filed_complaint";

    /* renamed from: C5 */
    public static final String f33063C5 = "is_verified";

    /* renamed from: C6 */
    public static List<MyOrdersInactive> f33064C6 = new ArrayList();

    /* renamed from: D */
    public static String f33065D = null;

    /* renamed from: D0 */
    public static final int f33066D0 = 108;

    /* renamed from: D1 */
    public static String f33067D1 = PrivacyItem.SUBSCRIPTION_FROM;

    /* renamed from: D2 */
    public static String f33068D2 = C11687c.f33792h2;

    /* renamed from: D3 */
    public static int f33069D3 = 0;

    /* renamed from: D4 */
    public static final String f33070D4 = "broadcast_start_tracking";

    /* renamed from: D5 */
    public static final String f33071D5 = "show_pending_tab";

    /* renamed from: D6 */
    public static UserDetail f33072D6 = null;

    /* renamed from: E */
    public static boolean f33073E = true;

    /* renamed from: E0 */
    public static final int f33074E0 = 1000;

    /* renamed from: E1 */
    public static String f33075E1 = "MeTab";

    /* renamed from: E2 */
    public static String f33076E2 = C11687c.f33796i2;

    /* renamed from: E3 */
    public static int f33077E3 = 0;

    /* renamed from: E4 */
    public static final String f33078E4 = "broadcast_stop_tracking";

    /* renamed from: E5 */
    public static final String f33079E5 = "id_announcement";

    /* renamed from: E6 */
    public static int f33080E6 = 1;

    /* renamed from: F */
    public static boolean f33081F = true;

    /* renamed from: F0 */
    public static final int f33082F0 = 1001;

    /* renamed from: F1 */
    public static String f33083F1 = f33274c6;

    /* renamed from: F2 */
    public static String f33084F2 = C11687c.f33787g2;

    /* renamed from: F3 */
    public static int f33085F3 = 0;

    /* renamed from: F4 */
    public static final String f33086F4 = "broadcast_auto_start_track";

    /* renamed from: F5 */
    public static final String f33087F5 = "male";

    /* renamed from: F6 */
    public static int f33088F6 = 0;

    /* renamed from: G */
    public static int f33089G = -1;

    /* renamed from: G0 */
    public static final int f33090G0 = 1002;

    /* renamed from: G1 */
    public static String f33091G1 = "dbDeliveryCost";

    /* renamed from: G2 */
    public static String f33092G2 = C11687c.f33800j2;

    /* renamed from: G3 */
    public static int f33093G3 = 0;

    /* renamed from: G4 */
    public static final String f33094G4 = "broadcast_auto_stop_track";

    /* renamed from: G5 */
    public static final String f33095G5 = "female";

    /* renamed from: G6 */
    public static int f33096G6 = 1;

    /* renamed from: H */
    public static int f33097H = 0;

    /* renamed from: H0 */
    public static final int f33098H0 = 1003;

    /* renamed from: H1 */
    public static String f33099H1 = "dbDeliveryCost_txt";

    /* renamed from: H2 */
    public static String f33100H2 = C11687c.f33804k2;

    /* renamed from: H3 */
    public static int f33101H3 = 0;

    /* renamed from: H4 */
    public static final String f33102H4 = "broadcast_network_on_off";

    /* renamed from: H5 */
    public static final String f33103H5 = "is_shown_price_walktrough";

    /* renamed from: H6 */
    public static boolean f33104H6 = true;

    /* renamed from: I */
    public static int f33105I = 0;

    /* renamed from: I0 */
    public static final int f33106I0 = 1004;

    /* renamed from: I1 */
    public static String f33107I1 = "dDiscountCost";

    /* renamed from: I2 */
    public static String f33108I2 = "vDropoffAddress";

    /* renamed from: I3 */
    public static final String f33109I3 = "fcm_push_received";

    /* renamed from: I4 */
    public static final String f33110I4 = "broadcast_internet_on_off";

    /* renamed from: I5 */
    public static final String f33111I5 = "user_notification_tone";

    /* renamed from: I6 */
    public static int f33112I6 = 0;

    /* renamed from: J */
    public static boolean f33113J = true;

    /* renamed from: J0 */
    public static final int f33114J0 = 1005;

    /* renamed from: J1 */
    public static String f33115J1 = "dDiscountCost_txt";

    /* renamed from: J2 */
    public static String f33116J2 = "isServiceAvailable";

    /* renamed from: J3 */
    public static final String f33117J3 = "Message_got";

    /* renamed from: J4 */
    public static final String f33118J4 = "broadcast_location_filter_on_off";

    /* renamed from: J5 */
    public static final String f33119J5 = "user_notification_tone_name";

    /* renamed from: J6 */
    public static boolean f33120J6 = false;

    /* renamed from: K */
    public static boolean f33121K = false;

    /* renamed from: K0 */
    public static final int f33122K0 = 1006;

    /* renamed from: K1 */
    public static String f33123K1 = "iBuyerId";

    /* renamed from: K2 */
    public static String f33124K2 = "isOn";

    /* renamed from: K3 */
    public static final String f33125K3 = "recipt_got";

    /* renamed from: K4 */
    public static final String f33126K4 = "broadcast_ask_location";

    /* renamed from: K5 */
    public static final String f33127K5 = "user_notification_tone_uri";

    /* renamed from: K6 */
    public static boolean f33128K6 = false;

    /* renamed from: L */
    public static boolean f33129L = false;

    /* renamed from: L0 */
    public static final int f33130L0 = 1008;

    /* renamed from: L1 */
    public static String f33131L1 = "iCourierId";

    /* renamed from: L2 */
    public static String f33132L2 = "name";

    /* renamed from: L3 */
    public static final String f33133L3 = "seen_msg";

    /* renamed from: L4 */
    public static final String f33134L4 = "broadcast_gps_on_off";

    /* renamed from: L5 */
    public static final String f33135L5 = "is_registered";

    /* renamed from: L6 */
    public static boolean f33136L6 = false;

    /* renamed from: M */
    public static boolean f33137M = false;

    /* renamed from: M0 */
    public static final int f33138M0 = 1009;

    /* renamed from: M1 */
    public static String f33139M1 = "iOrderId";

    /* renamed from: M2 */
    public static String f33140M2 = XHTMLText.CODE;

    /* renamed from: M3 */
    public static final String f33141M3 = "refresh_chat_screen";

    /* renamed from: M4 */
    public static final String f33142M4 = "broadcast_authorized";

    /* renamed from: M5 */
    public static String f33143M5 = null;

    /* renamed from: M6 */
    public static boolean f33144M6 = false;

    /* renamed from: N */
    public static boolean f33145N = false;

    /* renamed from: N0 */
    public static final int f33146N0 = 1010;

    /* renamed from: N1 */
    public static String f33147N1 = "isShop";

    /* renamed from: N2 */
    public static String f33148N2 = "dial_code";

    /* renamed from: N3 */
    public static final String f33149N3 = "tokenReceiver";

    /* renamed from: N4 */
    public static final String f33150N4 = "broadcast_update_pending_order";

    /* renamed from: N5 */
    public static int f33151N5 = 0;

    /* renamed from: N6 */
    public static long f33152N6 = 0;

    /* renamed from: O */
    public static boolean f33153O = true;

    /* renamed from: O0 */
    public static final int f33154O0 = 1011;

    /* renamed from: O1 */
    public static String f33155O1 = "isService";

    /* renamed from: O2 */
    public static String f33156O2 = "flag";

    /* renamed from: O3 */
    public static final String f33157O3 = "refresh_pending_order";

    /* renamed from: O4 */
    public static final String f33158O4 = "broadcast_chatstatus";

    /* renamed from: O5 */
    public static final String f33159O5 = "isRateTheApp";

    /* renamed from: O6 */
    public static boolean f33160O6 = false;

    /* renamed from: P */
    public static boolean f33161P = false;

    /* renamed from: P0 */
    public static final int f33162P0 = 1012;

    /* renamed from: P1 */
    public static String f33163P1 = "adddress";

    /* renamed from: P2 */
    public static String f33164P2 = "data";

    /* renamed from: P3 */
    public static final String f33165P3 = "refresh_complete_pending_order";

    /* renamed from: P4 */
    public static final String f33166P4 = "broadcast_update_items";

    /* renamed from: P5 */
    public static final String f33167P5 = "isNoThanks";

    /* renamed from: P6 */
    public static List<messages> f33168P6 = new ArrayList();

    /* renamed from: Q */
    public static boolean f33169Q = false;

    /* renamed from: Q0 */
    public static final String f33170Q0 = "fb_gcm_token";

    /* renamed from: Q1 */
    public static String f33171Q1 = "is_tracking";

    /* renamed from: Q2 */
    public static String f33172Q2 = "array";

    /* renamed from: Q3 */
    public static final String f33173Q3 = "refresh_menu_item";

    /* renamed from: Q4 */
    public static final String f33174Q4 = "broadcast_otp_cancel";

    /* renamed from: Q5 */
    public static final String f33175Q5 = "isLater";

    /* renamed from: Q6 */
    public static final double f33176Q6 = 2.0d;

    /* renamed from: R */
    public static boolean f33177R = true;

    /* renamed from: R0 */
    public static final String f33178R0 = "shop_info";

    /* renamed from: R1 */
    public static String f33179R1 = "chatModel";

    /* renamed from: R2 */
    public static String f33180R2 = "card";

    /* renamed from: R3 */
    public static final String f33181R3 = "refresh_myorder";

    /* renamed from: R4 */
    public static final String f33182R4 = "simple";

    /* renamed from: R5 */
    public static final String f33183R5 = "en";

    /* renamed from: R6 */
    public static final String f33184R6 = "G";

    /* renamed from: S */
    public static boolean f33185S = false;

    /* renamed from: S0 */
    public static int f33186S0 = 0;

    /* renamed from: S1 */
    public static String f33187S1 = "bill_pic";

    /* renamed from: S2 */
    public static String f33188S2 = "order_minimun_cost";

    /* renamed from: S3 */
    public static final String f33189S3 = "refresh_myDelivery";

    /* renamed from: S4 */
    public static final String f33190S4 = "facebook";

    /* renamed from: S5 */
    public static final String f33191S5 = "ar";

    /* renamed from: S6 */
    public static final String f33192S6 = "P";

    /* renamed from: T */
    public static boolean f33193T = false;

    /* renamed from: T0 */
    public static String f33194T0 = null;

    /* renamed from: T1 */
    public static String f33195T1 = "cost_of_goods";

    /* renamed from: T2 */
    public static final String f33196T2 = "is_language_selected";

    /* renamed from: T3 */
    public static final String f33197T3 = "refresh_myDelivery_from_tab";

    /* renamed from: T4 */
    public static final String f33198T4 = "google";

    /* renamed from: T5 */
    public static final String f33199T5 = "call_from";

    /* renamed from: T6 */
    public static int f33200T6 = 2;

    /* renamed from: U */
    public static boolean f33201U = false;

    /* renamed from: U0 */
    public static String f33202U0 = null;

    /* renamed from: U1 */
    public static String f33203U1 = "is_progress";

    /* renamed from: U2 */
    public static final String f33204U2 = "last_date_of_audio_delete";

    /* renamed from: U3 */
    public static final String f33205U3 = "refresh_myorder_from_tab";

    /* renamed from: U4 */
    public static final String f33206U4 = "isFBLogin";

    /* renamed from: U5 */
    public static final String f33207U5 = "extras_ct_events";

    /* renamed from: U6 */
    public static int f33208U6 = 102;

    /* renamed from: V */
    public static boolean f33209V = false;

    /* renamed from: V0 */
    public static String f33210V0 = null;

    /* renamed from: V1 */
    public static String f33211V1 = C11687c.f33692K1;

    /* renamed from: V2 */
    public static String f33212V2 = "pref_track_count";

    /* renamed from: V3 */
    public static final String f33213V3 = "refresh_myorder_from_search";

    /* renamed from: V4 */
    public static final String f33214V4 = "isGPlusLogin";

    /* renamed from: V5 */
    public static final String f33215V5 = "needToOpenHomeScreen";

    /* renamed from: V6 */
    public static boolean f33216V6 = false;

    /* renamed from: W */
    public static final int f33217W = 100;

    /* renamed from: W0 */
    public static String f33218W0 = null;

    /* renamed from: W1 */
    public static String f33219W1 = C11687c.f33684I1;

    /* renamed from: W2 */
    public static String f33220W2 = "pref_font_scale";

    /* renamed from: W3 */
    public static final String f33221W3 = "refresh_spinner_count";

    /* renamed from: W4 */
    public static final String f33222W4 = "isLogin";

    /* renamed from: W5 */
    public static final String f33223W5 = "45.0792";

    /* renamed from: W6 */
    public static int f33224W6 = 1;

    /* renamed from: X */
    public static boolean f33225X = false;

    /* renamed from: X0 */
    public static boolean f33226X0 = false;

    /* renamed from: X1 */
    public static String f33227X1 = "unread_count";

    /* renamed from: X2 */
    public static String f33228X2 = "pref_density";

    /* renamed from: X3 */
    public static final String f33229X3 = "call_update_view";

    /* renamed from: X4 */
    public static final String f33230X4 = "is_skip";

    /* renamed from: X5 */
    public static final String f33231X5 = "23.8859";

    /* renamed from: X6 */
    public static int f33232X6 = 10;

    /* renamed from: Y */
    public static final int f33233Y = 402;

    /* renamed from: Y0 */
    public static boolean f33234Y0 = false;

    /* renamed from: Y1 */
    public static String f33235Y1 = "offer_amount";

    /* renamed from: Y2 */
    public static String f33236Y2 = "pref_scaled_density";

    /* renamed from: Y3 */
    public static final String f33237Y3 = "refresh_order_tab_adapters";

    /* renamed from: Y4 */
    public static final String f33238Y4 = "is_splash_shown";

    /* renamed from: Y5 */
    public static final String f33239Y5 = "order";

    /* renamed from: Y6 */
    public static float f33240Y6 = 500.0f;

    /* renamed from: Z */
    public static String f33241Z = null;

    /* renamed from: Z0 */
    public static boolean f33242Z0 = false;

    /* renamed from: Z1 */
    public static String f33243Z1 = "offer_message";

    /* renamed from: Z2 */
    public static String f33244Z2 = f33247Z5;

    /* renamed from: Z3 */
    public static final String f33245Z3 = "refresh_delivery_tab_adapters";

    /* renamed from: Z4 */
    public static final String f33246Z4 = "is_profile_complete";

    /* renamed from: Z5 */
    public static final String f33247Z5 = "shop";

    /* renamed from: Z6 */
    public static float f33248Z6 = 4.0f;

    /* renamed from: a */
    public static final boolean f33249a = true;

    /* renamed from: a0 */
    public static boolean f33250a0 = false;

    /* renamed from: a1 */
    public static boolean f33251a1 = false;

    /* renamed from: a2 */
    public static String f33252a2 = "username";

    /* renamed from: a3 */
    public static String f33253a3 = "service";

    /* renamed from: a4 */
    public static final String f33254a4 = "refresh_accuracy";

    /* renamed from: a5 */
    public static final String f33255a5 = "is_clevertap_pushed";

    /* renamed from: a6 */
    public static final String f33256a6 = "courier";

    /* renamed from: a7 */
    public static float f33257a7 = 10000.0f;

    /* renamed from: b */
    public static final String f33258b = "extras_source";

    /* renamed from: b0 */
    public static int f33259b0 = 1930;

    /* renamed from: b1 */
    public static boolean f33260b1 = false;

    /* renamed from: b2 */
    public static String f33261b2 = "rating";

    /* renamed from: b3 */
    public static String f33262b3 = "M4B service";

    /* renamed from: b4 */
    public static final String f33263b4 = "refresh_notification_list";

    /* renamed from: b5 */
    public static final String f33264b5 = "300";

    /* renamed from: b6 */
    public static final String f33265b6 = "common";

    /* renamed from: b7 */
    public static String f33266b7 = Enabled.ELEMENT;

    /* renamed from: c */
    public static final String f33267c = "count";

    /* renamed from: c0 */
    public static int f33268c0 = 15;

    /* renamed from: c1 */
    public static boolean f33269c1 = false;

    /* renamed from: c2 */
    public static String f33270c2 = "isBuyer";

    /* renamed from: c3 */
    public static final String f33271c3 = "no";

    /* renamed from: c4 */
    public static final String f33272c4 = "profile_pic_changed";

    /* renamed from: c5 */
    public static final String f33273c5 = "123456";

    /* renamed from: c6 */
    public static final String f33274c6 = "chat";

    /* renamed from: c7 */
    public static String f33275c7 = "disabled";

    /* renamed from: d */
    public static NotificationManager f33276d = null;

    /* renamed from: d0 */
    public static String f33277d0 = null;

    /* renamed from: d1 */
    public static boolean f33278d1 = false;

    /* renamed from: d2 */
    public static String f33279d2 = "isCourier";

    /* renamed from: d3 */
    public static final String f33280d3 = "late";

    /* renamed from: d4 */
    public static final String f33281d4 = "home_firebase_incease_count";

    /* renamed from: d5 */
    public static final String f33282d5 = "is_terms_accepted";

    /* renamed from: d6 */
    public static final String f33283d6 = "complaint";

    /* renamed from: d7 */
    public static String f33284d7 = "deleted";

    /* renamed from: e */
    public static final String f33285e;

    /* renamed from: e0 */
    public static final String f33286e0 = "is_bookmark_tooltip_shown";

    /* renamed from: e1 */
    public static Boolean f33287e1 = null;

    /* renamed from: e2 */
    public static String f33288e2 = "offerId";

    /* renamed from: e3 */
    public static final String f33289e3 = "yes";

    /* renamed from: e4 */
    public static final String f33290e4 = "update_location_shop_data";

    /* renamed from: e5 */
    public static final String f33291e5 = "current_terms_version";

    /* renamed from: e6 */
    public static final String f33292e6 = "service";

    /* renamed from: e7 */
    public static String f33293e7 = "needToCalAPI";

    /* renamed from: f */
    public static final int f33294f = 300;

    /* renamed from: f0 */
    public static final String f33295f0 = "imei";

    /* renamed from: f1 */
    public static final int f33296f1 = 0;

    /* renamed from: f2 */
    public static String f33297f2 = "orderDetail";

    /* renamed from: f3 */
    public static final String f33298f3 = "cancel";

    /* renamed from: f4 */
    public static final String f33299f4 = "refresh_chat_list";

    /* renamed from: f5 */
    public static final String f33300f5 = "fb_uname";

    /* renamed from: f6 */
    public static final String f33301f6 = "announcement";

    /* renamed from: f7 */
    public static boolean f33302f7 = false;

    /* renamed from: g */
    public static final String f33303g = "current_lat";

    /* renamed from: g0 */
    public static final String f33304g0 = "statusbar_height";

    /* renamed from: g1 */
    public static final int f33305g1 = 1;

    /* renamed from: g2 */
    public static String f33306g2 = "courier_lat";

    /* renamed from: g3 */
    public static final String f33307g3 = "pending";

    /* renamed from: g4 */
    public static final String f33308g4 = "refresh_complaint_list";

    /* renamed from: g5 */
    public static final String f33309g5 = "fb_app_id";

    /* renamed from: g6 */
    public static final String f33310g6 = "track_start";

    /* renamed from: g7 */
    public static String f33311g7 = "is_offline_tooltip_shown";

    /* renamed from: h */
    public static final String f33312h = "current_long";

    /* renamed from: h0 */
    public static final String f33313h0 = "pref_xmpp";

    /* renamed from: h1 */
    public static String f33314h1 = "order_id";

    /* renamed from: h2 */
    public static String f33315h2 = "courier_lng";

    /* renamed from: h3 */
    public static final String f33316h3 = "expired";

    /* renamed from: h4 */
    public static final String f33317h4 = "refresh_resolved_count";

    /* renamed from: h5 */
    public static final String f33318h5 = "fb_email";

    /* renamed from: h6 */
    public static final String f33319h6 = "track_stop";

    /* renamed from: h7 */
    public static String f33320h7 = "is_pickup_location_tooltip_shown";

    /* renamed from: i */
    public static final String f33321i = "user_location_accuracy";

    /* renamed from: i0 */
    public static String f33322i0 = "ec2-52-10-119-189.us-west-2.compute.amazonaws.com";

    /* renamed from: i1 */
    public static String f33323i1 = "shop_name";

    /* renamed from: i2 */
    public static String f33324i2 = "callFrom";

    /* renamed from: i3 */
    public static final String f33325i3 = "in-progress";

    /* renamed from: i4 */
    public static final String f33326i4 = "broadcast_refresh_profile";

    /* renamed from: i5 */
    public static final String f33327i5 = "fb_pic";

    /* renamed from: i6 */
    public static final String f33328i6 = "autostart_track";

    /* renamed from: i7 */
    public static String f33329i7 = "is_dropoff_location_tooltip_shown";

    /* renamed from: j */
    public static final String[] f33330j;

    /* renamed from: j0 */
    public static String f33331j0 = "xmpp.mrsool.co";

    /* renamed from: j1 */
    public static String f33332j1 = "position";

    /* renamed from: j2 */
    public static String f33333j2 = "notification_id";

    /* renamed from: j3 */
    public static final String f33334j3 = "in_progress";

    /* renamed from: j4 */
    public static final String f33335j4 = "refresh_location";

    /* renamed from: j5 */
    public static final String f33336j5 = "gplus_uname";

    /* renamed from: j6 */
    public static final String f33337j6 = "autostop_track";

    /* renamed from: j7 */
    public static String f33338j7 = "is_pending_order_tooltip_shown";

    /* renamed from: k */
    public static final String[] f33339k;

    /* renamed from: k0 */
    public static String f33340k0 = "5222";

    /* renamed from: k1 */
    public static String f33341k1 = "p_lat";

    /* renamed from: k2 */
    public static String f33342k2 = "other_user_id";

    /* renamed from: k3 */
    public static final String f33343k3 = "finalized";

    /* renamed from: k4 */
    public static final String f33344k4 = "refresh_location_changed";

    /* renamed from: k5 */
    public static final String f33345k5 = "gplus_app_id";

    /* renamed from: k6 */
    public static final String f33346k6 = "downvoted";

    /* renamed from: k7 */
    public static final String f33347k7 = "extras_cc";

    /* renamed from: l */
    public static final String[] f33348l;

    /* renamed from: l0 */
    public static Boolean f33349l0 = null;

    /* renamed from: l1 */
    public static String f33350l1 = "p_lng";

    /* renamed from: l2 */
    public static String f33351l2 = C5854b.f16923e;

    /* renamed from: l3 */
    public static final String f33352l3 = "reject";

    /* renamed from: l4 */
    public static final String f33353l4 = "broadcaset_connection_disconnection";

    /* renamed from: l5 */
    public static final String f33354l5 = "gplus_email";

    /* renamed from: l6 */
    public static final String f33355l6 = "upvoted";

    /* renamed from: l7 */
    public static final String f33356l7 = "android.net.conn.CONNECTIVITY_CHANGE";

    /* renamed from: m */
    public static final String[] f33357m;

    /* renamed from: m0 */
    public static final int f33358m0 = 111;

    /* renamed from: m1 */
    public static String f33359m1 = "type";

    /* renamed from: m2 */
    public static String f33360m2 = "is_file";

    /* renamed from: m3 */
    public static final String f33361m3 = "delivered";

    /* renamed from: m4 */
    public static final String f33362m4 = "broadcast_connect_xmpp";

    /* renamed from: m5 */
    public static final String f33363m5 = "gplus_pic";

    /* renamed from: m6 */
    public static final String f33364m6 = "text";

    /* renamed from: n */
    public static final String[] f33365n;

    /* renamed from: n0 */
    public static final int f33366n0 = 222;

    /* renamed from: n1 */
    public static String f33367n1 = C11687c.f33862z0;

    /* renamed from: n2 */
    public static String f33368n2 = "isFirstTime";

    /* renamed from: n3 */
    public static final String f33369n3 = "Courier Withdrew";

    /* renamed from: n4 */
    public static final String f33370n4 = "broadcast_disconnect_xmpp";

    /* renamed from: n5 */
    public static final String f33371n5 = "user_name";

    /* renamed from: n6 */
    public static final String f33372n6 = "image";

    /* renamed from: o */
    public static final String[] f33373o;

    /* renamed from: o0 */
    public static final int f33374o0 = 555;

    /* renamed from: o1 */
    public static String f33375o1 = "shop_desc";

    /* renamed from: o2 */
    public static String f33376o2 = "signup_profile";

    /* renamed from: o3 */
    public static final String f33377o3 = "offer";

    /* renamed from: o4 */
    public static final String f33378o4 = "broadcast_test_noti";

    /* renamed from: o5 */
    public static final String f33379o5 = "user_email";

    /* renamed from: o6 */
    public static final String f33380o6 = "location";

    /* renamed from: p */
    public static int f33381p = 1000;

    /* renamed from: p0 */
    public static final int f33382p0 = 666;

    /* renamed from: p1 */
    public static String f33383p1 = "url";

    /* renamed from: p2 */
    public static String f33384p2 = "home_screen";

    /* renamed from: p3 */
    public static final String f33385p3 = "accept";

    /* renamed from: p4 */
    public static final String f33386p4 = "broadcast_courier_confirm";

    /* renamed from: p5 */
    public static final String f33387p5 = "user_phone";

    /* renamed from: p6 */
    public static final String f33388p6 = "complaint";

    /* renamed from: q */
    public static int f33389q = ConnectionResult.f12762k0;

    /* renamed from: q0 */
    public static final int f33390q0 = 777;

    /* renamed from: q1 */
    public static String f33391q1 = "title";

    /* renamed from: q2 */
    public static String f33392q2 = "has_animation";

    /* renamed from: q3 */
    public static final String f33393q3 = "decline";

    /* renamed from: q4 */
    public static final String f33394q4 = "broadcast_refresh_check_in_list";

    /* renamed from: q5 */
    public static final String f33395q5 = "user_profile";

    /* renamed from: q6 */
    public static final String f33396q6 = "audio";

    /* renamed from: r */
    public static int f33397r = C1750f.f6813c;

    /* renamed from: r0 */
    public static final int f33398r0 = 112;

    /* renamed from: r1 */
    public static String f33399r1 = "isChat";

    /* renamed from: r2 */
    public static String f33400r2 = "group_position";

    /* renamed from: r3 */
    public static final String f33401r3 = "resolved";

    /* renamed from: r4 */
    public static final String f33402r4 = "broadcast_refresh_splash";

    /* renamed from: r5 */
    public static final String f33403r5 = "user_id";

    /* renamed from: r6 */
    public static final String f33404r6 = "1";

    /* renamed from: s */
    public static int f33405s = 15;

    /* renamed from: s0 */
    public static final int f33406s0 = 113;

    /* renamed from: s1 */
    public static String f33407s1 = "isRelogin";

    /* renamed from: s2 */
    public static String f33408s2 = "child_position";

    /* renamed from: s3 */
    public static final String f33409s3 = "novote";

    /* renamed from: s4 */
    public static final String f33410s4 = "broadcast_finish_chat";

    /* renamed from: s5 */
    public static final String f33411s5 = "is_courier";

    /* renamed from: s6 */
    public static final String f33412s6 = "2";

    /* renamed from: t */
    public static int f33413t = 10;

    /* renamed from: t0 */
    public static final int f33414t0 = 888;

    /* renamed from: t1 */
    public static String f33415t1 = "book_mark_id";

    /* renamed from: t2 */
    public static String f33416t2 = "timePlaced";

    /* renamed from: t3 */
    public static final String f33417t3 = "like";

    /* renamed from: t4 */
    public static final String f33418t4 = "broadcast_finish_rating";

    /* renamed from: t5 */
    public static final String f33419t5 = "device_token";

    /* renamed from: t6 */
    public static final String f33420t6 = "dd MMMM, yyyy";

    /* renamed from: u */
    public static int f33421u = 0;

    /* renamed from: u0 */
    public static final int f33422u0 = 933;

    /* renamed from: u1 */
    public static String f33423u1 = "is_book_mark";

    /* renamed from: u2 */
    public static String f33424u2 = "timeDelivered";

    /* renamed from: u3 */
    public static final String f33425u3 = "dislike";

    /* renamed from: u4 */
    public static final String f33426u4 = "broadcast_changed_rating";

    /* renamed from: u5 */
    public static final String f33427u5 = "language";

    /* renamed from: u6 */
    public static final int f33428u6 = 1;

    /* renamed from: v */
    public static int f33429v = 20;

    /* renamed from: v0 */
    public static final int f33430v0 = 877;

    /* renamed from: v1 */
    public static String f33431v1 = "frg_from";

    /* renamed from: v2 */
    public static String f33432v2 = "value";

    /* renamed from: v3 */
    public static final String f33433v3 = "closed";

    /* renamed from: v4 */
    public static final String f33434v4 = "broadcast_annnouncement";

    /* renamed from: v5 */
    public static final String f33435v5 = "is_push_enable";

    /* renamed from: v6 */
    public static final int f33436v6 = 2;

    /* renamed from: w */
    public static boolean f33437w = false;

    /* renamed from: w0 */
    public static final int f33438w0 = 866;

    /* renamed from: w1 */
    public static String f33439w1 = "complaint_id";

    /* renamed from: w2 */
    public static String f33440w2 = "isGif";

    /* renamed from: w3 */
    public static final String f33441w3 = "Bill accept";

    /* renamed from: w4 */
    public static final String f33442w4 = "broadcast_notificationOnOff";

    /* renamed from: w5 */
    public static final String f33443w5 = "user_auth_token";

    /* renamed from: w6 */
    public static final int f33444w6 = 3;

    /* renamed from: x */
    public static String f33445x = "sa.halalah.halalah";

    /* renamed from: x0 */
    public static final int f33446x0 = 999;

    /* renamed from: x1 */
    public static String f33447x1 = "reason_id";

    /* renamed from: x2 */
    public static String f33448x2 = "player_item";

    /* renamed from: x3 */
    public static final String f33449x3 = "Buyer Canceled";

    /* renamed from: x4 */
    public static final String f33450x4 = "broadcast_background2ForGround";

    /* renamed from: x5 */
    public static final String f33451x5 = "gender";

    /* renamed from: x6 */
    public static final int f33452x6 = 4;

    /* renamed from: y */
    public static boolean f33453y = true;

    /* renamed from: y0 */
    public static final int f33454y0 = 113;

    /* renamed from: y1 */
    public static String f33455y1 = "updated_complaint";

    /* renamed from: y2 */
    public static String f33456y2 = "current_time";

    /* renamed from: y3 */
    public static final String f33457y3 = "start";

    /* renamed from: y4 */
    public static final String f33458y4 = "broadcast_upgradeapp";

    /* renamed from: y5 */
    public static final String f33459y5 = "birthyear";

    /* renamed from: y6 */
    public static ArrayList<NotificationRow> f33460y6 = new ArrayList<>();

    /* renamed from: z */
    public static String f33461z = null;

    /* renamed from: z0 */
    public static final int f33462z0 = 100;

    /* renamed from: z1 */
    public static String f33463z1 = "image_path";

    /* renamed from: z2 */
    public static String f33464z2 = "isPickupFixed";

    /* renamed from: z3 */
    public static final String f33465z3 = "stop";

    /* renamed from: z4 */
    public static final String f33466z4 = "broadcast_finish_chat_screen";

    /* renamed from: z5 */
    public static final String f33467z5 = "user_rating";

    /* renamed from: z6 */
    public static List<MyOrdersActive> f33468z6 = new ArrayList();

    /* renamed from: com.mrsool.utils.i$a */
    /* compiled from: Constant */
    public static class C11645a {

        /* renamed from: a */
        public static String f33469a = "payment_aborted";

        /* renamed from: b */
        public static String f33470b = "processing";

        /* renamed from: c */
        public static String f33471c = "initiated";

        /* renamed from: d */
        public static String f33472d = "paid";

        /* renamed from: e */
        public static String f33473e = "initiate";

        /* renamed from: f */
        public static String f33474f = "payment_processing";

        /* renamed from: g */
        public static String f33475g = "complete";
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append("mrsool");
        sb.append(File.separator);
        sb.append("Temp.png");
        f33285e = sb.toString();
        Boolean valueOf = Boolean.valueOf(false);
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        f33330j = new String[]{"android.permission.CAMERA", str};
        String str2 = "android.permission.ACCESS_FINE_LOCATION";
        String str3 = "android.permission.ACCESS_COARSE_LOCATION";
        String str4 = "android.permission.READ_PHONE_STATE";
        f33339k = new String[]{str2, str3, str4};
        f33348l = new String[]{str2, str3, str4};
        f33357m = new String[]{str};
        f33365n = new String[]{str4};
        f33373o = new String[]{"android.permission.RECORD_AUDIO", str};
        String str5 = "";
        f33461z = str5;
        f33041A = str5;
        f33049B = str5;
        f33057C = str5;
        f33065D = str5;
        f33241Z = str5;
        f33277d0 = str5;
        f33349l0 = valueOf;
        f33194T0 = str5;
        f33202U0 = str5;
        f33210V0 = str5;
        f33218W0 = str5;
        f33287e1 = valueOf;
        f33143M5 = str5;
    }
}
