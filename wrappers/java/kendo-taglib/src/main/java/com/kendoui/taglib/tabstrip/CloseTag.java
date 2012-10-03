
package com.kendoui.taglib.tabstrip;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class CloseTag extends BaseTag /* interfaces *//* interfaces */ {

//>> Attributes

    @Override
    public int doEndTag() throws JspException {
        Close parent = (Close)findParentWithClass(Close.class);

        parent.setClose(this);

        return super.doEndTag();
    }

    public int getDuration() {
        return (int)getProperty("duration");
    }

    public void setDuration(int value) {
        setProperty("duration", value);
    }

    public String getEffects() {
        return (String)getProperty("effects");
    }

    public void setEffects(String value) {
        setProperty("effects", value);
    }

//<< Attributes
}
