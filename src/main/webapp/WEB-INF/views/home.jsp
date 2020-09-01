<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Busy Books</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">
    <jsp:include page="sidebar.jsp"/>

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">


                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">


                    <div class="topbar-divider d-none d-sm-block"></div>

                    <!-- Nav Item - User Information -->
                    <sec:authorize access="isAuthenticated()">
                        <li>
                            <a class="nav-link" href="<c:url value="/logout"/>">
                                <img class="img-profile rounded-circle" src="<c:url value="/img/icon.png"/>">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Witaj <sec:authentication
                                        property="principal.name"/> !</span>
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Wyloguj się</span>
                            </a></li>
                    </sec:authorize>

                    <sec:authorize access="!isAuthenticated()">
                        <li>
                            <a class="nav-link"
                               href="<c:url value="http://localhost:8180/auth/realms/BusyBook/protocol/openid-connect/auth?response_type=code&client_id=busybooks-client"/>">
                                <img class="img-profile rounded-circle" src="<c:url value="/img/icon.png"/>">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Zaloguj się</span>
                            </a></li>
                    </sec:authorize>
                </ul>

                </ul>

            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">STRONA GŁÓWNA</h1>
                </div>


                <%--                    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>--%>

            </div>

            <!-- Content Row -->
            <div class="row">
                <a href="<c:url value="/clients/"/>" class="btn btn-primary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-flag"></i>
                    </span>
                    <span class="text">KONTRAHENCI</span>
                </a>

                <a href="<c:url value="/invoices/"/>" class="btn btn-primary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-flag"></i>
                    </span>
                    <span class="text">FAKTURY</span>
                </a>


                <a href="<c:url value="/tasks/"/>" class="btn btn-primary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-flag"></i>
                    </span>
                    <span class="text">ZADANIA</span>
                </a>

                <sec:authorize access="hasRole('ADMIN')">
                    <a href="<c:url value="/admin/users/"/>" class="btn btn-primary btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-flag"></i>
                    </span>
                        <span class="text">UŻYTKOWNICY</span>
                    </a>
                </sec:authorize>

            </div>

            <!-- Content Row -->

            <div class="row">


            </div>

            <!-- Content Row -->
            <div class="row">

                <!-- Content Column -->
                <div class="col-lg-6 mb-4">


                </div>

                <div class="col-lg-6 mb-4">


                </div>
            </div>

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- End of Main Content -->

    <jsp:include page="footer.jsp"/>

</div>
<!-- End of Content Wrapper -->


</div>
</body>
</html>
