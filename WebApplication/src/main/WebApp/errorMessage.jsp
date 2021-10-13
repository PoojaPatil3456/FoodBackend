<!DOCTYPE html>
<html>
<body onload="myFunction()">
<script>
function myFunction() {
	var txt;
	   if (confirm("You Entered Wrong Credentials...Do You want to Register?")) {
		   window.location.href = "test.jsp";
	   } else {
		   window.location.href = "home.jsp";
	   }
}
</script>
</body>
</html>
