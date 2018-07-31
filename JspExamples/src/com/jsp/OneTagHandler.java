package com.jsp;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;


public class OneTagHandler extends TagSupport  {
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("Do Start Tag");
		JspWriter out = pageContext.getOut();
		try {
			out.println(" <h1> Custom Tags </h1> ");
		} catch (Exception e) {
			
		}
		return Tag.EVAL_PAGE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("Do End Tag");
		return super.doEndTag();
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("Do After body");
		return super.doAfterBody();
	}
}
