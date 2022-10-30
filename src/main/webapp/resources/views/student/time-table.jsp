<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, user-scalable=0"
    />
    <title>Preskool - Time Table</title>

    <link rel="shortcut icon" href="assets/img/favicon.png" />

    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&amp;display=swap"
    />

    <jsp:include page="/resources/views/student/components/styles.jsp" />
</head>

<body>

   <div class="main-wrapper">
   
		<jsp:include page="/resources/views/student/components/header.jsp" />
		<jsp:include page="/resources/views/student/components/sidebar.jsp" /> 

      <div class="page-wrapper">
        <div class="content container-fluid">
          <div class="page-header">
            <div class="row align-items-center">
              <div class="col">
                <h3 class="page-title">Time Table</h3>
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
                <a href="add-time-table.html" class="btn btn-primary"
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
                          <th>ID</th>
                          <th>Name</th>
                          <th>Class</th>
                          <th>Subject</th>
                          <th>Start Time</th>
                          <th>End Time</th>
                          <th>Date</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>PRE2309</td>
                          <td>
                            <h2 class="table-avatar">
                              <a class="avatar avatar-sm me-2"
                                ><img
                                  class="avatar-img rounded-circle"
                                  src="assets/img/profiles/avatar-01.jpg"
                                  alt="User Image"
                              /></a>
                              <a>Aaliyah</a>
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
