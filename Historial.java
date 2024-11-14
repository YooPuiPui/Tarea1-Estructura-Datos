import java.util.ArrayList;
import java.util.List;
//inicio de cracion del historial
public class Historial{
    private List<String> registros;

    public Historial(){
        registros=new ArrayList<>();
    }

    //aÃ±adir al historial
    public void registrarOperacion(String operacion){
        registros.add(operacion);
    }

    //mostrar todo el historial
    public void mostrarHistorial(){
        if(registros.isEmpty()){
            System.out.println("No se han registrado movimientos aun.");
        }else{
            System.out.println("Historial de movimientos:");
            for(String registro:registros){
                System.out.println(registro);
            }
        }
    }
}