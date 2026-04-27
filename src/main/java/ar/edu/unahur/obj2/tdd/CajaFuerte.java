package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
  private int clave;
  private boolean abierto;

  public CajaFuerte(int clave) {
  this.clave = clave;
  this.abierto = false;
  }
  public boolean AbrirCajaFuerte(int clave2){
    if (clave2 == clave) {
        abierto = true;
        System.out.println("la caja fuerte esta abierta.");
        return true;
    }
    else{
        abierto = false;
        System.out.println("clave incorrecta, caja fuerte bloqueada.");
        return false;
    }
    
  }
  public void EstadoActual(){
    if (abierto == true){
      System.out.println("La caja de fuerte esta abierta");
    }
    else{
      abierto = false;
      System.out.println("La caja fuerte esta cerrada");
    }
  }
  public void CerrarCajaFuerte(){
    abierto = false;
  }

  public int getClave() {
    return clave;
  }
}
