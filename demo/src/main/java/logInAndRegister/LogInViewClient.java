package logInAndRegister;


import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("client/login")
@PageTitle("Log In | Client")
public class LogInViewClient extends VerticalLayout implements BeforeEnterObserver {

    private final LoginForm login = new LoginForm();


    public LogInViewClient() {
        addClassName("login-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.setAction("/client/login");

        add(new H1("Log In"), login);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
       if (event.getLocation().getQueryParameters().getParameters().containsKey("error")) {
           login.setError(true);
       }
    }
}


