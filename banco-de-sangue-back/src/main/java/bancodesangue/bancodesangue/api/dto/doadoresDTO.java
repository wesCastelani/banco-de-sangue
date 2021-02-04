package bancodesangue.bancodesangue.api.dto;

import java.util.Calendar;
import java.util.Date;
import bancodesangue.bancodesangue.api.entities.Doadores;

public class doadoresDTO {

    private String nome;
    private String cpf;
    private String rg;
    private Calendar data_nasc;
    private String sexo;
    private String mae;
    private String pai;
    private String email;
    private String cep;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone_fixo;
    private String celular;
    private Double altura;
    private Double peso;
    private String tipo_sanguineo;
    private Boolean confirmado;


    public doadoresDTO(){}

    public doadoresDTO(Boolean confirmado,String nome, String cpf, String rg, Calendar data_nasc, String sexo, String mae, String pai, String email, String cep, String endereco, int numero, String bairro, String cidade, String estado, String telefone_fixo, String celular, Double altura, Double peso, String tipo_sanguineo) {
        this.confirmado = confirmado;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.mae = mae;
        this.pai = pai;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone_fixo = telefone_fixo;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.tipo_sanguineo = tipo_sanguineo;
    }
    public doadoresDTO(Doadores doadores) {
        this.confirmado = doadores.getConfirmado();
        this.nome = doadores.getNome();
        this.cpf = doadores.getCpf();
        this.rg = doadores.getRg();
        this.data_nasc = doadores.getData_nasc();
        this.sexo = doadores.getSexo();
        this.mae = doadores.getMae();
        this.pai = doadores.getPai();
        this.email = doadores.getEmail();
        this.cep = doadores.getCep();
        this.endereco = doadores.getEndereco();
        this.numero = doadores.getNumero();
        this.bairro = doadores.getBairro();
        this.cidade = doadores.getCidade();
        this.estado = doadores.getEstado();
        this.telefone_fixo = doadores.getTelefone_fixo();
        this.celular = doadores.getCelular();
        this.altura = doadores.getAltura();
        this.peso = doadores.getPeso();
        this.tipo_sanguineo = doadores.getTipo_sanguineo();
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Calendar getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Calendar data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(String telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }
}
