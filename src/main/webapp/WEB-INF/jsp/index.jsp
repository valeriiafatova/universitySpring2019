<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>

<head>
    <title>University</title>
    <c:import url="head.jsp"/>
</head>

<body>
<c:import url="header.jsp"/>
<!--================ Start Home Banner Area =================-->
<section class="home_banner_area">
    <div class="banner_inner">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="banner_content">
                        <h2>
                            <spring:message code="home.banner.content"/><br>
                            Courses on the Web
                        </h2>
                        <p>
                            In the history of modern astronomy, there is probably no one greater leap forward than the
                            building and launch
                            of
                            the space telescope known as the Hubble.
                        </p>
                        <div class="search_course_wrap">
                            <form action="" class="form_box d-flex justify-content-between w-100">
                                <input type="text" placeholder="Search Courses" class="form-control" name="username"
                                       onfocus="this.placeholder = ''"
                                       onblur="this.placeholder = 'Search Courses'">
                                <button type="submit" class="btn search_course_btn">Search</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--================ End Home Banner Area =================-->

<c:import url="feature.jsp"/>

<c:import url="department.jsp"/>

<c:import url="popularCourses.jsp"/>

<c:import url="fact.jsp"/>

<c:import url="registration_promo.jsp"/>

<c:import url="testimonial.jsp"/>

<c:import url="footer.jsp"/>

<c:import url="scripts.jsp"/>
</body>

</html>