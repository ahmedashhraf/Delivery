package com.mrsool.shopmenu;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0984g;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1376c;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.p296f.C6845b;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.google.gson.C8782g;
import com.mrsool.C10232R;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.bean.DiscountOptionBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.coupon.AddNewCouponActivity;
import com.mrsool.createorder.C10648p;
import com.mrsool.createorder.C10652q;
import com.mrsool.createorder.C10696t;
import com.mrsool.newBean.UploadImageBean;
import com.mrsool.order.C11061r;
import com.mrsool.p423v.C11725f;
import com.mrsool.payment.C11095j;
import com.mrsool.payment.C11095j.C11112n;
import com.mrsool.payment.C11124o;
import com.mrsool.shop.C11229b;
import com.mrsool.shop.C11229b.C11230a;
import com.mrsool.shop.C11229b.C11231b;
import com.mrsool.shop.C11232c;
import com.mrsool.shop.C11232c.C11234b;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shopmenu.C11383o.C11397m;
import com.mrsool.shopmenu.bean.GetBusinessIdBean;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuErrorAddonsBean;
import com.mrsool.shopmenu.bean.MenuErrorAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuErrorBean;
import com.mrsool.shopmenu.bean.MenuErrorItemBean;
import com.mrsool.shopmenu.bean.MenuErrorVarietiesBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11641f;
import com.mrsool.utils.C11642g;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11664r.C11667c;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11600b;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11692d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p063d.p064b.C2108a;
import p076c.p082c.p083a.C2232l;
import p468g.C13817d0;
import p468g.C13826f0;
import p468g.C13872x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuOrderActivityStep1 extends C11412t implements OnClickListener, C11377m {

    /* renamed from: g1 */
    public static ArrayList<UploadImageBean> f31428g1;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public C10648p f31429A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public C10696t f31430B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public ArrayList<DiscountOptionBean> f31431C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public ArrayList<PaymentListBean> f31432D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public int f31433E0 = -1;

    /* renamed from: F0 */
    public LinearLayout f31434F0;

    /* renamed from: G0 */
    private LinearLayout f31435G0;

    /* renamed from: H0 */
    private LinearLayout f31436H0;

    /* renamed from: I0 */
    private LinearLayout f31437I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public LinearLayout f31438J0;

    /* renamed from: K0 */
    private int f31439K0 = 0;

    /* renamed from: L0 */
    private View f31440L0;

    /* renamed from: M0 */
    String f31441M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public boolean f31442N0 = false;

    /* renamed from: O0 */
    private NestedScrollView f31443O0;

    /* renamed from: P0 */
    private FrameLayout f31444P0;

    /* renamed from: Q0 */
    private ImageView f31445Q0;

    /* renamed from: R0 */
    private ImageView f31446R0;

    /* renamed from: S0 */
    private TextView f31447S0;

    /* renamed from: T0 */
    private TextView f31448T0;

    /* renamed from: U0 */
    private TextView f31449U0;

    /* renamed from: V0 */
    private TextView f31450V0;

    /* renamed from: W0 */
    private TextView f31451W0;

    /* renamed from: X0 */
    private TextView f31452X0;

    /* renamed from: Y0 */
    private TextView f31453Y0;

    /* renamed from: Z0 */
    private View f31454Z0;

    /* renamed from: a0 */
    private C11617f f31455a0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public ArrayList<MenuItemBean> f31456a1 = new ArrayList<>();

    /* renamed from: b0 */
    private String f31457b0;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public C11415u f31458b1;

    /* renamed from: c0 */
    private Activity f31459c0;

    /* renamed from: c1 */
    private C11232c f31460c1;

    /* renamed from: d0 */
    public EditText f31461d0;

    /* renamed from: d1 */
    public String f31462d1;

    /* renamed from: e0 */
    public int f31463e0 = -1;

    /* renamed from: e1 */
    public String f31464e1;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public PaymentListBean f31465f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public C11095j f31466f1;

    /* renamed from: g0 */
    public int f31467g0 = 3;

    /* renamed from: h0 */
    private LinearLayout f31468h0;

    /* renamed from: i0 */
    private LinearLayout f31469i0;

    /* renamed from: j0 */
    private ImageView f31470j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ImageView f31471k0;

    /* renamed from: l0 */
    private TextView f31472l0;

    /* renamed from: m0 */
    private TextView f31473m0;

    /* renamed from: n0 */
    private TextView f31474n0;

    /* renamed from: o0 */
    private TextView f31475o0;

    /* renamed from: p0 */
    private C11669t f31476p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f31477q0 = 0;

    /* renamed from: r0 */
    CheckDiscountBean f31478r0;

    /* renamed from: s0 */
    private WrapContentLinearLayoutManager f31479s0;

    /* renamed from: t0 */
    private C11061r f31480t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public RecyclerView f31481u0;

    /* renamed from: v0 */
    private RelativeLayout f31482v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C10652q f31483w0;

    /* renamed from: x0 */
    private RecyclerView f31484x0;

    /* renamed from: y0 */
    private RecyclerView f31485y0;

    /* renamed from: z0 */
    private RecyclerView f31486z0;

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$a */
    class C11273a implements C11234b {
        C11273a() {
        }

        /* renamed from: a */
        public void mo37975a() {
            MenuOrderActivityStep1.this.mo39111J();
            MenuOrderActivityStep1.this.m50983X();
        }

        /* renamed from: b */
        public void mo37976b() {
            new C11229b(MenuOrderActivityStep1.this, new C11230a(MenuOrderActivityStep1.this.f32097S.f16955b.getAddCardPopupTitle(), MenuOrderActivityStep1.this.f32097S.f16955b.getAddCardPopupDescription(), MenuOrderActivityStep1.this.f32097S.f16955b.getAddCardPopupButtonLabel())).mo39068a((C11231b) new C11313d(this));
        }

        /* renamed from: c */
        public /* synthetic */ void mo39121c() {
            MenuOrderActivityStep1.this.mo39111J();
            MenuOrderActivityStep1.this.m50983X();
        }

        /* renamed from: d */
        public /* synthetic */ void mo39122d() {
            MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
            menuOrderActivityStep1.f31466f1 = new C11095j(menuOrderActivityStep1, null);
            MenuOrderActivityStep1.this.f31466f1.mo38896j();
            MenuOrderActivityStep1.this.f31466f1.mo38884a((C11112n) new C11312c(this));
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$b */
    class C11274b implements C11124o {
        C11274b() {
        }

        /* renamed from: a */
        public void mo37723a() {
        }

        /* renamed from: a */
        public void mo37724a(int i) {
            MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
            menuOrderActivityStep1.f31463e0 = ((PaymentListBean) menuOrderActivityStep1.f31478r0.getPaymentOptions().get(i)).getId().intValue();
            MenuOrderActivityStep1 menuOrderActivityStep12 = MenuOrderActivityStep1.this;
            menuOrderActivityStep12.f31465f0 = (PaymentListBean) menuOrderActivityStep12.f31478r0.getPaymentOptions().get(i);
            MenuOrderActivityStep1.this.m51025k(i);
            MenuOrderActivityStep1.this.mo39114M();
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$c */
    class C11275c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31489a;

        C11275c(Dialog dialog) {
            this.f31489a = dialog;
        }

        public void onClick(View view) {
            this.f31489a.dismiss();
            MenuOrderActivityStep1.this.m51021j(1);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$d */
    class C11276d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31491a;

        C11276d(Dialog dialog) {
            this.f31491a = dialog;
        }

        public void onClick(View view) {
            this.f31491a.dismiss();
            MenuOrderActivityStep1.this.m51021j(0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$e */
    class C11277e implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f31493a;

        C11277e(int i) {
            this.f31493a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            MenuOrderActivityStep1.this.f31477q0 = this.f31493a;
            String str = "1,1";
            String str2 = "pictureRatio";
            String str3 = "PicType";
            if (this.f31493a == 1) {
                Intent intent = new Intent(MenuOrderActivityStep1.this, TakeImages.class);
                intent.putExtra(str3, MenuOrderActivityStep1.this.getString(C10232R.string.lbl_dg_title_camera));
                intent.putExtra(str2, str);
                MenuOrderActivityStep1.this.startActivityForResult(intent, C11644i.f33390q0);
                return;
            }
            Intent intent2 = new Intent(MenuOrderActivityStep1.this, TakeImages.class);
            intent2.putExtra(str3, MenuOrderActivityStep1.this.getString(C10232R.string.lbl_dg_title_gallery));
            intent2.putExtra(str2, str);
            MenuOrderActivityStep1.this.startActivityForResult(intent2, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$f */
    class C11278f implements C11667c {

        /* renamed from: a */
        final /* synthetic */ String f31495a;

        /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$f$a */
        class C11279a implements DialogInterface.OnClickListener {
            C11279a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }

        C11278f(String str) {
            this.f31495a = str;
        }

        /* renamed from: a */
        public void mo38061a(boolean z, boolean z2) {
            if (!MenuOrderActivityStep1.this.isFinishing() && !z2) {
                if (z) {
                    C11641f.m52485a(this.f31495a, 500);
                    MenuOrderActivityStep1.this.f29642a.mo23481I(this.f31495a);
                    MenuOrderActivityStep1.this.f29642a.mo23579b(new File(this.f31495a));
                    MenuOrderActivityStep1.this.m50975P();
                    return;
                }
                C6845b bVar = new C6845b(MenuOrderActivityStep1.this, C10232R.style.AlertDialogTheme);
                bVar.mo758a((CharSequence) "Can not rotate image").mo760a(false).mo776c((CharSequence) "Okay", (DialogInterface.OnClickListener) new C11279a());
                bVar.mo778c();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$g */
    class C11280g implements Callback<GetBusinessIdBean> {
        C11280g() {
        }

        public void onFailure(Call<GetBusinessIdBean> call, Throwable th) {
            C5887x xVar = MenuOrderActivityStep1.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
                menuOrderActivityStep1.f29642a.mo23615f(menuOrderActivityStep1.getString(C10232R.string.msg_error_server_issue), MenuOrderActivityStep1.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetBusinessIdBean> call, Response<GetBusinessIdBean> response) {
            if (MenuOrderActivityStep1.this.f29642a != null) {
                if (!response.isSuccessful()) {
                    MenuErrorBean a = MenuOrderActivityStep1.this.mo39116a(response.errorBody());
                    if (a.getCode() == 400) {
                        ArrayList menuErrorItemList = a.getMenuObjectBean().getMenuErrorItemList();
                        ArrayList arrayListMenuItems = a.getMenuObjectBean().getArrayListMenuItems();
                        for (int i = 0; i < menuErrorItemList.size(); i++) {
                            int itemIndex = ((MenuErrorItemBean) menuErrorItemList.get(i)).getItemIndex();
                            ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).setErrorType(C11411s.NOT_AVAILABLE);
                            ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).setErrorMessage(((MenuErrorItemBean) menuErrorItemList.get(i)).getErrorMessage());
                            ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).setEditVisible(true);
                            ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).setStatus(((MenuErrorItemBean) menuErrorItemList.get(i)).getStatus());
                            ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).setErrorType(((MenuErrorItemBean) menuErrorItemList.get(i)).isRemoveItems() ? C11411s.REMOVE : C11411s.NOT_AVAILABLE);
                            if (((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListVariety().size() > 0) {
                                for (int i2 = 0; i2 < ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListVariety().size(); i2++) {
                                    int a2 = MenuOrderActivityStep1.this.m51012e(((MenuErrorVarietiesBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListVariety().get(i2)).getId(), ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListVariety());
                                    ((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListVariety().get(a2)).setErrorMessage(((MenuErrorVarietiesBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListVariety().get(i2)).getErrorMessage());
                                    ((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListVariety().get(a2)).setStatus(((MenuErrorVarietiesBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListVariety().get(i2)).getStatus());
                                }
                            }
                            if (((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().size() > 0) {
                                for (int i3 = 0; i3 < ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().size(); i3++) {
                                    int b = MenuOrderActivityStep1.this.m50997b(((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getId(), ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons());
                                    ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons().get(b)).setErrorMessage(((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getErrorMessage());
                                    ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons().get(b)).setStatus(((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getStatus());
                                    if (((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getArrayListAddonsOptions().size() > 0) {
                                        for (int i4 = 0; i4 < ((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getArrayListAddonsOptions().size(); i4++) {
                                            int c = MenuOrderActivityStep1.this.m50988a(((MenuErrorAddonsOptionsBean) ((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getArrayListAddonsOptions().get(i4)).getId(), ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons().get(b)).getMenuAddonOptions());
                                            ((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons().get(b)).getMenuAddonOptions().get(c)).setErrorMessage(((MenuErrorAddonsOptionsBean) ((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getArrayListAddonsOptions().get(i4)).getErrorMessage());
                                            ((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(itemIndex)).getArrayListAddons().get(b)).getMenuAddonOptions().get(c)).setStatus(((MenuErrorAddonsOptionsBean) ((MenuErrorAddonsBean) ((MenuErrorItemBean) menuErrorItemList.get(i)).getArrayListAddons().get(i3)).getArrayListAddonsOptions().get(i4)).getStatus());
                                        }
                                    }
                                }
                            }
                        }
                        MenuOrderActivityStep1.this.f31442N0 = true;
                        for (int i5 = 0; i5 < MenuOrderActivityStep1.this.f31456a1.size(); i5++) {
                            if (!((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getErrorType().equals(C11411s.REMOVE)) {
                                MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
                                MenuItemBean menuItemBean = (MenuItemBean) arrayListMenuItems.get(menuOrderActivityStep1.m51009d(((MenuItemBean) menuOrderActivityStep1.f31456a1.get(i5)).getId(), arrayListMenuItems));
                                menuItemBean.setParentPosition(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getParentPosition());
                                menuItemBean.setChildPosition(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getChildPosition());
                                menuItemBean.setUserChildPosition(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getUserChildPosition());
                                menuItemBean.setItemPrice(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getItemPrice());
                                menuItemBean.setSelected(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).isSelected());
                                menuItemBean.setEditVisible(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).isEditVisible());
                                menuItemBean.setErrorMessage(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getErrorMessage());
                                menuItemBean.setErrorType(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getErrorType());
                                menuItemBean.setVarietyDisplay(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getVarietyDisplay());
                                menuItemBean.setOrderCount(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getOrderCount());
                                if (((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().size() > 0) {
                                    for (int i6 = 0; i6 < ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().size(); i6++) {
                                        if (((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().get(i6)).isSelected()) {
                                            MenuOrderActivityStep1 menuOrderActivityStep12 = MenuOrderActivityStep1.this;
                                            int a3 = menuOrderActivityStep12.m51012e(((MenuVarietyBean) ((MenuItemBean) menuOrderActivityStep12.f31456a1.get(i5)).getArrayListVariety().get(i6)).getId(), menuItemBean.getArrayListVariety());
                                            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(a3)).setSelected(true);
                                            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(a3)).setErrorMessage(((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().get(i6)).getErrorMessage());
                                            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(a3)).setStatus(((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().get(i6)).getStatus());
                                            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(a3)).setPrice(((MenuVarietyBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListVariety().get(i6)).getPrice());
                                        }
                                    }
                                }
                                if (((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().size() > 0) {
                                    for (int i7 = 0; i7 < ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().size(); i7++) {
                                        MenuOrderActivityStep1 menuOrderActivityStep13 = MenuOrderActivityStep1.this;
                                        int b2 = menuOrderActivityStep13.m50997b(((MenuAddonsBean) ((MenuItemBean) menuOrderActivityStep13.f31456a1.get(i5)).getArrayListAddons().get(i7)).getId(), menuItemBean.getArrayListAddons());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setSelected(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).isSelected());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setErrorMessage(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getErrorMessage());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setStatus(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getStatus());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setMaxAllowedOption(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMaxAllowedOption());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setMinAllowedOption(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMinAllowedOption());
                                        ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).setPrice(((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getPrice());
                                        if (((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().size() > 0) {
                                            for (int i8 = 0; i8 < ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().size(); i8++) {
                                                if (((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().get(i8)).isSelected()) {
                                                    MenuOrderActivityStep1 menuOrderActivityStep14 = MenuOrderActivityStep1.this;
                                                    int c2 = menuOrderActivityStep14.m50988a(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) menuOrderActivityStep14.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().get(i8)).getId(), ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).getMenuAddonOptions());
                                                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).getMenuAddonOptions().get(c2)).setSelected(true);
                                                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).getMenuAddonOptions().get(c2)).setErrorMessage(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().get(i8)).getErrorMessage());
                                                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).getMenuAddonOptions().get(c2)).setStatus(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().get(i8)).getStatus());
                                                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(b2)).getMenuAddonOptions().get(c2)).setPrice(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getArrayListAddons().get(i7)).getMenuAddonOptions().get(i8)).getPrice());
                                                }
                                            }
                                        }
                                    }
                                }
                                ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getParentPosition())).getArrayListUsersMenuItems().set(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i5)).getUserChildPosition(), menuItemBean);
                                MenuOrderActivityStep1.this.f31456a1.set(i5, menuItemBean);
                            }
                        }
                        MenuOrderActivityStep1.this.m51001b0();
                        MenuOrderActivityStep1.this.m50980U();
                        MenuOrderActivityStep1.this.f31458b1.mo7341e();
                        MenuOrderActivityStep1.this.m50995a0();
                    } else {
                        MenuOrderActivityStep1.this.f29642a.mo23492O();
                        MenuOrderActivityStep1.this.f29642a.mo23487L(a.getMessage());
                    }
                } else if (response.body() == null) {
                    MenuOrderActivityStep1.this.f29642a.mo23492O();
                    MenuOrderActivityStep1 menuOrderActivityStep15 = MenuOrderActivityStep1.this;
                    menuOrderActivityStep15.f29642a.mo23615f(menuOrderActivityStep15.getString(C10232R.string.msg_error_server_issue), MenuOrderActivityStep1.this.getString(C10232R.string.app_name));
                    return;
                } else if (((GetBusinessIdBean) response.body()).getCode() <= 300) {
                    Intent intent = new Intent(MenuOrderActivityStep1.this, MenuOrderActivityStep2.class);
                    intent.putExtras(MenuOrderActivityStep1.this.getIntent().getExtras());
                    MenuOrderActivityStep1 menuOrderActivityStep16 = MenuOrderActivityStep1.this;
                    intent.putExtra(menuOrderActivityStep16.f32101W, menuOrderActivityStep16.m50977R());
                    MenuOrderActivityStep1 menuOrderActivityStep17 = MenuOrderActivityStep1.this;
                    intent.putExtra(menuOrderActivityStep17.f32102X, menuOrderActivityStep17.f31467g0);
                    MenuOrderActivityStep1 menuOrderActivityStep18 = MenuOrderActivityStep1.this;
                    String str = menuOrderActivityStep18.f32103Y;
                    int i9 = menuOrderActivityStep18.f31463e0;
                    intent.putExtra(str, String.valueOf(i9 == -1 ? "" : Integer.valueOf(i9)));
                    intent.putExtra(C11687c.f33747Y0, ((GetBusinessIdBean) response.body()).getBusinessIdBean().getBusinessOrderId());
                    MenuOrderActivityStep1.this.startActivityForResult(intent, 1011);
                } else {
                    MenuOrderActivityStep1.this.f29642a.mo23487L(((GetBusinessIdBean) response.body()).getError());
                }
                MenuOrderActivityStep1.this.f29642a.mo23492O();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$h */
    class C11281h extends C11725f {
        C11281h() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            try {
                Intent intent = new Intent(MenuOrderActivityStep1.this, ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((UploadImageBean) MenuOrderActivityStep1.f31428g1.get(i)).getImagePath());
                intent.putExtra(C11644i.f33360m2, true);
                MenuOrderActivityStep1.this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public void mo38063c(int i) {
            MenuOrderActivityStep1.this.mo39115N();
        }

        /* renamed from: e */
        public void mo38064e(int i) {
            MenuOrderActivityStep1.f31428g1.remove(i);
            MenuOrderActivityStep1.this.f31483w0.mo7341e();
            MenuOrderActivityStep1.this.f31471k0.setVisibility(0);
            if (MenuOrderActivityStep1.f31428g1.size() == 0) {
                MenuOrderActivityStep1.this.f31481u0.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$i */
    class C11282i extends C11725f {

        /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$i$a */
        class C11283a implements C11397m {
            C11283a() {
            }

            /* renamed from: a */
            public void mo39129a() {
                MenuOrderActivityStep1.this.setResult(-1);
                MenuOrderActivityStep1.this.m50980U();
            }
        }

        C11282i() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            MenuOrderActivityStep1.this.m50978S();
        }

        /* renamed from: b */
        public void mo39126b(int i) {
            MenuOrderActivityStep1.this.m50978S();
            if (((float) ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getOrderCount()) < C11644i.f33257a7) {
                ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).setOrderCount(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getOrderCount() + 1);
                MenuOrderActivityStep1.this.f31458b1.mo7337d(i);
                MenuOrderActivityStep1.this.m51001b0();
                MenuOrderActivityStep1.this.m51015e0();
            }
        }

        /* renamed from: d */
        public void mo39127d(int i) {
            MenuOrderActivityStep1.this.m50978S();
            if (((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getOrderCount() <= 1) {
                MenuOrderActivityStep1.this.m51027l(i);
            } else {
                ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).setOrderCount(((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getOrderCount() - 1);
                MenuOrderActivityStep1.this.f31458b1.mo7337d(i);
                MenuOrderActivityStep1.this.m51015e0();
            }
            MenuOrderActivityStep1.this.m51001b0();
        }

        /* renamed from: e */
        public void mo38064e(int i) {
        }

        /* renamed from: h */
        public void mo39128h(int i) {
            MenuOrderActivityStep1.this.m50978S();
            ShopDetailPackageActivity.f31152p0 = ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getParentPosition();
            ShopDetailPackageActivity.f31153q0 = ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getChildPosition();
            Bundle bundle = new Bundle();
            bundle.putInt(C11644i.f33332j1, ((MenuItemBean) MenuOrderActivityStep1.this.f31456a1.get(i)).getUserChildPosition());
            bundle.putBoolean(C11644i.f33043A1, true);
            C11383o oVar = new C11383o(MenuOrderActivityStep1.this, bundle);
            oVar.mo39440f();
            oVar.mo39435a((C11397m) new C11283a());
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$j */
    class C11284j extends C11725f {
        C11284j() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            MenuOrderActivityStep1.this.m50978S();
            int i2 = 0;
            if (MenuOrderActivityStep1.this.f31433E0 != -1) {
                ((DiscountOptionBean) MenuOrderActivityStep1.this.f31431C0.get(MenuOrderActivityStep1.this.f31433E0)).setDefualtValue(false);
            }
            if (MenuOrderActivityStep1.this.f31433E0 == i) {
                MenuOrderActivityStep1.this.f31433E0 = -1;
                MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
                menuOrderActivityStep1.f31467g0 = 3;
                ((DiscountOptionBean) menuOrderActivityStep1.f31431C0.get(i)).setDefualtValue(false);
                MenuOrderActivityStep1.this.f31429A0.mo7341e();
            } else {
                MenuOrderActivityStep1.this.f31433E0 = i;
                ((DiscountOptionBean) MenuOrderActivityStep1.this.f31431C0.get(MenuOrderActivityStep1.this.f31433E0)).setDefualtValue(true);
                MenuOrderActivityStep1 menuOrderActivityStep12 = MenuOrderActivityStep1.this;
                menuOrderActivityStep12.f31467g0 = Integer.parseInt(((DiscountOptionBean) menuOrderActivityStep12.f31431C0.get(MenuOrderActivityStep1.this.f31433E0)).getDiscountType());
                MenuOrderActivityStep1.this.f31429A0.mo7341e();
            }
            LinearLayout f = MenuOrderActivityStep1.this.f31438J0;
            if (MenuOrderActivityStep1.this.f31433E0 != -1) {
                i2 = 8;
            }
            f.setVisibility(i2);
        }

        /* renamed from: c */
        public void mo38063c(int i) {
            if (MenuOrderActivityStep1.this.f29642a.mo23497S()) {
                MenuOrderActivityStep1.this.m50978S();
                MenuOrderActivityStep1.this.startActivityForResult(new Intent(MenuOrderActivityStep1.this, AddNewCouponActivity.class), 1004);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$k */
    class C11285k extends C11725f {
        C11285k() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            MenuOrderActivityStep1 menuOrderActivityStep1 = MenuOrderActivityStep1.this;
            if (menuOrderActivityStep1.f31463e0 != ((PaymentListBean) menuOrderActivityStep1.f31432D0.get(i)).getId().intValue()) {
                MenuOrderActivityStep1 menuOrderActivityStep12 = MenuOrderActivityStep1.this;
                menuOrderActivityStep12.f31463e0 = ((PaymentListBean) menuOrderActivityStep12.f31432D0.get(i)).getId().intValue();
                MenuOrderActivityStep1 menuOrderActivityStep13 = MenuOrderActivityStep1.this;
                menuOrderActivityStep13.f31465f0 = (PaymentListBean) menuOrderActivityStep13.f31432D0.get(i);
                MenuOrderActivityStep1.this.f31430B0.mo38102g(i);
                MenuOrderActivityStep1.this.f31430B0.mo7341e();
                MenuOrderActivityStep1.this.mo39114M();
            }
        }

        /* renamed from: c */
        public void mo38063c(int i) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$l */
    class C11286l implements OnFocusChangeListener {
        C11286l() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                MenuOrderActivityStep1.this.m50978S();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$m */
    class C11287m implements OnEditorActionListener {
        C11287m() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$n */
    class C11288n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31506a;

        C11288n(Dialog dialog) {
            this.f31506a = dialog;
        }

        public void onClick(View view) {
            this.f31506a.dismiss();
            MenuOrderActivityStep1.this.m51001b0();
            MenuOrderActivityStep1.this.m50985Z();
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$o */
    class C11289o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31509a;

        /* renamed from: b */
        final /* synthetic */ int f31510b;

        C11289o(Dialog dialog, int i) {
            this.f31509a = dialog;
            this.f31510b = i;
        }

        public void onClick(View view) {
            this.f31509a.dismiss();
            MenuOrderActivityStep1.this.m50982W();
            MenuOrderActivityStep1.this.m50992a(this.f31510b, true);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep1$p */
    class C11290p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31511a;

        C11290p(Dialog dialog) {
            this.f31511a = dialog;
        }

        public void onClick(View view) {
            this.f31511a.dismiss();
        }
    }

    public MenuOrderActivityStep1() {
        String str = "";
        this.f31457b0 = str;
        this.f31462d1 = str;
        this.f31464e1 = str;
    }

    /* renamed from: O */
    private void m50974O() {
        CheckDiscountBean checkDiscountBean = this.f31478r0;
        if (checkDiscountBean != null && checkDiscountBean.getPaymentOptions() != null) {
            if (this.f31478r0.getPaymentOptions().size() == 0) {
                this.f31468h0.setVisibility(8);
            } else if (this.f31478r0.getPaymentOptions().size() == 1) {
                this.f31463e0 = ((PaymentListBean) this.f31478r0.getPaymentOptions().get(0)).getId().intValue();
                this.f31465f0 = (PaymentListBean) this.f31478r0.getPaymentOptions().get(0);
                this.f31468h0.setEnabled(false);
                m51025k(0);
                this.f31468h0.setVisibility(0);
                mo39114M();
            } else if (this.f31478r0.getPaymentOptions().size() > 0) {
                this.f31468h0.setVisibility(0);
                this.f31463e0 = ((PaymentListBean) this.f31478r0.getPaymentOptions().get(0)).getId().intValue();
                this.f31465f0 = (PaymentListBean) this.f31478r0.getPaymentOptions().get(0);
                m51025k(0);
                mo39114M();
            }
            this.f31432D0.clear();
            this.f31432D0.addAll(this.f31478r0.getPaymentOptions());
            this.f31430B0.mo38102g(m50976Q());
            this.f31430B0.mo7341e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m50975P() {
        this.f31481u0.setVisibility(0);
        UploadImageBean uploadImageBean = new UploadImageBean();
        uploadImageBean.setImageBitmap(this.f29642a.mo23484K());
        uploadImageBean.setImageFile(this.f29642a.mo23486L());
        uploadImageBean.setImagePath(this.f29642a.mo23488M());
        f31428g1.add(uploadImageBean);
        if (((float) f31428g1.size()) >= C11644i.f33248Z6) {
            this.f31471k0.setVisibility(8);
        }
        this.f31483w0.mo7341e();
        this.f31481u0.scrollToPosition(f31428g1.size());
    }

    /* renamed from: Q */
    private int m50976Q() {
        if (this.f32097S.f16955b.getShouldCheckIfHasValidCard()) {
            for (int i = 0; i < this.f31432D0.size(); i++) {
                if (((PaymentListBean) this.f31432D0.get(i)).getCode().equalsIgnoreCase("credit_card")) {
                    this.f31463e0 = ((PaymentListBean) this.f31432D0.get(i)).getId().intValue();
                    this.f31465f0 = (PaymentListBean) this.f31432D0.get(i);
                    return i;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public String m50977R() {
        String str = "";
        int i = 0;
        String str2 = str;
        while (true) {
            String str3 = "\n";
            if (i < this.f31456a1.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(((MenuItemBean) this.f31456a1.get(i)).getOrderCount());
                sb.append(" - ");
                sb.append(((MenuItemBean) this.f31456a1.get(i)).getName());
                sb.append(str3);
                str2 = sb.toString();
                if (!((MenuItemBean) this.f31456a1.get(i)).getVarietyDisplay().equals(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("(");
                    sb2.append(((MenuItemBean) this.f31456a1.get(i)).getVarietyDisplay());
                    sb2.append(")\n");
                    str2 = sb2.toString();
                }
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(this.f31461d0.getText().toString().trim());
                return sb3.toString().trim();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m50978S() {
        if (this.f31461d0.getText().toString().trim().equals("")) {
            this.f31444P0.setVisibility(0);
            this.f31436H0.setVisibility(8);
        }
    }

    /* renamed from: T */
    private void m50979T() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f31462d1 = intent.getStringExtra(C11687c.f33739W0);
            this.f31464e1 = intent.getStringExtra(C11687c.f33743X0);
            this.f31441M0 = intent.getStringExtra(C11644i.f33431v1);
            if (this.f31441M0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                this.f31459c0 = (Activity) ShopDetailActivity.f31116l0;
                this.f32098T = false;
            } else if (this.f31441M0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                this.f32098T = true;
                this.f31459c0 = (Activity) ShopDetailPackageActivity.f31149m0;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m50980U() {
        String str;
        String str2;
        String str3;
        this.f31456a1.clear();
        for (int i = 0; i < ShopDetailPackageActivity.f31150n0.size(); i++) {
            for (int i2 = 0; i2 < ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListUsersMenuItems().size(); i2++) {
                if (((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListUsersMenuItems().get(i2)).getOrderCount() > 0) {
                    this.f31456a1.add(((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListUsersMenuItems().get(i2));
                    ArrayList<MenuItemBean> arrayList = this.f31456a1;
                    ((MenuItemBean) arrayList.get(arrayList.size() - 1)).setUserChildPosition(i2);
                    int i3 = 0;
                    boolean z = false;
                    while (true) {
                        ArrayList<MenuItemBean> arrayList2 = this.f31456a1;
                        str = "";
                        str2 = ", ";
                        if (i3 >= ((MenuItemBean) arrayList2.get(arrayList2.size() - 1)).getArrayListVariety().size()) {
                            str3 = str;
                            break;
                        }
                        ArrayList<MenuItemBean> arrayList3 = this.f31456a1;
                        if (((MenuVarietyBean) ((MenuItemBean) arrayList3.get(arrayList3.size() - 1)).getArrayListVariety().get(i3)).getSelected()) {
                            StringBuilder sb = new StringBuilder();
                            ArrayList<MenuItemBean> arrayList4 = this.f31456a1;
                            sb.append(((MenuVarietyBean) ((MenuItemBean) arrayList4.get(arrayList4.size() - 1)).getArrayListVariety().get(i3)).getName());
                            sb.append(str2);
                            String sb2 = sb.toString();
                            ArrayList<MenuItemBean> arrayList5 = this.f31456a1;
                            MenuItemBean menuItemBean = (MenuItemBean) arrayList5.get(arrayList5.size() - 1);
                            ArrayList<MenuItemBean> arrayList6 = this.f31456a1;
                            menuItemBean.setItemPrice(((MenuVarietyBean) ((MenuItemBean) arrayList6.get(arrayList6.size() - 1)).getArrayListVariety().get(i3)).getPrice());
                            str3 = sb2;
                            z = true;
                            break;
                        }
                        i3++;
                        z = true;
                    }
                    if (!z) {
                        ArrayList<MenuItemBean> arrayList7 = this.f31456a1;
                        MenuItemBean menuItemBean2 = (MenuItemBean) arrayList7.get(arrayList7.size() - 1);
                        ArrayList<MenuItemBean> arrayList8 = this.f31456a1;
                        menuItemBean2.setItemPrice(Double.parseDouble(((MenuItemBean) arrayList8.get(arrayList8.size() - 1)).getPrice()));
                    }
                    String str4 = str3;
                    int i4 = 0;
                    while (true) {
                        ArrayList<MenuItemBean> arrayList9 = this.f31456a1;
                        if (i4 >= ((MenuItemBean) arrayList9.get(arrayList9.size() - 1)).getArrayListAddons().size()) {
                            break;
                        }
                        ArrayList<MenuItemBean> arrayList10 = this.f31456a1;
                        if (((MenuAddonsBean) ((MenuItemBean) arrayList10.get(arrayList10.size() - 1)).getArrayListAddons().get(i4)).isSelected()) {
                            ArrayList<MenuItemBean> arrayList11 = this.f31456a1;
                            if (((MenuAddonsBean) ((MenuItemBean) arrayList11.get(arrayList11.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().size() <= 0) {
                                ArrayList<MenuItemBean> arrayList12 = this.f31456a1;
                                MenuItemBean menuItemBean3 = (MenuItemBean) arrayList12.get(arrayList12.size() - 1);
                                ArrayList<MenuItemBean> arrayList13 = this.f31456a1;
                                double itemPrice = ((MenuItemBean) arrayList13.get(arrayList13.size() - 1)).getItemPrice();
                                ArrayList<MenuItemBean> arrayList14 = this.f31456a1;
                                menuItemBean3.setItemPrice(itemPrice + ((MenuAddonsBean) ((MenuItemBean) arrayList14.get(arrayList14.size() - 1)).getArrayListAddons().get(i4)).getPrice().doubleValue());
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str4);
                                ArrayList<MenuItemBean> arrayList15 = this.f31456a1;
                                sb3.append(((MenuAddonsBean) ((MenuItemBean) arrayList15.get(arrayList15.size() - 1)).getArrayListAddons().get(i4)).getName());
                                sb3.append(str2);
                                str4 = sb3.toString();
                            }
                        }
                        ArrayList<MenuItemBean> arrayList16 = this.f31456a1;
                        if (((MenuAddonsBean) ((MenuItemBean) arrayList16.get(arrayList16.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().size() > 0) {
                            String str5 = str4;
                            int i5 = 0;
                            while (true) {
                                ArrayList<MenuItemBean> arrayList17 = this.f31456a1;
                                if (i5 >= ((MenuAddonsBean) ((MenuItemBean) arrayList17.get(arrayList17.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().size()) {
                                    break;
                                }
                                ArrayList<MenuItemBean> arrayList18 = this.f31456a1;
                                if (((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) arrayList18.get(arrayList18.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().get(i5)).isSelected()) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str5);
                                    ArrayList<MenuItemBean> arrayList19 = this.f31456a1;
                                    sb4.append(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) arrayList19.get(arrayList19.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().get(i5)).getName());
                                    sb4.append(str2);
                                    str5 = sb4.toString();
                                    ArrayList<MenuItemBean> arrayList20 = this.f31456a1;
                                    MenuItemBean menuItemBean4 = (MenuItemBean) arrayList20.get(arrayList20.size() - 1);
                                    ArrayList<MenuItemBean> arrayList21 = this.f31456a1;
                                    double itemPrice2 = ((MenuItemBean) arrayList21.get(arrayList21.size() - 1)).getItemPrice();
                                    ArrayList<MenuItemBean> arrayList22 = this.f31456a1;
                                    menuItemBean4.setItemPrice(itemPrice2 + ((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) arrayList22.get(arrayList22.size() - 1)).getArrayListAddons().get(i4)).getMenuAddonOptions().get(i5)).getPrice().doubleValue());
                                }
                                i5++;
                            }
                            str4 = str5;
                        }
                        i4++;
                    }
                    if (!str4.equals(str) && str4.length() > 2) {
                        str4 = str4.substring(0, str4.length() - 2);
                    }
                    ArrayList<MenuItemBean> arrayList23 = this.f31456a1;
                    ((MenuItemBean) arrayList23.get(arrayList23.size() - 1)).setVarietyDisplay(str4);
                }
            }
        }
        if (this.f31456a1.size() > 0) {
            this.f31449U0.setText(((MenuItemBean) this.f31456a1.get(0)).getCurrency());
            this.f31451W0.setText(((MenuItemBean) this.f31456a1.get(0)).getCurrency());
            this.f31453Y0.setText(((MenuItemBean) this.f31456a1.get(0)).getCurrency());
        }
        m51015e0();
        this.f31458b1.mo7341e();
    }

    /* renamed from: V */
    private void m50981V() {
        mo39493a((C11377m) this);
        m50979T();
        this.f31442N0 = false;
        this.f31459c0 = (Activity) ShopDetailPackageActivity.f31149m0;
        this.f31455a0 = new C11617f(this);
        this.f31457b0 = this.f31455a0.mo39860a();
        this.f31460c1 = new C11232c(this.f29642a);
        try {
            if (C11644i.f33437w) {
                this.f31455a0.mo39867b(this.f32097S.f16955b.getShop().getVName(), this.f31457b0, String.valueOf(this.f32097S.f16955b.getShop().getDistance_courier_shop()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f31472l0 = (TextView) findViewById(C10232R.C10236id.tvTitle);
        if (this.f32098T) {
            this.f31472l0.setText(this.f32097S.f16955b.getShop().getvTitle());
        } else {
            this.f31472l0.setText(this.f32097S.f16955b.getShop().getVName());
        }
        this.f31476p0 = new C11669t(this);
        f31428g1 = new ArrayList<>();
        this.f31431C0 = new ArrayList<>();
        this.f31432D0 = new ArrayList<>();
        this.f31443O0 = (NestedScrollView) findViewById(C10232R.C10236id.scrollview);
        this.f31445Q0 = (ImageView) findViewById(C10232R.C10236id.bgContinue);
        this.f31447S0 = (TextView) findViewById(C10232R.C10236id.btnContinue);
        this.f31445Q0.setOnClickListener(this);
        this.f31446R0 = (ImageView) findViewById(C10232R.C10236id.ivBack);
        this.f31446R0.setOnClickListener(this);
        this.f31440L0 = findViewById(C10232R.C10236id.llForceDigitalPayment);
        this.f31475o0 = (TextView) findViewById(C10232R.C10236id.tvForceDigitPayTitle);
        this.f32097S = (AppSingleton) getApplicationContext();
        if (this.f32097S.f16955b.getShouldCheckIfHasValidCard()) {
            this.f31440L0.setVisibility(0);
            this.f31475o0.setText(this.f32097S.f16955b.getCashNotAllowedLabel());
        }
        this.f31482v0 = (RelativeLayout) findViewById(C10232R.C10236id.rlCouponView);
        this.f31481u0 = (RecyclerView) findViewById(C10232R.C10236id.rvImages);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f31481u0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f31481u0.setItemAnimator(this.f29642a.mo23672x());
        this.f31483w0 = new C10652q(this, f31428g1, new C11281h());
        this.f31481u0.setAdapter(this.f31483w0);
        this.f31435G0 = (LinearLayout) findViewById(C10232R.C10236id.llItems);
        this.f31436H0 = (LinearLayout) findViewById(C10232R.C10236id.llDescription);
        this.f31434F0 = (LinearLayout) findViewById(C10232R.C10236id.llItemsMain);
        this.f31437I0 = (LinearLayout) findViewById(C10232R.C10236id.llAddCoupon);
        this.f31437I0.setOnClickListener(this);
        this.f31438J0 = (LinearLayout) findViewById(C10232R.C10236id.llCouponWarning);
        this.f31448T0 = (TextView) findViewById(C10232R.C10236id.tvAmount);
        this.f31449U0 = (TextView) findViewById(C10232R.C10236id.tvCurrency);
        this.f31450V0 = (TextView) findViewById(C10232R.C10236id.tvTaxAmount);
        this.f31451W0 = (TextView) findViewById(C10232R.C10236id.tvTaxCurrency);
        this.f31452X0 = (TextView) findViewById(C10232R.C10236id.tvTotalAmount);
        this.f31453Y0 = (TextView) findViewById(C10232R.C10236id.tvTotalCurrency);
        this.f31454Z0 = findViewById(C10232R.C10236id.buttonLayout);
        this.f31485y0 = (RecyclerView) findViewById(C10232R.C10236id.rvOrders);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager2 = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager2.mo7000l(1);
        this.f31485y0.setLayoutManager(wrapContentLinearLayoutManager2);
        this.f31485y0.setItemAnimator(this.f29642a.mo23672x());
        this.f31458b1 = new C11415u(this, this.f31456a1, new C11282i());
        this.f31485y0.setAdapter(this.f31458b1);
        this.f31484x0 = (RecyclerView) findViewById(C10232R.C10236id.rvCoupon);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager3 = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager3.mo7000l(0);
        this.f31484x0.setLayoutManager(wrapContentLinearLayoutManager3);
        this.f31484x0.setItemAnimator(this.f29642a.mo23672x());
        this.f31429A0 = new C10648p(this, this.f31431C0, new C11284j());
        this.f31484x0.setAdapter(this.f31429A0);
        this.f31444P0 = (FrameLayout) findViewById(C10232R.C10236id.mrlAddComments);
        this.f31444P0.setOnClickListener(this);
        this.f31474n0 = (TextView) findViewById(C10232R.C10236id.tvOrderInstructions);
        this.f31473m0 = (TextView) findViewById(C10232R.C10236id.txtPaymentMode);
        this.f31468h0 = (LinearLayout) findViewById(C10232R.C10236id.layPaymentMode);
        this.f31470j0 = (ImageView) findViewById(C10232R.C10236id.ivSelectedPaymentMode);
        this.f31469i0 = (LinearLayout) findViewById(C10232R.C10236id.llChangePayment);
        this.f31469i0.setOnClickListener(this);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager4 = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager4.mo7000l(0);
        this.f31486z0 = (RecyclerView) findViewById(C10232R.C10236id.rvPaymentType);
        this.f31486z0.setLayoutManager(wrapContentLinearLayoutManager4);
        this.f31486z0.setItemAnimator(this.f29642a.mo23672x());
        this.f31430B0 = new C10696t(this, this.f31432D0, new C11285k());
        this.f31486z0.setAdapter(this.f31430B0);
        this.f31471k0 = (ImageView) findViewById(C10232R.C10236id.ivCamera);
        this.f31461d0 = (EditText) findViewById(C10232R.C10236id.edtOrderDesc);
        this.f31461d0.setHint(this.f32097S.f16955b.getShop().getOrder_description_text());
        this.f31461d0.setOnFocusChangeListener(new C11286l());
        this.f31471k0.setOnClickListener(this);
        this.f31461d0.setOnEditorActionListener(new C11287m());
        if (!this.f32098T || !this.f32097S.f16955b.getShop().isShowItemList()) {
            this.f31444P0.setVisibility(8);
            this.f31436H0.setVisibility(0);
        } else {
            this.f31444P0.setVisibility(0);
            this.f31436H0.setVisibility(8);
        }
        m50984Y();
        m51006c0();
        if (this.f29642a.mo23502X()) {
            mo39494a(true, true, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0, false, false);
        }
        m50980U();
        m50978S();
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a((ImageView) findViewById(C10232R.C10236id.ivChangeArrow));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m50982W() {
        C11598a.m52263f().mo39829b(this.f32097S.f16954a.getShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m50983X() {
        C11598a f = C11598a.m52263f();
        String R = m50977R();
        boolean z = true;
        boolean z2 = f31428g1.size() > 0;
        if (this.f31433E0 == -1) {
            z = false;
        }
        f.mo39823a(R, z2, z, C11601c.Cash.mo39844d(), this.f32097S.f16955b.getShop().getVShopId());
    }

    /* renamed from: Y */
    private void m50984Y() {
        C11598a.m52263f().mo39822a(C11600b.MenuOrder.mo39843d(), this.f32097S.f16955b.getShop().isHasDiscount(), this.f29642a.mo23639m(this.f32097S.f16955b.getShop().getDiscountShortLabel()), this.f32097S.f16955b.getShop().getVShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m50985Z() {
        if (this.f31456a1.size() == 0) {
            m51001b0();
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m50995a0() {
        String str;
        String str2;
        String str3 = "";
        String str4 = str3;
        String str5 = str4;
        for (int i = 0; i < this.f31456a1.size(); i++) {
            if (((MenuItemBean) this.f31456a1.get(i)).getErrorType().equals(C11411s.REMOVE)) {
                if (str5.equals(str3)) {
                    str2 = ((MenuItemBean) this.f31456a1.get(i)).getName();
                    str = String.format(getString(C10232R.string.lbl_item_removed), new Object[]{str2});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(", ");
                    sb.append(((MenuItemBean) this.f31456a1.get(i)).getName());
                    str2 = sb.toString();
                    str = String.format(getString(C10232R.string.lbl_item_removed_multiple), new Object[]{str2});
                }
                ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(((MenuItemBean) this.f31456a1.get(i)).getParentPosition())).getArrayListUsersMenuItems().remove(((MenuItemBean) this.f31456a1.get(i)).getUserChildPosition());
                String str6 = str;
                str5 = str2;
                str4 = str6;
            }
        }
        m50980U();
        if (!str4.equals(str3)) {
            m51026k(str4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m51001b0() {
        Intent intent = new Intent();
        intent.putExtra(C11644i.f33293e7, this.f31442N0);
        setResult(-1, intent);
    }

    /* renamed from: c0 */
    private void m51006c0() {
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a(this.f31446R0);
        }
    }

    /* renamed from: d0 */
    private void m51011d0() {
        C11692d dVar = new C11692d(this, this.f31478r0.getPaymentOptions(), this.f31463e0);
        dVar.mo40193c();
        dVar.mo40190a((C11124o) new C11274b());
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m51015e0() {
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        for (int i2 = 0; i2 < this.f31456a1.size(); i2++) {
            double itemPrice = ((MenuItemBean) this.f31456a1.get(i2)).getItemPrice();
            double orderCount = (double) ((MenuItemBean) this.f31456a1.get(i2)).getOrderCount();
            Double.isNaN(orderCount);
            d2 += itemPrice * orderCount;
            if (((MenuItemBean) this.f31456a1.get(i2)).shouldHidePriceZero()) {
                z = true;
            }
        }
        View view = this.f31454Z0;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
        double d3 = ShopDetailPackageActivity.f31156t0;
        if (d3 > 0.0d) {
            d = d2 - (d2 / d3);
        }
        this.f31448T0.setText(C5887x.m25809b(Double.valueOf(d2 - d)).trim());
        this.f31450V0.setText(C5887x.m25809b(Double.valueOf(d)));
        this.f31452X0.setText(C5887x.m25809b(Double.valueOf(d2)).trim());
    }

    /* renamed from: f0 */
    private void m51017f0() {
        if (this.f32097S.f16955b.getShouldCheckIfHasValidCard()) {
            this.f31460c1.mo39069a(this, new C11273a());
            return;
        }
        mo39111J();
        m50983X();
    }

    /* renamed from: J */
    public void mo39111J() {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        this.f29642a.mo23665u0();
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f29642a.mo23645o().toUpperCase());
        C11687c.m52644a().getBusinessID(C13817d0.create(C13872x.m59361b("application/json; charset=utf-8"), mo39113L().toString()), hashMap).enqueue(new C11280g());
    }

    /* renamed from: K */
    public JSONObject mo39112K() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11687c.f33739W0, this.f31462d1);
            jSONObject.put(C11687c.f33743X0, this.f31464e1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: L */
    public JSONObject mo39113L() {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        while (i < this.f31456a1.size()) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C5854b.f16894A, ((MenuItemBean) this.f31456a1.get(i)).getOrderCount());
                jSONObject3.put("menu_item_id", Integer.parseInt(((MenuItemBean) this.f31456a1.get(i)).getId()));
                int i2 = 0;
                while (true) {
                    if (i2 >= ((MenuItemBean) this.f31456a1.get(i)).getArrayListVariety().size()) {
                        break;
                    } else if (((MenuVarietyBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListVariety().get(i2)).getSelected()) {
                        jSONObject3.put("menu_variety_id", Integer.parseInt(((MenuVarietyBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListVariety().get(i2)).getId()));
                        break;
                    } else {
                        i2++;
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                int i3 = 0;
                while (true) {
                    str = "";
                    if (i3 >= ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().size()) {
                        break;
                    }
                    if (((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).isSelected() || ((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getMenuAddonOptions().size() > 0) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("id", Integer.parseInt(((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getId()));
                        JSONArray jSONArray = new JSONArray();
                        for (int i4 = 0; i4 < ((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getMenuAddonOptions().size(); i4++) {
                            if (((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getMenuAddonOptions().get(i4)).isSelected()) {
                                jSONArray.put(((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getMenuAddonOptions().get(i4)).getId());
                            }
                        }
                        jSONObject5.put("addon_option_ids", jSONArray);
                        if (((MenuAddonsBean) ((MenuItemBean) this.f31456a1.get(i)).getArrayListAddons().get(i3)).getMenuAddonOptions().size() <= 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(i3);
                            jSONObject4.putOpt(sb.toString(), jSONObject5);
                        } else if (jSONArray.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(i3);
                            jSONObject4.putOpt(sb2.toString(), jSONObject5);
                        }
                    }
                    i3++;
                }
                jSONObject3.putOpt("item_addons", jSONObject4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i);
                jSONObject2.putOpt(sb3.toString(), jSONObject3);
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.putOpt(C11687c.f33731U0, jSONObject2);
        jSONObject.putOpt(C11687c.f33735V0, mo39112K());
        jSONObject.putOpt("grand_total", Integer.valueOf(105));
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Menu getBusinessOrder() ");
        sb4.append(jSONObject.toString());
        sb4.toString();
        return jSONObject;
    }

    /* renamed from: M */
    public void mo39114M() {
        try {
            boolean isCash = this.f31465f0.isCash();
            if (!this.f32097S.f16955b.getShouldCheckIfHasValidCard() || !isCash) {
                this.f31447S0.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
                this.f31447S0.setEnabled(true);
                this.f31445Q0.setEnabled(true);
                return;
            }
            this.f31447S0.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.gray_3));
            this.f31447S0.setEnabled(false);
            this.f31445Q0.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: N */
    public void mo39115N() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_attach_photo);
        dialog.setCancelable(true);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvPhotos);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvCamera)).setOnClickListener(new C11275c(dialog));
        textView.setOnClickListener(new C11276d(dialog));
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: a */
    public void mo39117a(Response<CheckDiscountBean> response) {
    }

    /* renamed from: a */
    public void mo39118a(Response<CheckDiscountBean> response, String str, int i) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "image_path";
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            try {
                m50978S();
                if (intent.getExtras().getString(str) != null) {
                    this.f29642a.mo23481I(intent.getExtras().getString(str));
                    this.f29642a.mo23579b(new File(this.f29642a.mo23488M()));
                    this.f29642a.mo23605d(this.f29642a.mo23511a(this.f29642a.mo23486L()));
                    if (this.f29642a.mo23484K().getWidth() != 0) {
                        if (this.f29642a.mo23484K().getHeight() != 0) {
                            if (this.f29642a.mo23484K().getWidth() > 720) {
                                this.f29642a.mo23589c(720);
                            } else {
                                this.f29642a.mo23589c(this.f29642a.mo23484K().getWidth());
                            }
                            m51023j(this.f29642a.mo23488M());
                        }
                    }
                    this.f29642a.mo23491N(getString(C10232R.string.error_upload_image));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 1004 && i2 == -1) {
            mo39494a(true, true, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0, true, false);
        } else if (i == 1011 && i2 == -1) {
            if (this.f31459c0 != null) {
                this.f31459c0.finish();
            }
            setResult(-1);
            finish();
        } else if (i == 100 && i2 == -1) {
            m51001b0();
            m50980U();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f31442N0) {
            ShopDetailPackageActivity.f31151o0 = this.f31456a1;
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.bgContinue /*2131361929*/:
                m50978S();
                m51017f0();
                return;
            case C10232R.C10236id.ivBack /*2131362731*/:
                onBackPressed();
                return;
            case C10232R.C10236id.ivCamera /*2131362739*/:
                mo39115N();
                return;
            case C10232R.C10236id.llAddCoupon /*2131362956*/:
                if (this.f29642a.mo23497S()) {
                    m50978S();
                    startActivityForResult(new Intent(this, AddNewCouponActivity.class), 1004);
                    return;
                }
                return;
            case C10232R.C10236id.llChangePayment /*2131362985*/:
                m50978S();
                m51011d0();
                return;
            case C10232R.C10236id.mrlAddComments /*2131363247*/:
                this.f31436H0.setPadding(0, (int) getResources().getDimension(C10232R.dimen.dp_4), 0, 0);
                this.f31461d0.setHint(getResources().getString(C10232R.string.lbl_add_comments));
                this.f31474n0.setVisibility(8);
                this.f31436H0.setVisibility(0);
                this.f31444P0.setVisibility(8);
                this.f31461d0.requestFocus();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_menu_create_order_1);
        m50981V();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f31476p0;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51021j(int i) {
        this.f31476p0.mo40036a(C11644i.f33330j, (C11673d) new C11277e(i));
    }

    /* renamed from: k */
    private void m51026k(String str) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_removed_cart_item);
        dialog.setCancelable(false);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvOk);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMessage)).setText(str);
        textView.setOnClickListener(new C11288n(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m51027l(int i) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvDelete)).setOnClickListener(new C11289o(dialog, i));
        textView.setOnClickListener(new C11290p(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m51012e(String str, ArrayList<MenuVarietyBean> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((MenuVarietyBean) arrayList.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: j */
    private void m51023j(String str) {
        if (this.f31477q0 == 1) {
            C11642g gVar = new C11642g(this, new C11278f(str), "", true);
            gVar.mo39990a(this.f29642a.mo23488M());
            gVar.execute(new String[0]);
            return;
        }
        m50975P();
    }

    /* renamed from: b */
    private void m50999b(int i, int i2) {
        MenuItemBean menuItemBean = (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2);
        menuItemBean.setSelected(false);
        for (int i3 = 0; i3 < menuItemBean.getArrayListVariety().size(); i3++) {
            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(i3)).setSelected(false);
        }
        for (int i4 = 0; i4 < menuItemBean.getArrayListAddons().size(); i4++) {
            for (int i5 = 0; i5 < ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i4)).getMenuAddonOptions().size(); i5++) {
                ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i4)).getMenuAddonOptions().get(i5)).setSelected(false);
            }
        }
    }

    /* renamed from: c */
    private int m51004c(String str, ArrayList<MenuItemBean> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((MenuItemBean) arrayList.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m51009d(String str, ArrayList<MenuItemBean> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((MenuItemBean) arrayList.get(i)).getId().equalsIgnoreCase(str)) {
                return i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50992a(int i, boolean z) {
        m51001b0();
        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(((MenuItemBean) this.f31456a1.get(i)).getParentPosition())).getArrayListUsersMenuItems().remove(((MenuItemBean) this.f31456a1.get(i)).getUserChildPosition());
        this.f31456a1.remove(i);
        this.f31458b1.mo7341e();
        m50980U();
        if (z) {
            m50985Z();
        }
    }

    /* renamed from: b */
    public void mo39119b(Response<CheckDiscountBean> response) {
        this.f31478r0 = (CheckDiscountBean) response.body();
        this.f31431C0.clear();
        for (int i = 0; i < ((CheckDiscountBean) response.body()).getDiscountOptions().size(); i++) {
            if (!((DiscountOptionBean) ((CheckDiscountBean) response.body()).getDiscountOptions().get(i)).getDiscountType().equals(C2108a.f8151T4)) {
                this.f31431C0.add(((CheckDiscountBean) response.body()).getDiscountOptions().get(i));
                if (((DiscountOptionBean) ((CheckDiscountBean) response.body()).getDiscountOptions().get(i)).isDefualtValue()) {
                    this.f31467g0 = Integer.parseInt(((DiscountOptionBean) this.f31431C0.get(i)).getDiscountType());
                    this.f31433E0 = this.f31431C0.size() - 1;
                }
            }
        }
        this.f31438J0.setVisibility((this.f31431C0.size() <= 0 || this.f31433E0 != -1) ? 8 : 0);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (this.f31431C0.size() == 0) {
            layoutParams.gravity = C0984g.f4395c;
        } else {
            layoutParams.gravity = C0984g.f4394b;
        }
        this.f31484x0.setLayoutParams(layoutParams);
        this.f31429A0.mo7341e();
        m50974O();
        String a = this.f29642a.mo23528a(response.body());
        if (!TextUtils.isEmpty(a)) {
            this.f29642a.mo23551a(new ServiceManualDataBean("", a));
        }
        if (((CheckDiscountBean) response.body()).isShopDiscount()) {
            this.f31484x0.setVisibility(8);
        } else {
            this.f31484x0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m51025k(int i) {
        C2232l.m11636a((C1376c) this).mo9515a(((PaymentListBean) this.f31478r0.getPaymentOptions().get(i)).getPaymentIconUrl()).m11498d(87, 50).mo9424a(this.f31470j0);
        this.f31473m0.setText(((PaymentListBean) this.f31478r0.getPaymentOptions().get(i)).getName());
    }

    /* renamed from: a */
    public MenuErrorBean mo39116a(C13826f0 f0Var) {
        try {
            return (MenuErrorBean) new C8782g().mo32336a().mo32314a(f0Var.string(), MenuErrorBean.class);
        } catch (IOException unused) {
            return new MenuErrorBean();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m50988a(String str, ArrayList<MenuAddonsOptionsBean> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((MenuAddonsOptionsBean) arrayList.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m50997b(String str, ArrayList<MenuAddonsBean> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((MenuAddonsBean) arrayList.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return 0;
    }
}
