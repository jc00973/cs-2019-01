<script>
   
   function raiz(n, i){
   		
        var r = 1;
        
        while(0<=i){
            r = (r+n/r)/2;
            i = i - 1;
        }
        
        return r;
   }

</script>






