package mainscreen;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/homecooking")
public class WelcomePage extends Div {

        public WelcomePage() {
            VerticalLayout layout = new VerticalLayout();
           // layout.add(new LayoutItem("Item 1"));
           // layout.add(new LayoutItem("Item 2"));
           // layout.add(new LayoutItem("Item 3"));
           // layout.add(new LayoutItem("Item 4"));

            this.setClassName("basic-layouts-example");

            this.add(layout);
        }
}
