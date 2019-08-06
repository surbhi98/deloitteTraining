package com.delloite.mytags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {
		
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
	
		JspWriter out = pageContext.getOut();
		try {
			
			out.println("<h2>Address of delloite</h2>");
			out.println("<h2>Yemalur</h2>");
			out.println("<h2>Bangalore</h2>");
			
		}catch(IOException e)
		{	e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		return super.doStartTag();
	}




}
