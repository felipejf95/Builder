import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoAnoFabricacaoInvalido(){
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("fiat")
                    .setAnoModelo(2023)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano de fabricacao invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoAnoModeloInvalido(){
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Renault")
                    .setAnoFabricacao(2012)
                    .setCor("Amarelo")
                    .setPortas(4)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano do modelo invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido(){
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setAnoFabricacao(2019)
                .setAnoModelo(2020)
                .setPortas(2)
                .setMotor(2.0)
                .setCor("Rosa")
                .setFabricante("Mercedes")
                .setModelo("Esportivo")
                .build();

        assertNotNull(carro);
    }

}