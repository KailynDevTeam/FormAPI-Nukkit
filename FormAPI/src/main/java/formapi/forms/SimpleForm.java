package formapi.forms;

import cn.nukkit.Player;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.window.FormWindowSimple;
import formapi.forms.image.ImageType;
import formapi.response.SimpleFormResponse;

public class SimpleForm extends Form {

    public SimpleForm(FormWindowSimple form){
        this.formWindow = form;
    }

    public SimpleForm() {
        formWindow = new FormWindowSimple("", "");
    }

    public SimpleForm(String title) {
        formWindow = new FormWindowSimple(title, "");
    }

    public SimpleForm(String title, String content) {
        formWindow = new FormWindowSimple(title, content);
    }

    public void sendToPlayer(Player player, SimpleFormResponse response) {
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(formWindow);
    }

    public SimpleForm setTitle(String value) {
        ((FormWindowSimple) formWindow).setTitle(value);
        return this;
    }

    public SimpleForm setContent(String value) {
        ((FormWindowSimple) formWindow).setContent(value);
        return this;
    }

    public SimpleForm addContent(String value) {
        ((FormWindowSimple) formWindow).setContent(((FormWindowSimple) formWindow).getContent() + value);
        return this;
    }

    public SimpleForm addContentLine(String value) {
        return addContent(value + "\n");
    }

    public SimpleForm addContentOnNextLine(String value) {
        return addContent("\n" + value);
    }

    public SimpleForm addButton(String text) {
        ((FormWindowSimple) formWindow).addButton(new ElementButton(text));
        return this;
    }

    public SimpleForm addButton(String text, ImageType type, String ico) {
        ((FormWindowSimple) formWindow).addButton(new ElementButton(text, new ElementButtonImageData((type == ImageType.PATH) ? "path" : "url", ico)));
        return this;
    }
}