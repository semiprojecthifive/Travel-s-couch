/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2018-07-25 08:54:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import member.model.vo.Member;

public final class memberListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../../adminHeader.jsp", Long.valueOf(1532504720119L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");

	ArrayList<Member> list = 
		(ArrayList<Member>)request.getAttribute("list");

      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>memberListView</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');

	//jsp 파일 안에는 request, session 객체도 내장되어 있음
	String userName = (String)session.getAttribute("userName");
	String userid = (String)session.getAttribute("userId");

      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#menubar ul li {\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\twidth: 120px;\r\n");
      out.write("\t\theight: 35px;\r\n");
      out.write("\t\tdisplay: inline;\r\n");
      out.write("\t\tbackground: orange;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#menubar\r\n");
      out.write("\t\r\n");
      out.write("\thr { clear: both; }\r\n");
      out.write("\t\r\n");
      out.write("\tdiv#loginForm table {\r\n");
      out.write("\t\tbackground : LightSkyBlue;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<h1>second</h1>\r\n");
      out.write("<nav id=\"menubar\">\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"/second/index.jsp\">home</a></li>\r\n");
      out.write("\t<li><a href=\"/second/mlist\">회원관리</a></li>\r\n");
      out.write("\t<li><a>공지관리</a></li>\r\n");
      out.write("\t<li><a>게시글관리</a></li>\r\n");
      out.write("\t<li><a>사진게시판관리</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"loginForm\">\r\n");
 if(userName == null){ 
      out.write("\r\n");
      out.write("<form action=\"/second/login\" method=\"post\">\r\n");
      out.write("<table width=\"250\" height=\"75\" cellspacing=\"0\" \r\n");
      out.write("cellpadding=\"0\">\r\n");
      out.write("<tr><td width=\"200\">\r\n");
      out.write("\t<input type=\"text\" name=\"userid\" id=\"userid\" size=\"15\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"50\" rowspan=\"2\">\r\n");
      out.write("\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("\t<input type=\"password\" name=\"userpwd\" size=\"15\">\r\n");
      out.write("   </td></tr>\r\n");
      out.write("<tr><td colspan=\"2\">\r\n");
      out.write("\t<a href=\"views/member/memberEnroll.html\">회원가입</a> &nbsp;\r\n");
      out.write("\t<a href=\"#\">아이디/암호조회</a>\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<table width=\"250\" height=\"75\" cellspacing=\"0\" \r\n");
      out.write("cellpadding=\"0\">\r\n");
      out.write("<tr><td width=\"150\">\r\n");
      out.write("\t");
      out.print( userName );
      out.write(" 님.\r\n");
      out.write("\t</td>\r\n");
      out.write("\t<td width=\"100\">\r\n");
      out.write("\t<a href=\"/second/logout\">로그아웃</a>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("<tr><td>\t메일 개 </td> <td>쪽지  개</td></tr>\r\n");
      out.write("<tr><td colspan=\"2\">\r\n");
      out.write("\t<a href=\"/second/myinfo?userid=");
      out.print( userid );
      out.write("\">내 정보보기</a>\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<h1 align=\"center\">회원 전체 리스트 페이지</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<table align=\"center\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<th>아이디</th>\r\n");
      out.write("\t<th>암호</th>\r\n");
      out.write("\t<th>이름</th>\r\n");
      out.write("\t<th>성별</th>\r\n");
      out.write("\t<th>나이</th>\r\n");
      out.write("\t<th>전화번호</th>\r\n");
      out.write("\t<th>이메일</th>\r\n");
      out.write("\t<th>취미</th>\r\n");
      out.write("\t<th>하고싶은말</th>\r\n");
      out.write("\t<th>가입날짜</th>\r\n");
      out.write("\t<th>마지막수정날짜</th>\r\n");
      out.write("\t<th>로그인제한</th>\r\n");
      out.write("</tr>\r\n");
 for(Member m : list){ 
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>");
      out.print( m.getUserId() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getUserPwd() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getUserName() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getGender() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getAge() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getPhone() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getEmail() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getHobby() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getEtc() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getEnrollDate() );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print( m.getLastModifiedDate() );
      out.write("</td>\r\n");
      out.write("\t<td><input type=\"checkbox\" name=\"check\"></td>\r\n");
      out.write("</tr>\r\n");
 } 
      out.write("\r\n");
      out.write("<tr><th colspan=\"12\">\r\n");
      out.write("\t<button id=\"loginStop\">로그인제한실행</button>\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("\t<button id=\"loginRun\">로그인허용실행</button>\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}