package de.goldmann.onlinecourse.web;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.littemplate.LitTemplate;

import java.util.Arrays;

import static de.goldmann.onlinecourse.web.TailwindClassnamesPartOne.tailwindCSSPartOne;
import static de.goldmann.onlinecourse.web.TailwindClassnamesPartTwo.tailwindCSSPartTwo;

//@Tag("hello-world")
// has not effect for tailwind
//@NpmPackage(value = "tailwindcss", version = "3.4.1")
//@JsModule("./src/hello-world.ts")
public class HelloWorld extends LitTemplate {

    /**
     * Creates the hello world template.
     */
    public HelloWorld() {
        // So the template is not shown anymore
        //Arrays.stream(tailwindCSSPartOne).toList().forEach(this::addClassName);
        //Arrays.stream(tailwindCSSPartTwo).toList().forEach(this::addClassName);

    }
}