package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

//@Route("") // map view to the root
//@Theme(value="tailwind")//, variant= Lumo.DARK)
//@CssImport("./styles.css")
class MainView extends AppLayout {

    public MainView() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("Vaadin CRM");
        logo.addClassNames(
                LumoUtility.FontSize.LARGE,
                LumoUtility.Margin.MEDIUM);

        var header = new HorizontalLayout(new DrawerToggle(), logo );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidthFull();
        header.addClassNames(
                LumoUtility.Padding.Vertical.NONE,
                LumoUtility.Padding.Horizontal.MEDIUM);

        addToNavbar(header);

    }

    private void createDrawer() {
        addToDrawer(new VerticalLayout(
                new RouterLink("Dashboard", Dashboard.class),
                new RouterLink("Pokemon Demo", PokemonDemo.class),
                new RouterLink("HorizontalLayout Demo", HorizontalLayoutDemo.class),
                new RouterLink("VerticalLayout Demo", VerticalLayoutDemo.class),
                new RouterLink("Splitlayout Demo", SplitLayoutDemo.class),
                new RouterLink("FlexLayout Demo", FlexLayoutDemo.class),
                new RouterLink("Templates Demo", TemplatesDemo.class),
                new RouterLink("Formlayout Demo", FormLayoutDemo.class),
                new RouterLink("FocusableLayout Demo", FocusableLayout.class),
                new RouterLink("CollapsableLayou Demo", CollapsableLayoutDemo.class),
                new RouterLink("Components Demo", ComponentsDemo.class)
        ));
    }


    public static Button createBtn(String caption){
        final Button b1 = new Button(caption);
        b1.addClassNames("bg-blue-700 hover:bg-blue-800 text-white font-bold py-2 px-4 rounded");
        return b1;
    }


}
