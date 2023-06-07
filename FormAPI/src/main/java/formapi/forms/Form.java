package formapi.forms;

import cn.nukkit.Player;
import cn.nukkit.form.window.FormWindow;
import formapi.response.*;

import java.util.*;

public abstract class Form {

    public static HashMap<String, FormResponse> formResponseMap = new HashMap<>();
    protected FormWindow formWindow;

    public void sendToPlayer(Player player) {
        player.showFormWindow(formWindow);
    }

    public static void sendToPlayer(Player player, FormWindow form, SimpleFormResponse response) {
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(form);
    }

    public static void sendToPlayer(Player player, FormWindow form, CustomFormResponse response) {
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(form);
    }

    public static void sendToPlayer(Player player, FormWindow form, ModalFormResponse response) {
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(form);
    }
}