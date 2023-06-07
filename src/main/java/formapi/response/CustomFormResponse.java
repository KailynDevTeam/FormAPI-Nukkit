package formapi.response;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindowCustom;
import formapi.response.FormResponse;

import java.util.List;

public interface CustomFormResponse extends FormResponse {

    void handle(Player p, FormWindowCustom f, List<Object> d);

}
