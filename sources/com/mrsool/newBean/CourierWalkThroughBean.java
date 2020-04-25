package com.mrsool.newBean;

import com.google.gson.p193w.C5862c;
import java.util.ArrayList;

public class CourierWalkThroughBean {
    @C5862c("courier_walkthrough_steps")
    private ArrayList<WalkThroughStepBean> courierWalkthroughSteps = new ArrayList<>();
    @C5862c("offer_screen_label")
    private String offerScreenLabel;

    public ArrayList<WalkThroughStepBean> getCourierWalkthroughSteps() {
        return this.courierWalkthroughSteps;
    }

    public String getOfferScreenLabel() {
        return this.offerScreenLabel;
    }
}
