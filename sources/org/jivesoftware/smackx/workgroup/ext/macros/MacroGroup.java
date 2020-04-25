package org.jivesoftware.smackx.workgroup.ext.macros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MacroGroup {
    private List<MacroGroup> macroGroups = new ArrayList();
    private List<Macro> macros = new ArrayList();
    private String title;

    public void addMacro(Macro macro) {
        this.macros.add(macro);
    }

    public void addMacroGroup(MacroGroup macroGroup) {
        this.macroGroups.add(macroGroup);
    }

    public Macro getMacro(int i) {
        return (Macro) this.macros.get(i);
    }

    public Macro getMacroByTitle(String str) {
        for (Macro macro : Collections.unmodifiableList(this.macros)) {
            if (macro.getTitle().equalsIgnoreCase(str)) {
                return macro;
            }
        }
        return null;
    }

    public MacroGroup getMacroGroup(int i) {
        return (MacroGroup) this.macroGroups.get(i);
    }

    public MacroGroup getMacroGroupByTitle(String str) {
        for (MacroGroup macroGroup : Collections.unmodifiableList(this.macroGroups)) {
            if (macroGroup.getTitle().equalsIgnoreCase(str)) {
                return macroGroup;
            }
        }
        return null;
    }

    public List<MacroGroup> getMacroGroups() {
        return this.macroGroups;
    }

    public List<Macro> getMacros() {
        return this.macros;
    }

    public String getTitle() {
        return this.title;
    }

    public void removeMacro(Macro macro) {
        this.macros.remove(macro);
    }

    public void removeMacroGroup(MacroGroup macroGroup) {
        this.macroGroups.remove(macroGroup);
    }

    public void setMacroGroups(List<MacroGroup> list) {
        this.macroGroups = list;
    }

    public void setMacros(List<Macro> list) {
        this.macros = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<macrogroup>");
        StringBuilder sb2 = new StringBuilder();
        String str = "<title>";
        sb2.append(str);
        sb2.append(getTitle());
        String str2 = "</title>";
        sb2.append(str2);
        sb.append(sb2.toString());
        sb.append("<macros>");
        for (Macro macro : getMacros()) {
            sb.append("<macro>");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(macro.getTitle());
            sb3.append(str2);
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<type>");
            sb4.append(macro.getType());
            sb4.append("</type>");
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<description>");
            sb5.append(macro.getDescription());
            sb5.append("</description>");
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<response>");
            sb6.append(macro.getResponse());
            sb6.append("</response>");
            sb.append(sb6.toString());
            sb.append("</macro>");
        }
        sb.append("</macros>");
        if (getMacroGroups().size() > 0) {
            sb.append("<macroGroups>");
            for (MacroGroup xml : getMacroGroups()) {
                sb.append(xml.toXML());
            }
            sb.append("</macroGroups>");
        }
        sb.append("</macrogroup>");
        return sb.toString();
    }
}
