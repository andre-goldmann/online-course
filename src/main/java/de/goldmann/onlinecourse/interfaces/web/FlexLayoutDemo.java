package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.interfaces.web.MainView.createBtn;

@Route(value="flexlayout", layout = MainView.class)
@PageTitle("FlexLayoutDemo")
public class FlexLayoutDemo extends VerticalLayout {
    public FlexLayoutDemo() {

        FlexLayout flexLayout = new FlexLayout();
        flexLayout.setWidth("100%");
        flexLayout.setHeight("100vh"); // 100% of the viewport height

        // Create components to be added to the FlexLayout
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Add components to the FlexLayout
        flexLayout.add(button1, button2, button3);

        // Set the flex properties for the components
        flexLayout.setFlexGrow(2, button1); // Make Button 1 grow to fill available space
        flexLayout.setFlexGrow(0, button2); // Make Button 2 grow with twice the space of Button 1
        flexLayout.setFlexShrink(1, button3); // Prevent Button 3 from shrinking

        // Add the FlexLayout to the main hLayout
        add(flexLayout);

        Button backBtn = createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }
}
