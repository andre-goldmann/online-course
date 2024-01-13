package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayoutVariant;
import com.vaadin.flow.router.Route;

import java.util.concurrent.atomic.AtomicInteger;

@Route("splitlayout")
public class SplitLayoutDemo extends VerticalLayout {
    public SplitLayoutDemo() {

        // Create a SplitLayout with a 20% / 80% split ratio
        SplitLayout splitLayout = new SplitLayout();
        splitLayout.getStyle().set("background-color", "gray");
        splitLayout.setSizeFull();

        // Create panels for navigation and content
        Div navigationPanel = new Div();
        Div contentPanel = new Div();

        // Set the content for the panels
        navigationPanel.setText("Navigation Panel");
        contentPanel.setText("Content Panel");

        // Set the size for the navigation panel
        splitLayout.setSplitterPosition(20);

        // Add panels to the SplitLayout
        splitLayout.addToPrimary(navigationPanel);
        splitLayout.addToSecondary(contentPanel);

        // Add the SplitLayout to the main layout
        add(splitLayout);

        addLayoutCombination();
        addResizeNotificationLayout();
        addInitialSplitterPositionLayout();
        addMinMaxWidthLayout();
        addComponentWithThemeVariant();

        Button backBtn = MainView.createBtn("Back");
        backBtn.addClickListener(e ->
                backBtn.getUI().ifPresent(ui ->
                        ui.navigate(""))
        );
        add(backBtn);
    }

    private void addComponentWithThemeVariant() {
        SplitLayout layout = new SplitLayout(
                new NativeLabel("First content component"),
                new NativeLabel("Second content component"));
        layout.getStyle().set("background-color", "gray");
        layout.addThemeVariants(SplitLayoutVariant.LUMO_SMALL);
        layout.setId("split-layout-theme-variant");

        NativeButton removeVariantButton = new NativeButton(
                "Remove theme variant",
                e -> layout.removeThemeVariants(SplitLayoutVariant.LUMO_SMALL));
        removeVariantButton.setId("remove-variant-button");

        addCard("Split Layout theme variant", layout, removeVariantButton);
    }

    private void addLayoutCombination() {
        NativeLabel firstLabel = new NativeLabel("First content component");
        NativeLabel secondLabel = new NativeLabel("Second content component");
        NativeLabel thirdLabel = new NativeLabel("Third content component");

        SplitLayout innerLayout = new SplitLayout(secondLabel, thirdLabel,
                SplitLayout.Orientation.VERTICAL);


        SplitLayout layout = new SplitLayout(firstLabel, innerLayout);
        layout.getStyle().set("background-color", "gray");

        layout.setId("split-layout-combination");
        layout.getPrimaryComponent().setId("first-component");
        layout.getSecondaryComponent().setId("nested-layout");
        innerLayout.getPrimaryComponent().setId("second-component");
        innerLayout.getSecondaryComponent().setId("third-component");
        setMinHeightForLayout(layout);
        addCard("Layout Combination", layout);
    }

    private void addResizeNotificationLayout() {
        SplitLayout layout = new SplitLayout();
        layout.getStyle().set("background-color", "gray");
        layout.setId("split-layout-resize");
        layout.addToPrimary(new NativeLabel("First content component"));
        layout.addToSecondary(new NativeLabel("Second content component"));

        NativeLabel message = new NativeLabel("Drag and drop the splitter");
        AtomicInteger resizeCounter = new AtomicInteger();
        layout.addSplitterDragendListener(
                event -> message.setText("SplitLayout Resized "
                        + resizeCounter.incrementAndGet() + " times."));

        message.setId("resize-message");
        setMinHeightForLayout(layout);
        addCard("Resize Event", layout, message);
    }

    private void addInitialSplitterPositionLayout() {
        NativeLabel firstLabel = new NativeLabel("First content component");
        NativeLabel secondLabel = new NativeLabel("Second content component");

        SplitLayout layout = new SplitLayout(firstLabel, secondLabel);
        layout.getStyle().set("background-color", "gray");
        layout.setSplitterPosition(80);

        layout.getPrimaryComponent().setId("initial-sp-first-component");
        layout.getSecondaryComponent().setId("initial-sp-second-component");
        setMinHeightForLayout(layout);
        addCard("Split Layout with Initial Splitter Position", layout);
    }

    private void addMinMaxWidthLayout() {
        SplitLayout layout = new SplitLayout();
        layout.setId("split-layout-min-max");
        layout.addToPrimary(new NativeLabel("First content component"));
        layout.addToSecondary(new NativeLabel("Second content component"));
        layout.getStyle().set("background-color", "gray");

        layout.setPrimaryStyle("minWidth", "100px");
        layout.setPrimaryStyle("maxWidth", "150px");
        layout.setPrimaryStyle("background", "salmon");

        layout.getPrimaryComponent().setId("min-max-first-component");
        setMinHeightForLayout(layout);
        addCard("Split Layout with Minimum and Maximum Widths", layout);
    }

    private void setMinHeightForLayout(HasStyle layout) {
        layout.getStyle().set("minHeight", "100px");
    }

    private void addCard(String title, Component... components) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.add(new H2(title));
        layout.add(components);
        add(layout);
    }
}
