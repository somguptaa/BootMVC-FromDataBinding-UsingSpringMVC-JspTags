<%@ page isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red; text-align:center;">
    Register Student
</h1>

<br><br>

<frm:form action="register" method="POST" modelAttribute="stud">
    <table align="center" bgcolor="cyan" cellpadding="8">
        <tr>
            <td>Student Id</td>
            <td><frm:input type="text" path="sno"/></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td><frm:input type="text" path="sname"/></td>
        </tr>
        <tr>
            <td>Student Address</td>
            <td><frm:input type="text" path="sadd"/></td>
        </tr>
        <tr>
            <td>Student Average</td>
            <td><frm:input type="text" path="avg"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>
</frm:form>

<br>

<h3 style="text-align:center;">
    <a href="./">Home</a>
</h3>
