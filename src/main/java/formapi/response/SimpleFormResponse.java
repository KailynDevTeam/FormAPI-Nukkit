package formapi.response;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowSimple;
import formapi.response.FormResponse;

public interface SimpleFormResponse extends FormResponse {

    void handle(Player p, FormWindowSimple f, int data);

}
