package dominio;

import java.util.Scanner;

public class JuDiscapacidad extends Seguro {

    Scanner entrada = new Scanner(System.in);
    private float salario;
    private int anios;
    private int discapacidad;
    private final float basico = 800;
public JuDiscapacidad(){
}
    public JuDiscapacidad(float salario, int anios, int discapacidad) {
        this.salario = salario;
        this.anios = anios;
        this.discapacidad = discapacidad;
    }

    
    @Override
    public void pagoPencion() {
          
        float porcentaje = (float) (discapacidad*0.01);
        float jubilacion=0;
        float p1 = 0;
        if (anios <= 10) {
            p1 = (float) (basico * (0.5));
        }
        if (anios >= 11 && anios <= 20) {
            p1 = (float) (basico * (0.6));
        }
        if (anios >= 21 && anios <= 30) {
            p1 = (float) (basico * (0.7));
        }
        if (anios >= 31 && anios <= 35) {
            p1 = (float) (basico * (0.8));
        }
        if (anios >= 36 && anios <= 39) {
            p1 = (float) (basico * (0.9));
        }
        if (anios >= 40) {
            p1 = basico;
        }
        
        jubilacion = p1+(porcentaje*salario) ;
        System.out.println("EL PAGADO DE SU PENSCION SE REALIZO DE LA SIGUIENTE FORMA");
        System.out.println("EL SALARIO BASICO ES: " +basico+" $");
        System.out.println("EL PI ES IGUAL A : " +p1+"\nSU PORCENTAJE DE INFLACION ES: " +porcentaje+"% \nSU SALARIO BASE ES: "+salario );
        System.out.println("(PI+( % de discapacidad de su salario base)");
        System.out.println("\n\n----------SU PENSION CORRESPONDE A: "+jubilacion+" $----------");
       
    
 
    }

    public String ingresNombres() {
        String nombres = entrada.nextLine();
        return nombres;
    }

    public float ingresaSalario() {
        float salario = entrada.nextFloat();
        return salario;
    }

    public int ingresaAnios() {
        int anios = entrada.nextInt();
        return anios;
    }

    public int ingresCedula() {
        int cedula = entrada.nextInt();
        return cedula;
    }
}
