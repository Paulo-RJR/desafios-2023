package br.com.cifradecesar;
public class CriptadorDeCesar implements Criptador{
    @Override
    public String encriptar(String mensagem, int chave){
        char c;
        StringBuilder cifrado = new StringBuilder();

        for (char letra : mensagem.toCharArray()){
            if(Character.isUpperCase(letra)){
                c = (char) (Math.floorMod(letra - 'A' + chave, 26) + 'A');
            }else if (Character.isLowerCase(letra)){
                c = (char) (Math.floorMod(letra - 'a' + chave, 26) + 'a');
            }else {
                c = letra;
            }
            cifrado.append(c);
        }
        return cifrado.toString();
    }
    @Override
    public String decriptar(String mensagemEncriptada, int chave) {

        return encriptar(mensagemEncriptada, -1 * chave);
    }
}