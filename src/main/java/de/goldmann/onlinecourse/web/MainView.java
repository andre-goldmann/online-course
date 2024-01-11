package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayoutVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Route("") // map view to the root
@Theme(value="tailwind")//, variant= Lumo.DARK)
@CssImport("./styles.css")
class MainView extends VerticalLayout implements AppShellConfigurator {

    public MainView() {

        Button hLayoutBtn = createBtn("Horizontal Layouts");
        hLayoutBtn.addClickListener(e ->
                hLayoutBtn.getUI().ifPresent(ui ->
                        ui.navigate("horizontallayout"))
        );
        add(hLayoutBtn);

        Button vLayoutBtn = createBtn("Vertical Layouts Examples");
        vLayoutBtn.addClickListener(e ->
                vLayoutBtn.getUI().ifPresent(ui ->
                        ui.navigate("verticallayout"))
        );
        add(vLayoutBtn);

        Button splitLayoutBtn = createBtn("Split Layouts Examples");
        splitLayoutBtn.addClickListener(e ->
                splitLayoutBtn.getUI().ifPresent(ui ->
                        ui.navigate("splitlayout"))
        );
        add(splitLayoutBtn);

        Button flexLayoutBtn = createBtn("Split Layouts Examples");
        flexLayoutBtn.addClickListener(e ->
                flexLayoutBtn.getUI().ifPresent(ui ->
                        ui.navigate("flexlayout"))
        );
        add(flexLayoutBtn);

        Button templatesBtn = createBtn("Templates Examples");
        templatesBtn.addClickListener(e ->
                templatesBtn.getUI().ifPresent(ui ->
                        ui.navigate("templates"))
        );
        add(templatesBtn);

        Button formLayoutBtn = createBtn("Templates Examples");
        formLayoutBtn.addClickListener(e ->
                formLayoutBtn.getUI().ifPresent(ui ->
                        ui.navigate("formlayout"))
        );
        add(formLayoutBtn);

        Button focusableBtn = createBtn("Focusable Layout Example");
        focusableBtn.addClickListener(e ->
                focusableBtn.getUI().ifPresent(ui ->
                        ui.navigate("focusable-layout"))
        );
        add(focusableBtn);

        Button collapsableLayoutBtn = createBtn("Collapsable Layout Example");
        collapsableLayoutBtn.addClickListener(e ->
                focusableBtn.getUI().ifPresent(ui ->
                        ui.navigate("collapsable-layout"))
        );
        add(collapsableLayoutBtn);

    }

    public static Button createBtn(String caption){
        final Button b1 = new Button(caption);
        b1.addClassNames("bg-blue-700 hover:bg-blue-800 text-white font-bold py-2 px-4 rounded");
        return b1;
    }


}
