<html>
    <head>
    <style>
	
	* {
            padding: 0;
            margin: 0;
            font-family: sans-serif;
        }
  
        body {
  	background-image: url('lL6psaelUc7kRs7b-croppedoSnWr-jpg');
  	background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: cover;
	}
  
        .container {
            text-align: center;
            position: absolute;
            top: 20%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 100%;
        }
  
        .container span {
            display: block;
        }
  
        .text1 {
            color: black;
            font-size: 70px;
            font-weight: 700;
            letter-spacing: 8px;
            margin-bottom: 20px;
            position: relative;
            animation: text 3s 1;
        }
  
        .text2 {
            font-size: 30px;
            color: darkBlue;
            font-family: Georgia, serif;
        }
  
        @keyframes text {
            0% {
                color: black;
                margin-bottom: -40px;
            }
  
            30% {
                letter-spacing: 25px;
                margin-bottom: -40px;
            }
  
            85% {
                letter-spacing: 8px;
                margin-bottom: -40px;
            }
        }
        .text-block {
  			position: absolute;
  			bottom: 20px;
 			right: 20px;
			background-color: black;
 			color: white;
 			padding-left: 20px;
 		 	padding-right: 20px;
			}
			.text {
		margin-top:300px;
		margin-left:100px; 
        background: rgb(0, 0, 0);/* Fallback color */
        background: rgba(0, 0, 0, 0.5);/* Black background with opacity */
        color: #ffffff;
        width: 30%;
        height:50%;
        padding: 20px;
      }
      .text:hover{
	box-shadow: 2px 2px 20px black;
}
h2{
font-size: 30px;
text-align:center;
font-family: Georgia, serif;
}
p{
padding: 20px;
font-size: 25px;
text-align:center;
font-family: Georgia, serif;
}

.wrapper{
  position: fixed;
  top: 85%;
  left: 70%;
  transform: translate(-50%, -50%);
}

.link_wrapper{
  position: relative;
}

a{
  display: block;
  width: 250px;
  height: 50px;
  line-height: 50px;
  font-weight: bold;
  text-decoration: none;
  background: #333;
  text-align: center;
  color: #fff;
  text-transform: uppercase;
  letter-spacing: 1px;
  border: 3px solid #333;
  transition: all .35s;
}

.icon{
  width: 50px;
  height: 50px;
  border: 3px solid transparent;
  position: absolute;
  transform: rotate(45deg);
  right: 0;
  top: 0;
  z-index: -1;
  transition: all .35s;
}

.icon svg{
  width: 30px;
  position: absolute;
  top: calc(50% - 15px);
  left: calc(50% - 15px);
  transform: rotate(-45deg);
  fill: #2ecc71;
  transition: all .35s;
}

a:hover{
  width: 200px;
  border: 3px solid #2ecc71;
  background: transparent;
  color: #2ecc71;
}

a:hover + .icon{
  border: 3px solid #2ecc71;
  right: -25%;
}
	</style>
    </head>
    <body>
    	<div class="container">
        <div class="row">
            <span class="text1">Incredible India!</span>
            <span class="text2">For those who love India</span>
        </div>
    </div>
  <div class="text">
        <h2>India</h2>
        <p>
        India represents "Unity in Diversity".Our country is a mixture of cultures, regions, traditions, diversity in food, languages, etc. Our people of India are so polite, understanding and helping in nature. The national bird of India is Peacock and is very beautiful. India is so incredible and is full of colors and has the tiger as its national animal, hockey as its national game, etc. the national language or mother tongue of our country is Hindi. Indians are also so talented and have shown very high growth. The I.T. sector of our country shows accelerating growth due to intelligent software engineers.
        </p>
      </div>
  <div class="wrapper">
  <div class="link_wrapper">
    <a href="test">Click Me!</a>
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 268.832 268.832">
        <path d="M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z"/>
      </svg>
    </div>
  </div>
  
</div>

    </body>
</html>    