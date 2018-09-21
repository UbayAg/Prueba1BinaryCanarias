import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		//creacion de la lista de nombres y del texto
		ArrayList<String> listaNombres = new ArrayList<String>();
		for (int i=1; i<=10; i++){
			listaNombres.add("nombre"+i); 
		}

		String TEXTO = "Esto es un ejemplo de cómo funcionaria la clase\n"
				+ "con los siguientes nombres: AQUI_VAN_LOS_NOMBRES Es posible que\n"
				+ "se quieran volver a mostrar los nombres de nuevo: AQUI_VAN_LOS_NOMBRES\n";
		
		textoFormateado(TEXTO, listaNombres);
	}

	public static String textoFormateado(String TEXTO, ArrayList<String> listaNombres) {
		String nombres = String.join(", ", listaNombres) +".";
		
		String formatedText = TEXTO.replace("AQUI_VAN_LOS_NOMBRES", nombres);
		
		System.out.println(formatedText);
		return formatedText;
	}

}
