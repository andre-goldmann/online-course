package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.interfaces.web.MainView.createBtn;

@Route(value = "components-demo", layout = MainView.class)
@PageTitle("ComponentsDemo Demo")
public class ComponentsDemo extends VerticalLayout {
    public ComponentsDemo() {
        final ComboBox<String> stringComboBox = new ComboBox<>();
        /*stringComboBox.getListDataView().addItem("");
        stringComboBox.getListDataView().addItem("Eins");
        stringComboBox.getListDataView().addItem("Zwei");*/
        //stringComboBox.setNewItemsAllowed(true);
        stringComboBox.setItems("Chrome", "Edge", "Firefox", "Safari");

        final Button reset = createBtn("Reset");
        reset.addClickListener(e -> {
           stringComboBox.setValue("");
            //stringComboBox.getDataProvider().
        });
        add(reset);

        add(stringComboBox);
    }
}
