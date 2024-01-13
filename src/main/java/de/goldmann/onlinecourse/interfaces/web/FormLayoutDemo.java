package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("formlayout")
public class FormLayoutDemo extends VerticalLayout {
    public FormLayoutDemo() {

        add(new H1("FormLayoutDemo"));

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
