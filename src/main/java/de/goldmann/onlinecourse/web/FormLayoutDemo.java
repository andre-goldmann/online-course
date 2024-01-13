package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.web.MainView.createBtn;


@Route("formlayout")
public class FormLayoutDemo extends FormLayout {
    public FormLayoutDemo() {

        TextField firstName = new TextField("First Name");
        TextField lastName = new TextField("Last Name");

        Button submitButton = new Button("Submit", event -> {
            String message = "First Name: " + firstName.getValue() + ", Last Name: " + lastName.getValue();
            Notification.show(message);
        });

        add(firstName, lastName, submitButton);

        Button backBtn = createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }


}
