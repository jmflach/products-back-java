package com.example.springboot.services;

public class MdcService {
    private Float maior;
    private Float menor;

    public MdcService(Float menor, Float maior) {
        this.maior = maior;
        this.menor = menor;
    }

    public Float calculateMdc() {
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
