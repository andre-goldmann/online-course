package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "formlayout", layout = MainView.class)
@PageTitle("FormLayoutDemo")
public class FormLayoutDemo extends VerticalLayout {
    public FormLayoutDemo() {
        FormLayout layout = new FormLayout();
        TextField firstName = new TextField("First Name");
        TextField lastName = new TextField("Last Name");

        Button submitButton = new Button("Submit", event -> {
            String message = "First Name: " + firstName.getValue() + ", Last Name: " + lastName.getValue();
            Notification.show(message);
        });

        layout.add(firstName, lastName, submitButton);

        add(layout);

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
