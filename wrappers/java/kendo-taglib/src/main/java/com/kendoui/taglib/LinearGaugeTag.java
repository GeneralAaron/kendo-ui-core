
package com.kendoui.taglib;


import com.kendoui.taglib.lineargauge.*;



@SuppressWarnings("serial")
public class LinearGaugeTag extends WidgetTag /* interfaces */implements GaugeArea, Pointer, Scale/* interfaces */ {

    public LinearGaugeTag() {
        super("LinearGauge");
    }

//>> Attributes

    @Override
    public void setGaugeArea(GaugeAreaTag value) {
        setProperty("gaugearea", value.properties());
    }

    @Override
    public void setPointer(PointerTag value) {
        setProperty("pointer", value.properties());
    }

    @Override
    public void setScale(ScaleTag value) {
        setProperty("scale", value.properties());
    }

    public boolean getTransitions() {
        return (boolean)getProperty("transitions");
    }

    public void setTransitions(boolean value) {
        setProperty("transitions", value);
    }

//<< Attributes
}
