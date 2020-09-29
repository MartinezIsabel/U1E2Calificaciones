package alumnos;
import java.util.Scanner;

public class Alumnos {
    Scanner entrada=new Scanner(System.in);
    int alm;
    int op;
    int [] num=new int [15];
    int [] cal=new int[15];
    String [] nom=new String[15];
    public void numeros(){
    num[0]= 18680156;
    num [1]= 19680091;
    num [2]= 19680092;
    num[3]= 19680113;
    num[4]= 19680133;
    num[5]= 17680136;
    num[6]= 18680108;
    num[7]= 19680957;
    num[8]= 19680144;
    num[9]= 19680156;
    num[10]= 19680162;
    num[11]= 19680958;
    num[12]= 19680177;
    num[13]= 18680163;
    num[14]= 18680165;
    
    nom[0]="ACEVEDO CAMPOS ARIAGNA";
     nom[1]="AMBROSIO PEREZ MICHAEL HAZIEL";
     nom[2]="AMBROSIO HERNANDEZ VIANEY CELERINA";
     nom[3]="CAMPOS CASASANERO JUAN PABLO";
     nom[4]="DIAZ DEL JESUS  MARIANA CAZZLING";
     nom[5]="DIAZ ROSAS ALEXIS EFREN";
     nom[6]="DOMIGNUEZ CAZALES JENNIFER IRLANDA";
     nom[7]="ELIGIO RAMOS MONSERRAT";
     nom[8]="FLORES MALDONADO LILIANA ";
     nom[9]="GOMEZ ARAGON EDGAR OMAR";
     nom[10]="GUITERRUEZ VALLE SAMARA";
     nom[11]="JUAREZ RAMOS ALEXIS MANUEL";
     nom[12]="LEYVA SLVA ROGELIO JESUS";
     nom[13]="MARTINEZ DE LOS SANTOS ISABEL";
     nom[14]="MARTINEZ RAYO IRIS MADAI";
     
     
     for(int i=0; i<=14;i++){
         System.out.println("ingresa la calificacion de: "  +num[i]+"-" +nom[i]);
        alm=entrada.nextInt();
        cal[i]=alm;
     }
     do{ 
         int f=0,m;
         System.out.println("-------MENU-------");
         System.out.println("1. Promedio de clase general");
         System.out.println("2. Promedio de 5 primeros");
         System.out.println("3. Promedio de 5 ultimos");
         System.out.println("4. Salir");
         
         int guar;
         
         guar=entrada.nextInt();
         if(guar<=4){
             int con;
             switch(con=guar){
             case 1: 
                 
             f=cal[0]+cal[1]+cal[2]+cal[3]+cal[4]+cal[5]+cal[6]+cal[7]+cal[8]+cal[9]+cal[10]+cal[11]+cal[12]+cal[13]+cal[14];
            
             double pro;
             pro=f/14;
             System.out.println("promedio general: " +pro);
             break;
             case 2: 
            
             f=cal[0]+cal[1]+cal[2]+cal[3]+cal[4];
                     
             double gene;
             gene=f/5;
             System.out.println("promedio de los 5 primeros:" +gene);
             break;
             case 3: 
                 f=cal[10]+cal[11]+cal[12]+cal[13]+cal[14];
                 
             
            
             double ult;
             ult=f/5;
             System.out.println("promedio de los ultimos 5:" +ult);
             break;
             
             case 4: System.exit(0);
             break;
             
                     }
         
         } else{
         System.out.println("Esa opcion no es valida");
         
         } 
             
     System.out.println("Desea otra opcion : 1. si  2.no");
     op=entrada.nextInt();
     
     }while(op==1);
     
    }
    

    public static void main(String[] args) {
       Alumnos obj=new Alumnos();
       obj.numeros();
        
    }
    
}
