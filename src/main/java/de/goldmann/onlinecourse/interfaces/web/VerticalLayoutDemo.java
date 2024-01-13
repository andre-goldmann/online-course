package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value="verticallayout", layout = MainView.class)
@PageTitle("VerticalLayoutDemo")
public class VerticalLayoutDemo extends VerticalLayout {
    public VerticalLayoutDemo() {

        add(new H1("VerticalLayoutDemo"));

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
