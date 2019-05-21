<script>

   function razaoAurea(x, y, k){
   
    	var c = y;
    	var a = x;
    	var i = 1;

    	while(i<=k){
      	   var t = c;
     	   c = c + a;
     	   a = t;
     	   i = i + 1;
   	}

  	return c/a;    
   }
   
</script>






