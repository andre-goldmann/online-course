package de.goldmann.onlinecourse.interfaces.web;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.pekkam.Canvas;
import org.vaadin.pekkam.CanvasRenderingContext2D;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.router.Route;
import org.vaadin.pekkam.event.MouseEvent;


@Route(value = "canvas-demo", layout = MainView.class)
@PageTitle("CanvasDemo Demo")
public class CanvasDemo extends VerticalLayout {
    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 500;

    private CanvasRenderingContext2D ctx;
    public CanvasDemo() {
        Div label = new Div();
        label.setText("The quick brown fox.");

        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.getStyle().set("border", "1px solid");

        ctx = canvas.getContext();

        Div buttons = new Div();
        buttons.add(new NativeButton("Draw random circle",
                e -> drawRandomCircle()));
        buttons.add(new NativeButton("Draw house", e -> drawHouse()));
        buttons.add(new NativeButton("Clear canvas",
                e -> ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT)));

        add(label, canvas, buttons);

        Input input = new Input();
        input.setValue("resources/vaadin-logo.svg");
        NativeButton loadImageButton = new NativeButton("Load image", e -> canvas.loadImage(input.getValue()));
        NativeButton drawImageButton = new NativeButton("Draw image",
                e -> ctx.drawImage(input.getValue(), 0, 0));
        NativeButton drawPatButton = new NativeButton("Fill pattern", e->drawPattern(input.getValue()));
        add(new NativeLabel("Image src: "), input, loadImageButton, drawImageButton, drawPatButton);

        canvas.getElement().setAttribute("tabindex", "1");
        canvas.addMouseDownListener(e -> logEvent("down", e));
        canvas.addMouseUpListener(e -> logEvent("up", e));
        canvas.addMouseMoveListener(e -> logEvent("move", e));
        canvas.addMouseClickListener(e -> logEvent("click", e));
        canvas.addMouseDblClickListener(e -> logEvent("dblClick", e));
        canvas.addKeyDownListener(e -> {
            System.out.println("key :" + e.getKey().getKeys().get(0));
        });
        canvas.addImageLoadListener(e -> {
            System.out.println("image loaded: " + e.getSrc());
        });
    }

    private void logEvent(String eventType, MouseEvent me)
    {
        System.out.println("mouse " + eventType + ": x=" + me.getOffsetX() + ", y=" + me.getOffsetY() + ", btn=" + me.getButton());
    }

    private void drawPattern(String src)
    {
        ctx.save();
        ctx.setPatternFillStyle(src, "repeat");
        ctx.fillRect(200, 200, 100, 100);
        ctx.restore();
    }

    private void drawHouse() {
        ctx.save();

        ctx.setFillStyle("yellow");
        ctx.strokeRect(200, 200, 100, 100);
        ctx.fillRect(200, 200, 100, 100);

        ctx.beginPath();
        ctx.moveTo(180, 200);
        ctx.lineTo(250, 150);
        ctx.lineTo(320, 200);
        ctx.closePath();
        ctx.stroke();
        ctx.setFillStyle("orange");
        ctx.fill();

        ctx.restore();
    }

    private void drawRandomCircle() {
        ctx.save();
        ctx.setLineWidth(2);
        ctx.setFillStyle(getRandomColor());
        ctx.beginPath();
        ctx.arc(Math.random() * CANVAS_WIDTH, Math.random() * CANVAS_HEIGHT,
                10 + Math.random() * 90, 0, 2 * Math.PI, false);
        ctx.closePath();
        ctx.stroke();
        ctx.fill();
        ctx.restore();
    }

    private String getRandomColor() {
        return String.format("rgb(%s, %s, %s)", (int) (Math.random() * 256),
                (int) (Math.random() * 256), (int) (Math.random() * 256));
    }
}
