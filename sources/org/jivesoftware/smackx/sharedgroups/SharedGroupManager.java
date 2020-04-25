package org.jivesoftware.smackx.sharedgroups;

import java.util.List;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.sharedgroups.packet.SharedGroupsInfo;

public class SharedGroupManager {
    public static List<String> getSharedGroups(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        SharedGroupsInfo sharedGroupsInfo = new SharedGroupsInfo();
        sharedGroupsInfo.setType(Type.get);
        return ((SharedGroupsInfo) xMPPConnection.createPacketCollectorAndSend(sharedGroupsInfo).nextResultOrThrow()).getGroups();
    }
}
