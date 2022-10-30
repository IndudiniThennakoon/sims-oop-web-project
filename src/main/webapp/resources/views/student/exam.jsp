<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, user-scalable=0"
    />
    <title>Preskool - Exam</title>

    <link rel="shortcut icon" href="assets/img/favicon.png" />

    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&amp;display=swap"
    />

    <link
      rel="stylesheet"
      href="assets/plugins/bootstrap/css/bootstrap.min.css"
    />

    <link
      rel="stylesheet"
      href="assets/plugins/fontawesome/css/fontawesome.min.css"
    />
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css" />

    <link
      rel="stylesheet"
      href="assets/plugins/datatables/datatables.min.css"
    />

    <link rel="stylesheet" href="assets/css/style.css" />
  </head>
  <body>
    <div class="main-wrapper">
      <div class="header">
        <div class="header-left">
          <a href="index.html" class="logo">
            <img src="assets/img/logo.png" alt="Logo" />
          </a>
          <a href="index.html" class="logo logo-small">
            <img
              src="assets/img/logo-small.png"
              alt="Logo"
              width="30"
              height="30"
            />
          </a>
        </div>

        <a href="javascript:void(0);" id="toggle_btn">
          <i class="fas fa-align-left"></i>
        </a>

        <div class="top-nav-search">
          <form>
            <input type="text" class="form-control" placeholder="Search here" />
            <button class="btn" type="submit">
              <i class="fas fa-search"></i>
            </button>
          </form>
        </div>

        <a class="mobile_btn" id="mobile_btn">
          <i class="fas fa-bars"></i>
        </a>

        <ul class="nav user-menu">
          <li class="nav-item dropdown has-arrow">
            <a
              href="#"
              class="dropdown-toggle nav-link"
              data-bs-toggle="dropdown"
            >
              <span class="user-img"
                ><img
                  class="rounded-circle"
                  src="assets/img/profiles/avatar-01.jpg"
                  width="31"
                  alt="Ryan Taylor"
              /></span>
            </a>
            <div class="dropdown-menu">
              <div class="user-header">
                <div class="avatar avatar-sm">
                  <img
                    src="assets/img/profiles/avatar-01.jpg"
                    alt="User Image"
                    class="avatar-img rounded-circle"
                  />
                </div>
                <div class="user-text">
                  <h6>Ryan Taylor</h6>
                  <p class="text-muted mb-0">Administrator</p>
                </div>
              </div>
              <a class="dropdown-item" href="profile.html">My Profile</a>
              <a class="dropdown-item" href="login.html">Logout</a>
            </div>
          </li>
        </ul>
      </div>

      <div class="sidebar" id="sidebar">
        <div class="sidebar-inner slimscroll">
          <div id="sidebar-menu" class="sidebar-menu">
            <ul>
              <li class="menu-title">
                <span>Main Menu</span>
              </li>
              <li class="submenu">
                <a href="#"
                  ><i class="fas fa-user-graduate"></i> <span> Dashboard</span>
                  <span class="menu-arrow"></span
                ></a>
                <ul>
                  <li>
                    <a href="student-dashboard.html">Student Dashboard</a>
                  </li>
                </ul>
              </li>
              <li class="submenu">
                <a href="#"
                  ><i class="fas fa-user-graduate"></i> <span> Students</span>
                  <span class="menu-arrow"></span
                ></a>
                <ul>
                  <li><a href="students.html">Student List</a></li>
                  <li><a href="student-details.html">Student View</a></li>
                  <li><a href="edit-student.html">Student Edit</a></li>
                </ul>
              </li>
              <li class="active">
                <a href="exam.html"
                  ><i class="fas fa-clipboard-list"></i>
                  <span>Exam list</span></a
                >
              </li>
              <li>
                <a href="time-table.html"
                  ><i class="fas fa-table"></i> <span>Time Table</span></a
                >
              </li>
            </ul>
          </div>
        </div>
      </div>

      <div class="page-wrapper">
        <div class="content container-fluid">
          <div class="page-header">
            <div class="row align-items-center">
              <div class="col">
                <h3 class="page-title">Exam</h3>
                <ul class="breadcrumb">
                  <li class="breadcrumb-item">
                    <a href="index.html">Dashboard</a>
                  </li>
                </ul>
              </div>
              <div class="col-auto text-end float-end ms-auto">
                <a href="#" class="btn btn-outline-primary me-2"
                  ><i class="fas fa-download"></i> Download</a
                >
                <a href="add-exam.html" class="btn btn-primary"
                  ><i class="fas fa-plus"></i
                ></a>
              </div>
            </div>
          </div>

          <div class="row">
            <div class="col-sm-12">
              <div class="card card-table">
                <div class="card-body">
                  <div class="table-responsive">
                    <table
                      class="table table-hover table-center mb-0 datatable"
                    >
                      <thead>
                        <tr>
                          <th>Exam Name</th>
                          <th>Class</th>
                          <th>Subject</th>
                          <th>Start Time</th>
                          <th>End Time</th>
                          <th>Date</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>
                            <h2>
                              <a>Class Test</a>
                            </h2>
                          </td>
                          <td>10</td>
                          <td>English</td>
                          <td>10:00 AM</td>
                          <td>01:00 PM</td>
                          <td>23 Apr 2020</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

 
			<jsp:include page="/resources/views/student/components/footer.jsp" />
		</div>
	</div>

	<jsp:include page="/resources/views/student/components/scripts.jsp" />
  </body>
</html>
