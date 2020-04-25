package org.jivesoftware.smackx.workgroup.agent;

public class TransferRequest extends OfferContent {
    private String inviter;
    private String reason;
    private String room;

    public TransferRequest(String str, String str2, String str3) {
        this.inviter = str;
        this.room = str2;
        this.reason = str3;
    }

    public String getInviter() {
        return this.inviter;
    }

    public String getReason() {
        return this.reason;
    }

    public String getRoom() {
        return this.room;
    }

    /* access modifiers changed from: 0000 */
    public boolean isInvitation() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean isTransfer() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean isUserRequest() {
        return false;
    }
}
