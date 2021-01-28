package com.ufcg.psoft.model.Desconto;

import java.math.BigDecimal;

public class SuperDesconto implements Desconto {
    private BigDecimal valorProduto;

    public SuperDesconto(BigDecimal valorProduto){
        this.valorProduto = valorProduto;
    }

    @Override
    public BigDecimal calculaDesconto() {
        BigDecimal desconto = new BigDecimal(0.50).multiply(valorProduto);
        this.valorProduto = this.valorProduto.subtract(desconto);
    
        return this.valorProduto;
    }
    
}
