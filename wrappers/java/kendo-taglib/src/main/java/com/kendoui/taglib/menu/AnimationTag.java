
package com.kendoui.taglib.menu;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class AnimationTag extends BaseTag /* interfaces *//* interfaces */ {

//>> Attributes

    @Override
    public int doEndTag() throws JspException {
        Animation parent = (Animation)findParentWithClass(Animation.class);

        parent.setAnimation(this);

        return super.doEndTag();
    }

//<< Attributes
}
