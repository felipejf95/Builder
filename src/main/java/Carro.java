public class Carro {
    int anoFabricação;
    int anoModelo;
    int portas;
    String modelo;
    String fabricante;
    String cor;
    double motor;

    public Carro() {
        this.anoFabricação = 0;
        this.anoModelo = 0;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
