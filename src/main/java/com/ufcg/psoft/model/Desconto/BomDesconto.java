package com.ufcg.psoft.model.Desconto;

import java.math.BigDecimal;

public class BomDesconto implements Desconto {
    private BigDecimal valorProduto;

    public BomDesconto(BigDecimal valorProduto){
        this.valorProduto = valorProduto;
    }

    @Override
    public BigDecimal calculaDesconto() {
        BigDecimal desconto = new BigDecimal(0.10).multiply(valorProduto);
        this.valorProduto = this.valorProduto.subtract(desconto);
    
        return this.valorProduto;
    }
    
}
