package PacoteJavaGUI;

import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean autenticaUsuario(){
        return true;
        if(this.login == login && this.senha == senha){
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema." );
        }else{
        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }
        
    }
    
}


