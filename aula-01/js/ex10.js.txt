<script>
   
   function logaritmoNatural(n, k){
   
   	var i = 2;
        var e = 1 + n;
        var numerador = n;
        var denominador = 1;
        
        while(i<=k){
            numerador = numerador*numerador;
            denominador = denominador*i;
            e = e + numerador/denominador;
            i = i + 1;
        }
        
        return e;   
   }
   
</script>






