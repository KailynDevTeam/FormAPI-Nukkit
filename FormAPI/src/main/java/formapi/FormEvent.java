package formapi;

import cn.nukkit.Player;
import cn.nukkit.event.*;
import cn.nukkit.event.player.*;
import cn.nukkit.form.response.*;
import cn.nukkit.form.window.*;
import formapi.forms.*;
import formapi.response.CustomFormResponse;
import formapi.response.ModalFormResponse;
import formapi.response.SimpleFormResponse;

import java.util.*;

public class FormEvent implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Form.formResponseMap.remove(player.getName());
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void responsedForm(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();
        FormWindow window = event.getWindow();
        FormResponse response = window.getResponse();
        Object data;

        if (Form.formResponseMap.containsKey(player.getName())) {
            formapi.response.FormResponse form = Form.formResponseMap.get(player.getName());
            Form.formResponseMap.remove(player.getName());
            if (response == null || event.wasClosed()) {
                if(form instanceof CustomFormResponse) {
                    ((CustomFormResponse) form).handle(player, (FormWindowCustom) window, null);
                }else if(form instanceof ModalFormResponse) {
                    ((ModalFormResponse) form).handle(player, (FormWindowModal) window, -1);
                }else if(form instanceof SimpleFormResponse) {
                    ((SimpleFormResponse) form).handle(player, (FormWindowSimple) window, -1);
                }
                return;
            }

            if (window instanceof FormWindowSimple) {
                data = ((FormResponseSimple) response).getClickedButtonId();
                ((SimpleFormResponse) form).handle(player, (FormWindowSimple) window, (int) data);
            }else
                if (window instanceof FormWindowCustom) {
                data = new ArrayList<Object>(((FormResponseCustom) response).getResponses().values());
                ((CustomFormResponse) form).handle(player, (FormWindowCustom) window, (List<Object>) data);
            }else
                if (window instanceof FormWindowModal) {
                data = ((FormResponseModal) response).getClickedButtonId();
                ((ModalFormResponse) form).handle(player, (FormWindowModal) window, (int) data);
            }
        }
    }
}