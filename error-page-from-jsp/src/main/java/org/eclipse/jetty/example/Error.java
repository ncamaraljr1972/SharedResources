package org.eclipse.jetty.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.jsp.PageContext;

public class Error
{
    public String getDescription(PageContext context) throws ServletException, IOException
    {
        context.forward("/error");
        return "(Não deveria ver isso!)";
    }
}
