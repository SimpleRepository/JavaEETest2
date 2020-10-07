import packCart.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Gudilin on 18.09.2020.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        Integer session_count = (Integer)session.getAttribute("count");
        int quantity = 100;

        String name2 = request.getParameter("name");
        try {
            quantity = Integer.parseInt(request.getParameter("quantity"));
        }
        catch( NumberFormatException er )
        {
            quantity = 1000;
        }

        Cart cart = (Cart)session.getAttribute("cart");

        if (cart == null) {
            cart = new Cart();
            cart.setName(name2);
            cart.setQuantity(quantity);
        }
        else {
            cart.setName(name2);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart",cart);

        if(session_count==null) {
            session.setAttribute("count", 1);
            session_count = 1;
        }
        else
            session.setAttribute("count",++session_count);

        String name = request.getParameter("name2");
        String surName = request.getParameter("surName2");

        PrintWriter pw = response.getWriter();

    //    pw.println("<html>");
    //    pw.println("<h1>Your count is: " + session_count + "</h1>");
        //pw.println("<h1>Hello" + name + " " + surName + " " + "</h1>");
    //    pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);
        //response.sendRedirect("/firstJSP.jsp");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJSP.jsp");
        //dispatcher.forward(request,response);

    }
}
