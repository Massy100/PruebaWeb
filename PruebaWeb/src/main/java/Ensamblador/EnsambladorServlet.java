/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ensamblador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Massielle Coti
 */
public class EnsambladorServlet extends HttpServlet {
    private final String LISTAR_ENSAMBLADOR="PaginaWeb/Ensamblador/EnsambladorListar.jsp";
    private final String INGRESAR_ENSAMBLADOR="PaginaWeb/Ensamblador/EnsambladorIngresar.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino="";
        String comando=request.getParameter("comando");
        
        if (comando.equalsIgnoreCase("listar")) {
            destino=LISTAR_ENSAMBLADOR;
        }
        RequestDispatcher requestDispatcher=request.getRequestDispatcher(destino);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
