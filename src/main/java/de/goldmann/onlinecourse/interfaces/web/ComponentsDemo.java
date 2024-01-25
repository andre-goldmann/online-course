package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static de.goldmann.onlinecourse.interfaces.web.MainView.createBtn;

@Route(value = "components-demo", layout = MainView.class)
@PageTitle("ComponentsDemo Demo")
public class ComponentsDemo extends VerticalLayout {

    List<Integer> elements = new ArrayList<>();
    {
        elements.add(1);
        elements.add(2);
        elements.add(3);
    }


    public ComponentsDemo() {
        final ComboBox<Integer> stringComboBox = new ComboBox<>();
        /*stringComboBox.getListDataView().addItem("");
        stringComboBox.getListDataView().addItem("Eins");
        stringComboBox.getListDataView().addItem("Zwei");*/
        //stringComboBox.setNewItemsAllowed(true);
        stringComboBox.setItems(elements);


        final Button reset = createBtn("Reset");
        reset.addClickListener(e -> {
           stringComboBox.clear();
            //stringComboBox.getDataProvider().
        });
        add(reset);

        add(stringComboBox);
    }
}
