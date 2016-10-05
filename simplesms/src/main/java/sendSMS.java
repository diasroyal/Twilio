package com.twilio.sdk.simplesms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/**
 *
 * @author diasa
 */
public class sendSMS extends HttpServlet {

       public sendSMS(){
        super();
    }
            
            
            
           
    public static final String ACCOUNT_SID = "ACac32605bddb15e11335270286f97f284";
  public static final String AUTH_TOKEN = "ebae525b694281d628b4cd8a102de938";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message
        .creator(new PhoneNumber("+16093698256"), new PhoneNumber("+19177461425"),
            "Hello from Dias Royal")
            .create();
    response.setContentType("text/html");
 try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sendSMS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Message Sent.</h1>");
            out.println(" "+message.getSid());
            out.println("</body>");
            out.println("</html>");
            
    }}
            protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
