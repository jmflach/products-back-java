package com.example.springboot.services;

public class MdcServices {
    private Float maior;
    private Float menor;

    public MdcServices(Float menor, Float maior) {
        this.maior = maior;
        this.menor = menor;
    }

    public Float calculateMdc() {
        Float resto = this.menor;
        Float aux;

        while(this.menor > 0) {
            // System.out.printf("%f %f", this.maior, this.menor);
            aux = this.menor;
            this.menor = this.maior % this.menor;
            this.maior = aux;
        }

        return this.maior;
    }
}
