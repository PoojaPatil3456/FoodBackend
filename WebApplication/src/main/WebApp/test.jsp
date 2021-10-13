<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Login and Registration Form</title>
      <link rel="stylesheet" href="test.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
      <div class="wrapper">
         <div class="title-text">
            <div class="title login">
               Login Form
            </div>
            <div class="title signup">
               Signup Form
            </div>
         </div>
         <div class="form-container">
            <div class="slide-controls">
               <input type="radio" name="slide" id="login" checked>
               <input type="radio" name="slide" id="signup">
               <label for="login" class="slide login">Login</label>
               <label for="signup" class="slide signup">Signup</label>
               <div class="slider-tab"></div>
            </div>
            <div class="form-inner">
               <form action="userViewPage" class="login">
                  <div class="field">
                     <input type="text" placeholder="userName" name="userName" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="password" name="password" required>
                  </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Login">
                  </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="button" value="Google" onclick="window.location.href = '/oauth2/authorization/google';">
                  </div>
                  <div class="signup-link">
                     Not a member? <a href="">Signup now</a>
                  </div>
               </form>
               <form action="addUser" class="signup" name="register">
               		<div class="field">
                     <input type="text" placeholder="UserId" name="userID" required>
                  </div>
                  <div class="field">
                     <input type="text" placeholder="Name" name="userName" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Password" name="password" required>
                  </div>
                  <div class="field">
                     <input type="Email" placeholder="Email address" name="userEmail"  required>
                    </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Signup" onclick="validate(document.register.userEmail)">
                  </div>
                  
               </form>
            </div>
         </div>
      </div>
      <script type="text/javascript">
         const loginText = document.querySelector(".title-text .login");
         const loginForm = document.querySelector("form.login");
         const loginBtn = document.querySelector("label.login");
         const signupBtn = document.querySelector("label.signup");
         const signupLink = document.querySelector("form .signup-link a");
         signupBtn.onclick = (()=>{
           loginForm.style.marginLeft = "-50%";
           loginText.style.marginLeft = "-50%";
         });
         loginBtn.onclick = (()=>{
           loginForm.style.marginLeft = "0%";
           loginText.style.marginLeft = "0%";
         });
         signupLink.onclick = (()=>{
           signupBtn.click();
           return false;
         });
        /* function validate(){
        	var name=document.getElementById("userName").value;  
        	 var password=document.getElementById("password").value; 
        	   
        	 if (name.value.trim()==""){  
        	   alert("user name can't have blank spaces");  
        	   return false;  
        	 }else if(password.value.trim()==""){  
        	   alert("password can't have blank spaces");  
        	   return false;  
        	   } 
         }*/
         function validate(input) {
        	  var validRegex = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z]$/;
        	  if (input.value.match(validRegex)) {
        	    return true;
        	  } else {
        	    alert("Invalid email address!");
        	  }

        	}
      </script>
   </body>
</html>

