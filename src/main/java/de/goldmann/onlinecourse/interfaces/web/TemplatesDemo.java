package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value="templates", layout = MainView.class)
@PageTitle("TemplatesDemo")
public class TemplatesDemo extends VerticalLayout {
    public TemplatesDemo() {
        final HelloWorld hello = new HelloWorld();
        hello.addClassNames("btn-blue" ,"bg-blue-500", "hover:bg-blue-700", "text-white", "font-bold", "py-2", "px-4", "rounded");
        add(hello);

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }
}