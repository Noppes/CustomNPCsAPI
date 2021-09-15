package noppes.npcs.api.gui;

public interface ITextField extends ICustomGuiComponent {

    int getWidth();
    int getHeight();
    ITextField setSize(int width, int height);

    String getText();
    ITextField setText(String defaultText);
    
    void setEnabled(boolean bo);
    boolean getEnabled();

}
