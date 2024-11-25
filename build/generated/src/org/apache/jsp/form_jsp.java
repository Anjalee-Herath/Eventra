package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import classes.DbConnector;
import classes.User;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Package Form</title>\r\n");
      out.write("    <!-- head -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"index_style.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!--body-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"form_style.css\" />\r\n");
      out.write("    <script src=\"form_script.js\" defer></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Cookie\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <!--Header section-->\r\n");
      out.write("   <nav class=\"navbar navbar-expand-lg bg-body-tertiary fixed-top\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!--logo-->\r\n");
      out.write("                <a class=\"navbar-brand fs-4\" href=\"index.jsp\">img</a>\r\n");
      out.write("                <!--toggle-->\r\n");
      out.write("                <button class=\"navbar-toggler shadow-none border-0\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasNavbar\" aria-controls=\"offcanvasNavbar\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <!--sidebar-->\r\n");
      out.write("                <div class=\"sidebar offcanvas offcanvas-end\" tabindex=\"-1\" id=\"offcanvasNavbar\" aria-labelledby=\"offcanvasNavbarLabel\">\r\n");
      out.write("                    <!--slidebar header-->\r\n");
      out.write("                    <div class=\"offcanvas-header text-blue border-bottom\">\r\n");
      out.write("                        <h5 class=\"offcanvas-title\" id=\"offcanvasNavbarLabel\"><img src=\"assets\\images\\logo.png\" alt=\"logo\" height=\"120px\" width=\"120px\"></h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close btn-close-blue\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--slidebar body-->\r\n");
      out.write("                    <div class=\"offcanvas-body flex-column flex-lg-row p-lg-0\">\r\n");
      out.write("                        <ul class=\"navbar-nav justify-content-center align-items-center flex-grow-1 pe-3\">\r\n");
      out.write("                            <li class=\"nav-item mx-2\">\r\n");
      out.write("                                <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"aboutUs.jsp\">About</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"category.jsp\">Event Packages</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"gallery.jsp\">Gallery</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"contact.jsp\">Contact Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <!--login-->\r\n");
      out.write("                        ");

                            if (session != null && session.getAttribute("user") != null) {
                                User user = (User) session.getAttribute("user");
                                String role = user.getRole();

                                if (role.equals("admin")) {
                        
      out.write("\r\n");
      out.write("                        <!--admin login-->\r\n");
      out.write("                        <div class=\"d-flex flex-lg-row justify-content-center align-items-center gap-3\">\r\n");
      out.write("                            <a href=\"admin/admin_dashboard.jsp\" class=\"text-white text-decoration-none px-3 py-1 rounded-4\" style=\"background-color: blue;\">Admin Panel</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 } else {
      out.write("\r\n");
      out.write("                        <div class=\"d-flex flex-lg-row justify-content-center align-items-center gap-3\">\r\n");
      out.write("                            <a href=\"log_in.jsp\" class=\"text-white text-decoration-none px-3 py-1 rounded-4\" style=\"background-color: blue;\"><img src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAXklEQVR4nM2SSwqAMAwFZ9WrG+9p4zEiQhciaUkqogNvE8hAPvASBVgBBSogrRZGALvlrIVRR7BnBNURbE9HWDKC0iR1donfUC63t06G48igMfQTmhC4P2HJ/FAwxQFkTl77KJnvUQAAAABJRU5ErkJggg==\"></a>\r\n");
      out.write("                            <a href=\"log_in.jsp\" class=\"text-white text-decoration-none px-3 py-1 rounded-4\" style=\"background-color: blue;\">");
      out.print(user.getFirstName() + " " + user.getLastName());
      out.write("</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                        <div class=\"d-flex flex-lg-row justify-content-center align-items-center gap-3\">\r\n");
      out.write("                            <a href=\"signout.jsp\" class=\"text-white text-decoration-none px-3 py-1 rounded-4\" style=\"background-color: blue;\">LOGOUT</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                        <div class=\"d-flex flex-lg-row justify-content-center align-items-center gap-3\">\r\n");
      out.write("                            <a href=\"log_in.jsp\" class=\"text-white text-decoration-none px-3 py-1 rounded-4\" style=\"background-color: blue;\">LOGIN</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- body -->\r\n");
      out.write("  <main>\r\n");
      out.write("    <div class=\"formb\">\r\n");
      out.write("     <form action=\"#\" class=\"form\">\r\n");
      out.write("      <h1 class=\"text-center\">Create your event</h1>\r\n");
      out.write("      <!-- Progress bar -->\r\n");
      out.write("      <div class=\"progressbar\">\r\n");
      out.write("        <div class=\"progress\" id=\"progress\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <div\r\n");
      out.write("          class=\"progress-step progress-step-active\"\r\n");
      out.write("          data-title=\"Event\"\r\n");
      out.write("        ></div>\r\n");
      out.write("        <div class=\"progress-step\" data-title=\"Info\"></div>\r\n");
      out.write("        <div class=\"progress-step\" data-title=\"Customize\"></div>\r\n");
      out.write("        <div class=\"progress-step\" data-title=\"Pay\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Steps -->\r\n");
      out.write("      <div class=\"form-step form-step-active\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"event\">Event</label>\r\n");
      out.write("          <!-- <input type=\"text\" name=\"fullname\" id=\"fullname\" /> -->\r\n");
      out.write("          <div class=\"event\">\r\n");
      out.write("            <select id=\"event\">\r\n");
      out.write("                <option value=\"wedding\">Wedding</option>\r\n");
      out.write("                <option value=\"bday\">Birthday</option>\r\n");
      out.write("                <option value=\"gala\">Gala</option>\r\n");
      out.write("                <option value=\"private\">Private party</option>\r\n");
      out.write("                <option value=\"product\">Product Launching</option>\r\n");
      out.write("                <option value=\"get\">Get-Together</option>\r\n");
      out.write("                <option value=\"cahrity\">Charity</option>\r\n");
      out.write("                <option value=\"conference\">Conference</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"package\">Packages</label>\r\n");
      out.write("          <!-- <input type=\"text\" name=\"email\" id=\"email\" /> -->\r\n");
      out.write("          <div class=\"package\">\r\n");
      out.write("            <select id=\"package\">\r\n");
      out.write("                <option value=\"elite\">Elite</option>\r\n");
      out.write("                <option value=\"gold\">Gold</option>\r\n");
      out.write("                <option value=\"premier\">Premier</option>\r\n");
      out.write("                <option value=\"elegant\">Elegant</option>\r\n");
      out.write("                <option value=\"classic\">Classic</option>\r\n");
      out.write("                <option value=\"customize\">Customize</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-next width-50 ml-auto\">Next</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-step\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"phone\">Venu</label>\r\n");
      out.write("          <input type=\"text\" name=\"phone\" id=\"phone\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"date\">Date</label>\r\n");
      out.write("          <input type=\"date\" name=\"date\" id=\"date\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("            <label for=\"time\">Time</label>\r\n");
      out.write("            <input type=\"time\" name=\"time\" id=\"time\" />\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <label for=\"guest\">Guest Count</label>\r\n");
      out.write("            <input type=\"text\" name=\"guest\" id=\"guest\" />\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <label for=\"add\">Additional Info</label>\r\n");
      out.write("            <input type=\"textarea\" name=\"add\" id=\"add\" />\r\n");
      out.write("          </div>\r\n");
      out.write("        <div class=\"btns-group\">\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-prev\">Previous</a>\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-next\">Next</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-step\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("            <legend class=\"wed\">Food:</legend>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"catering\" name=\"catering\" value=\"Catering\" />\r\n");
      out.write("              <label for=\"catering\">Catering</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"wedcake\" name=\"wedcake\" value=\"wedcake\" />\r\n");
      out.write("              <label for=\"wedcake\">Cake</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"appetizer\" name=\"appetizer\" value=\"appetizer\" />\r\n");
      out.write("              <label for=\"appetizer\">Appetizer</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"desserts\" name=\"desserts\" value=\"desserts\" />\r\n");
      out.write("              <label for=\"desserts\">Desserts</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"refreshment\" name=\"refreshment\" value=\"refreshment\" />\r\n");
      out.write("              <label for=\"refreshment\">Refreshment</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"champange\" name=\"champange\" value=\"champange\" />\r\n");
      out.write("              <label for=\"champange\">Champange</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"bar\" name=\"bar\" value=\"bar\" />\r\n");
      out.write("              <label for=\"bar\">Barservice</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("            <legend class=\"wed\">Decoration:</legend>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"venudeco\" name=\"venudeco\" value=\"venudeco\" />\r\n");
      out.write("              <label for=\"venudeco\">Venu_Deco</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"invitaion\" name=\"invitaion\" value=\"invitaion\" />\r\n");
      out.write("              <label for=\"invitaion\">Invitaion</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"memorabilia\" name=\"memorabilia\" value=\"memorabilia\" />\r\n");
      out.write("              <label for=\"memorabilia\">Memorabilia</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"product\" name=\"product\" value=\"product\" />\r\n");
      out.write("              <label for=\"product\">Product_Display</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"table\" name=\"table\" value=\"table\" />\r\n");
      out.write("              <label for=\"table\">Table_&_Chair </label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"theme\" name=\"theme\" value=\"theme\" />\r\n");
      out.write("              <label for=\"theme\">Theme_Development_&_Decor</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("            <legend class=\"wed\">Entertainment:</legend>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"media\" name=\"media\" value=\"media\" />\r\n");
      out.write("              <label for=\"media\">Media</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"theme\" name=\"theme\" value=\"theme\" />\r\n");
      out.write("              <label for=\"theme\">Theme_&_branding</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"sponsorship\" name=\"sponsorship\" value=\"sponsorship\" />\r\n");
      out.write("              <label for=\"sponsorship\">Sponsorship_&_exhibitor</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"speaker\" name=\"speaker\" value=\"speaker\" />\r\n");
      out.write("              <label for=\"speaker\">Speaker</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"auction\" name=\"auction\" value=\"auction\" />\r\n");
      out.write("              <label for=\"auction\">Auction_&_prizes</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"vip\" name=\"vip\" value=\"vip\" />\r\n");
      out.write("              <label for=\"vip\">Coordinate_vip_services</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"bands\" name=\"bands\" value=\"bands\" />\r\n");
      out.write("              <label for=\"bands\">Bands</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"solo\" name=\"solo\" value=\"solo\" />\r\n");
      out.write("              <label for=\"solo\">Solo_musicians</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"DJs\" name=\"DJs\" value=\"DJs\" />\r\n");
      out.write("              <label for=\"DJs\">DJs</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"Dance\" name=\"Dance\" value=\"Dance\" />\r\n");
      out.write("              <label for=\"Dance\">Dance_performance</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"face\" name=\"face\" value=\"face\" />\r\n");
      out.write("              <label for=\"face\">Face_painting</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"tatto\" name=\"tatto\" value=\"tatto\" />\r\n");
      out.write("              <label for=\"tatto\">Temparary_tatto</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("            <legend class=\"wed\">Other:</legend>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"eventco\" name=\"venudeco\" value=\"venudeco\" />\r\n");
      out.write("              <label for=\"venudeco\">Event_coordination</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"photography\" name=\"photography\" value=\"photography\" />\r\n");
      out.write("              <label for=\"photography\">photography_&_videography</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"audiovisual\" name=\"audiovisual\" value=\"audiovisual\" />\r\n");
      out.write("              <label for=\"audiovisual\">Audiovisual_&_staging</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"networking\" name=\"networking\" value=\"networking\" />\r\n");
      out.write("              <label for=\"networking\">Networking/event_technology</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"staff\" name=\"staff\" value=\"staff\" />\r\n");
      out.write("              <label for=\"staff\">On_site_staff_&_volunteering</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"post\" name=\"post\" value=\"post\" />\r\n");
      out.write("              <label for=\"post\">Post_event_follow_up</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"single-checkbox\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"surprise\" name=\"surprise\" value=\"surprise\" />\r\n");
      out.write("              <label for=\"surprise\">Special_surprise</label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"btns-group\">\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-prev\">Previous</a>\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-next\">Next</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-step\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"total\">Total bill</label>\r\n");
      out.write("          <input type=\"text\" name=\"total\" id=\"total\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <legend>Card Details</legend>\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <img src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAADj0lEQVR4nO1YW0hUQRjet156qdyMMnoJjMgieioKegi6YBFRBJUksWtqQphWKFRqF1MUjUqzRBAJybxl5oOo56zX1NXVvKSta4qb98vuestd849/1p09B3bdBw+4ynzwwzn//DPzf/NfBkYmY2BgYGBg2EjY4q/a7aHgc+VKziRX8uAewpk8FHzBtlvl3i6dlyu5ibV3mHcsCm4SfXRKwHrybuCociUSfI5TAu6VNryzKBhXIOAGDipdCyMgZxHgWQo5xIYpYu+QIohJDoLm/IPQVugDLfkHIOXdNfAMqKCLeAVXwvT8IiAWLEuw714NlGjGwIYzsc3Ebu/dakgu6YfW/mmYnLGAYdYCLX0miMjWipw697IZhDj0oG71Xeh4eCaM1foCqDYRuR4dR8duprTTzQobR4nu19As1aHje0KqoGvQrhMipXRAtFd+w4ho3O9tuzRtNCpXBzCYDkuqzfAqVUH1efX2DS8ltsLOQBWYF5fI/7BhgdiEZnZTm6quKTgfr4GT0Wp4nNMDV5N/0LV87tfSuTYkFvdJQ+DUsybriuNFoCs/TXS7gyth5q81fX6PzsH2AB6OPmoQOYt2T/N6qe59ud6pQwnFfcRmcsYMA+Pz5LusbUIaAjtuq2Bq1kIWne5JIjr/VHv6oJOo83vTRnUZ3B+i843TiE61occIF+I1ovV3BVXCqHGBjKdX6Ek6kvMymaW7iWlxWgxwLLIUChqsm2DY94fVEptoTLVlCAv0eUEvWP6J0yPpWz8dv5Pxk+ox2jF59nUOP6yThkBktpYuqkjrgNnl9PnaZC1elI/VQ9TmclKruBk8aRR1KATWglzJg6bPRP479TPkH+fagJGWhMCJqEa6aPvANP2+InC0Xmtw2QKL1NbIIW68boOzsfbW2TsyB1/UoyT3HUVqVQSwSMdMZtEJ9o/Ng2eA3QYLEIF3A9rjPZBWpiftFvM+8EMnmYPA+wDbbJ6gkzkC1zEpDQEUW97b8KLAWrwo3qE1VI8pYct9R8CL7GJCi6h11msNEJbVTUWtMy4TNZPDkIRAeJa9p2NRogO2MWG3+Vw3THRYK406IzltvKkx9bC3I1lh60RglIR7CckfifguDQF3EhkjoGQRAJZC6/dZhTfInAGf79bcQaUr4T45JYBvj/h8t/ZO8g7FQ8GPb1VwXjKX76MKPgdfwNwnbTgjnrxL5xkYGBgYGGTrDP8B3Ygzc5EqX04AAAAASUVORK5CYII=\">\r\n");
      out.write("            <img src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAACnUlEQVR4nO2YzWsTQRjGNxRR8VA9+dG01ngoIv4J2Y9m7aGrJtOKePbkxYNgGpM0Hz30qFc/ED2pbRHSXTcqaRT8FwR70UvWJHhQ0VLSg+ArM2lKW91spjM1G5kHnstmhzy/4Z2Zd0eShISEhISE/ieFo68GZWQ/U1BxRUFF8IlXZGQXtAsvRzzDKzH7qw8Cg4u/4YyuAOszDz73giuAz8oG/m77RzsA6AVLLAB6zISZ8QSUdQUcNQhr4X3ENfUoLOkq+W0UWVvHXDRhJpGE8n0dnEII1sr9xE4hRJ7lEynyzq4DZIwU1NQjAGGprevKYUgZmeaYqWmoWUMAb/e2dc06Dpl4ZncANPQc5sYmPINv9q9wAJYyEc/gsM1zty+BNmHzBaANj/3u6hnq8LDuJ7cu8wPAZUMb/g8/2EMNkY5n2QHwgsWLkxkgGgB4QwdQtwZdF3bHAHhHoQ27HB3ZcenANuem0mwAr3WZGuB98jQ3gNK9s2wAn9Rj7OXTMgpQAziFEBtAQ97PDyAiUQM0ygf/PUCj2M+thFZLh9gAHHWAGqD+MMgNoLLIWEK43+FWQtf66BfxXcZFnDdu8gO4Q3+YZVm30UjMhKpCtxP9lPvg86MB5vKpWUPsB1mzlUhTz/aH8yeZAVI3ct1t5jacpa/9xzybOWwtZsPTsUnqdnr5yqkddaIa73a65bQx3dGawB8018/NNsfEs1A1hz2DV83htmXDBaC1sHPjSSjpGlTUIDnsVuUD8FE7QZ4ljDz5ANoyZtIkjRnubfDejk9Y7MpiiDzDuw1+p5P/Zwbwg6VevlaRY/Z3VwB8fdftgIq3510B8N0jvr7z7eyj4hcFvQhKnvejqLiAb8C6HVjZMMky7xleSEhISEhI6jH9Bnm6laI4if4oAAAAAElFTkSuQmCC\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <label for=\"own\">Card Owner</label>\r\n");
      out.write("            <input type=\"text\" name=\"own\" id=\"own\" placeholder=\"Card Owner Name\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"card\">Card Number</label>\r\n");
      out.write("          <input type=\"text\" name=\"card\" id=\"card\" placeholder=\"Card number\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"exp\">Expiration Date</label>\r\n");
      out.write("          <input type=\"month\" name=\"exp\" id=\"exp\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <label for=\"cvv\">CVV</label>\r\n");
      out.write("          <input type=\"text\" name=\"cvv\" id=\"cvv\" placeholder=\"CVV\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("      </fieldset>\r\n");
      out.write("        <div class=\"btns-group\">\r\n");
      out.write("          <a href=\"#\" class=\"btn btn-prev\">Previous</a>\r\n");
      out.write("          <input type=\"submit\" value=\"Pay\" class=\"btn\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  </main>\r\n");
      out.write("\r\n");
      out.write("  <!-- footer -->\r\n");
      out.write("<footer class=\"footer-distributed\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-left\">\r\n");
      out.write("            <h3><span>EVENTRA</span></h3>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"footer-links\">\r\n");
      out.write("              <a href=\"index.jsp\">Home</a>\r\n");
      out.write("                |\r\n");
      out.write("                <a href=\"aboutUs.jsp\">About</a>\r\n");
      out.write("                |\r\n");
      out.write("                <a href=\"contact.jsp\">Contact</a>\r\n");
      out.write("          </p>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"footer-company-name\">Copyright Â© 2024 <strong>EVENTRA</strong> All rights reserved</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-center\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("                <p>277/C,3 Galle Road,\r\n");
      out.write("                    Colombo</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <i class=\"fa fa-phone\"></i>\r\n");
      out.write("                <p>(+94)11-2345678</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                <p><a href=\"\">eventracreation@gmail.com</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-right\">\r\n");
      out.write("            <p class=\"footer-company-about\">\r\n");
      out.write("                <span>Let's chat</span>\r\n");
      out.write("                Make your dream event a reality with our exceptional event planning services. At Eventra, we specialize\r\n");
      out.write("                in crafting unforgettable experiences tailored to your unique vision. From elegant weddings and\r\n");
      out.write("                corporate galas to intimate celebrations and grand milestones, our dedicated team of experts will guide\r\n");
      out.write("                you through every step of the planning process. Contact us today to start creating memories that will\r\n");
      out.write("                last a lifetime.\r\n");
      out.write("            </p>\r\n");
      out.write("            <div class=\"footer-icons\">\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- head -->\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
