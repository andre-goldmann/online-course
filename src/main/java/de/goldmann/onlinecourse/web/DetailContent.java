package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class DetailContent extends VerticalLayout {
    public DetailContent() {
        // Does not have impact
        //setSizeFull();
        add(new H1("Detail"));
    }
}
