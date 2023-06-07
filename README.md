 # FormAPI-Nukkit

This plugin is designed to Create Form Windows with NukkitAPI. Thanks to its practical use, it allows you to create Form Windows more easily.

Import to:
```java
import formapi.FormAPI;
```

Try this to create SimpleForm Window:
```java
SimpleForm simpleForm = new SimpleForm("title");
    simpleForm.setContent("My Content");
    simpleForm.addButton("MyButton1"); //Normal button
    simpleForm.addButton("MyButton2", ImageType.URL, "https://mywebsite/image.png"); //Url image button
    simpleForm.addButton("MyButton3", ImageType.PATH, "textures/items/diamond_sword"); //Path image button
    simpleForm.sendToPlayer(sender, (targetSender, targetForm, data) -> {
        if(data == -1) return; //returns null if button is not selected.
        String buttonText = targetForm.getResponse().getClickedButton().getText();
        targetSender.sendMessage("Button id: " . data . ", text: " . buttonText)
        });
```

Try this to create CustomForm Window:

```java
List<String> list = Arrays.asList("ex1", "ex2", "ex3");

CustomForm customForm = new CustomForm("title");
    customForm.addLabel("label text"); //CustomForm label
    customForm.addInput("input text", "example text"); //CustomForm input
    customForm.addDropdown("dropdown text", list); //CustomForm dropdown
    customForm.addStepSlider("stepslider text", list); //CustomForm stepslider
    customForm.addSlider("slider text", 0, 20); //CustomForm slider
    customForm.addToggle("toggle text", false); //CustomForm toggle
    customForm.sendToPlayer(sender, (targetSender, targetForm, args) -> {
        if(args == null) return; //returns null if args is not selected.
        targetSender.sendMessage("Args 0: "args.get(0));
        targetSender.sendMessage("Args 1: "args.get(1));
        targetSender.sendMessage("Args 2: "args.get(2));
        targetSender.sendMessage("Args 3: "args.get(3));
        targetSender.sendMessage("Args 4: "args.get(4));
        targetSender.sendMessage("Args 5: "args.get(5));
        });
```

Try this to create ModalForm Window:

```java
ModalForm modalForm = new ModalForm("title");
    modalForm.setContent("My Content");
    modalForm.setTrueButton("Button True"); //Normal true button
    modalForm.setFalseButton("ButtonFalse", ImageType.URL, "https://mywebsite/image.png"); //Url image false button
    simpleForm.sendToPlayer(sender, (targetSender, targetForm, data) -> {
        if(data == -1) return; //returns null if button is not selected.
        String buttonText = targetForm.getResponse().getClickedButton().getText();
        targetSender.sendMessage("Button Type: " . buttonText)
        });
```

 #### DONT FORGET TO STAR!
