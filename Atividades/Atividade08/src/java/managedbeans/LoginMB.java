/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author dayor
 */
@ManagedBean
@RequestScoped
public class LoginMB {
    String senha;
    String matricula;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public String entrar(){
    if(matricula.equals("201900") & senha.equals("123456") == true) {
        System.out.println("index");
    }else{
    FacesContext context = FacesContext.getCurrentInstance();
    FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Login inválido!");
    context.addMessage(null, mensagem);
    }
    
        
    return "entrar";
         
    }
       
    
         
   
        
   
    public LoginMB() {
    }


    
}
