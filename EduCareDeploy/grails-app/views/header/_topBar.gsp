<div class="top-menu">
	<ul class="nav navbar-nav pull-right">
		<li class="dropdown dropdown-user"><a href="javascript:;"
			class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"
			data-close-others="true"> <images:getProfilePic /> <span
				class="username username-hide-on-mobile"> <sec:username />
			</span> <i class="fa fa-angle-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-menu-default">
				<li><a href="#"> <i class="icon-user"></i> My Profile
				</a></li>

				<li><a> <sec:ifLoggedIn>

							<form name="submitForm" method="POST" style="margin: 4px 18px"
								action="${createLink(controller: 'logout')}">
								<i class="icon-key"></i> <input type="hidden" name="" value="">
								<a HREF="javascript:document.submitForm.submit()"> Logout </a>
							</form>

						</sec:ifLoggedIn> <sec:ifNotLoggedIn>
							<i class="icon-key"></i>
							<g:link controller="login" action="auth">
									Login
								</g:link>
						</sec:ifNotLoggedIn>

				</a></li>
			</ul></li>
	</ul>
</div>
