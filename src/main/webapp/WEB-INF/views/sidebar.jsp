<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <li>
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<c:url value="/"/>"><img src="<c:url value="img/BUSYBOOKSLOGO.png"/>" alt="busybookslogo"/></a>
    </li>
    <!-- Divider -->
    <hr class="sidebar-divider my-0">

<%--    <!-- Nav Item - Dashboard -->--%>
<%--    <li class="nav-item active">--%>
<%--        <a class="nav-link" href="index.html">--%>
<%--            <i class="fas fa-fw fa-tachometer-alt"></i>--%>
<%--            <span>Dashboard</span></a>--%>
<%--    </li>--%>

<%--    <!-- Divider -->--%>
<%--    <hr class="sidebar-divider">--%>

    <!-- Heading -->
    <div class="sidebar-heading">

    </div>

    <!-- Nav Item - Pages Collapse Menu -->
<%--    <li class="nav-item">--%>
<%--        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">--%>
<%--            <i class="fas fa-fw fa-cog"></i>--%>
<%--            <span>Components</span>--%>
<%--        </a>--%>
<%--        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">--%>
<%--            <div class="bg-white py-2 collapse-inner rounded">--%>
<%--                <h6 class="collapse-header">Custom Components:</h6>--%>
<%--                <a class="collapse-item" href="buttons.html">Buttons</a>--%>
<%--                <a class="collapse-item" href="cards.html">Cards</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </li>--%>

    <!-- Nav Item - Utilities Collapse Menu -->
<%--    <li class="nav-item">--%>
<%--        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">--%>
<%--            <i class="fas fa-fw fa-wrench"></i>--%>
<%--            <span>Utilities</span>--%>
<%--        </a>--%>
<%--        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">--%>
<%--            <div class="bg-white py-2 collapse-inner rounded">--%>
<%--                <h6 class="collapse-header">Custom Utilities:</h6>--%>
<%--                <a class="collapse-item" href="utilities-color.html">Colors</a>--%>
<%--                <a class="collapse-item" href="utilities-border.html">Borders</a>--%>
<%--                <a class="collapse-item" href="utilities-animation.html">Animations</a>--%>
<%--                <a class="collapse-item" href="utilities-other.html">Other</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </li>--%>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">

    </div>


    <!-- Nav Item - Tables -->
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/clients/"/>">
            <i class="fas fa-fw fa-table"></i>
            <span>Kontrahenci</span></a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/invoices/"/>">
            <i class="fas fa-fw fa-table"></i>
            <span>Faktury</span></a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/tasks/"/>">
            <i class="fas fa-fw fa-table"></i>
            <span>Zadania</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">

    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>

</ul>
<!-- End of Sidebar -->
