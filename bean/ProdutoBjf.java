package bean;
// Generated 13/09/2023 17:40:18 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * ProdutoBjf generated by hbm2java
 */
@Entity
@Table(name="produto_bjf"
    ,catalog="db_bianca_ferraz"
)
public class ProdutoBjf  implements java.io.Serializable {


     private int idprodutoBjf;
     private String nomeBjf;
     private String descricaoBjf;
     private String categoriaBjf;
     private String precoBjf;
     private short quantidadeBjf;
     private String fornecedorBjf;
     private String serialBjf;
     private ProdutoVendasBjf produtoVendasBjf;

    public ProdutoBjf() {
    }

	
    public ProdutoBjf(int idprodutoBjf, String nomeBjf, String descricaoBjf, String categoriaBjf, String precoBjf, short quantidadeBjf, String fornecedorBjf, String serialBjf) {
        this.idprodutoBjf = idprodutoBjf;
        this.nomeBjf = nomeBjf;
        this.descricaoBjf = descricaoBjf;
        this.categoriaBjf = categoriaBjf;
        this.precoBjf = precoBjf;
        this.quantidadeBjf = quantidadeBjf;
        this.fornecedorBjf = fornecedorBjf;
        this.serialBjf = serialBjf;
    }
    public ProdutoBjf(int idprodutoBjf, String nomeBjf, String descricaoBjf, String categoriaBjf, String precoBjf, short quantidadeBjf, String fornecedorBjf, String serialBjf, ProdutoVendasBjf produtoVendasBjf) {
       this.idprodutoBjf = idprodutoBjf;
       this.nomeBjf = nomeBjf;
       this.descricaoBjf = descricaoBjf;
       this.categoriaBjf = categoriaBjf;
       this.precoBjf = precoBjf;
       this.quantidadeBjf = quantidadeBjf;
       this.fornecedorBjf = fornecedorBjf;
       this.serialBjf = serialBjf;
       this.produtoVendasBjf = produtoVendasBjf;
    }
   
     @Id 

    
    @Column(name="idproduto_bjf", unique=true, nullable=false)
    public int getIdprodutoBjf() {
        return this.idprodutoBjf;
    }
    
    public void setIdprodutoBjf(int idprodutoBjf) {
        this.idprodutoBjf = idprodutoBjf;
    }

    
    @Column(name="nome_bjf", nullable=false, length=60)
    public String getNomeBjf() {
        return this.nomeBjf;
    }
    
    public void setNomeBjf(String nomeBjf) {
        this.nomeBjf = nomeBjf;
    }

    
    @Column(name="descricao_bjf", nullable=false)
    public String getDescricaoBjf() {
        return this.descricaoBjf;
    }
    
    public void setDescricaoBjf(String descricaoBjf) {
        this.descricaoBjf = descricaoBjf;
    }

    
    @Column(name="categoria_bjf", nullable=false, length=20)
    public String getCategoriaBjf() {
        return this.categoriaBjf;
    }
    
    public void setCategoriaBjf(String categoriaBjf) {
        this.categoriaBjf = categoriaBjf;
    }

    
    @Column(name="preco_bjf", nullable=false, length=11)
    public String getPrecoBjf() {
        return this.precoBjf;
    }
    
    public void setPrecoBjf(String precoBjf) {
        this.precoBjf = precoBjf;
    }

    
    @Column(name="quantidade_bjf", nullable=false)
    public short getQuantidadeBjf() {
        return this.quantidadeBjf;
    }
    
    public void setQuantidadeBjf(short quantidadeBjf) {
        this.quantidadeBjf = quantidadeBjf;
    }

    
    @Column(name="fornecedor_bjf", nullable=false)
    public String getFornecedorBjf() {
        return this.fornecedorBjf;
    }
    
    public void setFornecedorBjf(String fornecedorBjf) {
        this.fornecedorBjf = fornecedorBjf;
    }

    
    @Column(name="serial_bjf", nullable=false, length=45)
    public String getSerialBjf() {
        return this.serialBjf;
    }
    
    public void setSerialBjf(String serialBjf) {
        this.serialBjf = serialBjf;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="produtoBjf")
    public ProdutoVendasBjf getProdutoVendasBjf() {
        return this.produtoVendasBjf;
    }
    
    public void setProdutoVendasBjf(ProdutoVendasBjf produtoVendasBjf) {
        this.produtoVendasBjf = produtoVendasBjf;
    }




}


