/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dl1.servlet;

import com.dl1.beans.Contrat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author veronique
 */
@WebServlet(name = "ListerContrat", urlPatterns = {"/ListerContrat"})
public class ListerContrat extends HttpServlet {
    public static final String ATT_EMPLOYE = "employe";
    public static final String ATT_CONTRAT = "contrat";
    public static final String ATT_FORM     = "form";
    public static final String SESSION_CONTRAT       = "contrat";
    
    public static final String VUE          = "/WEB-INF/listerContrat.jsp";

    
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        
        Contrat ligneContrat = new Contrat();
        Map<Long, Contrat> contrat;
        
        contrat =  (HashMap<Long, Contrat>) ligneContrat.lister();
        
        
        System.out.println("ListerContrat : " + contrat.toString());
        
        session.setAttribute( SESSION_CONTRAT, contrat );
        System.out.println ( "VTT1 :" + request.getAttribute("contrat"));
                
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
