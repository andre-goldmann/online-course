package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Route("horizontallayout")
public class HorizontalLayoutDemo  extends VerticalLayout {
    public HorizontalLayoutDemo() {

        final HorizontalLayout hLayout = new HorizontalLayout();
        //hLayout.addClassNames("flex flex-wrap");
        //hLayout.getStyle().set("width", "40%");
        // Center
        hLayout.addClassNames("blue");

        final ComboBox<String> comboBox =new ComboBox<>();
        comboBox.getListDataView().addItems(Stream.of("a", "b", "c")
                .collect(Collectors.toCollection(HashSet::new)));
        //hLayout.add(comboBox);
        //hLayout.setFlexGrow(2, comboBox);

        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));
        hLayout.add(MainView.createBtn("One"));

        final HorizontalLayout hLayout2 = new HorizontalLayout();
        // Center
        hLayout2.getStyle().set("margin", "auto");
        hLayout2.addClassNames("blue");
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));
        hLayout2.add(MainView.createBtn("One"));

        // 3
        // Create buttons
        Button button1 = MainView.createBtn("One");
        Button button2 = MainView.createBtn("One");
        Button button3 = MainView.createBtn("One");

        // Create a HorizontalLayout
        HorizontalLayout horizontalLayout = new HorizontalLayout(button1, button2, button3);
        //<theme-editor-local-classname>
        horizontalLayout.addClassName("main-view-horizontal-layout-1");
        horizontalLayout.setWidth("80%");
        horizontalLayout.addClassNames("blue");

        // Set flex grow for buttons
        horizontalLayout.setFlexGrow( 1, button1); // Button 1 will take more space
        horizontalLayout.setFlexGrow(2, button2); // Button 2 will take twice the space of Button 1
        horizontalLayout.setFlexShrink(1, button3); // Button 3 will take the same space as Button 1

        //horizontalLayout.setFlexShrink(button1, 1); // Button 1 can shrink
        //horizontalLayout.setFlexShrink(button2, 0); // Button 2 cannot shrink
        //horizontalLayout.setFlexShrink(button3, 1); // Button 3 can shrink
        // TODO maybe just use one layout and make it possible to change it other UI
        add(hLayout);
        add(hLayout2);
        add(horizontalLayout);

        Button changeBtn = MainView.createBtn("Apply Changes");
        changeBtn.addClickListener(e -> {
            System.out.println("Changing BG");
            horizontalLayout.getStyle().set("background-color", "black");
            horizontalLayout.setFlexGrow(3, button1);
        });
        add(changeBtn);
        // TODO add Inputs to set CSS-Style
        add(new SplitButtonBar());

        /////////////////////////////////////////

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }

}
