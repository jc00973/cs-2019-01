<script>
	
    function quadradoPerfeito(n){
   	
    	var i = 1;
        var s = 1;
        
        while(s<n){
            i = i+2;
            s = s+i;
        }
        
        return s == n;
   }

</script>






