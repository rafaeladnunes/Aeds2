//pesquisa binaria por uma chave de um objeto 

public boolean pesquisaB(String time)throws Exception{
   		boolean resp = false;
   		int m;
		int i = 0;
		int f= n - 1;
		while (i <= f) {
		        m = (i + f)/2;
		        cont++;
		        if (time.compareTo(array[m].getPais()) == 0){
		            resp = true;
		        }
		        cont++;
		        if (time.compareTo(array[m].getPais()) < 0){
		            f = m - 1;
		        }
		        else{
		            i = m + 1;
		        }
		}
   		return resp;

    }