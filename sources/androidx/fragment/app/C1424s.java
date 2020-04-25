package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.fragment.app.s */
/* compiled from: ListFragment */
public class C1424s extends Fragment {

    /* renamed from: W */
    static final int f5642W = 16711681;

    /* renamed from: X */
    static final int f5643X = 16711682;

    /* renamed from: Y */
    static final int f5644Y = 16711683;

    /* renamed from: N */
    private final OnItemClickListener f5645N = new C1426b();

    /* renamed from: O */
    ListAdapter f5646O;

    /* renamed from: P */
    ListView f5647P;

    /* renamed from: Q */
    View f5648Q;

    /* renamed from: R */
    TextView f5649R;

    /* renamed from: S */
    View f5650S;

    /* renamed from: T */
    View f5651T;

    /* renamed from: U */
    CharSequence f5652U;

    /* renamed from: V */
    boolean f5653V;

    /* renamed from: a */
    private final Handler f5654a = new Handler();

    /* renamed from: b */
    private final Runnable f5655b = new C1425a();

    /* renamed from: androidx.fragment.app.s$a */
    /* compiled from: ListFragment */
    class C1425a implements Runnable {
        C1425a() {
        }

        public void run() {
            ListView listView = C1424s.this.f5647P;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.s$b */
    /* compiled from: ListFragment */
    class C1426b implements OnItemClickListener {
        C1426b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1424s.this.mo6461a((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: B */
    private void m7620B() {
        if (this.f5647P == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f5647P = (ListView) view;
                } else {
                    this.f5649R = (TextView) view.findViewById(f5642W);
                    TextView textView = this.f5649R;
                    if (textView == null) {
                        this.f5648Q = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f5650S = view.findViewById(f5643X);
                    this.f5651T = view.findViewById(f5644Y);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        this.f5647P = (ListView) findViewById;
                        View view2 = this.f5648Q;
                        if (view2 != null) {
                            this.f5647P.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.f5652U;
                            if (charSequence != null) {
                                this.f5649R.setText(charSequence);
                                this.f5647P.setEmptyView(this.f5649R);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f5653V = true;
                this.f5647P.setOnItemClickListener(this.f5645N);
                ListAdapter listAdapter = this.f5646O;
                if (listAdapter != null) {
                    this.f5646O = null;
                    mo6460a(listAdapter);
                } else if (this.f5650S != null) {
                    m7621a(false, false);
                }
                this.f5654a.post(this.f5655b);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    @C0193h0
    /* renamed from: A */
    public final ListAdapter mo6458A() {
        ListAdapter w = mo6465w();
        if (w != null) {
            return w;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ListFragment ");
        sb.append(this);
        sb.append(" does not have a ListAdapter.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo6460a(@C0195i0 ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f5646O != null;
        this.f5646O = listAdapter;
        ListView listView = this.f5647P;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f5653V && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                m7621a(true, z);
            }
        }
    }

    /* renamed from: a */
    public void mo6461a(@C0193h0 ListView listView, @C0193h0 View view, int i, long j) {
    }

    /* renamed from: c */
    public void mo6463c(boolean z) {
        m7621a(z, true);
    }

    /* renamed from: d */
    public void mo6464d(boolean z) {
        m7621a(z, false);
    }

    @C0195i0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f5643X);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f5644Y);
        TextView textView = new TextView(requireContext);
        textView.setId(f5642W);
        textView.setGravity(17);
        frameLayout2.addView(textView, new LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.f5654a.removeCallbacks(this.f5655b);
        this.f5647P = null;
        this.f5653V = false;
        this.f5651T = null;
        this.f5650S = null;
        this.f5648Q = null;
        this.f5649R = null;
        super.onDestroyView();
    }

    public void onViewCreated(@C0193h0 View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m7620B();
    }

    @C0195i0
    /* renamed from: w */
    public ListAdapter mo6465w() {
        return this.f5646O;
    }

    @C0193h0
    /* renamed from: x */
    public ListView mo6466x() {
        m7620B();
        return this.f5647P;
    }

    /* renamed from: y */
    public long mo6467y() {
        m7620B();
        return this.f5647P.getSelectedItemId();
    }

    /* renamed from: z */
    public int mo6468z() {
        m7620B();
        return this.f5647P.getSelectedItemPosition();
    }

    /* renamed from: a */
    public void mo6459a(int i) {
        m7620B();
        this.f5647P.setSelection(i);
    }

    /* renamed from: a */
    public void mo6462a(@C0195i0 CharSequence charSequence) {
        m7620B();
        TextView textView = this.f5649R;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f5652U == null) {
                this.f5647P.setEmptyView(this.f5649R);
            }
            this.f5652U = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    /* renamed from: a */
    private void m7621a(boolean z, boolean z2) {
        m7620B();
        View view = this.f5650S;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f5653V != z) {
            this.f5653V = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f5651T.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f5651T.clearAnimation();
                }
                this.f5650S.setVisibility(8);
                this.f5651T.setVisibility(0);
            } else {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                    this.f5651T.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                } else {
                    view.clearAnimation();
                    this.f5651T.clearAnimation();
                }
                this.f5650S.setVisibility(0);
                this.f5651T.setVisibility(8);
            }
        }
    }
}
