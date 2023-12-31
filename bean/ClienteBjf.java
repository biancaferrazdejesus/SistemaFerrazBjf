package bean;
// Generated 13/09/2023 17:40:18 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ClienteBjf generated by hbm2java
 */
@Entity
@Table(name="cliente_bjf"
    ,catalog="db_bianca_ferraz"
)
public class ClienteBjf  implements java.io.Serializable {


     private int idclienteBjf;
     private UsuariosBjf usuariosBjf;
     private String nomeBjf;
     private String emailBjf;
     private String telefoneBjf;
     private String estadoCivilBjf;
     private String profissaoBjf;
     private String rgBjf;
     private String cpfBjf;
     private Date dataNascBjf;
     private String enderecoBjf;
     private String estadoBjf;
     private String cidadeBjf;
     private String cepBjf;
     private Date dataRegistroBjf;
     private VendasBjf vendasBjf;

    public ClienteBjf() {
    }

	
    public ClienteBjf(UsuariosBjf usuariosBjf, String nomeBjf, String emailBjf, String telefoneBjf, String estadoCivilBjf, String profissaoBjf, String rgBjf, String cpfBjf, Date dataNascBjf, String enderecoBjf, String estadoBjf, String cidadeBjf, String cepBjf, Date dataRegistroBjf) {
        this.usuariosBjf = usuariosBjf;
        this.nomeBjf = nomeBjf;
        this.emailBjf = emailBjf;
        this.telefoneBjf = telefoneBjf;
        this.estadoCivilBjf = estadoCivilBjf;
        this.profissaoBjf = profissaoBjf;
        this.rgBjf = rgBjf;
        this.cpfBjf = cpfBjf;
        this.dataNascBjf = dataNascBjf;
        this.enderecoBjf = enderecoBjf;
        this.estadoBjf = estadoBjf;
        this.cidadeBjf = cidadeBjf;
        this.cepBjf = cepBjf;
        this.dataRegistroBjf = dataRegistroBjf;
    }
    public ClienteBjf(UsuariosBjf usuariosBjf, String nomeBjf, String emailBjf, String telefoneBjf, String estadoCivilBjf, String profissaoBjf, String rgBjf, String cpfBjf, Date dataNascBjf, String enderecoBjf, String estadoBjf, String cidadeBjf, String cepBjf, Date dataRegistroBjf, VendasBjf vendasBjf) {
       this.usuariosBjf = usuariosBjf;
       this.nomeBjf = nomeBjf;
       this.emailBjf = emailBjf;
       this.telefoneBjf = telefoneBjf;
       this.estadoCivilBjf = estadoCivilBjf;
       this.profissaoBjf = profissaoBjf;
       this.rgBjf = rgBjf;
       this.cpfBjf = cpfBjf;
       this.dataNascBjf = dataNascBjf;
       this.enderecoBjf = enderecoBjf;
       this.estadoBjf = estadoBjf;
       this.cidadeBjf = cidadeBjf;
       this.cepBjf = cepBjf;
       this.dataRegistroBjf = dataRegistroBjf;
       this.vendasBjf = vendasBjf;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="usuariosBjf"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="idcliente_bjf", unique=true, nullable=false)
    public int getIdclienteBjf() {
        return this.idclienteBjf;
    }
    
    public void setIdclienteBjf(int idclienteBjf) {
        this.idclienteBjf = idclienteBjf;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public UsuariosBjf getUsuariosBjf() {
        return this.usuariosBjf;
    }
    
    public void setUsuariosBjf(UsuariosBjf usuariosBjf) {
        this.usuariosBjf = usuariosBjf;
    }

    
    @Column(name="nome_bjf", nullable=false, length=50)
    public String getNomeBjf() {
        return this.nomeBjf;
    }
    
    public void setNomeBjf(String nomeBjf) {
        this.nomeBjf = nomeBjf;
    }

    
    @Column(name="email_bjf", nullable=false, length=50)
    public String getEmailBjf() {
        return this.emailBjf;
    }
    
    public void setEmailBjf(String emailBjf) {
        this.emailBjf = emailBjf;
    }

    
    @Column(name="telefone_bjf", nullable=false, length=11)
    public String getTelefoneBjf() {
        return this.telefoneBjf;
    }
    
    public void setTelefoneBjf(String telefoneBjf) {
        this.telefoneBjf = telefoneBjf;
    }

    
    @Column(name="estadoCivil_bjf", nullable=false, length=50)
    public String getEstadoCivilBjf() {
        return this.estadoCivilBjf;
    }
    
    public void setEstadoCivilBjf(String estadoCivilBjf) {
        this.estadoCivilBjf = estadoCivilBjf;
    }

    
    @Column(name="profissao_bjf", nullable=false, length=50)
    public String getProfissaoBjf() {
        return this.profissaoBjf;
    }
    
    public void setProfissaoBjf(String profissaoBjf) {
        this.profissaoBjf = profissaoBjf;
    }

    
    @Column(name="rg_bjf", nullable=false, length=9)
    public String getRgBjf() {
        return this.rgBjf;
    }
    
    public void setRgBjf(String rgBjf) {
        this.rgBjf = rgBjf;
    }

    
    @Column(name="cpf_bjf", nullable=false, length=14)
    public String getCpfBjf() {
        return this.cpfBjf;
    }
    
    public void setCpfBjf(String cpfBjf) {
        this.cpfBjf = cpfBjf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNasc_bjf", nullable=false, length=10)
    public Date getDataNascBjf() {
        return this.dataNascBjf;
    }
    
    public void setDataNascBjf(Date dataNascBjf) {
        this.dataNascBjf = dataNascBjf;
    }

    
    @Column(name="endereco_bjf", nullable=false, length=50)
    public String getEnderecoBjf() {
        return this.enderecoBjf;
    }
    
    public void setEnderecoBjf(String enderecoBjf) {
        this.enderecoBjf = enderecoBjf;
    }

    
    @Column(name="estado_bjf", nullable=false, length=50)
    public String getEstadoBjf() {
        return this.estadoBjf;
    }
    
    public void setEstadoBjf(String estadoBjf) {
        this.estadoBjf = estadoBjf;
    }

    
    @Column(name="cidade_bjf", nullable=false, length=50)
    public String getCidadeBjf() {
        return this.cidadeBjf;
    }
    
    public void setCidadeBjf(String cidadeBjf) {
        this.cidadeBjf = cidadeBjf;
    }

    
    @Column(name="cep_bjf", nullable=false, length=50)
    public String getCepBjf() {
        return this.cepBjf;
    }
    
    public void setCepBjf(String cepBjf) {
        this.cepBjf = cepBjf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataRegistro_bjf", nullable=false, length=10)
    public Date getDataRegistroBjf() {
        return this.dataRegistroBjf;
    }
    
    public void setDataRegistroBjf(Date dataRegistroBjf) {
        this.dataRegistroBjf = dataRegistroBjf;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="clienteBjf")
    public VendasBjf getVendasBjf() {
        return this.vendasBjf;
    }
    
    public void setVendasBjf(VendasBjf vendasBjf) {
        this.vendasBjf = vendasBjf;
    }




}


