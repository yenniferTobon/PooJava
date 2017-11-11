<%@ include file="header.jsp" %>

       <form method="POST" action="./AdminUsuarios">
           Id: <input type="text" name="id" /><br /><br />
           Name: <input type="text" name="name" /><br /><br />
           Price: <input type="text" name="price" /><br /><br />
           <input type="submit" value="Guardar" />
       </form>       
       <c:if test="${not empty usuarios}">
           <table class="tg">
           <tr><th width="80">ID</th>
               <th width="120">Name</th>
               <th width="120">Price</th></tr>
           <c:forEach items="${usuarios}" var="pro">
               <tr><td>${pro.getId()}</td>
                   <td>${pro.getName()}</td>
                   <td>${pro.getPrice()}</td></tr>
           </c:forEach>
           </table>
       </c:if>
 <%@ include file="footer.jsp" %> 
