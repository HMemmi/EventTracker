<!DOCTYPE html>
<html ng-app>
<head>
<title>helloo my events</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script src="events.js"></script>

</head>


<body>

	<div ng-controller="Events">

		I have {{events.length}}
		<ul>
			<li ng-repeat="event in events">{{event.name}}</li>
		</ul>

	</div>

</body>

