<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Login Details
    </h1>
        <%
List result= (List) request.getAttribute("username");
Iterator it = result.iterator();
out.println("<br>user name is <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>