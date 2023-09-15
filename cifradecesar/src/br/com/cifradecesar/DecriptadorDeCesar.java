package br.com.cifradecesar;
public class DecriptadorDeCesar {
    public String quebrarCifra(String mensagemEncriptada, String palavraConhecida){
        CriptadorDeCesar deCesar = new CriptadorDeCesar();
        for(int i = 0; i < 26; i++){
            String mensagemOriginal = deCesar.decriptar(mensagemEncriptada, i);
            if (mensagemOriginal.contains(palavraConhecida)){
                return mensagemOriginal;
            }
        }
        return "";
    }
}