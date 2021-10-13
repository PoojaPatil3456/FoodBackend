<!DOCTYPE html>
<html>
<head>
 <title>read blogs</title>
</head>

<style type="text/css">

*{
 margin: 0px;
 padding: 0px;
}
body{
 background:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7_M1prmAP5rYhJJ11I36-IANlb1QXQoqTZTZllWu75gsRHcKJ-WUVDOYBIi4_dmDY8wE&usqp=CAU?auto=compress&cs=tinysrgb&h=750&w=1260) no-repeat;
   background-size: cover;
   height:100%;
   background-color: #000;
 font-family: arial;
}
.main{
 margin-top: 500px;
 margin-left:200px;

}

.card{
     width: 25%;
     display: inline-block;
     border-color:black;
     border-radius: 5px; 
     margin: 2%;
    }
.card:hover{
	box-shadow: 2px 2px 20px black;
}

.image img{
  width: 100%;
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
 
 }

.title{
  font-size:20px;
  text-align: center;
  padding: 10px;
  
 }

h1{
  font-size: 30px;
 }

.des{
  padding: 3px;
  text-align: center;
  padding-top: 10px;
  border-bottom-right-radius: 5px;
  border-bottom-left-radius: 5px;
}
button{
  margin-top: 40px;
  margin-bottom: 10px;
  background-color: purple;
  border: 1px solid black;
  border-radius: 5px;
  padding:10px;
}
button:hover{
  background-color: black;
  color: white;
  transition: .5s;
  cursor: pointer;
}

</style>
<body>

<div class="main">

 <!--cards -->

<div class="card">

<div class="image">
   <img src="https://assets.traveltriangle.com/blog/wp-content/uploads/2016/08/incredible-india-cover.jpg">
</div>
<div class="title">
 <h1>Culture</h1>
</div>
<div class="des">
 <p>Indian culture is the heritage of social norms, ethical values, traditional customs, artifacts and technologies that originated in or are associated with the Indian subcontinent.</p>
<form action="culture">  
     <button type="submit">Read More...</button>  
 </form>
</div>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGbI5mI51MrlAUlbSSBv5_NK8q81WrSu0SXQ&usqp=CAU">
</div>
<div class="title">
 <h1>
Places To Visit</h1>
</div>
<div class="des">
 <p>the One land that all men desire to see, and having seen once, by even a glimpse, would not give that glimpse for all the shows of all the rest of the globe combined.</p>
<form action="place">  
     <button type="submit">Read More...</button>  
 </form>
</div>
</div>
<!--cards -->


<div class="card">

<div class="image">
   <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-h95RN7L07HLqOfird3dknDwi6qvksbqg0w&usqp=CAU">
</div>
<div class="title">
 <h1>Food</h1>
</div>
<div class="des">
 <p>In India as elsewhere, food culture is shaped by climate, land, and access to natural resources</p>
<form action="food">  
     <button type="submit">Read More...</button>  
 </form>
</div>
</div>
<!--cards -->

</div>
</body>
</html>