package org.jivesoftware.smackx.xdata;

import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class Form {
    private DataForm dataForm;

    /* renamed from: org.jivesoftware.smackx.xdata.Form$1 */
    static /* synthetic */ class C157411 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.jivesoftware.smackx.xdata.FormField$Type[] r0 = org.jivesoftware.smackx.xdata.FormField.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.text_multi     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.text_private     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.text_single     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.jid_single     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.hidden     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x004b }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.jid_multi     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0056 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.list_multi     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0062 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.list_single     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdata.Form.C157411.<clinit>():void");
        }
    }

    public Form(DataForm dataForm2) {
        this.dataForm = dataForm2;
    }

    public static Form getFormFrom(Stanza stanza) {
        DataForm from = DataForm.from(stanza);
        if (from == null || from.getReportedData() != null) {
            return null;
        }
        return new Form(from);
    }

    private boolean isFormType() {
        return DataForm.Type.form == this.dataForm.getType();
    }

    private boolean isSubmitType() {
        return DataForm.Type.submit == this.dataForm.getType();
    }

    private static void validateThatFieldIsText(FormField formField) {
        int i = C157411.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[formField.getType().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException("This field is not of type text (multi, private or single).");
        }
    }

    public void addField(FormField formField) {
        this.dataForm.addField(formField);
    }

    public Form createAnswerForm() {
        if (isFormType()) {
            Form form = new Form(DataForm.Type.submit);
            for (FormField formField : getFields()) {
                if (formField.getVariable() != null) {
                    FormField formField2 = new FormField(formField.getVariable());
                    formField2.setType(formField.getType());
                    form.addField(formField2);
                    if (formField.getType() == Type.hidden) {
                        ArrayList arrayList = new ArrayList();
                        for (String add : formField.getValues()) {
                            arrayList.add(add);
                        }
                        form.setAnswer(formField.getVariable(), (List<String>) arrayList);
                    }
                }
            }
            return form;
        }
        throw new IllegalStateException("Only forms of type \"form\" could be answered");
    }

    public DataForm getDataFormToSend() {
        if (!isSubmitType()) {
            return this.dataForm;
        }
        DataForm dataForm2 = new DataForm(getType());
        for (FormField formField : getFields()) {
            if (!formField.getValues().isEmpty()) {
                dataForm2.addField(formField);
            }
        }
        return dataForm2;
    }

    public FormField getField(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("Variable must not be null or blank.");
        }
        for (FormField formField : getFields()) {
            if (str.equals(formField.getVariable())) {
                return formField;
            }
        }
        return null;
    }

    public List<FormField> getFields() {
        return this.dataForm.getFields();
    }

    public String getInstructions() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.dataForm.getInstructions().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String getTitle() {
        return this.dataForm.getTitle();
    }

    public DataForm.Type getType() {
        return this.dataForm.getType();
    }

    public void setAnswer(String str, String str2) {
        FormField field = getField(str);
        if (field != null) {
            int i = C157411.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[field.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                setAnswer(field, (Object) str2);
                return;
            }
            throw new IllegalArgumentException("This field is not of type String.");
        }
        throw new IllegalArgumentException("Field not found for the specified variable name.");
    }

    public void setDefaultAnswer(String str) {
        if (isSubmitType()) {
            FormField field = getField(str);
            if (field != null) {
                field.resetValues();
                for (String addValue : field.getValues()) {
                    field.addValue(addValue);
                }
                return;
            }
            throw new IllegalArgumentException("Couldn't find a field for the specified variable.");
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }

    public void setInstructions(String str) {
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\n");
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        this.dataForm.setInstructions(arrayList);
    }

    public void setTitle(String str) {
        this.dataForm.setTitle(str);
    }

    public Form(DataForm.Type type) {
        this.dataForm = new DataForm(type);
    }

    public void setAnswer(String str, int i) {
        FormField field = getField(str);
        if (field != null) {
            validateThatFieldIsText(field);
            setAnswer(field, (Object) Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("Field not found for the specified variable name.");
    }

    public void setAnswer(String str, long j) {
        FormField field = getField(str);
        if (field != null) {
            validateThatFieldIsText(field);
            setAnswer(field, (Object) Long.valueOf(j));
            return;
        }
        throw new IllegalArgumentException("Field not found for the specified variable name.");
    }

    public void setAnswer(String str, float f) {
        FormField field = getField(str);
        if (field != null) {
            validateThatFieldIsText(field);
            setAnswer(field, (Object) Float.valueOf(f));
            return;
        }
        throw new IllegalArgumentException("Field not found for the specified variable name.");
    }

    public void setAnswer(String str, double d) {
        FormField field = getField(str);
        if (field != null) {
            validateThatFieldIsText(field);
            setAnswer(field, (Object) Double.valueOf(d));
            return;
        }
        throw new IllegalArgumentException("Field not found for the specified variable name.");
    }

    public void setAnswer(String str, boolean z) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        } else if (field.getType() == Type.bool) {
            setAnswer(field, (Object) z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            throw new IllegalArgumentException("This field is not of type boolean.");
        }
    }

    private void setAnswer(FormField formField, Object obj) {
        if (isSubmitType()) {
            formField.resetValues();
            formField.addValue(obj.toString());
            return;
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }

    public void setAnswer(String str, List<String> list) {
        if (isSubmitType()) {
            FormField field = getField(str);
            if (field != null) {
                int i = C157411.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[field.getType().ordinal()];
                if (i == 1 || i == 5 || i == 6 || i == 7 || i == 8) {
                    field.resetValues();
                    field.addValues(list);
                    return;
                }
                throw new IllegalArgumentException("This field only accept list of values.");
            }
            throw new IllegalArgumentException("Couldn't find a field for the specified variable.");
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }
}
