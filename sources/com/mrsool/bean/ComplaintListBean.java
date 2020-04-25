package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;

public class ComplaintListBean implements Serializable {
    @C5860a
    @C5862c("admin_reply")
    private String admin_reply;
    @C5860a
    @C5862c("admin_reply_at")
    private String admin_reply_at;
    @C5860a
    @C5862c("allow_feedback")
    private boolean allow_feedback;
    @C5860a
    @C5862c("comment")
    private String comment;
    @C5860a
    @C5862c("complainant_feedback")
    private String complainant_feedback;
    @C5862c("complaint_id")
    private String complaint_id;
    @C5860a
    @C5862c("complaint_number")
    private String complaint_number;
    @C5860a
    @C5862c("created_at")
    private String created_at;
    @C5862c("images")
    private C10296images images;
    @C5860a
    @C5862c("is_editable")
    private boolean is_editable;
    @C5862c("order")
    private String order;
    @C5860a
    @C5862c("order_desc")
    private String order_desc;
    @C5860a
    @C5862c("order_id")
    private String order_id;
    @C5860a
    @C5862c("reason")
    private String reason;
    @C5860a
    @C5862c("reason_id")
    private Integer reason_id;
    @C5862c("shop_name")
    private String shop_name;
    @C5862c("shop_pic")
    private String shop_pic;
    @C5860a
    @C5862c("status")
    private String status;
    @C5862c("status_code")
    private Integer status_code;
    @C5860a
    @C5862c("status_color")
    private String status_color;
    @C5860a
    @C5862c("suspect_name")
    private String suspect_name;
    @C5860a
    @C5862c("suspect_pic")
    private String suspect_pic;

    /* renamed from: com.mrsool.bean.ComplaintListBean$images */
    public class C10296images {
        @C5860a
        @C5862c("image1")
        private String image1;
        @C5860a
        @C5862c("image2")
        private String image2;
        @C5860a
        @C5862c("image3")
        private String image3;

        public C10296images() {
        }

        public String getImage1() {
            return this.image1;
        }

        public String getImage2() {
            return this.image2;
        }

        public String getImage3() {
            return this.image3;
        }
    }

    public String getAdmin_reply() {
        return this.admin_reply;
    }

    public String getAdmin_reply_at() {
        return this.admin_reply_at;
    }

    public String getComment() {
        return this.comment;
    }

    public String getComplainant_feedback() {
        return this.complainant_feedback;
    }

    public String getComplaint_id() {
        return this.complaint_id;
    }

    public String getComplaint_number() {
        return this.complaint_number;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public C10296images getImages() {
        return this.images;
    }

    public String getOrder() {
        return this.order;
    }

    public String getOrder_desc() {
        return this.order_desc;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getReason() {
        return this.reason;
    }

    public Integer getReason_id() {
        return this.reason_id;
    }

    public String getShop_name() {
        return this.shop_name;
    }

    public String getShop_pic() {
        return this.shop_pic;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getStatus_code() {
        return this.status_code;
    }

    public String getStatus_color() {
        return this.status_color;
    }

    public String getSuspect_name() {
        return this.suspect_name;
    }

    public String getSuspect_pic() {
        return this.suspect_pic;
    }

    public boolean isAllow_feedback() {
        return this.allow_feedback;
    }

    public boolean is_editable() {
        return this.is_editable;
    }
}
