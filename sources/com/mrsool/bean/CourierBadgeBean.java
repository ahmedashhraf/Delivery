package com.mrsool.bean;

import com.google.gson.p193w.C5862c;

public class CourierBadgeBean extends ResponseBean {
    @C5862c("user")
    private CourierUserBean user;

    public String getAddSponsorPopupButtonLabel() {
        return this.user.sponsor.popupLabels.buttonLabel;
    }

    public String getAddSponsorPopupHeaderLabel() {
        return this.user.sponsor.popupLabels.header;
    }

    public String getAddSponsorPopupPlaceholderLabel() {
        return this.user.sponsor.popupLabels.placeholder;
    }

    public String getAddSponsorValueLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.addValueLabel : "";
    }

    public String getAddValueUntilPopupButtonLabel() {
        return this.user.validUntil.popupLabels.buttonLabel;
    }

    public String getAddValueUntilPopupHeaderLabel() {
        return this.user.validUntil.popupLabels.header;
    }

    public String getAddValueUntilPopupPlaceholderLabel() {
        return this.user.validUntil.popupLabels.placeholder;
    }

    public String getAddValueUntilValueLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.addValueLabel : "";
    }

    public String getBadgeDateLabel() {
        return this.user.badgeDate.label;
    }

    public String getBadgeDateValue() {
        return this.user.badgeDate.value;
    }

    public String getBadgeFooter() {
        return this.user.badgeFooter;
    }

    public String getBadgeHeader() {
        return this.user.badgeHeader;
    }

    public String getCourierIdLabel() {
        return this.user.courierId.label;
    }

    public String getCourierIdValue() {
        return this.user.courierId.value;
    }

    public String getFullName() {
        return this.user.fullName;
    }

    public String getOrdersNumber() {
        return this.user.ordersNumber;
    }

    public String getProfilePictureUrl() {
        return this.user.profilePictureUrl;
    }

    public Float getRating() {
        try {
            return Float.valueOf(Float.parseFloat(this.user.rating));
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean getShowAddSponsor() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        if (courierSponsorDetailsBean != null) {
            Boolean bool = courierSponsorDetailsBean.showAdd;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean getShowAddValidUntil() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        if (courierSponsorDetailsBean != null) {
            Boolean bool = courierSponsorDetailsBean.showAdd;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean getShowSponsorBlock() {
        return this.user.sponsor.label != null;
    }

    public boolean getShowSponsorSection() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        return (courierSponsorDetailsBean == null || courierSponsorDetailsBean.label == null) ? false : true;
    }

    public boolean getShowValidUntilBlock() {
        return this.user.validUntil.label != null;
    }

    public boolean getShowValidUntilSection() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        return (courierSponsorDetailsBean == null || courierSponsorDetailsBean.label == null) ? false : true;
    }

    public String getSponsorLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.label : "";
    }

    public String getSponsorValue() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.value : "";
    }

    public String getSponsorValueNotAvailableLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.sponsor;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.valueNotAvailableLabel : "";
    }

    public String getStatusLabel() {
        return this.user.status.label;
    }

    public String getStatusValue() {
        return this.user.status.value;
    }

    public String getValidUntilLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.label : "";
    }

    public String getValidUntilValue() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.value : "";
    }

    public String getValueUntilValueNotAvailableLabel() {
        CourierSponsorDetailsBean courierSponsorDetailsBean = this.user.validUntil;
        return courierSponsorDetailsBean != null ? courierSponsorDetailsBean.valueNotAvailableLabel : "";
    }
}
