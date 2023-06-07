package formapi.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowModal;
import formapi.response.ModalFormResponse;

public class ModalForm extends Form {

    public ModalForm(FormWindowModal form) {
        this.formWindow = form;
    }

    public ModalForm() {
        formWindow = new FormWindowModal("", "", "", "");
    }

    public ModalForm(String title) {
        formWindow = new FormWindowModal(title, "", "", "");
    }

    public ModalForm(String title, String content) {
        formWindow = new FormWindowModal(title, content, "", "");
    }

    public ModalForm(String title, String content, String trueButton) {
        formWindow = new FormWindowModal(title, content, trueButton, "");
    }

    public ModalForm(String title, String content, String trueButton, String falseButton) {
        formWindow = new FormWindowModal(title, content, trueButton, falseButton);
    }

    public void sendToPlayer(Player player, ModalFormResponse response) {
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(formWindow);
    }

    public ModalForm setTitle(String value) {
        ((FormWindowModal) formWindow).setTitle(value);

        return this;
    }

    public ModalForm setContent(String value) {
        ((FormWindowModal) formWindow).setContent(value);
        return this;
    }

    public ModalForm setButton1(String value) {
        ((FormWindowModal) formWindow).setButton1(value);
        return this;
    }

    public ModalForm setButton2(String value) {
        ((FormWindowModal) formWindow).setButton2(value);
        return this;
    }
}