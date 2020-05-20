package MVC;

import Controller.Controller;
import Model.Model;
import View.ViewAbout;
import View.ViewEdit;
import View.ViewPinjam;
import View.ViewData;
import View.ViewLogin;
import View.ViewHome;

public class MVC {
    // MODEL
    Model model = new Model ();
 //VIEW
    ViewLogin viewlogin = new ViewLogin ();
    ViewHome viewhome = new ViewHome();
    ViewPinjam viewpinjam = new ViewPinjam();
    ViewData viewdata = new ViewData ();
    ViewAbout viewabout = new ViewAbout();
    ViewEdit viewedit = new ViewEdit();
 //CONTROLLER
    Controller controller = new Controller(model,viewlogin,viewhome,viewpinjam,viewdata,viewabout,viewedit);
}
