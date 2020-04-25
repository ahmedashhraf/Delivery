package com.instabug.library.annotation;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.core.content.C0841b;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.annotation.AnnotationView.C9723c;
import com.instabug.library.annotation.AnnotationView.C9726f;
import com.instabug.library.annotation.AnnotationView.C9727g;
import com.instabug.library.annotation.AnnotationView.C9728h;
import com.instabug.library.annotation.ColorPickerPopUpView.C9730b;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapWorkerTask.OnImageLoadedListener;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.view.IconView;
import com.instabug.library.view.ViewUtils;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AnnotationLayout extends LinearLayout implements OnClickListener {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String ANNOTATION_LAYOUT = "instabug_annotation_layout";
    private static final String DRAWING_MODE = "drawingMode";
    private LinearLayout annotationActionsContainer;
    private AnnotationView annotationView;
    private View border;
    private View brushIndicator;
    private ColorPickerPopUpView colorPicker;
    private ImageView iconBlur;
    private ImageView iconBrush;
    private RelativeLayout iconBrushLayout;
    private ImageView iconMagnify;
    private ImageView iconUndo;
    private ShapeSuggestionsLayout shapeSuggestionsLayout;
    private int tintingColor;

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$a */
    class C9714a implements C9735d {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25724b;

        /* renamed from: a */
        final /* synthetic */ AnnotationLayout f25725a;

        C9714a(AnnotationLayout annotationLayout) {
            boolean[] a = m45316a();
            this.f25725a = annotationLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45316a() {
            boolean[] zArr = f25724b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6529623733034995476L, "com/instabug/library/annotation/AnnotationLayout$1", 5);
            f25724b = a;
            return a;
        }

        /* renamed from: b */
        public void mo34699b(int i) {
            boolean[] a = m45316a();
            if (i != 1) {
                a[1] = true;
            } else {
                a[2] = true;
                AnnotationLayout.access$000(this.f25725a).mo34705a();
                a[3] = true;
            }
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$b */
    class C9715b implements C9726f {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25726b;

        /* renamed from: a */
        final /* synthetic */ AnnotationLayout f25727a;

        C9715b(AnnotationLayout annotationLayout) {
            boolean[] a = m45318a();
            this.f25727a = annotationLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45318a() {
            boolean[] zArr = f25726b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6553250802871990756L, "com/instabug/library/annotation/AnnotationLayout$2", 5);
            f25726b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34700d() {
            boolean[] a = m45318a();
            if (AnnotationLayout.access$100(this.f25727a).getVisibility() != 0) {
                a[1] = true;
            } else {
                a[2] = true;
                AnnotationLayout.access$100(this.f25727a).setVisibility(8);
                a[3] = true;
            }
            AnnotationLayout.access$200(this.f25727a).mo34743b();
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$c */
    class C9716c implements C9728h {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25728b;

        /* renamed from: a */
        final /* synthetic */ AnnotationLayout f25729a;

        C9716c(AnnotationLayout annotationLayout) {
            boolean[] a = m45320a();
            this.f25729a = annotationLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45320a() {
            boolean[] zArr = f25728b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8489238484246245455L, "com/instabug/library/annotation/AnnotationLayout$3", 2);
            f25728b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34701a(Path path, Path path2) {
            boolean[] a = m45320a();
            AnnotationLayout.access$300(this.f25729a, new Path[]{path, path2});
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$d */
    class C9717d implements C9727g {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25730b;

        /* renamed from: a */
        final /* synthetic */ AnnotationLayout f25731a;

        C9717d(AnnotationLayout annotationLayout) {
            boolean[] a = m45322a();
            this.f25731a = annotationLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45322a() {
            boolean[] zArr = f25730b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-480044388149322757L, "com/instabug/library/annotation/AnnotationLayout$4", 2);
            f25730b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34702a(boolean z) {
            boolean[] a = m45322a();
            AnnotationLayout.access$400(this.f25731a).setEnabled(z);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$e */
    class C9718e implements C9730b {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25732b;

        /* renamed from: a */
        final /* synthetic */ AnnotationLayout f25733a;

        C9718e(AnnotationLayout annotationLayout) {
            boolean[] a = m45324a();
            this.f25733a = annotationLayout;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45324a() {
            boolean[] zArr = f25732b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3768865497855220296L, "com/instabug/library/annotation/AnnotationLayout$5", 4);
            f25732b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34703a(@C0198k int i, int i2) {
            boolean[] a = m45324a();
            AnnotationLayout.access$000(this.f25733a).setDrawingColor(i);
            a[1] = true;
            AnnotationLayout.access$100(this.f25733a).setVisibility(8);
            a[2] = true;
            AnnotationLayout.access$500(this.f25733a).setBackgroundColor(i);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$f */
    class C9719f implements OnTouchListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25734N;

        /* renamed from: a */
        final /* synthetic */ ImageView f25735a;

        /* renamed from: b */
        final /* synthetic */ AnnotationLayout f25736b;

        C9719f(AnnotationLayout annotationLayout, ImageView imageView) {
            boolean[] a = m45326a();
            this.f25736b = annotationLayout;
            this.f25735a = imageView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45326a() {
            boolean[] zArr = f25734N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6747671110363948704L, "com/instabug/library/annotation/AnnotationLayout$6", 7);
            f25734N = a;
            return a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean[] a = m45326a();
            if (motionEvent.getAction() == 0) {
                a[1] = true;
                DrawableUtils.setDrawableTintColor(this.f25735a, Instabug.getPrimaryColor());
                a[2] = true;
            } else if (motionEvent.getAction() != 1) {
                a[3] = true;
            } else {
                a[4] = true;
                DrawableUtils.setDrawableTintColor(this.f25735a, AnnotationLayout.access$600(this.f25736b));
                a[5] = true;
            }
            a[6] = true;
            return false;
        }
    }

    /* renamed from: com.instabug.library.annotation.AnnotationLayout$g */
    class C9720g implements OnImageLoadedListener {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25737c;

        /* renamed from: a */
        final /* synthetic */ Runnable f25738a;

        /* renamed from: b */
        final /* synthetic */ AnnotationLayout f25739b;

        C9720g(AnnotationLayout annotationLayout, Runnable runnable) {
            boolean[] a = m45327a();
            this.f25739b = annotationLayout;
            this.f25738a = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45327a() {
            boolean[] zArr = f25737c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6673088064780319589L, "com/instabug/library/annotation/AnnotationLayout$7", 6);
            f25737c = a;
            return a;
        }

        public void onImageLoaded() {
            boolean[] a = m45327a();
            AnnotationLayout.access$700(this.f25739b);
            a[1] = true;
            AnnotationLayout.access$800(this.f25739b);
            Runnable runnable = this.f25738a;
            if (runnable == null) {
                a[2] = true;
            } else {
                a[3] = true;
                runnable.run();
                a[4] = true;
            }
            a[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9212963411371447320L, "com/instabug/library/annotation/AnnotationLayout", 117);
        $jacocoData = a;
        return a;
    }

    public AnnotationLayout(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, null);
        $jacocoInit[0] = true;
    }

    static /* synthetic */ AnnotationView access$000(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        AnnotationView annotationView2 = annotationLayout.annotationView;
        $jacocoInit[108] = true;
        return annotationView2;
    }

    static /* synthetic */ ColorPickerPopUpView access$100(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        ColorPickerPopUpView colorPickerPopUpView = annotationLayout.colorPicker;
        $jacocoInit[109] = true;
        return colorPickerPopUpView;
    }

    static /* synthetic */ ShapeSuggestionsLayout access$200(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        ShapeSuggestionsLayout shapeSuggestionsLayout2 = annotationLayout.shapeSuggestionsLayout;
        $jacocoInit[110] = true;
        return shapeSuggestionsLayout2;
    }

    static /* synthetic */ void access$300(AnnotationLayout annotationLayout, Path[] pathArr) {
        boolean[] $jacocoInit = $jacocoInit();
        annotationLayout.showShapeSuggestions(pathArr);
        $jacocoInit[111] = true;
    }

    static /* synthetic */ ImageView access$400(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        ImageView imageView = annotationLayout.iconMagnify;
        $jacocoInit[112] = true;
        return imageView;
    }

    static /* synthetic */ View access$500(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        View view = annotationLayout.brushIndicator;
        $jacocoInit[113] = true;
        return view;
    }

    static /* synthetic */ int access$600(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        int i = annotationLayout.tintingColor;
        $jacocoInit[114] = true;
        return i;
    }

    static /* synthetic */ void access$700(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        annotationLayout.enableButtons();
        $jacocoInit[115] = true;
    }

    static /* synthetic */ void access$800(AnnotationLayout annotationLayout) {
        boolean[] $jacocoInit = $jacocoInit();
        annotationLayout.setBorder();
        $jacocoInit[116] = true;
    }

    private void enableButtons() {
        boolean[] $jacocoInit = $jacocoInit();
        this.iconBrush.setEnabled(true);
        $jacocoInit[92] = true;
        this.iconMagnify.setEnabled(true);
        $jacocoInit[93] = true;
        this.iconBlur.setEnabled(true);
        $jacocoInit[94] = true;
        this.iconUndo.setEnabled(true);
        $jacocoInit[95] = true;
    }

    private void hideColorPicker() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.colorPicker.getVisibility() != 0) {
            $jacocoInit[76] = true;
        } else {
            $jacocoInit[77] = true;
            this.colorPicker.setVisibility(8);
            $jacocoInit[78] = true;
        }
        $jacocoInit[79] = true;
    }

    private void initViews() {
        boolean[] $jacocoInit = $jacocoInit();
        LinearLayout.inflate(getContext(), C9700R.layout.instabug_annotation_view, this);
        int i = C9700R.C9704id.instabug_annotation_actions_container;
        $jacocoInit[6] = true;
        this.annotationActionsContainer = (LinearLayout) findViewById(i);
        $jacocoInit[7] = true;
        this.shapeSuggestionsLayout = (ShapeSuggestionsLayout) findViewById(C9700R.C9704id.shapeSuggestionsLayout);
        $jacocoInit[8] = true;
        this.shapeSuggestionsLayout.setOnShapeSelectedListener(new C9714a(this));
        $jacocoInit[9] = true;
        this.iconBrushLayout = (RelativeLayout) findViewById(C9700R.C9704id.icon_brush_layout);
        $jacocoInit[10] = true;
        this.iconBrush = (ImageView) findViewById(C9700R.C9704id.icon_brush);
        $jacocoInit[11] = true;
        this.iconMagnify = (ImageView) findViewById(C9700R.C9704id.icon_magnify);
        $jacocoInit[12] = true;
        this.iconBlur = (ImageView) findViewById(C9700R.C9704id.icon_blur);
        $jacocoInit[13] = true;
        this.iconUndo = (ImageView) findViewById(C9700R.C9704id.icon_undo);
        $jacocoInit[14] = true;
        this.iconBrush.setEnabled(false);
        $jacocoInit[15] = true;
        this.iconMagnify.setEnabled(false);
        $jacocoInit[16] = true;
        this.iconBlur.setEnabled(false);
        $jacocoInit[17] = true;
        this.iconUndo.setEnabled(false);
        $jacocoInit[18] = true;
        this.border = findViewById(C9700R.C9704id.instabug_annotation_image_border);
        $jacocoInit[19] = true;
        this.annotationView = (AnnotationView) findViewById(C9700R.C9704id.instabug_annotation_image);
        $jacocoInit[20] = true;
        this.colorPicker = (ColorPickerPopUpView) findViewById(C9700R.C9704id.instabug_color_picker);
        $jacocoInit[21] = true;
        this.brushIndicator = findViewById(C9700R.C9704id.brush_indicator);
        $jacocoInit[22] = true;
        this.annotationView.setDrawingMode(C9723c.DRAW_PATH);
        $jacocoInit[23] = true;
        DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
        $jacocoInit[24] = true;
        this.annotationView.setDrawingColor(this.colorPicker.getSelectedColor());
        $jacocoInit[25] = true;
        this.annotationView.setOnActionDownListener(new C9715b(this));
        $jacocoInit[26] = true;
        this.annotationView.setOnPathRecognizedListener(new C9716c(this));
        $jacocoInit[27] = true;
        this.annotationView.m68856setOnNewMagnifierAddingAbilityChangedListener(new C9717d(this));
        $jacocoInit[28] = true;
        this.colorPicker.setOnColorSelectionListener(new C9718e(this));
        $jacocoInit[29] = true;
        this.colorPicker.setPopUpBackgroundColor(AttrResolver.resolveAttributeColor(getContext(), C9700R.attr.ib_annotation_color_picker_bg_color));
        $jacocoInit[30] = true;
        this.iconBrushLayout.setOnClickListener(this);
        $jacocoInit[31] = true;
        this.iconMagnify.setOnClickListener(this);
        $jacocoInit[32] = true;
        this.iconBlur.setOnClickListener(this);
        $jacocoInit[33] = true;
        this.iconUndo.setOnClickListener(this);
        $jacocoInit[34] = true;
        setViewSelector(this.iconMagnify);
        $jacocoInit[35] = true;
        setViewSelector(this.iconUndo);
        $jacocoInit[36] = true;
        this.tintingColor = C0841b.m4915a(getContext(), C9700R.C9702color.ib_core_annotation_tinting_color);
        $jacocoInit[37] = true;
    }

    private void resetColorSelection() {
        boolean[] $jacocoInit = $jacocoInit();
        int childCount = this.annotationActionsContainer.getChildCount();
        $jacocoInit[80] = true;
        int i = 0;
        while (i < childCount) {
            $jacocoInit[81] = true;
            if (!(this.annotationActionsContainer.getChildAt(i) instanceof IconView)) {
                $jacocoInit[82] = true;
            } else {
                $jacocoInit[83] = true;
                ((TextView) this.annotationActionsContainer.getChildAt(i)).setTextColor(this.tintingColor);
                $jacocoInit[84] = true;
            }
            i++;
            $jacocoInit[85] = true;
        }
        DrawableUtils.setDrawableTintColor(this.iconBrush, this.tintingColor);
        $jacocoInit[86] = true;
        DrawableUtils.setDrawableTintColor(this.iconBlur, this.tintingColor);
        $jacocoInit[87] = true;
    }

    private void setBorder() {
        boolean[] $jacocoInit = $jacocoInit();
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 4.0f);
        $jacocoInit[42] = true;
        int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 2.0f);
        $jacocoInit[43] = true;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        $jacocoInit[44] = true;
        shapeDrawable.setShape(new RectShape());
        $jacocoInit[45] = true;
        shapeDrawable.getPaint().setColor(Instabug.getPrimaryColor());
        $jacocoInit[46] = true;
        shapeDrawable.getPaint().setStyle(Style.STROKE);
        $jacocoInit[47] = true;
        shapeDrawable.getPaint().setStrokeWidth((float) convertDpToPx);
        $jacocoInit[48] = true;
        this.border.setPadding(convertDpToPx2, convertDpToPx2, convertDpToPx2, convertDpToPx2);
        if (VERSION.SDK_INT >= 16) {
            $jacocoInit[49] = true;
            this.border.setBackground(shapeDrawable);
            $jacocoInit[50] = true;
        } else {
            this.border.setBackgroundDrawable(shapeDrawable);
            $jacocoInit[51] = true;
        }
        $jacocoInit[52] = true;
    }

    private void setViewSelector(ImageView imageView) {
        boolean[] $jacocoInit = $jacocoInit();
        imageView.setOnTouchListener(new C9719f(this, imageView));
        $jacocoInit[53] = true;
    }

    private void showShapeSuggestions(Path... pathArr) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shapeSuggestionsLayout.removeAllViews();
        int length = pathArr.length;
        $jacocoInit[38] = true;
        int i = 0;
        while (i < length) {
            Path path = pathArr[i];
            $jacocoInit[39] = true;
            this.shapeSuggestionsLayout.mo34742a(path);
            i++;
            $jacocoInit[40] = true;
        }
        this.shapeSuggestionsLayout.mo34741a();
        $jacocoInit[41] = true;
    }

    private void switchColorPickerVisibility() {
        int i;
        boolean[] $jacocoInit = $jacocoInit();
        ColorPickerPopUpView colorPickerPopUpView = this.colorPicker;
        if (colorPickerPopUpView.getVisibility() == 0) {
            i = 8;
            $jacocoInit[73] = true;
        } else {
            i = 0;
            $jacocoInit[74] = true;
        }
        colorPickerPopUpView.setVisibility(i);
        $jacocoInit[75] = true;
    }

    @C0195i0
    public Bitmap getAnnotatedBitmap() {
        boolean[] $jacocoInit = $jacocoInit();
        Bitmap c = this.annotationView.mo34708c();
        $jacocoInit[96] = true;
        return c;
    }

    public void onClick(View view) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shapeSuggestionsLayout.mo34743b();
        $jacocoInit[54] = true;
        int id = view.getId();
        if (id == C9700R.C9704id.icon_brush_layout) {
            $jacocoInit[55] = true;
            switchColorPickerVisibility();
            $jacocoInit[56] = true;
            this.annotationView.setDrawingMode(C9723c.DRAW_PATH);
            $jacocoInit[57] = true;
            resetColorSelection();
            $jacocoInit[58] = true;
            DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
            $jacocoInit[59] = true;
        } else if (id == C9700R.C9704id.icon_magnify) {
            $jacocoInit[60] = true;
            this.annotationView.mo34707b();
            $jacocoInit[61] = true;
            hideColorPicker();
            $jacocoInit[62] = true;
        } else if (id == C9700R.C9704id.icon_blur) {
            $jacocoInit[63] = true;
            this.annotationView.setDrawingMode(C9723c.DRAW_BLUR);
            $jacocoInit[64] = true;
            resetColorSelection();
            $jacocoInit[65] = true;
            DrawableUtils.setDrawableTintColor(this.iconBlur, Instabug.getPrimaryColor());
            $jacocoInit[66] = true;
            hideColorPicker();
            $jacocoInit[67] = true;
        } else if (id != C9700R.C9704id.icon_undo) {
            $jacocoInit[68] = true;
        } else {
            $jacocoInit[69] = true;
            this.annotationView.mo34709d();
            $jacocoInit[70] = true;
            hideColorPicker();
            $jacocoInit[71] = true;
        }
        $jacocoInit[72] = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean[] $jacocoInit = $jacocoInit();
        this.annotationView.setDrawingColor(this.colorPicker.getSelectedColor());
        if (!(parcelable instanceof Bundle)) {
            $jacocoInit[100] = true;
        } else {
            Bundle bundle = (Bundle) parcelable;
            $jacocoInit[101] = true;
            C9723c cVar = (C9723c) bundle.getSerializable(DRAWING_MODE);
            $jacocoInit[102] = true;
            resetColorSelection();
            if (cVar == C9723c.DRAW_BLUR) {
                $jacocoInit[103] = true;
                DrawableUtils.setDrawableTintColor(this.iconBlur, Instabug.getPrimaryColor());
                $jacocoInit[104] = true;
            } else {
                DrawableUtils.setDrawableTintColor(this.iconBrush, Instabug.getPrimaryColor());
                $jacocoInit[105] = true;
            }
            parcelable = bundle.getParcelable(ANNOTATION_LAYOUT);
            $jacocoInit[106] = true;
        }
        super.onRestoreInstanceState(parcelable);
        $jacocoInit[107] = true;
    }

    /* access modifiers changed from: protected */
    @C0195i0
    public Parcelable onSaveInstanceState() {
        boolean[] $jacocoInit = $jacocoInit();
        Bundle bundle = new Bundle();
        $jacocoInit[97] = true;
        bundle.putParcelable(ANNOTATION_LAYOUT, super.onSaveInstanceState());
        $jacocoInit[98] = true;
        bundle.putSerializable(DRAWING_MODE, this.annotationView.getDrawingMode());
        $jacocoInit[99] = true;
        return bundle;
    }

    public void setBaseImage(@C0193h0 Uri uri, @C0195i0 Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        BitmapUtils.loadBitmap(uri.getPath(), this.annotationView, new C9720g(this, runnable));
        $jacocoInit[88] = true;
    }

    public void setBitmap(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        this.annotationView.setImageBitmap(bitmap);
        $jacocoInit[89] = true;
        enableButtons();
        $jacocoInit[90] = true;
        setBorder();
        $jacocoInit[91] = true;
    }

    public AnnotationLayout(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, attributeSet, 0);
        $jacocoInit[1] = true;
    }

    @TargetApi(11)
    public AnnotationLayout(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        $jacocoInit[2] = true;
        initViews();
        $jacocoInit[3] = true;
    }

    @TargetApi(21)
    public AnnotationLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i, i2);
        $jacocoInit[4] = true;
        initViews();
        $jacocoInit[5] = true;
    }
}
