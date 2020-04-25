package org.jivesoftware.smackx.pubsub;

import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class ConfigureForm extends Form {
    public ConfigureForm(DataForm dataForm) {
        super(dataForm);
    }

    private void addField(ConfigureNodeFields configureNodeFields, Type type) {
        String fieldName = configureNodeFields.getFieldName();
        if (getField(fieldName) == null) {
            FormField formField = new FormField(fieldName);
            formField.setType(type);
            addField(formField);
        }
    }

    private String getFieldValue(ConfigureNodeFields configureNodeFields) {
        FormField field = getField(configureNodeFields.getFieldName());
        if (field.getValues().isEmpty()) {
            return null;
        }
        return (String) field.getValues().get(0);
    }

    private List<String> getFieldValues(ConfigureNodeFields configureNodeFields) {
        return getField(configureNodeFields.getFieldName()).getValues();
    }

    private List<String> getListSingle(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        return arrayList;
    }

    private static boolean parseBoolean(String str) {
        return "1".equals(str) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(str);
    }

    public AccessModel getAccessModel() {
        String fieldValue = getFieldValue(ConfigureNodeFields.access_model);
        if (fieldValue == null) {
            return null;
        }
        return AccessModel.valueOf(fieldValue);
    }

    public String getBodyXSLT() {
        return getFieldValue(ConfigureNodeFields.body_xslt);
    }

    public List<String> getChildren() {
        return getFieldValues(ConfigureNodeFields.children);
    }

    public ChildrenAssociationPolicy getChildrenAssociationPolicy() {
        String fieldValue = getFieldValue(ConfigureNodeFields.children_association_policy);
        if (fieldValue == null) {
            return null;
        }
        return ChildrenAssociationPolicy.valueOf(fieldValue);
    }

    public List<String> getChildrenAssociationWhitelist() {
        return getFieldValues(ConfigureNodeFields.children_association_whitelist);
    }

    public int getChildrenMax() {
        return Integer.parseInt(getFieldValue(ConfigureNodeFields.children_max));
    }

    public String getCollection() {
        return getFieldValue(ConfigureNodeFields.collection);
    }

    public String getDataType() {
        return getFieldValue(ConfigureNodeFields.type);
    }

    public String getDataformXSLT() {
        return getFieldValue(ConfigureNodeFields.dataform_xslt);
    }

    public ItemReply getItemReply() {
        String fieldValue = getFieldValue(ConfigureNodeFields.itemreply);
        if (fieldValue == null) {
            return null;
        }
        return ItemReply.valueOf(fieldValue);
    }

    public int getMaxItems() {
        return Integer.parseInt(getFieldValue(ConfigureNodeFields.max_items));
    }

    public int getMaxPayloadSize() {
        return Integer.parseInt(getFieldValue(ConfigureNodeFields.max_payload_size));
    }

    public NodeType getNodeType() {
        String fieldValue = getFieldValue(ConfigureNodeFields.node_type);
        if (fieldValue == null) {
            return null;
        }
        return NodeType.valueOf(fieldValue);
    }

    public PublishModel getPublishModel() {
        String fieldValue = getFieldValue(ConfigureNodeFields.publish_model);
        if (fieldValue == null) {
            return null;
        }
        return PublishModel.valueOf(fieldValue);
    }

    public List<String> getReplyRoom() {
        return getFieldValues(ConfigureNodeFields.replyroom);
    }

    public List<String> getReplyTo() {
        return getFieldValues(ConfigureNodeFields.replyto);
    }

    public List<String> getRosterGroupsAllowed() {
        return getFieldValues(ConfigureNodeFields.roster_groups_allowed);
    }

    public String getTitle() {
        return getFieldValue(ConfigureNodeFields.title);
    }

    public boolean isDeliverPayloads() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.deliver_payloads));
    }

    public boolean isNotifyConfig() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.notify_config));
    }

    public boolean isNotifyDelete() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.notify_delete));
    }

    public boolean isNotifyRetract() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.notify_retract));
    }

    public boolean isPersistItems() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.persist_items));
    }

    public boolean isPresenceBasedDelivery() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.presence_based_delivery));
    }

    @Deprecated
    public boolean isSubscibe() {
        return isSubscribe();
    }

    public boolean isSubscribe() {
        return parseBoolean(getFieldValue(ConfigureNodeFields.subscribe));
    }

    public void setAccessModel(AccessModel accessModel) {
        addField(ConfigureNodeFields.access_model, Type.list_single);
        setAnswer(ConfigureNodeFields.access_model.getFieldName(), getListSingle(accessModel.toString()));
    }

    public void setBodyXSLT(String str) {
        addField(ConfigureNodeFields.body_xslt, Type.text_single);
        setAnswer(ConfigureNodeFields.body_xslt.getFieldName(), str);
    }

    public void setChildren(List<String> list) {
        addField(ConfigureNodeFields.children, Type.text_multi);
        setAnswer(ConfigureNodeFields.children.getFieldName(), list);
    }

    public void setChildrenAssociationPolicy(ChildrenAssociationPolicy childrenAssociationPolicy) {
        addField(ConfigureNodeFields.children_association_policy, Type.list_single);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(childrenAssociationPolicy.toString());
        setAnswer(ConfigureNodeFields.children_association_policy.getFieldName(), (List<String>) arrayList);
    }

    public void setChildrenAssociationWhitelist(List<String> list) {
        addField(ConfigureNodeFields.children_association_whitelist, Type.jid_multi);
        setAnswer(ConfigureNodeFields.children_association_whitelist.getFieldName(), list);
    }

    public void setChildrenMax(int i) {
        addField(ConfigureNodeFields.children_max, Type.text_single);
        setAnswer(ConfigureNodeFields.children_max.getFieldName(), i);
    }

    public void setCollection(String str) {
        addField(ConfigureNodeFields.collection, Type.text_single);
        setAnswer(ConfigureNodeFields.collection.getFieldName(), str);
    }

    public void setDataType(String str) {
        addField(ConfigureNodeFields.type, Type.text_single);
        setAnswer(ConfigureNodeFields.type.getFieldName(), str);
    }

    public void setDataformXSLT(String str) {
        addField(ConfigureNodeFields.dataform_xslt, Type.text_single);
        setAnswer(ConfigureNodeFields.dataform_xslt.getFieldName(), str);
    }

    public void setDeliverPayloads(boolean z) {
        addField(ConfigureNodeFields.deliver_payloads, Type.bool);
        setAnswer(ConfigureNodeFields.deliver_payloads.getFieldName(), z);
    }

    public void setItemReply(ItemReply itemReply) {
        addField(ConfigureNodeFields.itemreply, Type.list_single);
        setAnswer(ConfigureNodeFields.itemreply.getFieldName(), getListSingle(itemReply.toString()));
    }

    public void setMaxItems(int i) {
        addField(ConfigureNodeFields.max_items, Type.text_single);
        setAnswer(ConfigureNodeFields.max_items.getFieldName(), i);
    }

    public void setMaxPayloadSize(int i) {
        addField(ConfigureNodeFields.max_payload_size, Type.text_single);
        setAnswer(ConfigureNodeFields.max_payload_size.getFieldName(), i);
    }

    public void setNodeType(NodeType nodeType) {
        addField(ConfigureNodeFields.node_type, Type.list_single);
        setAnswer(ConfigureNodeFields.node_type.getFieldName(), getListSingle(nodeType.toString()));
    }

    public void setNotifyConfig(boolean z) {
        addField(ConfigureNodeFields.notify_config, Type.bool);
        setAnswer(ConfigureNodeFields.notify_config.getFieldName(), z);
    }

    public void setNotifyDelete(boolean z) {
        addField(ConfigureNodeFields.notify_delete, Type.bool);
        setAnswer(ConfigureNodeFields.notify_delete.getFieldName(), z);
    }

    public void setNotifyRetract(boolean z) {
        addField(ConfigureNodeFields.notify_retract, Type.bool);
        setAnswer(ConfigureNodeFields.notify_retract.getFieldName(), z);
    }

    public void setPersistentItems(boolean z) {
        addField(ConfigureNodeFields.persist_items, Type.bool);
        setAnswer(ConfigureNodeFields.persist_items.getFieldName(), z);
    }

    public void setPresenceBasedDelivery(boolean z) {
        addField(ConfigureNodeFields.presence_based_delivery, Type.bool);
        setAnswer(ConfigureNodeFields.presence_based_delivery.getFieldName(), z);
    }

    public void setPublishModel(PublishModel publishModel) {
        addField(ConfigureNodeFields.publish_model, Type.list_single);
        setAnswer(ConfigureNodeFields.publish_model.getFieldName(), getListSingle(publishModel.toString()));
    }

    public void setReplyRoom(List<String> list) {
        addField(ConfigureNodeFields.replyroom, Type.list_multi);
        setAnswer(ConfigureNodeFields.replyroom.getFieldName(), list);
    }

    public void setReplyTo(List<String> list) {
        addField(ConfigureNodeFields.replyto, Type.list_multi);
        setAnswer(ConfigureNodeFields.replyto.getFieldName(), list);
    }

    public void setRosterGroupsAllowed(List<String> list) {
        addField(ConfigureNodeFields.roster_groups_allowed, Type.list_multi);
        setAnswer(ConfigureNodeFields.roster_groups_allowed.getFieldName(), list);
    }

    public void setSubscribe(boolean z) {
        addField(ConfigureNodeFields.subscribe, Type.bool);
        setAnswer(ConfigureNodeFields.subscribe.getFieldName(), z);
    }

    public void setTitle(String str) {
        addField(ConfigureNodeFields.title, Type.text_single);
        setAnswer(ConfigureNodeFields.title.getFieldName(), str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfigureForm.class.getName());
        sb.append(" Content [");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (FormField formField : getFields()) {
            sb2.append('(');
            sb2.append(formField.getVariable());
            sb2.append(':');
            StringBuilder sb3 = new StringBuilder();
            for (String str : formField.getValues()) {
                if (sb3.length() > 0) {
                    sb2.append(',');
                }
                sb3.append(str);
            }
            if (sb3.length() == 0) {
                sb3.append("NOT SET");
            }
            sb2.append(sb3);
            sb2.append(')');
        }
        sb2.append(']');
        return sb2.toString();
    }

    public ConfigureForm(Form form) {
        super(form.getDataFormToSend());
    }

    public ConfigureForm(DataForm.Type type) {
        super(type);
    }
}
