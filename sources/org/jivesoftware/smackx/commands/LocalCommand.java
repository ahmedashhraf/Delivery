package org.jivesoftware.smackx.commands;

import org.jivesoftware.smackx.commands.packet.AdHocCommandData;

public abstract class LocalCommand extends AdHocCommand {
    private long creationDate = System.currentTimeMillis();
    private int currenStage = -1;
    private String ownerJID;
    private String sessionID;

    /* access modifiers changed from: 0000 */
    public void decrementStage() {
        this.currenStage--;
    }

    public long getCreationDate() {
        return this.creationDate;
    }

    public int getCurrentStage() {
        return this.currenStage;
    }

    public String getOwnerJID() {
        return this.ownerJID;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public abstract boolean hasPermission(String str);

    /* access modifiers changed from: 0000 */
    public void incrementStage() {
        this.currenStage++;
    }

    public abstract boolean isLastStage();

    /* access modifiers changed from: 0000 */
    public void setData(AdHocCommandData adHocCommandData) {
        adHocCommandData.setSessionID(this.sessionID);
        super.setData(adHocCommandData);
    }

    public void setOwnerJID(String str) {
        this.ownerJID = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
        getData().setSessionID(str);
    }
}
