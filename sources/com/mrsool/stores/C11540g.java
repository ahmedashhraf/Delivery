package com.mrsool.stores;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.ConnectionResult;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.MostActiveShops;
import com.mrsool.bean.MrsoolService;
import com.mrsool.bean.Shop;
import com.mrsool.newBean.GetStores;
import com.mrsool.newBean.StoreCategoryBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p420b0.C11572a;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.stores.g */
/* compiled from: StoresFragmentNew */
public class C11540g extends Fragment implements OnClickListener, C11572a {

    /* renamed from: N */
    private C11537f f32652N;

    /* renamed from: O */
    private C11528c f32653O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C11524a f32654P;

    /* renamed from: Q */
    private RecyclerView f32655Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public RecyclerView f32656R;

    /* renamed from: S */
    private RecyclerView f32657S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ProgressBar f32658T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public LinearLayout f32659U;

    /* renamed from: V */
    private LinearLayout f32660V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f32661W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public MostActiveShops f32662X;

    /* renamed from: Y */
    private FrameLayout f32663Y;

    /* renamed from: Z */
    public ArrayList<FourSquareMainBean> f32664Z = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f32665a;

    /* renamed from: a0 */
    public ArrayList<MrsoolService> f32666a0 = new ArrayList<>();

    /* renamed from: b */
    private View f32667b;

    /* renamed from: b0 */
    public ArrayList<StoreCategoryBean> f32668b0 = new ArrayList<>();

    /* renamed from: c0 */
    int f32669c0 = 0;

    /* renamed from: d0 */
    WrapContentLinearLayoutManager f32670d0;

    /* renamed from: e0 */
    private C11614c f32671e0;

    /* renamed from: f0 */
    private BroadcastReceiver f32672f0 = new C11544d();

    /* renamed from: com.mrsool.stores.g$a */
    /* compiled from: StoresFragmentNew */
    class C11541a extends C11725f {
        C11541a() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            String str;
            if (C11540g.this.isAdded() && C11540g.this.f32665a.mo23502X() && C11540g.this.f32665a.mo23500V() && C11540g.this.f32665a.mo23497S() && C11540g.this.f32664Z.size() > 0 && i >= 0) {
                String string = C11540g.this.getResources().getString(C10232R.string.ct_event_param_value_home_screen);
                StringBuilder sb = new StringBuilder();
                sb.append("Listed - ");
                sb.append(C11540g.this.m52038z());
                CTEventBean cTEventBean = new CTEventBean(string, sb.toString(), String.valueOf(i + 1));
                FourSquareMainBean fourSquareMainBean = (FourSquareMainBean) C11540g.this.f32664Z.get(i);
                if (fourSquareMainBean.isBoms()) {
                    str = C11644i.f33262b3;
                } else if (fourSquareMainBean.isMrsoolService()) {
                    str = C11644i.f33253a3;
                } else {
                    str = C11644i.f33244Z2;
                }
                C11540g.this.m52017a(i, str, fourSquareMainBean);
                boolean isMrsoolService = ((FourSquareMainBean) C11540g.this.f32664Z.get(i)).isMrsoolService();
                String str2 = C11644i.f33207U5;
                if (isMrsoolService) {
                    Intent intent = new Intent(C11540g.this.getActivity(), ShopDetailPackageActivity.class);
                    intent.putExtra(C11644i.f33367n1, ((FourSquareMainBean) C11540g.this.f32664Z.get(i)).getShopId());
                    intent.putExtra(C11644i.f33375o1, "");
                    intent.putExtra(C11644i.f33147N1, false);
                    intent.putExtra(str2, cTEventBean);
                    C11540g.this.startActivity(intent);
                } else {
                    Intent intent2 = new Intent(C11540g.this.getContext(), ShopDetailActivity.class);
                    C5887x a = C11540g.this.f32665a;
                    C11540g gVar = C11540g.this;
                    a.mo23555a(gVar.f32664Z, i, (Context) gVar.getActivity());
                    intent2.putExtra(str2, cTEventBean);
                    C11540g.this.startActivity(intent2);
                }
            }
        }
    }

    /* renamed from: com.mrsool.stores.g$b */
    /* compiled from: StoresFragmentNew */
    class C11542b extends C11725f {
        C11542b() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            String str;
            if (C11540g.this.f32665a.mo23497S()) {
                try {
                    if (C11540g.this.f32665a.mo23502X() && C11540g.this.f32665a.mo23500V() && C11540g.this.f32666a0.size() > 0 && i >= 0) {
                        MrsoolService mrsoolService = (MrsoolService) C11540g.this.f32666a0.get(i);
                        if (mrsoolService.isBoms()) {
                            str = C11644i.f33262b3;
                        } else if (mrsoolService.isMrsoolService()) {
                            str = C11644i.f33253a3;
                        } else {
                            str = C11644i.f33244Z2;
                        }
                        C11540g.this.m52018a(i, str, mrsoolService);
                        CTEventBean cTEventBean = new CTEventBean(C11540g.this.getResources().getString(C10232R.string.ct_event_param_value_home_screen), "Promoted", String.valueOf(i + 1));
                        Intent intent = new Intent(C11540g.this.getActivity(), ShopDetailPackageActivity.class);
                        intent.putExtra(C11644i.f33367n1, ((MrsoolService) C11540g.this.f32666a0.get(i)).getVShopId());
                        intent.putExtra(C11644i.f33375o1, "");
                        intent.putExtra(C11644i.f33147N1, false);
                        intent.putExtra(C11644i.f33207U5, cTEventBean);
                        C11540g.this.startActivity(intent);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.mrsool.stores.g$c */
    /* compiled from: StoresFragmentNew */
    class C11543c extends C11725f {
        C11543c() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            try {
                if (!C11540g.this.f32654P.mo39664f() && C11540g.this.f32669c0 != ((StoreCategoryBean) C11540g.this.f32668b0.get(i)).getId() && C11540g.this.f32665a.mo23502X() && C11540g.this.f32665a.mo23500V() && C11540g.this.f32665a.mo23468C().mo23459f(C11644i.f33303g) != null && C11540g.this.f32665a.mo23468C().mo23459f(C11644i.f33312h) != null) {
                    C11598a.m52263f().mo39812a(((StoreCategoryBean) C11540g.this.f32668b0.get(i)).getName(), i + 1);
                    C11540g.this.f32654P.mo39663b(true);
                    ((StoreCategoryBean) C11540g.this.f32668b0.get(C11540g.this.m52013a(C11540g.this.f32669c0))).setSelected(false);
                    ((StoreCategoryBean) C11540g.this.f32668b0.get(i)).setSelected(true);
                    C11540g.this.f32654P.mo7337d(C11540g.this.m52013a(C11540g.this.f32669c0));
                    C11540g.this.f32654P.mo7337d(i);
                    C11540g.this.f32669c0 = ((StoreCategoryBean) C11540g.this.f32668b0.get(i)).getId();
                    C11540g.this.m52036x();
                    C11540g.this.f32670d0.mo6994f(i, (C11540g.this.m52037y() / 2) - C11540g.this.m52024c(i));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.stores.g$d */
    /* compiled from: StoresFragmentNew */
    class C11544d extends BroadcastReceiver {
        C11544d() {
        }

        @TargetApi(17)
        public void onReceive(Context context, Intent intent) {
            try {
                if (C11540g.this.getActivity() != null && intent.getAction().equalsIgnoreCase(C11644i.f33290e4) && C11540g.this.f32665a != null && C11540g.this.f32665a.mo23502X() && !C11540g.this.getActivity().isFinishing()) {
                    C11644i.f33096G6 = 1;
                    C11540g.this.m52036x();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.stores.g$e */
    /* compiled from: StoresFragmentNew */
    class C11545e implements Callback<GetStores> {
        C11545e() {
        }

        public void onFailure(Call<GetStores> call, Throwable th) {
            C11540g.this.f32658T.setVisibility(8);
            C11540g.this.f32659U.setVisibility(8);
            C11540g.this.f32654P.mo39663b(false);
            try {
                if (C11540g.this.f32665a != null && C11540g.this.isAdded()) {
                    C11540g.this.f32665a.mo23492O();
                    C11540g.this.m52026c(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<GetStores> call, Response<GetStores> response) {
            if (C11540g.this.f32665a != null && C11540g.this.isAdded()) {
                C11540g.this.f32665a.mo23492O();
                C11540g.this.f32658T.setVisibility(8);
                C11540g.this.f32659U.setVisibility(8);
                if (!response.isSuccessful() || !C11540g.this.isAdded()) {
                    C11540g.this.f32654P.mo39663b(false);
                    C11540g.this.f32658T.setVisibility(8);
                    C11540g.this.f32659U.setVisibility(8);
                    if (C11540g.this.f32665a != null && C11540g.this.isAdded()) {
                        C11540g.this.m52026c(false);
                        return;
                    }
                    return;
                }
                if (((GetStores) response.body()).getCode().intValue() <= 300) {
                    C11540g.this.f32662X = ((GetStores) response.body()).getData();
                    C11540g.this.m52012B();
                    C11540g.this.m52026c(true);
                    C11540g.this.f32656R.setVisibility(0);
                    C11540g.this.f32661W.setVisibility(8);
                    if (C11540g.this.f32664Z.size() == 0) {
                        C11540g.this.f32656R.setVisibility(8);
                        C11540g.this.f32661W.setVisibility(0);
                        C11540g.this.f32661W.setText(((GetStores) response.body()).getData().getMessage());
                    }
                    if (C11540g.this.f32666a0.size() == 0) {
                        C11540g.this.m52026c(false);
                        C11540g.this.f32656R.setPadding(0, C11540g.this.f32656R.getPaddingBottom(), 0, C11540g.this.f32656R.getPaddingBottom());
                    } else {
                        C11540g.this.f32656R.setPadding(0, 0, 0, C11540g.this.f32656R.getPaddingBottom());
                    }
                    if (C11540g.this.f32668b0.size() >= 1 && C11540g.this.f32654P.mo39664f()) {
                        C11540g gVar = C11540g.this;
                        gVar.f32669c0 = 0;
                        ((StoreCategoryBean) gVar.f32668b0.get(gVar.m52013a(gVar.f32669c0))).setSelected(true);
                        C11540g.this.m52036x();
                    }
                } else {
                    C11540g.this.f32654P.mo39663b(false);
                    C11540g.this.m52026c(false);
                    C11540g.this.f32656R.setVisibility(8);
                    C11540g.this.f32661W.setVisibility(0);
                    C11540g.this.f32661W.setText(((GetStores) response.body()).getMessage());
                }
                C11540g.this.f32658T.setVisibility(8);
                C11540g.this.f32659U.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.stores.g$f */
    /* compiled from: StoresFragmentNew */
    private enum C11546f {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    /* renamed from: A */
    private void m52011A() {
        this.f32665a = new C5887x(getActivity());
        if (this.f32665a.mo23496R()) {
            this.f32665a.mo23577b(this.f32667b.findViewById(C10232R.C10236id.crdLayout));
        }
        this.f32657S = (RecyclerView) this.f32667b.findViewById(C10232R.C10236id.rvCategory);
        this.f32655Q = (RecyclerView) this.f32667b.findViewById(C10232R.C10236id.rvPackage);
        this.f32658T = (ProgressBar) this.f32667b.findViewById(C10232R.C10236id.pg1);
        this.f32659U = (LinearLayout) this.f32667b.findViewById(C10232R.C10236id.pg2);
        this.f32660V = (LinearLayout) this.f32667b.findViewById(C10232R.C10236id.llSearch);
        this.f32661W = (TextView) this.f32667b.findViewById(C10232R.C10236id.tvNoStores);
        this.f32656R = (RecyclerView) this.f32667b.findViewById(C10232R.C10236id.rvStores);
        this.f32663Y = (FrameLayout) this.f32667b.findViewById(C10232R.C10236id.flPackage);
        this.f32660V.setOnClickListener(this);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f32655Q.setLayoutManager(wrapContentLinearLayoutManager);
        this.f32655Q.setItemAnimator(this.f32665a.mo23672x());
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager2 = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager2.mo7000l(1);
        this.f32656R.setLayoutManager(wrapContentLinearLayoutManager2);
        this.f32656R.setItemAnimator(this.f32665a.mo23672x());
        this.f32670d0 = new WrapContentLinearLayoutManager(getActivity());
        this.f32670d0.mo7000l(0);
        this.f32657S.setLayoutManager(this.f32670d0);
        this.f32657S.setItemAnimator(this.f32665a.mo23672x());
        this.f32652N = new C11537f(getActivity(), this.f32664Z, false, new C11541a());
        this.f32656R.setAdapter(this.f32652N);
        this.f32653O = new C11528c(getActivity(), this.f32666a0, new C11542b());
        this.f32655Q.setAdapter(this.f32653O);
        this.f32654P = new C11524a(getActivity(), this.f32668b0, new C11543c());
        this.f32657S.setAdapter(this.f32654P);
        if (!(!this.f32665a.mo23502X() || this.f32665a.mo23468C().mo23459f(C11644i.f33303g) == null || this.f32665a.mo23468C().mo23459f(C11644i.f33312h) == null)) {
            m52036x();
        }
        this.f32665a.mo23540a(this.f32672f0, C11644i.f33290e4);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m52012B() {
        ArrayList<FourSquareMainBean> arrayList = new ArrayList<>();
        ArrayList<MrsoolService> arrayList2 = new ArrayList<>();
        ArrayList<StoreCategoryBean> arrayList3 = new ArrayList<>();
        if (this.f32662X.getShops() != null && this.f32662X.getStoreCategories().size() > 0) {
            StoreCategoryBean storeCategoryBean = new StoreCategoryBean();
            storeCategoryBean.setId(0);
            storeCategoryBean.setName(getString(C10232R.string.lbl_tab_all));
            arrayList3.add(storeCategoryBean);
            arrayList3.addAll(this.f32662X.getStoreCategories());
        }
        if (this.f32662X.isServiceAvailable() && this.f32662X.getMrsoolServices().size() > 0) {
            arrayList2.addAll(this.f32662X.getMrsoolServices());
        }
        if (this.f32662X.getShops() != null && this.f32662X.getShops().size() > 0) {
            for (int i = 0; i < this.f32662X.getShops().size(); i++) {
                FourSquareMainBean fourSquareMainBean = new FourSquareMainBean();
                fourSquareMainBean.setShopId(((Shop) this.f32662X.getShops().get(i)).getVShopId());
                fourSquareMainBean.setShopName(((Shop) this.f32662X.getShops().get(i)).getVName());
                String str = "";
                fourSquareMainBean.setLatitude(((Shop) this.f32662X.getShops().get(i)).getLatitude() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getLatitude()) : str);
                fourSquareMainBean.setLongitude(((Shop) this.f32662X.getShops().get(i)).getLongitude() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getLongitude()) : str);
                fourSquareMainBean.setDistance(((Shop) this.f32662X.getShops().get(i)).getDistance() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getDistance()) : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                String str2 = null;
                fourSquareMainBean.setRatings(null);
                fourSquareMainBean.setFormattedAddress(((Shop) this.f32662X.getShops().get(i)).getVAddress() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getVAddress()) : null);
                fourSquareMainBean.setShopPic(((Shop) this.f32662X.getShops().get(i)).getVShopPic() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getVShopPic()) : null);
                fourSquareMainBean.setType(((Shop) this.f32662X.getShops().get(i)).getVType() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getVType()) : null);
                fourSquareMainBean.setType(((Shop) this.f32662X.getShops().get(i)).getVType() != null ? String.valueOf(((Shop) this.f32662X.getShops().get(i)).getVType()) : null);
                if (((Shop) this.f32662X.getShops().get(i)).getvDataSource() != null) {
                    str2 = String.valueOf(((Shop) this.f32662X.getShops().get(i)).getvDataSource());
                }
                fourSquareMainBean.setvDataSource(str2);
                if (((Shop) this.f32662X.getShops().get(i)).getvPhone() != null) {
                    str = String.valueOf(((Shop) this.f32662X.getShops().get(i)).getvPhone());
                }
                fourSquareMainBean.setvPhone(str);
                fourSquareMainBean.setShopType(C11644i.f33247Z5);
                fourSquareMainBean.setHasDiscount(((Shop) this.f32662X.getShops().get(i)).isHasDiscount());
                fourSquareMainBean.setDiscountLabel(((Shop) this.f32662X.getShops().get(i)).getDiscountLabel());
                fourSquareMainBean.setMrsoolService(((Shop) this.f32662X.getShops().get(i)).getMrsoolService());
                fourSquareMainBean.setBomsLinked(((Shop) this.f32662X.getShops().get(i)).isBOMSLinked());
                fourSquareMainBean.setHighlightShop(((Shop) this.f32662X.getShops().get(i)).isHighlightShop());
                fourSquareMainBean.setShopNameEn(((Shop) this.f32662X.getShops().get(i)).getvEnName());
                fourSquareMainBean.setCategories(((Shop) this.f32662X.getShops().get(i)).getCategories());
                arrayList.add(fourSquareMainBean);
            }
            this.f32662X = new MostActiveShops();
        }
        this.f32665a.mo23549a(this.f32655Q);
        this.f32665a.mo23549a(this.f32656R);
        this.f32665a.mo23549a(this.f32657S);
        this.f32664Z = arrayList;
        this.f32652N.mo39676a(this.f32664Z);
        this.f32652N.mo7341e();
        this.f32666a0 = arrayList2;
        this.f32653O.mo39667a(this.f32666a0);
        this.f32653O.mo7341e();
        this.f32668b0 = arrayList3;
        this.f32654P.mo39662a(this.f32668b0);
        this.f32654P.mo7341e();
        if (m52029e(this.f32669c0) && this.f32668b0.size() >= 1) {
            ((StoreCategoryBean) this.f32668b0.get(m52013a(this.f32669c0))).setSelected(true);
            this.f32654P.mo39663b(false);
        }
        m52035w();
    }

    /* renamed from: w */
    private void m52035w() {
        try {
            if (this.f32671e0 == null && this.f32664Z != null && this.f32664Z.size() > 0) {
                this.f32671e0 = new C11614c(getActivity());
            }
            if (this.f32671e0 != null && this.f32664Z != null && this.f32664Z.size() > 0) {
                if (this.f32664Z.size() == 1) {
                    this.f32671e0.mo39852b(((FourSquareMainBean) this.f32664Z.get(0)).getShopId());
                } else if (this.f32664Z.size() == 2) {
                    this.f32671e0.mo39849a(((FourSquareMainBean) this.f32664Z.get(0)).getShopId(), ((FourSquareMainBean) this.f32664Z.get(1)).getShopId());
                } else if (this.f32664Z.size() > 2) {
                    this.f32671e0.mo39853b(((FourSquareMainBean) this.f32664Z.get(0)).getShopId(), ((FourSquareMainBean) this.f32664Z.get(1)).getShopId(), ((FourSquareMainBean) this.f32664Z.get(2)).getShopId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m52036x() {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", String.valueOf(this.f32665a.mo23468C().mo23459f(C11644i.f33303g)));
        hashMap.put("longitude", String.valueOf(this.f32665a.mo23468C().mo23459f(C11644i.f33312h)));
        hashMap.put("language", String.valueOf(this.f32665a.mo23645o()));
        hashMap.put("type", C11687c.f33836s2);
        hashMap.put("page", "1");
        if (this.f32669c0 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f32669c0);
            hashMap.put(C11687c.f33790h0, sb.toString());
        }
        C11687c.m52645a(this.f32665a).MostActiveShops(hashMap).enqueue(new C11545e());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public int m52037y() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public String m52038z() {
        try {
            if (this.f32668b0.size() > 0 && ((StoreCategoryBean) this.f32668b0.get(0)).isSelected()) {
                return ((StoreCategoryBean) this.f32668b0.get(0)).getName();
            }
        } catch (Exception unused) {
        }
        return "All";
    }

    /* renamed from: a */
    public void mo39678a(ConnectionResult connectionResult) {
    }

    /* renamed from: i */
    public void mo39679i(Bundle bundle) {
    }

    /* renamed from: n */
    public void mo39680n(int i) {
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.llSearch && this.f32665a.mo23497S()) {
            startActivity(new Intent(getActivity(), SearchStoresActivity.class));
            C11598a.m52263f().mo39837d();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f32667b = layoutInflater.inflate(C10232R.layout.fragment_stores_new, viewGroup, false);
        return this.f32667b;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f32665a.mo23539a(this.f32672f0);
    }

    public void onLocationChanged(Location location) {
        if (this.f32665a.mo23502X() && this.f32665a.mo23500V()) {
            if (location != null) {
                this.f32665a.mo23468C().mo23449a(C11644i.f33303g, String.valueOf(location.getLatitude()));
                this.f32665a.mo23468C().mo23449a(C11644i.f33312h, String.valueOf(location.getLongitude()));
                return;
            }
            this.f32665a.mo23576b((Context) getActivity(), getString(C10232R.string.msg_error_location_not_found));
        }
    }

    public void onResume() {
        super.onResume();
        C5880q.m25751b("All shop on resume");
        C11528c cVar = this.f32653O;
        if (cVar != null) {
            cVar.mo7341e();
        }
        if (HomeActivity.f27245h1 && this.f32665a.mo23502X()) {
            C11644i.f33096G6 = 1;
            if (this.f32665a.mo23468C().mo23459f(C11644i.f33303g) == null || this.f32665a.mo23468C().mo23459f(C11644i.f33312h) == null) {
                this.f32665a.mo23576b((Context) getActivity(), getString(C10232R.string.msg_error_location_not_found));
            } else {
                if (!this.f32665a.mo23612e()) {
                    this.f32665a.mo23576b((Context) getActivity(), getString(C10232R.string.msg_no_gps_with_lat_lng));
                }
                m52036x();
            }
        }
        m52035w();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m52011A();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m52035w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m52024c(int i) {
        try {
            if (this.f32670d0 != null) {
                this.f32667b = this.f32670d0.mo6989c(i);
                if (this.f32667b != null) {
                    return this.f32667b.getWidth() / 2;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: e */
    private boolean m52029e(int i) {
        for (int i2 = 0; i2 < this.f32668b0.size(); i2++) {
            if (((StoreCategoryBean) this.f32668b0.get(i2)).getId() == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m52026c(boolean z) {
        if (z) {
            this.f32663Y.setVisibility(0);
            this.f32655Q.setVisibility(0);
            return;
        }
        this.f32663Y.setVisibility(8);
        this.f32655Q.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m52013a(int i) {
        for (int i2 = 0; i2 < this.f32668b0.size(); i2++) {
            if (((StoreCategoryBean) this.f32668b0.get(i2)).getId() == i) {
                return i2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52018a(int i, String str, MrsoolService mrsoolService) {
        try {
            String vTitle = mrsoolService.getVTitle();
            String str2 = mrsoolService.getvEnName();
            C11598a f = C11598a.m52263f();
            String vShopId = mrsoolService.getVShopId();
            String categories = mrsoolService.getCategories();
            String str3 = "";
            String categories2 = mrsoolService.getCategories();
            int i2 = i + 1;
            double S = C5887x.m25791S("");
            boolean isHasDiscount = mrsoolService.isHasDiscount();
            try {
                f.mo39820a(vShopId, vTitle, str2, str, categories, str3, categories2, i2, S, isHasDiscount, this.f32665a.mo23639m(mrsoolService.getDiscountLabel()));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52017a(int i, String str, FourSquareMainBean fourSquareMainBean) {
        try {
            C11598a f = C11598a.m52263f();
            String shopId = fourSquareMainBean.getShopId();
            String shopName = fourSquareMainBean.getShopName();
            String shopNameEn = fourSquareMainBean.getShopNameEn();
            String categories = fourSquareMainBean.getCategories();
            String str2 = "";
            String type = fourSquareMainBean.getType();
            int i2 = i + 1;
            double S = C5887x.m25791S(fourSquareMainBean.getDistance());
            boolean hasDiscount = fourSquareMainBean.getHasDiscount();
            try {
                f.mo39831b(shopId, shopName, shopNameEn, str, categories, str2, type, i2, S, hasDiscount, this.f32665a.mo23639m(fourSquareMainBean.getDiscountLabel()));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
