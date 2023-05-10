 package noppes.npcs.api.gui;

 import noppes.npcs.api.function.gui.GuiComponentUpdate;

 public interface ISlider extends ICustomGuiComponent {

    float getValue();
    ISlider setValue(float value);

    String getFormat();
    ISlider setFormat(String format);

    float getMin();
    ISlider setMin(float min);

    float getMax();
    ISlider setMax(float max);

    int getDecimals();
    ISlider setDecimals(int i);

     ISlider setOnChange(GuiComponentUpdate<ISlider> onChange);
}
