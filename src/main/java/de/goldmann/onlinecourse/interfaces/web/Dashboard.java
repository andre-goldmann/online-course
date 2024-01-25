package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

@Route(value="", layout = MainView.class)
@PageTitle("Dashboard")
public class Dashboard extends VerticalLayout {

    Map<Integer,String> elementsMap = new HashMap<>();
    {
        elementsMap.put(1,"Fire");
        elementsMap.put(2,"Water");
        elementsMap.put(3,"Air");
        elementsMap.put(4,"Earth");
    }

    public Dashboard(UserService userServce) {
        add(new H1("Dashboard"));
        add(new H1(userServce.getUsers().toString()));
        add(new H1(elementsMap.toString()));

    }
}
