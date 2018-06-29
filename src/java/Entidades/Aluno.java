/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ludmila
 */
@Entity
@Table(name = "aluno")
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_aluno")
    private Integer idAluno;
    @Column(name = "nome_aluno")
    private String nomeAluno;
    @Column(name = "cpf_aluno")
    private String cpfAluno;
    @Column(name = "datanascimento_aluno")
    @Temporal(TemporalType.DATE)
    private Date datanascimentoAluno;
    @Column(name = "cidade_aluno")
    private String cidadeAluno;
    @Column(name = "endereco_aluno")
    private String enderecoAluno;
    @Column(name = "cep_aluno")
    private String cepAluno;
    @Column(name = "email_aluno")
    private String emailAluno;
    @Column(name = "telefone_aluno")
    private String telefoneAluno;
    @Column(name = "pessoaemer_aluno")
    private String pessoaemerAluno;
    @Column(name = "telefoneemer_aluno")
    private String telefoneemerAluno;

    public Aluno() {
    }

    public Aluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public Date getDatanascimentoAluno() {
        return datanascimentoAluno;
    }

    public void setDatanascimentoAluno(Date datanascimentoAluno) {
        this.datanascimentoAluno = datanascimentoAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public void setCidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getCepAluno() {
        return cepAluno;
    }

    public void setCepAluno(String cepAluno) {
        this.cepAluno = cepAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getPessoaemerAluno() {
        return pessoaemerAluno;
    }

    public void setPessoaemerAluno(String pessoaemerAluno) {
        this.pessoaemerAluno = pessoaemerAluno;
    }

    public String getTelefoneemerAluno() {
        return telefoneemerAluno;
    }

    public void setTelefoneemerAluno(String telefoneemerAluno) {
        this.telefoneemerAluno = telefoneemerAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAluno != null ? idAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.idAluno == null && other.idAluno != null) || (this.idAluno != null && !this.idAluno.equals(other.idAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Aluno[ idAluno=" + idAluno + " ]";
    }
    
}
