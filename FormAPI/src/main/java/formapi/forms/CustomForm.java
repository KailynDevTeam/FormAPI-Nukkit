package formapi.forms;

import cn.nukkit.Player;
import cn.nukkit.form.element.*;
import cn.nukkit.form.window.FormWindowCustom;
import formapi.response.CustomFormResponse;

import java.util.*;

public class CustomForm extends Form {

    public CustomForm(FormWindowCustom form) {
        this.formWindow = form;
    }

    public CustomForm() {
        formWindow = new FormWindowCustom("");
    }

    public CustomForm(String title) {
        formWindow = new FormWindowCustom(title);
    }

    public void sendToPlayer(Player player, CustomFormResponse response){
        formResponseMap.put(player.getName(), response);
        player.showFormWindow(formWindow);
    }

    public CustomForm setTitle(String value) {
        ((FormWindowCustom) formWindow).setTitle(value);
        return this;
    }

    public CustomForm addLabel(String value) {
        ((FormWindowCustom) formWindow).addElement(new ElementLabel(value));
        return this;
    }

    public CustomForm addInput() {
        ElementInput element = new ElementInput("");
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addInput(String name) {
        ElementInput element = new ElementInput(name);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addInput(String name, String exampleText) {
        ElementInput element = new ElementInput(name, exampleText);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addInput(String name, String exampleText, String defaultText) {
        ElementInput element = new ElementInput(name, exampleText, defaultText);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addToggle() {
        ElementToggle element = new ElementToggle("");
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addToggle(String name) {
        ElementToggle element = new ElementToggle(name);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addToggle(String name, boolean defaultValue) {
        ElementToggle element = new ElementToggle(name, defaultValue);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addDropDown(String name, List<String> list) {
        ElementDropdown element = new ElementDropdown(name, list);
        ((FormWindowCustom) formWindow).addElement(element);

        return this;
    }

    public CustomForm addDropDown(String name, List<String> list, int defaultValue) {
        ElementDropdown element = new ElementDropdown(name, list, defaultValue);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addSlider(String name, int min, int max) {
        ElementSlider element = new ElementSlider(name, (float)min, (float)max);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addSlider(String name, int minValue, int maxValue, int step) {
        ElementSlider element = new ElementSlider(name, (float)minValue, (float)maxValue, step, 3);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addSlider(String name, int minValue, int maxValue, int step, int defaultValue) {
        ElementSlider element = new ElementSlider(name, (float)minValue, (float)maxValue, step, defaultValue);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addStepSlider(String name, List<String> list) {
        ElementStepSlider element = new ElementStepSlider(name, list);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }

    public CustomForm addStepSlider(String name, List<String> list, int defaultStep) {
        ElementStepSlider element = new ElementStepSlider(name, list, defaultStep);
        ((FormWindowCustom) formWindow).addElement(element);
        return this;
    }
}