package com.instabug.library.p397ui.custom.pagerindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.instabug.library.C9700R;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.custom.pagerindicator.DotIndicator */
public final class DotIndicator extends RelativeLayout implements SelectionIndicator {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final int DEFAULT_DOT_TRANSITION_DURATION_MS = 200;
    private static final int DEFAULT_NUMBER_OF_DOTS = 1;
    private static final int DEFAULT_SELECTED_DOT_COLOR = -1;
    private static final int DEFAULT_SELECTED_DOT_DIAMETER_DP = 9;
    private static final int DEFAULT_SELECTED_DOT_INDEX = 0;
    private static final int DEFAULT_SPACING_BETWEEN_DOTS_DP = 7;
    private static final int DEFAULT_UNSELECTED_DOT_COLOR = -1;
    private static final int DEFAULT_UNSELECTED_DOT_DIAMETER_DP = 6;
    private static final String TAG = "[DotIndicator]";
    private int dotTransitionDuration;
    private final ArrayList<Dot> dots = new ArrayList<>();
    private int numberOfDots;
    private int selectedDotColor;
    private int selectedDotDiameterPx;
    private int selectedDotIndex;
    private int spacingBetweenDotsPx;
    private int unselectedDotColor;
    private int unselectedDotDiameterPx;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3752931709977145715L, "com/instabug/library/ui/custom/pagerindicator/DotIndicator", 92);
        $jacocoData = a;
        return a;
    }

    public DotIndicator(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context);
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
        init(null, 0, 0);
        $jacocoInit[2] = true;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9700R.styleable.IBDotIndicator, i, i2);
        $jacocoInit[12] = true;
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 9.0f);
        $jacocoInit[13] = true;
        int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 6.0f);
        $jacocoInit[14] = true;
        int convertDpToPx3 = ViewUtils.convertDpToPx(getContext(), 7.0f);
        int i3 = C9700R.styleable.IBDotIndicator_ibViewPagerNumberOfDots;
        $jacocoInit[15] = true;
        this.numberOfDots = obtainStyledAttributes.getInt(i3, 1);
        int i4 = C9700R.styleable.IBDotIndicator_ibViewPagerSelectedDotIndex;
        $jacocoInit[16] = true;
        this.selectedDotIndex = obtainStyledAttributes.getInt(i4, 0);
        int i5 = C9700R.styleable.IBDotIndicator_ibViewPagerUnselectedDotDiameter;
        $jacocoInit[17] = true;
        this.unselectedDotDiameterPx = obtainStyledAttributes.getDimensionPixelSize(i5, convertDpToPx2);
        int i6 = C9700R.styleable.IBDotIndicator_ibViewPagerSelectedDotDiameter;
        $jacocoInit[18] = true;
        this.selectedDotDiameterPx = obtainStyledAttributes.getDimensionPixelSize(i6, convertDpToPx);
        $jacocoInit[19] = true;
        this.unselectedDotColor = obtainStyledAttributes.getColor(C9700R.styleable.IBDotIndicator_ibViewPagerUnselectedDotColor, -1);
        int i7 = C9700R.styleable.IBDotIndicator_ibViewPagerSelectedDotColor;
        $jacocoInit[20] = true;
        this.selectedDotColor = obtainStyledAttributes.getColor(i7, -1);
        int i8 = C9700R.styleable.IBDotIndicator_ibViewPagerSpacingBetweenDots;
        $jacocoInit[21] = true;
        this.spacingBetweenDotsPx = obtainStyledAttributes.getDimensionPixelSize(i8, convertDpToPx3);
        int i9 = C9700R.styleable.IBDot_ibViewPagerTransitionDuration;
        $jacocoInit[22] = true;
        this.dotTransitionDuration = obtainStyledAttributes.getDimensionPixelSize(i9, 200);
        $jacocoInit[23] = true;
        obtainStyledAttributes.recycle();
        $jacocoInit[24] = true;
        setLayoutParams(new LayoutParams(-1, -1));
        $jacocoInit[25] = true;
        setGravity(17);
        $jacocoInit[26] = true;
        reflectParametersInView();
        $jacocoInit[27] = true;
    }

    private void reflectParametersInView() {
        boolean[] $jacocoInit = $jacocoInit();
        removeAllViews();
        $jacocoInit[28] = true;
        this.dots.clear();
        $jacocoInit[29] = true;
        int i = 0;
        while (i < this.numberOfDots) {
            $jacocoInit[30] = true;
            Dot dot = new Dot(getContext());
            $jacocoInit[31] = true;
            Dot inactiveDiameterPx = dot.setInactiveDiameterPx(this.unselectedDotDiameterPx);
            int i2 = this.selectedDotDiameterPx;
            $jacocoInit[32] = true;
            Dot activeDiameterPx = inactiveDiameterPx.setActiveDiameterPx(i2);
            int i3 = this.selectedDotColor;
            $jacocoInit[33] = true;
            Dot activeColor = activeDiameterPx.setActiveColor(i3);
            int i4 = this.unselectedDotColor;
            $jacocoInit[34] = true;
            Dot inactiveColor = activeColor.setInactiveColor(i4);
            int i5 = this.dotTransitionDuration;
            $jacocoInit[35] = true;
            inactiveColor.setTransitionDuration(i5);
            if (i == this.selectedDotIndex) {
                $jacocoInit[36] = true;
                dot.setActive(false);
                $jacocoInit[37] = true;
            } else {
                dot.setInactive(false);
                $jacocoInit[38] = true;
            }
            int max = Math.max(this.selectedDotDiameterPx, this.unselectedDotDiameterPx);
            int i6 = (this.spacingBetweenDotsPx + this.unselectedDotDiameterPx) * i;
            $jacocoInit[39] = true;
            LayoutParams layoutParams = new LayoutParams(max, max);
            $jacocoInit[40] = true;
            layoutParams.setMargins(i6, 0, 0, 0);
            if (VERSION.SDK_INT < 17) {
                $jacocoInit[41] = true;
            } else {
                $jacocoInit[42] = true;
                layoutParams.setMarginStart(i6);
                $jacocoInit[43] = true;
            }
            dot.setLayoutParams(layoutParams);
            $jacocoInit[44] = true;
            addView(dot);
            $jacocoInit[45] = true;
            this.dots.add(i, dot);
            i++;
            $jacocoInit[46] = true;
        }
        $jacocoInit[47] = true;
    }

    public int getNumberOfItems() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.numberOfDots;
        $jacocoInit[80] = true;
        return i;
    }

    public int getSelectedDotColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.selectedDotColor;
        $jacocoInit[62] = true;
        return i;
    }

    public int getSelectedDotDiameter() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.selectedDotDiameterPx;
        $jacocoInit[58] = true;
        return i;
    }

    public int getSelectedItemIndex() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.selectedDotIndex;
        $jacocoInit[79] = true;
        return i;
    }

    public int getSpacingBetweenDots() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.spacingBetweenDotsPx;
        $jacocoInit[69] = true;
        return i;
    }

    public int getTransitionDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.dotTransitionDuration;
        $jacocoInit[83] = true;
        return i;
    }

    public int getUnselectedDotColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.unselectedDotColor;
        $jacocoInit[59] = true;
        return i;
    }

    public int getUnselectedDotDiameter() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.unselectedDotDiameterPx;
        $jacocoInit[53] = true;
        return i;
    }

    public boolean isVisible() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (getVisibility() == 0) {
            $jacocoInit[89] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[90] = true;
        }
        $jacocoInit[91] = true;
        return z;
    }

    public void redrawDots() {
        boolean[] $jacocoInit = $jacocoInit();
        reflectParametersInView();
        $jacocoInit[48] = true;
    }

    public void setNumberOfItems(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.numberOfDots = i;
        $jacocoInit[81] = true;
        reflectParametersInView();
        $jacocoInit[82] = true;
    }

    public void setSelectedDotColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.selectedDotColor = i;
        $jacocoInit[63] = true;
        reflectParametersInView();
        $jacocoInit[64] = true;
    }

    public void setSelectedDotDiameterDp(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), (float) i);
        $jacocoInit[56] = true;
        setSelectedDotDiameterPx(convertDpToPx);
        $jacocoInit[57] = true;
    }

    public void setSelectedDotDiameterPx(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.selectedDotDiameterPx = i;
        $jacocoInit[54] = true;
        reflectParametersInView();
        $jacocoInit[55] = true;
    }

    public void setSelectedItem(int i, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.dots.size() <= 0) {
            $jacocoInit[70] = true;
        } else {
            try {
                $jacocoInit[71] = true;
                if (this.selectedDotIndex >= this.dots.size()) {
                    $jacocoInit[72] = true;
                } else {
                    $jacocoInit[73] = true;
                    ((Dot) this.dots.get(this.selectedDotIndex)).setInactive(z);
                    $jacocoInit[74] = true;
                }
                ((Dot) this.dots.get(i)).setActive(z);
                this.selectedDotIndex = i;
                $jacocoInit[77] = true;
            } catch (IndexOutOfBoundsException unused) {
                $jacocoInit[75] = true;
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
                $jacocoInit[76] = true;
                throw indexOutOfBoundsException;
            }
        }
        $jacocoInit[78] = true;
    }

    public void setSpacingBetweenDotsDp(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), (float) i);
        $jacocoInit[67] = true;
        setSpacingBetweenDotsPx(convertDpToPx);
        $jacocoInit[68] = true;
    }

    public void setSpacingBetweenDotsPx(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.spacingBetweenDotsPx = i;
        $jacocoInit[65] = true;
        reflectParametersInView();
        $jacocoInit[66] = true;
    }

    public void setTransitionDuration(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.dotTransitionDuration = i;
        $jacocoInit[84] = true;
        reflectParametersInView();
        $jacocoInit[85] = true;
    }

    public void setUnselectedDotColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.unselectedDotColor = i;
        $jacocoInit[60] = true;
        reflectParametersInView();
        $jacocoInit[61] = true;
    }

    public void setUnselectedDotDiameterDp(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), (float) i);
        $jacocoInit[51] = true;
        setUnselectedDotDiameterPx(convertDpToPx);
        $jacocoInit[52] = true;
    }

    public void setUnselectedDotDiameterPx(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.unselectedDotDiameterPx = i;
        $jacocoInit[49] = true;
        reflectParametersInView();
        $jacocoInit[50] = true;
    }

    public void setVisibility(boolean z) {
        int i;
        boolean[] $jacocoInit = $jacocoInit();
        if (z) {
            i = 0;
            $jacocoInit[86] = true;
        } else {
            i = 4;
            $jacocoInit[87] = true;
        }
        setVisibility(i);
        $jacocoInit[88] = true;
    }

    public DotIndicator(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet);
        $jacocoInit[3] = true;
        $jacocoInit[4] = true;
        init(attributeSet, 0, 0);
        $jacocoInit[5] = true;
    }

    public DotIndicator(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        $jacocoInit[6] = true;
        $jacocoInit[7] = true;
        init(attributeSet, i, 0);
        $jacocoInit[8] = true;
    }

    @TargetApi(21)
    public DotIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i, i2);
        $jacocoInit[9] = true;
        $jacocoInit[10] = true;
        init(attributeSet, i, i2);
        $jacocoInit[11] = true;
    }
}
