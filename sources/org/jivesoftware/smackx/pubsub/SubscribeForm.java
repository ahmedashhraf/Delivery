package org.jivesoftware.smackx.pubsub;

import com.facebook.internal.ServerProtocol;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UnknownFormatConversionException;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p486d.p487a.C14051a;

public class SubscribeForm extends Form {
    public SubscribeForm(DataForm dataForm) {
        super(dataForm);
    }

    private void addField(SubscribeOptionFields subscribeOptionFields, Type type) {
        String fieldName = subscribeOptionFields.getFieldName();
        if (getField(fieldName) == null) {
            FormField formField = new FormField(fieldName);
            formField.setType(type);
            addField(formField);
        }
    }

    private String getFieldValue(SubscribeOptionFields subscribeOptionFields) {
        return (String) getField(subscribeOptionFields.getFieldName()).getValues().get(0);
    }

    private List<String> getFieldValues(SubscribeOptionFields subscribeOptionFields) {
        return getField(subscribeOptionFields.getFieldName()).getValues();
    }

    private static boolean parseBoolean(String str) {
        return "1".equals(str) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(str);
    }

    public int getDigestFrequency() {
        return Integer.parseInt(getFieldValue(SubscribeOptionFields.digest_frequency));
    }

    public Date getExpiry() {
        String fieldValue = getFieldValue(SubscribeOptionFields.expire);
        try {
            return C14051a.m60631e(fieldValue);
        } catch (ParseException e) {
            UnknownFormatConversionException unknownFormatConversionException = new UnknownFormatConversionException(fieldValue);
            unknownFormatConversionException.initCause(e);
            throw unknownFormatConversionException;
        }
    }

    public List<PresenceState> getShowValues() {
        ArrayList arrayList = new ArrayList(5);
        for (String valueOf : getFieldValues(SubscribeOptionFields.show_values)) {
            arrayList.add(PresenceState.valueOf(valueOf));
        }
        return arrayList;
    }

    public boolean isDeliverOn() {
        return parseBoolean(getFieldValue(SubscribeOptionFields.deliver));
    }

    public boolean isDigestOn() {
        return parseBoolean(getFieldValue(SubscribeOptionFields.digest));
    }

    public boolean isIncludeBody() {
        return parseBoolean(getFieldValue(SubscribeOptionFields.include_body));
    }

    public void setDeliverOn(boolean z) {
        addField(SubscribeOptionFields.deliver, Type.bool);
        setAnswer(SubscribeOptionFields.deliver.getFieldName(), z);
    }

    public void setDigestFrequency(int i) {
        addField(SubscribeOptionFields.digest_frequency, Type.text_single);
        setAnswer(SubscribeOptionFields.digest_frequency.getFieldName(), i);
    }

    public void setDigestOn(boolean z) {
        addField(SubscribeOptionFields.deliver, Type.bool);
        setAnswer(SubscribeOptionFields.deliver.getFieldName(), z);
    }

    public void setExpiry(Date date) {
        addField(SubscribeOptionFields.expire, Type.text_single);
        setAnswer(SubscribeOptionFields.expire.getFieldName(), C14051a.m60622a(date));
    }

    public void setIncludeBody(boolean z) {
        addField(SubscribeOptionFields.include_body, Type.bool);
        setAnswer(SubscribeOptionFields.include_body.getFieldName(), z);
    }

    public void setShowValues(Collection<PresenceState> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (PresenceState presenceState : collection) {
            arrayList.add(presenceState.toString());
        }
        addField(SubscribeOptionFields.show_values, Type.list_multi);
        setAnswer(SubscribeOptionFields.show_values.getFieldName(), (List<String>) arrayList);
    }

    public SubscribeForm(Form form) {
        super(form.getDataFormToSend());
    }

    public SubscribeForm(DataForm.Type type) {
        super(type);
    }
}
