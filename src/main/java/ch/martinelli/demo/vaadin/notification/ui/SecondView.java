package ch.martinelli.demo.vaadin.notification.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class SecondView extends VerticalLayout {

    public SecondView() {
        add(new H1("Second View"));
    }
}
