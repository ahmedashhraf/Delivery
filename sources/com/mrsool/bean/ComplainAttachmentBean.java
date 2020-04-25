package com.mrsool.bean;

public class ComplainAttachmentBean {
    private String imageUri;
    private boolean isServerImage;

    public ComplainAttachmentBean(String str) {
        this.imageUri = str;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public boolean isServerImage() {
        return this.isServerImage;
    }

    public void setImageUri(String str) {
        this.imageUri = str;
    }

    public void setServerImage(boolean z) {
        this.isServerImage = z;
    }
}
