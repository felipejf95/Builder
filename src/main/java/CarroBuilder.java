public class CarroBuilder {

    private Carro carro;

    public CarroBuilder(){
        carro = new Carro();
    }

    public Carro build(){
        if(carro.getAnoModelo() == 0){
            throw new IllegalArgumentException("Ano do modelo invalido");
        }
        if(carro.getAnoFabricação() == 0){
            throw new IllegalArgumentException("Ano de fabricacao invalido");
        }
        return carro;
    }

    public CarroBuilder setAnoFabricacao(int ano){
        carro.setAnoFabricação(ano);
        return this;
    }

    public CarroBuilder setAnoModelo(int ano){
        carro.setAnoModelo(ano);
        return this;
    }

    public CarroBuilder setPortas(int portas){
        carro.setPortas(portas);
        return this;
    }

    public CarroBuilder setModelo(String modelo){
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setFabricante(String fabricante){
        carro.setFabricante(fabricante);
        return this;
    }

    public CarroBuilder setCor(String cor){
        carro.setCor(cor);
        return this;
    }

    public CarroBuilder setMotor(double motor){
        carro.setMotor(motor);
        return this;
    }

}
