<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>
<html>
<head>
    <title>Title</title>
    <c:import url="head.jsp"/>
</head>
<c:import url="header.jsp"/>
<!--================Home Banner Area =================-->
<section class="banner_area">
    <div class="banner_inner d-flex align-items-center">
        <div class="overlay"></div>
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="banner_content text-center">
                        <h2>Registration</h2>
                        <p>Please, provide your details to be able to enroll for course and see your ratings.</p>
                        <div class="page_link">
                            <a href="">Home</a>
                            <a href="registration">Registration</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--================End Home Banner Area =================-->

<section class="section-top-border">
    <div class="container col-lg-4">
        ${error}
        <h3 class="mb-30 title_color">Registration Form</h3>
        <form:form action="registration" method="post" modelAttribute="registrationForm">

            <div class="mt-10">
                <form:input type="text" path="first_name" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="first_name">First name</label><br>
                <form:errors path="first_name" cssClass="text-danger"/>
            </div>
            <div class="mt-10">
                <form:input type="text" path="last_name" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="last_name">Last name</label><br>
                <form:errors path="last_name" cssClass="text-danger"/>

            </div>
            <div class="input-group-icon mt-10">
                <div class="icon mt-10"><i class="fa fa-user"></i></div>
                <form:input type="text" path="login" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="login">Login</label><br>
                <form:errors path="login" cssClass="text-danger"/>

            </div>
            <div class="input-group-icon mt-10">
                <div class="icon mt-10"><i class="fa fa-lock"></i></div>
                <form:input type="password" path="password" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="password">Your Password</label><br>
                <form:errors path="password" cssClass="text-danger"/>

            </div>
            <div class="input-group-icon mt-10">
                <div class="icon mt-10"><i class="fa fa-lock"></i></div>
                <form:input type="password" path="password_confirm" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="password_confirm">Confirm password</label><br>
                <form:errors path="password_confirm" cssClass="text-danger"/>
            </div>
            <div class="mt-25">
                <button type="submit" class="primary-btn text-uppercase enroll">Registration</button>
            </div>
        </form:form>
    </div>
</section>
<c:import url="footer.jsp"/>

<c:import url="scripts.jsp"/>
</body>
</html>
