package appgrados;

class CGrados {
    private float GradosCentigrados;
    
    public void AsignarCentigrados(float GC){
        GradosCentigrados = GC;
    }
    
    public float ObtenerFahrenheit() {
        return 9F/5F * GradosCentigrados + 32;
    }
    
    public float ObtenerCentigrados(){
        return GradosCentigrados;
    }
}
