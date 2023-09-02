package prueba1;


public class Cuenta {
    
    private float Saldo;
    private int NumConsignaciones=0;
    public int NumRetiro=0;
    public float TasaAnual;
    public float ComisionMensual=0;

//Get
    public float getSaldo(float Saldo, float TasaAnual){
        return this.Saldo;
    };
    public float getTasaAnual(float TasaAnual){
        return this.TasaAnual;}
//Set
    public void setSaldo(float Saldo){
    this.Saldo = Saldo;
    };
    
    public void setTasaAnual(float TasaAnual){
        this.TasaAnual= TasaAnual /100;
    };
//Metodos
    public void Consignar(float Monto){
        this.NumConsignaciones = NumConsignaciones +1;
        this.Saldo = this.Saldo + Monto;
    }
    
    public void RetirarDinero(float Cantidad){
        if(Cantidad > this.Saldo){
            System.out.println("No se puede retirar mas dinero del exitente en la cuenta");
        } else{
            this.Saldo = Saldo - Cantidad;
        }
    }
    
    public void InteresMensual(float Interes){
        this.Saldo = Saldo - Interes;
    }
    
    public void ExtractoMensual(float ComisionMensual){
        this.Saldo =Saldo-ComisionMensual;
        this.InteresMensual(Saldo);
    };
    
    public void Imprimir(float Saldo, int NumConsignaciones, float ComisionMensual){
        System.out.println(this.ComisionMensual);
        System.out.println(this.Saldo);
        System.out.println(this.NumConsignaciones);
        
    }
    
    }
