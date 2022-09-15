/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest.mavenproject10;

/**
 *
 * @author onezi
 */
public class ContaBancaria {
    //Variáveis de Instância
    private String nome;
   private double balanco;
   
   public void setNome(String nome){
       this.nome=nome;
   }
   
   public String getNome(){
       return this.nome;
   }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }
   
   public void deposito(double valor){
       this.balanco+=valor;
      // this.balanco=this.balanco+valor;
   }
   
   public void saque(double valor){
       this.balanco-=valor;
      // this.balanco=this.balanco+valor;
   }
   
}
