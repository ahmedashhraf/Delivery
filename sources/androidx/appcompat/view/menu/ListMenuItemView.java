package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.appcompat.widget.C0549t0;
import androidx.core.p034l.C0962e0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements C0389a, SelectionBoundsAdjuster {

    /* renamed from: g0 */
    private static final String f1212g0 = "ListMenuItemView";

    /* renamed from: N */
    private RadioButton f1213N;

    /* renamed from: O */
    private TextView f1214O;

    /* renamed from: P */
    private CheckBox f1215P;

    /* renamed from: Q */
    private TextView f1216Q;

    /* renamed from: R */
    private ImageView f1217R;

    /* renamed from: S */
    private ImageView f1218S;

    /* renamed from: T */
    private LinearLayout f1219T;

    /* renamed from: U */
    private Drawable f1220U;

    /* renamed from: V */
    private int f1221V;

    /* renamed from: W */
    private Context f1222W;

    /* renamed from: a */
    private C0375j f1223a;

    /* renamed from: a0 */
    private boolean f1224a0;

    /* renamed from: b */
    private ImageView f1225b;

    /* renamed from: b0 */
    private Drawable f1226b0;

    /* renamed from: c0 */
    private boolean f1227c0;

    /* renamed from: d0 */
    private int f1228d0;

    /* renamed from: e0 */
    private LayoutInflater f1229e0;

    /* renamed from: f0 */
    private boolean f1230f0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.listMenuViewStyle);
    }

    /* renamed from: c */
    private void m1971c() {
        this.f1215P = (CheckBox) getInflater().inflate(C0238R.layout.abc_list_menu_item_checkbox, this, false);
        m1969a(this.f1215P);
    }

    /* renamed from: d */
    private void m1972d() {
        this.f1225b = (ImageView) getInflater().inflate(C0238R.layout.abc_list_menu_item_icon, this, false);
        m1970a((View) this.f1225b, 0);
    }

    /* renamed from: e */
    private void m1973e() {
        this.f1213N = (RadioButton) getInflater().inflate(C0238R.layout.abc_list_menu_item_radio, this, false);
        m1969a(this.f1213N);
    }

    private LayoutInflater getInflater() {
        if (this.f1229e0 == null) {
            this.f1229e0 = LayoutInflater.from(getContext());
        }
        return this.f1229e0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1217R;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo1387a(C0375j jVar, int i) {
        this.f1223a = jVar;
        this.f1228d0 = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo1640a((C0389a) this));
        setCheckable(jVar.isCheckable());
        mo1388a(jVar.mo1676o(), jVar.mo1651g());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public boolean mo1389a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1218S;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f1218S.getLayoutParams();
            rect.top += this.f1218S.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public boolean mo1390b() {
        return this.f1230f0;
    }

    public C0375j getItemData() {
        return this.f1223a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0962e0.m5440a((View) this, this.f1220U);
        this.f1214O = (TextView) findViewById(C0238R.C0241id.title);
        int i = this.f1221V;
        if (i != -1) {
            this.f1214O.setTextAppearance(this.f1222W, i);
        }
        this.f1216Q = (TextView) findViewById(C0238R.C0241id.shortcut);
        this.f1217R = (ImageView) findViewById(C0238R.C0241id.submenuarrow);
        ImageView imageView = this.f1217R;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1226b0);
        }
        this.f1218S = (ImageView) findViewById(C0238R.C0241id.group_divider);
        this.f1219T = (LinearLayout) findViewById(C0238R.C0241id.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1225b != null && this.f1224a0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f1225b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1213N != null || this.f1215P != null) {
            if (this.f1223a.mo1673l()) {
                if (this.f1213N == null) {
                    m1973e();
                }
                compoundButton2 = this.f1213N;
                compoundButton = this.f1215P;
            } else {
                if (this.f1215P == null) {
                    m1971c();
                }
                compoundButton2 = this.f1215P;
                compoundButton = this.f1213N;
            }
            if (z) {
                compoundButton2.setChecked(this.f1223a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f1215P;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f1213N;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1223a.mo1673l()) {
            if (this.f1213N == null) {
                m1973e();
            }
            compoundButton = this.f1213N;
        } else {
            if (this.f1215P == null) {
                m1971c();
            }
            compoundButton = this.f1215P;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1230f0 = z;
        this.f1224a0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1218S;
        if (imageView != null) {
            imageView.setVisibility((this.f1227c0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1223a.mo1675n() || this.f1230f0;
        if (!z && !this.f1224a0) {
            return;
        }
        if (this.f1225b != null || drawable != null || this.f1224a0) {
            if (this.f1225b == null) {
                m1972d();
            }
            if (drawable != null || this.f1224a0) {
                ImageView imageView = this.f1225b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1225b.getVisibility() != 0) {
                    this.f1225b.setVisibility(0);
                }
            } else {
                this.f1225b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1214O.setText(charSequence);
            if (this.f1214O.getVisibility() != 0) {
                this.f1214O.setVisibility(0);
            }
        } else if (this.f1214O.getVisibility() != 8) {
            this.f1214O.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0549t0 a = C0549t0.m2910a(getContext(), attributeSet, C0238R.styleable.MenuView, i, 0);
        this.f1220U = a.mo2875b(C0238R.styleable.MenuView_android_itemBackground);
        this.f1221V = a.mo2888g(C0238R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f1224a0 = a.mo2871a(C0238R.styleable.MenuView_preserveIconSpacing, false);
        this.f1222W = context;
        this.f1226b0 = a.mo2875b(C0238R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0238R.attr.dropDownListViewStyle, 0);
        this.f1227c0 = obtainStyledAttributes.hasValue(0);
        a.mo2887f();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m1969a(View view) {
        m1970a(view, -1);
    }

    /* renamed from: a */
    private void m1970a(View view, int i) {
        LinearLayout linearLayout = this.f1219T;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public void mo1388a(boolean z, char c) {
        int i = (!z || !this.f1223a.mo1676o()) ? 8 : 0;
        if (i == 0) {
            this.f1216Q.setText(this.f1223a.mo1664h());
        }
        if (this.f1216Q.getVisibility() != i) {
            this.f1216Q.setVisibility(i);
        }
    }
}
