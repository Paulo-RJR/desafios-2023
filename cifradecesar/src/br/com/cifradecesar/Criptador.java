package br.com.cifradecesar;
public interface Criptador {
    String encriptar(String mensagem, int chave);
    String decriptar(String mensagemEncriptada, int chave);
}