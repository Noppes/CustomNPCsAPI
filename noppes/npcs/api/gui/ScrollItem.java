package noppes.npcs.api.gui;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public class ScrollItem {
    public int index;
    public final Component text;
    public boolean selected = false;
    private Object associated = null;

    protected ScrollItem(Component text){
        this.text = text;
    }

    public CompoundTag getNbt() {
        CompoundTag comp = new CompoundTag();
        comp.putString("text", Component.Serializer.toJson(text));
        comp.putInt("index", index);
        comp.putBoolean("selected", selected);
        return comp;
    }

    public static ScrollItem create(CompoundTag comp) {
        ScrollItem item = new ScrollItem(Component.Serializer.fromJson(comp.getString("text")));
        item.selected = comp.getBoolean("selected");
        item.index = comp.getInt("index");
        return item;
    }

    public static ScrollItem create(Component text) {
        return new ScrollItem(text);
    }

    public static ScrollItem create(String s) {
        return create(new TranslatableComponent(s));
    }

    public ScrollItem setIndex(int index){
        this.index = index;
        return this;
    }

    public ScrollItem setObject(Object ob){
        this.associated = ob;
        return this;
    }

    public Object getObject(){
        return associated;
    }

    public String getString(){
        if(text == Component.EMPTY){
            return "";
        }
        if(text instanceof TranslatableComponent tc){
            return tc.getKey();
        }
        return text.getString();
    }
}
