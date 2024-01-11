package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.web.MainView.createBtn;


@Route("formlayout")
public class FormLayoutDemo extends VerticalLayout {
    public FormLayoutDemo() {

        add(new H1("FormLayoutDemo"));

        Button backBtn = createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
