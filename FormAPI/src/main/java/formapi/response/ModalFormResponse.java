package formapi.response;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowModal;
import formapi.response.FormResponse;

public interface ModalFormResponse extends FormResponse {

    void handle(Player p, FormWindowModal f, int data);

}
