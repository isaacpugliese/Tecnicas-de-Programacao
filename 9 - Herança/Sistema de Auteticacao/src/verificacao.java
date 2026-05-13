public class verificacao implements Autenticacao{
    private String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";
    private boolean autenticado = false;

    public boolean login(String usuario,String senha){
        if(usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            autenticado = true;
            return true;
        }

        return false;
    }

    @Override
    public void logout() {
        autenticado = false;
        System.out.println("Logout realizado com sucesso.");
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}