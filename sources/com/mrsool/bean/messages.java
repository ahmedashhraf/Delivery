package com.mrsool.bean;

import android.text.TextUtils;
import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class messages implements Serializable {
    private int audioProgressState = 0;
    int audioState = AUDIO_STATE.IDLE.ordinal();
    @C5860a
    @C5862c("bIsAdmin")
    private boolean bIsAdmin;
    @C5860a
    @C5862c("created_at")
    private String created_at;
    private int currentDuration;
    int currentValue = 0;
    @C5860a
    @C5862c("iAddress")
    private String iAddress;
    @C5860a
    @C5862c("iFromUserId")
    private String iFromUserId;
    private String iToOrderID;
    @C5860a
    @C5862c("iToUserId")
    private String iToUserId;
    @C5860a
    @C5862c("id")

    /* renamed from: id */
    private String f27630id;
    @C5860a
    @C5862c("image_type")
    private String imageType;
    private boolean isDateVisible = false;
    private boolean isImageLoaded = true;
    private boolean isSent2Server = true;
    private String messageDate;
    private String messageTime;
    private String orderId;
    private String otherUserProfilePic;
    @C5860a
    @C5862c("read")
    private boolean read;
    private boolean recieved;
    private String sender_username;
    private String stranzaId;
    double totalDuration;
    @C5860a
    @C5862c("txContent")
    private String txContent;
    @C5860a
    @C5862c("vMessageId")
    private String vMessageId;
    @C5860a
    @C5862c("vType")
    private String vType;
    @C5860a
    @C5862c("vtxTitle")
    private String vtxTitle;

    public enum AUDIO_STATE {
        IDLE,
        PLAYING,
        PAUSED,
        DOWNLOADING
    }

    public int getAudioProgressState() {
        return this.audioProgressState;
    }

    public int getAudioState() {
        return this.audioState;
    }

    public long getCreated_at() {
        return getSeenAtTracking(this.created_at);
    }

    public int getCurrentValue() {
        return this.currentValue;
    }

    public String getId() {
        if (TextUtils.isEmpty(this.f27630id)) {
            return this.vMessageId;
        }
        return this.f27630id;
    }

    public String getImageType() {
        return this.imageType;
    }

    public String getMessageDate() {
        return this.messageDate;
    }

    public String getMessageTime() {
        return this.messageTime;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public long getSeenAtTracking(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains(".")) {
            return (long) Double.parseDouble(str);
        }
        return Long.parseLong(str);
    }

    public String getSender_username() {
        return this.sender_username;
    }

    public double getTotalDuration() {
        String str = "duration";
        try {
            JSONObject jSONObject = new JSONObject(this.iAddress);
            if (jSONObject.has(str)) {
                return jSONObject.getDouble(str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.totalDuration;
    }

    public String getTxContent() {
        return this.txContent;
    }

    public String getVtxTitle() {
        return this.vtxTitle;
    }

    public String getiAddress() {
        return this.iAddress;
    }

    public String getiFromUserId() {
        return this.iFromUserId;
    }

    public String getiToOrderID() {
        return this.iToOrderID;
    }

    public String getiToUserId() {
        return this.iToUserId;
    }

    public String getvMessageId() {
        return this.vMessageId;
    }

    public String getvType() {
        return this.vType;
    }

    public boolean isDateVisible() {
        return this.isDateVisible;
    }

    public boolean isImageLoaded() {
        return this.isImageLoaded;
    }

    public boolean isRead() {
        return this.read;
    }

    public boolean isSent2Server() {
        return this.isSent2Server;
    }

    public boolean isbIsAdmin() {
        return this.bIsAdmin;
    }

    public void setAudioProgressState(int i) {
        this.audioProgressState = i;
    }

    public void setAudioState(int i) {
        this.audioState = i;
    }

    public void setCreated_at(String str) {
        this.created_at = str;
    }

    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

    public void setId(String str) {
        this.f27630id = str;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setIsDateVisible(boolean z) {
        this.isDateVisible = z;
    }

    public void setIsImageLoaded(boolean z) {
        this.isImageLoaded = z;
    }

    public void setMessageDate(String str) {
        this.messageDate = str;
    }

    public void setMessageTime(String str) {
        this.messageTime = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setRead(boolean z) {
        this.read = z;
    }

    public void setSender_username(String str) {
        this.sender_username = str;
    }

    public void setSent2Server(boolean z) {
        this.isSent2Server = z;
    }

    public void setTotalDuration(double d) {
        this.totalDuration = d;
    }

    public void setTxContent(String str) {
        this.txContent = str;
    }

    public void setiAddress(String str) {
        this.iAddress = str;
    }

    public void setiFromUserId(String str) {
        this.iFromUserId = str;
    }

    public void setiToOrderID(String str) {
        this.iToOrderID = str;
    }

    public void setiToUserId(String str) {
        this.iToUserId = str;
    }

    public void setvMessageId(String str) {
        this.vMessageId = str;
    }

    public void setvType(String str) {
        this.vType = str;
    }
}
