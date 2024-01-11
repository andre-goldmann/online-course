package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.web.MainView.createBtn;


@Route("verticallayout")
public class VerticalLayoutDemo extends VerticalLayout {
    public VerticalLayoutDemo() {

        add(new H1("VerticalLayoutDemo"));

        Button backBtn = createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
