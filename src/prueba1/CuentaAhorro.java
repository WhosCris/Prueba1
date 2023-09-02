package prueba1;


public class CuentaAhorro extends Cuenta{
    private boolean Active;
    
    public void EstadoDeCuenta(boolean Active){
        if(this.getSaldo(TasaAnual, TasaAnual)>15000){
            this.Active = true;
        } else{
            Active = false;
        }
    }
    @Override
        public void Consignar(float Monto){
            if(this.Active){
                super.Consignar (Monto);
            }
    
    }
        @Override
        public void RetirarDinero(float Cantidad){
            if(this.Active){
                super.RetirarDinero(Cantidad);
            }
        }
        //@Override
        public void ExtractoMensual(float ComisionMensual,int NumRetiros){
            if(NumRetiros>4){
                
            }
                
        }
}

