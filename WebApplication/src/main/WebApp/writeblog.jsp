<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="writeblog.css">
</head>
<body>
<div id="blog-form">
  <div>
    <h1>Write Your Blog Here</h1> 	 
  </div>
       <form method="post" action="saveblog">
      <div>
          <label for="state">
          <span>State: </span>
            <select id="state" name="stateName" tabindex="4">   
               <option value="hello">Maharashtra</option>
               <option value="quote">Tamil Nadu</option>  
               <option value="general">Gujarat</option>
            </select>
          </label>
      </div>
      
      <div>             
          <label for="tag">
          <span>Tag: </span>
            <select id="tag" name="tag" tabindex="4">   
               <option value="hello">Culture</option>
               <option value="quote">Food</option>  
               <option value="general">Place</option>
            </select>
          </label>
      </div>
      <div>
          <label for="email">
            <span class="required">Email: *</span>
            <input type="email" id="email" name="email" value="" placeholder="Your Email" tabindex="2" required="required" />
          </label>  
      </div>
      <div>             
          <label for="message">
            <span class="required">Message: *</span> 
            <textarea id="comment" name="comment" placeholder="write your message here." tabindex="5" required="required"></textarea> 
          </label>  
      </div>
      <div>              
          <button name="saveblog" type="submit" id="submit" >SAVE</button> 
      </div>
       </form>

  </div>

</body>
</html>