<script>
	
    function diaDaSemana(d, m, a){
    
    	if((m==1)||(m==2)){
            m = m+12;
            a = a-1;
        }
        
        var s = d+2*m+3*(m+1)/5+a+a/4-a/100+a/400;
		
        return Math.floor(s%7);
    }
    
</script>






