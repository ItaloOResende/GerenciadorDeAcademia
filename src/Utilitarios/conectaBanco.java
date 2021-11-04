package Utilitarios;

//importação de classes(tanto classes que ja vem no netbeans como classes criadas)
import telas.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//função que faz a conexão com o banco de dados
public class conectaBanco {
    public PreparedStatement pst=null;
    public Statement stm;
    public ResultSet rs;
    private String driver="com.mysql.jdbc.Driver";
    private String caminho="jdbc:mysql://localhost/dbLeoDaAcademia";
    //botar usuario e senha dps aq
    private String usuario="root";
    private String senha="";
    public Connection conn;
    
    //função que verifica se a conexão com o banco de dados está certa e abre a janela inicial do programa
    public void conexaoInicial(){
        try {
            System.setProperty("apache_derby_net", driver);
            conn=DriverManager.getConnection(caminho, usuario, senha);
            telaInicial telaInicial=new telaInicial();
            telaInicial.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar\n "+ex.getMessage());
        }
    }
    
    //função que verifica se a conexão com o banco de dados está certa
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn=DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar\n "+ex.getMessage());
        }
    }
    
    //função que faz uma pesquisa sql,para assim poder fazer manipulação de dados no programa
    public void executaSQL(String sql){
        try {
            stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs=stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n "+ex.getMessage());
        }
    }
    
     public double somaSQL(String sql){
         double valor = 0;
         double sum;
        try {
            stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            PreparedStatement statement=conn.prepareStatement(sql);
            rs=statement.executeQuery();
            System.out.println("Imprimir: "+rs);
            rs.next();          
            sum=rs.getInt(1);
            valor=sum;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n "+ex.getMessage());
        }
        
        return valor;
    }
    
    //função que faz uma pesquisa sql,para assim poder fazer exclusão de dados no programa
    public void executaSQLExcluir(String sql){
        try {
            stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            int rs=stm.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQLExcluir!\n "+ex.getMessage());
        }
    }
    
    //função responsavel por desconectar o programa com o banco de dados
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar a conexão"+ex.getMessage());
        }
    }
}