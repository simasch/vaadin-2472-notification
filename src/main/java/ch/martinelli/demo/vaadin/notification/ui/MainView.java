package ch.martinelli.demo.vaadin.notification.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("First View"));

        add(new Button("Click Me", e -> {
            Notification.show("Hello Vaadin!");
            UI.getCurrent().navigate(SecondView.class);
        }));
    }
}
