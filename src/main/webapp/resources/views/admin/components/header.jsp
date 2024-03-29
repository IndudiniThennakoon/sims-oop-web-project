
<!-- If user not loged in as admin then redirect to login -->
${user == null || user.type != "admin" ? "<script>location.href = '/logout'</script>" : ""}
<!-- ================================================================================== -->

<div class="header">

	<div class="header-left">
		<a href="index.html" class="logo"> <img
			src="/resources/assets/img/logo.png" alt="Logo">
		</a> <a href="index.html" class="logo logo-small"> <img
			src="/resources/assets/img/logo-small.png" alt="Logo" width="30"
			height="30">
		</a>
	</div>

	<a href="javascript:void(0);" id="toggle_btn"> <i
		class="fas fa-align-left"></i>
	</a>

	<div class="top-nav-search">
		<form>
			<input type="text" class="form-control" placeholder="Search here">
			<button class="btn" type="submit">
				<i class="fas fa-search"></i>
			</button>
		</form>
	</div>


	<a class="mobile_btn" id="mobile_btn"> <i class="fas fa-bars"></i>
	</a>


	<ul class="nav user-menu">

		<li class="nav-item dropdown noti-dropdown"><a href="#"
			class="dropdown-toggle nav-link" data-bs-toggle="dropdown"> <i
				class="far fa-bell"></i> <span class="badge badge-pill">3</span>
		</a>
			<div class="dropdown-menu notifications">
				<div class="topnav-dropdown-header">
					<span class="notification-title">Notifications</span> <a
						href="javascript:void(0)" class="clear-noti"> Clear All </a>
				</div>
				<div class="noti-content">
					<ul class="notification-list">
						<li class="notification-message"><a href="#">
								<div class="media d-flex">
									<span class="avatar avatar-sm flex-shrink-0"> <img
										class="avatar-img rounded-circle" alt="User Image"
										src="/resources/assets/img/profiles/avatar-02.jpg">
									</span>
									<div class="media-body flex-grow-1">
										<p class="noti-details">
											<span class="noti-title">Carlson Tech</span> has approved <span
												class="noti-title">your estimate</span>
										</p>
										<p class="noti-time">
											<span class="notification-time">4 mins ago</span>
										</p>
									</div>
								</div>
						</a></li>
					</ul>
				</div>
				<div class="topnav-dropdown-footer">
					<a href="#">View all Notifications</a>
				</div>
			</div></li>


		<li class="nav-item dropdown has-arrow"><a href="#"
			class="dropdown-toggle nav-link" data-bs-toggle="dropdown"> <span
				class="user-img"><img class="rounded-circle"
					src="/resources/assets/img/profiles/avatar-01.jpg" width="31"
					alt="Ryan Taylor"></span>
		</a>
			<div class="dropdown-menu">
				<div class="user-header">
					<div class="avatar avatar-sm">
						<img src="/resources/assets/img/profiles/avatar-01.jpg"
							alt="User Image" class="avatar-img rounded-circle">
					</div>
					<div class="user-text">
						<h6>Ryan Taylor</h6>
						<p class="text-muted mb-0">Administrator</p>
					</div>
				</div>
				<a class="dropdown-item" href="/profile">My Profile</a> <a
					class="dropdown-item" href="/logout">Logout</a>
			</div></li>

	</ul>

</div>
