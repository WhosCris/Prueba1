package prueba1;


public class CuentaCorriente extends Cuenta{
    
    public float Sobregiro=0;
    
    
    public void RetirarDinero(float Cantidad, float Saldo){
        if(Cantidad > Saldo){
            super.RetirarDinero(Cantidad);
          Sobregiro=Saldo-Cantidad;
          Saldo=0;
          
        } else{
            Saldo = Saldo - Cantidad;
        }       
    }
    @Override
    public void Consignar(float Monto){
        if(Sobregiro>0){
            super.Consignar(Monto);
            Sobregiro=Sobregiro+Monto;
        }
        
    }
    @Override
    public void ExtractoMensual(float ComisionMensual){
    }
}
        
