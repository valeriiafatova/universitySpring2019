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
                        <h2>Login</h2>
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
        <h3 class="mb-30 title_color">Sign in</h3>
        <form:form action="login" method="post">
            <div class="input-group-icon mt-10">
                <div class="icon mt-10"><i class="fa fa-user"></i></div>
                <form:input type="text" path="username" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="username">Login</label><br>
                <form:errors path="username" cssClass="text-danger"/>

            </div>
            <div class="input-group-icon mt-10">
                <div class="icon mt-10"><i class="fa fa-lock"></i></div>
                <form:input type="password" path="password" cssClass="single-input"/>
                <label data-error="wrong" data-success="right" for="password">Your Password</label><br>
                <form:errors path="password" cssClass="text-danger"/>
            </div>
            <div class="mt-25">
                <button type="submit" class="primary-btn text-uppercase enroll">Sign in</button>
            </div>
        </form:form>
    </div>
</section>
<c:import url="footer.jsp"/>

<c:import url="scripts.jsp"/>
</body>
</html>
