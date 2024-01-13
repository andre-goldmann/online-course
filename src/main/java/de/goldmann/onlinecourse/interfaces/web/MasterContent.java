package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MasterContent extends VerticalLayout {
    public MasterContent() {
        // Does not have impact
        //setSizeFull();
        add(new H1("Master"));
    }
}
