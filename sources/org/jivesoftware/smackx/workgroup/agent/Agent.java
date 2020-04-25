package org.jivesoftware.smackx.workgroup.agent;

import java.util.Collection;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.workgroup.packet.AgentInfo;
import org.jivesoftware.smackx.workgroup.packet.AgentWorkgroups;

public class Agent {
    private XMPPConnection connection;
    private String workgroupJID;

    Agent(XMPPConnection xMPPConnection, String str) {
        this.connection = xMPPConnection;
        this.workgroupJID = str;
    }

    public static Collection<String> getWorkgroups(String str, String str2, XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        AgentWorkgroups agentWorkgroups = new AgentWorkgroups(str2);
        agentWorkgroups.setTo(str);
        return ((AgentWorkgroups) xMPPConnection.createPacketCollectorAndSend(agentWorkgroups).nextResultOrThrow()).getWorkgroups();
    }

    public String getName() throws NoResponseException, XMPPErrorException, NotConnectedException {
        AgentInfo agentInfo = new AgentInfo();
        agentInfo.setType(Type.get);
        agentInfo.setTo(this.workgroupJID);
        agentInfo.setFrom(getUser());
        return ((AgentInfo) this.connection.createPacketCollectorAndSend(agentInfo).nextResultOrThrow()).getName();
    }

    public String getUser() {
        return this.connection.getUser();
    }

    public void setName(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        AgentInfo agentInfo = new AgentInfo();
        agentInfo.setType(Type.set);
        agentInfo.setTo(this.workgroupJID);
        agentInfo.setFrom(getUser());
        agentInfo.setName(str);
        this.connection.createPacketCollectorAndSend(agentInfo).nextResultOrThrow();
    }
}
