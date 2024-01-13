package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static de.goldmann.onlinecourse.interfaces.web.MainView.createBtn;


@Route("collapsable-layout")
public class CollapsableLayoutRecipe extends VerticalLayout {

    public CollapsableLayoutRecipe() {

        MyCollapsableLayout collapsableLayout = new MyCollapsableLayout();
        add(collapsableLayout);

        //A border to show the outline of the layout itself
        collapsableLayout.getElement().getStyle().set("border", "1px solid #aaa");

        collapsableLayout.addContentComponent(createSomeContent());

        //Add a header caption
        collapsableLayout.addHeaderComponent(new Span("Collapsable layout with custom header"));

        //Add a header button that toggles the visibility on click
        Button collapseButton = new Button("Show", e -> collapsableLayout.toggleContentVisibility());
        collapsableLayout.addHeaderComponentAsLastAndAlignToRight(collapseButton);

        //Change the button caption based on the collapse state change
        collapsableLayout.addCollapseChangeListener(e -> collapseButton.setText(e.isCurrentlyVisible() ? "Hide" : "Show"));
        Button backBtn = createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);

    }

    //Just something to show/hide
    private Component createSomeContent() {

        //Some random content that we might want to show/hide
        DatePicker aContentDatePicker = new DatePicker("Pick a date, or don't");
        ComboBox<String> aContentComboBox = new ComboBox<>("Some content");
        return new VerticalLayout(aContentDatePicker, aContentComboBox);

    }

}
